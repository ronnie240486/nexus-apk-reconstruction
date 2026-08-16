package androidx.constraintlayout.motion.widget;

import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.utils.CurveFit;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import org.dom4j.p020io.SAXEventRecorder;
import p000.C0832Mu;
import p000.C0835Mx;
import p000.C1262Tc;
import p000.C5144ou;

/* JADX INFO: loaded from: classes.dex */
public abstract class TimeCycleSplineSet {
    private static final int CURVE_OFFSET = 2;
    private static final int CURVE_PERIOD = 1;
    private static final int CURVE_VALUE = 0;
    private static final String TAG = "SplineSet";
    private static float VAL_2PI = 6.2831855f;
    private int count;
    long last_time;
    protected CurveFit mCurveFit;
    private String mType;
    protected int mWaveShape = 0;
    protected int[] mTimePoints = new int[10];
    protected float[][] mValues = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 10, 3);
    private float[] mCache = new float[3];
    protected boolean mContinue = false;
    float last_cycle = Float.NaN;

    public static class AlphaSet extends TimeCycleSplineSet {
        @Override // androidx.constraintlayout.motion.widget.TimeCycleSplineSet
        public boolean setProperty(View view, float f, long j, KeyCache keyCache) {
            view.setAlpha(get(f, j, view, keyCache));
            return this.mContinue;
        }
    }

    public static class CustomSet extends TimeCycleSplineSet {
        String mAttributeName;
        float[] mCache;
        SparseArray<ConstraintAttribute> mConstraintAttributeList;
        float[] mTempValues;
        SparseArray<float[]> mWaveProperties = new SparseArray<>();

        public CustomSet(String str, SparseArray<ConstraintAttribute> sparseArray) {
            this.mAttributeName = str.split(C1262Tc.f3278g)[1];
            this.mConstraintAttributeList = sparseArray;
        }

        @Override // androidx.constraintlayout.motion.widget.TimeCycleSplineSet
        public void setPoint(int i, float f, float f2, int i2, float f3) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        @Override // androidx.constraintlayout.motion.widget.TimeCycleSplineSet
        public boolean setProperty(View view, float f, long j, KeyCache keyCache) {
            this.mCurveFit.getPos(f, this.mTempValues);
            float[] fArr = this.mTempValues;
            float f2 = fArr[fArr.length - 2];
            float f3 = fArr[fArr.length - 1];
            long j2 = j - this.last_time;
            double d = this.last_cycle;
            double d2 = j2;
            Double.isNaN(d2);
            double d3 = f2;
            Double.isNaN(d3);
            Double.isNaN(d);
            float f4 = (float) ((((d2 * 1.0E-9d) * d3) + d) % 1.0d);
            this.last_cycle = f4;
            this.last_time = j;
            float fCalcWave = calcWave(f4);
            this.mContinue = false;
            int i = 0;
            while (true) {
                float[] fArr2 = this.mCache;
                if (i >= fArr2.length) {
                    break;
                }
                boolean z = this.mContinue;
                float f5 = this.mTempValues[i];
                this.mContinue = z | (((double) f5) != 0.0d);
                fArr2[i] = (f5 * fCalcWave) + f3;
                i++;
            }
            this.mConstraintAttributeList.valueAt(0).setInterpolatedValue(view, this.mCache);
            if (f2 != 0.0f) {
                this.mContinue = true;
            }
            return this.mContinue;
        }

        @Override // androidx.constraintlayout.motion.widget.TimeCycleSplineSet
        public void setup(int i) {
            int size = this.mConstraintAttributeList.size();
            int iNoOfInterpValues = this.mConstraintAttributeList.valueAt(0).noOfInterpValues();
            double[] dArr = new double[size];
            int i2 = iNoOfInterpValues + 2;
            this.mTempValues = new float[i2];
            this.mCache = new float[iNoOfInterpValues];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i2);
            for (int i3 = 0; i3 < size; i3++) {
                int iKeyAt = this.mConstraintAttributeList.keyAt(i3);
                ConstraintAttribute constraintAttributeValueAt = this.mConstraintAttributeList.valueAt(i3);
                float[] fArrValueAt = this.mWaveProperties.valueAt(i3);
                double d = iKeyAt;
                Double.isNaN(d);
                dArr[i3] = d * 0.01d;
                constraintAttributeValueAt.getValuesToInterpolate(this.mTempValues);
                int i4 = 0;
                while (true) {
                    float[] fArr = this.mTempValues;
                    if (i4 < fArr.length) {
                        dArr2[i3][i4] = fArr[i4];
                        i4++;
                    }
                }
                double[] dArr3 = dArr2[i3];
                dArr3[iNoOfInterpValues] = fArrValueAt[0];
                dArr3[iNoOfInterpValues + 1] = fArrValueAt[1];
            }
            this.mCurveFit = CurveFit.get(i, dArr, dArr2);
        }

        public void setPoint(int i, ConstraintAttribute constraintAttribute, float f, int i2, float f2) {
            this.mConstraintAttributeList.append(i, constraintAttribute);
            this.mWaveProperties.append(i, new float[]{f, f2});
            this.mWaveShape = Math.max(this.mWaveShape, i2);
        }
    }

    public static class ElevationSet extends TimeCycleSplineSet {
        @Override // androidx.constraintlayout.motion.widget.TimeCycleSplineSet
        public boolean setProperty(View view, float f, long j, KeyCache keyCache) {
            if (Build.VERSION.SDK_INT >= 21) {
                C5144ou.m27336a(view, get(f, j, view, keyCache));
            }
            return this.mContinue;
        }
    }

    public static class PathRotate extends TimeCycleSplineSet {
        public boolean setPathRotate(View view, KeyCache keyCache, float f, long j, double d, double d2) {
            view.setRotation(get(f, j, view, keyCache) + ((float) Math.toDegrees(Math.atan2(d2, d))));
            return this.mContinue;
        }

        @Override // androidx.constraintlayout.motion.widget.TimeCycleSplineSet
        public boolean setProperty(View view, float f, long j, KeyCache keyCache) {
            return this.mContinue;
        }
    }

    public static class ProgressSet extends TimeCycleSplineSet {
        boolean mNoMethod = false;

        @Override // androidx.constraintlayout.motion.widget.TimeCycleSplineSet
        public boolean setProperty(View view, float f, long j, KeyCache keyCache) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(get(f, j, view, keyCache));
            } else {
                if (this.mNoMethod) {
                    return false;
                }
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.mNoMethod = true;
                    method = null;
                }
                Method method2 = method;
                if (method2 != null) {
                    try {
                        method2.invoke(view, Float.valueOf(get(f, j, view, keyCache)));
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        Log.e(TimeCycleSplineSet.TAG, "unable to setProgress", e);
                    }
                }
            }
            return this.mContinue;
        }
    }

    public static class RotationSet extends TimeCycleSplineSet {
        @Override // androidx.constraintlayout.motion.widget.TimeCycleSplineSet
        public boolean setProperty(View view, float f, long j, KeyCache keyCache) {
            view.setRotation(get(f, j, view, keyCache));
            return this.mContinue;
        }
    }

    public static class RotationXset extends TimeCycleSplineSet {
        @Override // androidx.constraintlayout.motion.widget.TimeCycleSplineSet
        public boolean setProperty(View view, float f, long j, KeyCache keyCache) {
            view.setRotationX(get(f, j, view, keyCache));
            return this.mContinue;
        }
    }

    public static class RotationYset extends TimeCycleSplineSet {
        @Override // androidx.constraintlayout.motion.widget.TimeCycleSplineSet
        public boolean setProperty(View view, float f, long j, KeyCache keyCache) {
            view.setRotationY(get(f, j, view, keyCache));
            return this.mContinue;
        }
    }

    public static class ScaleXset extends TimeCycleSplineSet {
        @Override // androidx.constraintlayout.motion.widget.TimeCycleSplineSet
        public boolean setProperty(View view, float f, long j, KeyCache keyCache) {
            view.setScaleX(get(f, j, view, keyCache));
            return this.mContinue;
        }
    }

    public static class ScaleYset extends TimeCycleSplineSet {
        @Override // androidx.constraintlayout.motion.widget.TimeCycleSplineSet
        public boolean setProperty(View view, float f, long j, KeyCache keyCache) {
            view.setScaleY(get(f, j, view, keyCache));
            return this.mContinue;
        }
    }

    public static class Sort {
        private Sort() {
        }

        public static void doubleQuickSort(int[] iArr, float[][] fArr, int i, int i2) {
            int[] iArr2 = new int[iArr.length + 10];
            iArr2[0] = i2;
            iArr2[1] = i;
            int i3 = 2;
            while (i3 > 0) {
                int i4 = iArr2[i3 - 1];
                int i5 = i3 - 2;
                int i6 = iArr2[i5];
                if (i4 < i6) {
                    int iPartition = partition(iArr, fArr, i4, i6);
                    iArr2[i5] = iPartition - 1;
                    iArr2[i3 - 1] = i4;
                    int i7 = i3 + 1;
                    iArr2[i3] = i6;
                    i3 += 2;
                    iArr2[i7] = iPartition + 1;
                } else {
                    i3 = i5;
                }
            }
        }

        private static int partition(int[] iArr, float[][] fArr, int i, int i2) {
            int i3 = iArr[i2];
            int i4 = i;
            while (i < i2) {
                if (iArr[i] <= i3) {
                    swap(iArr, fArr, i4, i);
                    i4++;
                }
                i++;
            }
            swap(iArr, fArr, i4, i2);
            return i4;
        }

        private static void swap(int[] iArr, float[][] fArr, int i, int i2) {
            int i3 = iArr[i];
            iArr[i] = iArr[i2];
            iArr[i2] = i3;
            float[] fArr2 = fArr[i];
            fArr[i] = fArr[i2];
            fArr[i2] = fArr2;
        }
    }

    public static class TranslationXset extends TimeCycleSplineSet {
        @Override // androidx.constraintlayout.motion.widget.TimeCycleSplineSet
        public boolean setProperty(View view, float f, long j, KeyCache keyCache) {
            view.setTranslationX(get(f, j, view, keyCache));
            return this.mContinue;
        }
    }

    public static class TranslationYset extends TimeCycleSplineSet {
        @Override // androidx.constraintlayout.motion.widget.TimeCycleSplineSet
        public boolean setProperty(View view, float f, long j, KeyCache keyCache) {
            view.setTranslationY(get(f, j, view, keyCache));
            return this.mContinue;
        }
    }

    public static class TranslationZset extends TimeCycleSplineSet {
        @Override // androidx.constraintlayout.motion.widget.TimeCycleSplineSet
        public boolean setProperty(View view, float f, long j, KeyCache keyCache) {
            if (Build.VERSION.SDK_INT >= 21) {
                C0832Mu.m3895a(view, get(f, j, view, keyCache));
            }
            return this.mContinue;
        }
    }

    public static TimeCycleSplineSet makeCustomSpline(String str, SparseArray<ConstraintAttribute> sparseArray) {
        return new CustomSet(str, sparseArray);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static TimeCycleSplineSet makeSpline(String str, long j) {
        TimeCycleSplineSet rotationXset;
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -1249320806:
                if (str.equals("rotationX")) {
                    b = 0;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    b = 1;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    b = 2;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    b = 3;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    b = 4;
                }
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    b = 5;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    b = 6;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    b = 7;
                }
                break;
            case -40300674:
                if (str.equals("rotation")) {
                    b = 8;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    b = 9;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    b = 10;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    b = SAXEventRecorder.SAXEvent.f16645n;
                }
                break;
        }
        switch (b) {
            case 0:
                rotationXset = new RotationXset();
                break;
            case 1:
                rotationXset = new RotationYset();
                break;
            case 2:
                rotationXset = new TranslationXset();
                break;
            case 3:
                rotationXset = new TranslationYset();
                break;
            case 4:
                rotationXset = new TranslationZset();
                break;
            case 5:
                rotationXset = new ProgressSet();
                break;
            case 6:
                rotationXset = new ScaleXset();
                break;
            case 7:
                rotationXset = new ScaleYset();
                break;
            case 8:
                rotationXset = new RotationSet();
                break;
            case 9:
                rotationXset = new ElevationSet();
                break;
            case 10:
                rotationXset = new PathRotate();
                break;
            case 11:
                rotationXset = new AlphaSet();
                break;
            default:
                return null;
        }
        rotationXset.setStartTime(j);
        return rotationXset;
    }

    public float calcWave(float f) {
        float fAbs;
        switch (this.mWaveShape) {
            case 1:
                return Math.signum(f * VAL_2PI);
            case 2:
                fAbs = Math.abs(f);
                break;
            case 3:
                return (((f * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                fAbs = ((f * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos(f * VAL_2PI);
            case 6:
                float fAbs2 = 1.0f - Math.abs(((f * 4.0f) % 4.0f) - 2.0f);
                fAbs = fAbs2 * fAbs2;
                break;
            default:
                return (float) Math.sin(f * VAL_2PI);
        }
        return 1.0f - fAbs;
    }

    public float get(float f, long j, View view, KeyCache keyCache) {
        this.mCurveFit.getPos(f, this.mCache);
        float[] fArr = this.mCache;
        boolean z = true;
        float f2 = fArr[1];
        if (f2 == 0.0f) {
            this.mContinue = false;
            return fArr[2];
        }
        if (Float.isNaN(this.last_cycle)) {
            float floatValue = keyCache.getFloatValue(view, this.mType, 0);
            this.last_cycle = floatValue;
            if (Float.isNaN(floatValue)) {
                this.last_cycle = 0.0f;
            }
        }
        long j2 = j - this.last_time;
        double d = this.last_cycle;
        double d2 = j2;
        Double.isNaN(d2);
        double d3 = f2;
        Double.isNaN(d3);
        Double.isNaN(d);
        float f3 = (float) ((((d2 * 1.0E-9d) * d3) + d) % 1.0d);
        this.last_cycle = f3;
        keyCache.setFloatValue(view, this.mType, 0, f3);
        this.last_time = j;
        float f4 = this.mCache[0];
        float fCalcWave = (calcWave(this.last_cycle) * f4) + this.mCache[2];
        if (f4 == 0.0f && f2 == 0.0f) {
            z = false;
        }
        this.mContinue = z;
        return fCalcWave;
    }

    public CurveFit getCurveFit() {
        return this.mCurveFit;
    }

    public void setPoint(int i, float f, float f2, int i2, float f3) {
        int[] iArr = this.mTimePoints;
        int i3 = this.count;
        iArr[i3] = i;
        float[] fArr = this.mValues[i3];
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        this.mWaveShape = Math.max(this.mWaveShape, i2);
        this.count++;
    }

    public abstract boolean setProperty(View view, float f, long j, KeyCache keyCache);

    public void setStartTime(long j) {
        this.last_time = j;
    }

    public void setType(String str) {
        this.mType = str;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0060  */
    public void setup(int i) {
        int i2 = this.count;
        if (i2 == 0) {
            Log.e(TAG, "Error no points added to " + this.mType);
            return;
        }
        Sort.doubleQuickSort(this.mTimePoints, this.mValues, 0, i2 - 1);
        int i3 = 1;
        int i4 = 0;
        while (true) {
            int[] iArr = this.mTimePoints;
            if (i3 >= iArr.length) {
                break;
            }
            if (iArr[i3] != iArr[i3 - 1]) {
                i4++;
            }
            i3++;
        }
        if (i4 == 0) {
            i4 = 1;
        }
        double[] dArr = new double[i4];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i4, 3);
        int i5 = 0;
        for (int i6 = 0; i6 < this.count; i6++) {
            if (i6 > 0) {
                int[] iArr2 = this.mTimePoints;
                if (iArr2[i6] != iArr2[i6 - 1]) {
                    double d = this.mTimePoints[i6];
                    Double.isNaN(d);
                    dArr[i5] = d * 0.01d;
                    double[] dArr3 = dArr2[i5];
                    float[] fArr = this.mValues[i6];
                    dArr3[0] = fArr[0];
                    dArr3[1] = fArr[1];
                    dArr3[2] = fArr[2];
                    i5++;
                }
            } else {
                double d2 = this.mTimePoints[i6];
                Double.isNaN(d2);
                dArr[i5] = d2 * 0.01d;
                double[] dArr4 = dArr2[i5];
                float[] fArr2 = this.mValues[i6];
                dArr4[0] = fArr2[0];
                dArr4[1] = fArr2[1];
                dArr4[2] = fArr2[2];
                i5++;
            }
        }
        this.mCurveFit = CurveFit.get(i, dArr, dArr2);
    }

    public String toString() {
        String string = this.mType;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.count; i++) {
            StringBuilder sbM3902a = C0835Mx.m3902a(string, "[");
            sbM3902a.append(this.mTimePoints[i]);
            sbM3902a.append(" , ");
            sbM3902a.append(decimalFormat.format(this.mValues[i]));
            sbM3902a.append("] ");
            string = sbM3902a.toString();
        }
        return string;
    }
}
