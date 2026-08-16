package com.github.mjdev.libaums.driver.scsi.commands;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class ScsiReadCapacity extends CommandBlockWrapper {
    private static final byte LENGTH = 16;
    private static final byte OPCODE = 37;
    private static final int RESPONSE_LENGTH = 8;

    /* JADX WARN: Invalid debug info offset */
    @Override // com.github.mjdev.libaums.driver.scsi.commands.CommandBlockWrapper
    public void serialize(ByteBuffer byteBuffer) {
    }
}
