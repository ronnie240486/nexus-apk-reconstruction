package org.slf4j.helpers;

import java.io.ObjectStreamException;
import java.io.Serializable;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes.dex */
abstract class NamedLoggerBase implements Logger, Serializable {

    /* JADX INFO: renamed from: b */
    public static final long f17219b = 7535258609338176893L;

    /* JADX INFO: renamed from: a */
    public String f17220a;

    /* JADX WARN: Invalid debug info offset */
    @Override // org.slf4j.Logger
    public String getName() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j0 */
    public Object m25112j0() throws ObjectStreamException {
        return null;
    }
}
