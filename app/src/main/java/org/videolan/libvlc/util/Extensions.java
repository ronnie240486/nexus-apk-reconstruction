package org.videolan.libvlc.util;

import com.google.android.exoplayer2.source.hls.DefaultHlsExtractorFactory;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class Extensions {

    /* JADX INFO: renamed from: a */
    public static final HashSet<String> f17676a;

    /* JADX INFO: renamed from: b */
    public static final HashSet<String> f17677b;

    /* JADX INFO: renamed from: c */
    public static final HashSet<String> f17678c;

    /* JADX INFO: renamed from: d */
    public static final HashSet<String> f17679d;

    static {
        HashSet<String> hashSet = new HashSet<>();
        f17676a = hashSet;
        HashSet<String> hashSet2 = new HashSet<>();
        f17677b = hashSet2;
        HashSet<String> hashSet3 = new HashSet<>();
        f17678c = hashSet3;
        HashSet<String> hashSet4 = new HashSet<>();
        f17679d = hashSet4;
        String[] strArr = {".3ga", ".a52", DefaultHlsExtractorFactory.AAC_FILE_EXTENSION, DefaultHlsExtractorFactory.AC3_FILE_EXTENSION, ".adt", ".adts", ".aif", ".aifc", ".aiff", ".alac", ".amr", ".aob", ".ape", ".awb", ".caf", ".dts", ".flac", ".it", ".m4a", ".m4b", ".m4p", ".mid", ".mka", ".mlp", ".mod", ".mpa", ".mp1", ".mp2", DefaultHlsExtractorFactory.MP3_FILE_EXTENSION, ".mpc", ".mpga", ".oga", ".ogg", ".oma", ".opus", ".ra", ".ram", ".rmi", ".s3m", ".spx", ".tta", ".voc", ".vqf", ".w64", ".wav", ".wma", ".wv", ".xa", ".xm"};
        String[] strArr2 = {".idx", ".sub", ".srt", ".ssa", ".ass", ".smi", ".utf", ".utf8", ".utf-8", ".rt", ".aqt", ".txt", ".usf", ".jss", ".cdg", ".psb", ".mpsub", ".mpl2", ".pjs", ".dks", ".stl", DefaultHlsExtractorFactory.VTT_FILE_EXTENSION, ".ttml", ".mks"};
        hashSet.addAll(Arrays.asList(".3g2", ".3gp", ".3gp2", ".3gpp", ".amv", ".asf", ".avi", ".divx", ".drc", ".dv", ".f4v", ".flv", ".gvi", ".gxf", ".h264", ".ismv", ".iso", ".m1v", ".m2v", ".m2t", ".m2ts", ".m4v", ".mkv", ".mov", ".mp2", ".mp2v", ".mp4", ".mp4v", ".mpe", ".mpeg", ".mpeg1", ".mpeg2", ".mpeg4", ".mpg", ".mpv2", ".mts", ".mtv", ".mxf", ".mxg", ".nsv", ".nut", ".nuv", ".ogm", ".ogv", ".ogx", ".ps", ".rec", ".rm", ".rmvb", ".tod", ".ts", ".tts", ".vob", ".vro", ".webm", ".wm", ".wmv", ".wtv", ".xesc"));
        hashSet2.addAll(Arrays.asList(strArr));
        hashSet3.addAll(Arrays.asList(strArr2));
        hashSet4.addAll(Arrays.asList(".m3u", ".asx", ".b4s", ".pls", ".xspf"));
    }
}
