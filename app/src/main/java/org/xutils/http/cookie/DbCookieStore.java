package org.xutils.http.cookie;

import android.text.TextUtils;
import com.squareup.picasso.NetworkRequestHandler;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import org.xutils.C5141x;
import org.xutils.DbManager;
import org.xutils.common.task.PriorityExecutor;
import org.xutils.common.util.LogUtil;
import org.xutils.config.DbConfigs;
import org.xutils.p021db.DbManagerImpl;
import org.xutils.p021db.DbModelSelector;
import org.xutils.p021db.Selector;
import org.xutils.p021db.sqlite.WhereBuilder;
import org.xutils.p021db.table.DbModel;

/* JADX INFO: loaded from: classes.dex */
public enum DbCookieStore implements CookieStore {
    INSTANCE;

    private static final int LIMIT_COUNT = 5000;
    private static final long TRIM_TIME_SPAN = 1000;

    /* JADX INFO: renamed from: db */
    private DbManager f18200db;
    private final Executor trimExecutor = new PriorityExecutor(1, true);
    private long lastTrimTime = 0;

    DbCookieStore() {
        C5141x.Ext.f18354c.mo26735d(new Runnable(this) { // from class: org.xutils.http.cookie.DbCookieStore.1

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ DbCookieStore f18201a;

            /* JADX WARN: Invalid debug info offset */
            @Override // java.lang.Runnable
            public void run() {
            }
        });
    }

    private URI getEffectiveURI(URI uri) {
        try {
            return new URI(NetworkRequestHandler.f12458d, uri.getHost(), uri.getPath(), null, null);
        } catch (Throwable th) {
            LogUtil.m26815k(th.getMessage(), th);
            return uri;
        }
    }

    private void trimSize() {
        this.trimExecutor.execute(new Runnable(this) { // from class: org.xutils.http.cookie.DbCookieStore.2

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ DbCookieStore f18202a;

            /* JADX WARN: Invalid debug info offset */
            /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
                jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0025
                	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
                	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
                */
            @Override // java.lang.Runnable
            public void run() {
                /*
                    r10 = this;
                    return
                L45:
                L8f:
                */
                throw new UnsupportedOperationException("Method not decompiled: org.xutils.http.cookie.DbCookieStore.RunnableC51312.run():void");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tryInit() {
        if (this.f18200db == null) {
            synchronized (this) {
                try {
                    if (this.f18200db == null) {
                        try {
                            DbManager dbManagerM26835w = DbManagerImpl.m26835w(DbConfigs.COOKIE.getConfig());
                            this.f18200db = dbManagerM26835w;
                            dbManagerM26835w.mo26616h(CookieEntity.class, WhereBuilder.m26931e("expiry", "=", -1L));
                        } catch (Throwable th) {
                            LogUtil.m26808d(th.getMessage(), th);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // java.net.CookieStore
    public void add(URI uri, HttpCookie httpCookie) {
        if (httpCookie == null) {
            return;
        }
        tryInit();
        try {
            this.f18200db.mo26623w0(new CookieEntity(getEffectiveURI(uri), httpCookie));
        } catch (Throwable th) {
            LogUtil.m26808d(th.getMessage(), th);
        }
        trimSize();
    }

    @Override // java.net.CookieStore
    public List<HttpCookie> get(URI uri) {
        if (uri == null) {
            throw new NullPointerException("uri is null");
        }
        tryInit();
        URI effectiveURI = getEffectiveURI(uri);
        ArrayList arrayList = new ArrayList();
        try {
            Selector selectorMo26624y0 = this.f18200db.mo26624y0(CookieEntity.class);
            WhereBuilder whereBuilderM26930d = WhereBuilder.m26930d();
            String host = effectiveURI.getHost();
            if (!TextUtils.isEmpty(host)) {
                WhereBuilder whereBuilderM26937h = WhereBuilder.m26931e("domain", "=", host).m26937h("domain", "=", "." + host);
                int iIndexOf = host.indexOf(".");
                int iLastIndexOf = host.lastIndexOf(".");
                if (iIndexOf > 0 && iLastIndexOf > iIndexOf) {
                    String strSubstring = host.substring(iIndexOf, host.length());
                    if (!TextUtils.isEmpty(strSubstring)) {
                        whereBuilderM26937h.m26937h("domain", "=", strSubstring);
                    }
                }
                whereBuilderM26930d.m26933b(whereBuilderM26937h);
            }
            String path = effectiveURI.getPath();
            if (!TextUtils.isEmpty(path)) {
                WhereBuilder whereBuilderM26937h2 = WhereBuilder.m26931e("path", "=", path).m26937h("path", "=", "/").m26937h("path", "=", null);
                while (true) {
                    int iLastIndexOf2 = path.lastIndexOf("/");
                    if (iLastIndexOf2 <= 0) {
                        break;
                    }
                    path = path.substring(0, iLastIndexOf2);
                    whereBuilderM26937h2.m26937h("path", "=", path);
                }
                whereBuilderM26930d.m26933b(whereBuilderM26937h2);
            }
            whereBuilderM26930d.m26937h("uri", "=", effectiveURI.toString());
            selectorMo26624y0.f18034b = whereBuilderM26930d;
            List<CookieEntity> listM26866e = selectorMo26624y0.m26866e();
            if (listM26866e != null) {
                for (CookieEntity cookieEntity : listM26866e) {
                    if (!cookieEntity.m27126c()) {
                        arrayList.add(cookieEntity.m27129f());
                    }
                }
            }
        } catch (Throwable th) {
            LogUtil.m26808d(th.getMessage(), th);
        }
        return arrayList;
    }

    @Override // java.net.CookieStore
    public List<HttpCookie> getCookies() {
        tryInit();
        ArrayList arrayList = new ArrayList();
        try {
            List<CookieEntity> listMo26611c = this.f18200db.mo26611c(CookieEntity.class);
            if (listMo26611c != null) {
                for (CookieEntity cookieEntity : listMo26611c) {
                    if (!cookieEntity.m27126c()) {
                        arrayList.add(cookieEntity.m27129f());
                    }
                }
            }
        } catch (Throwable th) {
            LogUtil.m26808d(th.getMessage(), th);
        }
        return arrayList;
    }

    @Override // java.net.CookieStore
    public List<URI> getURIs() {
        tryInit();
        ArrayList arrayList = new ArrayList();
        try {
            Selector selectorMo26624y0 = this.f18200db.mo26624y0(CookieEntity.class);
            selectorMo26624y0.getClass();
            List<DbModel> listM26847d = new DbModelSelector((Selector<?>) selectorMo26624y0, new String[]{"uri"}).m26847d();
            if (listM26847d != null) {
                Iterator<DbModel> it = listM26847d.iterator();
                while (it.hasNext()) {
                    String strM26970j = it.next().m26970j("uri");
                    if (!TextUtils.isEmpty(strM26970j)) {
                        try {
                            arrayList.add(new URI(strM26970j));
                        } catch (Throwable th) {
                            LogUtil.m26808d(th.getMessage(), th);
                            try {
                                this.f18200db.mo26616h(CookieEntity.class, WhereBuilder.m26931e("uri", "=", strM26970j));
                            } catch (Throwable th2) {
                                LogUtil.m26808d(th2.getMessage(), th2);
                            }
                        }
                    }
                }
            }
        } catch (Throwable th3) {
            LogUtil.m26808d(th3.getMessage(), th3);
        }
        return arrayList;
    }

    @Override // java.net.CookieStore
    public boolean remove(URI uri, HttpCookie httpCookie) {
        if (httpCookie == null) {
            return true;
        }
        tryInit();
        try {
            WhereBuilder whereBuilderM26931e = WhereBuilder.m26931e("name", "=", httpCookie.getName());
            String domain = httpCookie.getDomain();
            if (!TextUtils.isEmpty(domain)) {
                whereBuilderM26931e.m26932a("domain", "=", domain);
            }
            String path = httpCookie.getPath();
            if (!TextUtils.isEmpty(path)) {
                if (path.length() > 1 && path.endsWith("/")) {
                    path = path.substring(0, path.length() - 1);
                }
                whereBuilderM26931e.m26932a("path", "=", path);
            }
            this.f18200db.mo26616h(CookieEntity.class, whereBuilderM26931e);
            return true;
        } catch (Throwable th) {
            LogUtil.m26808d(th.getMessage(), th);
            return false;
        }
    }

    @Override // java.net.CookieStore
    public boolean removeAll() {
        tryInit();
        try {
            this.f18200db.mo26608W(CookieEntity.class);
            return true;
        } catch (Throwable th) {
            LogUtil.m26808d(th.getMessage(), th);
            return true;
        }
    }
}
