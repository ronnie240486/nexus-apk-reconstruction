package org.bouncycastle.jce.provider;

import java.util.Collection;
import java.util.Set;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralSubtree;

/* JADX INFO: loaded from: classes2.dex */
public class PKIXNameConstraintValidator {
    private Set excludedSubtreesDN;
    private Set excludedSubtreesDNS;
    private Set excludedSubtreesEmail;
    private Set excludedSubtreesIP;
    private Set excludedSubtreesURI;
    private Set permittedSubtreesDN;
    private Set permittedSubtreesDNS;
    private Set permittedSubtreesEmail;
    private Set permittedSubtreesIP;
    private Set permittedSubtreesURI;

    /* JADX WARN: Invalid debug info offset */
    private void checkExcludedDN(Set set, ASN1Sequence aSN1Sequence) throws PKIXNameConstraintValidatorException {
    }

    /* JADX WARN: Invalid debug info offset */
    private void checkExcludedDNS(Set set, String str) throws PKIXNameConstraintValidatorException {
    }

    /* JADX WARN: Invalid debug info offset */
    private void checkExcludedEmail(Set set, String str) throws PKIXNameConstraintValidatorException {
    }

    /* JADX WARN: Invalid debug info offset */
    private void checkExcludedIP(Set set, byte[] bArr) throws PKIXNameConstraintValidatorException {
    }

    /* JADX WARN: Invalid debug info offset */
    private void checkExcludedURI(Set set, String str) throws PKIXNameConstraintValidatorException {
    }

    /* JADX WARN: Invalid debug info offset */
    private void checkPermittedDN(Set set, ASN1Sequence aSN1Sequence) throws PKIXNameConstraintValidatorException {
    }

    /* JADX WARN: Invalid debug info offset */
    private void checkPermittedDNS(Set set, String str) throws PKIXNameConstraintValidatorException {
    }

    /* JADX WARN: Invalid debug info offset */
    private void checkPermittedEmail(Set set, String str) throws PKIXNameConstraintValidatorException {
    }

    /* JADX WARN: Invalid debug info offset */
    private void checkPermittedIP(Set set, byte[] bArr) throws PKIXNameConstraintValidatorException {
    }

    /* JADX WARN: Invalid debug info offset */
    private void checkPermittedURI(Set set, String str) throws PKIXNameConstraintValidatorException {
    }

    /* JADX WARN: Invalid debug info offset */
    private boolean collectionsAreEqual(Collection collection, Collection collection2) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    private static int compareTo(byte[] bArr, byte[] bArr2) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private boolean emailIsConstrained(String str, String str2) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    private boolean equals(Object obj, Object obj2) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    private static String extractHostFromURL(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private byte[][] extractIPsAndSubnetMasks(byte[] bArr, byte[] bArr2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private String extractNameAsString(GeneralName generalName) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private int hashCollection(Collection collection) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private Set intersectDN(Set set, Set set2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private Set intersectDNS(Set set, Set set2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private Set intersectEmail(Set set, Set set2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private void intersectEmail(String str, String str2, Set set) {
    }

    /* JADX WARN: Invalid debug info offset */
    private Set intersectIP(Set set, Set set2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private Set intersectIPRange(byte[] bArr, byte[] bArr2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private Set intersectURI(Set set, Set set2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private void intersectURI(String str, String str2, Set set) {
    }

    /* JADX WARN: Invalid debug info offset */
    private byte[] ipWithSubnetMask(byte[] bArr, byte[] bArr2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private boolean isIPConstrained(byte[] bArr, byte[] bArr2) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    private boolean isUriConstrained(String str, String str2) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    private static byte[] max(byte[] bArr, byte[] bArr2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private static byte[] min(byte[] bArr, byte[] bArr2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private byte[][] minMaxIPs(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: or */
    private static byte[] m23513or(byte[] bArr, byte[] bArr2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private String stringifyIP(byte[] bArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private String stringifyIPCollection(Set set) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private Set unionDN(Set set, ASN1Sequence aSN1Sequence) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private Set unionEmail(Set set, String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private void unionEmail(String str, String str2, Set set) {
    }

    /* JADX WARN: Invalid debug info offset */
    private Set unionIP(Set set, byte[] bArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private Set unionIPRange(byte[] bArr, byte[] bArr2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private Set unionURI(Set set, String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private void unionURI(String str, String str2, Set set) {
    }

    /* JADX WARN: Invalid debug info offset */
    private static boolean withinDNSubtree(ASN1Sequence aSN1Sequence, ASN1Sequence aSN1Sequence2) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    private boolean withinDomain(String str, String str2) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public void addExcludedSubtree(GeneralSubtree generalSubtree) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void checkExcluded(GeneralName generalName) throws PKIXNameConstraintValidatorException {
    }

    /* JADX WARN: Invalid debug info offset */
    public void checkExcludedDN(ASN1Sequence aSN1Sequence) throws PKIXNameConstraintValidatorException {
    }

    /* JADX WARN: Invalid debug info offset */
    public void checkPermitted(GeneralName generalName) throws PKIXNameConstraintValidatorException {
    }

    /* JADX WARN: Invalid debug info offset */
    public void checkPermittedDN(ASN1Sequence aSN1Sequence) throws PKIXNameConstraintValidatorException {
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
    public void intersectEmptyPermittedSubtree(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void intersectPermittedSubtree(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public String toString() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Set unionDNS(Set set, String str) {
        return null;
    }
}
