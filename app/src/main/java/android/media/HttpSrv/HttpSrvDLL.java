package android.media.HttpSrv;

import android.content.Context;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public class HttpSrvDLL {
    protected static final String TAG = "ViviTVHttpSrv/";
    protected Context m_applicationContext;

    static {
        StringBuilder sb;
        try {
            System.loadLibrary("AuthMediaHttpEnc");
        } catch (Exception e) {
            e = e;
            sb = new StringBuilder("Encountered a security issue when loading ViviTVHttpSrv library: ");
            sb.append(e);
            Log.e(TAG, sb.toString());
        } catch (UnsatisfiedLinkError e2) {
            e = e2;
            sb = new StringBuilder("Can't load ViviTVHttpSrv library: ");
            sb.append(e);
            Log.e(TAG, sb.toString());
        }
    }

    public static native void CheckUrlAllowed(String str, String str2);

    public static native String ClientTag();

    public static native int IsChecked(String str);

    public static native String Login(String str);

    public static native String NativeHttpGet(String str, int i);

    public static native String NativeHttpPost(String str, int i, String str2);

    public static native int SetOttFlavor(String str, String str2);

    public static native void SetSessionId(String str);

    public static native void setCleanUpConfig(int i, int i2, int i3);

    public static native void setPgString(String str);

    public native int CloseTask(String str);

    public native String GetBase64DecryptStr(String str);

    public native String GetBase64DecryptStrProGuard(String str);

    public native String GetBase64EncryptStr(String str);

    public native String GetBase64EncryptStrProGuard(String str);

    public native String GetEncStr(String str);

    public native int Init(String str, String str2, Object obj);

    public native int Shutdown();

    public native String StartTask(String str, int i);

    public native String StartTask2(String str);

    public native int Startup(int i);
}
