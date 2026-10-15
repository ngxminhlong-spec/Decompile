package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0802k0 implements B {
    public D d;

    /* renamed from: e, reason: collision with root package name */
    public V f9243e;

    /* renamed from: g, reason: collision with root package name */
    public C1120rc f9245g;

    /* renamed from: h, reason: collision with root package name */
    public H f9246h;

    /* renamed from: i, reason: collision with root package name */
    public int f9247i;

    /* renamed from: j, reason: collision with root package name */
    public int f9248j;

    /* renamed from: k, reason: collision with root package name */
    public C0759j0 f9249k;

    /* renamed from: l, reason: collision with root package name */
    public int f9250l;

    /* renamed from: m, reason: collision with root package name */
    public long f9251m;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f9241a = new byte[42];

    /* renamed from: b, reason: collision with root package name */
    public final C1134rq f9242b = new C1134rq(0, new byte[32768]);
    public final F c = new Object();

    /* renamed from: f, reason: collision with root package name */
    public int f9244f = 0;

    @Override // com.google.android.gms.internal.ads.B
    public final boolean d(C c) {
        C1120rc g4 = new C0874ln(3).g(c, BF.f4073r);
        if (g4 != null) {
            int length = g4.f10477o.length;
        }
        C1134rq c1134rq = new C1134rq(4);
        ((C1316w) c).E(c1134rq.f10536a, 0, 4, false);
        return c1134rq.u() == 1716281667;
    }

    @Override // com.google.android.gms.internal.ads.B
    public final void g(D d) {
        this.d = d;
        this.f9243e = d.z(0, 1);
        d.x();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v9 */
    @Override // com.google.android.gms.internal.ads.B
    public final int h(C c, F f4) {
        H h4;
        int i4;
        P g4;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        boolean z4;
        int i5 = this.f9244f;
        int i6 = 3;
        C1120rc c1120rc = null;
        if (i5 == 0) {
            ((C1316w) c).f11102t = 0;
            C1316w c1316w = (C1316w) c;
            long a4 = c1316w.a();
            C1120rc g5 = new C0874ln(3).g(c, null);
            if (g5 != null && g5.f10477o.length != 0) {
                c1120rc = g5;
            }
            c1316w.f((int) (c1316w.a() - a4));
            this.f9245g = c1120rc;
            this.f9244f = 1;
            return 0;
        }
        byte[] bArr = this.f9241a;
        if (i5 == 1) {
            C1316w c1316w2 = (C1316w) c;
            c1316w2.E(bArr, 0, 42, false);
            c1316w2.f11102t = 0;
            this.f9244f = 2;
            return 0;
        }
        if (i5 == 2) {
            C1134rq c1134rq = new C1134rq(4);
            ((C1316w) c).C(c1134rq.f10536a, 0, 4, false);
            if (c1134rq.u() != 1716281667) {
                throw C0907md.a("Failed to read FLAC stream marker.", null);
            }
            this.f9244f = 3;
            return 0;
        }
        if (i5 != 3) {
            long j9 = 0;
            if (i5 == 4) {
                ((C1316w) c).f11102t = 0;
                C1134rq c1134rq2 = new C1134rq(2);
                C1316w c1316w3 = (C1316w) c;
                c1316w3.E(c1134rq2.f10536a, 0, 2, false);
                int q4 = c1134rq2.q();
                if ((q4 >> 2) != 16382) {
                    c1316w3.f11102t = 0;
                    throw C0907md.a("First frame does not start with sync code.", null);
                }
                c1316w3.f11102t = 0;
                this.f9248j = q4;
                D d = this.d;
                int i7 = AbstractC0751is.f9071a;
                long j10 = c1316w3.f11100r;
                long j11 = c1316w3.f11099q;
                H h5 = this.f9246h;
                h5.getClass();
                if (h5.f5362k != null) {
                    g4 = new G(h5, j10, 0);
                    i4 = 0;
                } else if (j11 == -1 || h5.f5361j <= 0) {
                    i4 = 0;
                    g4 = new G(h5.a(), 0L);
                } else {
                    int i8 = this.f9248j;
                    C0874ln c0874ln = new C0874ln(4, h5);
                    J2 j22 = new J2(h5, i8);
                    long a5 = h5.a();
                    int i9 = h5.c;
                    long j12 = h5.f5361j;
                    int i10 = h5.d;
                    if (i10 > 0) {
                        i4 = 0;
                        j4 = j11;
                        j5 = j12;
                        j6 = (i10 + i9) / 2;
                        j7 = 1;
                    } else {
                        i4 = 0;
                        j4 = j11;
                        j5 = j12;
                        int i11 = h5.f5354a;
                        long j13 = 4096;
                        if (i11 == h5.f5355b && i11 > 0) {
                            j13 = i11;
                        }
                        j6 = ((j13 * h5.f5358g) * h5.f5359h) / 8;
                        j7 = 64;
                    }
                    C0759j0 c0759j0 = new C0759j0(c0874ln, j22, a5, j5, j10, j4, j6 + j7, Math.max(6, i9));
                    this.f9249k = c0759j0;
                    g4 = c0759j0.f9112a;
                }
                d.B(g4);
                this.f9244f = 5;
                return i4;
            }
            this.f9243e.getClass();
            this.f9246h.getClass();
            C0759j0 c0759j02 = this.f9249k;
            if (c0759j02 != null && c0759j02.c != null) {
                return c0759j02.a(c, f4);
            }
            if (this.f9251m == -1) {
                ((C1316w) c).f11102t = 0;
                C1316w c1316w4 = (C1316w) c;
                c1316w4.c(1, false);
                byte[] bArr2 = new byte[1];
                c1316w4.E(bArr2, 0, 1, false);
                int i12 = bArr2[0] & 1;
                boolean z5 = 1 == i12;
                c1316w4.c(2, false);
                r10 = 1 != i12 ? 6 : 7;
                C1134rq c1134rq3 = new C1134rq(r10);
                byte[] bArr3 = c1134rq3.f10536a;
                int i13 = 0;
                while (i13 < r10) {
                    int D4 = c1316w4.D(bArr3, i13, r10 - i13);
                    if (D4 == -1) {
                        break;
                    }
                    i13 += D4;
                }
                c1134rq3.d(i13);
                c1316w4.f11102t = 0;
                try {
                    long w2 = c1134rq3.w();
                    if (!z5) {
                        w2 *= r2.f5355b;
                    }
                    j9 = w2;
                } catch (NumberFormatException unused) {
                    r5 = false;
                }
                if (!r5) {
                    throw C0907md.a(null, null);
                }
                this.f9251m = j9;
            } else {
                C1134rq c1134rq4 = this.f9242b;
                int i14 = c1134rq4.c;
                if (i14 < 32768) {
                    int r4 = ((C1316w) c).r(c1134rq4.f10536a, i14, 32768 - i14);
                    r5 = r4 == -1;
                    if (!r5) {
                        c1134rq4.d(i14 + r4);
                    } else if (c1134rq4.g() == 0) {
                        long j14 = this.f9251m * 1000000;
                        H h6 = this.f9246h;
                        int i15 = AbstractC0751is.f9071a;
                        this.f9243e.d(j14 / h6.f5356e, 1, this.f9250l, 0, null);
                        return -1;
                    }
                } else {
                    r5 = false;
                }
                int i16 = c1134rq4.f10537b;
                int i17 = this.f9250l;
                int i18 = this.f9247i;
                if (i17 < i18) {
                    c1134rq4.f(Math.min(i18 - i17, c1134rq4.g()));
                }
                this.f9246h.getClass();
                int i19 = c1134rq4.f10537b;
                while (true) {
                    int i20 = c1134rq4.c - 16;
                    F f5 = this.c;
                    if (i19 <= i20) {
                        c1134rq4.e(i19);
                        if (AbstractC1230u.M(c1134rq4, this.f9246h, this.f9248j, f5)) {
                            c1134rq4.e(i19);
                            j8 = f5.f4964a;
                            break;
                        }
                        i19++;
                    } else {
                        if (r5) {
                            while (true) {
                                int i21 = c1134rq4.c;
                                if (i19 > i21 - this.f9247i) {
                                    c1134rq4.e(i21);
                                    break;
                                }
                                c1134rq4.e(i19);
                                try {
                                    z4 = AbstractC1230u.M(c1134rq4, this.f9246h, this.f9248j, f5);
                                } catch (IndexOutOfBoundsException unused2) {
                                    z4 = false;
                                }
                                if (c1134rq4.f10537b <= c1134rq4.c && z4) {
                                    c1134rq4.e(i19);
                                    j8 = f5.f4964a;
                                    break;
                                }
                                i19++;
                            }
                        } else {
                            c1134rq4.e(i19);
                        }
                        j8 = -1;
                    }
                }
                int i22 = c1134rq4.f10537b - i16;
                c1134rq4.e(i16);
                this.f9243e.c(i22, c1134rq4);
                int i23 = this.f9250l + i22;
                this.f9250l = i23;
                if (j8 != -1) {
                    long j15 = this.f9251m * 1000000;
                    H h7 = this.f9246h;
                    int i24 = AbstractC0751is.f9071a;
                    this.f9243e.d(j15 / h7.f5356e, 1, i23, 0, null);
                    this.f9250l = 0;
                    this.f9251m = j8;
                }
                if (c1134rq4.g() < 16) {
                    int g6 = c1134rq4.g();
                    byte[] bArr4 = c1134rq4.f10536a;
                    System.arraycopy(bArr4, c1134rq4.f10537b, bArr4, 0, g6);
                    c1134rq4.e(0);
                    c1134rq4.d(g6);
                    return 0;
                }
            }
            return 0;
        }
        ?? r15 = 0;
        H h8 = this.f9246h;
        while (true) {
            ((C1316w) c).f11102t = r15;
            byte[] bArr5 = new byte[4];
            X x4 = new X(4, bArr5);
            C1316w c1316w5 = (C1316w) c;
            c1316w5.E(bArr5, r15, 4, r15);
            boolean t4 = x4.t();
            int f6 = x4.f(r10);
            int f7 = x4.f(24) + 4;
            if (f6 == 0) {
                byte[] bArr6 = new byte[38];
                c1316w5.C(bArr6, r15, 38, r15);
                h8 = new H(4, bArr6);
            } else {
                if (h8 == null) {
                    throw new IllegalArgumentException();
                }
                C1120rc c1120rc2 = h8.f5363l;
                if (f6 == i6) {
                    C1134rq c1134rq5 = new C1134rq(f7);
                    c1316w5.C(c1134rq5.f10536a, r15, f7, r15);
                    h4 = new H(h8.f5354a, h8.f5355b, h8.c, h8.d, h8.f5356e, h8.f5358g, h8.f5359h, h8.f5361j, AbstractC1230u.x(c1134rq5), h8.f5363l);
                } else if (f6 == 4) {
                    C1134rq c1134rq6 = new C1134rq(f7);
                    c1316w5.C(c1134rq6.f10536a, 0, f7, false);
                    c1134rq6.f(4);
                    C1120rc w4 = AbstractC1230u.w(Arrays.asList((String[]) AbstractC1230u.H(c1134rq6, false, false).f6208p));
                    if (c1120rc2 != null) {
                        w4 = c1120rc2.b(w4);
                    }
                    h4 = new H(h8.f5354a, h8.f5355b, h8.c, h8.d, h8.f5356e, h8.f5358g, h8.f5359h, h8.f5361j, h8.f5362k, w4);
                } else if (f6 == 6) {
                    C1134rq c1134rq7 = new C1134rq(f7);
                    c1316w5.C(c1134rq7.f10536a, 0, f7, false);
                    c1134rq7.f(4);
                    C1120rc c1120rc3 = new C1120rc(AbstractC1137rt.t(C1274v0.a(c1134rq7)));
                    if (c1120rc2 != null) {
                        c1120rc3 = c1120rc2.b(c1120rc3);
                    }
                    h4 = new H(h8.f5354a, h8.f5355b, h8.c, h8.d, h8.f5356e, h8.f5358g, h8.f5359h, h8.f5361j, h8.f5362k, c1120rc3);
                } else {
                    c1316w5.f(f7);
                }
                h8 = h4;
            }
            int i25 = AbstractC0751is.f9071a;
            this.f9246h = h8;
            if (t4) {
                this.f9247i = Math.max(h8.c, 6);
                this.f9243e.a(this.f9246h.b(bArr, this.f9245g));
                this.f9244f = 4;
                return 0;
            }
            r15 = 0;
            i6 = 3;
            r10 = 7;
        }
    }

    @Override // com.google.android.gms.internal.ads.B
    public final void i(long j4, long j5) {
        if (j4 == 0) {
            this.f9244f = 0;
        } else {
            C0759j0 c0759j0 = this.f9249k;
            if (c0759j0 != null) {
                c0759j0.b(j5);
            }
        }
        this.f9251m = j5 != 0 ? -1L : 0L;
        this.f9250l = 0;
        this.f9242b.b(0);
    }
}
