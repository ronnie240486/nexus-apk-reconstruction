package com.tencent.smtt.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class TbsDownloadConfig {
    public static final int CMD_ID_DOWNLOAD_FILE = 101;
    public static final int CMD_ID_FILE_UPLOAD = 100;
    public static final long DEFAULT_RETRY_INTERVAL_SEC = 86400;
    public static final int ERROR_DOWNLOAD = 2;
    public static final int ERROR_INSTALL = 5;
    public static final int ERROR_LOAD = 6;
    public static final int ERROR_NONE = 1;
    public static final int ERROR_REPORTED = 0;
    public static final int ERROR_UNZIP = 4;
    public static final int ERROR_VERIFY = 3;
    public static final int KEY_TODO = -1;

    /* JADX INFO: renamed from: a */
    private static TbsDownloadConfig f12801a;

    /* JADX INFO: renamed from: b */
    private Context f12802b;

    /* JADX INFO: renamed from: c */
    private int f12803c;
    public SharedPreferences mPreferences;
    public Map<String, Object> mSyncMap;

    public interface TbsConfigKey {
        public static final String KEY_APP_METADATA = "app_metadata";
        public static final String KEY_APP_VERSIONCODE = "app_versioncode";
        public static final String KEY_APP_VERSIONCODE_FOR_SWITCH = "app_versioncode_for_switch";
        public static final String KEY_APP_VERSIONNAME = "app_versionname";
        public static final String KEY_BACKUPCORE_DELFILELIST = "backupcore_delfilelist";
        public static final String KEY_COUNT_REQUEST_FAIL_IN_24HOURS = "count_request_fail_in_24hours";
        public static final String KEY_CPUTYPE_OTHER_STABLE_CORE = "tbs_cpu_type_other_stable_core";
        public static final String KEY_DECOUPLECOREVERSION = "tbs_decouplecoreversion";
        public static final String KEY_DESkEY_TOKEN = "tbs_deskey_token";
        public static final String KEY_DEVICE_CPUABI = "device_cpuabi";
        public static final String KEY_DOWNLOADDECOUPLECORE = "tbs_downloaddecouplecore";
        public static final String KEY_DOWNLOADURL_LIST = "tbs_downloadurl_list";
        public static final String KEY_DOWNLOAD_FAILED_MAX_RETRYTIMES = "tbs_download_failed_max_retrytimes";
        public static final String KEY_DOWNLOAD_FAILED_RETRYTIMES = "tbs_download_failed_retrytimes";
        public static final String KEY_DOWNLOAD_INTERRUPT_CODE = "tbs_download_interrupt_code";
        public static final String KEY_DOWNLOAD_INTERRUPT_CODE_REASON = "tbs_download_interrupt_code_reason";
        public static final String KEY_DOWNLOAD_INTERRUPT_TIME = "tbs_download_interrupt_time";
        public static final String KEY_DOWNLOAD_MAXFLOW = "tbs_download_maxflow";
        public static final String KEY_DOWNLOAD_MIN_FREE_SPACE = "tbs_download_min_free_space";
        public static final String KEY_DOWNLOAD_SINGLE_TIMEOUT = "tbs_single_timeout";
        public static final String KEY_DOWNLOAD_SUCCESS_MAX_RETRYTIMES = "tbs_download_success_max_retrytimes";
        public static final String KEY_DOWNLOAD_SUCCESS_RETRYTIMES = "tbs_download_success_retrytimes";
        public static final String KEY_FULL_PACKAGE = "request_full_package";
        public static final String KEY_GUID = "tbs_guid";
        public static final String KEY_INSTALL_INTERRUPT_CODE = "tbs_install_interrupt_code";
        public static final String KEY_IS_OVERSEA = "is_oversea";
        public static final String KEY_LAST_CHECK = "last_check";
        public static final String KEY_LAST_DOWNLOAD_DECOUPLE_CORE = "last_download_decouple_core";
        public static final String KEY_LAST_DOWNLOAD_STABLE_CORE_OTHER_CPU = "last_download_stable_core_other_cpu";
        public static final String KEY_LAST_REQUEST_SUCCESS = "last_request_success";
        public static final String KEY_LAST_THIRDAPP_SENDREQUEST_COREVERSION = "last_thirdapp_sendrequest_coreversion";
        public static final String KEY_NEEDDOWNLOAD = "tbs_needdownload";
        public static final String KEY_REQUEST_FAIL = "request_fail";
        public static final String KEY_RESPONSECODE = "tbs_responsecode";
        public static final String KEY_RETRY_INTERVAL = "retry_interval";
        public static final String KEY_STOP_PRE_OAT = "tbs_stop_preoat";
        public static final String KEY_SWITCH_BACKUPCORE_ENABLE = "switch_backupcore_enable";
        public static final String KEY_TBSAPKFILESIZE = "tbs_apkfilesize";
        public static final String KEY_TBSAPK_MD5 = "tbs_apk_md5";
        public static final String KEY_TBSDOWLOAD_FLOWCTR = "tbs_flowctr";
        public static final String KEY_TBSDOWNLOADURL = "tbs_downloadurl";
        public static final String KEY_TBSDOWNLOAD_FLOW = "tbs_downloadflow";
        public static final String KEY_TBSDOWNLOAD_STARTTIME = "tbs_downloadstarttime";
        public static final String KEY_TBS_CORE_LOAD_RENAME_FILE_LOCK_WAIT_ENABLE = "tbs_core_load_rename_file_lock_wait_enable";
        public static final String KEY_TBS_DOWNLOAD_V = "tbs_download_version";
        public static final String KEY_TBS_DOWNLOAD_V_TYPE = "tbs_download_version_type";
        public static final String KEY_USE_BACKUP_VERSION = "use_backup_version";
        public static final String KEY_USE_BUGLY = "tbs_use_bugly";
        public static final String KEY_USE_X5 = "use_x5";
    }

    /* JADX WARN: Invalid debug info offset */
    private TbsDownloadConfig(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static synchronized com.tencent.smtt.sdk.TbsDownloadConfig getInstance() {
        /*
            r0 = 0
            return r0
        L7:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.TbsDownloadConfig.getInstance():com.tencent.smtt.sdk.TbsDownloadConfig");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static synchronized com.tencent.smtt.sdk.TbsDownloadConfig getInstance(android.content.Context r2) {
        /*
            r0 = 0
            return r0
        Lf:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.TbsDownloadConfig.getInstance(android.content.Context):com.tencent.smtt.sdk.TbsDownloadConfig");
    }

    /* JADX WARN: Invalid debug info offset */
    public void clear() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public synchronized void commit() {
        /*
            r5 = this;
            return
        L2d:
        L2f:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.TbsDownloadConfig.commit():void");
    }

    /* JADX WARN: Invalid debug info offset */
    public int getCurrentDownloadInterruptCode() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public synchronized int getDownloadFailedMaxRetrytimes() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000b
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public synchronized int getDownloadInterruptCode() {
        /*
            r7 = this;
            r0 = 0
            return r0
        L38:
        L95:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.TbsDownloadConfig.getDownloadInterruptCode():int");
    }

    /* JADX WARN: Invalid debug info offset */
    public synchronized long getDownloadMaxflow() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    public synchronized long getDownloadMinFreeSpace() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    public synchronized long getDownloadSingleTimeout() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    public synchronized int getDownloadSuccessMaxRetrytimes() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public synchronized long getRetryInterval() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public synchronized boolean getTbsCoreLoadRenameFileLockWaitEnable() {
        /*
            r3 = this;
            r0 = 0
            return r0
        Lb:
        Le:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.TbsDownloadConfig.getTbsCoreLoadRenameFileLockWaitEnable():boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    public synchronized boolean isOverSea() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public void saveDownloadInterruptCode() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public synchronized void setDownloadInterruptCode(int r1) {
        /*
            r0 = this;
            return
        L5:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.TbsDownloadConfig.setDownloadInterruptCode(int):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public synchronized void setInstallInterruptCode(int r3) {
        /*
            r2 = this;
            return
        L11:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.TbsDownloadConfig.setInstallInterruptCode(int):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public synchronized void setTbsCoreLoadRenameFileLockWaitEnable(boolean r3) {
        /*
            r2 = this;
            return
        L10:
        L13:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.TbsDownloadConfig.setTbsCoreLoadRenameFileLockWaitEnable(boolean):void");
    }

    @Deprecated
    public void uploadDownloadInterruptCodeIfNeeded(Context context) {
    }
}
