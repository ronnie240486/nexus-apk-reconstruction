package com.github.mjdev.libaums.usb;

import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbEndpoint;

/* JADX INFO: loaded from: classes.dex */
public class UsbCommunicationFactory {
    private static final String TAG = "UsbCommunicationFactory";
    private static UnderlyingUsbCommunication underlyingUsbCommunication = UnderlyingUsbCommunication.DEVICE_CONNECTION_SYNC;

    public enum UnderlyingUsbCommunication {
        USB_REQUEST_ASYNC,
        DEVICE_CONNECTION_SYNC
    }

    /* JADX WARN: Invalid debug info offset */
    public static UsbCommunication createUsbCommunication(UsbDeviceConnection usbDeviceConnection, UsbEndpoint usbEndpoint, UsbEndpoint usbEndpoint2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static void setUnderlyingUsbCommunication(UnderlyingUsbCommunication underlyingUsbCommunication2) {
    }
}
