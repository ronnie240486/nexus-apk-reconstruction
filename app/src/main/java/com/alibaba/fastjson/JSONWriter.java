package com.alibaba.fastjson;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: classes.dex */
public class JSONWriter implements Closeable, Flushable {
    private JSONStreamContext context;
    private JSONSerializer serializer;
    private SerializeWriter writer;

    /* JADX WARN: Invalid debug info offset */
    public JSONWriter(Writer writer) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void afterWriter() {
    }

    /* JADX WARN: Invalid debug info offset */
    private void beforeWrite() {
    }

    /* JADX WARN: Invalid debug info offset */
    private void beginStructure() {
    }

    /* JADX WARN: Invalid debug info offset */
    private void endStructure() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public void config(SerializerFeature serializerFeature, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void endArray() {
    }

    /* JADX WARN: Invalid debug info offset */
    public void endObject() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.Flushable
    public void flush() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public void startArray() {
    }

    /* JADX WARN: Invalid debug info offset */
    public void startObject() {
    }

    /* JADX WARN: Invalid debug info offset */
    public void writeKey(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void writeObject(Object obj) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void writeObject(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void writeValue(Object obj) {
    }
}
