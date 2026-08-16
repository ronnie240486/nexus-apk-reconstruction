package com.alibaba.fastjson.parser;

import com.alibaba.fastjson.parser.deserializer.FieldDeserializer;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes.dex */
public class JavaBeanDeserializer implements ObjectDeserializer {
    private final Map<String, FieldDeserializer> alterNameFieldDeserializers;
    public final JavaBeanInfo beanInfo;
    protected final Class<?> clazz;
    private ConcurrentMap<String, Object> extraFieldDeserializers;
    private final FieldDeserializer[] fieldDeserializers;
    private transient long[] smartMatchHashArray;
    private transient int[] smartMatchHashArrayMapping;
    private final FieldDeserializer[] sortedFieldDeserializers;

    /* JADX WARN: Invalid debug info offset */
    public JavaBeanDeserializer(ParserConfig parserConfig, Class<?> cls, Type type) {
    }

    /* JADX WARN: Invalid debug info offset */
    public JavaBeanDeserializer(ParserConfig parserConfig, Class<?> cls, Type type, JavaBeanInfo javaBeanInfo) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0034
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    private <T> T deserialze(com.alibaba.fastjson.parser.DefaultJSONParser r39, java.lang.reflect.Type r40, java.lang.Object r41, java.lang.Object r42) {
        /*
            Method dump skipped, instruction units count: 1959
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JavaBeanDeserializer.deserialze(com.alibaba.fastjson.parser.DefaultJSONParser, java.lang.reflect.Type, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0027
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    private <T> T deserialzeArrayMapping(com.alibaba.fastjson.parser.DefaultJSONParser r17, java.lang.reflect.Type r18, java.lang.Object r19, java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 804
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JavaBeanDeserializer.deserialzeArrayMapping(com.alibaba.fastjson.parser.DefaultJSONParser, java.lang.reflect.Type, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Invalid debug info offset */
    private boolean parseField(DefaultJSONParser defaultJSONParser, String str, Object obj, Type type, Map<String, Object> map) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0049
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public java.lang.Object createInstance(com.alibaba.fastjson.parser.DefaultJSONParser r7, java.lang.reflect.Type r8) {
        /*
            r6 = this;
            r0 = 0
            return r0
        L54:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JavaBeanDeserializer.createInstance(com.alibaba.fastjson.parser.DefaultJSONParser, java.lang.reflect.Type):java.lang.Object");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x00f7
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public java.lang.Object createInstance(java.util.Map<java.lang.String, java.lang.Object> r11, com.alibaba.fastjson.parser.ParserConfig r12) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JavaBeanDeserializer.createInstance(java.util.Map, com.alibaba.fastjson.parser.ParserConfig):java.lang.Object");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public <T> T deserialze(DefaultJSONParser defaultJSONParser, Type type, Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public FieldDeserializer getFieldDeserializer(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public FieldDeserializer getFieldDeserializerByHash(long j) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public JavaBeanDeserializer getSeeAlso(ParserConfig parserConfig, JavaBeanInfo javaBeanInfo, String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void parseExtra(DefaultJSONParser defaultJSONParser, Object obj, String str) {
    }
}
