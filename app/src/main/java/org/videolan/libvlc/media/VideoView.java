package org.videolan.libvlc.media;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.media.MediaFormat;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.MediaController;
import java.io.InputStream;
import java.util.Map;
import org.videolan.libvlc.interfaces.ILibVLC;

/* JADX INFO: loaded from: classes.dex */
public class VideoView extends SurfaceView implements MediaController.MediaPlayerControl {

    /* JADX INFO: renamed from: a */
    public static ILibVLC f17638a;

    /* JADX WARN: Invalid debug info offset */
    public VideoView(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    public VideoView(Context context, AttributeSet attributeSet) {
    }

    /* JADX WARN: Invalid debug info offset */
    public VideoView(Context context, AttributeSet attributeSet, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(21)
    public VideoView(Context context, AttributeSet attributeSet, int i, int i2) {
    }

    /* JADX INFO: renamed from: a */
    public void m25506a(InputStream inputStream, MediaFormat mediaFormat) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public int m25507b(int i, int i2) {
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public void m25508c() {
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canPause() {
        return false;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekBackward() {
        return false;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekForward() {
        return false;
    }

    /* JADX INFO: renamed from: d */
    public void m25509d() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.SurfaceView, android.view.View
    public void draw(Canvas canvas) {
    }

    /* JADX INFO: renamed from: e */
    public void m25510e() {
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    @TargetApi(18)
    public int getAudioSessionId() {
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        return -1;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.SurfaceView, android.view.View
    public void onAttachedToWindow() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View
    @TargetApi(14)
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View
    @TargetApi(14)
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.SurfaceView, android.view.View
    public void onMeasure(int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void pause() {
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(int i) {
    }

    public void setMediaController(MediaController mediaController) {
    }

    public void setOnCompletionListener(android.media.MediaPlayer.OnCompletionListener onCompletionListener) {
    }

    public void setOnErrorListener(android.media.MediaPlayer.OnErrorListener onErrorListener) {
    }

    @TargetApi(17)
    public void setOnInfoListener(android.media.MediaPlayer.OnInfoListener onInfoListener) {
    }

    public void setOnPreparedListener(android.media.MediaPlayer.OnPreparedListener onPreparedListener) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setVideoPath(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setVideoURI(Uri uri) {
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(21)
    public void setVideoURI(Uri uri, Map<String, String> map) {
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void start() {
    }
}
