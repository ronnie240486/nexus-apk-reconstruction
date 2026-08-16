package com.p2pengine.core.abs.mpd.manifest;

import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: renamed from: com.p2pengine.core.abs.mpd.manifest.h */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3917h {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final C3915f f11691a;

    /* JADX INFO: renamed from: b */
    public final long f11692b;

    /* JADX INFO: renamed from: c */
    public final long f11693c;

    /* JADX INFO: renamed from: com.p2pengine.core.abs.mpd.manifest.h$a */
    public static abstract class a extends AbstractC3917h {

        /* JADX INFO: renamed from: d */
        public final long f11694d;

        /* JADX INFO: renamed from: e */
        public final long f11695e;

        /* JADX INFO: renamed from: f */
        @Nullable
        public final List<d> f11696f;

        /* JADX WARN: Invalid debug info offset */
        public a(@Nullable C3915f c3915f, long j, long j2, long j3, long j4, @Nullable List<d> list) {
        }

        /* JADX INFO: renamed from: a */
        public abstract int mo18108a(long j);

        /* JADX INFO: renamed from: a */
        public abstract C3915f mo18109a(AbstractC3916g abstractC3916g, long j);

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public final long m18110b(long j) {
            return 0L;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public boolean mo18111b() {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.p2pengine.core.abs.mpd.manifest.h$b */
    public static final class b extends a {

        /* JADX INFO: renamed from: g */
        @Nullable
        public final List<C3915f> f11697g;

        /* JADX WARN: Invalid debug info offset */
        public b(C3915f c3915f, long j, long j2, long j3, long j4, @Nullable List<d> list, @Nullable List<C3915f> list2) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.p2pengine.core.abs.mpd.manifest.AbstractC3917h.a
        /* JADX INFO: renamed from: a */
        public int mo18108a(long j) {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.p2pengine.core.abs.mpd.manifest.AbstractC3917h.a
        /* JADX INFO: renamed from: a */
        public C3915f mo18109a(AbstractC3916g abstractC3916g, long j) {
            return null;
        }

        @Override // com.p2pengine.core.abs.mpd.manifest.AbstractC3917h.a
        /* JADX INFO: renamed from: b */
        public boolean mo18111b() {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.p2pengine.core.abs.mpd.manifest.h$c */
    public static final class c extends a {

        /* JADX INFO: renamed from: g */
        @Nullable
        public final C3919j f11698g;

        /* JADX INFO: renamed from: h */
        @Nullable
        public final C3919j f11699h;

        /* JADX INFO: renamed from: i */
        public final long f11700i;

        /* JADX WARN: Invalid debug info offset */
        public c(C3915f c3915f, long j, long j2, long j3, long j4, long j5, @Nullable List<d> list, @Nullable C3919j c3919j, @Nullable C3919j c3919j2) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.p2pengine.core.abs.mpd.manifest.AbstractC3917h.a
        /* JADX INFO: renamed from: a */
        public int mo18108a(long j) {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.p2pengine.core.abs.mpd.manifest.AbstractC3917h
        @Nullable
        /* JADX INFO: renamed from: a */
        public C3915f mo18107a(AbstractC3916g abstractC3916g) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.p2pengine.core.abs.mpd.manifest.AbstractC3917h.a
        /* JADX INFO: renamed from: a */
        public C3915f mo18109a(AbstractC3916g abstractC3916g, long j) {
            return null;
        }
    }

    /* JADX INFO: renamed from: com.p2pengine.core.abs.mpd.manifest.h$d */
    public static final class d {

        /* JADX INFO: renamed from: a */
        public final long f11701a;

        /* JADX INFO: renamed from: b */
        public final long f11702b;

        /* JADX WARN: Invalid debug info offset */
        public d(long j, long j2) {
        }

        /* JADX WARN: Invalid debug info offset */
        public boolean equals(@Nullable Object obj) {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        public int hashCode() {
            return 0;
        }
    }

    /* JADX INFO: renamed from: com.p2pengine.core.abs.mpd.manifest.h$e */
    public static class e extends AbstractC3917h {

        /* JADX INFO: renamed from: d */
        public final long f11703d;

        /* JADX INFO: renamed from: e */
        public final long f11704e;

        /* JADX WARN: Invalid debug info offset */
        public e() {
        }

        /* JADX WARN: Invalid debug info offset */
        public e(@Nullable C3915f c3915f, long j, long j2, long j3, long j4) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Nullable
        /* JADX INFO: renamed from: b */
        public C3915f m18112b() {
            return null;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public AbstractC3917h(@Nullable C3915f c3915f, long j, long j2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public long m18106a() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    @Nullable
    /* JADX INFO: renamed from: a */
    public C3915f mo18107a(AbstractC3916g abstractC3916g) {
        return null;
    }
}
