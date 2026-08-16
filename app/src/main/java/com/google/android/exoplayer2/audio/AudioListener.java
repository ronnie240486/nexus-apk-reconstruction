package com.google.android.exoplayer2.audio;

/* JADX INFO: loaded from: classes2.dex */
public interface AudioListener {
    void onAudioAttributesChanged(AudioAttributes audioAttributes);

    void onAudioSessionId(int i);

    void onVolumeChanged(float f);
}
