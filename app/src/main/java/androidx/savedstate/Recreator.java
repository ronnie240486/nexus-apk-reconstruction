package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p000.C0060Av;
import p000.C5312rZ;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedApi"})
final class Recreator implements GenericLifecycleObserver {
    static final String CLASSES_KEY = "classes_to_restore";
    static final String COMPONENT_KEY = "androidx.savedstate.Restarter";
    private final SavedStateRegistryOwner mOwner;

    public static final class SavedStateProvider implements SavedStateRegistry.SavedStateProvider {
        final Set<String> mClasses = new HashSet();

        public SavedStateProvider(SavedStateRegistry savedStateRegistry) {
            savedStateRegistry.registerSavedStateProvider(Recreator.COMPONENT_KEY, this);
        }

        public void add(String str) {
            this.mClasses.add(str);
        }

        @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
        @NonNull
        public Bundle saveState() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList(Recreator.CLASSES_KEY, new ArrayList<>(this.mClasses));
            return bundle;
        }
    }

    public Recreator(SavedStateRegistryOwner savedStateRegistryOwner) {
        this.mOwner = savedStateRegistryOwner;
    }

    private void reflectiveNew(String str) {
        try {
            Class<? extends U> clsAsSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(SavedStateRegistry.AutoRecreated.class);
            try {
                Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                try {
                    ((SavedStateRegistry.AutoRecreated) declaredConstructor.newInstance(null)).onRecreated(this.mOwner);
                } catch (Exception e) {
                    throw new RuntimeException(C5312rZ.m27869a("Failed to instantiate ", str), e);
                }
            } catch (NoSuchMethodException e2) {
                throw new IllegalStateException("Class" + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
            }
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException(C0060Av.m278a("Class ", str, " wasn't found"), e3);
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event != Lifecycle.Event.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        lifecycleOwner.getLifecycle().removeObserver(this);
        Bundle bundleConsumeRestoredStateForKey = this.mOwner.getSavedStateRegistry().consumeRestoredStateForKey(COMPONENT_KEY);
        if (bundleConsumeRestoredStateForKey == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleConsumeRestoredStateForKey.getStringArrayList(CLASSES_KEY);
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        Iterator<String> it = stringArrayList.iterator();
        while (it.hasNext()) {
            reflectiveNew(it.next());
        }
    }
}
