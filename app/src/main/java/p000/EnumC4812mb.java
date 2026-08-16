package p000;

/* JADX INFO: renamed from: mb */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC4812mb {
    STORE(0),
    DEFLATE(8),
    AES_INTERNAL_ONLY(99);

    private int code;

    EnumC4812mb(int i) {
        this.code = i;
    }

    public static EnumC4812mb getCompressionMethodFromCode(int i) throws C5953e60 {
        for (EnumC4812mb enumC4812mb : values()) {
            if (enumC4812mb.getCode() == i) {
                return enumC4812mb;
            }
        }
        throw new C5953e60("Unknown compression method", C5953e60.EnumC4266a.UNKNOWN_COMPRESSION_METHOD);
    }

    public int getCode() {
        return this.code;
    }
}
