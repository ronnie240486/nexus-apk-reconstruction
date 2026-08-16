package androidx.core.app;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p000.C0081BE;
import p000.C0153CE;
import p000.C0217DE;
import p000.C0281EE;
import p000.C0344FE;
import p000.C0407GE;
import p000.C0471HE;
import p000.C4208dE;

/* JADX INFO: loaded from: classes.dex */
public class NotificationChannelGroupCompat {
    private boolean mBlocked;
    private List<NotificationChannelCompat> mChannels;
    String mDescription;
    final String mId;
    CharSequence mName;

    public static class Builder {
        final NotificationChannelGroupCompat mGroup;

        public Builder(@NonNull String str) {
            this.mGroup = new NotificationChannelGroupCompat(str);
        }

        @NonNull
        public NotificationChannelGroupCompat build() {
            return this.mGroup;
        }

        @NonNull
        public Builder setDescription(@Nullable String str) {
            this.mGroup.mDescription = str;
            return this;
        }

        @NonNull
        public Builder setName(@Nullable CharSequence charSequence) {
            this.mGroup.mName = charSequence;
            return this;
        }
    }

    @RequiresApi(28)
    public NotificationChannelGroupCompat(@NonNull NotificationChannelGroup notificationChannelGroup) {
        this(notificationChannelGroup, Collections.emptyList());
    }

    @RequiresApi(26)
    private List<NotificationChannelCompat> getChannelsCompat(List<NotificationChannel> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<NotificationChannel> it = list.iterator();
        while (it.hasNext()) {
            NotificationChannel notificationChannelM2282a = C0471HE.m2282a(it.next());
            if (this.mId.equals(C4208dE.m19887a(notificationChannelM2282a))) {
                arrayList.add(new NotificationChannelCompat(notificationChannelM2282a));
            }
        }
        return arrayList;
    }

    @NonNull
    public List<NotificationChannelCompat> getChannels() {
        return this.mChannels;
    }

    @Nullable
    public String getDescription() {
        return this.mDescription;
    }

    @NonNull
    public String getId() {
        return this.mId;
    }

    @Nullable
    public CharSequence getName() {
        return this.mName;
    }

    public NotificationChannelGroup getNotificationChannelGroup() {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return null;
        }
        NotificationChannelGroup notificationChannelGroup = new NotificationChannelGroup(this.mId, this.mName);
        if (i >= 28) {
            C0407GE.m2033a(notificationChannelGroup, this.mDescription);
        }
        return notificationChannelGroup;
    }

    public boolean isBlocked() {
        return this.mBlocked;
    }

    @NonNull
    public Builder toBuilder() {
        return new Builder(this.mId).setName(this.mName).setDescription(this.mDescription);
    }

    @RequiresApi(26)
    public NotificationChannelGroupCompat(@NonNull NotificationChannelGroup notificationChannelGroup, @NonNull List<NotificationChannel> list) {
        List<NotificationChannelCompat> channelsCompat;
        this(C0081BE.m473a(notificationChannelGroup));
        this.mName = C0153CE.m928a(notificationChannelGroup);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.mDescription = C0217DE.m1326a(notificationChannelGroup);
        }
        if (i >= 28) {
            this.mBlocked = C0281EE.m1543a(notificationChannelGroup);
            channelsCompat = getChannelsCompat(C0344FE.m1804a(notificationChannelGroup));
        } else {
            channelsCompat = getChannelsCompat(list);
        }
        this.mChannels = channelsCompat;
    }

    public NotificationChannelGroupCompat(@NonNull String str) {
        this.mChannels = Collections.emptyList();
        this.mId = (String) Preconditions.checkNotNull(str);
    }
}
