package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: S7 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1166S7 extends InterfaceC5858zS, ReadableByteChannel {
    /* JADX INFO: renamed from: B */
    long mo1332B() throws IOException;

    /* JADX INFO: renamed from: B0 */
    long mo1333B0(C5222q8 c5222q8) throws IOException;

    /* JADX INFO: renamed from: C0 */
    long mo1334C0(C5222q8 c5222q8, long j) throws IOException;

    /* JADX INFO: renamed from: D0 */
    int mo1335D0(C0665KH c0665kh) throws IOException;

    /* JADX INFO: renamed from: E */
    String mo1336E(long j) throws IOException;

    /* JADX INFO: renamed from: J */
    long mo1337J(InterfaceC4803mS interfaceC4803mS) throws IOException;

    /* JADX INFO: renamed from: K */
    void mo1338K(C0910O7 c0910o7, long j) throws IOException;

    /* JADX INFO: renamed from: M */
    String mo1339M(Charset charset) throws IOException;

    /* JADX INFO: renamed from: M0 */
    void mo1340M0(long j) throws IOException;

    /* JADX INFO: renamed from: O */
    long mo1341O(C5222q8 c5222q8, long j) throws IOException;

    /* JADX INFO: renamed from: Q0 */
    long mo1342Q0(byte b) throws IOException;

    /* JADX INFO: renamed from: R0 */
    long mo1343R0() throws IOException;

    /* JADX INFO: renamed from: S0 */
    InputStream mo1344S0();

    /* JADX INFO: renamed from: T */
    long mo1345T(C5222q8 c5222q8) throws IOException;

    /* JADX INFO: renamed from: U */
    int mo1346U() throws IOException;

    /* JADX INFO: renamed from: b */
    String mo1347b(long j) throws IOException;

    /* JADX INFO: renamed from: c0 */
    C5222q8 mo1348c0() throws IOException;

    /* JADX INFO: renamed from: e0 */
    boolean mo1349e0(long j) throws IOException;

    /* JADX INFO: renamed from: f */
    C5222q8 mo1350f(long j) throws IOException;

    /* JADX INFO: renamed from: h0 */
    String mo1351h0() throws IOException;

    /* JADX INFO: renamed from: i */
    C0910O7 mo1352i();

    /* JADX INFO: renamed from: i0 */
    int mo1353i0() throws IOException;

    /* JADX INFO: renamed from: m0 */
    byte[] mo1354m0(long j) throws IOException;

    /* JADX INFO: renamed from: o0 */
    String mo1355o0() throws IOException;

    /* JADX INFO: renamed from: p0 */
    String mo1356p0(long j, Charset charset) throws IOException;

    /* JADX INFO: renamed from: q */
    byte[] mo1357q() throws IOException;

    /* JADX INFO: renamed from: q0 */
    short mo1358q0() throws IOException;

    int read(byte[] bArr) throws IOException;

    int read(byte[] bArr, int i, int i2) throws IOException;

    byte readByte() throws IOException;

    void readFully(byte[] bArr) throws IOException;

    int readInt() throws IOException;

    long readLong() throws IOException;

    short readShort() throws IOException;

    /* JADX INFO: renamed from: s */
    boolean mo1359s() throws IOException;

    /* JADX INFO: renamed from: s0 */
    boolean mo1360s0(long j, C5222q8 c5222q8) throws IOException;

    void skip(long j) throws IOException;

    /* JADX INFO: renamed from: t0 */
    boolean mo1361t0(long j, C5222q8 c5222q8, int i, int i2) throws IOException;

    /* JADX INFO: renamed from: x */
    long mo1362x(byte b, long j) throws IOException;

    /* JADX INFO: renamed from: x0 */
    long mo1363x0() throws IOException;

    /* JADX INFO: renamed from: y */
    long mo1364y(byte b, long j, long j2) throws IOException;

    @Nullable
    /* JADX INFO: renamed from: z */
    String mo1365z() throws IOException;
}
