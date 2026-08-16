package com.github.mjdev.libaums.p005fs;

import com.github.mjdev.libaums.driver.BlockDeviceDriver;
import com.github.mjdev.libaums.partition.PartitionTableEntry;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class FileSystemFactory {
    private static List<FileSystemCreator> fileSystems = new ArrayList();

    public static class UnsupportedFileSystemException extends Exception {
    }

    static {
        registerFileSystem(new Fat32FileSystemCreator());
    }

    /* JADX WARN: Invalid debug info offset */
    public static FileSystem createFileSystem(PartitionTableEntry partitionTableEntry, BlockDeviceDriver blockDeviceDriver) throws IOException, UnsupportedFileSystemException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static synchronized void registerFileSystem(com.github.mjdev.libaums.p005fs.FileSystemCreator r2) {
        /*
            return
        La:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.mjdev.libaums.p005fs.FileSystemFactory.registerFileSystem(com.github.mjdev.libaums.fs.FileSystemCreator):void");
    }
}
