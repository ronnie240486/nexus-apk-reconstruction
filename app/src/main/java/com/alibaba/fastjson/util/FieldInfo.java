package com.alibaba.fastjson.util;

import com.alibaba.fastjson.annotation.JSONField;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public class FieldInfo implements Comparable<FieldInfo> {
    public final String[] alternateNames;
    public final Class<?> declaringClass;
    public final Field field;
    public final boolean fieldAccess;
    private final JSONField fieldAnnotation;
    public final Class<?> fieldClass;
    public final boolean fieldTransient;
    public final Type fieldType;
    public final String format;
    public final boolean getOnly;
    public final boolean isEnum;
    public final Method method;
    private final JSONField methodAnnotation;
    public final String name;
    public final long nameHashCode;
    private int ordinal;
    public final int serialzeFeatures;

    /* JADX WARN: Invalid debug info offset */
    public FieldInfo(String str, Class<?> cls, Class<?> cls2, Type type, Field field, int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public FieldInfo(String str, Method method, Field field, Class<?> cls, Type type, int i, int i2, JSONField jSONField, JSONField jSONField2, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static Type getFieldType(Class<?> cls, Type type, Type type2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(FieldInfo fieldInfo) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(FieldInfo fieldInfo) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean equals(FieldInfo fieldInfo) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public Object get(Object obj) throws IllegalAccessException, InvocationTargetException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public JSONField getAnnotation() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void set(Object obj, Object obj2) throws IllegalAccessException, InvocationTargetException {
    }

    /* JADX WARN: Invalid debug info offset */
    public String toString() {
        return null;
    }
}
