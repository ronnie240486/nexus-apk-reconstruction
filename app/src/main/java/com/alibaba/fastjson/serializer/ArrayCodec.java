package com.alibaba.fastjson.serializer;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public final class ArrayCodec implements ObjectSerializer, ObjectDeserializer {
    public static final ArrayCodec instance = new ArrayCodec();

    /* JADX WARN: Invalid debug info offset */
    private ArrayCodec() {
    }

    /* JADX WARN: Invalid debug info offset */
    private <T> T toObjectArray(DefaultJSONParser defaultJSONParser, Class<?> cls, JSONArray jSONArray) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public <T> T deserialze(DefaultJSONParser defaultJSONParser, Type type, Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x002c
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    public final void write(com.alibaba.fastjson.serializer.JSONSerializer r10, java.lang.Object r11, java.lang.Object r12, java.lang.reflect.Type r13) throws java.io.IOException {
        /*
            r9 = this;
            return
        L4d:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.serializer.ArrayCodec.write(com.alibaba.fastjson.serializer.JSONSerializer, java.lang.Object, java.lang.Object, java.lang.reflect.Type):void");
    }
}
