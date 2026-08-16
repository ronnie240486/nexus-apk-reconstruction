package p000;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

/* JADX INFO: renamed from: Af */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC0044Af {

    /* JADX INFO: renamed from: b */
    public static final InterfaceC0044Af f99b = new a();

    /* JADX INFO: renamed from: Af$a */
    public class a implements InterfaceC0044Af {
        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0002
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // p000.InterfaceC0044Af
        public java.util.List<java.net.InetAddress> lookup(java.lang.String r4) throws java.net.UnknownHostException {
            /*
                r3 = this;
                r0 = 0
                return r0
            Lb:
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.InterfaceC0044Af.a.lookup(java.lang.String):java.util.List");
        }
    }

    List<InetAddress> lookup(String str) throws UnknownHostException;
}
