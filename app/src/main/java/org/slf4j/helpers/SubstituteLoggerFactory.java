package org.slf4j.helpers;

import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.event.SubstituteLoggingEvent;

/* JADX INFO: loaded from: classes.dex */
public class SubstituteLoggerFactory implements ILoggerFactory {

    /* JADX INFO: renamed from: a */
    public boolean f17228a;

    /* JADX INFO: renamed from: b */
    public final Map<String, SubstituteLogger> f17229b;

    /* JADX INFO: renamed from: c */
    public final LinkedBlockingQueue<SubstituteLoggingEvent> f17230c;

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.ILoggerFactory
    /* JADX INFO: renamed from: a */
    public synchronized Logger mo24961a(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public void m25120b() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public LinkedBlockingQueue<SubstituteLoggingEvent> m25121c() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public List<String> m25122d() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public List<SubstituteLogger> m25123e() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public void m25124f() {
    }
}
