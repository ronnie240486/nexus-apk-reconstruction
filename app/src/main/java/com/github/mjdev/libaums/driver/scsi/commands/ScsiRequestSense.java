package com.github.mjdev.libaums.driver.scsi.commands;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class ScsiRequestSense extends CommandBlockWrapper {
    private static final byte LENGTH = 6;
    private static final byte OPCODE = 3;
    private byte allocationLength;

    /* JADX WARN: Invalid debug info offset */
    public ScsiRequestSense(byte b) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.github.mjdev.libaums.driver.scsi.commands.CommandBlockWrapper
    public void serialize(ByteBuffer byteBuffer) {
    }
}
