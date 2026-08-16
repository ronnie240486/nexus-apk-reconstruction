package com.google.firebase.components;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.firebase.components.ComponentContainer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class Component<T> {
    private final Set<Dependency> dependencies;
    private final ComponentFactory<T> factory;
    private final int instantiation;
    private final String name;
    private final Set<Class<? super T>> providedInterfaces;
    private final Set<Class<?>> publishedEvents;
    private final int type;

    public static class Builder<T> {
        private final Set<Dependency> dependencies;
        private ComponentFactory<T> factory;
        private int instantiation;
        private String name;
        private final Set<Class<? super T>> providedInterfaces;
        private Set<Class<?>> publishedEvents;
        private int type;

        @SafeVarargs
        private Builder(Class<T> cls, Class<? super T>... clsArr) {
            this.name = null;
            HashSet hashSet = new HashSet();
            this.providedInterfaces = hashSet;
            this.dependencies = new HashSet();
            this.instantiation = 0;
            this.type = 0;
            this.publishedEvents = new HashSet();
            Preconditions.checkNotNull(cls, "Null interface");
            hashSet.add(cls);
            for (Class<? super T> cls2 : clsArr) {
                Preconditions.checkNotNull(cls2, "Null interface");
            }
            Collections.addAll(this.providedInterfaces, clsArr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @CanIgnoreReturnValue
        public Builder<T> intoSet() {
            this.type = 1;
            return this;
        }

        @CanIgnoreReturnValue
        private Builder<T> setInstantiation(int i) {
            Preconditions.checkState(this.instantiation == 0, "Instantiation type has already been set.");
            this.instantiation = i;
            return this;
        }

        private void validateInterface(Class<?> cls) {
            Preconditions.checkArgument(!this.providedInterfaces.contains(cls), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        @CanIgnoreReturnValue
        public Builder<T> add(Dependency dependency) {
            Preconditions.checkNotNull(dependency, "Null dependency");
            validateInterface(dependency.getInterface());
            this.dependencies.add(dependency);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<T> alwaysEager() {
            return setInstantiation(1);
        }

        public Component<T> build() {
            Preconditions.checkState(this.factory != null, "Missing required property: factory.");
            return new Component<>(this.name, new HashSet(this.providedInterfaces), new HashSet(this.dependencies), this.instantiation, this.type, this.factory, this.publishedEvents);
        }

        @CanIgnoreReturnValue
        public Builder<T> eagerInDefaultApp() {
            return setInstantiation(2);
        }

        @CanIgnoreReturnValue
        public Builder<T> factory(ComponentFactory<T> componentFactory) {
            this.factory = (ComponentFactory) Preconditions.checkNotNull(componentFactory, "Null factory");
            return this;
        }

        public Builder<T> name(@NonNull String str) {
            this.name = str;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<T> publishes(Class<?> cls) {
            this.publishedEvents.add(cls);
            return this;
        }
    }

    private Component(@Nullable String str, Set<Class<? super T>> set, Set<Dependency> set2, int i, int i2, ComponentFactory<T> componentFactory, Set<Class<?>> set3) {
        this.name = str;
        this.providedInterfaces = Collections.unmodifiableSet(set);
        this.dependencies = Collections.unmodifiableSet(set2);
        this.instantiation = i;
        this.type = i2;
        this.factory = componentFactory;
        this.publishedEvents = Collections.unmodifiableSet(set3);
    }

    public static <T> Builder<T> builder(Class<T> cls) {
        return new Builder<>(cls, new Class[0]);
    }

    public static <T> Component<T> intoSet(final T t, Class<T> cls) {
        return intoSetBuilder(cls).factory(new ComponentFactory(t) { // from class: Ua

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Object f3477a;

            /* JADX WARN: Invalid debug info offset */
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return null;
            }
        }).build();
    }

    public static <T> Builder<T> intoSetBuilder(Class<T> cls) {
        return builder(cls).intoSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$intoSet$2(Object obj, ComponentContainer componentContainer) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$of$0(Object obj, ComponentContainer componentContainer) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$of$1(Object obj, ComponentContainer componentContainer) {
        return obj;
    }

    @Deprecated
    /* JADX INFO: renamed from: of */
    public static <T> Component<T> m17631of(Class<T> cls, final T t) {
        return builder(cls).factory(new ComponentFactory(t) { // from class: Va

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Object f3631a;

            /* JADX WARN: Invalid debug info offset */
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return null;
            }
        }).build();
    }

    public Set<Dependency> getDependencies() {
        return this.dependencies;
    }

    public ComponentFactory<T> getFactory() {
        return this.factory;
    }

    @Nullable
    public String getName() {
        return this.name;
    }

    public Set<Class<? super T>> getProvidedInterfaces() {
        return this.providedInterfaces;
    }

    public Set<Class<?>> getPublishedEvents() {
        return this.publishedEvents;
    }

    public boolean isAlwaysEager() {
        return this.instantiation == 1;
    }

    public boolean isEagerInDefaultApp() {
        return this.instantiation == 2;
    }

    public boolean isLazy() {
        return this.instantiation == 0;
    }

    public boolean isValue() {
        return this.type == 0;
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.providedInterfaces.toArray()) + ">{" + this.instantiation + ", type=" + this.type + ", deps=" + Arrays.toString(this.dependencies.toArray()) + "}";
    }

    public Component<T> withFactory(ComponentFactory<T> componentFactory) {
        return new Component<>(this.name, this.providedInterfaces, this.dependencies, this.instantiation, this.type, componentFactory, this.publishedEvents);
    }

    @SafeVarargs
    public static <T> Builder<T> builder(Class<T> cls, Class<? super T>... clsArr) {
        return new Builder<>(cls, clsArr);
    }

    @SafeVarargs
    /* JADX INFO: renamed from: of */
    public static <T> Component<T> m17632of(final T t, Class<T> cls, Class<? super T>... clsArr) {
        return builder(cls, clsArr).factory(new ComponentFactory(t) { // from class: Wa

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Object f3745a;

            /* JADX WARN: Invalid debug info offset */
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return null;
            }
        }).build();
    }
}
