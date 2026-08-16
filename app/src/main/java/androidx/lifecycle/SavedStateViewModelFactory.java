package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class SavedStateViewModelFactory extends ViewModelProvider.KeyedFactory {
    private static final Class<?>[] ANDROID_VIEWMODEL_SIGNATURE = {Application.class, SavedStateHandle.class};
    private static final Class<?>[] VIEWMODEL_SIGNATURE = {SavedStateHandle.class};
    private final Application mApplication;
    private final Bundle mDefaultArgs;
    private final ViewModelProvider.Factory mFactory;
    private final Lifecycle mLifecycle;
    private final SavedStateRegistry mSavedStateRegistry;

    public SavedStateViewModelFactory(@Nullable Application application, @NonNull SavedStateRegistryOwner owner) {
        this(application, owner, null);
    }

    private static <T> Constructor<T> findMatchingConstructor(Class<T> cls, Class<?>[] clsArr) {
        for (Object obj : cls.getConstructors()) {
            Constructor<T> constructor = (Constructor<T>) obj;
            if (Arrays.equals(clsArr, constructor.getParameterTypes())) {
                return constructor;
            }
        }
        return null;
    }

    @Override // androidx.lifecycle.ViewModelProvider.KeyedFactory, androidx.lifecycle.ViewModelProvider.Factory
    @NonNull
    public <T extends ViewModel> T create(@NonNull Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) create(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.ViewModelProvider.OnRequeryFactory
    public void onRequery(@NonNull ViewModel viewModel) {
        SavedStateHandleController.attachHandleIfNeeded(viewModel, this.mSavedStateRegistry, this.mLifecycle);
    }

    @SuppressLint({"LambdaLast"})
    public SavedStateViewModelFactory(@Nullable Application application, @NonNull SavedStateRegistryOwner owner, @Nullable Bundle defaultArgs) {
        this.mSavedStateRegistry = owner.getSavedStateRegistry();
        this.mLifecycle = owner.getLifecycle();
        this.mDefaultArgs = defaultArgs;
        this.mApplication = application;
        this.mFactory = application != null ? ViewModelProvider.AndroidViewModelFactory.getInstance(application) : ViewModelProvider.NewInstanceFactory.getInstance();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004c A[Catch: InvocationTargetException -> 0x0046, InstantiationException -> 0x0048, IllegalAccessException -> 0x004a, TryCatch #2 {IllegalAccessException -> 0x004a, InstantiationException -> 0x0048, InvocationTargetException -> 0x0046, blocks: (B:13:0x0030, B:15:0x0034, B:16:0x0043, B:24:0x0059, B:23:0x004c), top: B:33:0x0030 }] */
    @Override // androidx.lifecycle.ViewModelProvider.KeyedFactory
    @NonNull
    public <T extends ViewModel> T create(@NonNull String str, @NonNull Class<T> cls) {
        Object objNewInstance;
        boolean zIsAssignableFrom = AndroidViewModel.class.isAssignableFrom(cls);
        Constructor constructorFindMatchingConstructor = (!zIsAssignableFrom || this.mApplication == null) ? findMatchingConstructor(cls, VIEWMODEL_SIGNATURE) : findMatchingConstructor(cls, ANDROID_VIEWMODEL_SIGNATURE);
        if (constructorFindMatchingConstructor == null) {
            return (T) this.mFactory.create(cls);
        }
        SavedStateHandleController savedStateHandleControllerCreate = SavedStateHandleController.create(this.mSavedStateRegistry, this.mLifecycle, str, this.mDefaultArgs);
        if (zIsAssignableFrom) {
            try {
                Application application = this.mApplication;
                if (application != null) {
                    objNewInstance = constructorFindMatchingConstructor.newInstance(application, savedStateHandleControllerCreate.getHandle());
                } else {
                    objNewInstance = constructorFindMatchingConstructor.newInstance(savedStateHandleControllerCreate.getHandle());
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Failed to access " + cls, e);
            } catch (InstantiationException e2) {
                throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
            } catch (InvocationTargetException e3) {
                throw new RuntimeException("An exception happened in constructor of " + cls, e3.getCause());
            }
        } else {
            objNewInstance = constructorFindMatchingConstructor.newInstance(savedStateHandleControllerCreate.getHandle());
        }
        T t = (T) objNewInstance;
        t.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", savedStateHandleControllerCreate);
        return t;
    }
}
