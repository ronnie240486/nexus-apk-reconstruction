package com.github.mjdev.libaums.driver;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public interface BlockDeviceDriver {
    int getBlockSize();

    void init() throws IOException;

    void read(long j, ByteBuffer byteBuffer) throws IOException;

    void write(long j, ByteBuffer byteBuffer) throws IOException;
}
