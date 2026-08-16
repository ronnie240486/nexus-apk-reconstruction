package org.xutils.p021db;

import java.util.List;
import org.xutils.p021db.sqlite.WhereBuilder;
import org.xutils.p021db.table.TableEntity;
import org.xutils.p022ex.DbException;

/* JADX INFO: loaded from: classes.dex */
public final class Selector<T> {

    /* JADX INFO: renamed from: a */
    public final TableEntity<T> f18033a;

    /* JADX INFO: renamed from: b */
    public WhereBuilder f18034b;

    /* JADX INFO: renamed from: c */
    public List<OrderBy> f18035c;

    /* JADX INFO: renamed from: d */
    public int f18036d;

    /* JADX INFO: renamed from: e */
    public int f18037e;

    public static class OrderBy {

        /* JADX INFO: renamed from: a */
        public String f18038a;

        /* JADX INFO: renamed from: b */
        public boolean f18039b;

        /* JADX WARN: Invalid debug info offset */
        public OrderBy(String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        public OrderBy(String str, boolean z) {
        }

        /* JADX WARN: Invalid debug info offset */
        public String toString() {
            return null;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public Selector(TableEntity<T> tableEntity) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public static <T> Selector<T> m26861g(TableEntity<T> tableEntity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public Selector<T> m26862a(String str, String str2, Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public Selector<T> m26863b(WhereBuilder whereBuilder) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public long m26864c() throws DbException {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public Selector<T> m26865d(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0019
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: e */
    public java.util.List<T> m26866e() throws org.xutils.p022ex.DbException {
        /*
            r3 = this;
            r0 = 0
            return r0
        L2e:
        L3a:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xutils.p021db.Selector.m26866e():java.util.List");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x001c
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: f */
    public T m26867f() throws org.xutils.p022ex.DbException {
        /*
            r3 = this;
            r0 = 0
            return r0
        L2c:
        L38:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xutils.p021db.Selector.m26867f():java.lang.Object");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public int m26868h() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public int m26869i() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public List<OrderBy> m26870j() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public TableEntity<T> m26871k() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public WhereBuilder m26872l() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public DbModelSelector m26873m(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n */
    public Selector<T> m26874n(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o */
    public Selector<T> m26875o(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public Selector<T> m26876p(String str, String str2, Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q */
    public Selector<T> m26877q(WhereBuilder whereBuilder) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r */
    public Selector<T> m26878r(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s */
    public Selector<T> m26879s(String str, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t */
    public DbModelSelector m26880t(String... strArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String toString() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u */
    public Selector<T> m26881u(String str, String str2, Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v */
    public Selector<T> m26882v(WhereBuilder whereBuilder) {
        return null;
    }
}
