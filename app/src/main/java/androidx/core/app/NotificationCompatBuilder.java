package androidx.core.app;

import android.app.Notification;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.collection.ArraySet;
import androidx.core.content.LocusIdCompat;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000.C0791MF;
import p000.C1049QF;
import p000.C1629ZF;
import p000.C1696aG;
import p000.C2962bF;
import p000.C2963bG;
import p000.C3026cG;
import p000.C4210dG;
import p000.C4791mG;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
class NotificationCompatBuilder implements NotificationBuilderWithBuilderAccessor {
    private RemoteViews mBigContentView;
    private final Notification.Builder mBuilder;
    private final NotificationCompat.Builder mBuilderCompat;
    private RemoteViews mContentView;
    private final Context mContext;
    private int mGroupAlertBehavior;
    private RemoteViews mHeadsUpContentView;
    private final List<Bundle> mActionExtrasList = new ArrayList();
    private final Bundle mExtras = new Bundle();

    public NotificationCompatBuilder(NotificationCompat.Builder builder) {
        Icon icon;
        List<String> listCombineLists;
        Bundle bundle;
        String str;
        this.mBuilderCompat = builder;
        this.mContext = builder.mContext;
        int i = Build.VERSION.SDK_INT;
        Context context = builder.mContext;
        this.mBuilder = i >= 26 ? new Notification.Builder(context, builder.mChannelId) : new Notification.Builder(context);
        Notification notification = builder.mNotification;
        this.mBuilder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, builder.mTickerView).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(builder.mContentTitle).setContentText(builder.mContentText).setContentInfo(builder.mContentInfo).setContentIntent(builder.mContentIntent).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(builder.mFullScreenIntent, (notification.flags & 128) != 0).setLargeIcon(builder.mLargeIcon).setNumber(builder.mNumber).setProgress(builder.mProgressMax, builder.mProgress, builder.mProgressIndeterminate);
        if (i < 21) {
            this.mBuilder.setSound(notification.sound, notification.audioStreamType);
        }
        this.mBuilder.setSubText(builder.mSubText).setUsesChronometer(builder.mUseChronometer).setPriority(builder.mPriority);
        Iterator<NotificationCompat.Action> it = builder.mActions.iterator();
        while (it.hasNext()) {
            addAction(it.next());
        }
        Bundle bundle2 = builder.mExtras;
        if (bundle2 != null) {
            this.mExtras.putAll(bundle2);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 20) {
            if (builder.mLocalOnly) {
                this.mExtras.putBoolean(NotificationCompatExtras.EXTRA_LOCAL_ONLY, true);
            }
            String str2 = builder.mGroupKey;
            if (str2 != null) {
                this.mExtras.putString(NotificationCompatExtras.EXTRA_GROUP_KEY, str2);
                if (builder.mGroupSummary) {
                    bundle = this.mExtras;
                    str = NotificationCompatExtras.EXTRA_GROUP_SUMMARY;
                } else {
                    bundle = this.mExtras;
                    str = NotificationManagerCompat.EXTRA_USE_SIDE_CHANNEL;
                }
                bundle.putBoolean(str, true);
            }
            String str3 = builder.mSortKey;
            if (str3 != null) {
                this.mExtras.putString(NotificationCompatExtras.EXTRA_SORT_KEY, str3);
            }
        }
        this.mContentView = builder.mContentView;
        this.mBigContentView = builder.mBigContentView;
        this.mBuilder.setShowWhen(builder.mShowWhen);
        if (i2 < 21 && (listCombineLists = combineLists(getPeople(builder.mPersonList), builder.mPeople)) != null && !listCombineLists.isEmpty()) {
            this.mExtras.putStringArray(NotificationCompat.EXTRA_PEOPLE, (String[]) listCombineLists.toArray(new String[listCombineLists.size()]));
        }
        if (i2 >= 20) {
            this.mBuilder.setLocalOnly(builder.mLocalOnly).setGroup(builder.mGroupKey).setGroupSummary(builder.mGroupSummary).setSortKey(builder.mSortKey);
            this.mGroupAlertBehavior = builder.mGroupAlertBehavior;
        }
        if (i2 >= 21) {
            this.mBuilder.setCategory(builder.mCategory).setColor(builder.mColor).setVisibility(builder.mVisibility).setPublicVersion(builder.mPublicVersion).setSound(notification.sound, notification.audioAttributes);
            List listCombineLists2 = i2 < 28 ? combineLists(getPeople(builder.mPersonList), builder.mPeople) : builder.mPeople;
            if (listCombineLists2 != null && !listCombineLists2.isEmpty()) {
                Iterator it2 = listCombineLists2.iterator();
                while (it2.hasNext()) {
                    this.mBuilder.addPerson((String) it2.next());
                }
            }
            this.mHeadsUpContentView = builder.mHeadsUpContentView;
            if (builder.mInvisibleActions.size() > 0) {
                Bundle bundle3 = builder.getExtras().getBundle("android.car.EXTENSIONS");
                bundle3 = bundle3 == null ? new Bundle() : bundle3;
                Bundle bundle4 = new Bundle(bundle3);
                Bundle bundle5 = new Bundle();
                for (int i3 = 0; i3 < builder.mInvisibleActions.size(); i3++) {
                    bundle5.putBundle(Integer.toString(i3), NotificationCompatJellybean.getBundleForAction(builder.mInvisibleActions.get(i3)));
                }
                bundle3.putBundle("invisible_actions", bundle5);
                bundle4.putBundle("invisible_actions", bundle5);
                builder.getExtras().putBundle("android.car.EXTENSIONS", bundle3);
                this.mExtras.putBundle("android.car.EXTENSIONS", bundle4);
            }
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 23 && (icon = builder.mSmallIcon) != null) {
            this.mBuilder.setSmallIcon(icon);
        }
        if (i4 >= 24) {
            this.mBuilder.setExtras(builder.mExtras).setRemoteInputHistory(builder.mRemoteInputHistory);
            RemoteViews remoteViews = builder.mContentView;
            if (remoteViews != null) {
                this.mBuilder.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = builder.mBigContentView;
            if (remoteViews2 != null) {
                this.mBuilder.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = builder.mHeadsUpContentView;
            if (remoteViews3 != null) {
                this.mBuilder.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (i4 >= 26) {
            this.mBuilder.setBadgeIconType(builder.mBadgeIcon).setSettingsText(builder.mSettingsText).setShortcutId(builder.mShortcutId).setTimeoutAfter(builder.mTimeout).setGroupAlertBehavior(builder.mGroupAlertBehavior);
            if (builder.mColorizedSet) {
                this.mBuilder.setColorized(builder.mColorized);
            }
            if (!TextUtils.isEmpty(builder.mChannelId)) {
                this.mBuilder.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i4 >= 28) {
            Iterator<Person> it3 = builder.mPersonList.iterator();
            while (it3.hasNext()) {
                C1629ZF.m8646a(this.mBuilder, it3.next().toAndroidPerson());
            }
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 29) {
            C1696aG.m8902a(this.mBuilder, builder.mAllowSystemGeneratedContextualActions);
            C3026cG.m16454a(this.mBuilder, NotificationCompat.BubbleMetadata.toPlatform(builder.mBubbleMetadata));
            LocusIdCompat locusIdCompat = builder.mLocusId;
            if (locusIdCompat != null) {
                C4210dG.m19889a(this.mBuilder, locusIdCompat.toLocusId());
            }
        }
        if (builder.mSilent) {
            if (this.mBuilderCompat.mGroupSummary) {
                this.mGroupAlertBehavior = 2;
            } else {
                this.mGroupAlertBehavior = 1;
            }
            this.mBuilder.setVibrate(null);
            this.mBuilder.setSound(null);
            int i6 = notification.defaults & (-4);
            notification.defaults = i6;
            this.mBuilder.setDefaults(i6);
            if (i5 >= 26) {
                if (TextUtils.isEmpty(this.mBuilderCompat.mGroupKey)) {
                    this.mBuilder.setGroup(NotificationCompat.GROUP_KEY_SILENT);
                }
                this.mBuilder.setGroupAlertBehavior(this.mGroupAlertBehavior);
            }
        }
    }

    private void addAction(NotificationCompat.Action action) {
        int i = Build.VERSION.SDK_INT;
        if (i < 20) {
            this.mActionExtrasList.add(NotificationCompatJellybean.writeActionAndGetExtras(this.mBuilder, action));
            return;
        }
        IconCompat iconCompat = action.getIconCompat();
        Notification.Action.Builder builder = i >= 23 ? new Notification.Action.Builder(iconCompat != null ? iconCompat.toIcon() : null, action.getTitle(), action.getActionIntent()) : new Notification.Action.Builder(iconCompat != null ? iconCompat.getResId() : 0, action.getTitle(), action.getActionIntent());
        if (action.getRemoteInputs() != null) {
            for (android.app.RemoteInput remoteInput : RemoteInput.fromCompat(action.getRemoteInputs())) {
                builder.addRemoteInput(remoteInput);
            }
        }
        Bundle bundle = action.getExtras() != null ? new Bundle(action.getExtras()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", action.getAllowGeneratedReplies());
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 24) {
            C0791MF.m3673a(builder, action.getAllowGeneratedReplies());
        }
        bundle.putInt("android.support.action.semanticAction", action.getSemanticAction());
        if (i2 >= 28) {
            C2963bG.m14609a(builder, action.getSemanticAction());
        }
        if (i2 >= 29) {
            C4791mG.m22066a(builder, action.isContextual());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", action.getShowsUserInterface());
        builder.addExtras(bundle);
        this.mBuilder.addAction(builder.build());
    }

    @Nullable
    private static List<String> combineLists(@Nullable List<String> list, @Nullable List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        ArraySet arraySet = new ArraySet(list2.size() + list.size());
        arraySet.addAll(list);
        arraySet.addAll(list2);
        return new ArrayList(arraySet);
    }

    @Nullable
    private static List<String> getPeople(@Nullable List<Person> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<Person> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().resolveToLegacyUri());
        }
        return arrayList;
    }

    private void removeSoundAndVibration(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }

    public Notification build() {
        Bundle extras;
        RemoteViews remoteViewsMakeHeadsUpContentView;
        RemoteViews remoteViewsMakeBigContentView;
        NotificationCompat.Style style = this.mBuilderCompat.mStyle;
        if (style != null) {
            style.apply(this);
        }
        RemoteViews remoteViewsMakeContentView = style != null ? style.makeContentView(this) : null;
        Notification notificationBuildInternal = buildInternal();
        if (remoteViewsMakeContentView != null || (remoteViewsMakeContentView = this.mBuilderCompat.mContentView) != null) {
            notificationBuildInternal.contentView = remoteViewsMakeContentView;
        }
        int i = Build.VERSION.SDK_INT;
        if (style != null && (remoteViewsMakeBigContentView = style.makeBigContentView(this)) != null) {
            notificationBuildInternal.bigContentView = remoteViewsMakeBigContentView;
        }
        if (i >= 21 && style != null && (remoteViewsMakeHeadsUpContentView = this.mBuilderCompat.mStyle.makeHeadsUpContentView(this)) != null) {
            C1049QF.m4616a(notificationBuildInternal, remoteViewsMakeHeadsUpContentView);
        }
        if (style != null && (extras = NotificationCompat.getExtras(notificationBuildInternal)) != null) {
            style.addCompatExtras(extras);
        }
        return notificationBuildInternal;
    }

    public Notification buildInternal() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            return this.mBuilder.build();
        }
        if (i >= 24) {
            Notification notificationBuild = this.mBuilder.build();
            if (this.mGroupAlertBehavior != 0) {
                if (C2962bF.m14608a(notificationBuild) != null && (notificationBuild.flags & 512) != 0 && this.mGroupAlertBehavior == 2) {
                    removeSoundAndVibration(notificationBuild);
                }
                if (C2962bF.m14608a(notificationBuild) != null && (notificationBuild.flags & 512) == 0 && this.mGroupAlertBehavior == 1) {
                    removeSoundAndVibration(notificationBuild);
                }
            }
            return notificationBuild;
        }
        if (i >= 21) {
            this.mBuilder.setExtras(this.mExtras);
            Notification notificationBuild2 = this.mBuilder.build();
            RemoteViews remoteViews = this.mContentView;
            if (remoteViews != null) {
                notificationBuild2.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = this.mBigContentView;
            if (remoteViews2 != null) {
                notificationBuild2.bigContentView = remoteViews2;
            }
            RemoteViews remoteViews3 = this.mHeadsUpContentView;
            if (remoteViews3 != null) {
                C1049QF.m4616a(notificationBuild2, remoteViews3);
            }
            if (this.mGroupAlertBehavior != 0) {
                if (C2962bF.m14608a(notificationBuild2) != null && (notificationBuild2.flags & 512) != 0 && this.mGroupAlertBehavior == 2) {
                    removeSoundAndVibration(notificationBuild2);
                }
                if (C2962bF.m14608a(notificationBuild2) != null && (notificationBuild2.flags & 512) == 0 && this.mGroupAlertBehavior == 1) {
                    removeSoundAndVibration(notificationBuild2);
                }
            }
            return notificationBuild2;
        }
        if (i < 20) {
            SparseArray<Bundle> sparseArrayBuildActionExtrasMap = NotificationCompatJellybean.buildActionExtrasMap(this.mActionExtrasList);
            if (sparseArrayBuildActionExtrasMap != null) {
                this.mExtras.putSparseParcelableArray(NotificationCompatExtras.EXTRA_ACTION_EXTRAS, sparseArrayBuildActionExtrasMap);
            }
            this.mBuilder.setExtras(this.mExtras);
            Notification notificationBuild3 = this.mBuilder.build();
            RemoteViews remoteViews4 = this.mContentView;
            if (remoteViews4 != null) {
                notificationBuild3.contentView = remoteViews4;
            }
            RemoteViews remoteViews5 = this.mBigContentView;
            if (remoteViews5 != null) {
                notificationBuild3.bigContentView = remoteViews5;
            }
            return notificationBuild3;
        }
        this.mBuilder.setExtras(this.mExtras);
        Notification notificationBuild4 = this.mBuilder.build();
        RemoteViews remoteViews6 = this.mContentView;
        if (remoteViews6 != null) {
            notificationBuild4.contentView = remoteViews6;
        }
        RemoteViews remoteViews7 = this.mBigContentView;
        if (remoteViews7 != null) {
            notificationBuild4.bigContentView = remoteViews7;
        }
        if (this.mGroupAlertBehavior != 0) {
            if (C2962bF.m14608a(notificationBuild4) != null && (notificationBuild4.flags & 512) != 0 && this.mGroupAlertBehavior == 2) {
                removeSoundAndVibration(notificationBuild4);
            }
            if (C2962bF.m14608a(notificationBuild4) != null && (notificationBuild4.flags & 512) == 0 && this.mGroupAlertBehavior == 1) {
                removeSoundAndVibration(notificationBuild4);
            }
        }
        return notificationBuild4;
    }

    @Override // androidx.core.app.NotificationBuilderWithBuilderAccessor
    public Notification.Builder getBuilder() {
        return this.mBuilder;
    }

    public Context getContext() {
        return this.mContext;
    }
}
