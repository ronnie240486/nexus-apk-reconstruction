package androidx.core.graphics;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.Collection;
import p000.C5646wI;

/* JADX INFO: loaded from: classes.dex */
public final class PathUtils {
    private PathUtils() {
    }

    @NonNull
    @RequiresApi(26)
    public static Collection<PathSegment> flatten(@NonNull Path path) {
        return flatten(path, 0.5f);
    }

    @NonNull
    @RequiresApi(26)
    public static Collection<PathSegment> flatten(@NonNull Path path, @FloatRange(from = 0.0d) float f) {
        float[] fArrM29231a = C5646wI.m29231a(path, f);
        int length = fArrM29231a.length / 3;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 1; i < length; i++) {
            int i2 = i * 3;
            int i3 = (i - 1) * 3;
            float f2 = fArrM29231a[i2];
            float f3 = fArrM29231a[i2 + 1];
            float f4 = fArrM29231a[i2 + 2];
            float f5 = fArrM29231a[i3];
            float f6 = fArrM29231a[i3 + 1];
            float f7 = fArrM29231a[i3 + 2];
            if (f2 != f5 && (f3 != f6 || f4 != f7)) {
                arrayList.add(new PathSegment(new PointF(f6, f7), f5, new PointF(f3, f4), f2));
            }
        }
        return arrayList;
    }
}
