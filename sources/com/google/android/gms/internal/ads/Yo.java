package com.google.android.gms.internal.ads;

import O1.InterfaceC0074l0;
import O1.InterfaceC0084q0;
import O1.InterfaceC0089t0;
import O1.InterfaceC0090u;
import O1.InterfaceC0096x;
import O1.InterfaceC0100z;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import c3.InterfaceFutureC0239a;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import n2.InterfaceC1812a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Yo extends O1.I implements P1.g, N4 {

    /* renamed from: o, reason: collision with root package name */
    public final C1423ye f7888o;

    /* renamed from: p, reason: collision with root package name */
    public final Context f7889p;

    /* renamed from: r, reason: collision with root package name */
    public final String f7891r;

    /* renamed from: s, reason: collision with root package name */
    public final Uo f7892s;

    /* renamed from: t, reason: collision with root package name */
    public final To f7893t;

    /* renamed from: u, reason: collision with root package name */
    public final C0248Bc f7894u;

    /* renamed from: v, reason: collision with root package name */
    public final C0658gk f7895v;

    /* renamed from: x, reason: collision with root package name */
    public C1467zf f7897x;
    public C0251Bf y;

    /* renamed from: q, reason: collision with root package name */
    public AtomicBoolean f7890q = new AtomicBoolean();

    /* renamed from: w, reason: collision with root package name */
    public long f7896w = -1;

    public Yo(C1423ye c1423ye, Context context, String str, Uo uo, To to, C0248Bc c0248Bc, C0658gk c0658gk) {
        this.f7888o = c1423ye;
        this.f7889p = context;
        this.f7891r = str;
        this.f7892s = uo;
        this.f7893t = to;
        this.f7894u = c0248Bc;
        this.f7895v = c0658gk;
        to.f7085t.set(this);
    }

    @Override // O1.J
    public final synchronized void B3(boolean z4) {
    }

    @Override // O1.J
    public final synchronized String C() {
        return this.f7891r;
    }

    @Override // O1.J
    public final synchronized String D() {
        return null;
    }

    @Override // O1.J
    public final void E() {
    }

    @Override // O1.J
    public final void E3(U4 u4) {
        this.f7893t.f7081p.set(u4);
    }

    @Override // O1.J
    public final synchronized void G() {
    }

    @Override // O1.J
    public final synchronized boolean H2() {
        boolean z4;
        InterfaceFutureC0239a interfaceFutureC0239a = this.f7892s.f7193j;
        if (interfaceFutureC0239a != null) {
            z4 = interfaceFutureC0239a.isDone() ? false : true;
        }
        return z4;
    }

    @Override // O1.J
    public final void H3(O1.U u2) {
    }

    public final synchronized void K3(int i4) {
        try {
            if (this.f7890q.compareAndSet(false, true)) {
                this.f7893t.a();
                C1467zf c1467zf = this.f7897x;
                if (c1467zf != null) {
                    N1.n.f1204A.f1208f.p(c1467zf);
                }
                if (this.y != null) {
                    long j4 = -1;
                    if (this.f7896w != -1) {
                        N1.n.f1204A.f1212j.getClass();
                        j4 = SystemClock.elapsedRealtime() - this.f7896w;
                    }
                    this.y.d(i4, j4);
                }
                w();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // P1.g
    public final void L2(int i4) {
        if (i4 == 0) {
            throw null;
        }
        int i5 = i4 - 1;
        if (i5 == 0) {
            K3(2);
            return;
        }
        if (i5 == 1) {
            K3(4);
        } else if (i5 != 2) {
            K3(6);
        } else {
            K3(3);
        }
    }

    @Override // P1.g
    public final void O() {
    }

    @Override // O1.J
    public final synchronized void O2(O1.X0 x02) {
        h2.y.d("setAdSize must be called on the main UI thread.");
    }

    @Override // O1.J
    public final void R() {
    }

    @Override // O1.J
    public final synchronized void S() {
    }

    @Override // O1.J
    public final void U0(C0735ib c0735ib) {
    }

    @Override // O1.J
    public final void W0(InterfaceC1812a interfaceC1812a) {
    }

    @Override // O1.J
    public final void W1() {
    }

    @Override // P1.g
    public final synchronized void W2() {
        C0251Bf c0251Bf = this.y;
        if (c0251Bf != null) {
            N1.n.f1204A.f1212j.getClass();
            c0251Bf.d(1, SystemClock.elapsedRealtime() - this.f7896w);
        }
    }

    @Override // O1.J
    public final synchronized void Z1(C1409y6 c1409y6) {
    }

    @Override // P1.g
    public final synchronized void a0() {
        if (this.y != null) {
            N1.n nVar = N1.n.f1204A;
            nVar.f1212j.getClass();
            this.f7896w = SystemClock.elapsedRealtime();
            int i4 = this.y.f4139k;
            if (i4 > 0) {
                C1467zf c1467zf = new C1467zf((ScheduledExecutorService) this.f7888o.f11399e.c(), nVar.f1212j);
                this.f7897x = c1467zf;
                c1467zf.b(i4, new Vo(this, 1));
            }
        }
    }

    @Override // O1.J
    public final void b0() {
    }

    @Override // O1.J
    public final void f3(InterfaceC0074l0 interfaceC0074l0) {
    }

    @Override // O1.J
    public final InterfaceC0096x g() {
        return null;
    }

    @Override // O1.J
    public final void g0() {
    }

    @Override // O1.J
    public final void g2(boolean z4) {
    }

    @Override // O1.J
    public final synchronized O1.X0 h() {
        return null;
    }

    @Override // O1.J
    public final void h0() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070 A[Catch: all -> 0x0026, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0026, blocks: (B:3:0x0001, B:5:0x0010, B:8:0x0028, B:11:0x0045, B:13:0x0051, B:16:0x0056, B:20:0x0068, B:24:0x0070, B:27:0x0040), top: B:2:0x0001 }] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, com.google.android.gms.internal.ads.Zf] */
    @Override // O1.J
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean h2(O1.U0 r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            com.google.android.gms.internal.ads.J2 r0 = com.google.android.gms.internal.ads.L6.d     // Catch: java.lang.Throwable -> L26
            java.lang.Object r0 = r0.r()     // Catch: java.lang.Throwable -> L26
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L26
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L26
            r1 = 0
            if (r0 == 0) goto L24
            com.google.android.gms.internal.ads.n6 r0 = com.google.android.gms.internal.ads.AbstractC1066q6.x9     // Catch: java.lang.Throwable -> L26
            O1.r r2 = O1.r.d     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.internal.ads.p6 r2 = r2.c     // Catch: java.lang.Throwable -> L26
            java.lang.Object r0 = r2.a(r0)     // Catch: java.lang.Throwable -> L26
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L26
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L24
            r0 = 1
            goto L28
        L24:
            r0 = r1
            goto L28
        L26:
            r6 = move-exception
            goto L8d
        L28:
            com.google.android.gms.internal.ads.Bc r2 = r5.f7894u     // Catch: java.lang.Throwable -> L26
            int r2 = r2.f4086q     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.internal.ads.n6 r3 = com.google.android.gms.internal.ads.AbstractC1066q6.y9     // Catch: java.lang.Throwable -> L26
            O1.r r4 = O1.r.d     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.internal.ads.p6 r4 = r4.c     // Catch: java.lang.Throwable -> L26
            java.lang.Object r3 = r4.a(r3)     // Catch: java.lang.Throwable -> L26
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L26
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L26
            if (r2 < r3) goto L40
            if (r0 != 0) goto L45
        L40:
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            h2.y.d(r0)     // Catch: java.lang.Throwable -> L26
        L45:
            N1.n r0 = N1.n.f1204A     // Catch: java.lang.Throwable -> L26
            Q1.N r0 = r0.c     // Catch: java.lang.Throwable -> L26
            android.content.Context r0 = r5.f7889p     // Catch: java.lang.Throwable -> L26
            boolean r0 = Q1.N.e(r0)     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L68
            O1.N r0 = r6.f1299G     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L56
            goto L68
        L56:
            java.lang.String r6 = "Failed to load the ad because app ID is missing."
            com.google.android.gms.internal.ads.Y9.p(r6)     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.internal.ads.To r6 = r5.f7893t     // Catch: java.lang.Throwable -> L26
            r0 = 4
            r2 = 0
            O1.z0 r0 = com.google.android.gms.internal.ads.Zf.L(r0, r2, r2)     // Catch: java.lang.Throwable -> L26
            r6.J(r0)     // Catch: java.lang.Throwable -> L26
            monitor-exit(r5)
            return r1
        L68:
            boolean r0 = r5.H2()     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L70
            monitor-exit(r5)
            return r1
        L70:
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean     // Catch: java.lang.Throwable -> L26
            r0.<init>()     // Catch: java.lang.Throwable -> L26
            r5.f7890q = r0     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.internal.ads.Wo r0 = new com.google.android.gms.internal.ads.Wo     // Catch: java.lang.Throwable -> L26
            r0.<init>()     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.internal.ads.Uo r1 = r5.f7892s     // Catch: java.lang.Throwable -> L26
            java.lang.String r2 = r5.f7891r     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.internal.ads.xi r3 = new com.google.android.gms.internal.ads.xi     // Catch: java.lang.Throwable -> L26
            r4 = 18
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L26
            boolean r6 = r1.a(r6, r2, r0, r3)     // Catch: java.lang.Throwable -> L26
            monitor-exit(r5)
            return r6
        L8d:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L26
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Yo.h2(O1.U0):boolean");
    }

    @Override // O1.J
    public final Bundle i() {
        return new Bundle();
    }

    @Override // O1.J
    public final O1.O j() {
        return null;
    }

    @Override // O1.J
    public final synchronized InterfaceC0084q0 k() {
        return null;
    }

    @Override // O1.J
    public final synchronized InterfaceC0089t0 l() {
        return null;
    }

    @Override // O1.J
    public final InterfaceC1812a m() {
        return null;
    }

    @Override // O1.J
    public final synchronized void n1() {
        h2.y.d("pause must be called on the main UI thread.");
    }

    @Override // O1.J
    public final void n2(O1.a1 a1Var) {
        this.f7892s.f7192i.f5733i = a1Var;
    }

    @Override // O1.J
    public final boolean p3() {
        return false;
    }

    @Override // P1.g
    public final void q1() {
    }

    @Override // O1.J
    public final void q3(InterfaceC0090u interfaceC0090u) {
    }

    @Override // O1.J
    public final void r1(O1.O o4) {
    }

    @Override // O1.J
    public final void t0(O1.U0 u02, InterfaceC0100z interfaceC0100z) {
    }

    @Override // O1.J
    public final synchronized void t3(O1.R0 r02) {
    }

    @Override // O1.J
    public final synchronized void w() {
        h2.y.d("destroy must be called on the main UI thread.");
        C0251Bf c0251Bf = this.y;
        if (c0251Bf != null) {
            c0251Bf.b();
        }
    }

    @Override // O1.J
    public final void w3(InterfaceC0096x interfaceC0096x) {
    }

    @Override // O1.J
    public final synchronized String x() {
        return null;
    }

    @Override // P1.g
    public final void y3() {
    }

    @Override // O1.J
    public final synchronized void z() {
        h2.y.d("resume must be called on the main UI thread.");
    }

    @Override // O1.J
    public final synchronized void z2(O1.S s4) {
    }
}
