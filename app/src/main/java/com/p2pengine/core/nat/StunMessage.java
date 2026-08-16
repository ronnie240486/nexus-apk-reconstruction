package com.p2pengine.core.nat;

import java.net.InetSocketAddress;

/* JADX INFO: loaded from: classes2.dex */
public class StunMessage {

    /* JADX INFO: renamed from: a */
    public byte[] f11775a;

    /* JADX INFO: renamed from: b */
    public StunMessageType f11776b;

    /* JADX INFO: renamed from: c */
    public int f11777c;

    /* JADX INFO: renamed from: d */
    public InetSocketAddress f11778d;

    /* JADX INFO: renamed from: e */
    public InetSocketAddress f11779e;

    /* JADX INFO: renamed from: f */
    public InetSocketAddress f11780f;

    /* JADX INFO: renamed from: g */
    public InetSocketAddress f11781g;

    /* JADX INFO: renamed from: h */
    public C3948a f11782h;

    /* JADX INFO: renamed from: i */
    public C3950c f11783i;

    public enum AttributeType {
        MappedAddress(1),
        ResponseAddress(2),
        ChangeRequest(3),
        SourceAddress(4),
        ChangedAddress(5),
        Username(6),
        Password(7),
        MessageIntegrity(8),
        ErrorCode(9),
        UnknownAttribute(10),
        ReflectedFrom(11),
        XorMappedAddress(32800),
        XorOnly(33),
        ServerName(32802);

        private int value;

        AttributeType(int i) {
            this.value = i;
        }

        public static AttributeType getTypeByValue(int i) {
            for (AttributeType attributeType : values()) {
                if (attributeType.value == i) {
                    return attributeType;
                }
            }
            return null;
        }

        public int value() {
            return this.value;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static int m18198a(byte b) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static InetSocketAddress m18199a(byte[] bArr, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static void m18200a(AttributeType attributeType, InetSocketAddress inetSocketAddress, byte[] bArr, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public void m18201a(byte[] bArr) {
    }
}
