package androidx.core.location;

import android.location.GnssStatus;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import p000.C0188Cn;
import p000.C0252Dn;
import p000.C0316En;
import p000.C0379Fn;
import p000.C0442Gn;
import p000.C0506Hn;
import p000.C0569In;
import p000.C0632Jn;
import p000.C0697Kn;
import p000.C0762Ln;
import p000.C0825Mn;
import p000.C0888Nn;
import p000.C0952On;
import p000.C1018Pn;
import p000.C1083Qn;
import p000.C1145Rn;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(24)
@RestrictTo({RestrictTo.Scope.LIBRARY})
class GnssStatusWrapper extends GnssStatusCompat {
    private final GnssStatus mWrapped;

    public GnssStatusWrapper(GnssStatus gnssStatus) {
        this.mWrapped = C0632Jn.m3008a(Preconditions.checkNotNull(gnssStatus));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GnssStatusWrapper) {
            return C0316En.m1674a(this.mWrapped, ((GnssStatusWrapper) obj).mWrapped);
        }
        return false;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getAzimuthDegrees(int i) {
        return C1018Pn.m4484a(this.mWrapped, i);
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getBasebandCn0DbHz(int i) {
        if (Build.VERSION.SDK_INT >= 30) {
            return C0888Nn.m4041a(this.mWrapped, i);
        }
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getCarrierFrequencyHz(int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C0825Mn.m3874a(this.mWrapped, i);
        }
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getCn0DbHz(int i) {
        return C0506Hn.m2394a(this.mWrapped, i);
    }

    @Override // androidx.core.location.GnssStatusCompat
    public int getConstellationType(int i) {
        return C1145Rn.m5351a(this.mWrapped, i);
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getElevationDegrees(int i) {
        return C0252Dn.m1476a(this.mWrapped, i);
    }

    @Override // androidx.core.location.GnssStatusCompat
    public int getSatelliteCount() {
        return C0697Kn.m3289a(this.mWrapped);
    }

    @Override // androidx.core.location.GnssStatusCompat
    public int getSvid(int i) {
        return C0569In.m2690a(this.mWrapped, i);
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasAlmanacData(int i) {
        return C1083Qn.m4818a(this.mWrapped, i);
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasBasebandCn0DbHz(int i) {
        if (Build.VERSION.SDK_INT >= 30) {
            return C0952On.m4334a(this.mWrapped, i);
        }
        return false;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasCarrierFrequencyHz(int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C0379Fn.m1933a(this.mWrapped, i);
        }
        return false;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasEphemerisData(int i) {
        return C0762Ln.m3590a(this.mWrapped, i);
    }

    public int hashCode() {
        return C0188Cn.m1136a(this.mWrapped);
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean usedInFix(int i) {
        return C0442Gn.m2150a(this.mWrapped, i);
    }
}
