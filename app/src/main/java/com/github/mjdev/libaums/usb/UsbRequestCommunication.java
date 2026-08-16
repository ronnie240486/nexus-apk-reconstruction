package com.github.mjdev.libaums.usb;

import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbEndpoint;
import android.hardware.usb.UsbRequest;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
class UsbRequestCommunication implements UsbCommunication {
    private UsbDeviceConnection deviceConnection;
    private UsbRequest inRequest;
    private UsbRequest outRequest;
    private ByteBuffer workaroundBuffer;

    /* JADX WARN: Invalid debug info offset */
    public UsbRequestCommunication(UsbDeviceConnection usbDeviceConnection, UsbEndpoint usbEndpoint, UsbEndpoint usbEndpoint2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // com.github.mjdev.libaums.usb.UsbCommunication
    public synchronized int bulkInTransfer(java.nio.ByteBuffer r5) throws java.io.IOException {
        /*
            r4 = this;
            r0 = 0
            return r0
        L37:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.mjdev.libaums.usb.UsbRequestCommunication.bulkInTransfer(java.nio.ByteBuffer):int");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // com.github.mjdev.libaums.usb.UsbCommunication
    public synchronized int bulkOutTransfer(java.nio.ByteBuffer r6) throws java.io.IOException {
        /*
            r5 = this;
            r0 = 0
            return r0
        L3b:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.mjdev.libaums.usb.UsbRequestCommunication.bulkOutTransfer(java.nio.ByteBuffer):int");
    }
}
