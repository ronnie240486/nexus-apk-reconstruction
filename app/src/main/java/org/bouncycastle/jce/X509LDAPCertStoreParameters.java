package org.bouncycastle.jce;

import java.security.cert.CertStoreParameters;
import java.security.cert.LDAPCertStoreParameters;
import org.bouncycastle.x509.X509StoreParameters;

/* JADX INFO: loaded from: classes2.dex */
public class X509LDAPCertStoreParameters implements X509StoreParameters, CertStoreParameters {
    private String aACertificateAttribute;
    private String aACertificateSubjectAttributeName;
    private String attributeAuthorityRevocationListAttribute;
    private String attributeAuthorityRevocationListIssuerAttributeName;
    private String attributeCertificateAttributeAttribute;
    private String attributeCertificateAttributeSubjectAttributeName;
    private String attributeCertificateRevocationListAttribute;
    private String attributeCertificateRevocationListIssuerAttributeName;
    private String attributeDescriptorCertificateAttribute;
    private String attributeDescriptorCertificateSubjectAttributeName;
    private String authorityRevocationListAttribute;
    private String authorityRevocationListIssuerAttributeName;
    private String baseDN;
    private String cACertificateAttribute;
    private String cACertificateSubjectAttributeName;
    private String certificateRevocationListAttribute;
    private String certificateRevocationListIssuerAttributeName;
    private String crossCertificateAttribute;
    private String crossCertificateSubjectAttributeName;
    private String deltaRevocationListAttribute;
    private String deltaRevocationListIssuerAttributeName;
    private String ldapAACertificateAttributeName;
    private String ldapAttributeAuthorityRevocationListAttributeName;
    private String ldapAttributeCertificateAttributeAttributeName;
    private String ldapAttributeCertificateRevocationListAttributeName;
    private String ldapAttributeDescriptorCertificateAttributeName;
    private String ldapAuthorityRevocationListAttributeName;
    private String ldapCACertificateAttributeName;
    private String ldapCertificateRevocationListAttributeName;
    private String ldapCrossCertificateAttributeName;
    private String ldapDeltaRevocationListAttributeName;
    private String ldapURL;
    private String ldapUserCertificateAttributeName;
    private String searchForSerialNumberIn;
    private String userCertificateAttribute;
    private String userCertificateSubjectAttributeName;

    public static class Builder {
        private String aACertificateAttribute;
        private String aACertificateSubjectAttributeName;
        private String attributeAuthorityRevocationListAttribute;
        private String attributeAuthorityRevocationListIssuerAttributeName;
        private String attributeCertificateAttributeAttribute;
        private String attributeCertificateAttributeSubjectAttributeName;
        private String attributeCertificateRevocationListAttribute;
        private String attributeCertificateRevocationListIssuerAttributeName;
        private String attributeDescriptorCertificateAttribute;
        private String attributeDescriptorCertificateSubjectAttributeName;
        private String authorityRevocationListAttribute;
        private String authorityRevocationListIssuerAttributeName;
        private String baseDN;
        private String cACertificateAttribute;
        private String cACertificateSubjectAttributeName;
        private String certificateRevocationListAttribute;
        private String certificateRevocationListIssuerAttributeName;
        private String crossCertificateAttribute;
        private String crossCertificateSubjectAttributeName;
        private String deltaRevocationListAttribute;
        private String deltaRevocationListIssuerAttributeName;
        private String ldapAACertificateAttributeName;
        private String ldapAttributeAuthorityRevocationListAttributeName;
        private String ldapAttributeCertificateAttributeAttributeName;
        private String ldapAttributeCertificateRevocationListAttributeName;
        private String ldapAttributeDescriptorCertificateAttributeName;
        private String ldapAuthorityRevocationListAttributeName;
        private String ldapCACertificateAttributeName;
        private String ldapCertificateRevocationListAttributeName;
        private String ldapCrossCertificateAttributeName;
        private String ldapDeltaRevocationListAttributeName;
        private String ldapURL;
        private String ldapUserCertificateAttributeName;
        private String searchForSerialNumberIn;
        private String userCertificateAttribute;
        private String userCertificateSubjectAttributeName;

        /* JADX WARN: Invalid debug info offset */
        public Builder() {
        }

        /* JADX WARN: Invalid debug info offset */
        public Builder(String str, String str2) {
        }

        /* JADX WARN: Invalid debug info offset */
        public static /* synthetic */ String access$100(Builder builder) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public static /* synthetic */ String access$1000(Builder builder) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public static /* synthetic */ String access$1100(Builder builder) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public static /* synthetic */ String access$1200(Builder builder) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public static /* synthetic */ String access$1300(Builder builder) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public static /* synthetic */ String access$1400(Builder builder) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public static /* synthetic */ String access$1500(Builder builder) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public static /* synthetic */ String access$1600(Builder builder) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public static /* synthetic */ String access$1700(Builder builder) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public static /* synthetic */ String access$1800(Builder builder) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public static /* synthetic */ String access$1900(Builder builder) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public static /* synthetic */ String access$200(Builder builder) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public static /* synthetic */ String access$2000(Builder builder) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public static /* synthetic */ String access$2100(Builder builder) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public static /* synthetic */ String access$2200(Builder builder) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public static /* synthetic */ String access$2300(Builder builder) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public static /* synthetic */ String access$2400(Builder builder) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public static /* synthetic */ String access$2500(Builder builder) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public static /* synthetic */ String access$2600(Builder builder) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public static /* synthetic */ String access$2700(Builder builder) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public static /* synthetic */ String access$2800(Builder builder) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public static /* synthetic */ String access$2900(Builder builder) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public static /* synthetic */ String access$300(Builder builder) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public static /* synthetic */ String access$3000(Builder builder) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public static /* synthetic */ String access$3100(Builder builder) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public static /* synthetic */ String access$3200(Builder builder) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public static /* synthetic */ String access$3300(Builder builder) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public static /* synthetic */ String access$3400(Builder builder) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public static /* synthetic */ String access$3500(Builder builder) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public static /* synthetic */ String access$3600(Builder builder) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public static /* synthetic */ String access$400(Builder builder) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public static /* synthetic */ String access$500(Builder builder) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public static /* synthetic */ String access$600(Builder builder) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public static /* synthetic */ String access$700(Builder builder) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public static /* synthetic */ String access$800(Builder builder) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public static /* synthetic */ String access$900(Builder builder) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public X509LDAPCertStoreParameters build() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public Builder setAACertificateAttribute(String str) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public Builder setAACertificateSubjectAttributeName(String str) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public Builder setAttributeAuthorityRevocationListAttribute(String str) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public Builder setAttributeAuthorityRevocationListIssuerAttributeName(String str) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public Builder setAttributeCertificateAttributeAttribute(String str) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public Builder setAttributeCertificateAttributeSubjectAttributeName(String str) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public Builder setAttributeCertificateRevocationListAttribute(String str) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public Builder setAttributeCertificateRevocationListIssuerAttributeName(String str) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public Builder setAttributeDescriptorCertificateAttribute(String str) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public Builder setAttributeDescriptorCertificateSubjectAttributeName(String str) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public Builder setAuthorityRevocationListAttribute(String str) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public Builder setAuthorityRevocationListIssuerAttributeName(String str) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public Builder setCACertificateAttribute(String str) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public Builder setCACertificateSubjectAttributeName(String str) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public Builder setCertificateRevocationListAttribute(String str) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public Builder setCertificateRevocationListIssuerAttributeName(String str) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public Builder setCrossCertificateAttribute(String str) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public Builder setCrossCertificateSubjectAttributeName(String str) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public Builder setDeltaRevocationListAttribute(String str) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public Builder setDeltaRevocationListIssuerAttributeName(String str) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public Builder setLdapAACertificateAttributeName(String str) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public Builder setLdapAttributeAuthorityRevocationListAttributeName(String str) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public Builder setLdapAttributeCertificateAttributeAttributeName(String str) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public Builder setLdapAttributeCertificateRevocationListAttributeName(String str) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public Builder setLdapAttributeDescriptorCertificateAttributeName(String str) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public Builder setLdapAuthorityRevocationListAttributeName(String str) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public Builder setLdapCACertificateAttributeName(String str) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public Builder setLdapCertificateRevocationListAttributeName(String str) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public Builder setLdapCrossCertificateAttributeName(String str) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public Builder setLdapDeltaRevocationListAttributeName(String str) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public Builder setLdapUserCertificateAttributeName(String str) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public Builder setSearchForSerialNumberIn(String str) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public Builder setUserCertificateAttribute(String str) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public Builder setUserCertificateSubjectAttributeName(String str) {
            return null;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    private X509LDAPCertStoreParameters(Builder builder) {
    }

    /* JADX WARN: Invalid debug info offset */
    public /* synthetic */ X509LDAPCertStoreParameters(Builder builder, C50421 c50421) {
    }

    /* JADX WARN: Invalid debug info offset */
    private int addHashCode(int i, Object obj) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private boolean checkField(Object obj, Object obj2) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public static X509LDAPCertStoreParameters getInstance(LDAPCertStoreParameters lDAPCertStoreParameters) {
        return null;
    }

    @Override // java.security.cert.CertStoreParameters
    public Object clone() {
        return this;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean equal(Object obj) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getAACertificateAttribute() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getAACertificateSubjectAttributeName() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getAttributeAuthorityRevocationListAttribute() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getAttributeAuthorityRevocationListIssuerAttributeName() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getAttributeCertificateAttributeAttribute() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getAttributeCertificateAttributeSubjectAttributeName() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getAttributeCertificateRevocationListAttribute() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getAttributeCertificateRevocationListIssuerAttributeName() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getAttributeDescriptorCertificateAttribute() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getAttributeDescriptorCertificateSubjectAttributeName() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getAuthorityRevocationListAttribute() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getAuthorityRevocationListIssuerAttributeName() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getBaseDN() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getCACertificateAttribute() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getCACertificateSubjectAttributeName() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getCertificateRevocationListAttribute() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getCertificateRevocationListIssuerAttributeName() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getCrossCertificateAttribute() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getCrossCertificateSubjectAttributeName() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getDeltaRevocationListAttribute() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getDeltaRevocationListIssuerAttributeName() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getLdapAACertificateAttributeName() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getLdapAttributeAuthorityRevocationListAttributeName() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getLdapAttributeCertificateAttributeAttributeName() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getLdapAttributeCertificateRevocationListAttributeName() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getLdapAttributeDescriptorCertificateAttributeName() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getLdapAuthorityRevocationListAttributeName() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getLdapCACertificateAttributeName() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getLdapCertificateRevocationListAttributeName() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getLdapCrossCertificateAttributeName() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getLdapDeltaRevocationListAttributeName() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getLdapURL() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getLdapUserCertificateAttributeName() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getSearchForSerialNumberIn() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getUserCertificateAttribute() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getUserCertificateSubjectAttributeName() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int hashCode() {
        return 0;
    }
}
