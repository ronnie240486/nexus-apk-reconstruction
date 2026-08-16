package org.slf4j.helpers;

import java.util.Map;
import java.util.Set;
import org.slf4j.spi.MDCAdapter;

/* JADX INFO: loaded from: classes.dex */
public class BasicMDCAdapter implements MDCAdapter {

    /* JADX INFO: renamed from: a */
    public InheritableThreadLocal<Map<String, String>> f17199a;

    /* JADX INFO: renamed from: org.slf4j.helpers.BasicMDCAdapter$1 */
    public class C50811 extends InheritableThreadLocal<Map<String, String>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BasicMDCAdapter f17200a;

        /* JADX WARN: Invalid debug info offset */
        public C50811(BasicMDCAdapter basicMDCAdapter) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public Map<String, String> m25089a(Map<String, String> map) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.InheritableThreadLocal
        public /* bridge */ /* synthetic */ Map<String, String> childValue(Map<String, String> map) {
            return null;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.spi.MDCAdapter
    /* JADX INFO: renamed from: a */
    public void mo25084a(String str, String str2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.spi.MDCAdapter
    /* JADX INFO: renamed from: b */
    public void mo25085b(Map<String, String> map) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.spi.MDCAdapter
    /* JADX INFO: renamed from: c */
    public void mo25086c(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.spi.MDCAdapter
    public void clear() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.spi.MDCAdapter
    /* JADX INFO: renamed from: d */
    public Map<String, String> mo25087d() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public Set<String> m25088e() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.spi.MDCAdapter
    public String get(String str) {
        return null;
    }
}
