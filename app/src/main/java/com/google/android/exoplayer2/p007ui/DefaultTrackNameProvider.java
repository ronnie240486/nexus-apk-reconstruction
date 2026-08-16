package com.google.android.exoplayer2.p007ui;

import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.exoplayer2.C3219C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import java.util.Locale;
import p000.C0396G3;

/* JADX INFO: loaded from: classes2.dex */
public class DefaultTrackNameProvider implements TrackNameProvider {
    private final Resources resources;

    public DefaultTrackNameProvider(Resources resources) {
        this.resources = (Resources) Assertions.checkNotNull(resources);
    }

    private String buildAudioChannelString(Format format) {
        Resources resources;
        int i;
        int i2 = format.channelCount;
        if (i2 == -1 || i2 < 1) {
            return "";
        }
        if (i2 == 1) {
            resources = this.resources;
            i = C3355R.string.exo_track_mono;
        } else if (i2 == 2) {
            resources = this.resources;
            i = C3355R.string.exo_track_stereo;
        } else if (i2 == 6 || i2 == 7) {
            resources = this.resources;
            i = C3355R.string.exo_track_surround_5_point_1;
        } else if (i2 != 8) {
            resources = this.resources;
            i = C3355R.string.exo_track_surround;
        } else {
            resources = this.resources;
            i = C3355R.string.exo_track_surround_7_point_1;
        }
        return resources.getString(i);
    }

    private String buildBitrateString(Format format) {
        int i = format.bitrate;
        return i == -1 ? "" : this.resources.getString(C3355R.string.exo_track_bitrate, Float.valueOf(i / 1000000.0f));
    }

    private String buildLabelString(Format format) {
        return TextUtils.isEmpty(format.label) ? "" : format.label;
    }

    private String buildLanguageOrLabelString(Format format) {
        String strJoinWithSeparator = joinWithSeparator(buildLanguageString(format), buildRoleString(format));
        return TextUtils.isEmpty(strJoinWithSeparator) ? buildLabelString(format) : strJoinWithSeparator;
    }

    private String buildLanguageString(Format format) {
        String str = format.language;
        if (TextUtils.isEmpty(str) || C3219C.LANGUAGE_UNDETERMINED.equals(str)) {
            return "";
        }
        return (Util.SDK_INT >= 21 ? C0396G3.m1985a(str) : new Locale(str)).getDisplayName();
    }

    private String buildResolutionString(Format format) {
        int i = format.width;
        int i2 = format.height;
        return (i == -1 || i2 == -1) ? "" : this.resources.getString(C3355R.string.exo_track_resolution, Integer.valueOf(i), Integer.valueOf(i2));
    }

    private String buildRoleString(Format format) {
        String string = (format.roleFlags & 2) != 0 ? this.resources.getString(C3355R.string.exo_track_role_alternate) : "";
        if ((format.roleFlags & 4) != 0) {
            string = joinWithSeparator(string, this.resources.getString(C3355R.string.exo_track_role_supplementary));
        }
        if ((format.roleFlags & 8) != 0) {
            string = joinWithSeparator(string, this.resources.getString(C3355R.string.exo_track_role_commentary));
        }
        return (format.roleFlags & 1088) != 0 ? joinWithSeparator(string, this.resources.getString(C3355R.string.exo_track_role_closed_captions)) : string;
    }

    private static int inferPrimaryTrackType(Format format) {
        int trackType = MimeTypes.getTrackType(format.sampleMimeType);
        if (trackType != -1) {
            return trackType;
        }
        if (MimeTypes.getVideoMediaMimeType(format.codecs) != null) {
            return 2;
        }
        if (MimeTypes.getAudioMediaMimeType(format.codecs) != null) {
            return 1;
        }
        if (format.width == -1 && format.height == -1) {
            return (format.channelCount == -1 && format.sampleRate == -1) ? -1 : 1;
        }
        return 2;
    }

    private String joinWithSeparator(String... strArr) {
        String string = "";
        for (String str : strArr) {
            if (str.length() > 0) {
                string = TextUtils.isEmpty(string) ? str : this.resources.getString(C3355R.string.exo_item_list, string, str);
            }
        }
        return string;
    }

    @Override // com.google.android.exoplayer2.p007ui.TrackNameProvider
    public String getTrackName(Format format) {
        String strJoinWithSeparator;
        int iInferPrimaryTrackType = inferPrimaryTrackType(format);
        if (iInferPrimaryTrackType == 2) {
            strJoinWithSeparator = joinWithSeparator(buildRoleString(format), buildResolutionString(format), buildBitrateString(format));
        } else {
            strJoinWithSeparator = iInferPrimaryTrackType == 1 ? joinWithSeparator(buildLanguageOrLabelString(format), buildAudioChannelString(format), buildBitrateString(format)) : buildLanguageOrLabelString(format);
        }
        return strJoinWithSeparator.length() == 0 ? this.resources.getString(C3355R.string.exo_track_unknown) : strJoinWithSeparator;
    }
}
