package com.afollestad.materialdialogs;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.ArrayRes;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.internal.MDButton;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class MaterialDialog extends DialogBase implements View.OnClickListener, DefaultRvAdapter.InternalListCallback {

    /* JADX INFO: renamed from: c */
    public final Builder f10548c;

    /* JADX INFO: renamed from: d */
    public final Handler f10549d;

    /* JADX INFO: renamed from: e */
    public ImageView f10550e;

    /* JADX INFO: renamed from: f */
    public TextView f10551f;

    /* JADX INFO: renamed from: g */
    public TextView f10552g;

    /* JADX INFO: renamed from: h */
    public EditText f10553h;

    /* JADX INFO: renamed from: i */
    public RecyclerView f10554i;

    /* JADX INFO: renamed from: j */
    public View f10555j;

    /* JADX INFO: renamed from: k */
    public FrameLayout f10556k;

    /* JADX INFO: renamed from: l */
    public ProgressBar f10557l;

    /* JADX INFO: renamed from: m */
    public TextView f10558m;

    /* JADX INFO: renamed from: n */
    public TextView f10559n;

    /* JADX INFO: renamed from: o */
    public TextView f10560o;

    /* JADX INFO: renamed from: p */
    public CheckBox f10561p;

    /* JADX INFO: renamed from: q */
    public MDButton f10562q;

    /* JADX INFO: renamed from: r */
    public MDButton f10563r;

    /* JADX INFO: renamed from: s */
    public MDButton f10564s;

    /* JADX INFO: renamed from: t */
    public ListType f10565t;

    /* JADX INFO: renamed from: u */
    public List<Integer> f10566u;

    /* JADX INFO: renamed from: com.afollestad.materialdialogs.MaterialDialog$1 */
    public class ViewTreeObserverOnGlobalLayoutListenerC30951 implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MaterialDialog f10567a;

        /* JADX INFO: renamed from: com.afollestad.materialdialogs.MaterialDialog$1$1, reason: invalid class name */
        public class AnonymousClass1 implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f10568a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC30951 f10569b;

            /* JADX WARN: Invalid debug info offset */
            public AnonymousClass1(ViewTreeObserverOnGlobalLayoutListenerC30951 viewTreeObserverOnGlobalLayoutListenerC30951, int i) {
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* JADX WARN: Invalid debug info offset */
        public ViewTreeObserverOnGlobalLayoutListenerC30951(MaterialDialog materialDialog) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
        }
    }

    /* JADX INFO: renamed from: com.afollestad.materialdialogs.MaterialDialog$2 */
    public class RunnableC30962 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MaterialDialog f10570a;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC30962(MaterialDialog materialDialog) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: com.afollestad.materialdialogs.MaterialDialog$3 */
    public class C30973 implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MaterialDialog f10571a;

        /* JADX WARN: Invalid debug info offset */
        public C30973(MaterialDialog materialDialog) {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: com.afollestad.materialdialogs.MaterialDialog$4 */
    public static /* synthetic */ class C30984 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f10572a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f10573b;

        static {
            int[] iArr = new int[ListType.values().length];
            f10573b = iArr;
            try {
                iArr[ListType.REGULAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10573b[ListType.SINGLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10573b[ListType.MULTI.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[DialogAction.values().length];
            f10572a = iArr2;
            try {
                iArr2[DialogAction.NEUTRAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10572a[DialogAction.NEGATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10572a[DialogAction.POSITIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static class Builder {

        /* JADX INFO: renamed from: A */
        public SingleButtonCallback f10574A;

        /* JADX INFO: renamed from: A0 */
        public NumberFormat f10575A0;

        /* JADX INFO: renamed from: B */
        public SingleButtonCallback f10576B;

        /* JADX INFO: renamed from: B0 */
        public boolean f10577B0;

        /* JADX INFO: renamed from: C */
        public SingleButtonCallback f10578C;

        /* JADX INFO: renamed from: C0 */
        public boolean f10579C0;

        /* JADX INFO: renamed from: D */
        public SingleButtonCallback f10580D;

        /* JADX INFO: renamed from: D0 */
        public boolean f10581D0;

        /* JADX INFO: renamed from: E */
        public ListCallback f10582E;

        /* JADX INFO: renamed from: E0 */
        public boolean f10583E0;

        /* JADX INFO: renamed from: F */
        public ListLongCallback f10584F;

        /* JADX INFO: renamed from: F0 */
        public boolean f10585F0;

        /* JADX INFO: renamed from: G */
        public ListCallbackSingleChoice f10586G;

        /* JADX INFO: renamed from: G0 */
        public boolean f10587G0;

        /* JADX INFO: renamed from: H */
        public ListCallbackMultiChoice f10588H;

        /* JADX INFO: renamed from: H0 */
        public boolean f10589H0;

        /* JADX INFO: renamed from: I */
        public boolean f10590I;

        /* JADX INFO: renamed from: I0 */
        public boolean f10591I0;

        /* JADX INFO: renamed from: J */
        public boolean f10592J;

        /* JADX INFO: renamed from: J0 */
        public boolean f10593J0;

        /* JADX INFO: renamed from: K */
        public Theme f10594K;

        /* JADX INFO: renamed from: K0 */
        @DrawableRes
        public int f10595K0;

        /* JADX INFO: renamed from: L */
        public boolean f10596L;

        /* JADX INFO: renamed from: L0 */
        @DrawableRes
        public int f10597L0;

        /* JADX INFO: renamed from: M */
        public boolean f10598M;

        /* JADX INFO: renamed from: M0 */
        @DrawableRes
        public int f10599M0;

        /* JADX INFO: renamed from: N */
        public float f10600N;

        /* JADX INFO: renamed from: N0 */
        @DrawableRes
        public int f10601N0;

        /* JADX INFO: renamed from: O */
        public int f10602O;

        /* JADX INFO: renamed from: O0 */
        @DrawableRes
        public int f10603O0;

        /* JADX INFO: renamed from: P */
        public Integer[] f10604P;

        /* JADX INFO: renamed from: P0 */
        public Object f10605P0;

        /* JADX INFO: renamed from: Q */
        public Integer[] f10606Q;

        /* JADX INFO: renamed from: R */
        public boolean f10607R;

        /* JADX INFO: renamed from: S */
        public Typeface f10608S;

        /* JADX INFO: renamed from: T */
        public Typeface f10609T;

        /* JADX INFO: renamed from: U */
        public Drawable f10610U;

        /* JADX INFO: renamed from: V */
        public boolean f10611V;

        /* JADX INFO: renamed from: W */
        public int f10612W;

        /* JADX INFO: renamed from: X */
        public RecyclerView.Adapter<?> f10613X;

        /* JADX INFO: renamed from: Y */
        public RecyclerView.LayoutManager f10614Y;

        /* JADX INFO: renamed from: Z */
        public DialogInterface.OnDismissListener f10615Z;

        /* JADX INFO: renamed from: a */
        public final Context f10616a;

        /* JADX INFO: renamed from: a0 */
        public DialogInterface.OnCancelListener f10617a0;

        /* JADX INFO: renamed from: b */
        public CharSequence f10618b;

        /* JADX INFO: renamed from: b0 */
        public DialogInterface.OnKeyListener f10619b0;

        /* JADX INFO: renamed from: c */
        public GravityEnum f10620c;

        /* JADX INFO: renamed from: c0 */
        public DialogInterface.OnShowListener f10621c0;

        /* JADX INFO: renamed from: d */
        public GravityEnum f10622d;

        /* JADX INFO: renamed from: d0 */
        public StackingBehavior f10623d0;

        /* JADX INFO: renamed from: e */
        public GravityEnum f10624e;

        /* JADX INFO: renamed from: e0 */
        public boolean f10625e0;

        /* JADX INFO: renamed from: f */
        public GravityEnum f10626f;

        /* JADX INFO: renamed from: f0 */
        public int f10627f0;

        /* JADX INFO: renamed from: g */
        public GravityEnum f10628g;

        /* JADX INFO: renamed from: g0 */
        public int f10629g0;

        /* JADX INFO: renamed from: h */
        public int f10630h;

        /* JADX INFO: renamed from: h0 */
        public int f10631h0;

        /* JADX INFO: renamed from: i */
        public int f10632i;

        /* JADX INFO: renamed from: i0 */
        public boolean f10633i0;

        /* JADX INFO: renamed from: j */
        public int f10634j;

        /* JADX INFO: renamed from: j0 */
        public boolean f10635j0;

        /* JADX INFO: renamed from: k */
        public CharSequence f10636k;

        /* JADX INFO: renamed from: k0 */
        public int f10637k0;

        /* JADX INFO: renamed from: l */
        public ArrayList<CharSequence> f10638l;

        /* JADX INFO: renamed from: l0 */
        public int f10639l0;

        /* JADX INFO: renamed from: m */
        public CharSequence f10640m;

        /* JADX INFO: renamed from: m0 */
        public CharSequence f10641m0;

        /* JADX INFO: renamed from: n */
        public CharSequence f10642n;

        /* JADX INFO: renamed from: n0 */
        public CharSequence f10643n0;

        /* JADX INFO: renamed from: o */
        public CharSequence f10644o;

        /* JADX INFO: renamed from: o0 */
        public InputCallback f10645o0;

        /* JADX INFO: renamed from: p */
        public boolean f10646p;

        /* JADX INFO: renamed from: p0 */
        public boolean f10647p0;

        /* JADX INFO: renamed from: q */
        public boolean f10648q;

        /* JADX INFO: renamed from: q0 */
        public int f10649q0;

        /* JADX INFO: renamed from: r */
        public boolean f10650r;

        /* JADX INFO: renamed from: r0 */
        public boolean f10651r0;

        /* JADX INFO: renamed from: s */
        public View f10652s;

        /* JADX INFO: renamed from: s0 */
        public int f10653s0;

        /* JADX INFO: renamed from: t */
        public int f10654t;

        /* JADX INFO: renamed from: t0 */
        public int f10655t0;

        /* JADX INFO: renamed from: u */
        public ColorStateList f10656u;

        /* JADX INFO: renamed from: u0 */
        public int f10657u0;

        /* JADX INFO: renamed from: v */
        public ColorStateList f10658v;

        /* JADX INFO: renamed from: v0 */
        public int[] f10659v0;

        /* JADX INFO: renamed from: w */
        public ColorStateList f10660w;

        /* JADX INFO: renamed from: w0 */
        public CharSequence f10661w0;

        /* JADX INFO: renamed from: x */
        public ColorStateList f10662x;

        /* JADX INFO: renamed from: x0 */
        public boolean f10663x0;

        /* JADX INFO: renamed from: y */
        public ColorStateList f10664y;

        /* JADX INFO: renamed from: y0 */
        public CompoundButton.OnCheckedChangeListener f10665y0;

        /* JADX INFO: renamed from: z */
        public ButtonCallback f10666z;

        /* JADX INFO: renamed from: z0 */
        public String f10667z0;

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x010e
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        public Builder(@androidx.annotation.NonNull android.content.Context r8) {
            /*
                Method dump skipped, instruction units count: 326
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.afollestad.materialdialogs.MaterialDialog.Builder.<init>(android.content.Context):void");
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: A */
        public Builder m16891A(@StringRes int i, boolean z) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: A0 */
        public Builder m16892A0(@NonNull ColorStateList colorStateList) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: B */
        public Builder m16893B(@StringRes int i, Object... objArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: B0 */
        public Builder m16894B0(@AttrRes int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: C */
        public Builder m16895C(@NonNull CharSequence charSequence) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: C0 */
        public Builder m16896C0(@ColorRes int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: D */
        public Builder m16897D(@ColorInt int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: D0 */
        public Builder m16898D0(boolean z) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: E */
        public Builder m16899E(@AttrRes int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: E0 */
        public Builder m16900E0(@StringRes int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: F */
        public Builder m16901F(@ColorRes int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: F0 */
        public Builder m16902F0(@NonNull CharSequence charSequence) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: G */
        public Builder m16903G(@NonNull GravityEnum gravityEnum) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: G0 */
        public Builder m16904G0(@ColorInt int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: H */
        public Builder m16905H(float f) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: H0 */
        public Builder m16906H0(@NonNull ColorStateList colorStateList) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: I */
        public Builder m16907I(@LayoutRes int i, boolean z) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: I0 */
        public Builder m16908I0(@AttrRes int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: J */
        public Builder m16909J(@NonNull View view, boolean z) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: J0 */
        public Builder m16910J0(@ColorRes int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: K */
        public Builder m16911K(@NonNull DialogInterface.OnDismissListener onDismissListener) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: K0 */
        public Builder m16912K0(boolean z) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: L */
        public Builder m16913L(@ColorInt int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: L0 */
        public Builder m16914L0(@StringRes int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: M */
        public Builder m16915M(@AttrRes int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: M0 */
        public Builder m16916M0(@NonNull CharSequence charSequence) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: N */
        public Builder m16917N(@ColorRes int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: N0 */
        public Builder m16918N0(@NonNull SingleButtonCallback singleButtonCallback) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: O */
        public final Context m16919O() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: O0 */
        public Builder m16920O0(@NonNull SingleButtonCallback singleButtonCallback) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: P */
        public final int m16921P() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: P0 */
        public Builder m16922P0(@NonNull SingleButtonCallback singleButtonCallback) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: Q */
        public final Typeface m16923Q() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: Q0 */
        public Builder m16924Q0(@NonNull SingleButtonCallback singleButtonCallback) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: R */
        public Builder m16925R(@NonNull Drawable drawable) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: R0 */
        public Builder m16926R0(@ColorInt int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: S */
        public Builder m16927S(@AttrRes int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: S0 */
        public Builder m16928S0(@NonNull ColorStateList colorStateList) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: T */
        public Builder m16929T(@DrawableRes int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: T0 */
        public Builder m16930T0(@AttrRes int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: U */
        public Builder m16931U(@StringRes int i, @StringRes int i2, @NonNull InputCallback inputCallback) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: U0 */
        public Builder m16932U0(@ColorRes int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: V */
        public Builder m16933V(@StringRes int i, @StringRes int i2, boolean z, @NonNull InputCallback inputCallback) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: V0 */
        public Builder m16934V0(boolean z) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: W */
        public Builder m16935W(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2, @NonNull InputCallback inputCallback) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: W0 */
        public Builder m16936W0(@StringRes int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: X */
        public Builder m16937X(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2, boolean z, @NonNull InputCallback inputCallback) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: X0 */
        public Builder m16938X0(@NonNull CharSequence charSequence) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: Y */
        public Builder m16939Y(@IntRange(from = 0, m14516to = 2147483647L) int i, @IntRange(from = -1, m14516to = 2147483647L) int i2) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: Y0 */
        public Builder m16940Y0(boolean z, int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: Z */
        public Builder m16941Z(@IntRange(from = 0, m14516to = 2147483647L) int i, @IntRange(from = -1, m14516to = 2147483647L) int i2, @ColorInt int i3) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: Z0 */
        public Builder m16942Z0(boolean z, int i, boolean z2) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public Builder m16943a(@NonNull RecyclerView.Adapter<?> adapter, @Nullable RecyclerView.LayoutManager layoutManager) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a0 */
        public Builder m16944a0(@IntRange(from = 0, m14516to = 2147483647L) int i, @IntRange(from = -1, m14516to = 2147483647L) int i2, @ColorRes int i3) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a1 */
        public Builder m16945a1(boolean z) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public Builder m16946b() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b0 */
        public Builder m16947b0(int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b1 */
        public Builder m16948b1(@NonNull String str) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: c */
        public Builder m16949c() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: c0 */
        public Builder m16950c0(@ArrayRes int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: c1 */
        public Builder m16951c1(@NonNull NumberFormat numberFormat) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: d */
        public Builder m16952d() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: d0 */
        public Builder m16953d0(@NonNull Collection collection) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @UiThread
        /* JADX INFO: renamed from: d1 */
        public MaterialDialog m16954d1() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: e */
        public Builder m16955e(boolean z) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: e0 */
        public Builder m16956e0(@NonNull CharSequence... charSequenceArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: e1 */
        public Builder m16957e1(@NonNull DialogInterface.OnShowListener onShowListener) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: f */
        public Builder m16958f(@ColorInt int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: f0 */
        public Builder m16959f0(@NonNull ListCallback listCallback) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: f1 */
        public Builder m16960f1(@NonNull StackingBehavior stackingBehavior) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: g */
        public Builder m16961g(@AttrRes int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: g0 */
        public Builder m16962g0(@Nullable Integer[] numArr, @NonNull ListCallbackMultiChoice listCallbackMultiChoice) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: g1 */
        public Builder m16963g1(@Nullable Object obj) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: h */
        public Builder m16964h(@ColorRes int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: h0 */
        public Builder m16965h0(int i, @NonNull ListCallbackSingleChoice listCallbackSingleChoice) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: h1 */
        public Builder m16966h1(@NonNull Theme theme) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: i */
        public Builder m16967i(@DrawableRes int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: i0 */
        public Builder m16968i0(@ColorInt int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: i1 */
        public Builder m16969i1(@StringRes int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: j */
        public Builder m16970j(@DrawableRes int i, @NonNull DialogAction dialogAction) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: j0 */
        public Builder m16971j0(@AttrRes int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: j1 */
        public Builder m16972j1(@NonNull CharSequence charSequence) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: k */
        public Builder m16973k(@DrawableRes int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: k0 */
        public Builder m16974k0(@ColorRes int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: k1 */
        public Builder m16975k1(@ColorInt int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: l */
        public Builder m16976l(@NonNull GravityEnum gravityEnum) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: l0 */
        public Builder m16977l0(@Nullable Integer... numArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: l1 */
        public Builder m16978l1(@AttrRes int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @UiThread
        /* JADX INFO: renamed from: m */
        public MaterialDialog m16979m() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: m0 */
        public Builder m16980m0(@NonNull GravityEnum gravityEnum) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: m1 */
        public Builder m16981m1(@ColorRes int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: n */
        public Builder m16982n(@ColorInt int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: n0 */
        public Builder m16983n0(@ArrayRes int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: n1 */
        public Builder m16984n1(@NonNull GravityEnum gravityEnum) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: o */
        public Builder m16985o(@AttrRes int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: o0 */
        public Builder m16986o0(@NonNull int[] iArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: o1 */
        public Builder m16987o1(@Nullable Typeface typeface, @Nullable Typeface typeface2) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: p */
        public Builder m16988p(@ColorRes int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: p0 */
        public Builder m16989p0(@NonNull ListLongCallback listLongCallback) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: p1 */
        public Builder m16990p1(@Nullable String str, @Nullable String str2) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: q */
        public Builder m16991q(@NonNull GravityEnum gravityEnum) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: q0 */
        public Builder m16992q0(@NonNull DialogInterface.OnKeyListener onKeyListener) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: q1 */
        public Builder m16993q1(@ColorInt int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: r */
        public Builder m16994r(@NonNull ButtonCallback buttonCallback) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: r0 */
        public Builder m16995r0() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: r1 */
        public Builder m16996r1(@AttrRes int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: s */
        public Builder m16997s(@NonNull DialogInterface.OnCancelListener onCancelListener) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: s0 */
        public Builder m16998s0(@ColorInt int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: s1 */
        public Builder m16999s1(@ColorRes int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: t */
        public Builder m17000t(boolean z) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: t0 */
        public Builder m17001t0(@NonNull ColorStateList colorStateList) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: u */
        public Builder m17002u(boolean z) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: u0 */
        public Builder m17003u0(@AttrRes int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: v */
        public Builder m17004v(@NonNull CharSequence charSequence, boolean z, @Nullable CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: v0 */
        public Builder m17005v0(@ColorRes int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: w */
        public Builder m17006w(@StringRes int i, boolean z, @Nullable CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: w0 */
        public Builder m17007w0(@DrawableRes int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: x */
        public final void m17008x() {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: x0 */
        public Builder m17009x0(int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: y */
        public Builder m17010y(@Nullable ColorStateList colorStateList) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: y0 */
        public Builder m17011y0(@DimenRes int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: z */
        public Builder m17012z(@StringRes int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: z0 */
        public Builder m17013z0(@ColorInt int i) {
            return null;
        }
    }

    @Deprecated
    public static abstract class ButtonCallback {
        @Deprecated
        /* JADX INFO: renamed from: a */
        public void m17014a(MaterialDialog materialDialog) {
        }

        @Deprecated
        /* JADX INFO: renamed from: b */
        public void m17015b(MaterialDialog materialDialog) {
        }

        @Deprecated
        /* JADX INFO: renamed from: c */
        public void m17016c(MaterialDialog materialDialog) {
        }

        /* JADX WARN: Invalid debug info offset */
        public final Object clone() throws CloneNotSupportedException {
            return null;
        }

        @Deprecated
        /* JADX INFO: renamed from: d */
        public void m17017d(MaterialDialog materialDialog) {
        }

        /* JADX WARN: Invalid debug info offset */
        public final boolean equals(Object obj) {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        public final void finalize() throws Throwable {
        }

        /* JADX WARN: Invalid debug info offset */
        public final int hashCode() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        public final String toString() {
            return null;
        }
    }

    public static class DialogException extends WindowManager.BadTokenException {
        /* JADX WARN: Invalid debug info offset */
        public DialogException(String str) {
        }
    }

    public interface InputCallback {
        /* JADX INFO: renamed from: a */
        void mo7899a(@NonNull MaterialDialog materialDialog, CharSequence charSequence);
    }

    public interface ListCallback {
        /* JADX INFO: renamed from: a */
        void m17018a(MaterialDialog materialDialog, View view, int i, CharSequence charSequence);
    }

    public interface ListCallbackMultiChoice {
        /* JADX INFO: renamed from: a */
        boolean m17019a(MaterialDialog materialDialog, Integer[] numArr, CharSequence[] charSequenceArr);
    }

    public interface ListCallbackSingleChoice {
        /* JADX INFO: renamed from: a */
        boolean m17020a(MaterialDialog materialDialog, View view, int i, CharSequence charSequence);
    }

    public interface ListLongCallback {
        /* JADX INFO: renamed from: a */
        boolean m17021a(MaterialDialog materialDialog, View view, int i, CharSequence charSequence);
    }

    public enum ListType {
        REGULAR,
        SINGLE,
        MULTI;

        public static int getLayoutForType(ListType listType) {
            int i = C30984.f10573b[listType.ordinal()];
            if (i == 1) {
                return C3099R.layout.md_listitem;
            }
            if (i == 2) {
                return C3099R.layout.md_listitem_singlechoice;
            }
            if (i == 3) {
                return C3099R.layout.md_listitem_multichoice;
            }
            throw new IllegalArgumentException("Not a valid list type");
        }
    }

    public interface SingleButtonCallback {
        /* JADX INFO: renamed from: a */
        void mo526a(@NonNull MaterialDialog materialDialog, @NonNull DialogAction dialogAction);
    }

    /* JADX WARN: Invalid debug info offset */
    @SuppressLint({"InflateParams"})
    public MaterialDialog(Builder builder) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A */
    public void m16836A(int i, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: B */
    public final void m16837B() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: C */
    public final boolean m16838C() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: D */
    public final boolean m16839D() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E */
    public boolean m16840E() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @UiThread
    /* JADX INFO: renamed from: F */
    public final void m16841F(@IntRange(from = 0, m14516to = 2147483647L) int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @UiThread
    /* JADX INFO: renamed from: G */
    public final void m16842G(@IntRange(from = 0, m14516to = 2147483647L) int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @UiThread
    /* JADX INFO: renamed from: H */
    public final void m16843H() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: I */
    public final int m16844I() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: J */
    public void m16845J() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K */
    public void m16846K(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: L */
    public final boolean m16847L() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: M */
    public final boolean m16848M(View view) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: N */
    public final void m16849N(DialogAction dialogAction, @StringRes int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @UiThread
    /* JADX INFO: renamed from: O */
    public final void m16850O(@NonNull DialogAction dialogAction, CharSequence charSequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    @UiThread
    /* JADX INFO: renamed from: P */
    public final void m16851P(@StringRes int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @UiThread
    /* JADX INFO: renamed from: Q */
    public final void m16852Q(@StringRes int i, @Nullable Object... objArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    @UiThread
    /* JADX INFO: renamed from: R */
    public final void m16853R(CharSequence charSequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    @UiThread
    /* JADX INFO: renamed from: S */
    public void m16854S(@DrawableRes int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @UiThread
    /* JADX INFO: renamed from: T */
    public void m16855T(Drawable drawable) {
    }

    /* JADX WARN: Invalid debug info offset */
    @UiThread
    /* JADX INFO: renamed from: U */
    public void m16856U(@AttrRes int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V */
    public void m16857V() {
    }

    /* JADX WARN: Invalid debug info offset */
    @UiThread
    /* JADX INFO: renamed from: W */
    public final void m16858W(CharSequence... charSequenceArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: X */
    public final void m16859X(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Y */
    public final void m16860Y(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Z */
    public final void m16861Z(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.afollestad.materialdialogs.DefaultRvAdapter.InternalListCallback
    /* JADX INFO: renamed from: a */
    public boolean mo16827a(MaterialDialog materialDialog, View view, int i, CharSequence charSequence, boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a0 */
    public final void m16862a0(NumberFormat numberFormat) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b0 */
    public void m16863b0(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @UiThread
    /* JADX INFO: renamed from: c0 */
    public void m16864c0(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public final void m16865d() {
    }

    /* JADX WARN: Invalid debug info offset */
    @UiThread
    /* JADX INFO: renamed from: d0 */
    public void m16866d0(@NonNull Integer[] numArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public void m16867e() {
    }

    /* JADX WARN: Invalid debug info offset */
    @UiThread
    /* JADX INFO: renamed from: e0 */
    public final void m16868e0(@StringRes int i, @Nullable Object... objArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public void m16869f(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f0 */
    public final void m16870f0(TextView textView, Typeface typeface) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.afollestad.materialdialogs.DialogBase, android.app.Dialog
    public View findViewById(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public final MDButton m16871g(@NonNull DialogAction dialogAction) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public final Builder m16872h() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public Drawable m16873i(DialogAction dialogAction, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Nullable
    /* JADX INFO: renamed from: j */
    public final TextView m16874j() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public final int m16875k() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Nullable
    /* JADX INFO: renamed from: l */
    public final View m16876l() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public ImageView m16877m() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Nullable
    /* JADX INFO: renamed from: n */
    public final EditText m16878n() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Nullable
    /* JADX INFO: renamed from: o */
    public final ArrayList<CharSequence> m16879o() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.afollestad.materialdialogs.DialogBase, android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public final Drawable m16880p() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q */
    public final int m16881q() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r */
    public ProgressBar m16882r() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s */
    public RecyclerView m16883s() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.afollestad.materialdialogs.DialogBase, android.app.Dialog
    @Deprecated
    public /* bridge */ /* synthetic */ void setContentView(int i) throws IllegalAccessError {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.afollestad.materialdialogs.DialogBase, android.app.Dialog
    @Deprecated
    public /* bridge */ /* synthetic */ void setContentView(@NonNull View view) throws IllegalAccessError {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.afollestad.materialdialogs.DialogBase, android.app.Dialog
    @Deprecated
    public /* bridge */ /* synthetic */ void setContentView(@NonNull View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessError {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.app.Dialog
    @UiThread
    public final void setTitle(@StringRes int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.app.Dialog
    @UiThread
    public final void setTitle(CharSequence charSequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.app.Dialog
    @UiThread
    public void show() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t */
    public int m16884t() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Nullable
    /* JADX INFO: renamed from: u */
    public Integer[] m16885u() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Nullable
    /* JADX INFO: renamed from: v */
    public Object m16886v() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w */
    public final TextView m16887w() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x */
    public final View m16888x() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y */
    public final boolean m16889y() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: z */
    public final void m16890z(int i) {
    }
}
