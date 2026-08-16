package com.google.firebase.platforminfo;

import androidx.annotation.Nullable;
import p000.C5816yu;

/* JADX INFO: loaded from: classes2.dex */
public final class KotlinDetector {
    private KotlinDetector() {
    }

    @Nullable
    public static String detectVersion() {
        try {
            return C5816yu.f19622g.toString();
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }
}
