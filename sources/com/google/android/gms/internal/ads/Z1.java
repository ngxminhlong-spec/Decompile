package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import com.google.android.gms.internal.measurement.C1510e1;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Z1 implements B {

    /* renamed from: e, reason: collision with root package name */
    public boolean f7954e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f7955f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7956g;

    /* renamed from: h, reason: collision with root package name */
    public long f7957h;

    /* renamed from: i, reason: collision with root package name */
    public C0759j0 f7958i;

    /* renamed from: j, reason: collision with root package name */
    public D f7959j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f7960k;

    /* renamed from: a, reason: collision with root package name */
    public final Sr f7952a = new Sr();
    public final C1134rq c = new C1134rq(4096);

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f7953b = new SparseArray();
    public final X1 d = new X1(0);

    @Override // com.google.android.gms.internal.ads.B
    public final boolean d(C c) {
        byte[] bArr = new byte[14];
        C1316w c1316w = (C1316w) c;
        c1316w.E(bArr, 0, 14, false);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) == 442 && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            c1316w.c(bArr[13] & 7, false);
            c1316w.E(bArr, 0, 3, false);
            if ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255)) == 1) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.B
    public final void g(D d) {
        this.f7959j = d;
    }

    @Override // com.google.android.gms.internal.ads.B
    public final int h(C c, F f4) {
        int i4;
        long j4;
        J1 m12;
        long j5;
        Zf.C(this.f7959j);
        long j6 = ((C1316w) c).f11099q;
        long j7 = -9223372036854775807L;
        X1 x12 = this.d;
        if (j6 != -1) {
            boolean z4 = x12.c;
            C1134rq c1134rq = x12.f7586b;
            if (!z4) {
                if (!x12.f7587e) {
                    C1316w c1316w = (C1316w) c;
                    long j8 = c1316w.f11099q;
                    int min = (int) Math.min(20000L, j8);
                    long j9 = j8 - min;
                    if (c1316w.f11100r != j9) {
                        f4.f4964a = j9;
                        return 1;
                    }
                    c1134rq.b(min);
                    c1316w.f11102t = 0;
                    c1316w.E(c1134rq.f10536a, 0, min, false);
                    int i5 = c1134rq.f10537b;
                    int i6 = c1134rq.c - 4;
                    while (true) {
                        if (i6 < i5) {
                            break;
                        }
                        if (X1.c(i6, c1134rq.f10536a) == 442) {
                            c1134rq.e(i6 + 4);
                            long a4 = X1.a(c1134rq);
                            if (a4 != -9223372036854775807L) {
                                j7 = a4;
                                break;
                            }
                        }
                        i6--;
                    }
                    x12.f7589g = j7;
                    x12.f7587e = true;
                    return 0;
                }
                if (x12.f7589g == -9223372036854775807L) {
                    byte[] bArr = AbstractC0751is.f9074f;
                    int length = bArr.length;
                    c1134rq.c(0, bArr);
                    x12.c = true;
                    ((C1316w) c).j();
                    return 0;
                }
                if (x12.d) {
                    long j10 = x12.f7588f;
                    if (j10 == -9223372036854775807L) {
                        byte[] bArr2 = AbstractC0751is.f9074f;
                        int length2 = bArr2.length;
                        c1134rq.c(0, bArr2);
                        x12.c = true;
                        ((C1316w) c).j();
                        return 0;
                    }
                    Sr sr = x12.f7585a;
                    long b4 = sr.b(x12.f7589g) - sr.b(j10);
                    x12.f7590h = b4;
                    if (b4 < 0) {
                        Wj.l("PsDurationReader", "Invalid duration: " + b4 + ". Using TIME_UNSET instead.");
                        x12.f7590h = -9223372036854775807L;
                    }
                    byte[] bArr3 = AbstractC0751is.f9074f;
                    int length3 = bArr3.length;
                    c1134rq.c(0, bArr3);
                    x12.c = true;
                    ((C1316w) c).j();
                    return 0;
                }
                C1316w c1316w2 = (C1316w) c;
                int min2 = (int) Math.min(20000L, c1316w2.f11099q);
                if (c1316w2.f11100r != 0) {
                    f4.f4964a = 0L;
                    return 1;
                }
                c1134rq.b(min2);
                c1316w2.f11102t = 0;
                c1316w2.E(c1134rq.f10536a, 0, min2, false);
                int i7 = c1134rq.f10537b;
                int i8 = c1134rq.c;
                while (true) {
                    if (i7 >= i8 - 3) {
                        j5 = -9223372036854775807L;
                        break;
                    }
                    if (X1.c(i7, c1134rq.f10536a) == 442) {
                        c1134rq.e(i7 + 4);
                        long a5 = X1.a(c1134rq);
                        if (a5 != -9223372036854775807L) {
                            j5 = a5;
                            break;
                        }
                    }
                    i7++;
                }
                x12.f7588f = j5;
                x12.d = true;
                return 0;
            }
        }
        if (!this.f7960k) {
            this.f7960k = true;
            long j11 = x12.f7590h;
            if (j11 != -9223372036854775807L) {
                C0759j0 c0759j0 = new C0759j0(new C1016p(0), new C1510e1(x12.f7585a), j11, j11 + 1, 0L, j6, 188L, 1000);
                this.f7958i = c0759j0;
                this.f7959j.B(c0759j0.f9112a);
            } else {
                this.f7959j.B(new G(j11, 0L));
            }
        }
        C0759j0 c0759j02 = this.f7958i;
        if (c0759j02 != null && c0759j02.c != null) {
            return c0759j02.a(c, f4);
        }
        C1316w c1316w3 = (C1316w) c;
        c1316w3.f11102t = 0;
        long a6 = j6 != -1 ? j6 - c1316w3.a() : -1L;
        if (a6 != -1 && a6 < 4) {
            return -1;
        }
        C1134rq c1134rq2 = this.c;
        if (!c1316w3.E(c1134rq2.f10536a, 0, 4, true)) {
            return -1;
        }
        c1134rq2.e(0);
        int h4 = c1134rq2.h();
        if (h4 == 441) {
            return -1;
        }
        if (h4 == 442) {
            c1316w3.E(c1134rq2.f10536a, 0, 10, false);
            c1134rq2.e(9);
            c1316w3.f((c1134rq2.m() & 7) + 14);
            return 0;
        }
        if (h4 == 443) {
            c1316w3.E(c1134rq2.f10536a, 0, 2, false);
            c1134rq2.e(0);
            c1316w3.f(c1134rq2.q() + 6);
            return 0;
        }
        if ((h4 >> 8) != 1) {
            c1316w3.f(1);
            return 0;
        }
        int i9 = h4 & 255;
        SparseArray sparseArray = this.f7953b;
        Y1 y12 = (Y1) sparseArray.get(i9);
        if (!this.f7954e) {
            if (y12 == null) {
                J1 j12 = null;
                if (i9 == 189) {
                    E1 e12 = new E1(null, 0);
                    this.f7955f = true;
                    this.f7957h = c1316w3.f11100r;
                    j12 = e12;
                } else {
                    if ((h4 & 224) == 192) {
                        m12 = new V1(null);
                        this.f7955f = true;
                        this.f7957h = c1316w3.f11100r;
                    } else if ((h4 & 240) == 224) {
                        m12 = new M1(null);
                        this.f7956g = true;
                        this.f7957h = c1316w3.f11100r;
                    }
                    j12 = m12;
                }
                if (j12 != null) {
                    j12.h(this.f7959j, new C0591f2(Integer.MIN_VALUE, i9, 256));
                    y12 = new Y1(j12, this.f7952a);
                    sparseArray.put(i9, y12);
                }
            }
            long j13 = 1048576;
            if (this.f7955f && this.f7956g) {
                j13 = 8192 + this.f7957h;
            }
            if (c1316w3.f11100r > j13) {
                this.f7954e = true;
                this.f7959j.x();
            }
        }
        c1316w3.E(c1134rq2.f10536a, 0, 2, false);
        c1134rq2.e(0);
        int q4 = c1134rq2.q() + 6;
        if (y12 == null) {
            c1316w3.f(q4);
            return 0;
        }
        c1134rq2.b(q4);
        c1316w3.C(c1134rq2.f10536a, 0, q4, false);
        c1134rq2.e(6);
        Sr sr2 = y12.f7726b;
        J1 j14 = y12.f7725a;
        X x4 = y12.c;
        c1134rq2.a(x4.f7583a, 0, 3);
        x4.q(0);
        x4.s(8);
        y12.d = x4.t();
        y12.f7727e = x4.t();
        x4.s(6);
        c1134rq2.a(x4.f7583a, 0, x4.f(8));
        x4.q(0);
        if (y12.d) {
            x4.s(4);
            long f5 = x4.f(3);
            x4.s(1);
            int f6 = x4.f(15) << 15;
            x4.s(1);
            long f7 = x4.f(15);
            x4.s(1);
            if (!y12.f7728f && y12.f7727e) {
                x4.s(4);
                x4.s(1);
                int f8 = x4.f(15) << 15;
                x4.s(1);
                long f9 = x4.f(15);
                x4.s(1);
                sr2.b(f9 | (x4.f(3) << 30) | f8);
                y12.f7728f = true;
            }
            j4 = sr2.b((f5 << 30) | f6 | f7);
            i4 = 4;
        } else {
            i4 = 4;
            j4 = 0;
        }
        j14.i(i4, j4);
        j14.f(c1134rq2);
        j14.g(false);
        c1134rq2.d(c1134rq2.f10536a.length);
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r0 != r7) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035 A[LOOP:0: B:13:0x002d->B:15:0x0035, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(long r5, long r7) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.Sr r5 = r4.f7952a
            long r0 = r5.d()
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L21
            long r0 = r5.c()
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L24
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L24
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 == 0) goto L24
        L21:
            r5.e(r7)
        L24:
            com.google.android.gms.internal.ads.j0 r5 = r4.f7958i
            r6 = 0
            if (r5 == 0) goto L2c
            r5.b(r7)
        L2c:
            r5 = r6
        L2d:
            android.util.SparseArray r7 = r4.f7953b
            int r8 = r7.size()
            if (r5 >= r8) goto L45
            java.lang.Object r7 = r7.valueAt(r5)
            com.google.android.gms.internal.ads.Y1 r7 = (com.google.android.gms.internal.ads.Y1) r7
            r7.f7728f = r6
            com.google.android.gms.internal.ads.J1 r7 = r7.f7725a
            r7.a()
            int r5 = r5 + 1
            goto L2d
        L45:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Z1.i(long, long):void");
    }
}
