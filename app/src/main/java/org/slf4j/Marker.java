package org.slf4j;

import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public interface Marker extends Serializable {

    /* JADX INFO: renamed from: y0 */
    public static final String f17178y0 = "*";

    /* JADX INFO: renamed from: z0 */
    public static final String f17179z0 = "+";

    /* JADX INFO: renamed from: H4 */
    boolean mo25056H4(Marker marker);

    /* JADX INFO: renamed from: Q4 */
    boolean mo25057Q4(Marker marker);

    /* JADX INFO: renamed from: X7 */
    boolean mo25058X7();

    /* JADX INFO: renamed from: b5 */
    void mo25059b5(Marker marker);

    boolean contains(String str);

    /* JADX INFO: renamed from: e3 */
    boolean mo25060e3();

    boolean equals(Object obj);

    String getName();

    int hashCode();

    Iterator<Marker> iterator();
}
