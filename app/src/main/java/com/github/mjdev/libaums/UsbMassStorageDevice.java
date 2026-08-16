package com.github.mjdev.libaums;

import android.content.Context;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbEndpoint;
import android.hardware.usb.UsbInterface;
import android.hardware.usb.UsbManager;
import com.github.mjdev.libaums.driver.BlockDeviceDriver;
import com.github.mjdev.libaums.partition.Partition;
import com.github.mjdev.libaums.partition.PartitionTable;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class UsbMassStorageDevice {
    private static final int INTERFACE_PROTOCOL = 80;
    private static final int INTERFACE_SUBCLASS = 6;
    private static final String TAG = "UsbMassStorageDevice";
    private BlockDeviceDriver blockDevice;
    private UsbDeviceConnection deviceConnection;
    private UsbEndpoint inEndpoint;
    private boolean inited;
    private UsbEndpoint outEndpoint;
    private PartitionTable partitionTable;
    private List<Partition> partitions;
    private UsbDevice usbDevice;
    private UsbInterface usbInterface;
    private UsbManager usbManager;

    /* JADX WARN: Invalid debug info offset */
    private UsbMassStorageDevice(UsbManager usbManager, UsbDevice usbDevice, UsbInterface usbInterface, UsbEndpoint usbEndpoint, UsbEndpoint usbEndpoint2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static UsbMassStorageDevice[] getMassStorageDevices(Context context) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private void initPartitions() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    private void setupDevice() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public void close() {
    }

    /* JADX WARN: Invalid debug info offset */
    public List<Partition> getPartitions() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public UsbDevice getUsbDevice() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void init() throws IOException {
    }
}
