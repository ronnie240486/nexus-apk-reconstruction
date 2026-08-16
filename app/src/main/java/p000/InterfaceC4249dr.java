package p000;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: renamed from: dr */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC4249dr {
    /* JADX INFO: renamed from: a */
    void mo13893a();

    /* JADX INFO: renamed from: b */
    void mo13895b(int i);

    boolean canSeekBackward();

    boolean canSeekForward();

    int getBufferPercentage();

    int getCurrentPosition();

    int getDuration();

    boolean isPlaying();

    void pause();

    void seekTo(long j);

    void setIsHardDecode(boolean z);

    void setStartMillSeconds(long j);

    void setTimeoutDuration(long j);

    void setVideoURI(Uri uri);

    void setVideoURI(Uri uri, Map<String, String> map);

    void start();
}
