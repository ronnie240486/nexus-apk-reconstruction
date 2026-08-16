package com.github.mjdev.libaums.usb;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public interface UsbCommunication {
    public static final int TRANSFER_TIMEOUT = 5000;

    int bulkInTransfer(ByteBuffer byteBuffer) throws IOException;

    int bulkOutTransfer(ByteBuffer byteBuffer) throws IOException;
}
