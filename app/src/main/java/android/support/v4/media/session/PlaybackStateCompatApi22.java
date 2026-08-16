package android.support.v4.media.session;

import android.media.session.PlaybackState;
import android.os.Bundle;
import androidx.annotation.RequiresApi;
import java.util.Iterator;
import java.util.List;
import p000.C0531IB;
import p000.C1307UJ;
import p000.C1375VJ;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(22)
class PlaybackStateCompatApi22 {
    private PlaybackStateCompatApi22() {
    }

    public static Bundle getExtras(Object obj) {
        return C1307UJ.m6218a(C0531IB.m2507a(obj));
    }

    public static Object newInstance(int i, long j, long j2, float f, long j3, CharSequence charSequence, long j4, List<Object> list, long j5, Bundle bundle) {
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
        C1375VJ.m6505a(builder, bundle);
        return builder.build();
    }
}
