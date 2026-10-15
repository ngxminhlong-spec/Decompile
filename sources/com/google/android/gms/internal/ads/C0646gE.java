package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.gE, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0646gE implements InterfaceC1159sE, InterfaceC1116rE {

    /* renamed from: o, reason: collision with root package name */
    public final C0902mE f8796o;

    /* renamed from: p, reason: collision with root package name */
    public InterfaceC1116rE f8797p;

    /* renamed from: q, reason: collision with root package name */
    public C0603fE[] f8798q = new C0603fE[0];

    /* renamed from: r, reason: collision with root package name */
    public long f8799r = 0;

    /* renamed from: s, reason: collision with root package name */
    public long f8800s;

    public C0646gE(C0902mE c0902mE, long j4) {
        this.f8796o = c0902mE;
        this.f8800s = j4;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1116rE
    public final /* bridge */ /* synthetic */ void a(ME me) {
        InterfaceC1116rE interfaceC1116rE = this.f8797p;
        interfaceC1116rE.getClass();
        interfaceC1116rE.a(this);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1116rE
    public final void b(InterfaceC1159sE interfaceC1159sE) {
        InterfaceC1116rE interfaceC1116rE = this.f8797p;
        interfaceC1116rE.getClass();
        interfaceC1116rE.b(this);
    }

    @Override // com.google.android.gms.internal.ads.ME
    public final long c() {
        long c = this.f8796o.c();
        if (c != Long.MIN_VALUE) {
            long j4 = this.f8800s;
            if (j4 == Long.MIN_VALUE || c < j4) {
                return c;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.ME
    public final void d(long j4) {
        this.f8796o.d(j4);
    }

    @Override // com.google.android.gms.internal.ads.ME
    public final long e() {
        long e4 = this.f8796o.e();
        if (e4 != Long.MIN_VALUE) {
            long j4 = this.f8800s;
            if (j4 == Long.MIN_VALUE || e4 < j4) {
                return e4;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1159sE
    public final void f() {
        this.f8796o.f();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1159sE
    public final RE g() {
        return this.f8796o.g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        if (r0 > r3) goto L17;
     */
    @Override // com.google.android.gms.internal.ads.InterfaceC1159sE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long h(long r8) {
        /*
            r7 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.f8799r = r0
            com.google.android.gms.internal.ads.fE[] r0 = r7.f8798q
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L17
            r4 = r0[r3]
            if (r4 == 0) goto L14
            r4.f8694b = r2
        L14:
            int r3 = r3 + 1
            goto Lc
        L17:
            com.google.android.gms.internal.ads.mE r0 = r7.f8796o
            long r0 = r0.h(r8)
            int r8 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            r9 = 1
            if (r8 == 0) goto L34
            r3 = 0
            int r8 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r8 < 0) goto L35
            long r3 = r7.f8800s
            r5 = -9223372036854775808
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 == 0) goto L34
            int r8 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r8 > 0) goto L35
        L34:
            r2 = r9
        L35:
            com.google.android.gms.internal.ads.Zf.X(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0646gE.h(long):long");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1159sE
    public final long i() {
        if (l()) {
            long j4 = this.f8799r;
            this.f8799r = -9223372036854775807L;
            long i4 = i();
            return i4 != -9223372036854775807L ? i4 : j4;
        }
        long i5 = this.f8796o.i();
        if (i5 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        Zf.X(i5 >= 0);
        long j5 = this.f8800s;
        Zf.X(j5 == Long.MIN_VALUE || i5 <= j5);
        return i5;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1159sE
    public final void j(InterfaceC1116rE interfaceC1116rE, long j4) {
        this.f8797p = interfaceC1116rE;
        this.f8796o.j(this, j4);
    }

    @Override // com.google.android.gms.internal.ads.ME
    public final boolean k(C1200tC c1200tC) {
        return this.f8796o.k(c1200tC);
    }

    public final boolean l() {
        return this.f8799r != -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1159sE
    public final void m(long j4) {
        this.f8796o.m(j4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0056, code lost:
    
        if (r14 > r2) goto L24;
     */
    @Override // com.google.android.gms.internal.ads.InterfaceC1159sE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long n(com.google.android.gms.internal.ads.InterfaceC0690hF[] r14, boolean[] r15, com.google.android.gms.internal.ads.LE[] r16, boolean[] r17, long r18) {
        /*
            r13 = this;
            r0 = r16
            int r1 = r0.length
            com.google.android.gms.internal.ads.fE[] r2 = new com.google.android.gms.internal.ads.C0603fE[r1]
            r13.f8798q = r2
            com.google.android.gms.internal.ads.LE[] r6 = new com.google.android.gms.internal.ads.LE[r1]
            r1 = 0
            r2 = r1
        Lb:
            int r3 = r0.length
            r10 = 0
            if (r2 >= r3) goto L20
            com.google.android.gms.internal.ads.fE[] r3 = r13.f8798q
            r4 = r0[r2]
            com.google.android.gms.internal.ads.fE r4 = (com.google.android.gms.internal.ads.C0603fE) r4
            r3[r2] = r4
            if (r4 == 0) goto L1b
            com.google.android.gms.internal.ads.LE r10 = r4.f8693a
        L1b:
            r6[r2] = r10
            int r2 = r2 + 1
            goto Lb
        L20:
            com.google.android.gms.internal.ads.mE r3 = r13.f8796o
            r4 = r14
            r5 = r15
            r7 = r17
            r8 = r18
            long r14 = r3.n(r4, r5, r6, r7, r8)
            boolean r2 = r13.l()
            r3 = 0
            if (r2 == 0) goto L3a
            int r2 = (r18 > r3 ? 1 : (r18 == r3 ? 0 : -1))
            if (r2 != 0) goto L3a
            r7 = r3
            goto L3c
        L3a:
            r7 = r18
        L3c:
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r13.f8799r = r11
            int r2 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            r5 = 1
            if (r2 == 0) goto L5a
            int r2 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r2 < 0) goto L59
            long r2 = r13.f8800s
            r7 = -9223372036854775808
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 == 0) goto L5a
            int r2 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r2 > 0) goto L59
            goto L5a
        L59:
            r5 = r1
        L5a:
            com.google.android.gms.internal.ads.Zf.X(r5)
        L5d:
            int r2 = r0.length
            if (r1 >= r2) goto L83
            r2 = r6[r1]
            if (r2 != 0) goto L69
            com.google.android.gms.internal.ads.fE[] r2 = r13.f8798q
            r2[r1] = r10
            goto L7a
        L69:
            com.google.android.gms.internal.ads.fE[] r3 = r13.f8798q
            r4 = r3[r1]
            if (r4 == 0) goto L73
            com.google.android.gms.internal.ads.LE r4 = r4.f8693a
            if (r4 == r2) goto L7a
        L73:
            com.google.android.gms.internal.ads.fE r4 = new com.google.android.gms.internal.ads.fE
            r4.<init>(r13, r2)
            r3[r1] = r4
        L7a:
            com.google.android.gms.internal.ads.fE[] r2 = r13.f8798q
            r2 = r2[r1]
            r0[r1] = r2
            int r1 = r1 + 1
            goto L5d
        L83:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0646gE.n(com.google.android.gms.internal.ads.hF[], boolean[], com.google.android.gms.internal.ads.LE[], boolean[], long):long");
    }

    @Override // com.google.android.gms.internal.ads.ME
    public final boolean o() {
        return this.f8796o.o();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1159sE
    public final long p(long j4, LC lc) {
        if (j4 == 0) {
            return 0L;
        }
        long j5 = lc.f6134a;
        long j6 = lc.f6135b;
        long max = Math.max(0L, Math.min(j5, j4));
        long j7 = this.f8800s;
        long max2 = Math.max(0L, Math.min(j6, j7 == Long.MIN_VALUE ? Long.MAX_VALUE : j7 - j4));
        if (max != lc.f6134a || max2 != j6) {
            lc = new LC(max, max2);
        }
        return this.f8796o.p(j4, lc);
    }
}
