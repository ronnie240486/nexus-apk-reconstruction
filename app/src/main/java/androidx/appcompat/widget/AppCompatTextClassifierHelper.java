package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;
import p000.C0004A3;
import p000.C0069B3;
import p000.C0133C3;
import p000.C5762y3;
import p000.C5827z3;

/* JADX INFO: loaded from: classes.dex */
final class AppCompatTextClassifierHelper {

    @Nullable
    private TextClassifier mTextClassifier;

    @NonNull
    private TextView mTextView;

    public AppCompatTextClassifierHelper(@NonNull TextView textView) {
        this.mTextView = (TextView) Preconditions.checkNotNull(textView);
    }

    @NonNull
    @RequiresApi(api = 26)
    public TextClassifier getTextClassifier() {
        TextClassifier textClassifier = this.mTextClassifier;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManagerM77a = C0004A3.m77a(C5827z3.m29927a(this.mTextView.getContext(), C5762y3.m29736a()));
        return textClassificationManagerM77a != null ? C0069B3.m434a(textClassificationManagerM77a) : C0133C3.m827a();
    }

    @RequiresApi(api = 26)
    public void setTextClassifier(@Nullable TextClassifier textClassifier) {
        this.mTextClassifier = textClassifier;
    }
}
