package com.p2pengine.core.p2p;

import com.cdnbye.libdc.Configuration;
import com.cdnbye.libdc.DcEvent;
import com.cdnbye.libdc.IceState;
import com.cdnbye.libdc.PeerConnection;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000.AbstractC0123Bu;
import p000.C1003PY;
import p000.InterfaceC4245dm;
import p000.InterfaceC4958om;

/* JADX INFO: loaded from: classes2.dex */
public final class PeerChannel {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f11927a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public PeerChannelListener f11928b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final ExecutorService f11929c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public Configuration f11930d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public volatile PeerConnection f11931e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public volatile com.cdnbye.libdc.DataChannel f11932f;

    /* JADX INFO: renamed from: g */
    public volatile boolean f11933g;

    /* JADX INFO: renamed from: h */
    public volatile boolean f11934h;

    /* JADX INFO: renamed from: i */
    public volatile boolean f11935i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public InterfaceC4958om<? super Boolean, C1003PY> f11936j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public final ConcurrentLinkedQueue<JsonObject> f11937k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public final CopyOnWriteArrayList<C3962d> f11938l;

    /* JADX INFO: renamed from: com.p2pengine.core.p2p.PeerChannel$1 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LPY;", "<anonymous>", "()V"}, k = 3, mv = {1, 5, 1})
    public static final class C39571 extends AbstractC0123Bu implements InterfaceC4245dm<C1003PY> {
        public final /* synthetic */ PeerChannel this$0;

        /* JADX WARN: Invalid debug info offset */
        public C39571(PeerChannel peerChannel) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC4245dm
        public /* bridge */ /* synthetic */ C1003PY invoke() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* JADX INFO: renamed from: com.p2pengine.core.p2p.PeerChannel$a */
    public /* synthetic */ class C3958a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f11939a;

        static {
            int[] iArr = new int[IceState.values().length];
            iArr[IceState.CONNECTED.ordinal()] = 1;
            iArr[IceState.CLOSED.ordinal()] = 2;
            iArr[IceState.DISCONNECTED.ordinal()] = 3;
            iArr[IceState.FAILED.ordinal()] = 4;
            f11939a = iArr;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public PeerChannel(@NotNull String str, boolean z, @Nullable PeerChannelListener peerChannelListener, @NotNull ArrayList<C3963e> arrayList) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static final void m18230a(PeerChannel peerChannel, com.cdnbye.libdc.DataChannel dataChannel) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static final void m18231a(PeerChannel peerChannel, DcEvent dcEvent) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static final void m18232a(PeerChannel peerChannel, IceState iceState) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static final void m18233a(PeerChannel peerChannel, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static final void m18234a(PeerChannel peerChannel, String str, String str2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static final void m18235a(PeerChannel peerChannel, boolean z, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static final boolean m18236a(PeerChannel peerChannel) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static final void m18237b(PeerChannel peerChannel, DcEvent dcEvent) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static final void m18238b(InterfaceC4245dm interfaceC4245dm) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public static final void m18239c(PeerChannel peerChannel, DcEvent dcEvent) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0027
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    public final com.cdnbye.libdc.PeerConnection m18240a(boolean r5, java.lang.String r6) {
        /*
            r4 = this;
            r0 = 0
            return r0
        L33:
        L48:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.p2p.PeerChannel.m18240a(boolean, java.lang.String):com.cdnbye.libdc.PeerConnection");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public final void m18241a() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public final void m18242a(com.cdnbye.libdc.DataChannel dataChannel) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public final void m18243a(PeerConnection peerConnection) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public final void m18244a(@NotNull PeerChannelListener peerChannelListener) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x000d
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    public final void m18245a(p000.InterfaceC4245dm<p000.C1003PY> r3) {
        /*
            r2 = this;
            return
        L18:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.p2p.PeerChannel.m18245a(dm):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    /* JADX INFO: renamed from: b */
    public final ConcurrentLinkedQueue<JsonObject> m18246b() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public final boolean m18247c() {
        return false;
    }
}
