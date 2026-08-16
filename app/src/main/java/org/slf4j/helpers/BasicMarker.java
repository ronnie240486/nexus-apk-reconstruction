package org.slf4j.helpers;

import java.util.Iterator;
import java.util.List;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes.dex */
public class BasicMarker implements Marker {

    /* JADX INFO: renamed from: c */
    public static final long f17201c = 1803952589649545191L;

    /* JADX INFO: renamed from: d */
    public static String f17202d = "[ ";

    /* JADX INFO: renamed from: e */
    public static String f17203e = " ]";

    /* JADX INFO: renamed from: f */
    public static String f17204f = ", ";

    /* JADX INFO: renamed from: a */
    public final String f17205a;

    /* JADX INFO: renamed from: b */
    public List<Marker> f17206b;

    /* JADX WARN: Invalid debug info offset */
    public BasicMarker(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // org.slf4j.Marker
    /* JADX INFO: renamed from: H4 */
    public synchronized boolean mo25056H4(Marker marker) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.Marker
    /* JADX INFO: renamed from: Q4 */
    public boolean mo25057Q4(Marker marker) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.Marker
    /* JADX INFO: renamed from: X7 */
    public boolean mo25058X7() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.slf4j.Marker
    /* JADX INFO: renamed from: b5 */
    public synchronized void mo25059b5(org.slf4j.Marker r2) {
        /*
            r1 = this;
            return
        L1f:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.slf4j.helpers.BasicMarker.mo25059b5(org.slf4j.Marker):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.Marker
    public boolean contains(String str) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.Marker
    /* JADX INFO: renamed from: e3 */
    public synchronized boolean mo25060e3() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.Marker
    public boolean equals(Object obj) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.Marker
    public String getName() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.Marker
    public int hashCode() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.Marker
    public synchronized Iterator<Marker> iterator() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String toString() {
        return null;
    }
}
