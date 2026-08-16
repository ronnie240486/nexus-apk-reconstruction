package com.github.mjdev.libaums.p005fs;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public interface UsbFile extends Closeable {
    public static final String separator = "/";

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    UsbFile createDirectory(String str) throws IOException;

    UsbFile createFile(String str) throws IOException;

    long createdAt();

    void delete() throws IOException;

    void flush() throws IOException;

    long getLength();

    String getName();

    UsbFile getParent();

    boolean isDirectory();

    boolean isRoot();

    long lastAccessed();

    long lastModified();

    String[] list() throws IOException;

    UsbFile[] listFiles() throws IOException;

    void moveTo(UsbFile usbFile) throws IOException;

    void read(long j, ByteBuffer byteBuffer) throws IOException;

    @Nullable
    UsbFile search(@NonNull String str) throws IOException;

    void setLength(long j) throws IOException;

    void setName(String str) throws IOException;

    void write(long j, ByteBuffer byteBuffer) throws IOException;
}
