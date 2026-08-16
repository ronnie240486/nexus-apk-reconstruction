package android.support.v4.media.session;

import android.media.session.PlaybackState;
import android.os.Bundle;
import androidx.annotation.RequiresApi;
import java.util.Iterator;
import java.util.List;
import p000.C0086BJ;
import p000.C0349FJ;
import p000.C0412GJ;
import p000.C0476HJ;
import p000.C0531IB;
import p000.C0539IJ;
import p000.C0602JJ;
import p000.C0667KJ;
import p000.C0733LJ;
import p000.C0795MJ;
import p000.C0922OJ;
import p000.C0988PJ;
import p000.C1053QJ;
import p000.C1243TJ;
import p000.C5714xJ;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
class PlaybackStateCompatApi21 {

    public static final class CustomAction {
        private CustomAction() {
        }

        public static String getAction(Object obj) {
            return C1053QJ.m4620a(C0086BJ.m477a(obj));
        }

        public static Bundle getExtras(Object obj) {
            return C0988PJ.m4391a(C0086BJ.m477a(obj));
        }

        public static int getIcon(Object obj) {
            return C0922OJ.m4241a(C0086BJ.m477a(obj));
        }

        public static CharSequence getName(Object obj) {
            return C1243TJ.m5772a(C0086BJ.m477a(obj));
        }

        public static Object newInstance(String str, CharSequence charSequence, int i, Bundle bundle) {
            PlaybackState.CustomAction.Builder builder = new PlaybackState.CustomAction.Builder(str, charSequence, i);
            builder.setExtras(bundle);
            return builder.build();
        }
    }

    private PlaybackStateCompatApi21() {
    }

    public static long getActions(Object obj) {
        return C0733LJ.m3444a(C0531IB.m2507a(obj));
    }

    public static long getActiveQueueItemId(Object obj) {
        return C0412GJ.m2036a(C0531IB.m2507a(obj));
    }

    public static long getBufferedPosition(Object obj) {
        return C0602JJ.m2942a(C0531IB.m2507a(obj));
    }

    public static List<Object> getCustomActions(Object obj) {
        return C0476HJ.m2285a(C0531IB.m2507a(obj));
    }

    public static CharSequence getErrorMessage(Object obj) {
        return C0539IJ.m2512a(C0531IB.m2507a(obj));
    }

    public static long getLastPositionUpdateTime(Object obj) {
        return C0349FJ.m1807a(C0531IB.m2507a(obj));
    }

    public static float getPlaybackSpeed(Object obj) {
        return C0667KJ.m3136a(C0531IB.m2507a(obj));
    }

    public static long getPosition(Object obj) {
        return C0795MJ.m3695a(C0531IB.m2507a(obj));
    }

    public static int getState(Object obj) {
        return C5714xJ.m29468a(C0531IB.m2507a(obj));
    }

    public static Object newInstance(int i, long j, long j2, float f, long j3, CharSequence charSequence, long j4, List<Object> list, long j5) {
        PlaybackState.Builder builder = new PlaybackState.Builder();
        builder.setState(i, j, f, j4);
        builder.setBufferedPosition(j2);
        builder.setActions(j3);
        builder.setErrorMessage(charSequence);
        Iterator<Object> it = list.iterator();
        while (it.hasNext()) {
            builder.addCustomAction((PlaybackState.CustomAction) it.next());
        }
        builder.setActiveQueueItemId(j5);
        return builder.build();
    }
}
