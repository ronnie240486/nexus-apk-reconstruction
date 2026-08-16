package android.media.ViviTV.p001ad.view;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.media.ViviTV.player.widget.AbstractC2308a;
import android.media.ViviTV.player.widget.DolitVideoView;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.p010rd.PageIndicatorView;
import java.util.List;
import java.util.TimerTask;
import p000.C5176pP;

/* JADX INFO: loaded from: classes.dex */
public class PictureVideoAdView extends RelativeLayout implements MediaPlayer.OnErrorListener, AbstractC2308a.c, AbstractC2308a.g, AbstractC2308a.b {

    /* JADX INFO: renamed from: q */
    public static final int f5541q = 30000;

    /* JADX INFO: renamed from: a */
    public DolitVideoView f5542a;

    /* JADX INFO: renamed from: b */
    public ImageView f5543b;

    /* JADX INFO: renamed from: c */
    public TextView f5544c;

    /* JADX INFO: renamed from: d */
    public WindowManager f5545d;

    /* JADX INFO: renamed from: e */
    public Activity f5546e;

    /* JADX INFO: renamed from: f */
    public View f5547f;

    /* JADX INFO: renamed from: g */
    public WindowManager.LayoutParams f5548g;

    /* JADX INFO: renamed from: h */
    public int[] f5549h;

    /* JADX INFO: renamed from: i */
    public int f5550i;

    /* JADX INFO: renamed from: j */
    public int f5551j;

    /* JADX INFO: renamed from: k */
    public ViewPager f5552k;

    /* JADX INFO: renamed from: l */
    public PageIndicatorView f5553l;

    /* JADX INFO: renamed from: m */
    public C5176pP f5554m;

    /* JADX INFO: renamed from: n */
    public InterfaceC1937c f5555n;

    /* JADX INFO: renamed from: o */
    public boolean f5556o;

    /* JADX INFO: renamed from: p */
    public String f5557p;

    /* JADX INFO: renamed from: android.media.ViviTV.ad.view.PictureVideoAdView$a */
    public class RunnableC1935a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ PictureVideoAdView f5558a;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC1935a(PictureVideoAdView pictureVideoAdView) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.ad.view.PictureVideoAdView$b */
    public class C1936b extends TimerTask {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ PictureVideoAdView f5559a;

        /* JADX WARN: Invalid debug info offset */
        public C1936b(PictureVideoAdView pictureVideoAdView) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.ad.view.PictureVideoAdView$c */
    public interface InterfaceC1937c {
        /* JADX INFO: renamed from: Y */
        Object mo10419Y(ViewGroup viewGroup, int i, InterfaceC1938d interfaceC1938d);

        /* JADX INFO: renamed from: v */
        void mo10420v(ViewGroup viewGroup, int i, Object obj);
    }

    /* JADX INFO: renamed from: android.media.ViviTV.ad.view.PictureVideoAdView$d */
    public interface InterfaceC1938d {
        String getTextAdItemContent();

        int getTextAdItemDuration();
    }

    /* JADX INFO: renamed from: android.media.ViviTV.ad.view.PictureVideoAdView$e */
    public static final class C1939e {

        /* JADX INFO: renamed from: a */
        public int f5560a;

        /* JADX INFO: renamed from: b */
        public List<InterfaceC1938d> f5561b;

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ List m10421a(C1939e c1939e) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public List<InterfaceC1938d> m10422b() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: c */
        public int m10423c() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: d */
        public void m10424d(List<InterfaceC1938d> list) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: e */
        public void m10425e(int i) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.ad.view.PictureVideoAdView$f */
    public class C1940f extends PagerAdapter {

        /* JADX INFO: renamed from: a */
        public List<InterfaceC1938d> f5562a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ PictureVideoAdView f5563b;

        /* JADX WARN: Invalid debug info offset */
        public C1940f(PictureVideoAdView pictureVideoAdView, List<InterfaceC1938d> list) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // androidx.viewpager.widget.PagerAdapter
        @NonNull
        public Object instantiateItem(@NonNull ViewGroup viewGroup, int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
            return false;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public PictureVideoAdView(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    public PictureVideoAdView(Context context, AttributeSet attributeSet) {
    }

    /* JADX WARN: Invalid debug info offset */
    public PictureVideoAdView(Context context, AttributeSet attributeSet, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m10394a(PictureVideoAdView pictureVideoAdView) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ int[] m10395b(PictureVideoAdView pictureVideoAdView) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ WindowManager.LayoutParams m10396c(PictureVideoAdView pictureVideoAdView) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ int m10397d(PictureVideoAdView pictureVideoAdView) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ int m10398e(PictureVideoAdView pictureVideoAdView) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ View m10399f(PictureVideoAdView pictureVideoAdView) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public static /* synthetic */ WindowManager m10400g(PictureVideoAdView pictureVideoAdView) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m10401h(PictureVideoAdView pictureVideoAdView) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public static /* synthetic */ InterfaceC1937c m10402i(PictureVideoAdView pictureVideoAdView) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o */
    private void m10403o() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a.b
    /* JADX INFO: renamed from: h0 */
    public void mo1548h0(Object obj) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a.c
    /* JADX INFO: renamed from: j */
    public boolean mo10404j(Object obj, int i, int i2, long j) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public final void m10405k() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public final void m10406l() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public final void m10407m() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n */
    public final void m10408n() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public boolean m10409p() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m10410q() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r */
    public void m10411r(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s */
    public final void m10412s() {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setCountDownText(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setCountDownViewEnabled(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setImageAdScaleType(ImageView.ScaleType scaleType) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t */
    public void m10413t() {
    }

    @Override // android.media.ViviTV.player.widget.AbstractC2308a.g
    /* JADX INFO: renamed from: u */
    public void mo1331u(Object obj, int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v */
    public void m10414v(C1939e c1939e, InterfaceC1937c interfaceC1937c) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w */
    public void m10415w() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x */
    public final void m10416x() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y */
    public final void m10417y() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: z */
    public void m10418z() {
    }
}
