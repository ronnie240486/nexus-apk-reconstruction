package android.media.ViviTV.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p000.AsyncTaskC4636jq;
import p000.C1043Q9;

/* JADX INFO: loaded from: classes.dex */
public class WeatherReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public static final String f5930a = "android.media.ViviTV.v1.weatherservice.responseweather";

    /* JADX INFO: renamed from: android.media.ViviTV.broadcast.WeatherReceiver$a */
    public class C1994a implements AsyncTaskC4636jq.a<C1043Q9> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f5931a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ WeatherReceiver f5932b;

        /* JADX WARN: Invalid debug info offset */
        public C1994a(WeatherReceiver weatherReceiver, Context context) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AsyncTaskC4636jq.a
        /* JADX INFO: renamed from: a */
        public /* bridge */ /* synthetic */ C1043Q9 mo3494a() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public C1043Q9 m10832b() {
            return null;
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.broadcast.WeatherReceiver$b */
    public class C1995b implements AsyncTaskC4636jq.b<C1043Q9> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC1996c f5933a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ WeatherReceiver f5934b;

        /* JADX WARN: Invalid debug info offset */
        public C1995b(WeatherReceiver weatherReceiver, InterfaceC1996c interfaceC1996c) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AsyncTaskC4636jq.b
        /* JADX INFO: renamed from: a */
        public /* bridge */ /* synthetic */ void mo3496a(C1043Q9 c1043q9) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m10833b(C1043Q9 c1043q9) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.broadcast.WeatherReceiver$c */
    public interface InterfaceC1996c {
        /* JADX INFO: renamed from: a */
        void m10834a(C1043Q9 c1043q9);
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
    }
}
