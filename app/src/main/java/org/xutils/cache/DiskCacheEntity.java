package org.xutils.cache;

import java.util.Date;
import org.xutils.p021db.annotation.Column;
import org.xutils.p021db.annotation.Table;

/* JADX INFO: loaded from: classes.dex */
@Table(name = "disk_cache")
public final class DiskCacheEntity {

    /* JADX INFO: renamed from: a */
    @Column(isId = true, name = "id")
    public long f17918a;

    /* JADX INFO: renamed from: b */
    @Column(name = "key", property = "UNIQUE")
    public String f17919b;

    /* JADX INFO: renamed from: c */
    @Column(name = "path")
    public String f17920c;

    /* JADX INFO: renamed from: d */
    @Column(name = "textContent")
    public String f17921d;

    /* JADX INFO: renamed from: e */
    @Column(name = "bytesContent")
    public byte[] f17922e;

    /* JADX INFO: renamed from: f */
    @Column(name = "expires")
    public long f17923f;

    /* JADX INFO: renamed from: g */
    @Column(name = "etag")
    public String f17924g;

    /* JADX INFO: renamed from: h */
    @Column(name = "hits")
    public long f17925h;

    /* JADX INFO: renamed from: i */
    @Column(name = "lastModify")
    public Date f17926i;

    /* JADX INFO: renamed from: j */
    @Column(name = "lastAccess")
    public long f17927j;

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public byte[] m26662a() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public String m26663b() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public long m26664c() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public long m26665d() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public long m26666e() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public String m26667f() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public long m26668g() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public Date m26669h() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public String m26670i() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public String m26671j() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public void m26672k(byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public void m26673l(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public void m26674m(long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n */
    public void m26675n(long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o */
    public void m26676o(long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public void m26677p(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q */
    public void m26678q(long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r */
    public void m26679r(Date date) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s */
    public void m26680s(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t */
    public void m26681t(String str) {
    }
}
