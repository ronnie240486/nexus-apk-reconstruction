package android.media.ViviTV.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public class HorizontalRecyclerView extends RecyclerView {

    /* JADX INFO: renamed from: a */
    public RecyclerView.LayoutManager f9934a;

    /* JADX INFO: renamed from: b */
    public boolean f9935b;

    /* JADX INFO: renamed from: c */
    public InterfaceC2365a f9936c;

    /* JADX INFO: renamed from: android.media.ViviTV.widget.HorizontalRecyclerView$a */
    public interface InterfaceC2365a {
        /* JADX INFO: renamed from: N */
        boolean mo884N(KeyEvent keyEvent);
    }

    /* JADX WARN: Invalid debug info offset */
    public HorizontalRecyclerView(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    public HorizontalRecyclerView(Context context, @Nullable AttributeSet attributeSet) {
    }

    /* JADX WARN: Invalid debug info offset */
    public HorizontalRecyclerView(Context context, @Nullable AttributeSet attributeSet, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    private void m14406b() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public void setForbiddenLeftRightKeyEvent(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setKeyEventDispatcher(InterfaceC2365a interfaceC2365a) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView
    public void setLayoutManager(RecyclerView.LayoutManager layoutManager) {
    }
}
