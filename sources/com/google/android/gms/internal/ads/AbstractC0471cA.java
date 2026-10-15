package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.cA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0471cA {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f8350a;

    static {
        char[] cArr = new char[80];
        f8350a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(StringBuilder sb, int i4, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                a(sb, i4, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                a(sb, i4, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        b(i4, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i5 = 1; i5 < str.length(); i5++) {
                char charAt = str.charAt(i5);
                if (Character.isUpperCase(charAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(charAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            C0800jz c0800jz = AbstractC0886lz.f9510p;
            sb.append(AbstractC0587ez.c(new C0800jz(((String) obj).getBytes(Mz.f6292a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC0886lz) {
            sb.append(": \"");
            sb.append(AbstractC0587ez.c((AbstractC0886lz) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof Dz) {
            sb.append(" {");
            c((Dz) obj, sb, i4 + 2);
            sb.append("\n");
            b(i4, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        int i6 = i4 + 2;
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        a(sb, i6, "key", entry.getKey());
        a(sb, i6, "value", entry.getValue());
        sb.append("\n");
        b(i4, sb);
        sb.append("}");
    }

    public static void b(int i4, StringBuilder sb) {
        while (i4 > 0) {
            int i5 = 80;
            if (i4 <= 80) {
                i5 = i4;
            }
            sb.append(f8350a, 0, i5);
            i4 -= i5;
        }
    }

    public static void c(Dz dz, StringBuilder sb, int i4) {
        int i5;
        int i6;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = dz.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i7 = 0;
        while (true) {
            i5 = 3;
            if (i7 >= length) {
                break;
            }
            Method method3 = declaredMethods[i7];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i7++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i5);
            if (!substring.endsWith("List") || substring.endsWith("OrBuilderList") || substring.equals("List") || (method2 = (Method) entry.getValue()) == null) {
                i6 = i5;
            } else {
                i6 = i5;
                if (method2.getReturnType().equals(List.class)) {
                    a(sb, i4, substring.substring(0, substring.length() - 4), Dz.m(method2, dz, new Object[0]));
                    i5 = i6;
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                a(sb, i4, substring.substring(0, substring.length() - 3), Dz.m(method, dz, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object m4 = Dz.m(method4, dz, new Object[0]);
                    if (method5 != null) {
                        if (!((Boolean) Dz.m(method5, dz, new Object[0])).booleanValue()) {
                        }
                        a(sb, i4, substring, m4);
                    } else if (m4 instanceof Boolean) {
                        if (!((Boolean) m4).booleanValue()) {
                        }
                        a(sb, i4, substring, m4);
                    } else if (m4 instanceof Integer) {
                        if (((Integer) m4).intValue() == 0) {
                        }
                        a(sb, i4, substring, m4);
                    } else if (m4 instanceof Float) {
                        if (Float.floatToRawIntBits(((Float) m4).floatValue()) == 0) {
                        }
                        a(sb, i4, substring, m4);
                    } else if (m4 instanceof Double) {
                        if (Double.doubleToRawLongBits(((Double) m4).doubleValue()) == 0) {
                        }
                        a(sb, i4, substring, m4);
                    } else {
                        if (m4 instanceof String) {
                            equals = m4.equals("");
                        } else if (m4 instanceof AbstractC0886lz) {
                            equals = m4.equals(AbstractC0886lz.f9510p);
                        } else if (m4 instanceof AbstractC0417az) {
                            if (m4 == ((Dz) ((Dz) ((AbstractC0417az) m4)).s(6, null))) {
                            }
                            a(sb, i4, substring, m4);
                        } else {
                            if ((m4 instanceof Enum) && ((Enum) m4).ordinal() == 0) {
                            }
                            a(sb, i4, substring, m4);
                        }
                        if (equals) {
                        }
                        a(sb, i4, substring, m4);
                    }
                }
            }
            i5 = i6;
        }
        C1155sA c1155sA = dz.zzc;
        if (c1155sA != null) {
            for (int i8 = 0; i8 < c1155sA.f10597a; i8++) {
                a(sb, i4, String.valueOf(c1155sA.f10598b[i8] >>> 3), c1155sA.c[i8]);
            }
        }
    }
}
