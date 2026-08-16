package com.tencent.smtt.sdk;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class TbsReaderView extends FrameLayout {
    public static final String IS_BAR_ANIMATING = "is_bar_animating";
    public static final String IS_BAR_SHOWING = "is_bar_show";
    public static final String IS_INTO_DOWNLOADING = "into_downloading";
    public static final String KEY_FILE_PATH = "filePath";
    public static final String KEY_TEMP_PATH = "tempPath";
    public static final int READER_CHANNEL_DOC_ID = 10965;
    public static final int READER_CHANNEL_PDF_ID = 10834;
    public static final int READER_CHANNEL_PPT_ID = 10833;
    public static final int READER_CHANNEL_TXT_ID = 10835;
    public static final String READER_STATISTICS_COUNT_CANCEL_LOADED_BTN = "AHNG802";
    public static final String READER_STATISTICS_COUNT_CLICK_LOADED_BTN = "AHNG801";
    public static final String READER_STATISTICS_COUNT_DOC_INTO_BROWSER = "AHNG829";
    public static final String READER_STATISTICS_COUNT_DOC_INTO_DIALOG = "AHNG827";
    public static final String READER_STATISTICS_COUNT_DOC_INTO_DOWNLOAD = "AHNG828";
    public static final String READER_STATISTICS_COUNT_DOC_SEARCH_BTN = "AHNG826";
    public static final String READER_STATISTICS_COUNT_PDF_FOLDER_BTN = "AHNG810";
    public static final String READER_STATISTICS_COUNT_PDF_INTO_BROWSER = "AHNG813";
    public static final String READER_STATISTICS_COUNT_PDF_INTO_DIALOG = "AHNG811";
    public static final String READER_STATISTICS_COUNT_PDF_INTO_DOWNLOAD = "AHNG812";
    public static final String READER_STATISTICS_COUNT_PPT_INTO_BROWSER = "AHNG809";
    public static final String READER_STATISTICS_COUNT_PPT_INTO_DIALOG = "AHNG807";
    public static final String READER_STATISTICS_COUNT_PPT_INTO_DOWNLOAD = "AHNG808";
    public static final String READER_STATISTICS_COUNT_PPT_PLAY_BTN = "AHNG806";
    public static final String READER_STATISTICS_COUNT_RETRY_BTN = "AHNG803";
    public static final String READER_STATISTICS_COUNT_TXT_INTO_BROWSER = "AHNG817";
    public static final String READER_STATISTICS_COUNT_TXT_INTO_DIALOG = "AHNG815";
    public static final String READER_STATISTICS_COUNT_TXT_INTO_DOWNLOAD = "AHNG816";
    public static final String READER_STATISTICS_COUNT_TXT_NOVEL_BTN = "AHNG814";
    public static final String TAG = "TbsReaderView";

    /* JADX INFO: renamed from: f */
    static boolean f12885f = false;
    public static String gReaderPackName = "";
    public static String gReaderPackVersion = "";

    /* JADX INFO: renamed from: a */
    Context f12886a;

    /* JADX INFO: renamed from: b */
    ReaderWizard f12887b;

    /* JADX INFO: renamed from: c */
    Object f12888c;

    /* JADX INFO: renamed from: d */
    ReaderCallback f12889d;

    /* JADX INFO: renamed from: e */
    ReaderCallback f12890e;

    public interface ReaderCallback {
        public static final int COPY_SELECT_TEXT = 5003;
        public static final int GET_BAR_ANIMATING = 5000;
        public static final int GET_BAR_ISSHOWING = 5024;
        public static final int HIDDEN_BAR = 5001;
        public static final int INSTALL_QB = 5011;
        public static final int NOTIFY_CANDISPLAY = 12;
        public static final int NOTIFY_ERRORCODE = 19;
        public static final int READER_OPEN_QQ_FILE_LIST = 5031;
        public static final int READER_PDF_LIST = 5008;
        public static final int READER_PLUGIN_ACTIVITY_PAUSE = 5032;
        public static final int READER_PLUGIN_CANLOAD = 5013;
        public static final int READER_PLUGIN_COMMAND_FIXSCREEN = 5015;
        public static final int READER_PLUGIN_COMMAND_PDF_LIST = 5036;
        public static final int READER_PLUGIN_COMMAND_PPT_PLAYER = 5035;
        public static final int READER_PLUGIN_COMMAND_ROTATESCREEN = 5018;
        public static final int READER_PLUGIN_COMMAND_TEXT_FIND = 5038;
        public static final int READER_PLUGIN_COMMAND_TEXT_FIND_CLEAR = 5041;
        public static final int READER_PLUGIN_COMMAND_TEXT_FIND_NEXT = 5039;
        public static final int READER_PLUGIN_COMMAND_TEXT_FIND_PREV = 5040;
        public static final int READER_PLUGIN_DOWNLOADING = 5014;
        public static final int READER_PLUGIN_RES_DOC_GUIDE = 5029;
        public static final int READER_PLUGIN_RES_FIXSCREEN_NORMAL = 5016;
        public static final int READER_PLUGIN_RES_FIXSCREEN_PRESS = 5017;
        public static final int READER_PLUGIN_RES_PDF_GUIDE = 5023;
        public static final int READER_PLUGIN_RES_PPT_GUIDE = 5021;
        public static final int READER_PLUGIN_RES_ROTATESCREEN_NORMAL = 5019;
        public static final int READER_PLUGIN_RES_ROTATESCREEN_PRESS = 5020;
        public static final int READER_PLUGIN_RES_TXT_GUIDE = 5022;
        public static final int READER_PLUGIN_SO_ERR = 5025;
        public static final int READER_PLUGIN_SO_INTO_START = 5027;
        public static final int READER_PLUGIN_SO_PROGRESS = 5028;
        public static final int READER_PLUGIN_SO_VERSION = 5030;
        public static final int READER_PLUGIN_STATUS = 5012;
        public static final int READER_PLUGIN_TEXT_FIND_RESULT = 5042;
        public static final int READER_PPT_PLAY_MODEL = 5009;
        public static final int READER_SEARCH_IN_DOCUMENT = 5026;
        public static final int READER_TOAST = 5005;
        public static final int READER_TXT_READING_MODEL = 5010;
        public static final int SEARCH_SELECT_TEXT = 5004;
        public static final int SHOW_BAR = 5002;
        public static final int SHOW_DIALOG = 5006;

        void onCallBackAction(Integer num, Object obj, Object obj2);
    }

    /* JADX WARN: Invalid debug info offset */
    public TbsReaderView(Context context, ReaderCallback readerCallback) throws RuntimeException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static boolean m18960a(Context context) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public static Drawable getResDrawable(Context context, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static String getResString(Context context, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean isSupportExt(Context context, String str) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public boolean m18961a() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public void doCommand(Integer num, Object obj, Object obj2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean downloadPlugin(String str) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public void onSizeChanged(int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void onStop() {
    }

    /* JADX WARN: Invalid debug info offset */
    public void openFile(Bundle bundle) {
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean preOpen(String str, boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public void userStatistics(String str) {
    }
}
