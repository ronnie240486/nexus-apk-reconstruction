package p000;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: qJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C5233qJ {

    /* JADX INFO: renamed from: a */
    @NotNull
    @InterfaceC5750xt
    public static final C5170pJ f18511a;

    /* JADX WARN: Code duplicated, block: B:31:0x010e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0094 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        C5170pJ c5170pJ;
        Object objNewInstance;
        int iM27635c = m27635c();
        if (iM27635c >= 65544) {
            try {
                Object objNewInstance2 = Class.forName("kotlin.internal.jdk8.JDK8PlatformImplementations").newInstance();
                C0574Is.m2756o(objNewInstance2, "forName(\"kotlin.internal…entations\").newInstance()");
                try {
                    try {
                        c5170pJ = (C5170pJ) objNewInstance2;
                    } catch (ClassCastException e) {
                        Throwable thInitCause = new ClassCastException("Instance classloader: " + objNewInstance2.getClass().getClassLoader() + ", base type classloader: " + C5170pJ.class.getClassLoader()).initCause(e);
                        C0574Is.m2756o(thInitCause, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                        throw thInitCause;
                    }
                } catch (ClassNotFoundException unused) {
                    if (iM27635c >= 65543) {
                        try {
                            objNewInstance = Class.forName("kotlin.internal.jdk7.JDK7PlatformImplementations").newInstance();
                            C0574Is.m2756o(objNewInstance, "forName(\"kotlin.internal…entations\").newInstance()");
                            try {
                                try {
                                    c5170pJ = (C5170pJ) objNewInstance;
                                } catch (ClassCastException e2) {
                                    Throwable thInitCause2 = new ClassCastException("Instance classloader: " + objNewInstance.getClass().getClassLoader() + ", base type classloader: " + C5170pJ.class.getClassLoader()).initCause(e2);
                                    C0574Is.m2756o(thInitCause2, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                                    throw thInitCause2;
                                }
                            } catch (ClassNotFoundException unused2) {
                                c5170pJ = new C5170pJ();
                            }
                        } catch (ClassNotFoundException unused3) {
                            Object objNewInstance3 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                            C0574Is.m2756o(objNewInstance3, "forName(\"kotlin.internal…entations\").newInstance()");
                            try {
                                c5170pJ = (C5170pJ) objNewInstance3;
                            } catch (ClassCastException e3) {
                                Throwable thInitCause3 = new ClassCastException("Instance classloader: " + objNewInstance3.getClass().getClassLoader() + ", base type classloader: " + C5170pJ.class.getClassLoader()).initCause(e3);
                                C0574Is.m2756o(thInitCause3, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                                throw thInitCause3;
                            }
                        }
                    } else {
                        c5170pJ = new C5170pJ();
                    }
                }
            } catch (ClassNotFoundException unused4) {
                Object objNewInstance4 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
                C0574Is.m2756o(objNewInstance4, "forName(\"kotlin.internal…entations\").newInstance()");
                try {
                    c5170pJ = (C5170pJ) objNewInstance4;
                } catch (ClassCastException e4) {
                    Throwable thInitCause4 = new ClassCastException("Instance classloader: " + objNewInstance4.getClass().getClassLoader() + ", base type classloader: " + C5170pJ.class.getClassLoader()).initCause(e4);
                    C0574Is.m2756o(thInitCause4, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                    throw thInitCause4;
                }
            }
        } else if (iM27635c >= 65543) {
            objNewInstance = Class.forName("kotlin.internal.jdk7.JDK7PlatformImplementations").newInstance();
            C0574Is.m2756o(objNewInstance, "forName(\"kotlin.internal…entations\").newInstance()");
            c5170pJ = (C5170pJ) objNewInstance;
        } else {
            c5170pJ = new C5170pJ();
        }
        f18511a = c5170pJ;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC1055QL
    @InterfaceC4676kS(version = "1.2")
    /* JADX INFO: renamed from: a */
    public static final boolean m27633a(int i, int i2, int i3) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @InterfaceC4576is
    /* JADX INFO: renamed from: b */
    public static final <T> T m27634b(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x001b
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: c */
    public static final int m27635c() {
        /*
            r0 = 0
            return r0
        L21:
        L52:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C5233qJ.m27635c():int");
    }
}
