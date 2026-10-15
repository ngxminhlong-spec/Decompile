package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.x1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1361x1 implements B {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11229a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f11230b;
    public Object c;
    public Object d;

    public C1361x1(int i4) {
        this.f11229a = i4;
        switch (i4) {
            case 1:
                this.c = new E1(null, 0);
                this.d = new C1134rq(2786);
                return;
            case 2:
                this.c = new E1(null, 1);
                this.d = new C1134rq(16384);
                return;
            default:
                return;
        }
    }

    public boolean a(C c) {
        C1447z1 c1447z1 = new C1447z1();
        if (c1447z1.a(c, true) && (c1447z1.f11563a & 2) == 2) {
            int min = Math.min(c1447z1.f11565e, 8);
            C1134rq c1134rq = new C1134rq(min);
            ((C1316w) c).E(c1134rq.f10536a, 0, min, false);
            c1134rq.e(0);
            if (c1134rq.g() >= 5 && c1134rq.m() == 127 && c1134rq.u() == 1179402563) {
                this.d = new C1();
                return true;
            }
            c1134rq.e(0);
            try {
                if (AbstractC1230u.T(1, c1134rq, true)) {
                    this.d = new C1();
                    return true;
                }
            } catch (C0907md unused) {
            }
            c1134rq.e(0);
            if (B1.e(c1134rq, B1.f4019o)) {
                this.d = new C1();
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.B
    public final boolean d(C c) {
        int n4;
        int i4;
        switch (this.f11229a) {
            case 0:
                try {
                    return a(c);
                } catch (C0907md unused) {
                    return false;
                }
            case 1:
                C1134rq c1134rq = new C1134rq(10);
                int i5 = 0;
                while (true) {
                    C1316w c1316w = (C1316w) c;
                    c1316w.E(c1134rq.f10536a, 0, 10, false);
                    c1134rq.e(0);
                    if (c1134rq.o() != 4801587) {
                        c1316w.f11102t = 0;
                        c1316w.c(i5, false);
                        int i6 = 0;
                        int i7 = i5;
                        while (true) {
                            c1316w.E(c1134rq.f10536a, 0, 6, false);
                            c1134rq.e(0);
                            if (c1134rq.q() != 2935) {
                                c1316w.f11102t = 0;
                                i7++;
                                if (i7 - i5 >= 8192) {
                                    return false;
                                }
                                c1316w.c(i7, false);
                                i6 = 0;
                            } else {
                                i6++;
                                if (i6 >= 4) {
                                    return true;
                                }
                                byte[] bArr = c1134rq.f10536a;
                                if (bArr.length < 6) {
                                    n4 = -1;
                                } else if (((bArr[5] & 248) >> 3) > 10) {
                                    int i8 = (((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1;
                                    n4 = i8 + i8;
                                } else {
                                    byte b4 = bArr[4];
                                    n4 = Y9.n((b4 & 192) >> 6, b4 & 63);
                                }
                                if (n4 == -1) {
                                    return false;
                                }
                                c1316w.c(n4 - 6, false);
                            }
                        }
                    } else {
                        c1134rq.f(3);
                        int l4 = c1134rq.l();
                        i5 += l4 + 10;
                        c1316w.c(l4, false);
                    }
                }
            default:
                C1134rq c1134rq2 = new C1134rq(10);
                int i9 = 0;
                while (true) {
                    C1316w c1316w2 = (C1316w) c;
                    c1316w2.E(c1134rq2.f10536a, 0, 10, false);
                    c1134rq2.e(0);
                    if (c1134rq2.o() != 4801587) {
                        c1316w2.f11102t = 0;
                        c1316w2.c(i9, false);
                        int i10 = 0;
                        int i11 = i9;
                        while (true) {
                            int i12 = 7;
                            c1316w2.E(c1134rq2.f10536a, 0, 7, false);
                            c1134rq2.e(0);
                            int q4 = c1134rq2.q();
                            if (q4 == 44096 || q4 == 44097) {
                                i10++;
                                if (i10 >= 4) {
                                    return true;
                                }
                                byte[] bArr2 = c1134rq2.f10536a;
                                if (bArr2.length < 7) {
                                    i4 = -1;
                                } else {
                                    int i13 = ((bArr2[2] & 255) << 8) | (bArr2[3] & 255);
                                    if (i13 == 65535) {
                                        i13 = ((bArr2[4] & 255) << 16) | ((bArr2[5] & 255) << 8) | (bArr2[6] & 255);
                                    } else {
                                        i12 = 4;
                                    }
                                    if (q4 == 44097) {
                                        i12 += 2;
                                    }
                                    i4 = i13 + i12;
                                }
                                if (i4 == -1) {
                                    return false;
                                }
                                c1316w2.c(i4 - 7, false);
                            } else {
                                c1316w2.f11102t = 0;
                                i11++;
                                if (i11 - i9 >= 8192) {
                                    return false;
                                }
                                c1316w2.c(i11, false);
                                i10 = 0;
                            }
                        }
                    } else {
                        c1134rq2.f(3);
                        int l5 = c1134rq2.l();
                        i9 += l5 + 10;
                        c1316w2.c(l5, false);
                    }
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.B
    public final void g(D d) {
        switch (this.f11229a) {
            case 0:
                this.c = d;
                return;
            case 1:
                ((E1) this.c).h(d, new C0591f2(Integer.MIN_VALUE, 0, 1));
                d.x();
                d.B(new G(-9223372036854775807L, 0L));
                return;
            default:
                ((E1) this.c).h(d, new C0591f2(Integer.MIN_VALUE, 0, 1));
                d.x();
                d.B(new G(-9223372036854775807L, 0L));
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x01d6  */
    @Override // com.google.android.gms.internal.ads.B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(com.google.android.gms.internal.ads.C r22, com.google.android.gms.internal.ads.F r23) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1361x1.h(com.google.android.gms.internal.ads.C, com.google.android.gms.internal.ads.F):int");
    }

    @Override // com.google.android.gms.internal.ads.B
    public final void i(long j4, long j5) {
        switch (this.f11229a) {
            case 0:
                C1 c12 = (C1) this.d;
                if (c12 != null) {
                    C1404y1 c1404y1 = c12.f4215a;
                    C1447z1 c1447z1 = c1404y1.f11325a;
                    c1447z1.f11563a = 0;
                    c1447z1.f11564b = 0L;
                    c1447z1.c = 0;
                    c1447z1.d = 0;
                    c1447z1.f11565e = 0;
                    c1404y1.f11326b.b(0);
                    c1404y1.c = -1;
                    c1404y1.f11327e = false;
                    if (j4 == 0) {
                        c12.b(!c12.f4224l);
                        return;
                    }
                    if (c12.f4220h != 0) {
                        long j6 = (c12.f4221i * j5) / 1000000;
                        c12.f4217e = j6;
                        A1 a12 = c12.d;
                        int i4 = AbstractC0751is.f9071a;
                        a12.c(j6);
                        c12.f4220h = 2;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                this.f11230b = false;
                ((E1) this.c).a();
                return;
            default:
                this.f11230b = false;
                ((E1) this.c).a();
                return;
        }
    }
}
