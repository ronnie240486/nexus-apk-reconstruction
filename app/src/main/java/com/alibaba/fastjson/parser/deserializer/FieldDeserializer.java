package com.alibaba.fastjson.parser.deserializer;

import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.util.FieldInfo;
import java.lang.reflect.Type;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class FieldDeserializer {
    public final Class<?> clazz;
    protected long[] enumNameHashCodes;
    protected Enum[] enums;
    public final FieldInfo fieldInfo;

    /* JADX WARN: Invalid debug info offset */
    public FieldDeserializer(Class<?> cls, FieldInfo fieldInfo, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public Enum getEnumByHashCode(long j) {
        return null;
    }

    public abstract void parseField(DefaultJSONParser defaultJSONParser, Object obj, Type type, Map<String, Object> map);

    /* JADX WARN: Invalid debug info offset */
    public void setValue(Object obj, double d) throws IllegalAccessException {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setValue(Object obj, float f) throws IllegalAccessException {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setValue(Object obj, int i) throws IllegalAccessException {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setValue(Object obj, long j) throws IllegalAccessException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0013
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public void setValue(java.lang.Object r6, java.lang.Object r7) {
        /*
            r5 = this;
            return
        L33:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.deserializer.FieldDeserializer.setValue(java.lang.Object, java.lang.Object):void");
    }
}
