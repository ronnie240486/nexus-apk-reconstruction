package org.slf4j.helpers;

import java.util.Map;
import org.slf4j.spi.MDCAdapter;

/* JADX INFO: loaded from: classes.dex */
public class NOPMDCAdapter implements MDCAdapter {
    @Override // org.slf4j.spi.MDCAdapter
    /* JADX INFO: renamed from: a */
    public void mo25084a(String str, String str2) {
    }

    @Override // org.slf4j.spi.MDCAdapter
    /* JADX INFO: renamed from: b */
    public void mo25085b(Map<String, String> map) {
    }

    @Override // org.slf4j.spi.MDCAdapter
    /* JADX INFO: renamed from: c */
    public void mo25086c(String str) {
    }

    @Override // org.slf4j.spi.MDCAdapter
    public void clear() {
    }

    @Override // org.slf4j.spi.MDCAdapter
    /* JADX INFO: renamed from: d */
    public Map<String, String> mo25087d() {
        return null;
    }

    @Override // org.slf4j.spi.MDCAdapter
    public String get(String str) {
        return null;
    }
}
