package org.bouncycastle.asn1.isismtt.x509;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.x500.DirectoryString;
import p000.C1656Zg;

/* JADX INFO: loaded from: classes2.dex */
public class ProfessionInfo extends ASN1Encodable {
    public static final DERObjectIdentifier Notar;
    public static final DERObjectIdentifier Notariatsverwalter;
    public static final DERObjectIdentifier Notariatsverwalterin;
    public static final DERObjectIdentifier Notarin;
    public static final DERObjectIdentifier Notarvertreter;
    public static final DERObjectIdentifier Notarvertreterin;
    public static final DERObjectIdentifier Patentanwalt;
    public static final DERObjectIdentifier Patentanwltin;
    public static final DERObjectIdentifier Rechtsanwalt;
    public static final DERObjectIdentifier Rechtsanwltin;
    public static final DERObjectIdentifier Rechtsbeistand;
    public static final DERObjectIdentifier Steuerberater;
    public static final DERObjectIdentifier Steuerberaterin;
    public static final DERObjectIdentifier Steuerbevollmchtigte;
    public static final DERObjectIdentifier Steuerbevollmchtigter;
    public static final DERObjectIdentifier VereidigteBuchprferin;
    public static final DERObjectIdentifier VereidigterBuchprfer;
    public static final DERObjectIdentifier Wirtschaftsprfer;
    public static final DERObjectIdentifier Wirtschaftsprferin;
    private ASN1OctetString addProfessionInfo;
    private NamingAuthority namingAuthority;
    private ASN1Sequence professionItems;
    private ASN1Sequence professionOIDs;
    private String registrationNumber;

    static {
        StringBuilder sb = new StringBuilder();
        DERObjectIdentifier dERObjectIdentifier = NamingAuthority.id_isismtt_at_namingAuthorities_RechtWirtschaftSteuern;
        sb.append(dERObjectIdentifier);
        sb.append(".1");
        Rechtsanwltin = new DERObjectIdentifier(sb.toString());
        Rechtsanwalt = new DERObjectIdentifier(C1656Zg.m8745a(dERObjectIdentifier, ".2"));
        Rechtsbeistand = new DERObjectIdentifier(C1656Zg.m8745a(dERObjectIdentifier, ".3"));
        Steuerberaterin = new DERObjectIdentifier(C1656Zg.m8745a(dERObjectIdentifier, ".4"));
        Steuerberater = new DERObjectIdentifier(C1656Zg.m8745a(dERObjectIdentifier, ".5"));
        Steuerbevollmchtigte = new DERObjectIdentifier(C1656Zg.m8745a(dERObjectIdentifier, ".6"));
        Steuerbevollmchtigter = new DERObjectIdentifier(C1656Zg.m8745a(dERObjectIdentifier, ".7"));
        Notarin = new DERObjectIdentifier(C1656Zg.m8745a(dERObjectIdentifier, ".8"));
        Notar = new DERObjectIdentifier(C1656Zg.m8745a(dERObjectIdentifier, ".9"));
        Notarvertreterin = new DERObjectIdentifier(C1656Zg.m8745a(dERObjectIdentifier, ".10"));
        Notarvertreter = new DERObjectIdentifier(C1656Zg.m8745a(dERObjectIdentifier, ".11"));
        Notariatsverwalterin = new DERObjectIdentifier(C1656Zg.m8745a(dERObjectIdentifier, ".12"));
        Notariatsverwalter = new DERObjectIdentifier(C1656Zg.m8745a(dERObjectIdentifier, ".13"));
        Wirtschaftsprferin = new DERObjectIdentifier(C1656Zg.m8745a(dERObjectIdentifier, ".14"));
        Wirtschaftsprfer = new DERObjectIdentifier(C1656Zg.m8745a(dERObjectIdentifier, ".15"));
        VereidigteBuchprferin = new DERObjectIdentifier(C1656Zg.m8745a(dERObjectIdentifier, ".16"));
        VereidigterBuchprfer = new DERObjectIdentifier(C1656Zg.m8745a(dERObjectIdentifier, ".17"));
        Patentanwltin = new DERObjectIdentifier(C1656Zg.m8745a(dERObjectIdentifier, ".18"));
        Patentanwalt = new DERObjectIdentifier(C1656Zg.m8745a(dERObjectIdentifier, ".19"));
    }

    /* JADX WARN: Invalid debug info offset */
    private ProfessionInfo(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ProfessionInfo(NamingAuthority namingAuthority, DirectoryString[] directoryStringArr, DERObjectIdentifier[] dERObjectIdentifierArr, String str, ASN1OctetString aSN1OctetString) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static ProfessionInfo getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1OctetString getAddProfessionInfo() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public NamingAuthority getNamingAuthority() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DirectoryString[] getProfessionItems() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERObjectIdentifier[] getProfessionOIDs() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getRegistrationNumber() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
