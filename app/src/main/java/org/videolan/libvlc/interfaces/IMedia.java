package org.videolan.libvlc.interfaces;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public interface IMedia extends IVLCObject<Event> {

    public static class AudioTrack extends Track {

        /* JADX INFO: renamed from: j */
        public final int f17490j;

        /* JADX INFO: renamed from: k */
        public final int f17491k;

        /* JADX WARN: Invalid debug info offset */
        public AudioTrack(String str, String str2, int i, int i2, int i3, int i4, String str3, String str4, int i5, int i6) {
        }
    }

    public static class Event extends AbstractVLCEvent {

        /* JADX INFO: renamed from: f */
        public static final int f17492f = 0;

        /* JADX INFO: renamed from: g */
        public static final int f17493g = 1;

        /* JADX INFO: renamed from: h */
        public static final int f17494h = 2;

        /* JADX INFO: renamed from: i */
        public static final int f17495i = 3;

        /* JADX INFO: renamed from: j */
        public static final int f17496j = 5;

        /* JADX INFO: renamed from: k */
        public static final int f17497k = 6;

        /* JADX WARN: Invalid debug info offset */
        public Event(int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        public Event(int i, long j) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public int m25437b() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: c */
        public int m25438c() {
            return 0;
        }
    }

    public interface EventListener extends AbstractVLCEvent.Listener<Event> {
    }

    public static class Meta {

        /* JADX INFO: renamed from: a */
        public static final int f17498a = 0;

        /* JADX INFO: renamed from: b */
        public static final int f17499b = 1;

        /* JADX INFO: renamed from: c */
        public static final int f17500c = 2;

        /* JADX INFO: renamed from: d */
        public static final int f17501d = 3;

        /* JADX INFO: renamed from: e */
        public static final int f17502e = 4;

        /* JADX INFO: renamed from: f */
        public static final int f17503f = 5;

        /* JADX INFO: renamed from: g */
        public static final int f17504g = 6;

        /* JADX INFO: renamed from: h */
        public static final int f17505h = 7;

        /* JADX INFO: renamed from: i */
        public static final int f17506i = 8;

        /* JADX INFO: renamed from: j */
        public static final int f17507j = 9;

        /* JADX INFO: renamed from: k */
        public static final int f17508k = 10;

        /* JADX INFO: renamed from: l */
        public static final int f17509l = 11;

        /* JADX INFO: renamed from: m */
        public static final int f17510m = 12;

        /* JADX INFO: renamed from: n */
        public static final int f17511n = 13;

        /* JADX INFO: renamed from: o */
        public static final int f17512o = 14;

        /* JADX INFO: renamed from: p */
        public static final int f17513p = 15;

        /* JADX INFO: renamed from: q */
        public static final int f17514q = 16;

        /* JADX INFO: renamed from: r */
        public static final int f17515r = 17;

        /* JADX INFO: renamed from: s */
        public static final int f17516s = 18;

        /* JADX INFO: renamed from: t */
        public static final int f17517t = 19;

        /* JADX INFO: renamed from: u */
        public static final int f17518u = 20;

        /* JADX INFO: renamed from: v */
        public static final int f17519v = 21;

        /* JADX INFO: renamed from: w */
        public static final int f17520w = 22;

        /* JADX INFO: renamed from: x */
        public static final int f17521x = 23;

        /* JADX INFO: renamed from: y */
        public static final int f17522y = 24;

        /* JADX INFO: renamed from: z */
        public static final int f17523z = 25;
    }

    public static class Parse {

        /* JADX INFO: renamed from: a */
        public static final int f17524a = 0;

        /* JADX INFO: renamed from: b */
        public static final int f17525b = 1;

        /* JADX INFO: renamed from: c */
        public static final int f17526c = 2;

        /* JADX INFO: renamed from: d */
        public static final int f17527d = 4;

        /* JADX INFO: renamed from: e */
        public static final int f17528e = 8;
    }

    public static class ParsedStatus {

        /* JADX INFO: renamed from: a */
        public static final int f17529a = 1;

        /* JADX INFO: renamed from: b */
        public static final int f17530b = 2;

        /* JADX INFO: renamed from: c */
        public static final int f17531c = 3;

        /* JADX INFO: renamed from: d */
        public static final int f17532d = 4;
    }

    public static class Slave {

        /* JADX INFO: renamed from: a */
        public final int f17533a;

        /* JADX INFO: renamed from: b */
        public final int f17534b;

        /* JADX INFO: renamed from: c */
        public final String f17535c;

        public static class Type {

            /* JADX INFO: renamed from: a */
            public static final int f17536a = 0;

            /* JADX INFO: renamed from: b */
            public static final int f17537b = 1;
        }

        /* JADX WARN: Invalid debug info offset */
        public Slave(int i, int i2, String str) {
        }
    }

    public static class State {

        /* JADX INFO: renamed from: a */
        public static final int f17538a = 0;

        /* JADX INFO: renamed from: b */
        public static final int f17539b = 1;

        /* JADX INFO: renamed from: c */
        public static final int f17540c = 3;

        /* JADX INFO: renamed from: d */
        public static final int f17541d = 4;

        /* JADX INFO: renamed from: e */
        public static final int f17542e = 5;

        /* JADX INFO: renamed from: f */
        public static final int f17543f = 6;

        /* JADX INFO: renamed from: g */
        public static final int f17544g = 7;

        /* JADX INFO: renamed from: h */
        public static final int f17545h = 8;
    }

    public static class Stats {

        /* JADX INFO: renamed from: a */
        public final int f17546a;

        /* JADX INFO: renamed from: b */
        public final float f17547b;

        /* JADX INFO: renamed from: c */
        public final int f17548c;

        /* JADX INFO: renamed from: d */
        public final float f17549d;

        /* JADX INFO: renamed from: e */
        public final int f17550e;

        /* JADX INFO: renamed from: f */
        public final int f17551f;

        /* JADX INFO: renamed from: g */
        public final int f17552g;

        /* JADX INFO: renamed from: h */
        public final int f17553h;

        /* JADX INFO: renamed from: i */
        public final int f17554i;

        /* JADX INFO: renamed from: j */
        public final int f17555j;

        /* JADX INFO: renamed from: k */
        public final int f17556k;

        /* JADX INFO: renamed from: l */
        public final int f17557l;

        /* JADX INFO: renamed from: m */
        public final int f17558m;

        /* JADX INFO: renamed from: n */
        public final int f17559n;

        /* JADX INFO: renamed from: o */
        public final float f17560o;

        /* JADX WARN: Invalid debug info offset */
        public Stats(int i, float f, int i2, float f2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, float f3) {
        }
    }

    public static class SubtitleTrack extends Track {

        /* JADX INFO: renamed from: j */
        public final String f17561j;

        /* JADX WARN: Invalid debug info offset */
        public SubtitleTrack(String str, String str2, int i, int i2, int i3, int i4, String str3, String str4, String str5) {
        }
    }

    public static abstract class Track {

        /* JADX INFO: renamed from: a */
        public final int f17562a;

        /* JADX INFO: renamed from: b */
        public final String f17563b;

        /* JADX INFO: renamed from: c */
        public final String f17564c;

        /* JADX INFO: renamed from: d */
        public final int f17565d;

        /* JADX INFO: renamed from: e */
        public final int f17566e;

        /* JADX INFO: renamed from: f */
        public final int f17567f;

        /* JADX INFO: renamed from: g */
        public final int f17568g;

        /* JADX INFO: renamed from: h */
        public final String f17569h;

        /* JADX INFO: renamed from: i */
        public final String f17570i;

        public static class Type {

            /* JADX INFO: renamed from: a */
            public static final int f17571a = -1;

            /* JADX INFO: renamed from: b */
            public static final int f17572b = 0;

            /* JADX INFO: renamed from: c */
            public static final int f17573c = 1;

            /* JADX INFO: renamed from: d */
            public static final int f17574d = 2;
        }

        /* JADX WARN: Invalid debug info offset */
        public Track(int i, String str, String str2, int i2, int i3, int i4, int i5, String str3, String str4) {
        }
    }

    public static class Type {

        /* JADX INFO: renamed from: a */
        public static final int f17575a = 0;

        /* JADX INFO: renamed from: b */
        public static final int f17576b = 1;

        /* JADX INFO: renamed from: c */
        public static final int f17577c = 2;

        /* JADX INFO: renamed from: d */
        public static final int f17578d = 3;

        /* JADX INFO: renamed from: e */
        public static final int f17579e = 4;

        /* JADX INFO: renamed from: f */
        public static final int f17580f = 5;
    }

    public static class UnknownTrack extends Track {
        /* JADX WARN: Invalid debug info offset */
        public UnknownTrack(String str, String str2, int i, int i2, int i3, int i4, String str3, String str4) {
        }
    }

    public static class VideoTrack extends Track {

        /* JADX INFO: renamed from: j */
        public final int f17581j;

        /* JADX INFO: renamed from: k */
        public final int f17582k;

        /* JADX INFO: renamed from: l */
        public final int f17583l;

        /* JADX INFO: renamed from: m */
        public final int f17584m;

        /* JADX INFO: renamed from: n */
        public final int f17585n;

        /* JADX INFO: renamed from: o */
        public final int f17586o;

        /* JADX INFO: renamed from: p */
        public final int f17587p;

        /* JADX INFO: renamed from: q */
        public final int f17588q;

        public static final class Orientation {

            /* JADX INFO: renamed from: a */
            public static final int f17589a = 0;

            /* JADX INFO: renamed from: b */
            public static final int f17590b = 1;

            /* JADX INFO: renamed from: c */
            public static final int f17591c = 2;

            /* JADX INFO: renamed from: d */
            public static final int f17592d = 3;

            /* JADX INFO: renamed from: e */
            public static final int f17593e = 4;

            /* JADX INFO: renamed from: f */
            public static final int f17594f = 5;

            /* JADX INFO: renamed from: g */
            public static final int f17595g = 6;

            /* JADX INFO: renamed from: h */
            public static final int f17596h = 7;
        }

        public static final class Projection {

            /* JADX INFO: renamed from: a */
            public static final int f17597a = 0;

            /* JADX INFO: renamed from: b */
            public static final int f17598b = 1;

            /* JADX INFO: renamed from: c */
            public static final int f17599c = 256;
        }

        /* JADX WARN: Invalid debug info offset */
        public VideoTrack(String str, String str2, int i, int i2, int i3, int i4, String str3, String str4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        }
    }

    /* JADX INFO: renamed from: a */
    int mo25273a();

    /* JADX INFO: renamed from: b */
    void mo25274b(String str);

    /* JADX INFO: renamed from: c */
    boolean mo25275c(int i);

    /* JADX INFO: renamed from: f */
    void mo25276f();

    /* JADX INFO: renamed from: g */
    void mo25277g(EventListener eventListener);

    long getDuration();

    int getState();

    Uri getUri();

    /* JADX INFO: renamed from: h */
    void mo25278h(boolean z, boolean z2);

    /* JADX INFO: renamed from: i */
    int mo25279i();

    /* JADX INFO: renamed from: k */
    void mo25280k(Slave slave);

    /* JADX INFO: renamed from: m */
    boolean mo25281m(int i);

    /* JADX INFO: renamed from: n */
    Stats mo25282n();

    /* JADX INFO: renamed from: o */
    boolean mo25283o();

    /* JADX INFO: renamed from: p */
    boolean mo25284p();

    /* JADX INFO: renamed from: q */
    boolean mo25285q();

    /* JADX INFO: renamed from: s */
    String mo25286s(int i);

    /* JADX INFO: renamed from: t */
    void mo25287t();

    /* JADX INFO: renamed from: v */
    IMediaList mo25288v();

    /* JADX INFO: renamed from: w */
    boolean mo25289w(int i, int i2);

    /* JADX INFO: renamed from: y */
    Track mo25290y(int i);

    /* JADX INFO: renamed from: z */
    Slave[] mo25291z();
}
