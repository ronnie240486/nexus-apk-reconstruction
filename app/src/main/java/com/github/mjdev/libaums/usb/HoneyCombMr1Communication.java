package com.github.mjdev.libaums.usb;

import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbEndpoint;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
class HoneyCombMr1Communication implements UsbCommunication {
    private UsbDeviceConnection deviceConnection;
    private UsbEndpoint inEndpoint;
    private UsbEndpoint outEndpoint;

    /* JADX WARN: Invalid debug info offset */
    public HoneyCombMr1Communication(UsbDeviceConnection usbDeviceConnection, UsbEndpoint usbEndpoint, UsbEndpoint usbEndpoint2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.github.mjdev.libaums.usb.UsbCommunication
    public int bulkInTransfer(ByteBuffer byteBuffer) throws IOException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.github.mjdev.libaums.usb.UsbCommunication
    public int bulkOutTransfer(ByteBuffer byteBuffer) throws IOException {
        return 0;
    }
}
