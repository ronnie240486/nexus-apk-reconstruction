package android.support.v4.media.session;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.AudioAttributes;
import android.media.MediaDescription;
import android.media.Rating;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000.C0014AB;
import p000.C0078BB;
import p000.C0150CB;
import p000.C0214DB;
import p000.C0278EB;
import p000.C0531IB;
import p000.C0594JB;
import p000.C0659KB;
import p000.C0725LB;
import p000.C0787MB;
import p000.C0913OA;
import p000.C4722lB;
import p000.C4856nB;
import p000.C4921oB;
import p000.C5162pB;
import p000.C5225qB;
import p000.C5288rB;
import p000.C5359sB;
import p000.C5422tB;
import p000.C5504uB;
import p000.C5575vB;
import p000.C5639wB;
import p000.C5706xB;
import p000.C5771yB;
import p000.C5841zB;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
class MediaSessionCompatApi21 {
    static final String TAG = "MediaSessionCompatApi21";

    public interface Callback {
        void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver);

        void onCustomAction(String str, Bundle bundle);

        void onFastForward();

        boolean onMediaButtonEvent(Intent intent);

        void onPause();

        void onPlay();

        void onPlayFromMediaId(String str, Bundle bundle);

        void onPlayFromSearch(String str, Bundle bundle);

        void onRewind();

        void onSeekTo(long j);

        void onSetRating(Object obj);

        void onSetRating(Object obj, Bundle bundle);

        void onSkipToNext();

        void onSkipToPrevious();

        void onSkipToQueueItem(long j);

        void onStop();
    }

    public static class CallbackProxy<T extends Callback> extends MediaSession.Callback {
        protected final T mCallback;

        public CallbackProxy(T t) {
            this.mCallback = t;
        }

        @Override // android.media.session.MediaSession.Callback
        public void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
            MediaSessionCompat.ensureClassLoader(bundle);
            this.mCallback.onCommand(str, bundle, resultReceiver);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onCustomAction(String str, Bundle bundle) {
            MediaSessionCompat.ensureClassLoader(bundle);
            this.mCallback.onCustomAction(str, bundle);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onFastForward() {
            this.mCallback.onFastForward();
        }

        @Override // android.media.session.MediaSession.Callback
        public boolean onMediaButtonEvent(Intent intent) {
            return this.mCallback.onMediaButtonEvent(intent) || super.onMediaButtonEvent(intent);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onPause() {
            this.mCallback.onPause();
        }

        @Override // android.media.session.MediaSession.Callback
        public void onPlay() {
            this.mCallback.onPlay();
        }

        @Override // android.media.session.MediaSession.Callback
        public void onPlayFromMediaId(String str, Bundle bundle) {
            MediaSessionCompat.ensureClassLoader(bundle);
            this.mCallback.onPlayFromMediaId(str, bundle);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onPlayFromSearch(String str, Bundle bundle) {
            MediaSessionCompat.ensureClassLoader(bundle);
            this.mCallback.onPlayFromSearch(str, bundle);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onRewind() {
            this.mCallback.onRewind();
        }

        @Override // android.media.session.MediaSession.Callback
        public void onSeekTo(long j) {
            this.mCallback.onSeekTo(j);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onSetRating(Rating rating) {
            this.mCallback.onSetRating(rating);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onSkipToNext() {
            this.mCallback.onSkipToNext();
        }

        @Override // android.media.session.MediaSession.Callback
        public void onSkipToPrevious() {
            this.mCallback.onSkipToPrevious();
        }

        @Override // android.media.session.MediaSession.Callback
        public void onSkipToQueueItem(long j) {
            this.mCallback.onSkipToQueueItem(j);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onStop() {
            this.mCallback.onStop();
        }
    }

    public static class QueueItem {
        private QueueItem() {
        }

        public static Object createItem(Object obj, long j) {
            return new MediaSession.QueueItem((MediaDescription) obj, j);
        }

        public static Object getDescription(Object obj) {
            return C0787MB.m3669a(C0214DB.m1323a(obj));
        }

        public static long getQueueId(Object obj) {
            return C0725LB.m3429a(C0214DB.m1323a(obj));
        }
    }

    private MediaSessionCompatApi21() {
    }

    public static Object createCallback(Callback callback) {
        return new CallbackProxy(callback);
    }

    public static Object createSession(Context context, String str) {
        return new MediaSession(context, str);
    }

    public static Parcelable getSessionToken(Object obj) {
        return C5359sB.m28126a(C4722lB.m21922a(obj));
    }

    public static boolean hasCallback(Object obj) {
        try {
            Field declaredField = obj.getClass().getDeclaredField("mCallback");
            if (declaredField != null) {
                declaredField.setAccessible(true);
                return declaredField.get(obj) != null;
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            Log.w(TAG, "Failed to get mCallback object.");
        }
        return false;
    }

    public static boolean isActive(Object obj) {
        return C0078BB.m470a(C4722lB.m21922a(obj));
    }

    public static void release(Object obj) {
        C5225qB.m27626a(C4722lB.m21922a(obj));
    }

    public static void sendSessionEvent(Object obj, String str, Bundle bundle) {
        C0014AB.m102a(C4722lB.m21922a(obj), str, bundle);
    }

    public static void setActive(Object obj, boolean z) {
        C0659KB.m3122a(C4722lB.m21922a(obj), z);
    }

    public static void setCallback(Object obj, Object obj2, Handler handler) {
        C5706xB.m29452a(C4722lB.m21922a(obj), C5639wB.m29224a(obj2), handler);
    }

    public static void setExtras(Object obj, Bundle bundle) {
        C5422tB.m28370a(C4722lB.m21922a(obj), bundle);
    }

    public static void setFlags(Object obj, int i) {
        C5162pB.m27412a(C4722lB.m21922a(obj), i);
    }

    public static void setMediaButtonReceiver(Object obj, PendingIntent pendingIntent) {
        C0150CB.m926a(C4722lB.m21922a(obj), pendingIntent);
    }

    public static void setMetadata(Object obj, Object obj2) {
        C4921oB.m22609a(C4722lB.m21922a(obj), C0913OA.m4231a(obj2));
    }

    public static void setPlaybackState(Object obj, Object obj2) {
        C0594JB.m2917a(C4722lB.m21922a(obj), C0531IB.m2507a(obj2));
    }

    public static void setPlaybackToLocal(Object obj, int i) {
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        builder.setLegacyStreamType(i);
        ((MediaSession) obj).setPlaybackToLocal(builder.build());
    }

    public static void setPlaybackToRemote(Object obj, Object obj2) {
        C5575vB.m28791a(C4722lB.m21922a(obj), C5504uB.m28589a(obj2));
    }

    public static void setQueue(Object obj, List<Object> list) {
        if (list == null) {
            C5771yB.m29771a(C4722lB.m21922a(obj), null);
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Object> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C0214DB.m1323a(it.next()));
        }
        C5771yB.m29771a(C4722lB.m21922a(obj), arrayList);
    }

    public static void setQueueTitle(Object obj, CharSequence charSequence) {
        C0278EB.m1540a(C4722lB.m21922a(obj), charSequence);
    }

    public static void setSessionActivity(Object obj, PendingIntent pendingIntent) {
        C4856nB.m22312a(C4722lB.m21922a(obj), pendingIntent);
    }

    public static Object verifySession(Object obj) {
        if (C5841zB.m29957a(obj)) {
            return obj;
        }
        throw new IllegalArgumentException("mediaSession is not a valid MediaSession object");
    }

    public static Object verifyToken(Object obj) {
        if (C5288rB.m27800a(obj)) {
            return obj;
        }
        throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
    }
}
