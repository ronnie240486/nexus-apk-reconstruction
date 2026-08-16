package android.media.ViviTV.fragmens;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseVideoIntroductionFragment extends VideoSlaveFragment {

    /* JADX INFO: renamed from: g */
    public View f7944g;

    /* JADX INFO: renamed from: h */
    public ImageView f7945h;

    /* JADX INFO: renamed from: i */
    public TextView f7946i;

    /* JADX INFO: renamed from: j */
    public TextView f7947j;

    /* JADX INFO: renamed from: k */
    public TextView f7948k;

    /* JADX INFO: renamed from: l */
    public TextView f7949l;

    /* JADX INFO: renamed from: m */
    public TextView f7950m;

    /* JADX INFO: renamed from: n */
    public TextView f7951n;

    /* JADX INFO: renamed from: o */
    public TextView f7952o;

    /* JADX INFO: renamed from: p */
    public TextView f7953p;

    /* JADX INFO: renamed from: q */
    public TextView f7954q;

    /* JADX INFO: renamed from: r */
    public TextView f7955r;

    /* JADX INFO: renamed from: s */
    public RecyclerView f7956s;

    /* JADX INFO: renamed from: t */
    public LinearLayout f7957t;

    /* JADX INFO: renamed from: u */
    public Button f7958u;

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.BaseVideoIntroductionFragment$a */
    public class RunnableC2011a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f7959a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BaseVideoIntroductionFragment f7960b;

        /* JADX INFO: renamed from: android.media.ViviTV.fragmens.BaseVideoIntroductionFragment$a$a */
        public class a extends ClickableSpan {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ RunnableC2011a f7961a;

            /* JADX WARN: Invalid debug info offset */
            public a(RunnableC2011a runnableC2011a) {
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // android.text.style.ClickableSpan
            public void onClick(View view) {
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint textPaint) {
            }
        }

        /* JADX INFO: renamed from: android.media.ViviTV.fragmens.BaseVideoIntroductionFragment$a$b */
        public class b implements View.OnFocusChangeListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ SpannableString f7962a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ RunnableC2011a f7963b;

            /* JADX WARN: Invalid debug info offset */
            public b(RunnableC2011a runnableC2011a, SpannableString spannableString) {
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z) {
            }
        }

        /* JADX WARN: Invalid debug info offset */
        public RunnableC2011a(BaseVideoIntroductionFragment baseVideoIntroductionFragment, String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K0 */
    public final void m12060K0() {
    }

    /* JADX INFO: renamed from: L0 */
    public abstract void mo12061L0();

    /* JADX INFO: renamed from: M0 */
    public abstract void mo12062M0(View view);

    /* JADX INFO: renamed from: N0 */
    public abstract int mo12063N0();

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: O0 */
    public final void m12064O0() {
    }

    /* JADX INFO: renamed from: P0 */
    public boolean mo12065P0() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q0 */
    public void m12066Q0() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return null;
    }
}
