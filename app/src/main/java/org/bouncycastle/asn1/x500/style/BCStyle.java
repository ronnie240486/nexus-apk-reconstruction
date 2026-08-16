package org.bouncycastle.asn1.x500.style;

import java.util.Hashtable;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x500.AttributeTypeAndValue;
import org.bouncycastle.asn1.x500.RDN;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x500.X500NameStyle;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;
import p000.C5713xI;

/* JADX INFO: loaded from: classes2.dex */
public class BCStyle implements X500NameStyle {
    public static final ASN1ObjectIdentifier BUSINESS_CATEGORY;

    /* JADX INFO: renamed from: C */
    public static final ASN1ObjectIdentifier f16000C;

    /* JADX INFO: renamed from: CN */
    public static final ASN1ObjectIdentifier f16001CN;
    public static final ASN1ObjectIdentifier COUNTRY_OF_CITIZENSHIP;
    public static final ASN1ObjectIdentifier COUNTRY_OF_RESIDENCE;
    public static final ASN1ObjectIdentifier DATE_OF_BIRTH;

    /* JADX INFO: renamed from: DC */
    public static final ASN1ObjectIdentifier f16002DC;
    public static final ASN1ObjectIdentifier DMD_NAME;
    public static final ASN1ObjectIdentifier DN_QUALIFIER;
    private static final Hashtable DefaultLookUp;
    private static final Hashtable DefaultSymbols;

    /* JADX INFO: renamed from: E */
    public static final ASN1ObjectIdentifier f16003E;
    public static final ASN1ObjectIdentifier EmailAddress;
    public static final ASN1ObjectIdentifier GENDER;
    public static final ASN1ObjectIdentifier GENERATION;
    public static final ASN1ObjectIdentifier GIVENNAME;
    public static final ASN1ObjectIdentifier INITIALS;
    public static final X500NameStyle INSTANCE = new BCStyle();

    /* JADX INFO: renamed from: L */
    public static final ASN1ObjectIdentifier f16004L;
    public static final ASN1ObjectIdentifier NAME;
    public static final ASN1ObjectIdentifier NAME_AT_BIRTH;

    /* JADX INFO: renamed from: O */
    public static final ASN1ObjectIdentifier f16005O;

    /* JADX INFO: renamed from: OU */
    public static final ASN1ObjectIdentifier f16006OU;
    public static final ASN1ObjectIdentifier PLACE_OF_BIRTH;
    public static final ASN1ObjectIdentifier POSTAL_ADDRESS;
    public static final ASN1ObjectIdentifier POSTAL_CODE;
    public static final ASN1ObjectIdentifier PSEUDONYM;
    public static final ASN1ObjectIdentifier SERIALNUMBER;

    /* JADX INFO: renamed from: SN */
    public static final ASN1ObjectIdentifier f16007SN;

    /* JADX INFO: renamed from: ST */
    public static final ASN1ObjectIdentifier f16008ST;
    public static final ASN1ObjectIdentifier STREET;
    public static final ASN1ObjectIdentifier SURNAME;

    /* JADX INFO: renamed from: T */
    public static final ASN1ObjectIdentifier f16009T;
    public static final ASN1ObjectIdentifier TELEPHONE_NUMBER;
    public static final ASN1ObjectIdentifier UID;
    public static final ASN1ObjectIdentifier UNIQUE_IDENTIFIER;
    public static final ASN1ObjectIdentifier UnstructuredAddress;
    public static final ASN1ObjectIdentifier UnstructuredName;

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier("2.5.4.6");
        f16000C = aSN1ObjectIdentifier;
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = new ASN1ObjectIdentifier("2.5.4.10");
        f16005O = aSN1ObjectIdentifier2;
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = new ASN1ObjectIdentifier("2.5.4.11");
        f16006OU = aSN1ObjectIdentifier3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = new ASN1ObjectIdentifier("2.5.4.12");
        f16009T = aSN1ObjectIdentifier4;
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = new ASN1ObjectIdentifier("2.5.4.3");
        f16001CN = aSN1ObjectIdentifier5;
        ASN1ObjectIdentifier aSN1ObjectIdentifier6 = new ASN1ObjectIdentifier("2.5.4.5");
        f16007SN = aSN1ObjectIdentifier6;
        ASN1ObjectIdentifier aSN1ObjectIdentifier7 = new ASN1ObjectIdentifier("2.5.4.9");
        STREET = aSN1ObjectIdentifier7;
        SERIALNUMBER = aSN1ObjectIdentifier6;
        ASN1ObjectIdentifier aSN1ObjectIdentifier8 = new ASN1ObjectIdentifier("2.5.4.7");
        f16004L = aSN1ObjectIdentifier8;
        ASN1ObjectIdentifier aSN1ObjectIdentifier9 = new ASN1ObjectIdentifier("2.5.4.8");
        f16008ST = aSN1ObjectIdentifier9;
        ASN1ObjectIdentifier aSN1ObjectIdentifier10 = new ASN1ObjectIdentifier("2.5.4.4");
        SURNAME = aSN1ObjectIdentifier10;
        ASN1ObjectIdentifier aSN1ObjectIdentifier11 = new ASN1ObjectIdentifier("2.5.4.42");
        GIVENNAME = aSN1ObjectIdentifier11;
        ASN1ObjectIdentifier aSN1ObjectIdentifier12 = new ASN1ObjectIdentifier("2.5.4.43");
        INITIALS = aSN1ObjectIdentifier12;
        ASN1ObjectIdentifier aSN1ObjectIdentifier13 = new ASN1ObjectIdentifier("2.5.4.44");
        GENERATION = aSN1ObjectIdentifier13;
        ASN1ObjectIdentifier aSN1ObjectIdentifier14 = new ASN1ObjectIdentifier("2.5.4.45");
        UNIQUE_IDENTIFIER = aSN1ObjectIdentifier14;
        ASN1ObjectIdentifier aSN1ObjectIdentifier15 = new ASN1ObjectIdentifier("2.5.4.15");
        BUSINESS_CATEGORY = aSN1ObjectIdentifier15;
        ASN1ObjectIdentifier aSN1ObjectIdentifier16 = new ASN1ObjectIdentifier("2.5.4.17");
        POSTAL_CODE = aSN1ObjectIdentifier16;
        ASN1ObjectIdentifier aSN1ObjectIdentifier17 = new ASN1ObjectIdentifier("2.5.4.46");
        DN_QUALIFIER = aSN1ObjectIdentifier17;
        ASN1ObjectIdentifier aSN1ObjectIdentifier18 = new ASN1ObjectIdentifier("2.5.4.65");
        PSEUDONYM = aSN1ObjectIdentifier18;
        ASN1ObjectIdentifier aSN1ObjectIdentifier19 = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.9.1");
        DATE_OF_BIRTH = aSN1ObjectIdentifier19;
        ASN1ObjectIdentifier aSN1ObjectIdentifier20 = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.9.2");
        PLACE_OF_BIRTH = aSN1ObjectIdentifier20;
        ASN1ObjectIdentifier aSN1ObjectIdentifier21 = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.9.3");
        GENDER = aSN1ObjectIdentifier21;
        ASN1ObjectIdentifier aSN1ObjectIdentifier22 = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.9.4");
        COUNTRY_OF_CITIZENSHIP = aSN1ObjectIdentifier22;
        ASN1ObjectIdentifier aSN1ObjectIdentifier23 = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.9.5");
        COUNTRY_OF_RESIDENCE = aSN1ObjectIdentifier23;
        ASN1ObjectIdentifier aSN1ObjectIdentifier24 = new ASN1ObjectIdentifier("1.3.36.8.3.14");
        NAME_AT_BIRTH = aSN1ObjectIdentifier24;
        ASN1ObjectIdentifier aSN1ObjectIdentifier25 = new ASN1ObjectIdentifier("2.5.4.16");
        POSTAL_ADDRESS = aSN1ObjectIdentifier25;
        DMD_NAME = new ASN1ObjectIdentifier("2.5.4.54");
        ASN1ObjectIdentifier aSN1ObjectIdentifier26 = X509ObjectIdentifiers.id_at_telephoneNumber;
        TELEPHONE_NUMBER = aSN1ObjectIdentifier26;
        ASN1ObjectIdentifier aSN1ObjectIdentifier27 = X509ObjectIdentifiers.id_at_name;
        NAME = aSN1ObjectIdentifier27;
        ASN1ObjectIdentifier aSN1ObjectIdentifier28 = PKCSObjectIdentifiers.pkcs_9_at_emailAddress;
        EmailAddress = aSN1ObjectIdentifier28;
        ASN1ObjectIdentifier aSN1ObjectIdentifier29 = PKCSObjectIdentifiers.pkcs_9_at_unstructuredName;
        UnstructuredName = aSN1ObjectIdentifier29;
        ASN1ObjectIdentifier aSN1ObjectIdentifier30 = PKCSObjectIdentifiers.pkcs_9_at_unstructuredAddress;
        UnstructuredAddress = aSN1ObjectIdentifier30;
        f16003E = aSN1ObjectIdentifier28;
        ASN1ObjectIdentifier aSN1ObjectIdentifier31 = new ASN1ObjectIdentifier("0.9.2342.19200300.100.1.25");
        f16002DC = aSN1ObjectIdentifier31;
        ASN1ObjectIdentifier aSN1ObjectIdentifier32 = new ASN1ObjectIdentifier("0.9.2342.19200300.100.1.1");
        UID = aSN1ObjectIdentifier32;
        Hashtable hashtable = new Hashtable();
        DefaultSymbols = hashtable;
        Hashtable hashtable2 = new Hashtable();
        DefaultLookUp = hashtable2;
        hashtable.put(aSN1ObjectIdentifier, "C");
        hashtable.put(aSN1ObjectIdentifier2, "O");
        hashtable.put(aSN1ObjectIdentifier4, "T");
        hashtable.put(aSN1ObjectIdentifier3, "OU");
        hashtable.put(aSN1ObjectIdentifier5, "CN");
        hashtable.put(aSN1ObjectIdentifier8, C5713xI.f19432g);
        hashtable.put(aSN1ObjectIdentifier9, "ST");
        hashtable.put(aSN1ObjectIdentifier6, "SERIALNUMBER");
        hashtable.put(aSN1ObjectIdentifier28, "E");
        hashtable.put(aSN1ObjectIdentifier31, "DC");
        hashtable.put(aSN1ObjectIdentifier32, "UID");
        hashtable.put(aSN1ObjectIdentifier7, "STREET");
        hashtable.put(aSN1ObjectIdentifier10, "SURNAME");
        hashtable.put(aSN1ObjectIdentifier11, "GIVENNAME");
        hashtable.put(aSN1ObjectIdentifier12, "INITIALS");
        hashtable.put(aSN1ObjectIdentifier13, "GENERATION");
        hashtable.put(aSN1ObjectIdentifier30, "unstructuredAddress");
        hashtable.put(aSN1ObjectIdentifier29, "unstructuredName");
        hashtable.put(aSN1ObjectIdentifier14, "UniqueIdentifier");
        hashtable.put(aSN1ObjectIdentifier17, "DN");
        hashtable.put(aSN1ObjectIdentifier18, "Pseudonym");
        hashtable.put(aSN1ObjectIdentifier25, "PostalAddress");
        hashtable.put(aSN1ObjectIdentifier24, "NameAtBirth");
        hashtable.put(aSN1ObjectIdentifier22, "CountryOfCitizenship");
        hashtable.put(aSN1ObjectIdentifier23, "CountryOfResidence");
        hashtable.put(aSN1ObjectIdentifier21, "Gender");
        hashtable.put(aSN1ObjectIdentifier20, "PlaceOfBirth");
        hashtable.put(aSN1ObjectIdentifier19, "DateOfBirth");
        hashtable.put(aSN1ObjectIdentifier16, "PostalCode");
        hashtable.put(aSN1ObjectIdentifier15, "BusinessCategory");
        hashtable.put(aSN1ObjectIdentifier26, "TelephoneNumber");
        hashtable.put(aSN1ObjectIdentifier27, "Name");
        hashtable2.put("c", aSN1ObjectIdentifier);
        hashtable2.put("o", aSN1ObjectIdentifier2);
        hashtable2.put(C5713xI.f19433h, aSN1ObjectIdentifier4);
        hashtable2.put("ou", aSN1ObjectIdentifier3);
        hashtable2.put("cn", aSN1ObjectIdentifier5);
        hashtable2.put(C5713xI.f19431f, aSN1ObjectIdentifier8);
        hashtable2.put("st", aSN1ObjectIdentifier9);
        hashtable2.put("sn", aSN1ObjectIdentifier6);
        hashtable2.put("serialnumber", aSN1ObjectIdentifier6);
        hashtable2.put("street", aSN1ObjectIdentifier7);
        hashtable2.put("emailaddress", aSN1ObjectIdentifier28);
        hashtable2.put("dc", aSN1ObjectIdentifier31);
        hashtable2.put("e", aSN1ObjectIdentifier28);
        hashtable2.put("uid", aSN1ObjectIdentifier32);
        hashtable2.put("surname", aSN1ObjectIdentifier10);
        hashtable2.put("givenname", aSN1ObjectIdentifier11);
        hashtable2.put("initials", aSN1ObjectIdentifier12);
        hashtable2.put("generation", aSN1ObjectIdentifier13);
        hashtable2.put("unstructuredaddress", aSN1ObjectIdentifier30);
        hashtable2.put("unstructuredname", aSN1ObjectIdentifier29);
        hashtable2.put("uniqueidentifier", aSN1ObjectIdentifier14);
        hashtable2.put("dn", aSN1ObjectIdentifier17);
        hashtable2.put("pseudonym", aSN1ObjectIdentifier18);
        hashtable2.put("postaladdress", aSN1ObjectIdentifier25);
        hashtable2.put("nameofbirth", aSN1ObjectIdentifier24);
        hashtable2.put("countryofcitizenship", aSN1ObjectIdentifier22);
        hashtable2.put("countryofresidence", aSN1ObjectIdentifier23);
        hashtable2.put("gender", aSN1ObjectIdentifier21);
        hashtable2.put("placeofbirth", aSN1ObjectIdentifier20);
        hashtable2.put("dateofbirth", aSN1ObjectIdentifier19);
        hashtable2.put("postalcode", aSN1ObjectIdentifier16);
        hashtable2.put("businesscategory", aSN1ObjectIdentifier15);
        hashtable2.put("telephonenumber", aSN1ObjectIdentifier26);
        hashtable2.put("name", aSN1ObjectIdentifier27);
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
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.asn1.x500.style.BCStyle.stringToValue(org.bouncycastle.asn1.ASN1ObjectIdentifier, java.lang.String):org.bouncycastle.asn1.ASN1Encodable");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public String toString(X500Name x500Name) {
        return null;
    }
}
