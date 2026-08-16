package androidx.constraintlayout.motion.widget;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.motion.utils.Easing;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintSet;
import java.util.Arrays;
import java.util.LinkedHashMap;
import p000.C5984j00;
import p000.C6027p10;

/* JADX INFO: loaded from: classes.dex */
class MotionPaths implements Comparable<MotionPaths> {
    static final int CARTESIAN = 2;
    public static final boolean DEBUG = false;
    static final int OFF_HEIGHT = 4;
    static final int OFF_PATH_ROTATE = 5;
    static final int OFF_POSITION = 0;
    static final int OFF_WIDTH = 3;
    static final int OFF_X = 1;
    static final int OFF_Y = 2;
    public static final boolean OLD_WAY = false;
    static final int PERPENDICULAR = 1;
    static final int SCREEN = 3;
    public static final String TAG = "MotionPaths";
    static String[] names = {C5984j00.f14639a1, "x", C6027p10.f18368d, "width", "height", "pathRotate"};
    LinkedHashMap<String, ConstraintAttribute> attributes;
    float height;
    int mDrawPath;
    Easing mKeyFrameEasing;
    int mMode;
    int mPathMotionArc;
    float mPathRotate;
    float mProgress;
    double[] mTempDelta;
    double[] mTempValue;
    float position;
    float time;
    float width;

    /* JADX INFO: renamed from: x */
    float f10080x;

    /* JADX INFO: renamed from: y */
    float f10081y;

    public MotionPaths() {
        this.mDrawPath = 0;
        this.mPathRotate = Float.NaN;
        this.mProgress = Float.NaN;
        this.mPathMotionArc = Key.UNSET;
        this.attributes = new LinkedHashMap<>();
        this.mMode = 0;
        this.mTempValue = new double[18];
        this.mTempDelta = new double[18];
    }

    private boolean diff(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            return Float.isNaN(f) != Float.isNaN(f2);
        }
        return Math.abs(f - f2) > 1.0E-6f;
    }

    private static final float xRotate(float f, float f2, float f3, float f4, float f5, float f6) {
        return (((f5 - f3) * f2) - ((f6 - f4) * f)) + f3;
    }

    private static final float yRotate(float f, float f2, float f3, float f4, float f5, float f6) {
        return ((f6 - f4) * f2) + ((f5 - f3) * f) + f4;
    }

    public void applyParameters(ConstraintSet.Constraint constraint) {
        this.mKeyFrameEasing = Easing.getInterpolator(constraint.motion.mTransitionEasing);
        ConstraintSet.Motion motion = constraint.motion;
        this.mPathMotionArc = motion.mPathMotionArc;
        this.mPathRotate = motion.mPathRotate;
        this.mDrawPath = motion.mDrawPath;
        this.mProgress = constraint.propertySet.mProgress;
        for (String str : constraint.mCustomConstraints.keySet()) {
            ConstraintAttribute constraintAttribute = constraint.mCustomConstraints.get(str);
            if (constraintAttribute.getType() != ConstraintAttribute.AttributeType.STRING_TYPE) {
                this.attributes.put(str, constraintAttribute);
            }
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(@NonNull MotionPaths motionPaths) {
        return Float.compare(this.position, motionPaths.position);
    }

    public void different(MotionPaths motionPaths, boolean[] zArr, String[] strArr, boolean z) {
        zArr[0] = zArr[0] | diff(this.position, motionPaths.position);
        zArr[1] = zArr[1] | diff(this.f10080x, motionPaths.f10080x) | z;
        zArr[2] = z | diff(this.f10081y, motionPaths.f10081y) | zArr[2];
        zArr[3] = zArr[3] | diff(this.width, motionPaths.width);
        zArr[4] = diff(this.height, motionPaths.height) | zArr[4];
    }

    public void fillStandard(double[] dArr, int[] iArr) {
        float[] fArr = {this.position, this.f10080x, this.f10081y, this.width, this.height, this.mPathRotate};
        int i = 0;
        for (int i2 : iArr) {
            if (i2 < 6) {
                dArr[i] = fArr[i2];
                i++;
            }
        }
    }

    public void getBounds(int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.width;
        float f2 = this.height;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f3 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 == 3) {
                f = f3;
            } else if (i3 == 4) {
                f2 = f3;
            }
        }
        fArr[i] = f;
        fArr[i + 1] = f2;
    }

    public void getCenter(int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.f10080x;
        float f2 = this.f10081y;
        float f3 = this.width;
        float f4 = this.height;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f5 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 == 1) {
                f = f5;
            } else if (i3 == 2) {
                f2 = f5;
            } else if (i3 == 3) {
                f3 = f5;
            } else if (i3 == 4) {
                f4 = f5;
            }
        }
        fArr[i] = (f3 / 2.0f) + f + 0.0f;
        fArr[i + 1] = (f4 / 2.0f) + f2 + 0.0f;
    }

    public int getCustomData(String str, double[] dArr, int i) {
        ConstraintAttribute constraintAttribute = this.attributes.get(str);
        if (constraintAttribute.noOfInterpValues() == 1) {
            dArr[i] = constraintAttribute.getValueToInterpolate();
            return 1;
        }
        int iNoOfInterpValues = constraintAttribute.noOfInterpValues();
        float[] fArr = new float[iNoOfInterpValues];
        constraintAttribute.getValuesToInterpolate(fArr);
        int i2 = 0;
        while (i2 < iNoOfInterpValues) {
            dArr[i] = fArr[i2];
            i2++;
            i++;
        }
        return iNoOfInterpValues;
    }

    public int getCustomDataCount(String str) {
        return this.attributes.get(str).noOfInterpValues();
    }

    public void getRect(int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.f10080x;
        float f2 = this.f10081y;
        float f3 = this.width;
        float f4 = this.height;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f5 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 == 1) {
                f = f5;
            } else if (i3 == 2) {
                f2 = f5;
            } else if (i3 == 3) {
                f3 = f5;
            } else if (i3 == 4) {
                f4 = f5;
            }
        }
        float f6 = f3 + f;
        float f7 = f4 + f2;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        fArr[i] = f + 0.0f;
        fArr[i + 1] = f2 + 0.0f;
        fArr[i + 2] = f6 + 0.0f;
        fArr[i + 3] = f2 + 0.0f;
        fArr[i + 4] = f6 + 0.0f;
        int i4 = i + 6;
        fArr[i + 5] = f7 + 0.0f;
        fArr[i4] = f + 0.0f;
        fArr[i + 7] = f7 + 0.0f;
    }

    public boolean hasCustomData(String str) {
        return this.attributes.containsKey(str);
    }

    public void initCartesian(KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f = keyPosition.mFramePosition / 100.0f;
        this.time = f;
        this.mDrawPath = keyPosition.mDrawPath;
        float f2 = Float.isNaN(keyPosition.mPercentWidth) ? f : keyPosition.mPercentWidth;
        float f3 = Float.isNaN(keyPosition.mPercentHeight) ? f : keyPosition.mPercentHeight;
        float f4 = motionPaths2.width;
        float f5 = motionPaths.width;
        float f6 = f4 - f5;
        float f7 = motionPaths2.height;
        float f8 = motionPaths.height;
        float f9 = f7 - f8;
        this.position = this.time;
        float f10 = motionPaths.f10080x;
        float f11 = motionPaths.f10081y;
        float f12 = ((f4 / 2.0f) + motionPaths2.f10080x) - ((f5 / 2.0f) + f10);
        float f13 = ((f7 / 2.0f) + motionPaths2.f10081y) - ((f8 / 2.0f) + f11);
        float f14 = f6 * f2;
        float f15 = f14 / 2.0f;
        this.f10080x = (int) (((f12 * f) + f10) - f15);
        float f16 = (f13 * f) + f11;
        float f17 = f9 * f3;
        float f18 = f17 / 2.0f;
        this.f10081y = (int) (f16 - f18);
        this.width = (int) (f5 + f14);
        this.height = (int) (f8 + f17);
        float f19 = Float.isNaN(keyPosition.mPercentX) ? f : keyPosition.mPercentX;
        float f20 = Float.isNaN(keyPosition.mAltPercentY) ? 0.0f : keyPosition.mAltPercentY;
        if (!Float.isNaN(keyPosition.mPercentY)) {
            f = keyPosition.mPercentY;
        }
        float f21 = Float.isNaN(keyPosition.mAltPercentX) ? 0.0f : keyPosition.mAltPercentX;
        this.mMode = 2;
        this.f10080x = (int) (((f21 * f13) + ((f19 * f12) + motionPaths.f10080x)) - f15);
        this.f10081y = (int) (((f13 * f) + ((f12 * f20) + motionPaths.f10081y)) - f18);
        this.mKeyFrameEasing = Easing.getInterpolator(keyPosition.mTransitionEasing);
        this.mPathMotionArc = keyPosition.mPathMotionArc;
    }

    public void initPath(KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f = keyPosition.mFramePosition / 100.0f;
        this.time = f;
        this.mDrawPath = keyPosition.mDrawPath;
        float f2 = Float.isNaN(keyPosition.mPercentWidth) ? f : keyPosition.mPercentWidth;
        float f3 = Float.isNaN(keyPosition.mPercentHeight) ? f : keyPosition.mPercentHeight;
        float f4 = motionPaths2.width - motionPaths.width;
        float f5 = motionPaths2.height - motionPaths.height;
        this.position = this.time;
        if (!Float.isNaN(keyPosition.mPercentX)) {
            f = keyPosition.mPercentX;
        }
        float f6 = motionPaths.f10080x;
        float f7 = motionPaths.width;
        float f8 = motionPaths.f10081y;
        float f9 = motionPaths.height;
        float f10 = ((motionPaths2.width / 2.0f) + motionPaths2.f10080x) - ((f7 / 2.0f) + f6);
        float f11 = ((motionPaths2.height / 2.0f) + motionPaths2.f10081y) - ((f9 / 2.0f) + f8);
        float f12 = f10 * f;
        float f13 = f4 * f2;
        float f14 = f13 / 2.0f;
        this.f10080x = (int) ((f6 + f12) - f14);
        float f15 = f * f11;
        float f16 = f5 * f3;
        float f17 = f16 / 2.0f;
        this.f10081y = (int) ((f8 + f15) - f17);
        this.width = (int) (f7 + f13);
        this.height = (int) (f9 + f16);
        float f18 = Float.isNaN(keyPosition.mPercentY) ? 0.0f : keyPosition.mPercentY;
        this.mMode = 1;
        float f19 = (int) ((motionPaths.f10080x + f12) - f14);
        float f20 = (int) ((motionPaths.f10081y + f15) - f17);
        this.f10080x = f19 + ((-f11) * f18);
        this.f10081y = f20 + (f10 * f18);
        this.mKeyFrameEasing = Easing.getInterpolator(keyPosition.mTransitionEasing);
        this.mPathMotionArc = keyPosition.mPathMotionArc;
    }

    public void initScreen(int i, int i2, KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f = keyPosition.mFramePosition / 100.0f;
        this.time = f;
        this.mDrawPath = keyPosition.mDrawPath;
        float f2 = Float.isNaN(keyPosition.mPercentWidth) ? f : keyPosition.mPercentWidth;
        float f3 = Float.isNaN(keyPosition.mPercentHeight) ? f : keyPosition.mPercentHeight;
        float f4 = motionPaths2.width;
        float f5 = motionPaths.width;
        float f6 = f4 - f5;
        float f7 = motionPaths2.height;
        float f8 = motionPaths.height;
        float f9 = f7 - f8;
        this.position = this.time;
        float f10 = motionPaths.f10080x;
        float f11 = motionPaths.f10081y;
        float f12 = (f4 / 2.0f) + motionPaths2.f10080x;
        float f13 = (f7 / 2.0f) + motionPaths2.f10081y;
        float f14 = f6 * f2;
        this.f10080x = (int) ((((f12 - ((f5 / 2.0f) + f10)) * f) + f10) - (f14 / 2.0f));
        float f15 = f9 * f3;
        this.f10081y = (int) ((((f13 - ((f8 / 2.0f) + f11)) * f) + f11) - (f15 / 2.0f));
        this.width = (int) (f5 + f14);
        this.height = (int) (f8 + f15);
        this.mMode = 3;
        if (!Float.isNaN(keyPosition.mPercentX)) {
            this.f10080x = (int) (keyPosition.mPercentX * ((int) (i - this.width)));
        }
        if (!Float.isNaN(keyPosition.mPercentY)) {
            this.f10081y = (int) (keyPosition.mPercentY * ((int) (i2 - this.height)));
        }
        this.mKeyFrameEasing = Easing.getInterpolator(keyPosition.mTransitionEasing);
        this.mPathMotionArc = keyPosition.mPathMotionArc;
    }

    public void setBounds(float f, float f2, float f3, float f4) {
        this.f10080x = f;
        this.f10081y = f2;
        this.width = f3;
        this.height = f4;
    }

    public void setDpDt(float f, float f2, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i = 0; i < iArr.length; i++) {
            float f7 = (float) dArr[i];
            double d = dArr2[i];
            int i2 = iArr[i];
            if (i2 == 1) {
                f3 = f7;
            } else if (i2 == 2) {
                f5 = f7;
            } else if (i2 == 3) {
                f4 = f7;
            } else if (i2 == 4) {
                f6 = f7;
            }
        }
        float f8 = f3 - ((0.0f * f4) / 2.0f);
        float f9 = f5 - ((0.0f * f6) / 2.0f);
        fArr[0] = (((f4 * 1.0f) + f8) * f) + ((1.0f - f) * f8) + 0.0f;
        fArr[1] = (((f6 * 1.0f) + f9) * f2) + ((1.0f - f2) * f9) + 0.0f;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0105  */
    public void setView(View view, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3) {
        float f;
        int i;
        int i2;
        float f2;
        float f3 = this.f10080x;
        float f4 = this.f10081y;
        float f5 = this.width;
        float f6 = this.height;
        if (iArr.length != 0 && this.mTempValue.length <= iArr[iArr.length - 1]) {
            int i3 = iArr[iArr.length - 1] + 1;
            this.mTempValue = new double[i3];
            this.mTempDelta = new double[i3];
        }
        Arrays.fill(this.mTempValue, Double.NaN);
        int i4 = 0;
        for (int i5 = 0; i5 < iArr.length; i5++) {
            double[] dArr4 = this.mTempValue;
            int i6 = iArr[i5];
            dArr4[i6] = dArr[i5];
            this.mTempDelta[i6] = dArr2[i5];
        }
        float f7 = Float.NaN;
        float f8 = 0.0f;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        while (true) {
            double[] dArr5 = this.mTempValue;
            if (i4 >= dArr5.length) {
                break;
            }
            if (Double.isNaN(dArr5[i4]) && (dArr3 == null || dArr3[i4] == 0.0d)) {
                f2 = f7;
            } else {
                double d = dArr3 != null ? dArr3[i4] : 0.0d;
                if (!Double.isNaN(this.mTempValue[i4])) {
                    d = this.mTempValue[i4] + d;
                }
                f2 = f7;
                float f12 = (float) d;
                float f13 = (float) this.mTempDelta[i4];
                if (i4 == 1) {
                    f7 = f2;
                    f3 = f12;
                    f8 = f13;
                } else if (i4 == 2) {
                    f7 = f2;
                    f4 = f12;
                    f10 = f13;
                } else if (i4 == 3) {
                    f7 = f2;
                    f5 = f12;
                    f9 = f13;
                } else if (i4 == 4) {
                    f7 = f2;
                    f6 = f12;
                    f11 = f13;
                } else if (i4 == 5) {
                    f7 = f12;
                }
                i4++;
            }
            f7 = f2;
            i4++;
        }
        float f14 = f7;
        if (Float.isNaN(f14)) {
            f = Float.NaN;
            if (!Float.isNaN(Float.NaN)) {
            }
            float f15 = f3 + 0.5f;
            int i7 = (int) f15;
            float f16 = f4 + 0.5f;
            int i8 = (int) f16;
            int i9 = (int) (f15 + f5);
            int i10 = (int) (f16 + f6);
            i = i9 - i7;
            i2 = i10 - i8;
            if (i == view.getMeasuredWidth() || i2 != view.getMeasuredHeight()) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
            }
            view.layout(i7, i8, i9, i10);
        }
        double d2 = Float.isNaN(Float.NaN) ? 0.0f : Float.NaN;
        double d3 = f14;
        double degrees = Math.toDegrees(Math.atan2((f11 / 2.0f) + f10, (f9 / 2.0f) + f8));
        Double.isNaN(d3);
        Double.isNaN(d2);
        f = (float) (degrees + d3 + d2);
        view.setRotation(f);
        float f17 = f3 + 0.5f;
        int i11 = (int) f17;
        float f18 = f4 + 0.5f;
        int i12 = (int) f18;
        int i13 = (int) (f17 + f5);
        int i14 = (int) (f18 + f6);
        i = i13 - i11;
        i2 = i14 - i12;
        if (i == view.getMeasuredWidth()) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
        }
        view.layout(i11, i12, i13, i14);
    }

    public MotionPaths(int i, int i2, KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        this.mDrawPath = 0;
        this.mPathRotate = Float.NaN;
        this.mProgress = Float.NaN;
        this.mPathMotionArc = Key.UNSET;
        this.attributes = new LinkedHashMap<>();
        this.mMode = 0;
        this.mTempValue = new double[18];
        this.mTempDelta = new double[18];
        int i3 = keyPosition.mPositionType;
        if (i3 == 1) {
            initPath(keyPosition, motionPaths, motionPaths2);
        } else if (i3 != 2) {
            initCartesian(keyPosition, motionPaths, motionPaths2);
        } else {
            initScreen(i, i2, keyPosition, motionPaths, motionPaths2);
        }
    }
}
