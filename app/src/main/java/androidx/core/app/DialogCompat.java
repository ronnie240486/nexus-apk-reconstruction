package androidx.core.app;

import android.app.Dialog;
import android.os.Build;
import android.view.View;
import androidx.annotation.NonNull;
import p000.C1460We;

/* JADX INFO: loaded from: classes.dex */
public class DialogCompat {
    private DialogCompat() {
    }

    @NonNull
    public static View requireViewById(@NonNull Dialog dialog, int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C1460We.m6912a(dialog, i);
        }
        View viewFindViewById = dialog.findViewById(i);
        if (viewFindViewById != null) {
            return viewFindViewById;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Dialog");
    }
}
