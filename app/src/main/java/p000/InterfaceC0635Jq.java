package p000;

/* JADX INFO: renamed from: Jq */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0635Jq {
    boolean canPause();

    boolean canSeekBackward();

    boolean canSeekForward();

    int getBufferPercentage();

    int getCurrentPosition();

    int getDuration();

    boolean isPlaying();

    void pause();

    void seekTo(long j);

    void setSpeed(float f);

    void start();
}
