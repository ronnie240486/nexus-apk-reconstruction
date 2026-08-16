package org.videolan.libvlc.media;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaFormat;
import android.media.TimedText;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.Map;
import org.videolan.libvlc.interfaces.ILibVLC;
import org.videolan.libvlc.interfaces.IMedia;

/* JADX INFO: loaded from: classes.dex */
public class MediaPlayer {

    /* JADX INFO: renamed from: d */
    public static final int f17607d = 1;

    /* JADX INFO: renamed from: e */
    public static final int f17608e = 100;

    /* JADX INFO: renamed from: f */
    public static final int f17609f = 200;

    /* JADX INFO: renamed from: g */
    public static final int f17610g = -1004;

    /* JADX INFO: renamed from: h */
    public static final int f17611h = -1007;

    /* JADX INFO: renamed from: i */
    public static final int f17612i = -1010;

    /* JADX INFO: renamed from: j */
    public static final int f17613j = -110;

    /* JADX INFO: renamed from: k */
    public static final int f17614k = 1;

    /* JADX INFO: renamed from: l */
    public static final int f17615l = 2;

    /* JADX INFO: renamed from: m */
    public static final int f17616m = 3;

    /* JADX INFO: renamed from: n */
    public static final int f17617n = 700;

    /* JADX INFO: renamed from: o */
    public static final int f17618o = 701;

    /* JADX INFO: renamed from: p */
    public static final int f17619p = 702;

    /* JADX INFO: renamed from: q */
    public static final int f17620q = 800;

    /* JADX INFO: renamed from: r */
    public static final int f17621r = 801;

    /* JADX INFO: renamed from: s */
    public static final int f17622s = 802;

    /* JADX INFO: renamed from: t */
    public static final int f17623t = 803;

    /* JADX INFO: renamed from: u */
    public static final int f17624u = 900;

    /* JADX INFO: renamed from: v */
    public static final int f17625v = 901;

    /* JADX INFO: renamed from: w */
    public static final int f17626w = 902;

    /* JADX INFO: renamed from: x */
    public static final int f17627x = 1;

    /* JADX INFO: renamed from: y */
    public static final int f17628y = 2;

    /* JADX INFO: renamed from: z */
    public static final String f17629z = "application/x-subrip";

    /* JADX INFO: renamed from: a */
    public IMedia f17630a;

    /* JADX INFO: renamed from: b */
    public final ILibVLC f17631b;

    /* JADX INFO: renamed from: c */
    public org.videolan.libvlc.MediaPlayer f17632c;

    public interface OnBufferingUpdateListener {
        /* JADX INFO: renamed from: a */
        void m25495a(MediaPlayer mediaPlayer, int i);
    }

    public interface OnCompletionListener {
        /* JADX INFO: renamed from: a */
        void m25496a(MediaPlayer mediaPlayer);
    }

    public interface OnErrorListener {
        /* JADX INFO: renamed from: a */
        boolean m25497a(MediaPlayer mediaPlayer, int i, int i2);
    }

    public interface OnInfoListener {
        /* JADX INFO: renamed from: a */
        boolean m25498a(MediaPlayer mediaPlayer, int i, int i2);
    }

    public interface OnPreparedListener {
        /* JADX INFO: renamed from: a */
        void m25499a(MediaPlayer mediaPlayer);
    }

    public interface OnSeekCompleteListener {
        /* JADX INFO: renamed from: a */
        void m25500a(MediaPlayer mediaPlayer);
    }

    public interface OnTimedTextListener {
        /* JADX INFO: renamed from: a */
        void m25501a(MediaPlayer mediaPlayer, TimedText timedText);
    }

    public interface OnVideoSizeChangedListener {
        /* JADX INFO: renamed from: a */
        void m25502a(MediaPlayer mediaPlayer, int i, int i2);
    }

    public static class TrackInfo implements Parcelable {

        /* JADX INFO: renamed from: a */
        public static final int f17633a = 0;

        /* JADX INFO: renamed from: b */
        public static final int f17634b = 1;

        /* JADX INFO: renamed from: c */
        public static final int f17635c = 2;

        /* JADX INFO: renamed from: d */
        public static final int f17636d = 3;

        /* JADX INFO: renamed from: e */
        public static final int f17637e = 4;

        /* JADX WARN: Invalid debug info offset */
        public TrackInfo(Parcel parcel) {
        }

        /* JADX INFO: renamed from: a */
        public MediaFormat m25503a() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public String m25504b() {
            return null;
        }

        /* JADX INFO: renamed from: c */
        public int m25505c() {
            return 0;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        public String toString() {
            return null;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
        }
    }

    /* JADX INFO: renamed from: f */
    public static MediaPlayer m25441f(Context context, int i) {
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static MediaPlayer m25442g(Context context, int i, AudioAttributes audioAttributes, int i2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public static MediaPlayer m25443h(Context context, Uri uri) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public static MediaPlayer m25444i(Context context, Uri uri, SurfaceHolder surfaceHolder) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public static MediaPlayer m25445j(Context context, Uri uri, SurfaceHolder surfaceHolder, AudioAttributes audioAttributes, int i) {
        return null;
    }

    /* JADX INFO: renamed from: A */
    public void m25446A(int i) throws IllegalStateException {
    }

    /* JADX INFO: renamed from: B */
    public void m25447B(AudioAttributes audioAttributes) throws IllegalArgumentException {
    }

    /* JADX INFO: renamed from: C */
    public void m25448C(int i) throws IllegalStateException, IllegalArgumentException {
    }

    /* JADX INFO: renamed from: D */
    public void m25449D(int i) {
    }

    /* JADX INFO: renamed from: E */
    public void m25450E(float f) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: F */
    public void m25451F(Context context, Uri uri) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: G */
    public void m25452G(Context context, Uri uri, Map<String, String> map) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: H */
    public void m25453H(FileDescriptor fileDescriptor) throws IllegalStateException, IOException, IllegalArgumentException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: I */
    public void m25454I(FileDescriptor fileDescriptor, long j, long j2) throws IllegalStateException, IOException, IllegalArgumentException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: J */
    public void m25455J(String str) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K */
    public void m25456K(SurfaceHolder surfaceHolder) {
    }

    /* JADX INFO: renamed from: L */
    public void m25457L(boolean z) {
    }

    /* JADX INFO: renamed from: M */
    public void m25458M(MediaPlayer mediaPlayer) {
    }

    /* JADX INFO: renamed from: N */
    public void m25459N(OnBufferingUpdateListener onBufferingUpdateListener) {
    }

    /* JADX INFO: renamed from: O */
    public void m25460O(OnCompletionListener onCompletionListener) {
    }

    /* JADX INFO: renamed from: P */
    public void m25461P(OnErrorListener onErrorListener) {
    }

    /* JADX INFO: renamed from: Q */
    public void m25462Q(OnInfoListener onInfoListener) {
    }

    /* JADX INFO: renamed from: R */
    public void m25463R(OnPreparedListener onPreparedListener) {
    }

    /* JADX INFO: renamed from: S */
    public void m25464S(OnSeekCompleteListener onSeekCompleteListener) {
    }

    /* JADX INFO: renamed from: T */
    public void m25465T(OnTimedTextListener onTimedTextListener) {
    }

    /* JADX INFO: renamed from: U */
    public void m25466U(OnVideoSizeChangedListener onVideoSizeChangedListener) {
    }

    /* JADX INFO: renamed from: V */
    public void m25467V(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: W */
    public void m25468W(Surface surface) {
    }

    /* JADX INFO: renamed from: X */
    public void m25469X(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Y */
    public void m25470Y(float f, float f2) {
    }

    /* JADX INFO: renamed from: Z */
    public void m25471Z(Context context, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public void m25472a(Context context, Uri uri, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a0 */
    public void m25473a0() throws IllegalStateException {
    }

    /* JADX INFO: renamed from: b */
    public void m25474b(FileDescriptor fileDescriptor, long j, long j2, String str) throws IllegalStateException, IllegalArgumentException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b0 */
    public void m25475b0() throws IllegalStateException {
    }

    /* JADX INFO: renamed from: c */
    public void m25476c(FileDescriptor fileDescriptor, String str) throws IllegalStateException, IllegalArgumentException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public void m25477d(String str, String str2) {
    }

    /* JADX INFO: renamed from: e */
    public void m25478e(int i) {
    }

    public void finalize() {
    }

    /* JADX INFO: renamed from: k */
    public void m25479k(int i) throws IllegalStateException {
    }

    /* JADX INFO: renamed from: l */
    public int m25480l() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public int m25481m() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n */
    public int m25482n() {
        return 0;
    }

    /* JADX INFO: renamed from: o */
    public int m25483o(int i) throws IllegalStateException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public TrackInfo[] m25484p() throws IllegalStateException {
        return null;
    }

    /* JADX INFO: renamed from: q */
    public int m25485q() {
        return -1;
    }

    /* JADX INFO: renamed from: r */
    public int m25486r() {
        return -1;
    }

    /* JADX INFO: renamed from: s */
    public boolean m25487s() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t */
    public boolean m25488t() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u */
    public void m25489u() throws IllegalStateException {
    }

    /* JADX INFO: renamed from: v */
    public void m25490v() throws IllegalStateException, IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w */
    public void m25491w() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x */
    public void m25492x() {
    }

    /* JADX INFO: renamed from: y */
    public void m25493y() {
    }

    /* JADX INFO: renamed from: z */
    public void m25494z(int i) throws IllegalStateException {
    }
}
