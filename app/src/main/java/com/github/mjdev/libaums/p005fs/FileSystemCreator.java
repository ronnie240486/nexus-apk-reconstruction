package com.github.mjdev.libaums.p005fs;

import com.github.mjdev.libaums.driver.BlockDeviceDriver;
import com.github.mjdev.libaums.partition.PartitionTableEntry;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public interface FileSystemCreator {
    FileSystem read(PartitionTableEntry partitionTableEntry, BlockDeviceDriver blockDeviceDriver) throws IOException;
}
