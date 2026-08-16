package com.google.android.exoplayer2.scheduler;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
import androidx.annotation.RequiresPermission;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import p000.C1052QI;
import p000.C4221dR;
import p000.C4251dt;
import p000.C4378ft;
import p000.C5206pt;
import p000.C5512uJ;
import p000.C5583vJ;

/* JADX INFO: loaded from: classes2.dex */
@TargetApi(21)
public final class PlatformScheduler implements Scheduler {
    private static final boolean DEBUG = false;
    private static final String KEY_REQUIREMENTS = "requirements";
    private static final String KEY_SERVICE_ACTION = "service_action";
    private static final String KEY_SERVICE_PACKAGE = "service_package";
    private static final String TAG = "PlatformScheduler";
    private final int jobId;
    private final JobScheduler jobScheduler;
    private final ComponentName jobServiceComponentName;

    public static final class PlatformSchedulerService extends JobService {
        @Override // android.app.job.JobService
        public boolean onStartJob(JobParameters jobParameters) {
            PlatformScheduler.logd("PlatformSchedulerService started");
            PersistableBundle persistableBundleM20685a = C4378ft.m20685a(jobParameters);
            if (!new Requirements(C4221dR.m19918a(persistableBundleM20685a, "requirements")).checkRequirements(this)) {
                PlatformScheduler.logd("Requirements are not met");
                C5583vJ.m28800a(this, jobParameters, true);
                return false;
            }
            PlatformScheduler.logd("Requirements are met");
            String strM4619a = C1052QI.m4619a(persistableBundleM20685a, PlatformScheduler.KEY_SERVICE_ACTION);
            String strM4619a2 = C1052QI.m4619a(persistableBundleM20685a, PlatformScheduler.KEY_SERVICE_PACKAGE);
            Intent intent = new Intent((String) Assertions.checkNotNull(strM4619a)).setPackage(strM4619a2);
            PlatformScheduler.logd("Starting service action: " + strM4619a + " package: " + strM4619a2);
            Util.startForegroundService(this, intent);
            return false;
        }

        @Override // android.app.job.JobService
        public boolean onStopJob(JobParameters jobParameters) {
            return false;
        }
    }

    @RequiresPermission("android.permission.RECEIVE_BOOT_COMPLETED")
    public PlatformScheduler(Context context, int i) {
        Context applicationContext = context.getApplicationContext();
        this.jobId = i;
        this.jobServiceComponentName = new ComponentName(applicationContext, (Class<?>) PlatformSchedulerService.class);
        this.jobScheduler = C5206pt.m27562a(applicationContext.getSystemService("jobscheduler"));
    }

    private static JobInfo buildJobInfo(int i, ComponentName componentName, Requirements requirements, String str, String str2) {
        JobInfo.Builder builder = new JobInfo.Builder(i, componentName);
        if (requirements.isUnmeteredNetworkRequired()) {
            builder.setRequiredNetworkType(2);
        } else if (requirements.isNetworkRequired()) {
            builder.setRequiredNetworkType(1);
        }
        builder.setRequiresDeviceIdle(requirements.isIdleRequired());
        builder.setRequiresCharging(requirements.isChargingRequired());
        builder.setPersisted(true);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString(KEY_SERVICE_ACTION, str);
        persistableBundle.putString(KEY_SERVICE_PACKAGE, str2);
        persistableBundle.putInt("requirements", requirements.getRequirements());
        builder.setExtras(persistableBundle);
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void logd(String str) {
    }

    @Override // com.google.android.exoplayer2.scheduler.Scheduler
    public boolean cancel() {
        logd("Canceling job: " + this.jobId);
        C5512uJ.m28599a(this.jobScheduler, this.jobId);
        return true;
    }

    @Override // com.google.android.exoplayer2.scheduler.Scheduler
    public boolean schedule(Requirements requirements, String str, String str2) {
        int iM19991a = C4251dt.m19991a(this.jobScheduler, buildJobInfo(this.jobId, this.jobServiceComponentName, requirements, str2, str));
        logd("Scheduling job: " + this.jobId + " result: " + iM19991a);
        return iM19991a == 1;
    }
}
