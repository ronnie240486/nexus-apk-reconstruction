package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.utils.CurveFit;
import androidx.constraintlayout.widget.C2567R;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.dom4j.p020io.SAXEventRecorder;
import p000.C5312rZ;

/* JADX INFO: loaded from: classes.dex */
public class KeyTimeCycle extends Key {
    public static final int KEY_TYPE = 3;
    static final String NAME = "KeyTimeCycle";
    private static final String TAG = "KeyTimeCycle";
    private String mTransitionEasing;
    private CurveFit mWaveOffsetSpline;
    private CurveFit mWavePeriodSpline;
    private int mCurveFit = -1;
    private float mAlpha = Float.NaN;
    private float mElevation = Float.NaN;
    private float mRotation = Float.NaN;
    private float mRotationX = Float.NaN;
    private float mRotationY = Float.NaN;
    private float mTransitionPathRotate = Float.NaN;
    private float mScaleX = Float.NaN;
    private float mScaleY = Float.NaN;
    private float mTranslationX = Float.NaN;
    private float mTranslationY = Float.NaN;
    private float mTranslationZ = Float.NaN;
    private float mProgress = Float.NaN;
    private int mWaveShape = 0;
    private float mWavePeriod = Float.NaN;
    private float mWaveOffset = 0.0f;

    public static class Loader {
        private static final int ANDROID_ALPHA = 1;
        private static final int ANDROID_ELEVATION = 2;
        private static final int ANDROID_ROTATION = 4;
        private static final int ANDROID_ROTATION_X = 5;
        private static final int ANDROID_ROTATION_Y = 6;
        private static final int ANDROID_SCALE_X = 7;
        private static final int ANDROID_SCALE_Y = 14;
        private static final int ANDROID_TRANSLATION_X = 15;
        private static final int ANDROID_TRANSLATION_Y = 16;
        private static final int ANDROID_TRANSLATION_Z = 17;
        private static final int CURVE_FIT = 13;
        private static final int FRAME_POSITION = 12;
        private static final int PROGRESS = 18;
        private static final int TARGET_ID = 10;
        private static final int TRANSITION_EASING = 9;
        private static final int TRANSITION_PATH_ROTATE = 8;
        private static final int WAVE_OFFSET = 21;
        private static final int WAVE_PERIOD = 20;
        private static final int WAVE_SHAPE = 19;
        private static SparseIntArray mAttrMap;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            mAttrMap = sparseIntArray;
            sparseIntArray.append(C2567R.styleable.KeyTimeCycle_android_alpha, 1);
            mAttrMap.append(C2567R.styleable.KeyTimeCycle_android_elevation, 2);
            mAttrMap.append(C2567R.styleable.KeyTimeCycle_android_rotation, 4);
            mAttrMap.append(C2567R.styleable.KeyTimeCycle_android_rotationX, 5);
            mAttrMap.append(C2567R.styleable.KeyTimeCycle_android_rotationY, 6);
            mAttrMap.append(C2567R.styleable.KeyTimeCycle_android_scaleX, 7);
            mAttrMap.append(C2567R.styleable.KeyTimeCycle_transitionPathRotate, 8);
            mAttrMap.append(C2567R.styleable.KeyTimeCycle_transitionEasing, 9);
            mAttrMap.append(C2567R.styleable.KeyTimeCycle_motionTarget, 10);
            mAttrMap.append(C2567R.styleable.KeyTimeCycle_framePosition, 12);
            mAttrMap.append(C2567R.styleable.KeyTimeCycle_curveFit, 13);
            mAttrMap.append(C2567R.styleable.KeyTimeCycle_android_scaleY, 14);
            mAttrMap.append(C2567R.styleable.KeyTimeCycle_android_translationX, 15);
            mAttrMap.append(C2567R.styleable.KeyTimeCycle_android_translationY, 16);
            mAttrMap.append(C2567R.styleable.KeyTimeCycle_android_translationZ, 17);
            mAttrMap.append(C2567R.styleable.KeyTimeCycle_motionProgress, 18);
            mAttrMap.append(C2567R.styleable.KeyTimeCycle_wavePeriod, 20);
            mAttrMap.append(C2567R.styleable.KeyTimeCycle_waveOffset, 21);
            mAttrMap.append(C2567R.styleable.KeyTimeCycle_waveShape, 19);
        }

        private Loader() {
        }

        /* JADX WARN: Code duplicated, block: B:27:0x00e1  */
        public static void read(KeyTimeCycle keyTimeCycle, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (mAttrMap.get(index)) {
                    case 1:
                        keyTimeCycle.mAlpha = typedArray.getFloat(index, keyTimeCycle.mAlpha);
                        break;
                    case 2:
                        keyTimeCycle.mElevation = typedArray.getDimension(index, keyTimeCycle.mElevation);
                        break;
                    case 3:
                    case 11:
                    default:
                        Log.e("KeyTimeCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + mAttrMap.get(index));
                        break;
                    case 4:
                        keyTimeCycle.mRotation = typedArray.getFloat(index, keyTimeCycle.mRotation);
                        break;
                    case 5:
                        keyTimeCycle.mRotationX = typedArray.getFloat(index, keyTimeCycle.mRotationX);
                        break;
                    case 6:
                        keyTimeCycle.mRotationY = typedArray.getFloat(index, keyTimeCycle.mRotationY);
                        break;
                    case 7:
                        keyTimeCycle.mScaleX = typedArray.getFloat(index, keyTimeCycle.mScaleX);
                        break;
                    case 8:
                        keyTimeCycle.mTransitionPathRotate = typedArray.getFloat(index, keyTimeCycle.mTransitionPathRotate);
                        break;
                    case 9:
                        keyTimeCycle.mTransitionEasing = typedArray.getString(index);
                        break;
                    case 10:
                        if (MotionLayout.IS_IN_EDIT_MODE) {
                            int resourceId = typedArray.getResourceId(index, keyTimeCycle.mTargetId);
                            keyTimeCycle.mTargetId = resourceId;
                            if (resourceId == -1) {
                                keyTimeCycle.mTargetString = typedArray.getString(index);
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            keyTimeCycle.mTargetString = typedArray.getString(index);
                        } else {
                            keyTimeCycle.mTargetId = typedArray.getResourceId(index, keyTimeCycle.mTargetId);
                        }
                        break;
                    case 12:
                        keyTimeCycle.mFramePosition = typedArray.getInt(index, keyTimeCycle.mFramePosition);
                        break;
                    case 13:
                        keyTimeCycle.mCurveFit = typedArray.getInteger(index, keyTimeCycle.mCurveFit);
                        break;
                    case 14:
                        keyTimeCycle.mScaleY = typedArray.getFloat(index, keyTimeCycle.mScaleY);
                        break;
                    case 15:
                        keyTimeCycle.mTranslationX = typedArray.getDimension(index, keyTimeCycle.mTranslationX);
                        break;
                    case 16:
                        keyTimeCycle.mTranslationY = typedArray.getDimension(index, keyTimeCycle.mTranslationY);
                        break;
                    case 17:
                        if (Build.VERSION.SDK_INT >= 21) {
                            keyTimeCycle.mTranslationZ = typedArray.getDimension(index, keyTimeCycle.mTranslationZ);
                        }
                        break;
                    case 18:
                        keyTimeCycle.mProgress = typedArray.getFloat(index, keyTimeCycle.mProgress);
                        break;
                    case 19:
                        keyTimeCycle.mWaveShape = typedArray.getInt(index, keyTimeCycle.mWaveShape);
                        break;
                    case 20:
                        keyTimeCycle.mWavePeriod = typedArray.getFloat(index, keyTimeCycle.mWavePeriod);
                        break;
                    case 21:
                        keyTimeCycle.mWaveOffset = typedArray.peekValue(index).type == 5 ? typedArray.getDimension(index, keyTimeCycle.mWaveOffset) : typedArray.getFloat(index, keyTimeCycle.mWaveOffset);
                        break;
                }
            }
        }
    }

    public KeyTimeCycle() {
        this.mType = 3;
        this.mCustomConstraints = new HashMap<>();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void addTimeValues(HashMap<String, TimeCycleSplineSet> map) {
        int i;
        float f;
        for (String str : map.keySet()) {
            TimeCycleSplineSet timeCycleSplineSet = map.get(str);
            if (str.startsWith("CUSTOM")) {
                ConstraintAttribute constraintAttribute = this.mCustomConstraints.get(str.substring(7));
                if (constraintAttribute != null) {
                    ((TimeCycleSplineSet.CustomSet) timeCycleSplineSet).setPoint(this.mFramePosition, constraintAttribute, this.mWavePeriod, this.mWaveShape, this.mWaveOffset);
                }
            } else {
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
                        if (!Float.isNaN(this.mRotationX)) {
                            i = this.mFramePosition;
                            f = this.mRotationX;
                        }
                        break;
                    case 1:
                        if (!Float.isNaN(this.mRotationY)) {
                            i = this.mFramePosition;
                            f = this.mRotationY;
                        }
                        break;
                    case 2:
                        if (!Float.isNaN(this.mTranslationX)) {
                            i = this.mFramePosition;
                            f = this.mTranslationX;
                        }
                        break;
                    case 3:
                        if (!Float.isNaN(this.mTranslationY)) {
                            i = this.mFramePosition;
                            f = this.mTranslationY;
                        }
                        break;
                    case 4:
                        if (!Float.isNaN(this.mTranslationZ)) {
                            i = this.mFramePosition;
                            f = this.mTranslationZ;
                        }
                        break;
                    case 5:
                        if (!Float.isNaN(this.mProgress)) {
                            i = this.mFramePosition;
                            f = this.mProgress;
                        }
                        break;
                    case 6:
                        if (!Float.isNaN(this.mScaleX)) {
                            i = this.mFramePosition;
                            f = this.mScaleX;
                        }
                        break;
                    case 7:
                        if (!Float.isNaN(this.mScaleY)) {
                            i = this.mFramePosition;
                            f = this.mScaleY;
                        }
                        break;
                    case 8:
                        if (!Float.isNaN(this.mRotation)) {
                            i = this.mFramePosition;
                            f = this.mRotation;
                        }
                        break;
                    case 9:
                        if (!Float.isNaN(this.mElevation)) {
                            i = this.mFramePosition;
                            f = this.mElevation;
                        }
                        break;
                    case 10:
                        if (!Float.isNaN(this.mTransitionPathRotate)) {
                            i = this.mFramePosition;
                            f = this.mTransitionPathRotate;
                        }
                        break;
                    case 11:
                        if (!Float.isNaN(this.mAlpha)) {
                            i = this.mFramePosition;
                            f = this.mAlpha;
                        }
                        break;
                    default:
                        Log.e("KeyTimeCycles", "UNKNOWN addValues \"" + str + "\"");
                        continue;
                }
                timeCycleSplineSet.setPoint(i, f, this.mWavePeriod, this.mWaveShape, this.mWaveOffset);
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void addValues(HashMap<String, SplineSet> map) {
        throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void getAttributeNames(HashSet<String> hashSet) {
        if (!Float.isNaN(this.mAlpha)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.mElevation)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.mRotation)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.mRotationX)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.mRotationY)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.mTranslationX)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.mTranslationY)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.mTranslationZ)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.mTransitionPathRotate)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.mScaleX)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.mScaleY)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.mProgress)) {
            hashSet.add("progress");
        }
        if (this.mCustomConstraints.size() > 0) {
            Iterator<String> it = this.mCustomConstraints.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    public int getCurveFit() {
        return this.mCurveFit;
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void load(Context context, AttributeSet attributeSet) {
        Loader.read(this, context.obtainStyledAttributes(attributeSet, C2567R.styleable.KeyTimeCycle));
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void setInterpolation(HashMap<String, Integer> map) {
        if (this.mCurveFit == -1) {
            return;
        }
        if (!Float.isNaN(this.mAlpha)) {
            map.put("alpha", Integer.valueOf(this.mCurveFit));
        }
        if (!Float.isNaN(this.mElevation)) {
            map.put("elevation", Integer.valueOf(this.mCurveFit));
        }
        if (!Float.isNaN(this.mRotation)) {
            map.put("rotation", Integer.valueOf(this.mCurveFit));
        }
        if (!Float.isNaN(this.mRotationX)) {
            map.put("rotationX", Integer.valueOf(this.mCurveFit));
        }
        if (!Float.isNaN(this.mRotationY)) {
            map.put("rotationY", Integer.valueOf(this.mCurveFit));
        }
        if (!Float.isNaN(this.mTranslationX)) {
            map.put("translationX", Integer.valueOf(this.mCurveFit));
        }
        if (!Float.isNaN(this.mTranslationY)) {
            map.put("translationY", Integer.valueOf(this.mCurveFit));
        }
        if (!Float.isNaN(this.mTranslationZ)) {
            map.put("translationZ", Integer.valueOf(this.mCurveFit));
        }
        if (!Float.isNaN(this.mTransitionPathRotate)) {
            map.put("transitionPathRotate", Integer.valueOf(this.mCurveFit));
        }
        if (!Float.isNaN(this.mScaleX)) {
            map.put("scaleX", Integer.valueOf(this.mCurveFit));
        }
        if (!Float.isNaN(this.mScaleX)) {
            map.put("scaleY", Integer.valueOf(this.mCurveFit));
        }
        if (!Float.isNaN(this.mProgress)) {
            map.put("progress", Integer.valueOf(this.mCurveFit));
        }
        if (this.mCustomConstraints.size() > 0) {
            Iterator<String> it = this.mCustomConstraints.keySet().iterator();
            while (it.hasNext()) {
                map.put(C5312rZ.m27869a("CUSTOM,", it.next()), Integer.valueOf(this.mCurveFit));
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // androidx.constraintlayout.motion.widget.Key
    public void setValue(String str, Object obj) {
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -1812823328:
                if (str.equals("transitionEasing")) {
                    b = 0;
                }
                break;
            case -1249320806:
                if (str.equals("rotationX")) {
                    b = 1;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    b = 2;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    b = 3;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
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
            case 579057826:
                if (str.equals("curveFit")) {
                    b = SAXEventRecorder.SAXEvent.f16646o;
                }
                break;
            case 1317633238:
                if (str.equals("mTranslationZ")) {
                    b = 13;
                }
                break;
        }
        switch (b) {
            case 0:
                this.mTransitionEasing = obj.toString();
                break;
            case 1:
                this.mRotationX = toFloat(obj);
                break;
            case 2:
                this.mRotationY = toFloat(obj);
                break;
            case 3:
                this.mTranslationX = toFloat(obj);
                break;
            case 4:
                this.mTranslationY = toFloat(obj);
                break;
            case 5:
                this.mProgress = toFloat(obj);
                break;
            case 6:
                this.mScaleX = toFloat(obj);
                break;
            case 7:
                this.mScaleY = toFloat(obj);
                break;
            case 8:
                this.mRotation = toFloat(obj);
                break;
            case 9:
                this.mElevation = toFloat(obj);
                break;
            case 10:
                this.mTransitionPathRotate = toFloat(obj);
                break;
            case 11:
                this.mAlpha = toFloat(obj);
                break;
            case 12:
                this.mCurveFit = toInt(obj);
                break;
            case 13:
                this.mTranslationZ = toFloat(obj);
                break;
        }
    }
}
