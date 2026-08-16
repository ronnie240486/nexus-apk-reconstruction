package androidx.core.view;

import android.app.Activity;
import android.os.Build;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import p000.C1461Wf;
import p000.C1524Xf;
import p000.C1587Yf;

/* JADX INFO: loaded from: classes.dex */
public final class DragAndDropPermissionsCompat {
    private Object mDragAndDropPermissions;

    private DragAndDropPermissionsCompat(Object obj) {
        this.mDragAndDropPermissions = obj;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static DragAndDropPermissionsCompat request(Activity activity, DragEvent dragEvent) {
        DragAndDropPermissions dragAndDropPermissionsM6913a;
        if (Build.VERSION.SDK_INT < 24 || (dragAndDropPermissionsM6913a = C1461Wf.m6913a(activity, dragEvent)) == null) {
            return null;
        }
        return new DragAndDropPermissionsCompat(dragAndDropPermissionsM6913a);
    }

    public void release() {
        if (Build.VERSION.SDK_INT >= 24) {
            C1587Yf.m8208a(C1524Xf.m7900a(this.mDragAndDropPermissions));
        }
    }
}
