package info.guardianproject.netcipher.proxy;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import androidx.annotation.Nullable;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes2.dex */
public class SignatureUtils {
    /* JADX WARN: Invalid debug info offset */
    private SignatureUtils() {
    }

    /* JADX WARN: Invalid debug info offset */
    public static String getOwnSignatureHash(Context context) throws PackageManager.NameNotFoundException, NoSuchAlgorithmException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static String getSignatureHash(Context context, String str) throws PackageManager.NameNotFoundException, NoSuchAlgorithmException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static String toHexStringWithColons(byte[] bArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Nullable
    public static Intent validateActivityIntent(Context context, Intent intent, String str, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x001f
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @androidx.annotation.Nullable
    public static android.content.Intent validateActivityIntent(android.content.Context r7, android.content.Intent r8, java.util.List<java.lang.String> r9, boolean r10) {
        /*
            r0 = 0
            return r0
        L42:
        L44:
        */
        throw new UnsupportedOperationException("Method not decompiled: info.guardianproject.netcipher.proxy.SignatureUtils.validateActivityIntent(android.content.Context, android.content.Intent, java.util.List, boolean):android.content.Intent");
    }

    /* JADX WARN: Invalid debug info offset */
    @Nullable
    public static Intent validateBroadcastIntent(Context context, Intent intent, String str, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x001f
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @androidx.annotation.Nullable
    public static android.content.Intent validateBroadcastIntent(android.content.Context r7, android.content.Intent r8, java.util.List<java.lang.String> r9, boolean r10) {
        /*
            r0 = 0
            return r0
        L42:
        L44:
        */
        throw new UnsupportedOperationException("Method not decompiled: info.guardianproject.netcipher.proxy.SignatureUtils.validateBroadcastIntent(android.content.Context, android.content.Intent, java.util.List, boolean):android.content.Intent");
    }

    /* JADX WARN: Invalid debug info offset */
    @Nullable
    public static Intent validateServiceIntent(Context context, Intent intent, String str, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x001f
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @androidx.annotation.Nullable
    public static android.content.Intent validateServiceIntent(android.content.Context r7, android.content.Intent r8, java.util.List<java.lang.String> r9, boolean r10) {
        /*
            r0 = 0
            return r0
        L42:
        L44:
        */
        throw new UnsupportedOperationException("Method not decompiled: info.guardianproject.netcipher.proxy.SignatureUtils.validateServiceIntent(android.content.Context, android.content.Intent, java.util.List, boolean):android.content.Intent");
    }
}
