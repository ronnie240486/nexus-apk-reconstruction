package com.github.mjdev.libaums.p005fs.fat32;

import com.github.mjdev.libaums.driver.BlockDeviceDriver;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class ClusterChain {
    private static final String TAG = "ClusterChain";
    private BlockDeviceDriver blockDevice;
    private Long[] chain;
    private long clusterSize;
    private long dataAreaOffset;
    private FAT fat;

    /* JADX WARN: Invalid debug info offset */
    public ClusterChain(long j, BlockDeviceDriver blockDeviceDriver, FAT fat, Fat32BootSector fat32BootSector) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    private long getFileSystemOffset(long j, int i) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getClusters() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public long getLength() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    public void read(long j, ByteBuffer byteBuffer) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setClusters(int i) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setLength(long j) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public void write(long j, ByteBuffer byteBuffer) throws IOException {
    }
}
