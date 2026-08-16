package androidx.core.graphics.drawable;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.util.Preconditions;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import p000.C0353FN;
import p000.C0912O9;
import p000.C1313UP;
import p000.C4440gr;
import p000.C4503hr;
import p000.C4575ir;
import p000.C4637jr;
import p000.C4701kr;
import p000.C4726lF;
import p000.C4764lr;
import p000.C4835mr;
import p000.C4900nr;
import p000.C4963or;
import p000.C5204pr;
import p000.C5267qr;
import p000.C5330rr;
import p000.C5401sr;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {
    private static final float ADAPTIVE_ICON_INSET_FACTOR = 0.25f;
    private static final int AMBIENT_SHADOW_ALPHA = 30;
    private static final float BLUR_FACTOR = 0.010416667f;
    static final PorterDuff.Mode DEFAULT_TINT_MODE = PorterDuff.Mode.SRC_IN;
    private static final float DEFAULT_VIEW_PORT_SCALE = 0.6666667f;

    @VisibleForTesting
    static final String EXTRA_INT1 = "int1";

    @VisibleForTesting
    static final String EXTRA_INT2 = "int2";

    @VisibleForTesting
    static final String EXTRA_OBJ = "obj";

    @VisibleForTesting
    static final String EXTRA_STRING1 = "string1";

    @VisibleForTesting
    static final String EXTRA_TINT_LIST = "tint_list";

    @VisibleForTesting
    static final String EXTRA_TINT_MODE = "tint_mode";

    @VisibleForTesting
    static final String EXTRA_TYPE = "type";
    private static final float ICON_DIAMETER_FACTOR = 0.9166667f;
    private static final int KEY_SHADOW_ALPHA = 61;
    private static final float KEY_SHADOW_OFFSET_FACTOR = 0.020833334f;
    private static final String TAG = "IconCompat";
    public static final int TYPE_ADAPTIVE_BITMAP = 5;
    public static final int TYPE_BITMAP = 1;
    public static final int TYPE_DATA = 3;
    public static final int TYPE_RESOURCE = 2;
    public static final int TYPE_UNKNOWN = -1;
    public static final int TYPE_URI = 4;
    public static final int TYPE_URI_ADAPTIVE_BITMAP = 6;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public byte[] mData;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int mInt1;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int mInt2;
    Object mObj1;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Parcelable mParcelable;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public String mString1;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public ColorStateList mTintList;
    PorterDuff.Mode mTintMode;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public String mTintModeStr;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int mType;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface IconType {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public IconCompat() {
        this.mType = -1;
        this.mData = null;
        this.mParcelable = null;
        this.mInt1 = 0;
        this.mInt2 = 0;
        this.mTintList = null;
        this.mTintMode = DEFAULT_TINT_MODE;
        this.mTintModeStr = null;
    }

    @Nullable
    public static IconCompat createFromBundle(@NonNull Bundle bundle) {
        int i = bundle.getInt("type");
        IconCompat iconCompat = new IconCompat(i);
        iconCompat.mInt1 = bundle.getInt(EXTRA_INT1);
        iconCompat.mInt2 = bundle.getInt(EXTRA_INT2);
        iconCompat.mString1 = bundle.getString(EXTRA_STRING1);
        if (bundle.containsKey(EXTRA_TINT_LIST)) {
            iconCompat.mTintList = (ColorStateList) bundle.getParcelable(EXTRA_TINT_LIST);
        }
        if (bundle.containsKey(EXTRA_TINT_MODE)) {
            iconCompat.mTintMode = PorterDuff.Mode.valueOf(bundle.getString(EXTRA_TINT_MODE));
        }
        switch (i) {
            case -1:
            case 1:
            case 5:
                iconCompat.mObj1 = bundle.getParcelable(EXTRA_OBJ);
                return iconCompat;
            case 0:
            default:
                Log.w(TAG, "Unknown type " + i);
                return null;
            case 2:
            case 4:
            case 6:
                iconCompat.mObj1 = bundle.getString(EXTRA_OBJ);
                return iconCompat;
            case 3:
                iconCompat.mObj1 = bundle.getByteArray(EXTRA_OBJ);
                return iconCompat;
        }
    }

    @Nullable
    @RequiresApi(23)
    public static IconCompat createFromIcon(@NonNull Context context, @NonNull Icon icon) {
        Preconditions.checkNotNull(icon);
        int type = getType(icon);
        if (type == 2) {
            String resPackage = getResPackage(icon);
            try {
                return createWithResource(getResources(context, resPackage), resPackage, getResId(icon));
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        }
        if (type == 4) {
            return createWithContentUri(getUri(icon));
        }
        if (type == 6) {
            return createWithAdaptiveBitmapContentUri(getUri(icon));
        }
        IconCompat iconCompat = new IconCompat(-1);
        iconCompat.mObj1 = icon;
        return iconCompat;
    }

    @Nullable
    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static IconCompat createFromIconOrNullIfZeroResId(@NonNull Icon icon) {
        if (getType(icon) == 2 && getResId(icon) == 0) {
            return null;
        }
        return createFromIcon(icon);
    }

    @VisibleForTesting
    public static Bitmap createLegacyIconFromAdaptiveIcon(Bitmap bitmap, boolean z) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * DEFAULT_VIEW_PORT_SCALE);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f = iMin;
        float f2 = 0.5f * f;
        float f3 = ICON_DIAMETER_FACTOR * f2;
        if (z) {
            float f4 = BLUR_FACTOR * f;
            paint.setColor(0);
            paint.setShadowLayer(f4, 0.0f, f * KEY_SHADOW_OFFSET_FACTOR, C0912O9.f2346d);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.setShadowLayer(f4, 0.0f, 0.0f, C0912O9.f2345c);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2, (-(bitmap.getHeight() - iMin)) / 2);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f3, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    public static IconCompat createWithAdaptiveBitmap(Bitmap bitmap) {
        if (bitmap == null) {
            throw new IllegalArgumentException("Bitmap must not be null.");
        }
        IconCompat iconCompat = new IconCompat(5);
        iconCompat.mObj1 = bitmap;
        return iconCompat;
    }

    @NonNull
    public static IconCompat createWithAdaptiveBitmapContentUri(@NonNull Uri uri) {
        if (uri != null) {
            return createWithAdaptiveBitmapContentUri(uri.toString());
        }
        throw new IllegalArgumentException("Uri must not be null.");
    }

    public static IconCompat createWithBitmap(Bitmap bitmap) {
        if (bitmap == null) {
            throw new IllegalArgumentException("Bitmap must not be null.");
        }
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.mObj1 = bitmap;
        return iconCompat;
    }

    public static IconCompat createWithContentUri(Uri uri) {
        if (uri != null) {
            return createWithContentUri(uri.toString());
        }
        throw new IllegalArgumentException("Uri must not be null.");
    }

    public static IconCompat createWithData(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new IllegalArgumentException("Data must not be null.");
        }
        IconCompat iconCompat = new IconCompat(3);
        iconCompat.mObj1 = bArr;
        iconCompat.mInt1 = i;
        iconCompat.mInt2 = i2;
        return iconCompat;
    }

    public static IconCompat createWithResource(Context context, @DrawableRes int i) {
        if (context != null) {
            return createWithResource(context.getResources(), context.getPackageName(), i);
        }
        throw new IllegalArgumentException("Context must not be null.");
    }

    private static Resources getResources(Context context, String str) {
        if (C0353FN.f780a.equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(TAG, String.format("Unable to find pkg=%s for icon", str), e);
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private Drawable loadDrawableInner(Context context) {
        BitmapDrawable bitmapDrawable;
        Drawable bitmapDrawable2;
        switch (this.mType) {
            case 1:
                bitmapDrawable = new BitmapDrawable(context.getResources(), (Bitmap) this.mObj1);
                return bitmapDrawable;
            case 2:
                String resPackage = getResPackage();
                if (TextUtils.isEmpty(resPackage)) {
                    resPackage = context.getPackageName();
                }
                try {
                    return ResourcesCompat.getDrawable(getResources(context, resPackage), this.mInt1, context.getTheme());
                } catch (RuntimeException e) {
                    Log.e(TAG, String.format("Unable to load resource 0x%08x from pkg=%s", Integer.valueOf(this.mInt1), this.mObj1), e);
                }
                break;
            case 3:
                bitmapDrawable = new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray((byte[]) this.mObj1, this.mInt1, this.mInt2));
                return bitmapDrawable;
            case 4:
                InputStream uriInputStream = getUriInputStream(context);
                if (uriInputStream != null) {
                    bitmapDrawable2 = new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(uriInputStream));
                    return bitmapDrawable2;
                }
                return null;
            case 5:
                bitmapDrawable = new BitmapDrawable(context.getResources(), createLegacyIconFromAdaptiveIcon((Bitmap) this.mObj1, false));
                return bitmapDrawable;
            case 6:
                InputStream uriInputStream2 = getUriInputStream(context);
                if (uriInputStream2 != null) {
                    if (Build.VERSION.SDK_INT < 26) {
                        return new BitmapDrawable(context.getResources(), createLegacyIconFromAdaptiveIcon(BitmapFactory.decodeStream(uriInputStream2), false));
                    }
                    bitmapDrawable2 = new AdaptiveIconDrawable(null, new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(uriInputStream2)));
                    return bitmapDrawable2;
                }
                return null;
            default:
                return null;
        }
    }

    private static String typeToString(int i) {
        switch (i) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void addToShortcutIntent(@NonNull Intent intent, @Nullable Drawable drawable, @NonNull Context context) {
        Bitmap bitmapCopy;
        checkResource(context);
        int i = this.mType;
        if (i == 1) {
            bitmapCopy = (Bitmap) this.mObj1;
            if (drawable != null) {
                bitmapCopy = bitmapCopy.copy(bitmapCopy.getConfig(), true);
            }
        } else if (i == 2) {
            try {
                Context contextCreatePackageContext = context.createPackageContext(getResPackage(), 0);
                if (drawable == null) {
                    intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(contextCreatePackageContext, this.mInt1));
                    return;
                }
                Drawable drawable2 = ContextCompat.getDrawable(contextCreatePackageContext, this.mInt1);
                if (drawable2.getIntrinsicWidth() <= 0 || drawable2.getIntrinsicHeight() <= 0) {
                    int launcherLargeIconSize = ((ActivityManager) contextCreatePackageContext.getSystemService("activity")).getLauncherLargeIconSize();
                    bitmapCopy = Bitmap.createBitmap(launcherLargeIconSize, launcherLargeIconSize, Bitmap.Config.ARGB_8888);
                } else {
                    bitmapCopy = Bitmap.createBitmap(drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                }
                drawable2.setBounds(0, 0, bitmapCopy.getWidth(), bitmapCopy.getHeight());
                drawable2.draw(new Canvas(bitmapCopy));
            } catch (PackageManager.NameNotFoundException e) {
                throw new IllegalArgumentException("Can't find package " + this.mObj1, e);
            }
        } else {
            if (i != 5) {
                throw new IllegalArgumentException("Icon type not supported for intent shortcuts");
            }
            bitmapCopy = createLegacyIconFromAdaptiveIcon((Bitmap) this.mObj1, true);
        }
        if (drawable != null) {
            int width = bitmapCopy.getWidth();
            int height = bitmapCopy.getHeight();
            drawable.setBounds(width / 2, height / 2, width, height);
            drawable.draw(new Canvas(bitmapCopy));
        }
        intent.putExtra("android.intent.extra.shortcut.ICON", bitmapCopy);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void checkResource(@NonNull Context context) {
        Object obj;
        if (this.mType != 2 || (obj = this.mObj1) == null) {
            return;
        }
        String str = (String) obj;
        if (str.contains(":")) {
            String str2 = str.split(":", -1)[1];
            String str3 = str2.split("/", -1)[0];
            String str4 = str2.split("/", -1)[1];
            String str5 = str.split(":", -1)[0];
            if ("0_resource_name_obfuscated".equals(str4)) {
                Log.i(TAG, "Found obfuscated resource, not trying to update resource id for it");
                return;
            }
            String resPackage = getResPackage();
            int identifier = getResources(context, resPackage).getIdentifier(str4, str3, str5);
            if (this.mInt1 != identifier) {
                Log.i(TAG, "Id has changed for " + resPackage + " " + str);
                this.mInt1 = identifier;
            }
        }
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public Bitmap getBitmap() {
        int i = this.mType;
        if (i == -1 && Build.VERSION.SDK_INT >= 23) {
            Object obj = this.mObj1;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        if (i == 1) {
            return (Bitmap) this.mObj1;
        }
        if (i == 5) {
            return createLegacyIconFromAdaptiveIcon((Bitmap) this.mObj1, true);
        }
        throw new IllegalStateException("called getBitmap() on " + this);
    }

    @IdRes
    public int getResId() {
        int i = this.mType;
        if (i == -1 && Build.VERSION.SDK_INT >= 23) {
            return getResId(C4726lF.m21924a(this.mObj1));
        }
        if (i == 2) {
            return this.mInt1;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    @NonNull
    public String getResPackage() {
        int i = this.mType;
        if (i == -1 && Build.VERSION.SDK_INT >= 23) {
            return getResPackage(C4726lF.m21924a(this.mObj1));
        }
        if (i == 2) {
            return TextUtils.isEmpty(this.mString1) ? ((String) this.mObj1).split(":", -1)[0] : this.mString1;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public int getType() {
        int i = this.mType;
        return (i != -1 || Build.VERSION.SDK_INT < 23) ? i : getType(C4726lF.m21924a(this.mObj1));
    }

    @NonNull
    public Uri getUri() {
        int i = this.mType;
        if (i == -1 && Build.VERSION.SDK_INT >= 23) {
            return getUri(C4726lF.m21924a(this.mObj1));
        }
        if (i == 4 || i == 6) {
            return Uri.parse((String) this.mObj1);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public InputStream getUriInputStream(@NonNull Context context) {
        StringBuilder sb;
        Uri uri = getUri();
        String scheme = uri.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(uri);
            } catch (Exception e) {
                e = e;
                sb = new StringBuilder("Unable to load image from URI: ");
            }
        } else {
            try {
                return new FileInputStream(new File((String) this.mObj1));
            } catch (FileNotFoundException e2) {
                e = e2;
                sb = new StringBuilder("Unable to load image from path: ");
            }
        }
        sb.append(uri);
        Log.w(TAG, sb.toString(), e);
        return null;
    }

    @Nullable
    public Drawable loadDrawable(@NonNull Context context) {
        checkResource(context);
        if (Build.VERSION.SDK_INT >= 23) {
            return C4701kr.m21852a(toIcon(context), context);
        }
        Drawable drawableLoadDrawableInner = loadDrawableInner(context);
        if (drawableLoadDrawableInner != null && (this.mTintList != null || this.mTintMode != DEFAULT_TINT_MODE)) {
            drawableLoadDrawableInner.mutate();
            DrawableCompat.setTintList(drawableLoadDrawableInner, this.mTintList);
            DrawableCompat.setTintMode(drawableLoadDrawableInner, this.mTintMode);
        }
        return drawableLoadDrawableInner;
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void onPostParceling() {
        Parcelable parcelable;
        this.mTintMode = PorterDuff.Mode.valueOf(this.mTintModeStr);
        switch (this.mType) {
            case -1:
                parcelable = this.mParcelable;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                break;
            case 0:
            default:
                return;
            case 1:
            case 5:
                parcelable = this.mParcelable;
                if (parcelable == null) {
                    byte[] bArr = this.mData;
                    this.mObj1 = bArr;
                    this.mType = 3;
                    this.mInt1 = 0;
                    this.mInt2 = bArr.length;
                    return;
                }
                break;
            case 2:
            case 4:
            case 6:
                String str = new String(this.mData, Charset.forName("UTF-16"));
                this.mObj1 = str;
                if (this.mType == 2 && this.mString1 == null) {
                    this.mString1 = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.mObj1 = this.mData;
                return;
        }
        this.mObj1 = parcelable;
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void onPreParceling(boolean z) {
        this.mTintModeStr = this.mTintMode.name();
        switch (this.mType) {
            case -1:
                if (z) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                break;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (z) {
                    Bitmap bitmap = (Bitmap) this.mObj1;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.mData = byteArrayOutputStream.toByteArray();
                    return;
                }
                break;
            case 2:
                this.mData = ((String) this.mObj1).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.mData = (byte[]) this.mObj1;
                return;
            case 4:
            case 6:
                this.mData = this.mObj1.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
        this.mParcelable = (Parcelable) this.mObj1;
    }

    public IconCompat setTint(@ColorInt int i) {
        return setTintList(ColorStateList.valueOf(i));
    }

    public IconCompat setTintList(ColorStateList colorStateList) {
        this.mTintList = colorStateList;
        return this;
    }

    public IconCompat setTintMode(PorterDuff.Mode mode) {
        this.mTintMode = mode;
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0051  */
    /* JADX WARN: Code duplicated, block: B:16:0x005c  */
    @NonNull
    public Bundle toBundle() {
        Parcelable parcelable;
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        Bundle bundle = new Bundle();
        switch (this.mType) {
            case -1:
                parcelable = (Parcelable) this.mObj1;
                bundle.putParcelable(EXTRA_OBJ, parcelable);
                bundle.putInt("type", this.mType);
                bundle.putInt(EXTRA_INT1, this.mInt1);
                bundle.putInt(EXTRA_INT2, this.mInt2);
                bundle.putString(EXTRA_STRING1, this.mString1);
                colorStateList = this.mTintList;
                if (colorStateList != null) {
                    bundle.putParcelable(EXTRA_TINT_LIST, colorStateList);
                }
                mode = this.mTintMode;
                if (mode != DEFAULT_TINT_MODE) {
                    bundle.putString(EXTRA_TINT_MODE, mode.name());
                }
                return bundle;
            case 0:
            default:
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                parcelable = (Bitmap) this.mObj1;
                bundle.putParcelable(EXTRA_OBJ, parcelable);
                bundle.putInt("type", this.mType);
                bundle.putInt(EXTRA_INT1, this.mInt1);
                bundle.putInt(EXTRA_INT2, this.mInt2);
                bundle.putString(EXTRA_STRING1, this.mString1);
                colorStateList = this.mTintList;
                if (colorStateList != null) {
                    bundle.putParcelable(EXTRA_TINT_LIST, colorStateList);
                }
                mode = this.mTintMode;
                if (mode != DEFAULT_TINT_MODE) {
                    bundle.putString(EXTRA_TINT_MODE, mode.name());
                }
                return bundle;
            case 2:
            case 4:
            case 6:
                bundle.putString(EXTRA_OBJ, (String) this.mObj1);
                bundle.putInt("type", this.mType);
                bundle.putInt(EXTRA_INT1, this.mInt1);
                bundle.putInt(EXTRA_INT2, this.mInt2);
                bundle.putString(EXTRA_STRING1, this.mString1);
                colorStateList = this.mTintList;
                if (colorStateList != null) {
                    bundle.putParcelable(EXTRA_TINT_LIST, colorStateList);
                }
                mode = this.mTintMode;
                if (mode != DEFAULT_TINT_MODE) {
                    bundle.putString(EXTRA_TINT_MODE, mode.name());
                }
                return bundle;
            case 3:
                bundle.putByteArray(EXTRA_OBJ, (byte[]) this.mObj1);
                bundle.putInt("type", this.mType);
                bundle.putInt(EXTRA_INT1, this.mInt1);
                bundle.putInt(EXTRA_INT2, this.mInt2);
                bundle.putString(EXTRA_STRING1, this.mString1);
                colorStateList = this.mTintList;
                if (colorStateList != null) {
                    bundle.putParcelable(EXTRA_TINT_LIST, colorStateList);
                }
                mode = this.mTintMode;
                if (mode != DEFAULT_TINT_MODE) {
                    bundle.putString(EXTRA_TINT_MODE, mode.name());
                }
                return bundle;
        }
    }

    @NonNull
    @RequiresApi(23)
    @Deprecated
    public Icon toIcon() {
        return toIcon(null);
    }

    @NonNull
    public String toString() {
        int height;
        if (this.mType == -1) {
            return String.valueOf(this.mObj1);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(typeToString(this.mType));
        switch (this.mType) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.mObj1).getWidth());
                sb.append("x");
                height = ((Bitmap) this.mObj1).getHeight();
                sb.append(height);
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.mString1);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(getResId())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.mInt1);
                if (this.mInt2 != 0) {
                    sb.append(" off=");
                    height = this.mInt2;
                    sb.append(height);
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.mObj1);
                break;
        }
        if (this.mTintList != null) {
            sb.append(" tint=");
            sb.append(this.mTintList);
        }
        if (this.mTintMode != DEFAULT_TINT_MODE) {
            sb.append(" mode=");
            sb.append(this.mTintMode);
        }
        sb.append(C1313UP.f3459l);
        return sb.toString();
    }

    private IconCompat(int i) {
        this.mData = null;
        this.mParcelable = null;
        this.mInt1 = 0;
        this.mInt2 = 0;
        this.mTintList = null;
        this.mTintMode = DEFAULT_TINT_MODE;
        this.mTintModeStr = null;
        this.mType = i;
    }

    @Nullable
    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static IconCompat createFromIcon(@NonNull Icon icon) {
        Preconditions.checkNotNull(icon);
        int type = getType(icon);
        if (type == 2) {
            return createWithResource(null, getResPackage(icon), getResId(icon));
        }
        if (type == 4) {
            return createWithContentUri(getUri(icon));
        }
        if (type == 6) {
            return createWithAdaptiveBitmapContentUri(getUri(icon));
        }
        IconCompat iconCompat = new IconCompat(-1);
        iconCompat.mObj1 = icon;
        return iconCompat;
    }

    @NonNull
    public static IconCompat createWithAdaptiveBitmapContentUri(@NonNull String str) {
        if (str == null) {
            throw new IllegalArgumentException("Uri must not be null.");
        }
        IconCompat iconCompat = new IconCompat(6);
        iconCompat.mObj1 = str;
        return iconCompat;
    }

    public static IconCompat createWithContentUri(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Uri must not be null.");
        }
        IconCompat iconCompat = new IconCompat(4);
        iconCompat.mObj1 = str;
        return iconCompat;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static IconCompat createWithResource(Resources resources, String str, @DrawableRes int i) {
        if (str == null) {
            throw new IllegalArgumentException("Package must not be null.");
        }
        if (i == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.mInt1 = i;
        if (resources != null) {
            try {
                iconCompat.mObj1 = resources.getResourceName(i);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.mObj1 = str;
        }
        iconCompat.mString1 = str;
        return iconCompat;
    }

    @DrawableRes
    @IdRes
    @RequiresApi(23)
    private static int getResId(@NonNull Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C4764lr.m22012a(icon);
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", null).invoke(icon, null)).intValue();
        } catch (IllegalAccessException e) {
            Log.e(TAG, "Unable to get icon resource", e);
            return 0;
        } catch (NoSuchMethodException e2) {
            Log.e(TAG, "Unable to get icon resource", e2);
            return 0;
        } catch (InvocationTargetException e3) {
            Log.e(TAG, "Unable to get icon resource", e3);
            return 0;
        }
    }

    @Nullable
    @RequiresApi(23)
    private static String getResPackage(@NonNull Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C4835mr.m22224a(icon);
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", null).invoke(icon, null);
        } catch (IllegalAccessException e) {
            Log.e(TAG, "Unable to get icon package", e);
            return null;
        } catch (NoSuchMethodException e2) {
            Log.e(TAG, "Unable to get icon package", e2);
            return null;
        } catch (InvocationTargetException e3) {
            Log.e(TAG, "Unable to get icon package", e3);
            return null;
        }
    }

    @RequiresApi(23)
    private static int getType(@NonNull Icon icon) {
        StringBuilder sb;
        if (Build.VERSION.SDK_INT >= 28) {
            return C4637jr.m21656a(icon);
        }
        try {
            return ((Integer) icon.getClass().getMethod("getType", null).invoke(icon, null)).intValue();
        } catch (IllegalAccessException e) {
            e = e;
            sb = new StringBuilder("Unable to get icon type ");
            sb.append(icon);
            Log.e(TAG, sb.toString(), e);
            return -1;
        } catch (NoSuchMethodException e2) {
            e = e2;
            sb = new StringBuilder("Unable to get icon type ");
            sb.append(icon);
            Log.e(TAG, sb.toString(), e);
            return -1;
        } catch (InvocationTargetException e3) {
            e = e3;
            sb = new StringBuilder("Unable to get icon type ");
            sb.append(icon);
            Log.e(TAG, sb.toString(), e);
            return -1;
        }
    }

    @Nullable
    @RequiresApi(23)
    private static Uri getUri(@NonNull Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C4440gr.m20875a(icon);
        }
        try {
            return (Uri) icon.getClass().getMethod("getUri", null).invoke(icon, null);
        } catch (IllegalAccessException e) {
            Log.e(TAG, "Unable to get icon uri", e);
            return null;
        } catch (NoSuchMethodException e2) {
            Log.e(TAG, "Unable to get icon uri", e2);
            return null;
        } catch (InvocationTargetException e3) {
            Log.e(TAG, "Unable to get icon uri", e3);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ad  */
    @NonNull
    @RequiresApi(23)
    public Icon toIcon(@Nullable Context context) {
        Bitmap bitmapCreateLegacyIconFromAdaptiveIcon;
        Icon iconM27993a;
        Bitmap bitmapDecodeStream;
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        switch (this.mType) {
            case -1:
                return C4726lF.m21924a(this.mObj1);
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                bitmapCreateLegacyIconFromAdaptiveIcon = (Bitmap) this.mObj1;
                iconM27993a = C5204pr.m27550a(bitmapCreateLegacyIconFromAdaptiveIcon);
                colorStateList = this.mTintList;
                if (colorStateList != null) {
                    C4900nr.m22528a(iconM27993a, colorStateList);
                }
                mode = this.mTintMode;
                if (mode != DEFAULT_TINT_MODE) {
                    C4963or.m22795a(iconM27993a, mode);
                }
                return iconM27993a;
            case 2:
                iconM27993a = C5330rr.m27993a(getResPackage(), this.mInt1);
                colorStateList = this.mTintList;
                if (colorStateList != null) {
                    C4900nr.m22528a(iconM27993a, colorStateList);
                }
                mode = this.mTintMode;
                if (mode != DEFAULT_TINT_MODE) {
                    C4963or.m22795a(iconM27993a, mode);
                }
                return iconM27993a;
            case 3:
                iconM27993a = C5401sr.m28295a((byte[]) this.mObj1, this.mInt1, this.mInt2);
                colorStateList = this.mTintList;
                if (colorStateList != null) {
                    C4900nr.m22528a(iconM27993a, colorStateList);
                }
                mode = this.mTintMode;
                if (mode != DEFAULT_TINT_MODE) {
                    C4963or.m22795a(iconM27993a, mode);
                }
                return iconM27993a;
            case 4:
                iconM27993a = C4503hr.m21133a((String) this.mObj1);
                colorStateList = this.mTintList;
                if (colorStateList != null) {
                    C4900nr.m22528a(iconM27993a, colorStateList);
                }
                mode = this.mTintMode;
                if (mode != DEFAULT_TINT_MODE) {
                    C4963or.m22795a(iconM27993a, mode);
                }
                return iconM27993a;
            case 5:
                if (Build.VERSION.SDK_INT >= 26) {
                    bitmapDecodeStream = (Bitmap) this.mObj1;
                    iconM27993a = C5267qr.m27761a(bitmapDecodeStream);
                    colorStateList = this.mTintList;
                    if (colorStateList != null) {
                        C4900nr.m22528a(iconM27993a, colorStateList);
                    }
                    mode = this.mTintMode;
                    if (mode != DEFAULT_TINT_MODE) {
                        C4963or.m22795a(iconM27993a, mode);
                    }
                    return iconM27993a;
                }
                bitmapDecodeStream = (Bitmap) this.mObj1;
                bitmapCreateLegacyIconFromAdaptiveIcon = createLegacyIconFromAdaptiveIcon(bitmapDecodeStream, false);
                iconM27993a = C5204pr.m27550a(bitmapCreateLegacyIconFromAdaptiveIcon);
                colorStateList = this.mTintList;
                if (colorStateList != null) {
                    C4900nr.m22528a(iconM27993a, colorStateList);
                }
                mode = this.mTintMode;
                if (mode != DEFAULT_TINT_MODE) {
                    C4963or.m22795a(iconM27993a, mode);
                }
                return iconM27993a;
            case 6:
                int i = Build.VERSION.SDK_INT;
                if (i >= 30) {
                    iconM27993a = C4575ir.m21448a(getUri());
                } else {
                    if (context == null) {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + getUri());
                    }
                    InputStream uriInputStream = getUriInputStream(context);
                    if (uriInputStream == null) {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + getUri());
                    }
                    bitmapDecodeStream = BitmapFactory.decodeStream(uriInputStream);
                    if (i >= 26) {
                        iconM27993a = C5267qr.m27761a(bitmapDecodeStream);
                    } else {
                        bitmapCreateLegacyIconFromAdaptiveIcon = createLegacyIconFromAdaptiveIcon(bitmapDecodeStream, false);
                        iconM27993a = C5204pr.m27550a(bitmapCreateLegacyIconFromAdaptiveIcon);
                    }
                }
                colorStateList = this.mTintList;
                if (colorStateList != null) {
                    C4900nr.m22528a(iconM27993a, colorStateList);
                }
                mode = this.mTintMode;
                if (mode != DEFAULT_TINT_MODE) {
                    C4963or.m22795a(iconM27993a, mode);
                }
                return iconM27993a;
        }
    }
}
