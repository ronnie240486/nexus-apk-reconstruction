package androidx.core.view.accessibility;

import android.graphics.Rect;
import android.os.Build;
import androidx.annotation.NonNull;
import p000.C3010c1;
import p000.C4195d1;
import p000.C4260e1;
import p000.C4324f1;
import p000.C4387g1;
import p000.C4451h1;
import p000.C4514i1;
import p000.C4585j1;
import p000.C4648k1;
import p000.C4712l1;
import p000.C4776m1;
import p000.C4846n1;
import p000.C4911o1;
import p000.C5152p1;
import p000.C5215q1;
import p000.C5278r1;
import p000.C5345s1;

/* JADX INFO: loaded from: classes.dex */
public class AccessibilityWindowInfoCompat {
    public static final int TYPE_ACCESSIBILITY_OVERLAY = 4;
    public static final int TYPE_APPLICATION = 1;
    public static final int TYPE_INPUT_METHOD = 2;
    public static final int TYPE_SPLIT_SCREEN_DIVIDER = 5;
    public static final int TYPE_SYSTEM = 3;
    private static final int UNDEFINED = -1;
    private Object mInfo;

    private AccessibilityWindowInfoCompat(Object obj) {
        this.mInfo = obj;
    }

    public static AccessibilityWindowInfoCompat obtain() {
        if (Build.VERSION.SDK_INT >= 21) {
            return wrapNonNullInstance(C4911o1.m22549a());
        }
        return null;
    }

    private static String typeToString(int i) {
        if (i == 1) {
            return "TYPE_APPLICATION";
        }
        if (i == 2) {
            return "TYPE_INPUT_METHOD";
        }
        if (i != 3) {
            return i != 4 ? "<UNKNOWN>" : "TYPE_ACCESSIBILITY_OVERLAY";
        }
        return "TYPE_SYSTEM";
    }

    public static AccessibilityWindowInfoCompat wrapNonNullInstance(Object obj) {
        if (obj != null) {
            return new AccessibilityWindowInfoCompat(obj);
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AccessibilityWindowInfoCompat)) {
            return false;
        }
        Object obj2 = this.mInfo;
        Object obj3 = ((AccessibilityWindowInfoCompat) obj).mInfo;
        if (obj2 == null) {
            if (obj3 != null) {
                return false;
            }
        } else if (!obj2.equals(obj3)) {
            return false;
        }
        return true;
    }

    public AccessibilityNodeInfoCompat getAnchor() {
        if (Build.VERSION.SDK_INT >= 24) {
            return AccessibilityNodeInfoCompat.wrapNonNullInstance(C4451h1.m20903a(C3010c1.m14718a(this.mInfo)));
        }
        return null;
    }

    public void getBoundsInScreen(Rect rect) {
        if (Build.VERSION.SDK_INT >= 21) {
            C5152p1.m27352a(C3010c1.m14718a(this.mInfo), rect);
        }
    }

    public AccessibilityWindowInfoCompat getChild(int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return wrapNonNullInstance(C4648k1.m21670a(C3010c1.m14718a(this.mInfo), i));
        }
        return null;
    }

    public int getChildCount() {
        if (Build.VERSION.SDK_INT >= 21) {
            return C4776m1.m22032a(C3010c1.m14718a(this.mInfo));
        }
        return 0;
    }

    public int getId() {
        if (Build.VERSION.SDK_INT >= 21) {
            return C4712l1.m21890a(C3010c1.m14718a(this.mInfo));
        }
        return -1;
    }

    public int getLayer() {
        if (Build.VERSION.SDK_INT >= 21) {
            return C4195d1.m19782a(C3010c1.m14718a(this.mInfo));
        }
        return -1;
    }

    public AccessibilityWindowInfoCompat getParent() {
        if (Build.VERSION.SDK_INT >= 21) {
            return wrapNonNullInstance(C4324f1.m20226a(C3010c1.m14718a(this.mInfo)));
        }
        return null;
    }

    public AccessibilityNodeInfoCompat getRoot() {
        if (Build.VERSION.SDK_INT >= 21) {
            return AccessibilityNodeInfoCompat.wrapNonNullInstance(C5278r1.m27775a(C3010c1.m14718a(this.mInfo)));
        }
        return null;
    }

    public CharSequence getTitle() {
        if (Build.VERSION.SDK_INT >= 24) {
            return C5215q1.m27584a(C3010c1.m14718a(this.mInfo));
        }
        return null;
    }

    public int getType() {
        if (Build.VERSION.SDK_INT >= 21) {
            return C4514i1.m21288a(C3010c1.m14718a(this.mInfo));
        }
        return -1;
    }

    public int hashCode() {
        Object obj = this.mInfo;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public boolean isAccessibilityFocused() {
        if (Build.VERSION.SDK_INT >= 21) {
            return C4585j1.m21481a(C3010c1.m14718a(this.mInfo));
        }
        return true;
    }

    public boolean isActive() {
        if (Build.VERSION.SDK_INT >= 21) {
            return C4387g1.m20704a(C3010c1.m14718a(this.mInfo));
        }
        return true;
    }

    public boolean isFocused() {
        if (Build.VERSION.SDK_INT >= 21) {
            return C4260e1.m20009a(C3010c1.m14718a(this.mInfo));
        }
        return true;
    }

    public void recycle() {
        if (Build.VERSION.SDK_INT >= 21) {
            C5345s1.m28097a(C3010c1.m14718a(this.mInfo));
        }
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityWindowInfo[id=");
        Rect rect = new Rect();
        getBoundsInScreen(rect);
        sb.append(getId());
        sb.append(", type=");
        sb.append(typeToString(getType()));
        sb.append(", layer=");
        sb.append(getLayer());
        sb.append(", bounds=");
        sb.append(rect);
        sb.append(", focused=");
        sb.append(isFocused());
        sb.append(", active=");
        sb.append(isActive());
        sb.append(", hasParent=");
        sb.append(getParent() != null);
        sb.append(", hasChildren=");
        sb.append(getChildCount() > 0);
        sb.append(']');
        return sb.toString();
    }

    public static AccessibilityWindowInfoCompat obtain(AccessibilityWindowInfoCompat accessibilityWindowInfoCompat) {
        if (Build.VERSION.SDK_INT < 21 || accessibilityWindowInfoCompat == null) {
            return null;
        }
        return wrapNonNullInstance(C4846n1.m22263a(C3010c1.m14718a(accessibilityWindowInfoCompat.mInfo)));
    }
}
