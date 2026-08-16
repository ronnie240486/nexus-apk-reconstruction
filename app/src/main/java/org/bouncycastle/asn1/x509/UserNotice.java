package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class UserNotice extends ASN1Encodable {
    private DisplayText explicitText;
    private NoticeReference noticeRef;

    /* JADX WARN: Invalid debug info offset */
    public UserNotice(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public UserNotice(NoticeReference noticeReference, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public UserNotice(NoticeReference noticeReference, DisplayText displayText) {
    }

    /* JADX WARN: Invalid debug info offset */
    public DisplayText getExplicitText() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public NoticeReference getNoticeRef() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
