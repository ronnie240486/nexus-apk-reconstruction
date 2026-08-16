package org.slf4j.spi;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface MDCAdapter {
    /* JADX INFO: renamed from: a */
    void mo25084a(String str, String str2);

    /* JADX INFO: renamed from: b */
    void mo25085b(Map<String, String> map);

    /* JADX INFO: renamed from: c */
    void mo25086c(String str);

    void clear();

    /* JADX INFO: renamed from: d */
    Map<String, String> mo25087d();

    String get(String str);
}
