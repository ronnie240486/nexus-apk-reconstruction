package com.google.firebase.crashlytics.internal.common;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.NativeSessionFileProvider;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.crashlytics.internal.model.StaticSessionData;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.settings.Settings;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.C0431Gc;

/* JADX INFO: loaded from: classes2.dex */
class CrashlyticsController {
    static final FilenameFilter APP_EXCEPTION_MARKER_FILTER = new FilenameFilter() { // from class: com.google.firebase.crashlytics.internal.common.a
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return CrashlyticsController.lambda$static$0(file, str);
        }
    };
    static final String APP_EXCEPTION_MARKER_PREFIX = ".ae";
    static final String FIREBASE_APPLICATION_EXCEPTION = "_ae";
    static final String FIREBASE_CRASH_TYPE = "fatal";
    static final int FIREBASE_CRASH_TYPE_FATAL = 1;
    static final String FIREBASE_TIMESTAMP = "timestamp";
    private static final String GENERATOR_FORMAT = "Crashlytics Android SDK/%s";
    static final String NATIVE_SESSION_DIR = "native-sessions";
    private final AnalyticsEventLogger analyticsEventLogger;
    private final AppData appData;
    private final CrashlyticsBackgroundWorker backgroundWorker;
    private final Context context;
    private CrashlyticsUncaughtExceptionHandler crashHandler;
    private final CrashlyticsFileMarker crashMarker;
    private final DataCollectionArbiter dataCollectionArbiter;
    private final FileStore fileStore;
    private final IdManager idManager;
    private final LogFileManager logFileManager;
    private final CrashlyticsNativeComponent nativeComponent;
    private final SessionReportingCoordinator reportingCoordinator;
    private final UserMetadata userMetadata;
    private SettingsProvider settingsProvider = null;
    final TaskCompletionSource<Boolean> unsentReportsAvailable = new TaskCompletionSource<>();
    final TaskCompletionSource<Boolean> reportActionProvided = new TaskCompletionSource<>();
    final TaskCompletionSource<Void> unsentReportsHandled = new TaskCompletionSource<>();
    final AtomicBoolean checkForUnsentReportsCalled = new AtomicBoolean(false);

    /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.common.CrashlyticsController$4 */
    public class C36894 implements SuccessContinuation<Boolean, Void> {
        final /* synthetic */ Task val$settingsDataTask;

        public C36894(Task task) {
            this.val$settingsDataTask = task;
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        @NonNull
        public Task<Void> then(@Nullable final Boolean bool) throws Exception {
            return CrashlyticsController.this.backgroundWorker.submitTask(new Callable<Task<Void>>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.4.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public Task<Void> call() throws Exception {
                    if (bool.booleanValue()) {
                        Logger.getLogger().m17650d("Sending cached crash reports...");
                        CrashlyticsController.this.dataCollectionArbiter.grantDataCollectionPermission(bool.booleanValue());
                        final Executor executor = CrashlyticsController.this.backgroundWorker.getExecutor();
                        return C36894.this.val$settingsDataTask.onSuccessTask(executor, new SuccessContinuation<Settings, Void>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.4.1.1
                            @Override // com.google.android.gms.tasks.SuccessContinuation
                            @NonNull
                            public Task<Void> then(@Nullable Settings settings) throws Exception {
                                if (settings == null) {
                                    Logger.getLogger().m17658w("Received null app settings at app startup. Cannot send cached reports");
                                } else {
                                    CrashlyticsController.this.logAnalyticsAppExceptionEvents();
                                    CrashlyticsController.this.reportingCoordinator.sendReports(executor);
                                    CrashlyticsController.this.unsentReportsHandled.trySetResult(null);
                                }
                                return Tasks.forResult(null);
                            }
                        });
                    }
                    Logger.getLogger().m17656v("Deleting cached crash reports...");
                    CrashlyticsController.deleteFiles(CrashlyticsController.this.listAppExceptionMarkerFiles());
                    CrashlyticsController.this.reportingCoordinator.removeAllReports();
                    CrashlyticsController.this.unsentReportsHandled.trySetResult(null);
                    return Tasks.forResult(null);
                }
            });
        }
    }

    public CrashlyticsController(Context context, CrashlyticsBackgroundWorker crashlyticsBackgroundWorker, IdManager idManager, DataCollectionArbiter dataCollectionArbiter, FileStore fileStore, CrashlyticsFileMarker crashlyticsFileMarker, AppData appData, UserMetadata userMetadata, LogFileManager logFileManager, SessionReportingCoordinator sessionReportingCoordinator, CrashlyticsNativeComponent crashlyticsNativeComponent, AnalyticsEventLogger analyticsEventLogger) {
        this.context = context;
        this.backgroundWorker = crashlyticsBackgroundWorker;
        this.idManager = idManager;
        this.dataCollectionArbiter = dataCollectionArbiter;
        this.fileStore = fileStore;
        this.crashMarker = crashlyticsFileMarker;
        this.appData = appData;
        this.userMetadata = userMetadata;
        this.logFileManager = logFileManager;
        this.nativeComponent = crashlyticsNativeComponent;
        this.analyticsEventLogger = analyticsEventLogger;
        this.reportingCoordinator = sessionReportingCoordinator;
    }

    private static StaticSessionData.AppData createAppData(IdManager idManager, AppData appData) {
        return StaticSessionData.AppData.create(idManager.getAppIdentifier(), appData.versionCode, appData.versionName, idManager.getCrashlyticsInstallId(), DeliveryMechanism.determineFrom(appData.installerPackageName).getId(), appData.developmentPlatformProvider);
    }

    private static StaticSessionData.DeviceData createDeviceData() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return StaticSessionData.DeviceData.create(CommonUtils.getCpuArchitectureInt(), Build.MODEL, Runtime.getRuntime().availableProcessors(), CommonUtils.getTotalRamInBytes(), ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize()), CommonUtils.isEmulator(), CommonUtils.getDeviceState(), Build.MANUFACTURER, Build.PRODUCT);
    }

    private static StaticSessionData.OsData createOsData() {
        return StaticSessionData.OsData.create(Build.VERSION.RELEASE, Build.VERSION.CODENAME, CommonUtils.isRooted());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void deleteFiles(List<File> list) {
        Iterator<File> it = list.iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doOpenSession(String str) {
        long currentTimestampSeconds = getCurrentTimestampSeconds();
        Logger.getLogger().m17650d("Opening a new session with ID " + str);
        this.nativeComponent.prepareNativeSession(str, String.format(Locale.US, GENERATOR_FORMAT, CrashlyticsCore.getVersion()), currentTimestampSeconds, StaticSessionData.create(createAppData(this.idManager, this.appData), createOsData(), createDeviceData()));
        this.logFileManager.setCurrentSession(str);
        this.reportingCoordinator.onBeginSession(str, currentTimestampSeconds);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doWriteAppExceptionMarker(long j) {
        try {
            if (this.fileStore.getCommonFile(APP_EXCEPTION_MARKER_PREFIX + j).createNewFile()) {
            } else {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e) {
            Logger.getLogger().m17659w("Could not create app exception marker file.", e);
        }
    }

    private void finalizePreviousNativeSession(String str) {
        Logger.getLogger().m17656v("Finalizing native report for session " + str);
        NativeSessionFileProvider sessionFileProvider = this.nativeComponent.getSessionFileProvider(str);
        File minidumpFile = sessionFileProvider.getMinidumpFile();
        if (minidumpFile == null || !minidumpFile.exists()) {
            Logger.getLogger().m17658w("No minidump data found for session " + str);
            return;
        }
        long jLastModified = minidumpFile.lastModified();
        LogFileManager logFileManager = new LogFileManager(this.fileStore, str);
        File nativeSessionDir = this.fileStore.getNativeSessionDir(str);
        if (!nativeSessionDir.isDirectory()) {
            Logger.getLogger().m17658w("Couldn't create directory to store native session files, aborting.");
            return;
        }
        doWriteAppExceptionMarker(jLastModified);
        List<NativeSessionFile> nativeSessionFiles = getNativeSessionFiles(sessionFileProvider, str, this.fileStore, logFileManager.getBytesForLog());
        NativeSessionFileGzipper.processNativeSessions(nativeSessionDir, nativeSessionFiles);
        Logger.getLogger().m17650d("CrashlyticsController#finalizePreviousNativeSession");
        this.reportingCoordinator.finalizeSessionWithNativeEvent(str, nativeSessionFiles);
        logFileManager.clearLog();
    }

    private static boolean firebaseCrashExists() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private Context getContext() {
        return this.context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public String getCurrentSessionId() {
        SortedSet<String> sortedSetListSortedOpenSessionIds = this.reportingCoordinator.listSortedOpenSessionIds();
        if (sortedSetListSortedOpenSessionIds.isEmpty()) {
            return null;
        }
        return sortedSetListSortedOpenSessionIds.first();
    }

    private static long getCurrentTimestampSeconds() {
        return getTimestampSeconds(System.currentTimeMillis());
    }

    @NonNull
    public static List<NativeSessionFile> getNativeSessionFiles(NativeSessionFileProvider nativeSessionFileProvider, String str, FileStore fileStore, byte[] bArr) {
        File sessionFile = fileStore.getSessionFile(str, UserMetadata.USERDATA_FILENAME);
        File sessionFile2 = fileStore.getSessionFile(str, UserMetadata.KEYDATA_FILENAME);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BytesBackedNativeSessionFile("logs_file", "logs", bArr));
        arrayList.add(new FileBackedNativeSessionFile("crash_meta_file", TtmlNode.TAG_METADATA, nativeSessionFileProvider.getMetadataFile()));
        arrayList.add(new FileBackedNativeSessionFile("session_meta_file", "session", nativeSessionFileProvider.getSessionFile()));
        arrayList.add(new FileBackedNativeSessionFile("app_meta_file", "app", nativeSessionFileProvider.getAppFile()));
        arrayList.add(new FileBackedNativeSessionFile("device_meta_file", "device", nativeSessionFileProvider.getDeviceFile()));
        arrayList.add(new FileBackedNativeSessionFile("os_meta_file", "os", nativeSessionFileProvider.getOsFile()));
        arrayList.add(new FileBackedNativeSessionFile("minidump_file", "minidump", nativeSessionFileProvider.getMinidumpFile()));
        arrayList.add(new FileBackedNativeSessionFile("user_meta_file", "user", sessionFile));
        arrayList.add(new FileBackedNativeSessionFile("keys_file", UserMetadata.KEYDATA_FILENAME, sessionFile2));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long getTimestampSeconds(long j) {
        return j / 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$0(File file, String str) {
        return str.startsWith(APP_EXCEPTION_MARKER_PREFIX);
    }

    private Task<Void> logAnalyticsAppExceptionEvent(final long j) {
        if (firebaseCrashExists()) {
            Logger.getLogger().m17658w("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return Tasks.forResult(null);
        }
        Logger.getLogger().m17650d("Logging app exception event to Firebase Analytics");
        return Tasks.call(new ScheduledThreadPoolExecutor(1), new Callable<Void>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.8
            @Override // java.util.concurrent.Callable
            public Void call() throws Exception {
                Bundle bundle = new Bundle();
                bundle.putInt(CrashlyticsController.FIREBASE_CRASH_TYPE, 1);
                bundle.putLong(CrashlyticsController.FIREBASE_TIMESTAMP, j);
                CrashlyticsController.this.analyticsEventLogger.logEvent(CrashlyticsController.FIREBASE_APPLICATION_EXCEPTION, bundle);
                return null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task<Void> logAnalyticsAppExceptionEvents() {
        ArrayList arrayList = new ArrayList();
        for (File file : listAppExceptionMarkerFiles()) {
            try {
                arrayList.add(logAnalyticsAppExceptionEvent(Long.parseLong(file.getName().substring(3))));
            } catch (NumberFormatException unused) {
                Logger.getLogger().m17658w("Could not parse app exception timestamp from file " + file.getName());
            }
            file.delete();
        }
        return Tasks.whenAll(arrayList);
    }

    private Task<Boolean> waitForReportAction() {
        if (this.dataCollectionArbiter.isAutomaticDataCollectionEnabled()) {
            Logger.getLogger().m17650d("Automatic data collection is enabled. Allowing upload.");
            this.unsentReportsAvailable.trySetResult(Boolean.FALSE);
            return Tasks.forResult(Boolean.TRUE);
        }
        Logger.getLogger().m17650d("Automatic data collection is disabled.");
        Logger.getLogger().m17656v("Notifying that unsent reports are available.");
        this.unsentReportsAvailable.trySetResult(Boolean.TRUE);
        Task<TContinuationResult> taskOnSuccessTask = this.dataCollectionArbiter.waitForAutomaticDataCollectionEnabled().onSuccessTask(new SuccessContinuation<Void, Boolean>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.3
            @Override // com.google.android.gms.tasks.SuccessContinuation
            @NonNull
            public Task<Boolean> then(@Nullable Void r1) throws Exception {
                return Tasks.forResult(Boolean.TRUE);
            }
        });
        Logger.getLogger().m17650d("Waiting for send/deleteUnsentReports to be called.");
        return Utils.race(taskOnSuccessTask, this.reportActionProvided.getTask());
    }

    private void writeApplicationExitInfoEventIfRelevant(String str) {
        int i = Build.VERSION.SDK_INT;
        if (i < 30) {
            Logger.getLogger().m17656v("ANR feature enabled, but device is API " + i);
            return;
        }
        List<ApplicationExitInfo> listM2103a = C0431Gc.m2103a((ActivityManager) this.context.getSystemService("activity"), null, 0, 0);
        if (listM2103a.size() != 0) {
            this.reportingCoordinator.persistRelevantAppExitInfoEvent(str, listM2103a, new LogFileManager(this.fileStore, str), UserMetadata.loadFromExistingSession(str, this.fileStore, this.backgroundWorker));
        } else {
            Logger.getLogger().m17656v("No ApplicationExitInfo available. Session: " + str);
        }
    }

    @NonNull
    public Task<Boolean> checkForUnsentReports() {
        if (this.checkForUnsentReportsCalled.compareAndSet(false, true)) {
            return this.unsentReportsAvailable.getTask();
        }
        Logger.getLogger().m17658w("checkForUnsentReports should only be called once per execution.");
        return Tasks.forResult(Boolean.FALSE);
    }

    public Task<Void> deleteUnsentReports() {
        this.reportActionProvided.trySetResult(Boolean.FALSE);
        return this.unsentReportsHandled.getTask();
    }

    public boolean didCrashOnPreviousExecution() {
        if (!this.crashMarker.isPresent()) {
            String currentSessionId = getCurrentSessionId();
            return currentSessionId != null && this.nativeComponent.hasCrashDataForSession(currentSessionId);
        }
        Logger.getLogger().m17656v("Found previous crash marker.");
        this.crashMarker.remove();
        return true;
    }

    public void doCloseSessions(SettingsProvider settingsProvider) {
        doCloseSessions(false, settingsProvider);
    }

    public void enableExceptionHandling(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, SettingsProvider settingsProvider) {
        this.settingsProvider = settingsProvider;
        openSession(str);
        CrashlyticsUncaughtExceptionHandler crashlyticsUncaughtExceptionHandler = new CrashlyticsUncaughtExceptionHandler(new CrashlyticsUncaughtExceptionHandler.CrashListener() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.1
            @Override // com.google.firebase.crashlytics.internal.common.CrashlyticsUncaughtExceptionHandler.CrashListener
            public void onUncaughtException(@NonNull SettingsProvider settingsProvider2, @NonNull Thread thread, @NonNull Throwable th) {
                CrashlyticsController.this.handleUncaughtException(settingsProvider2, thread, th);
            }
        }, settingsProvider, uncaughtExceptionHandler, this.nativeComponent);
        this.crashHandler = crashlyticsUncaughtExceptionHandler;
        Thread.setDefaultUncaughtExceptionHandler(crashlyticsUncaughtExceptionHandler);
    }

    public boolean finalizeSessions(SettingsProvider settingsProvider) {
        this.backgroundWorker.checkRunningOnThread();
        if (isHandlingException()) {
            Logger.getLogger().m17658w("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        Logger.getLogger().m17656v("Finalizing previously open sessions.");
        try {
            doCloseSessions(true, settingsProvider);
            Logger.getLogger().m17656v("Closed all previously open sessions.");
            return true;
        } catch (Exception e) {
            Logger.getLogger().m17653e("Unable to finalize previously open sessions.", e);
            return false;
        }
    }

    public UserMetadata getUserMetadata() {
        return this.userMetadata;
    }

    public void handleUncaughtException(@NonNull SettingsProvider settingsProvider, @NonNull Thread thread, @NonNull Throwable th) {
        handleUncaughtException(settingsProvider, thread, th, false);
    }

    public boolean isHandlingException() {
        CrashlyticsUncaughtExceptionHandler crashlyticsUncaughtExceptionHandler = this.crashHandler;
        return crashlyticsUncaughtExceptionHandler != null && crashlyticsUncaughtExceptionHandler.isHandlingException();
    }

    public List<File> listAppExceptionMarkerFiles() {
        return this.fileStore.getCommonFiles(APP_EXCEPTION_MARKER_FILTER);
    }

    public void logFatalException(Thread thread, Throwable th) {
        SettingsProvider settingsProvider = this.settingsProvider;
        if (settingsProvider == null) {
            Logger.getLogger().m17658w("settingsProvider not set");
        } else {
            handleUncaughtException(settingsProvider, thread, th, true);
        }
    }

    public void openSession(final String str) {
        this.backgroundWorker.submit(new Callable<Void>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.7
            @Override // java.util.concurrent.Callable
            public Void call() throws Exception {
                CrashlyticsController.this.doOpenSession(str);
                return null;
            }
        });
    }

    public Task<Void> sendUnsentReports() {
        this.reportActionProvided.trySetResult(Boolean.TRUE);
        return this.unsentReportsHandled.getTask();
    }

    public void setCustomKey(String str, String str2) {
        try {
            this.userMetadata.setCustomKey(str, str2);
        } catch (IllegalArgumentException e) {
            Context context = this.context;
            if (context != null && CommonUtils.isAppDebuggable(context)) {
                throw e;
            }
            Logger.getLogger().m17652e("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    public void setCustomKeys(Map<String, String> map) {
        this.userMetadata.setCustomKeys(map);
    }

    public void setInternalKey(String str, String str2) {
        try {
            this.userMetadata.setInternalKey(str, str2);
        } catch (IllegalArgumentException e) {
            Context context = this.context;
            if (context != null && CommonUtils.isAppDebuggable(context)) {
                throw e;
            }
            Logger.getLogger().m17652e("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    public void setUserId(String str) {
        this.userMetadata.setUserId(str);
    }

    public Task<Void> submitAllReports(Task<Settings> task) {
        if (this.reportingCoordinator.hasReportsToSend()) {
            Logger.getLogger().m17656v("Crash reports are available to be sent.");
            return waitForReportAction().onSuccessTask(new C36894(task));
        }
        Logger.getLogger().m17656v("No crash reports are available to be sent.");
        this.unsentReportsAvailable.trySetResult(Boolean.FALSE);
        return Tasks.forResult(null);
    }

    public void writeNonFatalException(@NonNull final Thread thread, @NonNull final Throwable th) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        this.backgroundWorker.submit(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.6
            @Override // java.lang.Runnable
            public void run() {
                if (CrashlyticsController.this.isHandlingException()) {
                    return;
                }
                long timestampSeconds = CrashlyticsController.getTimestampSeconds(jCurrentTimeMillis);
                String currentSessionId = CrashlyticsController.this.getCurrentSessionId();
                if (currentSessionId == null) {
                    Logger.getLogger().m17658w("Tried to write a non-fatal exception while no session was open.");
                } else {
                    CrashlyticsController.this.reportingCoordinator.persistNonFatalEvent(th, thread, currentSessionId, timestampSeconds);
                }
            }
        });
    }

    public void writeToLog(final long j, final String str) {
        this.backgroundWorker.submit(new Callable<Void>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.5
            @Override // java.util.concurrent.Callable
            public Void call() throws Exception {
                if (CrashlyticsController.this.isHandlingException()) {
                    return null;
                }
                CrashlyticsController.this.logFileManager.writeToLog(j, str);
                return null;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void doCloseSessions(boolean z, SettingsProvider settingsProvider) {
        ArrayList arrayList = new ArrayList(this.reportingCoordinator.listSortedOpenSessionIds());
        if (arrayList.size() <= z) {
            Logger.getLogger().m17656v("No open sessions to be closed.");
            return;
        }
        String str = (String) arrayList.get(z ? 1 : 0);
        if (settingsProvider.getSettingsSync().featureFlagData.collectAnrs) {
            writeApplicationExitInfoEventIfRelevant(str);
        } else {
            Logger.getLogger().m17656v("ANR feature disabled.");
        }
        if (this.nativeComponent.hasCrashDataForSession(str)) {
            finalizePreviousNativeSession(str);
        }
        this.reportingCoordinator.finalizeSessions(getCurrentTimestampSeconds(), z != 0 ? (String) arrayList.get(0) : null);
    }

    public synchronized void handleUncaughtException(@NonNull final SettingsProvider settingsProvider, @NonNull final Thread thread, @NonNull final Throwable th, final boolean z) {
        try {
            Logger.getLogger().m17650d("Handling uncaught exception \"" + th + "\" from thread " + thread.getName());
            final long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                Utils.awaitEvenIfOnMainThread(this.backgroundWorker.submitTask(new Callable<Task<Void>>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // java.util.concurrent.Callable
                    public Task<Void> call() throws Exception {
                        long timestampSeconds = CrashlyticsController.getTimestampSeconds(jCurrentTimeMillis);
                        final String currentSessionId = CrashlyticsController.this.getCurrentSessionId();
                        if (currentSessionId == null) {
                            Logger.getLogger().m17652e("Tried to write a fatal exception while no session was open.");
                            return Tasks.forResult(null);
                        }
                        CrashlyticsController.this.crashMarker.create();
                        CrashlyticsController.this.reportingCoordinator.persistFatalEvent(th, thread, currentSessionId, timestampSeconds);
                        CrashlyticsController.this.doWriteAppExceptionMarker(jCurrentTimeMillis);
                        CrashlyticsController.this.doCloseSessions(settingsProvider);
                        CrashlyticsController.this.doOpenSession(new CLSUUID(CrashlyticsController.this.idManager).toString());
                        if (!CrashlyticsController.this.dataCollectionArbiter.isAutomaticDataCollectionEnabled()) {
                            return Tasks.forResult(null);
                        }
                        final Executor executor = CrashlyticsController.this.backgroundWorker.getExecutor();
                        return settingsProvider.getSettingsAsync().onSuccessTask(executor, new SuccessContinuation<Settings, Void>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.2.1
                            @Override // com.google.android.gms.tasks.SuccessContinuation
                            @NonNull
                            public Task<Void> then(@Nullable Settings settings) throws Exception {
                                if (settings != null) {
                                    return Tasks.whenAll((Task<?>[]) new Task[]{CrashlyticsController.this.logAnalyticsAppExceptionEvents(), CrashlyticsController.this.reportingCoordinator.sendReports(executor, z ? currentSessionId : null)});
                                }
                                Logger.getLogger().m17658w("Received null app settings, cannot send reports at crash time.");
                                return Tasks.forResult(null);
                            }
                        });
                    }
                }));
            } catch (TimeoutException unused) {
                Logger.getLogger().m17652e("Cannot send reports. Timed out while fetching settings.");
            } catch (Exception e) {
                Logger.getLogger().m17653e("Error handling uncaught exception", e);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
