package androidx.core.text;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.Layout;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.GuardedBy;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import androidx.core.os.TraceCompat;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import p000.C0413GK;
import p000.C0477HK;
import p000.C0540IK;
import p000.C0603JK;
import p000.C0668KK;
import p000.C0714L3;
import p000.C0734LK;
import p000.C0796MK;
import p000.C0859NK;
import p000.C0923OK;
import p000.C0989PK;
import p000.C1035Q3;
import p000.C1162S3;
import p000.C1179SK;
import p000.C1244TK;
import p000.C1290U3;
import p000.C1308UK;
import p000.C1354V3;
import p000.C1376VK;
import p000.C1440WK;
import p000.C1503XK;
import p000.C1566YK;
import p000.C1634ZK;
import p000.C4848n3;

/* JADX INFO: loaded from: classes.dex */
public class PrecomputedTextCompat implements Spannable {
    private static final char LINE_FEED = '\n';

    @NonNull
    @GuardedBy("sLock")
    private static Executor sExecutor;
    private static final Object sLock = new Object();

    @NonNull
    private final int[] mParagraphEnds;

    @NonNull
    private final Params mParams;

    @NonNull
    private final Spannable mText;

    @Nullable
    private final PrecomputedText mWrapped;

    public static final class Params {
        private final int mBreakStrategy;
        private final int mHyphenationFrequency;

        @NonNull
        private final TextPaint mPaint;

        @Nullable
        private final TextDirectionHeuristic mTextDir;
        final PrecomputedText.Params mWrapped;

        public static class Builder {
            private int mBreakStrategy;
            private int mHyphenationFrequency;

            @NonNull
            private final TextPaint mPaint;
            private TextDirectionHeuristic mTextDir;

            public Builder(@NonNull TextPaint textPaint) {
                this.mPaint = textPaint;
                if (Build.VERSION.SDK_INT >= 23) {
                    this.mBreakStrategy = 1;
                    this.mHyphenationFrequency = 1;
                } else {
                    this.mHyphenationFrequency = 0;
                    this.mBreakStrategy = 0;
                }
                this.mTextDir = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }

            @NonNull
            public Params build() {
                return new Params(this.mPaint, this.mTextDir, this.mBreakStrategy, this.mHyphenationFrequency);
            }

            @RequiresApi(23)
            public Builder setBreakStrategy(int i) {
                this.mBreakStrategy = i;
                return this;
            }

            @RequiresApi(23)
            public Builder setHyphenationFrequency(int i) {
                this.mHyphenationFrequency = i;
                return this;
            }

            @RequiresApi(18)
            public Builder setTextDirection(@NonNull TextDirectionHeuristic textDirectionHeuristic) {
                this.mTextDir = textDirectionHeuristic;
                return this;
            }
        }

        @RequiresApi(28)
        public Params(@NonNull PrecomputedText.Params params) {
            this.mPaint = C1440WK.m6780a(params);
            this.mTextDir = C1503XK.m7054a(params);
            this.mBreakStrategy = C1566YK.m8118a(params);
            this.mHyphenationFrequency = C1634ZK.m8676a(params);
            this.mWrapped = Build.VERSION.SDK_INT < 29 ? null : params;
        }

        public boolean equals(@Nullable Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Params)) {
                return false;
            }
            Params params = (Params) obj;
            return equalsWithoutTextDirection(params) && this.mTextDir == params.getTextDirection();
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public boolean equalsWithoutTextDirection(@NonNull Params params) {
            int i = Build.VERSION.SDK_INT;
            if ((i >= 23 && (this.mBreakStrategy != params.getBreakStrategy() || this.mHyphenationFrequency != params.getHyphenationFrequency())) || this.mPaint.getTextSize() != params.getTextPaint().getTextSize() || this.mPaint.getTextScaleX() != params.getTextPaint().getTextScaleX() || this.mPaint.getTextSkewX() != params.getTextPaint().getTextSkewX()) {
                return false;
            }
            if ((i >= 21 && (C0989PK.m4392a(this.mPaint) != C0989PK.m4392a(params.getTextPaint()) || !TextUtils.equals(C1179SK.m5476a(this.mPaint), C1179SK.m5476a(params.getTextPaint())))) || this.mPaint.getFlags() != params.getTextPaint().getFlags()) {
                return false;
            }
            if (i >= 24) {
                if (!C4848n3.m22275a(C1308UK.m6219a(this.mPaint), C1308UK.m6219a(params.getTextPaint()))) {
                    return false;
                }
            } else if (!this.mPaint.getTextLocale().equals(params.getTextPaint().getTextLocale())) {
                return false;
            }
            if (this.mPaint.getTypeface() == null) {
                return params.getTextPaint().getTypeface() == null;
            }
            return this.mPaint.getTypeface().equals(params.getTextPaint().getTypeface());
        }

        @RequiresApi(23)
        public int getBreakStrategy() {
            return this.mBreakStrategy;
        }

        @RequiresApi(23)
        public int getHyphenationFrequency() {
            return this.mHyphenationFrequency;
        }

        @Nullable
        @RequiresApi(18)
        public TextDirectionHeuristic getTextDirection() {
            return this.mTextDir;
        }

        @NonNull
        public TextPaint getTextPaint() {
            return this.mPaint;
        }

        public int hashCode() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                return ObjectsCompat.hash(Float.valueOf(this.mPaint.getTextSize()), Float.valueOf(this.mPaint.getTextScaleX()), Float.valueOf(this.mPaint.getTextSkewX()), Float.valueOf(C0989PK.m4392a(this.mPaint)), Integer.valueOf(this.mPaint.getFlags()), C1308UK.m6219a(this.mPaint), this.mPaint.getTypeface(), Boolean.valueOf(C1244TK.m5773a(this.mPaint)), this.mTextDir, Integer.valueOf(this.mBreakStrategy), Integer.valueOf(this.mHyphenationFrequency));
            }
            return i >= 21 ? ObjectsCompat.hash(Float.valueOf(this.mPaint.getTextSize()), Float.valueOf(this.mPaint.getTextScaleX()), Float.valueOf(this.mPaint.getTextSkewX()), Float.valueOf(C0989PK.m4392a(this.mPaint)), Integer.valueOf(this.mPaint.getFlags()), this.mPaint.getTextLocale(), this.mPaint.getTypeface(), Boolean.valueOf(C1244TK.m5773a(this.mPaint)), this.mTextDir, Integer.valueOf(this.mBreakStrategy), Integer.valueOf(this.mHyphenationFrequency)) : ObjectsCompat.hash(Float.valueOf(this.mPaint.getTextSize()), Float.valueOf(this.mPaint.getTextScaleX()), Float.valueOf(this.mPaint.getTextSkewX()), Integer.valueOf(this.mPaint.getFlags()), this.mPaint.getTextLocale(), this.mPaint.getTypeface(), this.mTextDir, Integer.valueOf(this.mBreakStrategy), Integer.valueOf(this.mHyphenationFrequency));
        }

        public String toString() {
            StringBuilder sb;
            Object textLocale;
            StringBuilder sb2 = new StringBuilder("{");
            sb2.append("textSize=" + this.mPaint.getTextSize());
            sb2.append(", textScaleX=" + this.mPaint.getTextScaleX());
            sb2.append(", textSkewX=" + this.mPaint.getTextSkewX());
            int i = Build.VERSION.SDK_INT;
            if (i >= 21) {
                sb2.append(", letterSpacing=" + C0989PK.m4392a(this.mPaint));
                sb2.append(", elegantTextHeight=" + C1244TK.m5773a(this.mPaint));
            }
            if (i >= 24) {
                sb = new StringBuilder(", textLocale=");
                textLocale = C1308UK.m6219a(this.mPaint);
            } else {
                sb = new StringBuilder(", textLocale=");
                textLocale = this.mPaint.getTextLocale();
            }
            sb.append(textLocale);
            sb2.append(sb.toString());
            sb2.append(", typeface=" + this.mPaint.getTypeface());
            if (i >= 26) {
                sb2.append(", variationSettings=" + C1376VK.m6506a(this.mPaint));
            }
            sb2.append(", textDir=" + this.mTextDir);
            sb2.append(", breakStrategy=" + this.mBreakStrategy);
            sb2.append(", hyphenationFrequency=" + this.mHyphenationFrequency);
            sb2.append("}");
            return sb2.toString();
        }

        @SuppressLint({"NewApi"})
        public Params(@NonNull TextPaint textPaint, @NonNull TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            this.mWrapped = Build.VERSION.SDK_INT >= 29 ? new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build() : null;
            this.mPaint = textPaint;
            this.mTextDir = textDirectionHeuristic;
            this.mBreakStrategy = i;
            this.mHyphenationFrequency = i2;
        }
    }

    public static class PrecomputedTextFutureTask extends FutureTask<PrecomputedTextCompat> {

        public static class PrecomputedTextCallback implements Callable<PrecomputedTextCompat> {
            private Params mParams;
            private CharSequence mText;

            public PrecomputedTextCallback(@NonNull Params params, @NonNull CharSequence charSequence) {
                this.mParams = params;
                this.mText = charSequence;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public PrecomputedTextCompat call() throws Exception {
                return PrecomputedTextCompat.create(this.mText, this.mParams);
            }
        }

        public PrecomputedTextFutureTask(@NonNull Params params, @NonNull CharSequence charSequence) {
            super(new PrecomputedTextCallback(params, charSequence));
        }
    }

    @RequiresApi(28)
    private PrecomputedTextCompat(@NonNull PrecomputedText precomputedText, @NonNull Params params) {
        this.mText = precomputedText;
        this.mParams = params;
        this.mParagraphEnds = null;
        this.mWrapped = Build.VERSION.SDK_INT < 29 ? null : precomputedText;
    }

    @SuppressLint({"NewApi"})
    public static PrecomputedTextCompat create(@NonNull CharSequence charSequence, @NonNull Params params) {
        PrecomputedText.Params params2;
        Preconditions.checkNotNull(charSequence);
        Preconditions.checkNotNull(params);
        try {
            TraceCompat.beginSection("PrecomputedText");
            if (Build.VERSION.SDK_INT >= 29 && (params2 = params.mWrapped) != null) {
                return new PrecomputedTextCompat(C0413GK.m2037a(charSequence, params2), params);
            }
            ArrayList arrayList = new ArrayList();
            int length = charSequence.length();
            int i = 0;
            while (i < length) {
                int iIndexOf = TextUtils.indexOf(charSequence, '\n', i, length);
                i = iIndexOf < 0 ? length : iIndexOf + 1;
                arrayList.add(Integer.valueOf(i));
            }
            int[] iArr = new int[arrayList.size()];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                iArr[i2] = ((Integer) arrayList.get(i2)).intValue();
            }
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 23) {
                C1290U3.m6155a(C1354V3.m6438a(C1162S3.m5424a(C1035Q3.m4579a(C0714L3.m3356a(charSequence, 0, charSequence.length(), params.getTextPaint(), Integer.MAX_VALUE), params.getBreakStrategy()), params.getHyphenationFrequency()), params.getTextDirection()));
            } else if (i3 >= 21) {
                new StaticLayout(charSequence, params.getTextPaint(), Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            return new PrecomputedTextCompat(charSequence, params, iArr);
        } finally {
            TraceCompat.endSection();
        }
    }

    @UiThread
    public static Future<PrecomputedTextCompat> getTextFuture(@NonNull CharSequence charSequence, @NonNull Params params, @Nullable Executor executor) {
        PrecomputedTextFutureTask precomputedTextFutureTask = new PrecomputedTextFutureTask(params, charSequence);
        if (executor == null) {
            synchronized (sLock) {
                try {
                    if (sExecutor == null) {
                        sExecutor = Executors.newFixedThreadPool(1);
                    }
                    executor = sExecutor;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        executor.execute(precomputedTextFutureTask);
        return precomputedTextFutureTask;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.mText.charAt(i);
    }

    @IntRange(from = 0)
    @SuppressLint({"NewApi"})
    public int getParagraphCount() {
        return Build.VERSION.SDK_INT >= 29 ? C0668KK.m3137a(this.mWrapped) : this.mParagraphEnds.length;
    }

    @IntRange(from = 0)
    @SuppressLint({"NewApi"})
    public int getParagraphEnd(@IntRange(from = 0) int i) {
        Preconditions.checkArgumentInRange(i, 0, getParagraphCount(), "paraIndex");
        return Build.VERSION.SDK_INT >= 29 ? C0859NK.m3974a(this.mWrapped, i) : this.mParagraphEnds[i];
    }

    @IntRange(from = 0)
    @SuppressLint({"NewApi"})
    public int getParagraphStart(@IntRange(from = 0) int i) {
        Preconditions.checkArgumentInRange(i, 0, getParagraphCount(), "paraIndex");
        if (Build.VERSION.SDK_INT >= 29) {
            return C0923OK.m4242a(this.mWrapped, i);
        }
        if (i == 0) {
            return 0;
        }
        return this.mParagraphEnds[i - 1];
    }

    @NonNull
    public Params getParams() {
        return this.mParams;
    }

    @Nullable
    @RequiresApi(28)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PrecomputedText getPrecomputedText() {
        if (C0477HK.m2286a(this.mText)) {
            return C0540IK.m2513a(this.mText);
        }
        return null;
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.mText.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.mText.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.mText.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    @SuppressLint({"NewApi"})
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 29 ? (T[]) C0603JK.m2943a(this.mWrapped, i, i2, cls) : (T[]) this.mText.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.mText.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.mText.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    @SuppressLint({"NewApi"})
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            C0734LK.m3445a(this.mWrapped, obj);
        } else {
            this.mText.removeSpan(obj);
        }
    }

    @Override // android.text.Spannable
    @SuppressLint({"NewApi"})
    public void setSpan(Object obj, int i, int i2, int i3) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            C0796MK.m3696a(this.mWrapped, obj, i, i2, i3);
        } else {
            this.mText.setSpan(obj, i, i2, i3);
        }
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return this.mText.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    @NonNull
    public String toString() {
        return this.mText.toString();
    }

    private PrecomputedTextCompat(@NonNull CharSequence charSequence, @NonNull Params params, @NonNull int[] iArr) {
        this.mText = new SpannableString(charSequence);
        this.mParams = params;
        this.mParagraphEnds = iArr;
        this.mWrapped = null;
    }
}
