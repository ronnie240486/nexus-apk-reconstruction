package p000;

import android.media.ViviTV.activity.VideoAlbumActivity;
import android.media.ViviTV.activity.VideoAlbumActivityV2;
import android.media.ViviTV.activity.VideoAlbumActivityWithIntroduce;
import android.media.ViviTV.activity.VideoDetailsFragmentActivity;
import android.media.ViviTV.activity.VideoDetailsFragmentActivityV2;

/* JADX INFO: loaded from: classes.dex */
public enum F00 {
    DETAILS_DEFAULT(1, VideoDetailsFragmentActivity.class),
    DETAILS_ALL_IN_ONE(2, VideoDetailsFragmentActivityV2.class),
    ALBUM(3, VideoAlbumActivity.class),
    ALBUM_SET(4, VideoAlbumActivityV2.class),
    ALBUM_WITH_INTRO(5, VideoAlbumActivityWithIntroduce.class);

    private static F00[] values = null;
    private Class<?> activityCls;
    private int intVal;

    F00(int i, Class cls) {
        this.intVal = i;
        this.activityCls = cls;
    }

    public static F00 from(int i) {
        if (values == null) {
            values = values();
        }
        return values[i];
    }

    public Class<?> activityClass() {
        return this.activityCls;
    }

    public int intVal() {
        return this.intVal;
    }

    public boolean isAlbum() {
        return this == ALBUM || this == ALBUM_SET || this == ALBUM_WITH_INTRO;
    }

    public boolean isVideoDetails() {
        return this == DETAILS_DEFAULT || this == DETAILS_ALL_IN_ONE;
    }

    public static F00 from(int i, F00 f00) {
        F00[] f00ArrValues = values();
        if (f00ArrValues == null) {
            return f00;
        }
        for (F00 f01 : f00ArrValues) {
            if (f01.intVal() == i) {
                return f01;
            }
        }
        return f00;
    }
}
