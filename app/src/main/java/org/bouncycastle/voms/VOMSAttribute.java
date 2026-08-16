package org.bouncycastle.voms;

import java.util.List;
import java.util.Vector;
import org.bouncycastle.x509.X509AttributeCertificate;

/* JADX INFO: loaded from: classes2.dex */
public class VOMSAttribute {
    public static final String VOMS_ATTR_OID = "1.3.6.1.4.1.8005.100.100.4";
    private X509AttributeCertificate myAC;
    private Vector myFQANs;
    private String myHostPort;
    private Vector myStringList;
    private String myVo;

    public class FQAN {
        String capability;
        String fqan;
        String group;
        String role;
        final /* synthetic */ VOMSAttribute this$0;

        /* JADX WARN: Invalid debug info offset */
        public FQAN(VOMSAttribute vOMSAttribute, String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        public FQAN(VOMSAttribute vOMSAttribute, String str, String str2, String str3) {
        }

        /* JADX WARN: Invalid debug info offset */
        public String getCapability() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public String getFQAN() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public String getGroup() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public String getRole() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public void split() {
        }

        /* JADX WARN: Invalid debug info offset */
        public String toString() {
            return null;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0022
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public VOMSAttribute(org.bouncycastle.x509.X509AttributeCertificate r11) {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.voms.VOMSAttribute.<init>(org.bouncycastle.x509.X509AttributeCertificate):void");
    }

    /* JADX WARN: Invalid debug info offset */
    public X509AttributeCertificate getAC() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public List getFullyQualifiedAttributes() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getHostPort() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public List getListOfFQAN() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getVO() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String toString() {
        return null;
    }
}
