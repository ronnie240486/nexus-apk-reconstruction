package com.p2pengine.core.nat;

import androidx.core.view.InputDeviceCompat;
import org.videolan.libvlc.MediaPlayer;

/* JADX INFO: loaded from: classes2.dex */
public enum StunMessageType {
    BindingRequest(1),
    BindingResponse(InputDeviceCompat.SOURCE_KEYBOARD),
    BindingErrorResponse(MediaPlayer.Event.f17412r),
    SharedSecretRequest(2),
    SharedSecretResponse(MediaPlayer.Event.f17401g),
    SharedSecretErrorResponse(274);

    private int value;

    StunMessageType(int i) {
        this.value = i;
    }

    public int value() {
        return this.value;
    }
}
