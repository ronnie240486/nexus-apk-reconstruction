package com.alibaba.fastjson.serializer;

/* JADX INFO: loaded from: classes.dex */
public abstract class BeforeFilter implements SerializeFilter {
    private static final ThreadLocal<JSONSerializer> serializerLocal = new ThreadLocal<>();
    private static final ThreadLocal<Character> seperatorLocal = new ThreadLocal<>();
    private static final Character COMMA = ',';

    /* JADX WARN: Invalid debug info offset */
    public final char writeBefore(JSONSerializer jSONSerializer, Object obj, char c) {
        return (char) 0;
    }

    public abstract void writeBefore(Object obj);

    /* JADX WARN: Invalid debug info offset */
    public final void writeKeyValue(String str, Object obj) {
    }
}
