package org.bouncycastle.jce.provider;

import java.io.IOException;
import java.io.InputStream;
import java.security.Permission;
import org.bouncycastle.jce.ProviderConfigurationPermission;
import org.bouncycastle.jce.interfaces.ConfigurableProvider;
import org.bouncycastle.jce.spec.ECParameterSpec;

/* JADX INFO: loaded from: classes2.dex */
public class ProviderUtil {
    private static volatile ECParameterSpec ecImplicitCaParams;
    private static final long MAX_MEMORY = Runtime.getRuntime().maxMemory();
    private static Permission BC_EC_LOCAL_PERMISSION = new ProviderConfigurationPermission(BouncyCastleProvider.PROVIDER_NAME, ConfigurableProvider.THREAD_LOCAL_EC_IMPLICITLY_CA);
    private static Permission BC_EC_PERMISSION = new ProviderConfigurationPermission(BouncyCastleProvider.PROVIDER_NAME, ConfigurableProvider.EC_IMPLICITLY_CA);
    private static ThreadLocal threadSpec = new ThreadLocal();

    /* JADX WARN: Invalid debug info offset */
    public static ECParameterSpec getEcImplicitlyCa() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static int getReadLimit(InputStream inputStream) throws IOException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public static void setParameter(String str, Object obj) {
    }
}
