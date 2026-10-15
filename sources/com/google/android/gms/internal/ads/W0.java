package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class W0 implements B {

    /* renamed from: e, reason: collision with root package name */
    public D f7321e;

    /* renamed from: f, reason: collision with root package name */
    public V f7322f;

    /* renamed from: h, reason: collision with root package name */
    public int f7324h;

    /* renamed from: i, reason: collision with root package name */
    public C1120rc f7325i;

    /* renamed from: k, reason: collision with root package name */
    public long f7327k;

    /* renamed from: l, reason: collision with root package name */
    public long f7328l;

    /* renamed from: m, reason: collision with root package name */
    public int f7329m;

    /* renamed from: n, reason: collision with root package name */
    public Y0 f7330n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f7331o;

    /* renamed from: a, reason: collision with root package name */
    public final C1134rq f7319a = new C1134rq(10);

    /* renamed from: b, reason: collision with root package name */
    public final M f7320b = new Object();
    public final J c = new J();

    /* renamed from: j, reason: collision with root package name */
    public long f7326j = -9223372036854775807L;
    public final C0874ln d = new C0874ln(3);

    /* renamed from: g, reason: collision with root package name */
    public V f7323g = new A();

    public final U0 a(C c) {
        C1134rq c1134rq = this.f7319a;
        ((C1316w) c).E(c1134rq.f10536a, 0, 4, false);
        c1134rq.e(0);
        this.f7320b.a(c1134rq.h());
        return new U0(c.i(), c.d(), this.f7320b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (r9.a() > (r2 - 4)) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(com.google.android.gms.internal.ads.C r9) {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.Y0 r0 = r8.f7330n
            r1 = 1
            if (r0 == 0) goto L1a
            long r2 = r0.e()
            r4 = -1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L1a
            long r4 = r9.a()
            r6 = -4
            long r2 = r2 + r6
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 > 0) goto L28
        L1a:
            com.google.android.gms.internal.ads.rq r0 = r8.f7319a     // Catch: java.io.EOFException -> L28
            byte[] r0 = r0.f10536a     // Catch: java.io.EOFException -> L28
            r2 = 4
            r3 = 0
            boolean r9 = r9.E(r0, r3, r2, r1)     // Catch: java.io.EOFException -> L28
            if (r9 != 0) goto L27
            goto L28
        L27:
            return r3
        L28:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.W0.b(com.google.android.gms.internal.ads.C):boolean");
    }

    public final boolean c(C c, boolean z4) {
        int i4;
        int i5;
        int b4;
        c.j();
        if (c.d() == 0) {
            C1120rc g4 = this.d.g(c, null);
            this.f7325i = g4;
            if (g4 != null) {
                this.c.a(g4);
            }
            i4 = (int) c.a();
            if (!z4) {
                ((C1316w) c).f(i4);
            }
            i5 = 0;
        } else {
            i4 = 0;
            i5 = 0;
        }
        int i6 = i5;
        int i7 = i6;
        while (true) {
            if (!b(c)) {
                C1134rq c1134rq = this.f7319a;
                c1134rq.e(0);
                int h4 = c1134rq.h();
                if ((i5 == 0 || ((-128000) & h4) == (i5 & (-128000))) && (b4 = Y9.b(h4)) != -1) {
                    i6++;
                    if (i6 != 1) {
                        if (i6 == 4) {
                            break;
                        }
                    } else {
                        this.f7320b.a(h4);
                        i5 = h4;
                    }
                    ((C1316w) c).c(b4 - 4, false);
                } else {
                    int i8 = i7 + 1;
                    if (i7 == (true != z4 ? 131072 : 32768)) {
                        if (z4) {
                            return false;
                        }
                        throw C0907md.a("Searched too many bytes.", null);
                    }
                    if (z4) {
                        c.j();
                        ((C1316w) c).c(i4 + i8, false);
                    } else {
                        ((C1316w) c).f(1);
                    }
                    i5 = 0;
                    i7 = i8;
                    i6 = 0;
                }
            } else if (i6 <= 0) {
                throw new EOFException();
            }
        }
        if (z4) {
            ((C1316w) c).f(i4 + i7);
        } else {
            c.j();
        }
        this.f7324h = i5;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.B
    public final boolean d(C c) {
        return c(c, true);
    }

    @Override // com.google.android.gms.internal.ads.B
    public final void g(D d) {
        this.f7321e = d;
        V z4 = d.z(0, 1);
        this.f7322f = z4;
        this.f7323g = z4;
        this.f7321e.x();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02db  */
    /* JADX WARN: Type inference failed for: r1v34, types: [com.google.android.gms.internal.ads.G] */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v1 */
    /* JADX WARN: Type inference failed for: r24v2, types: [com.google.android.gms.internal.ads.P] */
    /* JADX WARN: Type inference failed for: r24v3 */
    @Override // com.google.android.gms.internal.ads.B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(com.google.android.gms.internal.ads.C r43, com.google.android.gms.internal.ads.F r44) {
        /*
            Method dump skipped, instructions count: 995
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.W0.h(com.google.android.gms.internal.ads.C, com.google.android.gms.internal.ads.F):int");
    }

    @Override // com.google.android.gms.internal.ads.B
    public final void i(long j4, long j5) {
        this.f7324h = 0;
        this.f7326j = -9223372036854775807L;
        this.f7327k = 0L;
        this.f7329m = 0;
    }
}
