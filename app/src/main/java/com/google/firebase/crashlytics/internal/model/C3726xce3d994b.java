package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p000.C0978P9;
import p000.C4515i2;

/* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame */
/* JADX INFO: loaded from: classes2.dex */
final class C3726xce3d994b extends CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame {
    private final String file;
    private final int importance;
    private final long offset;

    /* JADX INFO: renamed from: pc */
    private final long f11185pc;
    private final String symbol;

    /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame$Builder */
    public static final class Builder extends CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder {
        private String file;
        private Integer importance;
        private Long offset;

        /* JADX INFO: renamed from: pc */
        private Long f11186pc;
        private String symbol;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame build() {
            String strM21289a = this.f11186pc == null ? " pc" : "";
            if (this.symbol == null) {
                strM21289a = C4515i2.m21289a(strM21289a, " symbol");
            }
            if (this.offset == null) {
                strM21289a = C4515i2.m21289a(strM21289a, " offset");
            }
            if (this.importance == null) {
                strM21289a = C4515i2.m21289a(strM21289a, " importance");
            }
            if (strM21289a.isEmpty()) {
                return new C3726xce3d994b(this.f11186pc.longValue(), this.symbol, this.file, this.offset.longValue(), this.importance.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strM21289a));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder setFile(String str) {
            this.file = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder setImportance(int i) {
            this.importance = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder setOffset(long j) {
            this.offset = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder setPc(long j) {
            this.f11186pc = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder
        public CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder setSymbol(String str) {
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            this.symbol = str;
            return this;
        }
    }

    private C3726xce3d994b(long j, String str, @Nullable String str2, long j2, int i) {
        this.f11185pc = j;
        this.symbol = str;
        this.file = str2;
        this.offset = j2;
        this.importance = i;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame frame = (CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame) obj;
        return this.f11185pc == frame.getPc() && this.symbol.equals(frame.getSymbol()) && ((str = this.file) != null ? str.equals(frame.getFile()) : frame.getFile() == null) && this.offset == frame.getOffset() && this.importance == frame.getImportance();
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame
    @Nullable
    public String getFile() {
        return this.file;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame
    public int getImportance() {
        return this.importance;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame
    public long getOffset() {
        return this.offset;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame
    public long getPc() {
        return this.f11185pc;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame
    @NonNull
    public String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        long j = this.f11185pc;
        int iHashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.symbol.hashCode()) * 1000003;
        String str = this.file;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j2 = this.offset;
        return this.importance ^ ((iHashCode2 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Frame{pc=");
        sb.append(this.f11185pc);
        sb.append(", symbol=");
        sb.append(this.symbol);
        sb.append(", file=");
        sb.append(this.file);
        sb.append(", offset=");
        sb.append(this.offset);
        sb.append(", importance=");
        return C0978P9.m4377a(sb, this.importance, "}");
    }
}
