package com.tencent.smtt.sdk;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public class TbsVideoCacheTask {
    public static final String KEY_VIDEO_CACHE_PARAM_FILENAME = "filename";
    public static final String KEY_VIDEO_CACHE_PARAM_FOLDERPATH = "folderPath";
    public static final String KEY_VIDEO_CACHE_PARAM_HEADER = "header";
    public static final String KEY_VIDEO_CACHE_PARAM_URL = "url";

    /* JADX INFO: renamed from: a */
    Context f12895a;

    /* JADX INFO: renamed from: b */
    TbsVideoCacheListener f12896b;

    /* JADX INFO: renamed from: c */
    private boolean f12897c;

    /* JADX INFO: renamed from: d */
    private C4131o f12898d;

    /* JADX INFO: renamed from: e */
    private String f12899e;

    /* JADX INFO: renamed from: f */
    private String f12900f;

    /* JADX INFO: renamed from: g */
    private Object f12901g;

    /* JADX WARN: Invalid debug info offset */
    public TbsVideoCacheTask(Context context, Bundle bundle, TbsVideoCacheListener tbsVideoCacheListener) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    private void m18962a(Bundle bundle) {
    }

    /* JADX WARN: Invalid debug info offset */
    public long getContentLength() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getDownloadedSize() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getProgress() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getTaskID() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getTaskUrl() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void pauseTask() {
    }

    /* JADX WARN: Invalid debug info offset */
    public void removeTask(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void resumeTask() {
    }

    /* JADX WARN: Invalid debug info offset */
    public void stopTask() {
    }
}
