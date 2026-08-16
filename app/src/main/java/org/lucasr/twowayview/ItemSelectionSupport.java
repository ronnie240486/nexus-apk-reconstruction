package org.lucasr.twowayview;

import android.annotation.TargetApi;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.View;
import androidx.collection.LongSparseArray;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public class ItemSelectionSupport {
    private static final int CHECK_POSITION_SEARCH_DISTANCE = 20;
    public static final int INVALID_POSITION = -1;
    private static final String STATE_KEY_CHECKED_COUNT = "checkedCount";
    private static final String STATE_KEY_CHECKED_ID_STATES = "checkedIdStates";
    private static final String STATE_KEY_CHECKED_STATES = "checkedStates";
    private static final String STATE_KEY_CHOICE_MODE = "choiceMode";
    private int mCheckedCount;
    private CheckedIdStates mCheckedIdStates;
    private CheckedStates mCheckedStates;
    private ChoiceMode mChoiceMode;
    private final RecyclerView mRecyclerView;
    private final TouchListener mTouchListener;

    public static class CheckedIdStates extends LongSparseArray<Integer> implements Parcelable {
        public static final Parcelable.Creator<CheckedIdStates> CREATOR = new Parcelable.Creator<CheckedIdStates>() { // from class: org.lucasr.twowayview.ItemSelectionSupport.CheckedIdStates.1
            /* JADX WARN: Invalid debug info offset */
            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ CheckedIdStates createFromParcel(Parcel parcel) {
                return null;
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: createFromParcel, reason: avoid collision after fix types in other method */
            public CheckedIdStates createFromParcel2(Parcel parcel) {
                return null;
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ CheckedIdStates[] newArray(int i) {
                return null;
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: newArray, reason: avoid collision after fix types in other method */
            public CheckedIdStates[] newArray2(int i) {
                return null;
            }
        };

        /* JADX WARN: Invalid debug info offset */
        public CheckedIdStates() {
        }

        /* JADX WARN: Invalid debug info offset */
        private CheckedIdStates(Parcel parcel) {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ CheckedIdStates(Parcel parcel, C50671 c50671) {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
        }
    }

    public static class CheckedStates extends SparseBooleanArray implements Parcelable {
        public static final Parcelable.Creator<CheckedStates> CREATOR = new Parcelable.Creator<CheckedStates>() { // from class: org.lucasr.twowayview.ItemSelectionSupport.CheckedStates.1
            /* JADX WARN: Invalid debug info offset */
            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ CheckedStates createFromParcel(Parcel parcel) {
                return null;
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: createFromParcel, reason: avoid collision after fix types in other method */
            public CheckedStates createFromParcel2(Parcel parcel) {
                return null;
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ CheckedStates[] newArray(int i) {
                return null;
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: newArray, reason: avoid collision after fix types in other method */
            public CheckedStates[] newArray2(int i) {
                return null;
            }
        };
        private static final int FALSE = 0;
        private static final int TRUE = 1;

        /* JADX WARN: Invalid debug info offset */
        public CheckedStates() {
        }

        /* JADX WARN: Invalid debug info offset */
        private CheckedStates(Parcel parcel) {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ CheckedStates(Parcel parcel, C50671 c50671) {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
        }
    }

    public enum ChoiceMode {
        NONE,
        SINGLE,
        MULTIPLE
    }

    public class TouchListener extends ClickItemTouchListener {
        final /* synthetic */ ItemSelectionSupport this$0;

        /* JADX WARN: Invalid debug info offset */
        public TouchListener(ItemSelectionSupport itemSelectionSupport, RecyclerView recyclerView) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public void onRequestDisallowInterceptTouchEvent(boolean z) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.lucasr.twowayview.ClickItemTouchListener
        public boolean performItemClick(RecyclerView recyclerView, View view, int i, long j) {
            return false;
        }

        @Override // org.lucasr.twowayview.ClickItemTouchListener
        public void performItemDown(RecyclerView recyclerView, View view, int i, long j) {
        }

        @Override // org.lucasr.twowayview.ClickItemTouchListener
        public boolean performItemLongClick(RecyclerView recyclerView, View view, int i, long j) {
            return true;
        }

        @Override // org.lucasr.twowayview.ClickItemTouchListener
        public void performItemTouchCancel(RecyclerView recyclerView) {
        }

        @Override // org.lucasr.twowayview.ClickItemTouchListener
        public void performItemUp(RecyclerView recyclerView, View view, int i, long j) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    private ItemSelectionSupport(RecyclerView recyclerView) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static /* synthetic */ RecyclerView access$200(ItemSelectionSupport itemSelectionSupport) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static /* synthetic */ ChoiceMode access$300(ItemSelectionSupport itemSelectionSupport) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static /* synthetic */ CheckedStates access$400(ItemSelectionSupport itemSelectionSupport) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static /* synthetic */ CheckedIdStates access$500(ItemSelectionSupport itemSelectionSupport) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static /* synthetic */ int access$602(ItemSelectionSupport itemSelectionSupport, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public static /* synthetic */ int access$608(ItemSelectionSupport itemSelectionSupport) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public static /* synthetic */ int access$610(ItemSelectionSupport itemSelectionSupport) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public static /* synthetic */ void access$700(ItemSelectionSupport itemSelectionSupport) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static ItemSelectionSupport addTo(RecyclerView recyclerView) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static ItemSelectionSupport from(RecyclerView recyclerView) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static void removeFrom(RecyclerView recyclerView) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void updateOnScreenCheckedViews() {
    }

    /* JADX WARN: Invalid debug info offset */
    public void clearChoices() {
    }

    /* JADX WARN: Invalid debug info offset */
    public int getCheckedItemCount() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public long[] getCheckedItemIds() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getCheckedItemPosition() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public SparseBooleanArray getCheckedItemPositions() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ChoiceMode getChoiceMode() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isItemChecked(int i) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public void onAdapterDataChanged() {
    }

    /* JADX WARN: Invalid debug info offset */
    public void onRestoreInstanceState(Bundle bundle) {
    }

    /* JADX WARN: Invalid debug info offset */
    public Bundle onSaveInstanceState() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void setChoiceMode(ChoiceMode choiceMode) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setItemChecked(int i, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(11)
    public void setViewChecked(View view, boolean z) {
    }
}
