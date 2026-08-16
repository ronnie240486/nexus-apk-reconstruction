package androidx.recyclerview.widget;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import p000.C5274qy;

/* JADX INFO: loaded from: classes.dex */
public class DiffUtil {
    private static final Comparator<Snake> SNAKE_COMPARATOR = new Comparator<Snake>() { // from class: androidx.recyclerview.widget.DiffUtil.1
        @Override // java.util.Comparator
        public int compare(Snake snake, Snake snake2) {
            int i = snake.f10116x - snake2.f10116x;
            return i == 0 ? snake.f10117y - snake2.f10117y : i;
        }
    };

    public static abstract class Callback {
        public abstract boolean areContentsTheSame(int i, int i2);

        public abstract boolean areItemsTheSame(int i, int i2);

        @Nullable
        public Object getChangePayload(int i, int i2) {
            return null;
        }

        public abstract int getNewListSize();

        public abstract int getOldListSize();
    }

    public static class DiffResult {
        private static final int FLAG_CHANGED = 2;
        private static final int FLAG_IGNORE = 16;
        private static final int FLAG_MASK = 31;
        private static final int FLAG_MOVED_CHANGED = 4;
        private static final int FLAG_MOVED_NOT_CHANGED = 8;
        private static final int FLAG_NOT_CHANGED = 1;
        private static final int FLAG_OFFSET = 5;
        public static final int NO_POSITION = -1;
        private final Callback mCallback;
        private final boolean mDetectMoves;
        private final int[] mNewItemStatuses;
        private final int mNewListSize;
        private final int[] mOldItemStatuses;
        private final int mOldListSize;
        private final List<Snake> mSnakes;

        public DiffResult(Callback callback, List<Snake> list, int[] iArr, int[] iArr2, boolean z) {
            this.mSnakes = list;
            this.mOldItemStatuses = iArr;
            this.mNewItemStatuses = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.mCallback = callback;
            this.mOldListSize = callback.getOldListSize();
            this.mNewListSize = callback.getNewListSize();
            this.mDetectMoves = z;
            addRootSnake();
            findMatchingItems();
        }

        private void addRootSnake() {
            Snake snake = this.mSnakes.isEmpty() ? null : this.mSnakes.get(0);
            if (snake != null && snake.f10116x == 0 && snake.f10117y == 0) {
                return;
            }
            Snake snake2 = new Snake();
            snake2.f10116x = 0;
            snake2.f10117y = 0;
            snake2.removal = false;
            snake2.size = 0;
            snake2.reverse = false;
            this.mSnakes.add(0, snake2);
        }

        private void dispatchAdditions(List<PostponedUpdate> list, ListUpdateCallback listUpdateCallback, int i, int i2, int i3) {
            if (!this.mDetectMoves) {
                listUpdateCallback.onInserted(i, i2);
                return;
            }
            for (int i4 = i2 - 1; i4 >= 0; i4--) {
                int i5 = i3 + i4;
                int i6 = this.mNewItemStatuses[i5];
                int i7 = i6 & 31;
                if (i7 == 0) {
                    listUpdateCallback.onInserted(i, 1);
                    Iterator<PostponedUpdate> it = list.iterator();
                    while (it.hasNext()) {
                        it.next().currentPos++;
                    }
                } else if (i7 == 4 || i7 == 8) {
                    int i8 = i6 >> 5;
                    listUpdateCallback.onMoved(removePostponedUpdate(list, i8, true).currentPos, i);
                    if (i7 == 4) {
                        listUpdateCallback.onChanged(i, 1, this.mCallback.getChangePayload(i8, i5));
                    }
                } else {
                    if (i7 != 16) {
                        StringBuilder sbM27771a = C5274qy.m27771a("unknown flag for pos ", i5, " ");
                        sbM27771a.append(Long.toBinaryString(i7));
                        throw new IllegalStateException(sbM27771a.toString());
                    }
                    list.add(new PostponedUpdate(i5, i, false));
                }
            }
        }

        private void dispatchRemovals(List<PostponedUpdate> list, ListUpdateCallback listUpdateCallback, int i, int i2, int i3) {
            if (!this.mDetectMoves) {
                listUpdateCallback.onRemoved(i, i2);
                return;
            }
            for (int i4 = i2 - 1; i4 >= 0; i4--) {
                int i5 = i3 + i4;
                int i6 = this.mOldItemStatuses[i5];
                int i7 = i6 & 31;
                if (i7 == 0) {
                    listUpdateCallback.onRemoved(i + i4, 1);
                    Iterator<PostponedUpdate> it = list.iterator();
                    while (it.hasNext()) {
                        it.next().currentPos--;
                    }
                } else if (i7 == 4 || i7 == 8) {
                    int i8 = i6 >> 5;
                    PostponedUpdate postponedUpdateRemovePostponedUpdate = removePostponedUpdate(list, i8, false);
                    listUpdateCallback.onMoved(i + i4, postponedUpdateRemovePostponedUpdate.currentPos - 1);
                    if (i7 == 4) {
                        listUpdateCallback.onChanged(postponedUpdateRemovePostponedUpdate.currentPos - 1, 1, this.mCallback.getChangePayload(i5, i8));
                    }
                } else {
                    if (i7 != 16) {
                        StringBuilder sbM27771a = C5274qy.m27771a("unknown flag for pos ", i5, " ");
                        sbM27771a.append(Long.toBinaryString(i7));
                        throw new IllegalStateException(sbM27771a.toString());
                    }
                    list.add(new PostponedUpdate(i5, i + i4, true));
                }
            }
        }

        private void findAddition(int i, int i2, int i3) {
            if (this.mOldItemStatuses[i - 1] != 0) {
                return;
            }
            findMatchingItem(i, i2, i3, false);
        }

        private boolean findMatchingItem(int i, int i2, int i3, boolean z) {
            int i4;
            int i5;
            int i6;
            if (z) {
                i2--;
                i5 = i;
                i4 = i2;
            } else {
                i4 = i - 1;
                i5 = i4;
            }
            while (i3 >= 0) {
                Snake snake = this.mSnakes.get(i3);
                int i7 = snake.f10116x;
                int i8 = snake.size;
                int i9 = i7 + i8;
                int i10 = snake.f10117y + i8;
                if (z) {
                    for (int i11 = i5 - 1; i11 >= i9; i11--) {
                        if (this.mCallback.areItemsTheSame(i11, i4)) {
                            i6 = this.mCallback.areContentsTheSame(i11, i4) ? 8 : 4;
                            this.mNewItemStatuses[i4] = (i11 << 5) | 16;
                            this.mOldItemStatuses[i11] = (i4 << 5) | i6;
                            return true;
                        }
                    }
                } else {
                    for (int i12 = i2 - 1; i12 >= i10; i12--) {
                        if (this.mCallback.areItemsTheSame(i4, i12)) {
                            i6 = this.mCallback.areContentsTheSame(i4, i12) ? 8 : 4;
                            int i13 = i - 1;
                            this.mOldItemStatuses[i13] = (i12 << 5) | 16;
                            this.mNewItemStatuses[i12] = (i13 << 5) | i6;
                            return true;
                        }
                    }
                }
                i5 = snake.f10116x;
                i2 = snake.f10117y;
                i3--;
            }
            return false;
        }

        private void findMatchingItems() {
            int i = this.mOldListSize;
            int i2 = this.mNewListSize;
            for (int size = this.mSnakes.size() - 1; size >= 0; size--) {
                Snake snake = this.mSnakes.get(size);
                int i3 = snake.f10116x;
                int i4 = snake.size;
                int i5 = i3 + i4;
                int i6 = snake.f10117y + i4;
                if (this.mDetectMoves) {
                    while (i > i5) {
                        findAddition(i, i2, size);
                        i--;
                    }
                    while (i2 > i6) {
                        findRemoval(i, i2, size);
                        i2--;
                    }
                }
                for (int i7 = 0; i7 < snake.size; i7++) {
                    int i8 = snake.f10116x + i7;
                    int i9 = snake.f10117y + i7;
                    int i10 = this.mCallback.areContentsTheSame(i8, i9) ? 1 : 2;
                    this.mOldItemStatuses[i8] = (i9 << 5) | i10;
                    this.mNewItemStatuses[i9] = (i8 << 5) | i10;
                }
                i = snake.f10116x;
                i2 = snake.f10117y;
            }
        }

        private void findRemoval(int i, int i2, int i3) {
            if (this.mNewItemStatuses[i2 - 1] != 0) {
                return;
            }
            findMatchingItem(i, i2, i3, true);
        }

        private static PostponedUpdate removePostponedUpdate(List<PostponedUpdate> list, int i, boolean z) {
            int size = list.size() - 1;
            while (size >= 0) {
                PostponedUpdate postponedUpdate = list.get(size);
                if (postponedUpdate.posInOwnerList == i && postponedUpdate.removal == z) {
                    list.remove(size);
                    while (size < list.size()) {
                        list.get(size).currentPos += z ? 1 : -1;
                        size++;
                    }
                    return postponedUpdate;
                }
                size--;
            }
            return null;
        }

        public int convertNewPositionToOld(@IntRange(from = 0) int i) {
            if (i < 0 || i >= this.mNewListSize) {
                StringBuilder sbM27771a = C5274qy.m27771a("Index out of bounds - passed position = ", i, ", new list size = ");
                sbM27771a.append(this.mNewListSize);
                throw new IndexOutOfBoundsException(sbM27771a.toString());
            }
            int i2 = this.mNewItemStatuses[i];
            if ((i2 & 31) == 0) {
                return -1;
            }
            return i2 >> 5;
        }

        public int convertOldPositionToNew(@IntRange(from = 0) int i) {
            if (i < 0 || i >= this.mOldListSize) {
                StringBuilder sbM27771a = C5274qy.m27771a("Index out of bounds - passed position = ", i, ", old list size = ");
                sbM27771a.append(this.mOldListSize);
                throw new IndexOutOfBoundsException(sbM27771a.toString());
            }
            int i2 = this.mOldItemStatuses[i];
            if ((i2 & 31) == 0) {
                return -1;
            }
            return i2 >> 5;
        }

        public void dispatchUpdatesTo(@NonNull ListUpdateCallback listUpdateCallback) {
            BatchingListUpdateCallback batchingListUpdateCallback = listUpdateCallback instanceof BatchingListUpdateCallback ? (BatchingListUpdateCallback) listUpdateCallback : new BatchingListUpdateCallback(listUpdateCallback);
            List<PostponedUpdate> arrayList = new ArrayList<>();
            int i = this.mOldListSize;
            int i2 = this.mNewListSize;
            for (int size = this.mSnakes.size() - 1; size >= 0; size--) {
                Snake snake = this.mSnakes.get(size);
                int i3 = snake.size;
                int i4 = snake.f10116x + i3;
                int i5 = snake.f10117y + i3;
                if (i4 < i) {
                    dispatchRemovals(arrayList, batchingListUpdateCallback, i4, i - i4, i4);
                }
                if (i5 < i2) {
                    dispatchAdditions(arrayList, batchingListUpdateCallback, i4, i2 - i5, i5);
                }
                for (int i6 = i3 - 1; i6 >= 0; i6--) {
                    int[] iArr = this.mOldItemStatuses;
                    int i7 = snake.f10116x;
                    if ((iArr[i7 + i6] & 31) == 2) {
                        batchingListUpdateCallback.onChanged(i7 + i6, 1, this.mCallback.getChangePayload(i7 + i6, snake.f10117y + i6));
                    }
                }
                i = snake.f10116x;
                i2 = snake.f10117y;
            }
            batchingListUpdateCallback.dispatchLastEvent();
        }

        @VisibleForTesting
        public List<Snake> getSnakes() {
            return this.mSnakes;
        }

        public void dispatchUpdatesTo(@NonNull RecyclerView.Adapter adapter) {
            dispatchUpdatesTo(new AdapterListUpdateCallback(adapter));
        }
    }

    public static abstract class ItemCallback<T> {
        public abstract boolean areContentsTheSame(@NonNull T t, @NonNull T t2);

        public abstract boolean areItemsTheSame(@NonNull T t, @NonNull T t2);

        @Nullable
        public Object getChangePayload(@NonNull T t, @NonNull T t2) {
            return null;
        }
    }

    public static class PostponedUpdate {
        int currentPos;
        int posInOwnerList;
        boolean removal;

        public PostponedUpdate(int i, int i2, boolean z) {
            this.posInOwnerList = i;
            this.currentPos = i2;
            this.removal = z;
        }
    }

    public static class Range {
        int newListEnd;
        int newListStart;
        int oldListEnd;
        int oldListStart;

        public Range() {
        }

        public Range(int i, int i2, int i3, int i4) {
            this.oldListStart = i;
            this.oldListEnd = i2;
            this.newListStart = i3;
            this.newListEnd = i4;
        }
    }

    public static class Snake {
        boolean removal;
        boolean reverse;
        int size;

        /* JADX INFO: renamed from: x */
        int f10116x;

        /* JADX INFO: renamed from: y */
        int f10117y;
    }

    private DiffUtil() {
    }

    @NonNull
    public static DiffResult calculateDiff(@NonNull Callback callback) {
        return calculateDiff(callback, true);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004d  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:52:0x00ca
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    private static androidx.recyclerview.widget.DiffUtil.Snake diffPartial(androidx.recyclerview.widget.DiffUtil.Callback r19, int r20, int r21, int r22, int r23, int[] r24, int[] r25, int r26) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.DiffUtil.diffPartial(androidx.recyclerview.widget.DiffUtil$Callback, int, int, int, int, int[], int[], int):androidx.recyclerview.widget.DiffUtil$Snake");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ce  */
    @NonNull
    public static DiffResult calculateDiff(@NonNull Callback callback, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int oldListSize = callback.getOldListSize();
        int newListSize = callback.getNewListSize();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new Range(0, oldListSize, 0, newListSize));
        int iAbs = Math.abs(oldListSize - newListSize) + oldListSize + newListSize;
        int i6 = iAbs * 2;
        int[] iArr = new int[i6];
        int[] iArr2 = new int[i6];
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            Range range = (Range) arrayList2.remove(arrayList2.size() - 1);
            Snake snakeDiffPartial = diffPartial(callback, range.oldListStart, range.oldListEnd, range.newListStart, range.newListEnd, iArr, iArr2, iAbs);
            if (snakeDiffPartial != null) {
                if (snakeDiffPartial.size > 0) {
                    arrayList.add(snakeDiffPartial);
                }
                snakeDiffPartial.f10116x += range.oldListStart;
                snakeDiffPartial.f10117y += range.newListStart;
                Range range2 = arrayList3.isEmpty() ? new Range() : (Range) arrayList3.remove(arrayList3.size() - 1);
                range2.oldListStart = range.oldListStart;
                range2.newListStart = range.newListStart;
                if (snakeDiffPartial.reverse) {
                    i2 = snakeDiffPartial.f10116x;
                } else {
                    if (snakeDiffPartial.removal) {
                        i2 = snakeDiffPartial.f10116x - 1;
                    } else {
                        range2.oldListEnd = snakeDiffPartial.f10116x;
                        i = snakeDiffPartial.f10117y - 1;
                    }
                    range2.newListEnd = i;
                    arrayList2.add(range2);
                    if (snakeDiffPartial.reverse) {
                        if (snakeDiffPartial.removal) {
                            int i7 = snakeDiffPartial.f10116x;
                            i3 = snakeDiffPartial.size;
                            i4 = i7 + i3 + 1;
                        } else {
                            int i8 = snakeDiffPartial.f10116x;
                            int i9 = snakeDiffPartial.size;
                            range.oldListStart = i8 + i9;
                            i5 = snakeDiffPartial.f10117y + i9 + 1;
                        }
                        range.newListStart = i5;
                        arrayList2.add(range);
                    } else {
                        int i10 = snakeDiffPartial.f10116x;
                        i3 = snakeDiffPartial.size;
                        i4 = i10 + i3;
                    }
                    range.oldListStart = i4;
                    i5 = snakeDiffPartial.f10117y + i3;
                    range.newListStart = i5;
                    arrayList2.add(range);
                }
                range2.oldListEnd = i2;
                i = snakeDiffPartial.f10117y;
                range2.newListEnd = i;
                arrayList2.add(range2);
                if (snakeDiffPartial.reverse) {
                    if (snakeDiffPartial.removal) {
                        int i11 = snakeDiffPartial.f10116x;
                        i3 = snakeDiffPartial.size;
                        i4 = i11 + i3 + 1;
                    } else {
                        int i12 = snakeDiffPartial.f10116x;
                        int i13 = snakeDiffPartial.size;
                        range.oldListStart = i12 + i13;
                        i5 = snakeDiffPartial.f10117y + i13 + 1;
                    }
                    range.newListStart = i5;
                    arrayList2.add(range);
                } else {
                    int i14 = snakeDiffPartial.f10116x;
                    i3 = snakeDiffPartial.size;
                    i4 = i14 + i3;
                }
                range.oldListStart = i4;
                i5 = snakeDiffPartial.f10117y + i3;
                range.newListStart = i5;
                arrayList2.add(range);
            } else {
                arrayList3.add(range);
            }
        }
        Collections.sort(arrayList, SNAKE_COMPARATOR);
        return new DiffResult(callback, arrayList, iArr, iArr2, z);
    }
}
