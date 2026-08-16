package p023s.p024h.p025e.p026l.p027l;

import android.app.Application;
import android.content.pm.ApplicationInfo;
import java.io.File;
import java.io.FileInputStream;

/* JADX INFO: renamed from: s.h.e.l.l.N */
/* JADX INFO: loaded from: classes.dex */
public final class C5341N {

    /* JADX INFO: renamed from: la */
    static boolean f18678la = true;

    static {
        Object obj;
        Object obj2;
        Object obj3 = null;
        try {
            obj2 = new Object();
            try {
                Object obj4 = new Object();
                if (obj2 != null) {
                    try {
                        obj2.hashCode();
                    } catch (Exception e) {
                    }
                }
                if (obj4 != null) {
                    try {
                        obj4.hashCode();
                    } catch (Exception e2) {
                    }
                }
            } catch (Exception e3) {
                if (obj2 != null) {
                    try {
                        obj2.hashCode();
                    } catch (Exception e4) {
                    }
                }
                if (0 != 0) {
                    try {
                        obj3.hashCode();
                    } catch (Exception e5) {
                    }
                }
            } catch (Throwable th) {
                obj = obj2;
                th = th;
                if (obj != null) {
                    try {
                        obj.hashCode();
                    } catch (Exception e6) {
                    }
                }
                if (0 == 0) {
                    throw th;
                }
                try {
                    obj3.hashCode();
                    throw th;
                } catch (Exception e7) {
                    throw th;
                }
            }
        } catch (Exception e8) {
            obj2 = null;
        } catch (Throwable th2) {
            th = th2;
            obj = null;
        }
        try {
            if (f18678la) {
                System.load(String.valueOf(ApplicationC5342S.f18684p) + "/libexec.so");
                if (ApplicationC5342S.f18682m) {
                    System.load(String.valueOf(ApplicationC5342S.f18684p) + "/libexecmain.so");
                    return;
                }
                return;
            }
            if (!m28085x()) {
                System.loadLibrary("exec");
                if (ApplicationC5342S.f18682m) {
                    System.loadLibrary("execmain");
                    return;
                }
                return;
            }
            try {
                System.loadLibrary("exec_x86");
                if (ApplicationC5342S.f18682m) {
                    System.loadLibrary("execmain_x86");
                }
            } catch (Throwable th3) {
                System.loadLibrary("exec");
                if (ApplicationC5342S.f18682m) {
                    System.loadLibrary("execmain");
                }
            }
        } catch (Throwable th4) {
        }
    }

    /* JADX INFO: renamed from: al */
    public static native ClassLoader m28079al(ClassLoader classLoader, ApplicationInfo applicationInfo, String str, String str2);

    public static native byte[] b2b(byte[] bArr, int i);

    /* JADX INFO: renamed from: l */
    public static native boolean m28080l(Application application, String str);

    /* JADX INFO: renamed from: m */
    public static native void m28081m(String str, int i);

    /* JADX INFO: renamed from: r */
    public static native boolean m28082r(Application application, String str);

    /* JADX INFO: renamed from: ra */
    public static native boolean m28083ra(Application application, String str);

    /* JADX INFO: renamed from: sa */
    public static native void m28084sa(String str, String str2);

    /* JADX INFO: renamed from: x */
    public static boolean m28085x() throws Throwable {
        Object obj;
        Object obj2;
        Object obj3 = null;
        try {
            obj2 = new Object();
            try {
                Object obj4 = new Object();
                if (obj2 != null) {
                    try {
                        obj2.hashCode();
                    } catch (Exception e) {
                    }
                }
                if (obj4 != null) {
                    try {
                        obj4.hashCode();
                    } catch (Exception e2) {
                    }
                }
            } catch (Exception e3) {
                if (obj2 != null) {
                    try {
                        obj2.hashCode();
                    } catch (Exception e4) {
                    }
                }
                if (0 != 0) {
                    try {
                        obj3.hashCode();
                    } catch (Exception e5) {
                    }
                }
            } catch (Throwable th) {
                obj = obj2;
                th = th;
                if (obj != null) {
                    try {
                        obj.hashCode();
                    } catch (Exception e6) {
                    }
                }
                if (0 == 0) {
                    throw th;
                }
                try {
                    obj3.hashCode();
                    throw th;
                } catch (Exception e7) {
                    throw th;
                }
            }
        } catch (Exception e8) {
            obj2 = null;
        } catch (Throwable th2) {
            th = th2;
            obj = null;
        }
        try {
            String strM28086a = ApplicationC5342S.m28086a();
            try {
                byte[] bArr = new byte[20];
                FileInputStream fileInputStream = new FileInputStream(new File("/system/bin/linker"));
                if (fileInputStream != null) {
                    fileInputStream.read(bArr);
                    fileInputStream.close();
                    switch (bArr[18]) {
                        case 3:
                            strM28086a = "x86";
                            break;
                        case 40:
                            strM28086a = "armeabi";
                            break;
                    }
                }
            } catch (Exception e9) {
            }
            return strM28086a != null && strM28086a.contains("x86");
        } catch (Exception e10) {
        }
    }
}
