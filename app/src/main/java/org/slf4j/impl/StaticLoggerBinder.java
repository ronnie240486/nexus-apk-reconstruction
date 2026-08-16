package org.slf4j.impl;

import org.slf4j.ILoggerFactory;
import org.slf4j.spi.LoggerFactoryBinder;

/* JADX INFO: loaded from: classes.dex */
public class StaticLoggerBinder implements LoggerFactoryBinder {

    /* JADX INFO: renamed from: b */
    public static final StaticLoggerBinder f17237b = new StaticLoggerBinder();

    /* JADX INFO: renamed from: c */
    public static String f17238c = "1.6.99";

    /* JADX INFO: renamed from: d */
    public static final String f17239d = AndroidLoggerFactory.class.getName();

    /* JADX INFO: renamed from: a */
    public final ILoggerFactory f17240a;

    /* JADX WARN: Invalid debug info offset */
    private StaticLoggerBinder() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public static StaticLoggerBinder m25138c() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.spi.LoggerFactoryBinder
    /* JADX INFO: renamed from: a */
    public ILoggerFactory mo25139a() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.spi.LoggerFactoryBinder
    /* JADX INFO: renamed from: b */
    public String mo25140b() {
        return null;
    }
}
