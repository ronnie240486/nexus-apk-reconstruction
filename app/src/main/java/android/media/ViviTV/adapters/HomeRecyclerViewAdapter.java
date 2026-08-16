package android.media.ViviTV.adapters;

import android.content.Context;
import android.media.ViviTV.C1756R;
import android.media.ViviTV.viewholders.EmptyViewHolder;
import android.media.ViviTV.viewholders.ViewHolderAppInstalled;
import android.media.ViviTV.viewholders.ViewHolderBanner;
import android.media.ViviTV.viewholders.ViewHolderBannerPager;
import android.media.ViviTV.viewholders.ViewHolderBannerWithRightTitle;
import android.media.ViviTV.viewholders.ViewHolderFavorite;
import android.media.ViviTV.viewholders.ViewHolderGif;
import android.media.ViviTV.viewholders.ViewHolderHorizonScroll;
import android.media.ViviTV.viewholders.ViewHolderHotelPosterImg;
import android.media.ViviTV.viewholders.ViewHolderImage;
import android.media.ViviTV.viewholders.ViewHolderLikeApp;
import android.media.ViviTV.viewholders.ViewHolderLikeNews;
import android.media.ViviTV.viewholders.ViewHolderLikeNewsMarquee;
import android.media.ViviTV.viewholders.ViewHolderMovieFullWidth;
import android.media.ViviTV.viewholders.ViewHolderPlayHistory;
import android.media.ViviTV.viewholders.ViewHolderRoomInfo;
import android.media.ViviTV.viewholders.ViewHolderTeleplay;
import android.media.ViviTV.viewholders.ViewHolderTeleplayBtmText;
import android.media.ViviTV.viewholders.ViewHolderText;
import android.media.ViviTV.viewholders.ViewHolderTitle;
import android.media.ViviTV.viewholders.ViewHolderVideo;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import cn.dolit.twowayviewlib.adapters.BaseSpannableRecyclerViewAdapter;
import cn.dolit.twowayviewlib.viewholders.BaseRecyclerViewHolder;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.List;
import org.lucasr.twowayview.widget.TwoWayView;
import p000.AbstractC5157p6;
import p000.C5973h30;
import p000.InterfaceC0700Kq;

/* JADX INFO: loaded from: classes.dex */
public class HomeRecyclerViewAdapter extends BaseSpannableRecyclerViewAdapter {
    public static final int VT_BANNER = 10;
    public static final int VT_BANNER_PAGER = Integer.MAX_VALUE;
    public static final int VT_BANNER_WITH_RIGHT_TITLE = 14;
    public static final int VT_EMPTY = 0;
    public static final int VT_FAVOURITE = 12;
    public static final int VT_GIF = 7;
    public static final int VT_HOTEL = 21;
    public static final int VT_HSCROLL = 22;
    public static final int VT_IMAGE = 1;
    public static final int VT_LIKE_APP_ITEM = 4;
    public static final int VT_LIKE_NEWS = 3;
    public static final int VT_LIKE_NEWS_MARQUEE = 9;
    public static final int VT_MOVIE_FULL_WIDTH = 6;
    public static final int VT_PLAY_HISTORY = 11;
    public static final int VT_ROOM_INFO = 19;
    public static final int VT_TELEPLAY_BOTTOM_TEXT = 5;
    public static final int VT_TELEPLAY_WITH_EPISODE = 2;
    public static final int VT_TEXT = 18;
    public static final int VT_TITLE = 8;
    public static final int VT_VIDEO = 20;

    /* JADX INFO: renamed from: u */
    public static final int f5646u = 1;

    /* JADX INFO: renamed from: s */
    public int f5648s;

    /* JADX INFO: renamed from: t */
    public List<InterfaceC0700Kq> f5649t;
    public static final C5973h30 VT_EMPTY_INFO = new C5973h30(0, EmptyViewHolder.class, C1756R.layout.layout_home_item_empty, 0, 0);
    public static final C5973h30 VT_IMAGE_INFO = new C5973h30(1, ViewHolderImage.class, C1756R.layout.layout_home_item_image_view, C1756R.layout.video_source, C1756R.layout.vip_mark);
    public static final C5973h30 VT_TELEPLAY_WITH_EPISODE_INFO = new C5973h30(2, ViewHolderTeleplay.class, C1756R.layout.layout_home_item_teleplay_with_episode, C1756R.layout.video_source, C1756R.layout.vip_mark);
    public static final C5973h30 VT_LIKE_NEWS_INFO = new C5973h30(3, ViewHolderLikeNews.class, C1756R.layout.layout_home_item_like_news, C1756R.layout.video_source, C1756R.layout.vip_mark);
    public static final C5973h30 VT_LIKE_APP_ITEM_INFO = new C5973h30(4, ViewHolderLikeApp.class, C1756R.layout.layout_home_item_like_app, C1756R.layout.video_source, C1756R.layout.vip_mark);
    public static final C5973h30 VT_TELEPLAY_BOTTOM_TEXT_INFO = new C5973h30(5, ViewHolderTeleplayBtmText.class, C1756R.layout.layout_home_item_teleplay_with_btm_text, C1756R.layout.video_source, C1756R.layout.vip_mark);
    public static final C5973h30 VT_MOVIE_FULL_WIDTH_INFO = new C5973h30(6, ViewHolderMovieFullWidth.class, C1756R.layout.layout_home_item_movie_full_width, C1756R.layout.video_source, C1756R.layout.vip_mark);
    public static final C5973h30 VT_GIF_INFO = new C5973h30(7, ViewHolderGif.class, C1756R.layout.layout_home_item_gif, C1756R.layout.video_source, C1756R.layout.vip_mark);
    public static final C5973h30 VT_TITLE_INFO = new C5973h30(8, ViewHolderTitle.class, C1756R.layout.layout_home_item_title, 0, 0);
    public static final C5973h30 VT_LIKE_NEWS_MARQUEE_INFO = new C5973h30(9, ViewHolderLikeNewsMarquee.class, C1756R.layout.layout_home_item_like_news_marquee, C1756R.layout.video_source, C1756R.layout.vip_mark);
    public static final C5973h30 VT_BANNER_INFO = new C5973h30(10, ViewHolderBanner.class, C1756R.layout.layout_home_item_banner, C1756R.layout.video_source, C1756R.layout.vip_mark);
    public static final C5973h30 VT_PLAY_HISTORY_INFO = new C5973h30(11, ViewHolderPlayHistory.class, C1756R.layout.layout_home_item_play_history, 0, 0);
    public static final C5973h30 VT_FAVOURITE_INFO = new C5973h30(12, ViewHolderFavorite.class, C1756R.layout.layout_home_item_play_history, 0, 0);
    public static final int VT_APP_INSTALLED = 999;
    public static final C5973h30 VT_APP_INSTALLED_INFO = new C5973h30(VT_APP_INSTALLED, ViewHolderAppInstalled.class, C1756R.layout.layout_home_item_app_installed, 0, 0);
    public static final C5973h30 VT_BANNER_PAGER_INFO = new C5973h30(Integer.MAX_VALUE, ViewHolderBannerPager.class, C1756R.layout.layout_home_item_banner_pager, C1756R.layout.video_source, C1756R.layout.vip_mark);
    public static final C5973h30 VT_BANNER_WITH_RIGHT_TITLE_INFO = new C5973h30(14, ViewHolderBannerWithRightTitle.class, C1756R.layout.layout_home_item_banner_with_right_title, C1756R.layout.video_source, C1756R.layout.vip_mark);
    public static final C5973h30 VT_TEXT_INFO = new C5973h30(18, ViewHolderText.class, C1756R.layout.layout_home_item_text_view, C1756R.layout.video_source, C1756R.layout.vip_mark);
    public static final C5973h30 VT_ROOM_INFO_INFO = new C5973h30(19, ViewHolderRoomInfo.class, C1756R.layout.layout_home_item_text_view, 0, 0);
    public static final C5973h30 VT_VIDEO_INFO = new C5973h30(20, ViewHolderVideo.class, C1756R.layout.layout_home_item_video, 0, 0);
    public static final C5973h30 VT_HOTEL_INFO = new C5973h30(21, ViewHolderHotelPosterImg.class, C1756R.layout.layout_home_item_image_view, 0, 0);
    public static final C5973h30 VT_HSCROLL_INFO = new C5973h30(22, ViewHolderHorizonScroll.class, C1756R.layout.layout_home_item_horizon_scroll, C1756R.layout.video_source, C1756R.layout.vip_mark);

    /* JADX INFO: renamed from: v */
    public static final SparseArray<C5973h30> f5647v = new SparseArray<>();

    static {
        for (Field field : HomeRecyclerViewAdapter.class.getDeclaredFields()) {
            if (C5973h30.class.isAssignableFrom(field.getType()) && Modifier.isStatic(field.getModifiers())) {
                try {
                    Object obj = field.get(null);
                    C5973h30 c5973h30 = obj instanceof C5973h30 ? (C5973h30) obj : null;
                    if (c5973h30 != null) {
                        try {
                            f5647v.put(c5973h30.m20936c(), c5973h30);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public HomeRecyclerViewAdapter(Context context, TwoWayView twoWayView, List<AbstractC5157p6> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A */
    public final void m10537A(View view, C5973h30 c5973h30, BaseRecyclerViewHolder baseRecyclerViewHolder) {
    }

    @Override // cn.dolit.twowayviewlib.adapters.BaseSpannableRecyclerViewAdapter, p000.InterfaceC0700Kq
    /* JADX INFO: renamed from: e */
    public void mo3291e(View view, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // cn.dolit.twowayviewlib.adapters.BaseSpannableRecyclerViewAdapter, p000.InterfaceC0700Kq
    /* JADX INFO: renamed from: f */
    public void mo3292f(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // cn.dolit.twowayviewlib.adapters.BaseSpannableRecyclerViewAdapter, p000.InterfaceC0700Kq
    /* JADX INFO: renamed from: g */
    public boolean mo3293g(boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // cn.dolit.twowayviewlib.adapters.BaseSpannableRecyclerViewAdapter
    /* JADX INFO: renamed from: i */
    public void mo10538i(BaseRecyclerViewHolder baseRecyclerViewHolder, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x003f
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // cn.dolit.twowayviewlib.adapters.BaseSpannableRecyclerViewAdapter
    /* JADX INFO: renamed from: j */
    public cn.dolit.twowayviewlib.viewholders.BaseRecyclerViewHolder mo10539j(android.view.ViewGroup r7, int r8) {
        /*
            r6 = this;
            r0 = 0
            return r0
        L67:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.adapters.HomeRecyclerViewAdapter.mo10539j(android.view.ViewGroup, int):cn.dolit.twowayviewlib.viewholders.BaseRecyclerViewHolder");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // cn.dolit.twowayviewlib.adapters.BaseSpannableRecyclerViewAdapter
    /* JADX INFO: renamed from: l */
    public void mo10540l() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // cn.dolit.twowayviewlib.adapters.BaseSpannableRecyclerViewAdapter
    /* JADX INFO: renamed from: m */
    public boolean mo10541m(View view, int i, KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w */
    public final void m10542w(BaseRecyclerViewHolder baseRecyclerViewHolder) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x */
    public final boolean m10543x(View view) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y */
    public void m10544y(List<AbstractC5157p6> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: z */
    public void m10545z(int i) {
    }
}
