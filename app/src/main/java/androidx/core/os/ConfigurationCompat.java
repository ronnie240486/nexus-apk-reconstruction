package androidx.core.os;

import android.content.res.Configuration;
import android.os.Build;
import androidx.annotation.NonNull;
import p000.C4905nw;

/* JADX INFO: loaded from: classes.dex */
public final class ConfigurationCompat {
    private ConfigurationCompat() {
    }

    @NonNull
    public static LocaleListCompat getLocales(@NonNull Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? LocaleListCompat.wrap(C4905nw.m22540a(configuration)) : LocaleListCompat.create(configuration.locale);
    }
}
