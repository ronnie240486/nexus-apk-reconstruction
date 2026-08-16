package com.github.mjdev.libaums.p005fs.fat32;

import com.github.mjdev.libaums.driver.BlockDeviceDriver;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class FAT {
    private static final int FAT32_EOF_CLUSTER = 268435448;
    private static final String TAG = "FAT";
    private BlockDeviceDriver blockDevice;
    private int[] fatNumbers;
    private long[] fatOffset;
    private FsInfoStructure fsInfoStructure;

    /* JADX WARN: Invalid debug info offset */
    public FAT(BlockDeviceDriver blockDeviceDriver, Fat32BootSector fat32BootSector, FsInfoStructure fsInfoStructure) {
    }

    /* JADX WARN: Invalid debug info offset */
    public Long[] alloc(Long[] lArr, int i) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Long[] free(Long[] lArr, int i) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Long[] getChain(long j) throws IOException {
        return null;
    }
}
