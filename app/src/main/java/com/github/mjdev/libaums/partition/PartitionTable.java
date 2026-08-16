package com.github.mjdev.libaums.partition;

import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public interface PartitionTable {
    Collection<PartitionTableEntry> getPartitionTableEntries();

    int getSize();
}
