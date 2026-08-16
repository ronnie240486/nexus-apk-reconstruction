package cn.dolit.nexus;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Locale;
import java.util.UUID;

public class MainActivity extends Activity {

    private static final int BG = Color.rgb(8, 12, 35);
    private static final int PANEL = Color.argb(220, 7, 12, 35);
    private String mac;

    @Override
    protected void onCreate(Bundle state) {
        super.onCreate(state);
        getWindow().setStatusBarColor(Color.BLACK);
        getWindow().setNavigationBarColor(Color.BLACK);
        mac = DeviceIdentity.getMac(this);
        showIdentity();
    }

    private void showIdentity() {
        FrameLayout root = baseRoot();
        ImageView background = backgroundImage();
        root.addView(background, matchParams());

        LinearLayout panel = new LinearLayout(this);
        panel.setOrientation(LinearLayout.VERTICAL);
        panel.setGravity(Gravity.CENTER_HORIZONTAL);
        panel.setPadding(dp(36), dp(24), dp(36), dp(24));
        panel.setBackground(round(PANEL, dp(18)));

        ImageView logo = new ImageView(this);
        logo.setImageResource(R.drawable.top_login_logo);
        logo.setAdjustViewBounds(true);
        panel.addView(logo, new LinearLayout.LayoutParams(dp(347), dp(93)));

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
        FrameLayout root = baseRoot();
        ImageView background = backgroundImage();
        root.addView(background, matchParams());

        LinearLayout content = new LinearLayout(this);
        content.setOrientation(LinearLayout.VERTICAL);
        content.setPadding(dp(38), dp(24), dp(38), dp(24));

        LinearLayout top = new LinearLayout(this);
        top.setGravity(Gravity.CENTER_VERTICAL);
        ImageView logo = new ImageView(this);
        logo.setImageResource(R.drawable.top_login_logo);
        logo.setAdjustViewBounds(true);
        top.addView(logo, new LinearLayout.LayoutParams(dp(230), dp(62)));

        TextView device = text("MAC  " + mac, 14, Color.WHITE, true);
        device.setGravity(Gravity.CENTER_VERTICAL | Gravity.RIGHT);
        LinearLayout.LayoutParams deviceParams = new LinearLayout.LayoutParams(0, dp(52), 1f);
        top.addView(device, deviceParams);
        content.addView(top, new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, dp(68)));

        TextView welcome = text("NEXUS", 28, Color.WHITE, true);
        welcome.setGravity(Gravity.CENTER_VERTICAL);
        content.addView(welcome, new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, dp(54)));

        ScrollView scroll = new ScrollView(this);
        GridLayout menu = new GridLayout(this);
        menu.setColumnCount(3);
        menu.setUseDefaultMargins(false);
        addTile(menu, R.drawable.menu_tvlist, "Canais");
        addTile(menu, R.drawable.menu_sour, "Filmes");
        addTile(menu, R.drawable.menu_subtitl, "Séries");
        addTile(menu, R.drawable.menu_fav, "Favoritos");
        addTile(menu, R.drawable.ic_home_search, "Pesquisar");
        addTile(menu, R.drawable.ic_settings, "Configurações");
        scroll.addView(menu, new ScrollView.LayoutParams(
                ScrollView.LayoutParams.MATCH_PARENT, ScrollView.LayoutParams.WRAP_CONTENT));
        content.addView(scroll, new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, 0, 1f));

        root.addView(content, matchParams());
        setContentView(root);
    }

    private void addTile(GridLayout menu, int icon, String label) {
        LinearLayout tile = new LinearLayout(this);
        tile.setOrientation(LinearLayout.VERTICAL);
        tile.setGravity(Gravity.CENTER);
        tile.setFocusable(true);
        tile.setClickable(true);
        tile.setBackground(round(Color.argb(190, 17, 27, 60), dp(12)));
        tile.setOnClickListener(view -> Toast.makeText(this, label + " em preparação", Toast.LENGTH_SHORT).show());

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

    private void copyMac() {
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        if (clipboard != null) {
            clipboard.setPrimaryClip(ClipData.newPlainText("MAC do aparelho", mac));
            Toast.makeText(this, "MAC copiado", Toast.LENGTH_SHORT).show();
        }
    }

    private FrameLayout baseRoot() {
        FrameLayout root = new FrameLayout(this);
        root.setBackgroundColor(BG);
        return root;
    }

    private ImageView backgroundImage() {
        ImageView image = new ImageView(this);
        image.setImageResource(R.drawable.login_bg);
        image.setScaleType(ImageView.ScaleType.CENTER_CROP);
        image.setAlpha(0.92f);
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
