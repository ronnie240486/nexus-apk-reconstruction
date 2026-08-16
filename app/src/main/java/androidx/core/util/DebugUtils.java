package androidx.core.util;

import androidx.annotation.RestrictTo;
import org.slf4j.helpers.MessageFormatter;
import org.slf4j.impl.AndroidLoggerFactory;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class DebugUtils {
    private DebugUtils() {
    }

    public static void buildShortClassTag(Object obj, StringBuilder sb) {
        String hexString;
        int iLastIndexOf;
        if (obj == null) {
            hexString = AndroidLoggerFactory.f17234b;
        } else {
            String simpleName = obj.getClass().getSimpleName();
            if (simpleName.length() <= 0 && (iLastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
                simpleName = simpleName.substring(iLastIndexOf + 1);
            }
            sb.append(simpleName);
            sb.append(MessageFormatter.f17213a);
            hexString = Integer.toHexString(System.identityHashCode(obj));
        }
        sb.append(hexString);
    }
}
