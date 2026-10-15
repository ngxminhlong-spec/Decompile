package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.measurement.o2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1557o2 {

    /* renamed from: f, reason: collision with root package name */
    public static final C1557o2 f11992f = new C1557o2(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f11993a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f11994b;
    public Object[] c;
    public int d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f11995e;

    public C1557o2(int i4, int[] iArr, Object[] objArr, boolean z4) {
        this.f11993a = i4;
        this.f11994b = iArr;
        this.c = objArr;
        this.f11995e = z4;
    }

    public static C1557o2 b() {
        return new C1557o2(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int L4;
        int M4;
        int i4 = this.d;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.f11993a; i6++) {
            int i7 = this.f11994b[i6];
            int i8 = i7 >>> 3;
            int i9 = i7 & 7;
            if (i9 != 0) {
                if (i9 == 1) {
                    ((Long) this.c[i6]).getClass();
                    i5 = U.a.r(i8 << 3, 8, i5);
                } else if (i9 == 2) {
                    C1591x1 c1591x1 = (C1591x1) this.c[i6];
                    int L5 = C1595y1.L(i8 << 3);
                    int j4 = c1591x1.j();
                    i5 = U.a.d(j4, j4, L5, i5);
                } else if (i9 == 3) {
                    int c02 = C1595y1.c0(i8);
                    L4 = c02 + c02;
                    M4 = ((C1557o2) this.c[i6]).a();
                } else {
                    if (i9 != 5) {
                        int i10 = Q1.f11805o;
                        throw new IllegalStateException(new IOException("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.c[i6]).getClass();
                    i5 = U.a.r(i8 << 3, 4, i5);
                }
            } else {
                long longValue = ((Long) this.c[i6]).longValue();
                L4 = C1595y1.L(i8 << 3);
                M4 = C1595y1.M(longValue);
            }
            i5 = M4 + L4 + i5;
        }
        this.d = i5;
        return i5;
    }

    public final void c(int i4, Object obj) {
        if (!this.f11995e) {
            throw new UnsupportedOperationException();
        }
        int i5 = this.f11993a;
        int[] iArr = this.f11994b;
        if (i5 == iArr.length) {
            int i6 = i5 + (i5 < 4 ? 8 : i5 >> 1);
            this.f11994b = Arrays.copyOf(iArr, i6);
            this.c = Arrays.copyOf(this.c, i6);
        }
        int[] iArr2 = this.f11994b;
        int i7 = this.f11993a;
        iArr2[i7] = i4;
        this.c[i7] = obj;
        this.f11993a = i7 + 1;
    }

    public final void d(C1599z1 c1599z1) {
        if (this.f11993a != 0) {
            for (int i4 = 0; i4 < this.f11993a; i4++) {
                int i5 = this.f11994b[i4];
                Object obj = this.c[i4];
                int i6 = i5 >>> 3;
                int i7 = i5 & 7;
                if (i7 == 0) {
                    ((C1595y1) c1599z1.f12124p).X(i6, ((Long) obj).longValue());
                } else if (i7 == 1) {
                    ((C1595y1) c1599z1.f12124p).S(i6, ((Long) obj).longValue());
                } else if (i7 == 2) {
                    c1599z1.d(i6, (C1591x1) obj);
                } else if (i7 == 3) {
                    ((C1595y1) c1599z1.f12124p).V(i6, 3);
                    ((C1557o2) obj).d(c1599z1);
                    ((C1595y1) c1599z1.f12124p).V(i6, 4);
                } else {
                    if (i7 != 5) {
                        int i8 = Q1.f11805o;
                        throw new RuntimeException(new IOException("Protocol message tag had invalid wire type."));
                    }
                    ((C1595y1) c1599z1.f12124p).Q(i6, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1557o2)) {
            return false;
        }
        C1557o2 c1557o2 = (C1557o2) obj;
        int i4 = this.f11993a;
        if (i4 == c1557o2.f11993a) {
            int[] iArr = this.f11994b;
            int[] iArr2 = c1557o2.f11994b;
            int i5 = 0;
            while (true) {
                if (i5 >= i4) {
                    Object[] objArr = this.c;
                    Object[] objArr2 = c1557o2.c;
                    int i6 = this.f11993a;
                    for (int i7 = 0; i7 < i6; i7++) {
                        if (objArr[i7].equals(objArr2[i7])) {
                        }
                    }
                    return true;
                }
                if (iArr[i5] != iArr2[i5]) {
                    break;
                }
                i5++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i4 = this.f11993a;
        int i5 = (i4 + 527) * 31;
        int[] iArr = this.f11994b;
        int i6 = 17;
        int i7 = 17;
        for (int i8 = 0; i8 < i4; i8++) {
            i7 = (i7 * 31) + iArr[i8];
        }
        int i9 = (i5 + i7) * 31;
        Object[] objArr = this.c;
        int i10 = this.f11993a;
        for (int i11 = 0; i11 < i10; i11++) {
            i6 = (i6 * 31) + objArr[i11].hashCode();
        }
        return i9 + i6;
    }
}
