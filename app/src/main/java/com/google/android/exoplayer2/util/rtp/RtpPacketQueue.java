package com.google.android.exoplayer2.util.rtp;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class RtpPacketQueue {
    private static final int MAX_SEGMENT_SIZE = 1316;
    private final ByteBuffer buffer;
    private final int capacity;
    private final RtpPacketQueueItem[] packets;
    private int back = 0;
    private int front = 0;
    private long total = 0;

    public class RtpPacketQueueItem {
        public RtpPacket packet = null;
        public int length = 0;
        public int offset = 0;

        public RtpPacketQueueItem() {
        }

        public void reset() {
            this.packet = null;
            this.length = 0;
            this.offset = 0;
        }
    }

    public RtpPacketQueue(int i) {
        this.capacity = i;
        this.buffer = ByteBuffer.allocate(i * MAX_SEGMENT_SIZE);
        this.packets = new RtpPacketQueueItem[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.packets[i2] = new RtpPacketQueueItem();
        }
    }

    public synchronized RtpPacket front() {
        return this.packets[this.front].packet;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0054  */
    public synchronized int get(byte[] bArr, int i, int i2) throws BufferUnderflowException {
        int iMin;
        if (i2 > 0) {
            try {
                int i3 = this.packets[this.front].length;
                if (i3 > 0) {
                    iMin = Math.min(i2, i3);
                    RtpPacketQueueItem[] rtpPacketQueueItemArr = this.packets;
                    int i4 = this.front;
                    RtpPacketQueueItem rtpPacketQueueItem = rtpPacketQueueItemArr[i4];
                    if (rtpPacketQueueItem.length >= iMin) {
                        this.buffer.position((i4 * MAX_SEGMENT_SIZE) + rtpPacketQueueItem.offset);
                        this.buffer.get(bArr, i, iMin);
                        RtpPacketQueueItem rtpPacketQueueItem2 = this.packets[this.front];
                        int i5 = rtpPacketQueueItem2.length - iMin;
                        rtpPacketQueueItem2.length = i5;
                        if (i5 == 0) {
                            rtpPacketQueueItem2.reset();
                            this.front = (this.front + 1) % this.capacity;
                        } else {
                            rtpPacketQueueItem2.offset += iMin;
                        }
                        this.total -= (long) iMin;
                    }
                } else {
                    iMin = 0;
                }
            } catch (Throwable th) {
                throw th;
            }
        } else {
            iMin = 0;
        }
        return iMin;
    }

    public synchronized boolean isDataAvailable() {
        return this.total > 0;
    }

    public synchronized int push(RtpPacket rtpPacket) throws BufferUnderflowException {
        if (rtpPacket != null) {
            if (this.packets[this.back].length == 0) {
                int length = rtpPacket.getPayload().length;
                RtpPacketQueueItem[] rtpPacketQueueItemArr = this.packets;
                int i = this.back;
                RtpPacketQueueItem rtpPacketQueueItem = rtpPacketQueueItemArr[i];
                rtpPacketQueueItem.packet = rtpPacket;
                rtpPacketQueueItem.length = length;
                rtpPacketQueueItem.offset = 0;
                this.buffer.position(i * MAX_SEGMENT_SIZE);
                this.buffer.put(rtpPacket.getPayload());
                this.total += (long) length;
                this.back = (this.back + 1) % this.capacity;
                return length;
            }
        }
        return -1;
    }

    public synchronized void reset() {
        this.back = 0;
        this.front = 0;
        this.total = 0L;
        this.buffer.rewind();
        for (int i = 0; i < this.capacity; i++) {
            this.packets[i].reset();
        }
    }
}
