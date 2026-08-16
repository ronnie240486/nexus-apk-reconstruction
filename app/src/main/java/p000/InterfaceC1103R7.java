package p000;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: R7 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC1103R7 extends InterfaceC4803mS, WritableByteChannel {
    /* JADX INFO: renamed from: A */
    InterfaceC1103R7 mo935A() throws IOException;

    /* JADX INFO: renamed from: C */
    InterfaceC1103R7 mo936C(InterfaceC5858zS interfaceC5858zS, long j) throws IOException;

    /* JADX INFO: renamed from: G */
    InterfaceC1103R7 mo937G(int i) throws IOException;

    /* JADX INFO: renamed from: H0 */
    InterfaceC1103R7 mo938H0(String str, int i, int i2, Charset charset) throws IOException;

    /* JADX INFO: renamed from: I */
    InterfaceC1103R7 mo939I(String str) throws IOException;

    /* JADX INFO: renamed from: L */
    InterfaceC1103R7 mo940L(C5222q8 c5222q8) throws IOException;

    /* JADX INFO: renamed from: N0 */
    InterfaceC1103R7 mo941N0(long j) throws IOException;

    /* JADX INFO: renamed from: O0 */
    OutputStream mo942O0();

    /* JADX INFO: renamed from: Y */
    InterfaceC1103R7 mo944Y(String str, int i, int i2) throws IOException;

    /* JADX INFO: renamed from: Z */
    InterfaceC1103R7 mo945Z(long j) throws IOException;

    /* JADX INFO: renamed from: d0 */
    InterfaceC1103R7 mo946d0(String str, Charset charset) throws IOException;

    @Override // p000.InterfaceC4803mS, java.io.Flushable
    void flush() throws IOException;

    /* JADX INFO: renamed from: i */
    C0910O7 mo947i();

    /* JADX INFO: renamed from: l */
    InterfaceC1103R7 mo948l() throws IOException;

    /* JADX INFO: renamed from: m */
    InterfaceC1103R7 mo949m(int i) throws IOException;

    /* JADX INFO: renamed from: n */
    InterfaceC1103R7 mo950n(long j) throws IOException;

    /* JADX INFO: renamed from: o */
    long mo951o(InterfaceC5858zS interfaceC5858zS) throws IOException;

    /* JADX INFO: renamed from: r */
    InterfaceC1103R7 mo952r(int i) throws IOException;

    InterfaceC1103R7 write(byte[] bArr) throws IOException;

    InterfaceC1103R7 write(byte[] bArr, int i, int i2) throws IOException;

    InterfaceC1103R7 writeByte(int i) throws IOException;

    InterfaceC1103R7 writeInt(int i) throws IOException;

    InterfaceC1103R7 writeLong(long j) throws IOException;

    InterfaceC1103R7 writeShort(int i) throws IOException;
}
