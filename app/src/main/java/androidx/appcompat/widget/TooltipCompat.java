package androidx.appcompat.widget;

import android.os.Build;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p000.C0299EW;

/* JADX INFO: loaded from: classes.dex */
public class TooltipCompat {
    private TooltipCompat() {
    }

    public static void setTooltipText(@NonNull View view, @Nullable CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            C0299EW.m1597a(view, charSequence);
        } else {
            TooltipCompatHandler.setTooltipText(view, charSequence);
        }
    }
}
