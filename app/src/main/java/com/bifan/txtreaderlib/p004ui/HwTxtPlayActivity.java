package com.bifan.txtreaderlib.p004ui;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.bifan.txtreaderlib.main.TxtReaderView;
import p000.C4720l9;
import p000.C5444tX;
import p000.EnumC5863zX;
import p000.InterfaceC0509Hq;
import p000.InterfaceC0828Mq;
import p000.InterfaceC1472Wq;
import p000.InterfaceC1666Zq;
import p000.InterfaceC5329rq;

/* JADX INFO: loaded from: classes.dex */
public class HwTxtPlayActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: A */
    public boolean f10829A;

    /* JADX INFO: renamed from: a */
    public Handler f10830a;

    /* JADX INFO: renamed from: b */
    public boolean f10831b;

    /* JADX INFO: renamed from: c */
    public View f10832c;

    /* JADX INFO: renamed from: d */
    public View f10833d;

    /* JADX INFO: renamed from: e */
    public View f10834e;

    /* JADX INFO: renamed from: f */
    public TextView f10835f;

    /* JADX INFO: renamed from: g */
    public TextView f10836g;

    /* JADX INFO: renamed from: h */
    public TextView f10837h;

    /* JADX INFO: renamed from: i */
    public TextView f10838i;

    /* JADX INFO: renamed from: j */
    public TextView f10839j;

    /* JADX INFO: renamed from: k */
    public TextView f10840k;

    /* JADX INFO: renamed from: l */
    public TextView f10841l;

    /* JADX INFO: renamed from: m */
    public TxtReaderView f10842m;

    /* JADX INFO: renamed from: n */
    public View f10843n;

    /* JADX INFO: renamed from: o */
    public View f10844o;

    /* JADX INFO: renamed from: p */
    public View f10845p;

    /* JADX INFO: renamed from: q */
    public View f10846q;

    /* JADX INFO: renamed from: r */
    public String f10847r;

    /* JADX INFO: renamed from: s */
    public C4720l9 f10848s;

    /* JADX INFO: renamed from: t */
    public C3141s f10849t;

    /* JADX INFO: renamed from: u */
    public final int[] f10850u;

    /* JADX INFO: renamed from: v */
    public String f10851v;

    /* JADX INFO: renamed from: w */
    public String f10852w;

    /* JADX INFO: renamed from: x */
    public String f10853x;

    /* JADX INFO: renamed from: y */
    public boolean f10854y;

    /* JADX INFO: renamed from: z */
    public Toast f10855z;

    /* JADX INFO: renamed from: com.bifan.txtreaderlib.ui.HwTxtPlayActivity$a */
    public class C3123a implements InterfaceC5329rq {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HwTxtPlayActivity f10856a;

        /* JADX WARN: Invalid debug info offset */
        public C3123a(HwTxtPlayActivity hwTxtPlayActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC5329rq
        /* JADX INFO: renamed from: a */
        public boolean mo17236a(float f) {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC5329rq
        /* JADX INFO: renamed from: b */
        public boolean mo17237b(float f) {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.bifan.txtreaderlib.ui.HwTxtPlayActivity$b */
    public class ViewOnTouchListenerC3124b implements View.OnTouchListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HwTxtPlayActivity f10857a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnTouchListenerC3124b(HwTxtPlayActivity hwTxtPlayActivity) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.bifan.txtreaderlib.ui.HwTxtPlayActivity$c */
    public class ViewOnTouchListenerC3125c implements View.OnTouchListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HwTxtPlayActivity f10858a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnTouchListenerC3125c(HwTxtPlayActivity hwTxtPlayActivity) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.bifan.txtreaderlib.ui.HwTxtPlayActivity$d */
    public class ViewOnTouchListenerC3126d implements View.OnTouchListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HwTxtPlayActivity f10859a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnTouchListenerC3126d(HwTxtPlayActivity hwTxtPlayActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.bifan.txtreaderlib.ui.HwTxtPlayActivity$e */
    public class ViewOnClickListenerC3127e implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HwTxtPlayActivity f10860a;

        /* JADX INFO: renamed from: com.bifan.txtreaderlib.ui.HwTxtPlayActivity$e$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ViewOnClickListenerC3127e f10861a;

            /* JADX WARN: Invalid debug info offset */
            public a(ViewOnClickListenerC3127e viewOnClickListenerC3127e) {
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* JADX WARN: Invalid debug info offset */
        public ViewOnClickListenerC3127e(HwTxtPlayActivity hwTxtPlayActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* JADX INFO: renamed from: com.bifan.txtreaderlib.ui.HwTxtPlayActivity$f */
    public class ViewOnClickListenerC3128f implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HwTxtPlayActivity f10862a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnClickListenerC3128f(HwTxtPlayActivity hwTxtPlayActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* JADX INFO: renamed from: com.bifan.txtreaderlib.ui.HwTxtPlayActivity$g */
    public class ViewOnTouchListenerC3129g implements View.OnTouchListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HwTxtPlayActivity f10863a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnTouchListenerC3129g(HwTxtPlayActivity hwTxtPlayActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.bifan.txtreaderlib.ui.HwTxtPlayActivity$h */
    public class C3130h implements SeekBar.OnSeekBarChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HwTxtPlayActivity f10864a;

        /* JADX INFO: renamed from: com.bifan.txtreaderlib.ui.HwTxtPlayActivity$h$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f10865a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C3130h f10866b;

            /* JADX WARN: Invalid debug info offset */
            public a(C3130h c3130h, int i) {
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* JADX WARN: Invalid debug info offset */
        public C3130h(HwTxtPlayActivity hwTxtPlayActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* JADX INFO: renamed from: com.bifan.txtreaderlib.ui.HwTxtPlayActivity$i */
    public class RunnableC3131i implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HwTxtPlayActivity f10867a;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC3131i(HwTxtPlayActivity hwTxtPlayActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: com.bifan.txtreaderlib.ui.HwTxtPlayActivity$j */
    public class C3132j implements InterfaceC0509Hq {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HwTxtPlayActivity f10868a;

        /* JADX INFO: renamed from: com.bifan.txtreaderlib.ui.HwTxtPlayActivity$j$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ EnumC5863zX f10869a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C3132j f10870b;

            /* JADX WARN: Invalid debug info offset */
            public a(C3132j c3132j, EnumC5863zX enumC5863zX) {
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* JADX WARN: Invalid debug info offset */
        public C3132j(HwTxtPlayActivity hwTxtPlayActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC0509Hq
        /* JADX INFO: renamed from: a */
        public void mo2398a() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC0509Hq
        /* JADX INFO: renamed from: b */
        public void mo2399b(EnumC5863zX enumC5863zX) {
        }

        @Override // p000.InterfaceC0509Hq
        /* JADX INFO: renamed from: c */
        public void mo2400c(String str) {
        }
    }

    /* JADX INFO: renamed from: com.bifan.txtreaderlib.ui.HwTxtPlayActivity$k */
    public class C3133k implements InterfaceC0509Hq {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HwTxtPlayActivity f10871a;

        /* JADX WARN: Invalid debug info offset */
        public C3133k(HwTxtPlayActivity hwTxtPlayActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC0509Hq
        /* JADX INFO: renamed from: a */
        public void mo2398a() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC0509Hq
        /* JADX INFO: renamed from: b */
        public void mo2399b(EnumC5863zX enumC5863zX) {
        }

        @Override // p000.InterfaceC0509Hq
        /* JADX INFO: renamed from: c */
        public void mo2400c(String str) {
        }
    }

    /* JADX INFO: renamed from: com.bifan.txtreaderlib.ui.HwTxtPlayActivity$l */
    public class C3134l implements PopupWindow.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HwTxtPlayActivity f10872a;

        /* JADX WARN: Invalid debug info offset */
        public C3134l(HwTxtPlayActivity hwTxtPlayActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
        }
    }

    /* JADX INFO: renamed from: com.bifan.txtreaderlib.ui.HwTxtPlayActivity$m */
    public class C3135m implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HwTxtPlayActivity f10873a;

        /* JADX WARN: Invalid debug info offset */
        public C3135m(HwTxtPlayActivity hwTxtPlayActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        }
    }

    /* JADX INFO: renamed from: com.bifan.txtreaderlib.ui.HwTxtPlayActivity$n */
    public class ViewOnClickListenerC3136n implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HwTxtPlayActivity f10874a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnClickListenerC3136n(HwTxtPlayActivity hwTxtPlayActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* JADX INFO: renamed from: com.bifan.txtreaderlib.ui.HwTxtPlayActivity$q */
    public class C3139q implements InterfaceC0828Mq {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HwTxtPlayActivity f10877a;

        /* JADX WARN: Invalid debug info offset */
        public C3139q(HwTxtPlayActivity hwTxtPlayActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC0828Mq
        /* JADX INFO: renamed from: a */
        public void mo3893a(float f) {
        }
    }

    /* JADX INFO: renamed from: com.bifan.txtreaderlib.ui.HwTxtPlayActivity$r */
    public class ViewOnClickListenerC3140r implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final Boolean f10878a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ HwTxtPlayActivity f10879b;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnClickListenerC3140r(HwTxtPlayActivity hwTxtPlayActivity, Boolean bool) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* JADX INFO: renamed from: com.bifan.txtreaderlib.ui.HwTxtPlayActivity$s */
    public static class C3141s {

        /* JADX INFO: renamed from: a */
        public TextView f10880a;

        /* JADX INFO: renamed from: b */
        public TextView f10881b;

        /* JADX INFO: renamed from: c */
        public TextView f10882c;

        /* JADX INFO: renamed from: d */
        public SeekBar f10883d;

        /* JADX INFO: renamed from: e */
        public View f10884e;

        /* JADX INFO: renamed from: f */
        public View f10885f;

        /* JADX INFO: renamed from: g */
        public TextView f10886g;

        /* JADX INFO: renamed from: h */
        public View f10887h;

        /* JADX INFO: renamed from: i */
        public View f10888i;

        /* JADX INFO: renamed from: j */
        public View f10889j;

        /* JADX INFO: renamed from: k */
        public View f10890k;

        /* JADX INFO: renamed from: l */
        public View f10891l;

        /* JADX INFO: renamed from: m */
        public View f10892m;

        /* JADX INFO: renamed from: n */
        public View f10893n;

        /* JADX INFO: renamed from: o */
        public View f10894o;

        /* JADX INFO: renamed from: p */
        public View f10895p;
    }

    /* JADX INFO: renamed from: com.bifan.txtreaderlib.ui.HwTxtPlayActivity$t */
    public class ViewOnClickListenerC3142t implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final int f10896a;

        /* JADX INFO: renamed from: b */
        public final int f10897b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ HwTxtPlayActivity f10898c;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnClickListenerC3142t(HwTxtPlayActivity hwTxtPlayActivity, int i, int i2) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* JADX INFO: renamed from: com.bifan.txtreaderlib.ui.HwTxtPlayActivity$u */
    public class ViewOnClickListenerC3143u implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final int f10899a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ HwTxtPlayActivity f10900b;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnClickListenerC3143u(HwTxtPlayActivity hwTxtPlayActivity, int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* JADX INFO: renamed from: com.bifan.txtreaderlib.ui.HwTxtPlayActivity$v */
    public class ViewOnClickListenerC3144v implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final Boolean f10901a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ HwTxtPlayActivity f10902b;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnClickListenerC3144v(HwTxtPlayActivity hwTxtPlayActivity, Boolean bool) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* JADX INFO: renamed from: com.bifan.txtreaderlib.ui.HwTxtPlayActivity$w */
    public class ViewOnClickListenerC3145w implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HwTxtPlayActivity f10903a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnClickListenerC3145w(HwTxtPlayActivity hwTxtPlayActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m17197T(HwTxtPlayActivity hwTxtPlayActivity) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U */
    public static /* synthetic */ void m17198U(HwTxtPlayActivity hwTxtPlayActivity) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V */
    public static /* synthetic */ void m17199V(HwTxtPlayActivity hwTxtPlayActivity, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m17200W(HwTxtPlayActivity hwTxtPlayActivity, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: X */
    public static /* synthetic */ void m17201X(HwTxtPlayActivity hwTxtPlayActivity, Boolean bool) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ void m17202Y(HwTxtPlayActivity hwTxtPlayActivity, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o0 */
    public static void m17203o0(Context context, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p0 */
    public static void m17204p0(Context context, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q0 */
    public static void m17205q0(Context context, String str, String str2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r0 */
    public static void m17206r0(Context context, String str, String str2, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s0 */
    public static void m17207s0(Context context, String str, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t0 */
    public static void m17208t0(Context context, String str, String str2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A0 */
    public void m17209A0() {
    }

    /* JADX WARN: Invalid debug info offset */
    public void BackClick(View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: C0 */
    public void m17210C0(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: D0 */
    public void m17211D0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E0 */
    public final void m17212E0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: F0 */
    public void m17213F0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: G0 */
    public void m17214G0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: H0 */
    public void m17215H0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: I0 */
    public void m17216I0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: J0 */
    public void m17217J0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K0 */
    public void m17218K0(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R */
    public void m17219R(View... viewArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S */
    public void m17220S(View... viewArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Z */
    public void m17221Z() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a0 */
    public int m17222a0() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0029
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: d0 */
    public boolean m17223d0() {
        /*
            r7 = this;
            r0 = 0
            return r0
        L6a:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bifan.txtreaderlib.p004ui.HwTxtPlayActivity.m17223d0():boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e0 */
    public final void m17224e0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f0 */
    public void m17225f0() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.app.Activity
    public void finish() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g0 */
    public void m17226g0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i0 */
    public void m17227i0() {
    }

    /* JADX WARN: Invalid debug info offset */
    public void init() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k0 */
    public void m17228k0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m0 */
    public final void m17229m0() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    /* JADX WARN: Invalid debug info offset */
    public void onCopyText(View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u0 */
    public final void m17230u0(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v0 */
    public void m17231v0(EnumC5863zX enumC5863zX) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w0 */
    public void m17232w0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x0 */
    public final void m17233x0(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y0 */
    public final void m17234y0(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: z0 */
    public final void m17235z0(Boolean bool) {
    }

    /* JADX INFO: renamed from: com.bifan.txtreaderlib.ui.HwTxtPlayActivity$p */
    public class C3138p implements InterfaceC1472Wq {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HwTxtPlayActivity f10876a;

        /* JADX WARN: Invalid debug info offset */
        public C3138p(HwTxtPlayActivity hwTxtPlayActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC1472Wq
        /* JADX INFO: renamed from: b */
        public void mo6928b() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC1472Wq
        /* JADX INFO: renamed from: c */
        public void mo6929c(String str) {
        }

        @Override // p000.InterfaceC1472Wq
        /* JADX INFO: renamed from: a */
        public void mo6927a(C5444tX c5444tX) {
        }
    }

    /* JADX INFO: renamed from: com.bifan.txtreaderlib.ui.HwTxtPlayActivity$o */
    public class C3137o implements InterfaceC1666Zq {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HwTxtPlayActivity f10875a;

        /* JADX WARN: Invalid debug info offset */
        public C3137o(HwTxtPlayActivity hwTxtPlayActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC1666Zq
        /* JADX INFO: renamed from: a */
        public void mo8802a(String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC1666Zq
        /* JADX INFO: renamed from: b */
        public void mo8803b(String str) {
        }

        @Override // p000.InterfaceC1666Zq
        /* JADX INFO: renamed from: c */
        public void mo8804c(C5444tX c5444tX, C5444tX c5444tX2) {
        }
    }
}
