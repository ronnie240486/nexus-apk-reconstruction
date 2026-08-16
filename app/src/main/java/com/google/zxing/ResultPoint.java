package com.google.zxing;

import com.google.zxing.common.detector.MathUtils;
import p000.C1313UP;

/* JADX INFO: loaded from: classes2.dex */
public class ResultPoint {

    /* JADX INFO: renamed from: x */
    private final float f11198x;

    /* JADX INFO: renamed from: y */
    private final float f11199y;

    public ResultPoint(float f, float f2) {
        this.f11198x = f;
        this.f11199y = f2;
    }

    private static float crossProductZ(ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3) {
        float f = resultPoint2.f11198x;
        float f2 = resultPoint2.f11199y;
        return ((resultPoint.f11199y - f2) * (resultPoint3.f11198x - f)) - ((resultPoint.f11198x - f) * (resultPoint3.f11199y - f2));
    }

    public static float distance(ResultPoint resultPoint, ResultPoint resultPoint2) {
        return MathUtils.distance(resultPoint.f11198x, resultPoint.f11199y, resultPoint2.f11198x, resultPoint2.f11199y);
    }

    public static void orderBestPatterns(ResultPoint[] resultPointArr) {
        ResultPoint resultPoint;
        ResultPoint resultPoint2;
        ResultPoint resultPoint3;
        float fDistance = distance(resultPointArr[0], resultPointArr[1]);
        float fDistance2 = distance(resultPointArr[1], resultPointArr[2]);
        float fDistance3 = distance(resultPointArr[0], resultPointArr[2]);
        if (fDistance2 >= fDistance && fDistance2 >= fDistance3) {
            resultPoint = resultPointArr[0];
            resultPoint2 = resultPointArr[1];
            resultPoint3 = resultPointArr[2];
        } else if (fDistance3 < fDistance2 || fDistance3 < fDistance) {
            resultPoint = resultPointArr[2];
            resultPoint2 = resultPointArr[0];
            resultPoint3 = resultPointArr[1];
        } else {
            resultPoint = resultPointArr[1];
            resultPoint2 = resultPointArr[0];
            resultPoint3 = resultPointArr[2];
        }
        if (crossProductZ(resultPoint2, resultPoint, resultPoint3) < 0.0f) {
            ResultPoint resultPoint4 = resultPoint3;
            resultPoint3 = resultPoint2;
            resultPoint2 = resultPoint4;
        }
        resultPointArr[0] = resultPoint2;
        resultPointArr[1] = resultPoint;
        resultPointArr[2] = resultPoint3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ResultPoint) {
            ResultPoint resultPoint = (ResultPoint) obj;
            if (this.f11198x == resultPoint.f11198x && this.f11199y == resultPoint.f11199y) {
                return true;
            }
        }
        return false;
    }

    public final float getX() {
        return this.f11198x;
    }

    public final float getY() {
        return this.f11199y;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f11199y) + (Float.floatToIntBits(this.f11198x) * 31);
    }

    public final String toString() {
        return C1313UP.f3458k + this.f11198x + ',' + this.f11199y + ')';
    }
}
