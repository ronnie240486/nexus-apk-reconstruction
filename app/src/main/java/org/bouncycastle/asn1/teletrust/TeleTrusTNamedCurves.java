package org.bouncycastle.asn1.teletrust;

import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.p015x9.X9ECParameters;
import org.bouncycastle.asn1.p015x9.X9ECParametersHolder;

/* JADX INFO: loaded from: classes2.dex */
public class TeleTrusTNamedCurves {
    static X9ECParametersHolder brainpoolP160r1 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.teletrust.TeleTrusTNamedCurves.1
        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.asn1.p015x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            return null;
        }
    };
    static X9ECParametersHolder brainpoolP160t1 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.teletrust.TeleTrusTNamedCurves.2
        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.asn1.p015x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            return null;
        }
    };
    static X9ECParametersHolder brainpoolP192r1 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.teletrust.TeleTrusTNamedCurves.3
        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.asn1.p015x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            return null;
        }
    };
    static X9ECParametersHolder brainpoolP192t1 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.teletrust.TeleTrusTNamedCurves.4
        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.asn1.p015x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            return null;
        }
    };
    static X9ECParametersHolder brainpoolP224r1 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.teletrust.TeleTrusTNamedCurves.5
        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.asn1.p015x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            return null;
        }
    };
    static X9ECParametersHolder brainpoolP224t1 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.teletrust.TeleTrusTNamedCurves.6
        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.asn1.p015x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            return null;
        }
    };
    static X9ECParametersHolder brainpoolP256r1 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.teletrust.TeleTrusTNamedCurves.7
        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.asn1.p015x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            return null;
        }
    };
    static X9ECParametersHolder brainpoolP256t1 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.teletrust.TeleTrusTNamedCurves.8
        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.asn1.p015x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            return null;
        }
    };
    static X9ECParametersHolder brainpoolP320r1 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.teletrust.TeleTrusTNamedCurves.9
        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.asn1.p015x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            return null;
        }
    };
    static X9ECParametersHolder brainpoolP320t1 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.teletrust.TeleTrusTNamedCurves.10
        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.asn1.p015x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            return null;
        }
    };
    static X9ECParametersHolder brainpoolP384r1 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.teletrust.TeleTrusTNamedCurves.11
        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.asn1.p015x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            return null;
        }
    };
    static X9ECParametersHolder brainpoolP384t1 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.teletrust.TeleTrusTNamedCurves.12
        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.asn1.p015x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            return null;
        }
    };
    static X9ECParametersHolder brainpoolP512r1 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.teletrust.TeleTrusTNamedCurves.13
        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.asn1.p015x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            return null;
        }
    };
    static X9ECParametersHolder brainpoolP512t1 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.teletrust.TeleTrusTNamedCurves.14
        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.asn1.p015x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            return null;
        }
    };
    static final Hashtable objIds = new Hashtable();
    static final Hashtable curves = new Hashtable();
    static final Hashtable names = new Hashtable();

    static {
        defineCurve("brainpoolp160r1", TeleTrusTObjectIdentifiers.brainpoolP160r1, brainpoolP160r1);
        defineCurve("brainpoolp160t1", TeleTrusTObjectIdentifiers.brainpoolP160t1, brainpoolP160t1);
        defineCurve("brainpoolp192r1", TeleTrusTObjectIdentifiers.brainpoolP192r1, brainpoolP192r1);
        defineCurve("brainpoolp192t1", TeleTrusTObjectIdentifiers.brainpoolP192t1, brainpoolP192t1);
        defineCurve("brainpoolp224r1", TeleTrusTObjectIdentifiers.brainpoolP224r1, brainpoolP224r1);
        defineCurve("brainpoolp224t1", TeleTrusTObjectIdentifiers.brainpoolP224t1, brainpoolP224t1);
        defineCurve("brainpoolp256r1", TeleTrusTObjectIdentifiers.brainpoolP256r1, brainpoolP256r1);
        defineCurve("brainpoolp256t1", TeleTrusTObjectIdentifiers.brainpoolP256t1, brainpoolP256t1);
        defineCurve("brainpoolp320r1", TeleTrusTObjectIdentifiers.brainpoolP320r1, brainpoolP320r1);
        defineCurve("brainpoolp320t1", TeleTrusTObjectIdentifiers.brainpoolP320t1, brainpoolP320t1);
        defineCurve("brainpoolp384r1", TeleTrusTObjectIdentifiers.brainpoolP384r1, brainpoolP384r1);
        defineCurve("brainpoolp384t1", TeleTrusTObjectIdentifiers.brainpoolP384t1, brainpoolP384t1);
        defineCurve("brainpoolp512r1", TeleTrusTObjectIdentifiers.brainpoolP512r1, brainpoolP512r1);
        defineCurve("brainpoolp512t1", TeleTrusTObjectIdentifiers.brainpoolP512t1, brainpoolP512t1);
    }

    /* JADX WARN: Invalid debug info offset */
    public static void defineCurve(String str, DERObjectIdentifier dERObjectIdentifier, X9ECParametersHolder x9ECParametersHolder) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static X9ECParameters getByName(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static X9ECParameters getByOID(DERObjectIdentifier dERObjectIdentifier) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static String getName(DERObjectIdentifier dERObjectIdentifier) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static Enumeration getNames() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static DERObjectIdentifier getOID(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static DERObjectIdentifier getOID(short s2, boolean z) {
        return null;
    }
}
