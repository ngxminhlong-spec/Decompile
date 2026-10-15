package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.ads.C0544dz;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.play_billing.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1606c0 implements InterfaceC1622k0 {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f12185k = new int[0];

    /* renamed from: l, reason: collision with root package name */
    public static final Unsafe f12186l = AbstractC1645w0.i();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f12187a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f12188b;
    public final int c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC1627n f12189e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f12190f;

    /* renamed from: g, reason: collision with root package name */
    public final int f12191g;

    /* renamed from: h, reason: collision with root package name */
    public final int f12192h;

    /* renamed from: i, reason: collision with root package name */
    public final T f12193i;

    /* renamed from: j, reason: collision with root package name */
    public final C1630o0 f12194j;

    public C1606c0(int[] iArr, Object[] objArr, int i4, int i5, AbstractC1627n abstractC1627n, int[] iArr2, int i6, int i7, T t4, C1630o0 c1630o0, C1646x c1646x) {
        this.f12187a = iArr;
        this.f12188b = objArr;
        this.c = i4;
        this.d = i5;
        this.f12190f = iArr2;
        this.f12191g = i6;
        this.f12192h = i7;
        this.f12193i = t4;
        this.f12194j = c1630o0;
        this.f12189e = abstractC1627n;
    }

    public static Field E(Class cls, String str) {
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

    public static boolean r(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof E) {
            return ((E) obj).j();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0277  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.play_billing.C1606c0 u(com.google.android.gms.internal.play_billing.C1620j0 r35, com.google.android.gms.internal.play_billing.T r36, com.google.android.gms.internal.play_billing.C1630o0 r37, com.google.android.gms.internal.play_billing.C1646x r38) {
        /*
            Method dump skipped, instructions count: 1056
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.C1606c0.u(com.google.android.gms.internal.play_billing.j0, com.google.android.gms.internal.play_billing.T, com.google.android.gms.internal.play_billing.o0, com.google.android.gms.internal.play_billing.x):com.google.android.gms.internal.play_billing.c0");
    }

    public static int v(long j4, Object obj) {
        return ((Integer) AbstractC1645w0.h(j4, obj)).intValue();
    }

    public static int x(int i4) {
        return (i4 >>> 20) & 255;
    }

    public static long z(long j4, Object obj) {
        return ((Long) AbstractC1645w0.h(j4, obj)).longValue();
    }

    public final G A(int i4) {
        int i5 = i4 / 3;
        return (G) this.f12188b[i5 + i5 + 1];
    }

    public final InterfaceC1622k0 B(int i4) {
        int i5 = i4 / 3;
        int i6 = i5 + i5;
        Object[] objArr = this.f12188b;
        InterfaceC1622k0 interfaceC1622k0 = (InterfaceC1622k0) objArr[i6];
        if (interfaceC1622k0 != null) {
            return interfaceC1622k0;
        }
        InterfaceC1622k0 a4 = C1616h0.c.a((Class) objArr[i6 + 1]);
        objArr[i6] = a4;
        return a4;
    }

    public final Object C(int i4, Object obj) {
        InterfaceC1622k0 B4 = B(i4);
        int y = y(i4) & 1048575;
        if (!p(i4, obj)) {
            return B4.a();
        }
        Object object = f12186l.getObject(obj, y);
        if (r(object)) {
            return object;
        }
        E a4 = B4.a();
        if (object != null) {
            B4.d(a4, object);
        }
        return a4;
    }

    public final Object D(int i4, int i5, Object obj) {
        InterfaceC1622k0 B4 = B(i5);
        if (!s(i4, i5, obj)) {
            return B4.a();
        }
        Object object = f12186l.getObject(obj, y(i5) & 1048575);
        if (r(object)) {
            return object;
        }
        E a4 = B4.a();
        if (object != null) {
            B4.d(a4, object);
        }
        return a4;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1622k0
    public final E a() {
        return (E) ((E) this.f12189e).k(4);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1622k0
    public final void b(Object obj) {
        if (!r(obj)) {
            return;
        }
        if (obj instanceof E) {
            E e4 = (E) obj;
            e4.h();
            e4.zza = 0;
            e4.f();
        }
        int i4 = 0;
        while (true) {
            int[] iArr = this.f12187a;
            if (i4 >= iArr.length) {
                this.f12194j.getClass();
                C1628n0 c1628n0 = ((E) obj).zzc;
                if (c1628n0.f12236e) {
                    c1628n0.f12236e = false;
                    return;
                }
                return;
            }
            int y = y(i4);
            int i5 = 1048575 & y;
            int x4 = x(y);
            long j4 = i5;
            if (x4 != 9) {
                if (x4 != 60 && x4 != 68) {
                    switch (x4) {
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
                            this.f12193i.a(j4, obj);
                            break;
                        case 50:
                            Unsafe unsafe = f12186l;
                            Object object = unsafe.getObject(obj, j4);
                            if (object == null) {
                                break;
                            } else {
                                ((X) object).f12174o = false;
                                unsafe.putObject(obj, j4, object);
                                break;
                            }
                    }
                } else if (s(iArr[i4], i4, obj)) {
                    B(i4).b(f12186l.getObject(obj, j4));
                }
                i4 += 3;
            }
            if (p(i4, obj)) {
                B(i4).b(f12186l.getObject(obj, j4));
            }
            i4 += 3;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1622k0
    public final boolean c(Object obj) {
        int i4;
        int i5;
        int i6;
        int i7 = 0;
        int i8 = 0;
        int i9 = 1048575;
        while (i8 < this.f12191g) {
            int i10 = this.f12190f[i8];
            int[] iArr = this.f12187a;
            int i11 = iArr[i10];
            int y = y(i10);
            int i12 = iArr[i10 + 2];
            int i13 = i12 & 1048575;
            int i14 = 1 << (i12 >>> 20);
            if (i13 != i9) {
                if (i13 != 1048575) {
                    i7 = f12186l.getInt(obj, i13);
                }
                i5 = i10;
                i6 = i7;
                i4 = i13;
            } else {
                int i15 = i7;
                i4 = i9;
                i5 = i10;
                i6 = i15;
            }
            if ((268435456 & y) == 0 || q(obj, i5, i4, i6, i14)) {
                int x4 = x(y);
                if (x4 == 9 || x4 == 17) {
                    if (q(obj, i5, i4, i6, i14) && !B(i5).c(AbstractC1645w0.h(y & 1048575, obj))) {
                    }
                    i8++;
                    i9 = i4;
                    i7 = i6;
                } else {
                    if (x4 != 27) {
                        if (x4 == 60 || x4 == 68) {
                            if (s(i11, i5, obj) && !B(i5).c(AbstractC1645w0.h(y & 1048575, obj))) {
                            }
                        } else if (x4 != 49) {
                            if (x4 == 50 && !((X) AbstractC1645w0.h(y & 1048575, obj)).isEmpty()) {
                                int i16 = i5 / 3;
                                this.f12188b[i16 + i16].getClass();
                                throw new ClassCastException();
                            }
                        }
                        i8++;
                        i9 = i4;
                        i7 = i6;
                    }
                    List list = (List) AbstractC1645w0.h(y & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        InterfaceC1622k0 B4 = B(i5);
                        for (int i17 = 0; i17 < list.size(); i17++) {
                            if (B4.c(list.get(i17))) {
                            }
                        }
                    }
                    i8++;
                    i9 = i4;
                    i7 = i6;
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1622k0
    public final void d(Object obj, Object obj2) {
        Object obj3;
        if (!r(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
        obj2.getClass();
        int i4 = 0;
        while (true) {
            int[] iArr = this.f12187a;
            if (i4 >= iArr.length) {
                AbstractC1624l0.r(this.f12194j, obj, obj2);
                return;
            }
            int y = y(i4);
            int i5 = y & 1048575;
            int x4 = x(y);
            int i6 = iArr[i4];
            long j4 = i5;
            switch (x4) {
                case 0:
                    if (p(i4, obj2)) {
                        AbstractC1643v0 abstractC1643v0 = AbstractC1645w0.c;
                        obj3 = obj;
                        abstractC1643v0.e(obj3, j4, abstractC1643v0.a(j4, obj2));
                        l(i4, obj3);
                        break;
                    }
                    break;
                case 1:
                    if (p(i4, obj2)) {
                        AbstractC1643v0 abstractC1643v02 = AbstractC1645w0.c;
                        abstractC1643v02.f(obj, j4, abstractC1643v02.b(j4, obj2));
                        l(i4, obj);
                        break;
                    }
                    break;
                case 2:
                    if (p(i4, obj2)) {
                        AbstractC1645w0.k(obj, j4, AbstractC1645w0.f(j4, obj2));
                        l(i4, obj);
                        break;
                    }
                    break;
                case 3:
                    if (p(i4, obj2)) {
                        AbstractC1645w0.k(obj, j4, AbstractC1645w0.f(j4, obj2));
                        l(i4, obj);
                        break;
                    }
                    break;
                case 4:
                    if (p(i4, obj2)) {
                        AbstractC1645w0.j(j4, obj, AbstractC1645w0.e(j4, obj2));
                        l(i4, obj);
                        break;
                    }
                    break;
                case 5:
                    if (p(i4, obj2)) {
                        AbstractC1645w0.k(obj, j4, AbstractC1645w0.f(j4, obj2));
                        l(i4, obj);
                        break;
                    }
                    break;
                case 6:
                    if (p(i4, obj2)) {
                        AbstractC1645w0.j(j4, obj, AbstractC1645w0.e(j4, obj2));
                        l(i4, obj);
                        break;
                    }
                    break;
                case 7:
                    if (p(i4, obj2)) {
                        AbstractC1643v0 abstractC1643v03 = AbstractC1645w0.c;
                        abstractC1643v03.c(obj, j4, abstractC1643v03.g(j4, obj2));
                        l(i4, obj);
                        break;
                    }
                    break;
                case 8:
                    if (p(i4, obj2)) {
                        AbstractC1645w0.l(j4, obj, AbstractC1645w0.h(j4, obj2));
                        l(i4, obj);
                        break;
                    }
                    break;
                case 9:
                    j(i4, obj, obj2);
                    break;
                case 10:
                    if (p(i4, obj2)) {
                        AbstractC1645w0.l(j4, obj, AbstractC1645w0.h(j4, obj2));
                        l(i4, obj);
                        break;
                    }
                    break;
                case 11:
                    if (p(i4, obj2)) {
                        AbstractC1645w0.j(j4, obj, AbstractC1645w0.e(j4, obj2));
                        l(i4, obj);
                        break;
                    }
                    break;
                case 12:
                    if (p(i4, obj2)) {
                        AbstractC1645w0.j(j4, obj, AbstractC1645w0.e(j4, obj2));
                        l(i4, obj);
                        break;
                    }
                    break;
                case 13:
                    if (p(i4, obj2)) {
                        AbstractC1645w0.j(j4, obj, AbstractC1645w0.e(j4, obj2));
                        l(i4, obj);
                        break;
                    }
                    break;
                case 14:
                    if (p(i4, obj2)) {
                        AbstractC1645w0.k(obj, j4, AbstractC1645w0.f(j4, obj2));
                        l(i4, obj);
                        break;
                    }
                    break;
                case 15:
                    if (p(i4, obj2)) {
                        AbstractC1645w0.j(j4, obj, AbstractC1645w0.e(j4, obj2));
                        l(i4, obj);
                        break;
                    }
                    break;
                case 16:
                    if (p(i4, obj2)) {
                        AbstractC1645w0.k(obj, j4, AbstractC1645w0.f(j4, obj2));
                        l(i4, obj);
                        break;
                    }
                    break;
                case 17:
                    j(i4, obj, obj2);
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
                    this.f12193i.b(j4, obj, obj2);
                    break;
                case 50:
                    Class cls = AbstractC1624l0.f12224a;
                    AbstractC1645w0.l(j4, obj, Y.a(AbstractC1645w0.h(j4, obj), AbstractC1645w0.h(j4, obj2)));
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
                    if (s(i6, i4, obj2)) {
                        AbstractC1645w0.l(j4, obj, AbstractC1645w0.h(j4, obj2));
                        AbstractC1645w0.j(iArr[i4 + 2] & 1048575, obj, i6);
                        break;
                    }
                    break;
                case 60:
                    k(i4, obj, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (s(i6, i4, obj2)) {
                        AbstractC1645w0.l(j4, obj, AbstractC1645w0.h(j4, obj2));
                        AbstractC1645w0.j(iArr[i4 + 2] & 1048575, obj, i6);
                        break;
                    }
                    break;
                case 68:
                    k(i4, obj, obj2);
                    break;
            }
            obj3 = obj;
            i4 += 3;
            obj = obj3;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0015. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01da A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01c7 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.play_billing.InterfaceC1622k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(com.google.android.gms.internal.play_billing.E r8, com.google.android.gms.internal.play_billing.E r9) {
        /*
            Method dump skipped, instructions count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.C1606c0.e(com.google.android.gms.internal.play_billing.E, com.google.android.gms.internal.play_billing.E):boolean");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0040. Please report as an issue. */
    @Override // com.google.android.gms.internal.play_billing.InterfaceC1622k0
    public final void f(Object obj, W w2) {
        int i4;
        C1606c0 c1606c0 = this;
        Unsafe unsafe = f12186l;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        int i8 = 1048575;
        while (true) {
            int[] iArr = c1606c0.f12187a;
            if (i6 >= iArr.length) {
                c1606c0.f12194j.getClass();
                ((E) obj).zzc.d(w2);
                return;
            }
            int y = c1606c0.y(i6);
            int x4 = x(y);
            int i9 = iArr[i6];
            if (x4 <= 17) {
                int i10 = iArr[i6 + 2];
                int i11 = i10 & i5;
                if (i11 != i8) {
                    i7 = i11 == i5 ? 0 : unsafe.getInt(obj, i11);
                    i8 = i11;
                }
                i4 = 1 << (i10 >>> 20);
            } else {
                i4 = 0;
            }
            long j4 = y & i5;
            switch (x4) {
                case 0:
                    if (c1606c0.q(obj, i6, i8, i7, i4)) {
                        ((C1640u) w2.f12171a).a0(i9, Double.doubleToRawLongBits(AbstractC1645w0.c.a(j4, obj)));
                    }
                    i6 += 3;
                    i5 = 1048575;
                case 1:
                    if (c1606c0.q(obj, i6, i8, i7, i4)) {
                        ((C1640u) w2.f12171a).Y(i9, Float.floatToRawIntBits(AbstractC1645w0.c.b(j4, obj)));
                    }
                    c1606c0 = this;
                    i6 += 3;
                    i5 = 1048575;
                case 2:
                    if (c1606c0.q(obj, i6, i8, i7, i4)) {
                        ((C1640u) w2.f12171a).i0(i9, unsafe.getLong(obj, j4));
                    }
                    c1606c0 = this;
                    i6 += 3;
                    i5 = 1048575;
                case 3:
                    if (c1606c0.q(obj, i6, i8, i7, i4)) {
                        ((C1640u) w2.f12171a).i0(i9, unsafe.getLong(obj, j4));
                    }
                    c1606c0 = this;
                    i6 += 3;
                    i5 = 1048575;
                case 4:
                    if (c1606c0.q(obj, i6, i8, i7, i4)) {
                        ((C1640u) w2.f12171a).c0(i9, unsafe.getInt(obj, j4));
                    }
                    c1606c0 = this;
                    i6 += 3;
                    i5 = 1048575;
                case 5:
                    if (c1606c0.q(obj, i6, i8, i7, i4)) {
                        ((C1640u) w2.f12171a).a0(i9, unsafe.getLong(obj, j4));
                    }
                    c1606c0 = this;
                    i6 += 3;
                    i5 = 1048575;
                case 6:
                    if (c1606c0.q(obj, i6, i8, i7, i4)) {
                        ((C1640u) w2.f12171a).Y(i9, unsafe.getInt(obj, j4));
                    }
                    c1606c0 = this;
                    i6 += 3;
                    i5 = 1048575;
                case 7:
                    if (c1606c0.q(obj, i6, i8, i7, i4)) {
                        boolean g4 = AbstractC1645w0.c.g(j4, obj);
                        C1640u c1640u = (C1640u) w2.f12171a;
                        c1640u.h0(i9 << 3);
                        c1640u.V(g4 ? (byte) 1 : (byte) 0);
                    }
                    c1606c0 = this;
                    i6 += 3;
                    i5 = 1048575;
                case 8:
                    if (c1606c0.q(obj, i6, i8, i7, i4)) {
                        Object object = unsafe.getObject(obj, j4);
                        if (object instanceof String) {
                            ((C1640u) w2.f12171a).e0((String) object, i9);
                        } else {
                            ((C1640u) w2.f12171a).X(i9, (C1638t) object);
                        }
                    }
                    c1606c0 = this;
                    i6 += 3;
                    i5 = 1048575;
                case 9:
                    if (c1606c0.q(obj, i6, i8, i7, i4)) {
                        w2.b(i9, unsafe.getObject(obj, j4), c1606c0.B(i6));
                    }
                    i6 += 3;
                    i5 = 1048575;
                case 10:
                    if (c1606c0.q(obj, i6, i8, i7, i4)) {
                        ((C1640u) w2.f12171a).X(i9, (C1638t) unsafe.getObject(obj, j4));
                    }
                    c1606c0 = this;
                    i6 += 3;
                    i5 = 1048575;
                case 11:
                    if (c1606c0.q(obj, i6, i8, i7, i4)) {
                        ((C1640u) w2.f12171a).g0(i9, unsafe.getInt(obj, j4));
                    }
                    c1606c0 = this;
                    i6 += 3;
                    i5 = 1048575;
                case 12:
                    if (c1606c0.q(obj, i6, i8, i7, i4)) {
                        ((C1640u) w2.f12171a).c0(i9, unsafe.getInt(obj, j4));
                    }
                    c1606c0 = this;
                    i6 += 3;
                    i5 = 1048575;
                case 13:
                    if (c1606c0.q(obj, i6, i8, i7, i4)) {
                        ((C1640u) w2.f12171a).Y(i9, unsafe.getInt(obj, j4));
                    }
                    c1606c0 = this;
                    i6 += 3;
                    i5 = 1048575;
                case 14:
                    if (c1606c0.q(obj, i6, i8, i7, i4)) {
                        ((C1640u) w2.f12171a).a0(i9, unsafe.getLong(obj, j4));
                    }
                    c1606c0 = this;
                    i6 += 3;
                    i5 = 1048575;
                case 15:
                    if (c1606c0.q(obj, i6, i8, i7, i4)) {
                        int i12 = unsafe.getInt(obj, j4);
                        ((C1640u) w2.f12171a).g0(i9, (i12 >> 31) ^ (i12 + i12));
                    }
                    c1606c0 = this;
                    i6 += 3;
                    i5 = 1048575;
                case 16:
                    if (c1606c0.q(obj, i6, i8, i7, i4)) {
                        long j5 = unsafe.getLong(obj, j4);
                        ((C1640u) w2.f12171a).i0(i9, (j5 >> 63) ^ (j5 + j5));
                    }
                    c1606c0 = this;
                    i6 += 3;
                    i5 = 1048575;
                case 17:
                    if (c1606c0.q(obj, i6, i8, i7, i4)) {
                        w2.a(i9, unsafe.getObject(obj, j4), c1606c0.B(i6));
                    }
                    i6 += 3;
                    i5 = 1048575;
                case 18:
                    AbstractC1624l0.t(iArr[i6], (List) unsafe.getObject(obj, j4), w2, false);
                    i6 += 3;
                    i5 = 1048575;
                case 19:
                    AbstractC1624l0.x(iArr[i6], (List) unsafe.getObject(obj, j4), w2, false);
                    i6 += 3;
                    i5 = 1048575;
                case 20:
                    AbstractC1624l0.z(iArr[i6], (List) unsafe.getObject(obj, j4), w2, false);
                    i6 += 3;
                    i5 = 1048575;
                case 21:
                    AbstractC1624l0.f(iArr[i6], (List) unsafe.getObject(obj, j4), w2, false);
                    i6 += 3;
                    i5 = 1048575;
                case 22:
                    AbstractC1624l0.y(iArr[i6], (List) unsafe.getObject(obj, j4), w2, false);
                    i6 += 3;
                    i5 = 1048575;
                case 23:
                    AbstractC1624l0.w(iArr[i6], (List) unsafe.getObject(obj, j4), w2, false);
                    i6 += 3;
                    i5 = 1048575;
                case 24:
                    AbstractC1624l0.v(iArr[i6], (List) unsafe.getObject(obj, j4), w2, false);
                    i6 += 3;
                    i5 = 1048575;
                case 25:
                    AbstractC1624l0.s(iArr[i6], (List) unsafe.getObject(obj, j4), w2, false);
                    i6 += 3;
                    i5 = 1048575;
                case 26:
                    int i13 = iArr[i6];
                    List list = (List) unsafe.getObject(obj, j4);
                    Class cls = AbstractC1624l0.f12224a;
                    if (list != null && !list.isEmpty()) {
                        C1640u c1640u2 = (C1640u) w2.f12171a;
                        if (list instanceof P) {
                            P p3 = (P) list;
                            for (int i14 = 0; i14 < list.size(); i14++) {
                                Object d = p3.d(i14);
                                if (d instanceof String) {
                                    c1640u2.e0((String) d, i13);
                                } else {
                                    c1640u2.X(i13, (C1638t) d);
                                }
                            }
                        } else {
                            for (int i15 = 0; i15 < list.size(); i15++) {
                                c1640u2.e0((String) list.get(i15), i13);
                            }
                        }
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 27:
                    int i16 = iArr[i6];
                    List list2 = (List) unsafe.getObject(obj, j4);
                    InterfaceC1622k0 B4 = c1606c0.B(i6);
                    Class cls2 = AbstractC1624l0.f12224a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i17 = 0; i17 < list2.size(); i17++) {
                            w2.b(i16, list2.get(i17), B4);
                        }
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 28:
                    int i18 = iArr[i6];
                    List list3 = (List) unsafe.getObject(obj, j4);
                    Class cls3 = AbstractC1624l0.f12224a;
                    if (list3 != null && !list3.isEmpty()) {
                        w2.getClass();
                        for (int i19 = 0; i19 < list3.size(); i19++) {
                            ((C1640u) w2.f12171a).X(i18, (C1638t) list3.get(i19));
                        }
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 29:
                    AbstractC1624l0.e(iArr[i6], (List) unsafe.getObject(obj, j4), w2, false);
                    i6 += 3;
                    i5 = 1048575;
                case 30:
                    AbstractC1624l0.u(iArr[i6], (List) unsafe.getObject(obj, j4), w2, false);
                    i6 += 3;
                    i5 = 1048575;
                case 31:
                    AbstractC1624l0.a(iArr[i6], (List) unsafe.getObject(obj, j4), w2, false);
                    i6 += 3;
                    i5 = 1048575;
                case 32:
                    AbstractC1624l0.b(iArr[i6], (List) unsafe.getObject(obj, j4), w2, false);
                    i6 += 3;
                    i5 = 1048575;
                case 33:
                    AbstractC1624l0.c(iArr[i6], (List) unsafe.getObject(obj, j4), w2, false);
                    i6 += 3;
                    i5 = 1048575;
                case 34:
                    AbstractC1624l0.d(iArr[i6], (List) unsafe.getObject(obj, j4), w2, false);
                    i6 += 3;
                    i5 = 1048575;
                case 35:
                    AbstractC1624l0.t(iArr[i6], (List) unsafe.getObject(obj, j4), w2, true);
                    i6 += 3;
                    i5 = 1048575;
                case 36:
                    AbstractC1624l0.x(iArr[i6], (List) unsafe.getObject(obj, j4), w2, true);
                    i6 += 3;
                    i5 = 1048575;
                case 37:
                    AbstractC1624l0.z(iArr[i6], (List) unsafe.getObject(obj, j4), w2, true);
                    i6 += 3;
                    i5 = 1048575;
                case 38:
                    AbstractC1624l0.f(iArr[i6], (List) unsafe.getObject(obj, j4), w2, true);
                    i6 += 3;
                    i5 = 1048575;
                case 39:
                    AbstractC1624l0.y(iArr[i6], (List) unsafe.getObject(obj, j4), w2, true);
                    i6 += 3;
                    i5 = 1048575;
                case 40:
                    AbstractC1624l0.w(iArr[i6], (List) unsafe.getObject(obj, j4), w2, true);
                    i6 += 3;
                    i5 = 1048575;
                case 41:
                    AbstractC1624l0.v(iArr[i6], (List) unsafe.getObject(obj, j4), w2, true);
                    i6 += 3;
                    i5 = 1048575;
                case 42:
                    AbstractC1624l0.s(iArr[i6], (List) unsafe.getObject(obj, j4), w2, true);
                    i6 += 3;
                    i5 = 1048575;
                case 43:
                    AbstractC1624l0.e(iArr[i6], (List) unsafe.getObject(obj, j4), w2, true);
                    i6 += 3;
                    i5 = 1048575;
                case 44:
                    AbstractC1624l0.u(iArr[i6], (List) unsafe.getObject(obj, j4), w2, true);
                    i6 += 3;
                    i5 = 1048575;
                case 45:
                    AbstractC1624l0.a(iArr[i6], (List) unsafe.getObject(obj, j4), w2, true);
                    i6 += 3;
                    i5 = 1048575;
                case 46:
                    AbstractC1624l0.b(iArr[i6], (List) unsafe.getObject(obj, j4), w2, true);
                    i6 += 3;
                    i5 = 1048575;
                case 47:
                    AbstractC1624l0.c(iArr[i6], (List) unsafe.getObject(obj, j4), w2, true);
                    i6 += 3;
                    i5 = 1048575;
                case 48:
                    AbstractC1624l0.d(iArr[i6], (List) unsafe.getObject(obj, j4), w2, true);
                    i6 += 3;
                    i5 = 1048575;
                case 49:
                    int i20 = iArr[i6];
                    List list4 = (List) unsafe.getObject(obj, j4);
                    InterfaceC1622k0 B5 = c1606c0.B(i6);
                    Class cls4 = AbstractC1624l0.f12224a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i21 = 0; i21 < list4.size(); i21++) {
                            w2.a(i20, list4.get(i21), B5);
                        }
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 50:
                    if (unsafe.getObject(obj, j4) != null) {
                        int i22 = i6 / 3;
                        c1606c0.f12188b[i22 + i22].getClass();
                        throw new ClassCastException();
                    }
                    i6 += 3;
                    i5 = 1048575;
                case 51:
                    if (c1606c0.s(i9, i6, obj)) {
                        ((C1640u) w2.f12171a).a0(i9, Double.doubleToRawLongBits(((Double) AbstractC1645w0.h(j4, obj)).doubleValue()));
                    }
                    i6 += 3;
                    i5 = 1048575;
                case 52:
                    if (c1606c0.s(i9, i6, obj)) {
                        ((C1640u) w2.f12171a).Y(i9, Float.floatToRawIntBits(((Float) AbstractC1645w0.h(j4, obj)).floatValue()));
                    }
                    i6 += 3;
                    i5 = 1048575;
                case 53:
                    if (c1606c0.s(i9, i6, obj)) {
                        ((C1640u) w2.f12171a).i0(i9, z(j4, obj));
                    }
                    i6 += 3;
                    i5 = 1048575;
                case 54:
                    if (c1606c0.s(i9, i6, obj)) {
                        ((C1640u) w2.f12171a).i0(i9, z(j4, obj));
                    }
                    i6 += 3;
                    i5 = 1048575;
                case 55:
                    if (c1606c0.s(i9, i6, obj)) {
                        ((C1640u) w2.f12171a).c0(i9, v(j4, obj));
                    }
                    i6 += 3;
                    i5 = 1048575;
                case 56:
                    if (c1606c0.s(i9, i6, obj)) {
                        ((C1640u) w2.f12171a).a0(i9, z(j4, obj));
                    }
                    i6 += 3;
                    i5 = 1048575;
                case 57:
                    if (c1606c0.s(i9, i6, obj)) {
                        ((C1640u) w2.f12171a).Y(i9, v(j4, obj));
                    }
                    i6 += 3;
                    i5 = 1048575;
                case 58:
                    if (c1606c0.s(i9, i6, obj)) {
                        boolean booleanValue = ((Boolean) AbstractC1645w0.h(j4, obj)).booleanValue();
                        C1640u c1640u3 = (C1640u) w2.f12171a;
                        c1640u3.h0(i9 << 3);
                        c1640u3.V(booleanValue ? (byte) 1 : (byte) 0);
                    }
                    i6 += 3;
                    i5 = 1048575;
                case 59:
                    if (c1606c0.s(i9, i6, obj)) {
                        Object object2 = unsafe.getObject(obj, j4);
                        if (object2 instanceof String) {
                            ((C1640u) w2.f12171a).e0((String) object2, i9);
                        } else {
                            ((C1640u) w2.f12171a).X(i9, (C1638t) object2);
                        }
                    }
                    i6 += 3;
                    i5 = 1048575;
                case 60:
                    if (c1606c0.s(i9, i6, obj)) {
                        w2.b(i9, unsafe.getObject(obj, j4), c1606c0.B(i6));
                    }
                    i6 += 3;
                    i5 = 1048575;
                case 61:
                    if (c1606c0.s(i9, i6, obj)) {
                        ((C1640u) w2.f12171a).X(i9, (C1638t) unsafe.getObject(obj, j4));
                    }
                    i6 += 3;
                    i5 = 1048575;
                case 62:
                    if (c1606c0.s(i9, i6, obj)) {
                        ((C1640u) w2.f12171a).g0(i9, v(j4, obj));
                    }
                    i6 += 3;
                    i5 = 1048575;
                case 63:
                    if (c1606c0.s(i9, i6, obj)) {
                        ((C1640u) w2.f12171a).c0(i9, v(j4, obj));
                    }
                    i6 += 3;
                    i5 = 1048575;
                case 64:
                    if (c1606c0.s(i9, i6, obj)) {
                        ((C1640u) w2.f12171a).Y(i9, v(j4, obj));
                    }
                    i6 += 3;
                    i5 = 1048575;
                case 65:
                    if (c1606c0.s(i9, i6, obj)) {
                        ((C1640u) w2.f12171a).a0(i9, z(j4, obj));
                    }
                    i6 += 3;
                    i5 = 1048575;
                case 66:
                    if (c1606c0.s(i9, i6, obj)) {
                        int v4 = v(j4, obj);
                        ((C1640u) w2.f12171a).g0(i9, (v4 >> 31) ^ (v4 + v4));
                    }
                    i6 += 3;
                    i5 = 1048575;
                case 67:
                    if (c1606c0.s(i9, i6, obj)) {
                        long z4 = z(j4, obj);
                        ((C1640u) w2.f12171a).i0(i9, (z4 >> 63) ^ (z4 + z4));
                    }
                    i6 += 3;
                    i5 = 1048575;
                case 68:
                    if (c1606c0.s(i9, i6, obj)) {
                        w2.a(i9, unsafe.getObject(obj, j4), c1606c0.B(i6));
                    }
                    i6 += 3;
                    i5 = 1048575;
                default:
                    i6 += 3;
                    i5 = 1048575;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC1622k0
    public final void g(Object obj, byte[] bArr, int i4, int i5, C0544dz c0544dz) {
        t(obj, bArr, i4, i5, 0, c0544dz);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x004c. Please report as an issue. */
    @Override // com.google.android.gms.internal.play_billing.InterfaceC1622k0
    public final int h(AbstractC1627n abstractC1627n) {
        int i4;
        int l02;
        int m02;
        int i5;
        int a4;
        int j4;
        int l03;
        int size;
        int p3;
        int l04;
        int l05;
        int l06;
        int i6;
        int l07;
        int m03;
        C1606c0 c1606c0 = this;
        AbstractC1627n abstractC1627n2 = abstractC1627n;
        Unsafe unsafe = f12186l;
        int i7 = 1048575;
        int i8 = 1048575;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int[] iArr = c1606c0.f12187a;
            if (i9 >= iArr.length) {
                c1606c0.f12194j.getClass();
                return ((E) abstractC1627n).zzc.a() + i11;
            }
            int y = c1606c0.y(i9);
            int x4 = x(y);
            int i12 = iArr[i9];
            int i13 = iArr[i9 + 2];
            int i14 = i13 & i7;
            if (x4 <= 17) {
                if (i14 != i8) {
                    i10 = i14 == i7 ? 0 : unsafe.getInt(abstractC1627n2, i14);
                    i8 = i14;
                }
                i4 = 1 << (i13 >>> 20);
            } else {
                i4 = 0;
            }
            int i15 = y & i7;
            if (x4 >= EnumC1648z.f12262p.f12266o) {
                EnumC1648z.f12263q.getClass();
            }
            long j5 = i15;
            switch (x4) {
                case 0:
                    if (c1606c0.q(abstractC1627n2, i9, i8, i10, i4)) {
                        i11 = U.a.v(i12 << 3, 8, i11);
                    }
                    i9 += 3;
                    abstractC1627n2 = abstractC1627n;
                    i7 = 1048575;
                case 1:
                    if (c1606c0.q(abstractC1627n2, i9, i8, i10, i4)) {
                        i11 = U.a.v(i12 << 3, 4, i11);
                    }
                    c1606c0 = this;
                    i9 += 3;
                    abstractC1627n2 = abstractC1627n;
                    i7 = 1048575;
                case 2:
                    if (c1606c0.q(abstractC1627n2, i9, i8, i10, i4)) {
                        long j6 = unsafe.getLong(abstractC1627n2, j5);
                        l02 = C1640u.l0(i12 << 3);
                        m02 = C1640u.m0(j6);
                        i11 += m02 + l02;
                    }
                    c1606c0 = this;
                    i9 += 3;
                    abstractC1627n2 = abstractC1627n;
                    i7 = 1048575;
                case 3:
                    if (c1606c0.q(abstractC1627n2, i9, i8, i10, i4)) {
                        long j7 = unsafe.getLong(abstractC1627n2, j5);
                        l02 = C1640u.l0(i12 << 3);
                        m02 = C1640u.m0(j7);
                        i11 += m02 + l02;
                    }
                    c1606c0 = this;
                    i9 += 3;
                    abstractC1627n2 = abstractC1627n;
                    i7 = 1048575;
                case 4:
                    if (c1606c0.q(abstractC1627n2, i9, i8, i10, i4)) {
                        long j8 = unsafe.getInt(abstractC1627n2, j5);
                        l02 = C1640u.l0(i12 << 3);
                        m02 = C1640u.m0(j8);
                        i11 += m02 + l02;
                    }
                    c1606c0 = this;
                    i9 += 3;
                    abstractC1627n2 = abstractC1627n;
                    i7 = 1048575;
                case 5:
                    if (c1606c0.q(abstractC1627n2, i9, i8, i10, i4)) {
                        i11 = U.a.v(i12 << 3, 8, i11);
                    }
                    c1606c0 = this;
                    i9 += 3;
                    abstractC1627n2 = abstractC1627n;
                    i7 = 1048575;
                case 6:
                    if (c1606c0.q(abstractC1627n2, i9, i8, i10, i4)) {
                        i11 = U.a.v(i12 << 3, 4, i11);
                    }
                    c1606c0 = this;
                    i9 += 3;
                    abstractC1627n2 = abstractC1627n;
                    i7 = 1048575;
                case 7:
                    if (c1606c0.q(abstractC1627n2, i9, i8, i10, i4)) {
                        i11 = U.a.v(i12 << 3, 1, i11);
                    }
                    c1606c0 = this;
                    i9 += 3;
                    abstractC1627n2 = abstractC1627n;
                    i7 = 1048575;
                case 8:
                    if (c1606c0.q(abstractC1627n2, i9, i8, i10, i4)) {
                        int i16 = i12 << 3;
                        Object object = unsafe.getObject(abstractC1627n2, j5);
                        if (object instanceof C1638t) {
                            int l08 = C1640u.l0(i16);
                            int j9 = ((C1638t) object).j();
                            i11 = U.a.s(j9, j9, l08, i11);
                        } else {
                            l02 = C1640u.l0(i16);
                            m02 = C1640u.k0((String) object);
                            i11 += m02 + l02;
                        }
                    }
                    c1606c0 = this;
                    i9 += 3;
                    abstractC1627n2 = abstractC1627n;
                    i7 = 1048575;
                case 9:
                    if (c1606c0.q(abstractC1627n2, i9, i8, i10, i4)) {
                        Object object2 = unsafe.getObject(abstractC1627n2, j5);
                        InterfaceC1622k0 B4 = c1606c0.B(i9);
                        Class cls = AbstractC1624l0.f12224a;
                        int l09 = C1640u.l0(i12 << 3);
                        int a5 = ((AbstractC1627n) object2).a(B4);
                        i11 = U.a.s(a5, a5, l09, i11);
                    }
                    i9 += 3;
                    abstractC1627n2 = abstractC1627n;
                    i7 = 1048575;
                case 10:
                    if (c1606c0.q(abstractC1627n2, i9, i8, i10, i4)) {
                        C1638t c1638t = (C1638t) unsafe.getObject(abstractC1627n2, j5);
                        int l010 = C1640u.l0(i12 << 3);
                        int j10 = c1638t.j();
                        i11 = U.a.s(j10, j10, l010, i11);
                    }
                    c1606c0 = this;
                    i9 += 3;
                    abstractC1627n2 = abstractC1627n;
                    i7 = 1048575;
                case 11:
                    if (c1606c0.q(abstractC1627n2, i9, i8, i10, i4)) {
                        i11 = U.a.v(unsafe.getInt(abstractC1627n2, j5), C1640u.l0(i12 << 3), i11);
                    }
                    c1606c0 = this;
                    i9 += 3;
                    abstractC1627n2 = abstractC1627n;
                    i7 = 1048575;
                case 12:
                    if (c1606c0.q(abstractC1627n2, i9, i8, i10, i4)) {
                        long j11 = unsafe.getInt(abstractC1627n2, j5);
                        l02 = C1640u.l0(i12 << 3);
                        m02 = C1640u.m0(j11);
                        i11 += m02 + l02;
                    }
                    c1606c0 = this;
                    i9 += 3;
                    abstractC1627n2 = abstractC1627n;
                    i7 = 1048575;
                case 13:
                    if (c1606c0.q(abstractC1627n2, i9, i8, i10, i4)) {
                        i11 = U.a.v(i12 << 3, 4, i11);
                    }
                    c1606c0 = this;
                    i9 += 3;
                    abstractC1627n2 = abstractC1627n;
                    i7 = 1048575;
                case 14:
                    if (c1606c0.q(abstractC1627n2, i9, i8, i10, i4)) {
                        i11 = U.a.v(i12 << 3, 8, i11);
                    }
                    c1606c0 = this;
                    i9 += 3;
                    abstractC1627n2 = abstractC1627n;
                    i7 = 1048575;
                case 15:
                    if (c1606c0.q(abstractC1627n2, i9, i8, i10, i4)) {
                        int i17 = unsafe.getInt(abstractC1627n2, j5);
                        i11 = U.a.v((i17 >> 31) ^ (i17 + i17), C1640u.l0(i12 << 3), i11);
                    }
                    c1606c0 = this;
                    i9 += 3;
                    abstractC1627n2 = abstractC1627n;
                    i7 = 1048575;
                case 16:
                    if (c1606c0.q(abstractC1627n2, i9, i8, i10, i4)) {
                        long j12 = unsafe.getLong(abstractC1627n2, j5);
                        l02 = C1640u.l0(i12 << 3);
                        m02 = C1640u.m0((j12 >> 63) ^ (j12 + j12));
                        i11 += m02 + l02;
                    }
                    c1606c0 = this;
                    i9 += 3;
                    abstractC1627n2 = abstractC1627n;
                    i7 = 1048575;
                case 17:
                    if (c1606c0.q(abstractC1627n2, i9, i8, i10, i4)) {
                        AbstractC1627n abstractC1627n3 = (AbstractC1627n) unsafe.getObject(abstractC1627n2, j5);
                        InterfaceC1622k0 B5 = c1606c0.B(i9);
                        int l011 = C1640u.l0(i12 << 3);
                        i5 = l011 + l011;
                        a4 = abstractC1627n3.a(B5);
                        j4 = a4 + i5;
                        i11 += j4;
                        i9 += 3;
                        abstractC1627n2 = abstractC1627n;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        abstractC1627n2 = abstractC1627n;
                        i7 = 1048575;
                    }
                case 18:
                    j4 = AbstractC1624l0.j(i12, (List) unsafe.getObject(abstractC1627n2, j5));
                    i11 += j4;
                    i9 += 3;
                    abstractC1627n2 = abstractC1627n;
                    i7 = 1048575;
                case 19:
                    j4 = AbstractC1624l0.i(i12, (List) unsafe.getObject(abstractC1627n2, j5));
                    i11 += j4;
                    i9 += 3;
                    abstractC1627n2 = abstractC1627n;
                    i7 = 1048575;
                case 20:
                    List list = (List) unsafe.getObject(abstractC1627n2, j5);
                    Class cls2 = AbstractC1624l0.f12224a;
                    if (list.size() != 0) {
                        l03 = (C1640u.l0(i12 << 3) * list.size()) + AbstractC1624l0.l(list);
                        i11 += l03;
                        i9 += 3;
                        abstractC1627n2 = abstractC1627n;
                        i7 = 1048575;
                    }
                    l03 = 0;
                    i11 += l03;
                    i9 += 3;
                    abstractC1627n2 = abstractC1627n;
                    i7 = 1048575;
                case 21:
                    List list2 = (List) unsafe.getObject(abstractC1627n2, j5);
                    Class cls3 = AbstractC1624l0.f12224a;
                    size = list2.size();
                    if (size != 0) {
                        p3 = AbstractC1624l0.p(list2);
                        l04 = C1640u.l0(i12 << 3);
                        l05 = (l04 * size) + p3;
                        i11 += l05;
                        i9 += 3;
                        abstractC1627n2 = abstractC1627n;
                        i7 = 1048575;
                    }
                    l05 = 0;
                    i11 += l05;
                    i9 += 3;
                    abstractC1627n2 = abstractC1627n;
                    i7 = 1048575;
                case 22:
                    List list3 = (List) unsafe.getObject(abstractC1627n2, j5);
                    Class cls4 = AbstractC1624l0.f12224a;
                    size = list3.size();
                    if (size != 0) {
                        p3 = AbstractC1624l0.k(list3);
                        l04 = C1640u.l0(i12 << 3);
                        l05 = (l04 * size) + p3;
                        i11 += l05;
                        i9 += 3;
                        abstractC1627n2 = abstractC1627n;
                        i7 = 1048575;
                    }
                    l05 = 0;
                    i11 += l05;
                    i9 += 3;
                    abstractC1627n2 = abstractC1627n;
                    i7 = 1048575;
                case 23:
                    j4 = AbstractC1624l0.j(i12, (List) unsafe.getObject(abstractC1627n2, j5));
                    i11 += j4;
                    i9 += 3;
                    abstractC1627n2 = abstractC1627n;
                    i7 = 1048575;
                case 24:
                    j4 = AbstractC1624l0.i(i12, (List) unsafe.getObject(abstractC1627n2, j5));
                    i11 += j4;
                    i9 += 3;
                    abstractC1627n2 = abstractC1627n;
                    i7 = 1048575;
                case 25:
                    List list4 = (List) unsafe.getObject(abstractC1627n2, j5);
                    Class cls5 = AbstractC1624l0.f12224a;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        l03 = (C1640u.l0(i12 << 3) + 1) * size2;
                        i11 += l03;
                        i9 += 3;
                        abstractC1627n2 = abstractC1627n;
                        i7 = 1048575;
                    }
                    l03 = 0;
                    i11 += l03;
                    i9 += 3;
                    abstractC1627n2 = abstractC1627n;
                    i7 = 1048575;
                case 26:
                    List list5 = (List) unsafe.getObject(abstractC1627n2, j5);
                    Class cls6 = AbstractC1624l0.f12224a;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        l05 = C1640u.l0(i12 << 3) * size3;
                        if (list5 instanceof P) {
                            P p4 = (P) list5;
                            for (int i18 = 0; i18 < size3; i18++) {
                                Object d = p4.d(i18);
                                if (d instanceof C1638t) {
                                    int j13 = ((C1638t) d).j();
                                    l05 = U.a.v(j13, j13, l05);
                                } else {
                                    l05 = C1640u.k0((String) d) + l05;
                                }
                            }
                        } else {
                            for (int i19 = 0; i19 < size3; i19++) {
                                Object obj = list5.get(i19);
                                if (obj instanceof C1638t) {
                                    int j14 = ((C1638t) obj).j();
                                    l05 = U.a.v(j14, j14, l05);
                                } else {
                                    l05 = C1640u.k0((String) obj) + l05;
                                }
                            }
                        }
                        i11 += l05;
                        i9 += 3;
                        abstractC1627n2 = abstractC1627n;
                        i7 = 1048575;
                    }
                    l05 = 0;
                    i11 += l05;
                    i9 += 3;
                    abstractC1627n2 = abstractC1627n;
                    i7 = 1048575;
                case 27:
                    List list6 = (List) unsafe.getObject(abstractC1627n2, j5);
                    InterfaceC1622k0 B6 = c1606c0.B(i9);
                    Class cls7 = AbstractC1624l0.f12224a;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        l06 = 0;
                    } else {
                        l06 = C1640u.l0(i12 << 3) * size4;
                        for (int i20 = 0; i20 < size4; i20++) {
                            int a6 = ((AbstractC1627n) list6.get(i20)).a(B6);
                            l06 = U.a.v(a6, a6, l06);
                        }
                    }
                    i11 += l06;
                    i9 += 3;
                    abstractC1627n2 = abstractC1627n;
                    i7 = 1048575;
                case 28:
                    List list7 = (List) unsafe.getObject(abstractC1627n2, j5);
                    Class cls8 = AbstractC1624l0.f12224a;
                    int size5 = list7.size();
                    if (size5 != 0) {
                        l05 = C1640u.l0(i12 << 3) * size5;
                        for (int i21 = 0; i21 < list7.size(); i21++) {
                            int j15 = ((C1638t) list7.get(i21)).j();
                            l05 = U.a.v(j15, j15, l05);
                        }
                        i11 += l05;
                        i9 += 3;
                        abstractC1627n2 = abstractC1627n;
                        i7 = 1048575;
                    }
                    l05 = 0;
                    i11 += l05;
                    i9 += 3;
                    abstractC1627n2 = abstractC1627n;
                    i7 = 1048575;
                case 29:
                    List list8 = (List) unsafe.getObject(abstractC1627n2, j5);
                    Class cls9 = AbstractC1624l0.f12224a;
                    size = list8.size();
                    if (size != 0) {
                        p3 = AbstractC1624l0.o(list8);
                        l04 = C1640u.l0(i12 << 3);
                        l05 = (l04 * size) + p3;
                        i11 += l05;
                        i9 += 3;
                        abstractC1627n2 = abstractC1627n;
                        i7 = 1048575;
                    }
                    l05 = 0;
                    i11 += l05;
                    i9 += 3;
                    abstractC1627n2 = abstractC1627n;
                    i7 = 1048575;
                case 30:
                    List list9 = (List) unsafe.getObject(abstractC1627n2, j5);
                    Class cls10 = AbstractC1624l0.f12224a;
                    size = list9.size();
                    if (size != 0) {
                        p3 = AbstractC1624l0.h(list9);
                        l04 = C1640u.l0(i12 << 3);
                        l05 = (l04 * size) + p3;
                        i11 += l05;
                        i9 += 3;
                        abstractC1627n2 = abstractC1627n;
                        i7 = 1048575;
                    }
                    l05 = 0;
                    i11 += l05;
                    i9 += 3;
                    abstractC1627n2 = abstractC1627n;
                    i7 = 1048575;
                case 31:
                    j4 = AbstractC1624l0.i(i12, (List) unsafe.getObject(abstractC1627n2, j5));
                    i11 += j4;
                    i9 += 3;
                    abstractC1627n2 = abstractC1627n;
                    i7 = 1048575;
                case 32:
                    j4 = AbstractC1624l0.j(i12, (List) unsafe.getObject(abstractC1627n2, j5));
                    i11 += j4;
                    i9 += 3;
                    abstractC1627n2 = abstractC1627n;
                    i7 = 1048575;
                case 33:
                    List list10 = (List) unsafe.getObject(abstractC1627n2, j5);
                    Class cls11 = AbstractC1624l0.f12224a;
                    size = list10.size();
                    if (size != 0) {
                        p3 = AbstractC1624l0.m(list10);
                        l04 = C1640u.l0(i12 << 3);
                        l05 = (l04 * size) + p3;
                        i11 += l05;
                        i9 += 3;
                        abstractC1627n2 = abstractC1627n;
                        i7 = 1048575;
                    }
                    l05 = 0;
                    i11 += l05;
                    i9 += 3;
                    abstractC1627n2 = abstractC1627n;
                    i7 = 1048575;
                case 34:
                    List list11 = (List) unsafe.getObject(abstractC1627n2, j5);
                    Class cls12 = AbstractC1624l0.f12224a;
                    size = list11.size();
                    if (size != 0) {
                        p3 = AbstractC1624l0.n(list11);
                        l04 = C1640u.l0(i12 << 3);
                        l05 = (l04 * size) + p3;
                        i11 += l05;
                        i9 += 3;
                        abstractC1627n2 = abstractC1627n;
                        i7 = 1048575;
                    }
                    l05 = 0;
                    i11 += l05;
                    i9 += 3;
                    abstractC1627n2 = abstractC1627n;
                    i7 = 1048575;
                case 35:
                    List list12 = (List) unsafe.getObject(abstractC1627n2, j5);
                    Class cls13 = AbstractC1624l0.f12224a;
                    int size6 = list12.size() * 8;
                    if (size6 > 0) {
                        i11 = U.a.s(size6, C1640u.l0(i12 << 3), size6, i11);
                    }
                    i9 += 3;
                    abstractC1627n2 = abstractC1627n;
                    i7 = 1048575;
                case 36:
                    List list13 = (List) unsafe.getObject(abstractC1627n2, j5);
                    Class cls14 = AbstractC1624l0.f12224a;
                    int size7 = list13.size() * 4;
                    if (size7 > 0) {
                        i11 = U.a.s(size7, C1640u.l0(i12 << 3), size7, i11);
                    }
                    i9 += 3;
                    abstractC1627n2 = abstractC1627n;
                    i7 = 1048575;
                case 37:
                    int l4 = AbstractC1624l0.l((List) unsafe.getObject(abstractC1627n2, j5));
                    if (l4 > 0) {
                        i11 = U.a.s(l4, C1640u.l0(i12 << 3), l4, i11);
                    }
                    i9 += 3;
                    abstractC1627n2 = abstractC1627n;
                    i7 = 1048575;
                case 38:
                    int p5 = AbstractC1624l0.p((List) unsafe.getObject(abstractC1627n2, j5));
                    if (p5 > 0) {
                        i11 = U.a.s(p5, C1640u.l0(i12 << 3), p5, i11);
                    }
                    i9 += 3;
                    abstractC1627n2 = abstractC1627n;
                    i7 = 1048575;
                case 39:
                    int k3 = AbstractC1624l0.k((List) unsafe.getObject(abstractC1627n2, j5));
                    if (k3 > 0) {
                        i11 = U.a.s(k3, C1640u.l0(i12 << 3), k3, i11);
                    }
                    i9 += 3;
                    abstractC1627n2 = abstractC1627n;
                    i7 = 1048575;
                case 40:
                    List list14 = (List) unsafe.getObject(abstractC1627n2, j5);
                    Class cls15 = AbstractC1624l0.f12224a;
                    int size8 = list14.size() * 8;
                    if (size8 > 0) {
                        i11 = U.a.s(size8, C1640u.l0(i12 << 3), size8, i11);
                    }
                    i9 += 3;
                    abstractC1627n2 = abstractC1627n;
                    i7 = 1048575;
                case 41:
                    List list15 = (List) unsafe.getObject(abstractC1627n2, j5);
                    Class cls16 = AbstractC1624l0.f12224a;
                    int size9 = list15.size() * 4;
                    if (size9 > 0) {
                        i11 = U.a.s(size9, C1640u.l0(i12 << 3), size9, i11);
                    }
                    i9 += 3;
                    abstractC1627n2 = abstractC1627n;
                    i7 = 1048575;
                case 42:
                    List list16 = (List) unsafe.getObject(abstractC1627n2, j5);
                    Class cls17 = AbstractC1624l0.f12224a;
                    int size10 = list16.size();
                    if (size10 > 0) {
                        i11 = U.a.s(size10, C1640u.l0(i12 << 3), size10, i11);
                    }
                    i9 += 3;
                    abstractC1627n2 = abstractC1627n;
                    i7 = 1048575;
                case 43:
                    int o4 = AbstractC1624l0.o((List) unsafe.getObject(abstractC1627n2, j5));
                    if (o4 > 0) {
                        i11 = U.a.s(o4, C1640u.l0(i12 << 3), o4, i11);
                    }
                    i9 += 3;
                    abstractC1627n2 = abstractC1627n;
                    i7 = 1048575;
                case 44:
                    int h4 = AbstractC1624l0.h((List) unsafe.getObject(abstractC1627n2, j5));
                    if (h4 > 0) {
                        i11 = U.a.s(h4, C1640u.l0(i12 << 3), h4, i11);
                    }
                    i9 += 3;
                    abstractC1627n2 = abstractC1627n;
                    i7 = 1048575;
                case 45:
                    List list17 = (List) unsafe.getObject(abstractC1627n2, j5);
                    Class cls18 = AbstractC1624l0.f12224a;
                    int size11 = list17.size() * 4;
                    if (size11 > 0) {
                        i11 = U.a.s(size11, C1640u.l0(i12 << 3), size11, i11);
                    }
                    i9 += 3;
                    abstractC1627n2 = abstractC1627n;
                    i7 = 1048575;
                case 46:
                    List list18 = (List) unsafe.getObject(abstractC1627n2, j5);
                    Class cls19 = AbstractC1624l0.f12224a;
                    int size12 = list18.size() * 8;
                    if (size12 > 0) {
                        i11 = U.a.s(size12, C1640u.l0(i12 << 3), size12, i11);
                    }
                    i9 += 3;
                    abstractC1627n2 = abstractC1627n;
                    i7 = 1048575;
                case 47:
                    int m4 = AbstractC1624l0.m((List) unsafe.getObject(abstractC1627n2, j5));
                    if (m4 > 0) {
                        i11 = U.a.s(m4, C1640u.l0(i12 << 3), m4, i11);
                    }
                    i9 += 3;
                    abstractC1627n2 = abstractC1627n;
                    i7 = 1048575;
                case 48:
                    int n4 = AbstractC1624l0.n((List) unsafe.getObject(abstractC1627n2, j5));
                    if (n4 > 0) {
                        i11 = U.a.s(n4, C1640u.l0(i12 << 3), n4, i11);
                    }
                    i9 += 3;
                    abstractC1627n2 = abstractC1627n;
                    i7 = 1048575;
                case 49:
                    List list19 = (List) unsafe.getObject(abstractC1627n2, j5);
                    InterfaceC1622k0 B7 = c1606c0.B(i9);
                    Class cls20 = AbstractC1624l0.f12224a;
                    int size13 = list19.size();
                    if (size13 == 0) {
                        i6 = 0;
                    } else {
                        i6 = 0;
                        for (int i22 = 0; i22 < size13; i22++) {
                            AbstractC1627n abstractC1627n4 = (AbstractC1627n) list19.get(i22);
                            int l012 = C1640u.l0(i12 << 3);
                            i6 += abstractC1627n4.a(B7) + l012 + l012;
                        }
                    }
                    i11 += i6;
                    i9 += 3;
                    abstractC1627n2 = abstractC1627n;
                    i7 = 1048575;
                case 50:
                    Object object3 = unsafe.getObject(abstractC1627n2, j5);
                    int i23 = i9 / 3;
                    X x5 = (X) object3;
                    if (c1606c0.f12188b[i23 + i23] != null) {
                        throw new ClassCastException();
                    }
                    if (x5.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = x5.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i9 += 3;
                    abstractC1627n2 = abstractC1627n;
                    i7 = 1048575;
                case 51:
                    if (c1606c0.s(i12, i9, abstractC1627n2)) {
                        i11 = U.a.v(i12 << 3, 8, i11);
                    }
                    i9 += 3;
                    abstractC1627n2 = abstractC1627n;
                    i7 = 1048575;
                case 52:
                    if (c1606c0.s(i12, i9, abstractC1627n2)) {
                        i11 = U.a.v(i12 << 3, 4, i11);
                    }
                    i9 += 3;
                    abstractC1627n2 = abstractC1627n;
                    i7 = 1048575;
                case 53:
                    if (c1606c0.s(i12, i9, abstractC1627n2)) {
                        long z4 = z(j5, abstractC1627n2);
                        l07 = C1640u.l0(i12 << 3);
                        m03 = C1640u.m0(z4);
                        i11 += m03 + l07;
                        i9 += 3;
                        abstractC1627n2 = abstractC1627n;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        abstractC1627n2 = abstractC1627n;
                        i7 = 1048575;
                    }
                case 54:
                    if (c1606c0.s(i12, i9, abstractC1627n2)) {
                        long z5 = z(j5, abstractC1627n2);
                        l07 = C1640u.l0(i12 << 3);
                        m03 = C1640u.m0(z5);
                        i11 += m03 + l07;
                        i9 += 3;
                        abstractC1627n2 = abstractC1627n;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        abstractC1627n2 = abstractC1627n;
                        i7 = 1048575;
                    }
                case 55:
                    if (c1606c0.s(i12, i9, abstractC1627n2)) {
                        long v4 = v(j5, abstractC1627n2);
                        l07 = C1640u.l0(i12 << 3);
                        m03 = C1640u.m0(v4);
                        i11 += m03 + l07;
                        i9 += 3;
                        abstractC1627n2 = abstractC1627n;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        abstractC1627n2 = abstractC1627n;
                        i7 = 1048575;
                    }
                case 56:
                    if (c1606c0.s(i12, i9, abstractC1627n2)) {
                        i11 = U.a.v(i12 << 3, 8, i11);
                    }
                    i9 += 3;
                    abstractC1627n2 = abstractC1627n;
                    i7 = 1048575;
                case 57:
                    if (c1606c0.s(i12, i9, abstractC1627n2)) {
                        i11 = U.a.v(i12 << 3, 4, i11);
                    }
                    i9 += 3;
                    abstractC1627n2 = abstractC1627n;
                    i7 = 1048575;
                case 58:
                    if (c1606c0.s(i12, i9, abstractC1627n2)) {
                        i11 = U.a.v(i12 << 3, 1, i11);
                    }
                    i9 += 3;
                    abstractC1627n2 = abstractC1627n;
                    i7 = 1048575;
                case 59:
                    if (c1606c0.s(i12, i9, abstractC1627n2)) {
                        int i24 = i12 << 3;
                        Object object4 = unsafe.getObject(abstractC1627n2, j5);
                        if (object4 instanceof C1638t) {
                            int l013 = C1640u.l0(i24);
                            int j16 = ((C1638t) object4).j();
                            i11 = U.a.s(j16, j16, l013, i11);
                        } else {
                            l07 = C1640u.l0(i24);
                            m03 = C1640u.k0((String) object4);
                            i11 += m03 + l07;
                        }
                    }
                    i9 += 3;
                    abstractC1627n2 = abstractC1627n;
                    i7 = 1048575;
                case 60:
                    if (c1606c0.s(i12, i9, abstractC1627n2)) {
                        Object object5 = unsafe.getObject(abstractC1627n2, j5);
                        InterfaceC1622k0 B8 = c1606c0.B(i9);
                        Class cls21 = AbstractC1624l0.f12224a;
                        int l014 = C1640u.l0(i12 << 3);
                        int a7 = ((AbstractC1627n) object5).a(B8);
                        i11 = U.a.s(a7, a7, l014, i11);
                    }
                    i9 += 3;
                    abstractC1627n2 = abstractC1627n;
                    i7 = 1048575;
                case 61:
                    if (c1606c0.s(i12, i9, abstractC1627n2)) {
                        C1638t c1638t2 = (C1638t) unsafe.getObject(abstractC1627n2, j5);
                        int l015 = C1640u.l0(i12 << 3);
                        int j17 = c1638t2.j();
                        i11 = U.a.s(j17, j17, l015, i11);
                    }
                    i9 += 3;
                    abstractC1627n2 = abstractC1627n;
                    i7 = 1048575;
                case 62:
                    if (c1606c0.s(i12, i9, abstractC1627n2)) {
                        i11 = U.a.v(v(j5, abstractC1627n2), C1640u.l0(i12 << 3), i11);
                    }
                    i9 += 3;
                    abstractC1627n2 = abstractC1627n;
                    i7 = 1048575;
                case 63:
                    if (c1606c0.s(i12, i9, abstractC1627n2)) {
                        long v5 = v(j5, abstractC1627n2);
                        l07 = C1640u.l0(i12 << 3);
                        m03 = C1640u.m0(v5);
                        i11 += m03 + l07;
                        i9 += 3;
                        abstractC1627n2 = abstractC1627n;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        abstractC1627n2 = abstractC1627n;
                        i7 = 1048575;
                    }
                case 64:
                    if (c1606c0.s(i12, i9, abstractC1627n2)) {
                        i11 = U.a.v(i12 << 3, 4, i11);
                    }
                    i9 += 3;
                    abstractC1627n2 = abstractC1627n;
                    i7 = 1048575;
                case 65:
                    if (c1606c0.s(i12, i9, abstractC1627n2)) {
                        i11 = U.a.v(i12 << 3, 8, i11);
                    }
                    i9 += 3;
                    abstractC1627n2 = abstractC1627n;
                    i7 = 1048575;
                case 66:
                    if (c1606c0.s(i12, i9, abstractC1627n2)) {
                        int v6 = v(j5, abstractC1627n2);
                        i11 = U.a.v((v6 >> 31) ^ (v6 + v6), C1640u.l0(i12 << 3), i11);
                    }
                    i9 += 3;
                    abstractC1627n2 = abstractC1627n;
                    i7 = 1048575;
                case 67:
                    if (c1606c0.s(i12, i9, abstractC1627n2)) {
                        long z6 = z(j5, abstractC1627n2);
                        l07 = C1640u.l0(i12 << 3);
                        m03 = C1640u.m0((z6 >> 63) ^ (z6 + z6));
                        i11 += m03 + l07;
                        i9 += 3;
                        abstractC1627n2 = abstractC1627n;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        abstractC1627n2 = abstractC1627n;
                        i7 = 1048575;
                    }
                case 68:
                    if (c1606c0.s(i12, i9, abstractC1627n2)) {
                        AbstractC1627n abstractC1627n5 = (AbstractC1627n) unsafe.getObject(abstractC1627n2, j5);
                        InterfaceC1622k0 B9 = c1606c0.B(i9);
                        int l016 = C1640u.l0(i12 << 3);
                        i5 = l016 + l016;
                        a4 = abstractC1627n5.a(B9);
                        j4 = a4 + i5;
                        i11 += j4;
                        i9 += 3;
                        abstractC1627n2 = abstractC1627n;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        abstractC1627n2 = abstractC1627n;
                        i7 = 1048575;
                    }
                default:
                    i9 += 3;
                    abstractC1627n2 = abstractC1627n;
                    i7 = 1048575;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x01ea, code lost:
    
        if (r2 != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d9, code lost:
    
        if (r2 != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00db, code lost:
    
        r6 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00dc, code lost:
    
        r1 = r6 + r1;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001e. Please report as an issue. */
    @Override // com.google.android.gms.internal.play_billing.InterfaceC1622k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(com.google.android.gms.internal.play_billing.E r11) {
        /*
            Method dump skipped, instructions count: 732
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.C1606c0.i(com.google.android.gms.internal.play_billing.E):int");
    }

    public final void j(int i4, Object obj, Object obj2) {
        if (p(i4, obj2)) {
            int y = y(i4) & 1048575;
            Unsafe unsafe = f12186l;
            long j4 = y;
            Object object = unsafe.getObject(obj2, j4);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f12187a[i4] + " is present but null: " + obj2.toString());
            }
            InterfaceC1622k0 B4 = B(i4);
            if (!p(i4, obj)) {
                if (r(object)) {
                    E a4 = B4.a();
                    B4.d(a4, object);
                    unsafe.putObject(obj, j4, a4);
                } else {
                    unsafe.putObject(obj, j4, object);
                }
                l(i4, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j4);
            if (!r(object2)) {
                E a5 = B4.a();
                B4.d(a5, object2);
                unsafe.putObject(obj, j4, a5);
                object2 = a5;
            }
            B4.d(object2, object);
        }
    }

    public final void k(int i4, Object obj, Object obj2) {
        int[] iArr = this.f12187a;
        int i5 = iArr[i4];
        if (s(i5, i4, obj2)) {
            int y = y(i4) & 1048575;
            Unsafe unsafe = f12186l;
            long j4 = y;
            Object object = unsafe.getObject(obj2, j4);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i4] + " is present but null: " + obj2.toString());
            }
            InterfaceC1622k0 B4 = B(i4);
            if (!s(i5, i4, obj)) {
                if (r(object)) {
                    E a4 = B4.a();
                    B4.d(a4, object);
                    unsafe.putObject(obj, j4, a4);
                } else {
                    unsafe.putObject(obj, j4, object);
                }
                AbstractC1645w0.j(iArr[i4 + 2] & 1048575, obj, i5);
                return;
            }
            Object object2 = unsafe.getObject(obj, j4);
            if (!r(object2)) {
                E a5 = B4.a();
                B4.d(a5, object2);
                unsafe.putObject(obj, j4, a5);
                object2 = a5;
            }
            B4.d(object2, object);
        }
    }

    public final void l(int i4, Object obj) {
        int i5 = this.f12187a[i4 + 2];
        long j4 = 1048575 & i5;
        if (j4 == 1048575) {
            return;
        }
        AbstractC1645w0.j(j4, obj, (1 << (i5 >>> 20)) | AbstractC1645w0.e(j4, obj));
    }

    public final void m(int i4, Object obj, Object obj2) {
        f12186l.putObject(obj, y(i4) & 1048575, obj2);
        l(i4, obj);
    }

    public final void n(int i4, int i5, Object obj, Object obj2) {
        f12186l.putObject(obj, y(i5) & 1048575, obj2);
        AbstractC1645w0.j(this.f12187a[i5 + 2] & 1048575, obj, i4);
    }

    public final boolean o(E e4, E e5, int i4) {
        return p(i4, e4) == p(i4, e5);
    }

    public final boolean p(int i4, Object obj) {
        int i5 = this.f12187a[i4 + 2];
        long j4 = i5 & 1048575;
        if (j4 == 1048575) {
            int y = y(i4);
            long j5 = y & 1048575;
            switch (x(y)) {
                case 0:
                    if (Double.doubleToRawLongBits(AbstractC1645w0.c.a(j5, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(AbstractC1645w0.c.b(j5, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (AbstractC1645w0.f(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (AbstractC1645w0.f(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (AbstractC1645w0.e(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (AbstractC1645w0.f(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (AbstractC1645w0.e(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return AbstractC1645w0.c.g(j5, obj);
                case 8:
                    Object h4 = AbstractC1645w0.h(j5, obj);
                    if (h4 instanceof String) {
                        if (((String) h4).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(h4 instanceof C1638t)) {
                            throw new IllegalArgumentException();
                        }
                        if (C1638t.f12244q.equals(h4)) {
                            return false;
                        }
                    }
                    break;
                case 9:
                    if (AbstractC1645w0.h(j5, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (C1638t.f12244q.equals(AbstractC1645w0.h(j5, obj))) {
                        return false;
                    }
                    break;
                case 11:
                    if (AbstractC1645w0.e(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (AbstractC1645w0.e(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (AbstractC1645w0.e(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (AbstractC1645w0.f(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (AbstractC1645w0.e(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (AbstractC1645w0.f(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (AbstractC1645w0.h(j5, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i5 >>> 20)) & AbstractC1645w0.e(j4, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean q(Object obj, int i4, int i5, int i6, int i7) {
        return i5 == 1048575 ? p(i4, obj) : (i6 & i7) != 0;
    }

    public final boolean s(int i4, int i5, Object obj) {
        return AbstractC1645w0.e((long) (this.f12187a[i5 + 2] & 1048575), obj) == i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0e0a, code lost:
    
        r0 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0e49, code lost:
    
        if (r0 == 1048575) goto L632;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0e4b, code lost:
    
        r30.putInt(r9, r0, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0e51, code lost:
    
        r0 = r36.f12191g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0e57, code lost:
    
        if (r0 >= r36.f12192h) goto L769;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0e59, code lost:
    
        r1 = r36.f12190f[r0];
        r2 = r21[r1];
        r2 = com.google.android.gms.internal.play_billing.AbstractC1645w0.h(y(r1) & 1048575, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0e6d, code lost:
    
        if (r2 != null) goto L638;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0e74, code lost:
    
        if (A(r1) != null) goto L768;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0e79, code lost:
    
        r2 = (com.google.android.gms.internal.play_billing.X) r2;
        r1 = r1 / 3;
        r17[r1 + r1].getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0e88, code lost:
    
        throw new java.lang.ClassCastException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0e76, code lost:
    
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:585:0x00e7, code lost:
    
        r3 = r9;
        r8 = r10;
        r7 = r11;
        r9 = r12;
        r6 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:599:0x015c, code lost:
    
        r3 = r2;
        r2 = r1;
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:600:0x015f, code lost:
    
        r5 = r40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0e8b, code lost:
    
        if (r10 != 0) goto L649;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0e8d, code lost:
    
        if (r4 != r5) goto L647;
     */
    /* JADX WARN: Code restructure failed: missing block: B:642:0x03d9, code lost:
    
        r15 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0e95, code lost:
    
        throw new java.io.IOException("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0e9a, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0e96, code lost:
    
        if (r4 > r5) goto L652;
     */
    /* JADX WARN: Code restructure failed: missing block: B:672:0x0309, code lost:
    
        throw com.google.android.gms.internal.play_billing.M.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0e98, code lost:
    
        if (r15 != r10) goto L652;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0ea0, code lost:
    
        throw new java.io.IOException("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:702:0x036d, code lost:
    
        throw com.google.android.gms.internal.play_billing.M.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:719:0x02b4, code lost:
    
        throw com.google.android.gms.internal.play_billing.M.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:766:0x048d, code lost:
    
        r8 = r10;
        r7 = r11;
        r9 = r12;
        r3 = r13;
        r6 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:784:0x0511, code lost:
    
        r1 = r9;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:174:0x05f2. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x0bcc. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:577:0x00b6. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0b4f  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0b3f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0de6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0dfc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0e05 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:654:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0e17  */
    /* JADX WARN: Removed duplicated region for block: B:803:0x005d A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v69, types: [java.util.LinkedHashMap, com.google.android.gms.internal.play_billing.X] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int t(java.lang.Object r37, byte[] r38, int r39, int r40, int r41, com.google.android.gms.internal.ads.C0544dz r42) {
        /*
            Method dump skipped, instructions count: 3908
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.C1606c0.t(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.dz):int");
    }

    public final int w(int i4, int i5) {
        int[] iArr = this.f12187a;
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

    public final int y(int i4) {
        return this.f12187a[i4 + 1];
    }
}
