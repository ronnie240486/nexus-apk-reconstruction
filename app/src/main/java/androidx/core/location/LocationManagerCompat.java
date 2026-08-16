package androidx.core.location;

import android.content.Context;
import android.location.GnssStatus;
import android.location.GpsStatus;
import android.location.LocationManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import androidx.collection.SimpleArrayMap;
import androidx.core.os.ExecutorCompat;
import androidx.core.util.Preconditions;
import java.lang.reflect.Field;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p000.C5272qw;
import p000.C5335rw;
import p000.C5406sw;

/* JADX INFO: loaded from: classes.dex */
public final class LocationManagerCompat {
    private static final long PRE_N_LOOPER_TIMEOUT_S = 4;
    private static Field sContextField;

    @GuardedBy("sGnssStatusListeners")
    private static final SimpleArrayMap<Object, Object> sGnssStatusListeners = new SimpleArrayMap<>();

    @RequiresApi(28)
    public static class Api28Impl {
        private Api28Impl() {
        }

        public static boolean isLocationEnabled(LocationManager locationManager) {
            return locationManager.isLocationEnabled();
        }
    }

    @RequiresApi(30)
    public static class GnssStatusTransport extends GnssStatus.Callback {
        final GnssStatusCompat.Callback mCallback;

        public GnssStatusTransport(GnssStatusCompat.Callback callback) {
            Preconditions.checkArgument(callback != null, "invalid null callback");
            this.mCallback = callback;
        }

        @Override // android.location.GnssStatus.Callback
        public void onFirstFix(int i) {
            this.mCallback.onFirstFix(i);
        }

        @Override // android.location.GnssStatus.Callback
        public void onSatelliteStatusChanged(GnssStatus gnssStatus) {
            this.mCallback.onSatelliteStatusChanged(GnssStatusCompat.wrap(gnssStatus));
        }

        @Override // android.location.GnssStatus.Callback
        public void onStarted() {
            this.mCallback.onStarted();
        }

        @Override // android.location.GnssStatus.Callback
        public void onStopped() {
            this.mCallback.onStopped();
        }
    }

    public static class GpsStatusTransport implements GpsStatus.Listener {
        final GnssStatusCompat.Callback mCallback;

        @Nullable
        volatile Executor mExecutor;
        private final LocationManager mLocationManager;

        public GpsStatusTransport(LocationManager locationManager, GnssStatusCompat.Callback callback) {
            Preconditions.checkArgument(callback != null, "invalid null callback");
            this.mLocationManager = locationManager;
            this.mCallback = callback;
        }

        @Override // android.location.GpsStatus.Listener
        @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
        public void onGpsStatusChanged(int i) {
            Runnable runnable;
            Runnable runnable2;
            GpsStatus gpsStatus;
            final Executor executor = this.mExecutor;
            if (executor == null) {
                return;
            }
            if (i == 1) {
                runnable = new Runnable() { // from class: androidx.core.location.LocationManagerCompat.GpsStatusTransport.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (GpsStatusTransport.this.mExecutor != executor) {
                            return;
                        }
                        GpsStatusTransport.this.mCallback.onStarted();
                    }
                };
            } else {
                if (i != 2) {
                    if (i == 3) {
                        GpsStatus gpsStatus2 = this.mLocationManager.getGpsStatus(null);
                        if (gpsStatus2 == null) {
                            return;
                        }
                        final int timeToFirstFix = gpsStatus2.getTimeToFirstFix();
                        runnable2 = new Runnable() { // from class: androidx.core.location.LocationManagerCompat.GpsStatusTransport.3
                            @Override // java.lang.Runnable
                            public void run() {
                                if (GpsStatusTransport.this.mExecutor != executor) {
                                    return;
                                }
                                GpsStatusTransport.this.mCallback.onFirstFix(timeToFirstFix);
                            }
                        };
                    } else {
                        if (i != 4 || (gpsStatus = this.mLocationManager.getGpsStatus(null)) == null) {
                            return;
                        }
                        final GnssStatusCompat gnssStatusCompatWrap = GnssStatusCompat.wrap(gpsStatus);
                        runnable2 = new Runnable() { // from class: androidx.core.location.LocationManagerCompat.GpsStatusTransport.4
                            @Override // java.lang.Runnable
                            public void run() {
                                if (GpsStatusTransport.this.mExecutor != executor) {
                                    return;
                                }
                                GpsStatusTransport.this.mCallback.onSatelliteStatusChanged(gnssStatusCompatWrap);
                            }
                        };
                    }
                    executor.execute(runnable2);
                    return;
                }
                runnable = new Runnable() { // from class: androidx.core.location.LocationManagerCompat.GpsStatusTransport.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (GpsStatusTransport.this.mExecutor != executor) {
                            return;
                        }
                        GpsStatusTransport.this.mCallback.onStopped();
                    }
                };
            }
            executor.execute(runnable);
        }

        public void register(Executor executor) {
            Preconditions.checkState(this.mExecutor == null);
            this.mExecutor = executor;
        }

        public void unregister() {
            this.mExecutor = null;
        }
    }

    public static class InlineHandlerExecutor implements Executor {
        private final Handler mHandler;

        public InlineHandlerExecutor(@NonNull Handler handler) {
            this.mHandler = (Handler) Preconditions.checkNotNull(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            if (Looper.myLooper() == this.mHandler.getLooper()) {
                runnable.run();
            } else {
                if (this.mHandler.post((Runnable) Preconditions.checkNotNull(runnable))) {
                    return;
                }
                throw new RejectedExecutionException(this.mHandler + " is shutting down");
            }
        }
    }

    @RequiresApi(24)
    public static class PreRGnssStatusTransport extends GnssStatus.Callback {
        final GnssStatusCompat.Callback mCallback;

        @Nullable
        volatile Executor mExecutor;

        public PreRGnssStatusTransport(GnssStatusCompat.Callback callback) {
            Preconditions.checkArgument(callback != null, "invalid null callback");
            this.mCallback = callback;
        }

        @Override // android.location.GnssStatus.Callback
        public void onFirstFix(final int i) {
            final Executor executor = this.mExecutor;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: androidx.core.location.LocationManagerCompat.PreRGnssStatusTransport.3
                @Override // java.lang.Runnable
                public void run() {
                    if (PreRGnssStatusTransport.this.mExecutor != executor) {
                        return;
                    }
                    PreRGnssStatusTransport.this.mCallback.onFirstFix(i);
                }
            });
        }

        @Override // android.location.GnssStatus.Callback
        public void onSatelliteStatusChanged(final GnssStatus gnssStatus) {
            final Executor executor = this.mExecutor;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: androidx.core.location.LocationManagerCompat.PreRGnssStatusTransport.4
                @Override // java.lang.Runnable
                public void run() {
                    if (PreRGnssStatusTransport.this.mExecutor != executor) {
                        return;
                    }
                    PreRGnssStatusTransport.this.mCallback.onSatelliteStatusChanged(GnssStatusCompat.wrap(gnssStatus));
                }
            });
        }

        @Override // android.location.GnssStatus.Callback
        public void onStarted() {
            final Executor executor = this.mExecutor;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: androidx.core.location.LocationManagerCompat.PreRGnssStatusTransport.1
                @Override // java.lang.Runnable
                public void run() {
                    if (PreRGnssStatusTransport.this.mExecutor != executor) {
                        return;
                    }
                    PreRGnssStatusTransport.this.mCallback.onStarted();
                }
            });
        }

        @Override // android.location.GnssStatus.Callback
        public void onStopped() {
            final Executor executor = this.mExecutor;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: androidx.core.location.LocationManagerCompat.PreRGnssStatusTransport.2
                @Override // java.lang.Runnable
                public void run() {
                    if (PreRGnssStatusTransport.this.mExecutor != executor) {
                        return;
                    }
                    PreRGnssStatusTransport.this.mCallback.onStopped();
                }
            });
        }

        public void register(Executor executor) {
            Preconditions.checkArgument(executor != null, "invalid null executor");
            Preconditions.checkState(this.mExecutor == null);
            this.mExecutor = executor;
        }

        public void unregister() {
            this.mExecutor = null;
        }
    }

    private LocationManagerCompat() {
    }

    public static boolean isLocationEnabled(@NonNull LocationManager locationManager) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return Api28Impl.isLocationEnabled(locationManager);
        }
        if (i <= 19) {
            try {
                if (sContextField == null) {
                    sContextField = LocationManager.class.getDeclaredField("mContext");
                }
                sContextField.setAccessible(true);
                Context context = (Context) sContextField.get(locationManager);
                if (i == 19) {
                    return Settings.Secure.getInt(context.getContentResolver(), "location_mode", 0) != 0;
                }
                return !TextUtils.isEmpty(Settings.Secure.getString(context.getContentResolver(), "location_providers_allowed"));
            } catch (ClassCastException | IllegalAccessException | NoSuchFieldException | SecurityException unused) {
            }
        }
        return locationManager.isProviderEnabled("network") || locationManager.isProviderEnabled("gps");
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0129 A[Catch: all -> 0x00ef, TryCatch #3 {all -> 0x00ef, blocks: (B:58:0x009e, B:91:0x00f5, B:92:0x010b, B:93:0x010c, B:95:0x0114, B:97:0x011c, B:98:0x0122, B:99:0x0123, B:100:0x0128, B:101:0x0129, B:102:0x012f), top: B:113:0x009e }] */
    /* JADX WARN: Code duplicated, block: B:104:0x0132 A[Catch: all -> 0x0077, TRY_ENTER, TryCatch #5 {all -> 0x0077, blocks: (B:47:0x0069, B:49:0x0071, B:53:0x007d, B:55:0x0094, B:64:0x00c1, B:65:0x00c8, B:74:0x00d5, B:75:0x00dc, B:104:0x0132, B:105:0x0139, B:56:0x0098, B:106:0x013a, B:107:0x0150, B:52:0x007a), top: B:114:0x0069 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0114 A[Catch: all -> 0x00ef, TryCatch #3 {all -> 0x00ef, blocks: (B:58:0x009e, B:91:0x00f5, B:92:0x010b, B:93:0x010c, B:95:0x0114, B:97:0x011c, B:98:0x0122, B:99:0x0123, B:100:0x0128, B:101:0x0129, B:102:0x012f), top: B:113:0x009e }] */
    /* JADX WARN: Code duplicated, block: B:97:0x011c A[Catch: all -> 0x00ef, TryCatch #3 {all -> 0x00ef, blocks: (B:58:0x009e, B:91:0x00f5, B:92:0x010b, B:93:0x010c, B:95:0x0114, B:97:0x011c, B:98:0x0122, B:99:0x0123, B:100:0x0128, B:101:0x0129, B:102:0x012f), top: B:113:0x009e }] */
    /* JADX WARN: Code duplicated, block: B:99:0x0123 A[Catch: all -> 0x00ef, TryCatch #3 {all -> 0x00ef, blocks: (B:58:0x009e, B:91:0x00f5, B:92:0x010b, B:93:0x010c, B:95:0x0114, B:97:0x011c, B:98:0x0122, B:99:0x0123, B:100:0x0128, B:101:0x0129, B:102:0x012f), top: B:113:0x009e }] */
    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    private static boolean registerGnssStatusCallback(final LocationManager locationManager, Handler handler, Executor executor, GnssStatusCompat.Callback callback) {
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        if (i >= 30) {
            SimpleArrayMap<Object, Object> simpleArrayMap = sGnssStatusListeners;
            synchronized (simpleArrayMap) {
                try {
                    GnssStatusTransport gnssStatusTransport = (GnssStatusTransport) simpleArrayMap.get(callback);
                    if (gnssStatusTransport == null) {
                        gnssStatusTransport = new GnssStatusTransport(callback);
                    }
                    if (!C5335rw.m28010a(locationManager, executor, gnssStatusTransport)) {
                        return false;
                    }
                    simpleArrayMap.put(callback, gnssStatusTransport);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (i >= 24) {
            Preconditions.checkArgument(handler != null);
            SimpleArrayMap<Object, Object> simpleArrayMap2 = sGnssStatusListeners;
            synchronized (simpleArrayMap2) {
                try {
                    PreRGnssStatusTransport preRGnssStatusTransport = (PreRGnssStatusTransport) simpleArrayMap2.get(callback);
                    if (preRGnssStatusTransport == null) {
                        preRGnssStatusTransport = new PreRGnssStatusTransport(callback);
                    } else {
                        preRGnssStatusTransport.unregister();
                    }
                    preRGnssStatusTransport.register(executor);
                    if (!C5406sw.m28311a(locationManager, preRGnssStatusTransport, handler)) {
                        return false;
                    }
                    simpleArrayMap2.put(callback, preRGnssStatusTransport);
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        Preconditions.checkArgument(handler != null);
        SimpleArrayMap<Object, Object> simpleArrayMap3 = sGnssStatusListeners;
        synchronized (simpleArrayMap3) {
            try {
                final GpsStatusTransport gpsStatusTransport = (GpsStatusTransport) simpleArrayMap3.get(callback);
                if (gpsStatusTransport == null) {
                    gpsStatusTransport = new GpsStatusTransport(locationManager, callback);
                } else {
                    gpsStatusTransport.unregister();
                }
                gpsStatusTransport.register(executor);
                FutureTask futureTask = new FutureTask(new Callable<Boolean>() { // from class: androidx.core.location.LocationManagerCompat.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // java.util.concurrent.Callable
                    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
                    public Boolean call() {
                        return Boolean.valueOf(locationManager.addGpsStatusListener(gpsStatusTransport));
                    }
                });
                if (Looper.myLooper() == handler.getLooper()) {
                    futureTask.run();
                } else if (!handler.post(futureTask)) {
                    throw new IllegalStateException(handler + " is shutting down");
                }
                try {
                    try {
                        long nanos = TimeUnit.SECONDS.toNanos(4L);
                        long jNanoTime = System.nanoTime() + nanos;
                        boolean z2 = false;
                        while (((Boolean) futureTask.get(nanos, TimeUnit.NANOSECONDS)).booleanValue()) {
                            try {
                                try {
                                    sGnssStatusListeners.put(callback, gpsStatusTransport);
                                    if (z2) {
                                        Thread.currentThread().interrupt();
                                    }
                                    return true;
                                } catch (ExecutionException e) {
                                    e = e;
                                    if (!(e.getCause() instanceof RuntimeException)) {
                                        throw ((RuntimeException) e.getCause());
                                    }
                                    if (e.getCause() instanceof Error) {
                                        throw ((Error) e.getCause());
                                    }
                                    throw new IllegalStateException(e);
                                } catch (TimeoutException e2) {
                                    e = e2;
                                    throw new IllegalStateException(handler + " appears to be blocked, please run registerGnssStatusCallback() directly on a Looper thread or ensure the main Looper is not blocked by this thread", e);
                                } catch (Throwable th3) {
                                    th = th3;
                                    z = true;
                                    if (z) {
                                        Thread.currentThread().interrupt();
                                    }
                                    throw th;
                                }
                            } catch (InterruptedException unused) {
                                nanos = jNanoTime - System.nanoTime();
                                z2 = true;
                            } catch (ExecutionException e3) {
                                e = e3;
                                if (!(e.getCause() instanceof RuntimeException)) {
                                    throw ((RuntimeException) e.getCause());
                                }
                                if (e.getCause() instanceof Error) {
                                    throw ((Error) e.getCause());
                                }
                                throw new IllegalStateException(e);
                            } catch (TimeoutException e4) {
                                e = e4;
                                throw new IllegalStateException(handler + " appears to be blocked, please run registerGnssStatusCallback() directly on a Looper thread or ensure the main Looper is not blocked by this thread", e);
                            } catch (Throwable th4) {
                                th = th4;
                                z = z2;
                                if (z) {
                                    Thread.currentThread().interrupt();
                                }
                                throw th;
                            }
                        }
                        if (z2) {
                            Thread.currentThread().interrupt();
                        }
                        return false;
                    } catch (Throwable th5) {
                        th = th5;
                    }
                } catch (ExecutionException e5) {
                    e = e5;
                } catch (TimeoutException e6) {
                    e = e6;
                }
            } catch (Throwable th6) {
                throw th6;
            }
        }
    }

    public static void unregisterGnssStatusCallback(@NonNull LocationManager locationManager, @NonNull GnssStatusCompat.Callback callback) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            SimpleArrayMap<Object, Object> simpleArrayMap = sGnssStatusListeners;
            synchronized (simpleArrayMap) {
                try {
                    GnssStatusTransport gnssStatusTransport = (GnssStatusTransport) simpleArrayMap.remove(callback);
                    if (gnssStatusTransport != null) {
                        C5272qw.m27767a(locationManager, gnssStatusTransport);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        if (i >= 24) {
            SimpleArrayMap<Object, Object> simpleArrayMap2 = sGnssStatusListeners;
            synchronized (simpleArrayMap2) {
                try {
                    PreRGnssStatusTransport preRGnssStatusTransport = (PreRGnssStatusTransport) simpleArrayMap2.remove(callback);
                    if (preRGnssStatusTransport != null) {
                        preRGnssStatusTransport.unregister();
                        C5272qw.m27767a(locationManager, preRGnssStatusTransport);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return;
        }
        SimpleArrayMap<Object, Object> simpleArrayMap3 = sGnssStatusListeners;
        synchronized (simpleArrayMap3) {
            try {
                GpsStatusTransport gpsStatusTransport = (GpsStatusTransport) simpleArrayMap3.remove(callback);
                if (gpsStatusTransport != null) {
                    gpsStatusTransport.unregister();
                    locationManager.removeGpsStatusListener(gpsStatusTransport);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    public static boolean registerGnssStatusCallback(@NonNull LocationManager locationManager, @NonNull GnssStatusCompat.Callback callback, @NonNull Handler handler) {
        return Build.VERSION.SDK_INT >= 30 ? registerGnssStatusCallback(locationManager, ExecutorCompat.create(handler), callback) : registerGnssStatusCallback(locationManager, new InlineHandlerExecutor(handler), callback);
    }

    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    public static boolean registerGnssStatusCallback(@NonNull LocationManager locationManager, @NonNull Executor executor, @NonNull GnssStatusCompat.Callback callback) {
        if (Build.VERSION.SDK_INT >= 30) {
            return registerGnssStatusCallback(locationManager, null, executor, callback);
        }
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        return registerGnssStatusCallback(locationManager, new Handler(looperMyLooper), executor, callback);
    }
}
