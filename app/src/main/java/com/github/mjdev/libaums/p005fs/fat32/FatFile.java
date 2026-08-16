package com.github.mjdev.libaums.p005fs.fat32;

import com.github.mjdev.libaums.driver.BlockDeviceDriver;
import com.github.mjdev.libaums.p005fs.UsbFile;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class FatFile implements UsbFile {
    private BlockDeviceDriver blockDevice;
    private Fat32BootSector bootSector;
    private ClusterChain chain;
    private FatLfnDirectoryEntry entry;
    private FAT fat;
    private FatDirectory parent;

    /* JADX WARN: Invalid debug info offset */
    private FatFile(BlockDeviceDriver blockDeviceDriver, FAT fat, Fat32BootSector fat32BootSector, FatLfnDirectoryEntry fatLfnDirectoryEntry, FatDirectory fatDirectory) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static FatFile create(FatLfnDirectoryEntry fatLfnDirectoryEntry, BlockDeviceDriver blockDeviceDriver, FAT fat, Fat32BootSector fat32BootSector, FatDirectory fatDirectory) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private void initChain() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.github.mjdev.libaums.p005fs.UsbFile, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.github.mjdev.libaums.p005fs.UsbFile
    public UsbFile createDirectory(String str) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.github.mjdev.libaums.p005fs.UsbFile
    public UsbFile createFile(String str) throws IOException {
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

    @Override // com.github.mjdev.libaums.p005fs.UsbFile
    public boolean isDirectory() {
        return false;
    }

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
    public String[] list() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.github.mjdev.libaums.p005fs.UsbFile
    public UsbFile[] listFiles() throws IOException {
        return null;
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
    @Override // com.github.mjdev.libaums.p005fs.UsbFile
    public UsbFile search(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.github.mjdev.libaums.p005fs.UsbFile
    public void setLength(long j) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.github.mjdev.libaums.p005fs.UsbFile
    public void setName(String str) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.github.mjdev.libaums.p005fs.UsbFile
    public void write(long j, ByteBuffer byteBuffer) throws IOException {
    }
}
