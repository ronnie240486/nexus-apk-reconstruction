package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.gson.annotations.SerializedName;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: nU */
/* JADX INFO: loaded from: classes.dex */
public class C4875nU {
    public static final String SUGAR = "Sugar";

    /* JADX INFO: renamed from: id */
    @SerializedName("sugar_record_id_expose_ser_deser")
    private Long f15310id;

    /* JADX INFO: renamed from: nU$a */
    /* JADX INFO: loaded from: classes2.dex */
    public static class a<E> implements Iterator<E> {

        /* JADX INFO: renamed from: a */
        public Class<E> f15311a;

        /* JADX INFO: renamed from: b */
        public Cursor f15312b;

        /* JADX WARN: Invalid debug info offset */
        public a(Class<E> cls, Cursor cursor) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x000b
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        /* JADX INFO: renamed from: a */
        public void m22374a() {
            /*
                r1 = this;
                return
            L10:
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C4875nU.a.m22374a():void");
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0018
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // java.util.Iterator
        public E next() {
            /*
                r3 = this;
                r0 = 0
                return r0
            L4d:
            L4f:
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C4875nU.a.next():java.lang.Object");
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.Iterator
        public void remove() {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static SQLiteDatabase m22373a() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static <T> long count(Class<T> cls) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    public static <T> long count(Class<T> cls, String str, String... strArr) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0011
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static <T> long count(java.lang.Class<T> r0, java.lang.String r1, java.lang.String[] r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
        /*
            r0 = 0
            return r0
        L43:
        L48:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4875nU.count(java.lang.Class, java.lang.String, java.lang.String[], java.lang.String, java.lang.String, java.lang.String):long");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0011
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static boolean delete(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4875nU.delete(java.lang.Object):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    public static <T> int deleteAll(Class<T> cls) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public static <T> int deleteAll(Class<T> cls, String str, String... strArr) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0006
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static <T> int deleteInTx(java.util.Collection<T> r6) {
        /*
            r0 = 0
            return r0
        L24:
        L26:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4875nU.deleteInTx(java.util.Collection):int");
    }

    /* JADX WARN: Invalid debug info offset */
    public static <T> int deleteInTx(T... tArr) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public static void executeQuery(String str, String... strArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static <T> List<T> find(Class<T> cls, String str, String... strArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static <T> List<T> find(Class<T> cls, String str, String[] strArr, String str2, String str3, String str4) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static <T> Iterator<T> findAll(Class<T> cls) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static <T> Iterator<T> findAsIterator(Class<T> cls, String str, String... strArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static <T> Iterator<T> findAsIterator(Class<T> cls, String str, String[] strArr, String str2, String str3, String str4) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static <T> T findById(Class<T> cls, Integer num) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static <T> T findById(Class<T> cls, Long l) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static <T> List<T> findById(Class<T> cls, String... strArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static <T> List<T> findOneToMany(Class<T> cls, String str, Object obj, Long l) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static <T> List<T> findWithQuery(Class<T> cls, String str, String... strArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static <T> Iterator<T> findWithQueryAsIterator(Class<T> cls, String str, String... strArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static <T> T first(Class<T> cls) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static <T> Cursor getCursor(Class<T> cls, String str, String[] strArr, String str2, String str3, String str4) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static <T> List<T> getEntitiesFromCursor(Cursor cursor, Class<T> cls) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0005
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static <T> java.util.List<T> getEntitiesFromCursor(android.database.Cursor r4, java.lang.Class<T> r5, java.lang.String r6, java.lang.Object r7) {
        /*
            r0 = 0
            return r0
        L32:
        L34:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4875nU.getEntitiesFromCursor(android.database.Cursor, java.lang.Class, java.lang.String, java.lang.Object):java.util.List");
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean isSugarEntity(Class<?> cls) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public static <T> T last(Class<T> cls) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static <T> List<T> listAll(Class<T> cls) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static <T> List<T> listAll(Class<T> cls, String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static String[] replaceArgs(String[] strArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0074
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static long save(android.database.sqlite.SQLiteDatabase r8, java.lang.Object r9) {
        /*
            r0 = 0
            return r0
        L7c:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4875nU.save(android.database.sqlite.SQLiteDatabase, java.lang.Object):long");
    }

    /* JADX WARN: Invalid debug info offset */
    public static long save(Object obj) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0005
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static <T> void saveInTx(java.util.Collection<T> r5) {
        /*
            return
        L1e:
        L20:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4875nU.saveInTx(java.util.Collection):void");
    }

    /* JADX WARN: Invalid debug info offset */
    public static <T> void saveInTx(T... tArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static <T> long sum(Class<T> cls, String str) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0011
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static <T> long sum(java.lang.Class<T> r3, java.lang.String r4, java.lang.String r5, java.lang.String... r6) {
        /*
            r0 = 0
            return r0
        L4b:
        L50:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4875nU.sum(java.lang.Class, java.lang.String, java.lang.String, java.lang.String[]):long");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x003c
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static long update(android.database.sqlite.SQLiteDatabase r8, java.lang.Object r9) {
        /*
            r0 = 0
            return r0
        L57:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4875nU.update(android.database.sqlite.SQLiteDatabase, java.lang.Object):long");
    }

    /* JADX WARN: Invalid debug info offset */
    public static long update(Object obj) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0005
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static <T> void updateInTx(java.util.Collection<T> r5) {
        /*
            return
        L1e:
        L20:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4875nU.updateInTx(java.util.Collection):void");
    }

    /* JADX WARN: Invalid debug info offset */
    public static <T> void updateInTx(T... tArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean delete() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public Long getId() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void inflate(Cursor cursor) {
    }

    /* JADX WARN: Invalid debug info offset */
    public long save() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    public void setId(Long l) {
    }

    /* JADX WARN: Invalid debug info offset */
    public long update() {
        return 0L;
    }
}
