package org.bouncycastle.x509;

import java.security.InvalidAlgorithmParameterException;
import java.security.cert.CertSelector;
import java.security.cert.PKIXParameters;
import java.util.List;
import java.util.Set;
import org.bouncycastle.util.Selector;
import org.bouncycastle.util.Store;

/* JADX INFO: loaded from: classes2.dex */
public class ExtendedPKIXParameters extends PKIXParameters {
    public static final int CHAIN_VALIDITY_MODEL = 1;
    public static final int PKIX_VALIDITY_MODEL = 0;
    private boolean additionalLocationsEnabled;
    private List additionalStores;
    private Set attrCertCheckers;
    private Set necessaryACAttributes;
    private Set prohibitedACAttributes;
    private Selector selector;
    private List stores;
    private Set trustedACIssuers;
    private boolean useDeltas;
    private int validityModel;

    /* JADX WARN: Invalid debug info offset */
    public ExtendedPKIXParameters(Set set) throws InvalidAlgorithmParameterException {
    }

    /* JADX WARN: Invalid debug info offset */
    public static ExtendedPKIXParameters getInstance(PKIXParameters pKIXParameters) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void addAddionalStore(Store store) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void addAdditionalStore(Store store) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void addStore(Store store) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.PKIXParameters, java.security.cert.CertPathParameters
    public Object clone() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public List getAdditionalStores() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Set getAttrCertCheckers() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Set getNecessaryACAttributes() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Set getProhibitedACAttributes() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public List getStores() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Selector getTargetConstraints() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Set getTrustedACIssuers() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getValidityModel() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isAdditionalLocationsEnabled() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isUseDeltasEnabled() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public void setAdditionalLocationsEnabled(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setAttrCertCheckers(Set set) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.PKIXParameters
    public void setCertStores(List list) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setNecessaryACAttributes(Set set) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x004d
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public void setParams(java.security.cert.PKIXParameters r3) {
        /*
            r2 = this;
            return
        Lab:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.x509.ExtendedPKIXParameters.setParams(java.security.cert.PKIXParameters):void");
    }

    /* JADX WARN: Invalid debug info offset */
    public void setProhibitedACAttributes(Set set) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setStores(List list) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.PKIXParameters
    public void setTargetCertConstraints(CertSelector certSelector) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setTargetConstraints(Selector selector) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setTrustedACIssuers(Set set) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setUseDeltasEnabled(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setValidityModel(int i) {
    }
}
