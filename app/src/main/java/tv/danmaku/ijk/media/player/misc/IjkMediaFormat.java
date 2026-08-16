package tv.danmaku.ijk.media.player.misc;

import android.annotation.TargetApi;
import java.util.HashMap;
import java.util.Map;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes3.dex */
public class IjkMediaFormat implements IMediaFormat {
    public static final String CODEC_NAME_H264 = "h264";
    public static final String KEY_IJK_BIT_RATE_UI = "ijk-bit-rate-ui";
    public static final String KEY_IJK_CHANNEL_UI = "ijk-channel-ui";
    public static final String KEY_IJK_CODEC_LONG_NAME_UI = "ijk-codec-long-name-ui";
    public static final String KEY_IJK_CODEC_NAME_UI = "ijk-codec-name-ui";
    public static final String KEY_IJK_CODEC_PIXEL_FORMAT_UI = "ijk-pixel-format-ui";
    public static final String KEY_IJK_CODEC_PROFILE_LEVEL_UI = "ijk-profile-level-ui";
    public static final String KEY_IJK_FRAME_RATE_UI = "ijk-frame-rate-ui";
    public static final String KEY_IJK_RESOLUTION_UI = "ijk-resolution-ui";
    public static final String KEY_IJK_SAMPLE_RATE_UI = "ijk-sample-rate-ui";
    private static final Map<String, Formatter> sFormatterMap = new HashMap();
    public final IjkMediaMeta.IjkStreamMeta mMediaFormat;

    /* JADX INFO: renamed from: tv.danmaku.ijk.media.player.misc.IjkMediaFormat$1 */
    public class C54791 extends Formatter {
        final /* synthetic */ IjkMediaFormat this$0;

        /* JADX WARN: Invalid debug info offset */
        public C54791(IjkMediaFormat ijkMediaFormat) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // tv.danmaku.ijk.media.player.misc.IjkMediaFormat.Formatter
        public String doFormat(IjkMediaFormat ijkMediaFormat) {
            return null;
        }
    }

    /* JADX INFO: renamed from: tv.danmaku.ijk.media.player.misc.IjkMediaFormat$2 */
    public class C54802 extends Formatter {
        final /* synthetic */ IjkMediaFormat this$0;

        /* JADX WARN: Invalid debug info offset */
        public C54802(IjkMediaFormat ijkMediaFormat) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // tv.danmaku.ijk.media.player.misc.IjkMediaFormat.Formatter
        public String doFormat(IjkMediaFormat ijkMediaFormat) {
            return null;
        }
    }

    /* JADX INFO: renamed from: tv.danmaku.ijk.media.player.misc.IjkMediaFormat$3 */
    public class C54813 extends Formatter {
        final /* synthetic */ IjkMediaFormat this$0;

        /* JADX WARN: Invalid debug info offset */
        public C54813(IjkMediaFormat ijkMediaFormat) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // tv.danmaku.ijk.media.player.misc.IjkMediaFormat.Formatter
        public String doFormat(IjkMediaFormat ijkMediaFormat) {
            return null;
        }
    }

    /* JADX INFO: renamed from: tv.danmaku.ijk.media.player.misc.IjkMediaFormat$4 */
    public class C54824 extends Formatter {
        final /* synthetic */ IjkMediaFormat this$0;

        /* JADX WARN: Invalid debug info offset */
        public C54824(IjkMediaFormat ijkMediaFormat) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // tv.danmaku.ijk.media.player.misc.IjkMediaFormat.Formatter
        public String doFormat(IjkMediaFormat ijkMediaFormat) {
            return null;
        }
    }

    /* JADX INFO: renamed from: tv.danmaku.ijk.media.player.misc.IjkMediaFormat$5 */
    public class C54835 extends Formatter {
        final /* synthetic */ IjkMediaFormat this$0;

        /* JADX WARN: Invalid debug info offset */
        public C54835(IjkMediaFormat ijkMediaFormat) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // tv.danmaku.ijk.media.player.misc.IjkMediaFormat.Formatter
        public String doFormat(IjkMediaFormat ijkMediaFormat) {
            return null;
        }
    }

    /* JADX INFO: renamed from: tv.danmaku.ijk.media.player.misc.IjkMediaFormat$6 */
    public class C54846 extends Formatter {
        final /* synthetic */ IjkMediaFormat this$0;

        /* JADX WARN: Invalid debug info offset */
        public C54846(IjkMediaFormat ijkMediaFormat) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // tv.danmaku.ijk.media.player.misc.IjkMediaFormat.Formatter
        public String doFormat(IjkMediaFormat ijkMediaFormat) {
            return null;
        }
    }

    /* JADX INFO: renamed from: tv.danmaku.ijk.media.player.misc.IjkMediaFormat$7 */
    public class C54857 extends Formatter {
        final /* synthetic */ IjkMediaFormat this$0;

        /* JADX WARN: Invalid debug info offset */
        public C54857(IjkMediaFormat ijkMediaFormat) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // tv.danmaku.ijk.media.player.misc.IjkMediaFormat.Formatter
        public String doFormat(IjkMediaFormat ijkMediaFormat) {
            return null;
        }
    }

    /* JADX INFO: renamed from: tv.danmaku.ijk.media.player.misc.IjkMediaFormat$8 */
    public class C54868 extends Formatter {
        final /* synthetic */ IjkMediaFormat this$0;

        /* JADX WARN: Invalid debug info offset */
        public C54868(IjkMediaFormat ijkMediaFormat) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // tv.danmaku.ijk.media.player.misc.IjkMediaFormat.Formatter
        public String doFormat(IjkMediaFormat ijkMediaFormat) {
            return null;
        }
    }

    /* JADX INFO: renamed from: tv.danmaku.ijk.media.player.misc.IjkMediaFormat$9 */
    public class C54879 extends Formatter {
        final /* synthetic */ IjkMediaFormat this$0;

        /* JADX WARN: Invalid debug info offset */
        public C54879(IjkMediaFormat ijkMediaFormat) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // tv.danmaku.ijk.media.player.misc.IjkMediaFormat.Formatter
        public String doFormat(IjkMediaFormat ijkMediaFormat) {
            return null;
        }
    }

    public static abstract class Formatter {
        /* JADX WARN: Invalid debug info offset */
        private Formatter() {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ Formatter(C54791 c54791) {
        }

        public abstract String doFormat(IjkMediaFormat ijkMediaFormat);

        /* JADX WARN: Invalid debug info offset */
        public String format(IjkMediaFormat ijkMediaFormat) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public String getDefaultString() {
            return null;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public IjkMediaFormat(IjkMediaMeta.IjkStreamMeta ijkStreamMeta) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.misc.IMediaFormat
    @TargetApi(16)
    public int getInteger(String str) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // tv.danmaku.ijk.media.player.misc.IMediaFormat
    public String getString(String str) {
        return null;
    }
}
