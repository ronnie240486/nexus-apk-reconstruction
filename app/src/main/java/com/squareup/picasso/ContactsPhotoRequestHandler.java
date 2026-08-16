package com.squareup.picasso;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
class ContactsPhotoRequestHandler extends RequestHandler {

    /* JADX INFO: renamed from: b */
    public static final int f12384b = 1;

    /* JADX INFO: renamed from: c */
    public static final int f12385c = 2;

    /* JADX INFO: renamed from: d */
    public static final int f12386d = 3;

    /* JADX INFO: renamed from: e */
    public static final int f12387e = 4;

    /* JADX INFO: renamed from: f */
    public static final UriMatcher f12388f;

    /* JADX INFO: renamed from: a */
    public final Context f12389a;

    @TargetApi(14)
    public static class ContactPhotoStreamIcs {
        /* JADX WARN: Invalid debug info offset */
        private ContactPhotoStreamIcs() {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public static InputStream m18612a(ContentResolver contentResolver, Uri uri) {
            return null;
        }
    }

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f12388f = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "display_photo/#", 4);
    }

    /* JADX WARN: Invalid debug info offset */
    public ContactsPhotoRequestHandler(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    private InputStream m18611j(Request request) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.squareup.picasso.RequestHandler
    /* JADX INFO: renamed from: c */
    public boolean mo9413c(Request request) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.squareup.picasso.RequestHandler
    /* JADX INFO: renamed from: f */
    public RequestHandler.Result mo9414f(Request request, int i) throws IOException {
        return null;
    }
}
