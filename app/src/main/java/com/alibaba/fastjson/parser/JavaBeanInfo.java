package com.alibaba.fastjson.parser;

import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.util.FieldInfo;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class JavaBeanInfo {
    final Constructor<?> creatorConstructor;
    public final String[] creatorConstructorParameters;
    final Constructor<?> defaultConstructor;
    final int defaultConstructorParameterSize;
    final Method factoryMethod;
    final FieldInfo[] fields;
    final JSONType jsonType;
    boolean ordered;
    public final int parserFeatures;
    final FieldInfo[] sortedFields;
    final boolean supportBeanToArray;
    public final String typeKey;
    public final long typeKeyHashCode;
    public final String typeName;

    /* JADX WARN: Invalid debug info offset */
    public JavaBeanInfo(Class<?> cls, Constructor<?> constructor, Constructor<?> constructor2, Method method, FieldInfo[] fieldInfoArr, FieldInfo[] fieldInfoArr2, JSONType jSONType, String[] strArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean addField(List<FieldInfo> list, FieldInfo fieldInfo, boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0026
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static com.alibaba.fastjson.parser.JavaBeanInfo build(java.lang.Class<?> r48, int r49, java.lang.reflect.Type r50, boolean r51, boolean r52, boolean r53, boolean r54, com.alibaba.fastjson.PropertyNamingStrategy r55) {
        /*
            Method dump skipped, instruction units count: 2208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JavaBeanInfo.build(java.lang.Class, int, java.lang.reflect.Type, boolean, boolean, boolean, boolean, com.alibaba.fastjson.PropertyNamingStrategy):com.alibaba.fastjson.parser.JavaBeanInfo");
    }

    /* JADX WARN: Invalid debug info offset */
    private FieldInfo[] computeSortedFields(FieldInfo[] fieldInfoArr, FieldInfo[] fieldInfoArr2) {
        return null;
    }
}
