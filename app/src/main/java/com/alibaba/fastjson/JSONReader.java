package com.alibaba.fastjson;

import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.JSONLexer;
import java.io.Closeable;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class JSONReader implements Closeable {
    private JSONStreamContext context;
    private final DefaultJSONParser parser;
    private Reader reader;

    /* JADX WARN: Invalid debug info offset */
    public JSONReader(DefaultJSONParser defaultJSONParser) {
    }

    /* JADX WARN: Invalid debug info offset */
    public JSONReader(JSONLexer jSONLexer) {
    }

    /* JADX WARN: Invalid debug info offset */
    public JSONReader(Reader reader) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void endStructure() {
    }

    /* JADX WARN: Invalid debug info offset */
    private void readAfter() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0007
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static java.lang.String readAll(java.io.Reader r5) {
        /*
            r0 = 0
            return r0
        L19:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.JSONReader.readAll(java.io.Reader):java.lang.String");
    }

    /* JADX WARN: Invalid debug info offset */
    private void readBefore() {
    }

    /* JADX WARN: Invalid debug info offset */
    private void startStructure() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x000b
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        /*
            r3 = this;
            return
        Lf:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.JSONReader.close():void");
    }

    /* JADX WARN: Invalid debug info offset */
    public void config(Feature feature, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void endArray() {
    }

    /* JADX WARN: Invalid debug info offset */
    public void endObject() {
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean hasNext() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public int peek() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public Integer readInteger() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Long readLong() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Object readObject() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public <T> T readObject(TypeReference<T> typeReference) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public <T> T readObject(Class<T> cls) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public <T> T readObject(Type type) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Object readObject(Map map) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void readObject(Object obj) {
    }

    /* JADX WARN: Invalid debug info offset */
    public String readString() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void startArray() {
    }

    /* JADX WARN: Invalid debug info offset */
    public void startObject() {
    }
}
