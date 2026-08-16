package p000;

/* JADX INFO: renamed from: r00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC6040r00 {
    DEFAULT(10),
    DEFLATE_COMPRESSED(20),
    ZIP_64_FORMAT(45),
    AES_ENCRYPTED(51);

    private int code;

    EnumC6040r00(int i) {
        this.code = i;
    }

    public int getCode() {
        return this.code;
    }
}
