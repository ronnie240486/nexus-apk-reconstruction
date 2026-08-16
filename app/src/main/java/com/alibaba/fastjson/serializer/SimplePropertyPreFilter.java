package com.alibaba.fastjson.serializer;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class SimplePropertyPreFilter implements PropertyPreFilter {
    private final Class<?> clazz;
    private final Set<String> excludes;
    private final Set<String> includes;
    private int maxLevel;

    /* JADX WARN: Invalid debug info offset */
    public SimplePropertyPreFilter(Class<?> cls, String... strArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public SimplePropertyPreFilter(String... strArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.alibaba.fastjson.serializer.PropertyPreFilter
    public boolean apply(JSONSerializer jSONSerializer, Object obj, String str) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public Class<?> getClazz() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Set<String> getExcludes() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Set<String> getIncludes() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getMaxLevel() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public void setMaxLevel(int i) {
    }
}
