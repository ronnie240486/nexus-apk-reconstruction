package com.github.mjdev.libaums.driver.scsi.commands;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class ScsiWrite10 extends CommandBlockWrapper {
    private static final byte LENGTH = 10;
    private static final byte OPCODE = 42;
    private int blockAddress;
    private int blockSize;
    private short transferBlocks;
    private int transferBytes;

    /* JADX WARN: Invalid debug info offset */
    public ScsiWrite10() {
    }

    /* JADX WARN: Invalid debug info offset */
    public ScsiWrite10(int i, int i2, int i3) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void init(int i, int i2, int i3) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.github.mjdev.libaums.driver.scsi.commands.CommandBlockWrapper
    public void serialize(ByteBuffer byteBuffer) {
    }

    /* JADX WARN: Invalid debug info offset */
    public String toString() {
        return null;
    }
}
