package p000;

/* JADX INFO: renamed from: Uh */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC1331Uh {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);

    public final int httpCode;

    EnumC1331Uh(int i) {
        this.httpCode = i;
    }

    public static EnumC1331Uh fromHttp2(int i) {
        for (EnumC1331Uh enumC1331Uh : values()) {
            if (enumC1331Uh.httpCode == i) {
                return enumC1331Uh;
            }
        }
        return null;
    }
}
