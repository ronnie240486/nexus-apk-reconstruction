package com.github.mjdev.libaums.partition.mbr;

import com.github.mjdev.libaums.partition.PartitionTable;
import com.github.mjdev.libaums.partition.PartitionTableEntry;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class MasterBootRecord implements PartitionTable {
    private static final int TABLE_ENTRY_SIZE = 16;
    private static final int TABLE_OFFSET = 446;
    public List<PartitionTableEntry> partitions;
    private static Map<Integer, Integer> partitionTypes = new HashMap<Integer, Integer>() { // from class: com.github.mjdev.libaums.partition.mbr.MasterBootRecord.1
    };
    private static final String TAG = "MasterBootRecord";

    /* JADX WARN: Invalid debug info offset */
    private MasterBootRecord() {
    }

    /* JADX WARN: Invalid debug info offset */
    public static MasterBootRecord read(ByteBuffer byteBuffer) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.github.mjdev.libaums.partition.PartitionTable
    public Collection<PartitionTableEntry> getPartitionTableEntries() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.github.mjdev.libaums.partition.PartitionTable
    public int getSize() {
        return 0;
    }
}
