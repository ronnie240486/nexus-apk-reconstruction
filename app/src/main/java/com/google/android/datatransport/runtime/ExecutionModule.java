package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.dagger.Module;
import com.google.android.datatransport.runtime.dagger.Provides;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import p000.InterfaceC4739lS;

/* JADX INFO: loaded from: classes.dex */
@Module
abstract class ExecutionModule {
    @Provides
    @InterfaceC4739lS
    public static Executor executor() {
        return new SafeLoggingExecutor(Executors.newSingleThreadExecutor());
    }
}
