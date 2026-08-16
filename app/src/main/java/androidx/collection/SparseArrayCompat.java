package androidx.collection;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.slf4j.helpers.MessageFormatter;

/* JADX INFO: loaded from: classes.dex */
public class SparseArrayCompat<E> implements Cloneable {
    private static final Object DELETED = new Object();
    private boolean mGarbage;
    private int[] mKeys;
    private int mSize;
    private Object[] mValues;

    public SparseArrayCompat() {
        this(10);
    }

    /* JADX INFO: renamed from: gc */
    private void m14519gc() {
        int i = this.mSize;
        int[] iArr = this.mKeys;
        Object[] objArr = this.mValues;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != DELETED) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.mGarbage = false;
        this.mSize = i2;
    }

    public void append(int i, E e) {
        int i2 = this.mSize;
        if (i2 != 0 && i <= this.mKeys[i2 - 1]) {
            put(i, e);
            return;
        }
        if (this.mGarbage && i2 >= this.mKeys.length) {
            m14519gc();
        }
        int i3 = this.mSize;
        if (i3 >= this.mKeys.length) {
            int iIdealIntArraySize = ContainerHelpers.idealIntArraySize(i3 + 1);
            int[] iArr = new int[iIdealIntArraySize];
            Object[] objArr = new Object[iIdealIntArraySize];
            int[] iArr2 = this.mKeys;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.mValues;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.mKeys = iArr;
            this.mValues = objArr;
        }
        this.mKeys[i3] = i;
        this.mValues[i3] = e;
        this.mSize = i3 + 1;
    }

    public void clear() {
        int i = this.mSize;
        Object[] objArr = this.mValues;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.mSize = 0;
        this.mGarbage = false;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public SparseArrayCompat<E> m30209clone() {
        try {
            SparseArrayCompat<E> sparseArrayCompat = (SparseArrayCompat) super.clone();
            sparseArrayCompat.mKeys = (int[]) this.mKeys.clone();
            sparseArrayCompat.mValues = (Object[]) this.mValues.clone();
            return sparseArrayCompat;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public boolean containsKey(int i) {
        return indexOfKey(i) >= 0;
    }

    public boolean containsValue(E e) {
        return indexOfValue(e) >= 0;
    }

    @Deprecated
    public void delete(int i) {
        remove(i);
    }

    @Nullable
    public E get(int i) {
        return get(i, null);
    }

    public int indexOfKey(int i) {
        if (this.mGarbage) {
            m14519gc();
        }
        return ContainerHelpers.binarySearch(this.mKeys, this.mSize, i);
    }

    public int indexOfValue(E e) {
        if (this.mGarbage) {
            m14519gc();
        }
        for (int i = 0; i < this.mSize; i++) {
            if (this.mValues[i] == e) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int keyAt(int i) {
        if (this.mGarbage) {
            m14519gc();
        }
        return this.mKeys[i];
    }

    public void put(int i, E e) {
        int iBinarySearch = ContainerHelpers.binarySearch(this.mKeys, this.mSize, i);
        if (iBinarySearch >= 0) {
            this.mValues[iBinarySearch] = e;
            return;
        }
        int iBinarySearch2 = iBinarySearch ^ (-1);
        int i2 = this.mSize;
        if (iBinarySearch2 < i2) {
            Object[] objArr = this.mValues;
            if (objArr[iBinarySearch2] == DELETED) {
                this.mKeys[iBinarySearch2] = i;
                objArr[iBinarySearch2] = e;
                return;
            }
        }
        if (this.mGarbage && i2 >= this.mKeys.length) {
            m14519gc();
            iBinarySearch2 = ContainerHelpers.binarySearch(this.mKeys, this.mSize, i) ^ (-1);
        }
        int i3 = this.mSize;
        if (i3 >= this.mKeys.length) {
            int iIdealIntArraySize = ContainerHelpers.idealIntArraySize(i3 + 1);
            int[] iArr = new int[iIdealIntArraySize];
            Object[] objArr2 = new Object[iIdealIntArraySize];
            int[] iArr2 = this.mKeys;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.mValues;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.mKeys = iArr;
            this.mValues = objArr2;
        }
        int i4 = this.mSize;
        if (i4 - iBinarySearch2 != 0) {
            int[] iArr3 = this.mKeys;
            int i5 = iBinarySearch2 + 1;
            System.arraycopy(iArr3, iBinarySearch2, iArr3, i5, i4 - iBinarySearch2);
            Object[] objArr4 = this.mValues;
            System.arraycopy(objArr4, iBinarySearch2, objArr4, i5, this.mSize - iBinarySearch2);
        }
        this.mKeys[iBinarySearch2] = i;
        this.mValues[iBinarySearch2] = e;
        this.mSize++;
    }

    public void putAll(@NonNull SparseArrayCompat<? extends E> sparseArrayCompat) {
        int size = sparseArrayCompat.size();
        for (int i = 0; i < size; i++) {
            put(sparseArrayCompat.keyAt(i), sparseArrayCompat.valueAt(i));
        }
    }

    @Nullable
    public E putIfAbsent(int i, E e) {
        E e2 = get(i);
        if (e2 == null) {
            put(i, e);
        }
        return e2;
    }

    public void remove(int i) {
        int iBinarySearch = ContainerHelpers.binarySearch(this.mKeys, this.mSize, i);
        if (iBinarySearch >= 0) {
            Object[] objArr = this.mValues;
            Object obj = objArr[iBinarySearch];
            Object obj2 = DELETED;
            if (obj != obj2) {
                objArr[iBinarySearch] = obj2;
                this.mGarbage = true;
            }
        }
    }

    public void removeAt(int i) {
        Object[] objArr = this.mValues;
        Object obj = objArr[i];
        Object obj2 = DELETED;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.mGarbage = true;
        }
    }

    public void removeAtRange(int i, int i2) {
        int iMin = Math.min(this.mSize, i2 + i);
        while (i < iMin) {
            removeAt(i);
            i++;
        }
    }

    @Nullable
    public E replace(int i, E e) {
        int iIndexOfKey = indexOfKey(i);
        if (iIndexOfKey < 0) {
            return null;
        }
        Object[] objArr = this.mValues;
        E e2 = (E) objArr[iIndexOfKey];
        objArr[iIndexOfKey] = e;
        return e2;
    }

    public void setValueAt(int i, E e) {
        if (this.mGarbage) {
            m14519gc();
        }
        this.mValues[i] = e;
    }

    public int size() {
        if (this.mGarbage) {
            m14519gc();
        }
        return this.mSize;
    }

    public String toString() {
        if (size() <= 0) {
            return MessageFormatter.f17215c;
        }
        StringBuilder sb = new StringBuilder(this.mSize * 28);
        sb.append(MessageFormatter.f17213a);
        for (int i = 0; i < this.mSize; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(keyAt(i));
            sb.append('=');
            E eValueAt = valueAt(i);
            if (eValueAt != this) {
                sb.append(eValueAt);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append(MessageFormatter.f17214b);
        return sb.toString();
    }

    public E valueAt(int i) {
        if (this.mGarbage) {
            m14519gc();
        }
        return (E) this.mValues[i];
    }

    public SparseArrayCompat(int i) {
        this.mGarbage = false;
        if (i == 0) {
            this.mKeys = ContainerHelpers.EMPTY_INTS;
            this.mValues = ContainerHelpers.EMPTY_OBJECTS;
        } else {
            int iIdealIntArraySize = ContainerHelpers.idealIntArraySize(i);
            this.mKeys = new int[iIdealIntArraySize];
            this.mValues = new Object[iIdealIntArraySize];
        }
    }

    public E get(int i, E e) {
        E e2;
        int iBinarySearch = ContainerHelpers.binarySearch(this.mKeys, this.mSize, i);
        return (iBinarySearch < 0 || (e2 = (E) this.mValues[iBinarySearch]) == DELETED) ? e : e2;
    }

    public boolean remove(int i, Object obj) {
        int iIndexOfKey = indexOfKey(i);
        if (iIndexOfKey < 0) {
            return false;
        }
        E eValueAt = valueAt(iIndexOfKey);
        if (obj != eValueAt && (obj == null || !obj.equals(eValueAt))) {
            return false;
        }
        removeAt(iIndexOfKey);
        return true;
    }

    public boolean replace(int i, E e, E e2) {
        int iIndexOfKey = indexOfKey(i);
        if (iIndexOfKey < 0) {
            return false;
        }
        Object obj = this.mValues[iIndexOfKey];
        if (obj != e && (e == null || !e.equals(obj))) {
            return false;
        }
        this.mValues[iIndexOfKey] = e2;
        return true;
    }
}
