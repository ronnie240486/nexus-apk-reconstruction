package com.tencent.smtt.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.tencent.smtt.export.external.TbsCoreSettings;
import com.tencent.smtt.utils.C4172s;
import com.tencent.smtt.utils.FileUtil;
import com.tencent.smtt.utils.TbsLog;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public enum TbsPrivacyAccess {
    DeviceId(false),
    Imsi(false),
    AndroidId(false),
    MacAddress(false),
    AndroidVersion(true),
    DeviceModel(true),
    AppList(true);


    /* JADX INFO: renamed from: a */
    @Deprecated
    private static boolean f12867a = true;

    /* JADX INFO: renamed from: c */
    private static boolean f12868c = false;

    /* JADX INFO: renamed from: d */
    private static String[] f12869d = null;

    /* JADX INFO: renamed from: b */
    private boolean f12871b;

    public enum ConfigurablePrivacy {
        IMSI("imsi"),
        ANDROID_ID("android_id"),
        MAC("mac"),
        ANDROID_VERSION("android_version"),
        DEVICE_MODEL("device_model"),
        APP_LIST("app_list"),
        QIMEI36("q36"),
        MODEL("model"),
        OAID("oaid"),
        SERIAL("serial"),
        ACTION("action"),
        QB_INSTALLED("qb_installed");


        /* JADX INFO: renamed from: a */
        String f12873a;

        ConfigurablePrivacy(String str) {
            this.f12873a = str;
        }
    }

    TbsPrivacyAccess(boolean z) {
        this.f12871b = z;
    }

    /* JADX INFO: renamed from: a */
    private static void m18953a(Context context, SharedPreferences.Editor editor, ConfigurablePrivacy configurablePrivacy, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        TbsLog.m19385i("TbsPrivacy", "doConfigPrivacy  " + configurablePrivacy.f12873a + " is " + str);
        if (!TextUtils.isEmpty(configurablePrivacy.f12873a) && configurablePrivacy.f12873a.equals("action")) {
            m18954a(context, str);
            return;
        }
        editor.putString(configurablePrivacy.f12873a, str);
        TbsLog.m19385i("TbsPrivacy", "configurePrivacy " + configurablePrivacy.f12873a + " is " + str);
    }

    public static void configureAllPrivacy(Context context, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            if (bundle.containsKey("qimei36")) {
                bundle.putString(ConfigurablePrivacy.QIMEI36.f12873a, bundle.getString("qimei36"));
            }
            Iterator<String> it = bundle.keySet().iterator();
            while (it.hasNext()) {
                TbsLog.m19385i("TbsPrivacy", "configureAllPrivacy bundle key is " + it.next());
            }
            SharedPreferences.Editor editorEdit = context.getSharedPreferences("uifa", 0).edit();
            for (ConfigurablePrivacy configurablePrivacy : ConfigurablePrivacy.values()) {
                if (bundle.containsKey(configurablePrivacy.f12873a)) {
                    m18953a(context, editorEdit, configurablePrivacy, bundle.getString(configurablePrivacy.f12873a));
                }
            }
            editorEdit.putString("app_call", "done");
            editorEdit.commit();
        } catch (Throwable unused) {
        }
    }

    public static void configurePrivacy(Context context, ConfigurablePrivacy configurablePrivacy, String str) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("uifa", 0).edit();
        m18953a(context, editorEdit, configurablePrivacy, str);
        editorEdit.commit();
    }

    @Deprecated
    public static void disableSensitiveApi() {
        f12867a = false;
        HashMap map = new HashMap();
        map.put(TbsCoreSettings.NO_SENSITIVE_API, Boolean.TRUE);
        QbSdk.initTbsSettings(map);
    }

    public static String getConfigurePrivacy(Context context, ConfigurablePrivacy configurablePrivacy, String str) {
        return context.getSharedPreferences("uifa", 0).getString(configurablePrivacy.f12873a, str);
    }

    public static String[] getItemToRmPrivacy() {
        return f12869d;
    }

    @Deprecated
    public static boolean isEnableSensitiveApi() {
        return f12867a;
    }

    public static void rmPrivacyItemIfNeeded(Context context) {
        try {
            TbsLog.m19385i("TbsPrivacy", "mRmPrivacyItemChecked is " + f12868c);
            if (f12868c) {
                return;
            }
            f12868c = true;
            String strM19543b = C4172s.m19543b(context);
            TbsLog.m19385i("TbsPrivacy", "rmPrivacyItemIfNeeded state is " + strM19543b);
            if (strM19543b.equals("removenone")) {
                f12869d = null;
                return;
            }
            f12869d = strM19543b.split("\\|");
            TbsLog.m19385i("TbsPrivacy", "rmPrivacyItemIfNeeded mItemToRmPrivacy is " + f12869d);
            SharedPreferences sharedPreferences = context.getSharedPreferences("uifa", 0);
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            for (String str : f12869d) {
                if (sharedPreferences.contains(str)) {
                    editorEdit.remove(str);
                }
            }
            editorEdit.commit();
        } catch (Throwable th) {
            TbsLog.m19385i("TbsPrivacy", "stack is " + Log.getStackTraceString(th));
        }
    }

    public boolean isDisabled() {
        return !this.f12871b;
    }

    public boolean isEnabled() {
        return this.f12871b;
    }

    public void setEnabled(boolean z) {
        this.f12871b = z;
        TbsLog.m19385i("TbsPrivacy", name() + " is " + z);
    }

    /* JADX INFO: renamed from: a */
    private static void m18954a(Context context, String str) {
        try {
            if (!TextUtils.isEmpty(str) && FileUtil.m19353a(context) && str.equals("deleteQBApk")) {
                String strM19343a = FileUtil.m19343a(context, 9);
                if (TextUtils.isEmpty(strM19343a)) {
                    return;
                }
                File file = new File(strM19343a);
                TbsLog.m19385i("TbsPrivacy", "doActionByApp QbApkDir is " + file.getAbsolutePath());
                FileUtil.m19365b(file);
            }
        } catch (Throwable th) {
            TbsLog.m19385i("TbsPrivacy", "doActionByApp stack is " + Log.getStackTraceString(th));
        }
    }

    public static void configureAllPrivacy(Context context, String str) {
        if (str == null) {
            return;
        }
        try {
            String strM19543b = C4172s.m19543b(context);
            TbsLog.m19385i("TbsPrivacy", "configureAllPrivacy state is " + strM19543b);
            if (strM19543b.contains("app_list")) {
                return;
            }
            SharedPreferences.Editor editorEdit = context.getSharedPreferences("uifa", 0).edit();
            editorEdit.putString("app_list", str);
            editorEdit.putString("app_call", "done");
            editorEdit.commit();
        } catch (Throwable unused) {
        }
    }
}
