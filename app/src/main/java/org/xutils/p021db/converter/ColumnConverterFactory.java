package org.xutils.p021db.converter;

import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ColumnConverterFactory {

    /* JADX INFO: renamed from: a */
    public static final ConcurrentHashMap<String, ColumnConverter> f18040a;

    static {
        ConcurrentHashMap<String, ColumnConverter> concurrentHashMap = new ConcurrentHashMap<>();
        f18040a = concurrentHashMap;
        BooleanColumnConverter booleanColumnConverter = new BooleanColumnConverter();
        concurrentHashMap.put(Boolean.TYPE.getName(), booleanColumnConverter);
        concurrentHashMap.put(Boolean.class.getName(), booleanColumnConverter);
        concurrentHashMap.put(byte[].class.getName(), new ByteArrayColumnConverter());
        ByteColumnConverter byteColumnConverter = new ByteColumnConverter();
        concurrentHashMap.put(Byte.TYPE.getName(), byteColumnConverter);
        concurrentHashMap.put(Byte.class.getName(), byteColumnConverter);
        CharColumnConverter charColumnConverter = new CharColumnConverter();
        concurrentHashMap.put(Character.TYPE.getName(), charColumnConverter);
        concurrentHashMap.put(Character.class.getName(), charColumnConverter);
        concurrentHashMap.put(Date.class.getName(), new DateColumnConverter());
        DoubleColumnConverter doubleColumnConverter = new DoubleColumnConverter();
        concurrentHashMap.put(Double.TYPE.getName(), doubleColumnConverter);
        concurrentHashMap.put(Double.class.getName(), doubleColumnConverter);
        FloatColumnConverter floatColumnConverter = new FloatColumnConverter();
        concurrentHashMap.put(Float.TYPE.getName(), floatColumnConverter);
        concurrentHashMap.put(Float.class.getName(), floatColumnConverter);
        IntegerColumnConverter integerColumnConverter = new IntegerColumnConverter();
        concurrentHashMap.put(Integer.TYPE.getName(), integerColumnConverter);
        concurrentHashMap.put(Integer.class.getName(), integerColumnConverter);
        LongColumnConverter longColumnConverter = new LongColumnConverter();
        concurrentHashMap.put(Long.TYPE.getName(), longColumnConverter);
        concurrentHashMap.put(Long.class.getName(), longColumnConverter);
        ShortColumnConverter shortColumnConverter = new ShortColumnConverter();
        concurrentHashMap.put(Short.TYPE.getName(), shortColumnConverter);
        concurrentHashMap.put(Short.class.getName(), shortColumnConverter);
        concurrentHashMap.put(java.sql.Date.class.getName(), new SqlDateColumnConverter());
        concurrentHashMap.put(String.class.getName(), new StringColumnConverter());
    }

    /* JADX WARN: Invalid debug info offset */
    private ColumnConverterFactory() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x001f
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    public static org.xutils.p021db.converter.ColumnConverter m26894a(java.lang.Class r3) {
        /*
            r0 = 0
            return r0
        L2e:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xutils.p021db.converter.ColumnConverterFactory.m26894a(java.lang.Class):org.xutils.db.converter.ColumnConverter");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0016
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: b */
    public static boolean m26895b(java.lang.Class r3) {
        /*
            r0 = 0
            return r0
        L24:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xutils.p021db.converter.ColumnConverterFactory.m26895b(java.lang.Class):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public static void m26896c(Class cls, ColumnConverter columnConverter) {
    }
}
