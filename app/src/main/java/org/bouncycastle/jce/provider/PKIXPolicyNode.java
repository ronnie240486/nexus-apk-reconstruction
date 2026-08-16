package org.bouncycastle.jce.provider;

import java.security.cert.PolicyNode;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class PKIXPolicyNode implements PolicyNode {
    protected List children;
    protected boolean critical;
    protected int depth;
    protected Set expectedPolicies;
    protected PolicyNode parent;
    protected Set policyQualifiers;
    protected String validPolicy;

    /* JADX WARN: Invalid debug info offset */
    public PKIXPolicyNode(List list, int i, Set set, PolicyNode policyNode, Set set2, String str, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void addChild(PKIXPolicyNode pKIXPolicyNode) {
    }

    /* JADX WARN: Invalid debug info offset */
    public Object clone() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public PKIXPolicyNode copy() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.PolicyNode
    public Iterator getChildren() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.PolicyNode
    public int getDepth() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.PolicyNode
    public Set getExpectedPolicies() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.PolicyNode
    public PolicyNode getParent() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.PolicyNode
    public Set getPolicyQualifiers() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.PolicyNode
    public String getValidPolicy() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean hasChildren() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.PolicyNode
    public boolean isCritical() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public void removeChild(PKIXPolicyNode pKIXPolicyNode) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setCritical(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setParent(PKIXPolicyNode pKIXPolicyNode) {
    }

    /* JADX WARN: Invalid debug info offset */
    public String toString() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String toString(String str) {
        return null;
    }
}
