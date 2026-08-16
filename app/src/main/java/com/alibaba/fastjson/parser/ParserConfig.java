package com.alibaba.fastjson.parser;

import com.alibaba.fastjson.PropertyNamingStrategy;
import com.alibaba.fastjson.parser.deserializer.FieldDeserializer;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.alibaba.fastjson.util.FieldInfo;
import com.alibaba.fastjson.util.IdentityHashMap;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public class ParserConfig {
    private static long[] denyList = {-7600952144447537354L, -4082057040235125754L, -2364987994247679115L, -676156662527871184L, -254670111376247151L, 1502845958873959152L, 4147696707147271408L, 5347909877633654828L, 5751393439502795295L, 7702607466162283393L};
    public static ParserConfig global = new ParserConfig();
    public boolean autoTypeSupport;
    public ClassLoader defaultClassLoader;
    private final IdentityHashMap<ObjectDeserializer> deserializers;
    public PropertyNamingStrategy propertyNamingStrategy;
    public final SymbolTable symbolTable;

    /* JADX WARN: Invalid debug info offset */
    public static ParserConfig getGlobalInstance() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean isPrimitive(Class<?> cls) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public Class<?> checkAutoType(String str, Class<?> cls, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean containsKey(Class cls) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public FieldDeserializer createFieldDeserializer(ParserConfig parserConfig, Class<?> cls, FieldInfo fieldInfo) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ObjectDeserializer getDeserializer(Class<?> cls, Type type) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ObjectDeserializer getDeserializer(Type type) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void putDeserializer(Type type, ObjectDeserializer objectDeserializer) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ObjectDeserializer registerIfNotExists(Class<?> cls) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ObjectDeserializer registerIfNotExists(Class<?> cls, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        return null;
    }
}
