package com.alibaba.fastjson.serializer;

import com.alibaba.fastjson.PropertyNamingStrategy;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class JavaBeanSerializer implements ObjectSerializer {
    protected int features;
    private final FieldSerializer[] getters;
    private final FieldSerializer[] sortedGetters;
    protected final String typeKey;
    protected final String typeName;
    private static final char[] true_chars = {'t', 'r', 'u', 'e'};
    private static final char[] false_chars = {'f', 'a', 'l', 's', 'e'};

    /* JADX WARN: Invalid debug info offset */
    public JavaBeanSerializer(Class<?> cls) {
    }

    /* JADX WARN: Invalid debug info offset */
    public JavaBeanSerializer(Class<?> cls, int i, Map<String, String> map, boolean z, boolean z2, boolean z3, boolean z4, PropertyNamingStrategy propertyNamingStrategy) {
    }

    /* JADX WARN: Invalid debug info offset */
    public JavaBeanSerializer(Class<?> cls, PropertyNamingStrategy propertyNamingStrategy) {
    }

    /* JADX WARN: Invalid debug info offset */
    public JavaBeanSerializer(Class<?> cls, String... strArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    private static Map<String, String> map(String... strArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Map<String, Object> getFieldValuesMap(Object obj) throws Exception {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0081
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    public void write(com.alibaba.fastjson.serializer.JSONSerializer r38, java.lang.Object r39, java.lang.Object r40, java.lang.reflect.Type r41) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1563
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.serializer.JavaBeanSerializer.write(com.alibaba.fastjson.serializer.JSONSerializer, java.lang.Object, java.lang.Object, java.lang.reflect.Type):void");
    }
}
