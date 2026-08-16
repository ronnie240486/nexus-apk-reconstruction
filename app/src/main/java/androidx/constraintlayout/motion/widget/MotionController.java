package androidx.constraintlayout.motion.widget;

import android.graphics.RectF;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.utils.CurveFit;
import androidx.constraintlayout.motion.utils.Easing;
import androidx.constraintlayout.motion.utils.VelocityMatrix;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p000.C0245Dg;
import p000.C0305Ec;
import p000.C0786MA;
import p000.C1262Tc;

/* JADX INFO: loaded from: classes.dex */
public class MotionController {
    private static final boolean DEBUG = false;
    public static final int DRAW_PATH_AS_CONFIGURED = 4;
    public static final int DRAW_PATH_BASIC = 1;
    public static final int DRAW_PATH_CARTESIAN = 3;
    public static final int DRAW_PATH_NONE = 0;
    public static final int DRAW_PATH_RECTANGLE = 5;
    public static final int DRAW_PATH_RELATIVE = 2;
    public static final int DRAW_PATH_SCREEN = 6;
    private static final boolean FAVOR_FIXED_SIZE_VIEWS = false;
    public static final int HORIZONTAL_PATH_X = 2;
    public static final int HORIZONTAL_PATH_Y = 3;
    public static final int PATH_PERCENT = 0;
    public static final int PATH_PERPENDICULAR = 1;
    private static final String TAG = "MotionController";
    public static final int VERTICAL_PATH_X = 4;
    public static final int VERTICAL_PATH_Y = 5;
    String[] attributeTable;
    private CurveFit mArcSpline;
    private int[] mAttributeInterpCount;
    private String[] mAttributeNames;
    private HashMap<String, SplineSet> mAttributesMap;
    String mConstraintTag;
    private HashMap<String, KeyCycleOscillator> mCycleMap;
    int mId;
    private double[] mInterpolateData;
    private int[] mInterpolateVariables;
    private double[] mInterpolateVelocity;
    private KeyTrigger[] mKeyTriggers;
    private CurveFit[] mSpline;
    private HashMap<String, TimeCycleSplineSet> mTimeCycleAttributesMap;
    View mView;
    private int mCurveFitType = -1;
    private MotionPaths mStartMotionPath = new MotionPaths();
    private MotionPaths mEndMotionPath = new MotionPaths();
    private MotionConstrainedPoint mStartPoint = new MotionConstrainedPoint();
    private MotionConstrainedPoint mEndPoint = new MotionConstrainedPoint();
    float mMotionStagger = Float.NaN;
    float mStaggerOffset = 0.0f;
    float mStaggerScale = 1.0f;
    private int MAX_DIMENSION = 4;
    private float[] mValuesBuff = new float[4];
    private ArrayList<MotionPaths> mMotionPaths = new ArrayList<>();
    private float[] mVelocity = new float[1];
    private ArrayList<Key> mKeyList = new ArrayList<>();
    private int mPathMotionArc = Key.UNSET;

    public MotionController(View view) {
        setView(view);
    }

    private float getAdjustedPosition(float f, float[] fArr) {
        float f2 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f3 = this.mStaggerScale;
            if (f3 != 1.0d) {
                float f4 = this.mStaggerOffset;
                if (f < f4) {
                    f = 0.0f;
                }
                if (f > f4 && f < 1.0d) {
                    f = (f - f4) * f3;
                }
            }
        }
        Easing easing = this.mStartMotionPath.mKeyFrameEasing;
        float f5 = Float.NaN;
        for (MotionPaths motionPaths : this.mMotionPaths) {
            Easing easing2 = motionPaths.mKeyFrameEasing;
            if (easing2 != null) {
                float f6 = motionPaths.time;
                if (f6 < f) {
                    easing = easing2;
                    f2 = f6;
                } else if (Float.isNaN(f5)) {
                    f5 = motionPaths.time;
                }
            }
        }
        if (easing != null) {
            float f7 = (Float.isNaN(f5) ? 1.0f : f5) - f2;
            double d = (f - f2) / f7;
            f = (((float) easing.get(d)) * f7) + f2;
            if (fArr != null) {
                fArr[0] = (float) easing.getDiff(d);
            }
        }
        return f;
    }

    private float getPreCycleDistance() {
        float[] fArr = new float[2];
        float f = 1.0f / 99;
        double d = 0.0d;
        double d2 = 0.0d;
        int i = 0;
        float f2 = 0.0f;
        while (i < 100) {
            float f3 = i * f;
            double d3 = f3;
            Easing easing = this.mStartMotionPath.mKeyFrameEasing;
            float f4 = Float.NaN;
            float f5 = 0.0f;
            for (MotionPaths motionPaths : this.mMotionPaths) {
                Easing easing2 = motionPaths.mKeyFrameEasing;
                float f6 = f;
                if (easing2 != null) {
                    float f7 = motionPaths.time;
                    if (f7 < f3) {
                        f5 = f7;
                        easing = easing2;
                    } else if (Float.isNaN(f4)) {
                        f4 = motionPaths.time;
                    }
                }
                f = f6;
            }
            float f8 = f;
            if (easing != null) {
                if (Float.isNaN(f4)) {
                    f4 = 1.0f;
                }
                float f9 = f4 - f5;
                d3 = (((float) easing.get((f3 - f5) / f9)) * f9) + f5;
            }
            this.mSpline[0].getPos(d3, this.mInterpolateData);
            this.mStartMotionPath.getCenter(this.mInterpolateVariables, this.mInterpolateData, fArr, 0);
            if (i > 0) {
                double d4 = f2;
                double d5 = fArr[1];
                Double.isNaN(d5);
                double d6 = d2 - d5;
                double d7 = fArr[0];
                Double.isNaN(d7);
                double dHypot = Math.hypot(d6, d - d7);
                Double.isNaN(d4);
                f2 = (float) (dHypot + d4);
            }
            d = fArr[0];
            d2 = fArr[1];
            i++;
            f = f8;
        }
        return f2;
    }

    private void insertKey(MotionPaths motionPaths) {
        int iBinarySearch = Collections.binarySearch(this.mMotionPaths, motionPaths);
        if (iBinarySearch == 0) {
            Log.e(TAG, " KeyPath positon \"" + motionPaths.position + "\" outside of range");
        }
        this.mMotionPaths.add((-iBinarySearch) - 1, motionPaths);
    }

    private void readView(MotionPaths motionPaths) {
        motionPaths.setBounds((int) this.mView.getX(), (int) this.mView.getY(), this.mView.getWidth(), this.mView.getHeight());
    }

    public void addKey(Key key) {
        this.mKeyList.add(key);
    }

    public void addKeys(ArrayList<Key> arrayList) {
        this.mKeyList.addAll(arrayList);
    }

    public void buildBounds(float[] fArr, int i) {
        float f = 1.0f / (i - 1);
        HashMap<String, SplineSet> map = this.mAttributesMap;
        if (map != null) {
            map.get("translationX");
        }
        HashMap<String, SplineSet> map2 = this.mAttributesMap;
        if (map2 != null) {
            map2.get("translationY");
        }
        HashMap<String, KeyCycleOscillator> map3 = this.mCycleMap;
        if (map3 != null) {
            map3.get("translationX");
        }
        HashMap<String, KeyCycleOscillator> map4 = this.mCycleMap;
        if (map4 != null) {
            map4.get("translationY");
        }
        for (int i2 = 0; i2 < i; i2++) {
            float f2 = i2 * f;
            float f3 = this.mStaggerScale;
            float f4 = 0.0f;
            if (f3 != 1.0f) {
                float f5 = this.mStaggerOffset;
                if (f2 < f5) {
                    f2 = 0.0f;
                }
                if (f2 > f5 && f2 < 1.0d) {
                    f2 = (f2 - f5) * f3;
                }
            }
            double d = f2;
            Easing easing = this.mStartMotionPath.mKeyFrameEasing;
            float f6 = Float.NaN;
            for (MotionPaths motionPaths : this.mMotionPaths) {
                Easing easing2 = motionPaths.mKeyFrameEasing;
                if (easing2 != null) {
                    float f7 = motionPaths.time;
                    if (f7 < f2) {
                        easing = easing2;
                        f4 = f7;
                    } else if (Float.isNaN(f6)) {
                        f6 = motionPaths.time;
                    }
                }
            }
            if (easing != null) {
                if (Float.isNaN(f6)) {
                    f6 = 1.0f;
                }
                float f8 = f6 - f4;
                d = (((float) easing.get((f2 - f4) / f8)) * f8) + f4;
            }
            this.mSpline[0].getPos(d, this.mInterpolateData);
            CurveFit curveFit = this.mArcSpline;
            if (curveFit != null) {
                double[] dArr = this.mInterpolateData;
                if (dArr.length > 0) {
                    curveFit.getPos(d, dArr);
                }
            }
            this.mStartMotionPath.getBounds(this.mInterpolateVariables, this.mInterpolateData, fArr, i2 * 2);
        }
    }

    public int buildKeyBounds(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] timePoints = this.mSpline[0].getTimePoints();
        if (iArr != null) {
            Iterator<MotionPaths> it = this.mMotionPaths.iterator();
            int i = 0;
            while (it.hasNext()) {
                iArr[i] = it.next().mMode;
                i++;
            }
        }
        int i2 = 0;
        for (double d : timePoints) {
            this.mSpline[0].getPos(d, this.mInterpolateData);
            this.mStartMotionPath.getBounds(this.mInterpolateVariables, this.mInterpolateData, fArr, i2);
            i2 += 2;
        }
        return i2 / 2;
    }

    public int buildKeyFrames(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] timePoints = this.mSpline[0].getTimePoints();
        if (iArr != null) {
            Iterator<MotionPaths> it = this.mMotionPaths.iterator();
            int i = 0;
            while (it.hasNext()) {
                iArr[i] = it.next().mMode;
                i++;
            }
        }
        int i2 = 0;
        for (double d : timePoints) {
            this.mSpline[0].getPos(d, this.mInterpolateData);
            this.mStartMotionPath.getCenter(this.mInterpolateVariables, this.mInterpolateData, fArr, i2);
            i2 += 2;
        }
        return i2 / 2;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0066 A[PHI: r11
      0x0066: PHI (r11v2 float) = (r11v1 float), (r11v4 float) binds: [B:21:0x004c, B:26:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:61:0x0101 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x0103  */
    /* JADX WARN: Code duplicated, block: B:68:0x010e A[SYNTHETIC] */
    public void buildPath(float[] fArr, int i) {
        SplineSet splineSet;
        int i2 = i;
        float f = 1.0f;
        float f2 = 1.0f / (i2 - 1);
        HashMap<String, SplineSet> map = this.mAttributesMap;
        SplineSet splineSet2 = map == null ? null : map.get("translationX");
        HashMap<String, SplineSet> map2 = this.mAttributesMap;
        SplineSet splineSet3 = map2 == null ? null : map2.get("translationY");
        HashMap<String, KeyCycleOscillator> map3 = this.mCycleMap;
        KeyCycleOscillator keyCycleOscillator = map3 == null ? null : map3.get("translationX");
        HashMap<String, KeyCycleOscillator> map4 = this.mCycleMap;
        KeyCycleOscillator keyCycleOscillator2 = map4 != null ? map4.get("translationY") : null;
        int i3 = 0;
        while (i3 < i2) {
            float f3 = i3 * f2;
            float f4 = this.mStaggerScale;
            float f5 = 0.0f;
            if (f4 != f) {
                float f6 = this.mStaggerOffset;
                if (f3 < f6) {
                    f3 = 0.0f;
                }
                if (f3 > f6) {
                    splineSet = splineSet2;
                    if (f3 < 1.0d) {
                        f3 = (f3 - f6) * f4;
                    }
                } else {
                    splineSet = splineSet2;
                }
            } else {
                splineSet = splineSet2;
            }
            double d = f3;
            Easing easing = this.mStartMotionPath.mKeyFrameEasing;
            float f7 = Float.NaN;
            for (MotionPaths motionPaths : this.mMotionPaths) {
                Easing easing2 = motionPaths.mKeyFrameEasing;
                if (easing2 != null) {
                    float f8 = motionPaths.time;
                    if (f8 < f3) {
                        f5 = f8;
                        easing = easing2;
                    } else if (Float.isNaN(f7)) {
                        f7 = motionPaths.time;
                    }
                }
            }
            if (easing != null) {
                if (Float.isNaN(f7)) {
                    f7 = 1.0f;
                }
                float f9 = f7 - f5;
                d = (((float) easing.get((f3 - f5) / f9)) * f9) + f5;
            }
            this.mSpline[0].getPos(d, this.mInterpolateData);
            CurveFit curveFit = this.mArcSpline;
            if (curveFit != null) {
                double[] dArr = this.mInterpolateData;
                if (dArr.length > 0) {
                    curveFit.getPos(d, dArr);
                }
            }
            int i4 = i3 * 2;
            this.mStartMotionPath.getCenter(this.mInterpolateVariables, this.mInterpolateData, fArr, i4);
            if (keyCycleOscillator != null) {
                fArr[i4] = keyCycleOscillator.get(f3) + fArr[i4];
            } else {
                if (splineSet != null) {
                    splineSet2 = splineSet;
                    fArr[i4] = splineSet2.get(f3) + fArr[i4];
                }
                if (keyCycleOscillator2 != null) {
                    int i5 = i4 + 1;
                    fArr[i5] = keyCycleOscillator2.get(f3) + fArr[i5];
                } else if (splineSet3 != null) {
                    int i6 = i4 + 1;
                    fArr[i6] = splineSet3.get(f3) + fArr[i6];
                }
                i3++;
                i2 = i;
                f = 1.0f;
            }
            splineSet2 = splineSet;
            if (keyCycleOscillator2 != null) {
                int i7 = i4 + 1;
                fArr[i7] = keyCycleOscillator2.get(f3) + fArr[i7];
            } else if (splineSet3 != null) {
                int i8 = i4 + 1;
                fArr[i8] = splineSet3.get(f3) + fArr[i8];
            }
            i3++;
            i2 = i;
            f = 1.0f;
        }
    }

    public void buildRect(float f, float[] fArr, int i) {
        this.mSpline[0].getPos(getAdjustedPosition(f, null), this.mInterpolateData);
        this.mStartMotionPath.getRect(this.mInterpolateVariables, this.mInterpolateData, fArr, i);
    }

    public void buildRectangles(float[] fArr, int i) {
        float f = 1.0f / (i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            this.mSpline[0].getPos(getAdjustedPosition(i2 * f, null), this.mInterpolateData);
            this.mStartMotionPath.getRect(this.mInterpolateVariables, this.mInterpolateData, fArr, i2 * 8);
        }
    }

    public int getAttributeValues(String str, float[] fArr, int i) {
        SplineSet splineSet = this.mAttributesMap.get(str);
        if (splineSet == null) {
            return -1;
        }
        for (int i2 = 0; i2 < fArr.length; i2++) {
            fArr[i2] = splineSet.get(i2 / (fArr.length - 1));
        }
        return fArr.length;
    }

    public void getDpDt(float f, float f2, float f3, float[] fArr) {
        double[] dArr;
        float adjustedPosition = getAdjustedPosition(f, this.mVelocity);
        CurveFit[] curveFitArr = this.mSpline;
        int i = 0;
        if (curveFitArr == null) {
            MotionPaths motionPaths = this.mEndMotionPath;
            float f4 = motionPaths.f10080x;
            MotionPaths motionPaths2 = this.mStartMotionPath;
            float f5 = f4 - motionPaths2.f10080x;
            float f6 = motionPaths.f10081y - motionPaths2.f10081y;
            float f7 = motionPaths.width - motionPaths2.width;
            float f8 = (motionPaths.height - motionPaths2.height) + f6;
            fArr[0] = ((f7 + f5) * f2) + ((1.0f - f2) * f5);
            fArr[1] = (f8 * f3) + ((1.0f - f3) * f6);
            return;
        }
        double d = adjustedPosition;
        curveFitArr[0].getSlope(d, this.mInterpolateVelocity);
        this.mSpline[0].getPos(d, this.mInterpolateData);
        float f9 = this.mVelocity[0];
        while (true) {
            dArr = this.mInterpolateVelocity;
            if (i >= dArr.length) {
                break;
            }
            double d2 = dArr[i];
            double d3 = f9;
            Double.isNaN(d3);
            dArr[i] = d2 * d3;
            i++;
        }
        CurveFit curveFit = this.mArcSpline;
        if (curveFit == null) {
            this.mStartMotionPath.setDpDt(f2, f3, fArr, this.mInterpolateVariables, dArr, this.mInterpolateData);
            return;
        }
        double[] dArr2 = this.mInterpolateData;
        if (dArr2.length > 0) {
            curveFit.getPos(d, dArr2);
            this.mArcSpline.getSlope(d, this.mInterpolateVelocity);
            this.mStartMotionPath.setDpDt(f2, f3, fArr, this.mInterpolateVariables, this.mInterpolateVelocity, this.mInterpolateData);
        }
    }

    public int getDrawPath() {
        int iMax = this.mStartMotionPath.mDrawPath;
        Iterator<MotionPaths> it = this.mMotionPaths.iterator();
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().mDrawPath);
        }
        return Math.max(iMax, this.mEndMotionPath.mDrawPath);
    }

    public float getFinalX() {
        return this.mEndMotionPath.f10080x;
    }

    public float getFinalY() {
        return this.mEndMotionPath.f10081y;
    }

    public MotionPaths getKeyFrame(int i) {
        return this.mMotionPaths.get(i);
    }

    public int getKeyFrameInfo(int i, int[] iArr) {
        float[] fArr = new float[2];
        int i2 = 0;
        int i3 = 0;
        for (Key key : this.mKeyList) {
            int i4 = key.mType;
            if (i4 == i || i != -1) {
                iArr[i3] = 0;
                iArr[i3 + 1] = i4;
                int i5 = key.mFramePosition;
                iArr[i3 + 2] = i5;
                this.mSpline[0].getPos(i5 / 100.0f, this.mInterpolateData);
                this.mStartMotionPath.getCenter(this.mInterpolateVariables, this.mInterpolateData, fArr, 0);
                iArr[i3 + 3] = Float.floatToIntBits(fArr[0]);
                int i6 = i3 + 4;
                iArr[i6] = Float.floatToIntBits(fArr[1]);
                if (key instanceof KeyPosition) {
                    KeyPosition keyPosition = (KeyPosition) key;
                    iArr[i3 + 5] = keyPosition.mPositionType;
                    iArr[i3 + 6] = Float.floatToIntBits(keyPosition.mPercentX);
                    i6 = i3 + 7;
                    iArr[i6] = Float.floatToIntBits(keyPosition.mPercentY);
                }
                int i7 = i6 + 1;
                iArr[i3] = i7 - i3;
                i2++;
                i3 = i7;
            }
        }
        return i2;
    }

    public float getKeyFrameParameter(int i, float f, float f2) {
        MotionPaths motionPaths = this.mEndMotionPath;
        float f3 = motionPaths.f10080x;
        MotionPaths motionPaths2 = this.mStartMotionPath;
        float f4 = motionPaths2.f10080x;
        float f5 = f3 - f4;
        float f6 = motionPaths.f10081y;
        float f7 = motionPaths2.f10081y;
        float f8 = f6 - f7;
        float f9 = (motionPaths2.width / 2.0f) + f4;
        float f10 = (motionPaths2.height / 2.0f) + f7;
        float fHypot = (float) Math.hypot(f5, f8);
        if (fHypot < 1.0E-7d) {
            return Float.NaN;
        }
        float f11 = f - f9;
        float f12 = f2 - f10;
        if (((float) Math.hypot(f11, f12)) == 0.0f) {
            return 0.0f;
        }
        float f13 = (f12 * f8) + (f11 * f5);
        if (i == 0) {
            return f13 / fHypot;
        }
        if (i == 1) {
            return (float) Math.sqrt((fHypot * fHypot) - (f13 * f13));
        }
        if (i == 2) {
            return f11 / f5;
        }
        if (i == 3) {
            return f12 / f5;
        }
        if (i == 4) {
            return f11 / f8;
        }
        if (i != 5) {
            return 0.0f;
        }
        return f12 / f8;
    }

    public KeyPositionBase getPositionKeyframe(int i, int i2, float f, float f2) {
        RectF rectF = new RectF();
        MotionPaths motionPaths = this.mStartMotionPath;
        float f3 = motionPaths.f10080x;
        rectF.left = f3;
        float f4 = motionPaths.f10081y;
        rectF.top = f4;
        rectF.right = f3 + motionPaths.width;
        rectF.bottom = f4 + motionPaths.height;
        RectF rectF2 = new RectF();
        MotionPaths motionPaths2 = this.mEndMotionPath;
        float f5 = motionPaths2.f10080x;
        rectF2.left = f5;
        float f6 = motionPaths2.f10081y;
        rectF2.top = f6;
        rectF2.right = f5 + motionPaths2.width;
        rectF2.bottom = f6 + motionPaths2.height;
        for (Key key : this.mKeyList) {
            if (key instanceof KeyPositionBase) {
                KeyPositionBase keyPositionBase = (KeyPositionBase) key;
                if (keyPositionBase.intersects(i, i2, rectF, rectF2, f, f2)) {
                    return keyPositionBase;
                }
            }
        }
        return null;
    }

    public void getPostLayoutDvDp(float f, int i, int i2, float f2, float f3, float[] fArr) {
        float adjustedPosition = getAdjustedPosition(f, this.mVelocity);
        HashMap<String, SplineSet> map = this.mAttributesMap;
        SplineSet splineSet = map == null ? null : map.get("translationX");
        HashMap<String, SplineSet> map2 = this.mAttributesMap;
        SplineSet splineSet2 = map2 == null ? null : map2.get("translationY");
        HashMap<String, SplineSet> map3 = this.mAttributesMap;
        SplineSet splineSet3 = map3 == null ? null : map3.get("rotation");
        HashMap<String, SplineSet> map4 = this.mAttributesMap;
        SplineSet splineSet4 = map4 == null ? null : map4.get("scaleX");
        HashMap<String, SplineSet> map5 = this.mAttributesMap;
        SplineSet splineSet5 = map5 == null ? null : map5.get("scaleY");
        HashMap<String, KeyCycleOscillator> map6 = this.mCycleMap;
        KeyCycleOscillator keyCycleOscillator = map6 == null ? null : map6.get("translationX");
        HashMap<String, KeyCycleOscillator> map7 = this.mCycleMap;
        KeyCycleOscillator keyCycleOscillator2 = map7 == null ? null : map7.get("translationY");
        HashMap<String, KeyCycleOscillator> map8 = this.mCycleMap;
        KeyCycleOscillator keyCycleOscillator3 = map8 == null ? null : map8.get("rotation");
        HashMap<String, KeyCycleOscillator> map9 = this.mCycleMap;
        KeyCycleOscillator keyCycleOscillator4 = map9 == null ? null : map9.get("scaleX");
        HashMap<String, KeyCycleOscillator> map10 = this.mCycleMap;
        KeyCycleOscillator keyCycleOscillator5 = map10 != null ? map10.get("scaleY") : null;
        VelocityMatrix velocityMatrix = new VelocityMatrix();
        velocityMatrix.clear();
        velocityMatrix.setRotationVelocity(splineSet3, adjustedPosition);
        velocityMatrix.setTranslationVelocity(splineSet, splineSet2, adjustedPosition);
        velocityMatrix.setScaleVelocity(splineSet4, splineSet5, adjustedPosition);
        velocityMatrix.setRotationVelocity(keyCycleOscillator3, adjustedPosition);
        velocityMatrix.setTranslationVelocity(keyCycleOscillator, keyCycleOscillator2, adjustedPosition);
        velocityMatrix.setScaleVelocity(keyCycleOscillator4, keyCycleOscillator5, adjustedPosition);
        CurveFit curveFit = this.mArcSpline;
        if (curveFit != null) {
            double[] dArr = this.mInterpolateData;
            if (dArr.length > 0) {
                double d = adjustedPosition;
                curveFit.getPos(d, dArr);
                this.mArcSpline.getSlope(d, this.mInterpolateVelocity);
                this.mStartMotionPath.setDpDt(f2, f3, fArr, this.mInterpolateVariables, this.mInterpolateVelocity, this.mInterpolateData);
            }
            velocityMatrix.applyTransform(f2, f3, i, i2, fArr);
            return;
        }
        int i3 = 0;
        if (this.mSpline == null) {
            MotionPaths motionPaths = this.mEndMotionPath;
            float f4 = motionPaths.f10080x;
            MotionPaths motionPaths2 = this.mStartMotionPath;
            float f5 = f4 - motionPaths2.f10080x;
            KeyCycleOscillator keyCycleOscillator6 = keyCycleOscillator5;
            float f6 = motionPaths.f10081y - motionPaths2.f10081y;
            KeyCycleOscillator keyCycleOscillator7 = keyCycleOscillator4;
            float f7 = motionPaths.width - motionPaths2.width;
            float f8 = (motionPaths.height - motionPaths2.height) + f6;
            fArr[0] = ((f7 + f5) * f2) + ((1.0f - f2) * f5);
            fArr[1] = (f8 * f3) + ((1.0f - f3) * f6);
            velocityMatrix.clear();
            velocityMatrix.setRotationVelocity(splineSet3, adjustedPosition);
            velocityMatrix.setTranslationVelocity(splineSet, splineSet2, adjustedPosition);
            velocityMatrix.setScaleVelocity(splineSet4, splineSet5, adjustedPosition);
            velocityMatrix.setRotationVelocity(keyCycleOscillator3, adjustedPosition);
            velocityMatrix.setTranslationVelocity(keyCycleOscillator, keyCycleOscillator2, adjustedPosition);
            velocityMatrix.setScaleVelocity(keyCycleOscillator7, keyCycleOscillator6, adjustedPosition);
            velocityMatrix.applyTransform(f2, f3, i, i2, fArr);
            return;
        }
        double adjustedPosition2 = getAdjustedPosition(adjustedPosition, this.mVelocity);
        this.mSpline[0].getSlope(adjustedPosition2, this.mInterpolateVelocity);
        this.mSpline[0].getPos(adjustedPosition2, this.mInterpolateData);
        float f9 = this.mVelocity[0];
        while (true) {
            double[] dArr2 = this.mInterpolateVelocity;
            if (i3 >= dArr2.length) {
                this.mStartMotionPath.setDpDt(f2, f3, fArr, this.mInterpolateVariables, dArr2, this.mInterpolateData);
                velocityMatrix.applyTransform(f2, f3, i, i2, fArr);
                return;
            } else {
                double d2 = dArr2[i3];
                double d3 = f9;
                Double.isNaN(d3);
                dArr2[i3] = d2 * d3;
                i3++;
            }
        }
    }

    public float getStartX() {
        return this.mStartMotionPath.f10080x;
    }

    public float getStartY() {
        return this.mStartMotionPath.f10081y;
    }

    public int getkeyFramePositions(int[] iArr, float[] fArr) {
        int i = 0;
        int i2 = 0;
        for (Key key : this.mKeyList) {
            int i3 = key.mFramePosition;
            iArr[i] = (key.mType * 1000) + i3;
            this.mSpline[0].getPos(i3 / 100.0f, this.mInterpolateData);
            this.mStartMotionPath.getCenter(this.mInterpolateVariables, this.mInterpolateData, fArr, i2);
            i2 += 2;
            i++;
        }
        return i;
    }

    public boolean interpolate(View view, float f, long j, KeyCache keyCache) {
        TimeCycleSplineSet.PathRotate pathRotate;
        boolean pathRotate2;
        float adjustedPosition = getAdjustedPosition(f, null);
        HashMap<String, SplineSet> map = this.mAttributesMap;
        if (map != null) {
            Iterator<SplineSet> it = map.values().iterator();
            while (it.hasNext()) {
                it.next().setProperty(view, adjustedPosition);
            }
        }
        HashMap<String, TimeCycleSplineSet> map2 = this.mTimeCycleAttributesMap;
        if (map2 != null) {
            pathRotate = null;
            boolean property = false;
            for (TimeCycleSplineSet timeCycleSplineSet : map2.values()) {
                if (timeCycleSplineSet instanceof TimeCycleSplineSet.PathRotate) {
                    pathRotate = (TimeCycleSplineSet.PathRotate) timeCycleSplineSet;
                } else {
                    property |= timeCycleSplineSet.setProperty(view, adjustedPosition, j, keyCache);
                }
            }
            pathRotate2 = property;
        } else {
            pathRotate = null;
            pathRotate2 = false;
        }
        CurveFit[] curveFitArr = this.mSpline;
        if (curveFitArr != null) {
            double d = adjustedPosition;
            curveFitArr[0].getPos(d, this.mInterpolateData);
            this.mSpline[0].getSlope(d, this.mInterpolateVelocity);
            CurveFit curveFit = this.mArcSpline;
            if (curveFit != null) {
                double[] dArr = this.mInterpolateData;
                if (dArr.length > 0) {
                    curveFit.getPos(d, dArr);
                    this.mArcSpline.getSlope(d, this.mInterpolateVelocity);
                }
            }
            this.mStartMotionPath.setView(view, this.mInterpolateVariables, this.mInterpolateData, this.mInterpolateVelocity, null);
            HashMap<String, SplineSet> map3 = this.mAttributesMap;
            if (map3 != null) {
                for (SplineSet splineSet : map3.values()) {
                    if (splineSet instanceof SplineSet.PathRotate) {
                        double[] dArr2 = this.mInterpolateVelocity;
                        ((SplineSet.PathRotate) splineSet).setPathRotate(view, adjustedPosition, dArr2[0], dArr2[1]);
                    }
                }
            }
            if (pathRotate != null) {
                double[] dArr3 = this.mInterpolateVelocity;
                pathRotate2 |= pathRotate.setPathRotate(view, keyCache, adjustedPosition, j, dArr3[0], dArr3[1]);
            }
            int i = 1;
            while (true) {
                CurveFit[] curveFitArr2 = this.mSpline;
                if (i >= curveFitArr2.length) {
                    break;
                }
                curveFitArr2[i].getPos(d, this.mValuesBuff);
                this.mStartMotionPath.attributes.get(this.mAttributeNames[i - 1]).setInterpolatedValue(view, this.mValuesBuff);
                i++;
            }
            MotionConstrainedPoint motionConstrainedPoint = this.mStartPoint;
            if (motionConstrainedPoint.mVisibilityMode == 0) {
                if (adjustedPosition <= 0.0f) {
                    view.setVisibility(motionConstrainedPoint.visibility);
                } else if (adjustedPosition >= 1.0f) {
                    motionConstrainedPoint = this.mEndPoint;
                    view.setVisibility(motionConstrainedPoint.visibility);
                } else if (this.mEndPoint.visibility != motionConstrainedPoint.visibility) {
                    view.setVisibility(0);
                }
            }
            if (this.mKeyTriggers != null) {
                int i2 = 0;
                while (true) {
                    KeyTrigger[] keyTriggerArr = this.mKeyTriggers;
                    if (i2 >= keyTriggerArr.length) {
                        break;
                    }
                    keyTriggerArr[i2].conditionallyFire(adjustedPosition, view);
                    i2++;
                }
            }
        } else {
            MotionPaths motionPaths = this.mStartMotionPath;
            float f2 = motionPaths.f10080x;
            MotionPaths motionPaths2 = this.mEndMotionPath;
            float fM1419a = C0245Dg.m1419a(motionPaths2.f10080x, f2, adjustedPosition, f2);
            float f3 = motionPaths.f10081y;
            float fM1419a2 = C0245Dg.m1419a(motionPaths2.f10081y, f3, adjustedPosition, f3);
            float f4 = motionPaths.width;
            float f5 = motionPaths2.width;
            float fM1419a3 = C0245Dg.m1419a(f5, f4, adjustedPosition, f4);
            float f6 = motionPaths.height;
            float f7 = motionPaths2.height;
            float f8 = fM1419a + 0.5f;
            int i3 = (int) f8;
            float f9 = fM1419a2 + 0.5f;
            int i4 = (int) f9;
            int i5 = (int) (f8 + fM1419a3);
            int iM1419a = (int) (f9 + C0245Dg.m1419a(f7, f6, adjustedPosition, f6));
            int i6 = i5 - i3;
            int i7 = iM1419a - i4;
            if (f5 != f4 || f7 != f6) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), View.MeasureSpec.makeMeasureSpec(i7, 1073741824));
            }
            view.layout(i3, i4, i5, iM1419a);
        }
        HashMap<String, KeyCycleOscillator> map4 = this.mCycleMap;
        if (map4 != null) {
            for (KeyCycleOscillator keyCycleOscillator : map4.values()) {
                if (keyCycleOscillator instanceof KeyCycleOscillator.PathRotateSet) {
                    double[] dArr4 = this.mInterpolateVelocity;
                    ((KeyCycleOscillator.PathRotateSet) keyCycleOscillator).setPathRotate(view, adjustedPosition, dArr4[0], dArr4[1]);
                } else {
                    keyCycleOscillator.setProperty(view, adjustedPosition);
                }
            }
        }
        return pathRotate2;
    }

    public String name() {
        return this.mView.getContext().getResources().getResourceEntryName(this.mView.getId());
    }

    public void positionKeyframe(View view, KeyPositionBase keyPositionBase, float f, float f2, String[] strArr, float[] fArr) {
        RectF rectF = new RectF();
        MotionPaths motionPaths = this.mStartMotionPath;
        float f3 = motionPaths.f10080x;
        rectF.left = f3;
        float f4 = motionPaths.f10081y;
        rectF.top = f4;
        rectF.right = f3 + motionPaths.width;
        rectF.bottom = f4 + motionPaths.height;
        RectF rectF2 = new RectF();
        MotionPaths motionPaths2 = this.mEndMotionPath;
        float f5 = motionPaths2.f10080x;
        rectF2.left = f5;
        float f6 = motionPaths2.f10081y;
        rectF2.top = f6;
        rectF2.right = f5 + motionPaths2.width;
        rectF2.bottom = f6 + motionPaths2.height;
        keyPositionBase.positionAttributes(view, rectF, rectF2, f, f2, strArr, fArr);
    }

    public void setDrawPath(int i) {
        this.mStartMotionPath.mDrawPath = i;
    }

    public void setEndState(ConstraintWidget constraintWidget, ConstraintSet constraintSet) {
        MotionPaths motionPaths = this.mEndMotionPath;
        motionPaths.time = 1.0f;
        motionPaths.position = 1.0f;
        readView(motionPaths);
        this.mEndMotionPath.setBounds(constraintWidget.getX(), constraintWidget.getY(), constraintWidget.getWidth(), constraintWidget.getHeight());
        this.mEndMotionPath.applyParameters(constraintSet.getParameters(this.mId));
        this.mEndPoint.setState(constraintWidget, constraintSet, this.mId);
    }

    public void setPathMotionArc(int i) {
        this.mPathMotionArc = i;
    }

    public void setStartCurrentState(View view) {
        MotionPaths motionPaths = this.mStartMotionPath;
        motionPaths.time = 0.0f;
        motionPaths.position = 0.0f;
        motionPaths.setBounds(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.mStartPoint.setState(view);
    }

    public void setStartState(ConstraintWidget constraintWidget, ConstraintSet constraintSet) {
        MotionPaths motionPaths = this.mStartMotionPath;
        motionPaths.time = 0.0f;
        motionPaths.position = 0.0f;
        readView(motionPaths);
        this.mStartMotionPath.setBounds(constraintWidget.getX(), constraintWidget.getY(), constraintWidget.getWidth(), constraintWidget.getHeight());
        ConstraintSet.Constraint parameters = constraintSet.getParameters(this.mId);
        this.mStartMotionPath.applyParameters(parameters);
        this.mMotionStagger = parameters.motion.mMotionStagger;
        this.mStartPoint.setState(constraintWidget, constraintSet, this.mId);
    }

    public void setView(View view) {
        this.mView = view;
        this.mId = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            this.mConstraintTag = ((ConstraintLayout.LayoutParams) layoutParams).getConstraintTag();
        }
    }

    public void setup(int i, int i2, float f, long j) {
        ArrayList arrayList;
        String[] strArr;
        TimeCycleSplineSet timeCycleSplineSetMakeSpline;
        ConstraintAttribute constraintAttribute;
        SplineSet splineSetMakeSpline;
        ConstraintAttribute constraintAttribute2;
        new HashSet();
        HashSet<String> hashSet = new HashSet<>();
        HashSet<String> hashSet2 = new HashSet<>();
        HashSet<String> hashSet3 = new HashSet<>();
        HashMap<String, Integer> map = new HashMap<>();
        int i3 = this.mPathMotionArc;
        if (i3 != Key.UNSET) {
            this.mStartMotionPath.mPathMotionArc = i3;
        }
        this.mStartPoint.different(this.mEndPoint, hashSet2);
        ArrayList<Key> arrayList2 = this.mKeyList;
        if (arrayList2 != null) {
            arrayList = null;
            for (Key key : arrayList2) {
                if (key instanceof KeyPosition) {
                    KeyPosition keyPosition = (KeyPosition) key;
                    insertKey(new MotionPaths(i, i2, keyPosition, this.mStartMotionPath, this.mEndMotionPath));
                    int i4 = keyPosition.mCurveFit;
                    if (i4 != Key.UNSET) {
                        this.mCurveFitType = i4;
                    }
                } else if (key instanceof KeyCycle) {
                    key.getAttributeNames(hashSet3);
                } else if (key instanceof KeyTimeCycle) {
                    key.getAttributeNames(hashSet);
                } else if (key instanceof KeyTrigger) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((KeyTrigger) key);
                } else {
                    key.setInterpolation(map);
                    key.getAttributeNames(hashSet2);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            this.mKeyTriggers = (KeyTrigger[]) arrayList.toArray(new KeyTrigger[0]);
        }
        char c = 1;
        if (!hashSet2.isEmpty()) {
            this.mAttributesMap = new HashMap<>();
            for (String str : hashSet2) {
                if (str.startsWith("CUSTOM,")) {
                    SparseArray sparseArray = new SparseArray();
                    String str2 = str.split(C1262Tc.f3278g)[1];
                    for (Key key2 : this.mKeyList) {
                        HashMap<String, ConstraintAttribute> map2 = key2.mCustomConstraints;
                        if (map2 != null && (constraintAttribute2 = map2.get(str2)) != null) {
                            sparseArray.append(key2.mFramePosition, constraintAttribute2);
                        }
                    }
                    splineSetMakeSpline = SplineSet.makeCustomSpline(str, sparseArray);
                } else {
                    splineSetMakeSpline = SplineSet.makeSpline(str);
                }
                if (splineSetMakeSpline != null) {
                    splineSetMakeSpline.setType(str);
                    this.mAttributesMap.put(str, splineSetMakeSpline);
                }
            }
            ArrayList<Key> arrayList3 = this.mKeyList;
            if (arrayList3 != null) {
                for (Key key3 : arrayList3) {
                    if (key3 instanceof KeyAttributes) {
                        key3.addValues(this.mAttributesMap);
                    }
                }
            }
            this.mStartPoint.addValues(this.mAttributesMap, 0);
            this.mEndPoint.addValues(this.mAttributesMap, 100);
            for (String str3 : this.mAttributesMap.keySet()) {
                this.mAttributesMap.get(str3).setup(map.containsKey(str3) ? map.get(str3).intValue() : 0);
            }
        }
        if (!hashSet.isEmpty()) {
            if (this.mTimeCycleAttributesMap == null) {
                this.mTimeCycleAttributesMap = new HashMap<>();
            }
            for (String str4 : hashSet) {
                if (!this.mTimeCycleAttributesMap.containsKey(str4)) {
                    if (str4.startsWith("CUSTOM,")) {
                        SparseArray sparseArray2 = new SparseArray();
                        String str5 = str4.split(C1262Tc.f3278g)[1];
                        for (Key key4 : this.mKeyList) {
                            HashMap<String, ConstraintAttribute> map3 = key4.mCustomConstraints;
                            if (map3 != null && (constraintAttribute = map3.get(str5)) != null) {
                                sparseArray2.append(key4.mFramePosition, constraintAttribute);
                            }
                        }
                        timeCycleSplineSetMakeSpline = TimeCycleSplineSet.makeCustomSpline(str4, sparseArray2);
                    } else {
                        timeCycleSplineSetMakeSpline = TimeCycleSplineSet.makeSpline(str4, j);
                    }
                    if (timeCycleSplineSetMakeSpline != null) {
                        timeCycleSplineSetMakeSpline.setType(str4);
                        this.mTimeCycleAttributesMap.put(str4, timeCycleSplineSetMakeSpline);
                    }
                }
            }
            ArrayList<Key> arrayList4 = this.mKeyList;
            if (arrayList4 != null) {
                for (Key key5 : arrayList4) {
                    if (key5 instanceof KeyTimeCycle) {
                        ((KeyTimeCycle) key5).addTimeValues(this.mTimeCycleAttributesMap);
                    }
                }
            }
            for (String str6 : this.mTimeCycleAttributesMap.keySet()) {
                this.mTimeCycleAttributesMap.get(str6).setup(map.containsKey(str6) ? map.get(str6).intValue() : 0);
            }
        }
        int size = this.mMotionPaths.size();
        int i5 = size + 2;
        MotionPaths[] motionPathsArr = new MotionPaths[i5];
        motionPathsArr[0] = this.mStartMotionPath;
        motionPathsArr[size + 1] = this.mEndMotionPath;
        if (this.mMotionPaths.size() > 0 && this.mCurveFitType == -1) {
            this.mCurveFitType = 0;
        }
        Iterator<MotionPaths> it = this.mMotionPaths.iterator();
        int i6 = 1;
        while (it.hasNext()) {
            motionPathsArr[i6] = it.next();
            i6++;
        }
        HashSet hashSet4 = new HashSet();
        for (String str7 : this.mEndMotionPath.attributes.keySet()) {
            if (this.mStartMotionPath.attributes.containsKey(str7)) {
                if (!hashSet2.contains("CUSTOM," + str7)) {
                    hashSet4.add(str7);
                }
            }
        }
        String[] strArr2 = (String[]) hashSet4.toArray(new String[0]);
        this.mAttributeNames = strArr2;
        this.mAttributeInterpCount = new int[strArr2.length];
        int i7 = 0;
        while (true) {
            strArr = this.mAttributeNames;
            if (i7 >= strArr.length) {
                break;
            }
            String str8 = strArr[i7];
            this.mAttributeInterpCount[i7] = 0;
            for (int i8 = 0; i8 < i5; i8++) {
                if (motionPathsArr[i8].attributes.containsKey(str8)) {
                    int[] iArr = this.mAttributeInterpCount;
                    iArr[i7] = motionPathsArr[i8].attributes.get(str8).noOfInterpValues() + iArr[i7];
                    break;
                }
            }
            i7++;
        }
        boolean z = motionPathsArr[0].mPathMotionArc != Key.UNSET;
        int length = 18 + strArr.length;
        boolean[] zArr = new boolean[length];
        for (int i9 = 1; i9 < i5; i9++) {
            motionPathsArr[i9].different(motionPathsArr[i9 - 1], zArr, this.mAttributeNames, z);
        }
        int i10 = 0;
        for (int i11 = 1; i11 < length; i11++) {
            if (zArr[i11]) {
                i10++;
            }
        }
        int[] iArr2 = new int[i10];
        this.mInterpolateVariables = iArr2;
        this.mInterpolateData = new double[iArr2.length];
        this.mInterpolateVelocity = new double[iArr2.length];
        int i12 = 0;
        for (int i13 = 1; i13 < length; i13++) {
            if (zArr[i13]) {
                this.mInterpolateVariables[i12] = i13;
                i12++;
            }
        }
        int i14 = 2;
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i5, this.mInterpolateVariables.length);
        double[] dArr2 = new double[i5];
        for (int i15 = 0; i15 < i5; i15++) {
            motionPathsArr[i15].fillStandard(dArr[i15], this.mInterpolateVariables);
            dArr2[i15] = motionPathsArr[i15].time;
        }
        int i16 = 0;
        while (true) {
            int[] iArr3 = this.mInterpolateVariables;
            if (i16 >= iArr3.length) {
                break;
            }
            if (iArr3[i16] < MotionPaths.names.length) {
                String strM3668a = C0786MA.m3668a(new StringBuilder(), MotionPaths.names[this.mInterpolateVariables[i16]], " [");
                for (int i17 = 0; i17 < i5; i17++) {
                    StringBuilder sbM1657a = C0305Ec.m1657a(strM3668a);
                    sbM1657a.append(dArr[i17][i16]);
                    strM3668a = sbM1657a.toString();
                }
            }
            i16++;
        }
        this.mSpline = new CurveFit[this.mAttributeNames.length + 1];
        int i18 = 0;
        while (true) {
            String[] strArr3 = this.mAttributeNames;
            if (i18 >= strArr3.length) {
                break;
            }
            String str9 = strArr3[i18];
            int i19 = 0;
            double[] dArr3 = null;
            int i20 = 0;
            double[][] dArr4 = null;
            while (i19 < i5) {
                if (motionPathsArr[i19].hasCustomData(str9)) {
                    if (dArr4 == null) {
                        dArr3 = new double[i5];
                        int[] iArr4 = new int[i14];
                        iArr4[c] = motionPathsArr[i19].getCustomDataCount(str9);
                        iArr4[0] = i5;
                        dArr4 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, iArr4);
                    }
                    MotionPaths motionPaths = motionPathsArr[i19];
                    dArr3[i20] = motionPaths.time;
                    motionPaths.getCustomData(str9, dArr4[i20], 0);
                    i20++;
                }
                i19++;
                hashSet3 = hashSet3;
                i14 = 2;
                c = 1;
            }
            i18++;
            this.mSpline[i18] = CurveFit.get(this.mCurveFitType, Arrays.copyOf(dArr3, i20), (double[][]) Arrays.copyOf(dArr4, i20));
            hashSet3 = hashSet3;
            i14 = 2;
            c = 1;
        }
        HashSet<String> hashSet5 = hashSet3;
        this.mSpline[0] = CurveFit.get(this.mCurveFitType, dArr2, dArr);
        if (motionPathsArr[0].mPathMotionArc != Key.UNSET) {
            int[] iArr5 = new int[i5];
            double[] dArr5 = new double[i5];
            double[][] dArr6 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i5, 2);
            for (int i21 = 0; i21 < i5; i21++) {
                MotionPaths motionPaths2 = motionPathsArr[i21];
                iArr5[i21] = motionPaths2.mPathMotionArc;
                dArr5[i21] = motionPaths2.time;
                double[] dArr7 = dArr6[i21];
                dArr7[0] = motionPaths2.f10080x;
                dArr7[1] = motionPaths2.f10081y;
            }
            this.mArcSpline = CurveFit.getArc(iArr5, dArr5, dArr6);
        }
        this.mCycleMap = new HashMap<>();
        if (this.mKeyList != null) {
            float preCycleDistance = Float.NaN;
            for (String str10 : hashSet5) {
                KeyCycleOscillator keyCycleOscillatorMakeSpline = KeyCycleOscillator.makeSpline(str10);
                if (keyCycleOscillatorMakeSpline != null) {
                    if (keyCycleOscillatorMakeSpline.variesByPath() && Float.isNaN(preCycleDistance)) {
                        preCycleDistance = getPreCycleDistance();
                    }
                    keyCycleOscillatorMakeSpline.setType(str10);
                    this.mCycleMap.put(str10, keyCycleOscillatorMakeSpline);
                }
            }
            for (Key key6 : this.mKeyList) {
                if (key6 instanceof KeyCycle) {
                    ((KeyCycle) key6).addCycleValues(this.mCycleMap);
                }
            }
            Iterator<KeyCycleOscillator> it2 = this.mCycleMap.values().iterator();
            while (it2.hasNext()) {
                it2.next().setup(preCycleDistance);
            }
        }
    }

    public String toString() {
        return " start: x: " + this.mStartMotionPath.f10080x + " y: " + this.mStartMotionPath.f10081y + " end: x: " + this.mEndMotionPath.f10080x + " y: " + this.mEndMotionPath.f10081y;
    }
}
