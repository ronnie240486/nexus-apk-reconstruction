package com.github.mjdev.libaums.driver.scsi.commands;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class CommandBlockWrapper {
    private static final int D_CBW_SIGNATURE = 1128420181;
    private byte bCbwLun;
    private byte bCbwcbLength;
    private byte bmCbwFlags;
    protected int dCbwDataTransferLength;
    private int dCbwTag;
    private Direction direction;

    public enum Direction {
        IN,
        OUT,
        NONE
    }

    /* JADX WARN: Invalid debug info offset */
    public CommandBlockWrapper(int i, Direction direction, byte b, byte b2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public Direction getDirection() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getdCbwDataTransferLength() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getdCbwTag() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public void serialize(ByteBuffer byteBuffer) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setdCbwTag(int i) {
    }
}
