package org.slf4j.helpers;

import java.lang.reflect.Method;
import java.util.Queue;
import org.slf4j.Logger;
import org.slf4j.Marker;
import org.slf4j.event.EventRecodingLogger;
import org.slf4j.event.SubstituteLoggingEvent;

/* JADX INFO: loaded from: classes.dex */
public class SubstituteLogger implements Logger {

    /* JADX INFO: renamed from: a */
    public final String f17221a;

    /* JADX INFO: renamed from: b */
    public volatile Logger f17222b;

    /* JADX INFO: renamed from: c */
    public Boolean f17223c;

    /* JADX INFO: renamed from: d */
    public Method f17224d;

    /* JADX INFO: renamed from: e */
    public EventRecodingLogger f17225e;

    /* JADX INFO: renamed from: f */
    public Queue<SubstituteLoggingEvent> f17226f;

    /* JADX INFO: renamed from: g */
    public final boolean f17227g;

    /* JADX WARN: Invalid debug info offset */
    public SubstituteLogger(String str, Queue<SubstituteLoggingEvent> queue, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.Logger
    /* JADX INFO: renamed from: A */
    public void mo24966A(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.Logger
    /* JADX INFO: renamed from: B */
    public boolean mo24967B() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.Logger
    /* JADX INFO: renamed from: C */
    public void mo24968C(String str, Object obj, Object obj2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.Logger
    /* JADX INFO: renamed from: D */
    public void mo24969D(String str, Object... objArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.Logger
    /* JADX INFO: renamed from: F */
    public void mo24970F(Marker marker, String str, Object obj) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.Logger
    /* JADX INFO: renamed from: G */
    public void mo24971G(String str, Object obj) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.Logger
    /* JADX INFO: renamed from: H */
    public void mo24972H(Marker marker, String str, Object obj, Object obj2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.Logger
    /* JADX INFO: renamed from: I */
    public void mo24973I(String str, Object obj) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.Logger
    /* JADX INFO: renamed from: J */
    public boolean mo24974J(Marker marker) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.Logger
    /* JADX INFO: renamed from: K */
    public void mo24975K(Marker marker, String str, Object obj, Object obj2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.Logger
    /* JADX INFO: renamed from: L */
    public void mo24976L(String str, Object... objArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.Logger
    /* JADX INFO: renamed from: M */
    public void mo24977M(String str, Throwable th) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.Logger
    /* JADX INFO: renamed from: N */
    public void mo24978N(String str, Throwable th) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.Logger
    /* JADX INFO: renamed from: O */
    public void mo24979O(String str, Throwable th) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.Logger
    /* JADX INFO: renamed from: P */
    public boolean mo24980P(Marker marker) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.Logger
    /* JADX INFO: renamed from: Q */
    public void mo24981Q(Marker marker, String str, Object... objArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.Logger
    /* JADX INFO: renamed from: R */
    public void mo24982R(Marker marker, String str, Throwable th) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.Logger
    /* JADX INFO: renamed from: S */
    public void mo24983S(String str, Throwable th) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.Logger
    /* JADX INFO: renamed from: T */
    public void mo24984T(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.Logger
    /* JADX INFO: renamed from: U */
    public void mo24985U(Marker marker, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.Logger
    /* JADX INFO: renamed from: V */
    public void mo24986V(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.Logger
    /* JADX INFO: renamed from: W */
    public void mo24987W(String str, Object... objArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.Logger
    /* JADX INFO: renamed from: X */
    public void mo24988X(Marker marker, String str, Throwable th) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.Logger
    /* JADX INFO: renamed from: Y */
    public void mo24989Y(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.Logger
    /* JADX INFO: renamed from: Z */
    public boolean mo24990Z(Marker marker) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.Logger
    /* JADX INFO: renamed from: a */
    public void mo24991a(String str, Object obj) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.Logger
    /* JADX INFO: renamed from: a0 */
    public void mo24992a0(String str, Object... objArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.Logger
    /* JADX INFO: renamed from: b */
    public void mo24993b(String str, Object obj) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.Logger
    /* JADX INFO: renamed from: b0 */
    public void mo24994b0(String str, Object obj, Object obj2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.Logger
    /* JADX INFO: renamed from: c */
    public void mo24995c(Marker marker, String str, Object... objArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.Logger
    /* JADX INFO: renamed from: c0 */
    public void mo24996c0(Marker marker, String str, Object obj) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.Logger
    /* JADX INFO: renamed from: d */
    public boolean mo24997d() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.Logger
    /* JADX INFO: renamed from: d0 */
    public void mo24998d0(Marker marker, String str, Object obj) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.Logger
    /* JADX INFO: renamed from: e */
    public void mo24999e(String str, Object obj, Object obj2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.Logger
    /* JADX INFO: renamed from: e0 */
    public void mo25000e0(Marker marker, String str, Object... objArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean equals(Object obj) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.Logger
    /* JADX INFO: renamed from: f */
    public boolean mo25001f() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.Logger
    /* JADX INFO: renamed from: f0 */
    public boolean mo25002f0(Marker marker) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.Logger
    /* JADX INFO: renamed from: g */
    public void mo25003g(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.Logger
    /* JADX INFO: renamed from: g0 */
    public void mo25004g0(Marker marker, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.Logger
    public String getName() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.Logger
    /* JADX INFO: renamed from: h */
    public void mo25005h(Marker marker, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.Logger
    /* JADX INFO: renamed from: h0 */
    public boolean mo25006h0(Marker marker) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public int hashCode() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.Logger
    /* JADX INFO: renamed from: i */
    public void mo25007i(Marker marker, String str, Object... objArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.Logger
    /* JADX INFO: renamed from: i0 */
    public void mo25008i0(Marker marker, String str, Object obj, Object obj2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.Logger
    /* JADX INFO: renamed from: j */
    public void mo25009j(Marker marker, String str, Throwable th) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j0 */
    public Logger m25113j0() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.Logger
    /* JADX INFO: renamed from: k */
    public void mo25010k(Marker marker, String str, Object obj) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k0 */
    public final Logger m25114k0() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.Logger
    /* JADX INFO: renamed from: l */
    public void mo25011l(Marker marker, String str, Throwable th) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0009
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: l0 */
    public boolean m25115l0() {
        /*
            r5 = this;
            r0 = 0
            return r0
        L24:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.slf4j.helpers.SubstituteLogger.m25115l0():boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.Logger
    /* JADX INFO: renamed from: m */
    public void mo25012m(String str, Object obj) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m0 */
    public boolean m25116m0() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.Logger
    /* JADX INFO: renamed from: n */
    public void mo25013n(String str, Throwable th) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n0 */
    public boolean m25117n0() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.Logger
    /* JADX INFO: renamed from: o */
    public void mo25014o(String str, Object obj, Object obj2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0006
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: o0 */
    public void m25118o0(org.slf4j.event.LoggingEvent r5) {
        /*
            r4 = this;
            return
        L13:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.slf4j.helpers.SubstituteLogger.m25118o0(org.slf4j.event.LoggingEvent):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.Logger
    /* JADX INFO: renamed from: p */
    public void mo25015p(Marker marker, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p0 */
    public void m25119p0(Logger logger) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.Logger
    /* JADX INFO: renamed from: q */
    public void mo25016q(Marker marker, String str, Object... objArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.Logger
    /* JADX INFO: renamed from: r */
    public boolean mo25017r() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.Logger
    /* JADX INFO: renamed from: s */
    public void mo25018s(String str, Object... objArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.Logger
    /* JADX INFO: renamed from: t */
    public void mo25019t(Marker marker, String str, Object obj, Object obj2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.Logger
    /* JADX INFO: renamed from: u */
    public boolean mo25020u() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.Logger
    /* JADX INFO: renamed from: v */
    public void mo25021v(String str, Object obj, Object obj2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.Logger
    /* JADX INFO: renamed from: w */
    public void mo25022w(Marker marker, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.Logger
    /* JADX INFO: renamed from: x */
    public void mo25023x(Marker marker, String str, Object obj) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.Logger
    /* JADX INFO: renamed from: y */
    public void mo25024y(Marker marker, String str, Throwable th) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.Logger
    /* JADX INFO: renamed from: z */
    public void mo25025z(Marker marker, String str, Object obj, Object obj2) {
    }
}
