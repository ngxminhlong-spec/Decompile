package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class W1 implements InterfaceC0634g2 {

    /* renamed from: a, reason: collision with root package name */
    public final J1 f7332a;

    /* renamed from: b, reason: collision with root package name */
    public final X f7333b = new X(10, new byte[10]);
    public int c = 0;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public Sr f7334e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f7335f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7336g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f7337h;

    /* renamed from: i, reason: collision with root package name */
    public int f7338i;

    /* renamed from: j, reason: collision with root package name */
    public int f7339j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f7340k;

    public W1(J1 j12) {
        this.f7332a = j12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.google.android.gms.internal.ads.X] */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.google.android.gms.internal.ads.J1] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    @Override // com.google.android.gms.internal.ads.InterfaceC0634g2
    public final void a(int i4, C1134rq c1134rq) {
        int i5;
        int i6;
        int i7;
        int i8;
        long j4;
        long j5;
        int i9;
        Zf.C(this.f7334e);
        int i10 = i4 & 1;
        ?? r32 = this.f7332a;
        int i11 = -1;
        int i12 = 2;
        ?? r7 = 0;
        if (i10 != 0) {
            int i13 = this.c;
            if (i13 != 0 && i13 != 1) {
                if (i13 != 2) {
                    int i14 = this.f7339j;
                    if (i14 != -1) {
                        Wj.l("PesReader", "Unexpected start indicator: expected " + i14 + " more bytes");
                    }
                    r32.g(c1134rq.c == 0);
                } else {
                    Wj.l("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            this.c = 1;
            this.d = 0;
        }
        int i15 = i4;
        while (c1134rq.g() > 0) {
            int i16 = this.c;
            if (i16 != 0) {
                ?? r10 = this.f7333b;
                if (i16 != 1) {
                    if (i16 != i12) {
                        int g4 = c1134rq.g();
                        int i17 = this.f7339j;
                        int i18 = i17 == i11 ? r7 : g4 - i17;
                        if (i18 > 0) {
                            g4 -= i18;
                            c1134rq.d(c1134rq.f10537b + g4);
                        }
                        r32.f(c1134rq);
                        int i19 = this.f7339j;
                        if (i19 != i11) {
                            int i20 = i19 - g4;
                            this.f7339j = i20;
                            if (i20 == 0) {
                                r32.g(r7);
                                this.c = 1;
                                this.d = r7;
                            }
                        }
                    } else {
                        if (b(c1134rq, r10.f7583a, Math.min(10, this.f7338i)) && b(c1134rq, null, this.f7338i)) {
                            r10.q(r7);
                            if (this.f7335f) {
                                r10.s(4);
                                long f4 = r10.f(3);
                                r10.s(1);
                                int f5 = r10.f(15) << 15;
                                r10.s(1);
                                long f6 = r10.f(15);
                                r10.s(1);
                                if (this.f7337h || !this.f7336g) {
                                    j5 = f4;
                                    i9 = f5;
                                } else {
                                    r10.s(4);
                                    j5 = f4;
                                    r10.s(1);
                                    int f7 = r10.f(15) << 15;
                                    r10.s(1);
                                    long f8 = r10.f(15);
                                    r10.s(1);
                                    i9 = f5;
                                    this.f7334e.b(f8 | (r10.f(3) << 30) | f7);
                                    this.f7337h = true;
                                }
                                j4 = this.f7334e.b(f6 | (j5 << 30) | i9);
                            } else {
                                j4 = -9223372036854775807L;
                            }
                            i15 |= true != this.f7340k ? 0 : 4;
                            r32.i(i15, j4);
                            this.c = 3;
                            this.d = 0;
                            r7 = 0;
                            i11 = -1;
                            i12 = 2;
                        }
                    }
                    i5 = i11;
                    i6 = r7;
                    i7 = i12;
                } else {
                    i6 = r7;
                    if (b(c1134rq, r10.f7583a, 9)) {
                        r10.q(i6);
                        int f9 = r10.f(24);
                        if (f9 != 1) {
                            U.a.p(f9, "Unexpected start code prefix: ", "PesReader");
                            this.f7339j = -1;
                            i5 = -1;
                            i8 = 0;
                            i7 = 2;
                        } else {
                            r10.s(8);
                            int f10 = r10.f(16);
                            r10.s(5);
                            this.f7340k = r10.t();
                            i7 = 2;
                            r10.s(2);
                            this.f7335f = r10.t();
                            this.f7336g = r10.t();
                            r10.s(6);
                            int f11 = r10.f(8);
                            this.f7338i = f11;
                            i5 = -1;
                            if (f10 == 0) {
                                this.f7339j = -1;
                            } else {
                                int i21 = (f10 - 3) - f11;
                                this.f7339j = i21;
                                if (i21 < 0) {
                                    U.a.p(i21, "Found negative packet payload size: ", "PesReader");
                                    this.f7339j = -1;
                                }
                            }
                            i8 = 2;
                        }
                        this.c = i8;
                        i6 = 0;
                        this.d = 0;
                    } else {
                        i7 = 2;
                        i5 = -1;
                    }
                }
            } else {
                i5 = i11;
                i6 = r7;
                i7 = i12;
                c1134rq.f(c1134rq.g());
            }
            i12 = i7;
            r7 = i6;
            i11 = i5;
        }
    }

    public final boolean b(C1134rq c1134rq, byte[] bArr, int i4) {
        int min = Math.min(c1134rq.g(), i4 - this.d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            c1134rq.f(min);
        } else {
            c1134rq.a(bArr, this.d, min);
        }
        int i5 = this.d + min;
        this.d = i5;
        return i5 == i4;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0634g2
    public final void d(Sr sr, D d, C0591f2 c0591f2) {
        this.f7334e = sr;
        this.f7332a.h(d, c0591f2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0634g2
    public final void e() {
        this.c = 0;
        this.d = 0;
        this.f7337h = false;
        this.f7332a.a();
    }
}
