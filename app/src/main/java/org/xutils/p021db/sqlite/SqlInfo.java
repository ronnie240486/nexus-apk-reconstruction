package org.xutils.p021db.sqlite;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import java.util.List;
import org.xutils.common.util.KeyValue;

/* JADX INFO: loaded from: classes.dex */
public final class SqlInfo {

    /* JADX INFO: renamed from: a */
    public String f18041a;

    /* JADX INFO: renamed from: b */
    public List<KeyValue> f18042b;

    /* JADX INFO: renamed from: org.xutils.db.sqlite.SqlInfo$1 */
    public static /* synthetic */ class C51241 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f18043a;

        static {
            int[] iArr = new int[ColumnDbType.values().length];
            f18043a = iArr;
            try {
                iArr[ColumnDbType.INTEGER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18043a[ColumnDbType.REAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18043a[ColumnDbType.TEXT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18043a[ColumnDbType.BLOB.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public SqlInfo() {
    }

    /* JADX WARN: Invalid debug info offset */
    public SqlInfo(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public void m26913a(KeyValue keyValue) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public void m26914b(List<KeyValue> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public SQLiteStatement m26915c(SQLiteDatabase sQLiteDatabase) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public Object[] m26916d() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public String[] m26917e() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public String m26918f() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public void m26919g(String str) {
    }
}
