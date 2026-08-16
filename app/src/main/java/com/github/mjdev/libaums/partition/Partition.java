package com.github.mjdev.libaums.partition;

import com.github.mjdev.libaums.driver.BlockDeviceDriver;
import com.github.mjdev.libaums.p005fs.FileSystem;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class Partition implements BlockDeviceDriver {
    private static final String TAG = "Partition";
    private BlockDeviceDriver blockDevice;
    private int blockSize;
    private FileSystem fileSystem;
    private int logicalBlockAddress;

    /* JADX WARN: Invalid debug info offset */
    private Partition() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0013
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static com.github.mjdev.libaums.partition.Partition createPartition(com.github.mjdev.libaums.partition.PartitionTableEntry r2, com.github.mjdev.libaums.driver.BlockDeviceDriver r3) throws java.io.IOException {
        /*
            r0 = 0
            return r0
        L1a:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.mjdev.libaums.partition.Partition.createPartition(com.github.mjdev.libaums.partition.PartitionTableEntry, com.github.mjdev.libaums.driver.BlockDeviceDriver):com.github.mjdev.libaums.partition.Partition");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.github.mjdev.libaums.driver.BlockDeviceDriver
    public int getBlockSize() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public FileSystem getFileSystem() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getVolumeLabel() {
        return null;
    }

    @Override // com.github.mjdev.libaums.driver.BlockDeviceDriver
    public void init() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.github.mjdev.libaums.driver.BlockDeviceDriver
    public void read(long j, ByteBuffer byteBuffer) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.github.mjdev.libaums.driver.BlockDeviceDriver
    public void write(long j, ByteBuffer byteBuffer) throws IOException {
    }
}
