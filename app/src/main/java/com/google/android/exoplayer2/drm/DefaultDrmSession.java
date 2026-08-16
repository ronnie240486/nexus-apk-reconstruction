package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C3219C;
import com.google.android.exoplayer2.drm.ExoMediaCrypto;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.EventDispatcher;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p000.C2987be;
import p000.InterfaceC4408gL;

/* JADX INFO: loaded from: classes.dex */
@TargetApi(18)
class DefaultDrmSession<T extends ExoMediaCrypto> implements DrmSession<T> {
    private static final int MAX_LICENSE_DURATION_TO_RENEW_SECONDS = 60;
    private static final int MSG_KEYS = 1;
    private static final int MSG_PROVISION = 0;
    private static final String TAG = "DefaultDrmSession";
    final MediaDrmCallback callback;

    @Nullable
    private ExoMediaDrm.KeyRequest currentKeyRequest;

    @Nullable
    private ExoMediaDrm.ProvisionRequest currentProvisionRequest;
    private final EventDispatcher<DefaultDrmSessionEventListener> eventDispatcher;
    private final boolean isPlaceholderSession;
    private final HashMap<String, String> keyRequestParameters;

    @Nullable
    private DrmSession.DrmSessionException lastException;
    private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;

    @Nullable
    private T mediaCrypto;
    private final ExoMediaDrm<T> mediaDrm;
    private final int mode;
    private byte[] offlineLicenseKeySetId;
    private final boolean playClearSamplesWithoutKeys;
    private final ProvisioningManager<T> provisioningManager;
    private int referenceCount;
    private final ReleaseCallback<T> releaseCallback;

    @Nullable
    private DefaultDrmSession<T>.RequestHandler requestHandler;

    @Nullable
    private HandlerThread requestHandlerThread;
    final DefaultDrmSession<T>.ResponseHandler responseHandler;

    @Nullable
    public final List<DrmInitData.SchemeData> schemeDatas;

    @Nullable
    private byte[] sessionId;
    private int state;
    final UUID uuid;

    /* JADX INFO: loaded from: classes2.dex */
    public interface ProvisioningManager<T extends ExoMediaCrypto> {
        void onProvisionCompleted();

        void onProvisionError(Exception exc);

        void provisionRequired(DefaultDrmSession<T> defaultDrmSession);
    }

    /* JADX INFO: loaded from: classes2.dex */
    public interface ReleaseCallback<T extends ExoMediaCrypto> {
        void onSessionReleased(DefaultDrmSession<T> defaultDrmSession);
    }

    /* JADX INFO: loaded from: classes2.dex */
    @SuppressLint({"HandlerLeak"})
    public class RequestHandler extends Handler {
        public RequestHandler(Looper looper) {
            super(looper);
        }

        private boolean maybeRetryRequest(Message message, Exception exc) {
            RequestTask requestTask = (RequestTask) message.obj;
            if (!requestTask.allowRetry) {
                return false;
            }
            int i = requestTask.errorCount + 1;
            requestTask.errorCount = i;
            if (i > DefaultDrmSession.this.loadErrorHandlingPolicy.getMinimumLoadableRetryCount(3)) {
                return false;
            }
            long retryDelayMsFor = DefaultDrmSession.this.loadErrorHandlingPolicy.getRetryDelayMsFor(3, SystemClock.elapsedRealtime() - requestTask.startTimeMs, exc instanceof IOException ? (IOException) exc : new UnexpectedDrmSessionException(exc), requestTask.errorCount);
            if (retryDelayMsFor == C3219C.TIME_UNSET) {
                return false;
            }
            sendMessageDelayed(Message.obtain(message), retryDelayMsFor);
            return true;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Object objExecuteProvisionRequest;
            RequestTask requestTask = (RequestTask) message.obj;
            try {
                int i = message.what;
                if (i == 0) {
                    DefaultDrmSession defaultDrmSession = DefaultDrmSession.this;
                    objExecuteProvisionRequest = defaultDrmSession.callback.executeProvisionRequest(defaultDrmSession.uuid, (ExoMediaDrm.ProvisionRequest) requestTask.request);
                } else {
                    if (i != 1) {
                        throw new RuntimeException();
                    }
                    DefaultDrmSession defaultDrmSession2 = DefaultDrmSession.this;
                    objExecuteProvisionRequest = defaultDrmSession2.callback.executeKeyRequest(defaultDrmSession2.uuid, (ExoMediaDrm.KeyRequest) requestTask.request);
                }
            } catch (Exception e) {
                boolean zMaybeRetryRequest = maybeRetryRequest(message, e);
                objExecuteProvisionRequest = e;
                if (zMaybeRetryRequest) {
                    return;
                }
            }
            DefaultDrmSession.this.responseHandler.obtainMessage(message.what, Pair.create(requestTask.request, objExecuteProvisionRequest)).sendToTarget();
        }

        public void post(int i, Object obj, boolean z) {
            obtainMessage(i, new RequestTask(z, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class RequestTask {
        public final boolean allowRetry;
        public int errorCount;
        public final Object request;
        public final long startTimeMs;

        public RequestTask(boolean z, long j, Object obj) {
            this.allowRetry = z;
            this.startTimeMs = j;
            this.request = obj;
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @SuppressLint({"HandlerLeak"})
    public class ResponseHandler extends Handler {
        public ResponseHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i = message.what;
            if (i == 0) {
                DefaultDrmSession.this.onProvisionResponse(obj, obj2);
            } else {
                if (i != 1) {
                    return;
                }
                DefaultDrmSession.this.onKeyResponse(obj, obj2);
            }
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class UnexpectedDrmSessionException extends IOException {
        public UnexpectedDrmSessionException(Throwable th) {
            super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
        }
    }

    public DefaultDrmSession(UUID uuid, ExoMediaDrm<T> exoMediaDrm, ProvisioningManager<T> provisioningManager, ReleaseCallback<T> releaseCallback, @Nullable List<DrmInitData.SchemeData> list, int i, boolean z, boolean z2, @Nullable byte[] bArr, HashMap<String, String> map, MediaDrmCallback mediaDrmCallback, Looper looper, EventDispatcher<DefaultDrmSessionEventListener> eventDispatcher, LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
        List<DrmInitData.SchemeData> listUnmodifiableList;
        if (i == 1 || i == 3) {
            Assertions.checkNotNull(bArr);
        }
        this.uuid = uuid;
        this.provisioningManager = provisioningManager;
        this.releaseCallback = releaseCallback;
        this.mediaDrm = exoMediaDrm;
        this.mode = i;
        this.playClearSamplesWithoutKeys = z;
        this.isPlaceholderSession = z2;
        if (bArr != null) {
            this.offlineLicenseKeySetId = bArr;
            listUnmodifiableList = null;
        } else {
            listUnmodifiableList = Collections.unmodifiableList((List) Assertions.checkNotNull(list));
        }
        this.schemeDatas = listUnmodifiableList;
        this.keyRequestParameters = map;
        this.callback = mediaDrmCallback;
        this.eventDispatcher = eventDispatcher;
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.state = 2;
        this.responseHandler = new ResponseHandler(looper);
    }

    @RequiresNonNull({InterfaceC4408gL.f14122f})
    private void doLicense(boolean z) {
        if (this.isPlaceholderSession) {
            return;
        }
        byte[] bArr = (byte[]) Util.castNonNull(this.sessionId);
        int i = this.mode;
        if (i == 0 || i == 1) {
            if (this.offlineLicenseKeySetId == null) {
                postKeyRequest(bArr, 1, z);
                return;
            }
            if (this.state != 4 && !restoreKeys()) {
                return;
            }
            long licenseDurationRemainingSec = getLicenseDurationRemainingSec();
            if (this.mode != 0 || licenseDurationRemainingSec > 60) {
                if (licenseDurationRemainingSec <= 0) {
                    onError(new KeysExpiredException());
                    return;
                } else {
                    this.state = 4;
                    this.eventDispatcher.dispatch(new C2987be());
                    return;
                }
            }
            Log.m17580d(TAG, "Offline license has expired or will expire soon. Remaining seconds: " + licenseDurationRemainingSec);
        } else {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                Assertions.checkNotNull(this.offlineLicenseKeySetId);
                Assertions.checkNotNull(this.sessionId);
                if (restoreKeys()) {
                    postKeyRequest(this.offlineLicenseKeySetId, 3, z);
                    return;
                }
                return;
            }
            if (this.offlineLicenseKeySetId != null && !restoreKeys()) {
                return;
            }
        }
        postKeyRequest(bArr, 2, z);
    }

    private long getLicenseDurationRemainingSec() {
        if (!C3219C.WIDEVINE_UUID.equals(this.uuid)) {
            return Long.MAX_VALUE;
        }
        Pair pair = (Pair) Assertions.checkNotNull(WidevineUtil.getLicenseDurationRemainingSec(this));
        return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
    }

    @EnsuresNonNullIf(expression = {InterfaceC4408gL.f14122f}, result = true)
    private boolean isOpen() {
        int i = this.state;
        return i == 3 || i == 4;
    }

    private void onError(final Exception exc) {
        this.lastException = new DrmSession.DrmSessionException(exc);
        this.eventDispatcher.dispatch(new EventDispatcher.Event() { // from class: com.google.android.exoplayer2.drm.a
            @Override // com.google.android.exoplayer2.util.EventDispatcher.Event
            public final void sendTo(Object obj) {
                ((DefaultDrmSessionEventListener) obj).onDrmSessionManagerError(exc);
            }
        });
        if (this.state != 4) {
            this.state = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onKeyResponse(Object obj, Object obj2) {
        EventDispatcher<DefaultDrmSessionEventListener> eventDispatcher;
        EventDispatcher.Event<DefaultDrmSessionEventListener> c2987be;
        if (obj == this.currentKeyRequest && isOpen()) {
            this.currentKeyRequest = null;
            if (obj2 instanceof Exception) {
                onKeysError((Exception) obj2);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.mode == 3) {
                    this.mediaDrm.provideKeyResponse((byte[]) Util.castNonNull(this.offlineLicenseKeySetId), bArr);
                    eventDispatcher = this.eventDispatcher;
                    c2987be = new C2987be();
                } else {
                    byte[] bArrProvideKeyResponse = this.mediaDrm.provideKeyResponse(this.sessionId, bArr);
                    int i = this.mode;
                    if ((i == 2 || (i == 0 && this.offlineLicenseKeySetId != null)) && bArrProvideKeyResponse != null && bArrProvideKeyResponse.length != 0) {
                        this.offlineLicenseKeySetId = bArrProvideKeyResponse;
                    }
                    this.state = 4;
                    eventDispatcher = this.eventDispatcher;
                    c2987be = new EventDispatcher.Event() { // from class: ce
                        /* JADX WARN: Invalid debug info offset */
                        @Override // com.google.android.exoplayer2.util.EventDispatcher.Event
                        public final void sendTo(Object obj3) {
                        }
                    };
                }
                eventDispatcher.dispatch(c2987be);
            } catch (Exception e) {
                onKeysError(e);
            }
        }
    }

    private void onKeysError(Exception exc) {
        if (exc instanceof NotProvisionedException) {
            this.provisioningManager.provisionRequired(this);
        } else {
            onError(exc);
        }
    }

    private void onKeysRequired() {
        if (this.mode == 0 && this.state == 4) {
            Util.castNonNull(this.sessionId);
            doLicense(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onProvisionResponse(Object obj, Object obj2) {
        if (obj == this.currentProvisionRequest) {
            if (this.state == 2 || isOpen()) {
                this.currentProvisionRequest = null;
                if (obj2 instanceof Exception) {
                    this.provisioningManager.onProvisionError((Exception) obj2);
                    return;
                }
                try {
                    this.mediaDrm.provideProvisionResponse((byte[]) obj2);
                    this.provisioningManager.onProvisionCompleted();
                } catch (Exception e) {
                    this.provisioningManager.onProvisionError(e);
                }
            }
        }
    }

    @EnsuresNonNullIf(expression = {InterfaceC4408gL.f14122f}, result = true)
    private boolean openInternal(boolean z) {
        if (isOpen()) {
            return true;
        }
        try {
            byte[] bArrOpenSession = this.mediaDrm.openSession();
            this.sessionId = bArrOpenSession;
            this.mediaCrypto = (T) this.mediaDrm.createMediaCrypto(bArrOpenSession);
            this.eventDispatcher.dispatch(new EventDispatcher.Event() { // from class: ae
                /* JADX WARN: Invalid debug info offset */
                @Override // com.google.android.exoplayer2.util.EventDispatcher.Event
                public final void sendTo(Object obj) {
                }
            });
            this.state = 3;
            Assertions.checkNotNull(this.sessionId);
            return true;
        } catch (NotProvisionedException e) {
            if (z) {
                this.provisioningManager.provisionRequired(this);
                return false;
            }
            onError(e);
            return false;
        } catch (Exception e2) {
            onError(e2);
            return false;
        }
    }

    private void postKeyRequest(byte[] bArr, int i, boolean z) {
        try {
            this.currentKeyRequest = this.mediaDrm.getKeyRequest(bArr, this.schemeDatas, i, this.keyRequestParameters);
            ((RequestHandler) Util.castNonNull(this.requestHandler)).post(1, Assertions.checkNotNull(this.currentKeyRequest), z);
        } catch (Exception e) {
            onKeysError(e);
        }
    }

    @RequiresNonNull({InterfaceC4408gL.f14122f, "offlineLicenseKeySetId"})
    private boolean restoreKeys() {
        try {
            this.mediaDrm.restoreKeys(this.sessionId, this.offlineLicenseKeySetId);
            return true;
        } catch (Exception e) {
            Log.m17583e(TAG, "Error trying to restore keys.", e);
            onError(e);
            return false;
        }
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public void acquire() {
        Assertions.checkState(this.referenceCount >= 0);
        int i = this.referenceCount + 1;
        this.referenceCount = i;
        if (i == 1) {
            Assertions.checkState(this.state == 2);
            HandlerThread handlerThread = new HandlerThread("DrmRequestHandler");
            this.requestHandlerThread = handlerThread;
            handlerThread.start();
            this.requestHandler = new RequestHandler(this.requestHandlerThread.getLooper());
            if (openInternal(true)) {
                doLicense(true);
            }
        }
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    @Nullable
    public final DrmSession.DrmSessionException getError() {
        if (this.state == 1) {
            return this.lastException;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    @Nullable
    public final T getMediaCrypto() {
        return this.mediaCrypto;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    @Nullable
    public byte[] getOfflineLicenseKeySetId() {
        return this.offlineLicenseKeySetId;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final int getState() {
        return this.state;
    }

    public boolean hasSessionId(byte[] bArr) {
        return Arrays.equals(this.sessionId, bArr);
    }

    public void onMediaDrmEvent(int i) {
        if (i != 2) {
            return;
        }
        onKeysRequired();
    }

    public void onProvisionCompleted() {
        if (openInternal(false)) {
            doLicense(true);
        }
    }

    public void onProvisionError(Exception exc) {
        onError(exc);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public boolean playClearSamplesWithoutKeys() {
        return this.playClearSamplesWithoutKeys;
    }

    public void provision() {
        this.currentProvisionRequest = this.mediaDrm.getProvisionRequest();
        ((RequestHandler) Util.castNonNull(this.requestHandler)).post(0, Assertions.checkNotNull(this.currentProvisionRequest), true);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    @Nullable
    public Map<String, String> queryKeyStatus() {
        byte[] bArr = this.sessionId;
        if (bArr == null) {
            return null;
        }
        return this.mediaDrm.queryKeyStatus(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public void release() {
        int i = this.referenceCount - 1;
        this.referenceCount = i;
        if (i == 0) {
            this.state = 0;
            ((ResponseHandler) Util.castNonNull(this.responseHandler)).removeCallbacksAndMessages(null);
            ((RequestHandler) Util.castNonNull(this.requestHandler)).removeCallbacksAndMessages(null);
            this.requestHandler = null;
            ((HandlerThread) Util.castNonNull(this.requestHandlerThread)).quit();
            this.requestHandlerThread = null;
            this.mediaCrypto = null;
            this.lastException = null;
            this.currentKeyRequest = null;
            this.currentProvisionRequest = null;
            byte[] bArr = this.sessionId;
            if (bArr != null) {
                this.mediaDrm.closeSession(bArr);
                this.sessionId = null;
                this.eventDispatcher.dispatch(new EventDispatcher.Event() { // from class: Zd
                    /* JADX WARN: Invalid debug info offset */
                    @Override // com.google.android.exoplayer2.util.EventDispatcher.Event
                    public final void sendTo(Object obj) {
                    }
                });
            }
            this.releaseCallback.onSessionReleased(this);
        }
    }
}
