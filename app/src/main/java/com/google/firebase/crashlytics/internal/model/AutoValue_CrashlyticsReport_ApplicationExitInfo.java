package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p000.C0786MA;
import p000.C4515i2;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_CrashlyticsReport_ApplicationExitInfo extends CrashlyticsReport.ApplicationExitInfo {
    private final int importance;
    private final int pid;
    private final String processName;
    private final long pss;
    private final int reasonCode;
    private final long rss;
    private final long timestamp;
    private final String traceFile;

    public static final class Builder extends CrashlyticsReport.ApplicationExitInfo.Builder {
        private Integer importance;
        private Integer pid;
        private String processName;
        private Long pss;
        private Integer reasonCode;
        private Long rss;
        private Long timestamp;
        private String traceFile;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo build() {
            String strM21289a = this.pid == null ? " pid" : "";
            if (this.processName == null) {
                strM21289a = C4515i2.m21289a(strM21289a, " processName");
            }
            if (this.reasonCode == null) {
                strM21289a = C4515i2.m21289a(strM21289a, " reasonCode");
            }
            if (this.importance == null) {
                strM21289a = C4515i2.m21289a(strM21289a, " importance");
            }
            if (this.pss == null) {
                strM21289a = C4515i2.m21289a(strM21289a, " pss");
            }
            if (this.rss == null) {
                strM21289a = C4515i2.m21289a(strM21289a, " rss");
            }
            if (this.timestamp == null) {
                strM21289a = C4515i2.m21289a(strM21289a, " timestamp");
            }
            if (strM21289a.isEmpty()) {
                return new AutoValue_CrashlyticsReport_ApplicationExitInfo(this.pid.intValue(), this.processName, this.reasonCode.intValue(), this.importance.intValue(), this.pss.longValue(), this.rss.longValue(), this.timestamp.longValue(), this.traceFile);
            }
            throw new IllegalStateException("Missing required properties:".concat(strM21289a));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo.Builder setImportance(int i) {
            this.importance = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo.Builder setPid(int i) {
            this.pid = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo.Builder setProcessName(String str) {
            if (str == null) {
                throw new NullPointerException("Null processName");
            }
            this.processName = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo.Builder setPss(long j) {
            this.pss = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo.Builder setReasonCode(int i) {
            this.reasonCode = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo.Builder setRss(long j) {
            this.rss = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo.Builder setTimestamp(long j) {
            this.timestamp = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public CrashlyticsReport.ApplicationExitInfo.Builder setTraceFile(@Nullable String str) {
            this.traceFile = str;
            return this;
        }
    }

    private AutoValue_CrashlyticsReport_ApplicationExitInfo(int i, String str, int i2, int i3, long j, long j2, long j3, @Nullable String str2) {
        this.pid = i;
        this.processName = str;
        this.reasonCode = i2;
        this.importance = i3;
        this.pss = j;
        this.rss = j2;
        this.timestamp = j3;
        this.traceFile = str2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.ApplicationExitInfo)) {
            return false;
        }
        CrashlyticsReport.ApplicationExitInfo applicationExitInfo = (CrashlyticsReport.ApplicationExitInfo) obj;
        if (this.pid == applicationExitInfo.getPid() && this.processName.equals(applicationExitInfo.getProcessName()) && this.reasonCode == applicationExitInfo.getReasonCode() && this.importance == applicationExitInfo.getImportance() && this.pss == applicationExitInfo.getPss() && this.rss == applicationExitInfo.getRss() && this.timestamp == applicationExitInfo.getTimestamp()) {
            String str = this.traceFile;
            String traceFile = applicationExitInfo.getTraceFile();
            if (str == null) {
                if (traceFile == null) {
                    return true;
                }
            } else if (str.equals(traceFile)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    @NonNull
    public int getImportance() {
        return this.importance;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    @NonNull
    public int getPid() {
        return this.pid;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    @NonNull
    public String getProcessName() {
        return this.processName;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    @NonNull
    public long getPss() {
        return this.pss;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    @NonNull
    public int getReasonCode() {
        return this.reasonCode;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    @NonNull
    public long getRss() {
        return this.rss;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    @NonNull
    public long getTimestamp() {
        return this.timestamp;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    @Nullable
    public String getTraceFile() {
        return this.traceFile;
    }

    public int hashCode() {
        int iHashCode = (((((((this.pid ^ 1000003) * 1000003) ^ this.processName.hashCode()) * 1000003) ^ this.reasonCode) * 1000003) ^ this.importance) * 1000003;
        long j = this.pss;
        int i = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.rss;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.timestamp;
        int i3 = (i2 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        String str = this.traceFile;
        return i3 ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ApplicationExitInfo{pid=");
        sb.append(this.pid);
        sb.append(", processName=");
        sb.append(this.processName);
        sb.append(", reasonCode=");
        sb.append(this.reasonCode);
        sb.append(", importance=");
        sb.append(this.importance);
        sb.append(", pss=");
        sb.append(this.pss);
        sb.append(", rss=");
        sb.append(this.rss);
        sb.append(", timestamp=");
        sb.append(this.timestamp);
        sb.append(", traceFile=");
        return C0786MA.m3668a(sb, this.traceFile, "}");
    }
}
