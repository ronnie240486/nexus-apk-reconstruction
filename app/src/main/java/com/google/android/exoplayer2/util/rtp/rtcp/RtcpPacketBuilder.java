package com.google.android.exoplayer2.util.rtp.rtcp;

import androidx.annotation.Nullable;
import java.util.List;
import p000.C4783m8;

/* JADX INFO: loaded from: classes2.dex */
public class RtcpPacketBuilder {
    private static final byte PADDING = 0;
    public static final int RTCP_APP = 204;
    public static final int RTCP_BYE = 203;
    public static final int RTCP_PSFB = 206;
    private static final int RTCP_RAMS_TLV_SSRC = 1;
    public static final int RTCP_RR = 201;
    public static final int RTCP_RTPFB = 205;
    public static final int RTCP_SDES = 202;
    private static final byte RTCP_SDES_CNAME = 1;
    private static final byte RTCP_SDES_EMAIL = 3;
    private static final byte RTCP_SDES_END = 0;
    private static final byte RTCP_SDES_LOC = 5;
    private static final byte RTCP_SDES_NAME = 2;
    private static final byte RTCP_SDES_NOTE = 7;
    private static final byte RTCP_SDES_PHONE = 4;
    private static final byte RTCP_SDES_PRIV = 8;
    private static final byte RTCP_SDES_TOOL = 6;
    public static final int RTCP_SFMT_RAMS_INFO = 2;
    public static final int RTCP_SFMT_RAMS_REQ = 1;
    public static final int RTCP_SFMT_RAMS_TERM = 3;
    public static final int RTCP_SMT_PORT_MAPPING_REQ = 1;
    public static final int RTCP_SMT_PORT_MAPPING_RESP = 2;
    public static final int RTCP_SMT_TOKEN_VERIFY_FAIL = 4;
    public static final int RTCP_SMT_TOKEN_VERIFY_REQ = 3;
    public static final int RTCP_SR = 200;
    public static final int RTCP_TOKEN = 210;
    private static final byte VERSION = 2;

    public static class NackFbElement {
        private int blp;
        private int pid;

        public NackFbElement(int i, int i2) {
            this.pid = i;
            this.blp = i2;
        }

        public int getBlp() {
            return this.blp;
        }

        public int getPid() {
            return this.pid;
        }
    }

    public static class PrivateExtension extends TlvElement {
        private long enterpriseNumber;

        public PrivateExtension(long j, long j2, @Nullable byte[] bArr, long j3) {
            super(j, j2, bArr);
            this.enterpriseNumber = j3;
        }

        public long getEnterpriseNumber() {
            return this.enterpriseNumber;
        }
    }

    public static class TlvElement {
        private long length;
        private long type;
        private byte[] value;

        public TlvElement(long j, long j2, @Nullable byte[] bArr) {
            this.type = j;
            this.length = j2;
            this.value = bArr;
        }

        public long getLength() {
            return this.length;
        }

        public long getType() {
            return this.type;
        }

        public byte[] getValue() {
            return this.value;
        }
    }

    private static byte[] assembleRTCPAppPacket(long j, String str, byte[] bArr) {
        byte[] bArrLongToBytes = RtcpPacketUtils.longToBytes(204L, 1);
        byte[] bArrLongToBytes2 = RtcpPacketUtils.longToBytes(j, 4);
        byte[] bytes = str.getBytes();
        return RtcpPacketUtils.append(RtcpPacketUtils.append(RtcpPacketUtils.append(RtcpPacketUtils.append(RtcpPacketUtils.append(new byte[]{C4783m8.f15110b}, bArrLongToBytes), RtcpPacketUtils.longToBytes(((((bArrLongToBytes2.length + 4) + (bytes.length + bArr.length)) + 2) / 4) - 1, 2)), bArrLongToBytes2), bytes), bArr);
    }

    private static byte[] assembleRTCPByePacket(long j) {
        byte[] bArrLongToBytes = RtcpPacketUtils.longToBytes(203L, 1);
        byte[] bArrLongToBytes2 = RtcpPacketUtils.longToBytes(j, 4);
        return RtcpPacketUtils.append(RtcpPacketUtils.append(RtcpPacketUtils.append(RtcpPacketUtils.append(new byte[]{-127}, bArrLongToBytes), RtcpPacketUtils.longToBytes(((bArrLongToBytes2.length + 4) / 4) - 1, 2)), bArrLongToBytes2), RtcpPacketUtils.longToBytes(0L, 1));
    }

    private static byte[] assembleRTCPLackSynchIndicationPacket(long j, long j2, long j3, List<TlvElement> list) {
        byte[] bArrLongToBytes = RtcpPacketUtils.longToBytes(205L, 1);
        byte[] bArrLongToBytes2 = RtcpPacketUtils.longToBytes(j, 4);
        byte[] bArrLongToBytes3 = RtcpPacketUtils.longToBytes(j2, 4);
        byte[] bArrLongToBytes4 = RtcpPacketUtils.longToBytes(j3, 8);
        int length = 0;
        for (int i = 0; i < list.size(); i++) {
            length = (int) (list.get(i).getLength() + ((long) length));
        }
        byte[] bArrAppend = RtcpPacketUtils.append(RtcpPacketUtils.append(RtcpPacketUtils.append(RtcpPacketUtils.append(new byte[]{-126}, bArrLongToBytes), RtcpPacketUtils.longToBytes(((((bArrLongToBytes4.length + length) + ((bArrLongToBytes2.length + 4) + bArrLongToBytes3.length)) + 2) / 4) - 1, 2)), bArrLongToBytes2), bArrLongToBytes3);
        byte[] bArrLongToBytes5 = RtcpPacketUtils.longToBytes(1L, 1);
        byte[] bArrLongToBytes6 = RtcpPacketUtils.longToBytes(0L, 3);
        byte[] bArrLongToBytes7 = RtcpPacketUtils.longToBytes(1L, 1);
        byte[] bArrLongToBytes8 = RtcpPacketUtils.longToBytes(0L, 1);
        byte[] bArrAppend2 = RtcpPacketUtils.append(RtcpPacketUtils.append(RtcpPacketUtils.append(RtcpPacketUtils.append(RtcpPacketUtils.append(RtcpPacketUtils.append(bArrAppend, bArrLongToBytes5), bArrLongToBytes6), bArrLongToBytes7), bArrLongToBytes8), RtcpPacketUtils.longToBytes(0L, 2)), RtcpPacketUtils.longToBytes(0L, 4));
        for (int i2 = 0; i2 < list.size(); i2++) {
            TlvElement tlvElement = list.get(i2);
            bArrAppend2 = RtcpPacketUtils.append(RtcpPacketUtils.append(RtcpPacketUtils.append(RtcpPacketUtils.append(bArrAppend2, RtcpPacketUtils.longToBytes(tlvElement.getType(), 1)), bArrLongToBytes8), RtcpPacketUtils.longToBytes(tlvElement.getLength(), 2)), tlvElement.getValue());
        }
        return bArrAppend2;
    }

    private static byte[] assembleRTCPNackPacket(long j, long j2, List<NackFbElement> list) {
        byte[] bArrLongToBytes = RtcpPacketUtils.longToBytes(205L, 1);
        byte[] bArrLongToBytes2 = RtcpPacketUtils.longToBytes(j, 4);
        byte[] bArrLongToBytes3 = RtcpPacketUtils.longToBytes(j2, 4);
        byte[] bArrAppend = RtcpPacketUtils.append(RtcpPacketUtils.append(RtcpPacketUtils.append(RtcpPacketUtils.append(new byte[]{-127}, bArrLongToBytes), RtcpPacketUtils.longToBytes(((((list.size() * 4) + ((bArrLongToBytes2.length + 4) + bArrLongToBytes3.length)) + 2) / 4) - 1, 2)), bArrLongToBytes2), bArrLongToBytes3);
        for (int i = 0; i < list.size(); i++) {
            NackFbElement nackFbElement = list.get(i);
            bArrAppend = RtcpPacketUtils.append(RtcpPacketUtils.append(bArrAppend, RtcpPacketUtils.longToBytes(nackFbElement.getPid(), 2)), RtcpPacketUtils.longToBytes(nackFbElement.getPid(), 2));
        }
        return bArrAppend;
    }

    private static byte[] assembleRTCPPortMappingRequestPacket(long j, byte[] bArr) {
        byte[] bArrLongToBytes = RtcpPacketUtils.longToBytes(210L, 1);
        byte[] bArrLongToBytes2 = RtcpPacketUtils.longToBytes(j, 4);
        int iCalculate64PadLength = RtcpPacketUtils.calculate64PadLength(bArr.length);
        byte[] bArrAppend = RtcpPacketUtils.append(RtcpPacketUtils.append(RtcpPacketUtils.append(RtcpPacketUtils.append(new byte[]{-127}, bArrLongToBytes), RtcpPacketUtils.longToBytes((((((bArrLongToBytes2.length + 4) + bArr.length) + iCalculate64PadLength) + 2) / 4) - 1, 2)), bArrLongToBytes2), bArr);
        return iCalculate64PadLength > 0 ? RtcpPacketUtils.append(bArrAppend, new byte[iCalculate64PadLength]) : bArrAppend;
    }

    private static byte[] assembleRTCPRamsRequestPacket(long j, long j2, List<TlvElement> list, List<PrivateExtension> list2) {
        byte[] bArrLongToBytes = RtcpPacketUtils.longToBytes(205L, 1);
        byte[] bArrLongToBytes2 = RtcpPacketUtils.longToBytes(j, 4);
        byte[] bArrLongToBytes3 = RtcpPacketUtils.longToBytes(j2, 4);
        int length = 0;
        for (int i = 0; i < list.size(); i++) {
            length = (int) (list.get(i).getLength() + ((long) length));
        }
        for (int i2 = 0; i2 < list2.size(); i2++) {
            length = (int) (list2.get(i2).getLength() + ((long) length));
        }
        byte[] bArrAppend = RtcpPacketUtils.append(RtcpPacketUtils.append(RtcpPacketUtils.append(RtcpPacketUtils.append(new byte[]{-122}, bArrLongToBytes), RtcpPacketUtils.longToBytes(((((length + 8) + ((bArrLongToBytes2.length + 4) + bArrLongToBytes3.length)) + 2) / 4) - 1, 2)), bArrLongToBytes2), bArrLongToBytes3);
        byte[] bArrLongToBytes4 = RtcpPacketUtils.longToBytes(1L, 1);
        byte[] bArrLongToBytes5 = RtcpPacketUtils.longToBytes(0L, 3);
        byte[] bArrLongToBytes6 = RtcpPacketUtils.longToBytes(1L, 1);
        byte[] bArrLongToBytes7 = RtcpPacketUtils.longToBytes(0L, 1);
        byte[] bArrAppend2 = RtcpPacketUtils.append(RtcpPacketUtils.append(RtcpPacketUtils.append(RtcpPacketUtils.append(RtcpPacketUtils.append(bArrAppend, bArrLongToBytes4), bArrLongToBytes5), bArrLongToBytes6), bArrLongToBytes7), RtcpPacketUtils.longToBytes(0L, 2));
        for (int i3 = 0; i3 < list.size(); i3++) {
            TlvElement tlvElement = list.get(i3);
            bArrAppend2 = RtcpPacketUtils.append(RtcpPacketUtils.append(RtcpPacketUtils.append(RtcpPacketUtils.append(bArrAppend2, RtcpPacketUtils.longToBytes(tlvElement.getType(), 1)), bArrLongToBytes7), RtcpPacketUtils.longToBytes(tlvElement.getLength(), 2)), tlvElement.getValue());
        }
        for (int i4 = 0; i4 < list2.size(); i4++) {
            PrivateExtension privateExtension = list2.get(i4);
            bArrAppend2 = RtcpPacketUtils.append(RtcpPacketUtils.append(RtcpPacketUtils.append(RtcpPacketUtils.append(RtcpPacketUtils.append(bArrAppend2, RtcpPacketUtils.longToBytes(privateExtension.getType(), 1)), bArrLongToBytes7), RtcpPacketUtils.longToBytes(privateExtension.getLength(), 2)), RtcpPacketUtils.longToBytes(privateExtension.getEnterpriseNumber(), 4)), privateExtension.getValue());
        }
        return bArrAppend2;
    }

    private static byte[] assembleRTCPRamsTerminationPacket(long j, long j2, List<TlvElement> list, List<PrivateExtension> list2) {
        byte[] bArrLongToBytes = RtcpPacketUtils.longToBytes(205L, 1);
        byte[] bArrLongToBytes2 = RtcpPacketUtils.longToBytes(j, 4);
        byte[] bArrLongToBytes3 = RtcpPacketUtils.longToBytes(j2, 4);
        int length = 0;
        for (int i = 0; i < list.size(); i++) {
            length = (int) (list.get(i).getLength() + ((long) length));
        }
        for (int i2 = 0; i2 < list2.size(); i2++) {
            length = (int) (list2.get(i2).getLength() + ((long) length));
        }
        byte[] bArrAppend = RtcpPacketUtils.append(RtcpPacketUtils.append(RtcpPacketUtils.append(RtcpPacketUtils.append(new byte[]{-122}, bArrLongToBytes), RtcpPacketUtils.longToBytes((((((bArrLongToBytes2.length + 4) + bArrLongToBytes3.length) + length) + 2) / 4) - 1, 2)), bArrLongToBytes2), bArrLongToBytes3);
        byte[] bArrLongToBytes4 = RtcpPacketUtils.longToBytes(3L, 1);
        byte[] bArrLongToBytes5 = RtcpPacketUtils.longToBytes(0L, 3);
        byte[] bArrLongToBytes6 = RtcpPacketUtils.longToBytes(0L, 1);
        byte[] bArrAppend2 = RtcpPacketUtils.append(RtcpPacketUtils.append(bArrAppend, bArrLongToBytes4), bArrLongToBytes5);
        for (int i3 = 0; i3 < list.size(); i3++) {
            TlvElement tlvElement = list.get(i3);
            bArrAppend2 = RtcpPacketUtils.append(RtcpPacketUtils.append(RtcpPacketUtils.append(RtcpPacketUtils.append(bArrAppend2, RtcpPacketUtils.longToBytes(tlvElement.getType(), 1)), bArrLongToBytes6), RtcpPacketUtils.longToBytes(tlvElement.getLength(), 2)), tlvElement.getValue());
        }
        for (int i4 = 0; i4 < list2.size(); i4++) {
            PrivateExtension privateExtension = list2.get(i4);
            bArrAppend2 = RtcpPacketUtils.append(RtcpPacketUtils.append(RtcpPacketUtils.append(RtcpPacketUtils.append(RtcpPacketUtils.append(bArrAppend2, RtcpPacketUtils.longToBytes(privateExtension.getType(), 1)), bArrLongToBytes6), RtcpPacketUtils.longToBytes(privateExtension.getLength(), 2)), RtcpPacketUtils.longToBytes(privateExtension.getEnterpriseNumber(), 4)), privateExtension.getValue());
        }
        return bArrAppend2;
    }

    private static byte[] assembleRTCPReceiverReportPacket(long j) {
        byte[] bArrLongToBytes = RtcpPacketUtils.longToBytes(j, 4);
        return RtcpPacketUtils.append(RtcpPacketUtils.append(RtcpPacketUtils.append(new byte[]{(byte) (((byte) (((byte) 0) & 31)) | C4783m8.f15110b)}, RtcpPacketUtils.longToBytes(201L, 1)), RtcpPacketUtils.longToBytes(((bArrLongToBytes.length + 4) / 4) - 1, 2)), bArrLongToBytes);
    }

    private static byte[] assembleRTCPSourceDescriptionPacket(long j, String str) {
        byte[] bArrLongToBytes = RtcpPacketUtils.longToBytes(202L, 1);
        byte[] bArrLongToBytes2 = RtcpPacketUtils.longToBytes(j, 4);
        byte[] bArr = new byte[str.length()];
        byte[] bytes = str.getBytes();
        byte[] bArrAppend = RtcpPacketUtils.append(RtcpPacketUtils.append(new byte[0], new byte[]{1, (byte) bytes.length}), bytes);
        int iCalculatePadLength = RtcpPacketUtils.calculatePadLength(bArrAppend.length);
        byte[] bArrAppend2 = RtcpPacketUtils.append(RtcpPacketUtils.append(RtcpPacketUtils.append(new byte[]{-127, bArrLongToBytes[0]}, RtcpPacketUtils.longToBytes((((((bArrLongToBytes2.length + 4) + bArrAppend.length) + iCalculatePadLength) + 4) / 4) - 1, 2)), bArrLongToBytes2), bArrAppend);
        if (iCalculatePadLength > 0) {
            bArrAppend2 = RtcpPacketUtils.append(bArrAppend2, new byte[iCalculatePadLength]);
        }
        return RtcpPacketUtils.append(bArrAppend2, new byte[4]);
    }

    private static byte[] assembleRTCPSynchCompletedIndicationPacket(long j, long j2, List<TlvElement> list) {
        byte[] bArrLongToBytes = RtcpPacketUtils.longToBytes(205L, 1);
        byte[] bArrLongToBytes2 = RtcpPacketUtils.longToBytes(j, 4);
        byte[] bArrLongToBytes3 = RtcpPacketUtils.longToBytes(j2, 4);
        int length = 0;
        for (int i = 0; i < list.size(); i++) {
            length = (int) (list.get(i).getLength() + ((long) length));
        }
        byte[] bArrAppend = RtcpPacketUtils.append(RtcpPacketUtils.append(RtcpPacketUtils.append(RtcpPacketUtils.append(new byte[]{-124}, bArrLongToBytes), RtcpPacketUtils.longToBytes((((((bArrLongToBytes2.length + 4) + bArrLongToBytes3.length) + length) + 2) / 4) - 1, 2)), bArrLongToBytes2), bArrLongToBytes3);
        byte[] bArrLongToBytes4 = RtcpPacketUtils.longToBytes(1L, 1);
        byte[] bArrLongToBytes5 = RtcpPacketUtils.longToBytes(0L, 3);
        byte[] bArrLongToBytes6 = RtcpPacketUtils.longToBytes(1L, 1);
        byte[] bArrLongToBytes7 = RtcpPacketUtils.longToBytes(0L, 1);
        byte[] bArrAppend2 = RtcpPacketUtils.append(RtcpPacketUtils.append(RtcpPacketUtils.append(RtcpPacketUtils.append(RtcpPacketUtils.append(RtcpPacketUtils.append(bArrAppend, bArrLongToBytes4), bArrLongToBytes5), bArrLongToBytes6), bArrLongToBytes7), RtcpPacketUtils.longToBytes(0L, 2)), RtcpPacketUtils.longToBytes(0L, 4));
        for (int i2 = 0; i2 < list.size(); i2++) {
            TlvElement tlvElement = list.get(i2);
            bArrAppend2 = RtcpPacketUtils.append(RtcpPacketUtils.append(RtcpPacketUtils.append(RtcpPacketUtils.append(bArrAppend2, RtcpPacketUtils.longToBytes(tlvElement.getType(), 1)), bArrLongToBytes7), RtcpPacketUtils.longToBytes(tlvElement.getLength(), 2)), tlvElement.getValue());
        }
        return bArrAppend2;
    }

    private static byte[] assembleRTCPTokenVerificationRequestPacket(long j, byte[] bArr, byte[] bArr2, long j2) {
        byte[] bArrLongToBytes = RtcpPacketUtils.longToBytes(210L, 1);
        byte[] bArrLongToBytes2 = RtcpPacketUtils.longToBytes(j, 4);
        int iCalculate64PadLength = RtcpPacketUtils.calculate64PadLength(bArr.length);
        byte[] bArrLongToBytes3 = RtcpPacketUtils.longToBytes(j2, 8);
        int iCalculatePadLength = RtcpPacketUtils.calculatePadLength(bArr2.length);
        byte[] bArrAppend = RtcpPacketUtils.append(RtcpPacketUtils.append(RtcpPacketUtils.append(RtcpPacketUtils.append(new byte[]{-125}, bArrLongToBytes), RtcpPacketUtils.longToBytes(((((((((bArrLongToBytes2.length + 4) + bArr.length) + iCalculate64PadLength) + bArr2.length) + iCalculatePadLength) + bArrLongToBytes3.length) + 2) / 4) - 1, 2)), bArrLongToBytes2), bArr);
        if (iCalculate64PadLength > 0) {
            bArrAppend = RtcpPacketUtils.append(bArrAppend, new byte[iCalculate64PadLength]);
        }
        byte[] bArrAppend2 = RtcpPacketUtils.append(bArrAppend, bArr2);
        if (iCalculatePadLength > 0) {
            bArrAppend2 = RtcpPacketUtils.append(bArrAppend2, new byte[iCalculatePadLength]);
        }
        return RtcpPacketUtils.append(bArrAppend2, bArrLongToBytes3);
    }

    public static byte[] buildAppPacket(long j, String str, String str2, byte[] bArr) {
        return RtcpPacketUtils.append(RtcpPacketUtils.append(RtcpPacketUtils.append(new byte[0], assembleRTCPReceiverReportPacket(j)), assembleRTCPSourceDescriptionPacket(j, str)), assembleRTCPAppPacket(j, str2, bArr));
    }

    public static byte[] buildByePacket(long j, String str) {
        return RtcpPacketUtils.append(RtcpPacketUtils.append(RtcpPacketUtils.append(new byte[0], assembleRTCPReceiverReportPacket(j)), assembleRTCPSourceDescriptionPacket(j, str)), assembleRTCPByePacket(j));
    }

    public static byte[] buildNackPacket(long j, String str, long j2, List<NackFbElement> list) {
        return RtcpPacketUtils.append(RtcpPacketUtils.append(RtcpPacketUtils.append(new byte[0], assembleRTCPReceiverReportPacket(j)), assembleRTCPSourceDescriptionPacket(j, str)), assembleRTCPNackPacket(j, j2, list));
    }

    public static byte[] buildPortMappingRequestPacket(long j, String str, byte[] bArr) {
        return RtcpPacketUtils.append(RtcpPacketUtils.append(RtcpPacketUtils.append(new byte[0], assembleRTCPReceiverReportPacket(j)), assembleRTCPSourceDescriptionPacket(j, str)), assembleRTCPPortMappingRequestPacket(j, bArr));
    }

    public static byte[] buildRamsRequestPacket(long j, String str, long j2, List<TlvElement> list, List<PrivateExtension> list2) {
        return RtcpPacketUtils.append(RtcpPacketUtils.append(RtcpPacketUtils.append(new byte[0], assembleRTCPReceiverReportPacket(j)), assembleRTCPSourceDescriptionPacket(j, str)), assembleRTCPRamsRequestPacket(j, j2, list, list2));
    }

    public static byte[] buildRamsTerminationPacket(long j, String str, long j2, List<TlvElement> list, List<PrivateExtension> list2) {
        return RtcpPacketUtils.append(RtcpPacketUtils.append(RtcpPacketUtils.append(new byte[0], assembleRTCPReceiverReportPacket(j)), assembleRTCPSourceDescriptionPacket(j, str)), assembleRTCPRamsTerminationPacket(j, j2, list, list2));
    }

    public static byte[] buildTokenVerificationRequestPacket(long j, String str, byte[] bArr, byte[] bArr2, long j2) {
        return RtcpPacketUtils.append(RtcpPacketUtils.append(RtcpPacketUtils.append(new byte[0], assembleRTCPReceiverReportPacket(j)), assembleRTCPSourceDescriptionPacket(j, str)), assembleRTCPTokenVerificationRequestPacket(j, bArr, bArr2, j2));
    }
}
