package com.github.mjdev.libaums.driver.scsi;

import com.github.mjdev.libaums.driver.BlockDeviceDriver;
import com.github.mjdev.libaums.driver.scsi.commands.CommandBlockWrapper;
import com.github.mjdev.libaums.driver.scsi.commands.CommandStatusWrapper;
import com.github.mjdev.libaums.driver.scsi.commands.ScsiRead10;
import com.github.mjdev.libaums.driver.scsi.commands.ScsiWrite10;
import com.github.mjdev.libaums.usb.UsbCommunication;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class ScsiBlockDevice implements BlockDeviceDriver {
    private static final String TAG = "ScsiBlockDevice";
    private int blockSize;
    private CommandStatusWrapper csw;
    private ByteBuffer cswBuffer;
    private int lastBlockAddress;
    private ByteBuffer outBuffer;
    private ScsiRead10 readCommand;
    private UsbCommunication usbCommunication;
    private ScsiWrite10 writeCommand;

    /* JADX WARN: Invalid debug info offset */
    public ScsiBlockDevice(UsbCommunication usbCommunication) {
    }

    /* JADX WARN: Invalid debug info offset */
    private boolean transferCommand(CommandBlockWrapper commandBlockWrapper, ByteBuffer byteBuffer) throws IOException {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.github.mjdev.libaums.driver.BlockDeviceDriver
    public int getBlockSize() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.github.mjdev.libaums.driver.BlockDeviceDriver
    public void init() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // com.github.mjdev.libaums.driver.BlockDeviceDriver
    public synchronized void read(long r3, java.nio.ByteBuffer r5) throws java.io.IOException {
        /*
            r2 = this;
            return
        L24:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.mjdev.libaums.driver.scsi.ScsiBlockDevice.read(long, java.nio.ByteBuffer):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // com.github.mjdev.libaums.driver.BlockDeviceDriver
    public synchronized void write(long r3, java.nio.ByteBuffer r5) throws java.io.IOException {
        /*
            r2 = this;
            return
        L24:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.mjdev.libaums.driver.scsi.ScsiBlockDevice.write(long, java.nio.ByteBuffer):void");
    }
}
