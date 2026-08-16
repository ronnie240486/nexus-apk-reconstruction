package com.alibaba.fastjson.serializer;

import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;

/* JADX INFO: loaded from: classes.dex */
public class CollectionCodec implements ObjectSerializer, ObjectDeserializer {
    public static final CollectionCodec instance = new CollectionCodec();

    /* JADX WARN: Invalid debug info offset */
    private CollectionCodec() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0089
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public <T> T deserialze(com.alibaba.fastjson.parser.DefaultJSONParser r3, java.lang.reflect.Type r4, java.lang.Object r5) {
        /*
            r2 = this;
            r0 = 0
            return r0
        L91:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.serializer.CollectionCodec.deserialze(com.alibaba.fastjson.parser.DefaultJSONParser, java.lang.reflect.Type, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0051
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    public void write(com.alibaba.fastjson.serializer.JSONSerializer r7, java.lang.Object r8, java.lang.Object r9, java.lang.reflect.Type r10) throws java.io.IOException {
        /*
            r6 = this;
            return
        L6c:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.serializer.CollectionCodec.write(com.alibaba.fastjson.serializer.JSONSerializer, java.lang.Object, java.lang.Object, java.lang.reflect.Type):void");
    }
}
