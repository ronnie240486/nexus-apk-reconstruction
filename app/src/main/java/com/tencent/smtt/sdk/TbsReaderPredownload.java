package com.tencent.smtt.sdk;

import android.content.Context;
import android.os.Handler;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes2.dex */
public class TbsReaderPredownload {
    public static final int READER_SO_SUCCESS = 2;
    public static final int READER_WAIT_IN_QUEUE = 3;

    /* JADX INFO: renamed from: b */
    static final String[] f12874b = {"docx", "pptx", "xlsx", "pdf", "epub", "txt"};

    /* JADX INFO: renamed from: a */
    Handler f12875a;

    /* JADX INFO: renamed from: c */
    LinkedList<String> f12876c;

    /* JADX INFO: renamed from: d */
    boolean f12877d;

    /* JADX INFO: renamed from: e */
    ReaderWizard f12878e;

    /* JADX INFO: renamed from: f */
    TbsReaderView.ReaderCallback f12879f;

    /* JADX INFO: renamed from: g */
    Object f12880g;

    /* JADX INFO: renamed from: h */
    Context f12881h;

    /* JADX INFO: renamed from: i */
    ReaderPreDownloadCallback f12882i;

    /* JADX INFO: renamed from: j */
    String f12883j;

    /* JADX INFO: renamed from: com.tencent.smtt.sdk.TbsReaderPredownload$1 */
    public class C41021 implements TbsReaderView.ReaderCallback {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ TbsReaderPredownload f12884a;

        /* JADX WARN: Invalid debug info offset */
        public C41021(TbsReaderPredownload tbsReaderPredownload) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.sdk.TbsReaderView.ReaderCallback
        public void onCallBackAction(Integer num, Object obj, Object obj2) {
        }
    }

    public interface ReaderPreDownloadCallback {
        public static final int NOTIFY_PLUGIN_FAILED = -1;
        public static final int NOTIFY_PLUGIN_SUCCESS = 0;

        void onEvent(String str, int i, boolean z);
    }

    /* JADX WARN: Invalid debug info offset */
    public TbsReaderPredownload(ReaderPreDownloadCallback readerPreDownloadCallback) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    private void m18955a() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public void m18956a(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public void m18957a(int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public void m18958b(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public boolean m18959c(int i) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0019
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public boolean init(android.content.Context r5) {
        /*
            r4 = this;
            r0 = 0
            return r0
        L42:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.TbsReaderPredownload.init(android.content.Context):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    public void pause() {
    }

    /* JADX WARN: Invalid debug info offset */
    public void shutdown() {
    }

    /* JADX WARN: Invalid debug info offset */
    public void start(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void startAll() {
    }
}
