package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.xC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1372xC {

    /* renamed from: a, reason: collision with root package name */
    public final C1210tg f11244a = new C1210tg();

    /* renamed from: b, reason: collision with root package name */
    public final Rg f11245b = new Rg();
    public final VC c;
    public final C1135rr d;

    /* renamed from: e, reason: collision with root package name */
    public long f11246e;

    /* renamed from: f, reason: collision with root package name */
    public int f11247f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f11248g;

    /* renamed from: h, reason: collision with root package name */
    public C1286vC f11249h;

    /* renamed from: i, reason: collision with root package name */
    public C1286vC f11250i;

    /* renamed from: j, reason: collision with root package name */
    public C1286vC f11251j;

    /* renamed from: k, reason: collision with root package name */
    public int f11252k;

    /* renamed from: l, reason: collision with root package name */
    public Object f11253l;

    /* renamed from: m, reason: collision with root package name */
    public long f11254m;

    public C1372xC(VC vc, C1135rr c1135rr) {
        this.c = vc;
        this.d = c1135rr;
    }

    public static C1202tE u(AbstractC0484ch abstractC0484ch, Object obj, long j4, Rg rg, C1210tg c1210tg) {
        abstractC0484ch.n(obj, c1210tg);
        abstractC0484ch.e(c1210tg.c, rg, 0L);
        abstractC0484ch.a(obj);
        c1210tg.f10714f.getClass();
        abstractC0484ch.n(obj, c1210tg);
        c1210tg.f10714f.a(-1);
        int i4 = C0437bc.f8255e;
        return new C1202tE(obj, j4, -1);
    }

    public final boolean a(AbstractC0484ch abstractC0484ch, C1202tE c1202tE) {
        boolean z4 = !c1202tE.b() && c1202tE.f10690e == -1;
        Object obj = c1202tE.f10688a;
        if (z4) {
            if (abstractC0484ch.e(abstractC0484ch.n(obj, this.f11244a).c, this.f11245b, 0L).f6826m == abstractC0484ch.a(obj)) {
                return true;
            }
        }
        return false;
    }

    public final boolean b(AbstractC0484ch abstractC0484ch) {
        AbstractC0484ch abstractC0484ch2;
        C1286vC c1286vC;
        C1286vC c1286vC2 = this.f11249h;
        if (c1286vC2 == null) {
            return true;
        }
        int a4 = abstractC0484ch.a(c1286vC2.f11010b);
        while (true) {
            abstractC0484ch2 = abstractC0484ch;
            a4 = abstractC0484ch2.i(a4, this.f11244a, this.f11245b, this.f11247f, this.f11248g);
            while (true) {
                c1286vC = c1286vC2.f11018l;
                if (c1286vC == null || c1286vC2.f11012f.f11121f) {
                    break;
                }
                c1286vC2 = c1286vC;
            }
            if (a4 == -1 || c1286vC == null || abstractC0484ch2.a(c1286vC.f11010b) != a4) {
                break;
            }
            c1286vC2 = c1286vC;
            abstractC0484ch = abstractC0484ch2;
        }
        boolean k3 = k(c1286vC2);
        c1286vC2.f11012f = h(abstractC0484ch2, c1286vC2.f11012f);
        return !k3;
    }

    public final C1286vC c() {
        C1286vC c1286vC = this.f11249h;
        if (c1286vC == null) {
            return null;
        }
        if (c1286vC == this.f11250i) {
            this.f11250i = c1286vC.f11018l;
        }
        c1286vC.g();
        int i4 = this.f11252k - 1;
        this.f11252k = i4;
        if (i4 == 0) {
            this.f11251j = null;
            C1286vC c1286vC2 = this.f11249h;
            this.f11253l = c1286vC2.f11010b;
            this.f11254m = c1286vC2.f11012f.f11118a.d;
        }
        this.f11249h = this.f11249h.f11018l;
        v();
        return this.f11249h;
    }

    public final C1286vC d() {
        C1286vC c1286vC = this.f11250i;
        Zf.C(c1286vC);
        this.f11250i = c1286vC.f11018l;
        v();
        C1286vC c1286vC2 = this.f11250i;
        Zf.C(c1286vC2);
        return c1286vC2;
    }

    public final C1286vC e() {
        return this.f11249h;
    }

    public final C1286vC f() {
        return this.f11250i;
    }

    public final C1329wC g(long j4, FC fc) {
        C1286vC c1286vC = this.f11251j;
        return c1286vC == null ? r(fc.f4994a, fc.f4995b, fc.c, fc.f5008q) : q(fc.f4994a, c1286vC, j4);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.C1329wC h(com.google.android.gms.internal.ads.AbstractC0484ch r19, com.google.android.gms.internal.ads.C1329wC r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            com.google.android.gms.internal.ads.tE r3 = r2.f11118a
            boolean r4 = r3.b()
            int r5 = r3.f10690e
            r6 = -1
            if (r4 != 0) goto L16
            if (r5 != r6) goto L16
            r4 = 1
        L14:
            r11 = r4
            goto L18
        L16:
            r4 = 0
            goto L14
        L18:
            int r4 = r3.f10689b
            boolean r12 = r0.a(r1, r3)
            boolean r13 = r0.w(r1, r3, r11)
            java.lang.Object r7 = r3.f10688a
            com.google.android.gms.internal.ads.tg r8 = r0.f11244a
            r1.n(r7, r8)
            boolean r1 = r3.b()
            r9 = 0
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L38
            if (r5 != r6) goto L3b
        L38:
            r16 = r14
            goto L46
        L3b:
            com.google.android.gms.internal.ads.bh r1 = r8.f10714f
            com.google.android.gms.internal.ads.bc r1 = r1.a(r5)
            r1.getClass()
            r16 = r9
        L46:
            boolean r1 = r3.b()
            if (r1 == 0) goto L56
            int r1 = r3.c
            long r9 = r8.a(r4, r1)
        L52:
            r14 = r9
            r9 = r16
            goto L5f
        L56:
            int r1 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r1 == 0) goto L5c
            r14 = r9
            goto L5f
        L5c:
            long r9 = r8.d
            goto L52
        L5f:
            boolean r1 = r3.b()
            if (r1 == 0) goto L69
            r8.c(r4)
            goto L6e
        L69:
            if (r5 == r6) goto L6e
            r8.c(r5)
        L6e:
            com.google.android.gms.internal.ads.wC r1 = new com.google.android.gms.internal.ads.wC
            r5 = r3
            long r3 = r2.f11119b
            long r6 = r2.c
            r2 = r5
            r5 = r6
            r7 = r9
            r9 = r14
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1372xC.h(com.google.android.gms.internal.ads.ch, com.google.android.gms.internal.ads.wC):com.google.android.gms.internal.ads.wC");
    }

    public final C1202tE i(AbstractC0484ch abstractC0484ch, Object obj) {
        long j4;
        int a4;
        C1210tg c1210tg = this.f11244a;
        int i4 = abstractC0484ch.n(obj, c1210tg).c;
        Object obj2 = this.f11253l;
        if (obj2 == null || (a4 = abstractC0484ch.a(obj2)) == -1 || abstractC0484ch.d(a4, c1210tg, false).c != i4) {
            C1286vC c1286vC = this.f11249h;
            while (true) {
                if (c1286vC == null) {
                    C1286vC c1286vC2 = this.f11249h;
                    while (true) {
                        if (c1286vC2 != null) {
                            int a5 = abstractC0484ch.a(c1286vC2.f11010b);
                            if (a5 != -1 && abstractC0484ch.d(a5, c1210tg, false).c == i4) {
                                j4 = c1286vC2.f11012f.f11118a.d;
                                break;
                            }
                            c1286vC2 = c1286vC2.f11018l;
                        } else {
                            j4 = this.f11246e;
                            this.f11246e = 1 + j4;
                            if (this.f11249h == null) {
                                this.f11253l = obj;
                                this.f11254m = j4;
                            }
                        }
                    }
                } else {
                    if (c1286vC.f11010b.equals(obj)) {
                        j4 = c1286vC.f11012f.f11118a.d;
                        break;
                    }
                    c1286vC = c1286vC.f11018l;
                }
            }
        } else {
            j4 = this.f11254m;
        }
        long j5 = j4;
        abstractC0484ch.n(obj, c1210tg);
        int i5 = c1210tg.c;
        Rg rg = this.f11245b;
        abstractC0484ch.e(i5, rg, 0L);
        for (int a6 = abstractC0484ch.a(obj); a6 >= rg.f6825l; a6--) {
            abstractC0484ch.d(a6, c1210tg, true);
            c1210tg.f10714f.getClass();
            c1210tg.f10714f.a(-1);
            int i6 = C0437bc.f8255e;
        }
        return u(abstractC0484ch, obj, j5, rg, this.f11244a);
    }

    public final void j() {
        if (this.f11252k == 0) {
            return;
        }
        C1286vC c1286vC = this.f11249h;
        Zf.C(c1286vC);
        this.f11253l = c1286vC.f11010b;
        this.f11254m = c1286vC.f11012f.f11118a.d;
        while (c1286vC != null) {
            c1286vC.g();
            c1286vC = c1286vC.f11018l;
        }
        this.f11249h = null;
        this.f11251j = null;
        this.f11250i = null;
        this.f11252k = 0;
        v();
    }

    public final boolean k(C1286vC c1286vC) {
        Zf.C(c1286vC);
        int i4 = 0;
        if (c1286vC.equals(this.f11251j)) {
            return false;
        }
        this.f11251j = c1286vC;
        boolean z4 = false;
        while (true) {
            c1286vC = c1286vC.f11018l;
            if (c1286vC == null) {
                break;
            }
            if (c1286vC == this.f11250i) {
                this.f11250i = this.f11249h;
                z4 = true;
            }
            c1286vC.g();
            this.f11252k--;
        }
        C1286vC c1286vC2 = this.f11251j;
        c1286vC2.getClass();
        if (c1286vC2.f11018l != null) {
            c1286vC2.i();
            c1286vC2.f11018l = null;
            while (true) {
                C0817kF c0817kF = c1286vC2.f11020n;
                if (i4 >= c0817kF.f9284o) {
                    break;
                }
                c0817kF.b(i4);
                InterfaceC0690hF interfaceC0690hF = ((InterfaceC0690hF[]) c1286vC2.f11020n.f9286q)[i4];
                i4++;
            }
        }
        v();
        return z4;
    }

    public final boolean l() {
        C1286vC c1286vC = this.f11251j;
        if (c1286vC != null) {
            return !c1286vC.f11012f.f11123h && c1286vC.h() && this.f11251j.f11012f.f11120e != -9223372036854775807L && this.f11252k < 100;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c5, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c1, code lost:
    
        if (k(r3) != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:?, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m(com.google.android.gms.internal.ads.AbstractC0484ch r25, long r26, long r28) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            com.google.android.gms.internal.ads.vC r2 = r0.f11249h
            r3 = 0
        L7:
            r4 = 1
            if (r2 == 0) goto Lc5
            com.google.android.gms.internal.ads.wC r5 = r2.f11012f
            if (r3 != 0) goto L15
            com.google.android.gms.internal.ads.wC r3 = r0.h(r1, r5)
            r7 = r26
            goto L3c
        L15:
            r7 = r26
            com.google.android.gms.internal.ads.wC r9 = r0.q(r1, r3, r7)
            if (r9 != 0) goto L29
            boolean r1 = r0.k(r3)
            if (r1 != 0) goto L25
            goto Lc5
        L25:
            r22 = 0
            goto Lc4
        L29:
            long r10 = r5.f11119b
            long r12 = r9.f11119b
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 != 0) goto Lbb
            com.google.android.gms.internal.ads.tE r10 = r5.f11118a
            com.google.android.gms.internal.ads.tE r11 = r9.f11118a
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto Lbb
            r3 = r9
        L3c:
            long r9 = r3.f11120e
            long r13 = r5.c
            long r11 = r3.c
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            r17 = r9
            if (r11 != 0) goto L4b
            r22 = 0
            goto L66
        L4b:
            com.google.android.gms.internal.ads.tE r10 = r3.f11118a
            long r11 = r3.f11119b
            r22 = 0
            long r6 = r3.d
            boolean r8 = r3.f11121f
            boolean r9 = r3.f11122g
            boolean r3 = r3.f11123h
            r20 = r9
            com.google.android.gms.internal.ads.wC r9 = new com.google.android.gms.internal.ads.wC
            r21 = r3
            r15 = r6
            r19 = r8
            r9.<init>(r10, r11, r13, r15, r17, r19, r20, r21)
            r3 = r9
        L66:
            r2.f11012f = r3
            long r5 = r5.f11120e
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto Lb2
            int r5 = (r5 > r17 ? 1 : (r5 == r17 ? 0 : -1))
            if (r5 != 0) goto L78
            goto Lb2
        L78:
            java.lang.Object r1 = r2.f11009a
            boolean r5 = r1 instanceof com.google.android.gms.internal.ads.C0646gE
            r9 = -9223372036854775808
            if (r5 == 0) goto L8b
            long r5 = r3.d
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 != 0) goto L87
            r5 = r9
        L87:
            com.google.android.gms.internal.ads.gE r1 = (com.google.android.gms.internal.ads.C0646gE) r1
            r1.f8800s = r5
        L8b:
            int r1 = (r17 > r7 ? 1 : (r17 == r7 ? 0 : -1))
            if (r1 != 0) goto L95
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L99
        L95:
            long r5 = r2.f11021o
            long r5 = r17 + r5
        L99:
            com.google.android.gms.internal.ads.vC r1 = r0.f11250i
            if (r2 != r1) goto La7
            int r1 = (r28 > r9 ? 1 : (r28 == r9 ? 0 : -1))
            if (r1 == 0) goto La5
            int r1 = (r28 > r5 ? 1 : (r28 == r5 ? 0 : -1))
            if (r1 < 0) goto La7
        La5:
            r1 = r4
            goto La9
        La7:
            r1 = r22
        La9:
            boolean r2 = r0.k(r2)
            if (r2 != 0) goto Lc4
            if (r1 != 0) goto Lc4
            goto Lc5
        Lb2:
            com.google.android.gms.internal.ads.vC r3 = r2.f11018l
            r23 = r3
            r3 = r2
            r2 = r23
            goto L7
        Lbb:
            r22 = 0
            boolean r1 = r0.k(r3)
            if (r1 != 0) goto Lc4
            goto Lc5
        Lc4:
            return r22
        Lc5:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1372xC.m(com.google.android.gms.internal.ads.ch, long, long):boolean");
    }

    public final boolean n(AbstractC0484ch abstractC0484ch, int i4) {
        this.f11247f = i4;
        return b(abstractC0484ch);
    }

    public final boolean o(AbstractC0484ch abstractC0484ch, boolean z4) {
        this.f11248g = z4;
        return b(abstractC0484ch);
    }

    public final C1286vC p(WD[] wdArr, AbstractC0774jF abstractC0774jF, C1058pz c1058pz, EC ec, C1329wC c1329wC, C0817kF c0817kF) {
        C1329wC c1329wC2;
        long j4;
        C1286vC c1286vC = this.f11251j;
        if (c1286vC == null) {
            c1329wC2 = c1329wC;
            j4 = 1000000000000L;
        } else {
            c1329wC2 = c1329wC;
            j4 = (c1286vC.f11021o + c1286vC.f11012f.f11120e) - c1329wC2.f11119b;
        }
        C1286vC c1286vC2 = new C1286vC(wdArr, j4, abstractC0774jF, c1058pz, ec, c1329wC2, c0817kF);
        C1286vC c1286vC3 = this.f11251j;
        if (c1286vC3 == null) {
            this.f11249h = c1286vC2;
            this.f11250i = c1286vC2;
        } else if (c1286vC2 != c1286vC3.f11018l) {
            c1286vC3.i();
            c1286vC3.f11018l = c1286vC2;
        }
        this.f11253l = null;
        this.f11251j = c1286vC2;
        this.f11252k++;
        v();
        return c1286vC2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0114, code lost:
    
        return s(r23, r12.f10688a, r3, r0, r8.c, r12.d);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.C1329wC q(com.google.android.gms.internal.ads.AbstractC0484ch r23, com.google.android.gms.internal.ads.C1286vC r24, long r25) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1372xC.q(com.google.android.gms.internal.ads.ch, com.google.android.gms.internal.ads.vC, long):com.google.android.gms.internal.ads.wC");
    }

    public final C1329wC r(AbstractC0484ch abstractC0484ch, C1202tE c1202tE, long j4, long j5) {
        abstractC0484ch.n(c1202tE.f10688a, this.f11244a);
        return c1202tE.b() ? s(abstractC0484ch, c1202tE.f10688a, c1202tE.f10689b, c1202tE.c, j4, c1202tE.d) : t(abstractC0484ch, c1202tE.f10688a, j5, j4, c1202tE.d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r4.f10714f.getClass();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.C1329wC s(com.google.android.gms.internal.ads.AbstractC0484ch r14, java.lang.Object r15, int r16, int r17, long r18, long r20) {
        /*
            r13 = this;
            com.google.android.gms.internal.ads.tE r0 = new com.google.android.gms.internal.ads.tE
            r6 = -1
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r20
            r0.<init>(r1, r2, r3, r4, r6)
            com.google.android.gms.internal.ads.tg r4 = r13.f11244a
            com.google.android.gms.internal.ads.tg r14 = r14.n(r15, r4)
            long r8 = r14.a(r2, r3)
            com.google.android.gms.internal.ads.bh r14 = r4.f10714f
            com.google.android.gms.internal.ads.bc r14 = r14.a(r2)
            r15 = 0
        L1e:
            int[] r1 = r14.c
            int r5 = r1.length
            if (r15 >= r5) goto L2e
            r1 = r1[r15]
            if (r1 == 0) goto L2e
            r5 = 1
            if (r1 != r5) goto L2b
            goto L2e
        L2b:
            int r15 = r15 + 1
            goto L1e
        L2e:
            if (r3 != r15) goto L35
            com.google.android.gms.internal.ads.bh r14 = r4.f10714f
            r14.getClass()
        L35:
            r4.c(r2)
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r14 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            r1 = 0
            if (r14 == 0) goto L4e
            int r14 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r14 > 0) goto L4e
            r14 = -1
            long r14 = r14 + r8
            long r1 = java.lang.Math.max(r1, r14)
        L4e:
            r2 = r1
            r1 = r0
            com.google.android.gms.internal.ads.wC r0 = new com.google.android.gms.internal.ads.wC
            r11 = 0
            r12 = 0
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r10 = 0
            r4 = r18
            r0.<init>(r1, r2, r4, r6, r8, r10, r11, r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1372xC.s(com.google.android.gms.internal.ads.ch, java.lang.Object, int, int, long, long):com.google.android.gms.internal.ads.wC");
    }

    public final C1329wC t(AbstractC0484ch abstractC0484ch, Object obj, long j4, long j5, long j6) {
        C1210tg c1210tg = this.f11244a;
        abstractC0484ch.n(obj, c1210tg);
        c1210tg.getClass();
        c1210tg.f10714f.getClass();
        C1202tE c1202tE = new C1202tE(obj, j6, -1);
        boolean z4 = !c1202tE.b();
        boolean a4 = a(abstractC0484ch, c1202tE);
        boolean w2 = w(abstractC0484ch, c1202tE, z4);
        long j7 = c1210tg.d;
        return new C1329wC(c1202tE, (j7 == -9223372036854775807L || j4 < j7) ? j4 : Math.max(0L, (-1) + j7), j5, -9223372036854775807L, j7, z4, a4, w2);
    }

    public final void v() {
        AbstractC0880lt abstractC0880lt = new AbstractC0880lt(4);
        for (C1286vC c1286vC = this.f11249h; c1286vC != null; c1286vC = c1286vC.f11018l) {
            abstractC0880lt.a(c1286vC.f11012f.f11118a);
        }
        C1286vC c1286vC2 = this.f11250i;
        this.d.b(new RunnableC0801k(this, abstractC0880lt, c1286vC2 == null ? null : c1286vC2.f11012f.f11118a, 8));
    }

    public final boolean w(AbstractC0484ch abstractC0484ch, C1202tE c1202tE, boolean z4) {
        int a4 = abstractC0484ch.a(c1202tE.f10688a);
        if (!abstractC0484ch.e(abstractC0484ch.d(a4, this.f11244a, false).c, this.f11245b, 0L).f6820g) {
            if (abstractC0484ch.i(a4, this.f11244a, this.f11245b, this.f11247f, this.f11248g) == -1 && z4) {
                return true;
            }
        }
        return false;
    }
}
