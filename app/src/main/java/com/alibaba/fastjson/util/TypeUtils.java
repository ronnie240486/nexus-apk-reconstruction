package com.alibaba.fastjson.util;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.PropertyNamingStrategy;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.parser.ParserConfig;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes.dex */
public class TypeUtils {
    public static boolean compatibleWithJavaBean = false;
    private static volatile Map<Class, String[]> kotlinIgnores = null;
    private static volatile boolean kotlinIgnores_error = false;
    private static volatile boolean kotlin_class_klass_error = false;
    private static volatile boolean kotlin_error = false;
    private static volatile Constructor kotlin_kclass_constructor = null;
    private static volatile Method kotlin_kclass_getConstructors = null;
    private static volatile Method kotlin_kfunction_getParameters = null;
    private static volatile Method kotlin_kparameter_getName = null;
    private static volatile Class kotlin_metadata = null;
    private static volatile boolean kotlin_metadata_error = false;
    private static final ConcurrentMap<String, Class<?>> mappings;
    private static boolean setAccessibleEnable = true;

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(36, 0.75f, 1);
        mappings = concurrentHashMap;
        concurrentHashMap.put("byte", Byte.TYPE);
        concurrentHashMap.put("short", Short.TYPE);
        concurrentHashMap.put("int", Integer.TYPE);
        concurrentHashMap.put("long", Long.TYPE);
        concurrentHashMap.put("float", Float.TYPE);
        concurrentHashMap.put("double", Double.TYPE);
        concurrentHashMap.put("boolean", Boolean.TYPE);
        concurrentHashMap.put("char", Character.TYPE);
        concurrentHashMap.put("[byte", byte[].class);
        concurrentHashMap.put("[short", short[].class);
        concurrentHashMap.put("[int", int[].class);
        concurrentHashMap.put("[long", long[].class);
        concurrentHashMap.put("[float", float[].class);
        concurrentHashMap.put("[double", double[].class);
        concurrentHashMap.put("[boolean", boolean[].class);
        concurrentHashMap.put("[char", char[].class);
        concurrentHashMap.put("[B", byte[].class);
        concurrentHashMap.put("[S", short[].class);
        concurrentHashMap.put("[I", int[].class);
        concurrentHashMap.put("[J", long[].class);
        concurrentHashMap.put("[F", float[].class);
        concurrentHashMap.put("[D", double[].class);
        concurrentHashMap.put("[C", char[].class);
        concurrentHashMap.put("[Z", boolean[].class);
        concurrentHashMap.put("java.util.HashMap", HashMap.class);
        concurrentHashMap.put("java.util.TreeMap", TreeMap.class);
        concurrentHashMap.put("java.util.Date", Date.class);
        concurrentHashMap.put("com.alibaba.fastjson.JSONObject", JSONObject.class);
        concurrentHashMap.put("java.util.concurrent.ConcurrentHashMap", ConcurrentHashMap.class);
        concurrentHashMap.put("java.text.SimpleDateFormat", SimpleDateFormat.class);
        concurrentHashMap.put("java.lang.StackTraceElement", StackTraceElement.class);
        concurrentHashMap.put("java.lang.RuntimeException", RuntimeException.class);
    }

    /* JADX WARN: Invalid debug info offset */
    public static void addMapping(String str, Class<?> cls) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static final <T> T cast(Object obj, Class<T> cls, ParserConfig parserConfig) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0121
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static final <T> T cast(java.lang.Object r4, java.lang.Class<T> r5, com.alibaba.fastjson.parser.ParserConfig r6, int r7) {
        /*
            Method dump skipped, instruction units count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.util.TypeUtils.cast(java.lang.Object, java.lang.Class, com.alibaba.fastjson.parser.ParserConfig, int):java.lang.Object");
    }

    /* JADX WARN: Invalid debug info offset */
    public static final <T> T cast(Object obj, ParameterizedType parameterizedType, ParserConfig parserConfig) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static final <T> T cast(Object obj, Type type, ParserConfig parserConfig) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static final BigDecimal castToBigDecimal(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static final BigInteger castToBigInteger(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static final Boolean castToBoolean(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static final Byte castToByte(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static final byte[] castToBytes(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static final Character castToChar(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x00a6
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static final java.util.Date castToDate(java.lang.Object r6) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.util.TypeUtils.castToDate(java.lang.Object):java.util.Date");
    }

    /* JADX WARN: Invalid debug info offset */
    public static final Double castToDouble(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static final <T> T castToEnum(java.lang.Object r2, java.lang.Class<T> r3, com.alibaba.fastjson.parser.ParserConfig r4) {
        /*
            r0 = 0
            return r0
        L15:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.util.TypeUtils.castToEnum(java.lang.Object, java.lang.Class, com.alibaba.fastjson.parser.ParserConfig):java.lang.Object");
    }

    /* JADX WARN: Invalid debug info offset */
    public static final Float castToFloat(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static final Integer castToInt(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static final <T> T castToJavaBean(Object obj, Class<T> cls) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static final <T> T castToJavaBean(Map<String, Object> map, Class<T> cls, ParserConfig parserConfig) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static final <T> T castToJavaBean(Map<String, Object> map, Class<T> cls, ParserConfig parserConfig, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0045
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static final java.lang.Long castToLong(java.lang.Object r4) {
        /*
            r0 = 0
            return r0
        L4e:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.util.TypeUtils.castToLong(java.lang.Object):java.lang.Long");
    }

    /* JADX WARN: Invalid debug info offset */
    public static final Short castToShort(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static final String castToString(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0021
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static java.lang.reflect.Type checkPrimitiveArray(java.lang.reflect.GenericArrayType r3) {
        /*
            r0 = 0
            return r0
        Lbb:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.util.TypeUtils.checkPrimitiveArray(java.lang.reflect.GenericArrayType):java.lang.reflect.Type");
    }

    /* JADX WARN: Invalid debug info offset */
    public static List<FieldInfo> computeGetters(Class<?> cls, int i, boolean z, JSONType jSONType, Map<String, String> map, boolean z2, boolean z3, boolean z4, PropertyNamingStrategy propertyNamingStrategy) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static String decapitalize(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static Object defaultValue(Class<?> cls) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static long fnv_64_lower(String str) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean getArgument(Type[] typeArr, TypeVariable[] typeVariableArr, Type[] typeArr2) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public static Class<?> getClass(Type type) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static Class<?> getClassFromMapping(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static Type getCollectionItemType(Type type) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static Field getField(Class<?> cls, String str, Field[] fieldArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static Field getField(Class<?> cls, String str, Field[] fieldArr, Map<Class<?>, Field[]> map) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private static Field getField0(Class<?> cls, String str, Field[] fieldArr, Map<Class<?>, Field[]> map) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static Type getGenericParamType(Type type) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000b
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static java.lang.String[] getKoltinConstructorParameters(java.lang.Class r6) {
        /*
            r0 = 0
            return r0
        L3a:
        La2:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.util.TypeUtils.getKoltinConstructorParameters(java.lang.Class):java.lang.String[]");
    }

    /* JADX WARN: Invalid debug info offset */
    public static JSONField getSupperMethodAnnotation(Class<?> cls, Method method) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean isGenericParamType(Type type) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    private static boolean isJSONTypeIgnore(Class<?> cls, JSONType jSONType, String str) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0008
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static boolean isKotlin(java.lang.Class r1) {
        /*
            r0 = 0
            return r0
        Ld:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.util.TypeUtils.isKotlin(java.lang.Class):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000d
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    private static boolean isKotlinIgnore(java.lang.Class r6, java.lang.String r7) {
        /*
            r0 = 0
            return r0
        L4e:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.util.TypeUtils.isKotlinIgnore(java.lang.Class, java.lang.String):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    public static Class<?> loadClass(String str, ClassLoader classLoader) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x005c
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static java.lang.Class<?> loadClass(java.lang.String r7, java.lang.ClassLoader r8, boolean r9) {
        /*
            r0 = 0
            return r0
        L66:
        L7e:
        L87:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.util.TypeUtils.loadClass(java.lang.String, java.lang.ClassLoader, boolean):java.lang.Class");
    }

    /* JADX WARN: Invalid debug info offset */
    public static double parseDouble(String str) {
        return 0.0d;
    }

    /* JADX WARN: Invalid debug info offset */
    public static float parseFloat(String str) {
        return 0.0f;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0021
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static boolean setAccessible(java.lang.Class<?> r3, java.lang.reflect.Member r4, int r5) {
        /*
            r0 = 0
            return r0
        L25:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.util.TypeUtils.setAccessible(java.lang.Class, java.lang.reflect.Member, int):boolean");
    }
}
