package android.media.ViviTV.activity;

import android.content.Context;
import android.content.SharedPreferences;
import android.provider.Settings;
import android.text.TextUtils;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.UUID;

/**
 * Identidade estável usada pelo cadastro manual do aparelho no painel.
 *
 * O MAC físico do Wi-Fi não é uma fonte confiável em Android moderno: ele
 * pode ser ocultado pelo sistema ou variar por rede. Por isso, o aplicativo
 * deriva um identificador de 48 bits a partir do ANDROID_ID e o apresenta no
 * formato MAC XX:XX:XX:XX:XX:XX.
 */
public final class DeviceIdentity {

    public static final String EXTRA_MAC = "mac_di";
    private static final String PREFS = "nexus_device_identity";
    private static final String KEY_FALLBACK = "fallback_device_id";

    private DeviceIdentity() {
        // Utility class.
    }

    /**
     * Retorna o identificador formatado com dois-pontos.
     *
     * No mesmo usuário/dispositivo, o ANDROID_ID normalmente permanece
     * disponível após desinstalação e reinstalação. O fallback aleatório é
     * usado somente quando o sistema não fornece ANDROID_ID e, nesse caso,
     * não há garantia de persistência após a desinstalação.
     */
    public static String getMac(Context context) {
        String source = getStableSource(context);
        String digest = sha256(source);
        String compact = digest.substring(0, 12).toUpperCase(Locale.US);
        return formatMac(compact);
    }

    /** Retorna o mesmo identificador sem separadores, para APIs que exigem 12 caracteres. */
    public static String getCompactMac(Context context) {
        return getMac(context).replace(":", "");
    }

    private static String getStableSource(Context context) {
        String androidId = Settings.Secure.getString(
                context.getContentResolver(), Settings.Secure.ANDROID_ID);
        if (!TextUtils.isEmpty(androidId)) {
            return context.getPackageName() + ":android-id:" + androidId;
        }

        SharedPreferences preferences = context.getSharedPreferences(PREFS, Context.MODE_PRIVATE);
        String fallback = preferences.getString(KEY_FALLBACK, null);
        if (TextUtils.isEmpty(fallback)) {
            fallback = UUID.randomUUID().toString();
            preferences.edit().putString(KEY_FALLBACK, fallback).apply();
        }
        return context.getPackageName() + ":fallback:" + fallback;
    }

    private static String sha256(String value) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] bytes = digest.digest(value.getBytes(StandardCharsets.UTF_8));
            StringBuilder result = new StringBuilder(bytes.length * 2);
            for (byte valueByte : bytes) {
                result.append(String.format(Locale.US, "%02x", valueByte & 0xff));
            }
            return result.toString();
        } catch (NoSuchAlgorithmException exception) {
            throw new IllegalStateException("SHA-256 não disponível neste Android", exception);
        }
    }

    private static String formatMac(String compact) {
        StringBuilder result = new StringBuilder(17);
        for (int index = 0; index < compact.length(); index += 2) {
            if (index > 0) {
                result.append(':');
            }
            result.append(compact, index, index + 2);
        }
        return result.toString();
    }
}
