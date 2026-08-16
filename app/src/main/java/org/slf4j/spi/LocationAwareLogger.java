package org.slf4j.spi;

import org.slf4j.Logger;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes.dex */
public interface LocationAwareLogger extends Logger {

    /* JADX INFO: renamed from: A0 */
    public static final int f17244A0 = 0;

    /* JADX INFO: renamed from: B0 */
    public static final int f17245B0 = 10;

    /* JADX INFO: renamed from: C0 */
    public static final int f17246C0 = 20;

    /* JADX INFO: renamed from: D0 */
    public static final int f17247D0 = 30;

    /* JADX INFO: renamed from: E0 */
    public static final int f17248E0 = 40;

    /* JADX INFO: renamed from: E */
    void m25147E(Marker marker, String str, int i, String str2, Object[] objArr, Throwable th);
}
