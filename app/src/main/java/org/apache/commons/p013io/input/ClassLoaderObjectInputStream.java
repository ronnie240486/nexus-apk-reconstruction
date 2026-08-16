package org.apache.commons.p013io.input;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

/* JADX INFO: loaded from: classes2.dex */
public class ClassLoaderObjectInputStream extends ObjectInputStream {

    /* JADX INFO: renamed from: a */
    public final ClassLoader f15806a;

    /* JADX WARN: Invalid debug info offset */
    public ClassLoaderObjectInputStream(ClassLoader classLoader, InputStream inputStream) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.ObjectInputStream
    public Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws IOException, ClassNotFoundException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0015
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // java.io.ObjectInputStream
    public java.lang.Class<?> resolveProxyClass(java.lang.String[] r6) throws java.io.IOException, java.lang.ClassNotFoundException {
        /*
            r5 = this;
            r0 = 0
            return r0
        L1c:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.input.ClassLoaderObjectInputStream.resolveProxyClass(java.lang.String[]):java.lang.Class");
    }
}
