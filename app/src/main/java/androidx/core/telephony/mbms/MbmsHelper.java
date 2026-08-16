package androidx.core.telephony.mbms;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import android.telephony.mbms.ServiceInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.Locale;
import p000.C4445gw;
import p000.C4708ky;
import p000.C4771ly;
import p000.C4842my;
import p000.C4905nw;

/* JADX INFO: loaded from: classes.dex */
public final class MbmsHelper {
    private MbmsHelper() {
    }

    @Nullable
    @SuppressLint({"BanTargetApiAnnotation"})
    @TargetApi(28)
    public static CharSequence getBestNameForService(@NonNull Context context, @NonNull ServiceInfo serviceInfo) {
        if (Build.VERSION.SDK_INT < 28) {
            return null;
        }
        LocaleList localeListM22540a = C4905nw.m22540a(context.getResources().getConfiguration());
        int size = C4708ky.m21886a(serviceInfo).size();
        if (size == 0) {
            return null;
        }
        String[] strArr = new String[size];
        Iterator it = C4708ky.m21886a(serviceInfo).iterator();
        int i = 0;
        while (it.hasNext()) {
            strArr[i] = C4771ly.m22020a((Locale) it.next());
            i++;
        }
        Locale localeM20879a = C4445gw.m20879a(localeListM22540a, strArr);
        if (localeM20879a == null) {
            return null;
        }
        return C4842my.m22257a(serviceInfo, localeM20879a);
    }
}
