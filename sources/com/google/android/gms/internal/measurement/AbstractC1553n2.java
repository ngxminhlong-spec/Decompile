package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.measurement.n2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1553n2 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f11986a;

    /* renamed from: b, reason: collision with root package name */
    public static final C1561p2 f11987b;
    public static final C1561p2 c;
    public static final C1561p2 d;

    /* JADX WARN: Type inference failed for: r0v6, types: [com.google.android.gms.internal.measurement.p2, java.lang.Object] */
    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f11986a = cls;
        f11987b = s(false);
        c = s(true);
        d = new Object();
    }

    public static int A(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof Y1)) {
            int i5 = 0;
            while (i4 < size) {
                i5 += C1595y1.M(((Long) list.get(i4)).longValue());
                i4++;
            }
            return i5;
        }
        Y1 y12 = (Y1) list;
        int i6 = 0;
        while (i4 < size) {
            y12.i(i4);
            i6 += C1595y1.M(y12.f11854p[i4]);
            i4++;
        }
        return i6;
    }

    public static int B(int i4, Object obj, InterfaceC1549m2 interfaceC1549m2) {
        AbstractC1571s1 abstractC1571s1 = (AbstractC1571s1) obj;
        int L4 = C1595y1.L(i4 << 3);
        I1 i12 = (I1) abstractC1571s1;
        int i5 = i12.zzd;
        if (i5 == -1) {
            i5 = interfaceC1549m2.l(abstractC1571s1);
            i12.zzd = i5;
        }
        return U.a.r(i5, i5, L4);
    }

    public static int C(int i4, List list, InterfaceC1549m2 interfaceC1549m2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int c02 = C1595y1.c0(i4) * size;
        for (int i5 = 0; i5 < size; i5++) {
            AbstractC1571s1 abstractC1571s1 = (AbstractC1571s1) list.get(i5);
            I1 i12 = (I1) abstractC1571s1;
            int i6 = i12.zzd;
            if (i6 == -1) {
                i6 = interfaceC1549m2.l(abstractC1571s1);
                i12.zzd = i6;
            }
            c02 = U.a.r(i6, i6, c02);
        }
        return c02;
    }

    public static int D(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof J1)) {
            int i5 = 0;
            while (i4 < size) {
                int intValue = ((Integer) list.get(i4)).intValue();
                i5 += C1595y1.L((intValue >> 31) ^ (intValue + intValue));
                i4++;
            }
            return i5;
        }
        J1 j12 = (J1) list;
        int i6 = 0;
        while (i4 < size) {
            j12.i(i4);
            int i7 = j12.f11779p[i4];
            i6 += C1595y1.L((i7 >> 31) ^ (i7 + i7));
            i4++;
        }
        return i6;
    }

    public static int E(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof Y1)) {
            int i5 = 0;
            while (i4 < size) {
                long longValue = ((Long) list.get(i4)).longValue();
                i5 += C1595y1.M((longValue >> 63) ^ (longValue + longValue));
                i4++;
            }
            return i5;
        }
        Y1 y12 = (Y1) list;
        int i6 = 0;
        while (i4 < size) {
            y12.i(i4);
            long j4 = y12.f11854p[i4];
            i6 += C1595y1.M((j4 >> 63) ^ (j4 + j4));
            i4++;
        }
        return i6;
    }

    public static int F(int i4, List list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        int c02 = C1595y1.c0(i4) * size;
        if (!(list instanceof T1)) {
            while (i5 < size) {
                Object obj = list.get(i5);
                if (obj instanceof C1591x1) {
                    int j4 = ((C1591x1) obj).j();
                    c02 = U.a.r(j4, j4, c02);
                } else {
                    c02 = C1595y1.b0((String) obj) + c02;
                }
                i5++;
            }
            return c02;
        }
        T1 t12 = (T1) list;
        while (i5 < size) {
            Object d4 = t12.d(i5);
            if (d4 instanceof C1591x1) {
                int j5 = ((C1591x1) d4).j();
                c02 = U.a.r(j5, j5, c02);
            } else {
                c02 = C1595y1.b0((String) d4) + c02;
            }
            i5++;
        }
        return c02;
    }

    public static int G(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof J1)) {
            int i5 = 0;
            while (i4 < size) {
                i5 += C1595y1.L(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return i5;
        }
        J1 j12 = (J1) list;
        int i6 = 0;
        while (i4 < size) {
            j12.i(i4);
            i6 += C1595y1.L(j12.f11779p[i4]);
            i4++;
        }
        return i6;
    }

    public static int H(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof Y1)) {
            int i5 = 0;
            while (i4 < size) {
                i5 += C1595y1.M(((Long) list.get(i4)).longValue());
                i4++;
            }
            return i5;
        }
        Y1 y12 = (Y1) list;
        int i6 = 0;
        while (i4 < size) {
            y12.i(i4);
            i6 += C1595y1.M(y12.f11854p[i4]);
            i4++;
        }
        return i6;
    }

    public static void a(C1561p2 c1561p2, Object obj, Object obj2) {
        c1561p2.getClass();
        I1 i12 = (I1) obj;
        C1557o2 c1557o2 = i12.zzc;
        C1557o2 c1557o22 = ((I1) obj2).zzc;
        if (!c1557o22.equals(C1557o2.f11992f)) {
            int i4 = c1557o2.f11993a + c1557o22.f11993a;
            int[] copyOf = Arrays.copyOf(c1557o2.f11994b, i4);
            System.arraycopy(c1557o22.f11994b, 0, copyOf, c1557o2.f11993a, c1557o22.f11993a);
            Object[] copyOf2 = Arrays.copyOf(c1557o2.c, i4);
            System.arraycopy(c1557o22.c, 0, copyOf2, c1557o2.f11993a, c1557o22.f11993a);
            c1557o2 = new C1557o2(i4, copyOf, copyOf2, true);
        }
        i12.zzc = c1557o2;
    }

    public static void b(int i4, List list, C1599z1 c1599z1, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1595y1 c1595y1 = (C1595y1) c1599z1.f12124p;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                boolean booleanValue = ((Boolean) list.get(i5)).booleanValue();
                c1595y1.W(i4 << 3);
                c1595y1.N(booleanValue ? (byte) 1 : (byte) 0);
                i5++;
            }
            return;
        }
        c1595y1.V(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Boolean) list.get(i7)).getClass();
            i6++;
        }
        c1595y1.W(i6);
        while (i5 < list.size()) {
            c1595y1.N(((Boolean) list.get(i5)).booleanValue() ? (byte) 1 : (byte) 0);
            i5++;
        }
    }

    public static void c(int i4, List list, C1599z1 c1599z1) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c1599z1.getClass();
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((C1595y1) c1599z1.f12124p).P(i4, (C1591x1) list.get(i5));
        }
    }

    public static void d(int i4, List list, C1599z1 c1599z1, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1595y1 c1595y1 = (C1595y1) c1599z1.f12124p;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                c1595y1.S(i4, Double.doubleToRawLongBits(((Double) list.get(i5)).doubleValue()));
                i5++;
            }
            return;
        }
        c1595y1.V(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Double) list.get(i7)).getClass();
            i6 += 8;
        }
        c1595y1.W(i6);
        while (i5 < list.size()) {
            c1595y1.T(Double.doubleToRawLongBits(((Double) list.get(i5)).doubleValue()));
            i5++;
        }
    }

    public static void e(int i4, List list, C1599z1 c1599z1, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1595y1 c1595y1 = (C1595y1) c1599z1.f12124p;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                int intValue = ((Integer) list.get(i5)).intValue();
                c1595y1.W(i4 << 3);
                if (intValue >= 0) {
                    c1595y1.W(intValue);
                } else {
                    c1595y1.Y(intValue);
                }
                i5++;
            }
            return;
        }
        c1595y1.V(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            i6 += C1595y1.a0(((Integer) list.get(i7)).intValue());
        }
        c1595y1.W(i6);
        while (i5 < list.size()) {
            int intValue2 = ((Integer) list.get(i5)).intValue();
            if (intValue2 >= 0) {
                c1595y1.W(intValue2);
            } else {
                c1595y1.Y(intValue2);
            }
            i5++;
        }
    }

    public static void f(int i4, List list, C1599z1 c1599z1, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1595y1 c1595y1 = (C1595y1) c1599z1.f12124p;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                c1595y1.Q(i4, ((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        c1595y1.V(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Integer) list.get(i7)).getClass();
            i6 += 4;
        }
        c1595y1.W(i6);
        while (i5 < list.size()) {
            c1595y1.R(((Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    public static void g(int i4, List list, C1599z1 c1599z1, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1595y1 c1595y1 = (C1595y1) c1599z1.f12124p;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                c1595y1.S(i4, ((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        c1595y1.V(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Long) list.get(i7)).getClass();
            i6 += 8;
        }
        c1595y1.W(i6);
        while (i5 < list.size()) {
            c1595y1.T(((Long) list.get(i5)).longValue());
            i5++;
        }
    }

    public static void h(int i4, List list, C1599z1 c1599z1, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1595y1 c1595y1 = (C1595y1) c1599z1.f12124p;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                c1595y1.Q(i4, Float.floatToRawIntBits(((Float) list.get(i5)).floatValue()));
                i5++;
            }
            return;
        }
        c1595y1.V(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Float) list.get(i7)).getClass();
            i6 += 4;
        }
        c1595y1.W(i6);
        while (i5 < list.size()) {
            c1595y1.R(Float.floatToRawIntBits(((Float) list.get(i5)).floatValue()));
            i5++;
        }
    }

    public static void i(int i4, List list, C1599z1 c1599z1, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1595y1 c1595y1 = (C1595y1) c1599z1.f12124p;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                int intValue = ((Integer) list.get(i5)).intValue();
                c1595y1.W(i4 << 3);
                if (intValue >= 0) {
                    c1595y1.W(intValue);
                } else {
                    c1595y1.Y(intValue);
                }
                i5++;
            }
            return;
        }
        c1595y1.V(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            i6 += C1595y1.a0(((Integer) list.get(i7)).intValue());
        }
        c1595y1.W(i6);
        while (i5 < list.size()) {
            int intValue2 = ((Integer) list.get(i5)).intValue();
            if (intValue2 >= 0) {
                c1595y1.W(intValue2);
            } else {
                c1595y1.Y(intValue2);
            }
            i5++;
        }
    }

    public static void j(int i4, List list, C1599z1 c1599z1, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1595y1 c1595y1 = (C1595y1) c1599z1.f12124p;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                c1595y1.X(i4, ((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        c1595y1.V(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            i6 += C1595y1.M(((Long) list.get(i7)).longValue());
        }
        c1595y1.W(i6);
        while (i5 < list.size()) {
            c1595y1.Y(((Long) list.get(i5)).longValue());
            i5++;
        }
    }

    public static void k(int i4, List list, C1599z1 c1599z1, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1595y1 c1595y1 = (C1595y1) c1599z1.f12124p;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                c1595y1.Q(i4, ((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        c1595y1.V(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Integer) list.get(i7)).getClass();
            i6 += 4;
        }
        c1595y1.W(i6);
        while (i5 < list.size()) {
            c1595y1.R(((Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    public static void l(int i4, List list, C1599z1 c1599z1, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1595y1 c1595y1 = (C1595y1) c1599z1.f12124p;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                c1595y1.S(i4, ((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        c1595y1.V(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Long) list.get(i7)).getClass();
            i6 += 8;
        }
        c1595y1.W(i6);
        while (i5 < list.size()) {
            c1595y1.T(((Long) list.get(i5)).longValue());
            i5++;
        }
    }

    public static void m(int i4, List list, C1599z1 c1599z1, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1595y1 c1595y1 = (C1595y1) c1599z1.f12124p;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                int intValue = ((Integer) list.get(i5)).intValue();
                c1595y1.W(i4 << 3);
                c1595y1.W((intValue >> 31) ^ (intValue + intValue));
                i5++;
            }
            return;
        }
        c1595y1.V(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            int intValue2 = ((Integer) list.get(i7)).intValue();
            i6 += C1595y1.L((intValue2 >> 31) ^ (intValue2 + intValue2));
        }
        c1595y1.W(i6);
        while (i5 < list.size()) {
            int intValue3 = ((Integer) list.get(i5)).intValue();
            c1595y1.W((intValue3 >> 31) ^ (intValue3 + intValue3));
            i5++;
        }
    }

    public static void n(int i4, List list, C1599z1 c1599z1, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1595y1 c1595y1 = (C1595y1) c1599z1.f12124p;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                long longValue = ((Long) list.get(i5)).longValue();
                c1595y1.X(i4, (longValue >> 63) ^ (longValue + longValue));
                i5++;
            }
            return;
        }
        c1595y1.V(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            long longValue2 = ((Long) list.get(i7)).longValue();
            i6 += C1595y1.M((longValue2 >> 63) ^ (longValue2 + longValue2));
        }
        c1595y1.W(i6);
        while (i5 < list.size()) {
            long longValue3 = ((Long) list.get(i5)).longValue();
            c1595y1.Y((longValue3 >> 63) ^ (longValue3 + longValue3));
            i5++;
        }
    }

    public static void o(int i4, List list, C1599z1 c1599z1) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1595y1 c1595y1 = (C1595y1) c1599z1.f12124p;
        int i5 = 0;
        if (!(list instanceof T1)) {
            while (i5 < list.size()) {
                c1595y1.U((String) list.get(i5), i4);
                i5++;
            }
            return;
        }
        T1 t12 = (T1) list;
        while (i5 < list.size()) {
            Object d4 = t12.d(i5);
            if (d4 instanceof String) {
                c1595y1.U((String) d4, i4);
            } else {
                c1595y1.P(i4, (C1591x1) d4);
            }
            i5++;
        }
    }

    public static void p(int i4, List list, C1599z1 c1599z1, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1595y1 c1595y1 = (C1595y1) c1599z1.f12124p;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                int intValue = ((Integer) list.get(i5)).intValue();
                c1595y1.W(i4 << 3);
                c1595y1.W(intValue);
                i5++;
            }
            return;
        }
        c1595y1.V(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            i6 += C1595y1.L(((Integer) list.get(i7)).intValue());
        }
        c1595y1.W(i6);
        while (i5 < list.size()) {
            c1595y1.W(((Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    public static void q(int i4, List list, C1599z1 c1599z1, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1595y1 c1595y1 = (C1595y1) c1599z1.f12124p;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                c1595y1.X(i4, ((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        c1595y1.V(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            i6 += C1595y1.M(((Long) list.get(i7)).longValue());
        }
        c1595y1.W(i6);
        while (i5 < list.size()) {
            c1595y1.Y(((Long) list.get(i5)).longValue());
            i5++;
        }
    }

    public static boolean r(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static C1561p2 s(boolean z4) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (C1561p2) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z4));
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    public static int t(int i4, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int c02 = C1595y1.c0(i4) * size;
        for (int i5 = 0; i5 < list.size(); i5++) {
            int j4 = ((C1591x1) list.get(i5)).j();
            c02 = U.a.r(j4, j4, c02);
        }
        return c02;
    }

    public static int u(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof J1)) {
            int i5 = 0;
            while (i4 < size) {
                i5 += C1595y1.a0(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return i5;
        }
        J1 j12 = (J1) list;
        int i6 = 0;
        while (i4 < size) {
            j12.i(i4);
            i6 += C1595y1.a0(j12.f11779p[i4]);
            i4++;
        }
        return i6;
    }

    public static int v(int i4, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C1595y1.L(i4 << 3) + 4) * size;
    }

    public static int w(List list) {
        return list.size() * 4;
    }

    public static int x(int i4, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C1595y1.L(i4 << 3) + 8) * size;
    }

    public static int y(List list) {
        return list.size() * 8;
    }

    public static int z(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof J1)) {
            int i5 = 0;
            while (i4 < size) {
                i5 += C1595y1.a0(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return i5;
        }
        J1 j12 = (J1) list;
        int i6 = 0;
        while (i4 < size) {
            j12.i(i4);
            i6 += C1595y1.a0(j12.f11779p[i4]);
            i4++;
        }
        return i6;
    }
}
