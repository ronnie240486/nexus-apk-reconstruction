package com.github.mjdev.libaums.driver.scsi.commands;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class ScsiTestUnitReady extends CommandBlockWrapper {
    private static final byte LENGTH = 6;
    private static final byte OPCODE = 0;

    /* JADX WARN: Invalid debug info offset */
    @Override // com.github.mjdev.libaums.driver.scsi.commands.CommandBlockWrapper
    public void serialize(ByteBuffer byteBuffer) {
    }
}
