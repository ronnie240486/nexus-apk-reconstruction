package com.google.android.gms.common.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import org.apache.commons.p013io.FilenameUtils;
import org.dom4j.p020io.OutputFormat;
import p000.C1579YX;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public final class HexDumpUtils {
    @Nullable
    @KeepForSdk
    public static String dump(@NonNull byte[] bArr, int i, int i2, boolean z) {
        int length;
        if (bArr == null || (length = bArr.length) == 0 || i < 0 || i2 <= 0 || i + i2 > length) {
            return null;
        }
        StringBuilder sb = new StringBuilder(((i2 + 15) / 16) * (z ? 75 : 57));
        int i3 = i2;
        int i4 = 0;
        int i5 = 0;
        while (i3 > 0) {
            if (i4 == 0) {
                sb.append(i2 < 65536 ? String.format("%04X:", Integer.valueOf(i)) : String.format("%08X:", Integer.valueOf(i)));
                i5 = i;
            } else if (i4 == 8) {
                sb.append(" -");
            }
            sb.append(String.format(" %02X", Integer.valueOf(bArr[i] & C1579YX.f3960d)));
            i3--;
            i4++;
            if (z && (i4 == 16 || i3 == 0)) {
                int i6 = 16 - i4;
                if (i6 > 0) {
                    for (int i7 = 0; i7 < i6; i7++) {
                        sb.append("   ");
                    }
                }
                if (i6 >= 8) {
                    sb.append(OutputFormat.f16582n);
                }
                sb.append(OutputFormat.f16582n);
                for (int i8 = 0; i8 < i4; i8++) {
                    char c = (char) bArr[i5 + i8];
                    if (c < ' ' || c > '~') {
                        c = FilenameUtils.f15632b;
                    }
                    sb.append(c);
                }
            }
            if (i4 == 16 || i3 == 0) {
                sb.append('\n');
                i4 = 0;
            }
            i++;
        }
        return sb.toString();
    }
}
