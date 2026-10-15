package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.C0544dz;
import com.google.android.gms.internal.ads.C0831kn;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.TreeSet;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.measurement.f1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1515f1 {

    /* renamed from: a, reason: collision with root package name */
    public static volatile AbstractC1548m1 f11931a;

    public static void A(String str, int i4, List list) {
        if (list.size() == i4) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires " + i4 + " parameters found " + list.size());
    }

    public static int B(int i4, byte[] bArr, int i5, int i6, C1557o2 c1557o2, C0544dz c0544dz) {
        if ((i4 >>> 3) == 0) {
            throw new IOException("Protocol message contained an invalid tag (zero).");
        }
        int i7 = i4 & 7;
        if (i7 == 0) {
            int J4 = J(bArr, i5, c0544dz);
            c1557o2.c(i4, Long.valueOf(c0544dz.f8530b));
            return J4;
        }
        if (i7 == 1) {
            c1557o2.c(i4, Long.valueOf(K(i5, bArr)));
            return i5 + 8;
        }
        if (i7 == 2) {
            int D4 = D(bArr, i5, c0544dz);
            int i8 = c0544dz.f8529a;
            if (i8 < 0) {
                throw Q1.b();
            }
            if (i8 > bArr.length - D4) {
                throw Q1.c();
            }
            if (i8 == 0) {
                c1557o2.c(i4, C1591x1.f12113q);
            } else {
                c1557o2.c(i4, C1591x1.l(bArr, D4, i8));
            }
            return D4 + i8;
        }
        if (i7 != 3) {
            if (i7 != 5) {
                throw new IOException("Protocol message contained an invalid tag (zero).");
            }
            c1557o2.c(i4, Integer.valueOf(i(i5, bArr)));
            return i5 + 4;
        }
        int i9 = (i4 & (-8)) | 4;
        C1557o2 b4 = C1557o2.b();
        int i10 = 0;
        while (true) {
            if (i5 >= i6) {
                break;
            }
            int D5 = D(bArr, i5, c0544dz);
            i10 = c0544dz.f8529a;
            if (i10 == i9) {
                i5 = D5;
                break;
            }
            i5 = B(i10, bArr, D5, i6, b4, c0544dz);
        }
        if (i5 > i6 || i10 != i9) {
            throw new IOException("Failed to parse the message.");
        }
        c1557o2.c(i4, b4);
        return i5;
    }

    public static void C(String str, int i4, List list) {
        if (list.size() >= i4) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at least " + i4 + " parameters found " + list.size());
    }

    public static int D(byte[] bArr, int i4, C0544dz c0544dz) {
        int i5 = i4 + 1;
        byte b4 = bArr[i4];
        if (b4 < 0) {
            return F(b4, bArr, i5, c0544dz);
        }
        c0544dz.f8529a = b4;
        return i5;
    }

    public static void E(String str, int i4, ArrayList arrayList) {
        if (arrayList.size() <= i4) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at most " + i4 + " parameters found " + arrayList.size());
    }

    public static int F(int i4, byte[] bArr, int i5, C0544dz c0544dz) {
        int i6 = i4 & 127;
        int i7 = i5 + 1;
        byte b4 = bArr[i5];
        if (b4 >= 0) {
            c0544dz.f8529a = i6 | (b4 << 7);
            return i7;
        }
        int i8 = i6 | ((b4 & Byte.MAX_VALUE) << 7);
        int i9 = i5 + 2;
        byte b5 = bArr[i7];
        if (b5 >= 0) {
            c0544dz.f8529a = i8 | (b5 << 14);
            return i9;
        }
        int i10 = i8 | ((b5 & Byte.MAX_VALUE) << 14);
        int i11 = i5 + 3;
        byte b6 = bArr[i9];
        if (b6 >= 0) {
            c0544dz.f8529a = i10 | (b6 << 21);
            return i11;
        }
        int i12 = i10 | ((b6 & Byte.MAX_VALUE) << 21);
        int i13 = i5 + 4;
        byte b7 = bArr[i11];
        if (b7 >= 0) {
            c0544dz.f8529a = i12 | (b7 << 28);
            return i13;
        }
        int i14 = i12 | ((b7 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i15 = i13 + 1;
            if (bArr[i13] >= 0) {
                c0544dz.f8529a = i14;
                return i15;
            }
            i13 = i15;
        }
    }

    public static boolean G(InterfaceC1550n interfaceC1550n) {
        if (interfaceC1550n == null) {
            return false;
        }
        Double f4 = interfaceC1550n.f();
        return !f4.isNaN() && f4.doubleValue() >= 0.0d && f4.equals(Double.valueOf(Math.floor(f4.doubleValue())));
    }

    public static int H(int i4, byte[] bArr, int i5, int i6, N1 n12, C0544dz c0544dz) {
        J1 j12 = (J1) n12;
        int D4 = D(bArr, i5, c0544dz);
        j12.h(c0544dz.f8529a);
        while (D4 < i6) {
            int D5 = D(bArr, D4, c0544dz);
            if (i4 != c0544dz.f8529a) {
                break;
            }
            D4 = D(bArr, D5, c0544dz);
            j12.h(c0544dz.f8529a);
        }
        return D4;
    }

    public static boolean I(InterfaceC1550n interfaceC1550n, InterfaceC1550n interfaceC1550n2) {
        if (!interfaceC1550n.getClass().equals(interfaceC1550n2.getClass())) {
            return false;
        }
        if ((interfaceC1550n instanceof r) || (interfaceC1550n instanceof C1542l)) {
            return true;
        }
        if (!(interfaceC1550n instanceof C1518g)) {
            return interfaceC1550n instanceof C1562q ? interfaceC1550n.g().equals(interfaceC1550n2.g()) : interfaceC1550n instanceof C1508e ? interfaceC1550n.h().equals(interfaceC1550n2.h()) : interfaceC1550n == interfaceC1550n2;
        }
        if (Double.isNaN(interfaceC1550n.f().doubleValue()) || Double.isNaN(interfaceC1550n2.f().doubleValue())) {
            return false;
        }
        return interfaceC1550n.f().equals(interfaceC1550n2.f());
    }

    public static int J(byte[] bArr, int i4, C0544dz c0544dz) {
        int i5 = i4 + 1;
        long j4 = bArr[i4];
        if (j4 >= 0) {
            c0544dz.f8530b = j4;
            return i5;
        }
        int i6 = i4 + 2;
        byte b4 = bArr[i5];
        long j5 = (j4 & 127) | ((b4 & Byte.MAX_VALUE) << 7);
        int i7 = 7;
        while (b4 < 0) {
            int i8 = i6 + 1;
            i7 += 7;
            j5 |= (r10 & Byte.MAX_VALUE) << i7;
            b4 = bArr[i6];
            i6 = i8;
        }
        c0544dz.f8530b = j5;
        return i6;
    }

    public static long K(int i4, byte[] bArr) {
        return ((bArr[i4 + 7] & 255) << 56) | (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16) | ((bArr[i4 + 3] & 255) << 24) | ((bArr[i4 + 4] & 255) << 32) | ((bArr[i4 + 5] & 255) << 40) | ((bArr[i4 + 6] & 255) << 48);
    }

    public static double a(double d) {
        if (Double.isNaN(d)) {
            return 0.0d;
        }
        if (Double.isInfinite(d) || d == 0.0d || d == 0.0d) {
            return d;
        }
        return Math.floor(Math.abs(d)) * (d > 0.0d ? 1 : -1);
    }

    public static int b(byte[] bArr, int i4, C0544dz c0544dz) {
        int D4 = D(bArr, i4, c0544dz);
        int i5 = c0544dz.f8529a;
        if (i5 < 0) {
            throw Q1.b();
        }
        if (i5 > bArr.length - D4) {
            throw Q1.c();
        }
        if (i5 == 0) {
            c0544dz.c = C1591x1.f12113q;
            return D4;
        }
        c0544dz.c = C1591x1.l(bArr, D4, i5);
        return D4 + i5;
    }

    public static InterfaceC1550n c(InterfaceC1533j interfaceC1533j, C1562q c1562q, u0.g gVar, ArrayList arrayList) {
        String str = c1562q.f12003o;
        if (interfaceC1533j.K(str)) {
            InterfaceC1550n j4 = interfaceC1533j.j(str);
            if (j4 instanceof AbstractC1523h) {
                return ((AbstractC1523h) j4).a(gVar, arrayList);
            }
            throw new IllegalArgumentException(n0.a.h(str, " is not a function"));
        }
        if (!"hasOwnProperty".equals(str)) {
            throw new IllegalArgumentException(n0.a.k("Object has no function ", str));
        }
        A("hasOwnProperty", 1, arrayList);
        return interfaceC1533j.K(((C0831kn) gVar.f14984q).x(gVar, (InterfaceC1550n) arrayList.get(0)).g()) ? InterfaceC1550n.f11982j : InterfaceC1550n.f11983k;
    }

    public static InterfaceC1550n d(X0 x02) {
        if (x02 == null) {
            return InterfaceC1550n.f11977e;
        }
        int t4 = x02.t() - 1;
        if (t4 == 1) {
            return x02.s() ? new C1562q(x02.n()) : InterfaceC1550n.f11984l;
        }
        if (t4 == 2) {
            return x02.r() ? new C1518g(Double.valueOf(x02.l())) : new C1518g(null);
        }
        if (t4 == 3) {
            return x02.q() ? new C1508e(Boolean.valueOf(x02.p())) : new C1508e(null);
        }
        if (t4 != 4) {
            throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
        }
        N1 o4 = x02.o();
        ArrayList arrayList = new ArrayList();
        Iterator it = o4.iterator();
        while (it.hasNext()) {
            arrayList.add(d((X0) it.next()));
        }
        return new C1554o(x02.m(), arrayList);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.internal.measurement.q1, com.google.android.gms.internal.measurement.o1, java.lang.Object] */
    public static InterfaceC1556o1 e(InterfaceC1556o1 interfaceC1556o1) {
        if ((interfaceC1556o1 instanceof C1564q1) || (interfaceC1556o1 instanceof C1560p1)) {
            return interfaceC1556o1;
        }
        if (interfaceC1556o1 instanceof Serializable) {
            return new C1560p1(interfaceC1556o1);
        }
        ?? obj = new Object();
        obj.f12004o = interfaceC1556o1;
        return obj;
    }

    public static String f(C1591x1 c1591x1) {
        StringBuilder sb = new StringBuilder(c1591x1.j());
        for (int i4 = 0; i4 < c1591x1.j(); i4++) {
            byte h4 = c1591x1.h(i4);
            if (h4 == 34) {
                sb.append("\\\"");
            } else if (h4 == 39) {
                sb.append("\\'");
            } else if (h4 != 92) {
                switch (h4) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (h4 < 32 || h4 > 126) {
                            sb.append('\\');
                            sb.append((char) (((h4 >>> 6) & 3) + 48));
                            sb.append((char) (((h4 >>> 3) & 7) + 48));
                            sb.append((char) ((h4 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) h4);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static int g(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d) || d == 0.0d) {
            return 0;
        }
        return (int) ((Math.floor(Math.abs(d)) * (d > 0.0d ? 1 : -1)) % 4.294967296E9d);
    }

    public static int h(int i4) {
        return (-(i4 & 1)) ^ (i4 >>> 1);
    }

    public static int i(int i4, byte[] bArr) {
        return ((bArr[i4 + 3] & 255) << 24) | (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16);
    }

    public static C1503d j(C1503d c1503d, u0.g gVar, C1546m c1546m, Boolean bool, Boolean bool2) {
        C1503d c1503d2 = new C1503d();
        Iterator r4 = c1503d.r();
        while (r4.hasNext()) {
            int intValue = ((Integer) r4.next()).intValue();
            if (c1503d.v(intValue)) {
                InterfaceC1550n a4 = c1546m.a(gVar, Arrays.asList(c1503d.p(intValue), new C1518g(Double.valueOf(intValue)), c1503d));
                if (a4.h().equals(bool)) {
                    break;
                }
                if (bool2 == null || a4.h().equals(bool2)) {
                    c1503d2.u(intValue, a4);
                }
            }
        }
        return c1503d2;
    }

    public static InterfaceC1550n k(Object obj) {
        if (obj == null) {
            return InterfaceC1550n.f11978f;
        }
        if (obj instanceof String) {
            return new C1562q((String) obj);
        }
        if (obj instanceof Double) {
            return new C1518g((Double) obj);
        }
        if (obj instanceof Long) {
            return new C1518g(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new C1518g(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new C1508e((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            C1503d c1503d = new C1503d();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                c1503d.u(c1503d.o(), k(it.next()));
            }
            return c1503d;
        }
        C1538k c1538k = new C1538k();
        Map map = (Map) obj;
        for (Object obj2 : map.keySet()) {
            InterfaceC1550n k3 = k(map.get(obj2));
            if (obj2 != null) {
                if (!(obj2 instanceof String)) {
                    obj2 = obj2.toString();
                }
                c1538k.k((String) obj2, k3);
            }
        }
        return c1538k;
    }

    public static final void l(StringBuilder sb, int i4, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                l(sb, i4, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                l(sb, i4, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            C1591x1 c1591x1 = C1591x1.f12113q;
            sb.append(f(new C1591x1(((String) obj).getBytes(O1.f11796a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof C1591x1) {
            sb.append(": \"");
            sb.append(f((C1591x1) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof I1) {
            sb.append(" {");
            s((I1) obj, sb, i4 + 2);
            sb.append("\n");
            while (i5 < i4) {
                sb.append(' ');
                i5++;
            }
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
        int i7 = i4 + 2;
        l(sb, i7, "key", entry.getKey());
        l(sb, i7, "value", entry.getValue());
        sb.append("\n");
        while (i5 < i4) {
            sb.append(' ');
            i5++;
        }
        sb.append("}");
    }

    public static int m(InterfaceC1549m2 interfaceC1549m2, byte[] bArr, int i4, int i5, int i6, C0544dz c0544dz) {
        C1511e2 c1511e2 = (C1511e2) interfaceC1549m2;
        Object a4 = c1511e2.a();
        int y = c1511e2.y(a4, bArr, i4, i5, i6, c0544dz);
        c1511e2.b(a4);
        c0544dz.c = a4;
        return y;
    }

    public static long n(long j4) {
        return (-(j4 & 1)) ^ (j4 >>> 1);
    }

    public static InterfaceC1550n o(C1503d c1503d, u0.g gVar, ArrayList arrayList, boolean z4) {
        InterfaceC1550n interfaceC1550n;
        C("reduce", 1, arrayList);
        E("reduce", 2, arrayList);
        InterfaceC1550n x4 = ((C0831kn) gVar.f14984q).x(gVar, (InterfaceC1550n) arrayList.get(0));
        if (!(x4 instanceof AbstractC1523h)) {
            throw new IllegalArgumentException("Callback should be a method");
        }
        if (arrayList.size() == 2) {
            interfaceC1550n = ((C0831kn) gVar.f14984q).x(gVar, (InterfaceC1550n) arrayList.get(1));
            if (interfaceC1550n instanceof C1513f) {
                throw new IllegalArgumentException("Failed to parse initial value");
            }
        } else {
            if (c1503d.o() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            interfaceC1550n = null;
        }
        AbstractC1523h abstractC1523h = (AbstractC1523h) x4;
        int o4 = c1503d.o();
        int i4 = z4 ? 0 : o4 - 1;
        int i5 = z4 ? o4 - 1 : 0;
        int i6 = true == z4 ? 1 : -1;
        if (interfaceC1550n == null) {
            interfaceC1550n = c1503d.p(i4);
            i4 += i6;
        }
        while ((i5 - i4) * i6 >= 0) {
            if (c1503d.v(i4)) {
                interfaceC1550n = abstractC1523h.a(gVar, Arrays.asList(interfaceC1550n, c1503d.p(i4), new C1518g(Double.valueOf(i4)), c1503d));
                if (interfaceC1550n instanceof C1513f) {
                    throw new IllegalStateException("Reduce operation failed");
                }
                i4 += i6;
            } else {
                i4 += i6;
            }
        }
        return interfaceC1550n;
    }

    public static final String p(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i4 = 0; i4 < str.length(); i4++) {
            char charAt = str.charAt(i4);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    public static void q(u0.g gVar) {
        int g4 = g(gVar.C("runtime.counter").f().doubleValue() + 1.0d);
        if (g4 > 1000000) {
            throw new IllegalStateException("Instructions allowed exceeded");
        }
        gVar.I("runtime.counter", new C1518g(Double.valueOf(g4)));
    }

    public static int r(InterfaceC1549m2 interfaceC1549m2, byte[] bArr, int i4, int i5, C0544dz c0544dz) {
        int i6 = i4 + 1;
        int i7 = bArr[i4];
        if (i7 < 0) {
            i6 = F(i7, bArr, i6, c0544dz);
            i7 = c0544dz.f8529a;
        }
        int i8 = i6;
        if (i7 < 0 || i7 > i5 - i8) {
            throw Q1.c();
        }
        Object a4 = interfaceC1549m2.a();
        int i9 = i8 + i7;
        interfaceC1549m2.d(a4, bArr, i8, i9, c0544dz);
        interfaceC1549m2.b(a4);
        c0544dz.c = a4;
        return i9;
    }

    public static void s(I1 i12, StringBuilder sb, int i4) {
        boolean equals;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet treeSet = new TreeSet();
        for (Method method : i12.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            String substring = str.startsWith("get") ? str.substring(3) : str;
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                String concat = String.valueOf(substring.substring(0, 1).toLowerCase()).concat(String.valueOf(substring.substring(1, substring.length() - 4)));
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    l(sb, i4, p(concat), I1.f(method2, i12, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String concat2 = String.valueOf(substring.substring(0, 1).toLowerCase()).concat(String.valueOf(substring.substring(1, substring.length() - 3)));
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    l(sb, i4, p(concat2), I1.f(method3, i12, new Object[0]));
                }
            }
            if (((Method) hashMap2.get("set".concat(substring))) != null && (!substring.endsWith("Bytes") || !hashMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                String concat3 = String.valueOf(substring.substring(0, 1).toLowerCase()).concat(String.valueOf(substring.substring(1)));
                Method method4 = (Method) hashMap.get("get".concat(substring));
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object f4 = I1.f(method4, i12, new Object[0]);
                    if (method5 == null) {
                        if (f4 instanceof Boolean) {
                            if (((Boolean) f4).booleanValue()) {
                                l(sb, i4, p(concat3), f4);
                            }
                        } else if (f4 instanceof Integer) {
                            if (((Integer) f4).intValue() != 0) {
                                l(sb, i4, p(concat3), f4);
                            }
                        } else if (f4 instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) f4).floatValue()) != 0) {
                                l(sb, i4, p(concat3), f4);
                            }
                        } else if (!(f4 instanceof Double)) {
                            if (f4 instanceof String) {
                                equals = f4.equals("");
                            } else if (f4 instanceof C1591x1) {
                                equals = f4.equals(C1591x1.f12113q);
                            } else if (!(f4 instanceof AbstractC1571s1)) {
                                if ((f4 instanceof Enum) && ((Enum) f4).ordinal() == 0) {
                                }
                                l(sb, i4, p(concat3), f4);
                            } else if (f4 != ((I1) ((I1) ((AbstractC1571s1) f4)).k(6))) {
                                l(sb, i4, p(concat3), f4);
                            }
                            if (!equals) {
                                l(sb, i4, p(concat3), f4);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) f4).doubleValue()) != 0) {
                            l(sb, i4, p(concat3), f4);
                        }
                    } else if (((Boolean) I1.f(method5, i12, new Object[0])).booleanValue()) {
                        l(sb, i4, p(concat3), f4);
                    }
                }
            }
        }
        C1557o2 c1557o2 = i12.zzc;
        if (c1557o2 != null) {
            for (int i5 = 0; i5 < c1557o2.f11993a; i5++) {
                l(sb, i4, String.valueOf(c1557o2.f11994b[i5] >>> 3), c1557o2.c[i5]);
            }
        }
    }

    public static int t(InterfaceC1549m2 interfaceC1549m2, int i4, byte[] bArr, int i5, int i6, N1 n12, C0544dz c0544dz) {
        int r4 = r(interfaceC1549m2, bArr, i5, i6, c0544dz);
        n12.add(c0544dz.c);
        while (r4 < i6) {
            int D4 = D(bArr, r4, c0544dz);
            if (i4 != c0544dz.f8529a) {
                break;
            }
            r4 = r(interfaceC1549m2, bArr, D4, i6, c0544dz);
            n12.add(c0544dz.c);
        }
        return r4;
    }

    public static EnumC1581v u(String str) {
        EnumC1581v enumC1581v = null;
        if (str != null && !str.isEmpty()) {
            enumC1581v = (EnumC1581v) EnumC1581v.f12095z0.get(Integer.valueOf(Integer.parseInt(str)));
        }
        if (enumC1581v != null) {
            return enumC1581v;
        }
        throw new IllegalArgumentException(n0.a.k("Unsupported commandId ", str));
    }

    public static boolean v(byte b4) {
        return b4 > -65;
    }

    public static Object w(InterfaceC1550n interfaceC1550n) {
        if (InterfaceC1550n.f11978f.equals(interfaceC1550n)) {
            return null;
        }
        if (InterfaceC1550n.f11977e.equals(interfaceC1550n)) {
            return "";
        }
        if (interfaceC1550n instanceof C1538k) {
            return y((C1538k) interfaceC1550n);
        }
        if (!(interfaceC1550n instanceof C1503d)) {
            return !interfaceC1550n.f().isNaN() ? interfaceC1550n.f() : interfaceC1550n.g();
        }
        ArrayList arrayList = new ArrayList();
        C1503d c1503d = (C1503d) interfaceC1550n;
        int i4 = 0;
        while (i4 < c1503d.o()) {
            if (i4 >= c1503d.o()) {
                throw new NoSuchElementException(U.a.i("Out of bounds index: ", i4));
            }
            int i5 = i4 + 1;
            Object w2 = w(c1503d.p(i4));
            if (w2 != null) {
                arrayList.add(w2);
            }
            i4 = i5;
        }
        return arrayList;
    }

    public static int x(byte[] bArr, int i4, C0544dz c0544dz) {
        int D4 = D(bArr, i4, c0544dz);
        int i5 = c0544dz.f8529a;
        if (i5 < 0) {
            throw Q1.b();
        }
        if (i5 == 0) {
            c0544dz.c = "";
            return D4;
        }
        c0544dz.c = new String(bArr, D4, i5, O1.f11796a);
        return D4 + i5;
    }

    public static HashMap y(C1538k c1538k) {
        HashMap hashMap = new HashMap();
        c1538k.getClass();
        ArrayList arrayList = new ArrayList(c1538k.f11957o.keySet());
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            String str = (String) obj;
            Object w2 = w(c1538k.j(str));
            if (w2 != null) {
                hashMap.put(str, w2);
            }
        }
        return hashMap;
    }

    public static int z(byte[] bArr, int i4, C0544dz c0544dz) {
        int D4 = D(bArr, i4, c0544dz);
        int i5 = c0544dz.f8529a;
        if (i5 < 0) {
            throw Q1.b();
        }
        if (i5 == 0) {
            c0544dz.c = "";
            return D4;
        }
        C1592x2 c1592x2 = AbstractC1600z2.f12125a;
        int length = bArr.length;
        if ((D4 | i5 | ((length - D4) - i5)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(D4), Integer.valueOf(i5)));
        }
        int i6 = D4 + i5;
        char[] cArr = new char[i5];
        int i7 = 0;
        while (D4 < i6) {
            byte b4 = bArr[D4];
            if (b4 < 0) {
                break;
            }
            D4++;
            cArr[i7] = (char) b4;
            i7++;
        }
        while (D4 < i6) {
            int i8 = D4 + 1;
            byte b5 = bArr[D4];
            if (b5 >= 0) {
                cArr[i7] = (char) b5;
                i7++;
                D4 = i8;
                while (D4 < i6) {
                    byte b6 = bArr[D4];
                    if (b6 >= 0) {
                        D4++;
                        cArr[i7] = (char) b6;
                        i7++;
                    }
                }
            } else if (b5 < -32) {
                if (i8 >= i6) {
                    throw Q1.a();
                }
                D4 += 2;
                int i9 = i7 + 1;
                byte b7 = bArr[i8];
                if (b5 < -62 || v(b7)) {
                    throw Q1.a();
                }
                cArr[i7] = (char) ((b7 & 63) | ((b5 & 31) << 6));
                i7 = i9;
            } else {
                if (b5 < -16) {
                    if (i8 >= i6 - 1) {
                        throw Q1.a();
                    }
                    int i10 = D4 + 2;
                    D4 += 3;
                    int i11 = i7 + 1;
                    byte b8 = bArr[i8];
                    byte b9 = bArr[i10];
                    if (!v(b8)) {
                        if (b5 == -32) {
                            if (b8 >= -96) {
                                b5 = -32;
                            }
                        }
                        if (b5 == -19) {
                            if (b8 < -96) {
                                b5 = -19;
                            }
                        }
                        if (!v(b9)) {
                            cArr[i7] = (char) (((b8 & 63) << 6) | ((b5 & 15) << 12) | (b9 & 63));
                            i7 = i11;
                        }
                    }
                    throw Q1.a();
                }
                if (i8 >= i6 - 2) {
                    throw Q1.a();
                }
                int i12 = D4 + 2;
                int i13 = D4 + 3;
                D4 += 4;
                byte b10 = bArr[i8];
                byte b11 = bArr[i12];
                byte b12 = bArr[i13];
                if (v(b10) || (((b10 + 112) + (b5 << 28)) >> 30) != 0 || v(b11) || v(b12)) {
                    throw Q1.a();
                }
                int i14 = ((b10 & 63) << 12) | ((b5 & 7) << 18) | ((b11 & 63) << 6) | (b12 & 63);
                cArr[i7] = (char) ((i14 >>> 10) + 55232);
                cArr[i7 + 1] = (char) ((i14 & 1023) + 56320);
                i7 += 2;
            }
        }
        c0544dz.c = new String(cArr, 0, i7);
        return i6;
    }
}
