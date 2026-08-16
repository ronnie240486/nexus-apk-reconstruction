package com.google.android.exoplayer2.p007ui;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.SimpleExoPlayer;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class SimpleExoPlayerView extends PlayerView {
    public SimpleExoPlayerView(Context context) {
        super(context);
    }

    @Deprecated
    public static void switchTargetView(SimpleExoPlayer simpleExoPlayer, @Nullable SimpleExoPlayerView simpleExoPlayerView, @Nullable SimpleExoPlayerView simpleExoPlayerView2) {
        PlayerView.switchTargetView(simpleExoPlayer, simpleExoPlayerView, simpleExoPlayerView2);
    }

    public SimpleExoPlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SimpleExoPlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
