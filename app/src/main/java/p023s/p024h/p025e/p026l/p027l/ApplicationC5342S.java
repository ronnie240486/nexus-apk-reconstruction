package p023s.p024h.p025e.p026l.p027l;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import p000.C1295U7;

/* JADX INFO: renamed from: s.h.e.l.l.S */
/* JADX INFO: loaded from: classes.dex */
public final class ApplicationC5342S extends Application {

    /* JADX INFO: renamed from: p */
    public static String f18684p = null;

    /* JADX INFO: renamed from: n */
    public static Application f18683n = null;

    /* JADX INFO: renamed from: m */
    public static boolean f18682m = false;

    /* JADX INFO: renamed from: f */
    public static String f18679f = null;

    /* JADX INFO: renamed from: l */
    public static boolean f18680l = false;

    /* JADX INFO: renamed from: la */
    public static boolean f18681la = true;

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
    }

    /* JADX INFO: renamed from: a */
    public static String m28086a() {
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
            Field declaredField = Build.class.getDeclaredField("SUPPORTED_ABIS");
            declaredField.setAccessible(true);
            Object obj5 = declaredField.get(null);
            return (obj5 == null || !Arrays.toString((String[]) obj5).contains("x86")) ? "armeabi" : "x86";
        } catch (Exception e9) {
            try {
                Method declaredMethod = Build.class.getDeclaredMethod("getString", String.class);
                declaredMethod.setAccessible(true);
                return (String) declaredMethod.invoke(null, "ro.product.cpu.abi");
            } catch (Exception e10) {
                return "armeabi";
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m28087c(String str) throws Throwable {
        Object obj;
        Object obj2;
        ZipEntry entry;
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
        String str2 = String.format("assets/ijm_lib/%s/libexec.so", str);
        String str3 = String.format("assets/ijm_lib/%s/libexecmain.so", str);
        File file = new File(f18684p, "libexec.so");
        File file2 = new File(f18684p, "libexecmain.so");
        ZipFile zipFile = new ZipFile(f18679f);
        ZipEntry entry2 = zipFile.getEntry(str2);
        if (entry2 != null && entry2.getCrc() != m28089g(file)) {
            m28088c(zipFile, entry2, file);
        }
        if (f18682m && (entry = zipFile.getEntry(str3)) != null && entry.getCrc() != m28089g(file2)) {
            m28088c(zipFile, entry, file2);
        }
        zipFile.close();
    }

    /* JADX INFO: renamed from: c */
    public static void m28088c(ZipFile zipFile, ZipEntry zipEntry, File file) throws Throwable {
        Object obj;
        Object obj2;
        InputStream inputStream;
        FileOutputStream fileOutputStream;
        byte[] bArr;
        Object obj3 = null;
        try {
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
                    while (true) {
                        int i = inputStream.read(bArr);
                        if (i == -1) {
                            inputStream.close();
                            fileOutputStream.close();
                            return;
                        }
                        fileOutputStream.write(bArr, 0, i);
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
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            inputStream = zipFile.getInputStream(zipEntry);
            fileOutputStream = new FileOutputStream(file);
            bArr = new byte[1024];
        } catch (IOException e9) {
        }
    }

    /* JADX INFO: renamed from: g */
    public static long m28089g(File file) throws Throwable {
        Object obj;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        long value = 0;
        CheckedInputStream checkedInputStream = null;
        Object obj2 = null;
        try {
            obj = new Object();
            try {
                Object obj3 = new Object();
                if (obj != null) {
                    try {
                        obj.hashCode();
                    } catch (Exception e) {
                    }
                }
                if (obj3 != null) {
                    try {
                        obj3.hashCode();
                    } catch (Exception e2) {
                    }
                }
            } catch (Exception e3) {
                if (obj != null) {
                    try {
                        obj.hashCode();
                    } catch (Exception e4) {
                    }
                }
                if (0 != 0) {
                    try {
                        obj2.hashCode();
                    } catch (Exception e5) {
                    }
                }
            } catch (Throwable th) {
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
                    obj2.hashCode();
                    throw th;
                } catch (Exception e7) {
                    throw th;
                }
            }
        } catch (Exception e8) {
            obj = null;
        } catch (Throwable th2) {
            th = th2;
            obj = null;
        }
        if (file.exists()) {
            CRC32 crc32 = new CRC32();
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    CheckedInputStream checkedInputStream2 = new CheckedInputStream(fileInputStream, crc32);
                    try {
                        while (checkedInputStream2.read(new byte[1024]) != -1) {
                        }
                        value = crc32.getValue();
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException e9) {
                            }
                        }
                        if (checkedInputStream2 != null) {
                            try {
                                checkedInputStream2.close();
                            } catch (IOException e10) {
                            }
                        }
                    } catch (Exception e11) {
                        checkedInputStream = checkedInputStream2;
                        fileInputStream2 = fileInputStream;
                        if (fileInputStream2 != null) {
                            try {
                                fileInputStream2.close();
                            } catch (IOException e12) {
                            }
                        }
                        if (checkedInputStream != null) {
                            try {
                                checkedInputStream.close();
                            } catch (IOException e13) {
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        checkedInputStream = checkedInputStream2;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException e14) {
                            }
                        }
                        if (checkedInputStream == null) {
                            throw th;
                        }
                        try {
                            checkedInputStream.close();
                            throw th;
                        } catch (IOException e15) {
                            throw th;
                        }
                    }
                } catch (Exception e16) {
                    fileInputStream2 = fileInputStream;
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Exception e17) {
                fileInputStream2 = null;
            } catch (Throwable th5) {
                th = th5;
                fileInputStream = null;
            }
        }
        return value;
    }

    /* JADX INFO: renamed from: il */
    public static boolean m28090il() throws Throwable {
        Object obj;
        Object obj2;
        boolean z;
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        Object obj3 = null;
        try {
            obj2 = new Object();
            try {
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
                    while (true) {
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            if (line.contains("/lib64/libart.so") || line.contains("/lib64/libaoc.so") || line.contains("/bin/linker64")) {
                                z = true;
                                break;
                            }
                        } catch (Exception e3) {
                            bufferedReader2 = bufferedReader;
                            if (bufferedReader2 != null) {
                                try {
                                    bufferedReader2.close();
                                } catch (IOException e4) {
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException e5) {
                                }
                            }
                            throw th;
                        }
                    }
                } catch (Exception e6) {
                    if (obj2 != null) {
                        try {
                            obj2.hashCode();
                        } catch (Exception e7) {
                        }
                    }
                    if (0 != 0) {
                        try {
                            obj3.hashCode();
                        } catch (Exception e8) {
                        }
                    }
                } catch (Throwable th2) {
                    obj = obj2;
                    th = th2;
                    if (obj != null) {
                        try {
                            obj.hashCode();
                        } catch (Exception e9) {
                        }
                    }
                    if (0 == 0) {
                        throw th;
                    }
                    try {
                        obj3.hashCode();
                        throw th;
                    } catch (Exception e10) {
                        throw th;
                    }
                }
                bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/self/maps")));
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e11) {
                    }
                }
            } catch (Exception e12) {
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
            }
        } catch (Exception e13) {
            obj2 = null;
        } catch (Throwable th4) {
            th = th4;
            obj = null;
        }
        z = false;
        return z;
    }

    /* JADX INFO: renamed from: l */
    public static void m28091l(Context context) throws Throwable {
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
            if (f18684p == null) {
                f18684p = context.getFilesDir().getAbsolutePath();
            }
            if (f18679f == null) {
                f18679f = context.getPackageCodePath();
            }
            String strM28086a = m28086a();
            String strM28092ld = m28092ld(context);
            if (strM28092ld.equals("")) {
                strM28092ld = strM28086a;
            }
            if (strM28092ld == null || !strM28092ld.contains("x86")) {
                if (m28090il()) {
                    m28087c("arm64-v8a");
                    return;
                } else {
                    m28087c("armeabi");
                    return;
                }
            }
            if (m28090il()) {
                m28087c("x86_64");
            } else {
                m28087c("x86");
            }
        } catch (Exception e9) {
            try {
                m28087c("armeabi");
            } catch (Exception e10) {
            }
        }
    }

    /* JADX INFO: renamed from: ld */
    public static String m28092ld(Context context) throws Throwable {
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
        if (context == null) {
            return "";
        }
        try {
            InputStream inputStreamOpen = context.getAssets().open("images/icon_max_data_encrypted_xxxxx.png");
            if (inputStreamOpen == null) {
                return "";
            }
            inputStreamOpen.close();
            byte[] bArr = new byte[20];
            FileInputStream fileInputStream = new FileInputStream(new File("/system/bin/linker"));
            if (fileInputStream == null) {
                return "";
            }
            fileInputStream.read(bArr);
            fileInputStream.close();
            switch (bArr[18]) {
                case 3:
                    return "x86";
                case 40:
                    return "armeabi";
                default:
                    return "";
            }
        } catch (Exception e9) {
            return "";
        }
    }

    /* JADX INFO: renamed from: sp */
    public static void m28093sp() throws Throwable {
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
            Method declaredMethod = Class.forName("com.ijm.dataencryption.DETool").getDeclaredMethod("loadDEso", String.class, String.class, String.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, f18679f, f18684p, C1295U7.f3424b);
        } catch (Exception e9) {
        }
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) throws Throwable {
        Object obj;
        Object obj2;
        super.attachBaseContext(context);
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
        if (f18681la) {
            m28091l(context);
        }
        C5341N.m28080l(this, C1295U7.f3424b);
        C5341N.m28082r(this, "android.media.ViviTV.MainApp");
    }

    @Override // android.app.Application
    public void onCreate() throws Throwable {
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
        C5341N.m28083ra(this, "android.media.ViviTV.MainApp");
        if (f18683n != null) {
            f18683n.onCreate();
        }
        super.onCreate();
    }
}
