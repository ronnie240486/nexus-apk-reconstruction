package androidx.core.app;

import android.app.NotificationChannel;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;
import p000.C0017AE;
import p000.C1627ZD;
import p000.C1694aE;
import p000.C2961bE;
import p000.C3024cE;
import p000.C4208dE;
import p000.C4274eE;
import p000.C4337fE;
import p000.C4401gE;
import p000.C4464hE;
import p000.C4527iE;
import p000.C4662kE;
import p000.C5362sE;
import p000.C5425tE;
import p000.C5507uE;
import p000.C5578vE;
import p000.C5642wE;
import p000.C5709xE;
import p000.C5774yE;
import p000.C5844zE;

/* JADX INFO: loaded from: classes.dex */
public class NotificationChannelCompat {
    public static final String DEFAULT_CHANNEL_ID = "miscellaneous";
    private static final int DEFAULT_LIGHT_COLOR = 0;
    private static final boolean DEFAULT_SHOW_BADGE = true;
    AudioAttributes mAudioAttributes;
    private boolean mBypassDnd;
    private boolean mCanBubble;
    String mConversationId;
    String mDescription;
    String mGroupId;

    @NonNull
    final String mId;
    int mImportance;
    private boolean mImportantConversation;
    int mLightColor;
    boolean mLights;
    private int mLockscreenVisibility;
    CharSequence mName;
    String mParentId;
    boolean mShowBadge;
    Uri mSound;
    boolean mVibrationEnabled;
    long[] mVibrationPattern;

    public static class Builder {
        private final NotificationChannelCompat mChannel;

        public Builder(@NonNull String str, int i) {
            this.mChannel = new NotificationChannelCompat(str, i);
        }

        @NonNull
        public NotificationChannelCompat build() {
            return this.mChannel;
        }

        @NonNull
        public Builder setConversationId(@NonNull String str, @NonNull String str2) {
            if (Build.VERSION.SDK_INT >= 30) {
                NotificationChannelCompat notificationChannelCompat = this.mChannel;
                notificationChannelCompat.mParentId = str;
                notificationChannelCompat.mConversationId = str2;
            }
            return this;
        }

        @NonNull
        public Builder setDescription(@Nullable String str) {
            this.mChannel.mDescription = str;
            return this;
        }

        @NonNull
        public Builder setGroup(@Nullable String str) {
            this.mChannel.mGroupId = str;
            return this;
        }

        @NonNull
        public Builder setImportance(int i) {
            this.mChannel.mImportance = i;
            return this;
        }

        @NonNull
        public Builder setLightColor(int i) {
            this.mChannel.mLightColor = i;
            return this;
        }

        @NonNull
        public Builder setLightsEnabled(boolean z) {
            this.mChannel.mLights = z;
            return this;
        }

        @NonNull
        public Builder setName(@Nullable CharSequence charSequence) {
            this.mChannel.mName = charSequence;
            return this;
        }

        @NonNull
        public Builder setShowBadge(boolean z) {
            this.mChannel.mShowBadge = z;
            return this;
        }

        @NonNull
        public Builder setSound(@Nullable Uri uri, @Nullable AudioAttributes audioAttributes) {
            NotificationChannelCompat notificationChannelCompat = this.mChannel;
            notificationChannelCompat.mSound = uri;
            notificationChannelCompat.mAudioAttributes = audioAttributes;
            return this;
        }

        @NonNull
        public Builder setVibrationEnabled(boolean z) {
            this.mChannel.mVibrationEnabled = z;
            return this;
        }

        @NonNull
        public Builder setVibrationPattern(@Nullable long[] jArr) {
            NotificationChannelCompat notificationChannelCompat = this.mChannel;
            notificationChannelCompat.mVibrationEnabled = jArr != null && jArr.length > 0;
            notificationChannelCompat.mVibrationPattern = jArr;
            return this;
        }
    }

    @RequiresApi(26)
    public NotificationChannelCompat(@NonNull NotificationChannel notificationChannel) {
        this(C4662kE.m21759a(notificationChannel), C1694aE.m8900a(notificationChannel));
        this.mName = C2961bE.m14607a(notificationChannel);
        this.mDescription = C3024cE.m16452a(notificationChannel);
        this.mGroupId = C4208dE.m19887a(notificationChannel);
        this.mShowBadge = C4274eE.m20062a(notificationChannel);
        this.mSound = C4337fE.m20304a(notificationChannel);
        this.mAudioAttributes = C4401gE.m20739a(notificationChannel);
        this.mLights = C4464hE.m20977a(notificationChannel);
        this.mLightColor = C4527iE.m21351a(notificationChannel);
        this.mVibrationEnabled = C5425tE.m28372a(notificationChannel);
        this.mVibrationPattern = C5507uE.m28591a(notificationChannel);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.mParentId = C5578vE.m28794a(notificationChannel);
            this.mConversationId = C5642wE.m29228a(notificationChannel);
        }
        this.mBypassDnd = C5709xE.m29455a(notificationChannel);
        this.mLockscreenVisibility = C5774yE.m29773a(notificationChannel);
        if (i >= 29) {
            this.mCanBubble = C5844zE.m29959a(notificationChannel);
        }
        if (i >= 30) {
            this.mImportantConversation = C0017AE.m107a(notificationChannel);
        }
    }

    public boolean canBubble() {
        return this.mCanBubble;
    }

    public boolean canBypassDnd() {
        return this.mBypassDnd;
    }

    public boolean canShowBadge() {
        return this.mShowBadge;
    }

    @Nullable
    public AudioAttributes getAudioAttributes() {
        return this.mAudioAttributes;
    }

    @Nullable
    public String getConversationId() {
        return this.mConversationId;
    }

    @Nullable
    public String getDescription() {
        return this.mDescription;
    }

    @Nullable
    public String getGroup() {
        return this.mGroupId;
    }

    @NonNull
    public String getId() {
        return this.mId;
    }

    public int getImportance() {
        return this.mImportance;
    }

    public int getLightColor() {
        return this.mLightColor;
    }

    public int getLockscreenVisibility() {
        return this.mLockscreenVisibility;
    }

    @Nullable
    public CharSequence getName() {
        return this.mName;
    }

    public NotificationChannel getNotificationChannel() {
        String str;
        String str2;
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return null;
        }
        NotificationChannel notificationChannel = new NotificationChannel(this.mId, this.mName, this.mImportance);
        notificationChannel.setDescription(this.mDescription);
        notificationChannel.setGroup(this.mGroupId);
        notificationChannel.setShowBadge(this.mShowBadge);
        notificationChannel.setSound(this.mSound, this.mAudioAttributes);
        notificationChannel.enableLights(this.mLights);
        notificationChannel.setLightColor(this.mLightColor);
        notificationChannel.setVibrationPattern(this.mVibrationPattern);
        notificationChannel.enableVibration(this.mVibrationEnabled);
        if (i >= 30 && (str = this.mParentId) != null && (str2 = this.mConversationId) != null) {
            C5362sE.m28128a(notificationChannel, str, str2);
        }
        return notificationChannel;
    }

    @Nullable
    public String getParentChannelId() {
        return this.mParentId;
    }

    @Nullable
    public Uri getSound() {
        return this.mSound;
    }

    @Nullable
    public long[] getVibrationPattern() {
        return this.mVibrationPattern;
    }

    public boolean isImportantConversation() {
        return this.mImportantConversation;
    }

    public boolean shouldShowLights() {
        return this.mLights;
    }

    public boolean shouldVibrate() {
        return this.mVibrationEnabled;
    }

    @NonNull
    public Builder toBuilder() {
        return new Builder(this.mId, this.mImportance).setName(this.mName).setDescription(this.mDescription).setGroup(this.mGroupId).setShowBadge(this.mShowBadge).setSound(this.mSound, this.mAudioAttributes).setLightsEnabled(this.mLights).setLightColor(this.mLightColor).setVibrationEnabled(this.mVibrationEnabled).setVibrationPattern(this.mVibrationPattern).setConversationId(this.mParentId, this.mConversationId);
    }

    public NotificationChannelCompat(@NonNull String str, int i) {
        this.mShowBadge = true;
        this.mSound = Settings.System.DEFAULT_NOTIFICATION_URI;
        this.mLightColor = 0;
        this.mId = (String) Preconditions.checkNotNull(str);
        this.mImportance = i;
        if (Build.VERSION.SDK_INT >= 21) {
            this.mAudioAttributes = C1627ZD.m8644a();
        }
    }
}
