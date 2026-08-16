package com.github.mjdev.libaums.driver.scsi.commands;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class ScsiInquiryResponse {
    private byte peripheralDeviceType;
    private byte peripheralQualifier;
    boolean removableMedia;
    byte responseDataFormat;
    byte spcVersion;

    /* JADX WARN: Invalid debug info offset */
    private ScsiInquiryResponse() {
    }

    /* JADX WARN: Invalid debug info offset */
    public static ScsiInquiryResponse read(ByteBuffer byteBuffer) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public byte getPeripheralDeviceType() {
        return (byte) 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public byte getPeripheralQualifier() {
        return (byte) 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public byte getResponseDataFormat() {
        return (byte) 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public byte getSpcVersion() {
        return (byte) 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isRemovableMedia() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public String toString() {
        return null;
    }
}
