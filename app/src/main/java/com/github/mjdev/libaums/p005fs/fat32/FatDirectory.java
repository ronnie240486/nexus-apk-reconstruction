package com.github.mjdev.libaums.p005fs.fat32;

import com.github.mjdev.libaums.driver.BlockDeviceDriver;
import com.github.mjdev.libaums.p005fs.AbstractUsbFile;
import com.github.mjdev.libaums.p005fs.UsbFile;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class FatDirectory extends AbstractUsbFile {
    private static String TAG = "FatDirectory";
    private BlockDeviceDriver blockDevice;
    private Fat32BootSector bootSector;
    private ClusterChain chain;
    private List<FatLfnDirectoryEntry> entries;
    private FatLfnDirectoryEntry entry;
    private FAT fat;
    private boolean hasBeenInited;
    private Map<String, FatLfnDirectoryEntry> lfnMap;
    private FatDirectory parent;
    private Map<ShortName, FatDirectoryEntry> shortNameMap;
    private String volumeLabel;

    /* JADX WARN: Invalid debug info offset */
    private FatDirectory(BlockDeviceDriver blockDeviceDriver, FAT fat, Fat32BootSector fat32BootSector, FatDirectory fatDirectory) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void addEntry(FatLfnDirectoryEntry fatLfnDirectoryEntry, FatDirectoryEntry fatDirectoryEntry) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static FatDirectory create(FatLfnDirectoryEntry fatLfnDirectoryEntry, BlockDeviceDriver blockDeviceDriver, FAT fat, Fat32BootSector fat32BootSector, FatDirectory fatDirectory) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private void init() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    private void readEntries() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public static FatDirectory readRoot(BlockDeviceDriver blockDeviceDriver, FAT fat, Fat32BootSector fat32BootSector) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.github.mjdev.libaums.p005fs.UsbFile, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.github.mjdev.libaums.p005fs.UsbFile
    public /* bridge */ /* synthetic */ UsbFile createDirectory(String str) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.github.mjdev.libaums.p005fs.UsbFile
    public FatDirectory createDirectory(String str) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.github.mjdev.libaums.p005fs.UsbFile
    public /* bridge */ /* synthetic */ UsbFile createFile(String str) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.github.mjdev.libaums.p005fs.UsbFile
    public FatFile createFile(String str) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.github.mjdev.libaums.p005fs.UsbFile
    public long createdAt() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.github.mjdev.libaums.p005fs.UsbFile
    public void delete() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.github.mjdev.libaums.p005fs.UsbFile
    public void flush() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.github.mjdev.libaums.p005fs.UsbFile
    public long getLength() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.github.mjdev.libaums.p005fs.UsbFile
    public String getName() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.github.mjdev.libaums.p005fs.UsbFile
    public UsbFile getParent() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getVolumeLabel() {
        return null;
    }

    @Override // com.github.mjdev.libaums.p005fs.UsbFile
    public boolean isDirectory() {
        return true;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.github.mjdev.libaums.p005fs.UsbFile
    public boolean isRoot() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.github.mjdev.libaums.p005fs.UsbFile
    public long lastAccessed() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.github.mjdev.libaums.p005fs.UsbFile
    public long lastModified() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.github.mjdev.libaums.p005fs.UsbFile
    public String[] list() throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.github.mjdev.libaums.p005fs.UsbFile
    public UsbFile[] listFiles() throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void move(FatLfnDirectoryEntry fatLfnDirectoryEntry, UsbFile usbFile) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.github.mjdev.libaums.p005fs.UsbFile
    public void moveTo(UsbFile usbFile) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.github.mjdev.libaums.p005fs.UsbFile
    public void read(long j, ByteBuffer byteBuffer) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public void removeEntry(FatLfnDirectoryEntry fatLfnDirectoryEntry) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void renameEntry(FatLfnDirectoryEntry fatLfnDirectoryEntry, String str) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.github.mjdev.libaums.p005fs.UsbFile
    public void setLength(long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.github.mjdev.libaums.p005fs.UsbFile
    public void setName(String str) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public void write() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.github.mjdev.libaums.p005fs.UsbFile
    public void write(long j, ByteBuffer byteBuffer) throws IOException {
    }
}
