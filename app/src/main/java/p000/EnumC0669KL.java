package p000;

import java.io.IOException;

/* JADX INFO: renamed from: KL */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC0669KL {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");

    private final String protocol;

    EnumC0669KL(String str) {
        this.protocol = str;
    }

    public static EnumC0669KL get(String str) throws IOException {
        EnumC0669KL enumC0669KL = HTTP_1_0;
        if (str.equals(enumC0669KL.protocol)) {
            return enumC0669KL;
        }
        EnumC0669KL enumC0669KL2 = HTTP_1_1;
        if (str.equals(enumC0669KL2.protocol)) {
            return enumC0669KL2;
        }
        EnumC0669KL enumC0669KL3 = H2_PRIOR_KNOWLEDGE;
        if (str.equals(enumC0669KL3.protocol)) {
            return enumC0669KL3;
        }
        EnumC0669KL enumC0669KL4 = HTTP_2;
        if (str.equals(enumC0669KL4.protocol)) {
            return enumC0669KL4;
        }
        EnumC0669KL enumC0669KL5 = SPDY_3;
        if (str.equals(enumC0669KL5.protocol)) {
            return enumC0669KL5;
        }
        EnumC0669KL enumC0669KL6 = QUIC;
        if (str.equals(enumC0669KL6.protocol)) {
            return enumC0669KL6;
        }
        throw new IOException("Unexpected protocol: ".concat(str));
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.protocol;
    }
}
