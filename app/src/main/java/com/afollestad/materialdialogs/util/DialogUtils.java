package com.afollestad.materialdialogs.util;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.ArrayRes;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.afollestad.materialdialogs.GravityEnum;
import com.afollestad.materialdialogs.MaterialDialog;

/* JADX INFO: loaded from: classes.dex */
public class DialogUtils {

    /* JADX INFO: renamed from: com.afollestad.materialdialogs.util.DialogUtils$1 */
    public static class RunnableC31041 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MaterialDialog f10734a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ MaterialDialog.Builder f10735b;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC31041(MaterialDialog materialDialog, MaterialDialog.Builder builder) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: com.afollestad.materialdialogs.util.DialogUtils$2 */
    public static /* synthetic */ class C31052 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f10736a;

        static {
            int[] iArr = new int[GravityEnum.values().length];
            f10736a = iArr;
            try {
                iArr[GravityEnum.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10736a[GravityEnum.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Invalid debug info offset */
    @ColorInt
    /* JADX INFO: renamed from: a */
    public static int m17058a(@ColorInt int i, float f) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static ColorStateList m17059b(Context context, @ColorRes int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public static ColorStateList m17060c(Context context, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @ColorInt
    /* JADX INFO: renamed from: d */
    public static int m17061d(Context context, @ColorRes int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public static int[] m17062e(@NonNull Context context, @ArrayRes int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @ColorInt
    /* JADX INFO: renamed from: f */
    public static int m17063f(Context context) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public static int m17064g(GravityEnum gravityEnum) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public static void m17065h(@NonNull DialogInterface dialogInterface, @NonNull MaterialDialog.Builder builder) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public static boolean m17066i(@ColorInt int i) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public static <T> boolean m17067j(@NonNull T t, @Nullable T[] tArr) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000d
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: k */
    public static android.content.res.ColorStateList m17068k(android.content.Context r4, @androidx.annotation.AttrRes int r5, android.content.res.ColorStateList r6) {
        /*
            r0 = 0
            return r0
        L2b:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.afollestad.materialdialogs.util.DialogUtils.m17068k(android.content.Context, int, android.content.res.ColorStateList):android.content.res.ColorStateList");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public static boolean m17069l(Context context, @AttrRes int i) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000d
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: m */
    public static boolean m17070m(android.content.Context r0, @androidx.annotation.AttrRes int r1, boolean r2) {
        /*
            r0 = 0
            return r0
        L15:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.afollestad.materialdialogs.util.DialogUtils.m17070m(android.content.Context, int, boolean):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    @ColorInt
    /* JADX INFO: renamed from: n */
    public static int m17071n(Context context, @AttrRes int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000d
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @androidx.annotation.ColorInt
    /* JADX INFO: renamed from: o */
    public static int m17072o(android.content.Context r0, @androidx.annotation.AttrRes int r1, int r2) {
        /*
            r0 = 0
            return r0
        L15:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.afollestad.materialdialogs.util.DialogUtils.m17072o(android.content.Context, int, int):int");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public static int m17073p(Context context, @AttrRes int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000d
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: q */
    public static int m17074q(android.content.Context r0, @androidx.annotation.AttrRes int r1, int r2) {
        /*
            r0 = 0
            return r0
        L15:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.afollestad.materialdialogs.util.DialogUtils.m17074q(android.content.Context, int, int):int");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r */
    public static Drawable m17075r(Context context, @AttrRes int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000d
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: s */
    public static android.graphics.drawable.Drawable m17076s(android.content.Context r0, @androidx.annotation.AttrRes int r1, android.graphics.drawable.Drawable r2) {
        /*
            r0 = 0
            return r0
        L1b:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.afollestad.materialdialogs.util.DialogUtils.m17076s(android.content.Context, int, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000c
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: t */
    public static com.afollestad.materialdialogs.GravityEnum m17077t(android.content.Context r0, @androidx.annotation.AttrRes int r1, com.afollestad.materialdialogs.GravityEnum r2) {
        /*
            r0 = 0
            return r0
        L21:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.afollestad.materialdialogs.util.DialogUtils.m17077t(android.content.Context, int, com.afollestad.materialdialogs.GravityEnum):com.afollestad.materialdialogs.GravityEnum");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u */
    public static String m17078u(Context context, @AttrRes int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v */
    public static void m17079v(View view, Drawable drawable) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w */
    public static void m17080w(@NonNull DialogInterface dialogInterface, @NonNull MaterialDialog.Builder builder) {
    }
}
