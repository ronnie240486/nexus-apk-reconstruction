package org.bouncycastle.asn1.icao;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes2.dex */
public class LDSSecurityObject extends ASN1Encodable implements ICAOObjectIdentifiers {
    public static final int ub_DataGroups = 16;
    private DataGroupHash[] datagroupHash;
    private AlgorithmIdentifier digestAlgorithmIdentifier;
    private DERInteger version;
    private LDSVersionInfo versionInfo;

    /* JADX WARN: Invalid debug info offset */
    private LDSSecurityObject(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public LDSSecurityObject(AlgorithmIdentifier algorithmIdentifier, DataGroupHash[] dataGroupHashArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public LDSSecurityObject(AlgorithmIdentifier algorithmIdentifier, DataGroupHash[] dataGroupHashArr, LDSVersionInfo lDSVersionInfo) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void checkDatagroupHashSeqSize(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static LDSSecurityObject getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DataGroupHash[] getDatagroupHash() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public AlgorithmIdentifier getDigestAlgorithmIdentifier() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getVersion() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public LDSVersionInfo getVersionInfo() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
