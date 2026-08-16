package org.bouncycastle.jce;

import java.security.BasicPermission;
import java.security.Permission;

/* JADX INFO: loaded from: classes2.dex */
public class ProviderConfigurationPermission extends BasicPermission {
    private static final int ALL = 3;
    private static final String ALL_STR = "all";
    private static final int EC_IMPLICITLY_CA = 2;
    private static final String EC_IMPLICITLY_CA_STR = "ecimplicitlyca";
    private static final int THREAD_LOCAL_EC_IMPLICITLY_CA = 1;
    private static final String THREAD_LOCAL_EC_IMPLICITLY_CA_STR = "threadlocalecimplicitlyca";
    private final String actions;
    private final int permissionMask;

    /* JADX WARN: Invalid debug info offset */
    public ProviderConfigurationPermission(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ProviderConfigurationPermission(String str, String str2) {
    }

    /* JADX WARN: Invalid debug info offset */
    private int calculateMask(String str) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean equals(Object obj) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.BasicPermission, java.security.Permission
    public String getActions() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int hashCode() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.BasicPermission, java.security.Permission
    public boolean implies(Permission permission) {
        return false;
    }
}
