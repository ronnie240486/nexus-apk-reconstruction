package androidx.core.graphics;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import org.slf4j.helpers.MessageFormatter;
import p000.C00;
import p000.C0045Ag;
import p000.C4765ls;
import p000.C5737xg;
import p000.C5802yg;
import p000.C5872zg;

/* JADX INFO: loaded from: classes.dex */
public final class Insets {

    @NonNull
    public static final Insets NONE = new Insets(0, 0, 0, 0);
    public final int bottom;
    public final int left;
    public final int right;
    public final int top;

    private Insets(int i, int i2, int i3, int i4) {
        this.left = i;
        this.top = i2;
        this.right = i3;
        this.bottom = i4;
    }

    @NonNull
    public static Insets add(@NonNull Insets insets, @NonNull Insets insets2) {
        return m14521of(insets.left + insets2.left, insets.top + insets2.top, insets.right + insets2.right, insets.bottom + insets2.bottom);
    }

    @NonNull
    public static Insets max(@NonNull Insets insets, @NonNull Insets insets2) {
        return m14521of(Math.max(insets.left, insets2.left), Math.max(insets.top, insets2.top), Math.max(insets.right, insets2.right), Math.max(insets.bottom, insets2.bottom));
    }

    @NonNull
    public static Insets min(@NonNull Insets insets, @NonNull Insets insets2) {
        return m14521of(Math.min(insets.left, insets2.left), Math.min(insets.top, insets2.top), Math.min(insets.right, insets2.right), Math.min(insets.bottom, insets2.bottom));
    }

    @NonNull
    /* JADX INFO: renamed from: of */
    public static Insets m14521of(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? NONE : new Insets(i, i2, i3, i4);
    }

    @NonNull
    public static Insets subtract(@NonNull Insets insets, @NonNull Insets insets2) {
        return m14521of(insets.left - insets2.left, insets.top - insets2.top, insets.right - insets2.right, insets.bottom - insets2.bottom);
    }

    @NonNull
    @RequiresApi(api = 29)
    public static Insets toCompatInsets(@NonNull android.graphics.Insets insets) {
        return m14521of(C5737xg.m29672a(insets), C5872zg.m30031a(insets), C5802yg.m29869a(insets), C0045Ag.m210a(insets));
    }

    @NonNull
    @Deprecated
    @RequiresApi(api = 29)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static Insets wrap(@NonNull android.graphics.Insets insets) {
        return toCompatInsets(insets);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Insets.class != obj.getClass()) {
            return false;
        }
        Insets insets = (Insets) obj;
        return this.bottom == insets.bottom && this.left == insets.left && this.right == insets.right && this.top == insets.top;
    }

    public int hashCode() {
        return (((((this.left * 31) + this.top) * 31) + this.right) * 31) + this.bottom;
    }

    @NonNull
    @RequiresApi(api = 29)
    public android.graphics.Insets toPlatformInsets() {
        return C4765ls.m22013a(this.left, this.top, this.right, this.bottom);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.left);
        sb.append(", top=");
        sb.append(this.top);
        sb.append(", right=");
        sb.append(this.right);
        sb.append(", bottom=");
        return C00.m823a(sb, this.bottom, MessageFormatter.f17214b);
    }

    @NonNull
    /* JADX INFO: renamed from: of */
    public static Insets m14522of(@NonNull Rect rect) {
        return m14521of(rect.left, rect.top, rect.right, rect.bottom);
    }
}
