package p000;

import android.os.ParcelFileDescriptor;
import java.io.InputStream;

/* JADX INFO: renamed from: Nr */
/* JADX INFO: loaded from: classes.dex */
public class C0892Nr<A> implements InterfaceC0915OC<A, C0956Or> {

    /* JADX INFO: renamed from: c */
    public static final String f2296c = "IVML";

    /* JADX INFO: renamed from: a */
    public final InterfaceC0915OC<A, InputStream> f2297a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0915OC<A, ParcelFileDescriptor> f2298b;

    /* JADX INFO: renamed from: Nr$a */
    public static class a implements InterfaceC4750ld<C0956Or> {

        /* JADX INFO: renamed from: a */
        public final InterfaceC4750ld<InputStream> f2299a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC4750ld<ParcelFileDescriptor> f2300b;

        /* JADX WARN: Invalid debug info offset */
        public a(InterfaceC4750ld<InputStream> interfaceC4750ld, InterfaceC4750ld<ParcelFileDescriptor> interfaceC4750ld2) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC4750ld
        /* JADX INFO: renamed from: a */
        public /* bridge */ /* synthetic */ C0956Or mo4048a(EnumC5369sL enumC5369sL) throws Exception {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC4750ld
        /* JADX INFO: renamed from: b */
        public void mo4049b() {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0008
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        /* JADX INFO: renamed from: c */
        public p000.C0956Or m4050c(p000.EnumC5369sL r6) throws java.lang.Exception {
            /*
                r5 = this;
                r0 = 0
                return r0
            Lf:
            L2e:
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C0892Nr.a.m4050c(sL):Or");
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC4750ld
        public void cancel() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC4750ld
        public String getId() {
            return null;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public C0892Nr(InterfaceC0915OC<A, InputStream> interfaceC0915OC, InterfaceC0915OC<A, ParcelFileDescriptor> interfaceC0915OC2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC0915OC
    /* JADX INFO: renamed from: a */
    public InterfaceC4750ld<C0956Or> mo3193a(A a2, int i, int i2) {
        return null;
    }
}
