package com.google.android.exoplayer2.p007ui;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.core.app.NotificationCompat;
import com.google.android.exoplayer2.offline.Download;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class DownloadNotificationHelper {

    @StringRes
    private static final int NULL_STRING_ID = 0;
    private final Context context;
    private final NotificationCompat.Builder notificationBuilder;

    public DownloadNotificationHelper(Context context, String str) {
        Context applicationContext = context.getApplicationContext();
        this.context = applicationContext;
        this.notificationBuilder = new NotificationCompat.Builder(applicationContext, str);
    }

    private Notification buildEndStateNotification(@DrawableRes int i, @Nullable PendingIntent pendingIntent, @Nullable String str, @StringRes int i2) {
        return buildNotification(i, pendingIntent, str, i2, 0, 0, false, false, true);
    }

    private Notification buildNotification(@DrawableRes int i, @Nullable PendingIntent pendingIntent, @Nullable String str, @StringRes int i2, int i3, int i4, boolean z, boolean z2, boolean z3) {
        this.notificationBuilder.setSmallIcon(i);
        this.notificationBuilder.setContentTitle(i2 == 0 ? null : this.context.getResources().getString(i2));
        this.notificationBuilder.setContentIntent(pendingIntent);
        this.notificationBuilder.setStyle(str != null ? new NotificationCompat.BigTextStyle().bigText(str) : null);
        this.notificationBuilder.setProgress(i3, i4, z);
        this.notificationBuilder.setOngoing(z2);
        this.notificationBuilder.setShowWhen(z3);
        return this.notificationBuilder.build();
    }

    public Notification buildDownloadCompletedNotification(@DrawableRes int i, @Nullable PendingIntent pendingIntent, @Nullable String str) {
        return buildEndStateNotification(i, pendingIntent, str, C3355R.string.exo_download_completed);
    }

    public Notification buildDownloadFailedNotification(@DrawableRes int i, @Nullable PendingIntent pendingIntent, @Nullable String str) {
        return buildEndStateNotification(i, pendingIntent, str, C3355R.string.exo_download_failed);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    public Notification buildProgressNotification(@DrawableRes int i, @Nullable PendingIntent pendingIntent, @Nullable String str, List<Download> list) {
        int i2;
        int i3;
        int i4;
        boolean z;
        float f = 0.0f;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        int i5 = 0;
        boolean z5 = true;
        boolean z6 = false;
        for (int i6 = 0; i6 < list.size(); i6++) {
            Download download = list.get(i6);
            int i7 = download.state;
            if (i7 == 5) {
                z4 = true;
            } else if (i7 == 7 || i7 == 2) {
                float percentDownloaded = download.getPercentDownloaded();
                if (percentDownloaded != -1.0f) {
                    f += percentDownloaded;
                    z5 = false;
                }
                z6 |= download.getBytesDownloaded() > 0;
                i5++;
                z3 = true;
            }
        }
        if (!z3) {
            if (z4) {
                i3 = C3355R.string.exo_download_removing;
            } else {
                i2 = 0;
            }
            if (z3) {
                int i8 = (int) (f / i5);
                if (z5 && z6) {
                    z2 = true;
                }
                i4 = i8;
                z = z2;
            } else {
                i4 = 0;
                z = true;
            }
            return buildNotification(i, pendingIntent, str, i2, 100, i4, z, true, false);
        }
        i3 = C3355R.string.exo_download_downloading;
        i2 = i3;
        if (z3) {
            int i9 = (int) (f / i5);
            if (z5) {
                z2 = true;
            }
            i4 = i9;
            z = z2;
        } else {
            i4 = 0;
            z = true;
        }
        return buildNotification(i, pendingIntent, str, i2, 100, i4, z, true, false);
    }
}
