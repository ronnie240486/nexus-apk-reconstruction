package com.alibaba.fastjson.serializer;

import android.media.ViviTV.adapters.HomeRecyclerViewAdapter;
import info.guardianproject.netcipher.proxy.OrbotHelper;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.nio.charset.Charset;
import p000.C1002PX;

/* JADX INFO: loaded from: classes.dex */
public final class SerializeWriter extends Writer {
    public static final char[] DIGITS;
    static final byte[] specicalFlags_doubleQuotes;
    static final byte[] specicalFlags_singleQuotes;
    protected char[] buf;
    protected int count;
    protected int features;
    protected final Writer writer;
    private static final ThreadLocal<char[]> bufLocal = new ThreadLocal<>();
    static final int[] sizeTable = {9, 99, HomeRecyclerViewAdapter.VT_APP_INSTALLED, OrbotHelper.HS_REQUEST_CODE, 99999, 999999, 9999999, 99999999, 999999999, Integer.MAX_VALUE};
    static final char[] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    static final char[] DigitTens = {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '4', '4', '4', '4', '4', '4', '4', '4', '4', '4', '5', '5', '5', '5', '5', '5', '5', '5', '5', '5', '6', '6', '6', '6', '6', '6', '6', '6', '6', '6', '7', '7', '7', '7', '7', '7', '7', '7', '7', '7', '8', '8', '8', '8', '8', '8', '8', '8', '8', '8', '9', '9', '9', '9', '9', '9', '9', '9', '9', '9'};
    static final char[] DigitOnes = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    static final char[] ascii_chars = {'0', '0', '0', '1', '0', '2', '0', '3', '0', '4', '0', '5', '0', '6', '0', '7', '0', '8', '0', '9', '0', 'A', '0', 'B', '0', 'C', '0', 'D', '0', 'E', '0', 'F', '1', '0', '1', '1', '1', '2', '1', '3', '1', '4', '1', '5', '1', '6', '1', '7', '1', '8', '1', '9', '1', 'A', '1', 'B', '1', 'C', '1', 'D', '1', 'E', '1', 'F', '2', '0', '2', '1', '2', '2', '2', '3', '2', '4', '2', '5', '2', '6', '2', '7', '2', '8', '2', '9', '2', 'A', '2', 'B', '2', 'C', '2', 'D', '2', 'E', '2', 'F'};
    static final char[] replaceChars = new char[93];

    static {
        byte[] bArr = new byte[161];
        specicalFlags_doubleQuotes = bArr;
        byte[] bArr2 = new byte[161];
        specicalFlags_singleQuotes = bArr2;
        bArr[0] = 4;
        bArr[1] = 4;
        bArr[2] = 4;
        bArr[3] = 4;
        bArr[4] = 4;
        bArr[5] = 4;
        bArr[6] = 4;
        bArr[7] = 4;
        bArr[8] = 1;
        bArr[9] = 1;
        bArr[10] = 1;
        bArr[11] = 4;
        bArr[12] = 1;
        bArr[13] = 1;
        bArr[34] = 1;
        bArr[92] = 1;
        bArr2[0] = 4;
        bArr2[1] = 4;
        bArr2[2] = 4;
        bArr2[3] = 4;
        bArr2[4] = 4;
        bArr2[5] = 4;
        bArr2[6] = 4;
        bArr2[7] = 4;
        bArr2[8] = 1;
        bArr2[9] = 1;
        bArr2[10] = 1;
        bArr2[11] = 4;
        bArr2[12] = 1;
        bArr2[13] = 1;
        bArr2[92] = 1;
        bArr2[39] = 1;
        for (int i = 14; i <= 31; i++) {
            specicalFlags_doubleQuotes[i] = 4;
            specicalFlags_singleQuotes[i] = 4;
        }
        for (int i2 = 127; i2 < 160; i2++) {
            specicalFlags_doubleQuotes[i2] = 4;
            specicalFlags_singleQuotes[i2] = 4;
        }
        char[] cArr = replaceChars;
        cArr[0] = '0';
        cArr[1] = '1';
        cArr[2] = '2';
        cArr[3] = '3';
        cArr[4] = '4';
        cArr[5] = '5';
        cArr[6] = '6';
        cArr[7] = '7';
        cArr[8] = 'b';
        cArr[9] = 't';
        cArr[10] = 'n';
        cArr[11] = 'v';
        cArr[12] = 'f';
        cArr[13] = 'r';
        cArr[34] = C1002PX.f2511b;
        cArr[39] = '\'';
        cArr[47] = '/';
        cArr[92] = '\\';
        DIGITS = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    }

    /* JADX WARN: Invalid debug info offset */
    public SerializeWriter() {
    }

    /* JADX WARN: Invalid debug info offset */
    public SerializeWriter(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public SerializeWriter(Writer writer) {
    }

    /* JADX WARN: Invalid debug info offset */
    public SerializeWriter(Writer writer, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public SerializeWriter(Writer writer, int i, SerializerFeature[] serializerFeatureArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public SerializeWriter(SerializerFeature... serializerFeatureArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static void getChars(long j, int i, char[] cArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void writeKeyWithDoubleQuoteIfHasSpecial(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void writeKeyWithSingleQuoteIfHasSpecial(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.Writer, java.lang.Appendable
    public SerializeWriter append(char c) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.Writer, java.lang.Appendable
    public SerializeWriter append(CharSequence charSequence) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.Writer, java.lang.Appendable
    public SerializeWriter append(CharSequence charSequence, int i, int i2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ Writer append(char c) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ Writer append(CharSequence charSequence) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ Writer append(CharSequence charSequence, int i, int i2) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ Appendable append(char c) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i, int i2) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    /* JADX WARN: Invalid debug info offset */
    public void config(SerializerFeature serializerFeature, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void expandCapacity(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0005
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        /*
            r4 = this;
            return
        L15:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.serializer.SerializeWriter.flush():void");
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isEnabled(SerializerFeature serializerFeature) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0008
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public byte[] toBytes(java.lang.String r5) {
        /*
            r4 = this;
            r0 = 0
            return r0
        L17:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.serializer.SerializeWriter.toBytes(java.lang.String):byte[]");
    }

    /* JADX WARN: Invalid debug info offset */
    public String toString() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.Writer
    public void write(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.Writer
    public void write(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.Writer
    public void write(String str, int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void write(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void writeByteArray(byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void writeFieldName(String str, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void writeInt(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void writeLong(long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void writeNull() {
    }

    /* JADX WARN: Invalid debug info offset */
    public void writeString(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void writeStringWithDoubleQuote(String str, char c, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void writeStringWithSingleQuote(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void writeTo(OutputStream outputStream, String str) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public void writeTo(OutputStream outputStream, Charset charset) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public void writeTo(Writer writer) throws IOException {
    }
}
