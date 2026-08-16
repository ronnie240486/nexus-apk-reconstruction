package com.alibaba.fastjson.serializer;

import java.text.DateFormat;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public class JSONSerializer {
    protected List<AfterFilter> afterFilters;
    protected List<BeforeFilter> beforeFilters;
    public final SerializeConfig config;
    protected SerialContext context;
    private DateFormat dateFormat;
    private String dateFormatPattern;
    private int indentCount;
    public Locale locale;
    protected List<NameFilter> nameFilters;
    public final SerializeWriter out;
    protected List<PropertyFilter> propertyFilters;
    protected List<PropertyPreFilter> propertyPreFilters;
    protected IdentityHashMap<Object, SerialContext> references;
    public TimeZone timeZone;
    protected List<ValueFilter> valueFilters;

    /* JADX WARN: Invalid debug info offset */
    public JSONSerializer() {
    }

    /* JADX WARN: Invalid debug info offset */
    public JSONSerializer(SerializeConfig serializeConfig) {
    }

    /* JADX WARN: Invalid debug info offset */
    public JSONSerializer(SerializeWriter serializeWriter) {
    }

    /* JADX WARN: Invalid debug info offset */
    public JSONSerializer(SerializeWriter serializeWriter, SerializeConfig serializeConfig) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static Object processValue(JSONSerializer jSONSerializer, Object obj, Object obj2, Object obj3) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static final void write(SerializeWriter serializeWriter, Object obj) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x000a
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static final void write(java.io.Writer r4, java.lang.Object r5) {
        /*
            return
        L1b:
        L1d:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.serializer.JSONSerializer.write(java.io.Writer, java.lang.Object):void");
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean apply(Object obj, Object obj2, Object obj3) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean applyName(Object obj, Object obj2) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public void close() {
    }

    /* JADX WARN: Invalid debug info offset */
    public void config(SerializerFeature serializerFeature, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void decrementIdent() {
    }

    /* JADX WARN: Invalid debug info offset */
    public List<AfterFilter> getAfterFilters() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public List<BeforeFilter> getBeforeFilters() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public SerialContext getContext() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DateFormat getDateFormat() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getDateFormatPattern() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public List<NameFilter> getNameFilters() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public List<PropertyFilter> getPropertyFilters() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public List<PropertyPreFilter> getPropertyPreFilters() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public List<ValueFilter> getValueFilters() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public SerializeWriter getWriter() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void incrementIndent() {
    }

    /* JADX WARN: Invalid debug info offset */
    public void println() {
    }

    /* JADX WARN: Invalid debug info offset */
    public Object processKey(Object obj, Object obj2, Object obj3) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void setContext(SerialContext serialContext, Object obj, Object obj2, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setDateFormat(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setDateFormat(DateFormat dateFormat) {
    }

    /* JADX WARN: Invalid debug info offset */
    public String toString() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0013
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public final void write(java.lang.Object r3) {
        /*
            r2 = this;
            return
        L17:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.serializer.JSONSerializer.write(java.lang.Object):void");
    }

    /* JADX WARN: Invalid debug info offset */
    public final void write(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void writeKeyValue(char c, String str, Object obj) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void writeReference(Object obj) {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void writeWithFieldName(Object obj, Object obj2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public final void writeWithFieldName(java.lang.Object r2, java.lang.Object r3, java.lang.reflect.Type r4, int r5) {
        /*
            r1 = this;
            return
        L8:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.serializer.JSONSerializer.writeWithFieldName(java.lang.Object, java.lang.Object, java.lang.reflect.Type, int):void");
    }

    /* JADX WARN: Invalid debug info offset */
    public final void writeWithFormat(Object obj, String str) {
    }
}
