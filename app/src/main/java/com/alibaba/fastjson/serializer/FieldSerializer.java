package com.alibaba.fastjson.serializer;

import com.alibaba.fastjson.util.FieldInfo;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class FieldSerializer implements Comparable<FieldSerializer> {
    protected final int features;
    public final FieldInfo fieldInfo;
    protected final String format;
    protected char[] name_chars;
    private RuntimeSerializerInfo runtimeInfo;
    protected final boolean writeNull;

    public static class RuntimeSerializerInfo {
        ObjectSerializer fieldSerializer;
        Class<?> runtimeFieldClass;

        /* JADX WARN: Invalid debug info offset */
        public RuntimeSerializerInfo(ObjectSerializer objectSerializer, Class<?> cls) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public FieldSerializer(FieldInfo fieldInfo) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(FieldSerializer fieldSerializer) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(FieldSerializer fieldSerializer) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public Object getPropertyValue(Object obj) throws Exception {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void writePrefix(JSONSerializer jSONSerializer) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public void writeValue(JSONSerializer jSONSerializer, Object obj) throws Exception {
    }
}
