package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.logging.Logger;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.sA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1155sA {

    /* renamed from: f, reason: collision with root package name */
    public static final C1155sA f10596f = new C1155sA(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f10597a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f10598b;
    public Object[] c;
    public int d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10599e;

    public C1155sA(int i4, int[] iArr, Object[] objArr, boolean z4) {
        this.f10597a = i4;
        this.f10598b = iArr;
        this.c = objArr;
        this.f10599e = z4;
    }

    public static C1155sA b() {
        return new C1155sA(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int z4;
        int i4 = this.d;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.f10597a; i6++) {
            int i7 = this.f10598b[i6];
            int i8 = i7 >>> 3;
            int i9 = i7 & 7;
            if (i9 != 0) {
                if (i9 == 1) {
                    ((Long) this.c[i6]).getClass();
                    z4 = AbstractC1229tz.z(i8 << 3) + 8;
                } else if (i9 == 2) {
                    int i10 = i8 << 3;
                    AbstractC0886lz abstractC0886lz = (AbstractC0886lz) this.c[i6];
                    Logger logger = AbstractC1229tz.c;
                    int l4 = abstractC0886lz.l();
                    i5 = U.a.c(i10, AbstractC1229tz.z(l4) + l4, i5);
                } else if (i9 == 3) {
                    int i11 = i8 << 3;
                    Logger logger2 = AbstractC1229tz.c;
                    int a4 = ((C1155sA) this.c[i6]).a();
                    int z5 = AbstractC1229tz.z(i11);
                    z4 = z5 + z5 + a4;
                } else {
                    if (i9 != 5) {
                        throw new IllegalStateException(Oz.a());
                    }
                    ((Integer) this.c[i6]).getClass();
                    z4 = AbstractC1229tz.z(i8 << 3) + 4;
                }
                i5 = z4 + i5;
            } else {
                i5 = U.a.c(i8 << 3, AbstractC1229tz.A(((Long) this.c[i6]).longValue()), i5);
            }
        }
        this.d = i5;
        return i5;
    }

    public final void c(int i4, Object obj) {
        if (!this.f10599e) {
            throw new UnsupportedOperationException();
        }
        e(this.f10597a + 1);
        int[] iArr = this.f10598b;
        int i5 = this.f10597a;
        iArr[i5] = i4;
        this.c[i5] = obj;
        this.f10597a = i5 + 1;
    }

    public final void d(C1384xi c1384xi) {
        if (this.f10597a != 0) {
            for (int i4 = 0; i4 < this.f10597a; i4++) {
                int i5 = this.f10598b[i4];
                Object obj = this.c[i4];
                int i6 = i5 & 7;
                int i7 = i5 >>> 3;
                if (i6 == 0) {
                    ((AbstractC1229tz) c1384xi.f11290p).Q(i7, ((Long) obj).longValue());
                } else if (i6 == 1) {
                    ((AbstractC1229tz) c1384xi.f11290p).H(i7, ((Long) obj).longValue());
                } else if (i6 == 2) {
                    ((AbstractC1229tz) c1384xi.f11290p).E(i7, (AbstractC0886lz) obj);
                } else if (i6 == 3) {
                    ((AbstractC1229tz) c1384xi.f11290p).N(i7, 3);
                    ((C1155sA) obj).d(c1384xi);
                    ((AbstractC1229tz) c1384xi.f11290p).N(i7, 4);
                } else {
                    if (i6 != 5) {
                        throw new RuntimeException(Oz.a());
                    }
                    ((AbstractC1229tz) c1384xi.f11290p).F(i7, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final void e(int i4) {
        int[] iArr = this.f10598b;
        if (i4 > iArr.length) {
            int i5 = this.f10597a;
            int i6 = (i5 / 2) + i5;
            if (i6 >= i4) {
                i4 = i6;
            }
            if (i4 < 8) {
                i4 = 8;
            }
            this.f10598b = Arrays.copyOf(iArr, i4);
            this.c = Arrays.copyOf(this.c, i4);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1155sA)) {
            return false;
        }
        C1155sA c1155sA = (C1155sA) obj;
        int i4 = this.f10597a;
        if (i4 == c1155sA.f10597a) {
            int[] iArr = this.f10598b;
            int[] iArr2 = c1155sA.f10598b;
            int i5 = 0;
            while (true) {
                if (i5 >= i4) {
                    Object[] objArr = this.c;
                    Object[] objArr2 = c1155sA.c;
                    int i6 = this.f10597a;
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
        int i4 = this.f10597a;
        int i5 = i4 + 527;
        int[] iArr = this.f10598b;
        int i6 = 17;
        int i7 = 17;
        for (int i8 = 0; i8 < i4; i8++) {
            i7 = (i7 * 31) + iArr[i8];
        }
        int i9 = ((i5 * 31) + i7) * 31;
        Object[] objArr = this.c;
        int i10 = this.f10597a;
        for (int i11 = 0; i11 < i10; i11++) {
            i6 = (i6 * 31) + objArr[i11].hashCode();
        }
        return i9 + i6;
    }
}
