package org.bouncycastle.asn1.x500.style;

import android.media.ViviTV.MainApp;
import java.util.Hashtable;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.x500.AttributeTypeAndValue;
import org.bouncycastle.asn1.x500.RDN;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x500.X500NameStyle;
import p000.C5713xI;

/* JADX INFO: loaded from: classes2.dex */
public class RFC4519Style implements X500NameStyle {
    private static final Hashtable DefaultLookUp;
    private static final Hashtable DefaultSymbols;
    public static final X500NameStyle INSTANCE = new RFC4519Style();
    public static final ASN1ObjectIdentifier businessCategory;

    /* JADX INFO: renamed from: c */
    public static final ASN1ObjectIdentifier f16010c;

    /* JADX INFO: renamed from: cn */
    public static final ASN1ObjectIdentifier f16011cn;

    /* JADX INFO: renamed from: dc */
    public static final ASN1ObjectIdentifier f16012dc;
    public static final ASN1ObjectIdentifier description;
    public static final ASN1ObjectIdentifier destinationIndicator;
    public static final ASN1ObjectIdentifier distinguishedName;
    public static final ASN1ObjectIdentifier dnQualifier;
    public static final ASN1ObjectIdentifier enhancedSearchGuide;
    public static final ASN1ObjectIdentifier facsimileTelephoneNumber;
    public static final ASN1ObjectIdentifier generationQualifier;
    public static final ASN1ObjectIdentifier givenName;
    public static final ASN1ObjectIdentifier houseIdentifier;
    public static final ASN1ObjectIdentifier initials;
    public static final ASN1ObjectIdentifier internationalISDNNumber;

    /* JADX INFO: renamed from: l */
    public static final ASN1ObjectIdentifier f16013l;
    public static final ASN1ObjectIdentifier member;
    public static final ASN1ObjectIdentifier name;

    /* JADX INFO: renamed from: o */
    public static final ASN1ObjectIdentifier f16014o;

    /* JADX INFO: renamed from: ou */
    public static final ASN1ObjectIdentifier f16015ou;
    public static final ASN1ObjectIdentifier owner;
    public static final ASN1ObjectIdentifier physicalDeliveryOfficeName;
    public static final ASN1ObjectIdentifier postOfficeBox;
    public static final ASN1ObjectIdentifier postalAddress;
    public static final ASN1ObjectIdentifier postalCode;
    public static final ASN1ObjectIdentifier preferredDeliveryMethod;
    public static final ASN1ObjectIdentifier registeredAddress;
    public static final ASN1ObjectIdentifier roleOccupant;
    public static final ASN1ObjectIdentifier searchGuide;
    public static final ASN1ObjectIdentifier seeAlso;
    public static final ASN1ObjectIdentifier serialNumber;

    /* JADX INFO: renamed from: sn */
    public static final ASN1ObjectIdentifier f16016sn;

    /* JADX INFO: renamed from: st */
    public static final ASN1ObjectIdentifier f16017st;
    public static final ASN1ObjectIdentifier street;
    public static final ASN1ObjectIdentifier telephoneNumber;
    public static final ASN1ObjectIdentifier teletexTerminalIdentifier;
    public static final ASN1ObjectIdentifier telexNumber;
    public static final ASN1ObjectIdentifier title;
    public static final ASN1ObjectIdentifier uid;
    public static final ASN1ObjectIdentifier uniqueMember;
    public static final ASN1ObjectIdentifier userPassword;
    public static final ASN1ObjectIdentifier x121Address;
    public static final ASN1ObjectIdentifier x500UniqueIdentifier;

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier("2.5.4.15");
        businessCategory = aSN1ObjectIdentifier;
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = new ASN1ObjectIdentifier("2.5.4.6");
        f16010c = aSN1ObjectIdentifier2;
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = new ASN1ObjectIdentifier("2.5.4.3");
        f16011cn = aSN1ObjectIdentifier3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = new ASN1ObjectIdentifier("0.9.2342.19200300.100.1.25");
        f16012dc = aSN1ObjectIdentifier4;
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = new ASN1ObjectIdentifier("2.5.4.13");
        description = aSN1ObjectIdentifier5;
        ASN1ObjectIdentifier aSN1ObjectIdentifier6 = new ASN1ObjectIdentifier("2.5.4.27");
        destinationIndicator = aSN1ObjectIdentifier6;
        ASN1ObjectIdentifier aSN1ObjectIdentifier7 = new ASN1ObjectIdentifier("2.5.4.49");
        distinguishedName = aSN1ObjectIdentifier7;
        ASN1ObjectIdentifier aSN1ObjectIdentifier8 = new ASN1ObjectIdentifier("2.5.4.46");
        dnQualifier = aSN1ObjectIdentifier8;
        ASN1ObjectIdentifier aSN1ObjectIdentifier9 = new ASN1ObjectIdentifier("2.5.4.47");
        enhancedSearchGuide = aSN1ObjectIdentifier9;
        ASN1ObjectIdentifier aSN1ObjectIdentifier10 = new ASN1ObjectIdentifier("2.5.4.23");
        facsimileTelephoneNumber = aSN1ObjectIdentifier10;
        ASN1ObjectIdentifier aSN1ObjectIdentifier11 = new ASN1ObjectIdentifier("2.5.4.44");
        generationQualifier = aSN1ObjectIdentifier11;
        ASN1ObjectIdentifier aSN1ObjectIdentifier12 = new ASN1ObjectIdentifier("2.5.4.42");
        givenName = aSN1ObjectIdentifier12;
        ASN1ObjectIdentifier aSN1ObjectIdentifier13 = new ASN1ObjectIdentifier("2.5.4.51");
        houseIdentifier = aSN1ObjectIdentifier13;
        ASN1ObjectIdentifier aSN1ObjectIdentifier14 = new ASN1ObjectIdentifier("2.5.4.43");
        initials = aSN1ObjectIdentifier14;
        ASN1ObjectIdentifier aSN1ObjectIdentifier15 = new ASN1ObjectIdentifier("2.5.4.25");
        internationalISDNNumber = aSN1ObjectIdentifier15;
        ASN1ObjectIdentifier aSN1ObjectIdentifier16 = new ASN1ObjectIdentifier("2.5.4.7");
        f16013l = aSN1ObjectIdentifier16;
        ASN1ObjectIdentifier aSN1ObjectIdentifier17 = new ASN1ObjectIdentifier("2.5.4.31");
        member = aSN1ObjectIdentifier17;
        ASN1ObjectIdentifier aSN1ObjectIdentifier18 = new ASN1ObjectIdentifier("2.5.4.41");
        name = aSN1ObjectIdentifier18;
        ASN1ObjectIdentifier aSN1ObjectIdentifier19 = new ASN1ObjectIdentifier("2.5.4.10");
        f16014o = aSN1ObjectIdentifier19;
        ASN1ObjectIdentifier aSN1ObjectIdentifier20 = new ASN1ObjectIdentifier("2.5.4.11");
        f16015ou = aSN1ObjectIdentifier20;
        ASN1ObjectIdentifier aSN1ObjectIdentifier21 = new ASN1ObjectIdentifier("2.5.4.32");
        owner = aSN1ObjectIdentifier21;
        ASN1ObjectIdentifier aSN1ObjectIdentifier22 = new ASN1ObjectIdentifier("2.5.4.19");
        physicalDeliveryOfficeName = aSN1ObjectIdentifier22;
        ASN1ObjectIdentifier aSN1ObjectIdentifier23 = new ASN1ObjectIdentifier("2.5.4.16");
        postalAddress = aSN1ObjectIdentifier23;
        ASN1ObjectIdentifier aSN1ObjectIdentifier24 = new ASN1ObjectIdentifier("2.5.4.17");
        postalCode = aSN1ObjectIdentifier24;
        ASN1ObjectIdentifier aSN1ObjectIdentifier25 = new ASN1ObjectIdentifier("2.5.4.18");
        postOfficeBox = aSN1ObjectIdentifier25;
        ASN1ObjectIdentifier aSN1ObjectIdentifier26 = new ASN1ObjectIdentifier("2.5.4.28");
        preferredDeliveryMethod = aSN1ObjectIdentifier26;
        ASN1ObjectIdentifier aSN1ObjectIdentifier27 = new ASN1ObjectIdentifier("2.5.4.26");
        registeredAddress = aSN1ObjectIdentifier27;
        ASN1ObjectIdentifier aSN1ObjectIdentifier28 = new ASN1ObjectIdentifier("2.5.4.33");
        roleOccupant = aSN1ObjectIdentifier28;
        ASN1ObjectIdentifier aSN1ObjectIdentifier29 = new ASN1ObjectIdentifier("2.5.4.14");
        searchGuide = aSN1ObjectIdentifier29;
        ASN1ObjectIdentifier aSN1ObjectIdentifier30 = new ASN1ObjectIdentifier("2.5.4.34");
        seeAlso = aSN1ObjectIdentifier30;
        ASN1ObjectIdentifier aSN1ObjectIdentifier31 = new ASN1ObjectIdentifier("2.5.4.5");
        serialNumber = aSN1ObjectIdentifier31;
        ASN1ObjectIdentifier aSN1ObjectIdentifier32 = new ASN1ObjectIdentifier("2.5.4.4");
        f16016sn = aSN1ObjectIdentifier32;
        ASN1ObjectIdentifier aSN1ObjectIdentifier33 = new ASN1ObjectIdentifier("2.5.4.8");
        f16017st = aSN1ObjectIdentifier33;
        ASN1ObjectIdentifier aSN1ObjectIdentifier34 = new ASN1ObjectIdentifier("2.5.4.9");
        street = aSN1ObjectIdentifier34;
        ASN1ObjectIdentifier aSN1ObjectIdentifier35 = new ASN1ObjectIdentifier("2.5.4.20");
        telephoneNumber = aSN1ObjectIdentifier35;
        ASN1ObjectIdentifier aSN1ObjectIdentifier36 = new ASN1ObjectIdentifier("2.5.4.22");
        teletexTerminalIdentifier = aSN1ObjectIdentifier36;
        ASN1ObjectIdentifier aSN1ObjectIdentifier37 = new ASN1ObjectIdentifier("2.5.4.21");
        telexNumber = aSN1ObjectIdentifier37;
        ASN1ObjectIdentifier aSN1ObjectIdentifier38 = new ASN1ObjectIdentifier("2.5.4.12");
        title = aSN1ObjectIdentifier38;
        ASN1ObjectIdentifier aSN1ObjectIdentifier39 = new ASN1ObjectIdentifier("0.9.2342.19200300.100.1.1");
        uid = aSN1ObjectIdentifier39;
        ASN1ObjectIdentifier aSN1ObjectIdentifier40 = new ASN1ObjectIdentifier("2.5.4.50");
        uniqueMember = aSN1ObjectIdentifier40;
        ASN1ObjectIdentifier aSN1ObjectIdentifier41 = new ASN1ObjectIdentifier("2.5.4.35");
        userPassword = aSN1ObjectIdentifier41;
        ASN1ObjectIdentifier aSN1ObjectIdentifier42 = new ASN1ObjectIdentifier("2.5.4.24");
        x121Address = aSN1ObjectIdentifier42;
        ASN1ObjectIdentifier aSN1ObjectIdentifier43 = new ASN1ObjectIdentifier("2.5.4.45");
        x500UniqueIdentifier = aSN1ObjectIdentifier43;
        Hashtable hashtable = new Hashtable();
        DefaultSymbols = hashtable;
        Hashtable hashtable2 = new Hashtable();
        DefaultLookUp = hashtable2;
        hashtable.put(aSN1ObjectIdentifier, "businessCategory");
        hashtable.put(aSN1ObjectIdentifier2, "c");
        hashtable.put(aSN1ObjectIdentifier3, "cn");
        hashtable.put(aSN1ObjectIdentifier4, "dc");
        hashtable.put(aSN1ObjectIdentifier5, "description");
        hashtable.put(aSN1ObjectIdentifier6, "destinationIndicator");
        hashtable.put(aSN1ObjectIdentifier7, "distinguishedName");
        hashtable.put(aSN1ObjectIdentifier8, "dnQualifier");
        hashtable.put(aSN1ObjectIdentifier9, "enhancedSearchGuide");
        hashtable.put(aSN1ObjectIdentifier10, "facsimileTelephoneNumber");
        hashtable.put(aSN1ObjectIdentifier11, "generationQualifier");
        hashtable.put(aSN1ObjectIdentifier12, "givenName");
        hashtable.put(aSN1ObjectIdentifier13, "houseIdentifier");
        hashtable.put(aSN1ObjectIdentifier14, "initials");
        hashtable.put(aSN1ObjectIdentifier15, "internationalISDNNumber");
        hashtable.put(aSN1ObjectIdentifier16, C5713xI.f19431f);
        hashtable.put(aSN1ObjectIdentifier17, "member");
        hashtable.put(aSN1ObjectIdentifier18, "name");
        hashtable.put(aSN1ObjectIdentifier19, "o");
        hashtable.put(aSN1ObjectIdentifier20, "ou");
        hashtable.put(aSN1ObjectIdentifier21, "owner");
        hashtable.put(aSN1ObjectIdentifier22, "physicalDeliveryOfficeName");
        hashtable.put(aSN1ObjectIdentifier23, "postalAddress");
        hashtable.put(aSN1ObjectIdentifier24, "postalCode");
        hashtable.put(aSN1ObjectIdentifier25, "postOfficeBox");
        hashtable.put(aSN1ObjectIdentifier26, "preferredDeliveryMethod");
        hashtable.put(aSN1ObjectIdentifier27, "registeredAddress");
        hashtable.put(aSN1ObjectIdentifier28, "roleOccupant");
        hashtable.put(aSN1ObjectIdentifier29, "searchGuide");
        hashtable.put(aSN1ObjectIdentifier30, "seeAlso");
        hashtable.put(aSN1ObjectIdentifier31, "serialNumber");
        hashtable.put(aSN1ObjectIdentifier32, "sn");
        hashtable.put(aSN1ObjectIdentifier33, "st");
        hashtable.put(aSN1ObjectIdentifier34, "street");
        hashtable.put(aSN1ObjectIdentifier35, "telephoneNumber");
        hashtable.put(aSN1ObjectIdentifier36, "teletexTerminalIdentifier");
        hashtable.put(aSN1ObjectIdentifier37, "telexNumber");
        hashtable.put(aSN1ObjectIdentifier38, "title");
        hashtable.put(aSN1ObjectIdentifier39, "uid");
        hashtable.put(aSN1ObjectIdentifier40, "uniqueMember");
        hashtable.put(aSN1ObjectIdentifier41, "userPassword");
        hashtable.put(aSN1ObjectIdentifier42, "x121Address");
        hashtable.put(aSN1ObjectIdentifier43, "x500UniqueIdentifier");
        hashtable2.put("businesscategory", aSN1ObjectIdentifier);
        hashtable2.put("c", aSN1ObjectIdentifier2);
        hashtable2.put("cn", aSN1ObjectIdentifier3);
        hashtable2.put("dc", aSN1ObjectIdentifier4);
        hashtable2.put("description", aSN1ObjectIdentifier5);
        hashtable2.put("destinationindicator", aSN1ObjectIdentifier6);
        hashtable2.put("distinguishedname", aSN1ObjectIdentifier7);
        hashtable2.put("dnqualifier", aSN1ObjectIdentifier8);
        hashtable2.put("enhancedsearchguide", aSN1ObjectIdentifier9);
        hashtable2.put("facsimiletelephonenumber", aSN1ObjectIdentifier10);
        hashtable2.put("generationqualifier", aSN1ObjectIdentifier11);
        hashtable2.put("givenname", aSN1ObjectIdentifier12);
        hashtable2.put("houseidentifier", aSN1ObjectIdentifier13);
        hashtable2.put("initials", aSN1ObjectIdentifier14);
        hashtable2.put("internationalisdnnumber", aSN1ObjectIdentifier15);
        hashtable2.put(C5713xI.f19431f, aSN1ObjectIdentifier16);
        hashtable2.put("member", aSN1ObjectIdentifier17);
        hashtable2.put("name", aSN1ObjectIdentifier18);
        hashtable2.put("o", aSN1ObjectIdentifier19);
        hashtable2.put("ou", aSN1ObjectIdentifier20);
        hashtable2.put("owner", aSN1ObjectIdentifier21);
        hashtable2.put("physicaldeliveryofficename", aSN1ObjectIdentifier22);
        hashtable2.put("postaladdress", aSN1ObjectIdentifier23);
        hashtable2.put("postalcode", aSN1ObjectIdentifier24);
        hashtable2.put("postofficebox", aSN1ObjectIdentifier25);
        hashtable2.put("preferreddeliverymethod", aSN1ObjectIdentifier26);
        hashtable2.put("registeredaddress", aSN1ObjectIdentifier27);
        hashtable2.put("roleoccupant", aSN1ObjectIdentifier28);
        hashtable2.put("searchguide", aSN1ObjectIdentifier29);
        hashtable2.put("seealso", aSN1ObjectIdentifier30);
        hashtable2.put("serialnumber", aSN1ObjectIdentifier31);
        hashtable2.put("sn", aSN1ObjectIdentifier32);
        hashtable2.put("st", aSN1ObjectIdentifier33);
        hashtable2.put("street", aSN1ObjectIdentifier34);
        hashtable2.put("telephonenumber", aSN1ObjectIdentifier35);
        hashtable2.put("teletexterminalidentifier", aSN1ObjectIdentifier36);
        hashtable2.put("telexnumber", aSN1ObjectIdentifier37);
        hashtable2.put("title", aSN1ObjectIdentifier38);
        hashtable2.put("uid", aSN1ObjectIdentifier39);
        hashtable2.put("uniquemember", aSN1ObjectIdentifier40);
        hashtable2.put(MainApp.f4577m5, aSN1ObjectIdentifier41);
        hashtable2.put("x121address", aSN1ObjectIdentifier42);
        hashtable2.put("x500uniqueidentifier", aSN1ObjectIdentifier43);
    }

    /* JADX WARN: Invalid debug info offset */
    private boolean atvAreEqual(AttributeTypeAndValue attributeTypeAndValue, AttributeTypeAndValue attributeTypeAndValue2) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    private int calcHashCode(ASN1Encodable aSN1Encodable) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private boolean foundMatch(boolean z, RDN rdn, RDN[] rdnArr) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public boolean areEqual(X500Name x500Name, X500Name x500Name2) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public ASN1ObjectIdentifier attrNameToOID(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public int calculateHashCode(X500Name x500Name) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public RDN[] fromString(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean rdnAreEqual(RDN rdn, RDN rdn2) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0010
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public org.bouncycastle.asn1.ASN1Encodable stringToValue(org.bouncycastle.asn1.ASN1ObjectIdentifier r5, java.lang.String r6) {
        /*
            r4 = this;
            r0 = 0
            return r0
        L15:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.asn1.x500.style.RFC4519Style.stringToValue(org.bouncycastle.asn1.ASN1ObjectIdentifier, java.lang.String):org.bouncycastle.asn1.ASN1Encodable");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public String toString(X500Name x500Name) {
        return null;
    }
}
