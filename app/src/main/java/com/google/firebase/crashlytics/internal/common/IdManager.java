package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.installations.FirebaseInstallationsApi;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public class IdManager implements InstallIdProvider {
    public static final String DEFAULT_VERSION_NAME = "0.0";
    static final String PREFKEY_ADVERTISING_ID = "crashlytics.advertising.id";
    static final String PREFKEY_FIREBASE_IID = "firebase.installation.id";
    static final String PREFKEY_INSTALLATION_UUID = "crashlytics.installation.id";
    static final String PREFKEY_LEGACY_INSTALLATION_UUID = "crashlytics.installation.id";
    private static final String SYNTHETIC_FID_PREFIX = "SYN_";
    private final Context appContext;
    private final String appIdentifier;
    private String crashlyticsInstallId;
    private final DataCollectionArbiter dataCollectionArbiter;
    private final FirebaseInstallationsApi firebaseInstallationsApi;
    private final InstallerPackageNameProvider installerPackageNameProvider;
    private static final Pattern ID_PATTERN = Pattern.compile("[^\\p{Alnum}]");
    private static final String FORWARD_SLASH_REGEX = Pattern.quote("/");

    public IdManager(Context context, String str, FirebaseInstallationsApi firebaseInstallationsApi, DataCollectionArbiter dataCollectionArbiter) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.appContext = context;
        this.appIdentifier = str;
        this.firebaseInstallationsApi = firebaseInstallationsApi;
        this.dataCollectionArbiter = dataCollectionArbiter;
        this.installerPackageNameProvider = new InstallerPackageNameProvider();
    }

    @NonNull
    private synchronized String createAndCacheCrashlyticsInstallId(String str, SharedPreferences sharedPreferences) {
        String id;
        id = formatId(UUID.randomUUID().toString());
        Logger.getLogger().m17656v("Created new Crashlytics installation ID: " + id + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", id).putString(PREFKEY_FIREBASE_IID, str).apply();
        return id;
    }

    public static String createSyntheticFid() {
        return SYNTHETIC_FID_PREFIX + UUID.randomUUID().toString();
    }

    @Nullable
    private String fetchTrueFid() {
        try {
            return (String) Utils.awaitEvenIfOnMainThread(this.firebaseInstallationsApi.getId());
        } catch (Exception e) {
            Logger.getLogger().m17659w("Failed to retrieve Firebase Installations ID.", e);
            return null;
        }
    }

    private static String formatId(String str) {
        if (str == null) {
            return null;
        }
        return ID_PATTERN.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    public static boolean isSyntheticFid(String str) {
        return str != null && str.startsWith(SYNTHETIC_FID_PREFIX);
    }

    private String readCachedCrashlyticsInstallId(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", null);
    }

    private String removeForwardSlashesIn(String str) {
        return str.replaceAll(FORWARD_SLASH_REGEX, "");
    }

    public String getAppIdentifier() {
        return this.appIdentifier;
    }

    @Override // com.google.firebase.crashlytics.internal.common.InstallIdProvider
    @NonNull
    public synchronized String getCrashlyticsInstallId() {
        String cachedCrashlyticsInstallId;
        try {
            String str = this.crashlyticsInstallId;
            if (str != null) {
                return str;
            }
            Logger.getLogger().m17656v("Determining Crashlytics installation ID...");
            SharedPreferences sharedPrefs = CommonUtils.getSharedPrefs(this.appContext);
            String string = sharedPrefs.getString(PREFKEY_FIREBASE_IID, null);
            Logger.getLogger().m17656v("Cached Firebase Installation ID: " + string);
            if (this.dataCollectionArbiter.isAutomaticDataCollectionEnabled()) {
                String strFetchTrueFid = fetchTrueFid();
                Logger.getLogger().m17656v("Fetched Firebase Installation ID: " + strFetchTrueFid);
                if (strFetchTrueFid == null) {
                    strFetchTrueFid = string == null ? createSyntheticFid() : string;
                }
                cachedCrashlyticsInstallId = strFetchTrueFid.equals(string) ? readCachedCrashlyticsInstallId(sharedPrefs) : createAndCacheCrashlyticsInstallId(strFetchTrueFid, sharedPrefs);
            } else {
                cachedCrashlyticsInstallId = isSyntheticFid(string) ? readCachedCrashlyticsInstallId(sharedPrefs) : createAndCacheCrashlyticsInstallId(createSyntheticFid(), sharedPrefs);
            }
            this.crashlyticsInstallId = cachedCrashlyticsInstallId;
            if (this.crashlyticsInstallId == null) {
                Logger.getLogger().m17658w("Unable to determine Crashlytics Install Id, creating a new one.");
                this.crashlyticsInstallId = createAndCacheCrashlyticsInstallId(createSyntheticFid(), sharedPrefs);
            }
            Logger.getLogger().m17656v("Crashlytics installation ID: " + this.crashlyticsInstallId);
            return this.crashlyticsInstallId;
        } catch (Throwable th) {
            throw th;
        }
    }

    public String getInstallerPackageName() {
        return this.installerPackageNameProvider.getInstallerPackageName(this.appContext);
    }

    public String getModelName() {
        return String.format(Locale.US, "%s/%s", removeForwardSlashesIn(Build.MANUFACTURER), removeForwardSlashesIn(Build.MODEL));
    }

    public String getOsBuildVersionString() {
        return removeForwardSlashesIn(Build.VERSION.INCREMENTAL);
    }

    public String getOsDisplayVersionString() {
        return removeForwardSlashesIn(Build.VERSION.RELEASE);
    }
}
