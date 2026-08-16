package p000;

import info.guardianproject.netcipher.client.TlsOnlySocketFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: BW */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC0099BW {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0(TlsOnlySocketFactory.SSLV3);

    final String javaName;

    EnumC0099BW(String str) {
        this.javaName = str;
    }

    public static EnumC0099BW forJavaName(String str) {
        str.getClass();
        switch (str) {
            case "TLSv1.1":
                return TLS_1_1;
            case "TLSv1.2":
                return TLS_1_2;
            case "TLSv1.3":
                return TLS_1_3;
            case "SSLv3":
                return SSL_3_0;
            case "TLSv1":
                return TLS_1_0;
            default:
                throw new IllegalArgumentException("Unexpected TLS version: ".concat(str));
        }
    }

    public static List<EnumC0099BW> forJavaNames(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(forJavaName(str));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public String javaName() {
        return this.javaName;
    }
}
