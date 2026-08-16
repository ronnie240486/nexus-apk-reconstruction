package com.alibaba.fastjson;

import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.deserializer.ParseProcess;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializeFilter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public abstract class JSON implements JSONStreamAware, JSONAware {
    public static final String DEFAULT_TYPE_KEY = "@type";
    public static final String VERSION = "1.1.71";
    public static TimeZone defaultTimeZone = TimeZone.getDefault();
    public static Locale defaultLocale = Locale.getDefault();
    public static int DEFAULT_PARSER_FEATURE = (Feature.UseBigDecimal.mask | Feature.SortFeidFastMatch.mask) | Feature.IgnoreNotMatch.mask;
    public static String DEFFAULT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
    public static int DEFAULT_GENERATE_FEATURE = ((SerializerFeature.QuoteFieldNames.mask | SerializerFeature.SkipTransientField.mask) | SerializerFeature.WriteEnumUsingToString.mask) | SerializerFeature.SortField.mask;

    /* JADX WARN: Invalid debug info offset */
    public static final Object parse(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static final Object parse(String str, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static Object parse(String str, ParserConfig parserConfig) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static Object parse(String str, ParserConfig parserConfig, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static Object parse(String str, ParserConfig parserConfig, Feature... featureArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static final Object parse(String str, Feature... featureArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static final Object parse(byte[] bArr, Feature... featureArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static final JSONArray parseArray(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static final JSONArray parseArray(String str, Feature... featureArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static final <T> List<T> parseArray(String str, Class<T> cls) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static final List<Object> parseArray(String str, Type[] typeArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static final JSONObject parseObject(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static final JSONObject parseObject(String str, Feature... featureArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static final <T> T parseObject(String str, TypeReference<T> typeReference, Feature... featureArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static final <T> T parseObject(String str, Class<T> cls) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static final <T> T parseObject(String str, Class<T> cls, ParseProcess parseProcess, Feature... featureArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static final <T> T parseObject(String str, Class<T> cls, Feature... featureArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static final <T> T parseObject(String str, Type type, int i, Feature... featureArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static final <T> T parseObject(String str, Type type, ParserConfig parserConfig, int i, Feature... featureArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static final <T> T parseObject(String str, Type type, ParserConfig parserConfig, ParseProcess parseProcess, int i, Feature... featureArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static <T> T parseObject(String str, Type type, ParserConfig parserConfig, Feature... featureArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static final <T> T parseObject(String str, Type type, ParseProcess parseProcess, Feature... featureArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static final <T> T parseObject(String str, Type type, Feature... featureArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static final <T> T parseObject(byte[] bArr, Type type, Feature... featureArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static final <T> T parseObject(char[] cArr, int i, Type type, Feature... featureArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static final Object toJSON(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public static final Object toJSON(Object obj, ParserConfig parserConfig) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x00ca
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static java.lang.Object toJSON(java.lang.Object r3, com.alibaba.fastjson.serializer.SerializeConfig r4) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.JSON.toJSON(java.lang.Object, com.alibaba.fastjson.serializer.SerializeConfig):java.lang.Object");
    }

    /* JADX WARN: Invalid debug info offset */
    public static byte[] toJSONBytes(Object obj, SerializeConfig serializeConfig, int i, SerializerFeature... serializerFeatureArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0006
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static byte[] toJSONBytes(java.lang.Object r4, com.alibaba.fastjson.serializer.SerializeConfig r5, com.alibaba.fastjson.serializer.SerializeFilter[] r6, int r7, com.alibaba.fastjson.serializer.SerializerFeature... r8) {
        /*
            r0 = 0
            return r0
        L25:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.JSON.toJSONBytes(java.lang.Object, com.alibaba.fastjson.serializer.SerializeConfig, com.alibaba.fastjson.serializer.SerializeFilter[], int, com.alibaba.fastjson.serializer.SerializerFeature[]):byte[]");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0008
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static final byte[] toJSONBytes(java.lang.Object r3, com.alibaba.fastjson.serializer.SerializeConfig r4, com.alibaba.fastjson.serializer.SerializerFeature... r5) {
        /*
            r0 = 0
            return r0
        L1a:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.JSON.toJSONBytes(java.lang.Object, com.alibaba.fastjson.serializer.SerializeConfig, com.alibaba.fastjson.serializer.SerializerFeature[]):byte[]");
    }

    /* JADX WARN: Invalid debug info offset */
    public static byte[] toJSONBytes(Object obj, SerializeFilter[] serializeFilterArr, SerializerFeature... serializerFeatureArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0008
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static final byte[] toJSONBytes(java.lang.Object r3, com.alibaba.fastjson.serializer.SerializerFeature... r4) {
        /*
            r0 = 0
            return r0
        L1c:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.JSON.toJSONBytes(java.lang.Object, com.alibaba.fastjson.serializer.SerializerFeature[]):byte[]");
    }

    /* JADX WARN: Invalid debug info offset */
    public static final String toJSONString(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static final String toJSONString(Object obj, int i, SerializerFeature... serializerFeatureArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static final String toJSONString(Object obj, SerializeConfig serializeConfig, SerializeFilter serializeFilter, SerializerFeature... serializerFeatureArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0006
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static java.lang.String toJSONString(java.lang.Object r5, com.alibaba.fastjson.serializer.SerializeConfig r6, com.alibaba.fastjson.serializer.SerializeFilter[] r7, java.lang.String r8, int r9, com.alibaba.fastjson.serializer.SerializerFeature... r10) {
        /*
            r0 = 0
            return r0
        L19:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.JSON.toJSONString(java.lang.Object, com.alibaba.fastjson.serializer.SerializeConfig, com.alibaba.fastjson.serializer.SerializeFilter[], java.lang.String, int, com.alibaba.fastjson.serializer.SerializerFeature[]):java.lang.String");
    }

    /* JADX WARN: Invalid debug info offset */
    public static final String toJSONString(Object obj, SerializeConfig serializeConfig, SerializeFilter[] serializeFilterArr, SerializerFeature... serializerFeatureArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static final String toJSONString(Object obj, SerializeConfig serializeConfig, SerializerFeature... serializerFeatureArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static final String toJSONString(Object obj, SerializeFilter serializeFilter, SerializerFeature... serializerFeatureArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static final String toJSONString(Object obj, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static final String toJSONString(Object obj, SerializeFilter[] serializeFilterArr, SerializerFeature... serializerFeatureArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static final String toJSONString(Object obj, SerializerFeature... serializerFeatureArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static final String toJSONStringWithDateFormat(Object obj, String str, SerializerFeature... serializerFeatureArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static final String toJSONStringZ(Object obj, SerializeConfig serializeConfig, SerializerFeature... serializerFeatureArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static final <T> T toJavaObject(JSON json, Class<T> cls) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0007
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static final void writeJSONStringTo(java.lang.Object r2, java.io.Writer r3, com.alibaba.fastjson.serializer.SerializerFeature... r4) {
        /*
            return
        L15:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.JSON.writeJSONStringTo(java.lang.Object, java.io.Writer, com.alibaba.fastjson.serializer.SerializerFeature[]):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000a
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // com.alibaba.fastjson.JSONAware
    public java.lang.String toJSONString() {
        /*
            r4 = this;
            r0 = 0
            return r0
        L1c:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.JSON.toJSONString():java.lang.String");
    }

    /* JADX WARN: Invalid debug info offset */
    public <T> T toJavaObject(Class<T> cls) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String toString() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x000a
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // com.alibaba.fastjson.JSONStreamAware
    public void writeJSONString(java.lang.Appendable r5) {
        /*
            r4 = this;
            return
        L1f:
        L21:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.JSON.writeJSONString(java.lang.Appendable):void");
    }
}
