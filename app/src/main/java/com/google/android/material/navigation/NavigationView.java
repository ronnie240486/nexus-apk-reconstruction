package com.google.android.material.navigation;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.C2439R;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.C3387R;
import com.google.android.material.internal.ContextUtils;
import com.google.android.material.internal.NavigationMenu;
import com.google.android.material.internal.NavigationMenuPresenter;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import p000.C0280ED;

/* JADX INFO: loaded from: classes2.dex */
public class NavigationView extends ScrimInsetsFrameLayout {
    private static final int PRESENTER_NAVIGATION_VIEW_ID = 1;
    OnNavigationItemSelectedListener listener;
    private final int maxWidth;

    @NonNull
    private final NavigationMenu menu;
    private MenuInflater menuInflater;
    private ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
    private final NavigationMenuPresenter presenter;
    private final int[] tmpLocation;
    private static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    private static final int[] DISABLED_STATE_SET = {-16842910};
    private static final int DEF_STYLE_RES = C3387R.style.Widget_Design_NavigationView;

    public interface OnNavigationItemSelectedListener {
        boolean onNavigationItemSelected(@NonNull MenuItem menuItem);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.navigation.NavigationView.SavedState.1
            @Override // android.os.Parcelable.Creator
            @Nullable
            public SavedState createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            public SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        };

        @Nullable
        public Bundle menuState;

        public SavedState(@NonNull Parcel parcel, @Nullable ClassLoader classLoader) {
            super(parcel, classLoader);
            this.menuState = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.menuState);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public NavigationView(@NonNull Context context) {
        this(context, null);
    }

    @Nullable
    private ColorStateList createDefaultColorStateList(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateList = AppCompatResources.getColorStateList(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(C2439R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = colorStateList.getDefaultColor();
        int[] iArr = DISABLED_STATE_SET;
        return new ColorStateList(new int[][]{iArr, CHECKED_STATE_SET, FrameLayout.EMPTY_STATE_SET}, new int[]{colorStateList.getColorForState(iArr, defaultColor), i2, defaultColor});
    }

    @NonNull
    private final Drawable createDefaultItemBackground(@NonNull TintTypedArray tintTypedArray) {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(ShapeAppearanceModel.builder(getContext(), tintTypedArray.getResourceId(C3387R.styleable.NavigationView_itemShapeAppearance, 0), tintTypedArray.getResourceId(C3387R.styleable.NavigationView_itemShapeAppearanceOverlay, 0)).build());
        materialShapeDrawable.setFillColor(MaterialResources.getColorStateList(getContext(), tintTypedArray, C3387R.styleable.NavigationView_itemShapeFillColor));
        return new InsetDrawable((Drawable) materialShapeDrawable, tintTypedArray.getDimensionPixelSize(C3387R.styleable.NavigationView_itemShapeInsetStart, 0), tintTypedArray.getDimensionPixelSize(C3387R.styleable.NavigationView_itemShapeInsetTop, 0), tintTypedArray.getDimensionPixelSize(C3387R.styleable.NavigationView_itemShapeInsetEnd, 0), tintTypedArray.getDimensionPixelSize(C3387R.styleable.NavigationView_itemShapeInsetBottom, 0));
    }

    private MenuInflater getMenuInflater() {
        if (this.menuInflater == null) {
            this.menuInflater = new SupportMenuInflater(getContext());
        }
        return this.menuInflater;
    }

    private boolean hasShapeAppearance(@NonNull TintTypedArray tintTypedArray) {
        return tintTypedArray.hasValue(C3387R.styleable.NavigationView_itemShapeAppearance) || tintTypedArray.hasValue(C3387R.styleable.NavigationView_itemShapeAppearanceOverlay);
    }

    private void setupInsetScrimsListener() {
        this.onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.google.android.material.navigation.NavigationView.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                NavigationView navigationView = NavigationView.this;
                navigationView.getLocationOnScreen(navigationView.tmpLocation);
                boolean z = NavigationView.this.tmpLocation[1] == 0;
                NavigationView.this.presenter.setBehindStatusBar(z);
                NavigationView.this.setDrawTopInsetForeground(z);
                Activity activity = ContextUtils.getActivity(NavigationView.this.getContext());
                if (activity == null || Build.VERSION.SDK_INT < 21) {
                    return;
                }
                NavigationView.this.setDrawBottomInsetForeground((activity.findViewById(R.id.content).getHeight() == NavigationView.this.getHeight()) && (Color.alpha(C0280ED.m1542a(activity.getWindow())) != 0));
            }
        };
        getViewTreeObserver().addOnGlobalLayoutListener(this.onGlobalLayoutListener);
    }

    public void addHeaderView(@NonNull View view) {
        this.presenter.addHeaderView(view);
    }

    @Nullable
    public MenuItem getCheckedItem() {
        return this.presenter.getCheckedItem();
    }

    public int getHeaderCount() {
        return this.presenter.getHeaderCount();
    }

    public View getHeaderView(int i) {
        return this.presenter.getHeaderView(i);
    }

    @Nullable
    public Drawable getItemBackground() {
        return this.presenter.getItemBackground();
    }

    @Dimension
    public int getItemHorizontalPadding() {
        return this.presenter.getItemHorizontalPadding();
    }

    @Dimension
    public int getItemIconPadding() {
        return this.presenter.getItemIconPadding();
    }

    @Nullable
    public ColorStateList getItemIconTintList() {
        return this.presenter.getItemTintList();
    }

    public int getItemMaxLines() {
        return this.presenter.getItemMaxLines();
    }

    @Nullable
    public ColorStateList getItemTextColor() {
        return this.presenter.getItemTextColor();
    }

    @NonNull
    public Menu getMenu() {
        return this.menu;
    }

    public View inflateHeaderView(@LayoutRes int i) {
        return this.presenter.inflateHeaderView(i);
    }

    public void inflateMenu(int i) {
        this.presenter.setUpdateSuspended(true);
        getMenuInflater().inflate(i, this.menu);
        this.presenter.setUpdateSuspended(false);
        this.presenter.updateMenuView(false);
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.onGlobalLayoutListener);
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void onInsetsChanged(@NonNull WindowInsetsCompat windowInsetsCompat) {
        this.presenter.dispatchApplyWindowInsets(windowInsetsCompat);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iMin;
        int mode = View.MeasureSpec.getMode(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                iMin = this.maxWidth;
            }
            super.onMeasure(i, i2);
        }
        iMin = Math.min(View.MeasureSpec.getSize(i), this.maxWidth);
        i = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.menu.restorePresenterStates(savedState.menuState);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.menuState = bundle;
        this.menu.savePresenterStates(bundle);
        return savedState;
    }

    public void removeHeaderView(@NonNull View view) {
        this.presenter.removeHeaderView(view);
    }

    public void setCheckedItem(@IdRes int i) {
        MenuItem menuItemFindItem = this.menu.findItem(i);
        if (menuItemFindItem != null) {
            this.presenter.setCheckedItem((MenuItemImpl) menuItemFindItem);
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.setElevation(f);
        }
        MaterialShapeUtils.setElevation(this, f);
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        this.presenter.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(@DrawableRes int i) {
        setItemBackground(ContextCompat.getDrawable(getContext(), i));
    }

    public void setItemHorizontalPadding(@Dimension int i) {
        this.presenter.setItemHorizontalPadding(i);
    }

    public void setItemHorizontalPaddingResource(@DimenRes int i) {
        this.presenter.setItemHorizontalPadding(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconPadding(@Dimension int i) {
        this.presenter.setItemIconPadding(i);
    }

    public void setItemIconPaddingResource(int i) {
        this.presenter.setItemIconPadding(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconSize(@Dimension int i) {
        this.presenter.setItemIconSize(i);
    }

    public void setItemIconTintList(@Nullable ColorStateList colorStateList) {
        this.presenter.setItemIconTintList(colorStateList);
    }

    public void setItemMaxLines(int i) {
        this.presenter.setItemMaxLines(i);
    }

    public void setItemTextAppearance(@StyleRes int i) {
        this.presenter.setItemTextAppearance(i);
    }

    public void setItemTextColor(@Nullable ColorStateList colorStateList) {
        this.presenter.setItemTextColor(colorStateList);
    }

    public void setNavigationItemSelectedListener(@Nullable OnNavigationItemSelectedListener onNavigationItemSelectedListener) {
        this.listener = onNavigationItemSelectedListener;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i) {
        super.setOverScrollMode(i);
        NavigationMenuPresenter navigationMenuPresenter = this.presenter;
        if (navigationMenuPresenter != null) {
            navigationMenuPresenter.setOverScrollMode(i);
        }
    }

    public NavigationView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C3387R.attr.navigationViewStyle);
    }

    public void setCheckedItem(@NonNull MenuItem menuItem) {
        MenuItem menuItemFindItem = this.menu.findItem(menuItem.getItemId());
        if (menuItemFindItem == null) {
            throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
        }
        this.presenter.setCheckedItem((MenuItemImpl) menuItemFindItem);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NavigationView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        int resourceId;
        boolean z;
        int i2 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, i2), attributeSet, i);
        NavigationMenuPresenter navigationMenuPresenter = new NavigationMenuPresenter();
        this.presenter = navigationMenuPresenter;
        this.tmpLocation = new int[2];
        Context context2 = getContext();
        NavigationMenu navigationMenu = new NavigationMenu(context2);
        this.menu = navigationMenu;
        TintTypedArray tintTypedArrayObtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, C3387R.styleable.NavigationView, i, i2, new int[0]);
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(C3387R.styleable.NavigationView_android_background)) {
            ViewCompat.setBackground(this, tintTypedArrayObtainTintedStyledAttributes.getDrawable(C3387R.styleable.NavigationView_android_background));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            ShapeAppearanceModel shapeAppearanceModelBuild = ShapeAppearanceModel.builder(context2, attributeSet, i, i2).build();
            Drawable background = getBackground();
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(shapeAppearanceModelBuild);
            if (background instanceof ColorDrawable) {
                materialShapeDrawable.setFillColor(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
            }
            materialShapeDrawable.initializeElevationOverlay(context2);
            ViewCompat.setBackground(this, materialShapeDrawable);
        }
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(C3387R.styleable.NavigationView_elevation)) {
            setElevation(tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(C3387R.styleable.NavigationView_elevation, 0));
        }
        setFitsSystemWindows(tintTypedArrayObtainTintedStyledAttributes.getBoolean(C3387R.styleable.NavigationView_android_fitsSystemWindows, false));
        this.maxWidth = tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(C3387R.styleable.NavigationView_android_maxWidth, 0);
        ColorStateList colorStateList = tintTypedArrayObtainTintedStyledAttributes.hasValue(C3387R.styleable.NavigationView_itemIconTint) ? tintTypedArrayObtainTintedStyledAttributes.getColorStateList(C3387R.styleable.NavigationView_itemIconTint) : createDefaultColorStateList(R.attr.textColorSecondary);
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(C3387R.styleable.NavigationView_itemTextAppearance)) {
            resourceId = tintTypedArrayObtainTintedStyledAttributes.getResourceId(C3387R.styleable.NavigationView_itemTextAppearance, 0);
            z = true;
        } else {
            resourceId = 0;
            z = false;
        }
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(C3387R.styleable.NavigationView_itemIconSize)) {
            setItemIconSize(tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(C3387R.styleable.NavigationView_itemIconSize, 0));
        }
        ColorStateList colorStateList2 = tintTypedArrayObtainTintedStyledAttributes.hasValue(C3387R.styleable.NavigationView_itemTextColor) ? tintTypedArrayObtainTintedStyledAttributes.getColorStateList(C3387R.styleable.NavigationView_itemTextColor) : null;
        if (!z && colorStateList2 == null) {
            colorStateList2 = createDefaultColorStateList(R.attr.textColorPrimary);
        }
        Drawable drawable = tintTypedArrayObtainTintedStyledAttributes.getDrawable(C3387R.styleable.NavigationView_itemBackground);
        if (drawable == null && hasShapeAppearance(tintTypedArrayObtainTintedStyledAttributes)) {
            drawable = createDefaultItemBackground(tintTypedArrayObtainTintedStyledAttributes);
        }
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(C3387R.styleable.NavigationView_itemHorizontalPadding)) {
            navigationMenuPresenter.setItemHorizontalPadding(tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(C3387R.styleable.NavigationView_itemHorizontalPadding, 0));
        }
        int dimensionPixelSize = tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(C3387R.styleable.NavigationView_itemIconPadding, 0);
        setItemMaxLines(tintTypedArrayObtainTintedStyledAttributes.getInt(C3387R.styleable.NavigationView_itemMaxLines, 1));
        navigationMenu.setCallback(new MenuBuilder.Callback() { // from class: com.google.android.material.navigation.NavigationView.1
            @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
            public boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
                OnNavigationItemSelectedListener onNavigationItemSelectedListener = NavigationView.this.listener;
                return onNavigationItemSelectedListener != null && onNavigationItemSelectedListener.onNavigationItemSelected(menuItem);
            }

            @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
            public void onMenuModeChange(MenuBuilder menuBuilder) {
            }
        });
        navigationMenuPresenter.setId(1);
        navigationMenuPresenter.initForMenu(context2, navigationMenu);
        navigationMenuPresenter.setItemIconTintList(colorStateList);
        navigationMenuPresenter.setOverScrollMode(getOverScrollMode());
        if (z) {
            navigationMenuPresenter.setItemTextAppearance(resourceId);
        }
        navigationMenuPresenter.setItemTextColor(colorStateList2);
        navigationMenuPresenter.setItemBackground(drawable);
        navigationMenuPresenter.setItemIconPadding(dimensionPixelSize);
        navigationMenu.addMenuPresenter(navigationMenuPresenter);
        addView((View) navigationMenuPresenter.getMenuView(this));
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(C3387R.styleable.NavigationView_menu)) {
            inflateMenu(tintTypedArrayObtainTintedStyledAttributes.getResourceId(C3387R.styleable.NavigationView_menu, 0));
        }
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(C3387R.styleable.NavigationView_headerLayout)) {
            inflateHeaderView(tintTypedArrayObtainTintedStyledAttributes.getResourceId(C3387R.styleable.NavigationView_headerLayout, 0));
        }
        tintTypedArrayObtainTintedStyledAttributes.recycle();
        setupInsetScrimsListener();
    }
}
