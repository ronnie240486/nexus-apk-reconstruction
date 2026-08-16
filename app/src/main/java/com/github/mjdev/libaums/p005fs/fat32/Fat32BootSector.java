package com.github.mjdev.libaums.p005fs.fat32;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
class Fat32BootSector {
    private static final int BYTES_PER_SECTOR_OFF = 11;
    private static final int FAT_COUNT_OFF = 16;
    private static final int FLAGS_OFF = 40;
    private static final int FS_INFO_SECTOR_OFF = 48;
    private static final int RESERVED_COUNT_OFF = 14;
    private static final int ROOT_DIR_CLUSTER_OFF = 44;
    private static final int SECTORS_PER_CLUSTER_OFF = 13;
    private static final int SECTORS_PER_FAT_OFF = 36;
    private static final int TOTAL_SECTORS_OFF = 32;
    private static final int VOLUME_LABEL_OFF = 48;
    private short bytesPerSector;
    private byte fatCount;
    private boolean fatMirrored;
    private short fsInfoStartSector;
    private short reservedSectors;
    private long rootDirStartCluster;
    private short sectorsPerCluster;
    private long sectorsPerFat;
    private long totalNumberOfSectors;
    private byte validFat;
    private String volumeLabel;

    /* JADX WARN: Invalid debug info offset */
    private Fat32BootSector() {
    }

    /* JADX WARN: Invalid debug info offset */
    public static Fat32BootSector read(ByteBuffer byteBuffer) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getBytesPerCluster() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public short getBytesPerSector() {
        return (short) 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public long getDataAreaOffset() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    public byte getFatCount() {
        return (byte) 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public long getFatOffset(int i) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    public short getFsInfoStartSector() {
        return (short) 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public short getReservedSectors() {
        return (short) 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public long getRootDirStartCluster() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    public short getSectorsPerCluster() {
        return (short) 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public long getSectorsPerFat() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    public long getTotalNumberOfSectors() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    public byte getValidFat() {
        return (byte) 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getVolumeLabel() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isFatMirrored() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public String toString() {
        return null;
    }
}
