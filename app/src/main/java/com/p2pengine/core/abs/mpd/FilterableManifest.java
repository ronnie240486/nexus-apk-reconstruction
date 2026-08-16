package com.p2pengine.core.abs.mpd;

import com.p2pengine.core.abs.StreamKey;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface FilterableManifest<T> {
    T copy(List<StreamKey> list);
}
