package com.p2pengine.core.abs.mpd.manifest;

import androidx.annotation.Nullable;
import com.p2pengine.core.abs.mpd.DashSegmentIndex;
import com.p2pengine.core.abs.mpd.Format;
import java.util.List;

/* JADX INFO: renamed from: com.p2pengine.core.abs.mpd.manifest.g */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3916g {

    /* JADX INFO: renamed from: a */
    public final Format f11687a;

    /* JADX INFO: renamed from: b */
    public final String f11688b;

    /* JADX INFO: renamed from: com.p2pengine.core.abs.mpd.manifest.g$b */
    public static class b extends AbstractC3916g implements DashSegmentIndex {

        /* JADX INFO: renamed from: c */
        public final AbstractC3917h.a f11689c;

        /* JADX WARN: Invalid debug info offset */
        public b(long j, Format format, String str, AbstractC3917h.a aVar, @Nullable List<C3913d> list) {
        }

        @Override // com.p2pengine.core.abs.mpd.manifest.AbstractC3916g
        /* JADX INFO: renamed from: a */
        public DashSegmentIndex mo18105a() {
            return this;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.p2pengine.core.abs.mpd.DashSegmentIndex
        public long getDurationUs(long j, long j2) {
            return 0L;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.p2pengine.core.abs.mpd.DashSegmentIndex
        public long getFirstSegmentNum() {
            return 0L;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.p2pengine.core.abs.mpd.DashSegmentIndex
        public int getSegmentCount(long j) {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.p2pengine.core.abs.mpd.DashSegmentIndex
        public long getSegmentNum(long j, long j2) {
            return 0L;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.p2pengine.core.abs.mpd.DashSegmentIndex
        public C3915f getSegmentUrl(long j) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.p2pengine.core.abs.mpd.DashSegmentIndex
        public long getTimeUs(long j) {
            return 0L;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.p2pengine.core.abs.mpd.DashSegmentIndex
        public boolean isExplicit() {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.p2pengine.core.abs.mpd.manifest.g$c */
    public static class c extends AbstractC3916g {

        /* JADX INFO: renamed from: c */
        @Nullable
        public final C3918i f11690c;

        /* JADX WARN: Invalid debug info offset */
        public c(long j, Format format, String str, AbstractC3917h.e eVar, @Nullable List<C3913d> list, @Nullable String str2, long j2) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.p2pengine.core.abs.mpd.manifest.AbstractC3916g
        @Nullable
        /* JADX INFO: renamed from: a */
        public DashSegmentIndex mo18105a() {
            return null;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public AbstractC3916g(long j, Format format, String str, AbstractC3917h abstractC3917h, @Nullable List<C3913d> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    public /* synthetic */ AbstractC3916g(long j, Format format, String str, AbstractC3917h abstractC3917h, List list, a aVar) {
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public abstract DashSegmentIndex mo18105a();
}
