package com.google.firebase.heartbeatinfo;

import android.content.Context;
import android.util.Base64OutputStream;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.core.os.UserManagerCompat;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Dependency;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import com.google.firebase.inject.Provider;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import p000.C1051QH;

/* JADX INFO: loaded from: classes2.dex */
public class DefaultHeartBeatController implements HeartBeatController, HeartBeatInfo {
    private static final ThreadFactory THREAD_FACTORY = new ThreadFactory() { // from class: ke
        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return null;
        }
    };
    private final Context applicationContext;
    private final Executor backgroundExecutor;
    private final Set<HeartBeatConsumer> consumers;
    private final Provider<HeartBeatInfoStorage> storageProvider;
    private final Provider<UserAgentPublisher> userAgentProvider;

    private DefaultHeartBeatController(final Context context, final String str, Set<HeartBeatConsumer> set, Provider<UserAgentPublisher> provider) {
        this(new Provider(context, str) { // from class: he

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Context f14339a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ String f14340b;

            /* JADX WARN: Invalid debug info offset */
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                return null;
            }
        }, set, new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), THREAD_FACTORY), provider, context);
    }

    @NonNull
    public static Component<DefaultHeartBeatController> component() {
        return Component.builder(DefaultHeartBeatController.class, HeartBeatController.class, HeartBeatInfo.class).add(Dependency.required(Context.class)).add(Dependency.required(FirebaseApp.class)).add(Dependency.setOf(HeartBeatConsumer.class)).add(Dependency.requiredProvider(UserAgentPublisher.class)).factory(new ComponentFactory() { // from class: je
            /* JADX WARN: Invalid debug info offset */
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return null;
            }
        }).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ DefaultHeartBeatController lambda$component$4(ComponentContainer componentContainer) {
        return new DefaultHeartBeatController((Context) componentContainer.get(Context.class), ((FirebaseApp) componentContainer.get(FirebaseApp.class)).getPersistenceKey(), componentContainer.setOf(HeartBeatConsumer.class), componentContainer.getProvider(UserAgentPublisher.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$getHeartBeatsHeader$2() throws Exception {
        String string;
        synchronized (this) {
            try {
                HeartBeatInfoStorage heartBeatInfoStorage = this.storageProvider.get();
                List<HeartBeatResult> allHeartBeats = heartBeatInfoStorage.getAllHeartBeats();
                heartBeatInfoStorage.deleteAllHeartBeats();
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < allHeartBeats.size(); i++) {
                    HeartBeatResult heartBeatResult = allHeartBeats.get(i);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", heartBeatResult.getUserAgent());
                    jSONObject.put("dates", new JSONArray((Collection) heartBeatResult.getUsedDates()));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put(C1051QH.f2696b, "2");
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                    try {
                        gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        string = byteArrayOutputStream.toString("UTF-8");
                    } catch (Throwable th) {
                        try {
                            gZIPOutputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        base64OutputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ HeartBeatInfoStorage lambda$new$3(Context context, String str) {
        return new HeartBeatInfoStorage(context, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void lambda$registerHeartBeat$1() throws Exception {
        synchronized (this) {
            this.storageProvider.get().storeHeartBeat(System.currentTimeMillis(), this.userAgentProvider.get().getUserAgent());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Thread lambda$static$0(Runnable runnable) {
        return new Thread(runnable, "heartbeat-information-executor");
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatInfo
    @NonNull
    public synchronized HeartBeatInfo.HeartBeat getHeartBeatCode(@NonNull String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        HeartBeatInfoStorage heartBeatInfoStorage = this.storageProvider.get();
        if (!heartBeatInfoStorage.shouldSendGlobalHeartBeat(jCurrentTimeMillis)) {
            return HeartBeatInfo.HeartBeat.NONE;
        }
        heartBeatInfoStorage.postHeartBeatCleanUp();
        return HeartBeatInfo.HeartBeat.GLOBAL;
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatController
    public Task<String> getHeartBeatsHeader() {
        return UserManagerCompat.isUserUnlocked(this.applicationContext) ^ true ? Tasks.forResult("") : Tasks.call(this.backgroundExecutor, new Callable(this) { // from class: ie

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ DefaultHeartBeatController f14551a;

            /* JADX WARN: Invalid debug info offset */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        });
    }

    public Task<Void> registerHeartBeat() {
        if (this.consumers.size() > 0 && !(!UserManagerCompat.isUserUnlocked(this.applicationContext))) {
            return Tasks.call(this.backgroundExecutor, new Callable(this) { // from class: le

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ DefaultHeartBeatController f15058a;

                /* JADX WARN: Invalid debug info offset */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return null;
                }
            });
        }
        return Tasks.forResult(null);
    }

    @VisibleForTesting
    public DefaultHeartBeatController(Provider<HeartBeatInfoStorage> provider, Set<HeartBeatConsumer> set, Executor executor, Provider<UserAgentPublisher> provider2, Context context) {
        this.storageProvider = provider;
        this.consumers = set;
        this.backgroundExecutor = executor;
        this.userAgentProvider = provider2;
        this.applicationContext = context;
    }
}
