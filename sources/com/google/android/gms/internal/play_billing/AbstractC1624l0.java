package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.play_billing.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1624l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f12224a;

    /* renamed from: b, reason: collision with root package name */
    public static final C1630o0 f12225b;
    public static final C1630o0 c;

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.gms.internal.play_billing.o0, java.lang.Object] */
    static {
        Class<?> cls;
        Class<?> cls2;
        C1630o0 c1630o0 = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f12224a = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                c1630o0 = (C1630o0) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        f12225b = c1630o0;
        c = new Object();
    }

    public static void a(int i4, List list, W w2, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1640u c1640u = (C1640u) w2.f12171a;
        int i5 = 0;
        if (!(list instanceof F)) {
            if (!z4) {
                while (i5 < list.size()) {
                    c1640u.Y(i4, ((Integer) list.get(i5)).intValue());
                    i5++;
                }
                return;
            }
            c1640u.f0(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Integer) list.get(i7)).getClass();
                i6 += 4;
            }
            c1640u.h0(i6);
            while (i5 < list.size()) {
                c1640u.Z(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        F f4 = (F) list;
        if (!z4) {
            while (i5 < f4.f12144q) {
                c1640u.Y(i4, f4.h(i5));
                i5++;
            }
            return;
        }
        c1640u.f0(i4, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < f4.f12144q; i9++) {
            f4.h(i9);
            i8 += 4;
        }
        c1640u.h0(i8);
        while (i5 < f4.f12144q) {
            c1640u.Z(f4.h(i5));
            i5++;
        }
    }

    public static void b(int i4, List list, W w2, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1640u c1640u = (C1640u) w2.f12171a;
        if (list instanceof U) {
            throw new ClassCastException();
        }
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                c1640u.a0(i4, ((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        c1640u.f0(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Long) list.get(i7)).getClass();
            i6 += 8;
        }
        c1640u.h0(i6);
        while (i5 < list.size()) {
            c1640u.b0(((Long) list.get(i5)).longValue());
            i5++;
        }
    }

    public static void c(int i4, List list, W w2, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1640u c1640u = (C1640u) w2.f12171a;
        int i5 = 0;
        if (!(list instanceof F)) {
            if (!z4) {
                while (i5 < list.size()) {
                    int intValue = ((Integer) list.get(i5)).intValue();
                    c1640u.g0(i4, (intValue >> 31) ^ (intValue + intValue));
                    i5++;
                }
                return;
            }
            c1640u.f0(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                int intValue2 = ((Integer) list.get(i7)).intValue();
                i6 += C1640u.l0((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            c1640u.h0(i6);
            while (i5 < list.size()) {
                int intValue3 = ((Integer) list.get(i5)).intValue();
                c1640u.h0((intValue3 >> 31) ^ (intValue3 + intValue3));
                i5++;
            }
            return;
        }
        F f4 = (F) list;
        if (!z4) {
            while (i5 < f4.f12144q) {
                int h4 = f4.h(i5);
                c1640u.g0(i4, (h4 >> 31) ^ (h4 + h4));
                i5++;
            }
            return;
        }
        c1640u.f0(i4, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < f4.f12144q; i9++) {
            int h5 = f4.h(i9);
            i8 += C1640u.l0((h5 >> 31) ^ (h5 + h5));
        }
        c1640u.h0(i8);
        while (i5 < f4.f12144q) {
            int h6 = f4.h(i5);
            c1640u.h0((h6 >> 31) ^ (h6 + h6));
            i5++;
        }
    }

    public static void d(int i4, List list, W w2, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1640u c1640u = (C1640u) w2.f12171a;
        if (list instanceof U) {
            throw new ClassCastException();
        }
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                long longValue = ((Long) list.get(i5)).longValue();
                c1640u.i0(i4, (longValue >> 63) ^ (longValue + longValue));
                i5++;
            }
            return;
        }
        c1640u.f0(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            long longValue2 = ((Long) list.get(i7)).longValue();
            i6 += C1640u.m0((longValue2 >> 63) ^ (longValue2 + longValue2));
        }
        c1640u.h0(i6);
        while (i5 < list.size()) {
            long longValue3 = ((Long) list.get(i5)).longValue();
            c1640u.j0((longValue3 >> 63) ^ (longValue3 + longValue3));
            i5++;
        }
    }

    public static void e(int i4, List list, W w2, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1640u c1640u = (C1640u) w2.f12171a;
        int i5 = 0;
        if (!(list instanceof F)) {
            if (!z4) {
                while (i5 < list.size()) {
                    c1640u.g0(i4, ((Integer) list.get(i5)).intValue());
                    i5++;
                }
                return;
            }
            c1640u.f0(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += C1640u.l0(((Integer) list.get(i7)).intValue());
            }
            c1640u.h0(i6);
            while (i5 < list.size()) {
                c1640u.h0(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        F f4 = (F) list;
        if (!z4) {
            while (i5 < f4.f12144q) {
                c1640u.g0(i4, f4.h(i5));
                i5++;
            }
            return;
        }
        c1640u.f0(i4, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < f4.f12144q; i9++) {
            i8 += C1640u.l0(f4.h(i9));
        }
        c1640u.h0(i8);
        while (i5 < f4.f12144q) {
            c1640u.h0(f4.h(i5));
            i5++;
        }
    }

    public static void f(int i4, List list, W w2, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1640u c1640u = (C1640u) w2.f12171a;
        if (list instanceof U) {
            throw new ClassCastException();
        }
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                c1640u.i0(i4, ((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        c1640u.f0(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            i6 += C1640u.m0(((Long) list.get(i7)).longValue());
        }
        c1640u.h0(i6);
        while (i5 < list.size()) {
            c1640u.j0(((Long) list.get(i5)).longValue());
            i5++;
        }
    }

    public static boolean g(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int h(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof F)) {
            int i5 = 0;
            while (i4 < size) {
                i5 += C1640u.m0(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return i5;
        }
        F f4 = (F) list;
        int i6 = 0;
        while (i4 < size) {
            i6 += C1640u.m0(f4.h(i4));
            i4++;
        }
        return i6;
    }

    public static int i(int i4, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C1640u.l0(i4 << 3) + 4) * size;
    }

    public static int j(int i4, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C1640u.l0(i4 << 3) + 8) * size;
    }

    public static int k(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof F)) {
            int i5 = 0;
            while (i4 < size) {
                i5 += C1640u.m0(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return i5;
        }
        F f4 = (F) list;
        int i6 = 0;
        while (i4 < size) {
            i6 += C1640u.m0(f4.h(i4));
            i4++;
        }
        return i6;
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof U) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += C1640u.m0(((Long) list.get(i5)).longValue());
        }
        return i4;
    }

    public static int m(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof F)) {
            int i5 = 0;
            while (i4 < size) {
                int intValue = ((Integer) list.get(i4)).intValue();
                i5 += C1640u.l0((intValue >> 31) ^ (intValue + intValue));
                i4++;
            }
            return i5;
        }
        F f4 = (F) list;
        int i6 = 0;
        while (i4 < size) {
            int h4 = f4.h(i4);
            i6 += C1640u.l0((h4 >> 31) ^ (h4 + h4));
            i4++;
        }
        return i6;
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof U) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            long longValue = ((Long) list.get(i5)).longValue();
            i4 += C1640u.m0((longValue >> 63) ^ (longValue + longValue));
        }
        return i4;
    }

    public static int o(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof F)) {
            int i5 = 0;
            while (i4 < size) {
                i5 += C1640u.l0(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return i5;
        }
        F f4 = (F) list;
        int i6 = 0;
        while (i4 < size) {
            i6 += C1640u.l0(f4.h(i4));
            i4++;
        }
        return i6;
    }

    public static int p(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof U) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += C1640u.m0(((Long) list.get(i5)).longValue());
        }
        return i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
    
        r5 = r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object q(java.lang.Object r2, int r3, int r4, java.lang.Object r5, com.google.android.gms.internal.play_billing.C1630o0 r6) {
        /*
            if (r5 != 0) goto L13
            r6.getClass()
            com.google.android.gms.internal.play_billing.E r2 = (com.google.android.gms.internal.play_billing.E) r2
            com.google.android.gms.internal.play_billing.n0 r5 = r2.zzc
            com.google.android.gms.internal.play_billing.n0 r0 = com.google.android.gms.internal.play_billing.C1628n0.f12233f
            if (r5 != r0) goto L13
            com.google.android.gms.internal.play_billing.n0 r5 = com.google.android.gms.internal.play_billing.C1628n0.b()
            r2.zzc = r5
        L13:
            long r0 = (long) r4
            r6.getClass()
            int r2 = r3 << 3
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            r4 = r5
            com.google.android.gms.internal.play_billing.n0 r4 = (com.google.android.gms.internal.play_billing.C1628n0) r4
            r4.c(r2, r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.AbstractC1624l0.q(java.lang.Object, int, int, java.lang.Object, com.google.android.gms.internal.play_billing.o0):java.lang.Object");
    }

    public static void r(C1630o0 c1630o0, Object obj, Object obj2) {
        c1630o0.getClass();
        E e4 = (E) obj;
        C1628n0 c1628n0 = e4.zzc;
        C1628n0 c1628n02 = ((E) obj2).zzc;
        C1628n0 c1628n03 = C1628n0.f12233f;
        if (!c1628n03.equals(c1628n02)) {
            if (c1628n03.equals(c1628n0)) {
                int i4 = c1628n0.f12234a + c1628n02.f12234a;
                int[] copyOf = Arrays.copyOf(c1628n0.f12235b, i4);
                System.arraycopy(c1628n02.f12235b, 0, copyOf, c1628n0.f12234a, c1628n02.f12234a);
                Object[] copyOf2 = Arrays.copyOf(c1628n0.c, i4);
                System.arraycopy(c1628n02.c, 0, copyOf2, c1628n0.f12234a, c1628n02.f12234a);
                c1628n0 = new C1628n0(i4, copyOf, copyOf2, true);
            } else {
                c1628n0.getClass();
                if (!c1628n02.equals(c1628n03)) {
                    if (!c1628n0.f12236e) {
                        throw new UnsupportedOperationException();
                    }
                    int i5 = c1628n0.f12234a + c1628n02.f12234a;
                    c1628n0.e(i5);
                    System.arraycopy(c1628n02.f12235b, 0, c1628n0.f12235b, c1628n0.f12234a, c1628n02.f12234a);
                    System.arraycopy(c1628n02.c, 0, c1628n0.c, c1628n0.f12234a, c1628n02.f12234a);
                    c1628n0.f12234a = i5;
                }
            }
        }
        e4.zzc = c1628n0;
    }

    public static void s(int i4, List list, W w2, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1640u c1640u = (C1640u) w2.f12171a;
        if (list instanceof r) {
            throw new ClassCastException();
        }
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                boolean booleanValue = ((Boolean) list.get(i5)).booleanValue();
                c1640u.h0(i4 << 3);
                c1640u.V(booleanValue ? (byte) 1 : (byte) 0);
                i5++;
            }
            return;
        }
        c1640u.f0(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Boolean) list.get(i7)).getClass();
            i6++;
        }
        c1640u.h0(i6);
        while (i5 < list.size()) {
            c1640u.V(((Boolean) list.get(i5)).booleanValue() ? (byte) 1 : (byte) 0);
            i5++;
        }
    }

    public static void t(int i4, List list, W w2, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1640u c1640u = (C1640u) w2.f12171a;
        if (list instanceof AbstractC1642v) {
            throw new ClassCastException();
        }
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                c1640u.a0(i4, Double.doubleToRawLongBits(((Double) list.get(i5)).doubleValue()));
                i5++;
            }
            return;
        }
        c1640u.f0(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Double) list.get(i7)).getClass();
            i6 += 8;
        }
        c1640u.h0(i6);
        while (i5 < list.size()) {
            c1640u.b0(Double.doubleToRawLongBits(((Double) list.get(i5)).doubleValue()));
            i5++;
        }
    }

    public static void u(int i4, List list, W w2, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1640u c1640u = (C1640u) w2.f12171a;
        int i5 = 0;
        if (!(list instanceof F)) {
            if (!z4) {
                while (i5 < list.size()) {
                    c1640u.c0(i4, ((Integer) list.get(i5)).intValue());
                    i5++;
                }
                return;
            }
            c1640u.f0(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += C1640u.m0(((Integer) list.get(i7)).intValue());
            }
            c1640u.h0(i6);
            while (i5 < list.size()) {
                c1640u.d0(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        F f4 = (F) list;
        if (!z4) {
            while (i5 < f4.f12144q) {
                c1640u.c0(i4, f4.h(i5));
                i5++;
            }
            return;
        }
        c1640u.f0(i4, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < f4.f12144q; i9++) {
            i8 += C1640u.m0(f4.h(i9));
        }
        c1640u.h0(i8);
        while (i5 < f4.f12144q) {
            c1640u.d0(f4.h(i5));
            i5++;
        }
    }

    public static void v(int i4, List list, W w2, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1640u c1640u = (C1640u) w2.f12171a;
        int i5 = 0;
        if (!(list instanceof F)) {
            if (!z4) {
                while (i5 < list.size()) {
                    c1640u.Y(i4, ((Integer) list.get(i5)).intValue());
                    i5++;
                }
                return;
            }
            c1640u.f0(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Integer) list.get(i7)).getClass();
                i6 += 4;
            }
            c1640u.h0(i6);
            while (i5 < list.size()) {
                c1640u.Z(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        F f4 = (F) list;
        if (!z4) {
            while (i5 < f4.f12144q) {
                c1640u.Y(i4, f4.h(i5));
                i5++;
            }
            return;
        }
        c1640u.f0(i4, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < f4.f12144q; i9++) {
            f4.h(i9);
            i8 += 4;
        }
        c1640u.h0(i8);
        while (i5 < f4.f12144q) {
            c1640u.Z(f4.h(i5));
            i5++;
        }
    }

    public static void w(int i4, List list, W w2, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1640u c1640u = (C1640u) w2.f12171a;
        if (list instanceof U) {
            throw new ClassCastException();
        }
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                c1640u.a0(i4, ((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        c1640u.f0(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Long) list.get(i7)).getClass();
            i6 += 8;
        }
        c1640u.h0(i6);
        while (i5 < list.size()) {
            c1640u.b0(((Long) list.get(i5)).longValue());
            i5++;
        }
    }

    public static void x(int i4, List list, W w2, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1640u c1640u = (C1640u) w2.f12171a;
        if (list instanceof A) {
            throw new ClassCastException();
        }
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                c1640u.Y(i4, Float.floatToRawIntBits(((Float) list.get(i5)).floatValue()));
                i5++;
            }
            return;
        }
        c1640u.f0(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Float) list.get(i7)).getClass();
            i6 += 4;
        }
        c1640u.h0(i6);
        while (i5 < list.size()) {
            c1640u.Z(Float.floatToRawIntBits(((Float) list.get(i5)).floatValue()));
            i5++;
        }
    }

    public static void y(int i4, List list, W w2, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1640u c1640u = (C1640u) w2.f12171a;
        int i5 = 0;
        if (!(list instanceof F)) {
            if (!z4) {
                while (i5 < list.size()) {
                    c1640u.c0(i4, ((Integer) list.get(i5)).intValue());
                    i5++;
                }
                return;
            }
            c1640u.f0(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += C1640u.m0(((Integer) list.get(i7)).intValue());
            }
            c1640u.h0(i6);
            while (i5 < list.size()) {
                c1640u.d0(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        F f4 = (F) list;
        if (!z4) {
            while (i5 < f4.f12144q) {
                c1640u.c0(i4, f4.h(i5));
                i5++;
            }
            return;
        }
        c1640u.f0(i4, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < f4.f12144q; i9++) {
            i8 += C1640u.m0(f4.h(i9));
        }
        c1640u.h0(i8);
        while (i5 < f4.f12144q) {
            c1640u.d0(f4.h(i5));
            i5++;
        }
    }

    public static void z(int i4, List list, W w2, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1640u c1640u = (C1640u) w2.f12171a;
        if (list instanceof U) {
            throw new ClassCastException();
        }
        int i5 = 0;
        if (!z4) {
            while (i5 < list.size()) {
                c1640u.i0(i4, ((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        c1640u.f0(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            i6 += C1640u.m0(((Long) list.get(i7)).longValue());
        }
        c1640u.h0(i6);
        while (i5 < list.size()) {
            c1640u.j0(((Long) list.get(i5)).longValue());
            i5++;
        }
    }
}
