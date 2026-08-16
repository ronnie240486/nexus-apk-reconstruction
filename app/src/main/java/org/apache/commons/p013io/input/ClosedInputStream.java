package org.apache.commons.p013io.input;

import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class ClosedInputStream extends InputStream {

    /* JADX INFO: renamed from: a */
    public static final ClosedInputStream f15807a = new ClosedInputStream();

    @Override // java.io.InputStream
    public int read() {
        return -1;
    }
}
