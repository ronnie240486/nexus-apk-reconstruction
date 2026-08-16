package p000;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: renamed from: lU */
/* JADX INFO: loaded from: classes2.dex */
public class C4741lU extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: d */
    public static final String f15043d = "Sugar";

    /* JADX INFO: renamed from: a */
    public final C0164CP f15044a;

    /* JADX INFO: renamed from: b */
    public SQLiteDatabase f15045b;

    /* JADX INFO: renamed from: c */
    public int f15046c;

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public static C4741lU m21948k() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public synchronized void close() {
        /*
            r2 = this;
            return
        Lf:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4741lU.close():void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.database.sqlite.SQLiteOpenHelper
    public synchronized SQLiteDatabase getReadableDatabase() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public synchronized SQLiteDatabase m21949j() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
