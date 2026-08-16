package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: renamed from: rd */
/* JADX INFO: loaded from: classes.dex */
public class C5316rd extends SQLiteOpenHelper implements InterfaceC0167CS {

    /* JADX INFO: renamed from: a */
    public static final String f18630a = "SourceInfo";

    /* JADX INFO: renamed from: b */
    public static final String f18631b = "_id";

    /* JADX INFO: renamed from: c */
    public static final String f18632c = "url";

    /* JADX INFO: renamed from: e */
    public static final String f18634e = "mime";

    /* JADX INFO: renamed from: g */
    public static final String f18636g = "CREATE TABLE SourceInfo (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,url TEXT NOT NULL,mime TEXT,length INTEGER);";

    /* JADX INFO: renamed from: d */
    public static final String f18633d = "length";

    /* JADX INFO: renamed from: f */
    public static final String[] f18635f = {"_id", "url", f18633d, "mime"};

    /* JADX WARN: Invalid debug info offset */
    public C5316rd(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0004
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // p000.InterfaceC0167CS
    public p000.C0095BS get(java.lang.String r11) {
        /*
            r10 = this;
            r0 = 0
            return r0
        L27:
        L2f:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C5316rd.get(java.lang.String):BS");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC0167CS
    /* JADX INFO: renamed from: j */
    public void mo996j(String str, C0095BS c0095bs) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public final C0095BS m27908k(Cursor cursor) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public final ContentValues m27909p(C0095BS c0095bs) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC0167CS
    public void release() {
    }
}
