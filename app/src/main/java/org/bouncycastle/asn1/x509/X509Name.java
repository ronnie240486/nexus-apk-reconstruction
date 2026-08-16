package org.bouncycastle.asn1.x509;

import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import p000.C5713xI;

/* JADX INFO: loaded from: classes2.dex */
public class X509Name extends ASN1Encodable {
    public static final DERObjectIdentifier BUSINESS_CATEGORY;

    /* JADX INFO: renamed from: C */
    public static final DERObjectIdentifier f16023C;

    /* JADX INFO: renamed from: CN */
    public static final DERObjectIdentifier f16024CN;
    public static final DERObjectIdentifier COUNTRY_OF_CITIZENSHIP;
    public static final DERObjectIdentifier COUNTRY_OF_RESIDENCE;
    public static final DERObjectIdentifier DATE_OF_BIRTH;

    /* JADX INFO: renamed from: DC */
    public static final DERObjectIdentifier f16025DC;
    public static final DERObjectIdentifier DMD_NAME;
    public static final DERObjectIdentifier DN_QUALIFIER;
    public static final Hashtable DefaultLookUp;
    public static boolean DefaultReverse;
    public static final Hashtable DefaultSymbols;

    /* JADX INFO: renamed from: E */
    public static final DERObjectIdentifier f16026E;
    public static final DERObjectIdentifier EmailAddress;
    private static final Boolean FALSE;
    public static final DERObjectIdentifier GENDER;
    public static final DERObjectIdentifier GENERATION;
    public static final DERObjectIdentifier GIVENNAME;
    public static final DERObjectIdentifier INITIALS;

    /* JADX INFO: renamed from: L */
    public static final DERObjectIdentifier f16027L;
    public static final DERObjectIdentifier NAME;
    public static final DERObjectIdentifier NAME_AT_BIRTH;

    /* JADX INFO: renamed from: O */
    public static final DERObjectIdentifier f16028O;
    public static final Hashtable OIDLookUp;

    /* JADX INFO: renamed from: OU */
    public static final DERObjectIdentifier f16029OU;
    public static final DERObjectIdentifier PLACE_OF_BIRTH;
    public static final DERObjectIdentifier POSTAL_ADDRESS;
    public static final DERObjectIdentifier POSTAL_CODE;
    public static final DERObjectIdentifier PSEUDONYM;
    public static final Hashtable RFC1779Symbols;
    public static final Hashtable RFC2253Symbols;
    public static final DERObjectIdentifier SERIALNUMBER;

    /* JADX INFO: renamed from: SN */
    public static final DERObjectIdentifier f16030SN;

    /* JADX INFO: renamed from: ST */
    public static final DERObjectIdentifier f16031ST;
    public static final DERObjectIdentifier STREET;
    public static final DERObjectIdentifier SURNAME;
    public static final Hashtable SymbolLookUp;

    /* JADX INFO: renamed from: T */
    public static final DERObjectIdentifier f16032T;
    public static final DERObjectIdentifier TELEPHONE_NUMBER;
    private static final Boolean TRUE;
    public static final DERObjectIdentifier UID;
    public static final DERObjectIdentifier UNIQUE_IDENTIFIER;
    public static final DERObjectIdentifier UnstructuredAddress;
    public static final DERObjectIdentifier UnstructuredName;
    private Vector added;
    private X509NameEntryConverter converter;
    private int hashCodeValue;
    private boolean isHashCodeCalculated;
    private Vector ordering;
    private ASN1Sequence seq;
    private Vector values;

    static {
        DERObjectIdentifier dERObjectIdentifier = new DERObjectIdentifier("2.5.4.6");
        f16023C = dERObjectIdentifier;
        DERObjectIdentifier dERObjectIdentifier2 = new DERObjectIdentifier("2.5.4.10");
        f16028O = dERObjectIdentifier2;
        DERObjectIdentifier dERObjectIdentifier3 = new DERObjectIdentifier("2.5.4.11");
        f16029OU = dERObjectIdentifier3;
        DERObjectIdentifier dERObjectIdentifier4 = new DERObjectIdentifier("2.5.4.12");
        f16032T = dERObjectIdentifier4;
        DERObjectIdentifier dERObjectIdentifier5 = new DERObjectIdentifier("2.5.4.3");
        f16024CN = dERObjectIdentifier5;
        DERObjectIdentifier dERObjectIdentifier6 = new DERObjectIdentifier("2.5.4.5");
        f16030SN = dERObjectIdentifier6;
        DERObjectIdentifier dERObjectIdentifier7 = new DERObjectIdentifier("2.5.4.9");
        STREET = dERObjectIdentifier7;
        SERIALNUMBER = dERObjectIdentifier6;
        DERObjectIdentifier dERObjectIdentifier8 = new DERObjectIdentifier("2.5.4.7");
        f16027L = dERObjectIdentifier8;
        DERObjectIdentifier dERObjectIdentifier9 = new DERObjectIdentifier("2.5.4.8");
        f16031ST = dERObjectIdentifier9;
        DERObjectIdentifier dERObjectIdentifier10 = new DERObjectIdentifier("2.5.4.4");
        SURNAME = dERObjectIdentifier10;
        DERObjectIdentifier dERObjectIdentifier11 = new DERObjectIdentifier("2.5.4.42");
        GIVENNAME = dERObjectIdentifier11;
        DERObjectIdentifier dERObjectIdentifier12 = new DERObjectIdentifier("2.5.4.43");
        INITIALS = dERObjectIdentifier12;
        DERObjectIdentifier dERObjectIdentifier13 = new DERObjectIdentifier("2.5.4.44");
        GENERATION = dERObjectIdentifier13;
        DERObjectIdentifier dERObjectIdentifier14 = new DERObjectIdentifier("2.5.4.45");
        UNIQUE_IDENTIFIER = dERObjectIdentifier14;
        DERObjectIdentifier dERObjectIdentifier15 = new DERObjectIdentifier("2.5.4.15");
        BUSINESS_CATEGORY = dERObjectIdentifier15;
        DERObjectIdentifier dERObjectIdentifier16 = new DERObjectIdentifier("2.5.4.17");
        POSTAL_CODE = dERObjectIdentifier16;
        DERObjectIdentifier dERObjectIdentifier17 = new DERObjectIdentifier("2.5.4.46");
        DN_QUALIFIER = dERObjectIdentifier17;
        DERObjectIdentifier dERObjectIdentifier18 = new DERObjectIdentifier("2.5.4.65");
        PSEUDONYM = dERObjectIdentifier18;
        DERObjectIdentifier dERObjectIdentifier19 = new DERObjectIdentifier("1.3.6.1.5.5.7.9.1");
        DATE_OF_BIRTH = dERObjectIdentifier19;
        DERObjectIdentifier dERObjectIdentifier20 = new DERObjectIdentifier("1.3.6.1.5.5.7.9.2");
        PLACE_OF_BIRTH = dERObjectIdentifier20;
        DERObjectIdentifier dERObjectIdentifier21 = new DERObjectIdentifier("1.3.6.1.5.5.7.9.3");
        GENDER = dERObjectIdentifier21;
        DERObjectIdentifier dERObjectIdentifier22 = new DERObjectIdentifier("1.3.6.1.5.5.7.9.4");
        COUNTRY_OF_CITIZENSHIP = dERObjectIdentifier22;
        DERObjectIdentifier dERObjectIdentifier23 = new DERObjectIdentifier("1.3.6.1.5.5.7.9.5");
        COUNTRY_OF_RESIDENCE = dERObjectIdentifier23;
        DERObjectIdentifier dERObjectIdentifier24 = new DERObjectIdentifier("1.3.36.8.3.14");
        NAME_AT_BIRTH = dERObjectIdentifier24;
        DERObjectIdentifier dERObjectIdentifier25 = new DERObjectIdentifier("2.5.4.16");
        POSTAL_ADDRESS = dERObjectIdentifier25;
        DMD_NAME = new DERObjectIdentifier("2.5.4.54");
        ASN1ObjectIdentifier aSN1ObjectIdentifier = X509ObjectIdentifiers.id_at_telephoneNumber;
        TELEPHONE_NUMBER = aSN1ObjectIdentifier;
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = X509ObjectIdentifiers.id_at_name;
        NAME = aSN1ObjectIdentifier2;
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = PKCSObjectIdentifiers.pkcs_9_at_emailAddress;
        EmailAddress = aSN1ObjectIdentifier3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = PKCSObjectIdentifiers.pkcs_9_at_unstructuredName;
        UnstructuredName = aSN1ObjectIdentifier4;
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = PKCSObjectIdentifiers.pkcs_9_at_unstructuredAddress;
        UnstructuredAddress = aSN1ObjectIdentifier5;
        f16026E = aSN1ObjectIdentifier3;
        DERObjectIdentifier dERObjectIdentifier26 = new DERObjectIdentifier("0.9.2342.19200300.100.1.25");
        f16025DC = dERObjectIdentifier26;
        DERObjectIdentifier dERObjectIdentifier27 = new DERObjectIdentifier("0.9.2342.19200300.100.1.1");
        UID = dERObjectIdentifier27;
        DefaultReverse = false;
        Hashtable hashtable = new Hashtable();
        DefaultSymbols = hashtable;
        Hashtable hashtable2 = new Hashtable();
        RFC2253Symbols = hashtable2;
        Hashtable hashtable3 = new Hashtable();
        RFC1779Symbols = hashtable3;
        Hashtable hashtable4 = new Hashtable();
        DefaultLookUp = hashtable4;
        OIDLookUp = hashtable;
        SymbolLookUp = hashtable4;
        TRUE = new Boolean(true);
        FALSE = new Boolean(false);
        hashtable.put(dERObjectIdentifier, "C");
        hashtable.put(dERObjectIdentifier2, "O");
        hashtable.put(dERObjectIdentifier4, "T");
        hashtable.put(dERObjectIdentifier3, "OU");
        hashtable.put(dERObjectIdentifier5, "CN");
        hashtable.put(dERObjectIdentifier8, C5713xI.f19432g);
        hashtable.put(dERObjectIdentifier9, "ST");
        hashtable.put(dERObjectIdentifier6, "SERIALNUMBER");
        hashtable.put(aSN1ObjectIdentifier3, "E");
        hashtable.put(dERObjectIdentifier26, "DC");
        hashtable.put(dERObjectIdentifier27, "UID");
        hashtable.put(dERObjectIdentifier7, "STREET");
        hashtable.put(dERObjectIdentifier10, "SURNAME");
        hashtable.put(dERObjectIdentifier11, "GIVENNAME");
        hashtable.put(dERObjectIdentifier12, "INITIALS");
        hashtable.put(dERObjectIdentifier13, "GENERATION");
        hashtable.put(aSN1ObjectIdentifier5, "unstructuredAddress");
        hashtable.put(aSN1ObjectIdentifier4, "unstructuredName");
        hashtable.put(dERObjectIdentifier14, "UniqueIdentifier");
        hashtable.put(dERObjectIdentifier17, "DN");
        hashtable.put(dERObjectIdentifier18, "Pseudonym");
        hashtable.put(dERObjectIdentifier25, "PostalAddress");
        hashtable.put(dERObjectIdentifier24, "NameAtBirth");
        hashtable.put(dERObjectIdentifier22, "CountryOfCitizenship");
        hashtable.put(dERObjectIdentifier23, "CountryOfResidence");
        hashtable.put(dERObjectIdentifier21, "Gender");
        hashtable.put(dERObjectIdentifier20, "PlaceOfBirth");
        hashtable.put(dERObjectIdentifier19, "DateOfBirth");
        hashtable.put(dERObjectIdentifier16, "PostalCode");
        hashtable.put(dERObjectIdentifier15, "BusinessCategory");
        hashtable.put(aSN1ObjectIdentifier, "TelephoneNumber");
        hashtable.put(aSN1ObjectIdentifier2, "Name");
        hashtable2.put(dERObjectIdentifier, "C");
        hashtable2.put(dERObjectIdentifier2, "O");
        hashtable2.put(dERObjectIdentifier3, "OU");
        hashtable2.put(dERObjectIdentifier5, "CN");
        hashtable2.put(dERObjectIdentifier8, C5713xI.f19432g);
        hashtable2.put(dERObjectIdentifier9, "ST");
        hashtable2.put(dERObjectIdentifier7, "STREET");
        hashtable2.put(dERObjectIdentifier26, "DC");
        hashtable2.put(dERObjectIdentifier27, "UID");
        hashtable3.put(dERObjectIdentifier, "C");
        hashtable3.put(dERObjectIdentifier2, "O");
        hashtable3.put(dERObjectIdentifier3, "OU");
        hashtable3.put(dERObjectIdentifier5, "CN");
        hashtable3.put(dERObjectIdentifier8, C5713xI.f19432g);
        hashtable3.put(dERObjectIdentifier9, "ST");
        hashtable3.put(dERObjectIdentifier7, "STREET");
        hashtable4.put("c", dERObjectIdentifier);
        hashtable4.put("o", dERObjectIdentifier2);
        hashtable4.put(C5713xI.f19433h, dERObjectIdentifier4);
        hashtable4.put("ou", dERObjectIdentifier3);
        hashtable4.put("cn", dERObjectIdentifier5);
        hashtable4.put(C5713xI.f19431f, dERObjectIdentifier8);
        hashtable4.put("st", dERObjectIdentifier9);
        hashtable4.put("sn", dERObjectIdentifier6);
        hashtable4.put("serialnumber", dERObjectIdentifier6);
        hashtable4.put("street", dERObjectIdentifier7);
        hashtable4.put("emailaddress", aSN1ObjectIdentifier3);
        hashtable4.put("dc", dERObjectIdentifier26);
        hashtable4.put("e", aSN1ObjectIdentifier3);
        hashtable4.put("uid", dERObjectIdentifier27);
        hashtable4.put("surname", dERObjectIdentifier10);
        hashtable4.put("givenname", dERObjectIdentifier11);
        hashtable4.put("initials", dERObjectIdentifier12);
        hashtable4.put("generation", dERObjectIdentifier13);
        hashtable4.put("unstructuredaddress", aSN1ObjectIdentifier5);
        hashtable4.put("unstructuredname", aSN1ObjectIdentifier4);
        hashtable4.put("uniqueidentifier", dERObjectIdentifier14);
        hashtable4.put("dn", dERObjectIdentifier17);
        hashtable4.put("pseudonym", dERObjectIdentifier18);
        hashtable4.put("postaladdress", dERObjectIdentifier25);
        hashtable4.put("nameofbirth", dERObjectIdentifier24);
        hashtable4.put("countryofcitizenship", dERObjectIdentifier22);
        hashtable4.put("countryofresidence", dERObjectIdentifier23);
        hashtable4.put("gender", dERObjectIdentifier21);
        hashtable4.put("placeofbirth", dERObjectIdentifier20);
        hashtable4.put("dateofbirth", dERObjectIdentifier19);
        hashtable4.put("postalcode", dERObjectIdentifier16);
        hashtable4.put("businesscategory", dERObjectIdentifier15);
        hashtable4.put("telephonenumber", aSN1ObjectIdentifier);
        hashtable4.put("name", aSN1ObjectIdentifier2);
    }

    /* JADX WARN: Invalid debug info offset */
    public X509Name() {
    }

    /* JADX WARN: Invalid debug info offset */
    public X509Name(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public X509Name(String str, X509NameEntryConverter x509NameEntryConverter) {
    }

    /* JADX WARN: Invalid debug info offset */
    public X509Name(Hashtable hashtable) {
    }

    /* JADX WARN: Invalid debug info offset */
    public X509Name(Vector vector, Hashtable hashtable) {
    }

    /* JADX WARN: Invalid debug info offset */
    public X509Name(Vector vector, Hashtable hashtable, X509NameEntryConverter x509NameEntryConverter) {
    }

    /* JADX WARN: Invalid debug info offset */
    public X509Name(Vector vector, Vector vector2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public X509Name(Vector vector, Vector vector2, X509NameEntryConverter x509NameEntryConverter) {
    }

    /* JADX WARN: Invalid debug info offset */
    public X509Name(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public X509Name(boolean z, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public X509Name(boolean z, String str, X509NameEntryConverter x509NameEntryConverter) {
    }

    /* JADX WARN: Invalid debug info offset */
    public X509Name(boolean z, Hashtable hashtable, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public X509Name(boolean z, Hashtable hashtable, String str, X509NameEntryConverter x509NameEntryConverter) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void appendValue(StringBuffer stringBuffer, Hashtable hashtable, DERObjectIdentifier dERObjectIdentifier, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    private String bytesToString(byte[] bArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private String canonicalize(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private DERObjectIdentifier decodeOID(String str, Hashtable hashtable) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private ASN1Object decodeObject(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private boolean equivalentStrings(String str, String str2) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public static X509Name getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static X509Name getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private String stripInternalSpaces(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0020
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public boolean equals(java.lang.Object r12) {
        /*
            r11 = this;
            r0 = 0
            return r0
        L8e:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.asn1.x509.X509Name.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0027
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public boolean equals(java.lang.Object r6, boolean r7) {
        /*
            r5 = this;
            r0 = 0
            return r0
        L6f:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.asn1.x509.X509Name.equals(java.lang.Object, boolean):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    public Vector getOIDs() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Vector getValues() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Vector getValues(DERObjectIdentifier dERObjectIdentifier) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public int hashCode() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String toString() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String toString(boolean z, Hashtable hashtable) {
        return null;
    }
}
