package com.google.android.gms.common.internal.safeparcel;

import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public interface SafeParcelable extends Parcelable {

    @NonNull
    public static final String NULL = "SAFE_PARCELABLE_NULL_STRING";

    public @interface Class {
        @NonNull
        String creator();

        boolean doNotParcelTypeDefaultValues() default false;

        boolean validate() default false;
    }

    public @interface Constructor {
    }

    public @interface Field {
        @NonNull
        String defaultValue() default "SAFE_PARCELABLE_NULL_STRING";

        @NonNull
        String defaultValueUnchecked() default "SAFE_PARCELABLE_NULL_STRING";

        @NonNull
        String getter() default "SAFE_PARCELABLE_NULL_STRING";

        /* JADX INFO: renamed from: id */
        int m17610id();

        @NonNull
        String type() default "SAFE_PARCELABLE_NULL_STRING";
    }

    public @interface Indicator {
        @NonNull
        String getter() default "SAFE_PARCELABLE_NULL_STRING";
    }

    public @interface Param {
        /* JADX INFO: renamed from: id */
        int m17611id();
    }

    public @interface RemovedParam {
        @NonNull
        String defaultValue() default "SAFE_PARCELABLE_NULL_STRING";

        @NonNull
        String defaultValueUnchecked() default "SAFE_PARCELABLE_NULL_STRING";

        /* JADX INFO: renamed from: id */
        int m17612id();
    }

    public @interface Reserved {
        @NonNull
        int[] value();
    }

    public @interface VersionField {
        @NonNull
        String getter() default "SAFE_PARCELABLE_NULL_STRING";

        /* JADX INFO: renamed from: id */
        int m17613id();

        @NonNull
        String type() default "SAFE_PARCELABLE_NULL_STRING";
    }
}
