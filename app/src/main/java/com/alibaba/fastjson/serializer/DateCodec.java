package com.alibaba.fastjson.serializer;

import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import java.io.IOException;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public final class DateCodec implements ObjectSerializer, ObjectDeserializer {
    public static final DateCodec instance = new DateCodec();

    /* JADX WARN: Invalid debug info offset */
    private DateCodec() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x003c
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public <T> T cast(com.alibaba.fastjson.parser.DefaultJSONParser r3, java.lang.reflect.Type r4, java.lang.Object r5, java.lang.Object r6, java.lang.String r7) {
        /*
            r2 = this;
            r0 = 0
            return r0
        L54:
        L83:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.serializer.DateCodec.cast(com.alibaba.fastjson.parser.DefaultJSONParser, java.lang.reflect.Type, java.lang.Object, java.lang.Object, java.lang.String):java.lang.Object");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public <T> T deserialze(DefaultJSONParser defaultJSONParser, Type type, Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public <T> T deserialze(DefaultJSONParser defaultJSONParser, Type type, Object obj, String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    public void write(JSONSerializer jSONSerializer, Object obj, Object obj2, Type type) throws IOException {
    }
}
