package com.alibaba.fastjson.parser;

import com.alibaba.fastjson.parser.deserializer.FieldDeserializer;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.alibaba.fastjson.util.FieldInfo;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class ListTypeFieldDeserializer extends FieldDeserializer {
    private final boolean array;
    private ObjectDeserializer deserializer;
    private final Type itemType;

    /* JADX WARN: Invalid debug info offset */
    public ListTypeFieldDeserializer(ParserConfig parserConfig, Class<?> cls, FieldInfo fieldInfo) {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void parseArray(DefaultJSONParser defaultJSONParser, Type type, Collection collection) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.alibaba.fastjson.parser.deserializer.FieldDeserializer
    public void parseField(DefaultJSONParser defaultJSONParser, Object obj, Type type, Map<String, Object> map) {
    }
}
