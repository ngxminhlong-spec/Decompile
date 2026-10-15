package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.C0544dz;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.measurement.e2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1511e2 implements InterfaceC1549m2 {

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f11916l = new int[0];

    /* renamed from: m, reason: collision with root package name */
    public static final Unsafe f11917m = AbstractC1584v2.f();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f11918a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f11919b;
    public final int c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC1571s1 f11920e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f11921f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f11922g;

    /* renamed from: h, reason: collision with root package name */
    public final int f11923h;

    /* renamed from: i, reason: collision with root package name */
    public final int f11924i;

    /* renamed from: j, reason: collision with root package name */
    public final W1 f11925j;

    /* renamed from: k, reason: collision with root package name */
    public final C1561p2 f11926k;

    public C1511e2(int[] iArr, Object[] objArr, int i4, int i5, AbstractC1571s1 abstractC1571s1, boolean z4, int[] iArr2, int i6, int i7, W1 w12, C1561p2 c1561p2, B1 b12, C1496b2 c1496b2) {
        this.f11918a = iArr;
        this.f11919b = objArr;
        this.c = i4;
        this.d = i5;
        this.f11921f = z4;
        this.f11922g = iArr2;
        this.f11923h = i6;
        this.f11924i = i7;
        this.f11925j = w12;
        this.f11926k = c1561p2;
        this.f11920e = abstractC1571s1;
    }

    public static C1511e2 A(C1545l2 c1545l2, W1 w12, C1561p2 c1561p2, B1 b12, C1496b2 c1496b2) {
        if (c1545l2 instanceof C1545l2) {
            return B(c1545l2, w12, c1561p2, b12, c1496b2);
        }
        c1545l2.getClass();
        throw new ClassCastException();
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x027f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.measurement.C1511e2 B(com.google.android.gms.internal.measurement.C1545l2 r35, com.google.android.gms.internal.measurement.W1 r36, com.google.android.gms.internal.measurement.C1561p2 r37, com.google.android.gms.internal.measurement.B1 r38, com.google.android.gms.internal.measurement.C1496b2 r39) {
        /*
            Method dump skipped, instructions count: 1011
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1511e2.B(com.google.android.gms.internal.measurement.l2, com.google.android.gms.internal.measurement.W1, com.google.android.gms.internal.measurement.p2, com.google.android.gms.internal.measurement.B1, com.google.android.gms.internal.measurement.b2):com.google.android.gms.internal.measurement.e2");
    }

    public static int E(long j4, Object obj) {
        return ((Integer) AbstractC1584v2.c.m(j4, obj)).intValue();
    }

    public static int i(int i4) {
        return (i4 >>> 20) & 255;
    }

    public static long k(long j4, Object obj) {
        return ((Long) AbstractC1584v2.c.m(j4, obj)).longValue();
    }

    public static Field p(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder n4 = U.a.n("Field ", str, " for ", name, " not found. Known fields are ");
            n4.append(arrays);
            throw new RuntimeException(n4.toString());
        }
    }

    public static final void x(int i4, Object obj, C1599z1 c1599z1) {
        if (!(obj instanceof String)) {
            c1599z1.d(i4, (C1591x1) obj);
        } else {
            ((C1595y1) c1599z1.f12124p).U((String) obj, i4);
        }
    }

    public static C1557o2 z(Object obj) {
        I1 i12 = (I1) obj;
        C1557o2 c1557o2 = i12.zzc;
        if (c1557o2 != C1557o2.f11992f) {
            return c1557o2;
        }
        C1557o2 b4 = C1557o2.b();
        i12.zzc = b4;
        return b4;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x003c. Please report as an issue. */
    public final int C(Object obj) {
        int i4;
        int L4;
        int M4;
        int L5;
        int a02;
        int B4;
        int i5;
        Unsafe unsafe = f11917m;
        int i6 = 1048575;
        int i7 = 1048575;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            int[] iArr = this.f11918a;
            if (i8 >= iArr.length) {
                this.f11926k.getClass();
                return ((I1) obj).zzc.a() + i9;
            }
            int j4 = j(i8);
            int i11 = iArr[i8];
            int i12 = i(j4);
            if (i12 <= 17) {
                int i13 = iArr[i8 + 2];
                int i14 = i13 & i6;
                i4 = 1 << (i13 >>> 20);
                if (i14 != i7) {
                    i10 = unsafe.getInt(obj, i14);
                    i7 = i14;
                }
            } else {
                i4 = 0;
            }
            long j5 = j4 & i6;
            switch (i12) {
                case 0:
                    if ((i10 & i4) != 0) {
                        i9 = U.a.r(i11 << 3, 8, i9);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if ((i10 & i4) != 0) {
                        i9 = U.a.r(i11 << 3, 4, i9);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if ((i4 & i10) != 0) {
                        long j6 = unsafe.getLong(obj, j5);
                        L4 = C1595y1.L(i11 << 3);
                        M4 = C1595y1.M(j6);
                        B4 = M4 + L4;
                        i9 += B4;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if ((i4 & i10) != 0) {
                        long j7 = unsafe.getLong(obj, j5);
                        L4 = C1595y1.L(i11 << 3);
                        M4 = C1595y1.M(j7);
                        B4 = M4 + L4;
                        i9 += B4;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if ((i4 & i10) != 0) {
                        int i15 = unsafe.getInt(obj, j5);
                        L5 = C1595y1.L(i11 << 3);
                        a02 = C1595y1.a0(i15);
                        B4 = a02 + L5;
                        i9 += B4;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if ((i10 & i4) != 0) {
                        i9 = U.a.r(i11 << 3, 8, i9);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if ((i10 & i4) != 0) {
                        i9 = U.a.r(i11 << 3, 4, i9);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if ((i10 & i4) != 0) {
                        i9 = U.a.r(i11 << 3, 1, i9);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if ((i4 & i10) != 0) {
                        Object object = unsafe.getObject(obj, j5);
                        if (object instanceof C1591x1) {
                            int L6 = C1595y1.L(i11 << 3);
                            int j8 = ((C1591x1) object).j();
                            i9 = U.a.d(j8, j8, L6, i9);
                            break;
                        } else {
                            L5 = C1595y1.L(i11 << 3);
                            a02 = C1595y1.b0((String) object);
                            B4 = a02 + L5;
                            i9 += B4;
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if ((i4 & i10) != 0) {
                        B4 = AbstractC1553n2.B(i11, unsafe.getObject(obj, j5), n(i8));
                        i9 += B4;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if ((i4 & i10) != 0) {
                        C1591x1 c1591x1 = (C1591x1) unsafe.getObject(obj, j5);
                        int L7 = C1595y1.L(i11 << 3);
                        int j9 = c1591x1.j();
                        i9 = U.a.d(j9, j9, L7, i9);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if ((i4 & i10) != 0) {
                        i9 = U.a.r(unsafe.getInt(obj, j5), C1595y1.L(i11 << 3), i9);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if ((i4 & i10) != 0) {
                        int i16 = unsafe.getInt(obj, j5);
                        L5 = C1595y1.L(i11 << 3);
                        a02 = C1595y1.a0(i16);
                        B4 = a02 + L5;
                        i9 += B4;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if ((i10 & i4) != 0) {
                        i9 = U.a.r(i11 << 3, 4, i9);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if ((i10 & i4) != 0) {
                        i9 = U.a.r(i11 << 3, 8, i9);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if ((i4 & i10) != 0) {
                        int i17 = unsafe.getInt(obj, j5);
                        i9 = U.a.r((i17 >> 31) ^ (i17 + i17), C1595y1.L(i11 << 3), i9);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if ((i4 & i10) != 0) {
                        long j10 = unsafe.getLong(obj, j5);
                        L4 = C1595y1.L(i11 << 3);
                        M4 = C1595y1.M((j10 >> 63) ^ (j10 + j10));
                        B4 = M4 + L4;
                        i9 += B4;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if ((i4 & i10) != 0) {
                        B4 = C1595y1.Z(i11, (AbstractC1571s1) unsafe.getObject(obj, j5), n(i8));
                        i9 += B4;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    B4 = AbstractC1553n2.x(i11, (List) unsafe.getObject(obj, j5));
                    i9 += B4;
                    break;
                case 19:
                    B4 = AbstractC1553n2.v(i11, (List) unsafe.getObject(obj, j5));
                    i9 += B4;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj, j5);
                    Class cls = AbstractC1553n2.f11986a;
                    if (list.size() != 0) {
                        B4 = U.a.u(i11, list.size(), AbstractC1553n2.A(list));
                        i9 += B4;
                        break;
                    }
                    B4 = 0;
                    i9 += B4;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j5);
                    Class cls2 = AbstractC1553n2.f11986a;
                    int size = list2.size();
                    if (size != 0) {
                        B4 = U.a.u(i11, size, AbstractC1553n2.H(list2));
                        i9 += B4;
                        break;
                    }
                    B4 = 0;
                    i9 += B4;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j5);
                    Class cls3 = AbstractC1553n2.f11986a;
                    int size2 = list3.size();
                    if (size2 != 0) {
                        B4 = U.a.u(i11, size2, AbstractC1553n2.z(list3));
                        i9 += B4;
                        break;
                    }
                    B4 = 0;
                    i9 += B4;
                case 23:
                    B4 = AbstractC1553n2.x(i11, (List) unsafe.getObject(obj, j5));
                    i9 += B4;
                    break;
                case 24:
                    B4 = AbstractC1553n2.v(i11, (List) unsafe.getObject(obj, j5));
                    i9 += B4;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj, j5);
                    Class cls4 = AbstractC1553n2.f11986a;
                    int size3 = list4.size();
                    i9 += size3 == 0 ? 0 : (C1595y1.L(i11 << 3) + 1) * size3;
                    break;
                case 26:
                    B4 = AbstractC1553n2.F(i11, (List) unsafe.getObject(obj, j5));
                    i9 += B4;
                    break;
                case 27:
                    B4 = AbstractC1553n2.C(i11, (List) unsafe.getObject(obj, j5), n(i8));
                    i9 += B4;
                    break;
                case 28:
                    B4 = AbstractC1553n2.t(i11, (List) unsafe.getObject(obj, j5));
                    i9 += B4;
                    break;
                case 29:
                    List list5 = (List) unsafe.getObject(obj, j5);
                    Class cls5 = AbstractC1553n2.f11986a;
                    int size4 = list5.size();
                    if (size4 != 0) {
                        B4 = U.a.u(i11, size4, AbstractC1553n2.G(list5));
                        i9 += B4;
                        break;
                    }
                    B4 = 0;
                    i9 += B4;
                case 30:
                    List list6 = (List) unsafe.getObject(obj, j5);
                    Class cls6 = AbstractC1553n2.f11986a;
                    int size5 = list6.size();
                    if (size5 != 0) {
                        B4 = U.a.u(i11, size5, AbstractC1553n2.u(list6));
                        i9 += B4;
                        break;
                    }
                    B4 = 0;
                    i9 += B4;
                case 31:
                    B4 = AbstractC1553n2.v(i11, (List) unsafe.getObject(obj, j5));
                    i9 += B4;
                    break;
                case 32:
                    B4 = AbstractC1553n2.x(i11, (List) unsafe.getObject(obj, j5));
                    i9 += B4;
                    break;
                case 33:
                    List list7 = (List) unsafe.getObject(obj, j5);
                    Class cls7 = AbstractC1553n2.f11986a;
                    int size6 = list7.size();
                    if (size6 != 0) {
                        B4 = U.a.u(i11, size6, AbstractC1553n2.D(list7));
                        i9 += B4;
                        break;
                    }
                    B4 = 0;
                    i9 += B4;
                case 34:
                    List list8 = (List) unsafe.getObject(obj, j5);
                    Class cls8 = AbstractC1553n2.f11986a;
                    int size7 = list8.size();
                    if (size7 != 0) {
                        B4 = U.a.u(i11, size7, AbstractC1553n2.E(list8));
                        i9 += B4;
                        break;
                    }
                    B4 = 0;
                    i9 += B4;
                case 35:
                    int y = AbstractC1553n2.y((List) unsafe.getObject(obj, j5));
                    if (y > 0) {
                        i9 = U.a.d(y, C1595y1.c0(i11), y, i9);
                        break;
                    } else {
                        break;
                    }
                case 36:
                    int w2 = AbstractC1553n2.w((List) unsafe.getObject(obj, j5));
                    if (w2 > 0) {
                        i9 = U.a.d(w2, C1595y1.c0(i11), w2, i9);
                        break;
                    } else {
                        break;
                    }
                case 37:
                    int A3 = AbstractC1553n2.A((List) unsafe.getObject(obj, j5));
                    if (A3 > 0) {
                        i9 = U.a.d(A3, C1595y1.c0(i11), A3, i9);
                        break;
                    } else {
                        break;
                    }
                case 38:
                    int H3 = AbstractC1553n2.H((List) unsafe.getObject(obj, j5));
                    if (H3 > 0) {
                        i9 = U.a.d(H3, C1595y1.c0(i11), H3, i9);
                        break;
                    } else {
                        break;
                    }
                case 39:
                    int z4 = AbstractC1553n2.z((List) unsafe.getObject(obj, j5));
                    if (z4 > 0) {
                        i9 = U.a.d(z4, C1595y1.c0(i11), z4, i9);
                        break;
                    } else {
                        break;
                    }
                case 40:
                    int y4 = AbstractC1553n2.y((List) unsafe.getObject(obj, j5));
                    if (y4 > 0) {
                        i9 = U.a.d(y4, C1595y1.c0(i11), y4, i9);
                        break;
                    } else {
                        break;
                    }
                case 41:
                    int w4 = AbstractC1553n2.w((List) unsafe.getObject(obj, j5));
                    if (w4 > 0) {
                        i9 = U.a.d(w4, C1595y1.c0(i11), w4, i9);
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list9 = (List) unsafe.getObject(obj, j5);
                    Class cls9 = AbstractC1553n2.f11986a;
                    int size8 = list9.size();
                    if (size8 > 0) {
                        i9 = U.a.d(size8, C1595y1.c0(i11), size8, i9);
                        break;
                    } else {
                        break;
                    }
                case 43:
                    int G3 = AbstractC1553n2.G((List) unsafe.getObject(obj, j5));
                    if (G3 > 0) {
                        i9 = U.a.d(G3, C1595y1.c0(i11), G3, i9);
                        break;
                    } else {
                        break;
                    }
                case 44:
                    int u2 = AbstractC1553n2.u((List) unsafe.getObject(obj, j5));
                    if (u2 > 0) {
                        i9 = U.a.d(u2, C1595y1.c0(i11), u2, i9);
                        break;
                    } else {
                        break;
                    }
                case 45:
                    int w5 = AbstractC1553n2.w((List) unsafe.getObject(obj, j5));
                    if (w5 > 0) {
                        i9 = U.a.d(w5, C1595y1.c0(i11), w5, i9);
                        break;
                    } else {
                        break;
                    }
                case 46:
                    int y5 = AbstractC1553n2.y((List) unsafe.getObject(obj, j5));
                    if (y5 > 0) {
                        i9 = U.a.d(y5, C1595y1.c0(i11), y5, i9);
                        break;
                    } else {
                        break;
                    }
                case 47:
                    int D4 = AbstractC1553n2.D((List) unsafe.getObject(obj, j5));
                    if (D4 > 0) {
                        i9 = U.a.d(D4, C1595y1.c0(i11), D4, i9);
                        break;
                    } else {
                        break;
                    }
                case 48:
                    int E4 = AbstractC1553n2.E((List) unsafe.getObject(obj, j5));
                    if (E4 > 0) {
                        i9 = U.a.d(E4, C1595y1.c0(i11), E4, i9);
                        break;
                    } else {
                        break;
                    }
                case 49:
                    List list10 = (List) unsafe.getObject(obj, j5);
                    InterfaceC1549m2 n4 = n(i8);
                    Class cls10 = AbstractC1553n2.f11986a;
                    int size9 = list10.size();
                    if (size9 != 0) {
                        i5 = 0;
                        for (int i18 = 0; i18 < size9; i18++) {
                            i5 += C1595y1.Z(i11, (AbstractC1571s1) list10.get(i18), n4);
                        }
                    } else {
                        i5 = 0;
                    }
                    i9 += i5;
                    break;
                case 50:
                    C1496b2.a(unsafe.getObject(obj, j5), o(i8));
                    break;
                case 51:
                    if (w(i11, i8, obj)) {
                        i9 = U.a.r(i11 << 3, 8, i9);
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (w(i11, i8, obj)) {
                        i9 = U.a.r(i11 << 3, 4, i9);
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (w(i11, i8, obj)) {
                        long k3 = k(j5, obj);
                        L4 = C1595y1.L(i11 << 3);
                        M4 = C1595y1.M(k3);
                        B4 = M4 + L4;
                        i9 += B4;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (w(i11, i8, obj)) {
                        long k4 = k(j5, obj);
                        L4 = C1595y1.L(i11 << 3);
                        M4 = C1595y1.M(k4);
                        B4 = M4 + L4;
                        i9 += B4;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (w(i11, i8, obj)) {
                        int E5 = E(j5, obj);
                        L5 = C1595y1.L(i11 << 3);
                        a02 = C1595y1.a0(E5);
                        B4 = a02 + L5;
                        i9 += B4;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (w(i11, i8, obj)) {
                        i9 = U.a.r(i11 << 3, 8, i9);
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (w(i11, i8, obj)) {
                        i9 = U.a.r(i11 << 3, 4, i9);
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (w(i11, i8, obj)) {
                        i9 = U.a.r(i11 << 3, 1, i9);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (w(i11, i8, obj)) {
                        Object object2 = unsafe.getObject(obj, j5);
                        if (object2 instanceof C1591x1) {
                            int L8 = C1595y1.L(i11 << 3);
                            int j11 = ((C1591x1) object2).j();
                            i9 = U.a.d(j11, j11, L8, i9);
                            break;
                        } else {
                            L5 = C1595y1.L(i11 << 3);
                            a02 = C1595y1.b0((String) object2);
                            B4 = a02 + L5;
                            i9 += B4;
                            break;
                        }
                    } else {
                        break;
                    }
                case 60:
                    if (w(i11, i8, obj)) {
                        B4 = AbstractC1553n2.B(i11, unsafe.getObject(obj, j5), n(i8));
                        i9 += B4;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (w(i11, i8, obj)) {
                        C1591x1 c1591x12 = (C1591x1) unsafe.getObject(obj, j5);
                        int L9 = C1595y1.L(i11 << 3);
                        int j12 = c1591x12.j();
                        i9 = U.a.d(j12, j12, L9, i9);
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (w(i11, i8, obj)) {
                        i9 = U.a.r(E(j5, obj), C1595y1.L(i11 << 3), i9);
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (w(i11, i8, obj)) {
                        int E6 = E(j5, obj);
                        L5 = C1595y1.L(i11 << 3);
                        a02 = C1595y1.a0(E6);
                        B4 = a02 + L5;
                        i9 += B4;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (w(i11, i8, obj)) {
                        i9 = U.a.r(i11 << 3, 4, i9);
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (w(i11, i8, obj)) {
                        i9 = U.a.r(i11 << 3, 8, i9);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (w(i11, i8, obj)) {
                        int E7 = E(j5, obj);
                        i9 = U.a.r((E7 >> 31) ^ (E7 + E7), C1595y1.L(i11 << 3), i9);
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (w(i11, i8, obj)) {
                        long k5 = k(j5, obj);
                        L4 = C1595y1.L(i11 << 3);
                        M4 = C1595y1.M((k5 >> 63) ^ (k5 + k5));
                        B4 = M4 + L4;
                        i9 += B4;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (w(i11, i8, obj)) {
                        B4 = C1595y1.Z(i11, (AbstractC1571s1) unsafe.getObject(obj, j5), n(i8));
                        i9 += B4;
                        break;
                    } else {
                        break;
                    }
            }
            i8 += 3;
            i6 = 1048575;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x002f. Please report as an issue. */
    public final int D(Object obj) {
        int L4;
        int M4;
        int L5;
        int a02;
        int B4;
        int L6;
        int M5;
        int i4;
        Unsafe unsafe = f11917m;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int[] iArr = this.f11918a;
            if (i5 >= iArr.length) {
                this.f11926k.getClass();
                return ((I1) obj).zzc.a() + i6;
            }
            int j4 = j(i5);
            int i7 = i(j4);
            int i8 = iArr[i5];
            long j5 = j4 & 1048575;
            if (i7 >= D1.f11717p.f11721o && i7 <= D1.f11718q.f11721o) {
                int i9 = iArr[i5 + 2];
            }
            switch (i7) {
                case 0:
                    if (v(i5, obj)) {
                        i6 = U.a.r(i8 << 3, 8, i6);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (v(i5, obj)) {
                        i6 = U.a.r(i8 << 3, 4, i6);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (v(i5, obj)) {
                        long k3 = AbstractC1584v2.c.k(j5, obj);
                        L4 = C1595y1.L(i8 << 3);
                        M4 = C1595y1.M(k3);
                        B4 = M4 + L4;
                        i6 += B4;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (v(i5, obj)) {
                        long k4 = AbstractC1584v2.c.k(j5, obj);
                        L4 = C1595y1.L(i8 << 3);
                        M4 = C1595y1.M(k4);
                        B4 = M4 + L4;
                        i6 += B4;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (v(i5, obj)) {
                        int j6 = AbstractC1584v2.c.j(j5, obj);
                        L5 = C1595y1.L(i8 << 3);
                        a02 = C1595y1.a0(j6);
                        B4 = a02 + L5;
                        i6 += B4;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (v(i5, obj)) {
                        i6 = U.a.r(i8 << 3, 8, i6);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (v(i5, obj)) {
                        i6 = U.a.r(i8 << 3, 4, i6);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (v(i5, obj)) {
                        i6 = U.a.r(i8 << 3, 1, i6);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (v(i5, obj)) {
                        Object m4 = AbstractC1584v2.c.m(j5, obj);
                        if (m4 instanceof C1591x1) {
                            int L7 = C1595y1.L(i8 << 3);
                            int j7 = ((C1591x1) m4).j();
                            i6 = U.a.d(j7, j7, L7, i6);
                            break;
                        } else {
                            L5 = C1595y1.L(i8 << 3);
                            a02 = C1595y1.b0((String) m4);
                            B4 = a02 + L5;
                            i6 += B4;
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (v(i5, obj)) {
                        B4 = AbstractC1553n2.B(i8, AbstractC1584v2.c.m(j5, obj), n(i5));
                        i6 += B4;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (v(i5, obj)) {
                        C1591x1 c1591x1 = (C1591x1) AbstractC1584v2.c.m(j5, obj);
                        int L8 = C1595y1.L(i8 << 3);
                        int j8 = c1591x1.j();
                        i6 = U.a.d(j8, j8, L8, i6);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (v(i5, obj)) {
                        i6 = U.a.r(AbstractC1584v2.c.j(j5, obj), C1595y1.L(i8 << 3), i6);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (v(i5, obj)) {
                        int j9 = AbstractC1584v2.c.j(j5, obj);
                        L5 = C1595y1.L(i8 << 3);
                        a02 = C1595y1.a0(j9);
                        B4 = a02 + L5;
                        i6 += B4;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (v(i5, obj)) {
                        i6 = U.a.r(i8 << 3, 4, i6);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (v(i5, obj)) {
                        i6 = U.a.r(i8 << 3, 8, i6);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (v(i5, obj)) {
                        int j10 = AbstractC1584v2.c.j(j5, obj);
                        i6 = U.a.r((j10 >> 31) ^ (j10 + j10), C1595y1.L(i8 << 3), i6);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (v(i5, obj)) {
                        long k5 = AbstractC1584v2.c.k(j5, obj);
                        L6 = C1595y1.L(i8 << 3);
                        M5 = C1595y1.M((k5 + k5) ^ (k5 >> 63));
                        i6 += M5 + L6;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (v(i5, obj)) {
                        B4 = C1595y1.Z(i8, (AbstractC1571s1) AbstractC1584v2.c.m(j5, obj), n(i5));
                        i6 += B4;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    B4 = AbstractC1553n2.x(i8, (List) AbstractC1584v2.c.m(j5, obj));
                    i6 += B4;
                    break;
                case 19:
                    B4 = AbstractC1553n2.v(i8, (List) AbstractC1584v2.c.m(j5, obj));
                    i6 += B4;
                    break;
                case 20:
                    List list = (List) AbstractC1584v2.c.m(j5, obj);
                    Class cls = AbstractC1553n2.f11986a;
                    if (list.size() != 0) {
                        B4 = U.a.u(i8, list.size(), AbstractC1553n2.A(list));
                        i6 += B4;
                        break;
                    }
                    B4 = 0;
                    i6 += B4;
                case 21:
                    List list2 = (List) AbstractC1584v2.c.m(j5, obj);
                    Class cls2 = AbstractC1553n2.f11986a;
                    int size = list2.size();
                    if (size != 0) {
                        B4 = U.a.u(i8, size, AbstractC1553n2.H(list2));
                        i6 += B4;
                        break;
                    }
                    B4 = 0;
                    i6 += B4;
                case 22:
                    List list3 = (List) AbstractC1584v2.c.m(j5, obj);
                    Class cls3 = AbstractC1553n2.f11986a;
                    int size2 = list3.size();
                    if (size2 != 0) {
                        B4 = U.a.u(i8, size2, AbstractC1553n2.z(list3));
                        i6 += B4;
                        break;
                    }
                    B4 = 0;
                    i6 += B4;
                case 23:
                    B4 = AbstractC1553n2.x(i8, (List) AbstractC1584v2.c.m(j5, obj));
                    i6 += B4;
                    break;
                case 24:
                    B4 = AbstractC1553n2.v(i8, (List) AbstractC1584v2.c.m(j5, obj));
                    i6 += B4;
                    break;
                case 25:
                    List list4 = (List) AbstractC1584v2.c.m(j5, obj);
                    Class cls4 = AbstractC1553n2.f11986a;
                    int size3 = list4.size();
                    i6 += size3 == 0 ? 0 : (C1595y1.L(i8 << 3) + 1) * size3;
                    break;
                case 26:
                    B4 = AbstractC1553n2.F(i8, (List) AbstractC1584v2.c.m(j5, obj));
                    i6 += B4;
                    break;
                case 27:
                    B4 = AbstractC1553n2.C(i8, (List) AbstractC1584v2.c.m(j5, obj), n(i5));
                    i6 += B4;
                    break;
                case 28:
                    B4 = AbstractC1553n2.t(i8, (List) AbstractC1584v2.c.m(j5, obj));
                    i6 += B4;
                    break;
                case 29:
                    List list5 = (List) AbstractC1584v2.c.m(j5, obj);
                    Class cls5 = AbstractC1553n2.f11986a;
                    int size4 = list5.size();
                    if (size4 != 0) {
                        B4 = U.a.u(i8, size4, AbstractC1553n2.G(list5));
                        i6 += B4;
                        break;
                    }
                    B4 = 0;
                    i6 += B4;
                case 30:
                    List list6 = (List) AbstractC1584v2.c.m(j5, obj);
                    Class cls6 = AbstractC1553n2.f11986a;
                    int size5 = list6.size();
                    if (size5 != 0) {
                        B4 = U.a.u(i8, size5, AbstractC1553n2.u(list6));
                        i6 += B4;
                        break;
                    }
                    B4 = 0;
                    i6 += B4;
                case 31:
                    B4 = AbstractC1553n2.v(i8, (List) AbstractC1584v2.c.m(j5, obj));
                    i6 += B4;
                    break;
                case 32:
                    B4 = AbstractC1553n2.x(i8, (List) AbstractC1584v2.c.m(j5, obj));
                    i6 += B4;
                    break;
                case 33:
                    List list7 = (List) AbstractC1584v2.c.m(j5, obj);
                    Class cls7 = AbstractC1553n2.f11986a;
                    int size6 = list7.size();
                    if (size6 != 0) {
                        B4 = U.a.u(i8, size6, AbstractC1553n2.D(list7));
                        i6 += B4;
                        break;
                    }
                    B4 = 0;
                    i6 += B4;
                case 34:
                    List list8 = (List) AbstractC1584v2.c.m(j5, obj);
                    Class cls8 = AbstractC1553n2.f11986a;
                    int size7 = list8.size();
                    if (size7 != 0) {
                        B4 = U.a.u(i8, size7, AbstractC1553n2.E(list8));
                        i6 += B4;
                        break;
                    }
                    B4 = 0;
                    i6 += B4;
                case 35:
                    int y = AbstractC1553n2.y((List) unsafe.getObject(obj, j5));
                    if (y > 0) {
                        i6 = U.a.d(y, C1595y1.c0(i8), y, i6);
                        break;
                    } else {
                        break;
                    }
                case 36:
                    int w2 = AbstractC1553n2.w((List) unsafe.getObject(obj, j5));
                    if (w2 > 0) {
                        i6 = U.a.d(w2, C1595y1.c0(i8), w2, i6);
                        break;
                    } else {
                        break;
                    }
                case 37:
                    int A3 = AbstractC1553n2.A((List) unsafe.getObject(obj, j5));
                    if (A3 > 0) {
                        i6 = U.a.d(A3, C1595y1.c0(i8), A3, i6);
                        break;
                    } else {
                        break;
                    }
                case 38:
                    int H3 = AbstractC1553n2.H((List) unsafe.getObject(obj, j5));
                    if (H3 > 0) {
                        i6 = U.a.d(H3, C1595y1.c0(i8), H3, i6);
                        break;
                    } else {
                        break;
                    }
                case 39:
                    int z4 = AbstractC1553n2.z((List) unsafe.getObject(obj, j5));
                    if (z4 > 0) {
                        i6 = U.a.d(z4, C1595y1.c0(i8), z4, i6);
                        break;
                    } else {
                        break;
                    }
                case 40:
                    int y4 = AbstractC1553n2.y((List) unsafe.getObject(obj, j5));
                    if (y4 > 0) {
                        i6 = U.a.d(y4, C1595y1.c0(i8), y4, i6);
                        break;
                    } else {
                        break;
                    }
                case 41:
                    int w4 = AbstractC1553n2.w((List) unsafe.getObject(obj, j5));
                    if (w4 > 0) {
                        i6 = U.a.d(w4, C1595y1.c0(i8), w4, i6);
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list9 = (List) unsafe.getObject(obj, j5);
                    Class cls9 = AbstractC1553n2.f11986a;
                    int size8 = list9.size();
                    if (size8 > 0) {
                        i6 = U.a.d(size8, C1595y1.c0(i8), size8, i6);
                        break;
                    } else {
                        break;
                    }
                case 43:
                    int G3 = AbstractC1553n2.G((List) unsafe.getObject(obj, j5));
                    if (G3 > 0) {
                        i6 = U.a.d(G3, C1595y1.c0(i8), G3, i6);
                        break;
                    } else {
                        break;
                    }
                case 44:
                    int u2 = AbstractC1553n2.u((List) unsafe.getObject(obj, j5));
                    if (u2 > 0) {
                        i6 = U.a.d(u2, C1595y1.c0(i8), u2, i6);
                        break;
                    } else {
                        break;
                    }
                case 45:
                    int w5 = AbstractC1553n2.w((List) unsafe.getObject(obj, j5));
                    if (w5 > 0) {
                        i6 = U.a.d(w5, C1595y1.c0(i8), w5, i6);
                        break;
                    } else {
                        break;
                    }
                case 46:
                    int y5 = AbstractC1553n2.y((List) unsafe.getObject(obj, j5));
                    if (y5 > 0) {
                        i6 = U.a.d(y5, C1595y1.c0(i8), y5, i6);
                        break;
                    } else {
                        break;
                    }
                case 47:
                    int D4 = AbstractC1553n2.D((List) unsafe.getObject(obj, j5));
                    if (D4 > 0) {
                        i6 = U.a.d(D4, C1595y1.c0(i8), D4, i6);
                        break;
                    } else {
                        break;
                    }
                case 48:
                    int E4 = AbstractC1553n2.E((List) unsafe.getObject(obj, j5));
                    if (E4 > 0) {
                        i6 = U.a.d(E4, C1595y1.c0(i8), E4, i6);
                        break;
                    } else {
                        break;
                    }
                case 49:
                    List list10 = (List) AbstractC1584v2.c.m(j5, obj);
                    InterfaceC1549m2 n4 = n(i5);
                    Class cls10 = AbstractC1553n2.f11986a;
                    int size9 = list10.size();
                    if (size9 != 0) {
                        i4 = 0;
                        for (int i10 = 0; i10 < size9; i10++) {
                            i4 += C1595y1.Z(i8, (AbstractC1571s1) list10.get(i10), n4);
                        }
                    } else {
                        i4 = 0;
                    }
                    i6 += i4;
                    break;
                case 50:
                    C1496b2.a(AbstractC1584v2.c.m(j5, obj), o(i5));
                    break;
                case 51:
                    if (w(i8, i5, obj)) {
                        i6 = U.a.r(i8 << 3, 8, i6);
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (w(i8, i5, obj)) {
                        i6 = U.a.r(i8 << 3, 4, i6);
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (w(i8, i5, obj)) {
                        long k6 = k(j5, obj);
                        L4 = C1595y1.L(i8 << 3);
                        M4 = C1595y1.M(k6);
                        B4 = M4 + L4;
                        i6 += B4;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (w(i8, i5, obj)) {
                        long k7 = k(j5, obj);
                        L4 = C1595y1.L(i8 << 3);
                        M4 = C1595y1.M(k7);
                        B4 = M4 + L4;
                        i6 += B4;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (w(i8, i5, obj)) {
                        int E5 = E(j5, obj);
                        L5 = C1595y1.L(i8 << 3);
                        a02 = C1595y1.a0(E5);
                        B4 = a02 + L5;
                        i6 += B4;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (w(i8, i5, obj)) {
                        i6 = U.a.r(i8 << 3, 8, i6);
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (w(i8, i5, obj)) {
                        i6 = U.a.r(i8 << 3, 4, i6);
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (w(i8, i5, obj)) {
                        i6 = U.a.r(i8 << 3, 1, i6);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (w(i8, i5, obj)) {
                        Object m5 = AbstractC1584v2.c.m(j5, obj);
                        if (m5 instanceof C1591x1) {
                            int L9 = C1595y1.L(i8 << 3);
                            int j11 = ((C1591x1) m5).j();
                            i6 = U.a.d(j11, j11, L9, i6);
                            break;
                        } else {
                            L5 = C1595y1.L(i8 << 3);
                            a02 = C1595y1.b0((String) m5);
                            B4 = a02 + L5;
                            i6 += B4;
                            break;
                        }
                    } else {
                        break;
                    }
                case 60:
                    if (w(i8, i5, obj)) {
                        B4 = AbstractC1553n2.B(i8, AbstractC1584v2.c.m(j5, obj), n(i5));
                        i6 += B4;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (w(i8, i5, obj)) {
                        C1591x1 c1591x12 = (C1591x1) AbstractC1584v2.c.m(j5, obj);
                        int L10 = C1595y1.L(i8 << 3);
                        int j12 = c1591x12.j();
                        i6 = U.a.d(j12, j12, L10, i6);
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (w(i8, i5, obj)) {
                        i6 = U.a.r(E(j5, obj), C1595y1.L(i8 << 3), i6);
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (w(i8, i5, obj)) {
                        int E6 = E(j5, obj);
                        L5 = C1595y1.L(i8 << 3);
                        a02 = C1595y1.a0(E6);
                        B4 = a02 + L5;
                        i6 += B4;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (w(i8, i5, obj)) {
                        i6 = U.a.r(i8 << 3, 4, i6);
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (w(i8, i5, obj)) {
                        i6 = U.a.r(i8 << 3, 8, i6);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (w(i8, i5, obj)) {
                        int E7 = E(j5, obj);
                        i6 = U.a.r((E7 >> 31) ^ (E7 + E7), C1595y1.L(i8 << 3), i6);
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (w(i8, i5, obj)) {
                        long k8 = k(j5, obj);
                        L6 = C1595y1.L(i8 << 3);
                        M5 = C1595y1.M((k8 + k8) ^ (k8 >> 63));
                        i6 += M5 + L6;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (w(i8, i5, obj)) {
                        B4 = C1595y1.Z(i8, (AbstractC1571s1) AbstractC1584v2.c.m(j5, obj), n(i5));
                        i6 += B4;
                        break;
                    } else {
                        break;
                    }
            }
            i5 += 3;
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.LinkedHashMap, com.google.android.gms.internal.measurement.a2] */
    public final void F(long j4, Object obj, int i4) {
        C1491a2 c1491a2;
        Unsafe unsafe = f11917m;
        Object o4 = o(i4);
        Object object = unsafe.getObject(obj, j4);
        if (!((C1491a2) object).f11878o) {
            C1491a2 c1491a22 = C1491a2.f11877p;
            if (c1491a22.isEmpty()) {
                c1491a2 = new C1491a2();
            } else {
                ?? linkedHashMap = new LinkedHashMap(c1491a22);
                linkedHashMap.f11878o = true;
                c1491a2 = linkedHashMap;
            }
            C1496b2.b(c1491a2, object);
            unsafe.putObject(obj, j4, c1491a2);
        }
        o4.getClass();
        throw new ClassCastException();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x001d. Please report as an issue. */
    public final int G(Object obj, byte[] bArr, int i4, int i5, int i6, int i7, int i8, int i9, int i10, long j4, int i11, C0544dz c0544dz) {
        Object object;
        Unsafe unsafe = f11917m;
        long j5 = this.f11918a[i11 + 2] & 1048575;
        switch (i10) {
            case 51:
                if (i8 != 1) {
                    return i4;
                }
                unsafe.putObject(obj, j4, Double.valueOf(Double.longBitsToDouble(AbstractC1515f1.K(i4, bArr))));
                unsafe.putInt(obj, j5, i7);
                return i4 + 8;
            case 52:
                if (i8 != 5) {
                    return i4;
                }
                unsafe.putObject(obj, j4, Float.valueOf(Float.intBitsToFloat(AbstractC1515f1.i(i4, bArr))));
                unsafe.putInt(obj, j5, i7);
                return i4 + 4;
            case 53:
            case 54:
                if (i8 != 0) {
                    return i4;
                }
                int J4 = AbstractC1515f1.J(bArr, i4, c0544dz);
                unsafe.putObject(obj, j4, Long.valueOf(c0544dz.f8530b));
                unsafe.putInt(obj, j5, i7);
                return J4;
            case 55:
            case 62:
                if (i8 != 0) {
                    return i4;
                }
                int D4 = AbstractC1515f1.D(bArr, i4, c0544dz);
                unsafe.putObject(obj, j4, Integer.valueOf(c0544dz.f8529a));
                unsafe.putInt(obj, j5, i7);
                return D4;
            case 56:
            case 65:
                if (i8 != 1) {
                    return i4;
                }
                unsafe.putObject(obj, j4, Long.valueOf(AbstractC1515f1.K(i4, bArr)));
                unsafe.putInt(obj, j5, i7);
                return i4 + 8;
            case 57:
            case 64:
                if (i8 != 5) {
                    return i4;
                }
                unsafe.putObject(obj, j4, Integer.valueOf(AbstractC1515f1.i(i4, bArr)));
                unsafe.putInt(obj, j5, i7);
                return i4 + 4;
            case 58:
                if (i8 != 0) {
                    return i4;
                }
                int J5 = AbstractC1515f1.J(bArr, i4, c0544dz);
                unsafe.putObject(obj, j4, Boolean.valueOf(c0544dz.f8530b != 0));
                unsafe.putInt(obj, j5, i7);
                return J5;
            case 59:
                if (i8 != 2) {
                    return i4;
                }
                int D5 = AbstractC1515f1.D(bArr, i4, c0544dz);
                int i12 = c0544dz.f8529a;
                if (i12 == 0) {
                    unsafe.putObject(obj, j4, "");
                } else {
                    if ((i9 & 536870912) != 0) {
                        AbstractC1600z2.f12125a.getClass();
                        if (!C1592x2.a(bArr, D5, D5 + i12)) {
                            throw Q1.a();
                        }
                    }
                    unsafe.putObject(obj, j4, new String(bArr, D5, i12, O1.f11796a));
                    D5 += i12;
                }
                unsafe.putInt(obj, j5, i7);
                return D5;
            case 60:
                if (i8 != 2) {
                    return i4;
                }
                int r4 = AbstractC1515f1.r(n(i11), bArr, i4, i5, c0544dz);
                object = unsafe.getInt(obj, j5) == i7 ? unsafe.getObject(obj, j4) : null;
                if (object == null) {
                    unsafe.putObject(obj, j4, c0544dz.c);
                } else {
                    unsafe.putObject(obj, j4, O1.b(object, c0544dz.c));
                }
                unsafe.putInt(obj, j5, i7);
                return r4;
            case 61:
                if (i8 != 2) {
                    return i4;
                }
                int b4 = AbstractC1515f1.b(bArr, i4, c0544dz);
                unsafe.putObject(obj, j4, c0544dz.c);
                unsafe.putInt(obj, j5, i7);
                return b4;
            case 63:
                if (i8 != 0) {
                    return i4;
                }
                int D6 = AbstractC1515f1.D(bArr, i4, c0544dz);
                int i13 = c0544dz.f8529a;
                K1 m4 = m(i11);
                if (m4 != null && !m4.a(i13)) {
                    z(obj).c(i6, Long.valueOf(i13));
                    return D6;
                }
                unsafe.putObject(obj, j4, Integer.valueOf(i13));
                unsafe.putInt(obj, j5, i7);
                return D6;
            case 66:
                if (i8 != 0) {
                    return i4;
                }
                int D7 = AbstractC1515f1.D(bArr, i4, c0544dz);
                unsafe.putObject(obj, j4, Integer.valueOf(AbstractC1515f1.h(c0544dz.f8529a)));
                unsafe.putInt(obj, j5, i7);
                return D7;
            case 67:
                if (i8 != 0) {
                    return i4;
                }
                int J6 = AbstractC1515f1.J(bArr, i4, c0544dz);
                unsafe.putObject(obj, j4, Long.valueOf(AbstractC1515f1.n(c0544dz.f8530b)));
                unsafe.putInt(obj, j5, i7);
                return J6;
            case 68:
                if (i8 == 3) {
                    int m5 = AbstractC1515f1.m(n(i11), bArr, i4, i5, (i6 & (-8)) | 4, c0544dz);
                    object = unsafe.getInt(obj, j5) == i7 ? unsafe.getObject(obj, j4) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j4, c0544dz.c);
                    } else {
                        unsafe.putObject(obj, j4, O1.b(object, c0544dz.c));
                    }
                    unsafe.putInt(obj, j5, i7);
                    return m5;
                }
            default:
                return i4;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:74:0x0098. Please report as an issue. */
    public final void H(Object obj, byte[] bArr, int i4, int i5, C0544dz c0544dz) {
        int i6;
        int i7;
        Unsafe unsafe;
        int i8;
        int i9;
        Object obj2;
        int i10;
        int i11;
        Unsafe unsafe2;
        Object obj3;
        int i12;
        char c;
        int J4;
        Object obj4;
        int i13;
        int i14;
        int i15;
        int G3;
        C1511e2 c1511e2 = this;
        Object obj5 = obj;
        byte[] bArr2 = bArr;
        int i16 = i5;
        C0544dz c0544dz2 = c0544dz;
        Unsafe unsafe3 = f11917m;
        int i17 = i4;
        int i18 = -1;
        int i19 = 0;
        int i20 = 1048575;
        int i21 = 0;
        while (i17 < i16) {
            int i22 = i17 + 1;
            int i23 = bArr2[i17];
            if (i23 < 0) {
                i22 = AbstractC1515f1.F(i23, bArr2, i22, c0544dz2);
                i23 = c0544dz2.f8529a;
            }
            int i24 = i22;
            int i25 = i23 >>> 3;
            int i26 = i23 & 7;
            int i27 = c1511e2.d;
            int i28 = c1511e2.c;
            if (i25 > i18) {
                i7 = (i25 < i28 || i25 > i27) ? -1 : c1511e2.J(i25, i19 / 3);
                i6 = 0;
            } else if (i25 < i28 || i25 > i27) {
                i6 = 0;
                i7 = -1;
            } else {
                i6 = 0;
                i7 = c1511e2.J(i25, 0);
            }
            int i29 = i7;
            if (i29 == -1) {
                unsafe = unsafe3;
                i8 = i23;
                i9 = i6;
                obj2 = obj5;
                i10 = i24;
            } else {
                int[] iArr = c1511e2.f11918a;
                int i30 = iArr[i29 + 1];
                int i31 = i(i30);
                int i32 = i23;
                long j4 = i30 & 1048575;
                if (i31 <= 17) {
                    int i33 = iArr[i29 + 2];
                    int i34 = 1 << (i33 >>> 20);
                    int i35 = i33 & 1048575;
                    if (i35 != i20) {
                        int i36 = 1048575;
                        i11 = i30;
                        if (i20 != 1048575) {
                            unsafe3.putInt(obj5, i20, i21);
                            i36 = 1048575;
                        }
                        if (i35 != i36) {
                            i21 = unsafe3.getInt(obj5, i35);
                        }
                        i20 = i35;
                    } else {
                        i11 = i30;
                    }
                    switch (i31) {
                        case 0:
                            i12 = i25;
                            c = 65535;
                            if (i26 != 1) {
                                unsafe2 = unsafe3;
                                obj3 = obj5;
                                i8 = i32;
                                unsafe = unsafe2;
                                i9 = i29;
                                i10 = i24;
                                i25 = i12;
                                obj2 = obj3;
                                break;
                            } else {
                                AbstractC1584v2.c.e(obj5, j4, Double.longBitsToDouble(AbstractC1515f1.K(i24, bArr2)));
                                i17 = i24 + 8;
                                i21 |= i34;
                                unsafe3 = unsafe3;
                                i19 = i29;
                                i18 = i12;
                                break;
                            }
                        case 1:
                            i12 = i25;
                            c = 65535;
                            if (i26 != 5) {
                                unsafe2 = unsafe3;
                                obj3 = obj5;
                                i8 = i32;
                                unsafe = unsafe2;
                                i9 = i29;
                                i10 = i24;
                                i25 = i12;
                                obj2 = obj3;
                                break;
                            } else {
                                AbstractC1584v2.c.f(obj5, j4, Float.intBitsToFloat(AbstractC1515f1.i(i24, bArr2)));
                                i17 = i24 + 4;
                                i21 |= i34;
                                i19 = i29;
                                i18 = i12;
                                break;
                            }
                        case 2:
                        case 3:
                            i12 = i25;
                            c = 65535;
                            if (i26 != 0) {
                                unsafe2 = unsafe3;
                                obj3 = obj5;
                                i8 = i32;
                                unsafe = unsafe2;
                                i9 = i29;
                                i10 = i24;
                                i25 = i12;
                                obj2 = obj3;
                                break;
                            } else {
                                J4 = AbstractC1515f1.J(bArr2, i24, c0544dz2);
                                unsafe3.putLong(obj5, j4, c0544dz2.f8530b);
                                i21 |= i34;
                                i17 = J4;
                                i19 = i29;
                                i18 = i12;
                                break;
                            }
                        case 4:
                        case 11:
                            i12 = i25;
                            c = 65535;
                            if (i26 != 0) {
                                unsafe2 = unsafe3;
                                obj3 = obj5;
                                i8 = i32;
                                unsafe = unsafe2;
                                i9 = i29;
                                i10 = i24;
                                i25 = i12;
                                obj2 = obj3;
                                break;
                            } else {
                                int D4 = AbstractC1515f1.D(bArr2, i24, c0544dz2);
                                unsafe3.putInt(obj5, j4, c0544dz2.f8529a);
                                i21 |= i34;
                                i17 = D4;
                                i19 = i29;
                                i18 = i12;
                                break;
                            }
                        case 5:
                        case 14:
                            i12 = i25;
                            c = 65535;
                            if (i26 != 1) {
                                unsafe2 = unsafe3;
                                obj3 = obj5;
                                i8 = i32;
                                unsafe = unsafe2;
                                i9 = i29;
                                i10 = i24;
                                i25 = i12;
                                obj2 = obj3;
                                break;
                            } else {
                                unsafe3.putLong(obj5, j4, AbstractC1515f1.K(i24, bArr2));
                                i17 = i24 + 8;
                                i21 |= i34;
                                i19 = i29;
                                i18 = i12;
                                break;
                            }
                        case 6:
                        case 13:
                            i12 = i25;
                            c = 65535;
                            if (i26 != 5) {
                                unsafe2 = unsafe3;
                                obj3 = obj5;
                                i8 = i32;
                                unsafe = unsafe2;
                                i9 = i29;
                                i10 = i24;
                                i25 = i12;
                                obj2 = obj3;
                                break;
                            } else {
                                unsafe3.putInt(obj5, j4, AbstractC1515f1.i(i24, bArr2));
                                i17 = i24 + 4;
                                i21 |= i34;
                                i19 = i29;
                                i18 = i12;
                                break;
                            }
                        case 7:
                            i12 = i25;
                            c = 65535;
                            if (i26 != 0) {
                                unsafe2 = unsafe3;
                                obj3 = obj5;
                                i8 = i32;
                                unsafe = unsafe2;
                                i9 = i29;
                                i10 = i24;
                                i25 = i12;
                                obj2 = obj3;
                                break;
                            } else {
                                i17 = AbstractC1515f1.J(bArr2, i24, c0544dz2);
                                AbstractC1584v2.c.c(obj5, j4, c0544dz2.f8530b != 0);
                                i21 |= i34;
                                i19 = i29;
                                i18 = i12;
                                break;
                            }
                        case 8:
                            i12 = i25;
                            c = 65535;
                            if (i26 != 2) {
                                unsafe2 = unsafe3;
                                obj3 = obj5;
                                i8 = i32;
                                unsafe = unsafe2;
                                i9 = i29;
                                i10 = i24;
                                i25 = i12;
                                obj2 = obj3;
                                break;
                            } else {
                                i17 = (i11 & 536870912) == 0 ? AbstractC1515f1.x(bArr2, i24, c0544dz2) : AbstractC1515f1.z(bArr2, i24, c0544dz2);
                                unsafe3.putObject(obj5, j4, c0544dz2.c);
                                i21 |= i34;
                                i19 = i29;
                                i18 = i12;
                                break;
                            }
                        case 9:
                            i12 = i25;
                            c = 65535;
                            if (i26 != 2) {
                                unsafe2 = unsafe3;
                                obj3 = obj5;
                                i8 = i32;
                                unsafe = unsafe2;
                                i9 = i29;
                                i10 = i24;
                                i25 = i12;
                                obj2 = obj3;
                                break;
                            } else {
                                i17 = AbstractC1515f1.r(c1511e2.n(i29), bArr2, i24, i16, c0544dz2);
                                Object object = unsafe3.getObject(obj5, j4);
                                if (object == null) {
                                    unsafe3.putObject(obj5, j4, c0544dz2.c);
                                } else {
                                    unsafe3.putObject(obj5, j4, O1.b(object, c0544dz2.c));
                                }
                                i21 |= i34;
                                i19 = i29;
                                i18 = i12;
                                break;
                            }
                        case 10:
                            i12 = i25;
                            c = 65535;
                            if (i26 != 2) {
                                unsafe2 = unsafe3;
                                obj3 = obj5;
                                i8 = i32;
                                unsafe = unsafe2;
                                i9 = i29;
                                i10 = i24;
                                i25 = i12;
                                obj2 = obj3;
                                break;
                            } else {
                                i17 = AbstractC1515f1.b(bArr2, i24, c0544dz2);
                                unsafe3.putObject(obj5, j4, c0544dz2.c);
                                i21 |= i34;
                                i19 = i29;
                                i18 = i12;
                                break;
                            }
                        case 12:
                            i12 = i25;
                            c = 65535;
                            if (i26 != 0) {
                                unsafe2 = unsafe3;
                                obj3 = obj5;
                                i8 = i32;
                                unsafe = unsafe2;
                                i9 = i29;
                                i10 = i24;
                                i25 = i12;
                                obj2 = obj3;
                                break;
                            } else {
                                i17 = AbstractC1515f1.D(bArr2, i24, c0544dz2);
                                unsafe3.putInt(obj5, j4, c0544dz2.f8529a);
                                i21 |= i34;
                                i19 = i29;
                                i18 = i12;
                                break;
                            }
                        case 15:
                            i12 = i25;
                            c = 65535;
                            if (i26 != 0) {
                                unsafe2 = unsafe3;
                                obj3 = obj5;
                                i8 = i32;
                                unsafe = unsafe2;
                                i9 = i29;
                                i10 = i24;
                                i25 = i12;
                                obj2 = obj3;
                                break;
                            } else {
                                i17 = AbstractC1515f1.D(bArr2, i24, c0544dz2);
                                unsafe3.putInt(obj5, j4, AbstractC1515f1.h(c0544dz2.f8529a));
                                i21 |= i34;
                                i19 = i29;
                                i18 = i12;
                                break;
                            }
                        case 16:
                            if (i26 != 0) {
                                i12 = i25;
                                c = 65535;
                                unsafe2 = unsafe3;
                                obj3 = obj5;
                                i8 = i32;
                                unsafe = unsafe2;
                                i9 = i29;
                                i10 = i24;
                                i25 = i12;
                                obj2 = obj3;
                                break;
                            } else {
                                J4 = AbstractC1515f1.J(bArr2, i24, c0544dz2);
                                i12 = i25;
                                unsafe3.putLong(obj5, j4, AbstractC1515f1.n(c0544dz2.f8530b));
                                i21 |= i34;
                                i17 = J4;
                                i19 = i29;
                                i18 = i12;
                                break;
                            }
                        default:
                            unsafe2 = unsafe3;
                            obj3 = obj5;
                            i12 = i25;
                            c = 65535;
                            i8 = i32;
                            unsafe = unsafe2;
                            i9 = i29;
                            i10 = i24;
                            i25 = i12;
                            obj2 = obj3;
                            break;
                    }
                } else {
                    Object obj6 = obj5;
                    Unsafe unsafe4 = unsafe3;
                    if (i31 != 27) {
                        i8 = i32;
                        if (i31 <= 49) {
                            i9 = i29;
                            i15 = i20;
                            unsafe = unsafe4;
                            i13 = i21;
                            i25 = i25;
                            G3 = c1511e2.I(obj, bArr, i24, i5, i8, i25, i26, i9, i30, i31, j4, c0544dz);
                            obj5 = obj;
                            if (G3 != i24) {
                                c0544dz2 = c0544dz;
                                i18 = i25;
                                i17 = G3;
                                i19 = i9;
                                i20 = i15;
                                i21 = i13;
                                unsafe3 = unsafe;
                                bArr2 = bArr;
                                i16 = i5;
                            } else {
                                obj2 = obj5;
                                i10 = G3;
                                i20 = i15;
                                i21 = i13;
                            }
                        } else {
                            obj4 = obj;
                            unsafe = unsafe4;
                            i9 = i29;
                            i13 = i21;
                            i14 = i24;
                            i15 = i20;
                            i25 = i25;
                            if (i31 == 50) {
                                if (i26 == 2) {
                                    c1511e2.F(j4, obj4, i9);
                                    throw null;
                                }
                                obj2 = obj4;
                                i10 = i14;
                                i20 = i15;
                                i21 = i13;
                            } else {
                                G3 = c1511e2.G(obj4, bArr, i14, i5, i8, i25, i26, i30, i31, j4, i9, c0544dz);
                                obj2 = obj4;
                                i9 = i9;
                                if (G3 != i14) {
                                    c1511e2 = this;
                                    c0544dz2 = c0544dz;
                                    i18 = i25;
                                    i17 = G3;
                                    i19 = i9;
                                    obj5 = obj2;
                                    i20 = i15;
                                    i21 = i13;
                                    unsafe3 = unsafe;
                                    bArr2 = bArr;
                                    i16 = i5;
                                } else {
                                    i10 = G3;
                                    i20 = i15;
                                    i21 = i13;
                                }
                            }
                        }
                    } else if (i26 == 2) {
                        N1 n12 = (N1) unsafe4.getObject(obj6, j4);
                        if (!((AbstractC1575t1) n12).f12028o) {
                            int size = n12.size();
                            n12 = n12.c(size == 0 ? 10 : size + size);
                            unsafe4.putObject(obj6, j4, n12);
                        }
                        int t4 = AbstractC1515f1.t(c1511e2.n(i29), i32, bArr2, i24, i16, n12, c0544dz2);
                        obj5 = obj;
                        bArr2 = bArr;
                        c0544dz2 = c0544dz;
                        i17 = t4;
                        unsafe3 = unsafe4;
                        i19 = i29;
                        i18 = i25;
                        i16 = i5;
                    } else {
                        i8 = i32;
                        unsafe = unsafe4;
                        i9 = i29;
                        i15 = i20;
                        i13 = i21;
                        i14 = i24;
                        i25 = i25;
                        obj4 = obj;
                        obj2 = obj4;
                        i10 = i14;
                        i20 = i15;
                        i21 = i13;
                    }
                }
            }
            int B4 = AbstractC1515f1.B(i8, bArr, i10, i5, z(obj2), c0544dz);
            bArr2 = bArr;
            c0544dz2 = c0544dz;
            i18 = i25;
            i19 = i9;
            obj5 = obj2;
            unsafe3 = unsafe;
            i16 = i5;
            i17 = B4;
            c1511e2 = this;
        }
        Unsafe unsafe5 = unsafe3;
        Object obj7 = obj5;
        int i37 = i16;
        int i38 = i20;
        int i39 = i21;
        if (i38 != 1048575) {
            unsafe5.putInt(obj7, i38, i39);
        }
        if (i17 != i37) {
            throw new IOException("Failed to parse the message.");
        }
    }

    public final int I(Object obj, byte[] bArr, int i4, int i5, int i6, int i7, int i8, int i9, long j4, int i10, long j5, C0544dz c0544dz) {
        int H3;
        Unsafe unsafe = f11917m;
        N1 n12 = (N1) unsafe.getObject(obj, j5);
        if (!((AbstractC1575t1) n12).f12028o) {
            int size = n12.size();
            n12 = n12.c(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j5, n12);
        }
        N1 n13 = n12;
        switch (i10) {
            case 18:
            case 35:
                if (i8 != 2) {
                    if (i8 == 1) {
                        if (n13 != null) {
                            throw new ClassCastException();
                        }
                        Double.longBitsToDouble(AbstractC1515f1.K(i4, bArr));
                        throw null;
                    }
                    return i4;
                }
                if (n13 != null) {
                    throw new ClassCastException();
                }
                int D4 = AbstractC1515f1.D(bArr, i4, c0544dz);
                int i11 = c0544dz.f8529a + D4;
                if (D4 < i11) {
                    Double.longBitsToDouble(AbstractC1515f1.K(D4, bArr));
                    throw null;
                }
                if (D4 == i11) {
                    return D4;
                }
                throw Q1.c();
            case 19:
            case 36:
                if (i8 != 2) {
                    if (i8 == 5) {
                        if (n13 != null) {
                            throw new ClassCastException();
                        }
                        Float.intBitsToFloat(AbstractC1515f1.i(i4, bArr));
                        throw null;
                    }
                    return i4;
                }
                if (n13 != null) {
                    throw new ClassCastException();
                }
                int D5 = AbstractC1515f1.D(bArr, i4, c0544dz);
                int i12 = c0544dz.f8529a + D5;
                if (D5 < i12) {
                    Float.intBitsToFloat(AbstractC1515f1.i(D5, bArr));
                    throw null;
                }
                if (D5 == i12) {
                    return D5;
                }
                throw Q1.c();
            case 20:
            case 21:
            case 37:
            case 38:
                if (i8 == 2) {
                    Y1 y12 = (Y1) n13;
                    int D6 = AbstractC1515f1.D(bArr, i4, c0544dz);
                    int i13 = c0544dz.f8529a + D6;
                    while (D6 < i13) {
                        D6 = AbstractC1515f1.J(bArr, D6, c0544dz);
                        y12.h(c0544dz.f8530b);
                    }
                    if (D6 == i13) {
                        return D6;
                    }
                    throw Q1.c();
                }
                if (i8 == 0) {
                    Y1 y13 = (Y1) n13;
                    int J4 = AbstractC1515f1.J(bArr, i4, c0544dz);
                    y13.h(c0544dz.f8530b);
                    while (J4 < i5) {
                        int D7 = AbstractC1515f1.D(bArr, J4, c0544dz);
                        if (i6 != c0544dz.f8529a) {
                            return J4;
                        }
                        J4 = AbstractC1515f1.J(bArr, D7, c0544dz);
                        y13.h(c0544dz.f8530b);
                    }
                    return J4;
                }
                return i4;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i8 != 2) {
                    if (i8 == 0) {
                        return AbstractC1515f1.H(i6, bArr, i4, i5, n13, c0544dz);
                    }
                    return i4;
                }
                J1 j12 = (J1) n13;
                int D8 = AbstractC1515f1.D(bArr, i4, c0544dz);
                int i14 = c0544dz.f8529a + D8;
                while (D8 < i14) {
                    D8 = AbstractC1515f1.D(bArr, D8, c0544dz);
                    j12.h(c0544dz.f8529a);
                }
                if (D8 == i14) {
                    return D8;
                }
                throw Q1.c();
            case 23:
            case 32:
            case 40:
            case 46:
                if (i8 == 2) {
                    Y1 y14 = (Y1) n13;
                    int D9 = AbstractC1515f1.D(bArr, i4, c0544dz);
                    int i15 = c0544dz.f8529a + D9;
                    while (D9 < i15) {
                        y14.h(AbstractC1515f1.K(D9, bArr));
                        D9 += 8;
                    }
                    if (D9 == i15) {
                        return D9;
                    }
                    throw Q1.c();
                }
                if (i8 == 1) {
                    Y1 y15 = (Y1) n13;
                    y15.h(AbstractC1515f1.K(i4, bArr));
                    int i16 = i4 + 8;
                    while (i16 < i5) {
                        int D10 = AbstractC1515f1.D(bArr, i16, c0544dz);
                        if (i6 != c0544dz.f8529a) {
                            return i16;
                        }
                        y15.h(AbstractC1515f1.K(D10, bArr));
                        i16 = D10 + 8;
                    }
                    return i16;
                }
                return i4;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i8 == 2) {
                    J1 j13 = (J1) n13;
                    int D11 = AbstractC1515f1.D(bArr, i4, c0544dz);
                    int i17 = c0544dz.f8529a + D11;
                    while (D11 < i17) {
                        j13.h(AbstractC1515f1.i(D11, bArr));
                        D11 += 4;
                    }
                    if (D11 == i17) {
                        return D11;
                    }
                    throw Q1.c();
                }
                if (i8 == 5) {
                    J1 j14 = (J1) n13;
                    j14.h(AbstractC1515f1.i(i4, bArr));
                    int i18 = i4 + 4;
                    while (i18 < i5) {
                        int D12 = AbstractC1515f1.D(bArr, i18, c0544dz);
                        if (i6 != c0544dz.f8529a) {
                            return i18;
                        }
                        j14.h(AbstractC1515f1.i(D12, bArr));
                        i18 = D12 + 4;
                    }
                    return i18;
                }
                return i4;
            case 25:
            case 42:
                if (i8 != 2) {
                    if (i8 == 0) {
                        if (n13 != null) {
                            throw new ClassCastException();
                        }
                        AbstractC1515f1.J(bArr, i4, c0544dz);
                        throw null;
                    }
                    return i4;
                }
                if (n13 != null) {
                    throw new ClassCastException();
                }
                int D13 = AbstractC1515f1.D(bArr, i4, c0544dz);
                int i19 = c0544dz.f8529a + D13;
                if (D13 < i19) {
                    AbstractC1515f1.J(bArr, D13, c0544dz);
                    throw null;
                }
                if (D13 == i19) {
                    return D13;
                }
                throw Q1.c();
            case 26:
                if (i8 == 2) {
                    if ((j4 & 536870912) == 0) {
                        int D14 = AbstractC1515f1.D(bArr, i4, c0544dz);
                        int i20 = c0544dz.f8529a;
                        if (i20 < 0) {
                            throw Q1.b();
                        }
                        if (i20 == 0) {
                            n13.add("");
                        } else {
                            n13.add(new String(bArr, D14, i20, O1.f11796a));
                            D14 += i20;
                        }
                        while (D14 < i5) {
                            int D15 = AbstractC1515f1.D(bArr, D14, c0544dz);
                            if (i6 != c0544dz.f8529a) {
                                return D14;
                            }
                            D14 = AbstractC1515f1.D(bArr, D15, c0544dz);
                            int i21 = c0544dz.f8529a;
                            if (i21 < 0) {
                                throw Q1.b();
                            }
                            if (i21 == 0) {
                                n13.add("");
                            } else {
                                n13.add(new String(bArr, D14, i21, O1.f11796a));
                                D14 += i21;
                            }
                        }
                        return D14;
                    }
                    int D16 = AbstractC1515f1.D(bArr, i4, c0544dz);
                    int i22 = c0544dz.f8529a;
                    if (i22 < 0) {
                        throw Q1.b();
                    }
                    if (i22 == 0) {
                        n13.add("");
                    } else {
                        int i23 = D16 + i22;
                        AbstractC1600z2.f12125a.getClass();
                        if (!C1592x2.a(bArr, D16, i23)) {
                            throw Q1.a();
                        }
                        n13.add(new String(bArr, D16, i22, O1.f11796a));
                        D16 = i23;
                    }
                    while (D16 < i5) {
                        int D17 = AbstractC1515f1.D(bArr, D16, c0544dz);
                        if (i6 != c0544dz.f8529a) {
                            return D16;
                        }
                        D16 = AbstractC1515f1.D(bArr, D17, c0544dz);
                        int i24 = c0544dz.f8529a;
                        if (i24 < 0) {
                            throw Q1.b();
                        }
                        if (i24 == 0) {
                            n13.add("");
                        } else {
                            int i25 = D16 + i24;
                            AbstractC1600z2.f12125a.getClass();
                            if (!C1592x2.a(bArr, D16, i25)) {
                                throw Q1.a();
                            }
                            n13.add(new String(bArr, D16, i24, O1.f11796a));
                            D16 = i25;
                        }
                    }
                    return D16;
                }
                return i4;
            case 27:
                if (i8 == 2) {
                    return AbstractC1515f1.t(n(i9), i6, bArr, i4, i5, n13, c0544dz);
                }
                return i4;
            case 28:
                if (i8 == 2) {
                    int D18 = AbstractC1515f1.D(bArr, i4, c0544dz);
                    int i26 = c0544dz.f8529a;
                    if (i26 < 0) {
                        throw Q1.b();
                    }
                    if (i26 > bArr.length - D18) {
                        throw Q1.c();
                    }
                    if (i26 == 0) {
                        n13.add(C1591x1.f12113q);
                    } else {
                        n13.add(C1591x1.l(bArr, D18, i26));
                        D18 += i26;
                    }
                    while (D18 < i5) {
                        int D19 = AbstractC1515f1.D(bArr, D18, c0544dz);
                        if (i6 != c0544dz.f8529a) {
                            return D18;
                        }
                        D18 = AbstractC1515f1.D(bArr, D19, c0544dz);
                        int i27 = c0544dz.f8529a;
                        if (i27 < 0) {
                            throw Q1.b();
                        }
                        if (i27 > bArr.length - D18) {
                            throw Q1.c();
                        }
                        if (i27 == 0) {
                            n13.add(C1591x1.f12113q);
                        } else {
                            n13.add(C1591x1.l(bArr, D18, i27));
                            D18 += i27;
                        }
                    }
                    return D18;
                }
                return i4;
            case 30:
            case 44:
                if (i8 != 2) {
                    if (i8 == 0) {
                        H3 = AbstractC1515f1.H(i6, bArr, i4, i5, n13, c0544dz);
                    }
                    return i4;
                }
                J1 j15 = (J1) n13;
                H3 = AbstractC1515f1.D(bArr, i4, c0544dz);
                int i28 = c0544dz.f8529a + H3;
                while (H3 < i28) {
                    H3 = AbstractC1515f1.D(bArr, H3, c0544dz);
                    j15.h(c0544dz.f8529a);
                }
                if (H3 != i28) {
                    throw Q1.c();
                }
                I1 i110 = (I1) obj;
                C1557o2 c1557o2 = i110.zzc;
                C1557o2 c1557o22 = c1557o2 != C1557o2.f11992f ? c1557o2 : null;
                K1 m4 = m(i9);
                Class cls = AbstractC1553n2.f11986a;
                if (m4 != null) {
                    C1561p2 c1561p2 = this.f11926k;
                    if (n13 != null) {
                        int size2 = n13.size();
                        int i29 = 0;
                        for (int i30 = 0; i30 < size2; i30++) {
                            Integer num = (Integer) n13.get(i30);
                            int intValue = num.intValue();
                            if (m4.a(intValue)) {
                                if (i30 != i29) {
                                    n13.set(i29, num);
                                }
                                i29++;
                            } else {
                                if (c1557o22 == null) {
                                    c1561p2.getClass();
                                    c1557o22 = C1557o2.b();
                                }
                                c1561p2.getClass();
                                c1557o22.c(i7 << 3, Long.valueOf(intValue));
                            }
                        }
                        if (i29 != size2) {
                            n13.subList(i29, size2).clear();
                        }
                    } else {
                        Iterator it = n13.iterator();
                        while (it.hasNext()) {
                            int intValue2 = ((Integer) it.next()).intValue();
                            if (!m4.a(intValue2)) {
                                if (c1557o22 == null) {
                                    c1561p2.getClass();
                                    c1557o22 = C1557o2.b();
                                }
                                c1561p2.getClass();
                                c1557o22.c(i7 << 3, Long.valueOf(intValue2));
                                it.remove();
                            }
                        }
                    }
                }
                if (c1557o22 == null) {
                    return H3;
                }
                i110.zzc = c1557o22;
                return H3;
            case 33:
            case 47:
                if (i8 == 2) {
                    J1 j16 = (J1) n13;
                    int D20 = AbstractC1515f1.D(bArr, i4, c0544dz);
                    int i31 = c0544dz.f8529a + D20;
                    while (D20 < i31) {
                        D20 = AbstractC1515f1.D(bArr, D20, c0544dz);
                        j16.h(AbstractC1515f1.h(c0544dz.f8529a));
                    }
                    if (D20 == i31) {
                        return D20;
                    }
                    throw Q1.c();
                }
                if (i8 == 0) {
                    J1 j17 = (J1) n13;
                    int D21 = AbstractC1515f1.D(bArr, i4, c0544dz);
                    j17.h(AbstractC1515f1.h(c0544dz.f8529a));
                    while (D21 < i5) {
                        int D22 = AbstractC1515f1.D(bArr, D21, c0544dz);
                        if (i6 != c0544dz.f8529a) {
                            return D21;
                        }
                        D21 = AbstractC1515f1.D(bArr, D22, c0544dz);
                        j17.h(AbstractC1515f1.h(c0544dz.f8529a));
                    }
                    return D21;
                }
                return i4;
            case 34:
            case 48:
                if (i8 == 2) {
                    Y1 y16 = (Y1) n13;
                    int D23 = AbstractC1515f1.D(bArr, i4, c0544dz);
                    int i32 = c0544dz.f8529a + D23;
                    while (D23 < i32) {
                        D23 = AbstractC1515f1.J(bArr, D23, c0544dz);
                        y16.h(AbstractC1515f1.n(c0544dz.f8530b));
                    }
                    if (D23 == i32) {
                        return D23;
                    }
                    throw Q1.c();
                }
                if (i8 == 0) {
                    Y1 y17 = (Y1) n13;
                    int J5 = AbstractC1515f1.J(bArr, i4, c0544dz);
                    y17.h(AbstractC1515f1.n(c0544dz.f8530b));
                    while (J5 < i5) {
                        int D24 = AbstractC1515f1.D(bArr, J5, c0544dz);
                        if (i6 != c0544dz.f8529a) {
                            return J5;
                        }
                        J5 = AbstractC1515f1.J(bArr, D24, c0544dz);
                        y17.h(AbstractC1515f1.n(c0544dz.f8530b));
                    }
                    return J5;
                }
                return i4;
            default:
                if (i8 == 3) {
                    InterfaceC1549m2 n4 = n(i9);
                    int i33 = (i6 & (-8)) | 4;
                    int m5 = AbstractC1515f1.m(n4, bArr, i4, i5, i33, c0544dz);
                    InterfaceC1549m2 interfaceC1549m2 = n4;
                    C0544dz c0544dz2 = c0544dz;
                    n13.add(c0544dz2.c);
                    while (m5 < i5) {
                        int D25 = AbstractC1515f1.D(bArr, m5, c0544dz2);
                        if (i6 != c0544dz2.f8529a) {
                            return m5;
                        }
                        InterfaceC1549m2 interfaceC1549m22 = interfaceC1549m2;
                        C0544dz c0544dz3 = c0544dz2;
                        m5 = AbstractC1515f1.m(interfaceC1549m22, bArr, D25, i5, i33, c0544dz3);
                        n13.add(c0544dz3.c);
                        interfaceC1549m2 = interfaceC1549m22;
                        c0544dz2 = c0544dz3;
                    }
                    return m5;
                }
                return i4;
        }
    }

    public final int J(int i4, int i5) {
        int[] iArr = this.f11918a;
        int length = (iArr.length / 3) - 1;
        while (i5 <= length) {
            int i6 = (length + i5) >>> 1;
            int i7 = i6 * 3;
            int i8 = iArr[i7];
            if (i4 == i8) {
                return i7;
            }
            if (i4 < i8) {
                length = i6 - 1;
            } else {
                i5 = i6 + 1;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1549m2
    public final Object a() {
        return ((I1) this.f11920e).k(4);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1549m2
    public final void b(Object obj) {
        int[] iArr;
        int i4;
        int i5 = this.f11923h;
        while (true) {
            iArr = this.f11922g;
            i4 = this.f11924i;
            if (i5 >= i4) {
                break;
            }
            long j4 = j(iArr[i5]) & 1048575;
            Object m4 = AbstractC1584v2.c.m(j4, obj);
            if (m4 != null) {
                ((C1491a2) m4).f11878o = false;
                AbstractC1584v2.h(j4, obj, m4);
            }
            i5++;
        }
        int length = iArr.length;
        while (i4 < length) {
            this.f11925j.a(iArr[i4], obj);
            i4++;
        }
        this.f11926k.getClass();
        ((I1) obj).zzc.f11995e = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00ea, code lost:
    
        return false;
     */
    @Override // com.google.android.gms.internal.measurement.InterfaceC1549m2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1511e2.c(java.lang.Object):boolean");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1549m2
    public final void d(Object obj, byte[] bArr, int i4, int i5, C0544dz c0544dz) {
        if (this.f11921f) {
            H(obj, bArr, i4, i5, c0544dz);
        } else {
            y(obj, bArr, i4, i5, 0, c0544dz);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1549m2
    public final void e(Object obj, C1599z1 c1599z1) {
        if (!this.f11921f) {
            t(obj, c1599z1);
            return;
        }
        int[] iArr = this.f11918a;
        int length = iArr.length;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int j4 = j(i4);
            int i5 = iArr[i4];
            switch (i(j4)) {
                case 0:
                    if (v(i4, obj)) {
                        ((C1595y1) c1599z1.f12124p).S(i5, Double.doubleToRawLongBits(AbstractC1584v2.c.a(j4 & 1048575, obj)));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (v(i4, obj)) {
                        ((C1595y1) c1599z1.f12124p).Q(i5, Float.floatToRawIntBits(AbstractC1584v2.c.b(j4 & 1048575, obj)));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (v(i4, obj)) {
                        ((C1595y1) c1599z1.f12124p).X(i5, AbstractC1584v2.c.k(j4 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (v(i4, obj)) {
                        ((C1595y1) c1599z1.f12124p).X(i5, AbstractC1584v2.c.k(j4 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (v(i4, obj)) {
                        int j5 = AbstractC1584v2.c.j(j4 & 1048575, obj);
                        C1595y1 c1595y1 = (C1595y1) c1599z1.f12124p;
                        c1595y1.W(i5 << 3);
                        if (j5 >= 0) {
                            c1595y1.W(j5);
                            break;
                        } else {
                            c1595y1.Y(j5);
                            break;
                        }
                    } else {
                        break;
                    }
                case 5:
                    if (v(i4, obj)) {
                        ((C1595y1) c1599z1.f12124p).S(i5, AbstractC1584v2.c.k(j4 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (v(i4, obj)) {
                        ((C1595y1) c1599z1.f12124p).Q(i5, AbstractC1584v2.c.j(j4 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (v(i4, obj)) {
                        boolean g4 = AbstractC1584v2.c.g(j4 & 1048575, obj);
                        C1595y1 c1595y12 = (C1595y1) c1599z1.f12124p;
                        c1595y12.W(i5 << 3);
                        c1595y12.N(g4 ? (byte) 1 : (byte) 0);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (v(i4, obj)) {
                        x(i5, AbstractC1584v2.c.m(j4 & 1048575, obj), c1599z1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (v(i4, obj)) {
                        c1599z1.f(i5, AbstractC1584v2.c.m(j4 & 1048575, obj), n(i4));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (v(i4, obj)) {
                        c1599z1.d(i5, (C1591x1) AbstractC1584v2.c.m(j4 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (v(i4, obj)) {
                        int j6 = AbstractC1584v2.c.j(j4 & 1048575, obj);
                        C1595y1 c1595y13 = (C1595y1) c1599z1.f12124p;
                        c1595y13.W(i5 << 3);
                        c1595y13.W(j6);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (v(i4, obj)) {
                        int j7 = AbstractC1584v2.c.j(j4 & 1048575, obj);
                        C1595y1 c1595y14 = (C1595y1) c1599z1.f12124p;
                        c1595y14.W(i5 << 3);
                        if (j7 >= 0) {
                            c1595y14.W(j7);
                            break;
                        } else {
                            c1595y14.Y(j7);
                            break;
                        }
                    } else {
                        break;
                    }
                case 13:
                    if (v(i4, obj)) {
                        ((C1595y1) c1599z1.f12124p).Q(i5, AbstractC1584v2.c.j(j4 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (v(i4, obj)) {
                        ((C1595y1) c1599z1.f12124p).S(i5, AbstractC1584v2.c.k(j4 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (v(i4, obj)) {
                        c1599z1.a(i5, AbstractC1584v2.c.j(j4 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (v(i4, obj)) {
                        c1599z1.c(i5, AbstractC1584v2.c.k(j4 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (v(i4, obj)) {
                        c1599z1.e(i5, AbstractC1584v2.c.m(j4 & 1048575, obj), n(i4));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    AbstractC1553n2.d(i5, (List) AbstractC1584v2.c.m(j4 & 1048575, obj), c1599z1, false);
                    break;
                case 19:
                    AbstractC1553n2.h(i5, (List) AbstractC1584v2.c.m(j4 & 1048575, obj), c1599z1, false);
                    break;
                case 20:
                    AbstractC1553n2.j(i5, (List) AbstractC1584v2.c.m(j4 & 1048575, obj), c1599z1, false);
                    break;
                case 21:
                    AbstractC1553n2.q(i5, (List) AbstractC1584v2.c.m(j4 & 1048575, obj), c1599z1, false);
                    break;
                case 22:
                    AbstractC1553n2.i(i5, (List) AbstractC1584v2.c.m(j4 & 1048575, obj), c1599z1, false);
                    break;
                case 23:
                    AbstractC1553n2.g(i5, (List) AbstractC1584v2.c.m(j4 & 1048575, obj), c1599z1, false);
                    break;
                case 24:
                    AbstractC1553n2.f(i5, (List) AbstractC1584v2.c.m(j4 & 1048575, obj), c1599z1, false);
                    break;
                case 25:
                    AbstractC1553n2.b(i5, (List) AbstractC1584v2.c.m(j4 & 1048575, obj), c1599z1, false);
                    break;
                case 26:
                    AbstractC1553n2.o(i5, (List) AbstractC1584v2.c.m(j4 & 1048575, obj), c1599z1);
                    break;
                case 27:
                    List list = (List) AbstractC1584v2.c.m(j4 & 1048575, obj);
                    InterfaceC1549m2 n4 = n(i4);
                    Class cls = AbstractC1553n2.f11986a;
                    if (list != null && !list.isEmpty()) {
                        for (int i6 = 0; i6 < list.size(); i6++) {
                            c1599z1.f(i5, list.get(i6), n4);
                        }
                        break;
                    }
                    break;
                case 28:
                    AbstractC1553n2.c(i5, (List) AbstractC1584v2.c.m(j4 & 1048575, obj), c1599z1);
                    break;
                case 29:
                    AbstractC1553n2.p(i5, (List) AbstractC1584v2.c.m(j4 & 1048575, obj), c1599z1, false);
                    break;
                case 30:
                    AbstractC1553n2.e(i5, (List) AbstractC1584v2.c.m(j4 & 1048575, obj), c1599z1, false);
                    break;
                case 31:
                    AbstractC1553n2.k(i5, (List) AbstractC1584v2.c.m(j4 & 1048575, obj), c1599z1, false);
                    break;
                case 32:
                    AbstractC1553n2.l(i5, (List) AbstractC1584v2.c.m(j4 & 1048575, obj), c1599z1, false);
                    break;
                case 33:
                    AbstractC1553n2.m(i5, (List) AbstractC1584v2.c.m(j4 & 1048575, obj), c1599z1, false);
                    break;
                case 34:
                    AbstractC1553n2.n(i5, (List) AbstractC1584v2.c.m(j4 & 1048575, obj), c1599z1, false);
                    break;
                case 35:
                    AbstractC1553n2.d(i5, (List) AbstractC1584v2.c.m(j4 & 1048575, obj), c1599z1, true);
                    break;
                case 36:
                    AbstractC1553n2.h(i5, (List) AbstractC1584v2.c.m(j4 & 1048575, obj), c1599z1, true);
                    break;
                case 37:
                    AbstractC1553n2.j(i5, (List) AbstractC1584v2.c.m(j4 & 1048575, obj), c1599z1, true);
                    break;
                case 38:
                    AbstractC1553n2.q(i5, (List) AbstractC1584v2.c.m(j4 & 1048575, obj), c1599z1, true);
                    break;
                case 39:
                    AbstractC1553n2.i(i5, (List) AbstractC1584v2.c.m(j4 & 1048575, obj), c1599z1, true);
                    break;
                case 40:
                    AbstractC1553n2.g(i5, (List) AbstractC1584v2.c.m(j4 & 1048575, obj), c1599z1, true);
                    break;
                case 41:
                    AbstractC1553n2.f(i5, (List) AbstractC1584v2.c.m(j4 & 1048575, obj), c1599z1, true);
                    break;
                case 42:
                    AbstractC1553n2.b(i5, (List) AbstractC1584v2.c.m(j4 & 1048575, obj), c1599z1, true);
                    break;
                case 43:
                    AbstractC1553n2.p(i5, (List) AbstractC1584v2.c.m(j4 & 1048575, obj), c1599z1, true);
                    break;
                case 44:
                    AbstractC1553n2.e(i5, (List) AbstractC1584v2.c.m(j4 & 1048575, obj), c1599z1, true);
                    break;
                case 45:
                    AbstractC1553n2.k(i5, (List) AbstractC1584v2.c.m(j4 & 1048575, obj), c1599z1, true);
                    break;
                case 46:
                    AbstractC1553n2.l(i5, (List) AbstractC1584v2.c.m(j4 & 1048575, obj), c1599z1, true);
                    break;
                case 47:
                    AbstractC1553n2.m(i5, (List) AbstractC1584v2.c.m(j4 & 1048575, obj), c1599z1, true);
                    break;
                case 48:
                    AbstractC1553n2.n(i5, (List) AbstractC1584v2.c.m(j4 & 1048575, obj), c1599z1, true);
                    break;
                case 49:
                    List list2 = (List) AbstractC1584v2.c.m(j4 & 1048575, obj);
                    InterfaceC1549m2 n5 = n(i4);
                    Class cls2 = AbstractC1553n2.f11986a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i7 = 0; i7 < list2.size(); i7++) {
                            c1599z1.e(i5, list2.get(i7), n5);
                        }
                        break;
                    }
                    break;
                case 50:
                    if (AbstractC1584v2.c.m(j4 & 1048575, obj) != null) {
                        o(i4).getClass();
                        throw new ClassCastException();
                    }
                    break;
                case 51:
                    if (w(i5, i4, obj)) {
                        ((C1595y1) c1599z1.f12124p).S(i5, Double.doubleToRawLongBits(((Double) AbstractC1584v2.c.m(j4 & 1048575, obj)).doubleValue()));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (w(i5, i4, obj)) {
                        ((C1595y1) c1599z1.f12124p).Q(i5, Float.floatToRawIntBits(((Float) AbstractC1584v2.c.m(j4 & 1048575, obj)).floatValue()));
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (w(i5, i4, obj)) {
                        ((C1595y1) c1599z1.f12124p).X(i5, k(j4 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (w(i5, i4, obj)) {
                        ((C1595y1) c1599z1.f12124p).X(i5, k(j4 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (w(i5, i4, obj)) {
                        int E4 = E(j4 & 1048575, obj);
                        C1595y1 c1595y15 = (C1595y1) c1599z1.f12124p;
                        c1595y15.W(i5 << 3);
                        if (E4 >= 0) {
                            c1595y15.W(E4);
                            break;
                        } else {
                            c1595y15.Y(E4);
                            break;
                        }
                    } else {
                        break;
                    }
                case 56:
                    if (w(i5, i4, obj)) {
                        ((C1595y1) c1599z1.f12124p).S(i5, k(j4 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (w(i5, i4, obj)) {
                        ((C1595y1) c1599z1.f12124p).Q(i5, E(j4 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (w(i5, i4, obj)) {
                        boolean booleanValue = ((Boolean) AbstractC1584v2.c.m(j4 & 1048575, obj)).booleanValue();
                        C1595y1 c1595y16 = (C1595y1) c1599z1.f12124p;
                        c1595y16.W(i5 << 3);
                        c1595y16.N(booleanValue ? (byte) 1 : (byte) 0);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (w(i5, i4, obj)) {
                        x(i5, AbstractC1584v2.c.m(j4 & 1048575, obj), c1599z1);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (w(i5, i4, obj)) {
                        c1599z1.f(i5, AbstractC1584v2.c.m(j4 & 1048575, obj), n(i4));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (w(i5, i4, obj)) {
                        c1599z1.d(i5, (C1591x1) AbstractC1584v2.c.m(j4 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (w(i5, i4, obj)) {
                        int E5 = E(j4 & 1048575, obj);
                        C1595y1 c1595y17 = (C1595y1) c1599z1.f12124p;
                        c1595y17.W(i5 << 3);
                        c1595y17.W(E5);
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (w(i5, i4, obj)) {
                        int E6 = E(j4 & 1048575, obj);
                        C1595y1 c1595y18 = (C1595y1) c1599z1.f12124p;
                        c1595y18.W(i5 << 3);
                        if (E6 >= 0) {
                            c1595y18.W(E6);
                            break;
                        } else {
                            c1595y18.Y(E6);
                            break;
                        }
                    } else {
                        break;
                    }
                case 64:
                    if (w(i5, i4, obj)) {
                        ((C1595y1) c1599z1.f12124p).Q(i5, E(j4 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (w(i5, i4, obj)) {
                        ((C1595y1) c1599z1.f12124p).S(i5, k(j4 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (w(i5, i4, obj)) {
                        c1599z1.a(i5, E(j4 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (w(i5, i4, obj)) {
                        c1599z1.c(i5, k(j4 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (w(i5, i4, obj)) {
                        c1599z1.e(i5, AbstractC1584v2.c.m(j4 & 1048575, obj), n(i4));
                        break;
                    } else {
                        break;
                    }
            }
        }
        this.f11926k.getClass();
        ((I1) obj).zzc.d(c1599z1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0216, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00df, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e1, code lost:
    
        r8 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e2, code lost:
    
        r3 = r8 + r3;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001c. Please report as an issue. */
    @Override // com.google.android.gms.internal.measurement.InterfaceC1549m2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(com.google.android.gms.internal.measurement.I1 r12) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1511e2.f(com.google.android.gms.internal.measurement.I1):int");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1549m2
    public final void g(I1 i12, I1 i13) {
        I1 i14;
        i13.getClass();
        int i4 = 0;
        while (true) {
            int[] iArr = this.f11918a;
            if (i4 >= iArr.length) {
                AbstractC1553n2.a(this.f11926k, i12, i13);
                return;
            }
            int j4 = j(i4);
            long j5 = j4 & 1048575;
            int i5 = iArr[i4];
            switch (i(j4)) {
                case 0:
                    i14 = i12;
                    if (!v(i4, i13)) {
                        break;
                    } else {
                        AbstractC1580u2 abstractC1580u2 = AbstractC1584v2.c;
                        abstractC1580u2.e(i14, j5, abstractC1580u2.a(j5, i13));
                        s(i4, i14);
                        continue;
                    }
                case 1:
                    i14 = i12;
                    if (v(i4, i13)) {
                        AbstractC1580u2 abstractC1580u22 = AbstractC1584v2.c;
                        abstractC1580u22.f(i14, j5, abstractC1580u22.b(j5, i13));
                        s(i4, i14);
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    i14 = i12;
                    if (v(i4, i13)) {
                        AbstractC1580u2 abstractC1580u23 = AbstractC1584v2.c;
                        abstractC1580u23.o(i14, j5, abstractC1580u23.k(j5, i13));
                        s(i4, i14);
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    i14 = i12;
                    if (v(i4, i13)) {
                        AbstractC1580u2 abstractC1580u24 = AbstractC1584v2.c;
                        abstractC1580u24.o(i14, j5, abstractC1580u24.k(j5, i13));
                        s(i4, i14);
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    i14 = i12;
                    if (v(i4, i13)) {
                        AbstractC1584v2.g(j5, i14, AbstractC1584v2.c.j(j5, i13));
                        s(i4, i14);
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    i14 = i12;
                    if (v(i4, i13)) {
                        AbstractC1580u2 abstractC1580u25 = AbstractC1584v2.c;
                        abstractC1580u25.o(i14, j5, abstractC1580u25.k(j5, i13));
                        s(i4, i14);
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    i14 = i12;
                    if (v(i4, i13)) {
                        AbstractC1584v2.g(j5, i14, AbstractC1584v2.c.j(j5, i13));
                        s(i4, i14);
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    i14 = i12;
                    if (v(i4, i13)) {
                        AbstractC1580u2 abstractC1580u26 = AbstractC1584v2.c;
                        abstractC1580u26.c(i14, j5, abstractC1580u26.g(j5, i13));
                        s(i4, i14);
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    i14 = i12;
                    if (v(i4, i13)) {
                        AbstractC1584v2.h(j5, i14, AbstractC1584v2.c.m(j5, i13));
                        s(i4, i14);
                        break;
                    } else {
                        continue;
                    }
                case 9:
                    i14 = i12;
                    q(i4, i14, i13);
                    continue;
                case 10:
                    i14 = i12;
                    if (v(i4, i13)) {
                        AbstractC1584v2.h(j5, i14, AbstractC1584v2.c.m(j5, i13));
                        s(i4, i14);
                        break;
                    } else {
                        continue;
                    }
                case 11:
                    i14 = i12;
                    if (v(i4, i13)) {
                        AbstractC1584v2.g(j5, i14, AbstractC1584v2.c.j(j5, i13));
                        s(i4, i14);
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    i14 = i12;
                    if (v(i4, i13)) {
                        AbstractC1584v2.g(j5, i14, AbstractC1584v2.c.j(j5, i13));
                        s(i4, i14);
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    i14 = i12;
                    if (v(i4, i13)) {
                        AbstractC1584v2.g(j5, i14, AbstractC1584v2.c.j(j5, i13));
                        s(i4, i14);
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    i14 = i12;
                    if (v(i4, i13)) {
                        AbstractC1580u2 abstractC1580u27 = AbstractC1584v2.c;
                        abstractC1580u27.o(i14, j5, abstractC1580u27.k(j5, i13));
                        s(i4, i14);
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    i14 = i12;
                    if (v(i4, i13)) {
                        AbstractC1584v2.g(j5, i14, AbstractC1584v2.c.j(j5, i13));
                        s(i4, i14);
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    if (v(i4, i13)) {
                        AbstractC1580u2 abstractC1580u28 = AbstractC1584v2.c;
                        i14 = i12;
                        abstractC1580u28.o(i14, j5, abstractC1580u28.k(j5, i13));
                        s(i4, i14);
                        break;
                    }
                    break;
                case 17:
                    q(i4, i12, i13);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f11925j.b(j5, i12, i13);
                    break;
                case 50:
                    Class cls = AbstractC1553n2.f11986a;
                    AbstractC1580u2 abstractC1580u29 = AbstractC1584v2.c;
                    AbstractC1584v2.h(j5, i12, C1496b2.b(abstractC1580u29.m(j5, i12), abstractC1580u29.m(j5, i13)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (w(i5, i4, i13)) {
                        AbstractC1584v2.h(j5, i12, AbstractC1584v2.c.m(j5, i13));
                        AbstractC1584v2.g(iArr[i4 + 2] & 1048575, i12, i5);
                        break;
                    }
                    break;
                case 60:
                    r(i4, i12, i13);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (w(i5, i4, i13)) {
                        AbstractC1584v2.h(j5, i12, AbstractC1584v2.c.m(j5, i13));
                        AbstractC1584v2.g(iArr[i4 + 2] & 1048575, i12, i5);
                        break;
                    }
                    break;
                case 68:
                    r(i4, i12, i13);
                    break;
            }
            i14 = i12;
            i4 += 3;
            i12 = i14;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0015. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01fe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01eb A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.InterfaceC1549m2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(com.google.android.gms.internal.measurement.I1 r11, com.google.android.gms.internal.measurement.I1 r12) {
        /*
            Method dump skipped, instructions count: 656
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1511e2.h(com.google.android.gms.internal.measurement.I1, com.google.android.gms.internal.measurement.I1):boolean");
    }

    public final int j(int i4) {
        return this.f11918a[i4 + 1];
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1549m2
    public final int l(Object obj) {
        return this.f11921f ? D(obj) : C(obj);
    }

    public final K1 m(int i4) {
        int i5 = i4 / 3;
        return (K1) this.f11919b[i5 + i5 + 1];
    }

    public final InterfaceC1549m2 n(int i4) {
        int i5 = i4 / 3;
        int i6 = i5 + i5;
        Object[] objArr = this.f11919b;
        InterfaceC1549m2 interfaceC1549m2 = (InterfaceC1549m2) objArr[i6];
        if (interfaceC1549m2 != null) {
            return interfaceC1549m2;
        }
        InterfaceC1549m2 a4 = C1536j2.c.a((Class) objArr[i6 + 1]);
        objArr[i6] = a4;
        return a4;
    }

    public final Object o(int i4) {
        int i5 = i4 / 3;
        return this.f11919b[i5 + i5];
    }

    public final void q(int i4, Object obj, Object obj2) {
        long j4 = j(i4) & 1048575;
        if (v(i4, obj2)) {
            AbstractC1580u2 abstractC1580u2 = AbstractC1584v2.c;
            Object m4 = abstractC1580u2.m(j4, obj);
            Object m5 = abstractC1580u2.m(j4, obj2);
            if (m4 != null && m5 != null) {
                AbstractC1584v2.h(j4, obj, O1.b(m4, m5));
                s(i4, obj);
            } else if (m5 != null) {
                AbstractC1584v2.h(j4, obj, m5);
                s(i4, obj);
            }
        }
    }

    public final void r(int i4, Object obj, Object obj2) {
        int j4 = j(i4);
        int i5 = this.f11918a[i4];
        long j5 = j4 & 1048575;
        if (w(i5, i4, obj2)) {
            Object m4 = w(i5, i4, obj) ? AbstractC1584v2.c.m(j5, obj) : null;
            Object m5 = AbstractC1584v2.c.m(j5, obj2);
            if (m4 != null && m5 != null) {
                AbstractC1584v2.h(j5, obj, O1.b(m4, m5));
                AbstractC1584v2.g(r1[i4 + 2] & 1048575, obj, i5);
            } else if (m5 != null) {
                AbstractC1584v2.h(j5, obj, m5);
                AbstractC1584v2.g(r1[i4 + 2] & 1048575, obj, i5);
            }
        }
    }

    public final void s(int i4, Object obj) {
        int i5 = this.f11918a[i4 + 2];
        long j4 = 1048575 & i5;
        if (j4 == 1048575) {
            return;
        }
        AbstractC1584v2.g(j4, obj, (1 << (i5 >>> 20)) | AbstractC1584v2.c.j(j4, obj));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0040. Please report as an issue. */
    public final void t(Object obj, C1599z1 c1599z1) {
        int i4;
        int i5;
        int i6;
        int[] iArr = this.f11918a;
        int length = iArr.length;
        Unsafe unsafe = f11917m;
        int i7 = 0;
        int i8 = 1048575;
        for (int i9 = 0; i9 < length; i9 = i6 + 3) {
            int j4 = j(i9);
            int i10 = iArr[i9];
            int i11 = i(j4);
            if (i11 <= 17) {
                int i12 = iArr[i9 + 2];
                i4 = 1048575;
                int i13 = i12 & 1048575;
                if (i13 != i8) {
                    i7 = unsafe.getInt(obj, i13);
                    i8 = i13;
                }
                i5 = 1 << (i12 >>> 20);
            } else {
                i4 = 1048575;
                i5 = 0;
            }
            int i14 = i9;
            long j5 = j4 & i4;
            switch (i11) {
                case 0:
                    i6 = i14;
                    if ((i5 & i7) != 0) {
                        ((C1595y1) c1599z1.f12124p).S(i10, Double.doubleToRawLongBits(AbstractC1584v2.c.a(j5, obj)));
                    }
                case 1:
                    i6 = i14;
                    if ((i5 & i7) != 0) {
                        ((C1595y1) c1599z1.f12124p).Q(i10, Float.floatToRawIntBits(AbstractC1584v2.c.b(j5, obj)));
                    }
                case 2:
                    i6 = i14;
                    if ((i5 & i7) != 0) {
                        ((C1595y1) c1599z1.f12124p).X(i10, unsafe.getLong(obj, j5));
                    }
                case 3:
                    i6 = i14;
                    if ((i5 & i7) != 0) {
                        ((C1595y1) c1599z1.f12124p).X(i10, unsafe.getLong(obj, j5));
                    }
                case 4:
                    i6 = i14;
                    if ((i5 & i7) != 0) {
                        int i15 = unsafe.getInt(obj, j5);
                        C1595y1 c1595y1 = (C1595y1) c1599z1.f12124p;
                        c1595y1.W(i10 << 3);
                        if (i15 >= 0) {
                            c1595y1.W(i15);
                        } else {
                            c1595y1.Y(i15);
                        }
                    }
                case 5:
                    i6 = i14;
                    if ((i5 & i7) != 0) {
                        ((C1595y1) c1599z1.f12124p).S(i10, unsafe.getLong(obj, j5));
                    }
                case 6:
                    i6 = i14;
                    if ((i5 & i7) != 0) {
                        ((C1595y1) c1599z1.f12124p).Q(i10, unsafe.getInt(obj, j5));
                    }
                case 7:
                    i6 = i14;
                    if ((i5 & i7) != 0) {
                        boolean g4 = AbstractC1584v2.c.g(j5, obj);
                        C1595y1 c1595y12 = (C1595y1) c1599z1.f12124p;
                        c1595y12.W(i10 << 3);
                        c1595y12.N(g4 ? (byte) 1 : (byte) 0);
                    }
                case 8:
                    i6 = i14;
                    if ((i5 & i7) != 0) {
                        x(i10, unsafe.getObject(obj, j5), c1599z1);
                    }
                case 9:
                    i6 = i14;
                    if ((i5 & i7) != 0) {
                        c1599z1.f(i10, unsafe.getObject(obj, j5), n(i6));
                    }
                case 10:
                    i6 = i14;
                    if ((i5 & i7) != 0) {
                        c1599z1.d(i10, (C1591x1) unsafe.getObject(obj, j5));
                    }
                case 11:
                    i6 = i14;
                    if ((i5 & i7) != 0) {
                        int i16 = unsafe.getInt(obj, j5);
                        C1595y1 c1595y13 = (C1595y1) c1599z1.f12124p;
                        c1595y13.W(i10 << 3);
                        c1595y13.W(i16);
                    }
                case 12:
                    i6 = i14;
                    if ((i5 & i7) != 0) {
                        int i17 = unsafe.getInt(obj, j5);
                        C1595y1 c1595y14 = (C1595y1) c1599z1.f12124p;
                        c1595y14.W(i10 << 3);
                        if (i17 >= 0) {
                            c1595y14.W(i17);
                        } else {
                            c1595y14.Y(i17);
                        }
                    }
                case 13:
                    i6 = i14;
                    if ((i5 & i7) != 0) {
                        ((C1595y1) c1599z1.f12124p).Q(i10, unsafe.getInt(obj, j5));
                    }
                case 14:
                    i6 = i14;
                    if ((i5 & i7) != 0) {
                        ((C1595y1) c1599z1.f12124p).S(i10, unsafe.getLong(obj, j5));
                    }
                case 15:
                    i6 = i14;
                    if ((i5 & i7) != 0) {
                        c1599z1.a(i10, unsafe.getInt(obj, j5));
                    }
                case 16:
                    i6 = i14;
                    if ((i5 & i7) != 0) {
                        c1599z1.c(i10, unsafe.getLong(obj, j5));
                    }
                case 17:
                    i6 = i14;
                    if ((i5 & i7) != 0) {
                        c1599z1.e(i10, unsafe.getObject(obj, j5), n(i6));
                    }
                case 18:
                    i6 = i14;
                    AbstractC1553n2.d(iArr[i6], (List) unsafe.getObject(obj, j5), c1599z1, false);
                case 19:
                    i6 = i14;
                    AbstractC1553n2.h(iArr[i6], (List) unsafe.getObject(obj, j5), c1599z1, false);
                case 20:
                    i6 = i14;
                    AbstractC1553n2.j(iArr[i6], (List) unsafe.getObject(obj, j5), c1599z1, false);
                case 21:
                    i6 = i14;
                    AbstractC1553n2.q(iArr[i6], (List) unsafe.getObject(obj, j5), c1599z1, false);
                case 22:
                    i6 = i14;
                    AbstractC1553n2.i(iArr[i6], (List) unsafe.getObject(obj, j5), c1599z1, false);
                case 23:
                    i6 = i14;
                    AbstractC1553n2.g(iArr[i6], (List) unsafe.getObject(obj, j5), c1599z1, false);
                case 24:
                    i6 = i14;
                    AbstractC1553n2.f(iArr[i6], (List) unsafe.getObject(obj, j5), c1599z1, false);
                case 25:
                    i6 = i14;
                    AbstractC1553n2.b(iArr[i6], (List) unsafe.getObject(obj, j5), c1599z1, false);
                case 26:
                    i6 = i14;
                    AbstractC1553n2.o(iArr[i6], (List) unsafe.getObject(obj, j5), c1599z1);
                case 27:
                    i6 = i14;
                    int i18 = iArr[i6];
                    List list = (List) unsafe.getObject(obj, j5);
                    InterfaceC1549m2 n4 = n(i6);
                    Class cls = AbstractC1553n2.f11986a;
                    if (list != null && !list.isEmpty()) {
                        for (int i19 = 0; i19 < list.size(); i19++) {
                            c1599z1.f(i18, list.get(i19), n4);
                        }
                    }
                    break;
                case 28:
                    i6 = i14;
                    AbstractC1553n2.c(iArr[i6], (List) unsafe.getObject(obj, j5), c1599z1);
                case 29:
                    i6 = i14;
                    AbstractC1553n2.p(iArr[i6], (List) unsafe.getObject(obj, j5), c1599z1, false);
                case 30:
                    i6 = i14;
                    AbstractC1553n2.e(iArr[i6], (List) unsafe.getObject(obj, j5), c1599z1, false);
                case 31:
                    i6 = i14;
                    AbstractC1553n2.k(iArr[i6], (List) unsafe.getObject(obj, j5), c1599z1, false);
                case 32:
                    i6 = i14;
                    AbstractC1553n2.l(iArr[i6], (List) unsafe.getObject(obj, j5), c1599z1, false);
                case 33:
                    i6 = i14;
                    AbstractC1553n2.m(iArr[i6], (List) unsafe.getObject(obj, j5), c1599z1, false);
                case 34:
                    i6 = i14;
                    AbstractC1553n2.n(iArr[i6], (List) unsafe.getObject(obj, j5), c1599z1, false);
                case 35:
                    i6 = i14;
                    AbstractC1553n2.d(iArr[i6], (List) unsafe.getObject(obj, j5), c1599z1, true);
                case 36:
                    i6 = i14;
                    AbstractC1553n2.h(iArr[i6], (List) unsafe.getObject(obj, j5), c1599z1, true);
                case 37:
                    i6 = i14;
                    AbstractC1553n2.j(iArr[i6], (List) unsafe.getObject(obj, j5), c1599z1, true);
                case 38:
                    i6 = i14;
                    AbstractC1553n2.q(iArr[i6], (List) unsafe.getObject(obj, j5), c1599z1, true);
                case 39:
                    i6 = i14;
                    AbstractC1553n2.i(iArr[i6], (List) unsafe.getObject(obj, j5), c1599z1, true);
                case 40:
                    i6 = i14;
                    AbstractC1553n2.g(iArr[i6], (List) unsafe.getObject(obj, j5), c1599z1, true);
                case 41:
                    i6 = i14;
                    AbstractC1553n2.f(iArr[i6], (List) unsafe.getObject(obj, j5), c1599z1, true);
                case 42:
                    i6 = i14;
                    AbstractC1553n2.b(iArr[i6], (List) unsafe.getObject(obj, j5), c1599z1, true);
                case 43:
                    i6 = i14;
                    AbstractC1553n2.p(iArr[i6], (List) unsafe.getObject(obj, j5), c1599z1, true);
                case 44:
                    i6 = i14;
                    AbstractC1553n2.e(iArr[i6], (List) unsafe.getObject(obj, j5), c1599z1, true);
                case 45:
                    i6 = i14;
                    AbstractC1553n2.k(iArr[i6], (List) unsafe.getObject(obj, j5), c1599z1, true);
                case 46:
                    i6 = i14;
                    AbstractC1553n2.l(iArr[i6], (List) unsafe.getObject(obj, j5), c1599z1, true);
                case 47:
                    i6 = i14;
                    AbstractC1553n2.m(iArr[i6], (List) unsafe.getObject(obj, j5), c1599z1, true);
                case 48:
                    i6 = i14;
                    AbstractC1553n2.n(iArr[i6], (List) unsafe.getObject(obj, j5), c1599z1, true);
                case 49:
                    i6 = i14;
                    int i20 = iArr[i6];
                    List list2 = (List) unsafe.getObject(obj, j5);
                    InterfaceC1549m2 n5 = n(i6);
                    Class cls2 = AbstractC1553n2.f11986a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i21 = 0; i21 < list2.size(); i21++) {
                            c1599z1.e(i20, list2.get(i21), n5);
                        }
                    }
                    break;
                case 50:
                    i6 = i14;
                    if (unsafe.getObject(obj, j5) != null) {
                        o(i6).getClass();
                        throw new ClassCastException();
                    }
                case 51:
                    i6 = i14;
                    if (w(i10, i6, obj)) {
                        ((C1595y1) c1599z1.f12124p).S(i10, Double.doubleToRawLongBits(((Double) AbstractC1584v2.c.m(j5, obj)).doubleValue()));
                    }
                case 52:
                    i6 = i14;
                    if (w(i10, i6, obj)) {
                        ((C1595y1) c1599z1.f12124p).Q(i10, Float.floatToRawIntBits(((Float) AbstractC1584v2.c.m(j5, obj)).floatValue()));
                    }
                case 53:
                    i6 = i14;
                    if (w(i10, i6, obj)) {
                        ((C1595y1) c1599z1.f12124p).X(i10, k(j5, obj));
                    }
                case 54:
                    i6 = i14;
                    if (w(i10, i6, obj)) {
                        ((C1595y1) c1599z1.f12124p).X(i10, k(j5, obj));
                    }
                case 55:
                    i6 = i14;
                    if (w(i10, i6, obj)) {
                        int E4 = E(j5, obj);
                        C1595y1 c1595y15 = (C1595y1) c1599z1.f12124p;
                        c1595y15.W(i10 << 3);
                        if (E4 >= 0) {
                            c1595y15.W(E4);
                        } else {
                            c1595y15.Y(E4);
                        }
                    }
                case 56:
                    i6 = i14;
                    if (w(i10, i6, obj)) {
                        ((C1595y1) c1599z1.f12124p).S(i10, k(j5, obj));
                    }
                case 57:
                    i6 = i14;
                    if (w(i10, i6, obj)) {
                        ((C1595y1) c1599z1.f12124p).Q(i10, E(j5, obj));
                    }
                case 58:
                    i6 = i14;
                    if (w(i10, i6, obj)) {
                        boolean booleanValue = ((Boolean) AbstractC1584v2.c.m(j5, obj)).booleanValue();
                        C1595y1 c1595y16 = (C1595y1) c1599z1.f12124p;
                        c1595y16.W(i10 << 3);
                        c1595y16.N(booleanValue ? (byte) 1 : (byte) 0);
                    }
                case 59:
                    i6 = i14;
                    if (w(i10, i6, obj)) {
                        x(i10, unsafe.getObject(obj, j5), c1599z1);
                    }
                case 60:
                    i6 = i14;
                    if (w(i10, i6, obj)) {
                        c1599z1.f(i10, unsafe.getObject(obj, j5), n(i6));
                    }
                case 61:
                    i6 = i14;
                    if (w(i10, i6, obj)) {
                        c1599z1.d(i10, (C1591x1) unsafe.getObject(obj, j5));
                    }
                case 62:
                    i6 = i14;
                    if (w(i10, i6, obj)) {
                        int E5 = E(j5, obj);
                        C1595y1 c1595y17 = (C1595y1) c1599z1.f12124p;
                        c1595y17.W(i10 << 3);
                        c1595y17.W(E5);
                    }
                case 63:
                    i6 = i14;
                    if (w(i10, i6, obj)) {
                        int E6 = E(j5, obj);
                        C1595y1 c1595y18 = (C1595y1) c1599z1.f12124p;
                        c1595y18.W(i10 << 3);
                        if (E6 >= 0) {
                            c1595y18.W(E6);
                        } else {
                            c1595y18.Y(E6);
                        }
                    }
                case 64:
                    i6 = i14;
                    if (w(i10, i6, obj)) {
                        ((C1595y1) c1599z1.f12124p).Q(i10, E(j5, obj));
                    }
                case 65:
                    i6 = i14;
                    if (w(i10, i6, obj)) {
                        ((C1595y1) c1599z1.f12124p).S(i10, k(j5, obj));
                    }
                case 66:
                    i6 = i14;
                    if (w(i10, i6, obj)) {
                        c1599z1.a(i10, E(j5, obj));
                    }
                case 67:
                    i6 = i14;
                    if (w(i10, i6, obj)) {
                        c1599z1.c(i10, k(j5, obj));
                    }
                case 68:
                    i6 = i14;
                    if (w(i10, i6, obj)) {
                        c1599z1.e(i10, unsafe.getObject(obj, j5), n(i6));
                    }
                default:
                    i6 = i14;
            }
        }
        this.f11926k.getClass();
        ((I1) obj).zzc.d(c1599z1);
    }

    public final boolean u(I1 i12, I1 i13, int i4) {
        return v(i4, i12) == v(i4, i13);
    }

    public final boolean v(int i4, Object obj) {
        int i5 = this.f11918a[i4 + 2];
        long j4 = i5 & 1048575;
        if (j4 == 1048575) {
            int j5 = j(i4);
            long j6 = j5 & 1048575;
            switch (i(j5)) {
                case 0:
                    if (Double.doubleToRawLongBits(AbstractC1584v2.c.a(j6, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(AbstractC1584v2.c.b(j6, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (AbstractC1584v2.c.k(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (AbstractC1584v2.c.k(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (AbstractC1584v2.c.j(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (AbstractC1584v2.c.k(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (AbstractC1584v2.c.j(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return AbstractC1584v2.c.g(j6, obj);
                case 8:
                    Object m4 = AbstractC1584v2.c.m(j6, obj);
                    if (m4 instanceof String) {
                        if (((String) m4).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(m4 instanceof C1591x1)) {
                            throw new IllegalArgumentException();
                        }
                        if (C1591x1.f12113q.equals(m4)) {
                            return false;
                        }
                    }
                    break;
                case 9:
                    if (AbstractC1584v2.c.m(j6, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (C1591x1.f12113q.equals(AbstractC1584v2.c.m(j6, obj))) {
                        return false;
                    }
                    break;
                case 11:
                    if (AbstractC1584v2.c.j(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (AbstractC1584v2.c.j(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (AbstractC1584v2.c.j(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (AbstractC1584v2.c.k(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (AbstractC1584v2.c.j(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (AbstractC1584v2.c.k(j6, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (AbstractC1584v2.c.m(j6, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if ((AbstractC1584v2.c.j(j4, obj) & (1 << (i5 >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    public final boolean w(int i4, int i5, Object obj) {
        return AbstractC1584v2.c.j((long) (this.f11918a[i5 + 2] & 1048575), obj) == i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x0200, code lost:
    
        r14 = r14 | r21;
        r4 = r31;
        r9 = r1;
        r3 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0206, code lost:
    
        r1 = r8;
        r8 = r10;
        r5 = r11;
        r7 = r12;
        r6 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x024a, code lost:
    
        r14 = r14 | r21;
        r4 = r31;
        r9 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x026c, code lost:
    
        r7 = r1;
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x03bb, code lost:
    
        r6 = r0;
        r8 = r2;
        r2 = r3;
        r11 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x039f, code lost:
    
        r7 = r12;
        r14 = r17;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:106:0x00aa. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int y(java.lang.Object r28, byte[] r29, int r30, int r31, int r32, com.google.android.gms.internal.ads.C0544dz r33) {
        /*
            Method dump skipped, instructions count: 1170
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1511e2.y(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.dz):int");
    }
}
