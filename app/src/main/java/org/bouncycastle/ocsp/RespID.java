package org.bouncycastle.ocsp;

import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ocsp.ResponderID;

/* JADX INFO: loaded from: classes2.dex */
public class RespID {

    /* JADX INFO: renamed from: id */
    ResponderID f16434id;

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public RespID(java.security.PublicKey r4) throws org.bouncycastle.ocsp.OCSPException {
        /*
            r3 = this;
            return
        L37:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.ocsp.RespID.<init>(java.security.PublicKey):void");
    }

    /* JADX WARN: Invalid debug info offset */
    public RespID(X500Principal x500Principal) {
    }

    /* JADX WARN: Invalid debug info offset */
    public RespID(ResponderID responderID) {
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean equals(Object obj) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public int hashCode() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public ResponderID toASN1Object() {
        return null;
    }
}
