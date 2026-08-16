package com.alibaba.fastjson.serializer;

/* JADX INFO: loaded from: classes.dex */
final class ArraySerializer implements ObjectSerializer {
    private final ObjectSerializer compObjectSerializer;
    private final Class<?> componentType;

    /* JADX WARN: Invalid debug info offset */
    public ArraySerializer(Class<?> cls, ObjectSerializer objectSerializer) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x013d
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    public final void write(com.alibaba.fastjson.serializer.JSONSerializer r10, java.lang.Object r11, java.lang.Object r12, java.lang.reflect.Type r13) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.serializer.ArraySerializer.write(com.alibaba.fastjson.serializer.JSONSerializer, java.lang.Object, java.lang.Object, java.lang.reflect.Type):void");
    }
}
