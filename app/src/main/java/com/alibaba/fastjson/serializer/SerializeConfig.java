package com.alibaba.fastjson.serializer;

import com.alibaba.fastjson.PropertyNamingStrategy;
import com.alibaba.fastjson.util.IdentityHashMap;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public class SerializeConfig {
    public static final SerializeConfig globalInstance = new SerializeConfig();
    public PropertyNamingStrategy propertyNamingStrategy;
    private final IdentityHashMap<ObjectSerializer> serializers;
    protected String typeKey;

    /* JADX WARN: Invalid debug info offset */
    public static final SerializeConfig getGlobalInstance() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ObjectSerializer get(Class<?> cls) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getTypeKey() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean put(Type type, ObjectSerializer objectSerializer) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public ObjectSerializer registerIfNotExists(Class<?> cls) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ObjectSerializer registerIfNotExists(Class<?> cls, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void setTypeKey(String str) {
    }
}
