package org.xutils;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.List;
import org.xutils.common.util.KeyValue;
import org.xutils.p021db.Selector;
import org.xutils.p021db.sqlite.SqlInfo;
import org.xutils.p021db.sqlite.WhereBuilder;
import org.xutils.p021db.table.DbModel;
import org.xutils.p021db.table.TableEntity;
import org.xutils.p022ex.DbException;

/* JADX INFO: loaded from: classes.dex */
public interface DbManager extends Closeable {

    public static class DaoConfig {

        /* JADX INFO: renamed from: a */
        public File f17911a;

        /* JADX INFO: renamed from: b */
        public String f17912b;

        /* JADX INFO: renamed from: c */
        public int f17913c;

        /* JADX INFO: renamed from: d */
        public boolean f17914d;

        /* JADX INFO: renamed from: e */
        public DbUpgradeListener f17915e;

        /* JADX INFO: renamed from: f */
        public TableCreateListener f17916f;

        /* JADX INFO: renamed from: g */
        public DbOpenListener f17917g;

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public File m26626a() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public String m26627b() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: c */
        public DbOpenListener m26628c() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: d */
        public DbUpgradeListener m26629d() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: e */
        public int m26630e() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        public boolean equals(Object obj) {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: f */
        public TableCreateListener m26631f() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: g */
        public boolean m26632g() {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: h */
        public DaoConfig m26633h(boolean z) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public int hashCode() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: i */
        public DaoConfig m26634i(File file) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: j */
        public DaoConfig m26635j(String str) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: k */
        public DaoConfig m26636k(DbOpenListener dbOpenListener) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: l */
        public DaoConfig m26637l(DbUpgradeListener dbUpgradeListener) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: m */
        public DaoConfig m26638m(int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: n */
        public DaoConfig m26639n(TableCreateListener tableCreateListener) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public String toString() {
            return null;
        }
    }

    public interface DbOpenListener {
        /* JADX INFO: renamed from: a */
        void mo26640a(DbManager dbManager) throws DbException;
    }

    public interface DbUpgradeListener {
        /* JADX INFO: renamed from: a */
        void mo26641a(DbManager dbManager, int i, int i2) throws DbException;
    }

    public interface TableCreateListener {
        /* JADX INFO: renamed from: a */
        void m26642a(DbManager dbManager, TableEntity<?> tableEntity);
    }

    /* JADX INFO: renamed from: D */
    <T> TableEntity<T> mo26598D(Class<T> cls) throws DbException;

    /* JADX INFO: renamed from: E0 */
    DaoConfig mo26599E0();

    /* JADX INFO: renamed from: F */
    void mo26600F(Object obj) throws DbException;

    /* JADX INFO: renamed from: F0 */
    DbModel mo26601F0(SqlInfo sqlInfo) throws DbException;

    /* JADX INFO: renamed from: G0 */
    int mo26602G0(String str) throws DbException;

    /* JADX INFO: renamed from: H */
    void mo26603H(Object obj) throws DbException;

    /* JADX INFO: renamed from: I0 */
    Cursor mo26604I0(SqlInfo sqlInfo) throws DbException;

    /* JADX INFO: renamed from: K0 */
    SQLiteDatabase mo26605K0();

    /* JADX INFO: renamed from: N */
    void mo26606N(Class<?> cls, Object obj) throws DbException;

    /* JADX INFO: renamed from: Q */
    void mo26607Q(Object obj, String... strArr) throws DbException;

    /* JADX INFO: renamed from: W */
    void mo26608W(Class<?> cls) throws DbException;

    /* JADX INFO: renamed from: a */
    List<DbModel> mo26609a(SqlInfo sqlInfo) throws DbException;

    /* JADX INFO: renamed from: a0 */
    Cursor mo26610a0(String str) throws DbException;

    /* JADX INFO: renamed from: c */
    <T> List<T> mo26611c(Class<T> cls) throws DbException;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    /* JADX INFO: renamed from: d */
    <T> T mo26612d(Class<T> cls, Object obj) throws DbException;

    /* JADX INFO: renamed from: e */
    boolean mo26613e(Object obj) throws DbException;

    /* JADX INFO: renamed from: f0 */
    void mo26614f0(Class<?> cls, String str) throws DbException;

    /* JADX INFO: renamed from: g */
    void mo26615g(Object obj) throws DbException;

    /* JADX INFO: renamed from: h */
    int mo26616h(Class<?> cls, WhereBuilder whereBuilder) throws DbException;

    /* JADX INFO: renamed from: j0 */
    void mo26617j0() throws DbException;

    /* JADX INFO: renamed from: n0 */
    int mo26618n0(Class<?> cls, WhereBuilder whereBuilder, KeyValue... keyValueArr) throws DbException;

    /* JADX INFO: renamed from: t */
    void mo26619t(Class<?> cls) throws DbException;

    /* JADX INFO: renamed from: u */
    void mo26620u(SqlInfo sqlInfo) throws DbException;

    /* JADX INFO: renamed from: v */
    <T> T mo26621v(Class<T> cls) throws DbException;

    /* JADX INFO: renamed from: v0 */
    int mo26622v0(SqlInfo sqlInfo) throws DbException;

    /* JADX INFO: renamed from: w0 */
    void mo26623w0(Object obj) throws DbException;

    /* JADX INFO: renamed from: y0 */
    <T> Selector<T> mo26624y0(Class<T> cls) throws DbException;

    /* JADX INFO: renamed from: z0 */
    void mo26625z0(String str) throws DbException;
}
