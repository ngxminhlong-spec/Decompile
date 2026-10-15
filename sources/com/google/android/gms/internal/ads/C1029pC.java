package com.google.android.gms.internal.ads;

import C0.C0001a0;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.pC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1029pC implements Handler.Callback, InterfaceC1116rE {

    /* renamed from: A, reason: collision with root package name */
    public final long f9919A;

    /* renamed from: B, reason: collision with root package name */
    public final C0001a0 f9920B;

    /* renamed from: C, reason: collision with root package name */
    public final ArrayList f9921C;

    /* renamed from: D, reason: collision with root package name */
    public final C1475zn f9922D;

    /* renamed from: E, reason: collision with root package name */
    public final C1372xC f9923E;

    /* renamed from: F, reason: collision with root package name */
    public final EC f9924F;

    /* renamed from: G, reason: collision with root package name */
    public final long f9925G;

    /* renamed from: H, reason: collision with root package name */
    public LC f9926H;

    /* renamed from: I, reason: collision with root package name */
    public FC f9927I;

    /* renamed from: J, reason: collision with root package name */
    public K1.c f9928J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f9929K;

    /* renamed from: M, reason: collision with root package name */
    public boolean f9931M;
    public boolean N;

    /* renamed from: P, reason: collision with root package name */
    public boolean f9933P;

    /* renamed from: S, reason: collision with root package name */
    public boolean f9936S;

    /* renamed from: T, reason: collision with root package name */
    public int f9937T;

    /* renamed from: U, reason: collision with root package name */
    public C0986oC f9938U;

    /* renamed from: V, reason: collision with root package name */
    public long f9939V;

    /* renamed from: W, reason: collision with root package name */
    public int f9940W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f9941X;

    /* renamed from: Y, reason: collision with root package name */
    public ZB f9942Y;

    /* renamed from: a0, reason: collision with root package name */
    public final C0388aC f9944a0;

    /* renamed from: b0, reason: collision with root package name */
    public final XB f9945b0;

    /* renamed from: o, reason: collision with root package name */
    public final WD[] f9946o;

    /* renamed from: p, reason: collision with root package name */
    public final Set f9947p;

    /* renamed from: q, reason: collision with root package name */
    public final WD[] f9948q;

    /* renamed from: r, reason: collision with root package name */
    public final AbstractC0774jF f9949r;

    /* renamed from: s, reason: collision with root package name */
    public final C0817kF f9950s;

    /* renamed from: t, reason: collision with root package name */
    public final InterfaceC1072qC f9951t;

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC0989oF f9952u;

    /* renamed from: v, reason: collision with root package name */
    public final C1135rr f9953v;

    /* renamed from: w, reason: collision with root package name */
    public final HandlerThread f9954w;

    /* renamed from: x, reason: collision with root package name */
    public final Looper f9955x;
    public final Rg y;

    /* renamed from: z, reason: collision with root package name */
    public final C1210tg f9956z;

    /* renamed from: Q, reason: collision with root package name */
    public int f9934Q = 0;

    /* renamed from: R, reason: collision with root package name */
    public boolean f9935R = false;

    /* renamed from: L, reason: collision with root package name */
    public boolean f9930L = false;

    /* renamed from: Z, reason: collision with root package name */
    public long f9943Z = -9223372036854775807L;

    /* renamed from: O, reason: collision with root package name */
    public long f9932O = -9223372036854775807L;

    public C1029pC(WD[] wdArr, AbstractC0774jF abstractC0774jF, C0817kF c0817kF, InterfaceC1072qC interfaceC1072qC, C1075qF c1075qF, VC vc, LC lc, XB xb, long j4, Looper looper, C1475zn c1475zn, C0388aC c0388aC, C0474cD c0474cD) {
        this.f9944a0 = c0388aC;
        this.f9946o = wdArr;
        this.f9949r = abstractC0774jF;
        this.f9950s = c0817kF;
        this.f9951t = interfaceC1072qC;
        this.f9952u = c1075qF;
        this.f9926H = lc;
        this.f9945b0 = xb;
        this.f9925G = j4;
        this.f9922D = c1475zn;
        this.f9919A = interfaceC1072qC.b();
        FC g4 = FC.g(c0817kF);
        this.f9927I = g4;
        this.f9928J = new K1.c(g4);
        int length = wdArr.length;
        this.f9948q = new WD[2];
        ((C0604fF) abstractC0774jF).getClass();
        for (int i4 = 0; i4 < 2; i4++) {
            WD wd = wdArr[i4];
            wd.f7416s = i4;
            wd.f7418t = c0474cD;
            wd.f7420u = c1475zn;
            this.f9948q[i4] = wd;
            synchronized (wd.f7408o) {
            }
        }
        this.f9920B = new C0001a0(this);
        this.f9921C = new ArrayList();
        this.f9947p = Collections.newSetFromMap(new IdentityHashMap());
        this.y = new Rg();
        this.f9956z = new C1210tg();
        abstractC0774jF.f9147a = this;
        abstractC0774jF.f9148b = c1075qF;
        this.f9941X = true;
        C1135rr d = c1475zn.d(looper, null);
        this.f9923E = new C1372xC(vc, d);
        this.f9924F = new EC(this, vc, d, c0474cD);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f9954w = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f9955x = looper2;
        this.f9953v = c1475zn.d(looper2, this);
    }

    public static boolean B(WD wd) {
        return wd.f7422v != 0;
    }

    public static final void F(HC hc) {
        synchronized (hc) {
        }
        try {
            hc.f5417a.a(hc.c, hc.d);
        } finally {
            hc.b(true);
        }
    }

    public static Object G(Rg rg, C1210tg c1210tg, int i4, boolean z4, Object obj, AbstractC0484ch abstractC0484ch, AbstractC0484ch abstractC0484ch2) {
        int a4 = abstractC0484ch.a(obj);
        int b4 = abstractC0484ch.b();
        int i5 = 0;
        int i6 = a4;
        int i7 = -1;
        while (true) {
            if (i5 >= b4 || i7 != -1) {
                break;
            }
            Rg rg2 = rg;
            C1210tg c1210tg2 = c1210tg;
            int i8 = i4;
            boolean z5 = z4;
            AbstractC0484ch abstractC0484ch3 = abstractC0484ch;
            i6 = abstractC0484ch3.i(i6, c1210tg2, rg2, i8, z5);
            if (i6 == -1) {
                i7 = -1;
                break;
            }
            i7 = abstractC0484ch2.a(abstractC0484ch3.f(i6));
            i5++;
            abstractC0484ch = abstractC0484ch3;
            c1210tg = c1210tg2;
            rg = rg2;
            i4 = i8;
            z4 = z5;
        }
        if (i7 == -1) {
            return null;
        }
        return abstractC0484ch2.f(i7);
    }

    public static Pair L(AbstractC0484ch abstractC0484ch, C0986oC c0986oC, int i4, boolean z4, Rg rg, C1210tg c1210tg) {
        AbstractC0484ch abstractC0484ch2 = c0986oC.f9829a;
        if (abstractC0484ch.o()) {
            return null;
        }
        AbstractC0484ch abstractC0484ch3 = true == abstractC0484ch2.o() ? abstractC0484ch : abstractC0484ch2;
        try {
            Pair l4 = abstractC0484ch3.l(rg, c1210tg, c0986oC.f9830b, c0986oC.c);
            if (!abstractC0484ch.equals(abstractC0484ch3)) {
                if (abstractC0484ch.a(l4.first) == -1) {
                    Object G3 = G(rg, c1210tg, i4, z4, l4.first, abstractC0484ch3, abstractC0484ch);
                    if (G3 != null) {
                        return abstractC0484ch.l(rg, c1210tg, abstractC0484ch.n(G3, c1210tg).c, -9223372036854775807L);
                    }
                    return null;
                }
                if (abstractC0484ch3.n(l4.first, c1210tg).f10713e && abstractC0484ch3.e(c1210tg.c, rg, 0L).f6825l == abstractC0484ch3.a(l4.first)) {
                    return abstractC0484ch.l(rg, c1210tg, abstractC0484ch.n(l4.first, c1210tg).c, c0986oC.c);
                }
            }
            return l4;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.internal.ads.ME, java.lang.Object] */
    public final boolean A() {
        C1286vC c1286vC = this.f9923E.f11251j;
        if (c1286vC == null) {
            return false;
        }
        return (!c1286vC.d ? 0L : c1286vC.f11009a.e()) != Long.MIN_VALUE;
    }

    public final boolean C() {
        C1286vC c1286vC = this.f9923E.f11249h;
        long j4 = c1286vC.f11012f.f11120e;
        if (c1286vC.d) {
            return j4 == -9223372036854775807L || this.f9927I.f5008q < j4 || !D();
        }
        return false;
    }

    public final boolean D() {
        FC fc = this.f9927I;
        return fc.f5003l && fc.f5004m == 0;
    }

    public final boolean E(AbstractC0484ch abstractC0484ch, C1202tE c1202tE) {
        if (c1202tE.b() || abstractC0484ch.o()) {
            return false;
        }
        int i4 = abstractC0484ch.n(c1202tE.f10688a, this.f9956z).c;
        Rg rg = this.y;
        abstractC0484ch.e(i4, rg, 0L);
        return rg.b() && rg.f6820g && rg.d != -9223372036854775807L;
    }

    public final synchronized boolean H() {
        if (!this.f9929K && this.f9955x.getThread().isAlive()) {
            this.f9953v.c(7);
            z(new Xj(28, this), this.f9925G);
            return this.f9929K;
        }
        return true;
    }

    public final long I(AbstractC0484ch abstractC0484ch, Object obj, long j4) {
        int i4 = abstractC0484ch.n(obj, this.f9956z).c;
        Rg rg = this.y;
        abstractC0484ch.e(i4, rg, 0L);
        if (rg.d == -9223372036854775807L || !rg.b() || !rg.f6820g) {
            return -9223372036854775807L;
        }
        long j5 = rg.f6818e;
        return AbstractC0751is.t((j5 == -9223372036854775807L ? System.currentTimeMillis() : j5 + SystemClock.elapsedRealtime()) - rg.d) - j4;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [com.google.android.gms.internal.ads.sE, java.lang.Object] */
    public final long J(C1202tE c1202tE, long j4, boolean z4, boolean z5) {
        long j5;
        C1286vC c1286vC;
        u();
        y(false, true);
        if (z5 || this.f9927I.f4996e == 3) {
            r(2);
        }
        C1372xC c1372xC = this.f9923E;
        C1286vC c1286vC2 = c1372xC.f11249h;
        C1286vC c1286vC3 = c1286vC2;
        while (c1286vC3 != null && !c1202tE.equals(c1286vC3.f11012f.f11118a)) {
            c1286vC3 = c1286vC3.f11018l;
        }
        if (z4 || c1286vC2 != c1286vC3 || (c1286vC3 != null && j4 + c1286vC3.f11021o < 0)) {
            WD[] wdArr = this.f9946o;
            int length = wdArr.length;
            for (int i4 = 0; i4 < 2; i4++) {
                N(wdArr[i4]);
            }
            if (c1286vC3 != null) {
                while (c1372xC.f11249h != c1286vC3) {
                    c1372xC.c();
                }
                c1372xC.k(c1286vC3);
                c1286vC3.f11021o = 1000000000000L;
                c();
            }
        }
        if (c1286vC3 != null) {
            ?? r22 = c1286vC3.f11009a;
            c1372xC.k(c1286vC3);
            if (c1286vC3.d) {
                C1286vC c1286vC4 = c1286vC3;
                j5 = j4;
                if (c1286vC4.f11011e) {
                    j5 = r22.h(j5);
                    r22.m(j5 - this.f9919A);
                }
            } else {
                C1329wC c1329wC = c1286vC3.f11012f;
                if (j4 == c1329wC.f11119b) {
                    c1286vC = c1286vC3;
                    j5 = j4;
                } else {
                    c1286vC = c1286vC3;
                    j5 = j4;
                    c1329wC = new C1329wC(c1329wC.f11118a, j5, c1329wC.c, c1329wC.d, c1329wC.f11120e, c1329wC.f11121f, c1329wC.f11122g, c1329wC.f11123h);
                }
                c1286vC.f11012f = c1329wC;
            }
            n(j5);
            i();
        } else {
            j5 = j4;
            c1372xC.j();
            n(j5);
        }
        f(false);
        this.f9953v.c(2);
        return j5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
    
        r4.f10714f.getClass();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair K(com.google.android.gms.internal.ads.AbstractC0484ch r10) {
        /*
            r9 = this;
            boolean r0 = r10.o()
            r1 = 0
            if (r0 == 0) goto L13
            com.google.android.gms.internal.ads.tE r10 = com.google.android.gms.internal.ads.FC.f4993s
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            android.util.Pair r10 = android.util.Pair.create(r10, r0)
            return r10
        L13:
            boolean r0 = r9.f9935R
            int r6 = r10.g(r0)
            com.google.android.gms.internal.ads.tg r5 = r9.f9956z
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            com.google.android.gms.internal.ads.Rg r4 = r9.y
            r3 = r10
            android.util.Pair r10 = r3.l(r4, r5, r6, r7)
            com.google.android.gms.internal.ads.xC r0 = r9.f9923E
            java.lang.Object r4 = r10.first
            com.google.android.gms.internal.ads.tE r0 = r0.i(r3, r4)
            java.lang.Object r10 = r10.second
            java.lang.Long r10 = (java.lang.Long) r10
            long r4 = r10.longValue()
            boolean r10 = r0.b()
            if (r10 == 0) goto L64
            java.lang.Object r10 = r0.f10688a
            com.google.android.gms.internal.ads.tg r4 = r9.f9956z
            r3.n(r10, r4)
            com.google.android.gms.internal.ads.bh r10 = r4.f10714f
            r3 = -1
            com.google.android.gms.internal.ads.bc r10 = r10.a(r3)
            r5 = 0
        L4c:
            int[] r6 = r10.c
            int r7 = r6.length
            if (r5 >= r7) goto L5c
            r6 = r6[r5]
            if (r6 == 0) goto L5c
            r7 = 1
            if (r6 != r7) goto L59
            goto L5c
        L59:
            int r5 = r5 + 1
            goto L4c
        L5c:
            if (r3 != r5) goto L65
            com.google.android.gms.internal.ads.bh r10 = r4.f10714f
            r10.getClass()
            goto L65
        L64:
            r1 = r4
        L65:
            java.lang.Long r10 = java.lang.Long.valueOf(r1)
            android.util.Pair r10 = android.util.Pair.create(r0, r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1029pC.K(com.google.android.gms.internal.ads.ch):android.util.Pair");
    }

    /* JADX WARN: Type inference failed for: r9v4, types: [com.google.android.gms.internal.ads.lt, com.google.android.gms.internal.ads.ot] */
    public final FC M(C1202tE c1202tE, long j4, long j5, long j6, boolean z4, int i4) {
        Gt gt;
        this.f9941X = (!this.f9941X && j4 == this.f9927I.f5008q && c1202tE.equals(this.f9927I.f4995b)) ? false : true;
        m();
        FC fc = this.f9927I;
        RE re = fc.f4999h;
        C0817kF c0817kF = fc.f5000i;
        List list = fc.f5001j;
        if (this.f9924F.f4863j) {
            C1286vC c1286vC = this.f9923E.f11249h;
            re = c1286vC == null ? RE.d : c1286vC.f11019m;
            c0817kF = c1286vC == null ? this.f9950s : c1286vC.f11020n;
            InterfaceC0690hF[] interfaceC0690hFArr = (InterfaceC0690hF[]) c0817kF.f9286q;
            ?? abstractC0880lt = new AbstractC0880lt(4);
            boolean z5 = false;
            for (InterfaceC0690hF interfaceC0690hF : interfaceC0690hFArr) {
                if (interfaceC0690hF != null) {
                    C1120rc c1120rc = interfaceC0690hF.c(0).f9811i;
                    if (c1120rc == null) {
                        abstractC0880lt.a(new C1120rc(-9223372036854775807L, new InterfaceC0479cc[0]));
                    } else {
                        abstractC0880lt.a(c1120rc);
                        z5 = true;
                    }
                }
            }
            if (z5) {
                gt = abstractC0880lt.f();
            } else {
                C1052pt c1052pt = AbstractC1137rt.f10543p;
                gt = Gt.f5344s;
            }
            list = gt;
            if (c1286vC != null) {
                C1329wC c1329wC = c1286vC.f11012f;
                long j7 = c1329wC.c;
                if (j7 != j5) {
                    if (j5 != j7) {
                        c1329wC = new C1329wC(c1329wC.f11118a, c1329wC.f11119b, j5, c1329wC.d, c1329wC.f11120e, c1329wC.f11121f, c1329wC.f11122g, c1329wC.f11123h);
                    }
                    c1286vC.f11012f = c1329wC;
                }
            }
            C1286vC c1286vC2 = this.f9923E.f11249h;
            if (c1286vC2 != null) {
                C0817kF c0817kF2 = c1286vC2.f11020n;
                int i5 = 0;
                while (true) {
                    int length = this.f9946o.length;
                    if (i5 >= 2) {
                        break;
                    }
                    if (c0817kF2.b(i5)) {
                        if (this.f9946o[i5].f7410p != 1) {
                            break;
                        }
                        ((KC[]) c0817kF2.f9285p)[i5].getClass();
                    }
                    i5++;
                }
            }
        } else if (!c1202tE.equals(fc.f4995b)) {
            c0817kF = this.f9950s;
            re = RE.d;
            list = Gt.f5344s;
        }
        RE re2 = re;
        C0817kF c0817kF3 = c0817kF;
        List list2 = list;
        if (z4) {
            K1.c cVar = this.f9928J;
            if (!cVar.d || cVar.c == 5) {
                cVar.f1053a = true;
                cVar.d = true;
                cVar.c = i4;
            } else {
                Zf.O(i4 == 5);
            }
        }
        FC fc2 = this.f9927I;
        long j8 = fc2.f5006o;
        C1286vC c1286vC3 = this.f9923E.f11251j;
        return fc2.b(c1202tE, j4, j5, j6, c1286vC3 != null ? Math.max(0L, j8 - (this.f9939V - c1286vC3.f11021o)) : 0L, re2, c0817kF3, list2);
    }

    public final void N(WD wd) {
        if (B(wd)) {
            C0001a0 c0001a0 = this.f9920B;
            if (wd == ((WD) c0001a0.f277s)) {
                c0001a0.f278t = null;
                c0001a0.f277s = null;
                c0001a0.f273o = true;
            }
            int i4 = wd.f7422v;
            if (i4 == 2) {
                Zf.X(i4 == 2);
                wd.f7422v = 1;
                wd.g();
            }
            Zf.X(wd.f7422v == 1);
            C0831kn c0831kn = wd.f7412q;
            c0831kn.f9320q = null;
            c0831kn.f9319p = null;
            wd.f7422v = 0;
            wd.f7424w = null;
            wd.f7426x = null;
            wd.f7361B = false;
            wd.i0();
            this.f9937T--;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1116rE
    public final /* bridge */ /* synthetic */ void a(ME me) {
        this.f9953v.a(9, (InterfaceC1159sE) me).a();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1116rE
    public final void b(InterfaceC1159sE interfaceC1159sE) {
        this.f9953v.a(8, interfaceC1159sE).a();
    }

    public final void c() {
        int length = this.f9946o.length;
        d(new boolean[2], this.f9923E.f11250i.c());
    }

    public final void d(boolean[] zArr, long j4) {
        WD[] wdArr;
        Set set;
        int i4;
        C1372xC c1372xC;
        int i5;
        InterfaceC1243uC interfaceC1243uC;
        C1372xC c1372xC2 = this.f9923E;
        C1286vC c1286vC = c1372xC2.f11250i;
        C0817kF c0817kF = c1286vC.f11020n;
        int i6 = 0;
        while (true) {
            wdArr = this.f9946o;
            int length = wdArr.length;
            set = this.f9947p;
            i4 = 2;
            if (i6 >= 2) {
                break;
            }
            if (!c0817kF.b(i6) && set.remove(wdArr[i6])) {
                wdArr[i6].j();
            }
            i6++;
        }
        int i7 = 0;
        while (i7 < i4) {
            if (c0817kF.b(i7)) {
                boolean z4 = zArr[i7];
                WD wd = wdArr[i7];
                if (!B(wd)) {
                    C1286vC c1286vC2 = c1372xC2.f11250i;
                    boolean z5 = c1286vC2 == c1372xC2.f11249h;
                    C0817kF c0817kF2 = c1286vC2.f11020n;
                    KC kc = ((KC[]) c0817kF2.f9285p)[i7];
                    InterfaceC0690hF interfaceC0690hF = ((InterfaceC0690hF[]) c0817kF2.f9286q)[i7];
                    int e4 = interfaceC0690hF != null ? interfaceC0690hF.e() : 0;
                    C0976o2[] c0976o2Arr = new C0976o2[e4];
                    for (int i8 = 0; i8 < e4; i8++) {
                        c0976o2Arr[i8] = interfaceC0690hF.c(i8);
                    }
                    boolean z6 = D() && this.f9927I.f4996e == 3;
                    boolean z7 = !z4 && z6;
                    this.f9937T++;
                    set.add(wd);
                    LE le = c1286vC2.c[i7];
                    long j5 = c1286vC2.f11021o;
                    Zf.X(wd.f7422v == 0);
                    wd.f7414r = kc;
                    wd.f7422v = 1;
                    wd.j0(z7, z5);
                    c1372xC = c1372xC2;
                    wd.i(c0976o2Arr, le, j4, j5);
                    wd.f7361B = false;
                    wd.f7429z = j4;
                    wd.f7359A = j4;
                    wd.k0(z7, j4);
                    wd.a(11, new C0900mC(this));
                    C0001a0 c0001a0 = this.f9920B;
                    c0001a0.getClass();
                    InterfaceC1243uC e02 = wd.e0();
                    if (e02 != null && e02 != (interfaceC1243uC = (InterfaceC1243uC) c0001a0.f278t)) {
                        if (interfaceC1243uC != null) {
                            throw new ZB(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
                        }
                        c0001a0.f278t = e02;
                        c0001a0.f277s = wd;
                        ((C1416yD) e02).c(((NC) c0001a0.f275q).f6310r);
                    }
                    i5 = 2;
                    if (z6) {
                        Zf.X(wd.f7422v == 1);
                        wd.f7422v = 2;
                        wd.f();
                    }
                    i7++;
                    i4 = i5;
                    c1372xC2 = c1372xC;
                }
            }
            c1372xC = c1372xC2;
            i5 = i4;
            i7++;
            i4 = i5;
            c1372xC2 = c1372xC;
        }
        c1286vC.f11013g = true;
    }

    public final void e(IOException iOException, int i4) {
        ZB zb = new ZB(0, iOException, i4);
        C1286vC c1286vC = this.f9923E.f11249h;
        if (c1286vC != null) {
            zb = zb.a(c1286vC.f11012f.f11118a);
        }
        Wj.i("ExoPlayerImplInternal", "Playback error", zb);
        t(false, false);
        this.f9927I = this.f9927I.d(zb);
    }

    public final void f(boolean z4) {
        C1286vC c1286vC = this.f9923E.f11251j;
        C1202tE c1202tE = c1286vC == null ? this.f9927I.f4995b : c1286vC.f11012f.f11118a;
        boolean equals = this.f9927I.f5002k.equals(c1202tE);
        if (!equals) {
            this.f9927I = this.f9927I.a(c1202tE);
        }
        FC fc = this.f9927I;
        fc.f5006o = c1286vC == null ? fc.f5008q : c1286vC.b();
        FC fc2 = this.f9927I;
        long j4 = fc2.f5006o;
        C1286vC c1286vC2 = this.f9923E.f11251j;
        fc2.f5007p = c1286vC2 != null ? Math.max(0L, j4 - (this.f9939V - c1286vC2.f11021o)) : 0L;
        if ((!equals || z4) && c1286vC != null && c1286vC.d) {
            C0817kF c0817kF = c1286vC.f11020n;
            AbstractC0484ch abstractC0484ch = this.f9927I.f4994a;
            this.f9951t.f(this.f9946o, (InterfaceC0690hF[]) c0817kF.f9286q);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:222:0x01fa, code lost:
    
        r4.f10714f.getClass();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x03cb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0338  */
    /* JADX WARN: Type inference failed for: r15v15, types: [com.google.android.gms.internal.ads.oC] */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v25, types: [com.google.android.gms.internal.ads.oC] */
    /* JADX WARN: Type inference failed for: r15v31 */
    /* JADX WARN: Type inference failed for: r15v32 */
    /* JADX WARN: Type inference failed for: r15v35 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(com.google.android.gms.internal.ads.AbstractC0484ch r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 1047
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1029pC.g(com.google.android.gms.internal.ads.ch, boolean):void");
    }

    public final void h(C0951ne c0951ne, float f4, boolean z4, boolean z5) {
        C0951ne c0951ne2;
        int i4;
        if (z4) {
            if (z5) {
                this.f9928J.a(1);
            }
            FC fc = this.f9927I;
            FC fc2 = new FC(fc.f4994a, fc.f4995b, fc.c, fc.d, fc.f4996e, fc.f4997f, fc.f4998g, fc.f4999h, fc.f5000i, fc.f5001j, fc.f5002k, fc.f5003l, fc.f5004m, c0951ne, fc.f5006o, fc.f5007p, fc.f5008q, fc.f5009r);
            c0951ne2 = c0951ne;
            this.f9927I = fc2;
        } else {
            c0951ne2 = c0951ne;
        }
        float f5 = c0951ne2.f9742a;
        C1286vC c1286vC = this.f9923E.f11249h;
        while (true) {
            i4 = 0;
            if (c1286vC == null) {
                break;
            }
            InterfaceC0690hF[] interfaceC0690hFArr = (InterfaceC0690hF[]) c1286vC.f11020n.f9286q;
            int length = interfaceC0690hFArr.length;
            while (i4 < length) {
                InterfaceC0690hF interfaceC0690hF = interfaceC0690hFArr[i4];
                i4++;
            }
            c1286vC = c1286vC.f11018l;
        }
        WD[] wdArr = this.f9946o;
        int length2 = wdArr.length;
        while (i4 < 2) {
            WD wd = wdArr[i4];
            if (wd != null) {
                wd.k(f4, c0951ne2.f9742a);
            }
            i4++;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:155|(13:(11:157|(1:217)(1:163)|164|(1:174)|171|172|173|148|149|9|10)(1:218)|190|191|192|193|194|195|146|147|148|149|9|10)|175|176|(1:178)(1:212)|179|(1:181)(1:211)|182|183|(1:185)(1:209)|186|187|188|189) */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0442, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0446, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0391, code lost:
    
        r5 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0449, code lost:
    
        r3 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0369, code lost:
    
        r1.f9956z.f10714f.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x0844, code lost:
    
        if (r1.C() != false) goto L465;
     */
    /* JADX WARN: Code restructure failed: missing block: B:526:0x08ee, code lost:
    
        if (r7 == false) goto L506;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000d. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:284:0x064a A[Catch: RuntimeException -> 0x002a, IOException -> 0x002d, hy -> 0x0030, md -> 0x0033, CD -> 0x0036, ZB -> 0x0039, TryCatch #5 {RuntimeException -> 0x002a, blocks: (B:3:0x0007, B:4:0x000d, B:7:0x0011, B:11:0x003c, B:12:0x0043, B:13:0x004a, B:16:0x0051, B:18:0x005a, B:20:0x0068, B:22:0x006f, B:23:0x0079, B:24:0x008c, B:25:0x00a3, B:26:0x00ad, B:27:0x00ae, B:29:0x00bd, B:30:0x00c3, B:31:0x00d0, B:33:0x00dd, B:34:0x00f3, B:35:0x0102, B:36:0x010d, B:38:0x011d, B:39:0x0129, B:40:0x013b, B:42:0x0145, B:45:0x0150, B:46:0x0157, B:47:0x0164, B:50:0x016b, B:52:0x0173, B:54:0x0177, B:56:0x017d, B:58:0x0185, B:60:0x018d, B:62:0x0190, B:67:0x0195, B:75:0x01a1, B:77:0x01a2, B:80:0x01a9, B:82:0x01b7, B:83:0x01ba, B:85:0x01bf, B:87:0x01cf, B:88:0x01d2, B:89:0x01d7, B:90:0x01dc, B:92:0x01e6, B:96:0x01ef, B:98:0x01f3, B:101:0x01fa, B:103:0x0201, B:105:0x0209, B:107:0x020e, B:109:0x0218, B:113:0x0221, B:115:0x024b, B:116:0x026b, B:118:0x0270, B:119:0x0274, B:121:0x0279, B:123:0x028a, B:125:0x0296, B:126:0x0299, B:134:0x02a3, B:135:0x02a4, B:136:0x02a9, B:137:0x02b1, B:138:0x02d0, B:140:0x02fc, B:147:0x0434, B:148:0x03f6, B:173:0x03f2, B:200:0x044a, B:201:0x0452, B:221:0x031e, B:224:0x0334, B:226:0x0344, B:227:0x0358, B:229:0x035d, B:232:0x0364, B:236:0x0369, B:240:0x0376, B:247:0x0453, B:249:0x0470, B:251:0x047d, B:253:0x0485, B:256:0x048c, B:258:0x0493, B:260:0x049b, B:262:0x04a3, B:264:0x04af, B:266:0x04de, B:267:0x04e3, B:268:0x04e6, B:270:0x04ea, B:271:0x04f7, B:274:0x0623, B:276:0x062b, B:278:0x0633, B:281:0x0639, B:282:0x0645, B:284:0x064a, B:286:0x0652, B:291:0x0662, B:293:0x0666, B:295:0x066e, B:296:0x0674, B:298:0x0679, B:300:0x0682, B:303:0x0696, B:305:0x069c, B:290:0x06a1, B:312:0x06a6, B:314:0x06aa, B:355:0x074d, B:359:0x0758, B:361:0x0762, B:362:0x076d, B:364:0x077b, B:365:0x0792, B:367:0x0797, B:369:0x079f, B:371:0x07a8, B:374:0x07b1, B:378:0x07c0, B:383:0x07cd, B:385:0x07d3, B:392:0x07e5, B:395:0x07f2, B:405:0x0803, B:407:0x0809, B:411:0x0811, B:413:0x0819, B:415:0x081d, B:416:0x0828, B:418:0x082e, B:419:0x0923, B:422:0x092a, B:424:0x092f, B:426:0x0937, B:428:0x0945, B:430:0x0951, B:434:0x0954, B:436:0x095a, B:438:0x0963, B:440:0x0969, B:442:0x096f, B:443:0x0990, B:445:0x0996, B:448:0x09a0, B:451:0x09cd, B:457:0x09b4, B:459:0x09b8, B:460:0x09c4, B:462:0x0976, B:465:0x0984, B:466:0x098b, B:467:0x098c, B:468:0x0836, B:470:0x083c, B:472:0x0840, B:475:0x08cd, B:477:0x08d8, B:480:0x084d, B:482:0x0851, B:484:0x0865, B:485:0x0870, B:487:0x087a, B:490:0x0883, B:492:0x088d, B:497:0x0898, B:500:0x08b5, B:503:0x08a9, B:507:0x08dc, B:509:0x08e3, B:511:0x08e7, B:514:0x08f0, B:516:0x08ff, B:518:0x0907, B:520:0x0913, B:522:0x0918, B:524:0x091b, B:525:0x0920, B:527:0x07fa, B:316:0x06b0, B:318:0x06b4, B:320:0x06bc, B:322:0x06c0, B:324:0x06ca, B:327:0x06d0, B:328:0x06d3, B:330:0x06db, B:332:0x06ed, B:334:0x06f5, B:336:0x06fd, B:339:0x0706, B:340:0x0730, B:342:0x0735, B:344:0x073b, B:346:0x0742, B:352:0x074c, B:533:0x0504, B:535:0x0508, B:537:0x0511, B:540:0x051c, B:542:0x0521, B:545:0x052f, B:550:0x0536, B:554:0x0539, B:556:0x053f, B:558:0x0549, B:560:0x057b, B:562:0x0585, B:564:0x058e, B:566:0x0596, B:568:0x0599, B:571:0x059c, B:573:0x05a2, B:576:0x05b2, B:578:0x05b7, B:580:0x05c3, B:582:0x05cb, B:584:0x05e0, B:588:0x05e6, B:587:0x05f0, B:595:0x05f9, B:597:0x05ff, B:600:0x0604, B:602:0x0609, B:604:0x0611, B:606:0x0617, B:608:0x061d, B:610:0x0620, B:615:0x04f4, B:617:0x09d2, B:620:0x09d9, B:622:0x09e1, B:625:0x09ff), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x06a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:327:0x06d0 A[Catch: RuntimeException -> 0x002a, IOException -> 0x002d, hy -> 0x0030, md -> 0x0033, CD -> 0x0036, ZB -> 0x0039, TryCatch #5 {RuntimeException -> 0x002a, blocks: (B:3:0x0007, B:4:0x000d, B:7:0x0011, B:11:0x003c, B:12:0x0043, B:13:0x004a, B:16:0x0051, B:18:0x005a, B:20:0x0068, B:22:0x006f, B:23:0x0079, B:24:0x008c, B:25:0x00a3, B:26:0x00ad, B:27:0x00ae, B:29:0x00bd, B:30:0x00c3, B:31:0x00d0, B:33:0x00dd, B:34:0x00f3, B:35:0x0102, B:36:0x010d, B:38:0x011d, B:39:0x0129, B:40:0x013b, B:42:0x0145, B:45:0x0150, B:46:0x0157, B:47:0x0164, B:50:0x016b, B:52:0x0173, B:54:0x0177, B:56:0x017d, B:58:0x0185, B:60:0x018d, B:62:0x0190, B:67:0x0195, B:75:0x01a1, B:77:0x01a2, B:80:0x01a9, B:82:0x01b7, B:83:0x01ba, B:85:0x01bf, B:87:0x01cf, B:88:0x01d2, B:89:0x01d7, B:90:0x01dc, B:92:0x01e6, B:96:0x01ef, B:98:0x01f3, B:101:0x01fa, B:103:0x0201, B:105:0x0209, B:107:0x020e, B:109:0x0218, B:113:0x0221, B:115:0x024b, B:116:0x026b, B:118:0x0270, B:119:0x0274, B:121:0x0279, B:123:0x028a, B:125:0x0296, B:126:0x0299, B:134:0x02a3, B:135:0x02a4, B:136:0x02a9, B:137:0x02b1, B:138:0x02d0, B:140:0x02fc, B:147:0x0434, B:148:0x03f6, B:173:0x03f2, B:200:0x044a, B:201:0x0452, B:221:0x031e, B:224:0x0334, B:226:0x0344, B:227:0x0358, B:229:0x035d, B:232:0x0364, B:236:0x0369, B:240:0x0376, B:247:0x0453, B:249:0x0470, B:251:0x047d, B:253:0x0485, B:256:0x048c, B:258:0x0493, B:260:0x049b, B:262:0x04a3, B:264:0x04af, B:266:0x04de, B:267:0x04e3, B:268:0x04e6, B:270:0x04ea, B:271:0x04f7, B:274:0x0623, B:276:0x062b, B:278:0x0633, B:281:0x0639, B:282:0x0645, B:284:0x064a, B:286:0x0652, B:291:0x0662, B:293:0x0666, B:295:0x066e, B:296:0x0674, B:298:0x0679, B:300:0x0682, B:303:0x0696, B:305:0x069c, B:290:0x06a1, B:312:0x06a6, B:314:0x06aa, B:355:0x074d, B:359:0x0758, B:361:0x0762, B:362:0x076d, B:364:0x077b, B:365:0x0792, B:367:0x0797, B:369:0x079f, B:371:0x07a8, B:374:0x07b1, B:378:0x07c0, B:383:0x07cd, B:385:0x07d3, B:392:0x07e5, B:395:0x07f2, B:405:0x0803, B:407:0x0809, B:411:0x0811, B:413:0x0819, B:415:0x081d, B:416:0x0828, B:418:0x082e, B:419:0x0923, B:422:0x092a, B:424:0x092f, B:426:0x0937, B:428:0x0945, B:430:0x0951, B:434:0x0954, B:436:0x095a, B:438:0x0963, B:440:0x0969, B:442:0x096f, B:443:0x0990, B:445:0x0996, B:448:0x09a0, B:451:0x09cd, B:457:0x09b4, B:459:0x09b8, B:460:0x09c4, B:462:0x0976, B:465:0x0984, B:466:0x098b, B:467:0x098c, B:468:0x0836, B:470:0x083c, B:472:0x0840, B:475:0x08cd, B:477:0x08d8, B:480:0x084d, B:482:0x0851, B:484:0x0865, B:485:0x0870, B:487:0x087a, B:490:0x0883, B:492:0x088d, B:497:0x0898, B:500:0x08b5, B:503:0x08a9, B:507:0x08dc, B:509:0x08e3, B:511:0x08e7, B:514:0x08f0, B:516:0x08ff, B:518:0x0907, B:520:0x0913, B:522:0x0918, B:524:0x091b, B:525:0x0920, B:527:0x07fa, B:316:0x06b0, B:318:0x06b4, B:320:0x06bc, B:322:0x06c0, B:324:0x06ca, B:327:0x06d0, B:328:0x06d3, B:330:0x06db, B:332:0x06ed, B:334:0x06f5, B:336:0x06fd, B:339:0x0706, B:340:0x0730, B:342:0x0735, B:344:0x073b, B:346:0x0742, B:352:0x074c, B:533:0x0504, B:535:0x0508, B:537:0x0511, B:540:0x051c, B:542:0x0521, B:545:0x052f, B:550:0x0536, B:554:0x0539, B:556:0x053f, B:558:0x0549, B:560:0x057b, B:562:0x0585, B:564:0x058e, B:566:0x0596, B:568:0x0599, B:571:0x059c, B:573:0x05a2, B:576:0x05b2, B:578:0x05b7, B:580:0x05c3, B:582:0x05cb, B:584:0x05e0, B:588:0x05e6, B:587:0x05f0, B:595:0x05f9, B:597:0x05ff, B:600:0x0604, B:602:0x0609, B:604:0x0611, B:606:0x0617, B:608:0x061d, B:610:0x0620, B:615:0x04f4, B:617:0x09d2, B:620:0x09d9, B:622:0x09e1, B:625:0x09ff), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:330:0x06db A[Catch: RuntimeException -> 0x002a, IOException -> 0x002d, hy -> 0x0030, md -> 0x0033, CD -> 0x0036, ZB -> 0x0039, TryCatch #5 {RuntimeException -> 0x002a, blocks: (B:3:0x0007, B:4:0x000d, B:7:0x0011, B:11:0x003c, B:12:0x0043, B:13:0x004a, B:16:0x0051, B:18:0x005a, B:20:0x0068, B:22:0x006f, B:23:0x0079, B:24:0x008c, B:25:0x00a3, B:26:0x00ad, B:27:0x00ae, B:29:0x00bd, B:30:0x00c3, B:31:0x00d0, B:33:0x00dd, B:34:0x00f3, B:35:0x0102, B:36:0x010d, B:38:0x011d, B:39:0x0129, B:40:0x013b, B:42:0x0145, B:45:0x0150, B:46:0x0157, B:47:0x0164, B:50:0x016b, B:52:0x0173, B:54:0x0177, B:56:0x017d, B:58:0x0185, B:60:0x018d, B:62:0x0190, B:67:0x0195, B:75:0x01a1, B:77:0x01a2, B:80:0x01a9, B:82:0x01b7, B:83:0x01ba, B:85:0x01bf, B:87:0x01cf, B:88:0x01d2, B:89:0x01d7, B:90:0x01dc, B:92:0x01e6, B:96:0x01ef, B:98:0x01f3, B:101:0x01fa, B:103:0x0201, B:105:0x0209, B:107:0x020e, B:109:0x0218, B:113:0x0221, B:115:0x024b, B:116:0x026b, B:118:0x0270, B:119:0x0274, B:121:0x0279, B:123:0x028a, B:125:0x0296, B:126:0x0299, B:134:0x02a3, B:135:0x02a4, B:136:0x02a9, B:137:0x02b1, B:138:0x02d0, B:140:0x02fc, B:147:0x0434, B:148:0x03f6, B:173:0x03f2, B:200:0x044a, B:201:0x0452, B:221:0x031e, B:224:0x0334, B:226:0x0344, B:227:0x0358, B:229:0x035d, B:232:0x0364, B:236:0x0369, B:240:0x0376, B:247:0x0453, B:249:0x0470, B:251:0x047d, B:253:0x0485, B:256:0x048c, B:258:0x0493, B:260:0x049b, B:262:0x04a3, B:264:0x04af, B:266:0x04de, B:267:0x04e3, B:268:0x04e6, B:270:0x04ea, B:271:0x04f7, B:274:0x0623, B:276:0x062b, B:278:0x0633, B:281:0x0639, B:282:0x0645, B:284:0x064a, B:286:0x0652, B:291:0x0662, B:293:0x0666, B:295:0x066e, B:296:0x0674, B:298:0x0679, B:300:0x0682, B:303:0x0696, B:305:0x069c, B:290:0x06a1, B:312:0x06a6, B:314:0x06aa, B:355:0x074d, B:359:0x0758, B:361:0x0762, B:362:0x076d, B:364:0x077b, B:365:0x0792, B:367:0x0797, B:369:0x079f, B:371:0x07a8, B:374:0x07b1, B:378:0x07c0, B:383:0x07cd, B:385:0x07d3, B:392:0x07e5, B:395:0x07f2, B:405:0x0803, B:407:0x0809, B:411:0x0811, B:413:0x0819, B:415:0x081d, B:416:0x0828, B:418:0x082e, B:419:0x0923, B:422:0x092a, B:424:0x092f, B:426:0x0937, B:428:0x0945, B:430:0x0951, B:434:0x0954, B:436:0x095a, B:438:0x0963, B:440:0x0969, B:442:0x096f, B:443:0x0990, B:445:0x0996, B:448:0x09a0, B:451:0x09cd, B:457:0x09b4, B:459:0x09b8, B:460:0x09c4, B:462:0x0976, B:465:0x0984, B:466:0x098b, B:467:0x098c, B:468:0x0836, B:470:0x083c, B:472:0x0840, B:475:0x08cd, B:477:0x08d8, B:480:0x084d, B:482:0x0851, B:484:0x0865, B:485:0x0870, B:487:0x087a, B:490:0x0883, B:492:0x088d, B:497:0x0898, B:500:0x08b5, B:503:0x08a9, B:507:0x08dc, B:509:0x08e3, B:511:0x08e7, B:514:0x08f0, B:516:0x08ff, B:518:0x0907, B:520:0x0913, B:522:0x0918, B:524:0x091b, B:525:0x0920, B:527:0x07fa, B:316:0x06b0, B:318:0x06b4, B:320:0x06bc, B:322:0x06c0, B:324:0x06ca, B:327:0x06d0, B:328:0x06d3, B:330:0x06db, B:332:0x06ed, B:334:0x06f5, B:336:0x06fd, B:339:0x0706, B:340:0x0730, B:342:0x0735, B:344:0x073b, B:346:0x0742, B:352:0x074c, B:533:0x0504, B:535:0x0508, B:537:0x0511, B:540:0x051c, B:542:0x0521, B:545:0x052f, B:550:0x0536, B:554:0x0539, B:556:0x053f, B:558:0x0549, B:560:0x057b, B:562:0x0585, B:564:0x058e, B:566:0x0596, B:568:0x0599, B:571:0x059c, B:573:0x05a2, B:576:0x05b2, B:578:0x05b7, B:580:0x05c3, B:582:0x05cb, B:584:0x05e0, B:588:0x05e6, B:587:0x05f0, B:595:0x05f9, B:597:0x05ff, B:600:0x0604, B:602:0x0609, B:604:0x0611, B:606:0x0617, B:608:0x061d, B:610:0x0620, B:615:0x04f4, B:617:0x09d2, B:620:0x09d9, B:622:0x09e1, B:625:0x09ff), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0735 A[Catch: RuntimeException -> 0x002a, IOException -> 0x002d, hy -> 0x0030, md -> 0x0033, CD -> 0x0036, ZB -> 0x0039, TryCatch #5 {RuntimeException -> 0x002a, blocks: (B:3:0x0007, B:4:0x000d, B:7:0x0011, B:11:0x003c, B:12:0x0043, B:13:0x004a, B:16:0x0051, B:18:0x005a, B:20:0x0068, B:22:0x006f, B:23:0x0079, B:24:0x008c, B:25:0x00a3, B:26:0x00ad, B:27:0x00ae, B:29:0x00bd, B:30:0x00c3, B:31:0x00d0, B:33:0x00dd, B:34:0x00f3, B:35:0x0102, B:36:0x010d, B:38:0x011d, B:39:0x0129, B:40:0x013b, B:42:0x0145, B:45:0x0150, B:46:0x0157, B:47:0x0164, B:50:0x016b, B:52:0x0173, B:54:0x0177, B:56:0x017d, B:58:0x0185, B:60:0x018d, B:62:0x0190, B:67:0x0195, B:75:0x01a1, B:77:0x01a2, B:80:0x01a9, B:82:0x01b7, B:83:0x01ba, B:85:0x01bf, B:87:0x01cf, B:88:0x01d2, B:89:0x01d7, B:90:0x01dc, B:92:0x01e6, B:96:0x01ef, B:98:0x01f3, B:101:0x01fa, B:103:0x0201, B:105:0x0209, B:107:0x020e, B:109:0x0218, B:113:0x0221, B:115:0x024b, B:116:0x026b, B:118:0x0270, B:119:0x0274, B:121:0x0279, B:123:0x028a, B:125:0x0296, B:126:0x0299, B:134:0x02a3, B:135:0x02a4, B:136:0x02a9, B:137:0x02b1, B:138:0x02d0, B:140:0x02fc, B:147:0x0434, B:148:0x03f6, B:173:0x03f2, B:200:0x044a, B:201:0x0452, B:221:0x031e, B:224:0x0334, B:226:0x0344, B:227:0x0358, B:229:0x035d, B:232:0x0364, B:236:0x0369, B:240:0x0376, B:247:0x0453, B:249:0x0470, B:251:0x047d, B:253:0x0485, B:256:0x048c, B:258:0x0493, B:260:0x049b, B:262:0x04a3, B:264:0x04af, B:266:0x04de, B:267:0x04e3, B:268:0x04e6, B:270:0x04ea, B:271:0x04f7, B:274:0x0623, B:276:0x062b, B:278:0x0633, B:281:0x0639, B:282:0x0645, B:284:0x064a, B:286:0x0652, B:291:0x0662, B:293:0x0666, B:295:0x066e, B:296:0x0674, B:298:0x0679, B:300:0x0682, B:303:0x0696, B:305:0x069c, B:290:0x06a1, B:312:0x06a6, B:314:0x06aa, B:355:0x074d, B:359:0x0758, B:361:0x0762, B:362:0x076d, B:364:0x077b, B:365:0x0792, B:367:0x0797, B:369:0x079f, B:371:0x07a8, B:374:0x07b1, B:378:0x07c0, B:383:0x07cd, B:385:0x07d3, B:392:0x07e5, B:395:0x07f2, B:405:0x0803, B:407:0x0809, B:411:0x0811, B:413:0x0819, B:415:0x081d, B:416:0x0828, B:418:0x082e, B:419:0x0923, B:422:0x092a, B:424:0x092f, B:426:0x0937, B:428:0x0945, B:430:0x0951, B:434:0x0954, B:436:0x095a, B:438:0x0963, B:440:0x0969, B:442:0x096f, B:443:0x0990, B:445:0x0996, B:448:0x09a0, B:451:0x09cd, B:457:0x09b4, B:459:0x09b8, B:460:0x09c4, B:462:0x0976, B:465:0x0984, B:466:0x098b, B:467:0x098c, B:468:0x0836, B:470:0x083c, B:472:0x0840, B:475:0x08cd, B:477:0x08d8, B:480:0x084d, B:482:0x0851, B:484:0x0865, B:485:0x0870, B:487:0x087a, B:490:0x0883, B:492:0x088d, B:497:0x0898, B:500:0x08b5, B:503:0x08a9, B:507:0x08dc, B:509:0x08e3, B:511:0x08e7, B:514:0x08f0, B:516:0x08ff, B:518:0x0907, B:520:0x0913, B:522:0x0918, B:524:0x091b, B:525:0x0920, B:527:0x07fa, B:316:0x06b0, B:318:0x06b4, B:320:0x06bc, B:322:0x06c0, B:324:0x06ca, B:327:0x06d0, B:328:0x06d3, B:330:0x06db, B:332:0x06ed, B:334:0x06f5, B:336:0x06fd, B:339:0x0706, B:340:0x0730, B:342:0x0735, B:344:0x073b, B:346:0x0742, B:352:0x074c, B:533:0x0504, B:535:0x0508, B:537:0x0511, B:540:0x051c, B:542:0x0521, B:545:0x052f, B:550:0x0536, B:554:0x0539, B:556:0x053f, B:558:0x0549, B:560:0x057b, B:562:0x0585, B:564:0x058e, B:566:0x0596, B:568:0x0599, B:571:0x059c, B:573:0x05a2, B:576:0x05b2, B:578:0x05b7, B:580:0x05c3, B:582:0x05cb, B:584:0x05e0, B:588:0x05e6, B:587:0x05f0, B:595:0x05f9, B:597:0x05ff, B:600:0x0604, B:602:0x0609, B:604:0x0611, B:606:0x0617, B:608:0x061d, B:610:0x0620, B:615:0x04f4, B:617:0x09d2, B:620:0x09d9, B:622:0x09e1, B:625:0x09ff), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:351:0x074c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0929  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x0996 A[Catch: RuntimeException -> 0x002a, IOException -> 0x002d, hy -> 0x0030, md -> 0x0033, CD -> 0x0036, ZB -> 0x0039, TryCatch #5 {RuntimeException -> 0x002a, blocks: (B:3:0x0007, B:4:0x000d, B:7:0x0011, B:11:0x003c, B:12:0x0043, B:13:0x004a, B:16:0x0051, B:18:0x005a, B:20:0x0068, B:22:0x006f, B:23:0x0079, B:24:0x008c, B:25:0x00a3, B:26:0x00ad, B:27:0x00ae, B:29:0x00bd, B:30:0x00c3, B:31:0x00d0, B:33:0x00dd, B:34:0x00f3, B:35:0x0102, B:36:0x010d, B:38:0x011d, B:39:0x0129, B:40:0x013b, B:42:0x0145, B:45:0x0150, B:46:0x0157, B:47:0x0164, B:50:0x016b, B:52:0x0173, B:54:0x0177, B:56:0x017d, B:58:0x0185, B:60:0x018d, B:62:0x0190, B:67:0x0195, B:75:0x01a1, B:77:0x01a2, B:80:0x01a9, B:82:0x01b7, B:83:0x01ba, B:85:0x01bf, B:87:0x01cf, B:88:0x01d2, B:89:0x01d7, B:90:0x01dc, B:92:0x01e6, B:96:0x01ef, B:98:0x01f3, B:101:0x01fa, B:103:0x0201, B:105:0x0209, B:107:0x020e, B:109:0x0218, B:113:0x0221, B:115:0x024b, B:116:0x026b, B:118:0x0270, B:119:0x0274, B:121:0x0279, B:123:0x028a, B:125:0x0296, B:126:0x0299, B:134:0x02a3, B:135:0x02a4, B:136:0x02a9, B:137:0x02b1, B:138:0x02d0, B:140:0x02fc, B:147:0x0434, B:148:0x03f6, B:173:0x03f2, B:200:0x044a, B:201:0x0452, B:221:0x031e, B:224:0x0334, B:226:0x0344, B:227:0x0358, B:229:0x035d, B:232:0x0364, B:236:0x0369, B:240:0x0376, B:247:0x0453, B:249:0x0470, B:251:0x047d, B:253:0x0485, B:256:0x048c, B:258:0x0493, B:260:0x049b, B:262:0x04a3, B:264:0x04af, B:266:0x04de, B:267:0x04e3, B:268:0x04e6, B:270:0x04ea, B:271:0x04f7, B:274:0x0623, B:276:0x062b, B:278:0x0633, B:281:0x0639, B:282:0x0645, B:284:0x064a, B:286:0x0652, B:291:0x0662, B:293:0x0666, B:295:0x066e, B:296:0x0674, B:298:0x0679, B:300:0x0682, B:303:0x0696, B:305:0x069c, B:290:0x06a1, B:312:0x06a6, B:314:0x06aa, B:355:0x074d, B:359:0x0758, B:361:0x0762, B:362:0x076d, B:364:0x077b, B:365:0x0792, B:367:0x0797, B:369:0x079f, B:371:0x07a8, B:374:0x07b1, B:378:0x07c0, B:383:0x07cd, B:385:0x07d3, B:392:0x07e5, B:395:0x07f2, B:405:0x0803, B:407:0x0809, B:411:0x0811, B:413:0x0819, B:415:0x081d, B:416:0x0828, B:418:0x082e, B:419:0x0923, B:422:0x092a, B:424:0x092f, B:426:0x0937, B:428:0x0945, B:430:0x0951, B:434:0x0954, B:436:0x095a, B:438:0x0963, B:440:0x0969, B:442:0x096f, B:443:0x0990, B:445:0x0996, B:448:0x09a0, B:451:0x09cd, B:457:0x09b4, B:459:0x09b8, B:460:0x09c4, B:462:0x0976, B:465:0x0984, B:466:0x098b, B:467:0x098c, B:468:0x0836, B:470:0x083c, B:472:0x0840, B:475:0x08cd, B:477:0x08d8, B:480:0x084d, B:482:0x0851, B:484:0x0865, B:485:0x0870, B:487:0x087a, B:490:0x0883, B:492:0x088d, B:497:0x0898, B:500:0x08b5, B:503:0x08a9, B:507:0x08dc, B:509:0x08e3, B:511:0x08e7, B:514:0x08f0, B:516:0x08ff, B:518:0x0907, B:520:0x0913, B:522:0x0918, B:524:0x091b, B:525:0x0920, B:527:0x07fa, B:316:0x06b0, B:318:0x06b4, B:320:0x06bc, B:322:0x06c0, B:324:0x06ca, B:327:0x06d0, B:328:0x06d3, B:330:0x06db, B:332:0x06ed, B:334:0x06f5, B:336:0x06fd, B:339:0x0706, B:340:0x0730, B:342:0x0735, B:344:0x073b, B:346:0x0742, B:352:0x074c, B:533:0x0504, B:535:0x0508, B:537:0x0511, B:540:0x051c, B:542:0x0521, B:545:0x052f, B:550:0x0536, B:554:0x0539, B:556:0x053f, B:558:0x0549, B:560:0x057b, B:562:0x0585, B:564:0x058e, B:566:0x0596, B:568:0x0599, B:571:0x059c, B:573:0x05a2, B:576:0x05b2, B:578:0x05b7, B:580:0x05c3, B:582:0x05cb, B:584:0x05e0, B:588:0x05e6, B:587:0x05f0, B:595:0x05f9, B:597:0x05ff, B:600:0x0604, B:602:0x0609, B:604:0x0611, B:606:0x0617, B:608:0x061d, B:610:0x0620, B:615:0x04f4, B:617:0x09d2, B:620:0x09d9, B:622:0x09e1, B:625:0x09ff), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:450:0x09ab  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x09ac  */
    /* JADX WARN: Type inference failed for: r0v115, types: [com.google.android.gms.internal.ads.sE, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v158, types: [com.google.android.gms.internal.ads.ME, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v128, types: [com.google.android.gms.internal.ads.sE, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v167, types: [com.google.android.gms.internal.ads.ME, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v39, types: [com.google.android.gms.internal.ads.oF, com.google.android.gms.internal.ads.NB] */
    /* JADX WARN: Type inference failed for: r2v45, types: [com.google.android.gms.internal.ads.sE, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v50, types: [com.google.android.gms.internal.ads.sE, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6, types: [com.google.android.gms.internal.ads.sE, java.lang.Object] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r34) {
        /*
            Method dump skipped, instructions count: 2934
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1029pC.handleMessage(android.os.Message):boolean");
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.google.android.gms.internal.ads.sE, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.google.android.gms.internal.ads.ME, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.internal.ads.ME, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [com.google.android.gms.internal.ads.rC, java.lang.Object] */
    public final void i() {
        boolean d;
        boolean z4 = false;
        if (A()) {
            C1286vC c1286vC = this.f9923E.f11251j;
            long e4 = !c1286vC.d ? 0L : c1286vC.f11009a.e();
            C1286vC c1286vC2 = this.f9923E.f11251j;
            long max = c1286vC2 == null ? 0L : Math.max(0L, e4 - (this.f9939V - c1286vC2.f11021o));
            C1286vC c1286vC3 = this.f9923E.f11249h;
            d = this.f9951t.d(max, this.f9920B.e().f9742a);
            if (!d && max < 500000 && this.f9919A > 0) {
                this.f9923E.f11249h.f11009a.m(this.f9927I.f5008q);
                d = this.f9951t.d(max, this.f9920B.e().f9742a);
            }
        } else {
            d = false;
        }
        this.f9933P = d;
        if (d) {
            C1286vC c1286vC4 = this.f9923E.f11251j;
            long j4 = this.f9939V;
            float f4 = this.f9920B.e().f9742a;
            long j5 = this.f9932O;
            Zf.X(c1286vC4.f11018l == null);
            long j6 = j4 - c1286vC4.f11021o;
            ?? obj = new Object();
            obj.f10467b = -3.4028235E38f;
            obj.c = -9223372036854775807L;
            obj.f10466a = j6;
            Zf.O(f4 > 0.0f || f4 == -3.4028235E38f);
            obj.f10467b = f4;
            if (j5 >= 0) {
                z4 = true;
            } else if (j5 == -9223372036854775807L) {
                z4 = true;
                j5 = -9223372036854775807L;
            }
            Zf.O(z4);
            obj.c = j5;
            c1286vC4.f11009a.k(new C1200tC(obj));
        }
        v();
    }

    public final void j() {
        K1.c cVar = this.f9928J;
        FC fc = this.f9927I;
        boolean z4 = cVar.f1053a | (((FC) cVar.f1056f) != fc);
        cVar.f1053a = z4;
        cVar.f1056f = fc;
        if (z4) {
            C0857lC c0857lC = (C0857lC) this.f9944a0.f8087p;
            c0857lC.f9424x.b(new Jn(12, c0857lC, cVar));
            this.f9928J = new K1.c(this.f9927I);
        }
    }

    public final void k() {
        int i4;
        int i5;
        float f4 = this.f9920B.e().f9742a;
        C1372xC c1372xC = this.f9923E;
        C1286vC c1286vC = c1372xC.f11249h;
        C1286vC c1286vC2 = c1372xC.f11250i;
        boolean z4 = true;
        for (C1286vC c1286vC3 = c1286vC; c1286vC3 != null && c1286vC3.d; c1286vC3 = c1286vC3.f11018l) {
            C0817kF e4 = c1286vC3.e(this.f9927I.f4994a);
            C0817kF c0817kF = c1286vC3.f11020n;
            boolean z5 = false;
            if (c0817kF != null) {
                if (((InterfaceC0690hF[]) c0817kF.f9286q).length == ((InterfaceC0690hF[]) e4.f9286q).length) {
                    for (int i6 = 0; i6 < ((InterfaceC0690hF[]) e4.f9286q).length; i6++) {
                        if (e4.a(c0817kF, i6)) {
                        }
                    }
                    if (c1286vC3 != c1286vC2) {
                        z5 = true;
                    }
                    z4 &= z5;
                }
            }
            if (z4) {
                C1372xC c1372xC2 = this.f9923E;
                C1286vC c1286vC4 = c1372xC2.f11249h;
                boolean k3 = c1372xC2.k(c1286vC4);
                int length = this.f9946o.length;
                boolean[] zArr = new boolean[2];
                long a4 = c1286vC4.a(e4, this.f9927I.f5008q, k3, zArr);
                FC fc = this.f9927I;
                boolean z6 = (fc.f4996e == 4 || a4 == fc.f5008q) ? false : true;
                FC fc2 = this.f9927I;
                i5 = 2;
                i4 = 4;
                this.f9927I = M(fc2.f4995b, a4, fc2.c, fc2.d, z6, 5);
                if (z6) {
                    n(a4);
                }
                int length2 = this.f9946o.length;
                boolean[] zArr2 = new boolean[2];
                int i7 = 0;
                while (true) {
                    WD[] wdArr = this.f9946o;
                    int length3 = wdArr.length;
                    if (i7 >= 2) {
                        break;
                    }
                    WD wd = wdArr[i7];
                    boolean B4 = B(wd);
                    zArr2[i7] = B4;
                    LE le = c1286vC4.c[i7];
                    if (B4) {
                        if (le != wd.f7424w) {
                            N(wd);
                        } else if (zArr[i7]) {
                            long j4 = this.f9939V;
                            wd.f7361B = false;
                            wd.f7429z = j4;
                            wd.f7359A = j4;
                            wd.k0(false, j4);
                        }
                    }
                    i7++;
                }
                d(zArr2, this.f9939V);
            } else {
                i4 = 4;
                i5 = 2;
                this.f9923E.k(c1286vC3);
                if (c1286vC3.d) {
                    c1286vC3.a(e4, Math.max(c1286vC3.f11012f.f11119b, this.f9939V - c1286vC3.f11021o), false, new boolean[2]);
                }
            }
            f(true);
            if (this.f9927I.f4996e != i4) {
                i();
                w();
                this.f9953v.c(i5);
                return;
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bf, code lost:
    
        if (r2.equals(r31.f9927I.f4995b) == false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(boolean r32, boolean r33, boolean r34, boolean r35) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1029pC.l(boolean, boolean, boolean, boolean):void");
    }

    public final void m() {
        C1286vC c1286vC = this.f9923E.f11249h;
        boolean z4 = false;
        if (c1286vC != null && c1286vC.f11012f.f11122g && this.f9930L) {
            z4 = true;
        }
        this.f9931M = z4;
    }

    public final void n(long j4) {
        C1286vC c1286vC = this.f9923E.f11249h;
        long j5 = j4 + (c1286vC == null ? 1000000000000L : c1286vC.f11021o);
        this.f9939V = j5;
        ((NC) this.f9920B.f275q).a(j5);
        WD[] wdArr = this.f9946o;
        int length = wdArr.length;
        for (int i4 = 0; i4 < 2; i4++) {
            WD wd = wdArr[i4];
            if (B(wd)) {
                long j6 = this.f9939V;
                wd.f7361B = false;
                wd.f7429z = j6;
                wd.f7359A = j6;
                wd.k0(false, j6);
            }
        }
        for (C1286vC c1286vC2 = r0.f11249h; c1286vC2 != null; c1286vC2 = c1286vC2.f11018l) {
            for (InterfaceC0690hF interfaceC0690hF : (InterfaceC0690hF[]) c1286vC2.f11020n.f9286q) {
            }
        }
    }

    public final void o(AbstractC0484ch abstractC0484ch, AbstractC0484ch abstractC0484ch2) {
        if (abstractC0484ch.o() && abstractC0484ch2.o()) {
            return;
        }
        ArrayList arrayList = this.f9921C;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            arrayList.get(size).getClass();
            throw new ClassCastException();
        }
    }

    public final void p(boolean z4) {
        C1202tE c1202tE = this.f9923E.f11249h.f11012f.f11118a;
        long J4 = J(c1202tE, this.f9927I.f5008q, true, false);
        if (J4 != this.f9927I.f5008q) {
            FC fc = this.f9927I;
            this.f9927I = M(c1202tE, J4, fc.c, fc.d, z4, 5);
        }
    }

    public final void q(int i4, int i5, boolean z4, boolean z5) {
        this.f9928J.a(z5 ? 1 : 0);
        K1.c cVar = this.f9928J;
        cVar.f1053a = true;
        cVar.f1057g = true;
        cVar.f1055e = i5;
        this.f9927I = this.f9927I.c(i4, z4);
        y(false, false);
        for (C1286vC c1286vC = this.f9923E.f11249h; c1286vC != null; c1286vC = c1286vC.f11018l) {
            for (InterfaceC0690hF interfaceC0690hF : (InterfaceC0690hF[]) c1286vC.f11020n.f9286q) {
            }
        }
        if (!D()) {
            u();
            w();
            return;
        }
        int i6 = this.f9927I.f4996e;
        C1135rr c1135rr = this.f9953v;
        if (i6 == 3) {
            s();
            c1135rr.c(2);
        } else if (i6 == 2) {
            c1135rr.c(2);
        }
    }

    public final void r(int i4) {
        FC fc = this.f9927I;
        if (fc.f4996e != i4) {
            if (i4 != 2) {
                this.f9943Z = -9223372036854775807L;
            }
            this.f9927I = fc.e(i4);
        }
    }

    public final void s() {
        y(false, false);
        C0001a0 c0001a0 = this.f9920B;
        c0001a0.f274p = true;
        NC nc = (NC) c0001a0.f275q;
        if (!nc.f6307o) {
            nc.f6309q = SystemClock.elapsedRealtime();
            nc.f6307o = true;
        }
        WD[] wdArr = this.f9946o;
        int length = wdArr.length;
        for (int i4 = 0; i4 < 2; i4++) {
            WD wd = wdArr[i4];
            if (B(wd)) {
                Zf.X(wd.f7422v == 1);
                wd.f7422v = 2;
                wd.f();
            }
        }
    }

    public final void t(boolean z4, boolean z5) {
        l(z4 || !this.f9936S, false, true, false);
        this.f9928J.a(z5 ? 1 : 0);
        this.f9951t.i();
        r(1);
    }

    public final void u() {
        int i4;
        C0001a0 c0001a0 = this.f9920B;
        c0001a0.f274p = false;
        NC nc = (NC) c0001a0.f275q;
        if (nc.f6307o) {
            nc.a(nc.b());
            nc.f6307o = false;
        }
        WD[] wdArr = this.f9946o;
        int length = wdArr.length;
        for (int i5 = 0; i5 < 2; i5++) {
            WD wd = wdArr[i5];
            if (B(wd) && (i4 = wd.f7422v) == 2) {
                Zf.X(i4 == 2);
                wd.f7422v = 1;
                wd.g();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [com.google.android.gms.internal.ads.ME, java.lang.Object] */
    public final void v() {
        C1286vC c1286vC = this.f9923E.f11251j;
        boolean z4 = this.f9933P || (c1286vC != null && c1286vC.f11009a.o());
        FC fc = this.f9927I;
        if (z4 != fc.f4998g) {
            this.f9927I = new FC(fc.f4994a, fc.f4995b, fc.c, fc.d, fc.f4996e, fc.f4997f, z4, fc.f4999h, fc.f5000i, fc.f5001j, fc.f5002k, fc.f5003l, fc.f5004m, fc.f5005n, fc.f5006o, fc.f5007p, fc.f5008q, fc.f5009r);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r2v28, types: [com.google.android.gms.internal.ads.sE, java.lang.Object] */
    public final void w() {
        long b4;
        long j4;
        long max;
        ?? r17;
        int i4;
        long max2;
        float f4;
        long max3;
        C1286vC c1286vC = this.f9923E.f11249h;
        if (c1286vC == null) {
            return;
        }
        long i5 = c1286vC.d ? c1286vC.f11009a.i() : -9223372036854775807L;
        if (i5 != -9223372036854775807L) {
            if (!c1286vC.h()) {
                this.f9923E.k(c1286vC);
                f(false);
                i();
            }
            n(i5);
            if (i5 != this.f9927I.f5008q) {
                FC fc = this.f9927I;
                this.f9927I = M(fc.f4995b, i5, fc.c, i5, true, 5);
            }
        } else {
            C0001a0 c0001a0 = this.f9920B;
            boolean z4 = c1286vC != this.f9923E.f11250i;
            NC nc = (NC) c0001a0.f275q;
            WD wd = (WD) c0001a0.f277s;
            if (wd == null || wd.o() || (!((WD) c0001a0.f277s).p() && (z4 || ((WD) c0001a0.f277s).l()))) {
                c0001a0.f273o = true;
                if (c0001a0.f274p && !nc.f6307o) {
                    nc.f6309q = SystemClock.elapsedRealtime();
                    nc.f6307o = true;
                }
            } else {
                InterfaceC1243uC interfaceC1243uC = (InterfaceC1243uC) c0001a0.f278t;
                interfaceC1243uC.getClass();
                long b5 = interfaceC1243uC.b();
                if (c0001a0.f273o) {
                    if (b5 >= nc.b()) {
                        c0001a0.f273o = false;
                        if (c0001a0.f274p && !nc.f6307o) {
                            nc.f6309q = SystemClock.elapsedRealtime();
                            nc.f6307o = true;
                        }
                    } else if (nc.f6307o) {
                        nc.a(nc.b());
                        nc.f6307o = false;
                    }
                }
                nc.a(b5);
                C0951ne e4 = interfaceC1243uC.e();
                if (!e4.equals(nc.f6310r)) {
                    nc.c(e4);
                    ((C1029pC) c0001a0.f276r).f9953v.a(16, e4).a();
                }
            }
            if (c0001a0.f273o) {
                b4 = nc.b();
            } else {
                InterfaceC1243uC interfaceC1243uC2 = (InterfaceC1243uC) c0001a0.f278t;
                interfaceC1243uC2.getClass();
                b4 = interfaceC1243uC2.b();
            }
            this.f9939V = b4;
            long j5 = b4 - c1286vC.f11021o;
            long j6 = this.f9927I.f5008q;
            if (!this.f9921C.isEmpty() && !this.f9927I.f4995b.b()) {
                if (this.f9941X) {
                    this.f9941X = false;
                }
                FC fc2 = this.f9927I;
                fc2.f4994a.a(fc2.f4995b.f10688a);
                int min = Math.min(this.f9940W, this.f9921C.size());
                if (min > 0 && this.f9921C.get(min - 1) != null) {
                    throw new ClassCastException();
                }
                if (min < this.f9921C.size() && this.f9921C.get(min) != null) {
                    throw new ClassCastException();
                }
                this.f9940W = min;
            }
            FC fc3 = this.f9927I;
            fc3.f5008q = j5;
            fc3.f5009r = SystemClock.elapsedRealtime();
        }
        this.f9927I.f5006o = this.f9923E.f11251j.b();
        FC fc4 = this.f9927I;
        long j7 = fc4.f5006o;
        C1286vC c1286vC2 = this.f9923E.f11251j;
        if (c1286vC2 == null) {
            max = 0;
            j4 = -9223372036854775807L;
        } else {
            j4 = -9223372036854775807L;
            max = Math.max(0L, j7 - (this.f9939V - c1286vC2.f11021o));
        }
        fc4.f5007p = max;
        FC fc5 = this.f9927I;
        if (fc5.f5003l && fc5.f4996e == 3 && E(fc5.f4994a, fc5.f4995b)) {
            FC fc6 = this.f9927I;
            float f5 = 1.0f;
            if (fc6.f5005n.f9742a == 1.0f) {
                XB xb = this.f9945b0;
                long I4 = I(fc6.f4994a, fc6.f4995b.f10688a, fc6.f5008q);
                long j8 = this.f9927I.f5006o;
                C1286vC c1286vC3 = this.f9923E.f11251j;
                if (c1286vC3 == null) {
                    max2 = 0;
                    i4 = 1;
                    r17 = 0;
                } else {
                    r17 = 0;
                    i4 = 1;
                    max2 = Math.max(0L, j8 - (this.f9939V - c1286vC3.f11021o));
                }
                if (xb.c != j4) {
                    long j9 = I4 - max2;
                    if (xb.f7614k == j4) {
                        xb.f7614k = j9;
                        xb.f7615l = 0L;
                    } else {
                        xb.f7614k = Math.max(j9, (((float) j9) * 9.999871E-4f) + (((float) r11) * 0.999f));
                        xb.f7615l = (((float) Math.abs(j9 - r12)) * 9.999871E-4f) + (((float) xb.f7615l) * 0.999f);
                    }
                    if (xb.f7613j == j4 || SystemClock.elapsedRealtime() - xb.f7613j >= 1000) {
                        xb.f7613j = SystemClock.elapsedRealtime();
                        long j10 = (xb.f7615l * 3) + xb.f7614k;
                        if (xb.f7611h > j10) {
                            long t4 = AbstractC0751is.t(1000L);
                            float f6 = xb.f7612i - 1.0f;
                            long j11 = xb.f7608e;
                            f4 = 1.0E-7f;
                            float f7 = (float) t4;
                            long j12 = xb.f7611h - ((0.029999971f * f7) + (f6 * f7));
                            long[] jArr = new long[3];
                            jArr[r17] = j10;
                            jArr[i4] = j11;
                            jArr[2] = j12;
                            max3 = jArr[r17];
                            for (int i6 = i4; i6 < 3; i6++) {
                                long j13 = jArr[i6];
                                if (j13 > max3) {
                                    max3 = j13;
                                }
                            }
                            xb.f7611h = max3;
                        } else {
                            f4 = 1.0E-7f;
                            max3 = Math.max(xb.f7611h, Math.min(I4 - (Math.max(0.0f, xb.f7612i - 1.0f) / 1.0E-7f), j10));
                            xb.f7611h = max3;
                            long j14 = xb.f7610g;
                            if (j14 != j4 && max3 > j14) {
                                xb.f7611h = j14;
                                max3 = j14;
                            }
                        }
                        long j15 = I4 - max3;
                        if (Math.abs(j15) < xb.f7606a) {
                            xb.f7612i = 1.0f;
                            f5 = 1.0f;
                        } else {
                            f5 = Math.max(0.97f, Math.min((((float) j15) * f4) + 1.0f, 1.03f));
                            xb.f7612i = f5;
                        }
                    } else {
                        f5 = xb.f7612i;
                    }
                }
                if (this.f9920B.e().f9742a != f5) {
                    C0951ne c0951ne = new C0951ne(f5, this.f9927I.f5005n.f9743b);
                    this.f9953v.f10539a.removeMessages(16);
                    this.f9920B.c(c0951ne);
                    boolean z5 = r17;
                    h(this.f9927I.f5005n, this.f9920B.e().f9742a, z5, z5);
                }
            }
        }
    }

    public final void x(AbstractC0484ch abstractC0484ch, C1202tE c1202tE, AbstractC0484ch abstractC0484ch2, C1202tE c1202tE2, long j4, boolean z4) {
        boolean E4 = E(abstractC0484ch, c1202tE);
        Object obj = c1202tE.f10688a;
        if (!E4) {
            C0951ne c0951ne = c1202tE.b() ? C0951ne.d : this.f9927I.f5005n;
            C0001a0 c0001a0 = this.f9920B;
            if (c0001a0.e().equals(c0951ne)) {
                return;
            }
            this.f9953v.f10539a.removeMessages(16);
            c0001a0.c(c0951ne);
            h(this.f9927I.f5005n, c0951ne.f9742a, false, false);
            return;
        }
        C1210tg c1210tg = this.f9956z;
        int i4 = abstractC0484ch.n(obj, c1210tg).c;
        Rg rg = this.y;
        abstractC0484ch.e(i4, rg, 0L);
        Q7 q7 = rg.f6822i;
        int i5 = AbstractC0751is.f9071a;
        XB xb = this.f9945b0;
        xb.getClass();
        q7.getClass();
        long t4 = AbstractC0751is.t(-9223372036854775807L);
        xb.c = t4;
        xb.f7609f = t4;
        xb.f7610g = t4;
        xb.c();
        if (j4 != -9223372036854775807L) {
            xb.d = I(abstractC0484ch, obj, j4);
            xb.c();
            return;
        }
        if (!AbstractC0751is.c(!abstractC0484ch2.o() ? abstractC0484ch2.e(abstractC0484ch2.n(c1202tE2.f10688a, c1210tg).c, rg, 0L).f6816a : null, rg.f6816a) || z4) {
            xb.d = -9223372036854775807L;
            xb.c();
        }
    }

    public final void y(boolean z4, boolean z5) {
        this.N = z4;
        this.f9932O = z5 ? -9223372036854775807L : SystemClock.elapsedRealtime();
    }

    public final synchronized void z(Xj xj, long j4) {
        long elapsedRealtime = SystemClock.elapsedRealtime() + j4;
        boolean z4 = false;
        while (!((C1029pC) xj.f7687p).f9929K && j4 > 0) {
            try {
                wait(j4);
            } catch (InterruptedException unused) {
                z4 = true;
            }
            j4 = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
    }
}
