package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.motion.widget.Debug;
import androidx.core.view.ViewCompat;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import p000.C1288U1;
import p000.C5312rZ;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintAttribute {
    private static final String TAG = "TransitionLayout";
    boolean mBooleanValue;
    private int mColorValue;
    private float mFloatValue;
    private int mIntegerValue;
    String mName;
    private String mStringValue;
    private AttributeType mType;

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.ConstraintAttribute$1 */
    public static /* synthetic */ class C25651 {

        /* JADX INFO: renamed from: $SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType */
        static final /* synthetic */ int[] f10097x66adad53;

        static {
            int[] iArr = new int[AttributeType.values().length];
            f10097x66adad53 = iArr;
            try {
                iArr[AttributeType.COLOR_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10097x66adad53[AttributeType.COLOR_DRAWABLE_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10097x66adad53[AttributeType.INT_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10097x66adad53[AttributeType.FLOAT_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10097x66adad53[AttributeType.STRING_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10097x66adad53[AttributeType.BOOLEAN_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10097x66adad53[AttributeType.DIMENSION_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public enum AttributeType {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE
    }

    public ConstraintAttribute(ConstraintAttribute constraintAttribute, Object obj) {
        this.mName = constraintAttribute.mName;
        this.mType = constraintAttribute.mType;
        setValue(obj);
    }

    private static int clamp(int i) {
        int i2 = (i & ((i >> 31) ^ (-1))) - 255;
        return (i2 & (i2 >> 31)) + 255;
    }

    public static HashMap<String, ConstraintAttribute> extractAttributes(HashMap<String, ConstraintAttribute> map, View view) {
        HashMap<String, ConstraintAttribute> map2 = new HashMap<>();
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            ConstraintAttribute constraintAttribute = map.get(str);
            try {
                map2.put(str, str.equals("BackgroundColor") ? new ConstraintAttribute(constraintAttribute, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())) : new ConstraintAttribute(constraintAttribute, cls.getMethod("getMap" + str, null).invoke(view, null)));
            } catch (IllegalAccessException e) {
                e = e;
                e.printStackTrace();
            } catch (NoSuchMethodException e2) {
                e = e2;
                e.printStackTrace();
            } catch (InvocationTargetException e3) {
                e = e3;
                e.printStackTrace();
            }
        }
        return map2;
    }

    public static void parse(Context context, XmlPullParser xmlPullParser, HashMap<String, ConstraintAttribute> map) {
        AttributeType attributeType;
        Object string;
        int integer;
        float dimension;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C2567R.styleable.CustomAttribute);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string2 = null;
        Object objValueOf = null;
        AttributeType attributeType2 = null;
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == C2567R.styleable.CustomAttribute_attributeName) {
                string2 = typedArrayObtainStyledAttributes.getString(index);
                if (string2 != null && string2.length() > 0) {
                    string2 = Character.toUpperCase(string2.charAt(0)) + string2.substring(1);
                }
            } else if (index == C2567R.styleable.CustomAttribute_customBoolean) {
                objValueOf = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                attributeType2 = AttributeType.BOOLEAN_TYPE;
            } else {
                if (index == C2567R.styleable.CustomAttribute_customColorValue) {
                    attributeType = AttributeType.COLOR_TYPE;
                } else if (index == C2567R.styleable.CustomAttribute_customColorDrawableValue) {
                    attributeType = AttributeType.COLOR_DRAWABLE_TYPE;
                } else {
                    if (index == C2567R.styleable.CustomAttribute_customPixelDimension) {
                        attributeType = AttributeType.DIMENSION_TYPE;
                        dimension = TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics());
                    } else if (index == C2567R.styleable.CustomAttribute_customDimension) {
                        attributeType = AttributeType.DIMENSION_TYPE;
                        dimension = typedArrayObtainStyledAttributes.getDimension(index, 0.0f);
                    } else if (index == C2567R.styleable.CustomAttribute_customFloatValue) {
                        attributeType = AttributeType.FLOAT_TYPE;
                        dimension = typedArrayObtainStyledAttributes.getFloat(index, Float.NaN);
                    } else if (index == C2567R.styleable.CustomAttribute_customIntegerValue) {
                        attributeType = AttributeType.INT_TYPE;
                        integer = typedArrayObtainStyledAttributes.getInteger(index, -1);
                        string = Integer.valueOf(integer);
                        Object obj = string;
                        attributeType2 = attributeType;
                        objValueOf = obj;
                    } else if (index == C2567R.styleable.CustomAttribute_customStringValue) {
                        attributeType = AttributeType.STRING_TYPE;
                        string = typedArrayObtainStyledAttributes.getString(index);
                        Object obj2 = string;
                        attributeType2 = attributeType;
                        objValueOf = obj2;
                    }
                    string = Float.valueOf(dimension);
                    Object obj3 = string;
                    attributeType2 = attributeType;
                    objValueOf = obj3;
                }
                integer = typedArrayObtainStyledAttributes.getColor(index, 0);
                string = Integer.valueOf(integer);
                Object obj4 = string;
                attributeType2 = attributeType;
                objValueOf = obj4;
            }
        }
        if (string2 != null && objValueOf != null) {
            map.put(string2, new ConstraintAttribute(string2, attributeType2, objValueOf));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void setAttributes(View view, HashMap<String, ConstraintAttribute> map) {
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            ConstraintAttribute constraintAttribute = map.get(str);
            String strM27869a = C5312rZ.m27869a("set", str);
            try {
                switch (C25651.f10097x66adad53[constraintAttribute.mType.ordinal()]) {
                    case 1:
                        cls.getMethod(strM27869a, Integer.TYPE).invoke(view, Integer.valueOf(constraintAttribute.mColorValue));
                        break;
                    case 2:
                        Method method = cls.getMethod(strM27869a, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(constraintAttribute.mColorValue);
                        method.invoke(view, colorDrawable);
                        break;
                    case 3:
                        cls.getMethod(strM27869a, Integer.TYPE).invoke(view, Integer.valueOf(constraintAttribute.mIntegerValue));
                        break;
                    case 4:
                        cls.getMethod(strM27869a, Float.TYPE).invoke(view, Float.valueOf(constraintAttribute.mFloatValue));
                        break;
                    case 5:
                        cls.getMethod(strM27869a, CharSequence.class).invoke(view, constraintAttribute.mStringValue);
                        break;
                    case 6:
                        cls.getMethod(strM27869a, Boolean.TYPE).invoke(view, Boolean.valueOf(constraintAttribute.mBooleanValue));
                        break;
                    case 7:
                        cls.getMethod(strM27869a, Float.TYPE).invoke(view, Float.valueOf(constraintAttribute.mFloatValue));
                        break;
                }
            } catch (IllegalAccessException e) {
                e = e;
                StringBuilder sbM6151a = C1288U1.m6151a(" Custom Attribute \"", str, "\" not found on ");
                sbM6151a.append(cls.getName());
                Log.e(TAG, sbM6151a.toString());
                e.printStackTrace();
            } catch (NoSuchMethodException e2) {
                Log.e(TAG, e2.getMessage());
                Log.e(TAG, " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                Log.e(TAG, cls.getName() + " must have a method " + strM27869a);
            } catch (InvocationTargetException e3) {
                e = e3;
                StringBuilder sbM6151a2 = C1288U1.m6151a(" Custom Attribute \"", str, "\" not found on ");
                sbM6151a2.append(cls.getName());
                Log.e(TAG, sbM6151a2.toString());
                e.printStackTrace();
            }
        }
    }

    public boolean diff(ConstraintAttribute constraintAttribute) {
        AttributeType attributeType;
        if (constraintAttribute == null || (attributeType = this.mType) != constraintAttribute.mType) {
            return false;
        }
        switch (C25651.f10097x66adad53[attributeType.ordinal()]) {
            case 1:
            case 2:
                return this.mColorValue == constraintAttribute.mColorValue;
            case 3:
                return this.mIntegerValue == constraintAttribute.mIntegerValue;
            case 4:
                return this.mFloatValue == constraintAttribute.mFloatValue;
            case 5:
                return this.mIntegerValue == constraintAttribute.mIntegerValue;
            case 6:
                return this.mBooleanValue == constraintAttribute.mBooleanValue;
            case 7:
                return this.mFloatValue == constraintAttribute.mFloatValue;
            default:
                return false;
        }
    }

    public AttributeType getType() {
        return this.mType;
    }

    public float getValueToInterpolate() {
        switch (C25651.f10097x66adad53[this.mType.ordinal()]) {
            case 1:
            case 2:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 3:
                return this.mIntegerValue;
            case 4:
                return this.mFloatValue;
            case 5:
                throw new RuntimeException("Cannot interpolate String");
            case 6:
                return this.mBooleanValue ? 0.0f : 1.0f;
            case 7:
                return this.mFloatValue;
            default:
                return Float.NaN;
        }
    }

    public void getValuesToInterpolate(float[] fArr) {
        switch (C25651.f10097x66adad53[this.mType.ordinal()]) {
            case 1:
            case 2:
                int i = this.mColorValue;
                int i2 = (i >> 24) & 255;
                float fPow = (float) Math.pow(((i >> 16) & 255) / 255.0f, 2.2d);
                float fPow2 = (float) Math.pow(((i >> 8) & 255) / 255.0f, 2.2d);
                float fPow3 = (float) Math.pow((i & 255) / 255.0f, 2.2d);
                fArr[0] = fPow;
                fArr[1] = fPow2;
                fArr[2] = fPow3;
                fArr[3] = i2 / 255.0f;
                return;
            case 3:
                fArr[0] = this.mIntegerValue;
                return;
            case 4:
                fArr[0] = this.mFloatValue;
                return;
            case 5:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 6:
                fArr[0] = this.mBooleanValue ? 0.0f : 1.0f;
                return;
            case 7:
                fArr[0] = this.mFloatValue;
                return;
            default:
                return;
        }
    }

    public int noOfInterpValues() {
        int i = C25651.f10097x66adad53[this.mType.ordinal()];
        return (i == 1 || i == 2) ? 4 : 1;
    }

    public void setColorValue(int i) {
        this.mColorValue = i;
    }

    public void setFloatValue(float f) {
        this.mFloatValue = f;
    }

    public void setIntValue(int i) {
        this.mIntegerValue = i;
    }

    public void setInterpolatedValue(View view, float[] fArr) {
        String str;
        String str2;
        StringBuilder sbM6151a;
        String str3 = "\"";
        Class<?> cls = view.getClass();
        String str4 = "set" + this.mName;
        try {
            try {
                try {
                    try {
                        try {
                            switch (C25651.f10097x66adad53[this.mType.ordinal()]) {
                                case 1:
                                    cls.getMethod(str4, Integer.TYPE).invoke(view, Integer.valueOf((clamp((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (clamp((int) (fArr[3] * 255.0f)) << 24) | (clamp((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | clamp((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f))));
                                    return;
                                case 2:
                                    Method method = cls.getMethod(str4, Drawable.class);
                                    int iClamp = (clamp((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (clamp((int) (fArr[3] * 255.0f)) << 24) | (clamp((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | clamp((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
                                    ColorDrawable colorDrawable = new ColorDrawable();
                                    colorDrawable.setColor(iClamp);
                                    method.invoke(view, colorDrawable);
                                    return;
                                case 3:
                                    cls.getMethod(str4, Integer.TYPE).invoke(view, Integer.valueOf((int) fArr[0]));
                                    return;
                                case 4:
                                    cls.getMethod(str4, Float.TYPE).invoke(view, Float.valueOf(fArr[0]));
                                    return;
                                case 5:
                                    throw new RuntimeException("unable to interpolate strings " + this.mName);
                                case 6:
                                    cls.getMethod(str4, Boolean.TYPE).invoke(view, Boolean.valueOf(fArr[0] > 0.5f));
                                    return;
                                case 7:
                                    cls.getMethod(str4, Float.TYPE).invoke(view, Float.valueOf(fArr[0]));
                                    return;
                                default:
                                    return;
                            }
                        } catch (IllegalAccessException e) {
                            e = e;
                            sbM6151a = C1288U1.m6151a("cannot access method ", str4, "on View \"");
                            sbM6151a.append(Debug.getName(view));
                            str2 = str;
                            sbM6151a.append(str2);
                            Log.e(TAG, sbM6151a.toString());
                            e.printStackTrace();
                        } catch (NoSuchMethodException e2) {
                            e = e2;
                            str2 = str3;
                            sbM6151a = C1288U1.m6151a("no method ", str4, "on View \"");
                            sbM6151a.append(Debug.getName(view));
                            sbM6151a.append(str2);
                            Log.e(TAG, sbM6151a.toString());
                            e.printStackTrace();
                        }
                    } catch (NoSuchMethodException e3) {
                        e = e3;
                        str3 = str3;
                    }
                } catch (InvocationTargetException e4) {
                    e4.printStackTrace();
                }
            } catch (NoSuchMethodException e5) {
                e = e5;
                str2 = str3;
            }
        } catch (IllegalAccessException e6) {
            e = e6;
            str = str3;
        }
    }

    public void setStringValue(String str) {
        this.mStringValue = str;
    }

    public void setValue(Object obj) {
        switch (C25651.f10097x66adad53[this.mType.ordinal()]) {
            case 1:
            case 2:
                this.mColorValue = ((Integer) obj).intValue();
                break;
            case 3:
                this.mIntegerValue = ((Integer) obj).intValue();
                break;
            case 4:
            case 7:
                this.mFloatValue = ((Float) obj).floatValue();
                break;
            case 5:
                this.mStringValue = (String) obj;
                break;
            case 6:
                this.mBooleanValue = ((Boolean) obj).booleanValue();
                break;
        }
    }

    public ConstraintAttribute(String str, AttributeType attributeType) {
        this.mName = str;
        this.mType = attributeType;
    }

    public void setValue(float[] fArr) {
        float f;
        switch (C25651.f10097x66adad53[this.mType.ordinal()]) {
            case 1:
            case 2:
                int iHSVToColor = Color.HSVToColor(fArr);
                this.mColorValue = iHSVToColor;
                this.mColorValue = (clamp((int) (fArr[3] * 255.0f)) << 24) | (iHSVToColor & ViewCompat.MEASURED_SIZE_MASK);
                return;
            case 3:
                this.mIntegerValue = (int) fArr[0];
                return;
            case 4:
                f = fArr[0];
                break;
            case 5:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 6:
                this.mBooleanValue = ((double) fArr[0]) > 0.5d;
                return;
            case 7:
                f = fArr[0];
                break;
            default:
                return;
        }
        this.mFloatValue = f;
    }

    public ConstraintAttribute(String str, AttributeType attributeType, Object obj) {
        this.mName = str;
        this.mType = attributeType;
        setValue(obj);
    }
}
