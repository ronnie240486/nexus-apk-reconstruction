package com.google.android.gms.internal.measurement;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.apache.commons.p013io.IOUtils;
import p000.C0835Mx;
import p000.C1002PX;

/* JADX INFO: loaded from: classes2.dex */
final class zzlo {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static String zza(zzlm zzlmVar, String str) {
        StringBuilder sbM3902a = C0835Mx.m3902a("# ", str);
        zzd(zzlmVar, sbM3902a, 0);
        return sbM3902a.toString();
    }

    public static void zzb(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zzb(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zzb(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        zzc(i, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i2 = 1; i2 < str.length(); i2++) {
                char cCharAt = str.charAt(i2);
                if (Character.isUpperCase(cCharAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(cCharAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(zzmm.zza(zzje.zzm((String) obj)));
            sb.append(C1002PX.f2511b);
            return;
        }
        if (obj instanceof zzje) {
            sb.append(": \"");
            sb.append(zzmm.zza((zzje) obj));
            sb.append(C1002PX.f2511b);
            return;
        }
        if (obj instanceof zzkf) {
            sb.append(" {");
            zzd((zzkf) obj, sb, i + 2);
            sb.append(IOUtils.f15646e);
            zzc(i, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i3 = i + 2;
        zzb(sb, i3, "key", entry.getKey());
        zzb(sb, i3, "value", entry.getValue());
        sb.append(IOUtils.f15646e);
        zzc(i, sb);
        sb.append("}");
    }

    private static void zzc(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(zza, 0, i2);
            i -= i2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01f4  */
    private static void zzd(zzlm zzlmVar, StringBuilder sb, int i) {
        int i2;
        Object obj;
        Method method;
        String strSubstring;
        Object objZzbH;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzlmVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i3 = 0;
        while (true) {
            i2 = 3;
            if (i3 >= length) {
                break;
            }
            Method method3 = declaredMethods[i3];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        map.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i3++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring2 = ((String) entry.getKey()).substring(i2);
            if (!strSubstring2.endsWith("List") || strSubstring2.endsWith("OrBuilderList") || strSubstring2.equals("List") || (method2 = (Method) entry.getValue()) == null || !method2.getReturnType().equals(List.class)) {
                if (strSubstring2.endsWith("Map") && !strSubstring2.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                    strSubstring = strSubstring2.substring(0, strSubstring2.length() - 3);
                    objZzbH = zzkf.zzbH(method, zzlmVar, new Object[0]);
                } else if (hashSet.contains("set".concat(strSubstring2)) && (!strSubstring2.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(strSubstring2.substring(0, strSubstring2.length() - 5)))))) {
                    Method method4 = (Method) entry.getValue();
                    Method method5 = (Method) map.get("has".concat(strSubstring2));
                    if (method4 != null) {
                        Object objZzbH2 = zzkf.zzbH(method4, zzlmVar, new Object[0]);
                        if (method5 == null) {
                            if (objZzbH2 instanceof Boolean) {
                                if (((Boolean) objZzbH2).booleanValue()) {
                                    zzb(sb, i, strSubstring2, objZzbH2);
                                }
                            } else if (objZzbH2 instanceof Integer) {
                                if (((Integer) objZzbH2).intValue() != 0) {
                                    zzb(sb, i, strSubstring2, objZzbH2);
                                }
                            } else if (objZzbH2 instanceof Float) {
                                if (Float.floatToRawIntBits(((Float) objZzbH2).floatValue()) != 0) {
                                    zzb(sb, i, strSubstring2, objZzbH2);
                                }
                            } else if (!(objZzbH2 instanceof Double)) {
                                if (objZzbH2 instanceof String) {
                                    obj = "";
                                } else if (objZzbH2 instanceof zzje) {
                                    obj = zzje.zzb;
                                } else if (objZzbH2 instanceof zzlm) {
                                    if (objZzbH2 != ((zzlm) objZzbH2).zzbS()) {
                                        zzb(sb, i, strSubstring2, objZzbH2);
                                    }
                                } else if (!(objZzbH2 instanceof Enum) || ((Enum) objZzbH2).ordinal() != 0) {
                                    zzb(sb, i, strSubstring2, objZzbH2);
                                }
                                if (!objZzbH2.equals(obj)) {
                                    zzb(sb, i, strSubstring2, objZzbH2);
                                }
                            } else if (Double.doubleToRawLongBits(((Double) objZzbH2).doubleValue()) != 0) {
                                zzb(sb, i, strSubstring2, objZzbH2);
                            }
                        } else if (((Boolean) zzkf.zzbH(method5, zzlmVar, new Object[0])).booleanValue()) {
                            zzb(sb, i, strSubstring2, objZzbH2);
                        }
                    }
                }
                i2 = 3;
            } else {
                strSubstring = strSubstring2.substring(0, strSubstring2.length() - 4);
                objZzbH = zzkf.zzbH(method2, zzlmVar, new Object[0]);
            }
            zzb(sb, i, strSubstring, objZzbH);
            i2 = 3;
        }
        if (zzlmVar instanceof zzkc) {
            throw null;
        }
        zzmp zzmpVar = ((zzkf) zzlmVar).zzc;
        if (zzmpVar != null) {
            zzmpVar.zzi(sb, i);
        }
    }
}
