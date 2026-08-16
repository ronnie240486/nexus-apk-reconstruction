package android.media.ViviTV.activity;

import android.app.Activity;
import android.content.Context;
import android.media.ViviTV.databinding.ActivitySeatReservationBinding;
import android.media.ViviTV.view.NumLockPanel;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public class SeatReservationActivity extends Activity implements NumLockPanel.InterfaceC2338g, NumLockPanel.InterfaceC2336e, NumLockPanel.InterfaceC2337f, View.OnTouchListener {

    /* JADX INFO: renamed from: g */
    public static final String f5280g = "EXTRA_RESERVATION_DURATION";

    /* JADX INFO: renamed from: a */
    public ActivitySeatReservationBinding f5281a;

    /* JADX INFO: renamed from: b */
    public NumLockPanel f5282b;

    /* JADX INFO: renamed from: c */
    public String f5283c;

    /* JADX INFO: renamed from: d */
    public String f5284d;

    /* JADX INFO: renamed from: e */
    public CountDownTimer f5285e;

    /* JADX INFO: renamed from: f */
    public int f5286f;

    /* JADX INFO: renamed from: android.media.ViviTV.activity.SeatReservationActivity$a */
    public class CountDownTimerC1894a extends CountDownTimer {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SeatReservationActivity f5287a;

        /* JADX WARN: Invalid debug info offset */
        public CountDownTimerC1894a(SeatReservationActivity seatReservationActivity, long j, long j2) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.CountDownTimer
        public void onFinish() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.CountDownTimer
        public void onTick(long j) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ ActivitySeatReservationBinding m10167d(SeatReservationActivity seatReservationActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public static final void m10168g(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.view.NumLockPanel.InterfaceC2337f
    /* JADX INFO: renamed from: a */
    public void mo10169a() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.view.NumLockPanel.InterfaceC2336e
    /* JADX INFO: renamed from: b */
    public void mo10170b() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.view.NumLockPanel.InterfaceC2338g
    /* JADX INFO: renamed from: c */
    public void mo10171c(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public final void m10172e() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public final void m10173f() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.app.Activity
    public void onDestroy() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return false;
    }
}
