package com.github.mjdev.libaums.p005fs;

/* JADX INFO: loaded from: classes.dex */
public interface FileSystem {
    long getCapacity();

    int getChunkSize();

    long getFreeSpace();

    long getOccupiedSpace();

    UsbFile getRootDirectory();

    String getVolumeLabel();
}
