package org.lucasr.twowayview;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public class ItemClickSupport {
    private OnItemClickListener mItemClickListener;
    private OnItemLongClickListener mItemLongClickListener;
    private OnItemTouchObserver mItemTouchObserver;
    private final RecyclerView mRecyclerView;
    private final TouchListener mTouchListener;

    public interface OnItemClickListener {
        void onItemClick(RecyclerView recyclerView, View view, int i, long j);
    }

    public interface OnItemLongClickListener {
        boolean onItemLongClick(RecyclerView recyclerView, View view, int i, long j);
    }

    public interface OnItemTouchObserver {
        void onItemDown(RecyclerView recyclerView, View view, int i, long j);

        void onItemTouchCancel(RecyclerView recyclerView);

        void onItemUp(RecyclerView recyclerView, View view, int i, long j);
    }

    public class TouchListener extends ClickItemTouchListener {
        final /* synthetic */ ItemClickSupport this$0;

        /* JADX WARN: Invalid debug info offset */
        public TouchListener(ItemClickSupport itemClickSupport, RecyclerView recyclerView) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public void onRequestDisallowInterceptTouchEvent(boolean z) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.lucasr.twowayview.ClickItemTouchListener
        public boolean performItemClick(RecyclerView recyclerView, View view, int i, long j) {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.lucasr.twowayview.ClickItemTouchListener
        public void performItemDown(RecyclerView recyclerView, View view, int i, long j) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.lucasr.twowayview.ClickItemTouchListener
        public boolean performItemLongClick(RecyclerView recyclerView, View view, int i, long j) {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.lucasr.twowayview.ClickItemTouchListener
        public void performItemTouchCancel(RecyclerView recyclerView) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.lucasr.twowayview.ClickItemTouchListener
        public void performItemUp(RecyclerView recyclerView, View view, int i, long j) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    private ItemClickSupport(RecyclerView recyclerView) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static /* synthetic */ OnItemClickListener access$000(ItemClickSupport itemClickSupport) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static /* synthetic */ OnItemLongClickListener access$100(ItemClickSupport itemClickSupport) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static /* synthetic */ OnItemTouchObserver access$200(ItemClickSupport itemClickSupport) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static ItemClickSupport addTo(RecyclerView recyclerView) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static ItemClickSupport from(RecyclerView recyclerView) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static void removeFrom(RecyclerView recyclerView) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setOnItemDownListener(OnItemTouchObserver onItemTouchObserver) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setOnItemLongClickListener(OnItemLongClickListener onItemLongClickListener) {
    }
}
