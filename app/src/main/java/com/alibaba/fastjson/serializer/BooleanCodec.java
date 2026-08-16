package com.alibaba.fastjson.serializer;

import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import java.io.IOException;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public final class BooleanCodec implements ObjectSerializer, ObjectDeserializer {
    public static final BooleanCodec instance = new BooleanCodec();

    /* JADX WARN: Invalid debug info offset */
    private BooleanCodec() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public <T> T deserialze(DefaultJSONParser defaultJSONParser, Type type, Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    public void write(JSONSerializer jSONSerializer, Object obj, Object obj2, Type type) throws IOException {
    }
}
