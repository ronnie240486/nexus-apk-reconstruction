package androidx.core.content.p002pm;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.util.Preconditions;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p000.C0420GR;
import p000.C0484HR;
import p000.C0547IR;
import p000.C0610JR;
import p000.C0675KR;
import p000.C0803MR;
import p000.C0866NR;
import p000.C0930OR;
import p000.C0996PR;
import p000.C1061QR;
import p000.C1123RR;
import p000.C1186SR;
import p000.C1251TR;
import p000.C1315UR;
import p000.C1383VR;
import p000.C1447WR;
import p000.C1510XR;
import p000.C1573YR;
import p000.C1640ZQ;
import p000.C1641ZR;
import p000.C1708aS;
import p000.C2975bS;
import p000.C3038cS;
import p000.C4222dS;
import p000.C5827z3;

/* JADX INFO: loaded from: classes.dex */
public class ShortcutManagerCompat {

    @VisibleForTesting
    static final String ACTION_INSTALL_SHORTCUT = "com.android.launcher.action.INSTALL_SHORTCUT";
    private static final int DEFAULT_MAX_ICON_DIMENSION_DP = 96;
    private static final int DEFAULT_MAX_ICON_DIMENSION_LOWRAM_DP = 48;
    public static final String EXTRA_SHORTCUT_ID = "android.intent.extra.shortcut.ID";
    public static final int FLAG_MATCH_CACHED = 8;
    public static final int FLAG_MATCH_DYNAMIC = 2;
    public static final int FLAG_MATCH_MANIFEST = 1;
    public static final int FLAG_MATCH_PINNED = 4;

    @VisibleForTesting
    static final String INSTALL_SHORTCUT_PERMISSION = "com.android.launcher.permission.INSTALL_SHORTCUT";
    private static volatile ShortcutInfoCompatSaver<?> sShortcutInfoCompatSaver;

    @RequiresApi(25)
    public static class Api25Impl {
        private Api25Impl() {
        }

        public static String getShortcutInfoWithLowestRank(@NonNull List<ShortcutInfo> list) {
            int rank = -1;
            String id = null;
            for (ShortcutInfo shortcutInfo : list) {
                if (shortcutInfo.getRank() > rank) {
                    id = shortcutInfo.getId();
                    rank = shortcutInfo.getRank();
                }
            }
            return id;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface ShortcutMatchFlags {
    }

    private ShortcutManagerCompat() {
    }

    public static boolean addDynamicShortcuts(@NonNull Context context, @NonNull List<ShortcutInfoCompat> list) {
        int i = Build.VERSION.SDK_INT;
        if (i <= 29) {
            convertUriIconsToBitmapIcons(context, list);
        }
        if (i >= 25) {
            ArrayList arrayList = new ArrayList();
            Iterator<ShortcutInfoCompat> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().toShortcutInfo());
            }
            if (!C2975bS.m14642a(C1186SR.m5482a(C5827z3.m29927a(context, C0420GR.m2060a())), arrayList)) {
                return false;
            }
        }
        getShortcutInfoSaverInstance(context).addShortcuts(list);
        return true;
    }

    @VisibleForTesting
    public static boolean convertUriIconToBitmapIcon(@NonNull Context context, @NonNull ShortcutInfoCompat shortcutInfoCompat) {
        Bitmap bitmapDecodeStream;
        IconCompat iconCompat = shortcutInfoCompat.mIcon;
        if (iconCompat == null) {
            return false;
        }
        int i = iconCompat.mType;
        if (i != 6 && i != 4) {
            return true;
        }
        InputStream uriInputStream = iconCompat.getUriInputStream(context);
        if (uriInputStream == null || (bitmapDecodeStream = BitmapFactory.decodeStream(uriInputStream)) == null) {
            return false;
        }
        shortcutInfoCompat.mIcon = i == 6 ? IconCompat.createWithAdaptiveBitmap(bitmapDecodeStream) : IconCompat.createWithBitmap(bitmapDecodeStream);
        return true;
    }

    @VisibleForTesting
    public static void convertUriIconsToBitmapIcons(@NonNull Context context, @NonNull List<ShortcutInfoCompat> list) {
        for (ShortcutInfoCompat shortcutInfoCompat : new ArrayList(list)) {
            if (!convertUriIconToBitmapIcon(context, shortcutInfoCompat)) {
                list.remove(shortcutInfoCompat);
            }
        }
    }

    @NonNull
    public static Intent createShortcutResultIntent(@NonNull Context context, @NonNull ShortcutInfoCompat shortcutInfoCompat) {
        Intent intentM7079a = Build.VERSION.SDK_INT >= 26 ? C1510XR.m7079a(C1186SR.m5482a(C5827z3.m29927a(context, C0420GR.m2060a())), shortcutInfoCompat.toShortcutInfo()) : null;
        if (intentM7079a == null) {
            intentM7079a = new Intent();
        }
        return shortcutInfoCompat.addToIntent(intentM7079a);
    }

    public static void disableShortcuts(@NonNull Context context, @NonNull List<String> list, @Nullable CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 25) {
            C1061QR.m4641a(C1186SR.m5482a(C5827z3.m29927a(context, C0420GR.m2060a())), list, charSequence);
        }
        getShortcutInfoSaverInstance(context).removeShortcuts(list);
    }

    public static void enableShortcuts(@NonNull Context context, @NonNull List<ShortcutInfoCompat> list) {
        if (Build.VERSION.SDK_INT >= 25) {
            ArrayList arrayList = new ArrayList(list.size());
            Iterator<ShortcutInfoCompat> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().mId);
            }
            C1123RR.m5007a(C1186SR.m5482a(C5827z3.m29927a(context, C0420GR.m2060a())), arrayList);
        }
        getShortcutInfoSaverInstance(context).addShortcuts(list);
    }

    @NonNull
    public static List<ShortcutInfoCompat> getDynamicShortcuts(@NonNull Context context) {
        if (Build.VERSION.SDK_INT < 25) {
            try {
                return getShortcutInfoSaverInstance(context).getShortcuts();
            } catch (Exception unused) {
                return new ArrayList();
            }
        }
        List listM2314a = C0484HR.m2314a(C1186SR.m5482a(C5827z3.m29927a(context, C0420GR.m2060a())));
        ArrayList arrayList = new ArrayList(listM2314a.size());
        Iterator it = listM2314a.iterator();
        while (it.hasNext()) {
            arrayList.add(new ShortcutInfoCompat.Builder(context, C1640ZQ.m8685a(it.next())).build());
        }
        return arrayList;
    }

    private static int getIconDimensionInternal(@NonNull Context context, boolean z) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        int iMax = Math.max(1, activityManager == null || activityManager.isLowRamDevice() ? 48 : DEFAULT_MAX_ICON_DIMENSION_DP);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return (int) (iMax * ((z ? displayMetrics.xdpi : displayMetrics.ydpi) / 160.0f));
    }

    public static int getIconMaxHeight(@NonNull Context context) {
        Preconditions.checkNotNull(context);
        return Build.VERSION.SDK_INT >= 25 ? C1447WR.m6825a(C1186SR.m5482a(C5827z3.m29927a(context, C0420GR.m2060a()))) : getIconDimensionInternal(context, false);
    }

    public static int getIconMaxWidth(@NonNull Context context) {
        Preconditions.checkNotNull(context);
        return Build.VERSION.SDK_INT >= 25 ? C1641ZR.m8686a(C1186SR.m5482a(C5827z3.m29927a(context, C0420GR.m2060a()))) : getIconDimensionInternal(context, true);
    }

    public static int getMaxShortcutCountPerActivity(@NonNull Context context) {
        Preconditions.checkNotNull(context);
        if (Build.VERSION.SDK_INT >= 25) {
            return C1315UR.m6284a(C1186SR.m5482a(C5827z3.m29927a(context, C0420GR.m2060a())));
        }
        return 5;
    }

    private static String getShortcutInfoCompatWithLowestRank(@NonNull List<ShortcutInfoCompat> list) {
        int rank = -1;
        String id = null;
        for (ShortcutInfoCompat shortcutInfoCompat : list) {
            if (shortcutInfoCompat.getRank() > rank) {
                id = shortcutInfoCompat.getId();
                rank = shortcutInfoCompat.getRank();
            }
        }
        return id;
    }

    private static ShortcutInfoCompatSaver<?> getShortcutInfoSaverInstance(Context context) {
        if (sShortcutInfoCompatSaver == null) {
            if (Build.VERSION.SDK_INT >= 23) {
                try {
                    sShortcutInfoCompatSaver = (ShortcutInfoCompatSaver) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, ShortcutManagerCompat.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context);
                } catch (Exception unused) {
                }
            }
            if (sShortcutInfoCompatSaver == null) {
                sShortcutInfoCompatSaver = new ShortcutInfoCompatSaver.NoopImpl();
            }
        }
        return sShortcutInfoCompatSaver;
    }

    @NonNull
    public static List<ShortcutInfoCompat> getShortcuts(@NonNull Context context, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            return ShortcutInfoCompat.fromShortcuts(context, C0866NR.m3988a(C1186SR.m5482a(C5827z3.m29927a(context, C0420GR.m2060a())), i));
        }
        if (i2 < 25) {
            if ((i & 2) != 0) {
                try {
                    return getShortcutInfoSaverInstance(context).getShortcuts();
                } catch (Exception unused) {
                }
            }
            return Collections.emptyList();
        }
        ShortcutManager shortcutManagerM5482a = C1186SR.m5482a(C5827z3.m29927a(context, C0420GR.m2060a()));
        ArrayList arrayList = new ArrayList();
        if ((i & 1) != 0) {
            arrayList.addAll(C0930OR.m4288a(shortcutManagerM5482a));
        }
        if ((i & 2) != 0) {
            arrayList.addAll(C0484HR.m2314a(shortcutManagerM5482a));
        }
        if ((i & 4) != 0) {
            arrayList.addAll(C0996PR.m4436a(shortcutManagerM5482a));
        }
        return ShortcutInfoCompat.fromShortcuts(context, arrayList);
    }

    public static boolean isRateLimitingActive(@NonNull Context context) {
        Preconditions.checkNotNull(context);
        if (Build.VERSION.SDK_INT >= 25) {
            return C4222dS.m19919a(C1186SR.m5482a(C5827z3.m29927a(context, C0420GR.m2060a())));
        }
        return getShortcuts(context, 3).size() == getMaxShortcutCountPerActivity(context);
    }

    public static boolean isRequestPinShortcutSupported(@NonNull Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C0610JR.m2955a(C1186SR.m5482a(C5827z3.m29927a(context, C0420GR.m2060a())));
        }
        if (ContextCompat.checkSelfPermission(context, INSTALL_SHORTCUT_PERMISSION) != 0) {
            return false;
        }
        Iterator<ResolveInfo> it = context.getPackageManager().queryBroadcastReceivers(new Intent(ACTION_INSTALL_SHORTCUT), 0).iterator();
        while (it.hasNext()) {
            String str = it.next().activityInfo.permission;
            if (TextUtils.isEmpty(str) || INSTALL_SHORTCUT_PERMISSION.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean pushDynamicShortcut(@NonNull Context context, @NonNull ShortcutInfoCompat shortcutInfoCompat) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(shortcutInfoCompat);
        int maxShortcutCountPerActivity = getMaxShortcutCountPerActivity(context);
        if (maxShortcutCountPerActivity == 0) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        if (i <= 29) {
            convertUriIconToBitmapIcon(context, shortcutInfoCompat);
        }
        if (i >= 30) {
            C3038cS.m16489a(C1186SR.m5482a(C5827z3.m29927a(context, C0420GR.m2060a())), shortcutInfoCompat.toShortcutInfo());
        } else if (i >= 25) {
            ShortcutManager shortcutManagerM5482a = C1186SR.m5482a(C5827z3.m29927a(context, C0420GR.m2060a()));
            if (C4222dS.m19919a(shortcutManagerM5482a)) {
                return false;
            }
            List listM2314a = C0484HR.m2314a(shortcutManagerM5482a);
            if (listM2314a.size() >= maxShortcutCountPerActivity) {
                C1573YR.m8132a(shortcutManagerM5482a, Arrays.asList(Api25Impl.getShortcutInfoWithLowestRank(listM2314a)));
            }
            C2975bS.m14642a(shortcutManagerM5482a, Arrays.asList(shortcutInfoCompat.toShortcutInfo()));
        }
        ShortcutInfoCompatSaver<?> shortcutInfoSaverInstance = getShortcutInfoSaverInstance(context);
        try {
            List<ShortcutInfoCompat> shortcuts = shortcutInfoSaverInstance.getShortcuts();
            if (shortcuts.size() >= maxShortcutCountPerActivity) {
                shortcutInfoSaverInstance.removeShortcuts(Arrays.asList(getShortcutInfoCompatWithLowestRank(shortcuts)));
            }
            shortcutInfoSaverInstance.addShortcuts(Arrays.asList(shortcutInfoCompat));
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void removeAllDynamicShortcuts(@NonNull Context context) {
        if (Build.VERSION.SDK_INT >= 25) {
            C0803MR.m3738a(C1186SR.m5482a(C5827z3.m29927a(context, C0420GR.m2060a())));
        }
        getShortcutInfoSaverInstance(context).removeAllShortcuts();
    }

    public static void removeDynamicShortcuts(@NonNull Context context, @NonNull List<String> list) {
        if (Build.VERSION.SDK_INT >= 25) {
            C1573YR.m8132a(C1186SR.m5482a(C5827z3.m29927a(context, C0420GR.m2060a())), list);
        }
        getShortcutInfoSaverInstance(context).removeShortcuts(list);
    }

    public static void removeLongLivedShortcuts(@NonNull Context context, @NonNull List<String> list) {
        if (Build.VERSION.SDK_INT < 30) {
            removeDynamicShortcuts(context, list);
        } else {
            C1708aS.m8937a(C1186SR.m5482a(C5827z3.m29927a(context, C0420GR.m2060a())), list);
            getShortcutInfoSaverInstance(context).removeShortcuts(list);
        }
    }

    public static void reportShortcutUsed(@NonNull Context context, @NonNull String str) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(str);
        if (Build.VERSION.SDK_INT >= 25) {
            C0547IR.m2568a(C1186SR.m5482a(C5827z3.m29927a(context, C0420GR.m2060a())), str);
        }
    }

    public static boolean requestPinShortcut(@NonNull Context context, @NonNull ShortcutInfoCompat shortcutInfoCompat, @Nullable final IntentSender intentSender) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C1383VR.m6544a(C1186SR.m5482a(C5827z3.m29927a(context, C0420GR.m2060a())), shortcutInfoCompat.toShortcutInfo(), intentSender);
        }
        if (!isRequestPinShortcutSupported(context)) {
            return false;
        }
        Intent intentAddToIntent = shortcutInfoCompat.addToIntent(new Intent(ACTION_INSTALL_SHORTCUT));
        if (intentSender == null) {
            context.sendBroadcast(intentAddToIntent);
            return true;
        }
        context.sendOrderedBroadcast(intentAddToIntent, null, new BroadcastReceiver() { // from class: androidx.core.content.pm.ShortcutManagerCompat.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                try {
                    intentSender.sendIntent(context2, 0, null, null, null);
                } catch (IntentSender.SendIntentException unused) {
                }
            }
        }, null, -1, null, null);
        return true;
    }

    public static boolean setDynamicShortcuts(@NonNull Context context, @NonNull List<ShortcutInfoCompat> list) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(list);
        if (Build.VERSION.SDK_INT >= 25) {
            ArrayList arrayList = new ArrayList(list.size());
            Iterator<ShortcutInfoCompat> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().toShortcutInfo());
            }
            if (!C1251TR.m5863a(C1186SR.m5482a(C5827z3.m29927a(context, C0420GR.m2060a())), arrayList)) {
                return false;
            }
        }
        getShortcutInfoSaverInstance(context).removeAllShortcuts();
        getShortcutInfoSaverInstance(context).addShortcuts(list);
        return true;
    }

    @VisibleForTesting
    public static void setShortcutInfoCompatSaver(ShortcutInfoCompatSaver<Void> shortcutInfoCompatSaver) {
        sShortcutInfoCompatSaver = shortcutInfoCompatSaver;
    }

    public static boolean updateShortcuts(@NonNull Context context, @NonNull List<ShortcutInfoCompat> list) {
        int i = Build.VERSION.SDK_INT;
        if (i <= 29) {
            convertUriIconsToBitmapIcons(context, list);
        }
        if (i >= 25) {
            ArrayList arrayList = new ArrayList();
            Iterator<ShortcutInfoCompat> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().toShortcutInfo());
            }
            if (!C0675KR.m3191a(C1186SR.m5482a(C5827z3.m29927a(context, C0420GR.m2060a())), arrayList)) {
                return false;
            }
        }
        getShortcutInfoSaverInstance(context).addShortcuts(list);
        return true;
    }
}
