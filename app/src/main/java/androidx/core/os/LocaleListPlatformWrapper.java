package androidx.core.os;

import android.os.LocaleList;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.Locale;
import p000.C4445gw;
import p000.C4508hw;
import p000.C4579iw;
import p000.C4642jw;
import p000.C4706kw;
import p000.C4769lw;
import p000.C4840mw;
import p000.C4848n3;
import p000.C5146ow;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(24)
final class LocaleListPlatformWrapper implements LocaleListInterface {
    private final LocaleList mLocaleList;

    public LocaleListPlatformWrapper(LocaleList localeList) {
        this.mLocaleList = localeList;
    }

    public boolean equals(Object obj) {
        return C4848n3.m22275a(this.mLocaleList, ((LocaleListInterface) obj).getLocaleList());
    }

    @Override // androidx.core.os.LocaleListInterface
    public Locale get(int i) {
        return C5146ow.m27337a(this.mLocaleList, i);
    }

    @Override // androidx.core.os.LocaleListInterface
    @Nullable
    public Locale getFirstMatch(@NonNull String[] strArr) {
        return C4445gw.m20879a(this.mLocaleList, strArr);
    }

    @Override // androidx.core.os.LocaleListInterface
    public Object getLocaleList() {
        return this.mLocaleList;
    }

    public int hashCode() {
        return C4769lw.m22016a(this.mLocaleList);
    }

    @Override // androidx.core.os.LocaleListInterface
    public int indexOf(Locale locale) {
        return C4840mw.m22242a(this.mLocaleList, locale);
    }

    @Override // androidx.core.os.LocaleListInterface
    public boolean isEmpty() {
        return C4642jw.m21665a(this.mLocaleList);
    }

    @Override // androidx.core.os.LocaleListInterface
    public int size() {
        return C4579iw.m21451a(this.mLocaleList);
    }

    @Override // androidx.core.os.LocaleListInterface
    public String toLanguageTags() {
        return C4508hw.m21177a(this.mLocaleList);
    }

    public String toString() {
        return C4706kw.m21869a(this.mLocaleList);
    }
}
