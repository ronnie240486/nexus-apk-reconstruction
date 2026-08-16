package org.xutils.p021db.converter;

import android.database.Cursor;
import org.xutils.p021db.sqlite.ColumnDbType;

/* JADX INFO: loaded from: classes.dex */
public interface ColumnConverter<T> {
    /* JADX INFO: renamed from: a */
    ColumnDbType mo26883a();

    /* JADX INFO: renamed from: b */
    T mo26884b(Cursor cursor, int i);

    /* JADX INFO: renamed from: c */
    Object mo26885c(T t);
}
