package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class GE implements InterfaceC1159sE, D, InterfaceC1160sF {

    /* renamed from: Y, reason: collision with root package name */
    public static final Map f5143Y;

    /* renamed from: Z, reason: collision with root package name */
    public static final C0976o2 f5144Z;

    /* renamed from: A, reason: collision with root package name */
    public final boolean f5145A;

    /* renamed from: B, reason: collision with root package name */
    public InterfaceC1116rE f5146B;

    /* renamed from: C, reason: collision with root package name */
    public C1360x0 f5147C;

    /* renamed from: D, reason: collision with root package name */
    public KE[] f5148D;

    /* renamed from: E, reason: collision with root package name */
    public FE[] f5149E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f5150F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f5151G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f5152H;

    /* renamed from: I, reason: collision with root package name */
    public u0.g f5153I;

    /* renamed from: J, reason: collision with root package name */
    public P f5154J;

    /* renamed from: K, reason: collision with root package name */
    public long f5155K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f5156L;

    /* renamed from: M, reason: collision with root package name */
    public int f5157M;
    public boolean N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f5158O;

    /* renamed from: P, reason: collision with root package name */
    public int f5159P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f5160Q;

    /* renamed from: R, reason: collision with root package name */
    public long f5161R;

    /* renamed from: S, reason: collision with root package name */
    public long f5162S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f5163T;

    /* renamed from: U, reason: collision with root package name */
    public int f5164U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f5165V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f5166W;

    /* renamed from: X, reason: collision with root package name */
    public final C1058pz f5167X;

    /* renamed from: o, reason: collision with root package name */
    public final Uri f5168o;

    /* renamed from: p, reason: collision with root package name */
    public final Px f5169p;

    /* renamed from: q, reason: collision with root package name */
    public final Yv f5170q;

    /* renamed from: r, reason: collision with root package name */
    public final C0831kn f5171r;

    /* renamed from: s, reason: collision with root package name */
    public final IE f5172s;

    /* renamed from: t, reason: collision with root package name */
    public final long f5173t;

    /* renamed from: u, reason: collision with root package name */
    public final Op f5174u = new Op(1);

    /* renamed from: v, reason: collision with root package name */
    public final C0882lv f5175v;

    /* renamed from: w, reason: collision with root package name */
    public final Y f5176w;

    /* renamed from: x, reason: collision with root package name */
    public final BE f5177x;
    public final BE y;

    /* renamed from: z, reason: collision with root package name */
    public final Handler f5178z;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        f5143Y = Collections.unmodifiableMap(hashMap);
        L1 l12 = new L1();
        l12.f6094a = "icy";
        l12.f6101j = "application/x-icy";
        f5144Z = new C0976o2(l12);
    }

    public GE(Uri uri, Px px, C0882lv c0882lv, Yv yv, Qw qw, C0831kn c0831kn, IE ie, C1058pz c1058pz, int i4, long j4) {
        this.f5168o = uri;
        this.f5169p = px;
        this.f5170q = yv;
        this.f5171r = c0831kn;
        this.f5172s = ie;
        this.f5167X = c1058pz;
        this.f5173t = i4;
        this.f5175v = c0882lv;
        this.f5155K = j4;
        this.f5145A = j4 != -9223372036854775807L;
        this.f5176w = new Y(3);
        this.f5177x = new BE(this, 1);
        this.y = new BE(this, 2);
        this.f5178z = AbstractC0751is.y();
        this.f5149E = new FE[0];
        this.f5148D = new KE[0];
        this.f5162S = -9223372036854775807L;
        this.f5157M = 1;
    }

    public final boolean A() {
        return this.f5158O || y();
    }

    @Override // com.google.android.gms.internal.ads.D
    public final void B(P p3) {
        this.f5178z.post(new Jn(15, this, p3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, com.google.android.gms.internal.ads.lE] */
    public final void a(DE de, boolean z4) {
        Object obj = de.f4600b.f6711q;
        this.f5171r.D(new Object(), new C1074qE(-1, null, AbstractC0751is.w(de.f4605i), AbstractC0751is.w(this.f5155K)));
        if (z4) {
            return;
        }
        for (KE ke : this.f5148D) {
            ke.p(false);
        }
        if (this.f5159P > 0) {
            InterfaceC1116rE interfaceC1116rE = this.f5146B;
            interfaceC1116rE.getClass();
            interfaceC1116rE.a(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, com.google.android.gms.internal.ads.lE] */
    public final void b(DE de) {
        P p3;
        if (this.f5155K == -9223372036854775807L && (p3 = this.f5154J) != null) {
            boolean f4 = p3.f();
            long q4 = q(true);
            long j4 = q4 == Long.MIN_VALUE ? 0L : q4 + 10000;
            this.f5155K = j4;
            this.f5172s.s(j4, f4, this.f5156L);
        }
        Object obj = de.f4600b.f6711q;
        this.f5171r.E(new Object(), new C1074qE(-1, null, AbstractC0751is.w(de.f4605i), AbstractC0751is.w(this.f5155K)));
        this.f5165V = true;
        InterfaceC1116rE interfaceC1116rE = this.f5146B;
        interfaceC1116rE.getClass();
        interfaceC1116rE.a(this);
    }

    @Override // com.google.android.gms.internal.ads.ME
    public final long c() {
        long j4;
        boolean z4;
        s();
        if (this.f5165V || this.f5159P == 0) {
            return Long.MIN_VALUE;
        }
        if (y()) {
            return this.f5162S;
        }
        if (this.f5152H) {
            int length = this.f5148D.length;
            j4 = Long.MAX_VALUE;
            for (int i4 = 0; i4 < length; i4++) {
                u0.g gVar = this.f5153I;
                if (((boolean[]) gVar.f14984q)[i4] && ((boolean[]) gVar.f14985r)[i4]) {
                    KE ke = this.f5148D[i4];
                    synchronized (ke) {
                        z4 = ke.f6018u;
                    }
                    if (!z4) {
                        j4 = Math.min(j4, this.f5148D[i4].m());
                    }
                }
            }
        } else {
            j4 = Long.MAX_VALUE;
        }
        if (j4 == Long.MAX_VALUE) {
            j4 = q(false);
        }
        return j4 == Long.MIN_VALUE ? this.f5161R : j4;
    }

    @Override // com.google.android.gms.internal.ads.ME
    public final void d(long j4) {
    }

    @Override // com.google.android.gms.internal.ads.ME
    public final long e() {
        return c();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1159sE
    public final void f() {
        IOException iOException;
        int i4 = this.f5157M == 7 ? 6 : 3;
        Op op = this.f5174u;
        IOException iOException2 = (IOException) op.f6527r;
        if (iOException2 != null) {
            throw iOException2;
        }
        HandlerC1117rF handlerC1117rF = (HandlerC1117rF) op.f6526q;
        if (handlerC1117rF != null && (iOException = handlerC1117rF.f10470q) != null && handlerC1117rF.f10471r > i4) {
            throw iOException;
        }
        if (this.f5165V && !this.f5151G) {
            throw C0907md.a("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1159sE
    public final RE g() {
        s();
        return (RE) this.f5153I.f14983p;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1159sE
    public final long h(long j4) {
        int i4;
        boolean g4;
        s();
        boolean[] zArr = (boolean[]) this.f5153I.f14984q;
        if (true != this.f5154J.f()) {
            j4 = 0;
        }
        this.f5158O = false;
        this.f5161R = j4;
        if (y()) {
            this.f5162S = j4;
            return j4;
        }
        if (this.f5157M != 7) {
            int length = this.f5148D.length;
            for (0; i4 < length; i4 + 1) {
                KE ke = this.f5148D[i4];
                if (this.f5145A) {
                    int i5 = ke.f6012o;
                    synchronized (ke) {
                        ke.l();
                        int i6 = ke.f6012o;
                        if (i5 >= i6 && i5 <= ke.f6011n + i6) {
                            ke.f6015r = Long.MIN_VALUE;
                            ke.f6014q = i5 - i6;
                            g4 = true;
                        }
                        g4 = false;
                    }
                } else {
                    g4 = ke.g(false, j4);
                }
                i4 = (g4 || (!zArr[i4] && this.f5152H)) ? i4 + 1 : 0;
            }
            return j4;
        }
        this.f5163T = false;
        this.f5162S = j4;
        this.f5165V = false;
        Op op = this.f5174u;
        if (!(((HandlerC1117rF) op.f6526q) != null)) {
            op.f6527r = null;
            for (KE ke2 : this.f5148D) {
                ke2.p(false);
            }
            return j4;
        }
        for (KE ke3 : this.f5148D) {
            ke3.o();
        }
        HandlerC1117rF handlerC1117rF = (HandlerC1117rF) this.f5174u.f6526q;
        Zf.C(handlerC1117rF);
        handlerC1117rF.a(false);
        return j4;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1159sE
    public final long i() {
        if (!this.f5158O) {
            return -9223372036854775807L;
        }
        if (!this.f5165V && l() <= this.f5164U) {
            return -9223372036854775807L;
        }
        this.f5158O = false;
        return this.f5161R;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1159sE
    public final void j(InterfaceC1116rE interfaceC1116rE, long j4) {
        this.f5146B = interfaceC1116rE;
        this.f5176w.c();
        w();
    }

    @Override // com.google.android.gms.internal.ads.ME
    public final boolean k(C1200tC c1200tC) {
        if (this.f5165V) {
            return false;
        }
        Op op = this.f5174u;
        if (((IOException) op.f6527r) != null || this.f5163T) {
            return false;
        }
        if (this.f5151G && this.f5159P == 0) {
            return false;
        }
        boolean c = this.f5176w.c();
        if (((HandlerC1117rF) op.f6526q) != null) {
            return c;
        }
        w();
        return true;
    }

    public final int l() {
        int i4 = 0;
        for (KE ke : this.f5148D) {
            i4 += ke.f6012o + ke.f6011n;
        }
        return i4;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1159sE
    public final void m(long j4) {
        long j5;
        long j6;
        int i4;
        if (this.f5145A) {
            return;
        }
        s();
        if (y()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.f5153I.f14985r;
        int length = this.f5148D.length;
        int i5 = 0;
        while (i5 < length) {
            KE ke = this.f5148D[i5];
            boolean z4 = zArr[i5];
            W1.o oVar = ke.f6000a;
            synchronized (ke) {
                try {
                    int i6 = ke.f6011n;
                    if (i6 != 0) {
                        long[] jArr = ke.f6009l;
                        int i7 = ke.f6013p;
                        if (j4 >= jArr[i7]) {
                            j5 = j4;
                            int h4 = ke.h(i7, (!z4 || (i4 = ke.f6014q) == i6) ? i6 : i4 + 1, j5, false);
                            j6 = h4 != -1 ? ke.j(h4) : -1L;
                        }
                    }
                    j5 = j4;
                } finally {
                }
            }
            oVar.a(j6);
            i5++;
            j4 = j5;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
    
        if (r2 == 0) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e7  */
    @Override // com.google.android.gms.internal.ads.InterfaceC1159sE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long n(com.google.android.gms.internal.ads.InterfaceC0690hF[] r10, boolean[] r11, com.google.android.gms.internal.ads.LE[] r12, boolean[] r13, long r14) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.GE.n(com.google.android.gms.internal.ads.hF[], boolean[], com.google.android.gms.internal.ads.LE[], boolean[], long):long");
    }

    @Override // com.google.android.gms.internal.ads.ME
    public final boolean o() {
        boolean z4;
        if (((HandlerC1117rF) this.f5174u.f6526q) == null) {
            return false;
        }
        Y y = this.f5176w;
        synchronized (y) {
            z4 = y.f7724p;
        }
        return z4;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0081 A[RETURN] */
    @Override // com.google.android.gms.internal.ads.InterfaceC1159sE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long p(long r23, com.google.android.gms.internal.ads.LC r25) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r3 = r25
            r0.s()
            com.google.android.gms.internal.ads.P r4 = r0.f5154J
            boolean r4 = r4.f()
            r5 = 0
            if (r4 != 0) goto L14
            return r5
        L14:
            com.google.android.gms.internal.ads.P r4 = r0.f5154J
            com.google.android.gms.internal.ads.O r4 = r4.c(r1)
            com.google.android.gms.internal.ads.Q r7 = r4.f6421a
            com.google.android.gms.internal.ads.Q r4 = r4.f6422b
            long r8 = r3.f6134a
            long r10 = r3.f6135b
            int r3 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r3 != 0) goto L2c
            int r3 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r3 != 0) goto L2b
            return r1
        L2b:
            r8 = r5
        L2c:
            long r12 = r7.f6626a
            int r3 = com.google.android.gms.internal.ads.AbstractC0751is.f9071a
            long r14 = r1 - r8
            long r8 = r8 ^ r1
            long r16 = r1 ^ r14
            long r18 = r1 + r10
            long r20 = r1 ^ r18
            long r10 = r10 ^ r18
            long r8 = r8 & r16
            int r3 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r3 >= 0) goto L43
            r14 = -9223372036854775808
        L43:
            long r7 = r20 & r10
            int r3 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r3 >= 0) goto L4e
            r18 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L4e:
            int r3 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            r5 = 1
            r6 = 0
            if (r3 > 0) goto L5a
            int r3 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r3 > 0) goto L5a
            r3 = r5
            goto L5b
        L5a:
            r3 = r6
        L5b:
            long r7 = r4.f6626a
            int r4 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r4 > 0) goto L66
            int r4 = (r7 > r18 ? 1 : (r7 == r18 ? 0 : -1))
            if (r4 > 0) goto L66
            goto L67
        L66:
            r5 = r6
        L67:
            if (r3 == 0) goto L7c
            if (r5 == 0) goto L7c
            long r3 = r12 - r1
            long r1 = r7 - r1
            long r3 = java.lang.Math.abs(r3)
            long r1 = java.lang.Math.abs(r1)
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 > 0) goto L81
            goto L7e
        L7c:
            if (r3 == 0) goto L7f
        L7e:
            return r12
        L7f:
            if (r5 == 0) goto L82
        L81:
            return r7
        L82:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.GE.p(long, com.google.android.gms.internal.ads.LC):long");
    }

    public final long q(boolean z4) {
        int i4;
        long j4 = Long.MIN_VALUE;
        while (true) {
            KE[] keArr = this.f5148D;
            if (i4 >= keArr.length) {
                return j4;
            }
            if (!z4) {
                u0.g gVar = this.f5153I;
                gVar.getClass();
                i4 = ((boolean[]) gVar.f14985r)[i4] ? 0 : i4 + 1;
            }
            j4 = Math.max(j4, keArr[i4].m());
        }
    }

    public final KE r(FE fe) {
        int length = this.f5148D.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (fe.equals(this.f5149E[i4])) {
                return this.f5148D[i4];
            }
        }
        KE ke = new KE(this.f5167X, this.f5170q);
        ke.f6002e = this;
        int i5 = length + 1;
        FE[] feArr = (FE[]) Arrays.copyOf(this.f5149E, i5);
        feArr[length] = fe;
        int i6 = AbstractC0751is.f9071a;
        this.f5149E = feArr;
        KE[] keArr = (KE[]) Arrays.copyOf(this.f5148D, i5);
        keArr[length] = ke;
        this.f5148D = keArr;
        return ke;
    }

    public final void s() {
        Zf.X(this.f5151G);
        this.f5153I.getClass();
        this.f5154J.getClass();
    }

    public final void t() {
        int i4;
        C0976o2 c0976o2;
        if (this.f5166W || this.f5151G || !this.f5150F || this.f5154J == null) {
            return;
        }
        for (KE ke : this.f5148D) {
            synchronized (ke) {
                c0976o2 = ke.f6020w ? null : ke.f6021x;
            }
            if (c0976o2 == null) {
                return;
            }
        }
        this.f5176w.b();
        int length = this.f5148D.length;
        C0997oh[] c0997ohArr = new C0997oh[length];
        boolean[] zArr = new boolean[length];
        for (int i5 = 0; i5 < length; i5++) {
            C0976o2 n4 = this.f5148D[i5].n();
            n4.getClass();
            String str = n4.f9813k;
            boolean equals = "audio".equals(AbstractC0438bd.f(str));
            boolean z4 = equals || "video".equals(AbstractC0438bd.f(str));
            zArr[i5] = z4;
            this.f5152H = z4 | this.f5152H;
            C1360x0 c1360x0 = this.f5147C;
            if (c1360x0 != null) {
                if (equals || this.f5149E[i5].f5012b) {
                    C1120rc c1120rc = n4.f9811i;
                    C1120rc c1120rc2 = c1120rc == null ? new C1120rc(-9223372036854775807L, c1360x0) : c1120rc.a(c1360x0);
                    L1 l12 = new L1(n4);
                    l12.f6099h = c1120rc2;
                    n4 = new C0976o2(l12);
                }
                if (equals && n4.f9807e == -1 && n4.f9808f == -1 && (i4 = c1360x0.f11223o) != -1) {
                    L1 l13 = new L1(n4);
                    l13.f6096e = i4;
                    n4 = new C0976o2(l13);
                }
            }
            this.f5170q.getClass();
            int i6 = n4.f9816n != null ? 1 : 0;
            L1 l14 = new L1(n4);
            l14.f6093E = i6;
            c0997ohArr[i5] = new C0997oh(Integer.toString(i5), new C0976o2(l14));
        }
        this.f5153I = new u0.g(new RE(c0997ohArr), zArr);
        this.f5151G = true;
        InterfaceC1116rE interfaceC1116rE = this.f5146B;
        interfaceC1116rE.getClass();
        interfaceC1116rE.b(this);
    }

    public final void u(int i4) {
        s();
        u0.g gVar = this.f5153I;
        boolean[] zArr = (boolean[]) gVar.f14986s;
        if (zArr[i4]) {
            return;
        }
        C0976o2 c0976o2 = ((RE) gVar.f14983p).a(i4).c[0];
        this.f5171r.C(new C1074qE(AbstractC0438bd.b(c0976o2.f9813k), c0976o2, AbstractC0751is.w(this.f5161R), -9223372036854775807L));
        zArr[i4] = true;
    }

    public final void v(int i4) {
        s();
        boolean[] zArr = (boolean[]) this.f5153I.f14984q;
        if (this.f5163T && zArr[i4] && !this.f5148D[i4].r(false)) {
            this.f5162S = 0L;
            this.f5163T = false;
            this.f5158O = true;
            this.f5161R = 0L;
            this.f5164U = 0;
            for (KE ke : this.f5148D) {
                ke.p(false);
            }
            InterfaceC1116rE interfaceC1116rE = this.f5146B;
            interfaceC1116rE.getClass();
            interfaceC1116rE.a(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, com.google.android.gms.internal.ads.lE] */
    public final void w() {
        DE de = new DE(this, this.f5168o, this.f5169p, this.f5175v, this, this.f5176w);
        if (this.f5151G) {
            Zf.X(y());
            long j4 = this.f5155K;
            if (j4 != -9223372036854775807L && this.f5162S > j4) {
                this.f5165V = true;
                this.f5162S = -9223372036854775807L;
                return;
            }
            P p3 = this.f5154J;
            p3.getClass();
            Q q4 = p3.c(this.f5162S).f6421a;
            long j5 = this.f5162S;
            de.f4602f.f4964a = q4.f6627b;
            de.f4605i = j5;
            de.f4604h = true;
            de.f4608l = false;
            for (KE ke : this.f5148D) {
                ke.f6015r = this.f5162S;
            }
            this.f5162S = -9223372036854775807L;
        }
        this.f5164U = l();
        Op op = this.f5174u;
        op.getClass();
        Looper myLooper = Looper.myLooper();
        Zf.C(myLooper);
        op.f6527r = null;
        HandlerC1117rF handlerC1117rF = new HandlerC1117rF(op, myLooper, de, this, SystemClock.elapsedRealtime());
        Zf.X(((HandlerC1117rF) op.f6526q) == null);
        op.f6526q = handlerC1117rF;
        handlerC1117rF.f10470q = null;
        ((ExecutorService) op.f6525p).execute(handlerC1117rF);
        Uri uri = de.f4606j.f9104a;
        Map map = Collections.EMPTY_MAP;
        this.f5171r.H(new Object(), new C1074qE(-1, null, AbstractC0751is.w(de.f4605i), AbstractC0751is.w(this.f5155K)));
    }

    @Override // com.google.android.gms.internal.ads.D
    public final void x() {
        this.f5150F = true;
        this.f5178z.post(this.f5177x);
    }

    public final boolean y() {
        return this.f5162S != -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.D
    public final V z(int i4, int i5) {
        return r(new FE(i4, false));
    }
}
