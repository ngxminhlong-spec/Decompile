package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.play_billing.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1628n0 {

    /* renamed from: f, reason: collision with root package name */
    public static final C1628n0 f12233f = new C1628n0(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f12234a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f12235b;
    public Object[] c;
    public int d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f12236e;

    public C1628n0(int i4, int[] iArr, Object[] objArr, boolean z4) {
        this.f12234a = i4;
        this.f12235b = iArr;
        this.c = objArr;
        this.f12236e = z4;
    }

    public static C1628n0 b() {
        return new C1628n0(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int l02;
        int m02;
        int l03;
        int i4 = this.d;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.f12234a; i6++) {
            int i7 = this.f12235b[i6];
            int i8 = i7 >>> 3;
            int i9 = i7 & 7;
            if (i9 != 0) {
                if (i9 == 1) {
                    ((Long) this.c[i6]).getClass();
                    l03 = C1640u.l0(i8 << 3) + 8;
                } else if (i9 == 2) {
                    int i10 = i8 << 3;
                    C1638t c1638t = (C1638t) this.c[i6];
                    int l04 = C1640u.l0(i10);
                    int j4 = c1638t.j();
                    i5 = U.a.s(j4, j4, l04, i5);
                } else if (i9 == 3) {
                    int l05 = C1640u.l0(i8 << 3);
                    l02 = l05 + l05;
                    m02 = ((C1628n0) this.c[i6]).a();
                } else {
                    if (i9 != 5) {
                        int i11 = M.f12153o;
                        throw new IllegalStateException(new IOException("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.c[i6]).getClass();
                    l03 = C1640u.l0(i8 << 3) + 4;
                }
                i5 = l03 + i5;
            } else {
                int i12 = i8 << 3;
                long longValue = ((Long) this.c[i6]).longValue();
                l02 = C1640u.l0(i12);
                m02 = C1640u.m0(longValue);
            }
            i5 = m02 + l02 + i5;
        }
        this.d = i5;
        return i5;
    }

    public final void c(int i4, Object obj) {
        if (!this.f12236e) {
            throw new UnsupportedOperationException();
        }
        e(this.f12234a + 1);
        int[] iArr = this.f12235b;
        int i5 = this.f12234a;
        iArr[i5] = i4;
        this.c[i5] = obj;
        this.f12234a = i5 + 1;
    }

    public final void d(W w2) {
        if (this.f12234a != 0) {
            for (int i4 = 0; i4 < this.f12234a; i4++) {
                int i5 = this.f12235b[i4];
                Object obj = this.c[i4];
                int i6 = i5 & 7;
                int i7 = i5 >>> 3;
                if (i6 == 0) {
                    ((C1640u) w2.f12171a).i0(i7, ((Long) obj).longValue());
                } else if (i6 == 1) {
                    ((C1640u) w2.f12171a).a0(i7, ((Long) obj).longValue());
                } else if (i6 == 2) {
                    ((C1640u) w2.f12171a).X(i7, (C1638t) obj);
                } else if (i6 == 3) {
                    ((C1640u) w2.f12171a).f0(i7, 3);
                    ((C1628n0) obj).d(w2);
                    ((C1640u) w2.f12171a).f0(i7, 4);
                } else {
                    if (i6 != 5) {
                        int i8 = M.f12153o;
                        throw new RuntimeException(new IOException("Protocol message tag had invalid wire type."));
                    }
                    ((C1640u) w2.f12171a).Y(i7, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final void e(int i4) {
        int[] iArr = this.f12235b;
        if (i4 > iArr.length) {
            int i5 = this.f12234a;
            int i6 = (i5 / 2) + i5;
            if (i6 >= i4) {
                i4 = i6;
            }
            if (i4 < 8) {
                i4 = 8;
            }
            this.f12235b = Arrays.copyOf(iArr, i4);
            this.c = Arrays.copyOf(this.c, i4);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1628n0)) {
            return false;
        }
        C1628n0 c1628n0 = (C1628n0) obj;
        int i4 = this.f12234a;
        if (i4 == c1628n0.f12234a) {
            int[] iArr = this.f12235b;
            int[] iArr2 = c1628n0.f12235b;
            int i5 = 0;
            while (true) {
                if (i5 >= i4) {
                    Object[] objArr = this.c;
                    Object[] objArr2 = c1628n0.c;
                    int i6 = this.f12234a;
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
        int i4 = this.f12234a;
        int i5 = i4 + 527;
        int[] iArr = this.f12235b;
        int i6 = 17;
        int i7 = 17;
        for (int i8 = 0; i8 < i4; i8++) {
            i7 = (i7 * 31) + iArr[i8];
        }
        int i9 = ((i5 * 31) + i7) * 31;
        Object[] objArr = this.c;
        int i10 = this.f12234a;
        for (int i11 = 0; i11 < i10; i11++) {
            i6 = (i6 * 31) + objArr[i11].hashCode();
        }
        return i9 + i6;
    }
}
