package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p000.C0786MA;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_CrashlyticsReport_FilesPayload extends CrashlyticsReport.FilesPayload {
    private final ImmutableList<CrashlyticsReport.FilesPayload.File> files;
    private final String orgId;

    public static final class Builder extends CrashlyticsReport.FilesPayload.Builder {
        private ImmutableList<CrashlyticsReport.FilesPayload.File> files;
        private String orgId;

        public Builder() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.Builder
        public CrashlyticsReport.FilesPayload build() {
            String str = this.files == null ? " files" : "";
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_FilesPayload(this.files, this.orgId);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.Builder
        public CrashlyticsReport.FilesPayload.Builder setFiles(ImmutableList<CrashlyticsReport.FilesPayload.File> immutableList) {
            if (immutableList == null) {
                throw new NullPointerException("Null files");
            }
            this.files = immutableList;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.Builder
        public CrashlyticsReport.FilesPayload.Builder setOrgId(String str) {
            this.orgId = str;
            return this;
        }

        private Builder(CrashlyticsReport.FilesPayload filesPayload) {
            this.files = filesPayload.getFiles();
            this.orgId = filesPayload.getOrgId();
        }
    }

    private AutoValue_CrashlyticsReport_FilesPayload(ImmutableList<CrashlyticsReport.FilesPayload.File> immutableList, @Nullable String str) {
        this.files = immutableList;
        this.orgId = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.FilesPayload)) {
            return false;
        }
        CrashlyticsReport.FilesPayload filesPayload = (CrashlyticsReport.FilesPayload) obj;
        if (this.files.equals(filesPayload.getFiles())) {
            String str = this.orgId;
            String orgId = filesPayload.getOrgId();
            if (str == null) {
                if (orgId == null) {
                    return true;
                }
            } else if (str.equals(orgId)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload
    @NonNull
    public ImmutableList<CrashlyticsReport.FilesPayload.File> getFiles() {
        return this.files;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload
    @Nullable
    public String getOrgId() {
        return this.orgId;
    }

    public int hashCode() {
        int iHashCode = (this.files.hashCode() ^ 1000003) * 1000003;
        String str = this.orgId;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload
    public CrashlyticsReport.FilesPayload.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FilesPayload{files=");
        sb.append(this.files);
        sb.append(", orgId=");
        return C0786MA.m3668a(sb, this.orgId, "}");
    }
}
