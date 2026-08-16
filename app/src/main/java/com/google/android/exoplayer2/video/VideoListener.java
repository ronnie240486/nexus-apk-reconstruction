package com.google.android.exoplayer2.video;

/* JADX INFO: loaded from: classes2.dex */
public interface VideoListener {
    void onRenderedFirstFrame();

    void onSurfaceSizeChanged(int i, int i2);

    void onVideoSizeChanged(int i, int i2, int i3, float f);
}
