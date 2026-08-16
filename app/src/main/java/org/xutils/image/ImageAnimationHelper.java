package org.xutils.image;

import android.graphics.drawable.Drawable;
import android.view.animation.Animation;
import android.widget.ImageView;
import java.lang.reflect.Method;
import org.xutils.common.util.LogUtil;

/* JADX INFO: loaded from: classes.dex */
public final class ImageAnimationHelper {

    /* JADX INFO: renamed from: a */
    public static final Method f18252a;

    static {
        Method method = null;
        try {
            Method declaredMethod = Animation.class.getDeclaredMethod("clone", null);
            declaredMethod.setAccessible(true);
            method = declaredMethod;
        } catch (Throwable th) {
            LogUtil.m26815k(th.getMessage(), th);
        }
        f18252a = method;
    }

    /* JADX WARN: Invalid debug info offset */
    private ImageAnimationHelper() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x000a
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    public static void m27200a(android.widget.ImageView r1, android.graphics.drawable.Drawable r2, android.view.animation.Animation r3) {
        /*
            return
        L14:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xutils.image.ImageAnimationHelper.m27200a(android.widget.ImageView, android.graphics.drawable.Drawable, android.view.animation.Animation):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static void m27201b(ImageView imageView, Drawable drawable) {
    }
}
