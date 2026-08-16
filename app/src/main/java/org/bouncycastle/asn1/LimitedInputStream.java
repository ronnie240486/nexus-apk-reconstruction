package org.bouncycastle.asn1;

import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
abstract class LimitedInputStream extends InputStream {
    protected final InputStream _in;
    private int _limit;

    /* JADX WARN: Invalid debug info offset */
    public LimitedInputStream(InputStream inputStream, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public int getRemaining() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public void setParentEofDetect(boolean z) {
    }
}
