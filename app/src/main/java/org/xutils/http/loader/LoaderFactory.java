package org.xutils.http.loader;

import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class LoaderFactory {

    /* JADX INFO: renamed from: a */
    public static final HashMap<Type, Loader> f18218a;

    static {
        HashMap<Type, Loader> map = new HashMap<>();
        f18218a = map;
        map.put(JSONObject.class, new JSONObjectLoader());
        map.put(JSONArray.class, new JSONArrayLoader());
        map.put(String.class, new StringLoader());
        map.put(File.class, new FileLoader());
        map.put(byte[].class, new ByteArrayLoader());
        map.put(InputStream.class, new InputStreamLoader());
        BooleanLoader booleanLoader = new BooleanLoader();
        map.put(Boolean.TYPE, booleanLoader);
        map.put(Boolean.class, booleanLoader);
        IntegerLoader integerLoader = new IntegerLoader();
        map.put(Integer.TYPE, integerLoader);
        map.put(Integer.class, integerLoader);
    }

    /* JADX WARN: Invalid debug info offset */
    private LoaderFactory() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static Loader<?> m27158a(Type type) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static <T> void m27159b(Type type, Loader<T> loader) {
    }
}
