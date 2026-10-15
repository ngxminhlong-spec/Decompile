package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.dA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0514dA implements InterfaceC0984oA {

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f8465l = new int[0];

    /* renamed from: m, reason: collision with root package name */
    public static final Unsafe f8466m = BA.k();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f8467a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f8468b;
    public final int c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0417az f8469e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f8470f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f8471g;

    /* renamed from: h, reason: collision with root package name */
    public final int f8472h;

    /* renamed from: i, reason: collision with root package name */
    public final int f8473i;

    /* renamed from: j, reason: collision with root package name */
    public final Vz f8474j;

    /* renamed from: k, reason: collision with root package name */
    public final C1198tA f8475k;

    public C0514dA(int[] iArr, Object[] objArr, int i4, int i5, AbstractC0417az abstractC0417az, int[] iArr2, int i6, int i7, Vz vz, C1198tA c1198tA, C1358wz c1358wz) {
        this.f8467a = iArr;
        this.f8468b = objArr;
        this.c = i4;
        this.d = i5;
        this.f8470f = abstractC0417az instanceof Dz;
        this.f8471g = iArr2;
        this.f8472h = i6;
        this.f8473i = i7;
        this.f8474j = vz;
        this.f8475k = c1198tA;
        this.f8469e = abstractC0417az;
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
    public static com.google.android.gms.internal.ads.C0514dA B(com.google.android.gms.internal.ads.C0812kA r35, com.google.android.gms.internal.ads.Vz r36, com.google.android.gms.internal.ads.C1198tA r37, com.google.android.gms.internal.ads.C1358wz r38) {
        /*
            Method dump skipped, instructions count: 1056
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0514dA.B(com.google.android.gms.internal.ads.kA, com.google.android.gms.internal.ads.Vz, com.google.android.gms.internal.ads.tA, com.google.android.gms.internal.ads.wz):com.google.android.gms.internal.ads.dA");
    }

    public static int C(long j4, Object obj) {
        return ((Integer) BA.j(j4, obj)).intValue();
    }

    public static int E(int i4) {
        return (i4 >>> 20) & 255;
    }

    public static long G(long j4, Object obj) {
        return ((Long) BA.j(j4, obj)).longValue();
    }

    public static Field m(Class cls, String str) {
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

    public static void n(Object obj) {
        if (!y(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    public static boolean y(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Dz) {
            return ((Dz) obj).r();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0d02, code lost:
    
        r2 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0d3e, code lost:
    
        if (r2 == 1048575) goto L526;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0d40, code lost:
    
        r1.putInt(r9, r2, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0d44, code lost:
    
        r2 = r35.f8472h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0d4a, code lost:
    
        if (r2 >= r35.f8473i) goto L639;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0d4c, code lost:
    
        J(r35.f8471g[r2], r9, r38);
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0d58, code lost:
    
        if (r0 != 0) goto L535;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0d5a, code lost:
    
        if (r4 != r5) goto L533;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0d61, code lost:
    
        throw com.google.android.gms.internal.ads.Oz.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0d66, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:552:0x01e7, code lost:
    
        r9 = r11;
        r8 = r12;
        r7 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0d62, code lost:
    
        if (r4 > r5) goto L538;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0d64, code lost:
    
        if (r15 != r0) goto L538;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0d6b, code lost:
    
        throw com.google.android.gms.internal.ads.Oz.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:627:0x0367, code lost:
    
        r3 = r11;
        r8 = r12;
        r6 = r13;
        r7 = r18;
        r9 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:646:0x03ef, code lost:
    
        r1 = r9;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:156:0x04d7. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x0ac5. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:518:0x00b4. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0a53  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0a46 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0cdc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0cf2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A(java.lang.Object r36, byte[] r37, int r38, int r39, int r40, com.google.android.gms.internal.ads.C0544dz r41) {
        /*
            Method dump skipped, instructions count: 3580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0514dA.A(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.dz):int");
    }

    public final int D(int i4, int i5) {
        int[] iArr = this.f8467a;
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

    public final int F(int i4) {
        return this.f8467a[i4 + 1];
    }

    public final Gz H(int i4) {
        int i5 = i4 / 3;
        return (Gz) this.f8468b[i5 + i5 + 1];
    }

    public final InterfaceC0984oA I(int i4) {
        int i5 = i4 / 3;
        int i6 = i5 + i5;
        Object[] objArr = this.f8468b;
        InterfaceC0984oA interfaceC0984oA = (InterfaceC0984oA) objArr[i6];
        if (interfaceC0984oA != null) {
            return interfaceC0984oA;
        }
        InterfaceC0984oA a4 = C0728iA.c.a((Class) objArr[i6 + 1]);
        objArr[i6] = a4;
        return a4;
    }

    public final void J(int i4, Object obj, Object obj2) {
        int i5 = this.f8467a[i4];
        Object j4 = BA.j(F(i4) & 1048575, obj);
        if (j4 == null || H(i4) == null) {
            return;
        }
        K(i4).getClass();
        throw new ClassCastException();
    }

    public final Object K(int i4) {
        int i5 = i4 / 3;
        return this.f8468b[i5 + i5];
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0984oA
    public final Dz a() {
        return ((Dz) this.f8469e).j();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0984oA
    public final void b(Object obj) {
        if (!y(obj)) {
            return;
        }
        if (obj instanceof Dz) {
            Dz dz = (Dz) obj;
            dz.p();
            dz.zza = 0;
            dz.n();
        }
        int i4 = 0;
        while (true) {
            int[] iArr = this.f8467a;
            if (i4 >= iArr.length) {
                this.f8475k.getClass();
                C1155sA c1155sA = ((Dz) obj).zzc;
                if (c1155sA.f10599e) {
                    c1155sA.f10599e = false;
                    return;
                }
                return;
            }
            int F2 = F(i4);
            int i5 = 1048575 & F2;
            int E4 = E(F2);
            long j4 = i5;
            if (E4 != 9) {
                if (E4 != 60 && E4 != 68) {
                    switch (E4) {
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
                            this.f8474j.b(j4, obj);
                            break;
                        case 50:
                            Unsafe unsafe = f8466m;
                            Object object = unsafe.getObject(obj, j4);
                            if (object == null) {
                                break;
                            } else {
                                ((Yz) object).f7936o = false;
                                unsafe.putObject(obj, j4, object);
                                break;
                            }
                    }
                } else if (z(iArr[i4], i4, obj)) {
                    I(i4).b(f8466m.getObject(obj, j4));
                }
                i4 += 3;
            }
            if (w(i4, obj)) {
                I(i4).b(f8466m.getObject(obj, j4));
            }
            i4 += 3;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0984oA
    public final boolean c(Object obj) {
        int i4;
        int i5;
        int i6;
        int i7 = 0;
        int i8 = 0;
        int i9 = 1048575;
        while (i8 < this.f8472h) {
            int i10 = this.f8471g[i8];
            int[] iArr = this.f8467a;
            int i11 = iArr[i10];
            int F2 = F(i10);
            int i12 = iArr[i10 + 2];
            int i13 = i12 & 1048575;
            int i14 = 1 << (i12 >>> 20);
            if (i13 != i9) {
                if (i13 != 1048575) {
                    i7 = f8466m.getInt(obj, i13);
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
            if ((268435456 & F2) == 0 || x(obj, i5, i4, i6, i14)) {
                int E4 = E(F2);
                if (E4 == 9 || E4 == 17) {
                    if (x(obj, i5, i4, i6, i14) && !I(i5).c(BA.j(F2 & 1048575, obj))) {
                    }
                    i8++;
                    i9 = i4;
                    i7 = i6;
                } else {
                    if (E4 != 27) {
                        if (E4 == 60 || E4 == 68) {
                            if (z(i11, i5, obj) && !I(i5).c(BA.j(F2 & 1048575, obj))) {
                            }
                        } else if (E4 != 49) {
                            if (E4 == 50 && !((Yz) BA.j(F2 & 1048575, obj)).isEmpty()) {
                                K(i5).getClass();
                                throw new ClassCastException();
                            }
                        }
                        i8++;
                        i9 = i4;
                        i7 = i6;
                    }
                    List list = (List) BA.j(F2 & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        InterfaceC0984oA I4 = I(i5);
                        for (int i16 = 0; i16 < list.size(); i16++) {
                            if (I4.c(list.get(i16))) {
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

    @Override // com.google.android.gms.internal.ads.InterfaceC0984oA
    public final void d(Object obj, Object obj2) {
        Object obj3;
        n(obj);
        obj2.getClass();
        int i4 = 0;
        while (true) {
            int[] iArr = this.f8467a;
            if (i4 >= iArr.length) {
                AbstractC1027pA.r(this.f8475k, obj, obj2);
                return;
            }
            int F2 = F(i4);
            int i5 = 1048575 & F2;
            int E4 = E(F2);
            int i6 = iArr[i4];
            long j4 = i5;
            switch (E4) {
                case 0:
                    if (w(i4, obj2)) {
                        AA aa = BA.c;
                        obj3 = obj;
                        aa.d1(obj3, j4, aa.U0(j4, obj2));
                        r(i4, obj3);
                        break;
                    }
                    break;
                case 1:
                    if (w(i4, obj2)) {
                        AA aa2 = BA.c;
                        aa2.e1(obj, j4, aa2.W0(j4, obj2));
                        r(i4, obj);
                        break;
                    }
                    break;
                case 2:
                    if (w(i4, obj2)) {
                        BA.n(obj, j4, BA.h(j4, obj2));
                        r(i4, obj);
                        break;
                    }
                    break;
                case 3:
                    if (w(i4, obj2)) {
                        BA.n(obj, j4, BA.h(j4, obj2));
                        r(i4, obj);
                        break;
                    }
                    break;
                case 4:
                    if (w(i4, obj2)) {
                        BA.m(j4, obj, BA.f(j4, obj2));
                        r(i4, obj);
                        break;
                    }
                    break;
                case 5:
                    if (w(i4, obj2)) {
                        BA.n(obj, j4, BA.h(j4, obj2));
                        r(i4, obj);
                        break;
                    }
                    break;
                case 6:
                    if (w(i4, obj2)) {
                        BA.m(j4, obj, BA.f(j4, obj2));
                        r(i4, obj);
                        break;
                    }
                    break;
                case 7:
                    if (w(i4, obj2)) {
                        AA aa3 = BA.c;
                        aa3.b1(obj, j4, aa3.f1(j4, obj2));
                        r(i4, obj);
                        break;
                    }
                    break;
                case 8:
                    if (w(i4, obj2)) {
                        BA.o(j4, obj, BA.j(j4, obj2));
                        r(i4, obj);
                        break;
                    }
                    break;
                case 9:
                    o(i4, obj, obj2);
                    break;
                case 10:
                    if (w(i4, obj2)) {
                        BA.o(j4, obj, BA.j(j4, obj2));
                        r(i4, obj);
                        break;
                    }
                    break;
                case 11:
                    if (w(i4, obj2)) {
                        BA.m(j4, obj, BA.f(j4, obj2));
                        r(i4, obj);
                        break;
                    }
                    break;
                case 12:
                    if (w(i4, obj2)) {
                        BA.m(j4, obj, BA.f(j4, obj2));
                        r(i4, obj);
                        break;
                    }
                    break;
                case 13:
                    if (w(i4, obj2)) {
                        BA.m(j4, obj, BA.f(j4, obj2));
                        r(i4, obj);
                        break;
                    }
                    break;
                case 14:
                    if (w(i4, obj2)) {
                        BA.n(obj, j4, BA.h(j4, obj2));
                        r(i4, obj);
                        break;
                    }
                    break;
                case 15:
                    if (w(i4, obj2)) {
                        BA.m(j4, obj, BA.f(j4, obj2));
                        r(i4, obj);
                        break;
                    }
                    break;
                case 16:
                    if (w(i4, obj2)) {
                        BA.n(obj, j4, BA.h(j4, obj2));
                        r(i4, obj);
                        break;
                    }
                    break;
                case 17:
                    o(i4, obj, obj2);
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
                    this.f8474j.c(j4, obj, obj2);
                    break;
                case 50:
                    Class cls = AbstractC1027pA.f9909a;
                    BA.o(j4, obj, Zz.a(BA.j(j4, obj), BA.j(j4, obj2)));
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
                    if (z(i6, i4, obj2)) {
                        BA.o(j4, obj, BA.j(j4, obj2));
                        s(i6, i4, obj);
                        break;
                    }
                    break;
                case 60:
                    p(i4, obj, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (z(i6, i4, obj2)) {
                        BA.o(j4, obj, BA.j(j4, obj2));
                        s(i6, i4, obj);
                        break;
                    }
                    break;
                case 68:
                    p(i4, obj, obj2);
                    break;
            }
            obj3 = obj;
            i4 += 3;
            obj = obj3;
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
    @Override // com.google.android.gms.internal.ads.InterfaceC0984oA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int e(com.google.android.gms.internal.ads.Dz r11) {
        /*
            Method dump skipped, instructions count: 732
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0514dA.e(com.google.android.gms.internal.ads.Dz):int");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0040. Please report as an issue. */
    @Override // com.google.android.gms.internal.ads.InterfaceC0984oA
    public final void f(Object obj, C1384xi c1384xi) {
        int i4;
        C0514dA c0514dA = this;
        Unsafe unsafe = f8466m;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        int i8 = 1048575;
        while (true) {
            int[] iArr = c0514dA.f8467a;
            if (i6 >= iArr.length) {
                c0514dA.f8475k.getClass();
                ((Dz) obj).zzc.d(c1384xi);
                return;
            }
            int F2 = c0514dA.F(i6);
            int E4 = E(F2);
            int i9 = iArr[i6];
            if (E4 <= 17) {
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
            long j4 = F2 & i5;
            switch (E4) {
                case 0:
                    if (c0514dA.x(obj, i6, i8, i7, i4)) {
                        ((AbstractC1229tz) c1384xi.f11290p).H(i9, Double.doubleToRawLongBits(BA.c.U0(j4, obj)));
                    }
                    i6 += 3;
                    i5 = 1048575;
                case 1:
                    if (c0514dA.x(obj, i6, i8, i7, i4)) {
                        ((AbstractC1229tz) c1384xi.f11290p).F(i9, Float.floatToRawIntBits(BA.c.W0(j4, obj)));
                    }
                    c0514dA = this;
                    i6 += 3;
                    i5 = 1048575;
                case 2:
                    if (c0514dA.x(obj, i6, i8, i7, i4)) {
                        ((AbstractC1229tz) c1384xi.f11290p).Q(i9, unsafe.getLong(obj, j4));
                    }
                    c0514dA = this;
                    i6 += 3;
                    i5 = 1048575;
                case 3:
                    if (c0514dA.x(obj, i6, i8, i7, i4)) {
                        ((AbstractC1229tz) c1384xi.f11290p).Q(i9, unsafe.getLong(obj, j4));
                    }
                    c0514dA = this;
                    i6 += 3;
                    i5 = 1048575;
                case 4:
                    if (c0514dA.x(obj, i6, i8, i7, i4)) {
                        ((AbstractC1229tz) c1384xi.f11290p).J(i9, unsafe.getInt(obj, j4));
                    }
                    c0514dA = this;
                    i6 += 3;
                    i5 = 1048575;
                case 5:
                    if (c0514dA.x(obj, i6, i8, i7, i4)) {
                        ((AbstractC1229tz) c1384xi.f11290p).H(i9, unsafe.getLong(obj, j4));
                    }
                    c0514dA = this;
                    i6 += 3;
                    i5 = 1048575;
                case 6:
                    if (c0514dA.x(obj, i6, i8, i7, i4)) {
                        ((AbstractC1229tz) c1384xi.f11290p).F(i9, unsafe.getInt(obj, j4));
                    }
                    c0514dA = this;
                    i6 += 3;
                    i5 = 1048575;
                case 7:
                    if (c0514dA.x(obj, i6, i8, i7, i4)) {
                        ((AbstractC1229tz) c1384xi.f11290p).D(i9, BA.c.f1(j4, obj));
                    }
                    c0514dA = this;
                    i6 += 3;
                    i5 = 1048575;
                case 8:
                    if (c0514dA.x(obj, i6, i8, i7, i4)) {
                        Object object = unsafe.getObject(obj, j4);
                        if (object instanceof String) {
                            ((AbstractC1229tz) c1384xi.f11290p).M((String) object, i9);
                        } else {
                            ((AbstractC1229tz) c1384xi.f11290p).E(i9, (AbstractC0886lz) object);
                        }
                    }
                    c0514dA = this;
                    i6 += 3;
                    i5 = 1048575;
                case 9:
                    if (c0514dA.x(obj, i6, i8, i7, i4)) {
                        Object object2 = unsafe.getObject(obj, j4);
                        InterfaceC0984oA I4 = c0514dA.I(i6);
                        c1384xi.getClass();
                        ((AbstractC1229tz) c1384xi.f11290p).L(i9, (AbstractC0417az) object2, I4);
                    }
                    i6 += 3;
                    i5 = 1048575;
                case 10:
                    if (c0514dA.x(obj, i6, i8, i7, i4)) {
                        ((AbstractC1229tz) c1384xi.f11290p).E(i9, (AbstractC0886lz) unsafe.getObject(obj, j4));
                    }
                    c0514dA = this;
                    i6 += 3;
                    i5 = 1048575;
                case 11:
                    if (c0514dA.x(obj, i6, i8, i7, i4)) {
                        ((AbstractC1229tz) c1384xi.f11290p).O(i9, unsafe.getInt(obj, j4));
                    }
                    c0514dA = this;
                    i6 += 3;
                    i5 = 1048575;
                case 12:
                    if (c0514dA.x(obj, i6, i8, i7, i4)) {
                        ((AbstractC1229tz) c1384xi.f11290p).J(i9, unsafe.getInt(obj, j4));
                    }
                    c0514dA = this;
                    i6 += 3;
                    i5 = 1048575;
                case 13:
                    if (c0514dA.x(obj, i6, i8, i7, i4)) {
                        ((AbstractC1229tz) c1384xi.f11290p).F(i9, unsafe.getInt(obj, j4));
                    }
                    c0514dA = this;
                    i6 += 3;
                    i5 = 1048575;
                case 14:
                    if (c0514dA.x(obj, i6, i8, i7, i4)) {
                        ((AbstractC1229tz) c1384xi.f11290p).H(i9, unsafe.getLong(obj, j4));
                    }
                    c0514dA = this;
                    i6 += 3;
                    i5 = 1048575;
                case 15:
                    if (c0514dA.x(obj, i6, i8, i7, i4)) {
                        int i12 = unsafe.getInt(obj, j4);
                        ((AbstractC1229tz) c1384xi.f11290p).O(i9, (i12 >> 31) ^ (i12 + i12));
                    }
                    c0514dA = this;
                    i6 += 3;
                    i5 = 1048575;
                case 16:
                    if (c0514dA.x(obj, i6, i8, i7, i4)) {
                        long j5 = unsafe.getLong(obj, j4);
                        ((AbstractC1229tz) c1384xi.f11290p).Q(i9, (j5 >> 63) ^ (j5 + j5));
                    }
                    c0514dA = this;
                    i6 += 3;
                    i5 = 1048575;
                case 17:
                    if (c0514dA.x(obj, i6, i8, i7, i4)) {
                        c1384xi.M0(i9, unsafe.getObject(obj, j4), c0514dA.I(i6));
                    }
                    i6 += 3;
                    i5 = 1048575;
                case 18:
                    AbstractC1027pA.u(iArr[i6], (List) unsafe.getObject(obj, j4), c1384xi, false);
                    i6 += 3;
                    i5 = 1048575;
                case 19:
                    AbstractC1027pA.y(iArr[i6], (List) unsafe.getObject(obj, j4), c1384xi, false);
                    i6 += 3;
                    i5 = 1048575;
                case 20:
                    AbstractC1027pA.a(iArr[i6], (List) unsafe.getObject(obj, j4), c1384xi, false);
                    i6 += 3;
                    i5 = 1048575;
                case 21:
                    AbstractC1027pA.g(iArr[i6], (List) unsafe.getObject(obj, j4), c1384xi, false);
                    i6 += 3;
                    i5 = 1048575;
                case 22:
                    AbstractC1027pA.z(iArr[i6], (List) unsafe.getObject(obj, j4), c1384xi, false);
                    i6 += 3;
                    i5 = 1048575;
                case 23:
                    AbstractC1027pA.x(iArr[i6], (List) unsafe.getObject(obj, j4), c1384xi, false);
                    i6 += 3;
                    i5 = 1048575;
                case 24:
                    AbstractC1027pA.w(iArr[i6], (List) unsafe.getObject(obj, j4), c1384xi, false);
                    i6 += 3;
                    i5 = 1048575;
                case 25:
                    AbstractC1027pA.t(iArr[i6], (List) unsafe.getObject(obj, j4), c1384xi, false);
                    i6 += 3;
                    i5 = 1048575;
                case 26:
                    int i13 = iArr[i6];
                    List list = (List) unsafe.getObject(obj, j4);
                    Class cls = AbstractC1027pA.f9909a;
                    if (list != null && !list.isEmpty()) {
                        AbstractC1229tz abstractC1229tz = (AbstractC1229tz) c1384xi.f11290p;
                        if (list instanceof Sz) {
                            Sz sz = (Sz) list;
                            for (int i14 = 0; i14 < list.size(); i14++) {
                                Object d = sz.d(i14);
                                if (d instanceof String) {
                                    abstractC1229tz.M((String) d, i13);
                                } else {
                                    abstractC1229tz.E(i13, (AbstractC0886lz) d);
                                }
                            }
                        } else {
                            for (int i15 = 0; i15 < list.size(); i15++) {
                                abstractC1229tz.M((String) list.get(i15), i13);
                            }
                        }
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 27:
                    int i16 = iArr[i6];
                    List list2 = (List) unsafe.getObject(obj, j4);
                    InterfaceC0984oA I5 = c0514dA.I(i6);
                    Class cls2 = AbstractC1027pA.f9909a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i17 = 0; i17 < list2.size(); i17++) {
                            Object obj2 = list2.get(i17);
                            c1384xi.getClass();
                            ((AbstractC1229tz) c1384xi.f11290p).L(i16, (AbstractC0417az) obj2, I5);
                        }
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 28:
                    int i18 = iArr[i6];
                    List list3 = (List) unsafe.getObject(obj, j4);
                    Class cls3 = AbstractC1027pA.f9909a;
                    if (list3 != null && !list3.isEmpty()) {
                        c1384xi.getClass();
                        for (int i19 = 0; i19 < list3.size(); i19++) {
                            ((AbstractC1229tz) c1384xi.f11290p).E(i18, (AbstractC0886lz) list3.get(i19));
                        }
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 29:
                    AbstractC1027pA.f(iArr[i6], (List) unsafe.getObject(obj, j4), c1384xi, false);
                    i6 += 3;
                    i5 = 1048575;
                case 30:
                    AbstractC1027pA.v(iArr[i6], (List) unsafe.getObject(obj, j4), c1384xi, false);
                    i6 += 3;
                    i5 = 1048575;
                case 31:
                    AbstractC1027pA.b(iArr[i6], (List) unsafe.getObject(obj, j4), c1384xi, false);
                    i6 += 3;
                    i5 = 1048575;
                case 32:
                    AbstractC1027pA.c(iArr[i6], (List) unsafe.getObject(obj, j4), c1384xi, false);
                    i6 += 3;
                    i5 = 1048575;
                case 33:
                    AbstractC1027pA.d(iArr[i6], (List) unsafe.getObject(obj, j4), c1384xi, false);
                    i6 += 3;
                    i5 = 1048575;
                case 34:
                    AbstractC1027pA.e(iArr[i6], (List) unsafe.getObject(obj, j4), c1384xi, false);
                    i6 += 3;
                    i5 = 1048575;
                case 35:
                    AbstractC1027pA.u(iArr[i6], (List) unsafe.getObject(obj, j4), c1384xi, true);
                    i6 += 3;
                    i5 = 1048575;
                case 36:
                    AbstractC1027pA.y(iArr[i6], (List) unsafe.getObject(obj, j4), c1384xi, true);
                    i6 += 3;
                    i5 = 1048575;
                case 37:
                    AbstractC1027pA.a(iArr[i6], (List) unsafe.getObject(obj, j4), c1384xi, true);
                    i6 += 3;
                    i5 = 1048575;
                case 38:
                    AbstractC1027pA.g(iArr[i6], (List) unsafe.getObject(obj, j4), c1384xi, true);
                    i6 += 3;
                    i5 = 1048575;
                case 39:
                    AbstractC1027pA.z(iArr[i6], (List) unsafe.getObject(obj, j4), c1384xi, true);
                    i6 += 3;
                    i5 = 1048575;
                case 40:
                    AbstractC1027pA.x(iArr[i6], (List) unsafe.getObject(obj, j4), c1384xi, true);
                    i6 += 3;
                    i5 = 1048575;
                case 41:
                    AbstractC1027pA.w(iArr[i6], (List) unsafe.getObject(obj, j4), c1384xi, true);
                    i6 += 3;
                    i5 = 1048575;
                case 42:
                    AbstractC1027pA.t(iArr[i6], (List) unsafe.getObject(obj, j4), c1384xi, true);
                    i6 += 3;
                    i5 = 1048575;
                case 43:
                    AbstractC1027pA.f(iArr[i6], (List) unsafe.getObject(obj, j4), c1384xi, true);
                    i6 += 3;
                    i5 = 1048575;
                case 44:
                    AbstractC1027pA.v(iArr[i6], (List) unsafe.getObject(obj, j4), c1384xi, true);
                    i6 += 3;
                    i5 = 1048575;
                case 45:
                    AbstractC1027pA.b(iArr[i6], (List) unsafe.getObject(obj, j4), c1384xi, true);
                    i6 += 3;
                    i5 = 1048575;
                case 46:
                    AbstractC1027pA.c(iArr[i6], (List) unsafe.getObject(obj, j4), c1384xi, true);
                    i6 += 3;
                    i5 = 1048575;
                case 47:
                    AbstractC1027pA.d(iArr[i6], (List) unsafe.getObject(obj, j4), c1384xi, true);
                    i6 += 3;
                    i5 = 1048575;
                case 48:
                    AbstractC1027pA.e(iArr[i6], (List) unsafe.getObject(obj, j4), c1384xi, true);
                    i6 += 3;
                    i5 = 1048575;
                case 49:
                    int i20 = iArr[i6];
                    List list4 = (List) unsafe.getObject(obj, j4);
                    InterfaceC0984oA I6 = c0514dA.I(i6);
                    Class cls4 = AbstractC1027pA.f9909a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i21 = 0; i21 < list4.size(); i21++) {
                            c1384xi.M0(i20, list4.get(i21), I6);
                        }
                    }
                    i6 += 3;
                    i5 = 1048575;
                    break;
                case 50:
                    if (unsafe.getObject(obj, j4) != null) {
                        c0514dA.K(i6).getClass();
                        throw new ClassCastException();
                    }
                    i6 += 3;
                    i5 = 1048575;
                case 51:
                    if (c0514dA.z(i9, i6, obj)) {
                        ((AbstractC1229tz) c1384xi.f11290p).H(i9, Double.doubleToRawLongBits(((Double) BA.j(j4, obj)).doubleValue()));
                    }
                    i6 += 3;
                    i5 = 1048575;
                case 52:
                    if (c0514dA.z(i9, i6, obj)) {
                        ((AbstractC1229tz) c1384xi.f11290p).F(i9, Float.floatToRawIntBits(((Float) BA.j(j4, obj)).floatValue()));
                    }
                    i6 += 3;
                    i5 = 1048575;
                case 53:
                    if (c0514dA.z(i9, i6, obj)) {
                        ((AbstractC1229tz) c1384xi.f11290p).Q(i9, G(j4, obj));
                    }
                    i6 += 3;
                    i5 = 1048575;
                case 54:
                    if (c0514dA.z(i9, i6, obj)) {
                        ((AbstractC1229tz) c1384xi.f11290p).Q(i9, G(j4, obj));
                    }
                    i6 += 3;
                    i5 = 1048575;
                case 55:
                    if (c0514dA.z(i9, i6, obj)) {
                        ((AbstractC1229tz) c1384xi.f11290p).J(i9, C(j4, obj));
                    }
                    i6 += 3;
                    i5 = 1048575;
                case 56:
                    if (c0514dA.z(i9, i6, obj)) {
                        ((AbstractC1229tz) c1384xi.f11290p).H(i9, G(j4, obj));
                    }
                    i6 += 3;
                    i5 = 1048575;
                case 57:
                    if (c0514dA.z(i9, i6, obj)) {
                        ((AbstractC1229tz) c1384xi.f11290p).F(i9, C(j4, obj));
                    }
                    i6 += 3;
                    i5 = 1048575;
                case 58:
                    if (c0514dA.z(i9, i6, obj)) {
                        ((AbstractC1229tz) c1384xi.f11290p).D(i9, ((Boolean) BA.j(j4, obj)).booleanValue());
                    }
                    i6 += 3;
                    i5 = 1048575;
                case 59:
                    if (c0514dA.z(i9, i6, obj)) {
                        Object object3 = unsafe.getObject(obj, j4);
                        if (object3 instanceof String) {
                            ((AbstractC1229tz) c1384xi.f11290p).M((String) object3, i9);
                        } else {
                            ((AbstractC1229tz) c1384xi.f11290p).E(i9, (AbstractC0886lz) object3);
                        }
                    }
                    i6 += 3;
                    i5 = 1048575;
                case 60:
                    if (c0514dA.z(i9, i6, obj)) {
                        Object object4 = unsafe.getObject(obj, j4);
                        InterfaceC0984oA I7 = c0514dA.I(i6);
                        c1384xi.getClass();
                        ((AbstractC1229tz) c1384xi.f11290p).L(i9, (AbstractC0417az) object4, I7);
                    }
                    i6 += 3;
                    i5 = 1048575;
                case 61:
                    if (c0514dA.z(i9, i6, obj)) {
                        ((AbstractC1229tz) c1384xi.f11290p).E(i9, (AbstractC0886lz) unsafe.getObject(obj, j4));
                    }
                    i6 += 3;
                    i5 = 1048575;
                case 62:
                    if (c0514dA.z(i9, i6, obj)) {
                        ((AbstractC1229tz) c1384xi.f11290p).O(i9, C(j4, obj));
                    }
                    i6 += 3;
                    i5 = 1048575;
                case 63:
                    if (c0514dA.z(i9, i6, obj)) {
                        ((AbstractC1229tz) c1384xi.f11290p).J(i9, C(j4, obj));
                    }
                    i6 += 3;
                    i5 = 1048575;
                case 64:
                    if (c0514dA.z(i9, i6, obj)) {
                        ((AbstractC1229tz) c1384xi.f11290p).F(i9, C(j4, obj));
                    }
                    i6 += 3;
                    i5 = 1048575;
                case 65:
                    if (c0514dA.z(i9, i6, obj)) {
                        ((AbstractC1229tz) c1384xi.f11290p).H(i9, G(j4, obj));
                    }
                    i6 += 3;
                    i5 = 1048575;
                case 66:
                    if (c0514dA.z(i9, i6, obj)) {
                        int C4 = C(j4, obj);
                        ((AbstractC1229tz) c1384xi.f11290p).O(i9, (C4 >> 31) ^ (C4 + C4));
                    }
                    i6 += 3;
                    i5 = 1048575;
                case 67:
                    if (c0514dA.z(i9, i6, obj)) {
                        long G3 = G(j4, obj);
                        ((AbstractC1229tz) c1384xi.f11290p).Q(i9, (G3 >> 63) ^ (G3 + G3));
                    }
                    i6 += 3;
                    i5 = 1048575;
                case 68:
                    if (c0514dA.z(i9, i6, obj)) {
                        c1384xi.M0(i9, unsafe.getObject(obj, j4), c0514dA.I(i6));
                    }
                    i6 += 3;
                    i5 = 1048575;
                default:
                    i6 += 3;
                    i5 = 1048575;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x004c. Please report as an issue. */
    @Override // com.google.android.gms.internal.ads.InterfaceC0984oA
    public final int g(AbstractC0417az abstractC0417az) {
        int i4;
        int b4;
        int z4;
        int j4;
        int z5;
        int size;
        int p3;
        int z6;
        int z7;
        int z8;
        int z9;
        int z10;
        int i5;
        int i6;
        C0514dA c0514dA = this;
        AbstractC0417az abstractC0417az2 = abstractC0417az;
        Unsafe unsafe = f8466m;
        int i7 = 1048575;
        int i8 = 1048575;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int[] iArr = c0514dA.f8467a;
            if (i9 >= iArr.length) {
                c0514dA.f8475k.getClass();
                return ((Dz) abstractC0417az).zzc.a() + i11;
            }
            int F2 = c0514dA.F(i9);
            int E4 = E(F2);
            int i12 = iArr[i9];
            int i13 = iArr[i9 + 2];
            int i14 = i13 & i7;
            if (E4 <= 17) {
                if (i14 != i8) {
                    i10 = i14 == i7 ? 0 : unsafe.getInt(abstractC0417az2, i14);
                    i8 = i14;
                }
                i4 = 1 << (i13 >>> 20);
            } else {
                i4 = 0;
            }
            int i15 = F2 & i7;
            if (E4 >= EnumC1444yz.f11552p.f11556o) {
                EnumC1444yz.f11553q.getClass();
            }
            long j5 = i15;
            switch (E4) {
                case 0:
                    if (c0514dA.x(abstractC0417az2, i9, i8, i10, i4)) {
                        i11 = U.a.c(i12 << 3, 8, i11);
                    }
                    i9 += 3;
                    abstractC0417az2 = abstractC0417az;
                    i7 = 1048575;
                case 1:
                    if (c0514dA.x(abstractC0417az2, i9, i8, i10, i4)) {
                        i11 = U.a.c(i12 << 3, 4, i11);
                    }
                    c0514dA = this;
                    i9 += 3;
                    abstractC0417az2 = abstractC0417az;
                    i7 = 1048575;
                case 2:
                    if (c0514dA.x(abstractC0417az2, i9, i8, i10, i4)) {
                        i11 = U.a.c(i12 << 3, AbstractC1229tz.A(unsafe.getLong(abstractC0417az2, j5)), i11);
                    }
                    c0514dA = this;
                    i9 += 3;
                    abstractC0417az2 = abstractC0417az;
                    i7 = 1048575;
                case 3:
                    if (c0514dA.x(abstractC0417az2, i9, i8, i10, i4)) {
                        i11 = U.a.c(i12 << 3, AbstractC1229tz.A(unsafe.getLong(abstractC0417az2, j5)), i11);
                    }
                    c0514dA = this;
                    i9 += 3;
                    abstractC0417az2 = abstractC0417az;
                    i7 = 1048575;
                case 4:
                    if (c0514dA.x(abstractC0417az2, i9, i8, i10, i4)) {
                        i11 = U.a.c(i12 << 3, AbstractC1229tz.S(unsafe.getInt(abstractC0417az2, j5)), i11);
                    }
                    c0514dA = this;
                    i9 += 3;
                    abstractC0417az2 = abstractC0417az;
                    i7 = 1048575;
                case 5:
                    if (c0514dA.x(abstractC0417az2, i9, i8, i10, i4)) {
                        i11 = U.a.c(i12 << 3, 8, i11);
                    }
                    c0514dA = this;
                    i9 += 3;
                    abstractC0417az2 = abstractC0417az;
                    i7 = 1048575;
                case 6:
                    if (c0514dA.x(abstractC0417az2, i9, i8, i10, i4)) {
                        i11 = U.a.c(i12 << 3, 4, i11);
                    }
                    c0514dA = this;
                    i9 += 3;
                    abstractC0417az2 = abstractC0417az;
                    i7 = 1048575;
                case 7:
                    if (c0514dA.x(abstractC0417az2, i9, i8, i10, i4)) {
                        i11 = U.a.c(i12 << 3, 1, i11);
                    }
                    c0514dA = this;
                    i9 += 3;
                    abstractC0417az2 = abstractC0417az;
                    i7 = 1048575;
                case 8:
                    if (c0514dA.x(abstractC0417az2, i9, i8, i10, i4)) {
                        int i16 = i12 << 3;
                        Object object = unsafe.getObject(abstractC0417az2, j5);
                        if (object instanceof AbstractC0886lz) {
                            Logger logger = AbstractC1229tz.c;
                            int l4 = ((AbstractC0886lz) object).l();
                            i11 = U.a.c(i16, AbstractC1229tz.z(l4) + l4, i11);
                        } else {
                            i11 = U.a.c(i16, AbstractC1229tz.T((String) object), i11);
                        }
                    }
                    c0514dA = this;
                    i9 += 3;
                    abstractC0417az2 = abstractC0417az;
                    i7 = 1048575;
                case 9:
                    if (c0514dA.x(abstractC0417az2, i9, i8, i10, i4)) {
                        Object object2 = unsafe.getObject(abstractC0417az2, j5);
                        InterfaceC0984oA I4 = c0514dA.I(i9);
                        Class cls = AbstractC1027pA.f9909a;
                        Logger logger2 = AbstractC1229tz.c;
                        int b5 = ((AbstractC0417az) object2).b(I4);
                        i11 = U.a.c(i12 << 3, AbstractC1229tz.z(b5) + b5, i11);
                    }
                    i9 += 3;
                    abstractC0417az2 = abstractC0417az;
                    i7 = 1048575;
                case 10:
                    if (c0514dA.x(abstractC0417az2, i9, i8, i10, i4)) {
                        AbstractC0886lz abstractC0886lz = (AbstractC0886lz) unsafe.getObject(abstractC0417az2, j5);
                        Logger logger3 = AbstractC1229tz.c;
                        int l5 = abstractC0886lz.l();
                        i11 = U.a.c(i12 << 3, AbstractC1229tz.z(l5) + l5, i11);
                    }
                    c0514dA = this;
                    i9 += 3;
                    abstractC0417az2 = abstractC0417az;
                    i7 = 1048575;
                case 11:
                    if (c0514dA.x(abstractC0417az2, i9, i8, i10, i4)) {
                        i11 = U.a.c(i12 << 3, AbstractC1229tz.z(unsafe.getInt(abstractC0417az2, j5)), i11);
                    }
                    c0514dA = this;
                    i9 += 3;
                    abstractC0417az2 = abstractC0417az;
                    i7 = 1048575;
                case 12:
                    if (c0514dA.x(abstractC0417az2, i9, i8, i10, i4)) {
                        i11 = U.a.c(i12 << 3, AbstractC1229tz.S(unsafe.getInt(abstractC0417az2, j5)), i11);
                    }
                    c0514dA = this;
                    i9 += 3;
                    abstractC0417az2 = abstractC0417az;
                    i7 = 1048575;
                case 13:
                    if (c0514dA.x(abstractC0417az2, i9, i8, i10, i4)) {
                        i11 = U.a.c(i12 << 3, 4, i11);
                    }
                    c0514dA = this;
                    i9 += 3;
                    abstractC0417az2 = abstractC0417az;
                    i7 = 1048575;
                case 14:
                    if (c0514dA.x(abstractC0417az2, i9, i8, i10, i4)) {
                        i11 = U.a.c(i12 << 3, 8, i11);
                    }
                    c0514dA = this;
                    i9 += 3;
                    abstractC0417az2 = abstractC0417az;
                    i7 = 1048575;
                case 15:
                    if (c0514dA.x(abstractC0417az2, i9, i8, i10, i4)) {
                        int i17 = unsafe.getInt(abstractC0417az2, j5);
                        i11 = U.a.c((i17 >> 31) ^ (i17 + i17), AbstractC1229tz.z(i12 << 3), i11);
                    }
                    c0514dA = this;
                    i9 += 3;
                    abstractC0417az2 = abstractC0417az;
                    i7 = 1048575;
                case 16:
                    if (c0514dA.x(abstractC0417az2, i9, i8, i10, i4)) {
                        long j6 = unsafe.getLong(abstractC0417az2, j5);
                        i11 += AbstractC1229tz.A((j6 >> 63) ^ (j6 + j6)) + AbstractC1229tz.z(i12 << 3);
                    }
                    c0514dA = this;
                    i9 += 3;
                    abstractC0417az2 = abstractC0417az;
                    i7 = 1048575;
                case 17:
                    if (c0514dA.x(abstractC0417az2, i9, i8, i10, i4)) {
                        AbstractC0417az abstractC0417az3 = (AbstractC0417az) unsafe.getObject(abstractC0417az2, j5);
                        InterfaceC0984oA I5 = c0514dA.I(i9);
                        Logger logger4 = AbstractC1229tz.c;
                        b4 = abstractC0417az3.b(I5);
                        z4 = AbstractC1229tz.z(i12 << 3);
                        i5 = z4 + z4;
                        i11 += i5 + b4;
                        i9 += 3;
                        abstractC0417az2 = abstractC0417az;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        abstractC0417az2 = abstractC0417az;
                        i7 = 1048575;
                    }
                case 18:
                    j4 = AbstractC1027pA.j(i12, (List) unsafe.getObject(abstractC0417az2, j5));
                    i11 += j4;
                    i9 += 3;
                    abstractC0417az2 = abstractC0417az;
                    i7 = 1048575;
                case 19:
                    j4 = AbstractC1027pA.i(i12, (List) unsafe.getObject(abstractC0417az2, j5));
                    i11 += j4;
                    i9 += 3;
                    abstractC0417az2 = abstractC0417az;
                    i7 = 1048575;
                case 20:
                    List list = (List) unsafe.getObject(abstractC0417az2, j5);
                    Class cls2 = AbstractC1027pA.f9909a;
                    if (list.size() != 0) {
                        z5 = (AbstractC1229tz.z(i12 << 3) * list.size()) + AbstractC1027pA.l(list);
                        i11 += z5;
                        i9 += 3;
                        abstractC0417az2 = abstractC0417az;
                        i7 = 1048575;
                    }
                    z5 = 0;
                    i11 += z5;
                    i9 += 3;
                    abstractC0417az2 = abstractC0417az;
                    i7 = 1048575;
                case 21:
                    List list2 = (List) unsafe.getObject(abstractC0417az2, j5);
                    Class cls3 = AbstractC1027pA.f9909a;
                    size = list2.size();
                    if (size != 0) {
                        p3 = AbstractC1027pA.p(list2);
                        z6 = AbstractC1229tz.z(i12 << 3);
                        z7 = (z6 * size) + p3;
                        i11 += z7;
                        i9 += 3;
                        abstractC0417az2 = abstractC0417az;
                        i7 = 1048575;
                    }
                    z7 = 0;
                    i11 += z7;
                    i9 += 3;
                    abstractC0417az2 = abstractC0417az;
                    i7 = 1048575;
                case 22:
                    List list3 = (List) unsafe.getObject(abstractC0417az2, j5);
                    Class cls4 = AbstractC1027pA.f9909a;
                    size = list3.size();
                    if (size != 0) {
                        p3 = AbstractC1027pA.k(list3);
                        z6 = AbstractC1229tz.z(i12 << 3);
                        z7 = (z6 * size) + p3;
                        i11 += z7;
                        i9 += 3;
                        abstractC0417az2 = abstractC0417az;
                        i7 = 1048575;
                    }
                    z7 = 0;
                    i11 += z7;
                    i9 += 3;
                    abstractC0417az2 = abstractC0417az;
                    i7 = 1048575;
                case 23:
                    j4 = AbstractC1027pA.j(i12, (List) unsafe.getObject(abstractC0417az2, j5));
                    i11 += j4;
                    i9 += 3;
                    abstractC0417az2 = abstractC0417az;
                    i7 = 1048575;
                case 24:
                    j4 = AbstractC1027pA.i(i12, (List) unsafe.getObject(abstractC0417az2, j5));
                    i11 += j4;
                    i9 += 3;
                    abstractC0417az2 = abstractC0417az;
                    i7 = 1048575;
                case 25:
                    List list4 = (List) unsafe.getObject(abstractC0417az2, j5);
                    Class cls5 = AbstractC1027pA.f9909a;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        z5 = (AbstractC1229tz.z(i12 << 3) + 1) * size2;
                        i11 += z5;
                        i9 += 3;
                        abstractC0417az2 = abstractC0417az;
                        i7 = 1048575;
                    }
                    z5 = 0;
                    i11 += z5;
                    i9 += 3;
                    abstractC0417az2 = abstractC0417az;
                    i7 = 1048575;
                case 26:
                    List list5 = (List) unsafe.getObject(abstractC0417az2, j5);
                    Class cls6 = AbstractC1027pA.f9909a;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        boolean z11 = list5 instanceof Sz;
                        z7 = AbstractC1229tz.z(i12 << 3) * size3;
                        if (z11) {
                            Sz sz = (Sz) list5;
                            for (int i18 = 0; i18 < size3; i18++) {
                                Object d = sz.d(i18);
                                if (d instanceof AbstractC0886lz) {
                                    int l6 = ((AbstractC0886lz) d).l();
                                    z7 = U.a.c(l6, l6, z7);
                                } else {
                                    z7 = AbstractC1229tz.T((String) d) + z7;
                                }
                            }
                        } else {
                            for (int i19 = 0; i19 < size3; i19++) {
                                Object obj = list5.get(i19);
                                if (obj instanceof AbstractC0886lz) {
                                    int l7 = ((AbstractC0886lz) obj).l();
                                    z7 = U.a.c(l7, l7, z7);
                                } else {
                                    z7 = AbstractC1229tz.T((String) obj) + z7;
                                }
                            }
                        }
                        i11 += z7;
                        i9 += 3;
                        abstractC0417az2 = abstractC0417az;
                        i7 = 1048575;
                    }
                    z7 = 0;
                    i11 += z7;
                    i9 += 3;
                    abstractC0417az2 = abstractC0417az;
                    i7 = 1048575;
                case 27:
                    List list6 = (List) unsafe.getObject(abstractC0417az2, j5);
                    InterfaceC0984oA I6 = c0514dA.I(i9);
                    Class cls7 = AbstractC1027pA.f9909a;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        z8 = 0;
                    } else {
                        z8 = AbstractC1229tz.z(i12 << 3) * size4;
                        for (int i20 = 0; i20 < size4; i20++) {
                            int b6 = ((AbstractC0417az) list6.get(i20)).b(I6);
                            z8 = U.a.c(b6, b6, z8);
                        }
                    }
                    i11 += z8;
                    i9 += 3;
                    abstractC0417az2 = abstractC0417az;
                    i7 = 1048575;
                case 28:
                    List list7 = (List) unsafe.getObject(abstractC0417az2, j5);
                    Class cls8 = AbstractC1027pA.f9909a;
                    int size5 = list7.size();
                    if (size5 != 0) {
                        z7 = AbstractC1229tz.z(i12 << 3) * size5;
                        for (int i21 = 0; i21 < list7.size(); i21++) {
                            int l8 = ((AbstractC0886lz) list7.get(i21)).l();
                            z7 = U.a.c(l8, l8, z7);
                        }
                        i11 += z7;
                        i9 += 3;
                        abstractC0417az2 = abstractC0417az;
                        i7 = 1048575;
                    }
                    z7 = 0;
                    i11 += z7;
                    i9 += 3;
                    abstractC0417az2 = abstractC0417az;
                    i7 = 1048575;
                case 29:
                    List list8 = (List) unsafe.getObject(abstractC0417az2, j5);
                    Class cls9 = AbstractC1027pA.f9909a;
                    size = list8.size();
                    if (size != 0) {
                        p3 = AbstractC1027pA.o(list8);
                        z6 = AbstractC1229tz.z(i12 << 3);
                        z7 = (z6 * size) + p3;
                        i11 += z7;
                        i9 += 3;
                        abstractC0417az2 = abstractC0417az;
                        i7 = 1048575;
                    }
                    z7 = 0;
                    i11 += z7;
                    i9 += 3;
                    abstractC0417az2 = abstractC0417az;
                    i7 = 1048575;
                case 30:
                    List list9 = (List) unsafe.getObject(abstractC0417az2, j5);
                    Class cls10 = AbstractC1027pA.f9909a;
                    size = list9.size();
                    if (size != 0) {
                        p3 = AbstractC1027pA.h(list9);
                        z6 = AbstractC1229tz.z(i12 << 3);
                        z7 = (z6 * size) + p3;
                        i11 += z7;
                        i9 += 3;
                        abstractC0417az2 = abstractC0417az;
                        i7 = 1048575;
                    }
                    z7 = 0;
                    i11 += z7;
                    i9 += 3;
                    abstractC0417az2 = abstractC0417az;
                    i7 = 1048575;
                case 31:
                    j4 = AbstractC1027pA.i(i12, (List) unsafe.getObject(abstractC0417az2, j5));
                    i11 += j4;
                    i9 += 3;
                    abstractC0417az2 = abstractC0417az;
                    i7 = 1048575;
                case 32:
                    j4 = AbstractC1027pA.j(i12, (List) unsafe.getObject(abstractC0417az2, j5));
                    i11 += j4;
                    i9 += 3;
                    abstractC0417az2 = abstractC0417az;
                    i7 = 1048575;
                case 33:
                    List list10 = (List) unsafe.getObject(abstractC0417az2, j5);
                    Class cls11 = AbstractC1027pA.f9909a;
                    size = list10.size();
                    if (size != 0) {
                        p3 = AbstractC1027pA.m(list10);
                        z6 = AbstractC1229tz.z(i12 << 3);
                        z7 = (z6 * size) + p3;
                        i11 += z7;
                        i9 += 3;
                        abstractC0417az2 = abstractC0417az;
                        i7 = 1048575;
                    }
                    z7 = 0;
                    i11 += z7;
                    i9 += 3;
                    abstractC0417az2 = abstractC0417az;
                    i7 = 1048575;
                case 34:
                    List list11 = (List) unsafe.getObject(abstractC0417az2, j5);
                    Class cls12 = AbstractC1027pA.f9909a;
                    size = list11.size();
                    if (size != 0) {
                        p3 = AbstractC1027pA.n(list11);
                        z6 = AbstractC1229tz.z(i12 << 3);
                        z7 = (z6 * size) + p3;
                        i11 += z7;
                        i9 += 3;
                        abstractC0417az2 = abstractC0417az;
                        i7 = 1048575;
                    }
                    z7 = 0;
                    i11 += z7;
                    i9 += 3;
                    abstractC0417az2 = abstractC0417az;
                    i7 = 1048575;
                case 35:
                    List list12 = (List) unsafe.getObject(abstractC0417az2, j5);
                    Class cls13 = AbstractC1027pA.f9909a;
                    b4 = list12.size() * 8;
                    if (b4 > 0) {
                        z9 = AbstractC1229tz.z(b4);
                        z10 = AbstractC1229tz.z(i12 << 3);
                        i5 = z10 + z9;
                        i11 += i5 + b4;
                        i9 += 3;
                        abstractC0417az2 = abstractC0417az;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        abstractC0417az2 = abstractC0417az;
                        i7 = 1048575;
                    }
                case 36:
                    List list13 = (List) unsafe.getObject(abstractC0417az2, j5);
                    Class cls14 = AbstractC1027pA.f9909a;
                    b4 = list13.size() * 4;
                    if (b4 > 0) {
                        z9 = AbstractC1229tz.z(b4);
                        z10 = AbstractC1229tz.z(i12 << 3);
                        i5 = z10 + z9;
                        i11 += i5 + b4;
                        i9 += 3;
                        abstractC0417az2 = abstractC0417az;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        abstractC0417az2 = abstractC0417az;
                        i7 = 1048575;
                    }
                case 37:
                    b4 = AbstractC1027pA.l((List) unsafe.getObject(abstractC0417az2, j5));
                    if (b4 > 0) {
                        z9 = AbstractC1229tz.z(b4);
                        z10 = AbstractC1229tz.z(i12 << 3);
                        i5 = z10 + z9;
                        i11 += i5 + b4;
                        i9 += 3;
                        abstractC0417az2 = abstractC0417az;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        abstractC0417az2 = abstractC0417az;
                        i7 = 1048575;
                    }
                case 38:
                    b4 = AbstractC1027pA.p((List) unsafe.getObject(abstractC0417az2, j5));
                    if (b4 > 0) {
                        z9 = AbstractC1229tz.z(b4);
                        z10 = AbstractC1229tz.z(i12 << 3);
                        i5 = z10 + z9;
                        i11 += i5 + b4;
                        i9 += 3;
                        abstractC0417az2 = abstractC0417az;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        abstractC0417az2 = abstractC0417az;
                        i7 = 1048575;
                    }
                case 39:
                    b4 = AbstractC1027pA.k((List) unsafe.getObject(abstractC0417az2, j5));
                    if (b4 > 0) {
                        z9 = AbstractC1229tz.z(b4);
                        z10 = AbstractC1229tz.z(i12 << 3);
                        i5 = z10 + z9;
                        i11 += i5 + b4;
                        i9 += 3;
                        abstractC0417az2 = abstractC0417az;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        abstractC0417az2 = abstractC0417az;
                        i7 = 1048575;
                    }
                case 40:
                    List list14 = (List) unsafe.getObject(abstractC0417az2, j5);
                    Class cls15 = AbstractC1027pA.f9909a;
                    b4 = list14.size() * 8;
                    if (b4 > 0) {
                        z9 = AbstractC1229tz.z(b4);
                        z10 = AbstractC1229tz.z(i12 << 3);
                        i5 = z10 + z9;
                        i11 += i5 + b4;
                        i9 += 3;
                        abstractC0417az2 = abstractC0417az;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        abstractC0417az2 = abstractC0417az;
                        i7 = 1048575;
                    }
                case 41:
                    List list15 = (List) unsafe.getObject(abstractC0417az2, j5);
                    Class cls16 = AbstractC1027pA.f9909a;
                    b4 = list15.size() * 4;
                    if (b4 > 0) {
                        z9 = AbstractC1229tz.z(b4);
                        z10 = AbstractC1229tz.z(i12 << 3);
                        i5 = z10 + z9;
                        i11 += i5 + b4;
                        i9 += 3;
                        abstractC0417az2 = abstractC0417az;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        abstractC0417az2 = abstractC0417az;
                        i7 = 1048575;
                    }
                case 42:
                    List list16 = (List) unsafe.getObject(abstractC0417az2, j5);
                    Class cls17 = AbstractC1027pA.f9909a;
                    b4 = list16.size();
                    if (b4 > 0) {
                        z9 = AbstractC1229tz.z(b4);
                        z10 = AbstractC1229tz.z(i12 << 3);
                        i5 = z10 + z9;
                        i11 += i5 + b4;
                        i9 += 3;
                        abstractC0417az2 = abstractC0417az;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        abstractC0417az2 = abstractC0417az;
                        i7 = 1048575;
                    }
                case 43:
                    b4 = AbstractC1027pA.o((List) unsafe.getObject(abstractC0417az2, j5));
                    if (b4 > 0) {
                        z9 = AbstractC1229tz.z(b4);
                        z10 = AbstractC1229tz.z(i12 << 3);
                        i5 = z10 + z9;
                        i11 += i5 + b4;
                        i9 += 3;
                        abstractC0417az2 = abstractC0417az;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        abstractC0417az2 = abstractC0417az;
                        i7 = 1048575;
                    }
                case 44:
                    b4 = AbstractC1027pA.h((List) unsafe.getObject(abstractC0417az2, j5));
                    if (b4 > 0) {
                        z9 = AbstractC1229tz.z(b4);
                        z10 = AbstractC1229tz.z(i12 << 3);
                        i5 = z10 + z9;
                        i11 += i5 + b4;
                        i9 += 3;
                        abstractC0417az2 = abstractC0417az;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        abstractC0417az2 = abstractC0417az;
                        i7 = 1048575;
                    }
                case 45:
                    List list17 = (List) unsafe.getObject(abstractC0417az2, j5);
                    Class cls18 = AbstractC1027pA.f9909a;
                    b4 = list17.size() * 4;
                    if (b4 > 0) {
                        z9 = AbstractC1229tz.z(b4);
                        z10 = AbstractC1229tz.z(i12 << 3);
                        i5 = z10 + z9;
                        i11 += i5 + b4;
                        i9 += 3;
                        abstractC0417az2 = abstractC0417az;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        abstractC0417az2 = abstractC0417az;
                        i7 = 1048575;
                    }
                case 46:
                    List list18 = (List) unsafe.getObject(abstractC0417az2, j5);
                    Class cls19 = AbstractC1027pA.f9909a;
                    b4 = list18.size() * 8;
                    if (b4 > 0) {
                        z9 = AbstractC1229tz.z(b4);
                        z10 = AbstractC1229tz.z(i12 << 3);
                        i5 = z10 + z9;
                        i11 += i5 + b4;
                        i9 += 3;
                        abstractC0417az2 = abstractC0417az;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        abstractC0417az2 = abstractC0417az;
                        i7 = 1048575;
                    }
                case 47:
                    b4 = AbstractC1027pA.m((List) unsafe.getObject(abstractC0417az2, j5));
                    if (b4 > 0) {
                        z9 = AbstractC1229tz.z(b4);
                        z10 = AbstractC1229tz.z(i12 << 3);
                        i5 = z10 + z9;
                        i11 += i5 + b4;
                        i9 += 3;
                        abstractC0417az2 = abstractC0417az;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        abstractC0417az2 = abstractC0417az;
                        i7 = 1048575;
                    }
                case 48:
                    b4 = AbstractC1027pA.n((List) unsafe.getObject(abstractC0417az2, j5));
                    if (b4 > 0) {
                        z9 = AbstractC1229tz.z(b4);
                        z10 = AbstractC1229tz.z(i12 << 3);
                        i5 = z10 + z9;
                        i11 += i5 + b4;
                        i9 += 3;
                        abstractC0417az2 = abstractC0417az;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        abstractC0417az2 = abstractC0417az;
                        i7 = 1048575;
                    }
                case 49:
                    List list19 = (List) unsafe.getObject(abstractC0417az2, j5);
                    InterfaceC0984oA I7 = c0514dA.I(i9);
                    Class cls20 = AbstractC1027pA.f9909a;
                    int size6 = list19.size();
                    if (size6 == 0) {
                        i6 = 0;
                    } else {
                        i6 = 0;
                        for (int i22 = 0; i22 < size6; i22++) {
                            AbstractC0417az abstractC0417az4 = (AbstractC0417az) list19.get(i22);
                            Logger logger5 = AbstractC1229tz.c;
                            int b7 = abstractC0417az4.b(I7);
                            int z12 = AbstractC1229tz.z(i12 << 3);
                            i6 += z12 + z12 + b7;
                        }
                    }
                    i11 += i6;
                    i9 += 3;
                    abstractC0417az2 = abstractC0417az;
                    i7 = 1048575;
                case 50:
                    Yz yz = (Yz) unsafe.getObject(abstractC0417az2, j5);
                    if (c0514dA.K(i9) != null) {
                        throw new ClassCastException();
                    }
                    if (yz.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = yz.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i9 += 3;
                    abstractC0417az2 = abstractC0417az;
                    i7 = 1048575;
                case 51:
                    if (c0514dA.z(i12, i9, abstractC0417az2)) {
                        i11 = U.a.c(i12 << 3, 8, i11);
                    }
                    i9 += 3;
                    abstractC0417az2 = abstractC0417az;
                    i7 = 1048575;
                case 52:
                    if (c0514dA.z(i12, i9, abstractC0417az2)) {
                        i11 = U.a.c(i12 << 3, 4, i11);
                    }
                    i9 += 3;
                    abstractC0417az2 = abstractC0417az;
                    i7 = 1048575;
                case 53:
                    if (c0514dA.z(i12, i9, abstractC0417az2)) {
                        i11 = U.a.c(i12 << 3, AbstractC1229tz.A(G(j5, abstractC0417az2)), i11);
                    }
                    i9 += 3;
                    abstractC0417az2 = abstractC0417az;
                    i7 = 1048575;
                case 54:
                    if (c0514dA.z(i12, i9, abstractC0417az2)) {
                        i11 = U.a.c(i12 << 3, AbstractC1229tz.A(G(j5, abstractC0417az2)), i11);
                    }
                    i9 += 3;
                    abstractC0417az2 = abstractC0417az;
                    i7 = 1048575;
                case 55:
                    if (c0514dA.z(i12, i9, abstractC0417az2)) {
                        i11 = U.a.c(i12 << 3, AbstractC1229tz.S(C(j5, abstractC0417az2)), i11);
                    }
                    i9 += 3;
                    abstractC0417az2 = abstractC0417az;
                    i7 = 1048575;
                case 56:
                    if (c0514dA.z(i12, i9, abstractC0417az2)) {
                        i11 = U.a.c(i12 << 3, 8, i11);
                    }
                    i9 += 3;
                    abstractC0417az2 = abstractC0417az;
                    i7 = 1048575;
                case 57:
                    if (c0514dA.z(i12, i9, abstractC0417az2)) {
                        i11 = U.a.c(i12 << 3, 4, i11);
                    }
                    i9 += 3;
                    abstractC0417az2 = abstractC0417az;
                    i7 = 1048575;
                case 58:
                    if (c0514dA.z(i12, i9, abstractC0417az2)) {
                        i11 = U.a.c(i12 << 3, 1, i11);
                    }
                    i9 += 3;
                    abstractC0417az2 = abstractC0417az;
                    i7 = 1048575;
                case 59:
                    if (c0514dA.z(i12, i9, abstractC0417az2)) {
                        int i23 = i12 << 3;
                        Object object3 = unsafe.getObject(abstractC0417az2, j5);
                        if (object3 instanceof AbstractC0886lz) {
                            Logger logger6 = AbstractC1229tz.c;
                            int l9 = ((AbstractC0886lz) object3).l();
                            i11 = U.a.c(i23, AbstractC1229tz.z(l9) + l9, i11);
                        } else {
                            i11 = U.a.c(i23, AbstractC1229tz.T((String) object3), i11);
                        }
                    }
                    i9 += 3;
                    abstractC0417az2 = abstractC0417az;
                    i7 = 1048575;
                case 60:
                    if (c0514dA.z(i12, i9, abstractC0417az2)) {
                        Object object4 = unsafe.getObject(abstractC0417az2, j5);
                        InterfaceC0984oA I8 = c0514dA.I(i9);
                        Class cls21 = AbstractC1027pA.f9909a;
                        Logger logger7 = AbstractC1229tz.c;
                        int b8 = ((AbstractC0417az) object4).b(I8);
                        i11 = U.a.c(i12 << 3, AbstractC1229tz.z(b8) + b8, i11);
                    }
                    i9 += 3;
                    abstractC0417az2 = abstractC0417az;
                    i7 = 1048575;
                case 61:
                    if (c0514dA.z(i12, i9, abstractC0417az2)) {
                        AbstractC0886lz abstractC0886lz2 = (AbstractC0886lz) unsafe.getObject(abstractC0417az2, j5);
                        Logger logger8 = AbstractC1229tz.c;
                        int l10 = abstractC0886lz2.l();
                        i11 = U.a.c(i12 << 3, AbstractC1229tz.z(l10) + l10, i11);
                    }
                    i9 += 3;
                    abstractC0417az2 = abstractC0417az;
                    i7 = 1048575;
                case 62:
                    if (c0514dA.z(i12, i9, abstractC0417az2)) {
                        i11 = U.a.c(i12 << 3, AbstractC1229tz.z(C(j5, abstractC0417az2)), i11);
                    }
                    i9 += 3;
                    abstractC0417az2 = abstractC0417az;
                    i7 = 1048575;
                case 63:
                    if (c0514dA.z(i12, i9, abstractC0417az2)) {
                        i11 = U.a.c(i12 << 3, AbstractC1229tz.S(C(j5, abstractC0417az2)), i11);
                    }
                    i9 += 3;
                    abstractC0417az2 = abstractC0417az;
                    i7 = 1048575;
                case 64:
                    if (c0514dA.z(i12, i9, abstractC0417az2)) {
                        i11 = U.a.c(i12 << 3, 4, i11);
                    }
                    i9 += 3;
                    abstractC0417az2 = abstractC0417az;
                    i7 = 1048575;
                case 65:
                    if (c0514dA.z(i12, i9, abstractC0417az2)) {
                        i11 = U.a.c(i12 << 3, 8, i11);
                    }
                    i9 += 3;
                    abstractC0417az2 = abstractC0417az;
                    i7 = 1048575;
                case 66:
                    if (c0514dA.z(i12, i9, abstractC0417az2)) {
                        int C4 = C(j5, abstractC0417az2);
                        i11 = U.a.c((C4 >> 31) ^ (C4 + C4), AbstractC1229tz.z(i12 << 3), i11);
                    }
                    i9 += 3;
                    abstractC0417az2 = abstractC0417az;
                    i7 = 1048575;
                case 67:
                    if (c0514dA.z(i12, i9, abstractC0417az2)) {
                        long G3 = G(j5, abstractC0417az2);
                        b4 = AbstractC1229tz.z(i12 << 3);
                        i5 = AbstractC1229tz.A((G3 >> 63) ^ (G3 + G3));
                        i11 += i5 + b4;
                        i9 += 3;
                        abstractC0417az2 = abstractC0417az;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        abstractC0417az2 = abstractC0417az;
                        i7 = 1048575;
                    }
                case 68:
                    if (c0514dA.z(i12, i9, abstractC0417az2)) {
                        AbstractC0417az abstractC0417az5 = (AbstractC0417az) unsafe.getObject(abstractC0417az2, j5);
                        InterfaceC0984oA I9 = c0514dA.I(i9);
                        Logger logger9 = AbstractC1229tz.c;
                        b4 = abstractC0417az5.b(I9);
                        z4 = AbstractC1229tz.z(i12 << 3);
                        i5 = z4 + z4;
                        i11 += i5 + b4;
                        i9 += 3;
                        abstractC0417az2 = abstractC0417az;
                        i7 = 1048575;
                    } else {
                        i9 += 3;
                        abstractC0417az2 = abstractC0417az;
                        i7 = 1048575;
                    }
                default:
                    i9 += 3;
                    abstractC0417az2 = abstractC0417az;
                    i7 = 1048575;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:273:0x0042, code lost:
    
        r15 = r7;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x007a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:32:0x068e A[Catch: all -> 0x0694, TryCatch #7 {all -> 0x0694, blocks: (B:30:0x0689, B:32:0x068e, B:33:0x0696), top: B:29:0x0689 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x069c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x06a8  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x06b7 A[LOOP:2: B:50:0x06b5->B:51:0x06b7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x06c1  */
    @Override // com.google.android.gms.internal.ads.InterfaceC0984oA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(java.lang.Object r22, com.google.android.gms.internal.ads.C1058pz r23, com.google.android.gms.internal.ads.C1315vz r24) {
        /*
            Method dump skipped, instructions count: 1882
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0514dA.h(java.lang.Object, com.google.android.gms.internal.ads.pz, com.google.android.gms.internal.ads.vz):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0015. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01da A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01c7 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.InterfaceC0984oA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(com.google.android.gms.internal.ads.Dz r8, com.google.android.gms.internal.ads.Dz r9) {
        /*
            Method dump skipped, instructions count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0514dA.i(com.google.android.gms.internal.ads.Dz, com.google.android.gms.internal.ads.Dz):boolean");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0984oA
    public final void j(Object obj, byte[] bArr, int i4, int i5, C0544dz c0544dz) {
        A(obj, bArr, i4, i5, 0, c0544dz);
    }

    public final Object k(int i4, Object obj) {
        InterfaceC0984oA I4 = I(i4);
        int F2 = F(i4) & 1048575;
        if (!w(i4, obj)) {
            return I4.a();
        }
        Object object = f8466m.getObject(obj, F2);
        if (y(object)) {
            return object;
        }
        Dz a4 = I4.a();
        if (object != null) {
            I4.d(a4, object);
        }
        return a4;
    }

    public final Object l(int i4, int i5, Object obj) {
        InterfaceC0984oA I4 = I(i5);
        if (!z(i4, i5, obj)) {
            return I4.a();
        }
        Object object = f8466m.getObject(obj, F(i5) & 1048575);
        if (y(object)) {
            return object;
        }
        Dz a4 = I4.a();
        if (object != null) {
            I4.d(a4, object);
        }
        return a4;
    }

    public final void o(int i4, Object obj, Object obj2) {
        if (w(i4, obj2)) {
            int F2 = F(i4) & 1048575;
            Unsafe unsafe = f8466m;
            long j4 = F2;
            Object object = unsafe.getObject(obj2, j4);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f8467a[i4] + " is present but null: " + obj2.toString());
            }
            InterfaceC0984oA I4 = I(i4);
            if (!w(i4, obj)) {
                if (y(object)) {
                    Dz a4 = I4.a();
                    I4.d(a4, object);
                    unsafe.putObject(obj, j4, a4);
                } else {
                    unsafe.putObject(obj, j4, object);
                }
                r(i4, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j4);
            if (!y(object2)) {
                Dz a5 = I4.a();
                I4.d(a5, object2);
                unsafe.putObject(obj, j4, a5);
                object2 = a5;
            }
            I4.d(object2, object);
        }
    }

    public final void p(int i4, Object obj, Object obj2) {
        int[] iArr = this.f8467a;
        int i5 = iArr[i4];
        if (z(i5, i4, obj2)) {
            int F2 = F(i4) & 1048575;
            Unsafe unsafe = f8466m;
            long j4 = F2;
            Object object = unsafe.getObject(obj2, j4);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i4] + " is present but null: " + obj2.toString());
            }
            InterfaceC0984oA I4 = I(i4);
            if (!z(i5, i4, obj)) {
                if (y(object)) {
                    Dz a4 = I4.a();
                    I4.d(a4, object);
                    unsafe.putObject(obj, j4, a4);
                } else {
                    unsafe.putObject(obj, j4, object);
                }
                s(i5, i4, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j4);
            if (!y(object2)) {
                Dz a5 = I4.a();
                I4.d(a5, object2);
                unsafe.putObject(obj, j4, a5);
                object2 = a5;
            }
            I4.d(object2, object);
        }
    }

    public final void q(Object obj, int i4, C1058pz c1058pz) {
        AbstractC1012ow abstractC1012ow = (AbstractC1012ow) c1058pz.d;
        long j4 = i4 & 1048575;
        if ((536870912 & i4) != 0) {
            c1058pz.q(2);
            BA.o(j4, obj, abstractC1012ow.A());
        } else if (!this.f8470f) {
            BA.o(j4, obj, c1058pz.w());
        } else {
            c1058pz.q(2);
            BA.o(j4, obj, abstractC1012ow.z());
        }
    }

    public final void r(int i4, Object obj) {
        int i5 = this.f8467a[i4 + 2];
        long j4 = 1048575 & i5;
        if (j4 == 1048575) {
            return;
        }
        BA.m(j4, obj, (1 << (i5 >>> 20)) | BA.f(j4, obj));
    }

    public final void s(int i4, int i5, Object obj) {
        BA.m(this.f8467a[i5 + 2] & 1048575, obj, i4);
    }

    public final void t(int i4, Object obj, Object obj2) {
        f8466m.putObject(obj, F(i4) & 1048575, obj2);
        r(i4, obj);
    }

    public final void u(int i4, int i5, Object obj, Object obj2) {
        f8466m.putObject(obj, F(i5) & 1048575, obj2);
        s(i4, i5, obj);
    }

    public final boolean v(Dz dz, Dz dz2, int i4) {
        return w(i4, dz) == w(i4, dz2);
    }

    public final boolean w(int i4, Object obj) {
        int i5 = this.f8467a[i4 + 2];
        long j4 = i5 & 1048575;
        if (j4 == 1048575) {
            int F2 = F(i4);
            long j5 = F2 & 1048575;
            switch (E(F2)) {
                case 0:
                    if (Double.doubleToRawLongBits(BA.c.U0(j5, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(BA.c.W0(j5, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (BA.h(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (BA.h(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (BA.f(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (BA.h(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (BA.f(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return BA.c.f1(j5, obj);
                case 8:
                    Object j6 = BA.j(j5, obj);
                    if (j6 instanceof String) {
                        if (((String) j6).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(j6 instanceof AbstractC0886lz)) {
                            throw new IllegalArgumentException();
                        }
                        if (AbstractC0886lz.f9510p.equals(j6)) {
                            return false;
                        }
                    }
                    break;
                case 9:
                    if (BA.j(j5, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (AbstractC0886lz.f9510p.equals(BA.j(j5, obj))) {
                        return false;
                    }
                    break;
                case 11:
                    if (BA.f(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (BA.f(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (BA.f(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (BA.h(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (BA.f(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (BA.h(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (BA.j(j5, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i5 >>> 20)) & BA.f(j4, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean x(Object obj, int i4, int i5, int i6, int i7) {
        return i5 == 1048575 ? w(i4, obj) : (i6 & i7) != 0;
    }

    public final boolean z(int i4, int i5, Object obj) {
        return BA.f((long) (this.f8467a[i5 + 2] & 1048575), obj) == i4;
    }
}
