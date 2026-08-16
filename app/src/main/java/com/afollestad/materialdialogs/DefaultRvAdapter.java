package com.afollestad.materialdialogs;

import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.annotation.LayoutRes;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
class DefaultRvAdapter extends RecyclerView.Adapter<DefaultVH> {

    /* JADX INFO: renamed from: a */
    public final MaterialDialog f10537a;

    /* JADX INFO: renamed from: b */
    @LayoutRes
    public final int f10538b;

    /* JADX INFO: renamed from: c */
    public final GravityEnum f10539c;

    /* JADX INFO: renamed from: d */
    public InternalListCallback f10540d;

    /* JADX INFO: renamed from: com.afollestad.materialdialogs.DefaultRvAdapter$1 */
    public static /* synthetic */ class C30931 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f10541a;

        static {
            int[] iArr = new int[MaterialDialog.ListType.values().length];
            f10541a = iArr;
            try {
                iArr[MaterialDialog.ListType.SINGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10541a[MaterialDialog.ListType.MULTI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class DefaultVH extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {

        /* JADX INFO: renamed from: a */
        public final CompoundButton f10542a;

        /* JADX INFO: renamed from: b */
        public final TextView f10543b;

        /* JADX INFO: renamed from: c */
        public final DefaultRvAdapter f10544c;

        /* JADX WARN: Invalid debug info offset */
        public DefaultVH(View view, DefaultRvAdapter defaultRvAdapter) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            return false;
        }
    }

    public interface InternalListCallback {
        /* JADX INFO: renamed from: a */
        boolean mo16827a(MaterialDialog materialDialog, View view, int i, CharSequence charSequence, boolean z);
    }

    /* JADX WARN: Invalid debug info offset */
    public DefaultRvAdapter(MaterialDialog materialDialog, @LayoutRes int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ MaterialDialog m16820d(DefaultRvAdapter defaultRvAdapter) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public static /* synthetic */ InternalListCallback m16821h(DefaultRvAdapter defaultRvAdapter) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(17)
    /* JADX INFO: renamed from: i */
    public final boolean m16822i() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public void m16823j(DefaultVH defaultVH, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public DefaultVH m16824k(ViewGroup viewGroup, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public void m16825l(InternalListCallback internalListCallback) {
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(17)
    /* JADX INFO: renamed from: m */
    public final void m16826m(ViewGroup viewGroup) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return null;
    }
}
