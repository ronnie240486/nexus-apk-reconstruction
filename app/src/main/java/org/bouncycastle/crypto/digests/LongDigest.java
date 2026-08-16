package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.ExtendedDigest;

/* JADX INFO: loaded from: classes2.dex */
public abstract class LongDigest implements ExtendedDigest {
    private static final int BYTE_LENGTH = 128;

    /* JADX INFO: renamed from: K */
    static final long[] f16078K = {4794697086780616226L, 8158064640168781261L, -5349999486874862801L, -1606136188198331460L, 4131703408338449720L, 6480981068601479193L, -7908458776815382629L, -6116909921290321640L, -2880145864133508542L, 1334009975649890238L, 2608012711638119052L, 6128411473006802146L, 8268148722764581231L, -9160688886553864527L, -7215885187991268811L, -4495734319001033068L, -1973867731355612462L, -1171420211273849373L, 1135362057144423861L, 2597628984639134821L, 3308224258029322869L, 5365058923640841347L, 6679025012923562964L, 8573033837759648693L, -7476448914759557205L, -6327057829258317296L, -5763719355590565569L, -4658551843659510044L, -4116276920077217854L, -3051310485924567259L, 489312712824947311L, 1452737877330783856L, 2861767655752347644L, 3322285676063803686L, 5560940570517711597L, 5996557281743188959L, 7280758554555802590L, 8532644243296465576L, -9096487096722542874L, -7894198246740708037L, -6719396339535248540L, -6333637450476146687L, -4446306890439682159L, -4076793802049405392L, -3345356375505022440L, -2983346525034927856L, -860691631967231958L, 1182934255886127544L, 1847814050463011016L, 2177327727835720531L, 2830643537854262169L, 3796741975233480872L, 4115178125766777443L, 5681478168544905931L, 6601373596472566643L, 7507060721942968483L, 8399075790359081724L, 8693463985226723168L, -8878714635349349518L, -8302665154208450068L, -8016688836872298968L, -6606660893046293015L, -4685533653050689259L, -4147400797238176981L, -3880063495543823972L, -3348786107499101689L, -1523767162380948706L, -757361751448694408L, 500013540394364858L, 748580250866718886L, 1242879168328830382L, 1977374033974150939L, 2944078676154940804L, 3659926193048069267L, 4368137639120453308L, 4836135668995329356L, 5532061633213252278L, 6448918945643986474L, 6902733635092675308L, 7801388544844847127L};

    /* JADX INFO: renamed from: H1 */
    protected long f16079H1;

    /* JADX INFO: renamed from: H2 */
    protected long f16080H2;

    /* JADX INFO: renamed from: H3 */
    protected long f16081H3;

    /* JADX INFO: renamed from: H4 */
    protected long f16082H4;

    /* JADX INFO: renamed from: H5 */
    protected long f16083H5;

    /* JADX INFO: renamed from: H6 */
    protected long f16084H6;

    /* JADX INFO: renamed from: H7 */
    protected long f16085H7;

    /* JADX INFO: renamed from: H8 */
    protected long f16086H8;

    /* JADX INFO: renamed from: W */
    private long[] f16087W;
    private long byteCount1;
    private long byteCount2;
    private int wOff;
    private byte[] xBuf;
    private int xBufOff;

    /* JADX WARN: Invalid debug info offset */
    public LongDigest() {
    }

    /* JADX WARN: Invalid debug info offset */
    public LongDigest(LongDigest longDigest) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Ch */
    private long m23450Ch(long j, long j2, long j3) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    private long Maj(long j, long j2, long j3) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    private long Sigma0(long j) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    private long Sigma1(long j) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    private long Sum0(long j) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    private long Sum1(long j) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    private void adjustByteCounts() {
    }

    /* JADX WARN: Invalid debug info offset */
    public void finish() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public void processBlock() {
    }

    /* JADX WARN: Invalid debug info offset */
    public void processLength(long j, long j2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void processWord(byte[] bArr, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i, int i2) {
    }
}
