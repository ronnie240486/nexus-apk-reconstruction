package org.xutils;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.io.File;
import org.xutils.common.Callback;
import org.xutils.image.ImageOptions;

/* JADX INFO: loaded from: classes.dex */
public interface ImageManager {
    /* JADX INFO: renamed from: a */
    void mo26650a(ImageView imageView, String str);

    /* JADX INFO: renamed from: b */
    Callback.Cancelable mo26651b(String str, ImageOptions imageOptions, Callback.CommonCallback<Drawable> commonCallback);

    /* JADX INFO: renamed from: c */
    Callback.Cancelable mo26652c(String str, ImageOptions imageOptions, Callback.CacheCallback<File> cacheCallback);

    /* JADX INFO: renamed from: d */
    void mo26653d();

    /* JADX INFO: renamed from: e */
    void mo26654e(ImageView imageView, String str, ImageOptions imageOptions);

    /* JADX INFO: renamed from: f */
    void mo26655f(ImageView imageView, String str, ImageOptions imageOptions, Callback.CommonCallback<Drawable> commonCallback);

    /* JADX INFO: renamed from: g */
    void mo26656g(ImageView imageView, String str, Callback.CommonCallback<Drawable> commonCallback);

    /* JADX INFO: renamed from: h */
    void mo26657h();
}
