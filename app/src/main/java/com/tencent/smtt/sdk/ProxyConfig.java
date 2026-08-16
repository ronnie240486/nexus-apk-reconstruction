package com.tencent.smtt.sdk;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ProxyConfig {
    public static final String MATCH_ALL_SCHEMES = "*";

    /* JADX INFO: renamed from: a */
    private List<ProxyRule> f12686a;

    /* JADX INFO: renamed from: b */
    private List<String> f12687b;

    public static final class Builder {

        /* JADX INFO: renamed from: a */
        private List<ProxyRule> f12688a;

        /* JADX INFO: renamed from: b */
        private List<String> f12689b;

        /* JADX WARN: Invalid debug info offset */
        public Builder() {
        }

        /* JADX WARN: Invalid debug info offset */
        public Builder(ProxyConfig proxyConfig) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        private List<ProxyRule> m18864a() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        private List<String> m18865b() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public Builder addBypassRule(String str) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public Builder addDirect() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public Builder addDirect(String str) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public Builder addProxyRule(String str) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public Builder addProxyRule(String str, String str2) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public ProxyConfig build() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public Builder bypassSimpleHostnames() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public Builder removeImplicitRules() {
            return null;
        }
    }

    public static final class ProxyRule {

        /* JADX INFO: renamed from: a */
        private String f12690a;

        /* JADX INFO: renamed from: b */
        private String f12691b;

        /* JADX WARN: Invalid debug info offset */
        public ProxyRule(String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        public ProxyRule(String str, String str2) {
        }

        /* JADX WARN: Invalid debug info offset */
        public String getSchemeFilter() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public String getUrl() {
            return null;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public ProxyConfig(List<ProxyRule> list, List<String> list2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public List<String> getBypassRules() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public List<ProxyRule> getProxyRules() {
        return null;
    }
}
