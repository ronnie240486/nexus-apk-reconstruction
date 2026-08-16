package org.xutils.http.cookie;

import java.net.HttpCookie;
import java.net.URI;
import org.xutils.p021db.annotation.Column;
import org.xutils.p021db.annotation.Table;
import p000.C1051QH;

/* JADX INFO: loaded from: classes.dex */
@Table(name = "cookie", onCreated = "CREATE UNIQUE INDEX index_cookie_unique ON cookie(\"name\",\"domain\",\"path\")")
final class CookieEntity {

    /* JADX INFO: renamed from: n */
    public static final long f18186n = System.currentTimeMillis() + 3110400000000L;

    /* JADX INFO: renamed from: a */
    @Column(isId = true, name = "id")
    public long f18187a;

    /* JADX INFO: renamed from: b */
    @Column(name = "uri")
    public String f18188b;

    /* JADX INFO: renamed from: c */
    @Column(name = "name")
    public String f18189c;

    /* JADX INFO: renamed from: d */
    @Column(name = "value")
    public String f18190d;

    /* JADX INFO: renamed from: e */
    @Column(name = "comment")
    public String f18191e;

    /* JADX INFO: renamed from: f */
    @Column(name = "commentURL")
    public String f18192f;

    /* JADX INFO: renamed from: g */
    @Column(name = "discard")
    public boolean f18193g;

    /* JADX INFO: renamed from: h */
    @Column(name = "domain")
    public String f18194h;

    /* JADX INFO: renamed from: i */
    @Column(name = "expiry")
    public long f18195i;

    /* JADX INFO: renamed from: j */
    @Column(name = "path")
    public String f18196j;

    /* JADX INFO: renamed from: k */
    @Column(name = "portList")
    public String f18197k;

    /* JADX INFO: renamed from: l */
    @Column(name = "secure")
    public boolean f18198l;

    /* JADX INFO: renamed from: m */
    @Column(name = C1051QH.f2696b)
    public int f18199m;

    /* JADX WARN: Invalid debug info offset */
    public CookieEntity() {
    }

    /* JADX WARN: Invalid debug info offset */
    public CookieEntity(URI uri, HttpCookie httpCookie) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public long m27124a() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public String m27125b() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public boolean m27126c() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public void m27127d(long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public void m27128e(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public HttpCookie m27129f() {
        return null;
    }
}
