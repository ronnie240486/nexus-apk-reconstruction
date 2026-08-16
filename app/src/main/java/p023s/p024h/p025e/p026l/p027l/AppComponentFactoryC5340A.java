package p023s.p024h.p025e.p026l.p027l;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityThread;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.LoadedApk;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.media.ViviTV.activity.ShoppingItemDetailsActivity;
import java.io.File;
import java.lang.reflect.Field;
import p000.C1295U7;

/* JADX INFO: renamed from: s.h.e.l.l.A */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"Override"})
@TargetApi(28)
public final class AppComponentFactoryC5340A extends AppComponentFactory {
    private String packageName = C1295U7.f3424b;
    private String orignAppName = "android.media.ViviTV.MainApp";
    private String orignName = "androidx.core.app.CoreComponentFactory";
    private AppComponentFactory orignACF = null;
    private boolean supportInstantiateClassLoader = false;
    private AppComponentFactory acf = null;

    /* JADX INFO: renamed from: al */
    public static native ClassLoader m28076al(ClassLoader classLoader, ApplicationInfo applicationInfo, String str, String str2);

    /* JADX INFO: renamed from: ga */
    private ApplicationInfo m28077ga() throws Throwable {
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
            ActivityThread activityThreadCurrentActivityThread = ActivityThread.currentActivityThread();
            Field declaredField = activityThreadCurrentActivityThread.getClass().getDeclaredField("mBoundApplication");
            declaredField.setAccessible(true);
            Object obj5 = declaredField.get(activityThreadCurrentActivityThread);
            Field declaredField2 = obj5.getClass().getDeclaredField(ShoppingItemDetailsActivity.f5303A);
            declaredField2.setAccessible(true);
            return ((LoadedApk) declaredField2.get(obj5)).getApplicationInfo();
        } catch (Exception e9) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ls */
    private void m28078ls(ApplicationInfo applicationInfo) throws Throwable {
        try {
            File file = new File(applicationInfo.dataDir, "files");
            if (!file.exists()) {
                file.mkdirs();
            }
            ApplicationC5342S.f18684p = file.getAbsolutePath();
            ApplicationC5342S.f18679f = applicationInfo.sourceDir;
            if (ApplicationC5342S.f18681la) {
                ApplicationC5342S.m28091l(null);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public synchronized AppComponentFactory getACF(ClassLoader classLoader) {
        if (this.acf == null && this.orignName != null && !this.orignName.equals("")) {
            try {
                this.acf = (AppComponentFactory) classLoader.loadClass(this.orignName).newInstance();
            } catch (Exception e) {
            }
        }
        return this.acf;
    }

    @Override // android.app.AppComponentFactory
    public Activity instantiateActivity(ClassLoader classLoader, String str, Intent intent) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        if (ApplicationC5342S.f18680l) {
            AppComponentFactory acf = getACF(classLoader);
            this.acf = acf;
            if (acf != null) {
                return this.acf.instantiateActivity(classLoader, str, intent);
            }
        }
        return super.instantiateActivity(classLoader, str, intent);
    }

    @Override // android.app.AppComponentFactory
    public Application instantiateApplication(ClassLoader classLoader, String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        if (this.supportInstantiateClassLoader && str.equals("s.h.e.l.l.S")) {
            str = this.orignAppName;
        } else if (ApplicationC5342S.f18680l) {
            AppComponentFactory acf = getACF(classLoader);
            this.acf = acf;
            if (acf != null) {
                return this.acf.instantiateApplication(classLoader, str);
            }
        }
        return super.instantiateApplication(classLoader, str);
    }

    @Override // android.app.AppComponentFactory
    @TargetApi(29)
    public ClassLoader instantiateClassLoader(ClassLoader classLoader, ApplicationInfo applicationInfo) throws Throwable {
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
        if (!this.supportInstantiateClassLoader) {
            m28078ls(applicationInfo);
            classLoader = C5341N.m28079al(classLoader, applicationInfo, this.packageName, this.orignAppName);
            applicationInfo.className = this.orignAppName;
            this.supportInstantiateClassLoader = true;
        }
        if (ApplicationC5342S.f18680l) {
            this.acf = getACF(classLoader);
            if (this.acf != null) {
                return this.acf.instantiateClassLoader(classLoader, applicationInfo);
            }
        }
        return super.instantiateClassLoader(classLoader, applicationInfo);
    }

    @Override // android.app.AppComponentFactory
    public ContentProvider instantiateProvider(ClassLoader classLoader, String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        if (ApplicationC5342S.f18680l) {
            AppComponentFactory acf = getACF(classLoader);
            this.acf = acf;
            if (acf != null) {
                return this.acf.instantiateProvider(classLoader, str);
            }
        }
        return super.instantiateProvider(classLoader, str);
    }

    @Override // android.app.AppComponentFactory
    public BroadcastReceiver instantiateReceiver(ClassLoader classLoader, String str, Intent intent) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        if (ApplicationC5342S.f18680l) {
            AppComponentFactory acf = getACF(classLoader);
            this.acf = acf;
            if (acf != null) {
                return this.acf.instantiateReceiver(classLoader, str, intent);
            }
        }
        return super.instantiateReceiver(classLoader, str, intent);
    }

    @Override // android.app.AppComponentFactory
    public Service instantiateService(ClassLoader classLoader, String str, Intent intent) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        if (ApplicationC5342S.f18680l) {
            AppComponentFactory acf = getACF(classLoader);
            this.acf = acf;
            if (acf != null) {
                return this.acf.instantiateService(classLoader, str, intent);
            }
        }
        return super.instantiateService(classLoader, str, intent);
    }
}
