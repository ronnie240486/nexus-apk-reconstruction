package com.google.android.exoplayer2.audio;

import android.annotation.TargetApi;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Util;
import p000.C5156p5;

/* JADX INFO: loaded from: classes2.dex */
public final class AudioAttributes {
    public static final AudioAttributes DEFAULT = new Builder().build();
    public final int allowedCapturePolicy;

    @Nullable
    private android.media.AudioAttributes audioAttributesV21;
    public final int contentType;
    public final int flags;
    public final int usage;

    public static final class Builder {
        private int contentType = 0;
        private int flags = 0;
        private int usage = 1;
        private int allowedCapturePolicy = 1;

        public AudioAttributes build() {
            return new AudioAttributes(this.contentType, this.flags, this.usage, this.allowedCapturePolicy);
        }

        public Builder setAllowedCapturePolicy(int i) {
            this.allowedCapturePolicy = i;
            return this;
        }

        public Builder setContentType(int i) {
            this.contentType = i;
            return this;
        }

        public Builder setFlags(int i) {
            this.flags = i;
            return this;
        }

        public Builder setUsage(int i) {
            this.usage = i;
            return this;
        }
    }

    private AudioAttributes(int i, int i2, int i3, int i4) {
        this.contentType = i;
        this.flags = i2;
        this.usage = i3;
        this.allowedCapturePolicy = i4;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AudioAttributes.class != obj.getClass()) {
            return false;
        }
        AudioAttributes audioAttributes = (AudioAttributes) obj;
        return this.contentType == audioAttributes.contentType && this.flags == audioAttributes.flags && this.usage == audioAttributes.usage && this.allowedCapturePolicy == audioAttributes.allowedCapturePolicy;
    }

    @TargetApi(21)
    public android.media.AudioAttributes getAudioAttributesV21() {
        if (this.audioAttributesV21 == null) {
            android.media.AudioAttributes.Builder usage = new android.media.AudioAttributes.Builder().setContentType(this.contentType).setFlags(this.flags).setUsage(this.usage);
            if (Util.SDK_INT >= 29) {
                C5156p5.m27367a(usage, this.allowedCapturePolicy);
            }
            this.audioAttributesV21 = usage.build();
        }
        return this.audioAttributesV21;
    }

    public int hashCode() {
        return ((((((527 + this.contentType) * 31) + this.flags) * 31) + this.usage) * 31) + this.allowedCapturePolicy;
    }
}
