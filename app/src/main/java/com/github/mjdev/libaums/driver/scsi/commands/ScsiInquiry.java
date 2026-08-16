package com.github.mjdev.libaums.driver.scsi.commands;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class ScsiInquiry extends CommandBlockWrapper {
    private static final byte LENGTH = 6;
    private static final byte OPCODE = 18;
    private byte allocationLength;

    /* JADX WARN: Invalid debug info offset */
    public ScsiInquiry(byte b) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.github.mjdev.libaums.driver.scsi.commands.CommandBlockWrapper
    public void serialize(ByteBuffer byteBuffer) {
    }
}
