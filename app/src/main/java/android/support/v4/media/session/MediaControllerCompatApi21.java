package android.support.v4.media.session;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.view.KeyEvent;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.List;
import p000.C0064Az;
import p000.C0128Bz;
import p000.C0200Cz;
import p000.C0264Dz;
import p000.C0328Ez;
import p000.C0391Fz;
import p000.C0454Gz;
import p000.C0518Hz;
import p000.C0581Iz;
import p000.C0644Jz;
import p000.C0774Lz;
import p000.C0837Mz;
import p000.C0900Nz;
import p000.C0964Oz;
import p000.C1030Pz;
import p000.C1095Qz;
import p000.C1157Rz;
import p000.C1220Sz;
import p000.C1285Tz;
import p000.C1349Uz;
import p000.C1417Vz;
import p000.C1481Wz;
import p000.C1544Xz;
import p000.C1607Yz;
import p000.C1675Zz;
import p000.C1690aA;
import p000.C2957bA;
import p000.C3020cA;
import p000.C4204dA;
import p000.C4270eA;
import p000.C4333fA;
import p000.C4397gA;
import p000.C4460hA;
import p000.C4523iA;
import p000.C4594jA;
import p000.C4658kA;
import p000.C4721lA;
import p000.C5491tz;
import p000.C5554uz;
import p000.C5625vz;
import p000.C5689wz;
import p000.C5756xz;
import p000.C5821yz;
import p000.C5891zz;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
class MediaControllerCompatApi21 {

    public interface Callback {
        void onAudioInfoChanged(int i, int i2, int i3, int i4, int i5);

        void onExtrasChanged(Bundle bundle);

        void onMetadataChanged(Object obj);

        void onPlaybackStateChanged(Object obj);

        void onQueueChanged(List<?> list);

        void onQueueTitleChanged(CharSequence charSequence);

        void onSessionDestroyed();

        void onSessionEvent(String str, Bundle bundle);
    }

    public static class CallbackProxy<T extends Callback> extends MediaController.Callback {
        protected final T mCallback;

        public CallbackProxy(T t) {
            this.mCallback = t;
        }

        @Override // android.media.session.MediaController.Callback
        public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
            this.mCallback.onAudioInfoChanged(C1095Qz.m4881a(playbackInfo), PlaybackInfo.getLegacyAudioStream(playbackInfo), C1157Rz.m5417a(playbackInfo), C1220Sz.m5735a(playbackInfo), C1285Tz.m6148a(playbackInfo));
        }

        @Override // android.media.session.MediaController.Callback
        public void onExtrasChanged(Bundle bundle) {
            MediaSessionCompat.ensureClassLoader(bundle);
            this.mCallback.onExtrasChanged(bundle);
        }

        @Override // android.media.session.MediaController.Callback
        public void onMetadataChanged(MediaMetadata mediaMetadata) {
            this.mCallback.onMetadataChanged(mediaMetadata);
        }

        @Override // android.media.session.MediaController.Callback
        public void onPlaybackStateChanged(PlaybackState playbackState) {
            this.mCallback.onPlaybackStateChanged(playbackState);
        }

        @Override // android.media.session.MediaController.Callback
        public void onQueueChanged(List<MediaSession.QueueItem> list) {
            this.mCallback.onQueueChanged(list);
        }

        @Override // android.media.session.MediaController.Callback
        public void onQueueTitleChanged(CharSequence charSequence) {
            this.mCallback.onQueueTitleChanged(charSequence);
        }

        @Override // android.media.session.MediaController.Callback
        public void onSessionDestroyed() {
            this.mCallback.onSessionDestroyed();
        }

        @Override // android.media.session.MediaController.Callback
        public void onSessionEvent(String str, Bundle bundle) {
            MediaSessionCompat.ensureClassLoader(bundle);
            this.mCallback.onSessionEvent(str, bundle);
        }
    }

    public static class PlaybackInfo {
        private static final int FLAG_SCO = 4;
        private static final int STREAM_BLUETOOTH_SCO = 6;
        private static final int STREAM_SYSTEM_ENFORCED = 7;

        private PlaybackInfo() {
        }

        public static AudioAttributes getAudioAttributes(Object obj) {
            return C1544Xz.m8031a(C1349Uz.m6432a(obj));
        }

        public static int getCurrentVolume(Object obj) {
            return C1285Tz.m6148a(C1349Uz.m6432a(obj));
        }

        public static int getLegacyAudioStream(Object obj) {
            return toLegacyStreamType(getAudioAttributes(obj));
        }

        public static int getMaxVolume(Object obj) {
            return C1220Sz.m5735a(C1349Uz.m6432a(obj));
        }

        public static int getPlaybackType(Object obj) {
            return C1095Qz.m4881a(C1349Uz.m6432a(obj));
        }

        public static int getVolumeControl(Object obj) {
            return C1157Rz.m5417a(C1349Uz.m6432a(obj));
        }

        private static int toLegacyStreamType(AudioAttributes audioAttributes) {
            if ((C1417Vz.m6662a(audioAttributes) & 1) == 1) {
                return 7;
            }
            if ((C1417Vz.m6662a(audioAttributes) & 4) == 4) {
                return 6;
            }
            int iM6947a = C1481Wz.m6947a(audioAttributes);
            if (iM6947a == 13) {
                return 1;
            }
            switch (iM6947a) {
                case 2:
                    return 0;
                case 3:
                    return 8;
                case 4:
                    return 4;
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                    return 5;
                case 6:
                    return 2;
                default:
                    return 3;
            }
        }
    }

    public static class TransportControls {
        private TransportControls() {
        }

        public static void fastForward(Object obj) {
            C4270eA.m20047a(C1607Yz.m8260a(obj));
        }

        public static void pause(Object obj) {
            C4594jA.m21532a(C1607Yz.m8260a(obj));
        }

        public static void play(Object obj) {
            C4204dA.m19884a(C1607Yz.m8260a(obj));
        }

        public static void playFromMediaId(Object obj, String str, Bundle bundle) {
            C4721lA.m21921a(C1607Yz.m8260a(obj), str, bundle);
        }

        public static void playFromSearch(Object obj, String str, Bundle bundle) {
            C1690aA.m8898a(C1607Yz.m8260a(obj), str, bundle);
        }

        public static void rewind(Object obj) {
            C1675Zz.m8831a(C1607Yz.m8260a(obj));
        }

        public static void seekTo(Object obj, long j) {
            C4658kA.m21754a(C1607Yz.m8260a(obj), j);
        }

        public static void sendCustomAction(Object obj, String str, Bundle bundle) {
            C3020cA.m16450a(C1607Yz.m8260a(obj), str, bundle);
        }

        public static void setRating(Object obj, Object obj2) {
            C4333fA.m20298a(C1607Yz.m8260a(obj), (Rating) obj2);
        }

        public static void skipToNext(Object obj) {
            C4523iA.m21335a(C1607Yz.m8260a(obj));
        }

        public static void skipToPrevious(Object obj) {
            C4397gA.m20733a(C1607Yz.m8260a(obj));
        }

        public static void skipToQueueItem(Object obj, long j) {
            C2957bA.m14602a(C1607Yz.m8260a(obj), j);
        }

        public static void stop(Object obj) {
            C4460hA.m20974a(C1607Yz.m8260a(obj));
        }
    }

    private MediaControllerCompatApi21() {
    }

    public static void adjustVolume(Object obj, int i, int i2) {
        C0454Gz.m2227a(C5491tz.m28558a(obj), i, i2);
    }

    public static Object createCallback(Callback callback) {
        return new CallbackProxy(callback);
    }

    public static boolean dispatchMediaButtonEvent(Object obj, KeyEvent keyEvent) {
        return C0200Cz.m1192a(C5491tz.m28558a(obj), keyEvent);
    }

    public static Object fromToken(Context context, Object obj) {
        return new MediaController(context, (MediaSession.Token) obj);
    }

    public static Bundle getExtras(Object obj) {
        return C5554uz.m28738a(C5491tz.m28558a(obj));
    }

    public static long getFlags(Object obj) {
        return C5625vz.m29202a(C5491tz.m28558a(obj));
    }

    public static Object getMediaController(Activity activity) {
        return C5891zz.m30206a(activity);
    }

    public static Object getMetadata(Object obj) {
        return C0644Jz.m3049a(C5491tz.m28558a(obj));
    }

    public static String getPackageName(Object obj) {
        return C0128Bz.m820a(C5491tz.m28558a(obj));
    }

    public static Object getPlaybackInfo(Object obj) {
        return C0581Iz.m2887a(C5491tz.m28558a(obj));
    }

    public static Object getPlaybackState(Object obj) {
        return C0774Lz.m3636a(C5491tz.m28558a(obj));
    }

    public static List<Object> getQueue(Object obj) {
        List listM29355a = C5689wz.m29355a(C5491tz.m28558a(obj));
        if (listM29355a == null) {
            return null;
        }
        return new ArrayList(listM29355a);
    }

    public static CharSequence getQueueTitle(Object obj) {
        return C0328Ez.m1721a(C5491tz.m28558a(obj));
    }

    public static int getRatingType(Object obj) {
        return C5821yz.m29916a(C5491tz.m28558a(obj));
    }

    public static PendingIntent getSessionActivity(Object obj) {
        return C0064Az.m407a(C5491tz.m28558a(obj));
    }

    public static Object getSessionToken(Object obj) {
        return C5756xz.m29715a(C5491tz.m28558a(obj));
    }

    public static Object getTransportControls(Object obj) {
        return C0518Hz.m2439a(C5491tz.m28558a(obj));
    }

    public static void registerCallback(Object obj, Object obj2, Handler handler) {
        C0900Nz.m4071a(C5491tz.m28558a(obj), C0837Mz.m3904a(obj2), handler);
    }

    public static void sendCommand(Object obj, String str, Bundle bundle, ResultReceiver resultReceiver) {
        C0391Fz.m1971a(C5491tz.m28558a(obj), str, bundle, resultReceiver);
    }

    public static void setMediaController(Activity activity, Object obj) {
        C1030Pz.m4572a(activity, C5491tz.m28558a(obj));
    }

    public static void setVolumeTo(Object obj, int i, int i2) {
        C0264Dz.m1497a(C5491tz.m28558a(obj), i, i2);
    }

    public static void unregisterCallback(Object obj, Object obj2) {
        C0964Oz.m4350a(C5491tz.m28558a(obj), C0837Mz.m3904a(obj2));
    }
}
