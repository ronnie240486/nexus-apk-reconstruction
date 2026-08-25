package cn.dolit.nexus;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.LruCache;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends Activity {

    private static final int BG = Color.rgb(8, 12, 35);
    private static final int PANEL = Color.argb(220, 7, 12, 35);

    /*
     * Contrato universal do painel Rencia.
     * O appId precisa ser igual ao identificador cadastrado no painel.
     */
    private static final String PANEL_BASE_URL = "https://renciaapp.manus.space";
    private static final String PANEL_APP_ID = "nexus";
    private static final long POLL_INTERVAL_MS = 60_000L;
    private static final int CONNECT_TIMEOUT_MS = 15_000;
    private static final int READ_TIMEOUT_MS = 30_000;
    private static final int MAX_JSON_BYTES = 16 * 1024 * 1024;
    private static final long MAX_PLAYLIST_BYTES = 32L * 1024L * 1024L;
    private static final int MAX_PLAYLIST_ENTRIES = 10_000;
    private static final String INSTALLED_VERSION = "0.2.12";

    private final ExecutorService networkExecutor = Executors.newSingleThreadExecutor();
    private final Handler mainHandler = new Handler(Looper.getMainLooper());
    private String mac;
    private TextView statusView;
    private TextView appTitleView;
    private PanelConfig lastConfig = PanelConfig.empty();
    private List<PlaylistEntry> playlistEntries = Collections.emptyList();
    private String playlistStatus = "";
    private String playlistEpgUrl = "";
    private String panelEpgUrl = "";
    private boolean homeShown;
    private boolean playlistRefreshRequested;
    private boolean destroyed;
    private String currentScreen = "Identificação";
    private String selectedChannelGroup = "";
    private String selectedMediaGroup = "";
    private String selectedMediaSection = "";
    private TextView miniPlayerTitleView;
    private TextView miniPlayerHintView;
    private TextView miniPlayerEpgView;
    private VideoView miniVideoView;
    private FrameLayout miniVideoFrame;
    private PlaylistEntry currentPlayingEntry;
    private final Set<String> favoriteKeys = new HashSet<>();
    private final LruCache<String, Bitmap> coverCache = new LruCache<String, Bitmap>(8 * 1024 * 1024) {
        @Override protected int sizeOf(String key, Bitmap bitmap) {
            return bitmap.getRowBytes() * bitmap.getHeight();
        }
    };

    @Override
    protected void onCreate(Bundle state) {
        super.onCreate(state);
        getWindow().setStatusBarColor(Color.BLACK);
        getWindow().setNavigationBarColor(Color.BLACK);
        mac = DeviceIdentity.getMac(this);
        showIdentity();
        requestPanelSync();
    }

    @Override
    protected void onDestroy() {
        destroyed = true;
        mainHandler.removeCallbacksAndMessages(null);
        networkExecutor.shutdownNow();
        super.onDestroy();
    }

    private void showIdentity() {
        currentScreen = "Identificação";
        FrameLayout root = baseRoot();
        ImageView background = backgroundImage();
        root.addView(background, matchParams());

        LinearLayout panel = new LinearLayout(this);
        panel.setOrientation(LinearLayout.VERTICAL);
        panel.setGravity(Gravity.CENTER_HORIZONTAL);
        panel.setPadding(dp(36), dp(24), dp(36), dp(24));
        panel.setBackground(round(PANEL, dp(18)));

        ImageView logo = new ImageView(this);
        logo.setImageResource(useZoneXVisual() ? R.drawable.zonex_icon : R.drawable.top_login_logo);
        logo.setScaleType(ImageView.ScaleType.FIT_CENTER);
        logo.setAdjustViewBounds(true);
        int logoWidth = useZoneXVisual() ? dp(128) : dp(347);
        int logoHeight = useZoneXVisual() ? dp(128) : dp(93);
        panel.addView(logo, new LinearLayout.LayoutParams(logoWidth, logoHeight));

        TextView title = text("Identificação do aparelho", 25, Color.WHITE, true);
        title.setGravity(Gravity.CENTER);
        LinearLayout.LayoutParams titleParams = centeredWrap();
        titleParams.topMargin = dp(8);
        panel.addView(title, titleParams);

        TextView hint = text("Copie este MAC e cadastre-o no painel", 15, Color.LTGRAY, false);
        hint.setGravity(Gravity.CENTER);
        LinearLayout.LayoutParams hintParams = centeredWrap();
        hintParams.topMargin = dp(10);
        panel.addView(hint, hintParams);

        TextView macView = text(mac, 31, Color.WHITE, true);
        macView.setTypeface(Typeface.MONOSPACE, Typeface.BOLD);
        macView.setGravity(Gravity.CENTER);
        macView.setContentDescription("MAC do aparelho: " + mac);
        LinearLayout.LayoutParams macParams = centeredWrap();
        macParams.topMargin = dp(18);
        panel.addView(macView, macParams);

        statusView = text("Consultando o painel...", 13, Color.LTGRAY, false);
        statusView.setGravity(Gravity.CENTER);
        LinearLayout.LayoutParams statusParams = centeredWrap();
        statusParams.topMargin = dp(14);
        panel.addView(statusView, statusParams);

        Button copy = actionButton("COPIAR MAC", Color.rgb(33, 93, 164));
        copy.setOnClickListener(view -> copyMac());
        LinearLayout.LayoutParams copyParams = centeredWrap();
        copyParams.topMargin = dp(20);
        panel.addView(copy, copyParams);

        Button enter = actionButton("ENTRAR NO NEXUS", Color.rgb(32, 152, 111));
        enter.setOnClickListener(view -> showHome());
        LinearLayout.LayoutParams enterParams = centeredWrap();
        enterParams.topMargin = dp(8);
        panel.addView(enter, enterParams);

        FrameLayout.LayoutParams panelParams = new FrameLayout.LayoutParams(
                dp(560), FrameLayout.LayoutParams.WRAP_CONTENT, Gravity.CENTER);
        root.addView(panel, panelParams);
        setContentView(root);
    }

    private void showHome() {
        homeShown = true;
        currentScreen = "Início";
        FrameLayout root = visualRoot();
        LinearLayout homeContent = pageContent();
        ScrollView homeScroll = new ScrollView(this);
        homeScroll.setFillViewport(true);
        homeScroll.addView(homeContent, new ScrollView.LayoutParams(
                ScrollView.LayoutParams.MATCH_PARENT, ScrollView.LayoutParams.WRAP_CONTENT));
        root.addView(homeScroll, matchParams());
        LinearLayout page = homeContent;

        LinearLayout header = new LinearLayout(this);
        header.setGravity(Gravity.CENTER_VERTICAL);
        TextView title = text("Início", 30, Color.WHITE, true);
        header.addView(title, new LinearLayout.LayoutParams(0, dp(52), 1f));
        TextView device = text("MAC  " + mac, 14, Color.WHITE, true);
        device.setGravity(Gravity.CENTER_VERTICAL | Gravity.RIGHT);
        header.addView(device, new LinearLayout.LayoutParams(dp(300), dp(52)));
        page.addView(header, new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, dp(58)));

        appTitleView = text(displayAppName(), 20, Color.WHITE, true);
        page.addView(appTitleView, new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, dp(34)));
        statusView = text(statusText(), 14, Color.LTGRAY, false);
        page.addView(statusView, new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, dp(34)));

        TextView categoryTitle = text("Categorias", 20, Color.WHITE, true);
        categoryTitle.setPadding(0, dp(8), 0, dp(6));
        page.addView(categoryTitle, new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, dp(42)));
        HorizontalScrollView categoryScroll = new HorizontalScrollView(this);
        categoryScroll.setHorizontalScrollBarEnabled(false);
        LinearLayout categories = new LinearLayout(this);
        categories.setOrientation(LinearLayout.HORIZONTAL);
        addHomeCategory(categories, R.drawable.menu_tvlist, "Canais", Color.rgb(28, 105, 190));
        addHomeCategory(categories, R.drawable.menu_sour, "Filmes", Color.rgb(42, 92, 170));
        addHomeCategory(categories, R.drawable.menu_subtitl, "Séries", Color.rgb(35, 113, 184));
        addHomeCategory(categories, R.drawable.menu_fav, "Favoritos", Color.rgb(27, 86, 158));
        addHomeCategory(categories, R.drawable.menu_fav, "Configurações", Color.rgb(18, 68, 135));
        categoryScroll.addView(categories, new ScrollView.LayoutParams(
                ScrollView.LayoutParams.WRAP_CONTENT, ScrollView.LayoutParams.MATCH_PARENT));
        page.addView(categoryScroll, new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, dp(132)));

        addHomeContentSection(page, "Continue assistindo", playlistEntries);
        addHomeContentSection(page, "Em alta", playlistEntries);

        setContentView(root);
    }

    private FrameLayout visualRoot() {
        FrameLayout root = baseRoot();
        root.addView(backgroundImage(), matchParams());
        return root;
    }

    private LinearLayout createNavigatedPage(FrameLayout root, String activeLabel, String title) {
        LinearLayout shell = new LinearLayout(this);
        shell.setOrientation(LinearLayout.HORIZONTAL);
        shell.setPadding(dp(18), dp(18), dp(18), dp(18));

        LinearLayout sidebar = new LinearLayout(this);
        sidebar.setOrientation(LinearLayout.VERTICAL);
        sidebar.setPadding(dp(12), dp(18), dp(12), dp(18));
        sidebar.setBackground(round(Color.argb(210, 7, 13, 37), dp(14)));
        ImageView sideLogo = new ImageView(this);
        sideLogo.setImageResource(useZoneXVisual() ? R.drawable.zonex_icon : R.drawable.top_login_logo);
        sideLogo.setScaleType(ImageView.ScaleType.FIT_CENTER);
        sidebar.addView(sideLogo, new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, dp(84)));
        addSidebarButton(sidebar, "Início", activeLabel);
        addSidebarButton(sidebar, "Canais", activeLabel);
        addSidebarButton(sidebar, "Filmes", activeLabel);
        addSidebarButton(sidebar, "Séries", activeLabel);
        addSidebarButton(sidebar, "Favoritos", activeLabel);
        addSidebarButton(sidebar, "Pesquisar", activeLabel);
        addSidebarButton(sidebar, "Configurações", activeLabel);
        ScrollView sidebarScroll = new ScrollView(this);
        sidebarScroll.setVerticalScrollBarEnabled(false);
        sidebarScroll.addView(sidebar, new ScrollView.LayoutParams(
                ScrollView.LayoutParams.MATCH_PARENT, ScrollView.LayoutParams.WRAP_CONTENT));
        LinearLayout.LayoutParams sideParams = new LinearLayout.LayoutParams(dp(230),
                LinearLayout.LayoutParams.MATCH_PARENT);
        sideParams.rightMargin = dp(18);
        shell.addView(sidebarScroll, sideParams);

        LinearLayout page = pageContent();
        page.addView(text(title, 1, Color.TRANSPARENT, false), new LinearLayout.LayoutParams(0, 0));
        shell.addView(page, new LinearLayout.LayoutParams(0,
                LinearLayout.LayoutParams.MATCH_PARENT, 1f));
        root.addView(shell, matchParams());
        return page;
    }

    private void addSidebarButton(LinearLayout sidebar, String label, String activeLabel) {
        TextView button = text(label, 15,
                label.equals(activeLabel) ? Color.WHITE : Color.LTGRAY, true);
        button.setGravity(Gravity.CENTER_VERTICAL);
        button.setPadding(dp(14), 0, dp(8), 0);
        button.setBackground(round(label.equals(activeLabel)
                ? Color.rgb(180, 35, 43) : Color.TRANSPARENT, dp(8)));
        button.setOnClickListener(view -> {
            if ("Início".equals(label)) {
                showHome();
            } else if ("Pesquisar".equals(label)) {
                showSearch();
            } else if ("Configurações".equals(label)) {
                showSettings();
            } else {
                showSection(label);
            }
        });
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, dp(44));
        params.setMargins(0, dp(4), 0, dp(4));
        sidebar.addView(button, params);
    }

    private void addHomeTab(LinearLayout tabs, String label, int icon) {
        LinearLayout tab = new LinearLayout(this);
        tab.setOrientation(LinearLayout.HORIZONTAL);
        tab.setGravity(Gravity.CENTER);
        tab.setPadding(dp(10), 0, dp(10), 0);
        tab.setBackground(round(Color.argb(180, 10, 91, 170), dp(9)));
        ImageView image = new ImageView(this);
        image.setImageResource(icon);
        image.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        tab.addView(image, new LinearLayout.LayoutParams(dp(28), dp(28)));
        TextView title = text(label, 15, Color.WHITE, true);
        title.setGravity(Gravity.CENTER);
        tab.addView(title, new LinearLayout.LayoutParams(0, dp(40), 1f));
        tab.setOnClickListener(view -> showSection(label));
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(0, dp(50), 1f);
        params.setMargins(dp(4), 0, dp(4), 0);
        tabs.addView(tab, params);
    }

    private void addHomeCategory(LinearLayout categories, int icon, String label, int color) {
        LinearLayout card = new LinearLayout(this);
        card.setOrientation(LinearLayout.VERTICAL);
        card.setGravity(Gravity.CENTER);
        card.setPadding(dp(8), dp(8), dp(8), dp(8));
        card.setBackground(round(Color.argb(190, Color.red(color), Color.green(color), Color.blue(color)), dp(10)));
        card.setOnClickListener(view -> {
            if ("Configurações".equals(label)) showSettings();
            else showSection(label);
        });
        ImageView image = new ImageView(this);
        image.setImageResource(icon);
        image.setScaleType(ImageView.ScaleType.FIT_CENTER);
        card.addView(image, new LinearLayout.LayoutParams(dp(52), dp(52)));
        TextView title = text(label, 14, Color.WHITE, true);
        title.setGravity(Gravity.CENTER);
        card.addView(title, new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, dp(32)));
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(dp(176), dp(116));
        params.setMargins(dp(5), dp(5), dp(5), dp(5));
        categories.addView(card, params);
    }

    private void addCategoryCard(GridLayout categories, int icon, String label, int color) {
        LinearLayout card = new LinearLayout(this);
        card.setOrientation(LinearLayout.VERTICAL);
        card.setGravity(Gravity.CENTER);
        card.setPadding(dp(8), dp(8), dp(8), dp(8));
        card.setBackground(round(Color.argb(220,
                Color.red(color), Color.green(color), Color.blue(color)), dp(10)));
        card.setOnClickListener(view -> showSection(label));
        ImageView image = new ImageView(this);
        image.setImageResource(icon);
        image.setScaleType(ImageView.ScaleType.FIT_CENTER);
        card.addView(image, new LinearLayout.LayoutParams(dp(52), dp(52)));
        TextView title = text(label, 14, Color.WHITE, true);
        title.setGravity(Gravity.CENTER);
        card.addView(title, new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, dp(32)));
        GridLayout.LayoutParams params = new GridLayout.LayoutParams(
                GridLayout.spec(GridLayout.UNDEFINED, 1f),
                GridLayout.spec(GridLayout.UNDEFINED, 1f));
        params.setMargins(dp(5), dp(5), dp(5), dp(5));
        categories.addView(card, params);
    }

    private void loadImageInto(ImageView target, String imageUrl) {
        if (TextUtils.isEmpty(imageUrl)) {
            return;
        }
        target.setTag(imageUrl);
        Bitmap cached = coverCache.get(imageUrl);
        if (cached != null) {
            target.setImageBitmap(cached);
            return;
        }
        networkExecutor.execute(() -> {
            Bitmap memoryBitmap = coverCache.get(imageUrl);
            if (memoryBitmap != null) {
                mainHandler.post(() -> {
                    if (!destroyed && imageUrl.equals(target.getTag())) target.setImageBitmap(memoryBitmap);
                });
                return;
            }
            HttpURLConnection connection = null;
            try {
                connection = (HttpURLConnection) new URL(imageUrl).openConnection();
                connection.setConnectTimeout(10_000);
                connection.setReadTimeout(15_000);
                connection.setUseCaches(true);
                connection.setInstanceFollowRedirects(true);
                int code = connection.getResponseCode();
                if (code < 200 || code >= 300) return;
                try (InputStream input = new LimitedInputStream(
                        new BufferedInputStream(connection.getInputStream()), 512 * 1024L)) {
                    Bitmap bitmap = BitmapFactory.decodeStream(input);
                    if (bitmap != null) {
                        coverCache.put(imageUrl, bitmap);
                        mainHandler.post(() -> {
                            if (!destroyed && imageUrl.equals(target.getTag())) {
                                target.setImageBitmap(bitmap);
                            }
                        });
                    }
                }
            } catch (Exception ignored) {
                // Mantém o ícone padrão quando a capa não estiver acessível.
            } finally {
                if (connection != null) connection.disconnect();
            }
        });
    }

    private void addHomeContentSection(LinearLayout page, String sectionTitle,
                                       List<PlaylistEntry> entries) {
        TextView title = text(sectionTitle, 20, Color.WHITE, true);
        title.setPadding(0, dp(14), 0, dp(5));
        page.addView(title, new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, dp(42)));
        HorizontalScrollView scroll = new HorizontalScrollView(this);
        scroll.setHorizontalScrollBarEnabled(false);
        LinearLayout row = new LinearLayout(this);
        row.setOrientation(LinearLayout.HORIZONTAL);
        addMiniCards(row);
        scroll.addView(row, new ScrollView.LayoutParams(
                ScrollView.LayoutParams.WRAP_CONTENT, ScrollView.LayoutParams.MATCH_PARENT));
        page.addView(scroll, new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, dp(165)));
    }

    private void addMiniCards(LinearLayout recent) {
        if (playlistEntries.isEmpty()) {
            addMiniCard(recent, "Lista aguardando", "Abra Canais para sincronizar",
                    R.drawable.zonex_icon, "", null);
            return;
        }
        int limit = Math.min(12, playlistEntries.size());
        for (int index = 0; index < limit; index++) {
            PlaylistEntry entry = playlistEntries.get(index);
            addMiniCard(recent, entry.title,
                    TextUtils.isEmpty(entry.group) ? "Conteúdo" : entry.group,
                    R.drawable.zonex_icon, entry.logoUrl, entry);
        }
    }

    private void addMiniCard(LinearLayout recent, String title, String subtitle, int icon,
                             String logoUrl, PlaylistEntry entry) {
        LinearLayout card = new LinearLayout(this);
        card.setOrientation(LinearLayout.VERTICAL);
        card.setGravity(Gravity.CENTER);
        card.setPadding(dp(8), dp(8), dp(8), dp(8));
        card.setBackground(round(Color.argb(220, 17, 27, 60), dp(10)));
        ImageView image = new ImageView(this);
        image.setImageResource(icon);
        image.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        loadImageInto(image, logoUrl);
        card.addView(image, new LinearLayout.LayoutParams(dp(118), dp(76)));
        TextView titleView = text(title, 13, Color.WHITE, true);
        titleView.setGravity(Gravity.CENTER);
        titleView.setMaxLines(2);
        titleView.setEllipsize(android.text.TextUtils.TruncateAt.END);
        card.addView(titleView, new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, dp(38)));
        TextView subtitleView = text(subtitle, 11, Color.LTGRAY, false);
        subtitleView.setGravity(Gravity.CENTER);
        card.addView(subtitleView, new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, dp(20)));
        if (entry != null) {
            card.setOnClickListener(view -> {
                if (isChannelEntry(entry)) showMiniPlayer(entry);
                else showMediaDetails(entry);
            });
        }

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(dp(155), dp(145));
        params.setMargins(0, 0, dp(10), 0);
        recent.addView(card, params);
    }

    private void addTile(GridLayout menu, int icon, String label) {
        LinearLayout tile = new LinearLayout(this);
        tile.setOrientation(LinearLayout.VERTICAL);
        tile.setGravity(Gravity.CENTER);
        tile.setFocusable(true);
        tile.setClickable(true);
        tile.setBackground(round(Color.argb(190, 17, 27, 60), dp(12)));
        tile.setOnClickListener(view -> showSection(label));

        ImageView image = new ImageView(this);
        image.setImageResource(icon);
        image.setAdjustViewBounds(true);
        tile.addView(image, new LinearLayout.LayoutParams(dp(72), dp(72)));
        TextView title = text(label, 16, Color.WHITE, true);
        title.setGravity(Gravity.CENTER);
        tile.addView(title, centeredWrap());

        GridLayout.LayoutParams params = new GridLayout.LayoutParams();
        params.width = 0;
        params.height = dp(145);
        params.columnSpec = GridLayout.spec(GridLayout.UNDEFINED, 1f);
        params.setMargins(dp(7), dp(7), dp(7), dp(7));
        menu.addView(tile, params);
    }

    private void showSection(String label) {
        if (("Filmes".equals(label) || "Séries".equals(label))
                && !label.equals(selectedMediaSection)) {
            selectedMediaSection = label;
            selectedMediaGroup = "";
        }
        currentScreen = label;
        if ("Canais".equals(label)) {
            showChannelsScreen(selectedChannelGroup);
            return;
        }
        if ("Pesquisar".equals(label)) {
            showSearch();
            return;
        }
        if ("Configurações".equals(label)) {
            showSettings();
            return;
        }

        String filter = "Canais".equals(label) ? "canal"
                : ("Filmes".equals(label) ? "filme"
                : ("Séries".equals(label) ? "série" : "favorito"));
        if (isContentSection(label) && playlistEntries.isEmpty() && !playlistRefreshRequested) {
            refreshPlaylistForSection(label);
        }
        List<PlaylistEntry> matches = filterEntries(filter);
        if (("Filmes".equals(label) || "Séries".equals(label))
                && !TextUtils.isEmpty(selectedMediaGroup)) {
            matches = filterEntriesByGroup(matches, selectedMediaGroup);
        }
        FrameLayout root = visualRoot();
        LinearLayout shell = new LinearLayout(this);
        shell.setOrientation(LinearLayout.HORIZONTAL);
        shell.setPadding(dp(8), dp(8), dp(8), dp(8));
        shell.setBackgroundColor(Color.argb(35, 18, 110, 210));

        LinearLayout categoryRail = new LinearLayout(this);
        categoryRail.setOrientation(LinearLayout.VERTICAL);
        categoryRail.setPadding(dp(6), dp(8), dp(6), dp(8));
        categoryRail.setBackground(round(Color.argb(178, 6, 42, 92), dp(10)));
        if ("Filmes".equals(label) || "Séries".equals(label)) {
            addMediaGroupButtons(categoryRail, filterEntries(filter), label);
        } else {
            addRailButton(categoryRail, "Recém adicionados  " + playlistEntries.size(), label, "favorito");
            addRailButton(categoryRail, "Maior nota", label, "favorito");
            addRailButton(categoryRail, "Mais assistidos", label, "favorito");
            addRailButton(categoryRail, "Canais", label, "canal");
            addRailButton(categoryRail, "Filmes", label, "filme");
            addRailButton(categoryRail, "Séries", label, "série");
            addRailButton(categoryRail, "Favoritos", label, "favorito");
        }
        ScrollView railScroll = new ScrollView(this);
        railScroll.addView(categoryRail, new ScrollView.LayoutParams(
                ScrollView.LayoutParams.MATCH_PARENT, ScrollView.LayoutParams.WRAP_CONTENT));
        shell.addView(railScroll, new LinearLayout.LayoutParams(0,
                LinearLayout.LayoutParams.MATCH_PARENT, 0.22f));

        LinearLayout center = new LinearLayout(this);
        center.setOrientation(LinearLayout.VERTICAL);
        center.setPadding(dp(14), dp(4), dp(14), dp(4));
        TextView heading = text(label + "  |  " + displayAppName(), 23, Color.WHITE, true);
        heading.setPadding(0, 0, 0, dp(8));
        center.addView(heading, new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, dp(48)));
        TextView count = text(matches.isEmpty() ? playlistStatus
                : matches.size() + " itens disponíveis", 13, Color.LTGRAY, false);
        center.addView(count, new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, dp(28)));

        final List<PlaylistEntry> displayedMatches = matches;
        if ("Filmes".equals(label) || "Séries".equals(label)) {
            GridView contentGrid = new GridView(this);
            contentGrid.setNumColumns(4);
            contentGrid.setHorizontalSpacing(dp(8));
            contentGrid.setVerticalSpacing(dp(8));
            contentGrid.setStretchMode(GridView.STRETCH_COLUMN_WIDTH);
            contentGrid.setBackgroundColor(Color.TRANSPARENT);
            contentGrid.setAdapter(new BaseAdapter() {
                @Override public int getCount() { return displayedMatches.size(); }
                @Override public Object getItem(int position) { return displayedMatches.get(position); }
                @Override public long getItemId(int position) { return position; }
                @Override public View getView(int position, View convertView,
                                              android.view.ViewGroup parent) {
                    return createPosterCard(displayedMatches.get(position));
                }
            });
            center.addView(contentGrid, new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT, 0, 1f));
        } else {
            ListView contentList = new ListView(this);
            contentList.setDivider(null);
            contentList.setDividerHeight(0);
            contentList.setBackgroundColor(Color.TRANSPARENT);
            contentList.setAdapter(new BaseAdapter() {
                @Override public int getCount() { return displayedMatches.size(); }
                @Override public Object getItem(int position) { return displayedMatches.get(position); }
                @Override public long getItemId(int position) { return position; }
                @Override public View getView(int position, View convertView,
                                              android.view.ViewGroup parent) {
                    return createMediaRow(displayedMatches.get(position), position);
                }
            });
            center.addView(contentList, new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT, 0, 1f));
        }
        shell.addView(center, new LinearLayout.LayoutParams(0,
                LinearLayout.LayoutParams.MATCH_PARENT, 0.78f));
        root.addView(shell, matchParams());
        setContentView(root);
    }

    private void showChannelsScreen(String requestedGroup) {
        currentScreen = "Canais";
        if (playlistEntries.isEmpty() && !playlistRefreshRequested) {
            refreshPlaylistForSection("Canais");
            return;
        }
        List<String> groups = channelGroups();
        String group = groups.contains(requestedGroup) ? requestedGroup
                : (groups.isEmpty() ? "Todos" : groups.get(0));
        selectedChannelGroup = group;
        List<PlaylistEntry> channels = channelsForGroup(group);
        FrameLayout root = visualRoot();
        LinearLayout shell = new LinearLayout(this);
        shell.setOrientation(LinearLayout.HORIZONTAL);
        shell.setPadding(dp(8), dp(8), dp(8), dp(8));
        shell.setBackgroundColor(Color.argb(35, 18, 110, 210));

        LinearLayout groupsRail = new LinearLayout(this);
        groupsRail.setOrientation(LinearLayout.VERTICAL);
        groupsRail.setPadding(dp(6), dp(8), dp(6), dp(8));
        groupsRail.setBackground(round(Color.argb(180, 5, 38, 84), dp(10)));
        int visibleGroupCount = Math.min(groups.size(), 300);
        for (int groupIndex = 0; groupIndex < visibleGroupCount; groupIndex++) {
            String item = groups.get(groupIndex);
            TextView groupButton = text(item, 15,
                    item.equals(group) ? Color.WHITE : Color.LTGRAY, false);
            groupButton.setGravity(Gravity.CENTER_VERTICAL);
            groupButton.setPadding(dp(14), 0, dp(8), 0);
            groupButton.setSingleLine(true);
            groupButton.setEllipsize(android.text.TextUtils.TruncateAt.END);
            groupButton.setBackground(round(item.equals(group)
                    ? Color.rgb(20, 150, 220) : Color.argb(145, 7, 66, 132), dp(8)));
            groupButton.setOnClickListener(view -> showChannelsScreen(item));
            LinearLayout.LayoutParams gp = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT, dp(54));
            gp.setMargins(0, dp(4), 0, dp(4));
            groupsRail.addView(groupButton, gp);
        }
        ScrollView groupScroll = new ScrollView(this);
        groupScroll.addView(groupsRail, new ScrollView.LayoutParams(
                ScrollView.LayoutParams.MATCH_PARENT, ScrollView.LayoutParams.WRAP_CONTENT));
        shell.addView(groupScroll, new LinearLayout.LayoutParams(0,
                LinearLayout.LayoutParams.MATCH_PARENT, 0.22f));

        LinearLayout center = new LinearLayout(this);
        center.setOrientation(LinearLayout.VERTICAL);
        center.setPadding(dp(14), dp(4), dp(14), dp(4));
        TextView heading = text("Canais  |  " + group, 23, Color.WHITE, true);
        center.addView(heading, new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, dp(48)));
        TextView count = text(channels.size() + " canais", 13, Color.LTGRAY, false);
        center.addView(count, new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, dp(28)));
        ListView channelList = new ListView(this);
        channelList.setDivider(null);
        channelList.setDividerHeight(0);
        channelList.setBackgroundColor(Color.TRANSPARENT);
        channelList.setAdapter(new android.widget.BaseAdapter() {
            @Override public int getCount() {
                return channels.isEmpty() ? 1 : channels.size();
            }
            @Override public Object getItem(int position) {
                return channels.isEmpty() ? null : channels.get(position);
            }
            @Override public long getItemId(int position) { return position; }
            @Override public View getView(int position, View convertView, android.view.ViewGroup parent) {
                if (channels.isEmpty()) {
                    TextView empty = text(TextUtils.isEmpty(playlistStatus)
                            ? "Nenhum canal carregado" : playlistStatus, 16, Color.LTGRAY, false);
                    empty.setPadding(dp(12), dp(18), dp(12), dp(18));
                    return empty;
                }
                PlaylistEntry entry = channels.get(position);
                LinearLayout row = new LinearLayout(MainActivity.this);
                row.setGravity(Gravity.CENTER_VERTICAL);
                row.setPadding(dp(10), dp(4), dp(10), dp(4));
                row.setBackground(round(Color.argb(150, 8, 66, 126), dp(9)));
                    ImageView logo = new ImageView(MainActivity.this);
                logo.setImageResource(R.drawable.zonex_icon);
                logo.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                loadImageInto(logo, entry.logoUrl);
                row.addView(logo, new LinearLayout.LayoutParams(dp(60), dp(58)));
                LinearLayout names = new LinearLayout(MainActivity.this);
                names.setOrientation(LinearLayout.VERTICAL);
                names.addView(text("#" + (position + 1), 12, Color.LTGRAY, false),
                        new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, dp(20)));
                TextView channelTitle = text(entry.title, 17, Color.WHITE, true);
                channelTitle.setSingleLine(true);
                channelTitle.setEllipsize(android.text.TextUtils.TruncateAt.END);
                names.addView(channelTitle, new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT, dp(34)));
                row.addView(names, new LinearLayout.LayoutParams(0,
                        LinearLayout.LayoutParams.MATCH_PARENT, 1f));
                TextView heart = text("♡", 37, Color.WHITE, false);
                heart.setGravity(Gravity.CENTER);
                row.addView(heart, new LinearLayout.LayoutParams(dp(64), dp(58)));
                row.setOnClickListener(view -> {
                    showMiniPlayer(entry);
                });
                row.setLayoutParams(new ListView.LayoutParams(
                        ListView.LayoutParams.MATCH_PARENT, dp(78)));
                return row;
            }
        });
        center.addView(channelList, new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, 0, 1f));
        shell.addView(center, new LinearLayout.LayoutParams(0,
                LinearLayout.LayoutParams.MATCH_PARENT, 0.42f));
        shell.addView(createMiniPlayer(), new LinearLayout.LayoutParams(0,
                LinearLayout.LayoutParams.MATCH_PARENT, 0.36f));
        root.addView(shell, matchParams());
        setContentView(root);
    }

    private List<String> channelGroups() {
        List<String> groups = new ArrayList<>();
        groups.add("Todos");
        for (PlaylistEntry entry : channelEntries()) {
            String group = TextUtils.isEmpty(entry.group) ? "Outros" : entry.group.trim();
            if (!groups.contains(group)) groups.add(group);
        }
        return groups;
    }

    private List<PlaylistEntry> channelsForGroup(String group) {
        List<PlaylistEntry> result = new ArrayList<>();
        for (PlaylistEntry entry : channelEntries()) {
            String entryGroup = TextUtils.isEmpty(entry.group) ? "Outros" : entry.group.trim();
            if ("Todos".equals(group) || group.equals(entryGroup)) result.add(entry);
        }
        return result;
    }

    private void addMediaGroupButtons(LinearLayout rail, List<PlaylistEntry> entries,
                                      String section) {
        TextView all = text("Todos", 15, TextUtils.isEmpty(selectedMediaGroup)
                ? Color.WHITE : Color.LTGRAY, false);
        all.setGravity(Gravity.CENTER_VERTICAL);
        all.setPadding(dp(14), 0, dp(8), 0);
        all.setBackground(round(TextUtils.isEmpty(selectedMediaGroup)
                ? Color.rgb(20, 150, 220) : Color.argb(145, 7, 66, 132), dp(9)));
        all.setOnClickListener(view -> {
            selectedMediaGroup = "";
            showSection(section);
        });
        LinearLayout.LayoutParams allParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, dp(54));
        allParams.setMargins(0, dp(4), 0, dp(4));
        rail.addView(all, allParams);
        List<String> groups = new ArrayList<>();
        for (PlaylistEntry entry : entries) {
            String group = TextUtils.isEmpty(entry.group) ? "Outros" : entry.group.trim();
            if (!groups.contains(group)) groups.add(group);
        }
        for (String group : groups) {
            TextView button = text(group, 15,
                    group.equals(selectedMediaGroup) ? Color.WHITE : Color.LTGRAY, false);
            button.setGravity(Gravity.CENTER_VERTICAL);
            button.setPadding(dp(14), 0, dp(8), 0);
            button.setSingleLine(true);
            button.setEllipsize(android.text.TextUtils.TruncateAt.END);
            button.setBackground(round(group.equals(selectedMediaGroup)
                    ? Color.rgb(20, 150, 220) : Color.argb(145, 7, 66, 132), dp(9)));
            button.setOnClickListener(view -> {
                selectedMediaGroup = group;
                showSection(section);
            });
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT, dp(54));
            params.setMargins(0, dp(4), 0, dp(4));
            rail.addView(button, params);
        }
    }

    private List<PlaylistEntry> filterEntriesByGroup(List<PlaylistEntry> entries, String group) {
        List<PlaylistEntry> result = new ArrayList<>();
        for (PlaylistEntry entry : entries) {
            String entryGroup = TextUtils.isEmpty(entry.group) ? "Outros" : entry.group.trim();
            if (group.equals(entryGroup)) result.add(entry);
        }
        return result;
    }

    private void addRailButton(LinearLayout rail, String label, String active, String filter) {
        TextView button = text(label, 15,
                label.equals(active) ? Color.WHITE : Color.LTGRAY, false);
        button.setGravity(Gravity.CENTER_VERTICAL);
        button.setPadding(dp(14), 0, dp(8), 0);
        button.setBackground(round(label.equals(active)
                ? Color.rgb(18, 128, 210) : Color.argb(155, 8, 67, 130), dp(9)));
        button.setOnClickListener(view -> showSection(
                "canal".equals(filter) ? "Canais"
                        : ("filme".equals(filter) ? "Filmes"
                        : ("série".equals(filter) ? "Séries" : "Favoritos"))));
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, dp(54));
        params.setMargins(0, dp(4), 0, dp(4));
        rail.addView(button, params);
    }

    private void addChannelRows(LinearLayout rows, List<PlaylistEntry> entries) {
        if (entries.isEmpty()) {
            addEntryRows(rows, entries);
            return;
        }
        int limit = entries.size();
        for (int index = 0; index < limit; index++) {
            PlaylistEntry entry = entries.get(index);
            LinearLayout row = new LinearLayout(this);
            row.setGravity(Gravity.CENTER_VERTICAL);
            row.setPadding(dp(10), dp(4), dp(10), dp(4));
            row.setBackground(round(Color.argb(150, 8, 66, 126), dp(9)));
            ImageView logo = new ImageView(this);
            logo.setImageResource(R.drawable.zonex_icon);
            logo.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            loadImageInto(logo, entry.logoUrl);
            row.addView(logo, new LinearLayout.LayoutParams(dp(60), dp(58)));
            LinearLayout names = new LinearLayout(this);
            names.setOrientation(LinearLayout.VERTICAL);
            TextView number = text("#" + (index + 1), 12, Color.LTGRAY, false);
            names.addView(number, new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT, dp(20)));
            TextView title = text(entry.title, 17, Color.WHITE, true);
            title.setSingleLine(true);
            title.setEllipsize(android.text.TextUtils.TruncateAt.END);
            names.addView(title, new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT, dp(34)));
            row.addView(names, new LinearLayout.LayoutParams(0,
                    LinearLayout.LayoutParams.MATCH_PARENT, 1f));
            TextView heart = text("♡", 37, Color.WHITE, false);
            heart.setGravity(Gravity.CENTER);
            row.addView(heart, new LinearLayout.LayoutParams(dp(64), dp(58)));
            row.setOnClickListener(view -> {
                showMiniPlayer(entry);
            });
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT, dp(78));
            params.setMargins(0, dp(4), 0, dp(4));
            rows.addView(row, params);
        }
    }

    private View createMediaRow(PlaylistEntry entry, int position) {
        LinearLayout row = new LinearLayout(this);
        row.setGravity(Gravity.CENTER_VERTICAL);
        row.setPadding(dp(8), dp(5), dp(8), dp(5));
        row.setBackground(round(Color.argb(150, 8, 66, 126), dp(9)));
        ImageView cover = new ImageView(this);
        cover.setImageResource(R.drawable.zonex_icon);
        cover.setScaleType(ImageView.ScaleType.CENTER_CROP);
        loadImageInto(cover, entry.logoUrl);
        row.addView(cover, new LinearLayout.LayoutParams(dp(82), dp(82)));
        LinearLayout names = new LinearLayout(this);
        names.setOrientation(LinearLayout.VERTICAL);
        names.setPadding(dp(10), 0, dp(4), 0);
        names.addView(text("#" + (position + 1), 12, Color.LTGRAY, false),
                new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, dp(20)));
        TextView name = text(entry.title, 17, Color.WHITE, true);
        name.setSingleLine(true);
        name.setEllipsize(android.text.TextUtils.TruncateAt.END);
        names.addView(name, new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, dp(34)));
        names.addView(text(TextUtils.isEmpty(entry.group) ? "Conteúdo" : entry.group,
                12, Color.LTGRAY, false), new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, dp(22)));
        row.addView(names, new LinearLayout.LayoutParams(0,
                LinearLayout.LayoutParams.MATCH_PARENT, 1f));
        TextView heart = text("♡", 34, Color.WHITE, false);
        heart.setGravity(Gravity.CENTER);
        row.addView(heart, new LinearLayout.LayoutParams(dp(58), dp(82)));
                updateFavoriteIcon(heart, entry);
                heart.setOnClickListener(view -> toggleFavorite(entry, heart));
                row.setOnClickListener(view -> {
                    if (isChannelEntry(entry)) showMiniPlayer(entry);
                    else showMediaDetails(entry);
                });
        row.setLayoutParams(new ListView.LayoutParams(
                ListView.LayoutParams.MATCH_PARENT, dp(94)));
        return row;
    }

    private View createPosterCard(PlaylistEntry entry) {
        LinearLayout card = new LinearLayout(this);
        card.setOrientation(LinearLayout.VERTICAL);
        card.setGravity(Gravity.CENTER_HORIZONTAL);
        card.setPadding(dp(5), dp(5), dp(5), dp(5));
        card.setBackground(round(Color.argb(150, 8, 66, 126), dp(8)));
        ImageView poster = new ImageView(this);
        poster.setImageResource(R.drawable.zonex_icon);
        poster.setScaleType(ImageView.ScaleType.CENTER_CROP);
        loadImageInto(poster, entry.logoUrl);
        card.addView(poster, new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, dp(150)));
        TextView title = text(entry.title, 14, Color.WHITE, false);
        title.setGravity(Gravity.CENTER);
        title.setMaxLines(2);
        title.setEllipsize(android.text.TextUtils.TruncateAt.END);
        card.addView(title, new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, dp(42)));
        if (!TextUtils.isEmpty(entry.synopsis)) {
            TextView synopsis = text(entry.synopsis, 11, Color.LTGRAY, false);
            synopsis.setGravity(Gravity.CENTER);
            synopsis.setMaxLines(2);
            synopsis.setEllipsize(android.text.TextUtils.TruncateAt.END);
            card.addView(synopsis, new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT, dp(38)));
        }
        Button trailer = actionButton("▶ Abrir", Color.rgb(16, 104, 184));
        trailer.setOnClickListener(view -> showMediaDetails(entry));
        card.addView(trailer, new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, dp(40)));
        card.setOnClickListener(view -> showMediaDetails(entry));
        card.setLayoutParams(new GridView.LayoutParams(
                GridView.LayoutParams.MATCH_PARENT, dp(TextUtils.isEmpty(entry.synopsis) ? 245 : 283)));
        return card;
    }

    private void addPosterCards(GridLayout grid, List<PlaylistEntry> entries) {
        if (entries.isEmpty()) {
            TextView empty = text(TextUtils.isEmpty(playlistStatus)
                    ? "Nenhum conteúdo carregado" : playlistStatus, 16, Color.LTGRAY, false);
            grid.addView(empty, new GridLayout.LayoutParams(
                    GridLayout.spec(GridLayout.UNDEFINED, 4),
                    GridLayout.spec(GridLayout.UNDEFINED, 1f)));
            return;
        }
        int limit = entries.size();
        for (int index = 0; index < limit; index++) {
            PlaylistEntry entry = entries.get(index);
            LinearLayout card = new LinearLayout(this);
            card.setOrientation(LinearLayout.VERTICAL);
            card.setGravity(Gravity.CENTER_HORIZONTAL);
            card.setPadding(dp(5), dp(5), dp(5), dp(5));
            card.setBackground(round(Color.argb(150, 8, 66, 126), dp(8)));
            ImageView poster = new ImageView(this);
            poster.setImageResource(R.drawable.zonex_icon);
            poster.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            loadImageInto(poster, entry.logoUrl);
            card.addView(poster, new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT, dp(150)));
            TextView title = text(entry.title, 14, Color.WHITE, false);
            title.setGravity(Gravity.CENTER);
            title.setMaxLines(2);
            title.setEllipsize(android.text.TextUtils.TruncateAt.END);
            card.addView(title, new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT, dp(42)));
            if (!TextUtils.isEmpty(entry.synopsis)) {
                TextView synopsis = text(entry.synopsis, 11, Color.LTGRAY, false);
                synopsis.setGravity(Gravity.CENTER);
                synopsis.setMaxLines(2);
                synopsis.setEllipsize(android.text.TextUtils.TruncateAt.END);
                card.addView(synopsis, new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT, dp(38)));
            }
            Button trailer = actionButton("▶ Trailer", Color.rgb(16, 104, 184));
            trailer.setOnClickListener(view -> showMediaDetails(entry));
            card.addView(trailer, new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT, dp(40)));
            GridLayout.LayoutParams params = new GridLayout.LayoutParams(
                    GridLayout.spec(GridLayout.UNDEFINED, 1f),
                    GridLayout.spec(GridLayout.UNDEFINED, 1f));
            params.setMargins(dp(5), dp(5), dp(5), dp(5));
            card.setOnClickListener(view -> showMediaDetails(entry));
            grid.addView(card, params);
        }
    }

    private boolean isFavorite(PlaylistEntry entry) {
        return getSharedPreferences("nexus_favorites", MODE_PRIVATE)
                .getBoolean(favoriteKey(entry), false);
    }

    private String favoriteKey(PlaylistEntry entry) {
        return TextUtils.isEmpty(entry.url) ? entry.title : entry.url;
    }

    private void updateFavoriteIcon(TextView icon, PlaylistEntry entry) {
        icon.setText(isFavorite(entry) ? "♥" : "♡");
        icon.setTextColor(isFavorite(entry) ? Color.rgb(255, 85, 110) : Color.WHITE);
    }

    private void toggleFavorite(PlaylistEntry entry, TextView icon) {
        boolean value = !isFavorite(entry);
        getSharedPreferences("nexus_favorites", MODE_PRIVATE).edit()
                .putBoolean(favoriteKey(entry), value).apply();
        updateFavoriteIcon(icon, entry);
        Toast.makeText(this, value ? "Adicionado aos favoritos" : "Removido dos favoritos",
                Toast.LENGTH_SHORT).show();
    }

    private void showMediaDetails(PlaylistEntry entry) {
        final Dialog dialog = new Dialog(this, android.R.style.Theme_Black_NoTitleBar);
        LinearLayout panel = new LinearLayout(this);
        panel.setOrientation(LinearLayout.VERTICAL);
        panel.setPadding(dp(18), dp(16), dp(18), dp(16));
        panel.setBackground(round(Color.rgb(7, 27, 58), dp(12)));
        ImageView cover = new ImageView(this);
        cover.setImageResource(R.drawable.zonex_icon);
        cover.setScaleType(ImageView.ScaleType.CENTER_CROP);
        loadImageInto(cover, entry.logoUrl);
        panel.addView(cover, new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, dp(190)));
        TextView title = text(entry.title, 21, Color.WHITE, true);
        title.setPadding(0, dp(12), 0, dp(4));
        panel.addView(title);
        String type = isSeriesEntry(entry) ? "Série" : "Filme";
        panel.addView(text(type + " · " + (TextUtils.isEmpty(entry.group) ? "Sem categoria" : entry.group),
                13, Color.LTGRAY, false));
        TextView synopsis = text(TextUtils.isEmpty(entry.synopsis)
                ? "Sinopse não informada para este conteúdo." : entry.synopsis,
                14, Color.WHITE, false);
        synopsis.setPadding(0, dp(12), 0, dp(12));
        synopsis.setMaxLines(6);
        panel.addView(synopsis);
        Button play = actionButton("▶ REPRODUZIR", Color.rgb(18, 130, 210));
        play.setOnClickListener(view -> {
            dialog.dismiss();
            openFullScreenPlayer(entry);
        });
        panel.addView(play, new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, dp(50)));
        Button favorite = actionButton(isFavorite(entry) ? "♥ REMOVER DOS FAVORITOS" : "♡ ADICIONAR AOS FAVORITOS",
                Color.rgb(25, 76, 135));
        favorite.setOnClickListener(view -> {
            toggleFavorite(entry, favorite);
            favorite.setText(isFavorite(entry) ? "♥ REMOVER DOS FAVORITOS" : "♡ ADICIONAR AOS FAVORITOS");
        });
        panel.addView(favorite, new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, dp(50)));
        if (isSeriesEntry(entry)) {
            Button episodes = actionButton("TEMPORADAS E EPISÓDIOS", Color.rgb(35, 94, 150));
            episodes.setOnClickListener(view -> loadSeriesSeasons(entry));
            panel.addView(episodes, new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT, dp(50)));
        }
        Button close = actionButton("FECHAR", Color.rgb(55, 65, 110));
        close.setOnClickListener(view -> dialog.dismiss());
        panel.addView(close, new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, dp(50)));
        ScrollView scroll = new ScrollView(this);
        scroll.addView(panel);
        dialog.setContentView(scroll);
        dialog.show();
        Window window = dialog.getWindow();
        if (window != null) window.setLayout((int) (getResources().getDisplayMetrics().widthPixels * 0.72f),
                WindowManager.LayoutParams.WRAP_CONTENT);
    }

    private LinearLayout createMiniPlayer() {
        LinearLayout player = new LinearLayout(this);
        player.setOrientation(LinearLayout.VERTICAL);
        player.setBackground(round(Color.argb(205, 3, 25, 54), dp(8)));
        player.setPadding(dp(6), dp(8), dp(6), dp(8));
        TextView title = text("Mini player · toque em um canal", 16, Color.WHITE, true);
        title.setSingleLine(true);
        title.setEllipsize(android.text.TextUtils.TruncateAt.END);
        miniPlayerTitleView = title;
        player.addView(title, new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, dp(42)));
        FrameLayout videoFrame = new FrameLayout(this);
        miniVideoFrame = videoFrame;
        ImageView preview = new ImageView(this);
        preview.setImageResource(R.drawable.zonex_background);
        preview.setScaleType(ImageView.ScaleType.CENTER_CROP);
        videoFrame.addView(preview, new FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.MATCH_PARENT));
        miniVideoView = new FillVideoView(this);
        miniVideoView.setBackgroundColor(Color.TRANSPARENT);
        videoFrame.addView(miniVideoView, new FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.MATCH_PARENT));
        View.OnClickListener expandListener = view -> {
            if (currentPlayingEntry != null) openFullScreenPlayer(currentPlayingEntry);
        };
        videoFrame.setOnClickListener(expandListener);
        miniVideoView.setOnClickListener(expandListener);
        player.addView(videoFrame, new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, dp(250)));
        TextView hint = text("Selecione um canal para abrir o mini player.",
                12, Color.LTGRAY, false);
        hint.setPadding(dp(8), dp(10), dp(8), 0);
        miniPlayerHintView = hint;
        player.addView(hint, new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, dp(40)));
        TextView epg = text("EPG indisponível", 12, Color.LTGRAY, false);
        epg.setPadding(dp(8), dp(2), dp(8), 0);
        miniPlayerEpgView = epg;
        player.addView(epg, new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, dp(34)));
        return player;
    }

    private void showMiniPlayer(PlaylistEntry entry) {
        currentPlayingEntry = entry;
        sendHeartbeatForContent(entry.title);
        if (miniPlayerTitleView != null) {
            miniPlayerTitleView.setText("Mini player · " + entry.title);
        }
        loadEpgFor(entry);
        if (miniVideoView == null || TextUtils.isEmpty(entry.url)) {
            if (miniPlayerHintView != null) {
                miniPlayerHintView.setText("Este item não possui uma URL de reprodução.");
            }
            return;
        }
        if (miniPlayerHintView != null) {
            miniPlayerHintView.setText("Carregando " + entry.title + "...");
        }
        try {
            miniVideoView.setVideoURI(Uri.parse(entry.url));
            miniVideoView.setOnPreparedListener(mediaPlayer -> {
                mediaPlayer.setVolume(1f, 1f);
                if (android.os.Build.VERSION.SDK_INT >= 21) {
                    mediaPlayer.setVideoScalingMode(
                            MediaPlayer.VIDEO_SCALING_MODE_SCALE_TO_FIT_WITH_CROPPING);
                }
                if (miniVideoView instanceof FillVideoView) {
                    ((FillVideoView) miniVideoView).setVideoSize(
                            mediaPlayer.getVideoWidth(), mediaPlayer.getVideoHeight());
                }
                miniVideoView.start();
                if (miniPlayerHintView != null) {
                    miniPlayerHintView.setText("Reproduzindo " + entry.title);
                }
            });
            miniVideoView.setOnErrorListener((player, what, extra) -> {
                if (miniPlayerHintView != null) {
                    miniPlayerHintView.setText("Não foi possível reproduzir este canal.");
                }
                return true;
            });
            miniVideoView.requestFocus();
            miniVideoView.start();
        } catch (Exception error) {
            if (miniPlayerHintView != null) {
                miniPlayerHintView.setText("URL de reprodução inválida.");
            }
        }
    }

    private void playVodFullScreen(PlaylistEntry entry) {
        final Dialog dialog = new Dialog(this, android.R.style.Theme_Black_NoTitleBar_Fullscreen);
        FrameLayout root = new FrameLayout(this);
        root.setBackgroundColor(Color.BLACK);
        VideoView video = new FillVideoView(this);
        root.addView(video, new FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.MATCH_PARENT));
        Button close = actionButton("FECHAR", Color.argb(190, 20, 35, 65));
        FrameLayout.LayoutParams closeParams = new FrameLayout.LayoutParams(dp(110), dp(48),
                Gravity.TOP | Gravity.RIGHT);
        closeParams.setMargins(0, dp(18), dp(18), 0);
        root.addView(close, closeParams);
        close.setOnClickListener(view -> dialog.dismiss());
        dialog.setContentView(root);
        dialog.setOnShowListener(ignored -> {
            Window window = dialog.getWindow();
            if (window != null) {
                window.setLayout(WindowManager.LayoutParams.MATCH_PARENT,
                        WindowManager.LayoutParams.MATCH_PARENT);
                window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                        WindowManager.LayoutParams.FLAG_FULLSCREEN);
                window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                        | View.SYSTEM_UI_FLAG_FULLSCREEN | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
            }
            try {
                video.setVideoURI(Uri.parse(entry.url));
                video.setOnPreparedListener(player -> {
                    player.setVolume(1f, 1f);
                    if (android.os.Build.VERSION.SDK_INT >= 21) {
                        player.setVideoScalingMode(MediaPlayer.VIDEO_SCALING_MODE_SCALE_TO_FIT_WITH_CROPPING);
                    }
                    if (video instanceof FillVideoView) {
                        ((FillVideoView) video).setVideoSize(player.getVideoWidth(), player.getVideoHeight());
                    }
                    video.start();
                });
            } catch (Exception ignoredError) { }
        });
        dialog.show();
    }

    private void openFullScreenPlayer(PlaylistEntry entry) {
        final Dialog dialog = new Dialog(this, android.R.style.Theme_Black_NoTitleBar_Fullscreen);
        FrameLayout root = new FrameLayout(this);
        root.setBackgroundColor(Color.BLACK);
        final VideoView full = miniVideoView;
        if (full == null) return;
        android.view.ViewParent oldParent = full.getParent();
        if (oldParent instanceof android.view.ViewGroup) {
            ((android.view.ViewGroup) oldParent).removeView(full);
        }
        FrameLayout.LayoutParams fullParams = new FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.MATCH_PARENT,
                Gravity.CENTER);
        root.addView(full, fullParams);
        Button close = actionButton("FECHAR", Color.argb(190, 20, 35, 65));
        FrameLayout.LayoutParams closeParams = new FrameLayout.LayoutParams(dp(110), dp(48),
                Gravity.TOP | Gravity.RIGHT);
        closeParams.setMargins(0, dp(18), dp(18), 0);
        root.addView(close, closeParams);
        close.setOnClickListener(view -> dialog.dismiss());
        dialog.setOnDismissListener(ignored -> {
            android.view.ViewParent parent = full.getParent();
            if (parent instanceof android.view.ViewGroup) ((android.view.ViewGroup) parent).removeView(full);
            if (miniVideoFrame != null) {
                miniVideoFrame.addView(full, new FrameLayout.LayoutParams(
                        FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.MATCH_PARENT));
            }
        });
        dialog.setContentView(root);
        dialog.setOnShowListener(ignored -> {
            Window window = dialog.getWindow();
            if (window != null) {
                window.setLayout(WindowManager.LayoutParams.MATCH_PARENT,
                        WindowManager.LayoutParams.MATCH_PARENT);
                window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                        WindowManager.LayoutParams.FLAG_FULLSCREEN);
                window.setBackgroundDrawableResource(android.R.color.black);
                window.getDecorView().setSystemUiVisibility(
                        View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                                | View.SYSTEM_UI_FLAG_FULLSCREEN
                                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                                | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                                | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                                | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
            }
            // O mesmo VideoView foi movido para o diálogo; não recarrega a URL
            // e não cria outro MediaPlayer. A posição e o estado de reprodução são preservados.
            full.requestFocus();
        });
        dialog.show();
    }

    private void loadEpgFor(PlaylistEntry entry) {
        if (isMovieEntry(entry) || isSeriesEntry(entry)) {
            if (miniPlayerEpgView != null) {
                miniPlayerEpgView.setText("EPG: programação do conteúdo sob demanda");
            }
            return;
        }
        String epgUrl = TextUtils.isEmpty(playlistEpgUrl) ? panelEpgUrl : playlistEpgUrl;
        if (TextUtils.isEmpty(epgUrl)) {
            if (miniPlayerEpgView != null) miniPlayerEpgView.setText("EPG não informado no painel ou na playlist");
            return;
        }
        if (miniPlayerEpgView != null) miniPlayerEpgView.setText("Consultando EPG...");
        networkExecutor.execute(() -> {
            String result = "EPG sem programação para este canal";
            HttpURLConnection connection = null;
            try {
                connection = (HttpURLConnection) new URL(epgUrl).openConnection();
                connection.setConnectTimeout(10_000);
                connection.setReadTimeout(15_000);
                connection.setInstanceFollowRedirects(true);
                int code = connection.getResponseCode();
                if (code >= 200 && code < 300) {
                    StringBuilder xml = new StringBuilder();
                    try (BufferedReader reader = new BufferedReader(new InputStreamReader(
                            new LimitedInputStream(connection.getInputStream(), 2 * 1024 * 1024L),
                            StandardCharsets.UTF_8))) {
                        String line;
                        while ((line = reader.readLine()) != null) xml.append(line).append('\n');
                    }
                    Pattern programme = Pattern.compile(
                            "(?is)<programme\\b([^>]*)>(.*?)</programme>");
                    Matcher matcher = programme.matcher(xml);
                    while (matcher.find()) {
                        String attrs = matcher.group(1);
                        String body = matcher.group(2);
                        String channelId = attribute(attrs, "channel");
                        String title = xmlTag(body, "title");
                        String description = xmlTag(body, "desc");
                        String start = attribute(attrs, "start");
                        String stop = attribute(attrs, "stop");
                        boolean idMatch = !TextUtils.isEmpty(entry.tvgId)
                                && normalizeKey(entry.tvgId).equals(normalizeKey(channelId));
                        boolean nameMatch = !TextUtils.isEmpty(title)
                                && (normalizeKey(title).contains(normalizeKey(entry.title))
                                || normalizeKey(entry.title).contains(normalizeKey(title)));
                        if (idMatch || nameMatch) {
                            result = "EPG: " + title;
                            if (!TextUtils.isEmpty(start)) result += " · " + formatXmltvTime(start);
                            if (!TextUtils.isEmpty(stop)) result += "–" + formatXmltvTime(stop);
                            if (!TextUtils.isEmpty(description)) result += "\\n" + description;
                            break;
                        }
                    }
                }
            } catch (Exception ignored) {
                result = "EPG indisponível";
            } finally {
                if (connection != null) connection.disconnect();
            }
            String finalResult = result;
            mainHandler.post(() -> {
                if (!destroyed && miniPlayerEpgView != null) miniPlayerEpgView.setText(finalResult);
            });
        });
    }

    private boolean isContentSection(String label) {
        return "Canais".equals(label) || "Filmes".equals(label) || "Séries".equals(label);
    }

    private void refreshPlaylistForSection(String label) {
        playlistRefreshRequested = true;
        playlistStatus = "Atualizando lista...";
        networkExecutor.execute(() -> {
            try {
                PanelConfig config = loadPanelConfig();
                if (config != null) {
                    lastConfig = config;
                    if (config.hasAccess && config.allowed) {
                        loadPlaylist(config);
                        loadXtreamCatalog(config);
                    } else {
                        playlistStatus = "Acesso indisponível";
                    }
                }
            } catch (Exception ignored) {
                playlistStatus = "Não foi possível atualizar a lista";
            } finally {
                mainHandler.post(() -> {
                    if (!destroyed) {
                        showSection(label);
                        playlistRefreshRequested = false;
                    }
                });
            }
        });
    }

    private void showSearch() {
        currentScreen = "Pesquisar";
        FrameLayout root = visualRoot();
        LinearLayout content = createNavigatedPage(root, "Pesquisar", "Pesquisar");
        TextView title = text("Pesquisar", 27, Color.WHITE, true);
        content.addView(title, new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, dp(54)));
        EditText input = new EditText(this);
        input.setHint("Nome do canal, filme ou série");
        input.setHintTextColor(Color.LTGRAY);
        input.setTextColor(Color.WHITE);
        content.addView(input, new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, dp(52)));
        LinearLayout results = new LinearLayout(this);
        results.setOrientation(LinearLayout.VERTICAL);
        ScrollView scroll = new ScrollView(this);
        scroll.addView(results, new ScrollView.LayoutParams(
                ScrollView.LayoutParams.MATCH_PARENT, ScrollView.LayoutParams.WRAP_CONTENT));
        content.addView(scroll, new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, 0, 1f));
        Button search = actionButton("BUSCAR", Color.rgb(33, 93, 164));
        search.setOnClickListener(view -> {
            results.removeAllViews();
            addEntryRows(results, filterEntries(input.getText().toString()));
        });
        content.addView(search, new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, dp(48)));
        addBackButton(content);
        setContentView(root);
    }

    private void showSettings() {
        currentScreen = "Configurações";
        FrameLayout root = visualRoot();
        LinearLayout content = createNavigatedPage(root, "Configurações", "Configurações");
        content.addView(text("Configurações", 27, Color.WHITE, true),
                new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, dp(54)));
        content.addView(text("Aplicativo: " + displayAppName(), 16, Color.WHITE, false),
                new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, dp(38)));
        content.addView(text("MAC: " + mac, 16, Color.WHITE, false),
                new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, dp(38)));
        content.addView(text("Status: " + statusText(), 16, Color.LTGRAY, false),
                new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, dp(52)));
        Button refresh = actionButton("SINCRONIZAR AGORA", Color.rgb(33, 93, 164));
        refresh.setOnClickListener(view -> {
            updateStatus("Sincronizando...");
            requestPanelSync();
        });
        content.addView(refresh, new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, dp(48)));
        addSettingsAction(content, "CONTA", "Dados da conta e validade");
        addSettingsAction(content, "ADICIONAR PLAYLIST", "Adicionar ou trocar lista");
        addSettingsAction(content, "LISTAS E FONTES", "Fontes sincronizadas pelo painel");
        addSettingsAction(content, "IDIOMA", "Português (Brasil)");
        addSettingsAction(content, "ÁUDIO", "Faixa de áudio padrão");
        addSettingsAction(content, "LEGENDAS", "Legenda e faixa padrão");
        addSettingsAction(content, "COR DA LEGENDA", "Cor e tamanho da legenda");
        addSettingsAction(content, "PLAYER EXTERNO", "Escolher reprodução interna ou externa");
        addSettingsAction(content, "CATEGORIAS OCULTAS", "Gerenciar categorias exibidas");
        addSettingsAction(content, "CONTROLE PARENTAL", "Bloqueio de conteúdo");
        addSettingsAction(content, "TEMA E CORES", "Tema azul/transparente do Nexus");
        addSettingsAction(content, "ATUALIZAÇÃO", "Verificar atualização do aplicativo");
        addBackButton(content);
        setContentView(root);
    }

    private void addSettingsAction(LinearLayout content, String title, String subtitle) {
        Button action = actionButton(title + "\n" + subtitle, Color.argb(180, 10, 70, 135));
        action.setTextSize(13);
        action.setGravity(Gravity.CENTER_VERTICAL | Gravity.LEFT);
        action.setPadding(dp(16), 0, dp(10), 0);
        action.setOnClickListener(view -> {
            if ("CONTA".equals(title)) {
                new AlertDialog.Builder(this).setTitle("CONTA")
                        .setMessage("Aplicativo: " + displayAppName() + "\nMAC: " + mac
                                + "\nStatus: " + statusText())
                        .setPositiveButton("OK", null).show();
            } else if ("ADICIONAR PLAYLIST".equals(title) || "LISTAS E FONTES".equals(title)) {
                updateStatus("Sincronizando listas...");
                requestPanelSync();
            } else if ("IDIOMA".equals(title)) {
                showChoiceSetting(title, new String[]{"Português (Brasil)", "Español", "English"}, "language");
            } else if ("ÁUDIO".equals(title)) {
                showChoiceSetting(title, new String[]{"Português", "Original", "Automático"}, "audio");
            } else if ("LEGENDAS".equals(title)) {
                showChoiceSetting(title, new String[]{"Português", "Original", "Desativadas"}, "subtitle");
            } else if ("COR DA LEGENDA".equals(title)) {
                showChoiceSetting(title, new String[]{"Branca", "Amarela", "Ciano"}, "subtitle_color");
            } else if ("PLAYER EXTERNO".equals(title)) {
                showChoiceSetting(title, new String[]{"Player interno", "Abrir com player externo"}, "external_player");
            } else if ("CATEGORIAS OCULTAS".equals(title)) {
                showCategoryVisibilitySetting();
            } else if ("CONTROLE PARENTAL".equals(title)) {
                showTextSetting(title, "Defina ou altere o PIN de proteção.");
            } else if ("TEMA E CORES".equals(title)) {
                showChoiceSetting(title, new String[]{"Azul Nexus", "Azul translúcido", "Escuro"}, "theme");
            } else if ("ATUALIZAÇÃO".equals(title)) {
                Toast.makeText(this, "Você está usando a versão " + INSTALLED_VERSION,
                        Toast.LENGTH_LONG).show();
            }
        });
        content.addView(action, new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, dp(54)));
    }

    private void loadSeriesSeasons(PlaylistEntry seriesEntry) {
        SeriesSource source = SeriesSource.fromEntry(seriesEntry);
        if (source == null) {
            Toast.makeText(this, "Não foi possível identificar a fonte da série.", Toast.LENGTH_LONG).show();
            return;
        }
        Toast.makeText(this, "Carregando temporadas...", Toast.LENGTH_SHORT).show();
        networkExecutor.execute(() -> {
            try {
                JSONObject response = getJsonAt(source.base + "/player_api.php?username="
                        + encoded(source.username) + "&password=" + encoded(source.password)
                        + "&action=get_series_info&series_id=" + encoded(source.seriesId));
                JSONObject seasons = response.optJSONObject("episodes");
                if (seasons == null) {
                    mainHandler.post(() -> Toast.makeText(this,
                            "A fonte não retornou temporadas para esta série.", Toast.LENGTH_LONG).show());
                    return;
                }
                mainHandler.post(() -> showSeriesSeasonsDialog(seriesEntry, source, seasons));
            } catch (Exception error) {
                mainHandler.post(() -> Toast.makeText(this,
                        "Não foi possível carregar os episódios.", Toast.LENGTH_LONG).show());
            }
        });
    }

    private void showSeriesSeasonsDialog(PlaylistEntry seriesEntry, SeriesSource source,
                                         JSONObject seasons) {
        final Dialog dialog = new Dialog(this, android.R.style.Theme_Black_NoTitleBar);
        LinearLayout panel = new LinearLayout(this);
        panel.setOrientation(LinearLayout.VERTICAL);
        panel.setPadding(dp(18), dp(16), dp(18), dp(16));
        panel.setBackground(round(Color.rgb(7, 27, 58), dp(12)));
        panel.addView(text(seriesEntry.title, 21, Color.WHITE, true),
                new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, dp(48)));
        panel.addView(text("Temporadas e episódios", 14, Color.LTGRAY, false),
                new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, dp(34)));
        LinearLayout seasonsList = new LinearLayout(this);
        seasonsList.setOrientation(LinearLayout.VERTICAL);
        java.util.Iterator<String> keys = seasons.keys();
        while (keys.hasNext()) {
            String seasonNumber = keys.next();
            JSONArray episodes = seasons.optJSONArray(seasonNumber);
            Button seasonButton = actionButton("TEMPORADA " + seasonNumber + " ("
                    + (episodes == null ? 0 : episodes.length()) + " episódios)",
                    Color.rgb(20, 85, 150));
            seasonButton.setOnClickListener(view -> showEpisodesDialog(
                    seriesEntry, source, seasonNumber, episodes));
            seasonsList.addView(seasonButton, new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT, dp(52)));
        }
        ScrollView scroll = new ScrollView(this);
        scroll.addView(seasonsList);
        panel.addView(scroll, new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, 0, 1f));
        Button close = actionButton("FECHAR", Color.rgb(55, 65, 110));
        close.setOnClickListener(view -> dialog.dismiss());
        panel.addView(close, new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, dp(50)));
        dialog.setContentView(panel);
        dialog.show();
        Window window = dialog.getWindow();
        if (window != null) window.setLayout((int) (getResources().getDisplayMetrics().widthPixels * 0.72f),
                (int) (getResources().getDisplayMetrics().heightPixels * 0.78f));
    }

    private void showEpisodesDialog(PlaylistEntry seriesEntry, SeriesSource source,
                                    String seasonNumber, JSONArray episodes) {
        if (episodes == null) return;
        final Dialog dialog = new Dialog(this, android.R.style.Theme_Black_NoTitleBar);
        LinearLayout panel = new LinearLayout(this);
        panel.setOrientation(LinearLayout.VERTICAL);
        panel.setPadding(dp(18), dp(16), dp(18), dp(16));
        panel.setBackground(round(Color.rgb(7, 27, 58), dp(12)));
        panel.addView(text(seriesEntry.title + " · Temporada " + seasonNumber,
                19, Color.WHITE, true), new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, dp(50)));
        LinearLayout list = new LinearLayout(this);
        list.setOrientation(LinearLayout.VERTICAL);
        for (int i = 0; i < episodes.length(); i++) {
            JSONObject episode = episodes.optJSONObject(i);
            if (episode == null) continue;
            String number = episode.optString("episode_num", String.valueOf(i + 1));
            String name = firstNonEmpty(episode.optString("title", ""),
                    episode.optString("name", ""), "Episódio " + number);
            String id = episode.optString("id", episode.optString("episode_id", ""));
            String extension = firstNonEmpty(episode.optString("container_extension", "mp4"), "mp4");
            String episodeUrl = source.base + "/series/" + source.username + "/"
                    + source.password + "/" + id + "." + extension;
            String image = episode.optString("movie_image", seriesEntry.logoUrl);
            Button play = actionButton("EP. " + number + "  " + name,
                    Color.argb(180, 10, 70, 135));
            play.setGravity(Gravity.CENTER_VERTICAL | Gravity.LEFT);
            play.setOnClickListener(view -> {
                dialog.dismiss();
                playVodFullScreen(new PlaylistEntry(name, seriesEntry.group, image,
                        id, episode.optString("plot", seriesEntry.synopsis), episodeUrl));
            });
            list.addView(play, new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT, dp(52)));
        }
        ScrollView scroll = new ScrollView(this);
        scroll.addView(list);
        panel.addView(scroll, new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, 0, 1f));
        Button close = actionButton("FECHAR", Color.rgb(55, 65, 110));
        close.setOnClickListener(view -> dialog.dismiss());
        panel.addView(close, new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, dp(50)));
        dialog.setContentView(panel);
        dialog.show();
        Window window = dialog.getWindow();
        if (window != null) window.setLayout((int) (getResources().getDisplayMetrics().widthPixels * 0.72f),
                (int) (getResources().getDisplayMetrics().heightPixels * 0.78f));
    }

    private static final class SeriesSource {
        private final String base;
        private final String username;
        private final String password;
        private final String seriesId;

        private SeriesSource(String base, String username, String password, String seriesId) {
            this.base = base;
            this.username = username;
            this.password = password;
            this.seriesId = seriesId;
        }

        private static SeriesSource fromEntry(PlaylistEntry entry) {
            try {
                URL url = new URL(entry.url);
                String[] parts = url.getPath().split("/");
                if (parts.length < 5) return null;
                String idPart = parts[parts.length - 1];
                int dot = idPart.indexOf('.');
                String id = dot > 0 ? idPart.substring(0, dot) : idPart;
                String user = parts[parts.length - 3];
                String pass = parts[parts.length - 2];
                if (TextUtils.isEmpty(id) || TextUtils.isEmpty(user) || TextUtils.isEmpty(pass)) return null;
                return new SeriesSource(url.getProtocol() + "://" + url.getAuthority(), user, pass, id);
            } catch (Exception ignored) {
                return null;
            }
        }
    }

    private void showChoiceSetting(String title, String[] choices, String key) {
        android.content.SharedPreferences prefs = getSharedPreferences("nexus_settings", MODE_PRIVATE);
        String selected = prefs.getString(key, choices[0]);
        int checked = 0;
        for (int i = 0; i < choices.length; i++) if (choices[i].equals(selected)) checked = i;
        final int[] current = {checked};
        new AlertDialog.Builder(this).setTitle(title)
                .setSingleChoiceItems(choices, checked, (dialog, which) -> current[0] = which)
                .setPositiveButton("SALVAR", (dialog, which) -> {
                    prefs.edit().putString(key, choices[current[0]]).apply();
                    Toast.makeText(this, "Configuração salva", Toast.LENGTH_SHORT).show();
                }).setNegativeButton("CANCELAR", null).show();
    }

    private void showTextSetting(String title, String message) {
        final EditText input = new EditText(this);
        input.setHint("PIN");
        input.setInputType(android.text.InputType.TYPE_CLASS_NUMBER
                | android.text.InputType.TYPE_NUMBER_VARIATION_PASSWORD);
        new AlertDialog.Builder(this).setTitle(title).setMessage(message).setView(input)
                .setPositiveButton("SALVAR", (dialog, which) -> {
                    getSharedPreferences("nexus_settings", MODE_PRIVATE).edit()
                            .putString("parental_pin", input.getText().toString()).apply();
                    Toast.makeText(this, "PIN salvo", Toast.LENGTH_SHORT).show();
                }).setNegativeButton("CANCELAR", null).show();
    }

    private void showCategoryVisibilitySetting() {
        final String[] choices = {"Canais", "Filmes", "Séries", "Favoritos", "Pesquisar"};
        final boolean[] checked = new boolean[choices.length];
        new AlertDialog.Builder(this).setTitle("CATEGORIAS OCULTAS")
                .setMultiChoiceItems(choices, checked, (dialog, which, value) -> checked[which] = value)
                .setPositiveButton("SALVAR", (dialog, which) -> {
                    StringBuilder hidden = new StringBuilder();
                    for (int i = 0; i < choices.length; i++) if (checked[i]) {
                        if (hidden.length() > 0) hidden.append(",");
                        hidden.append(choices[i]);
                    }
                    getSharedPreferences("nexus_settings", MODE_PRIVATE).edit()
                            .putString("hidden_categories", hidden.toString()).apply();
                    Toast.makeText(this, "Categorias atualizadas", Toast.LENGTH_SHORT).show();
                }).setNegativeButton("CANCELAR", null).show();
    }

    private LinearLayout pageContent() {
        LinearLayout content = new LinearLayout(this);
        content.setOrientation(LinearLayout.VERTICAL);
        content.setPadding(dp(38), dp(24), dp(38), dp(24));
        return content;
    }

    private void addBackButton(LinearLayout content) {
        Button back = actionButton("VOLTAR", Color.rgb(55, 65, 110));
        back.setOnClickListener(view -> showHome());
        content.addView(back, new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, dp(48)));
    }

    private void addEntryRows(LinearLayout rows, List<PlaylistEntry> entries) {
        if (entries.isEmpty()) {
            TextView empty = text(TextUtils.isEmpty(playlistStatus)
                    ? "Nenhum item carregado" : playlistStatus, 16, Color.LTGRAY, false);
            rows.addView(empty, new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT, dp(52)));
            return;
        }
        int limit = Math.min(entries.size(), 100);
        for (int index = 0; index < limit; index++) {
            PlaylistEntry entry = entries.get(index);
            TextView row = text(entry.title, 16, Color.WHITE, true);
            row.setSingleLine(true);
            row.setEllipsize(android.text.TextUtils.TruncateAt.END);
            row.setPadding(dp(16), 0, dp(16), 0);
            row.setBackground(round(Color.argb(150, 17, 27, 60), dp(8)));
            row.setOnClickListener(view -> sendHeartbeatForContent(entry.title));
            LinearLayout.LayoutParams rowParams = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT, dp(52));
            rowParams.setMargins(0, dp(4), 0, dp(4));
            rows.addView(row, rowParams);
        }
    }

    private List<PlaylistEntry> filterEntries(String filter) {
        if (TextUtils.isEmpty(filter)) {
            return new ArrayList<>(playlistEntries);
        }
        if ("favorito".equals(filter)) {
            List<PlaylistEntry> favorites = new ArrayList<>();
            for (PlaylistEntry entry : playlistEntries) if (isFavorite(entry)) favorites.add(entry);
            return favorites;
        }
        String query = filter.toLowerCase(Locale.US)
                .replace("é", "e").replace("ê", "e");
        List<PlaylistEntry> result = new ArrayList<>();
        for (PlaylistEntry entry : playlistEntries) {
            if ("filme".equals(query) && isMovieEntry(entry)) result.add(entry);
            else if ("serie".equals(query) && isSeriesEntry(entry)) result.add(entry);
            else if ("canal".equals(query) && isChannelEntry(entry)) result.add(entry);
            else if (!"filme".equals(query) && !"serie".equals(query)
                    && !"canal".equals(query)) {
                String haystack = (entry.title + " " + entry.group).toLowerCase(Locale.US)
                        .replace("é", "e").replace("ê", "e");
                if (haystack.contains(query)) result.add(entry);
            }
        }
        return result;
    }

    private String normalizeClassifier(String value) {
        if (value == null) return "";
        return value.toLowerCase(Locale.US)
                .replace("á", "a").replace("ã", "a").replace("â", "a")
                .replace("é", "e").replace("ê", "e").replace("í", "i")
                .replace("ó", "o").replace("ô", "o").replace("ú", "u")
                .replace("ç", "c");
    }

    private String groupKey(PlaylistEntry entry) {
        return normalizeClassifier(entry.group);
    }

    private String urlKey(PlaylistEntry entry) {
        return normalizeClassifier(entry.url).replace('\\', '/');
    }

    private boolean isSeriesEntry(PlaylistEntry entry) {
        String url = urlKey(entry);
        String group = groupKey(entry);
        if (url.matches(".*[/](series|serie)[/].*")) return true;
        return group.contains("series") || group.contains("serie")
                || group.contains("temporada") || group.contains("season")
                || group.contains("episodio") || group.contains("episode")
                || group.contains("netflix") || group.contains("amazon")
                || group.contains("prime") || group.contains("amc")
                || group.contains("hbo series") || group.contains("disney series")
                || group.contains("apple tv");
    }

    private boolean isMovieEntry(PlaylistEntry entry) {
        String url = urlKey(entry);
        String group = groupKey(entry);
        if (isSeriesEntry(entry)) return false;
        if (url.matches(".*[/](movie|movies|vod)[/].*")) return true;
        return group.contains("filme") || group.contains("movie")
                || group.contains("cinema") || group.contains("vod")
                || group.contains("acao") || group.contains("aventura")
                || group.contains("animacao") || group.contains("comedia")
                || group.contains("drama") || group.contains("ficcao")
                || group.contains("terror") || group.contains("suspense")
                || group.contains("romance") || group.contains("fantasia")
                || group.contains("documentario") || group.contains("familia")
                || group.contains("crime") || group.contains("thriller")
                || group.contains("musical") || group.contains("guerra")
                || group.contains("western") || group.contains("nacional");
    }

    private boolean isChannelEntry(PlaylistEntry entry) {
        return !isMovieEntry(entry) && !isSeriesEntry(entry);
    }

    private List<PlaylistEntry> channelEntries() {
        List<PlaylistEntry> result = new ArrayList<>();
        for (PlaylistEntry entry : playlistEntries) {
            if (isChannelEntry(entry)) result.add(entry);
        }
        return result;
    }

    private void sendHeartbeatForContent(String title) {
        lastConfig = lastConfig.withCurrentContent(title);
        updateStatus("Conteúdo selecionado: " + title);
        networkExecutor.execute(this::sendHeartbeat);

    }

    private void addPlaylistSummary(LinearLayout content) {
        TextView heading = text("Lista do painel", 19, Color.WHITE, true);
        LinearLayout.LayoutParams headingParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, dp(34));
        headingParams.topMargin = dp(6);
        content.addView(heading, headingParams);

        String summary = TextUtils.isEmpty(playlistStatus)
                ? "Aguardando lista..." : playlistStatus;
        TextView summaryView = text(summary, 14, Color.LTGRAY, false);
        summaryView.setGravity(Gravity.CENTER_VERTICAL);
        content.addView(summaryView, new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, dp(32)));

        if (playlistEntries.isEmpty()) {
            return;
        }
        LinearLayout rows = new LinearLayout(this);
        rows.setOrientation(LinearLayout.VERTICAL);
        int visibleEntries = Math.min(playlistEntries.size(), 8);
        for (int index = 0; index < visibleEntries; index++) {
            PlaylistEntry entry = playlistEntries.get(index);
            TextView row = text((index + 1) + ". " + entry.title, 14, Color.WHITE, false);
            row.setSingleLine(true);
            row.setEllipsize(android.text.TextUtils.TruncateAt.END);
            row.setPadding(dp(12), 0, dp(12), 0);
            row.setOnClickListener(view -> sendHeartbeatForContent(entry.title));
            rows.addView(row, new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT, dp(30)));
        }
        content.addView(rows, new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, dp(30 * visibleEntries)));
    }

    private void copyMac() {
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        if (clipboard != null) {
            clipboard.setPrimaryClip(ClipData.newPlainText("MAC do aparelho", mac));
            Toast.makeText(this, "MAC copiado", Toast.LENGTH_SHORT).show();
        }
    }

    private void requestPanelSync() {
        if (destroyed) {
            return;
        }
        networkExecutor.execute(() -> {
            try {
                PanelConfig config = loadPanelConfig();
                if (config != null) {
                    lastConfig = config;
                    boolean openHomeNow = config.hasAccess && config.allowed && !homeShown;
                    updateConfigUi(config);
                    if (openHomeNow) {
                        mainHandler.post(this::showHome);
                    }
                    if (config.hasAccess && config.allowed) {
                        loadPlaylist(config);
                        loadXtreamCatalog(config);
                        if (openHomeNow) {
                            mainHandler.post(() -> {
                                if (!destroyed && homeShown) {
                                    showHome();
                                }
                            });
                        }
                    }
                }
            } catch (Exception ignored) {
                updateStatus("Painel indisponível no momento");
            }

            sendHeartbeat();
            readNotifications();
            readRemoteCommands();
            checkForUpdate();
            scheduleNextSync();
        });
    }

    private void scheduleNextSync() {
        if (!destroyed) {
            mainHandler.postDelayed(this::requestPanelSync, POLL_INTERVAL_MS);
        }
    }

    private PanelConfig loadPanelConfig() {
        try {
            /* A validação universal revela qual aplicativo está associado ao MAC. */
            JSONObject basicObject = getJson("/api/device/check?mac=" + encoded(mac));
            panelEpgUrl = firstNonEmpty(
                    basicObject.optString("epg_url", ""),
                    basicObject.optString("epgUrl", ""),
                    basicObject.optString("xmltv_url", ""));
            PanelConfig basic = PanelConfig.fromBasicJson(basicObject);
            String appId = TextUtils.isEmpty(basic.appId) ? PANEL_APP_ID : basic.appId;

            /* O cadastro real deste MAC é OuroPro, que usa a rota legada de fontes. */
            if ("ouropro".equals(appId)) {
                try {
                    return basic.withGuimSources(
                            getJson("/api/v5/guim.php?mac=" + encoded(mac)));
                } catch (IOException ignored) {
                    return basic;
                }
            }

            /* Demais aplicativos usam a rota universal específica do appId retornado pelo painel. */
            try {
                String path = "/api/v5/apps/" + appId + "/config?mac=" + encoded(mac);
                JSONObject appObject = getJson(path);
                String configuredEpg = firstNonEmpty(
                        appObject.optString("epg_url", ""),
                        appObject.optString("epgUrl", ""),
                        appObject.optString("xmltv_url", ""));
                if (!TextUtils.isEmpty(configuredEpg)) panelEpgUrl = configuredEpg;
                return PanelConfig.fromJson(appObject).withAppId(appId);
            } catch (IOException ignored) {
                return basic.withAppId(appId);
            }
        } catch (IOException basicFailure) {
            /* Mantém compatibilidade com um painel que exponha somente a rota específica. */
            try {
                String path = "/api/v5/apps/" + PANEL_APP_ID + "/config?mac=" + encoded(mac);
                return PanelConfig.fromJson(getJson(path));
            } catch (IOException specificFailure) {
                return null;
            }
        }
    }

    private void loadPlaylist(PanelConfig config) {
        if (config.playlistUrls.isEmpty()) {
            playlistEntries = Collections.emptyList();
            playlistStatus = "Nenhuma lista cadastrada";
            return;
        }

        IOException lastFailure = null;
        List<PlaylistEntry> combined = new ArrayList<>();
        Set<String> seenUrls = new HashSet<>();
        boolean truncated = false;
        for (String playlistUrl : config.playlistUrls) {
            try {
                PlaylistParseResult parsed = downloadAndParseM3u(playlistUrl);
                if (parsed.entries.isEmpty()) {
                    lastFailure = new IOException("Playlist M3U vazia ou inválida");
                    continue;
                }
                for (PlaylistEntry entry : parsed.entries) {
                    String key = TextUtils.isEmpty(entry.url)
                            ? entry.title + "|" + entry.group : entry.url;
                    if (seenUrls.add(key)) {
                        combined.add(entry);
                        if (combined.size() >= MAX_PLAYLIST_ENTRIES) {
                            truncated = true;
                            break;
                        }
                    }
                }
                truncated = truncated || parsed.truncated;
                if (combined.size() >= MAX_PLAYLIST_ENTRIES) break;
            } catch (IOException failure) {
                lastFailure = failure;
            }
        }
        if (!combined.isEmpty()) {
            playlistEntries = combined;
            playlistStatus = combined.size() + " itens carregados"
                    + (truncated ? " (limite de segurança atingido)" : "");
            return;
        }
        playlistEntries = Collections.emptyList();
        playlistStatus = lastFailure == null
                ? "Lista indisponível ou credenciais inválidas"
                : "Lista indisponível (" + lastFailure.getMessage() + ")";
    }

    private void loadXtreamCatalog(PanelConfig config) {
        for (String sourceUrl : config.playlistUrls) {
            try {
                URL source = new URL(sourceUrl);
                String username = queryParam(source.getQuery(), "username");
                String password = queryParam(source.getQuery(), "password");
                if (TextUtils.isEmpty(username) || TextUtils.isEmpty(password)) continue;
                String authority = source.getAuthority();
                String[] schemes = "https".equalsIgnoreCase(source.getProtocol())
                        ? new String[]{"https", "http"} : new String[]{"http", "https"};
                for (String scheme : schemes) {
                    try {
                        String base = scheme + "://" + authority;
                        List<PlaylistEntry> catalog = new ArrayList<>();
                        String credentials = "?username=" + encoded(username)
                                + "&password=" + encoded(password);
                        appendXtreamItems(catalog, getJsonAt(base + "/player_api.php"
                                + credentials + "&action=get_vod_streams"), false, base, username, password);
                        appendXtreamItems(catalog, getJsonAt(base + "/player_api.php"
                                + credentials + "&action=get_series"), true, base, username, password);
                        if (!catalog.isEmpty()) {
                            mergeCatalog(catalog);
                            return;
                        }
                    } catch (Exception ignoredScheme) {
                        // Tenta o outro protocolo antes de voltar somente à M3U.
                    }
                }
                return;
            } catch (Exception ignored) {
                // Algumas fontes expõem apenas M3U; nesse caso o parser M3U permanece ativo.
            }
        }
    }

    private void appendXtreamItems(List<PlaylistEntry> output, JSONObject response,
                                   boolean series, String base, String username, String password) {
        JSONArray items = response.optJSONArray("items");
        if (items == null) items = response.optJSONArray(series ? "series" : "movies");
        if (items == null) return;
        for (int i = 0; i < items.length() && output.size() < MAX_PLAYLIST_ENTRIES; i++) {
            JSONObject item = items.optJSONObject(i);
            if (item == null) continue;
            String id = item.optString(series ? "series_id" : "stream_id", "");
            if (TextUtils.isEmpty(id)) id = item.optString("id", "");
            String title = firstNonEmpty(item.optString("name", ""),
                    item.optString("title", ""), "Sem título");
            String group = firstNonEmpty(item.optString("category_name", ""),
                    series ? "Séries" : "Filmes");
            String logo = firstNonEmpty(item.optString(series ? "cover" : "stream_icon", ""),
                    item.optString("cover_big", ""), item.optString("cover", ""));
            if (!TextUtils.isEmpty(logo) && logo.startsWith("/")) logo = base + logo;
            String synopsis = firstNonEmpty(item.optString("plot", ""),
                    item.optString("description", ""), item.optString("backdrop_path", ""));
            String extension = firstNonEmpty(item.optString("container_extension", "mp4"), "mp4");
            String path = series ? "/series/" : "/movie/";
            String playable = base + path + username + "/" + password + "/" + id + "." + extension;
            output.add(new PlaylistEntry(title, group, logo, item.optString("stream_id", id),
                    synopsis, playable));
        }
    }

    private void mergeCatalog(List<PlaylistEntry> catalog) {
        List<PlaylistEntry> merged = new ArrayList<>(playlistEntries);
        Map<String, Integer> indexes = new HashMap<>();
        for (int i = 0; i < merged.size(); i++) {
            PlaylistEntry entry = merged.get(i);
            indexes.put(normalizeClassifier(entry.title + "|" + entry.group), i);
        }
        for (PlaylistEntry entry : catalog) {
            String key = normalizeClassifier(entry.title + "|" + entry.group);
            Integer existingIndex = indexes.get(key);
            if (existingIndex != null) {
                PlaylistEntry existing = merged.get(existingIndex);
                if (TextUtils.isEmpty(existing.logoUrl) && !TextUtils.isEmpty(entry.logoUrl)) {
                    merged.set(existingIndex, entry);
                }
            } else if (merged.size() < MAX_PLAYLIST_ENTRIES) {
                indexes.put(key, merged.size());
                merged.add(entry);
            }
        }
        playlistEntries = merged;
        playlistStatus = merged.size() + " itens do catálogo carregados";
        mainHandler.post(() -> {
            if (!destroyed && homeShown) showHome();
        });
    }

    private JSONObject getJsonAt(String address) throws IOException {
        HttpURLConnection connection = null;
        try {
            connection = (HttpURLConnection) new URL(address).openConnection();
            connection.setConnectTimeout(CONNECT_TIMEOUT_MS);
            connection.setReadTimeout(READ_TIMEOUT_MS);
            connection.setUseCaches(false);
            connection.setInstanceFollowRedirects(true);
            connection.setRequestProperty("Accept", "application/json");
            connection.setRequestProperty("User-Agent", "NEXUS/" + INSTALLED_VERSION);
            int code = connection.getResponseCode();
            String body = readBody(code >= 200 && code < 300
                    ? connection.getInputStream() : connection.getErrorStream());
            if (code < 200 || code >= 300) throw new IOException("HTTP " + code);
            String trimmed = body == null ? "" : body.trim();
            if (trimmed.startsWith("[")) {
                try {
                    return new JSONObject().put("items", new JSONArray(trimmed));
                } catch (JSONException error) {
                    throw new IOException("Catálogo Xtream inválido", error);
                }
            }
            return parseJson(body);
        } finally {
            if (connection != null) connection.disconnect();
        }
    }

    private String queryParam(String query, String name) {
        if (query == null) return "";
        for (String part : query.split("&")) {
            int eq = part.indexOf('=');
            if (eq > 0 && name.equalsIgnoreCase(part.substring(0, eq))) return part.substring(eq + 1);
        }
        return "";
    }

    private PlaylistParseResult downloadAndParseM3u(String rawUrl) throws IOException {
        HttpURLConnection connection = null;
        try {
            connection = (HttpURLConnection) new URL(rawUrl).openConnection();
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(CONNECT_TIMEOUT_MS);
            connection.setReadTimeout(READ_TIMEOUT_MS);
            connection.setUseCaches(false);
            connection.setInstanceFollowRedirects(true);
            connection.setRequestProperty("Accept", "audio/x-mpegurl, application/vnd.apple.mpegurl, text/plain");
            connection.setRequestProperty("User-Agent", "NEXUS/" + INSTALLED_VERSION);
            connection.setRequestProperty("Icy-MetaData", "0");
            int code = connection.getResponseCode();
            if (code < 200 || code >= 300) {
                throw new IOException("HTTP " + code);
            }
            LimitedInputStream limited = new LimitedInputStream(
                    new BufferedInputStream(connection.getInputStream()), MAX_PLAYLIST_BYTES);
            try (InputStream source = limited) {
                PlaylistParseResult parsed = parseM3u(source);
                return new PlaylistParseResult(parsed.entries,
                        parsed.truncated || limited.isLimitReached());
            }
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
    }

    private PlaylistParseResult parseM3u(InputStream input) throws IOException {
        List<PlaylistEntry> result = new ArrayList<>();
        String pendingTitle = "";
        String pendingGroup = "";
        String pendingLogo = "";
        String pendingTvgId = "";
        String pendingSynopsis = "";
        boolean firstContentSeen = false;
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(input, StandardCharsets.UTF_8), 16 * 1024)) {
            String rawLine;
            while ((rawLine = reader.readLine()) != null) {
                String line = rawLine.trim();
                if (line.isEmpty()) {
                    continue;
                }
                if (!firstContentSeen) {
                    firstContentSeen = true;
                    if (line.startsWith("#EXTM3U")) {
                        String epg = attribute(line, "url-tvg");
                        if (TextUtils.isEmpty(epg)) epg = attribute(line, "x-tvg-url");
                        if (!TextUtils.isEmpty(epg)) playlistEpgUrl = epg;
                    }
                    String lower = line.toLowerCase(Locale.US);
                    if (lower.startsWith("<html") || lower.startsWith("<!doctype")
                            || lower.contains("<html")) {
                        throw new IOException("servidor retornou HTML");
                    }
                }
                if (line.startsWith("#EXTINF:")) {
                    int comma = line.indexOf(',');
                    pendingTitle = comma >= 0 && comma + 1 < line.length()
                            ? line.substring(comma + 1).trim() : "Sem título";
                    pendingGroup = attribute(line, "group-title");
                    pendingLogo = attribute(line, "tvg-logo");
                    if (TextUtils.isEmpty(pendingLogo)) pendingLogo = attribute(line, "logo");
                    pendingTvgId = attribute(line, "tvg-id");
                    pendingSynopsis = firstNonEmpty(attribute(line, "description"),
                            attribute(line, "plot"), attribute(line, "synopsis"),
                            attribute(line, "desc"));
                } else if (!line.startsWith("#") && !TextUtils.isEmpty(pendingTitle)) {
                    result.add(new PlaylistEntry(pendingTitle, pendingGroup, pendingLogo,
                            pendingTvgId, pendingSynopsis, line));
                    pendingTitle = "";
                    pendingGroup = "";
                    pendingLogo = "";
                    pendingTvgId = "";
                    pendingSynopsis = "";
                    if (result.size() >= MAX_PLAYLIST_ENTRIES) {
                        return new PlaylistParseResult(result, true);
                    }
                }
            }
        }
        return new PlaylistParseResult(result, false);
    }

    private String attribute(String line, String name) {
        String prefix = name + "=\"";
        int start = line.indexOf(prefix);
        char quote = '\"';
        if (start < 0) {
            prefix = name + "='";
            start = line.indexOf(prefix);
            quote = '\'';
        }
        if (start < 0) return "";
        start += prefix.length();
        int end = line.indexOf(quote, start);
        return end > start ? line.substring(start, end) : "";
    }

    private String xmlTag(String body, String tag) {
        Matcher matcher = Pattern.compile("(?is)<" + tag + "(?:\\s[^>]*)?>(.*?)</" + tag + ">")
                .matcher(body);
        return matcher.find() ? cleanXml(matcher.group(1)) : "";
    }

    private String cleanXml(String value) {
        return value.replaceAll("<[^>]+>", "").replace("&amp;", "&")
                .replace("&quot;", "\\\"").replace("&apos;", "'").trim();
    }

    private String normalizeKey(String value) {
        if (TextUtils.isEmpty(value)) return "";
        return value.toLowerCase(Locale.US).replaceAll("[^a-z0-9]+", "");
    }

    private String formatXmltvTime(String value) {
        if (value.length() >= 12) {
            return value.substring(8, 10) + "/" + value.substring(6, 8) + " "
                    + value.substring(0, 2) + ":" + value.substring(2, 4);
        }
        return value;
    }

    private String firstNonEmpty(String... values) {
        for (String value : values) if (!TextUtils.isEmpty(value)) return value;
        return "";
    }

    private void sendHeartbeat() {
        try {
            String path = "/api/v5/heartbeat?mac=" + encoded(mac);
            if (!TextUtils.isEmpty(lastConfig.currentContent)) {
                path += "&current_content=" + encoded(lastConfig.currentContent);
            }
            getJson(path);
        } catch (IOException ignored) {
            // A próxima sincronização tentará novamente sem interromper a interface.
        }
    }

    private void readNotifications() {
        try {
            JSONObject response = getJson("/api/v5/list-notifications?mac=" + encoded(mac));
            JSONObject expiration = response.optJSONObject("expiration");
            if (expiration != null && expiration.optBoolean("show_modal", false)) {
                String modalKey = expiration.optString("modal_key", "");
                if (shouldShowOnce(modalKey)) {
                    showPanelMessage(
                            expiration.optString("modal_title", "Aviso"),
                            expiration.optString("modal_message", "Atenção à validade do acesso."));
                }
            }

            JSONArray notifications = response.optJSONArray("notifications");
            if (notifications == null) {
                return;
            }
            for (int index = 0; index < notifications.length(); index++) {
                JSONObject notification = notifications.optJSONObject(index);
                if (notification == null) {
                    continue;
                }
                int alertId = notification.optInt("id", 0);
                String title = notification.optString("title", "Aviso");
                String message = notification.optString("message", "");
                if (!TextUtils.isEmpty(message)) {
                    showPanelMessage(title, message);
                }
                if (alertId > 0) {
                    JSONObject ack = new JSONObject();
                    ack.put("mac", mac);
                    ack.put("alert_id", alertId);
                    postJson("/api/v5/list-notifications/ack", ack);
                }
            }
        } catch (Exception ignored) {
            // Avisos são reapresentados no próximo ciclo se o painel não responder.
        }
    }

    private void readRemoteCommands() {
        try {
            JSONObject response = getJson("/api/v5/remote-commands?mac=" + encoded(mac));
            JSONArray commands = response.optJSONArray("commands");
            if (commands == null) {
                commands = response.optJSONArray("data");
            }
            if (commands == null && response.has("command_id")) {
                commands = new JSONArray();
                commands.put(response);
            }
            if (commands == null) {
                return;
            }

            for (int index = 0; index < commands.length(); index++) {
                JSONObject command = commands.optJSONObject(index);
                if (command != null) {
                    executeRemoteCommand(command);
                }
            }
        } catch (Exception ignored) {
            // O comando permanece no painel para nova tentativa no próximo ciclo.
        }
    }

    private void executeRemoteCommand(JSONObject command) throws JSONException, IOException {
        int commandId = command.optInt("command_id", command.optInt("id", 0));
        String name = command.optString("command", command.optString("type", ""));
        JSONObject payload = command.optJSONObject("payload");
        if (payload == null) {
            payload = new JSONObject();
        }

        boolean executed = false;
        String resultMessage;
        if ("show_message".equals(name)) {
            String message = payload.optString("message", command.optString("message", ""));
            if (!TextUtils.isEmpty(message)) {
                showPanelMessage("Aviso", message);
            }
            executed = true;
            resultMessage = "Mensagem exibida";
        } else if ("sync_access".equals(name)) {
            executed = true;
            resultMessage = "Acesso sincronizado";
        } else {
            /*
             * Os comandos de playlist/player são reconhecidos, mas só podem ser
             * executados quando o módulo de reprodução for integrado.
             */
            resultMessage = "Módulo de reprodução ainda não integrado";
        }

        if (commandId > 0) {
            JSONObject ack = new JSONObject();
            ack.put("mac", mac);
            ack.put("command_id", commandId);
            ack.put("status", executed ? "executed" : "failed");
            ack.put("result_message", resultMessage);
            postJson("/api/v5/remote-commands/ack", ack);
        }
    }

    private void checkForUpdate() {
        String appId = TextUtils.isEmpty(lastConfig.appId) ? PANEL_APP_ID : lastConfig.appId;
        try {
            JSONObject response;
            if ("ouropro".equals(appId)) {
                try {
                    response = getJson("/api/v4/update.php");
                } catch (IOException legacyFailure) {
                    response = getJson("/api/update.php");
                }
            } else {
                response = getJson("/api/v5/apps/" + appId + "/update?mac=" + encoded(mac));
            }
            boolean available = response.optBoolean("update_available", false);
            String remoteVersion = response.optString(
                    "version", response.optString("latest_version", ""));
            if (available && !TextUtils.isEmpty(remoteVersion)
                    && !remoteVersion.equals(INSTALLED_VERSION)) {
                updateStatus("Atualização disponível: " + remoteVersion);
            }
        } catch (IOException ignored) {
            // Atualizações são consultadas novamente no próximo ciclo.
        }
    }

    /** Deve ser chamado pelo player quando houver uma falha real de reprodução. */
    private void reportPlaybackFailure(int activeListNumber) {
        networkExecutor.execute(() -> {
            try {
                JSONObject body = new JSONObject();
                body.put("mac", mac);
                body.put("active_list_number", activeListNumber);
                JSONObject result = postJson("/api/v5/playback-failure", body);
                if (result.optBoolean("switch_applied", false)) {
                    loadPanelConfig();
                }
            } catch (Exception ignored) {
                // A falha é reportada novamente somente em uma nova falha real.
            }
        });
    }

    private boolean shouldShowOnce(String modalKey) {
        if (TextUtils.isEmpty(modalKey)) {
            return true;
        }
        String key = "shown_modal_" + modalKey;
        boolean alreadyShown = getSharedPreferences("panel_notifications", MODE_PRIVATE)
                .getBoolean(key, false);
        if (!alreadyShown) {
            getSharedPreferences("panel_notifications", MODE_PRIVATE)
                    .edit().putBoolean(key, true).apply();
        }
        return !alreadyShown;
    }

    private JSONObject getJson(String path) throws IOException {
        HttpURLConnection connection = null;
        try {
            connection = openConnection(path, "GET");
            int code = connection.getResponseCode();
            String body = readBody(code >= 200 && code < 300
                    ? connection.getInputStream() : connection.getErrorStream());
            if (code < 200 || code >= 300) {
                throw new IOException("HTTP " + code);
            }
            return parseJson(body);
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
    }

    private JSONObject postJson(String path, JSONObject payload) throws IOException {
        HttpURLConnection connection = null;
        try {
            connection = openConnection(path, "POST");
            connection.setDoOutput(true);
            connection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
            byte[] bytes = payload.toString().getBytes(StandardCharsets.UTF_8);
            connection.setFixedLengthStreamingMode(bytes.length);
            try (OutputStream output = connection.getOutputStream()) {
                output.write(bytes);
            }
            int code = connection.getResponseCode();
            String body = readBody(code >= 200 && code < 300
                    ? connection.getInputStream() : connection.getErrorStream());
            if (code < 200 || code >= 300) {
                throw new IOException("HTTP " + code);
            }
            return parseJson(body);
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
    }

    private HttpURLConnection openConnection(String path, String method) throws IOException {
        URL url = new URL(PANEL_BASE_URL + path);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod(method);
        connection.setConnectTimeout(CONNECT_TIMEOUT_MS);
        connection.setReadTimeout(READ_TIMEOUT_MS);
        connection.setUseCaches(false);
        connection.setRequestProperty("Accept", "application/json");
        connection.setRequestProperty("User-Agent", "NEXUS/" + INSTALLED_VERSION);
        return connection;
    }

    private JSONObject parseJson(String body) throws IOException {
        if (TextUtils.isEmpty(body)) {
            return new JSONObject();
        }
        try {
            return new JSONObject(body);
        } catch (JSONException error) {
            throw new IOException("Resposta do painel não é JSON", error);
        }
    }

    private String readBody(InputStream input) throws IOException {
        if (input == null) {
            return "";
        }
        try (InputStream stream = new BufferedInputStream(input);
             ByteArrayOutputStream output = new ByteArrayOutputStream(8192)) {
            byte[] buffer = new byte[4096];
            int read;
            int total = 0;
            while ((read = stream.read(buffer)) != -1) {
                total += read;
                if (total > MAX_JSON_BYTES) {
                    throw new IOException("Resposta JSON excede o limite seguro");
                }
                output.write(buffer, 0, read);
            }
            return new String(output.toByteArray(), StandardCharsets.UTF_8);
        }
    }

    private String encoded(String value) {
        try {
            return URLEncoder.encode(value, "UTF-8");
        } catch (Exception error) {
            return value;
        }
    }

    private static String normalizeAppId(String value) {
        if (TextUtils.isEmpty(value)) {
            return "";
        }
        String normalized = value.toLowerCase(Locale.US).trim();
        normalized = normalized.replace("á", "a").replace("ã", "a")
                .replace("â", "a").replace("é", "e").replace("ê", "e")
                .replace("í", "i").replace("ó", "o").replace("ô", "o")
                .replace("ú", "u").replace("ç", "c");
        normalized = normalized.replaceAll("[^a-z0-9]+", "");
        if ("ouropro".equals(normalized)) return "ouropro";
        if ("fusion".equals(normalized) || "ultra".equals(normalized)) return "fusion";
        if ("maximusplayer".equals(normalized)) return "maximus";
        if ("imperioplay".equals(normalized)) return "imperio";
        return normalized;
    }

    private void updateConfigUi(PanelConfig config) {
        String text;
        if (config.hasAccess && !config.allowed) {
            text = "Acesso indisponível";
        } else if (config.hasAccess && config.allowed) {
            String sourceText = config.sourceCount == 1
                    ? "1 fonte recebida" : config.sourceCount + " fontes recebidas";
            text = "Painel conectado · " + config.appName + " · " + sourceText;
        } else {
            text = "Painel consultado";
        }
        updateStatus(text);
        mainHandler.post(() -> {
            if (appTitleView != null && !TextUtils.isEmpty(config.appName)) {
                appTitleView.setText(config.appName);
            }
        });
    }

    private void updateStatus(String value) {
        mainHandler.post(() -> {
            if (statusView != null) {
                statusView.setText(value);
            }
        });
    }

    private void showPanelMessage(String title, String message) {
        if (TextUtils.isEmpty(message)) {
            return;
        }
        mainHandler.post(() -> {
            if (statusView != null) {
                statusView.setText(title + ": " + message);
            }
            Toast.makeText(this, message, Toast.LENGTH_LONG).show();
        });
    }

    private String displayAppName() {
        return TextUtils.isEmpty(lastConfig.appName) ? "NEXUS" : lastConfig.appName;
    }

    private String statusText() {
        if (lastConfig.hasAccess && !lastConfig.allowed) {
            return "Acesso indisponível";
        }
        if (lastConfig.hasAccess && lastConfig.allowed) {
            return "Sincronização ativa · " + lastConfig.sourceCount + " fontes";
        }
        return "Sincronização universal ativa";
    }

    private FrameLayout baseRoot() {
        FrameLayout root = new FrameLayout(this);
        root.setBackgroundColor(BG);
        return root;
    }

    private boolean useZoneXVisual() {
        return "18:F4:33:A9:19:47".equalsIgnoreCase(mac);
    }

    private ImageView backgroundImage() {
        ImageView image = new ImageView(this);
        image.setImageResource(useZoneXVisual()
                ? R.drawable.zonex_background : R.drawable.login_bg);
        image.setScaleType(ImageView.ScaleType.CENTER_CROP);
        image.setAlpha(useZoneXVisual() ? 0.78f : 0.92f);
        return image;
    }

    private Button actionButton(String label, int color) {
        Button button = new Button(this);
        button.setText(label);
        button.setTextColor(Color.WHITE);
        button.setTextSize(14);
        button.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        button.setGravity(Gravity.CENTER);
        button.setAllCaps(false);
        button.setBackground(round(color, dp(10)));
        button.setMinHeight(dp(48));
        button.setPadding(dp(26), 0, dp(26), 0);
        return button;
    }

    private TextView text(String value, int size, int color, boolean bold) {
        TextView view = new TextView(this);
        view.setText(value);
        view.setTextColor(color);
        view.setTextSize(size);
        view.setTypeface(Typeface.DEFAULT, bold ? Typeface.BOLD : Typeface.NORMAL);
        return view;
    }

    private GradientDrawable round(int color, int radius) {
        GradientDrawable drawable = new GradientDrawable();
        drawable.setColor(color);
        drawable.setCornerRadius(radius);
        return drawable;
    }

    private FrameLayout.LayoutParams matchParams() {
        return new FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.MATCH_PARENT);
    }

    private LinearLayout.LayoutParams centeredWrap() {
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        params.gravity = Gravity.CENTER_HORIZONTAL;
        return params;
    }

    private int dp(int value) {
        return Math.round(value * getResources().getDisplayMetrics().density);
    }

    private static final class FillVideoView extends VideoView {
        private int videoWidth;
        private int videoHeight;

        public FillVideoView(Context context) {
            super(context);
        }

        public void setVideoSize(int width, int height) {
            videoWidth = width;
            videoHeight = height;
            requestLayout();
        }

        @Override
        protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
            int parentWidth = MeasureSpec.getSize(widthMeasureSpec);
            int parentHeight = MeasureSpec.getSize(heightMeasureSpec);
            if (parentWidth > 0 && parentHeight > 0 && videoWidth > 0 && videoHeight > 0) {
                float scale = Math.max((float) parentWidth / videoWidth,
                        (float) parentHeight / videoHeight);
                setMeasuredDimension(Math.round(videoWidth * scale),
                        Math.round(videoHeight * scale));
            } else {
                setMeasuredDimension(parentWidth, parentHeight);
            }
        }
    }

    private static final class PlaylistParseResult {
        private final List<PlaylistEntry> entries;
        private final boolean truncated;

        private PlaylistParseResult(List<PlaylistEntry> entries, boolean truncated) {
            this.entries = entries;
            this.truncated = truncated;
        }
    }

    private static final class LimitedInputStream extends InputStream {
        private final InputStream delegate;
        private long remaining;
        private boolean limitReached;

        private LimitedInputStream(InputStream delegate, long limit) {
            this.delegate = delegate;
            this.remaining = limit;
        }

        @Override
        public int read() throws IOException {
            if (remaining <= 0) {
                limitReached = true;
                return -1;
            }
            int value = delegate.read();
            if (value >= 0) {
                remaining--;
            }
            return value;
        }

        @Override
        public int read(byte[] buffer, int offset, int length) throws IOException {
            if (remaining <= 0) {
                limitReached = true;
                return -1;
            }
            int allowed = (int) Math.min((long) length, remaining);
            int count = delegate.read(buffer, offset, allowed);
            if (count > 0) {
                remaining -= count;
            }
            return count;
        }

        private boolean isLimitReached() {
            return limitReached;
        }

        @Override
        public void close() throws IOException {
            delegate.close();
        }
    }

    private static final class PlaylistEntry {
        private final String title;
        private final String group;
        private final String logoUrl;
        private final String tvgId;
        private final String synopsis;
        private final String url;

        private PlaylistEntry(String title, String group, String logoUrl, String tvgId,
                              String synopsis, String url) {
            this.title = title;
            this.group = group;
            this.logoUrl = logoUrl;
            this.tvgId = tvgId;
            this.synopsis = synopsis;
            this.url = url;
        }
    }

    @Override
    public void onBackPressed() {
        if (!"Início".equals(currentScreen)) {
            showHome();
            return;
        }
        super.onBackPressed();
    }

    private static final class PanelConfig {
        private final boolean hasAccess;
        private final boolean allowed;
        private final String appName;
        private final String appId;
        private final String currentContent;
        private final List<String> playlistUrls;
        private final int sourceCount;

        private PanelConfig(boolean hasAccess, boolean allowed, String appName, String appId,
                            String currentContent, List<String> playlistUrls, int sourceCount) {
            this.hasAccess = hasAccess;
            this.allowed = allowed;
            this.appName = appName;
            this.appId = appId;
            this.currentContent = currentContent;
            this.playlistUrls = playlistUrls;
            this.sourceCount = sourceCount;
        }

        private static PanelConfig empty() {
            return new PanelConfig(false, false, "NEXUS", "nexus", "",
                    Collections.emptyList(), 0);
        }

        private static PanelConfig fromJson(JSONObject object) {
            boolean hasAccess = object.has("allowed") || object.has("found")
                    || object.has("registered") || object.has("status");
            boolean allowed = object.has("allowed")
                    ? object.optBoolean("allowed", false)
                    : object.optBoolean("found", false);
            String appName = object.optString("app_name",
                    object.optString("app", "NEXUS"));
            String appId = normalizeAppId(object.optString("app_id", appName));
            String currentContent = object.optString("current_content", "");
            List<String> playlistUrls = new ArrayList<>();
            JSONArray urls = object.optJSONArray("playlist_urls");
            if (urls != null) {
                for (int index = 0; index < urls.length(); index++) {
                    String value = urls.optString(index, "");
                    if (!TextUtils.isEmpty(value)) {
                        playlistUrls.add(value);
                    }
                }
            }
            String singleUrl = object.optString("urlM3u8", "");
            if (!TextUtils.isEmpty(singleUrl) && !playlistUrls.contains(singleUrl)) {
                playlistUrls.add(singleUrl);
            }
            return new PanelConfig(hasAccess, allowed, appName, appId, currentContent,
                    playlistUrls, playlistUrls.size());
        }

        private static PanelConfig fromBasicJson(JSONObject object) {
            return fromJson(object);
        }

        private PanelConfig withAppId(String value) {
            return new PanelConfig(hasAccess, allowed, appName, value, currentContent,
                    playlistUrls, sourceCount);
        }

        private PanelConfig withCurrentContent(String value) {
            return new PanelConfig(hasAccess, allowed, appName, appId, value,
                    playlistUrls, sourceCount);
        }

        private PanelConfig withGuimSources(JSONObject object) {
            JSONArray data = object.optJSONArray("data");
            if (data == null || data.length() == 0) {
                return this.withAppId("ouropro");
            }
            List<String> sources = new ArrayList<>();
            for (int index = 0; index < data.length(); index++) {
                JSONObject source = data.optJSONObject(index);
                if (source == null) {
                    continue;
                }
                String url = source.optString("url", "");
                String username = source.optString("username", "");
                String password = source.optString("password", "");
                if (!TextUtils.isEmpty(url) && !TextUtils.isEmpty(username)
                        && !TextUtils.isEmpty(password) && !url.contains("username=")) {
                    String separator = url.contains("?") ? "&" : "?";
                    url = url + separator + "username=" + safeEncode(username)
                            + "&password=" + safeEncode(password)
                            + "&type=m3u_plus&output=mpegts";
                }
                if (!TextUtils.isEmpty(url)) {
                    sources.add(url);
                }
            }
            return new PanelConfig(hasAccess, allowed, appName, "ouropro", currentContent,
                    sources, sources.size());
        }

        private static String safeEncode(String value) {
            try {
                return URLEncoder.encode(value, "UTF-8");
            } catch (Exception error) {
                return value;
            }
        }
    }

    private static final class DeviceIdentity {
        private static final String PREFS = "nexus_clean_identity";
        private static final String FALLBACK = "fallback";

        private static String getMac(Context context) {
            String androidId = Settings.Secure.getString(
                    context.getContentResolver(), Settings.Secure.ANDROID_ID);
            if (TextUtils.isEmpty(androidId)) {
                androidId = context.getSharedPreferences(PREFS, Context.MODE_PRIVATE)
                        .getString(FALLBACK, null);
                if (TextUtils.isEmpty(androidId)) {
                    androidId = UUID.randomUUID().toString();
                    context.getSharedPreferences(PREFS, Context.MODE_PRIVATE)
                            .edit().putString(FALLBACK, androidId).apply();
                }
            }
            String source = context.getPackageName() + ":" + androidId;
            try {
                byte[] digest = MessageDigest.getInstance("SHA-256")
                        .digest(source.getBytes(StandardCharsets.UTF_8));
                StringBuilder hex = new StringBuilder();
                for (byte item : digest) {
                    hex.append(String.format(Locale.US, "%02X", item & 0xff));
                }
                String compact = hex.substring(0, 12);
                return compact.substring(0, 2) + ":" + compact.substring(2, 4) + ":"
                        + compact.substring(4, 6) + ":" + compact.substring(6, 8) + ":"
                        + compact.substring(8, 10) + ":" + compact.substring(10, 12);
            } catch (Exception exception) {
                throw new IllegalStateException("Não foi possível criar a identidade do aparelho", exception);
            }
        }
    }
}
