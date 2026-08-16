package com.github.mjdev.libaums.p005fs.fat32;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
class FatDirectoryEntry {
    private static final int ATTR_OFF = 11;
    private static final int CREATED_DATE_OFF = 16;
    private static final int CREATED_TIME_OFF = 14;
    static final int ENTRY_DELETED = 229;
    private static final int FILE_SIZE_OFF = 28;
    private static final int FLAG_ARCHIVE = 32;
    private static final int FLAG_DIRECTORY = 16;
    private static final int FLAG_HIDDEN = 2;
    private static final int FLAG_READONLY = 1;
    private static final int FLAG_SYSTEM = 4;
    private static final int FLAG_VOLUME_ID = 8;
    private static final int LAST_ACCESSED_DATE_OFF = 18;
    private static final int LAST_WRITE_DATE_OFF = 24;
    private static final int LAST_WRITE_TIME_OFF = 22;
    private static final int LSB_CLUSTER_OFF = 26;
    private static final int MSB_CLUSTER_OFF = 20;
    private static final int SHORTNAME_CASE_OFF = 12;
    static final int SIZE = 32;
    private ByteBuffer data;
    private ShortName shortName;

    /* JADX WARN: Invalid debug info offset */
    private FatDirectoryEntry() {
    }

    /* JADX WARN: Invalid debug info offset */
    private FatDirectoryEntry(ByteBuffer byteBuffer) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static FatDirectoryEntry createLfnPart(String str, int i, byte b, int i2, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static FatDirectoryEntry createNew() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static FatDirectoryEntry createVolumeLabel(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private static long decodeDateTime(int i, int i2) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    private static int encodeDate(long j) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private static int encodeTime(long j) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private int getFlags() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private int getUnsignedInt16(int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private long getUnsignedInt32(int i) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    private int getUnsignedInt8(int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private boolean isFlagSet(int i) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public static FatDirectoryEntry read(ByteBuffer byteBuffer) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private void setFlag(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void setUnsignedInt16(int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void setUnsignedInt32(int i, long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void extractLfnPart(StringBuilder sb) {
    }

    /* JADX WARN: Invalid debug info offset */
    public long getCreatedDateTime() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    public long getFileSize() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    public long getLastAccessedDateTime() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    public long getLastModifiedDateTime() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    public ShortName getShortName() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public long getStartCluster() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getVolumeLabel() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isArchive() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isDeleted() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isDirectory() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isHidden() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isLfnEntry() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isReadOnly() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isShortNameExtLowerCase() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isShortNameLowerCase() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isSystem() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isVolume() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isVolumeLabel() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public void serialize(ByteBuffer byteBuffer) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setCreatedDateTime(long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setDirectory() {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setFileSize(long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setLastAccessedDateTime(long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setLastModifiedDateTime(long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setShortName(ShortName shortName) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setStartCluster(long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    public String toString() {
        return null;
    }
}
