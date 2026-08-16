package com.google.android.datatransport.runtime.backends;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p000.C1262Tc;
import p000.InterfaceC4441gs;
import p000.InterfaceC4739lS;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC4739lS
class MetadataBackendRegistry implements BackendRegistry {
    private static final String BACKEND_KEY_PREFIX = "backend:";
    private static final String TAG = "BackendRegistry";
    private final BackendFactoryProvider backendFactoryProvider;
    private final Map<String, TransportBackend> backends;
    private final CreationContextFactory creationContextFactory;

    public static class BackendFactoryProvider {
        private final Context applicationContext;
        private Map<String, String> backendProviders = null;

        public BackendFactoryProvider(Context context) {
            this.applicationContext = context;
        }

        private Map<String, String> discover(Context context) {
            Bundle metadata = getMetadata(context);
            if (metadata == null) {
                Log.w(MetadataBackendRegistry.TAG, "Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.emptyMap();
            }
            HashMap map = new HashMap();
            for (String str : metadata.keySet()) {
                Object obj = metadata.get(str);
                if ((obj instanceof String) && str.startsWith(MetadataBackendRegistry.BACKEND_KEY_PREFIX)) {
                    for (String str2 : ((String) obj).split(C1262Tc.f3278g, -1)) {
                        String strTrim = str2.trim();
                        if (!strTrim.isEmpty()) {
                            map.put(strTrim, str.substring(8));
                        }
                    }
                }
            }
            return map;
        }

        private Map<String, String> getBackendProviders() {
            if (this.backendProviders == null) {
                this.backendProviders = discover(this.applicationContext);
            }
            return this.backendProviders;
        }

        private static Bundle getMetadata(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w(MetadataBackendRegistry.TAG, "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w(MetadataBackendRegistry.TAG, "TransportBackendDiscovery has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w(MetadataBackendRegistry.TAG, "Application info not found.");
                return null;
            }
        }

        @Nullable
        public BackendFactory get(String str) {
            String str2;
            String str3;
            String str4 = getBackendProviders().get(str);
            if (str4 == null) {
                return null;
            }
            try {
                return (BackendFactory) Class.forName(str4).asSubclass(BackendFactory.class).getDeclaredConstructor(null).newInstance(null);
            } catch (ClassNotFoundException e) {
                e = e;
                str2 = String.format("Class %s is not found.", str4);
                Log.w(MetadataBackendRegistry.TAG, str2, e);
                return null;
            } catch (IllegalAccessException e2) {
                e = e2;
                str3 = String.format("Could not instantiate %s.", str4);
                Log.w(MetadataBackendRegistry.TAG, str3, e);
                return null;
            } catch (InstantiationException e3) {
                e = e3;
                str3 = String.format("Could not instantiate %s.", str4);
                Log.w(MetadataBackendRegistry.TAG, str3, e);
                return null;
            } catch (NoSuchMethodException e4) {
                e = e4;
                str2 = String.format("Could not instantiate %s", str4);
                Log.w(MetadataBackendRegistry.TAG, str2, e);
                return null;
            } catch (InvocationTargetException e5) {
                e = e5;
                str2 = String.format("Could not instantiate %s", str4);
                Log.w(MetadataBackendRegistry.TAG, str2, e);
                return null;
            }
        }
    }

    @InterfaceC4441gs
    public MetadataBackendRegistry(Context context, CreationContextFactory creationContextFactory) {
        this(new BackendFactoryProvider(context), creationContextFactory);
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendRegistry
    @Nullable
    public synchronized TransportBackend get(String str) {
        if (this.backends.containsKey(str)) {
            return this.backends.get(str);
        }
        BackendFactory backendFactory = this.backendFactoryProvider.get(str);
        if (backendFactory == null) {
            return null;
        }
        TransportBackend transportBackendCreate = backendFactory.create(this.creationContextFactory.create(str));
        this.backends.put(str, transportBackendCreate);
        return transportBackendCreate;
    }

    public MetadataBackendRegistry(BackendFactoryProvider backendFactoryProvider, CreationContextFactory creationContextFactory) {
        this.backends = new HashMap();
        this.backendFactoryProvider = backendFactoryProvider;
        this.creationContextFactory = creationContextFactory;
    }
}
