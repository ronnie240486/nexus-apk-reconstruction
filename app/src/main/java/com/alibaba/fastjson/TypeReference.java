package com.alibaba.fastjson;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes.dex */
public class TypeReference<T> {
    static ConcurrentMap<Type, Type> classTypeCache = new ConcurrentHashMap(16, 0.75f, 1);
    protected final Type type;

    /* JADX WARN: Invalid debug info offset */
    public TypeReference() {
    }

    /* JADX WARN: Invalid debug info offset */
    public TypeReference(Type... typeArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    private Type handlerParameterizedType(ParameterizedType parameterizedType, Type[] typeArr, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Type getType() {
        return null;
    }
}
