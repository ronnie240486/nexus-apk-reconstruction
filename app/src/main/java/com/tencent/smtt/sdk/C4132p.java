package com.tencent.smtt.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.tbs.video.interfaces.IUserStateChangedListener;
import com.tencent.tbs.video.interfaces.InterfaceC4173a;

/* JADX INFO: renamed from: com.tencent.smtt.sdk.p */
/* JADX INFO: loaded from: classes2.dex */
class C4132p {

    /* JADX INFO: renamed from: e */
    private static C4132p f13117e;

    /* JADX INFO: renamed from: a */
    C4134r f13118a;

    /* JADX INFO: renamed from: b */
    Context f13119b;

    /* JADX INFO: renamed from: c */
    InterfaceC4173a f13120c;

    /* JADX INFO: renamed from: d */
    IUserStateChangedListener f13121d;

    /* JADX INFO: renamed from: com.tencent.smtt.sdk.p$1, reason: invalid class name */
    public class AnonymousClass1 implements IUserStateChangedListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C4132p f13122a;

        /* JADX WARN: Invalid debug info offset */
        public AnonymousClass1(C4132p c4132p) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.tbs.video.interfaces.IUserStateChangedListener
        public void onUserStateChanged() {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    private C4132p(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    public static synchronized com.tencent.smtt.sdk.C4132p m19195a(android.content.Context r2) {
        /*
            r0 = 0
            return r0
        Lf:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.C4132p.m19195a(android.content.Context):com.tencent.smtt.sdk.p");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public void m19196a(int i, int i2, Intent intent) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public void m19197a(Activity activity, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public boolean m19198a() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public boolean m19199a(String str, Bundle bundle, InterfaceC4173a interfaceC4173a) {
        return false;
    }
}
