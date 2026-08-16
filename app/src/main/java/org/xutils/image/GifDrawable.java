package org.xutils.image;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Movie;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public class GifDrawable extends Drawable implements Runnable, Animatable {

    /* JADX INFO: renamed from: a */
    public int f18246a;

    /* JADX INFO: renamed from: b */
    public int f18247b;

    /* JADX INFO: renamed from: c */
    public volatile boolean f18248c;

    /* JADX INFO: renamed from: d */
    public final Movie f18249d;

    /* JADX INFO: renamed from: e */
    public final int f18250e;

    /* JADX INFO: renamed from: f */
    public final long f18251f;

    /* JADX WARN: Invalid debug info offset */
    public GifDrawable(Movie movie, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public int m27195a() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public int m27196b() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public Movie m27197c() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public int m27198d() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public void m27199e(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.lang.Runnable
    public void run() {
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.graphics.drawable.Animatable
    public void start() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.graphics.drawable.Animatable
    public void stop() {
    }
}
