package com.tencent.smtt.sdk;

import android.content.SharedPreferences;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class TbsPVConfig extends TbsBaseConfig {

    /* JADX INFO: renamed from: b */
    private static TbsPVConfig f12866b;
    public SharedPreferences mPreferences;

    public interface TbsPVConfigKey {
        public static final String KEY_CFG_REQUEST_INTERVAL = "tbs_cfg_request_interval";
        public static final String KEY_DISABLED_CORE_VERSION = "disabled_core_version";
        public static final String KEY_DISABLE_LOAD_PROTECTION = "disable_load_protection";
        public static final String KEY_EMERGENT_CORE_VERSION = "emergent_core_version";
        public static final String KEY_ENABLE_NO_SHARE_GRAY = "enable_no_share_gray";
        public static final String KEY_GET_LOCALCOREVERSION_MORETIMES = "get_localcoreversion_moretimes";
        public static final String KEY_IS_DISABLE_HOST_BACKUP_CORE = "disable_host_backup";
        public static final String KEY_READ_APK = "read_apk";
        public static final String KEY_REPORT_COOKIE_SWITCH_STAT = "tbs_report_cookie_stat";
        public static final String KEY_REPORT_CORE_LOAD_PERFORMANCE = "tbs_report_core_load_performance";
        public static final String KEY_REPORT_DOWNLOAD_STAT = "tbs_report_download_stat";
        public static final String KEY_REPORT_INSTALL_STAT = "tbs_report_install_stat";
        public static final String KEY_REPORT_LOAD_STAT = "tbs_report_load_stat";
        public static final String KEY_TBS_CORE_SANDBOX_MODE_ENABLE = "tbs_core_sandbox_mode_enable";
    }

    /* JADX WARN: Invalid debug info offset */
    private TbsPVConfig() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    private boolean m18952a(String str) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static synchronized com.tencent.smtt.sdk.TbsPVConfig getInstance(android.content.Context r2) {
        /*
            r0 = 0
            return r0
        L12:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.TbsPVConfig.getInstance(android.content.Context):com.tencent.smtt.sdk.TbsPVConfig");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0004
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static synchronized void releaseInstance() {
        /*
            return
        L8:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.TbsPVConfig.releaseInstance():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0006
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public synchronized int getCfgRequestMinInterval() {
        /*
            r5 = this;
            r0 = 0
            return r0
        L1d:
        L1f:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.TbsPVConfig.getCfgRequestMinInterval():int");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.sdk.TbsBaseConfig
    public String getConfigFileName() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0006
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public synchronized int getDisabledCoreVersion() {
        /*
            r6 = this;
            r0 = 0
            return r0
        L2c:
        L2e:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.TbsPVConfig.getDisabledCoreVersion():int");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public synchronized int getEmergentCoreVersion() {
        /*
            r3 = this;
            r0 = 0
            return r0
        L17:
        L19:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.TbsPVConfig.getEmergentCoreVersion():int");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public synchronized int getLocalCoreVersionMoreTimes() {
        /*
            r3 = this;
            r0 = 0
            return r0
        L17:
        L19:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.TbsPVConfig.getLocalCoreVersionMoreTimes():int");
    }

    /* JADX WARN: Invalid debug info offset */
    public synchronized Map<TbsLogReport.EventType, Boolean> getLogReportSwitchMap() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public synchronized int getReadApk() {
        /*
            r3 = this;
            r0 = 0
            return r0
        L17:
        L19:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.TbsPVConfig.getReadApk():int");
    }

    /* JADX WARN: Invalid debug info offset */
    public synchronized String getSyncMapValue(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:5:0x0018
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:143)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public synchronized boolean getTbsCoreSandboxModeEnable() {
        /*
            r2 = this;
            r0 = 0
            return r0
        L16:
        L18:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.TbsPVConfig.getTbsCoreSandboxModeEnable():boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:5:0x001e
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:143)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public synchronized boolean isDisableHostBackupCore() {
        /*
            r2 = this;
            r0 = 0
            return r0
        L1c:
        L1e:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.TbsPVConfig.isDisableHostBackupCore():boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:5:0x001e
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:143)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public synchronized boolean isEnableNoCoreGray() {
        /*
            r2 = this;
            r0 = 0
            return r0
        L1c:
        L1e:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.TbsPVConfig.isEnableNoCoreGray():boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:5:0x0018
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:143)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public synchronized boolean isEnableProtection() {
        /*
            r2 = this;
            r0 = 0
            return r0
        L16:
        L18:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.TbsPVConfig.isEnableProtection():boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public synchronized void putData(java.lang.String r2, java.lang.String r3) {
        /*
            r1 = this;
            return
        L8:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.TbsPVConfig.putData(java.lang.String, java.lang.String):void");
    }
}
