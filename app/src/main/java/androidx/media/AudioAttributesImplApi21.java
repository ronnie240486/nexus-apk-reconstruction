package androidx.media;

import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p000.C1417Vz;
import p000.C1481Wz;
import p000.C5219q5;
import p000.C5353s5;
import p000.C5416t5;
import p000.C5498u5;
import p000.C5569v5;
import p000.C5633w5;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class AudioAttributesImplApi21 implements AudioAttributesImpl {
    private static final String TAG = "AudioAttributesCompat21";
    static Method sAudioAttributesToLegacyStreamType;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public AudioAttributes mAudioAttributes;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int mLegacyStreamType;

    public AudioAttributesImplApi21() {
        this.mLegacyStreamType = -1;
    }

    public static AudioAttributesImpl fromBundle(Bundle bundle) {
        AudioAttributes audioAttributesM27591a;
        if (bundle == null || (audioAttributesM27591a = C5219q5.m27591a(bundle.getParcelable("androidx.media.audio_attrs.FRAMEWORKS"))) == null) {
            return null;
        }
        return new AudioAttributesImplApi21(audioAttributesM27591a, bundle.getInt("androidx.media.audio_attrs.LEGACY_STREAM_TYPE", -1));
    }

    public static Method getAudioAttributesToLegacyStreamTypeMethod() {
        try {
            if (sAudioAttributesToLegacyStreamType == null) {
                sAudioAttributesToLegacyStreamType = C5353s5.m28116a().getMethod("toLegacyStreamType", C5353s5.m28116a());
            }
            return sAudioAttributesToLegacyStreamType;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return C5569v5.m28757a(this.mAudioAttributes, ((AudioAttributesImplApi21) obj).mAudioAttributes);
        }
        return false;
    }

    @Override // androidx.media.AudioAttributesImpl
    public Object getAudioAttributes() {
        return this.mAudioAttributes;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getContentType() {
        return C5498u5.m28569a(this.mAudioAttributes);
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getFlags() {
        return C1417Vz.m6662a(this.mAudioAttributes);
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getLegacyStreamType() {
        int i = this.mLegacyStreamType;
        if (i != -1) {
            return i;
        }
        Method audioAttributesToLegacyStreamTypeMethod = getAudioAttributesToLegacyStreamTypeMethod();
        if (audioAttributesToLegacyStreamTypeMethod == null) {
            Log.w(TAG, "No AudioAttributes#toLegacyStreamType() on API: " + Build.VERSION.SDK_INT);
            return -1;
        }
        try {
            return ((Integer) audioAttributesToLegacyStreamTypeMethod.invoke(null, this.mAudioAttributes)).intValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            Log.w(TAG, "getLegacyStreamType() failed on API: " + Build.VERSION.SDK_INT, e);
            return -1;
        }
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getRawLegacyStreamType() {
        return this.mLegacyStreamType;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getUsage() {
        return C1481Wz.m6947a(this.mAudioAttributes);
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getVolumeControlStream() {
        return Build.VERSION.SDK_INT >= 26 ? C5633w5.m29220a(this.mAudioAttributes) : AudioAttributesCompat.toVolumeStreamType(true, getFlags(), getUsage());
    }

    public int hashCode() {
        return C5416t5.m28364a(this.mAudioAttributes);
    }

    @Override // androidx.media.AudioAttributesImpl
    @NonNull
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("androidx.media.audio_attrs.FRAMEWORKS", this.mAudioAttributes);
        int i = this.mLegacyStreamType;
        if (i != -1) {
            bundle.putInt("androidx.media.audio_attrs.LEGACY_STREAM_TYPE", i);
        }
        return bundle;
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.mAudioAttributes;
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this(audioAttributes, -1);
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes, int i) {
        this.mAudioAttributes = audioAttributes;
        this.mLegacyStreamType = i;
    }
}
