package androidx.core.view;

import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.Insets;
import androidx.core.os.BuildCompat;
import androidx.core.util.ObjectsCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000.C5255qf;
import p000.C5318rf;
import p000.C5389sf;
import p000.C5452tf;
import p000.C5534uf;
import p000.C5605vf;
import p000.C5669wf;

/* JADX INFO: loaded from: classes.dex */
public final class DisplayCutoutCompat {
    private final Object mDisplayCutout;

    public DisplayCutoutCompat(Rect rect, List<Rect> list) {
        this(Build.VERSION.SDK_INT >= 28 ? new DisplayCutout(rect, list) : null);
    }

    private static DisplayCutout constructDisplayCutout(@NonNull Insets insets, @Nullable Rect rect, @Nullable Rect rect2, @Nullable Rect rect3, @Nullable Rect rect4, @NonNull Insets insets2) {
        if (BuildCompat.isAtLeastR()) {
            return new DisplayCutout(insets.toPlatformInsets(), rect, rect2, rect3, rect4, insets2.toPlatformInsets());
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            return new DisplayCutout(insets.toPlatformInsets(), rect, rect2, rect3, rect4);
        }
        if (i < 28) {
            return null;
        }
        Rect rect5 = new Rect(insets.left, insets.top, insets.right, insets.bottom);
        ArrayList arrayList = new ArrayList();
        if (rect != null) {
            arrayList.add(rect);
        }
        if (rect2 != null) {
            arrayList.add(rect2);
        }
        if (rect3 != null) {
            arrayList.add(rect3);
        }
        if (rect4 != null) {
            arrayList.add(rect4);
        }
        return new DisplayCutout(rect5, arrayList);
    }

    public static DisplayCutoutCompat wrap(Object obj) {
        if (obj == null) {
            return null;
        }
        return new DisplayCutoutCompat(obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DisplayCutoutCompat.class != obj.getClass()) {
            return false;
        }
        return ObjectsCompat.equals(this.mDisplayCutout, ((DisplayCutoutCompat) obj).mDisplayCutout);
    }

    @NonNull
    public List<Rect> getBoundingRects() {
        return Build.VERSION.SDK_INT >= 28 ? C5318rf.m27910a(C5255qf.m27700a(this.mDisplayCutout)) : Collections.emptyList();
    }

    public int getSafeInsetBottom() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C5452tf.m28484a(C5255qf.m27700a(this.mDisplayCutout));
        }
        return 0;
    }

    public int getSafeInsetLeft() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C5669wf.m29309a(C5255qf.m27700a(this.mDisplayCutout));
        }
        return 0;
    }

    public int getSafeInsetRight() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C5534uf.m28673a(C5255qf.m27700a(this.mDisplayCutout));
        }
        return 0;
    }

    public int getSafeInsetTop() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C5605vf.m29116a(C5255qf.m27700a(this.mDisplayCutout));
        }
        return 0;
    }

    @NonNull
    public Insets getWaterfallInsets() {
        return BuildCompat.isAtLeastR() ? Insets.toCompatInsets(C5389sf.m28257a(C5255qf.m27700a(this.mDisplayCutout))) : Insets.NONE;
    }

    public int hashCode() {
        Object obj = this.mDisplayCutout;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.mDisplayCutout + "}";
    }

    @RequiresApi(api = 28)
    public DisplayCutout unwrap() {
        return C5255qf.m27700a(this.mDisplayCutout);
    }

    public DisplayCutoutCompat(@NonNull Insets insets, @Nullable Rect rect, @Nullable Rect rect2, @Nullable Rect rect3, @Nullable Rect rect4, @NonNull Insets insets2) {
        this(constructDisplayCutout(insets, rect, rect2, rect3, rect4, insets2));
    }

    private DisplayCutoutCompat(Object obj) {
        this.mDisplayCutout = obj;
    }
}
