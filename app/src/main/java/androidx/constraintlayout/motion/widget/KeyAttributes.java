package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.C2567R;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.dom4j.p020io.SAXEventRecorder;
import p000.C5312rZ;

/* JADX INFO: loaded from: classes.dex */
public class KeyAttributes extends Key {
    public static final int KEY_TYPE = 1;
    static final String NAME = "KeyAttribute";
    private static final String TAG = "KeyAttribute";
    private String mTransitionEasing;
    private int mCurveFit = -1;
    private boolean mVisibility = false;
    private float mAlpha = Float.NaN;
    private float mElevation = Float.NaN;
    private float mRotation = Float.NaN;
    private float mRotationX = Float.NaN;
    private float mRotationY = Float.NaN;
    private float mPivotX = Float.NaN;
    private float mPivotY = Float.NaN;
    private float mTransitionPathRotate = Float.NaN;
    private float mScaleX = Float.NaN;
    private float mScaleY = Float.NaN;
    private float mTranslationX = Float.NaN;
    private float mTranslationY = Float.NaN;
    private float mTranslationZ = Float.NaN;
    private float mProgress = Float.NaN;

    public static class Loader {
        private static final int ANDROID_ALPHA = 1;
        private static final int ANDROID_ELEVATION = 2;
        private static final int ANDROID_PIVOT_X = 19;
        private static final int ANDROID_PIVOT_Y = 20;
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
        private static SparseIntArray mAttrMap;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            mAttrMap = sparseIntArray;
            sparseIntArray.append(C2567R.styleable.KeyAttribute_android_alpha, 1);
            mAttrMap.append(C2567R.styleable.KeyAttribute_android_elevation, 2);
            mAttrMap.append(C2567R.styleable.KeyAttribute_android_rotation, 4);
            mAttrMap.append(C2567R.styleable.KeyAttribute_android_rotationX, 5);
            mAttrMap.append(C2567R.styleable.KeyAttribute_android_rotationY, 6);
            mAttrMap.append(C2567R.styleable.KeyAttribute_android_transformPivotX, 19);
            mAttrMap.append(C2567R.styleable.KeyAttribute_android_transformPivotY, 20);
            mAttrMap.append(C2567R.styleable.KeyAttribute_android_scaleX, 7);
            mAttrMap.append(C2567R.styleable.KeyAttribute_transitionPathRotate, 8);
            mAttrMap.append(C2567R.styleable.KeyAttribute_transitionEasing, 9);
            mAttrMap.append(C2567R.styleable.KeyAttribute_motionTarget, 10);
            mAttrMap.append(C2567R.styleable.KeyAttribute_framePosition, 12);
            mAttrMap.append(C2567R.styleable.KeyAttribute_curveFit, 13);
            mAttrMap.append(C2567R.styleable.KeyAttribute_android_scaleY, 14);
            mAttrMap.append(C2567R.styleable.KeyAttribute_android_translationX, 15);
            mAttrMap.append(C2567R.styleable.KeyAttribute_android_translationY, 16);
            mAttrMap.append(C2567R.styleable.KeyAttribute_android_translationZ, 17);
            mAttrMap.append(C2567R.styleable.KeyAttribute_motionProgress, 18);
        }

        private Loader() {
        }

        /* JADX WARN: Code duplicated, block: B:22:0x00c2  */
        public static void read(KeyAttributes keyAttributes, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (mAttrMap.get(index)) {
                    case 1:
                        keyAttributes.mAlpha = typedArray.getFloat(index, keyAttributes.mAlpha);
                        break;
                    case 2:
                        keyAttributes.mElevation = typedArray.getDimension(index, keyAttributes.mElevation);
                        break;
                    case 3:
                    case 11:
                    default:
                        Log.e("KeyAttribute", "unused attribute 0x" + Integer.toHexString(index) + "   " + mAttrMap.get(index));
                        break;
                    case 4:
                        keyAttributes.mRotation = typedArray.getFloat(index, keyAttributes.mRotation);
                        break;
                    case 5:
                        keyAttributes.mRotationX = typedArray.getFloat(index, keyAttributes.mRotationX);
                        break;
                    case 6:
                        keyAttributes.mRotationY = typedArray.getFloat(index, keyAttributes.mRotationY);
                        break;
                    case 7:
                        keyAttributes.mScaleX = typedArray.getFloat(index, keyAttributes.mScaleX);
                        break;
                    case 8:
                        keyAttributes.mTransitionPathRotate = typedArray.getFloat(index, keyAttributes.mTransitionPathRotate);
                        break;
                    case 9:
                        keyAttributes.mTransitionEasing = typedArray.getString(index);
                        break;
                    case 10:
                        if (MotionLayout.IS_IN_EDIT_MODE) {
                            int resourceId = typedArray.getResourceId(index, keyAttributes.mTargetId);
                            keyAttributes.mTargetId = resourceId;
                            if (resourceId == -1) {
                                keyAttributes.mTargetString = typedArray.getString(index);
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            keyAttributes.mTargetString = typedArray.getString(index);
                        } else {
                            keyAttributes.mTargetId = typedArray.getResourceId(index, keyAttributes.mTargetId);
                        }
                        break;
                    case 12:
                        keyAttributes.mFramePosition = typedArray.getInt(index, keyAttributes.mFramePosition);
                        break;
                    case 13:
                        keyAttributes.mCurveFit = typedArray.getInteger(index, keyAttributes.mCurveFit);
                        break;
                    case 14:
                        keyAttributes.mScaleY = typedArray.getFloat(index, keyAttributes.mScaleY);
                        break;
                    case 15:
                        keyAttributes.mTranslationX = typedArray.getDimension(index, keyAttributes.mTranslationX);
                        break;
                    case 16:
                        keyAttributes.mTranslationY = typedArray.getDimension(index, keyAttributes.mTranslationY);
                        break;
                    case 17:
                        if (Build.VERSION.SDK_INT >= 21) {
                            keyAttributes.mTranslationZ = typedArray.getDimension(index, keyAttributes.mTranslationZ);
                        }
                        break;
                    case 18:
                        keyAttributes.mProgress = typedArray.getFloat(index, keyAttributes.mProgress);
                        break;
                    case 19:
                        keyAttributes.mPivotX = typedArray.getDimension(index, keyAttributes.mPivotX);
                        break;
                    case 20:
                        keyAttributes.mPivotY = typedArray.getDimension(index, keyAttributes.mPivotY);
                        break;
                }
            }
        }
    }

    public KeyAttributes() {
        this.mType = 1;
        this.mCustomConstraints = new HashMap<>();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // androidx.constraintlayout.motion.widget.Key
    public void addValues(HashMap<String, SplineSet> map) {
        int i;
        float f;
        for (String str : map.keySet()) {
            SplineSet splineSet = map.get(str);
            if (str.startsWith("CUSTOM")) {
                ConstraintAttribute constraintAttribute = this.mCustomConstraints.get(str.substring(7));
                if (constraintAttribute != null) {
                    ((SplineSet.CustomSet) splineSet).setPoint(this.mFramePosition, constraintAttribute);
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
                    case -760884510:
                        if (str.equals("transformPivotX")) {
                            b = 8;
                        }
                        break;
                    case -760884509:
                        if (str.equals("transformPivotY")) {
                            b = 9;
                        }
                        break;
                    case -40300674:
                        if (str.equals("rotation")) {
                            b = 10;
                        }
                        break;
                    case -4379043:
                        if (str.equals("elevation")) {
                            b = SAXEventRecorder.SAXEvent.f16645n;
                        }
                        break;
                    case 37232917:
                        if (str.equals("transitionPathRotate")) {
                            b = SAXEventRecorder.SAXEvent.f16646o;
                        }
                        break;
                    case 92909918:
                        if (str.equals("alpha")) {
                            b = 13;
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
                        if (!Float.isNaN(this.mRotationX)) {
                            i = this.mFramePosition;
                            f = this.mPivotX;
                        }
                        break;
                    case 9:
                        if (!Float.isNaN(this.mRotationY)) {
                            i = this.mFramePosition;
                            f = this.mPivotY;
                        }
                        break;
                    case 10:
                        if (!Float.isNaN(this.mRotation)) {
                            i = this.mFramePosition;
                            f = this.mRotation;
                        }
                        break;
                    case 11:
                        if (!Float.isNaN(this.mElevation)) {
                            i = this.mFramePosition;
                            f = this.mElevation;
                        }
                        break;
                    case 12:
                        if (!Float.isNaN(this.mTransitionPathRotate)) {
                            i = this.mFramePosition;
                            f = this.mTransitionPathRotate;
                        }
                        break;
                    case 13:
                        if (!Float.isNaN(this.mAlpha)) {
                            i = this.mFramePosition;
                            f = this.mAlpha;
                        }
                        break;
                    default:
                        Log.v("KeyAttributes", "UNKNOWN addValues \"" + str + "\"");
                        continue;
                }
                splineSet.setPoint(i, f);
            }
        }
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
        if (!Float.isNaN(this.mPivotX)) {
            hashSet.add("transformPivotX");
        }
        if (!Float.isNaN(this.mPivotY)) {
            hashSet.add("transformPivotY");
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
        if (!Float.isNaN(this.mScaleX)) {
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
        Loader.read(this, context.obtainStyledAttributes(attributeSet, C2567R.styleable.KeyAttribute));
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
        if (!Float.isNaN(this.mPivotX)) {
            map.put("transformPivotX", Integer.valueOf(this.mCurveFit));
        }
        if (!Float.isNaN(this.mPivotY)) {
            map.put("transformPivotY", Integer.valueOf(this.mCurveFit));
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
        if (!Float.isNaN(this.mScaleY)) {
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
            case -1913008125:
                if (str.equals("motionProgress")) {
                    b = 0;
                }
                break;
            case -1812823328:
                if (str.equals("transitionEasing")) {
                    b = 1;
                }
                break;
            case -1249320806:
                if (str.equals("rotationX")) {
                    b = 2;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    b = 3;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    b = 4;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    b = 5;
                }
                break;
            case -987906986:
                if (str.equals("pivotX")) {
                    b = 6;
                }
                break;
            case -987906985:
                if (str.equals("pivotY")) {
                    b = 7;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    b = 8;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    b = 9;
                }
                break;
            case -40300674:
                if (str.equals("rotation")) {
                    b = 10;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    b = SAXEventRecorder.SAXEvent.f16645n;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    b = SAXEventRecorder.SAXEvent.f16646o;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    b = 13;
                }
                break;
            case 579057826:
                if (str.equals("curveFit")) {
                    b = SAXEventRecorder.SAXEvent.f16648q;
                }
                break;
            case 1317633238:
                if (str.equals("mTranslationZ")) {
                    b = SAXEventRecorder.SAXEvent.f16649r;
                }
                break;
            case 1941332754:
                if (str.equals("visibility")) {
                    b = 16;
                }
                break;
        }
        switch (b) {
            case 0:
                this.mProgress = toFloat(obj);
                break;
            case 1:
                this.mTransitionEasing = obj.toString();
                break;
            case 2:
                this.mRotationX = toFloat(obj);
                break;
            case 3:
                this.mRotationY = toFloat(obj);
                break;
            case 4:
                this.mTranslationX = toFloat(obj);
                break;
            case 5:
                this.mTranslationY = toFloat(obj);
                break;
            case 6:
                this.mPivotX = toFloat(obj);
                break;
            case 7:
                this.mPivotY = toFloat(obj);
                break;
            case 8:
                this.mScaleX = toFloat(obj);
                break;
            case 9:
                this.mScaleY = toFloat(obj);
                break;
            case 10:
                this.mRotation = toFloat(obj);
                break;
            case 11:
                this.mElevation = toFloat(obj);
                break;
            case 12:
                this.mTransitionPathRotate = toFloat(obj);
                break;
            case 13:
                this.mAlpha = toFloat(obj);
                break;
            case 14:
                this.mCurveFit = toInt(obj);
                break;
            case 15:
                this.mTranslationZ = toFloat(obj);
                break;
            case 16:
                this.mVisibility = toBoolean(obj);
                break;
        }
    }
}
