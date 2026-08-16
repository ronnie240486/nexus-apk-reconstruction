package androidx.transition;

import android.view.View;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.p013io.IOUtils;
import p000.C0835Mx;
import p000.C4515i2;

/* JADX INFO: loaded from: classes.dex */
public class TransitionValues {
    public View view;
    public final Map<String, Object> values = new HashMap();
    final ArrayList<Transition> mTargetedTransitions = new ArrayList<>();

    @Deprecated
    public TransitionValues() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TransitionValues)) {
            return false;
        }
        TransitionValues transitionValues = (TransitionValues) obj;
        return this.view == transitionValues.view && this.values.equals(transitionValues.values);
    }

    public int hashCode() {
        return this.values.hashCode() + (this.view.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sbM3902a = C0835Mx.m3902a("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        sbM3902a.append(this.view);
        sbM3902a.append(IOUtils.f15646e);
        String strM21289a = C4515i2.m21289a(sbM3902a.toString(), "    values:");
        for (String str : this.values.keySet()) {
            strM21289a = strM21289a + "    " + str + ": " + this.values.get(str) + IOUtils.f15646e;
        }
        return strM21289a;
    }

    public TransitionValues(@NonNull View view) {
        this.view = view;
    }
}
