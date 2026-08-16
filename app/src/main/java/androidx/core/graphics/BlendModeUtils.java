package androidx.core.graphics;

import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import p000.C0010A7;
import p000.C1552Y6;
import p000.C1620Z6;
import p000.C1687a7;
import p000.C2954b7;
import p000.C3017c7;
import p000.C4201d7;
import p000.C4267e7;
import p000.C4330f7;
import p000.C4394g7;
import p000.C4457h7;
import p000.C4520i7;
import p000.C4591j7;
import p000.C4655k7;
import p000.C4718l7;
import p000.C4782m7;
import p000.C4852n7;
import p000.C4917o7;
import p000.C5158p7;
import p000.C5221q7;
import p000.C5284r7;
import p000.C5355s7;
import p000.C5418t7;
import p000.C5500u7;
import p000.C5571v7;
import p000.C5635w7;
import p000.C5702x7;
import p000.C5767y7;
import p000.C5837z7;

/* JADX INFO: loaded from: classes.dex */
class BlendModeUtils {

    /* JADX INFO: renamed from: androidx.core.graphics.BlendModeUtils$1 */
    public static /* synthetic */ class C25841 {
        static final /* synthetic */ int[] $SwitchMap$androidx$core$graphics$BlendModeCompat;

        static {
            int[] iArr = new int[BlendModeCompat.values().length];
            $SwitchMap$androidx$core$graphics$BlendModeCompat = iArr;
            try {
                iArr[BlendModeCompat.CLEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$core$graphics$BlendModeCompat[BlendModeCompat.SRC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$core$graphics$BlendModeCompat[BlendModeCompat.DST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$core$graphics$BlendModeCompat[BlendModeCompat.SRC_OVER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$androidx$core$graphics$BlendModeCompat[BlendModeCompat.DST_OVER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$androidx$core$graphics$BlendModeCompat[BlendModeCompat.SRC_IN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$androidx$core$graphics$BlendModeCompat[BlendModeCompat.DST_IN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$androidx$core$graphics$BlendModeCompat[BlendModeCompat.SRC_OUT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$androidx$core$graphics$BlendModeCompat[BlendModeCompat.DST_OUT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$androidx$core$graphics$BlendModeCompat[BlendModeCompat.SRC_ATOP.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$androidx$core$graphics$BlendModeCompat[BlendModeCompat.DST_ATOP.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$androidx$core$graphics$BlendModeCompat[BlendModeCompat.XOR.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$androidx$core$graphics$BlendModeCompat[BlendModeCompat.PLUS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$androidx$core$graphics$BlendModeCompat[BlendModeCompat.MODULATE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$androidx$core$graphics$BlendModeCompat[BlendModeCompat.SCREEN.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$androidx$core$graphics$BlendModeCompat[BlendModeCompat.OVERLAY.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$androidx$core$graphics$BlendModeCompat[BlendModeCompat.DARKEN.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$androidx$core$graphics$BlendModeCompat[BlendModeCompat.LIGHTEN.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$androidx$core$graphics$BlendModeCompat[BlendModeCompat.COLOR_DODGE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$androidx$core$graphics$BlendModeCompat[BlendModeCompat.COLOR_BURN.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$androidx$core$graphics$BlendModeCompat[BlendModeCompat.HARD_LIGHT.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$androidx$core$graphics$BlendModeCompat[BlendModeCompat.SOFT_LIGHT.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$androidx$core$graphics$BlendModeCompat[BlendModeCompat.DIFFERENCE.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$androidx$core$graphics$BlendModeCompat[BlendModeCompat.EXCLUSION.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                $SwitchMap$androidx$core$graphics$BlendModeCompat[BlendModeCompat.MULTIPLY.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                $SwitchMap$androidx$core$graphics$BlendModeCompat[BlendModeCompat.HUE.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                $SwitchMap$androidx$core$graphics$BlendModeCompat[BlendModeCompat.SATURATION.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                $SwitchMap$androidx$core$graphics$BlendModeCompat[BlendModeCompat.COLOR.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                $SwitchMap$androidx$core$graphics$BlendModeCompat[BlendModeCompat.LUMINOSITY.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
        }
    }

    private BlendModeUtils() {
    }

    @Nullable
    @RequiresApi(29)
    public static BlendMode obtainBlendModeFromCompat(@NonNull BlendModeCompat blendModeCompat) {
        switch (C25841.$SwitchMap$androidx$core$graphics$BlendModeCompat[blendModeCompat.ordinal()]) {
            case 1:
                return C1552Y6.m8059a();
            case 2:
                return C1687a7.m8893a();
            case 3:
                return C4718l7.m21909a();
            case 4:
                return C4782m7.m22057a();
            case 5:
                return C4852n7.m22308a();
            case 6:
                return C4917o7.m22601a();
            case 7:
                return C5158p7.m27377a();
            case 8:
                return C5221q7.m27594a();
            case 9:
                return C5284r7.m27796a();
            case 10:
                return C5355s7.m28118a();
            case 11:
                return C4591j7.m21513a();
            case 12:
                return C5418t7.m28367a();
            case 13:
                return C5500u7.m28571a();
            case 14:
                return C5571v7.m28759a();
            case 15:
                return C5635w7.m29222a();
            case 16:
                return C5702x7.m29398a();
            case 17:
                return C5767y7.m29753a();
            case 18:
                return C5837z7.m29952a();
            case 19:
                return C0010A7.m98a();
            case 20:
                return C1620Z6.m8636a();
            case 21:
                return C2954b7.m14598a();
            case 22:
                return C3017c7.m16438a();
            case 23:
                return C4201d7.m19877a();
            case 24:
                return C4267e7.m20044a();
            case 25:
                return C4330f7.m20279a();
            case 26:
                return C4394g7.m20729a();
            case 27:
                return C4457h7.m20968a();
            case 28:
                return C4520i7.m21331a();
            case 29:
                return C4655k7.m21744a();
            default:
                return null;
        }
    }

    @Nullable
    public static PorterDuff.Mode obtainPorterDuffFromCompat(@Nullable BlendModeCompat blendModeCompat) {
        if (blendModeCompat == null) {
            return null;
        }
        switch (C25841.$SwitchMap$androidx$core$graphics$BlendModeCompat[blendModeCompat.ordinal()]) {
            case 1:
                return PorterDuff.Mode.CLEAR;
            case 2:
                return PorterDuff.Mode.SRC;
            case 3:
                return PorterDuff.Mode.DST;
            case 4:
                return PorterDuff.Mode.SRC_OVER;
            case 5:
                return PorterDuff.Mode.DST_OVER;
            case 6:
                return PorterDuff.Mode.SRC_IN;
            case 7:
                return PorterDuff.Mode.DST_IN;
            case 8:
                return PorterDuff.Mode.SRC_OUT;
            case 9:
                return PorterDuff.Mode.DST_OUT;
            case 10:
                return PorterDuff.Mode.SRC_ATOP;
            case 11:
                return PorterDuff.Mode.DST_ATOP;
            case 12:
                return PorterDuff.Mode.XOR;
            case 13:
                return PorterDuff.Mode.ADD;
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.OVERLAY;
            case 17:
                return PorterDuff.Mode.DARKEN;
            case 18:
                return PorterDuff.Mode.LIGHTEN;
            default:
                return null;
        }
    }
}
