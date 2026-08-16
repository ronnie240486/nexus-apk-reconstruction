package com.p2pengine.core.abs.mpd.manifest;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public interface Parser<T> {
    T parse(Uri uri, byte[] bArr);
}
