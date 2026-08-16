package com.alibaba.fastjson.parser;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.deserializer.ExtraProcessor;
import com.alibaba.fastjson.parser.deserializer.ExtraTypeProvider;
import com.alibaba.fastjson.parser.deserializer.FieldDeserializer;
import com.alibaba.fastjson.parser.deserializer.FieldTypeResolver;
import java.io.Closeable;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class DefaultJSONParser implements Closeable {
    public static final int NONE = 0;
    public static final int NeedToResolve = 1;
    public static final int TypeNameRedirect = 2;
    public ParserConfig config;
    protected ParseContext contex;
    private ParseContext[] contextArray;
    private int contextArrayIndex;
    private DateFormat dateFormat;
    private String dateFormatPattern;
    protected List<ExtraProcessor> extraProcessors;
    protected List<ExtraTypeProvider> extraTypeProviders;
    public FieldTypeResolver fieldTypeResolver;
    public final JSONLexer lexer;
    public int resolveStatus;
    private List<ResolveTask> resolveTaskList;
    public final SymbolTable symbolTable;

    public static class ResolveTask {
        private final ParseContext context;
        public FieldDeserializer fieldDeserializer;
        public ParseContext ownerContext;
        private final String referenceValue;

        /* JADX WARN: Invalid debug info offset */
        public ResolveTask(ParseContext parseContext, String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        public static /* synthetic */ String access$000(ResolveTask resolveTask) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public static /* synthetic */ ParseContext access$100(ResolveTask resolveTask) {
            return null;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public DefaultJSONParser(JSONLexer jSONLexer) {
    }

    /* JADX WARN: Invalid debug info offset */
    public DefaultJSONParser(JSONLexer jSONLexer, ParserConfig parserConfig) {
    }

    /* JADX WARN: Invalid debug info offset */
    public DefaultJSONParser(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public DefaultJSONParser(String str, ParserConfig parserConfig) {
    }

    /* JADX WARN: Invalid debug info offset */
    public DefaultJSONParser(String str, ParserConfig parserConfig, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public DefaultJSONParser(char[] cArr, int i, ParserConfig parserConfig, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void accept(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void addResolveTask(ResolveTask resolveTask) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void checkListResolve(Collection collection) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void checkMapResolve(Map map, Object obj) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        /*
            r4 = this;
            return
        L28:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.DefaultJSONParser.close():void");
    }

    /* JADX WARN: Invalid debug info offset */
    public void config(Feature feature, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public String getDateFomartPattern() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DateFormat getDateFormat() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public List<ExtraProcessor> getExtraProcessors() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public List<ExtraTypeProvider> getExtraTypeProviders() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ResolveTask getLastResolveTask() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void handleResovleTask(Object obj) {
    }

    /* JADX WARN: Invalid debug info offset */
    public Object parse() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x00fe
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public java.lang.Object parse(java.lang.Object r7) {
        /*
            Method dump skipped, instruction units count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.DefaultJSONParser.parse(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Invalid debug info offset */
    public <T> List<T> parseArray(Class<T> cls) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void parseArray(Class<?> cls, Collection collection) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void parseArray(Type type, Collection collection) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0044
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public void parseArray(java.lang.reflect.Type r10, java.util.Collection r11, java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.DefaultJSONParser.parseArray(java.lang.reflect.Type, java.util.Collection, java.lang.Object):void");
    }

    /* JADX WARN: Invalid debug info offset */
    public final void parseArray(Collection collection) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0028
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public final void parseArray(java.util.Collection r17, java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 603
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.DefaultJSONParser.parseArray(java.util.Collection, java.lang.Object):void");
    }

    /* JADX WARN: Invalid debug info offset */
    public Object[] parseArray(Type[] typeArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Object parseArrayWithType(Type type) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public JSONObject parseObject() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public <T> T parseObject(Class<T> cls) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public <T> T parseObject(Type type) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0036
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public <T> T parseObject(java.lang.reflect.Type r4, java.lang.Object r5) {
        /*
            r3 = this;
            r0 = 0
            return r0
        L3b:
        L46:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.DefaultJSONParser.parseObject(java.lang.reflect.Type, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Invalid debug info offset */
    public Object parseObject(Map map) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0063
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public final java.lang.Object parseObject(java.util.Map r20, java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 1736
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.DefaultJSONParser.parseObject(java.util.Map, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Invalid debug info offset */
    public void parseObject(Object obj) {
    }

    /* JADX WARN: Invalid debug info offset */
    public String parseString() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void popContext() {
    }

    /* JADX WARN: Invalid debug info offset */
    public ParseContext setContext(ParseContext parseContext, Object obj, Object obj2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void setContext(ParseContext parseContext) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setDateFomrat(DateFormat dateFormat) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setDateFormat(String str) {
    }
}
