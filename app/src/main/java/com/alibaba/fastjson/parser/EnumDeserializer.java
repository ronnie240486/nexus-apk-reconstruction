package com.alibaba.fastjson.parser;

import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;

/* JADX INFO: loaded from: classes.dex */
public class EnumDeserializer implements ObjectDeserializer {
    private final Class<?> enumClass;
    protected long[] enumNameHashCodes;
    protected final Enum[] enums;
    protected final Enum[] ordinalEnums;

    /* JADX WARN: Invalid debug info offset */
    public EnumDeserializer(Class<?> cls) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:6:0x0021
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:143)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public <T> T deserialze(com.alibaba.fastjson.parser.DefaultJSONParser r6, java.lang.reflect.Type r7, java.lang.Object r8) {
        /*
            r5 = this;
            r0 = 0
            return r0
        L1e:
        L21:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.EnumDeserializer.deserialze(com.alibaba.fastjson.parser.DefaultJSONParser, java.lang.reflect.Type, java.lang.Object):java.lang.Object");
    }
}
