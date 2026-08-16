package com.github.mjdev.libaums.p005fs.fat32;

import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class FatLfnDirectoryEntry {
    private FatDirectoryEntry actualEntry;
    private String lfnName;

    /* JADX WARN: Invalid debug info offset */
    private FatLfnDirectoryEntry() {
    }

    /* JADX WARN: Invalid debug info offset */
    private FatLfnDirectoryEntry(FatDirectoryEntry fatDirectoryEntry, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static void copyDateTime(FatLfnDirectoryEntry fatLfnDirectoryEntry, FatLfnDirectoryEntry fatLfnDirectoryEntry2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static FatLfnDirectoryEntry createNew(String str, ShortName shortName) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static FatLfnDirectoryEntry read(FatDirectoryEntry fatDirectoryEntry, List<FatDirectoryEntry> list) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public FatDirectoryEntry getActualEntry() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getEntryCount() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public long getFileSize() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getName() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public long getStartCluster() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isDirectory() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public void serialize(ByteBuffer byteBuffer) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setDirectory() {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setFileSize(long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setLastAccessedTimeToNow() {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setLastModifiedTimeToNow() {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setName(String str, ShortName shortName) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setStartCluster(long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    public String toString() {
        return null;
    }
}
