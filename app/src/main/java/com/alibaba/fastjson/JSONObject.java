package com.alibaba.fastjson;

import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.ParserConfig;
import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class JSONObject extends JSON implements Map<String, Object>, Cloneable, Serializable, InvocationHandler {
    private final Map<String, Object> map;

    /* JADX WARN: Invalid debug info offset */
    public JSONObject() {
    }

    /* JADX WARN: Invalid debug info offset */
    public JSONObject(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public JSONObject(int i, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public JSONObject(Map<String, Object> map) {
    }

    /* JADX WARN: Invalid debug info offset */
    public JSONObject(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.Map
    public void clear() {
    }

    /* JADX WARN: Invalid debug info offset */
    public Object clone() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.Map
    public Set<Map.Entry<String, Object>> entrySet() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.Map
    public boolean equals(Object obj) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.Map
    public Object get(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public BigDecimal getBigDecimal(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public BigInteger getBigInteger(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Boolean getBoolean(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean getBooleanValue(String str) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public Byte getByte(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public byte getByteValue(String str) {
        return (byte) 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public byte[] getBytes(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Date getDate(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Double getDouble(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public double getDoubleValue(String str) {
        return 0.0d;
    }

    /* JADX WARN: Invalid debug info offset */
    public Float getFloat(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public float getFloatValue(String str) {
        return 0.0f;
    }

    /* JADX WARN: Invalid debug info offset */
    public Map<String, Object> getInnerMap() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getIntValue(String str) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public Integer getInteger(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public JSONArray getJSONArray(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public JSONObject getJSONObject(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Long getLong(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public long getLongValue(String str) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    public <T> T getObject(String str, Class<T> cls) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public <T> T getObject(String str, Class<T> cls, Feature... featureArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Short getShort(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public short getShortValue(String str) {
        return (short) 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getString(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.Map
    public int hashCode() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.Map
    public boolean isEmpty() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.Map
    public Set<String> keySet() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object put(String str, Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: put, reason: avoid collision after fix types in other method */
    public Object put2(String str, Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.Map
    public void putAll(Map<? extends String, ? extends Object> map) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.Map
    public Object remove(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.Map
    public int size() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.alibaba.fastjson.JSON
    public <T> T toJavaObject(Class<T> cls) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public <T> T toJavaObject(Class<T> cls, ParserConfig parserConfig, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.Map
    public Collection<Object> values() {
        return null;
    }
}
