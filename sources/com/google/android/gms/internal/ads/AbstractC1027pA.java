package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.pA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1027pA {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f9909a;

    /* renamed from: b, reason: collision with root package name */
    public static final C1198tA f9910b;
    public static final C1198tA c;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.google.android.gms.internal.ads.tA] */
    static {
        Class<?> cls;
        Class<?> cls2;
        C1198tA c1198tA = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f9909a = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                c1198tA = (C1198tA) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        f9910b = c1198tA;
        c = new Object();
    }

    public static void a(int i4, List list, C1384xi c1384xi, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC1229tz abstractC1229tz = (AbstractC1229tz) c1384xi.f11290p;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                abstractC1229tz.Q(i4, ((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        abstractC1229tz.N(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            i6 += AbstractC1229tz.A(((Long) list.get(i7)).longValue());
        }
        abstractC1229tz.P(i6);
        while (i5 < list.size()) {
            abstractC1229tz.R(((Long) list.get(i5)).longValue());
            i5++;
        }
    }

    public static void b(int i4, List list, C1384xi c1384xi, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC1229tz abstractC1229tz = (AbstractC1229tz) c1384xi.f11290p;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                abstractC1229tz.F(i4, ((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        abstractC1229tz.N(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Integer) list.get(i7)).getClass();
            i6 += 4;
        }
        abstractC1229tz.P(i6);
        while (i5 < list.size()) {
            abstractC1229tz.G(((Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    public static void c(int i4, List list, C1384xi c1384xi, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC1229tz abstractC1229tz = (AbstractC1229tz) c1384xi.f11290p;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                abstractC1229tz.H(i4, ((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        abstractC1229tz.N(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Long) list.get(i7)).getClass();
            i6 += 8;
        }
        abstractC1229tz.P(i6);
        while (i5 < list.size()) {
            abstractC1229tz.I(((Long) list.get(i5)).longValue());
            i5++;
        }
    }

    public static void d(int i4, List list, C1384xi c1384xi, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC1229tz abstractC1229tz = (AbstractC1229tz) c1384xi.f11290p;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                int intValue = ((Integer) list.get(i5)).intValue();
                abstractC1229tz.O(i4, (intValue >> 31) ^ (intValue + intValue));
                i5++;
            }
            return;
        }
        abstractC1229tz.N(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            int intValue2 = ((Integer) list.get(i7)).intValue();
            i6 += AbstractC1229tz.z((intValue2 >> 31) ^ (intValue2 + intValue2));
        }
        abstractC1229tz.P(i6);
        while (i5 < list.size()) {
            int intValue3 = ((Integer) list.get(i5)).intValue();
            abstractC1229tz.P((intValue3 >> 31) ^ (intValue3 + intValue3));
            i5++;
        }
    }

    public static void e(int i4, List list, C1384xi c1384xi, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC1229tz abstractC1229tz = (AbstractC1229tz) c1384xi.f11290p;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                long longValue = ((Long) list.get(i5)).longValue();
                abstractC1229tz.Q(i4, (longValue >> 63) ^ (longValue + longValue));
                i5++;
            }
            return;
        }
        abstractC1229tz.N(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            long longValue2 = ((Long) list.get(i7)).longValue();
            i6 += AbstractC1229tz.A((longValue2 >> 63) ^ (longValue2 + longValue2));
        }
        abstractC1229tz.P(i6);
        while (i5 < list.size()) {
            long longValue3 = ((Long) list.get(i5)).longValue();
            abstractC1229tz.R((longValue3 >> 63) ^ (longValue3 + longValue3));
            i5++;
        }
    }

    public static void f(int i4, List list, C1384xi c1384xi, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC1229tz abstractC1229tz = (AbstractC1229tz) c1384xi.f11290p;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                abstractC1229tz.O(i4, ((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        abstractC1229tz.N(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            i6 += AbstractC1229tz.z(((Integer) list.get(i7)).intValue());
        }
        abstractC1229tz.P(i6);
        while (i5 < list.size()) {
            abstractC1229tz.P(((Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    public static void g(int i4, List list, C1384xi c1384xi, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC1229tz abstractC1229tz = (AbstractC1229tz) c1384xi.f11290p;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                abstractC1229tz.Q(i4, ((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        abstractC1229tz.N(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            i6 += AbstractC1229tz.A(((Long) list.get(i7)).longValue());
        }
        abstractC1229tz.P(i6);
        while (i5 < list.size()) {
            abstractC1229tz.R(((Long) list.get(i5)).longValue());
            i5++;
        }
    }

    public static int h(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof Ez)) {
            int i5 = 0;
            while (i4 < size) {
                i5 += AbstractC1229tz.S(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return i5;
        }
        Ez ez = (Ez) list;
        int i6 = 0;
        while (i4 < size) {
            ez.i(i4);
            i6 += AbstractC1229tz.S(ez.f4962p[i4]);
            i4++;
        }
        return i6;
    }

    public static int i(int i4, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC1229tz.z(i4 << 3) + 4) * size;
    }

    public static int j(int i4, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC1229tz.z(i4 << 3) + 8) * size;
    }

    public static int k(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof Ez)) {
            int i5 = 0;
            while (i4 < size) {
                i5 += AbstractC1229tz.S(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return i5;
        }
        Ez ez = (Ez) list;
        int i6 = 0;
        while (i4 < size) {
            ez.i(i4);
            i6 += AbstractC1229tz.S(ez.f4962p[i4]);
            i4++;
        }
        return i6;
    }

    public static int l(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof Wz)) {
            int i5 = 0;
            while (i4 < size) {
                i5 += AbstractC1229tz.A(((Long) list.get(i4)).longValue());
                i4++;
            }
            return i5;
        }
        Wz wz = (Wz) list;
        int i6 = 0;
        while (i4 < size) {
            wz.i(i4);
            i6 += AbstractC1229tz.A(wz.f7581p[i4]);
            i4++;
        }
        return i6;
    }

    public static int m(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof Ez)) {
            int i5 = 0;
            while (i4 < size) {
                int intValue = ((Integer) list.get(i4)).intValue();
                i5 += AbstractC1229tz.z((intValue >> 31) ^ (intValue + intValue));
                i4++;
            }
            return i5;
        }
        Ez ez = (Ez) list;
        int i6 = 0;
        while (i4 < size) {
            ez.i(i4);
            int i7 = ez.f4962p[i4];
            i6 += AbstractC1229tz.z((i7 >> 31) ^ (i7 + i7));
            i4++;
        }
        return i6;
    }

    public static int n(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof Wz)) {
            int i5 = 0;
            while (i4 < size) {
                long longValue = ((Long) list.get(i4)).longValue();
                i5 += AbstractC1229tz.A((longValue >> 63) ^ (longValue + longValue));
                i4++;
            }
            return i5;
        }
        Wz wz = (Wz) list;
        int i6 = 0;
        while (i4 < size) {
            wz.i(i4);
            long j4 = wz.f7581p[i4];
            i6 += AbstractC1229tz.A((j4 >> 63) ^ (j4 + j4));
            i4++;
        }
        return i6;
    }

    public static int o(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof Ez)) {
            int i5 = 0;
            while (i4 < size) {
                i5 += AbstractC1229tz.z(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return i5;
        }
        Ez ez = (Ez) list;
        int i6 = 0;
        while (i4 < size) {
            ez.i(i4);
            i6 += AbstractC1229tz.z(ez.f4962p[i4]);
            i4++;
        }
        return i6;
    }

    public static int p(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof Wz)) {
            int i5 = 0;
            while (i4 < size) {
                i5 += AbstractC1229tz.A(((Long) list.get(i4)).longValue());
                i4++;
            }
            return i5;
        }
        Wz wz = (Wz) list;
        int i6 = 0;
        while (i4 < size) {
            wz.i(i4);
            i6 += AbstractC1229tz.A(wz.f7581p[i4]);
            i4++;
        }
        return i6;
    }

    public static Object q(Object obj, int i4, List list, Gz gz, Object obj2, C1198tA c1198tA) {
        if (gz == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                if (!gz.a(intValue)) {
                    if (obj2 == null) {
                        c1198tA.getClass();
                        obj2 = C1198tA.a(obj);
                    }
                    c1198tA.getClass();
                    ((C1155sA) obj2).c(i4 << 3, Long.valueOf(intValue));
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            Integer num = (Integer) list.get(i6);
            int intValue2 = num.intValue();
            if (gz.a(intValue2)) {
                if (i6 != i5) {
                    list.set(i5, num);
                }
                i5++;
            } else {
                if (obj2 == null) {
                    c1198tA.getClass();
                    obj2 = C1198tA.a(obj);
                }
                c1198tA.getClass();
                ((C1155sA) obj2).c(i4 << 3, Long.valueOf(intValue2));
            }
        }
        if (i5 != size) {
            list.subList(i5, size).clear();
        }
        return obj2;
    }

    public static void r(C1198tA c1198tA, Object obj, Object obj2) {
        c1198tA.getClass();
        Dz dz = (Dz) obj;
        C1155sA c1155sA = dz.zzc;
        C1155sA c1155sA2 = ((Dz) obj2).zzc;
        C1155sA c1155sA3 = C1155sA.f10596f;
        if (!c1155sA3.equals(c1155sA2)) {
            if (c1155sA3.equals(c1155sA)) {
                int i4 = c1155sA.f10597a + c1155sA2.f10597a;
                int[] copyOf = Arrays.copyOf(c1155sA.f10598b, i4);
                System.arraycopy(c1155sA2.f10598b, 0, copyOf, c1155sA.f10597a, c1155sA2.f10597a);
                Object[] copyOf2 = Arrays.copyOf(c1155sA.c, i4);
                System.arraycopy(c1155sA2.c, 0, copyOf2, c1155sA.f10597a, c1155sA2.f10597a);
                c1155sA = new C1155sA(i4, copyOf, copyOf2, true);
            } else {
                c1155sA.getClass();
                if (!c1155sA2.equals(c1155sA3)) {
                    if (!c1155sA.f10599e) {
                        throw new UnsupportedOperationException();
                    }
                    int i5 = c1155sA.f10597a + c1155sA2.f10597a;
                    c1155sA.e(i5);
                    System.arraycopy(c1155sA2.f10598b, 0, c1155sA.f10598b, c1155sA.f10597a, c1155sA2.f10597a);
                    System.arraycopy(c1155sA2.c, 0, c1155sA.c, c1155sA.f10597a, c1155sA2.f10597a);
                    c1155sA.f10597a = i5;
                }
            }
        }
        dz.zzc = c1155sA;
    }

    public static boolean s(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void t(int i4, List list, C1384xi c1384xi, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC1229tz abstractC1229tz = (AbstractC1229tz) c1384xi.f11290p;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                abstractC1229tz.D(i4, ((Boolean) list.get(i5)).booleanValue());
                i5++;
            }
            return;
        }
        abstractC1229tz.N(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Boolean) list.get(i7)).getClass();
            i6++;
        }
        abstractC1229tz.P(i6);
        while (i5 < list.size()) {
            abstractC1229tz.C(((Boolean) list.get(i5)).booleanValue() ? (byte) 1 : (byte) 0);
            i5++;
        }
    }

    public static void u(int i4, List list, C1384xi c1384xi, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC1229tz abstractC1229tz = (AbstractC1229tz) c1384xi.f11290p;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                abstractC1229tz.H(i4, Double.doubleToRawLongBits(((Double) list.get(i5)).doubleValue()));
                i5++;
            }
            return;
        }
        abstractC1229tz.N(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Double) list.get(i7)).getClass();
            i6 += 8;
        }
        abstractC1229tz.P(i6);
        while (i5 < list.size()) {
            abstractC1229tz.I(Double.doubleToRawLongBits(((Double) list.get(i5)).doubleValue()));
            i5++;
        }
    }

    public static void v(int i4, List list, C1384xi c1384xi, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC1229tz abstractC1229tz = (AbstractC1229tz) c1384xi.f11290p;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                abstractC1229tz.J(i4, ((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        abstractC1229tz.N(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            i6 += AbstractC1229tz.S(((Integer) list.get(i7)).intValue());
        }
        abstractC1229tz.P(i6);
        while (i5 < list.size()) {
            abstractC1229tz.K(((Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    public static void w(int i4, List list, C1384xi c1384xi, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC1229tz abstractC1229tz = (AbstractC1229tz) c1384xi.f11290p;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                abstractC1229tz.F(i4, ((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        abstractC1229tz.N(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Integer) list.get(i7)).getClass();
            i6 += 4;
        }
        abstractC1229tz.P(i6);
        while (i5 < list.size()) {
            abstractC1229tz.G(((Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    public static void x(int i4, List list, C1384xi c1384xi, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC1229tz abstractC1229tz = (AbstractC1229tz) c1384xi.f11290p;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                abstractC1229tz.H(i4, ((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        abstractC1229tz.N(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Long) list.get(i7)).getClass();
            i6 += 8;
        }
        abstractC1229tz.P(i6);
        while (i5 < list.size()) {
            abstractC1229tz.I(((Long) list.get(i5)).longValue());
            i5++;
        }
    }

    public static void y(int i4, List list, C1384xi c1384xi, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC1229tz abstractC1229tz = (AbstractC1229tz) c1384xi.f11290p;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                abstractC1229tz.F(i4, Float.floatToRawIntBits(((Float) list.get(i5)).floatValue()));
                i5++;
            }
            return;
        }
        abstractC1229tz.N(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Float) list.get(i7)).getClass();
            i6 += 4;
        }
        abstractC1229tz.P(i6);
        while (i5 < list.size()) {
            abstractC1229tz.G(Float.floatToRawIntBits(((Float) list.get(i5)).floatValue()));
            i5++;
        }
    }

    public static void z(int i4, List list, C1384xi c1384xi, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC1229tz abstractC1229tz = (AbstractC1229tz) c1384xi.f11290p;
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                abstractC1229tz.J(i4, ((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        abstractC1229tz.N(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            i6 += AbstractC1229tz.S(((Integer) list.get(i7)).intValue());
        }
        abstractC1229tz.P(i6);
        while (i5 < list.size()) {
            abstractC1229tz.K(((Integer) list.get(i5)).intValue());
            i5++;
        }
    }
}
