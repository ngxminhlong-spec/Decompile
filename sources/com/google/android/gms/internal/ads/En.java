package com.google.android.gms.internal.ads;

import O1.InterfaceC0074l0;
import O1.InterfaceC0084q0;
import O1.InterfaceC0089t0;
import O1.InterfaceC0090u;
import O1.InterfaceC0096x;
import O1.InterfaceC0100z;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import n2.BinderC1813b;
import n2.InterfaceC1812a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class En extends O1.I {

    /* renamed from: o, reason: collision with root package name */
    public final O1.X0 f4930o;

    /* renamed from: p, reason: collision with root package name */
    public final Context f4931p;

    /* renamed from: q, reason: collision with root package name */
    public final C1091qp f4932q;

    /* renamed from: r, reason: collision with root package name */
    public final String f4933r;

    /* renamed from: s, reason: collision with root package name */
    public final C0248Bc f4934s;

    /* renamed from: t, reason: collision with root package name */
    public final Bn f4935t;

    /* renamed from: u, reason: collision with root package name */
    public final C1133rp f4936u;

    /* renamed from: v, reason: collision with root package name */
    public final I3 f4937v;

    /* renamed from: w, reason: collision with root package name */
    public final C0658gk f4938w;

    /* renamed from: x, reason: collision with root package name */
    public Xh f4939x;
    public boolean y = ((Boolean) O1.r.d.c.a(AbstractC1066q6.f10286t0)).booleanValue();

    public En(Context context, O1.X0 x02, String str, C1091qp c1091qp, Bn bn, C1133rp c1133rp, C0248Bc c0248Bc, I3 i32, C0658gk c0658gk) {
        this.f4930o = x02;
        this.f4933r = str;
        this.f4931p = context;
        this.f4932q = c1091qp;
        this.f4935t = bn;
        this.f4936u = c1133rp;
        this.f4934s = c0248Bc;
        this.f4937v = i32;
        this.f4938w = c0658gk;
    }

    @Override // O1.J
    public final void B3(boolean z4) {
    }

    @Override // O1.J
    public final synchronized String C() {
        return this.f4933r;
    }

    @Override // O1.J
    public final synchronized String D() {
        Fg fg;
        Xh xh = this.f4939x;
        if (xh == null || (fg = xh.f7861f) == null) {
            return null;
        }
        return fg.f5059o;
    }

    @Override // O1.J
    public final void E() {
    }

    @Override // O1.J
    public final void E3(U4 u4) {
    }

    @Override // O1.J
    public final void G() {
    }

    @Override // O1.J
    public final synchronized boolean H2() {
        return this.f4932q.a();
    }

    @Override // O1.J
    public final void H3(O1.U u2) {
        this.f4935t.f4178s.set(u2);
    }

    public final synchronized boolean K3() {
        Xh xh = this.f4939x;
        if (xh != null) {
            if (!xh.f7679n.f8954p.get()) {
                return true;
            }
        }
        return false;
    }

    @Override // O1.J
    public final void O2(O1.X0 x02) {
    }

    @Override // O1.J
    public final void R() {
    }

    @Override // O1.J
    public final synchronized void S() {
        h2.y.d("showInterstitial must be called on the main UI thread.");
        if (this.f4939x == null) {
            Y9.s("Interstitial can not be shown before loaded.");
            this.f4935t.r(Zf.L(9, null, null));
        } else {
            if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f10242j2)).booleanValue()) {
                this.f4937v.f5531b.c(new Throwable().getStackTrace());
            }
            this.f4939x.b(null, this.y);
        }
    }

    @Override // O1.J
    public final void U0(C0735ib c0735ib) {
        this.f4936u.f10532s.set(c0735ib);
    }

    @Override // O1.J
    public final synchronized void W0(InterfaceC1812a interfaceC1812a) {
        if (this.f4939x == null) {
            Y9.s("Interstitial can not be shown before loaded.");
            this.f4935t.r(Zf.L(9, null, null));
            return;
        }
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f10242j2)).booleanValue()) {
            this.f4937v.f5531b.c(new Throwable().getStackTrace());
        }
        this.f4939x.b((Activity) BinderC1813b.C2(interfaceC1812a), this.y);
    }

    @Override // O1.J
    public final void W1() {
    }

    @Override // O1.J
    public final synchronized void Z1(C1409y6 c1409y6) {
        h2.y.d("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f4932q.f10411f = c1409y6;
    }

    @Override // O1.J
    public final void b0() {
    }

    @Override // O1.J
    public final void f3(InterfaceC0074l0 interfaceC0074l0) {
        h2.y.d("setPaidEventListener must be called on the main UI thread.");
        try {
            if (!interfaceC0074l0.d()) {
                this.f4938w.b();
            }
        } catch (RemoteException e4) {
            Y9.o("Error in making CSI ping for reporting paid event callback", e4);
        }
        this.f4935t.f4176q.set(interfaceC0074l0);
    }

    @Override // O1.J
    public final InterfaceC0096x g() {
        return this.f4935t.l();
    }

    @Override // O1.J
    public final void g0() {
        h2.y.d("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // O1.J
    public final synchronized void g2(boolean z4) {
        h2.y.d("setImmersiveMode must be called on the main UI thread.");
        this.y = z4;
    }

    @Override // O1.J
    public final O1.X0 h() {
        return null;
    }

    @Override // O1.J
    public final void h0() {
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006e A[Catch: all -> 0x0026, TRY_LEAVE, TryCatch #0 {all -> 0x0026, blocks: (B:3:0x0001, B:5:0x0010, B:8:0x0028, B:11:0x0045, B:13:0x0052, B:15:0x0056, B:17:0x005f, B:21:0x0068, B:23:0x006e, B:26:0x0040), top: B:2:0x0001 }] */
    @Override // O1.J
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean h2(O1.U0 r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            com.google.android.gms.internal.ads.J2 r0 = com.google.android.gms.internal.ads.L6.f6129i     // Catch: java.lang.Throwable -> L26
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
            goto L91
        L28:
            com.google.android.gms.internal.ads.Bc r2 = r5.f4934s     // Catch: java.lang.Throwable -> L26
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
            android.content.Context r0 = r5.f4931p     // Catch: java.lang.Throwable -> L26
            boolean r0 = Q1.N.e(r0)     // Catch: java.lang.Throwable -> L26
            r2 = 0
            if (r0 == 0) goto L68
            O1.N r0 = r6.f1299G     // Catch: java.lang.Throwable -> L26
            if (r0 != 0) goto L68
            java.lang.String r6 = "Failed to load the ad because app ID is missing."
            com.google.android.gms.internal.ads.Y9.p(r6)     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.internal.ads.Bn r6 = r5.f4935t     // Catch: java.lang.Throwable -> L26
            if (r6 == 0) goto L8f
            r0 = 4
            O1.z0 r0 = com.google.android.gms.internal.ads.Zf.L(r0, r2, r2)     // Catch: java.lang.Throwable -> L26
            r6.J(r0)     // Catch: java.lang.Throwable -> L26
            goto L8f
        L68:
            boolean r0 = r5.K3()     // Catch: java.lang.Throwable -> L26
            if (r0 != 0) goto L8f
            android.content.Context r0 = r5.f4931p     // Catch: java.lang.Throwable -> L26
            boolean r1 = r6.f1311t     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.internal.ads.Zf.n(r0, r1)     // Catch: java.lang.Throwable -> L26
            r5.f4939x = r2     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.internal.ads.qp r0 = r5.f4932q     // Catch: java.lang.Throwable -> L26
            java.lang.String r1 = r5.f4933r     // Catch: java.lang.Throwable -> L26
            O1.X0 r2 = r5.f4930o     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.internal.ads.np r3 = new com.google.android.gms.internal.ads.np     // Catch: java.lang.Throwable -> L26
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L26
            com.google.android.gms.internal.ads.xi r2 = new com.google.android.gms.internal.ads.xi     // Catch: java.lang.Throwable -> L26
            r4 = 15
            r2.<init>(r4, r5)     // Catch: java.lang.Throwable -> L26
            boolean r6 = r0.b(r6, r1, r3, r2)     // Catch: java.lang.Throwable -> L26
            monitor-exit(r5)
            return r6
        L8f:
            monitor-exit(r5)
            return r1
        L91:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L26
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.En.h2(O1.U0):boolean");
    }

    @Override // O1.J
    public final Bundle i() {
        h2.y.d("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // O1.J
    public final O1.O j() {
        O1.O o4;
        Bn bn = this.f4935t;
        synchronized (bn) {
            o4 = (O1.O) bn.f4175p.get();
        }
        return o4;
    }

    @Override // O1.J
    public final synchronized InterfaceC0084q0 k() {
        Xh xh;
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.V5)).booleanValue() && (xh = this.f4939x) != null) {
            return xh.f7861f;
        }
        return null;
    }

    @Override // O1.J
    public final InterfaceC0089t0 l() {
        return null;
    }

    @Override // O1.J
    public final InterfaceC1812a m() {
        return null;
    }

    @Override // O1.J
    public final synchronized void n1() {
        h2.y.d("pause must be called on the main UI thread.");
        Xh xh = this.f4939x;
        if (xh != null) {
            Ug ug = xh.c;
            ug.getClass();
            ug.n1(new C0894m6(null, 2));
        }
    }

    @Override // O1.J
    public final void n2(O1.a1 a1Var) {
    }

    @Override // O1.J
    public final synchronized boolean p3() {
        h2.y.d("isLoaded must be called on the main UI thread.");
        return K3();
    }

    @Override // O1.J
    public final void q3(InterfaceC0090u interfaceC0090u) {
    }

    @Override // O1.J
    public final void r1(O1.O o4) {
        h2.y.d("setAppEventListener must be called on the main UI thread.");
        this.f4935t.v(o4);
    }

    @Override // O1.J
    public final void t0(O1.U0 u02, InterfaceC0100z interfaceC0100z) {
        this.f4935t.f4177r.set(interfaceC0100z);
        h2(u02);
    }

    @Override // O1.J
    public final void t3(O1.R0 r02) {
    }

    @Override // O1.J
    public final synchronized void w() {
        h2.y.d("destroy must be called on the main UI thread.");
        Xh xh = this.f4939x;
        if (xh != null) {
            Ug ug = xh.c;
            ug.getClass();
            ug.n1(new C0894m6(null, 3));
        }
    }

    @Override // O1.J
    public final void w3(InterfaceC0096x interfaceC0096x) {
        h2.y.d("setAdListener must be called on the main UI thread.");
        this.f4935t.f4174o.set(interfaceC0096x);
    }

    @Override // O1.J
    public final synchronized String x() {
        Fg fg;
        Xh xh = this.f4939x;
        if (xh == null || (fg = xh.f7861f) == null) {
            return null;
        }
        return fg.f5059o;
    }

    @Override // O1.J
    public final synchronized void z() {
        h2.y.d("resume must be called on the main UI thread.");
        Xh xh = this.f4939x;
        if (xh != null) {
            Ug ug = xh.c;
            ug.getClass();
            ug.n1(new C0536dr(null, 2));
        }
    }

    @Override // O1.J
    public final void z2(O1.S s4) {
    }
}
