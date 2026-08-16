package com.p2pengine.core.abs.mpd.manifest;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.p2pengine.core.abs.mpd.Format;
import java.util.List;
import java.util.regex.Pattern;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: renamed from: com.p2pengine.core.abs.mpd.manifest.c */
/* JADX INFO: loaded from: classes2.dex */
public class C3912c extends DefaultHandler implements Parser<C3911b> {

    /* JADX INFO: renamed from: b */
    public static final Pattern f11671b = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* JADX INFO: renamed from: a */
    public final XmlPullParserFactory f11672a;

    /* JADX INFO: renamed from: com.p2pengine.core.abs.mpd.manifest.c$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final Format f11673a;

        /* JADX INFO: renamed from: b */
        public final String f11674b;

        /* JADX INFO: renamed from: c */
        public final AbstractC3917h f11675c;

        /* JADX INFO: renamed from: d */
        public final long f11676d;

        /* JADX WARN: Invalid debug info offset */
        public a(Format format, String str, AbstractC3917h abstractC3917h, long j) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public C3912c() {
        /*
            r3 = this;
            return
        La:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.abs.mpd.manifest.C3912c.<init>():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static float m18087a(XmlPullParser xmlPullParser, float f) {
        return 0.0f;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static int m18088a(int i, int i2) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static long m18089a(XmlPullParser xmlPullParser, String str, long j) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static void m18090a(XmlPullParser xmlPullParser) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static C3913d m18091b(XmlPullParser xmlPullParser, String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public static String m18092d(XmlPullParser xmlPullParser, String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public final long m18093a(List<AbstractC3917h.d> list, long j, long j2, int i, long j3) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0005
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    public com.p2pengine.core.abs.mpd.manifest.C3911b m18094a(android.net.Uri r3, byte[] r4) {
        /*
            r2 = this;
            r0 = 0
            return r0
        L2b:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.abs.mpd.manifest.C3912c.m18094a(android.net.Uri, byte[]):com.p2pengine.core.abs.mpd.manifest.b");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public C3915f m18095a(XmlPullParser xmlPullParser, String str, String str2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public AbstractC3917h.b m18096a(XmlPullParser xmlPullParser, @Nullable AbstractC3917h.b bVar, long j) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public AbstractC3917h.c m18097a(XmlPullParser xmlPullParser, @Nullable AbstractC3917h.c cVar, List<C3913d> list, long j) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public AbstractC3917h.e m18098a(XmlPullParser xmlPullParser, @Nullable AbstractC3917h.e eVar) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Nullable
    /* JADX INFO: renamed from: a */
    public C3919j m18099a(XmlPullParser xmlPullParser, String str, @Nullable C3919j c3919j) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public String m18100a(XmlPullParser xmlPullParser, String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public List<AbstractC3917h.d> m18101a(XmlPullParser xmlPullParser, long j, long j2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public int m18102b(XmlPullParser xmlPullParser) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public C3911b m18103c(XmlPullParser xmlPullParser, String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.core.abs.mpd.manifest.Parser
    public /* bridge */ /* synthetic */ C3911b parse(Uri uri, byte[] bArr) {
        return null;
    }
}
