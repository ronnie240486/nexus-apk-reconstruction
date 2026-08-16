package androidx.lifecycle;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.runtime.C2753R;

/* JADX INFO: loaded from: classes.dex */
public class ViewTreeLifecycleOwner {
    private ViewTreeLifecycleOwner() {
    }

    @Nullable
    public static LifecycleOwner get(@NonNull View view) {
        LifecycleOwner lifecycleOwner = (LifecycleOwner) view.getTag(C2753R.id.view_tree_lifecycle_owner);
        if (lifecycleOwner != null) {
            return lifecycleOwner;
        }
        while (true) {
            Object parent = view.getParent();
            if (lifecycleOwner != null || !(parent instanceof View)) {
                break;
            }
            view = (View) parent;
            lifecycleOwner = (LifecycleOwner) view.getTag(C2753R.id.view_tree_lifecycle_owner);
        }
        return lifecycleOwner;
    }

    public static void set(@NonNull View view, @Nullable LifecycleOwner lifecycleOwner) {
        view.setTag(C2753R.id.view_tree_lifecycle_owner, lifecycleOwner);
    }
}
