package com.google.android.gms.internal.common;

import javax.annotation.CheckForNull;
import org.jspecify.nullness.NullMarked;

/* JADX INFO: loaded from: classes.dex */
@NullMarked
public final class zzq {
    public static final CharSequence zza(@CheckForNull Object obj, String str) {
        obj.getClass();
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }
}
