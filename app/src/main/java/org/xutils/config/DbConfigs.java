package org.xutils.config;

import org.xutils.DbManager;

/* JADX INFO: loaded from: classes.dex */
public enum DbConfigs {
    HTTP(new DbManager.DaoConfig().m26635j("xUtils_http_cache.db").m26638m(2).m26636k(new DbManager.DbOpenListener() { // from class: org.xutils.config.DbConfigs.2
        /* JADX WARN: Invalid debug info offset */
        @Override // org.xutils.DbManager.DbOpenListener
        /* JADX INFO: renamed from: a */
        public void mo26640a(DbManager dbManager) {
        }
    }).m26637l(new DbManager.DbUpgradeListener() { // from class: org.xutils.config.DbConfigs.1
        /* JADX WARN: Invalid debug info offset */
        @Override // org.xutils.DbManager.DbUpgradeListener
        /* JADX INFO: renamed from: a */
        public void mo26641a(DbManager dbManager, int i, int i2) {
        }
    })),
    COOKIE(new DbManager.DaoConfig().m26635j("xUtils_http_cookie.db").m26638m(1).m26636k(new DbManager.DbOpenListener() { // from class: org.xutils.config.DbConfigs.4
        /* JADX WARN: Invalid debug info offset */
        @Override // org.xutils.DbManager.DbOpenListener
        /* JADX INFO: renamed from: a */
        public void mo26640a(DbManager dbManager) {
        }
    }).m26637l(new DbManager.DbUpgradeListener() { // from class: org.xutils.config.DbConfigs.3
        /* JADX WARN: Invalid debug info offset */
        @Override // org.xutils.DbManager.DbUpgradeListener
        /* JADX INFO: renamed from: a */
        public void mo26641a(DbManager dbManager, int i, int i2) {
        }
    }));

    private DbManager.DaoConfig config;

    DbConfigs(DbManager.DaoConfig daoConfig) {
        this.config = daoConfig;
    }

    public DbManager.DaoConfig getConfig() {
        return this.config;
    }
}
