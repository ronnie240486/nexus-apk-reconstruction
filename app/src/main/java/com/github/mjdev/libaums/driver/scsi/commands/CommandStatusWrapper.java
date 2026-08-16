package com.github.mjdev.libaums.driver.scsi.commands;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class CommandStatusWrapper {
    public static final int COMMAND_FAILED = 1;
    public static final int COMMAND_PASSED = 0;
    private static final int D_CSW_SIGNATURE = 1396855637;
    public static final int PHASE_ERROR = 2;
    public static final int SIZE = 13;
    private static final String TAG = "CommandStatusWrapper";
    private byte bCswStatus;
    private int dCswDataResidue;
    private int dCswSignature;
    private int dCswTag;

    /* JADX WARN: Invalid debug info offset */
    public byte getbCswStatus() {
        return (byte) 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getdCswDataResidue() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getdCswTag() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public void read(ByteBuffer byteBuffer) {
    }
}
