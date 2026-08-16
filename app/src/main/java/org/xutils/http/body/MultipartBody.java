package org.xutils.http.body;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.commons.p013io.IOUtils;
import org.xutils.common.util.KeyValue;
import org.xutils.http.ProgressHandler;

/* JADX INFO: loaded from: classes.dex */
public class MultipartBody implements ProgressBody {

    /* JADX INFO: renamed from: h */
    public static byte[] f18169h = "--------7da3d81520810".getBytes();

    /* JADX INFO: renamed from: i */
    public static byte[] f18170i = IOUtils.f15647f.getBytes();

    /* JADX INFO: renamed from: j */
    public static byte[] f18171j = "--".getBytes();

    /* JADX INFO: renamed from: a */
    public byte[] f18172a;

    /* JADX INFO: renamed from: b */
    public String f18173b;

    /* JADX INFO: renamed from: c */
    public String f18174c;

    /* JADX INFO: renamed from: d */
    public List<KeyValue> f18175d;

    /* JADX INFO: renamed from: e */
    public long f18176e;

    /* JADX INFO: renamed from: f */
    public long f18177f;

    /* JADX INFO: renamed from: g */
    public ProgressHandler f18178g;

    public class CounterOutputStream extends OutputStream {

        /* JADX INFO: renamed from: a */
        public final AtomicLong f18179a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ MultipartBody f18180b;

        /* JADX WARN: Invalid debug info offset */
        public CounterOutputStream(MultipartBody multipartBody) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: j */
        public void m27122j(File file) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: k */
        public void m27123k(InputStream inputStream) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x001f
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public MultipartBody(java.util.List<org.xutils.common.util.KeyValue> r3, java.lang.String r4) {
        /*
            r2 = this;
            return
        L2b:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xutils.http.body.MultipartBody.<init>(java.util.List, java.lang.String):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public static byte[] m27115e(String str, String str2, String str3) throws UnsupportedEncodingException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public static byte[] m27116f(Object obj, String str, String str2) throws UnsupportedEncodingException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.http.body.RequestBody
    /* JADX INFO: renamed from: a */
    public void mo27112a(OutputStream outputStream) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.http.body.RequestBody
    /* JADX INFO: renamed from: b */
    public void mo27110b(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.http.body.ProgressBody
    /* JADX INFO: renamed from: c */
    public void mo27113c(ProgressHandler progressHandler) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.http.body.RequestBody
    /* JADX INFO: renamed from: d */
    public long mo27114d() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public final void m27117g() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.http.body.RequestBody
    public String getContentType() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public final void m27118h(OutputStream outputStream, KeyValue keyValue) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public final void m27119i(OutputStream outputStream, File file) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public final void m27120j(OutputStream outputStream, byte[]... bArr) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x000c
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: k */
    public final void m27121k(java.io.OutputStream r13, java.io.InputStream r14) throws java.io.IOException {
        /*
            r12 = this;
            return
        L35:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xutils.http.body.MultipartBody.m27121k(java.io.OutputStream, java.io.InputStream):void");
    }
}
