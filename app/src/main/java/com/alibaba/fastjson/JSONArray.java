package com.alibaba.fastjson;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public class JSONArray extends JSON implements List<Object>, Cloneable, RandomAccess, Serializable {
    protected transient Type componentType;
    private final List<Object> list;
    protected transient Object relatedArray;

    /* JADX WARN: Invalid debug info offset */
    public JSONArray() {
    }

    /* JADX WARN: Invalid debug info offset */
    public JSONArray(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public JSONArray(List<Object> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.List
    public void add(int i, Object obj) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.List, java.util.Collection
    public boolean add(Object obj) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends Object> collection) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends Object> collection) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.List, java.util.Collection
    public void clear() {
    }

    /* JADX WARN: Invalid debug info offset */
    public Object clone() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.List
    public Object get(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public BigDecimal getBigDecimal(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public BigInteger getBigInteger(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Boolean getBoolean(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean getBooleanValue(int i) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public Byte getByte(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public byte getByteValue(int i) {
        return (byte) 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public Type getComponentType() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Date getDate(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Double getDouble(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public double getDoubleValue(int i) {
        return 0.0d;
    }

    /* JADX WARN: Invalid debug info offset */
    public Float getFloat(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public float getFloatValue(int i) {
        return 0.0f;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getIntValue(int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public Integer getInteger(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public JSONArray getJSONArray(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public JSONObject getJSONObject(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Long getLong(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public long getLongValue(int i) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    public <T> T getObject(int i, Class<T> cls) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Object getRelatedArray() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Short getShort(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public short getShortValue(int i) {
        return (short) 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getString(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.List
    public int indexOf(Object obj) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<Object> iterator() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.List
    public ListIterator<Object> listIterator() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.List
    public ListIterator<Object> listIterator(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.List
    public Object remove(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.List
    public Object set(int i, Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void setComponentType(Type type) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setRelatedArray(Object obj) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.List, java.util.Collection
    public int size() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.List
    public List<Object> subList(int i, int i2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public <T> List<T> toJavaList(Class<T> cls) {
        return null;
    }
}
