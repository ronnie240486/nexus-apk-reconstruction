package com.squareup.picasso;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes2.dex */
public interface Cache {

    /* JADX INFO: renamed from: a */
    public static final Cache f12383a = new Cache() { // from class: com.squareup.picasso.Cache.1
        @Override // com.squareup.picasso.Cache
        /* JADX INFO: renamed from: a */
        public int mo18608a() {
            return 0;
        }

        @Override // com.squareup.picasso.Cache
        /* JADX INFO: renamed from: b */
        public void mo18609b(String str, Bitmap bitmap) {
        }

        @Override // com.squareup.picasso.Cache
        /* JADX INFO: renamed from: c */
        public void mo18610c(String str) {
        }

        @Override // com.squareup.picasso.Cache
        public void clear() {
        }

        @Override // com.squareup.picasso.Cache
        public Bitmap get(String str) {
            return null;
        }

        @Override // com.squareup.picasso.Cache
        public int size() {
            return 0;
        }
    };

    /* JADX INFO: renamed from: a */
    int mo18608a();

    /* JADX INFO: renamed from: b */
    void mo18609b(String str, Bitmap bitmap);

    /* JADX INFO: renamed from: c */
    void mo18610c(String str);

    void clear();

    Bitmap get(String str);

    int size();
}
