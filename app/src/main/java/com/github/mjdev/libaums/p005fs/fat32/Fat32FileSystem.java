package com.github.mjdev.libaums.p005fs.fat32;

import com.github.mjdev.libaums.driver.BlockDeviceDriver;
import com.github.mjdev.libaums.p005fs.FileSystem;
import com.github.mjdev.libaums.p005fs.UsbFile;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class Fat32FileSystem implements FileSystem {
    private static final String TAG = "Fat32FileSystem";
    private Fat32BootSector bootSector;
    private FAT fat;
    private FsInfoStructure fsInfoStructure;
    private FatDirectory rootDirectory;

    /* JADX WARN: Invalid debug info offset */
    private Fat32FileSystem(BlockDeviceDriver blockDeviceDriver) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public static Fat32FileSystem read(BlockDeviceDriver blockDeviceDriver) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.github.mjdev.libaums.p005fs.FileSystem
    public long getCapacity() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.github.mjdev.libaums.p005fs.FileSystem
    public int getChunkSize() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.github.mjdev.libaums.p005fs.FileSystem
    public long getFreeSpace() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.github.mjdev.libaums.p005fs.FileSystem
    public long getOccupiedSpace() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.github.mjdev.libaums.p005fs.FileSystem
    public UsbFile getRootDirectory() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.github.mjdev.libaums.p005fs.FileSystem
    public String getVolumeLabel() {
        return null;
    }
}
