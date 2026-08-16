package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import androidx.annotation.RequiresApi;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.datatransport.runtime.util.PriorityMapping;
import p000.C1052QI;
import p000.C4221dR;
import p000.C4315et;
import p000.C4378ft;
import p000.C4442gt;
import p000.C4615jV;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(api = 21)
public class JobInfoSchedulerService extends JobService {
    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onStartJob$0(JobParameters jobParameters) {
        C4315et.m20162a(this, jobParameters, false);
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(final JobParameters jobParameters) {
        String strM4619a = C1052QI.m4619a(C4378ft.m20685a(jobParameters), "backendName");
        String strM4619a2 = C1052QI.m4619a(C4378ft.m20685a(jobParameters), "extras");
        int iM19918a = C4221dR.m19918a(C4378ft.m20685a(jobParameters), C4615jV.f14798l);
        int iM19918a2 = C4221dR.m19918a(C4378ft.m20685a(jobParameters), "attemptNumber");
        TransportRuntime.initialize(C4442gt.m20876a(this));
        TransportContext.Builder priority = TransportContext.builder().setBackendName(strM4619a).setPriority(PriorityMapping.valueOf(iM19918a));
        if (strM4619a2 != null) {
            priority.setExtras(Base64.decode(strM4619a2, 0));
        }
        TransportRuntime.getInstance().getUploader().upload(priority.build(), iM19918a2, new Runnable(this, jobParameters) { // from class: ht

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ JobInfoSchedulerService f14436a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ JobParameters f14437b;

            /* JADX WARN: Invalid debug info offset */
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
