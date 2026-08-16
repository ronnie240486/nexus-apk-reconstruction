package org.dom4j.tree;

import java.lang.reflect.Constructor;
import java.util.Map;
import org.dom4j.Namespace;

/* JADX INFO: loaded from: classes2.dex */
public class NamespaceCache {

    /* JADX INFO: renamed from: a */
    public static final String f16907a = "EDU.oswego.cs.dl.util.concurrent.ConcurrentReaderHashMap";

    /* JADX INFO: renamed from: b */
    public static Map f16908b;

    /* JADX INFO: renamed from: c */
    public static Map f16909c;

    static {
        try {
            try {
                Class<?> cls = Class.forName("java.util.concurrent.ConcurrentHashMap");
                Class<?> cls2 = Integer.TYPE;
                Constructor<?> constructor = cls.getConstructor(cls2, Float.TYPE, cls2);
                f16908b = (Map) constructor.newInstance(new Integer(11), new Float(0.75f), new Integer(1));
                f16909c = (Map) constructor.newInstance(new Integer(11), new Float(0.75f), new Integer(1));
            } catch (Throwable unused) {
                f16908b = new ConcurrentReaderHashMap();
                f16909c = new ConcurrentReaderHashMap();
            }
        } catch (Throwable unused2) {
            Class<?> cls3 = Class.forName(f16907a);
            f16908b = (Map) cls3.newInstance();
            f16909c = (Map) cls3.newInstance();
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public Namespace m24748a(String str, String str2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0017
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: b */
    public org.dom4j.Namespace m24749b(java.lang.String r5) {
        /*
            r4 = this;
            r0 = 0
            return r0
        L28:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.dom4j.tree.NamespaceCache.m24749b(java.lang.String):org.dom4j.Namespace");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0017
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: c */
    public org.dom4j.Namespace m24750c(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            r0 = 0
            return r0
        L26:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.dom4j.tree.NamespaceCache.m24750c(java.lang.String, java.lang.String):org.dom4j.Namespace");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000d
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: d */
    public java.util.Map m24751d(java.lang.String r4) {
        /*
            r3 = this;
            r0 = 0
            return r0
        L22:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.dom4j.tree.NamespaceCache.m24751d(java.lang.String):java.util.Map");
    }
}
