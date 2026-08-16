package org.xutils.p021db.table;

import java.util.HashMap;
import org.xutils.DbManager;
import org.xutils.p022ex.DbException;

/* JADX INFO: loaded from: classes.dex */
public abstract class DbBase implements DbManager {

    /* JADX INFO: renamed from: a */
    public final HashMap<Class<?>, TableEntity<?>> f18058a;

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.xutils.DbManager
    /* JADX INFO: renamed from: D */
    public <T> org.xutils.p021db.table.TableEntity<T> mo26598D(java.lang.Class<T> r4) throws org.xutils.p022ex.DbException {
        /*
            r3 = this;
            r0 = 0
            return r0
        L18:
        L1a:
        L1c:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xutils.p021db.table.DbBase.mo26598D(java.lang.Class):org.xutils.db.table.TableEntity");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.DbManager
    /* JADX INFO: renamed from: f0 */
    public void mo26614f0(Class<?> cls, String str) throws DbException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: j */
    public void m26960j(java.lang.Class<?> r3) {
        /*
            r2 = this;
            return
        La:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xutils.p021db.table.DbBase.m26960j(java.lang.Class):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0008
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.xutils.DbManager
    /* JADX INFO: renamed from: j0 */
    public void mo26617j0() throws org.xutils.p022ex.DbException {
        /*
            r5 = this;
            return
        L28:
        L31:
        L50:
        L64:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xutils.p021db.table.DbBase.mo26617j0():void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.DbManager
    /* JADX INFO: renamed from: t */
    public void mo26619t(Class<?> cls) throws DbException {
    }
}
