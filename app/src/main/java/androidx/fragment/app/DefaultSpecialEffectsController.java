package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import androidx.core.app.SharedElementCallback;
import androidx.core.os.CancellationSignal;
import androidx.core.util.Preconditions;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class DefaultSpecialEffectsController extends SpecialEffectsController {

    /* JADX INFO: renamed from: androidx.fragment.app.DefaultSpecialEffectsController$10 */
    public static /* synthetic */ class C266710 {

        /* JADX INFO: renamed from: $SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State */
        static final /* synthetic */ int[] f10113xe493b431;

        static {
            int[] iArr = new int[SpecialEffectsController.Operation.State.values().length];
            f10113xe493b431 = iArr;
            try {
                iArr[SpecialEffectsController.Operation.State.GONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10113xe493b431[SpecialEffectsController.Operation.State.INVISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10113xe493b431[SpecialEffectsController.Operation.State.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10113xe493b431[SpecialEffectsController.Operation.State.VISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static class AnimationInfo extends SpecialEffectsInfo {

        @Nullable
        private FragmentAnim.AnimationOrAnimator mAnimation;
        private boolean mIsPop;
        private boolean mLoadedAnim;

        public AnimationInfo(@NonNull SpecialEffectsController.Operation operation, @NonNull CancellationSignal cancellationSignal, boolean z) {
            super(operation, cancellationSignal);
            this.mLoadedAnim = false;
            this.mIsPop = z;
        }

        @Nullable
        public FragmentAnim.AnimationOrAnimator getAnimation(@NonNull Context context) {
            if (this.mLoadedAnim) {
                return this.mAnimation;
            }
            FragmentAnim.AnimationOrAnimator animationOrAnimatorLoadAnimation = FragmentAnim.loadAnimation(context, getOperation().getFragment(), getOperation().getFinalState() == SpecialEffectsController.Operation.State.VISIBLE, this.mIsPop);
            this.mAnimation = animationOrAnimatorLoadAnimation;
            this.mLoadedAnim = true;
            return animationOrAnimatorLoadAnimation;
        }
    }

    public static class SpecialEffectsInfo {

        @NonNull
        private final SpecialEffectsController.Operation mOperation;

        @NonNull
        private final CancellationSignal mSignal;

        public SpecialEffectsInfo(@NonNull SpecialEffectsController.Operation operation, @NonNull CancellationSignal cancellationSignal) {
            this.mOperation = operation;
            this.mSignal = cancellationSignal;
        }

        public void completeSpecialEffect() {
            this.mOperation.completeSpecialEffect(this.mSignal);
        }

        @NonNull
        public SpecialEffectsController.Operation getOperation() {
            return this.mOperation;
        }

        @NonNull
        public CancellationSignal getSignal() {
            return this.mSignal;
        }

        public boolean isVisibilityUnchanged() {
            SpecialEffectsController.Operation.State state;
            SpecialEffectsController.Operation.State stateFrom = SpecialEffectsController.Operation.State.from(this.mOperation.getFragment().mView);
            SpecialEffectsController.Operation.State finalState = this.mOperation.getFinalState();
            return stateFrom == finalState || !(stateFrom == (state = SpecialEffectsController.Operation.State.VISIBLE) || finalState == state);
        }
    }

    public static class TransitionInfo extends SpecialEffectsInfo {
        private final boolean mOverlapAllowed;

        @Nullable
        private final Object mSharedElementTransition;

        @Nullable
        private final Object mTransition;

        public TransitionInfo(@NonNull SpecialEffectsController.Operation operation, @NonNull CancellationSignal cancellationSignal, boolean z, boolean z2) {
            boolean allowReturnTransitionOverlap;
            Object sharedElementReturnTransition;
            super(operation, cancellationSignal);
            if (operation.getFinalState() == SpecialEffectsController.Operation.State.VISIBLE) {
                Fragment fragment = operation.getFragment();
                this.mTransition = z ? fragment.getReenterTransition() : fragment.getEnterTransition();
                Fragment fragment2 = operation.getFragment();
                allowReturnTransitionOverlap = z ? fragment2.getAllowReturnTransitionOverlap() : fragment2.getAllowEnterTransitionOverlap();
            } else {
                Fragment fragment3 = operation.getFragment();
                this.mTransition = z ? fragment3.getReturnTransition() : fragment3.getExitTransition();
                allowReturnTransitionOverlap = true;
            }
            this.mOverlapAllowed = allowReturnTransitionOverlap;
            if (z2) {
                Fragment fragment4 = operation.getFragment();
                sharedElementReturnTransition = z ? fragment4.getSharedElementReturnTransition() : fragment4.getSharedElementEnterTransition();
            } else {
                sharedElementReturnTransition = null;
            }
            this.mSharedElementTransition = sharedElementReturnTransition;
        }

        @Nullable
        public FragmentTransitionImpl getHandlingImpl() {
            FragmentTransitionImpl handlingImpl = getHandlingImpl(this.mTransition);
            FragmentTransitionImpl handlingImpl2 = getHandlingImpl(this.mSharedElementTransition);
            if (handlingImpl == null || handlingImpl2 == null || handlingImpl == handlingImpl2) {
                return handlingImpl != null ? handlingImpl : handlingImpl2;
            }
            throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + getOperation().getFragment() + " returned Transition " + this.mTransition + " which uses a different Transition  type than its shared element transition " + this.mSharedElementTransition);
        }

        @Nullable
        public Object getSharedElementTransition() {
            return this.mSharedElementTransition;
        }

        @Nullable
        public Object getTransition() {
            return this.mTransition;
        }

        public boolean hasSharedElementTransition() {
            return this.mSharedElementTransition != null;
        }

        public boolean isOverlapAllowed() {
            return this.mOverlapAllowed;
        }

        @Nullable
        private FragmentTransitionImpl getHandlingImpl(Object obj) {
            if (obj == null) {
                return null;
            }
            FragmentTransitionImpl fragmentTransitionImpl = FragmentTransition.PLATFORM_IMPL;
            if (fragmentTransitionImpl != null && fragmentTransitionImpl.canHandle(obj)) {
                return fragmentTransitionImpl;
            }
            FragmentTransitionImpl fragmentTransitionImpl2 = FragmentTransition.SUPPORT_IMPL;
            if (fragmentTransitionImpl2 != null && fragmentTransitionImpl2.canHandle(obj)) {
                return fragmentTransitionImpl2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + getOperation().getFragment() + " is not a valid framework Transition or AndroidX Transition");
        }
    }

    public DefaultSpecialEffectsController(@NonNull ViewGroup viewGroup) {
        super(viewGroup);
    }

    private void startAnimations(@NonNull List<AnimationInfo> list, @NonNull List<SpecialEffectsController.Operation> list2, boolean z, @NonNull Map<SpecialEffectsController.Operation, Boolean> map) {
        StringBuilder sb;
        String str;
        FragmentAnim.AnimationOrAnimator animation;
        final ViewGroup container = getContainer();
        Context context = container.getContext();
        ArrayList<AnimationInfo> arrayList = new ArrayList();
        boolean z2 = false;
        for (final AnimationInfo animationInfo : list) {
            if (animationInfo.isVisibilityUnchanged() || (animation = animationInfo.getAnimation(context)) == null) {
                animationInfo.completeSpecialEffect();
            } else {
                final Animator animator = animation.animator;
                if (animator == null) {
                    arrayList.add(animationInfo);
                } else {
                    final SpecialEffectsController.Operation operation = animationInfo.getOperation();
                    Fragment fragment = operation.getFragment();
                    if (Boolean.TRUE.equals(map.get(operation))) {
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Log.v("FragmentManager", "Ignoring Animator set on " + fragment + " as this Fragment was involved in a Transition.");
                        }
                        animationInfo.completeSpecialEffect();
                    } else {
                        final boolean z3 = operation.getFinalState() == SpecialEffectsController.Operation.State.GONE;
                        if (z3) {
                            list2.remove(operation);
                        }
                        final View view = fragment.mView;
                        container.startViewTransition(view);
                        animator.addListener(new AnimatorListenerAdapter() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.2
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public void onAnimationEnd(Animator animator2) {
                                container.endViewTransition(view);
                                if (z3) {
                                    operation.getFinalState().applyState(view);
                                }
                                animationInfo.completeSpecialEffect();
                            }
                        });
                        animator.setTarget(view);
                        animator.start();
                        animationInfo.getSignal().setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.3
                            @Override // androidx.core.os.CancellationSignal.OnCancelListener
                            public void onCancel() {
                                animator.end();
                            }
                        });
                        z2 = true;
                    }
                }
            }
        }
        for (final AnimationInfo animationInfo2 : arrayList) {
            SpecialEffectsController.Operation operation2 = animationInfo2.getOperation();
            Fragment fragment2 = operation2.getFragment();
            if (z) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    sb = new StringBuilder("Ignoring Animation set on ");
                    sb.append(fragment2);
                    str = " as Animations cannot run alongside Transitions.";
                    sb.append(str);
                    Log.v("FragmentManager", sb.toString());
                }
                animationInfo2.completeSpecialEffect();
            } else if (z2) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    sb = new StringBuilder("Ignoring Animation set on ");
                    sb.append(fragment2);
                    str = " as Animations cannot run alongside Animators.";
                    sb.append(str);
                    Log.v("FragmentManager", sb.toString());
                }
                animationInfo2.completeSpecialEffect();
            } else {
                final View view2 = fragment2.mView;
                Animation animation2 = (Animation) Preconditions.checkNotNull(((FragmentAnim.AnimationOrAnimator) Preconditions.checkNotNull(animationInfo2.getAnimation(context))).animation);
                if (operation2.getFinalState() != SpecialEffectsController.Operation.State.REMOVED) {
                    view2.startAnimation(animation2);
                    animationInfo2.completeSpecialEffect();
                } else {
                    container.startViewTransition(view2);
                    FragmentAnim.EndViewTransitionAnimation endViewTransitionAnimation = new FragmentAnim.EndViewTransitionAnimation(animation2, container, view2);
                    endViewTransitionAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.4
                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationEnd(Animation animation3) {
                            container.post(new Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.4.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    AnimationAnimationListenerC26704 animationAnimationListenerC26704 = AnimationAnimationListenerC26704.this;
                                    container.endViewTransition(view2);
                                    animationInfo2.completeSpecialEffect();
                                }
                            });
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationRepeat(Animation animation3) {
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationStart(Animation animation3) {
                        }
                    });
                    view2.startAnimation(endViewTransitionAnimation);
                }
                animationInfo2.getSignal().setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.5
                    @Override // androidx.core.os.CancellationSignal.OnCancelListener
                    public void onCancel() {
                        view2.clearAnimation();
                        container.endViewTransition(view2);
                        animationInfo2.completeSpecialEffect();
                    }
                });
            }
        }
    }

    @NonNull
    private Map<SpecialEffectsController.Operation, Boolean> startTransitions(@NonNull List<TransitionInfo> list, @NonNull List<SpecialEffectsController.Operation> list2, final boolean z, @Nullable final SpecialEffectsController.Operation operation, @Nullable final SpecialEffectsController.Operation operation2) {
        Iterator<TransitionInfo> it;
        View view;
        Object obj;
        ArrayList<View> arrayList;
        Object obj2;
        ArrayList<View> arrayList2;
        SpecialEffectsController.Operation operation3;
        SpecialEffectsController.Operation operation4;
        View view2;
        Object objMergeTransitionsTogether;
        ArrayList<View> arrayList3;
        SpecialEffectsController.Operation operation5;
        final Rect rect;
        SpecialEffectsController.Operation operation6;
        View view3;
        SharedElementCallback enterTransitionCallback;
        SharedElementCallback exitTransitionCallback;
        ArrayList<String> arrayList4;
        final View view4;
        String strFindKeyForValue;
        ArrayList<String> arrayList5;
        SpecialEffectsController.Operation operation7 = operation;
        SpecialEffectsController.Operation operation8 = operation2;
        HashMap map = new HashMap();
        final FragmentTransitionImpl fragmentTransitionImpl = null;
        for (TransitionInfo transitionInfo : list) {
            if (!transitionInfo.isVisibilityUnchanged()) {
                FragmentTransitionImpl handlingImpl = transitionInfo.getHandlingImpl();
                if (fragmentTransitionImpl == null) {
                    fragmentTransitionImpl = handlingImpl;
                } else if (handlingImpl != null && fragmentTransitionImpl != handlingImpl) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + transitionInfo.getOperation().getFragment() + " returned Transition " + transitionInfo.getTransition() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        if (fragmentTransitionImpl == null) {
            for (TransitionInfo transitionInfo2 : list) {
                map.put(transitionInfo2.getOperation(), Boolean.FALSE);
                transitionInfo2.completeSpecialEffect();
            }
            return map;
        }
        View view5 = new View(getContainer().getContext());
        Rect rect2 = new Rect();
        ArrayList<View> arrayList6 = new ArrayList<>();
        ArrayList<View> arrayList7 = new ArrayList<>();
        ArrayMap arrayMap = new ArrayMap();
        Object obj3 = null;
        View view6 = null;
        boolean z2 = false;
        for (TransitionInfo transitionInfo3 : list) {
            if (!transitionInfo3.hasSharedElementTransition() || operation7 == null || operation8 == null) {
                arrayList3 = arrayList7;
                operation5 = operation7;
                rect = rect2;
                operation6 = operation8;
                view3 = view5;
                view6 = view6;
            } else {
                Object objWrapTransitionInSet = fragmentTransitionImpl.wrapTransitionInSet(fragmentTransitionImpl.cloneTransition(transitionInfo3.getSharedElementTransition()));
                ArrayList<String> sharedElementSourceNames = operation2.getFragment().getSharedElementSourceNames();
                ArrayList<String> sharedElementSourceNames2 = operation.getFragment().getSharedElementSourceNames();
                ArrayList<String> sharedElementTargetNames = operation.getFragment().getSharedElementTargetNames();
                View view7 = view6;
                int i = 0;
                while (i < sharedElementTargetNames.size()) {
                    int iIndexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i));
                    ArrayList<String> arrayList8 = sharedElementTargetNames;
                    if (iIndexOf != -1) {
                        sharedElementSourceNames.set(iIndexOf, sharedElementSourceNames2.get(i));
                    }
                    i++;
                    sharedElementTargetNames = arrayList8;
                }
                ArrayList<String> sharedElementTargetNames2 = operation2.getFragment().getSharedElementTargetNames();
                Fragment fragment = operation.getFragment();
                if (z == 0) {
                    enterTransitionCallback = fragment.getExitTransitionCallback();
                    exitTransitionCallback = operation2.getFragment().getEnterTransitionCallback();
                } else {
                    enterTransitionCallback = fragment.getEnterTransitionCallback();
                    exitTransitionCallback = operation2.getFragment().getExitTransitionCallback();
                }
                int i2 = 0;
                for (int size = sharedElementSourceNames.size(); i2 < size; size = size) {
                    arrayMap.put(sharedElementSourceNames.get(i2), sharedElementTargetNames2.get(i2));
                    i2++;
                }
                ArrayMap<String, View> arrayMap2 = new ArrayMap<>();
                findNamedViews(arrayMap2, operation.getFragment().mView);
                arrayMap2.retainAll(sharedElementSourceNames);
                if (enterTransitionCallback != null) {
                    enterTransitionCallback.onMapSharedElements(sharedElementSourceNames, arrayMap2);
                    int size2 = sharedElementSourceNames.size() - 1;
                    while (size2 >= 0) {
                        String str = sharedElementSourceNames.get(size2);
                        View view8 = arrayMap2.get(str);
                        if (view8 == null) {
                            arrayMap.remove(str);
                            arrayList5 = sharedElementSourceNames;
                        } else {
                            arrayList5 = sharedElementSourceNames;
                            if (!str.equals(ViewCompat.getTransitionName(view8))) {
                                arrayMap.put(ViewCompat.getTransitionName(view8), (String) arrayMap.remove(str));
                            }
                        }
                        size2--;
                        sharedElementSourceNames = arrayList5;
                    }
                    arrayList4 = sharedElementSourceNames;
                } else {
                    arrayList4 = sharedElementSourceNames;
                    arrayMap.retainAll(arrayMap2.keySet());
                }
                final ArrayMap<String, View> arrayMap3 = new ArrayMap<>();
                findNamedViews(arrayMap3, operation2.getFragment().mView);
                arrayMap3.retainAll(sharedElementTargetNames2);
                arrayMap3.retainAll(arrayMap.values());
                if (exitTransitionCallback != null) {
                    exitTransitionCallback.onMapSharedElements(sharedElementTargetNames2, arrayMap3);
                    for (int size3 = sharedElementTargetNames2.size() - 1; size3 >= 0; size3--) {
                        String str2 = sharedElementTargetNames2.get(size3);
                        View view9 = arrayMap3.get(str2);
                        if (view9 == null) {
                            String strFindKeyForValue2 = FragmentTransition.findKeyForValue(arrayMap, str2);
                            if (strFindKeyForValue2 != null) {
                                arrayMap.remove(strFindKeyForValue2);
                            }
                        } else if (!str2.equals(ViewCompat.getTransitionName(view9)) && (strFindKeyForValue = FragmentTransition.findKeyForValue(arrayMap, str2)) != null) {
                            arrayMap.put(strFindKeyForValue, ViewCompat.getTransitionName(view9));
                        }
                    }
                } else {
                    FragmentTransition.retainValues(arrayMap, arrayMap3);
                }
                retainMatchingViews(arrayMap2, arrayMap.keySet());
                retainMatchingViews(arrayMap3, arrayMap.values());
                if (arrayMap.isEmpty()) {
                    arrayList6.clear();
                    arrayList7.clear();
                    operation5 = operation;
                    arrayList3 = arrayList7;
                    rect = rect2;
                    view3 = view5;
                    view6 = view7;
                    obj3 = null;
                    operation6 = operation2;
                } else {
                    FragmentTransition.callSharedElementStartEnd(operation2.getFragment(), operation.getFragment(), z, arrayMap2, true);
                    ArrayList<String> arrayList9 = arrayList4;
                    HashMap map2 = map;
                    View view10 = view5;
                    Rect rect3 = rect2;
                    ArrayList<View> arrayList10 = arrayList7;
                    OneShotPreDrawListener.add(getContainer(), new Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.6
                        @Override // java.lang.Runnable
                        public void run() {
                            FragmentTransition.callSharedElementStartEnd(operation2.getFragment(), operation.getFragment(), z, arrayMap3, false);
                        }
                    });
                    Iterator<View> it2 = arrayMap2.values().iterator();
                    while (it2.hasNext()) {
                        captureTransitioningViews(arrayList6, it2.next());
                    }
                    if (arrayList9.isEmpty()) {
                        view6 = view7;
                    } else {
                        view6 = arrayMap2.get(arrayList9.get(0));
                        fragmentTransitionImpl.setEpicenter(objWrapTransitionInSet, view6);
                    }
                    Iterator<View> it3 = arrayMap3.values().iterator();
                    while (it3.hasNext()) {
                        captureTransitioningViews(arrayList10, it3.next());
                    }
                    arrayList3 = arrayList10;
                    if (sharedElementTargetNames2.isEmpty() || (view4 = arrayMap3.get(sharedElementTargetNames2.get(0))) == null) {
                        rect = rect3;
                    } else {
                        rect = rect3;
                        OneShotPreDrawListener.add(getContainer(), new Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.7
                            @Override // java.lang.Runnable
                            public void run() {
                                fragmentTransitionImpl.getBoundsOnScreen(view4, rect);
                            }
                        });
                        z2 = true;
                    }
                    fragmentTransitionImpl.setSharedElementTargets(objWrapTransitionInSet, view10, arrayList6);
                    view3 = view10;
                    fragmentTransitionImpl.scheduleRemoveTargets(objWrapTransitionInSet, null, null, null, null, objWrapTransitionInSet, arrayList3);
                    Boolean bool = Boolean.TRUE;
                    operation5 = operation;
                    map = map2;
                    map.put(operation5, bool);
                    operation6 = operation2;
                    map.put(operation6, bool);
                    obj3 = objWrapTransitionInSet;
                }
            }
            operation7 = operation5;
            arrayList6 = arrayList6;
            rect2 = rect;
            view5 = view3;
            operation8 = operation6;
            arrayMap = arrayMap;
            arrayList7 = arrayList3;
            fragmentTransitionImpl = fragmentTransitionImpl;
        }
        View view11 = view6;
        ArrayMap arrayMap4 = arrayMap;
        ArrayList<View> arrayList11 = arrayList7;
        SpecialEffectsController.Operation operation9 = operation7;
        ArrayList<View> arrayList12 = arrayList6;
        Rect rect4 = rect2;
        FragmentTransitionImpl fragmentTransitionImpl2 = fragmentTransitionImpl;
        SpecialEffectsController.Operation operation10 = operation8;
        View view12 = view5;
        ArrayList arrayList13 = new ArrayList();
        Iterator<TransitionInfo> it4 = list.iterator();
        Object obj4 = null;
        Object objMergeTransitionsTogether2 = null;
        while (it4.hasNext()) {
            TransitionInfo next = it4.next();
            if (next.isVisibilityUnchanged()) {
                map.put(next.getOperation(), Boolean.FALSE);
                next.completeSpecialEffect();
            } else {
                Object objCloneTransition = fragmentTransitionImpl2.cloneTransition(next.getTransition());
                SpecialEffectsController.Operation operation11 = next.getOperation();
                boolean z3 = obj3 != null && (operation11 == operation9 || operation11 == operation10);
                if (objCloneTransition == null) {
                    if (!z3) {
                        map.put(operation11, Boolean.FALSE);
                        next.completeSpecialEffect();
                    }
                    arrayList2 = arrayList11;
                    arrayList = arrayList12;
                    it = it4;
                    view = view12;
                    objMergeTransitionsTogether = obj4;
                    operation3 = operation10;
                    view2 = view11;
                } else {
                    it = it4;
                    final ArrayList<View> arrayList14 = new ArrayList<>();
                    Object obj5 = obj4;
                    captureTransitioningViews(arrayList14, operation11.getFragment().mView);
                    if (z3) {
                        if (operation11 == operation9) {
                            arrayList14.removeAll(arrayList12);
                        } else {
                            arrayList14.removeAll(arrayList11);
                        }
                    }
                    if (arrayList14.isEmpty()) {
                        fragmentTransitionImpl2.addTarget(objCloneTransition, view12);
                        arrayList2 = arrayList11;
                        arrayList = arrayList12;
                        view = view12;
                        operation4 = operation11;
                        obj2 = objMergeTransitionsTogether2;
                        operation3 = operation10;
                        obj = obj5;
                    } else {
                        fragmentTransitionImpl2.addTargets(objCloneTransition, arrayList14);
                        view = view12;
                        obj = obj5;
                        arrayList = arrayList12;
                        obj2 = objMergeTransitionsTogether2;
                        arrayList2 = arrayList11;
                        operation3 = operation10;
                        fragmentTransitionImpl2.scheduleRemoveTargets(objCloneTransition, objCloneTransition, arrayList14, null, null, null, null);
                        if (operation11.getFinalState() == SpecialEffectsController.Operation.State.GONE) {
                            operation4 = operation11;
                            list2.remove(operation4);
                            fragmentTransitionImpl2.scheduleHideFragmentView(objCloneTransition, operation4.getFragment().mView, arrayList14);
                            OneShotPreDrawListener.add(getContainer(), new Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.8
                                @Override // java.lang.Runnable
                                public void run() {
                                    FragmentTransition.setViewVisibility(arrayList14, 4);
                                }
                            });
                        } else {
                            operation4 = operation11;
                        }
                    }
                    if (operation4.getFinalState() == SpecialEffectsController.Operation.State.VISIBLE) {
                        arrayList13.addAll(arrayList14);
                        if (z2) {
                            fragmentTransitionImpl2.setEpicenter(objCloneTransition, rect4);
                        }
                        view2 = view11;
                    } else {
                        view2 = view11;
                        fragmentTransitionImpl2.setEpicenter(objCloneTransition, view2);
                    }
                    map.put(operation4, Boolean.TRUE);
                    if (next.isOverlapAllowed()) {
                        objMergeTransitionsTogether2 = fragmentTransitionImpl2.mergeTransitionsTogether(obj2, objCloneTransition, null);
                        objMergeTransitionsTogether = obj;
                    } else {
                        objMergeTransitionsTogether = fragmentTransitionImpl2.mergeTransitionsTogether(obj, objCloneTransition, null);
                        objMergeTransitionsTogether2 = obj2;
                    }
                }
                operation10 = operation3;
                view11 = view2;
                obj4 = objMergeTransitionsTogether;
                view12 = view;
                arrayList12 = arrayList;
                arrayList11 = arrayList2;
                it4 = it;
            }
        }
        ArrayList<View> arrayList15 = arrayList11;
        ArrayList<View> arrayList16 = arrayList12;
        SpecialEffectsController.Operation operation12 = operation10;
        Object objMergeTransitionsInSequence = fragmentTransitionImpl2.mergeTransitionsInSequence(objMergeTransitionsTogether2, obj4, obj3);
        for (final TransitionInfo transitionInfo4 : list) {
            if (!transitionInfo4.isVisibilityUnchanged()) {
                Object transition = transitionInfo4.getTransition();
                SpecialEffectsController.Operation operation13 = transitionInfo4.getOperation();
                boolean z4 = obj3 != null && (operation13 == operation9 || operation13 == operation12);
                if (transition != null || z4) {
                    if (ViewCompat.isLaidOut(getContainer())) {
                        fragmentTransitionImpl2.setListenerForTransitionEnd(transitionInfo4.getOperation().getFragment(), objMergeTransitionsInSequence, transitionInfo4.getSignal(), new Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.9
                            @Override // java.lang.Runnable
                            public void run() {
                                transitionInfo4.completeSpecialEffect();
                            }
                        });
                    } else {
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Container " + getContainer() + " has not been laid out. Completing operation " + operation13);
                        }
                        transitionInfo4.completeSpecialEffect();
                    }
                }
            }
        }
        if (!ViewCompat.isLaidOut(getContainer())) {
            return map;
        }
        FragmentTransition.setViewVisibility(arrayList13, 4);
        ArrayList<String> arrayListPrepareSetNameOverridesReordered = fragmentTransitionImpl2.prepareSetNameOverridesReordered(arrayList15);
        fragmentTransitionImpl2.beginDelayedTransition(getContainer(), objMergeTransitionsInSequence);
        fragmentTransitionImpl2.setNameOverridesReordered(getContainer(), arrayList16, arrayList15, arrayListPrepareSetNameOverridesReordered, arrayMap4);
        FragmentTransition.setViewVisibility(arrayList13, 0);
        fragmentTransitionImpl2.swapSharedElementTargets(obj3, arrayList16, arrayList15);
        return map;
    }

    public void applyContainerChanges(@NonNull SpecialEffectsController.Operation operation) {
        operation.getFinalState().applyState(operation.getFragment().mView);
    }

    public void captureTransitioningViews(ArrayList<View> arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        if (!arrayList.contains(view) && ViewCompat.getTransitionName(view) != null) {
            arrayList.add(view);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getVisibility() == 0) {
                captureTransitioningViews(arrayList, childAt);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0082  */
    @Override // androidx.fragment.app.SpecialEffectsController
    public void executeOperations(@NonNull List<SpecialEffectsController.Operation> list, boolean z) {
        SpecialEffectsController.Operation operation = null;
        SpecialEffectsController.Operation operation2 = null;
        for (SpecialEffectsController.Operation operation3 : list) {
            SpecialEffectsController.Operation.State stateFrom = SpecialEffectsController.Operation.State.from(operation3.getFragment().mView);
            int i = C266710.f10113xe493b431[operation3.getFinalState().ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                if (stateFrom == SpecialEffectsController.Operation.State.VISIBLE && operation == null) {
                    operation = operation3;
                }
            } else if (i == 4 && stateFrom != SpecialEffectsController.Operation.State.VISIBLE) {
                operation2 = operation3;
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList(list);
        for (final SpecialEffectsController.Operation operation4 : list) {
            CancellationSignal cancellationSignal = new CancellationSignal();
            operation4.markStartedSpecialEffect(cancellationSignal);
            arrayList.add(new AnimationInfo(operation4, cancellationSignal, z));
            CancellationSignal cancellationSignal2 = new CancellationSignal();
            operation4.markStartedSpecialEffect(cancellationSignal2);
            boolean z2 = false;
            if (z) {
                if (operation4 == operation) {
                    z2 = true;
                }
            } else if (operation4 == operation2) {
                z2 = true;
            }
            arrayList2.add(new TransitionInfo(operation4, cancellationSignal2, z, z2));
            operation4.addCompletionListener(new Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.1
                @Override // java.lang.Runnable
                public void run() {
                    if (arrayList3.contains(operation4)) {
                        arrayList3.remove(operation4);
                        DefaultSpecialEffectsController.this.applyContainerChanges(operation4);
                    }
                }
            });
        }
        Map<SpecialEffectsController.Operation, Boolean> mapStartTransitions = startTransitions(arrayList2, arrayList3, z, operation, operation2);
        startAnimations(arrayList, arrayList3, mapStartTransitions.containsValue(Boolean.TRUE), mapStartTransitions);
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            applyContainerChanges((SpecialEffectsController.Operation) it.next());
        }
        arrayList3.clear();
    }

    public void findNamedViews(Map<String, View> map, @NonNull View view) {
        String transitionName = ViewCompat.getTransitionName(view);
        if (transitionName != null) {
            map.put(transitionName, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    findNamedViews(map, childAt);
                }
            }
        }
    }

    public void retainMatchingViews(@NonNull ArrayMap<String, View> arrayMap, @NonNull Collection<String> collection) {
        Iterator<Map.Entry<String, View>> it = arrayMap.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(ViewCompat.getTransitionName(it.next().getValue()))) {
                it.remove();
            }
        }
    }
}
