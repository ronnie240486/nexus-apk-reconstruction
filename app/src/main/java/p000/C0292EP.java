package p000;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: EP */
/* JADX INFO: loaded from: classes2.dex */
public final class C0292EP {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C0292EP f689a = new C0292EP();

    /* JADX INFO: renamed from: b */
    @NotNull
    @InterfaceC5750xt
    public static final C1442WM f690b;

    static {
        String strM2725C = C0574Is.m2725C("[eE][+-]?", "(\\p{Digit}+)");
        f690b = new C1442WM(C0060Av.m278a("[\\x00-\\x20]*[+-]?(NaN|Infinity|((", "((\\p{Digit}+)(\\.)?((\\p{Digit}+)?)(" + strM2725C + ")?)|(\\.((\\p{Digit}+))(" + strM2725C + ")?)|(((0[xX](\\p{XDigit}+)(\\.)?)|(0[xX](\\p{XDigit}+)?(\\.)(\\p{XDigit}+)))[pP][+-]?(\\p{Digit}+))", ")[fFdD]?))[\\x00-\\x20]*"));
    }
}
