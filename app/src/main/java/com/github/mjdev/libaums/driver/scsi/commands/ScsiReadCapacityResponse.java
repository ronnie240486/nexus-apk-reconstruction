package com.github.mjdev.libaums.driver.scsi.commands;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class ScsiReadCapacityResponse {
    private int blockLength;
    private int logicalBlockAddress;

    /* JADX WARN: Invalid debug info offset */
    private ScsiReadCapacityResponse() {
    }

    /* JADX WARN: Invalid debug info offset */
    public static ScsiReadCapacityResponse read(ByteBuffer byteBuffer) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getBlockLength() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getLogicalBlockAddress() {
        return 0;
    }
}
