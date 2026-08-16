package androidx.core.view;

import android.os.Build;
import android.view.WindowInsetsAnimationController;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.Insets;
import p000.A40;
import p000.B40;
import p000.C40;
import p000.C6058t40;
import p000.C6065u40;
import p000.C6072v40;
import p000.C6079w40;
import p000.C6086x40;
import p000.C6093y40;
import p000.C6100z40;
import p000.D40;
import p000.E40;

/* JADX INFO: loaded from: classes.dex */
public final class WindowInsetsAnimationControllerCompat {
    private final Impl mImpl;

    public static class Impl {
        public void finish(boolean z) {
        }

        public float getCurrentAlpha() {
            return 0.0f;
        }

        @FloatRange(from = 0.0d, m14515to = 1.0d)
        public float getCurrentFraction() {
            return 0.0f;
        }

        @NonNull
        public Insets getCurrentInsets() {
            return Insets.NONE;
        }

        @NonNull
        public Insets getHiddenStateInsets() {
            return Insets.NONE;
        }

        @NonNull
        public Insets getShownStateInsets() {
            return Insets.NONE;
        }

        public int getTypes() {
            return 0;
        }

        public boolean isCancelled() {
            return true;
        }

        public boolean isFinished() {
            return false;
        }

        public boolean isReady() {
            return false;
        }

        public void setInsetsAndAlpha(@Nullable Insets insets, @FloatRange(from = 0.0d, m14515to = 1.0d) float f, @FloatRange(from = 0.0d, m14515to = 1.0d) float f2) {
        }
    }

    @RequiresApi(30)
    public static class Impl30 extends Impl {
        private final WindowInsetsAnimationController mController;

        public Impl30(@NonNull WindowInsetsAnimationController windowInsetsAnimationController) {
            this.mController = windowInsetsAnimationController;
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.Impl
        public void finish(boolean z) {
            C6065u40.m28568a(this.mController, z);
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.Impl
        public float getCurrentAlpha() {
            return B40.m452a(this.mController);
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.Impl
        public float getCurrentFraction() {
            return A40.m94a(this.mController);
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.Impl
        @NonNull
        public Insets getCurrentInsets() {
            return Insets.toCompatInsets(C40.m903a(this.mController));
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.Impl
        @NonNull
        public Insets getHiddenStateInsets() {
            return Insets.toCompatInsets(C6072v40.m28756a(this.mController));
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.Impl
        @NonNull
        public Insets getShownStateInsets() {
            return Insets.toCompatInsets(C6079w40.m29219a(this.mController));
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.Impl
        public int getTypes() {
            return C6093y40.m29750a(this.mController);
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.Impl
        public boolean isCancelled() {
            return D40.m1306a(this.mController);
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.Impl
        public boolean isFinished() {
            return C6100z40.m29948a(this.mController);
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.Impl
        public boolean isReady() {
            return C6086x40.m29395a(this.mController);
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.Impl
        public void setInsetsAndAlpha(@Nullable Insets insets, float f, float f2) {
            E40.m1528a(this.mController, insets == null ? null : insets.toPlatformInsets(), f, f2);
        }
    }

    public WindowInsetsAnimationControllerCompat() {
        if (Build.VERSION.SDK_INT < 30) {
            this.mImpl = new Impl();
            return;
        }
        throw new UnsupportedOperationException("On API 30+, the constructor taking a " + C6058t40.m28363a().getSimpleName() + " as parameter");
    }

    public void finish(boolean z) {
        this.mImpl.finish(z);
    }

    public float getCurrentAlpha() {
        return this.mImpl.getCurrentAlpha();
    }

    @FloatRange(from = 0.0d, m14515to = 1.0d)
    public float getCurrentFraction() {
        return this.mImpl.getCurrentFraction();
    }

    @NonNull
    public Insets getCurrentInsets() {
        return this.mImpl.getCurrentInsets();
    }

    @NonNull
    public Insets getHiddenStateInsets() {
        return this.mImpl.getHiddenStateInsets();
    }

    @NonNull
    public Insets getShownStateInsets() {
        return this.mImpl.getShownStateInsets();
    }

    public int getTypes() {
        return this.mImpl.getTypes();
    }

    public boolean isCancelled() {
        return this.mImpl.isCancelled();
    }

    public boolean isFinished() {
        return this.mImpl.isFinished();
    }

    public boolean isReady() {
        return (isFinished() || isCancelled()) ? false : true;
    }

    public void setInsetsAndAlpha(@Nullable Insets insets, @FloatRange(from = 0.0d, m14515to = 1.0d) float f, @FloatRange(from = 0.0d, m14515to = 1.0d) float f2) {
        this.mImpl.setInsetsAndAlpha(insets, f, f2);
    }

    @RequiresApi(30)
    public WindowInsetsAnimationControllerCompat(@NonNull WindowInsetsAnimationController windowInsetsAnimationController) {
        this.mImpl = new Impl30(windowInsetsAnimationController);
    }
}
