package com.github.mjdev.libaums.p005fs.fat32;

import com.github.mjdev.libaums.driver.BlockDeviceDriver;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
class FsInfoStructure {
    private static int FREE_COUNT_OFF = 488;
    static int INVALID_VALUE = -1;
    private static int LEAD_SIGNATURE = 1096897106;
    private static int LEAD_SIGNATURE_OFF = 0;
    private static int NEXT_FREE_OFFSET = 492;
    private static int STRUCT_SIGNATURE = 1631679090;
    private static int STRUCT_SIGNATURE_OFF = 484;
    private static final String TAG = "FsInfoStructure";
    private static int TRAIL_SIGNATURE = -1437270016;
    private static int TRAIL_SIGNATURE_OFF = 508;
    private BlockDeviceDriver blockDevice;
    private ByteBuffer buffer;
    private int offset;

    /* JADX WARN: Invalid debug info offset */
    private FsInfoStructure(BlockDeviceDriver blockDeviceDriver, int i) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public static FsInfoStructure read(BlockDeviceDriver blockDeviceDriver, int i) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void decreaseClusterCount(long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    public long getFreeClusterCount() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    public long getLastAllocatedClusterHint() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    public void setFreeClusterCount(long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setLastAllocatedClusterHint(long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void write() throws IOException {
    }
}
