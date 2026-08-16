package p000;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: ti */
/* JADX INFO: loaded from: classes.dex */
public class C5455ti implements InterfaceC0044Af {

    /* JADX INFO: renamed from: a */
    public static final Pattern f18902a = Pattern.compile("[0-9]+\\.[0-9]+\\.[0-9]+\\.[0-9]+");

    /* JADX INFO: renamed from: c */
    public static C4927oH f18903c;

    static {
        C4927oH.b bVar = new C4927oH.b();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        C4927oH.b bVarM22652J = bVar.m22662i(5L, timeUnit).m22645C(5L, timeUnit).m22652J(5L, timeUnit);
        bVarM22652J.getClass();
        f18903c = new C4927oH(bVarM22652J);
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    public static final java.lang.String m28489a(p000.C4934oO r1) {
        /*
            r0 = 0
            return r0
        Lf:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C5455ti.m28489a(oO):java.lang.String");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC0044Af
    public List<InetAddress> lookup(String str) throws UnknownHostException {
        return null;
    }
}
