package p023s.p024h.p025e.p026l.p027l.p028a8;

import dalvik.system.BaseDexClassLoader;
import dalvik.system.PathClassLoader;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.Enumeration;

/* JADX INFO: renamed from: s.h.e.l.l.a8.p */
/* JADX INFO: loaded from: classes.dex */
public final class C5343p extends PathClassLoader {

    /* JADX INFO: renamed from: o */
    BaseDexClassLoader f18685o;

    public C5343p(BaseDexClassLoader baseDexClassLoader, String str, String str2, ClassLoader classLoader) {
        super(str, str2, classLoader);
        this.f18685o = baseDexClassLoader;
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    public String findLibrary(String str) {
        String str2 = (String) m28094o(this.f18685o, "findLibrary", new Class[]{String.class}, new Object[]{str});
        return str2 == null ? super.findLibrary(str) : str2;
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    protected URL findResource(String str) {
        URL urlFindResource = super.findResource(str);
        return urlFindResource == null ? (URL) m28094o(this.f18685o, "findResource", new Class[]{String.class}, new Object[]{str}) : urlFindResource;
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    protected Enumeration<URL> findResources(String str) {
        Enumeration<URL> enumerationFindResources = super.findResources(str);
        return enumerationFindResources == null ? (Enumeration) m28094o(this.f18685o, "findResources", new Class[]{String.class}, new Object[]{str}) : enumerationFindResources;
    }

    @Override // java.lang.ClassLoader
    public URL getResource(String str) {
        URL resource = super.getResource(str);
        return resource == null ? (URL) m28094o(this.f18685o, "getResource", new Class[]{String.class}, new Object[]{str}) : resource;
    }

    @Override // java.lang.ClassLoader
    public InputStream getResourceAsStream(String str) {
        InputStream resourceAsStream = super.getResourceAsStream(str);
        return resourceAsStream == null ? (InputStream) m28094o(this.f18685o, "getResourceAsStream", new Class[]{String.class}, new Object[]{str}) : resourceAsStream;
    }

    @Override // java.lang.ClassLoader
    public Enumeration<URL> getResources(String str) throws IOException {
        return (Enumeration) m28094o(this.f18685o, "getResources", new Class[]{String.class}, new Object[]{str});
    }

    /* JADX INFO: renamed from: o */
    Object m28094o(Object obj, String str, Class[] clsArr, Object[] objArr) {
        Method declaredMethod;
        Object objInvoke = null;
        try {
            try {
                declaredMethod = BaseDexClassLoader.class.getDeclaredMethod(str, clsArr);
            } catch (Exception e) {
                declaredMethod = ClassLoader.class.getDeclaredMethod(str, clsArr);
            }
            if (declaredMethod == null) {
                return null;
            }
            declaredMethod.setAccessible(true);
            objInvoke = declaredMethod.invoke(obj, objArr);
            return objInvoke;
        } catch (Exception e2) {
            e2.printStackTrace();
            return objInvoke;
        }
    }
}
