package com.tencent.smtt.export.external.interfaces;

import android.graphics.Bitmap;
import android.graphics.Picture;
import android.graphics.Point;
import android.net.http.SslCertificate;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.webkit.ValueCallback;
import com.tencent.smtt.export.external.extension.interfaces.IX5WebViewExtension;
import java.io.BufferedWriter;
import java.io.File;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface IX5WebViewBase {
    public static final int OVER_SCROLL_ALWAYS = 0;
    public static final int OVER_SCROLL_IF_CONTENT_SCROLLS = 1;
    public static final int OVER_SCROLL_NEVER = 2;

    public interface FindListener {
        void onFindResultReceived(int i, int i2, boolean z);
    }

    public static class HitTestResult {

        @Deprecated
        public static final int ANCHOR_TYPE = 1;
        public static final int BUTTON_TYPE = 10;
        public static final int EDIT_TEXT_TYPE = 9;
        public static final int EMAIL_TYPE = 4;
        public static final int GEO_TYPE = 3;

        @Deprecated
        public static final int IMAGE_ANCHOR_TYPE = 6;
        public static final int IMAGE_TYPE = 5;
        public static final int PHONE_TYPE = 2;
        public static final int SRC_ANCHOR_TYPE = 7;
        public static final int SRC_IMAGE_ANCHOR_TYPE = 8;
        public static final int UNKNOWN_TYPE = 0;
        private Object mData;
        private String mExtra;
        private boolean mIsFromSinglePress;
        private Point mPoint;
        private int mType;

        public class AnchorData {
            public String mAnchorTitle;
            public String mAnchorUrl;
            final /* synthetic */ HitTestResult this$0;

            /* JADX WARN: Invalid debug info offset */
            public AnchorData(HitTestResult hitTestResult) {
            }
        }

        public class EditableData {
            public String mEditableText;
            public boolean mIsPassword;
            final /* synthetic */ HitTestResult this$0;

            /* JADX WARN: Invalid debug info offset */
            public EditableData(HitTestResult hitTestResult) {
            }
        }

        public class ImageAnchorData {
            public String mAHref;
            public Bitmap mBmp;
            public String mPicUrl;
            public long mRawDataSize;
            final /* synthetic */ HitTestResult this$0;

            /* JADX WARN: Invalid debug info offset */
            public ImageAnchorData(HitTestResult hitTestResult) {
            }

            /* JADX WARN: Invalid debug info offset */
            public Bitmap getBitmap() {
                return null;
            }
        }

        public class ImageData {
            public Bitmap mBmp;
            public int mImgHeight;
            public int mImgWidth;
            public String mPicUrl;
            public long mRawDataSize;
            final /* synthetic */ HitTestResult this$0;

            /* JADX WARN: Invalid debug info offset */
            public ImageData(HitTestResult hitTestResult) {
            }

            /* JADX WARN: Invalid debug info offset */
            public Bitmap getBitmap() {
                return null;
            }
        }

        public Bitmap getBitmapData() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public Object getData() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public String getExtra() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public Point getHitTestPoint() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public int getType() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        public boolean isFromSinglePress() {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        public void setData(Object obj) {
        }

        /* JADX WARN: Invalid debug info offset */
        public void setExtra(String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        public void setHitTestPoint(Point point) {
        }

        /* JADX WARN: Invalid debug info offset */
        public void setIsFromSinglePress(boolean z) {
        }

        /* JADX WARN: Invalid debug info offset */
        public void setType(int i) {
        }
    }

    public static class ImageInfo {
        public boolean mIsGif;
        public String mPicUrl;
        public long mRawDataSize;

        /* JADX WARN: Invalid debug info offset */
        public long getPicSize() {
            return 0L;
        }

        /* JADX WARN: Invalid debug info offset */
        public String getPicUrl() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public boolean isGif() {
            return false;
        }
    }

    @Deprecated
    public interface PictureListener {
        @Deprecated
        void onNewPicture(IX5WebViewBase iX5WebViewBase, Picture picture, boolean z);

        void onNewPictureIfHaveContent(IX5WebViewBase iX5WebViewBase, Picture picture);
    }

    public static class WebViewTransport {
        private IX5WebViewBase mWebview;

        /* JADX WARN: Invalid debug info offset */
        public synchronized IX5WebViewBase getWebView() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        public synchronized void setWebView(com.tencent.smtt.export.external.interfaces.IX5WebViewBase r1) {
            /*
                r0 = this;
                return
            L5:
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.export.external.interfaces.IX5WebViewBase.WebViewTransport.setWebView(com.tencent.smtt.export.external.interfaces.IX5WebViewBase):void");
        }
    }

    void addJavascriptInterface(Object obj, String str);

    boolean canGoBack();

    boolean canGoBackOrForward(int i);

    boolean canGoForward();

    @Deprecated
    boolean canZoomIn();

    @Deprecated
    boolean canZoomOut();

    Picture capturePicture();

    void clearCache(boolean z);

    void clearFormData();

    void clearHistory();

    void clearMatches();

    void clearSslPreferences();

    @Deprecated
    void clearView();

    void computeScroll();

    IX5WebBackForwardList copyBackForwardList();

    Object createPrintDocumentAdapter(String str);

    void destroy();

    void documentHasImages(Message message);

    void dumpViewHierarchyWithProperties(BufferedWriter bufferedWriter, int i);

    @Deprecated
    int findAll(String str);

    void findAllAsync(String str);

    View findHierarchyView(String str, int i);

    void findNext(boolean z);

    void flingScroll(int i, int i2);

    void freeMemory();

    SslCertificate getCertificate();

    int getContentHeight();

    int getContentWidth();

    Bitmap getFavicon();

    HitTestResult getHitTestResult();

    String[] getHttpAuthUsernamePassword(String str, String str2);

    String getOriginalUrl();

    int getProgress();

    @Deprecated
    float getScale();

    IX5WebSettings getSettings();

    String getTitle();

    String getUrl();

    View getView();

    int getVisibleTitleHeight();

    IX5WebViewExtension getX5WebViewExtension();

    @Deprecated
    View getZoomControls();

    void goBack();

    void goBackOrForward(int i);

    void goForward();

    void invokeZoomPicker();

    boolean isPrivateBrowsingEnable();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    void loadUrl(String str, Map<String, String> map);

    void onPause();

    void onResume();

    boolean overlayHorizontalScrollbar();

    boolean overlayVerticalScrollbar();

    boolean pageDown(boolean z, int i);

    boolean pageUp(boolean z, int i);

    void pauseTimers();

    void postUrl(String str, byte[] bArr);

    void refreshPlugins(boolean z);

    void reload();

    void removeJavascriptInterface(String str);

    void requestFocusNodeHref(Message message);

    void requestImageRef(Message message);

    @Deprecated
    boolean restorePicture(Bundle bundle, File file);

    IX5WebBackForwardList restoreState(Bundle bundle);

    void resumeTimers();

    @Deprecated
    void savePassword(String str, String str2, String str3);

    @Deprecated
    boolean savePicture(Bundle bundle, File file);

    IX5WebBackForwardList saveState(Bundle bundle);

    void saveWebArchive(String str);

    void saveWebArchive(String str, boolean z, ValueCallback<String> valueCallback);

    void setBackgroundColor(int i);

    void setCertificate(SslCertificate sslCertificate);

    void setDownloadListener(DownloadListener downloadListener);

    void setFindListener(FindListener findListener);

    void setHorizontalScrollbarOverlay(boolean z);

    void setHttpAuthUsernamePassword(String str, String str2, String str3, String str4);

    void setInitialScale(int i);

    @Deprecated
    void setMapTrackballToArrowKeys(boolean z);

    void setNetworkAvailable(boolean z);

    void setPictureListener(PictureListener pictureListener);

    void setVerticalScrollbarOverlay(boolean z);

    void setWebChromeClient(IX5WebChromeClient iX5WebChromeClient);

    void setWebViewClient(IX5WebViewClient iX5WebViewClient);

    @Deprecated
    boolean showFindDialog(String str, boolean z);

    void stopLoading();

    boolean zoomIn();

    boolean zoomOut();
}
