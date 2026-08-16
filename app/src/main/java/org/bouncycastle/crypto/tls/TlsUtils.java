package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.asn1.x509.X509CertificateStructure;
import org.bouncycastle.crypto.Digest;

/* JADX INFO: loaded from: classes2.dex */
public class TlsUtils {
    /* JADX WARN: Invalid debug info offset */
    public static byte[] PRF(byte[] bArr, String str, byte[] bArr2, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static void checkVersion(InputStream inputStream, TlsProtocolHandler tlsProtocolHandler) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public static void checkVersion(byte[] bArr, TlsProtocolHandler tlsProtocolHandler) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public static byte[] concat(byte[] bArr, byte[] bArr2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private static void hmac_hash(Digest digest, byte[] bArr, byte[] bArr2, byte[] bArr3) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static void readFully(byte[] bArr, InputStream inputStream) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public static byte[] readOpaque16(InputStream inputStream) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static byte[] readOpaque8(InputStream inputStream) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static int readUint16(InputStream inputStream) throws IOException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public static int readUint24(InputStream inputStream) throws IOException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public static long readUint32(InputStream inputStream) throws IOException {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    public static short readUint8(InputStream inputStream) throws IOException {
        return (short) 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public static void validateKeyUsage(X509CertificateStructure x509CertificateStructure, int i) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public static void writeGMTUnixTime(byte[] bArr, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static void writeOpaque16(byte[] bArr, OutputStream outputStream) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public static void writeOpaque24(byte[] bArr, OutputStream outputStream) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public static void writeOpaque8(byte[] bArr, OutputStream outputStream) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public static void writeUint16(int i, OutputStream outputStream) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public static void writeUint16(int i, byte[] bArr, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static void writeUint16Array(int[] iArr, OutputStream outputStream) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public static void writeUint24(int i, OutputStream outputStream) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public static void writeUint24(int i, byte[] bArr, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static void writeUint32(long j, OutputStream outputStream) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public static void writeUint32(long j, byte[] bArr, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static void writeUint64(long j, OutputStream outputStream) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public static void writeUint64(long j, byte[] bArr, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static void writeUint8(short s2, OutputStream outputStream) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public static void writeUint8(short s2, byte[] bArr, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static void writeUint8Array(short[] sArr, OutputStream outputStream) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public static void writeVersion(OutputStream outputStream) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public static void writeVersion(byte[] bArr, int i) throws IOException {
    }
}
