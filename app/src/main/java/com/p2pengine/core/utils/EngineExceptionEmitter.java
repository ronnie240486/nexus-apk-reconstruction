package com.p2pengine.core.utils;

import android.os.Handler;
import android.os.Message;
import com.p2pengine.core.p2p.EngineExceptionListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000.InterfaceC4245dm;

/* JADX INFO: loaded from: classes2.dex */
public final class EngineExceptionEmitter {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final C4000a f12197b = new C4000a();

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final InterfaceC4245dm<EngineExceptionEmitter> f12198c = EngineExceptionEmitter$Companion$creator$1.INSTANCE;

    /* JADX INFO: renamed from: a */
    @Nullable
    public EngineExceptionListener f12199a;

    /* JADX INFO: renamed from: com.p2pengine.core.utils.EngineExceptionEmitter$a */
    public static final class C4000a extends AbstractC4014g<EngineExceptionEmitter> {
        /* JADX WARN: Invalid debug info offset */
        @Override // com.p2pengine.core.utils.AbstractC4014g
        @NotNull
        /* JADX INFO: renamed from: b */
        public InterfaceC4245dm<EngineExceptionEmitter> mo18389b() {
            return null;
        }
    }

    /* JADX INFO: renamed from: com.p2pengine.core.utils.EngineExceptionEmitter$b */
    public static final class HandlerC4001b extends Handler implements EngineExceptionListener {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final EngineExceptionListener f12200a;

        /* JADX INFO: renamed from: b */
        public final int f12201b;

        /* JADX INFO: renamed from: c */
        public final int f12202c;

        /* JADX INFO: renamed from: d */
        public final int f12203d;

        /* JADX INFO: renamed from: e */
        public final int f12204e;

        /* JADX WARN: Invalid debug info offset */
        public HandlerC4001b(@NotNull EngineExceptionListener engineExceptionListener) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.Handler
        public void handleMessage(@NotNull Message message) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.p2pengine.core.p2p.EngineExceptionListener
        public void onOtherException(@NotNull EngineException engineException) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.p2pengine.core.p2p.EngineExceptionListener
        public void onSchedulerException(@NotNull EngineException engineException) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.p2pengine.core.p2p.EngineExceptionListener
        public void onSignalException(@NotNull EngineException engineException) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.p2pengine.core.p2p.EngineExceptionListener
        public void onTrackerException(@NotNull EngineException engineException) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public final void m18390a(@NotNull EngineException engineException) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public final void m18391b(@NotNull EngineException engineException) {
    }
}
