package com.alibaba.fastjson.parser;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public class ParseContext {
    public final Object fieldName;
    public Object object;
    public final ParseContext parent;
    private transient String path;
    public Type type;

    /* JADX WARN: Invalid debug info offset */
    public ParseContext(ParseContext parseContext, Object obj, Object obj2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public String toString() {
        return null;
    }
}
