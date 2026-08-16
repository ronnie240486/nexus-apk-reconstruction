package com.alibaba.fastjson.parser;

import com.alibaba.fastjson.parser.deserializer.FieldDeserializer;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class ResolveFieldDeserializer extends FieldDeserializer {
    private final Collection collection;
    private final int index;
    private final Object key;
    private final List list;
    private final Map map;
    private final DefaultJSONParser parser;

    /* JADX WARN: Invalid debug info offset */
    public ResolveFieldDeserializer(DefaultJSONParser defaultJSONParser, List list, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ResolveFieldDeserializer(Collection collection) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ResolveFieldDeserializer(Map map, Object obj) {
    }

    @Override // com.alibaba.fastjson.parser.deserializer.FieldDeserializer
    public void parseField(DefaultJSONParser defaultJSONParser, Object obj, Type type, Map<String, Object> map) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.alibaba.fastjson.parser.deserializer.FieldDeserializer
    public void setValue(Object obj, Object obj2) {
    }
}
