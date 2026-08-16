package androidx.core.net;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.squareup.picasso.NetworkRequestHandler;
import p000.C0786MA;

/* JADX INFO: loaded from: classes.dex */
public final class UriCompat {
    private UriCompat() {
    }

    @NonNull
    public static String toSafeString(@NonNull Uri uri) {
        String scheme = uri.getScheme();
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        if (scheme != null) {
            if (scheme.equalsIgnoreCase("tel") || scheme.equalsIgnoreCase("sip") || scheme.equalsIgnoreCase("sms") || scheme.equalsIgnoreCase("smsto") || scheme.equalsIgnoreCase("mailto") || scheme.equalsIgnoreCase("nfc")) {
                StringBuilder sb = new StringBuilder(64);
                sb.append(scheme);
                sb.append(':');
                if (schemeSpecificPart != null) {
                    for (int i = 0; i < schemeSpecificPart.length(); i++) {
                        char cCharAt = schemeSpecificPart.charAt(i);
                        if (cCharAt != '-' && cCharAt != '@' && cCharAt != '.') {
                            cCharAt = 'x';
                        }
                        sb.append(cCharAt);
                    }
                }
                return sb.toString();
            }
            if (scheme.equalsIgnoreCase(NetworkRequestHandler.f12458d) || scheme.equalsIgnoreCase(NetworkRequestHandler.f12459e) || scheme.equalsIgnoreCase("ftp") || scheme.equalsIgnoreCase("rtsp")) {
                StringBuilder sb2 = new StringBuilder("//");
                sb2.append(uri.getHost() != null ? uri.getHost() : "");
                schemeSpecificPart = C0786MA.m3668a(sb2, uri.getPort() != -1 ? ":" + uri.getPort() : "", "/...");
            }
        }
        StringBuilder sb3 = new StringBuilder(64);
        if (scheme != null) {
            sb3.append(scheme);
            sb3.append(':');
        }
        if (schemeSpecificPart != null) {
            sb3.append(schemeSpecificPart);
        }
        return sb3.toString();
    }
}
