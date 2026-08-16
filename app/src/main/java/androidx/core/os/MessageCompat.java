package androidx.core.os;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Message;
import androidx.annotation.NonNull;
import p000.C0469HC;
import p000.C0532IC;

/* JADX INFO: loaded from: classes.dex */
public final class MessageCompat {
    private static boolean sTryIsAsynchronous = true;
    private static boolean sTrySetAsynchronous = true;

    private MessageCompat() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
    
        androidx.core.os.MessageCompat.sTryIsAsynchronous = false;
     */
    @SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean isAsynchronous(@NonNull Message message) {
        if (Build.VERSION.SDK_INT < 22 && !sTryIsAsynchronous) {
            return false;
        }
        return C0469HC.m2271a(message);
    }

    @SuppressLint({"NewApi"})
    public static void setAsynchronous(@NonNull Message message, boolean z) {
        if (Build.VERSION.SDK_INT >= 22) {
            C0532IC.m2508a(message, z);
        } else if (sTrySetAsynchronous) {
            try {
                C0532IC.m2508a(message, z);
            } catch (NoSuchMethodError unused) {
                sTrySetAsynchronous = false;
            }
        }
    }
}
