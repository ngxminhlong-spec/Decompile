package com.google.android.gms.internal.ads;

import O1.InterfaceC0074l0;
import O1.InterfaceC0084q0;
import O1.InterfaceC0089t0;
import O1.InterfaceC0090u;
import O1.InterfaceC0096x;
import O1.InterfaceC0100z;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.Collections;
import n2.BinderC1813b;
import n2.InterfaceC1812a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.yn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1432yn extends O1.I implements InterfaceC0868lh {

    /* renamed from: o, reason: collision with root package name */
    public final Context f11461o;

    /* renamed from: p, reason: collision with root package name */
    public final Zo f11462p;

    /* renamed from: q, reason: collision with root package name */
    public final String f11463q;

    /* renamed from: r, reason: collision with root package name */
    public final Bn f11464r;

    /* renamed from: s, reason: collision with root package name */
    public O1.X0 f11465s;

    /* renamed from: t, reason: collision with root package name */
    public final Ip f11466t;

    /* renamed from: u, reason: collision with root package name */
    public final C0248Bc f11467u;

    /* renamed from: v, reason: collision with root package name */
    public final C0658gk f11468v;

    /* renamed from: w, reason: collision with root package name */
    public Ff f11469w;

    public BinderC1432yn(Context context, O1.X0 x02, String str, Zo zo, Bn bn, C0248Bc c0248Bc, C0658gk c0658gk) {
        this.f11461o = context;
        this.f11462p = zo;
        this.f11465s = x02;
        this.f11463q = str;
        this.f11464r = bn;
        this.f11466t = zo.f8053k;
        this.f11467u = c0248Bc;
        this.f11468v = c0658gk;
        zo.f8050h.m1(this, zo.f8046b);
    }

    @Override // O1.J
    public final synchronized void B3(boolean z4) {
        try {
            if (M3()) {
                h2.y.d("setManualImpressionsEnabled must be called from the main thread.");
            }
            this.f11466t.f5729e = z4;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // O1.J
    public final synchronized String C() {
        return this.f11463q;
    }

    @Override // O1.J
    public final synchronized String D() {
        Fg fg;
        Ff ff = this.f11469w;
        if (ff == null || (fg = ff.f7861f) == null) {
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
    public final synchronized void G() {
        h2.y.d("recordManualImpression must be called on the main UI thread.");
        Ff ff = this.f11469w;
        if (ff != null) {
            ff.g();
        }
    }

    @Override // O1.J
    public final synchronized boolean H2() {
        return this.f11462p.a();
    }

    @Override // O1.J
    public final void H3(O1.U u2) {
    }

    public final synchronized void K3(O1.X0 x02) {
        Ip ip = this.f11466t;
        ip.f5728b = x02;
        ip.f5740p = this.f11465s.f1320B;
    }

    public final synchronized boolean L3(O1.U0 u02) {
        try {
            if (M3()) {
                h2.y.d("loadAd must be called on the main UI thread.");
            }
            Q1.N n4 = N1.n.f1204A.c;
            if (!Q1.N.e(this.f11461o) || u02.f1299G != null) {
                Zf.n(this.f11461o, u02.f1311t);
                return this.f11462p.b(u02, this.f11463q, null, new Xj(10, this));
            }
            Y9.p("Failed to load the ad because app ID is missing.");
            Bn bn = this.f11464r;
            if (bn != null) {
                bn.J(Zf.L(4, null, null));
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final boolean M3() {
        boolean z4;
        if (((Boolean) L6.f6126f.r()).booleanValue()) {
            if (((Boolean) O1.r.d.c.a(AbstractC1066q6.x9)).booleanValue()) {
                z4 = true;
                return this.f11467u.f4086q >= ((Integer) O1.r.d.c.a(AbstractC1066q6.y9)).intValue() || !z4;
            }
        }
        z4 = false;
        if (this.f11467u.f4086q >= ((Integer) O1.r.d.c.a(AbstractC1066q6.y9)).intValue()) {
        }
    }

    @Override // O1.J
    public final synchronized void O2(O1.X0 x02) {
        h2.y.d("setAdSize must be called on the main UI thread.");
        this.f11466t.f5728b = x02;
        this.f11465s = x02;
        Ff ff = this.f11469w;
        if (ff != null) {
            ff.h(this.f11462p.f8048f, x02);
        }
    }

    @Override // O1.J
    public final void R() {
    }

    @Override // O1.J
    public final void S() {
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

    @Override // O1.J
    public final synchronized void Z1(C1409y6 c1409y6) {
        h2.y.d("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f11462p.f8049g = c1409y6;
    }

    @Override // O1.J
    public final void b0() {
    }

    @Override // O1.J
    public final void f3(InterfaceC0074l0 interfaceC0074l0) {
        if (M3()) {
            h2.y.d("setPaidEventListener must be called on the main UI thread.");
        }
        try {
            if (!interfaceC0074l0.d()) {
                this.f11468v.b();
            }
        } catch (RemoteException e4) {
            Y9.o("Error in making CSI ping for reporting paid event callback", e4);
        }
        this.f11464r.f4176q.set(interfaceC0074l0);
    }

    @Override // O1.J
    public final InterfaceC0096x g() {
        return this.f11464r.l();
    }

    @Override // O1.J
    public final void g0() {
        h2.y.d("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // O1.J
    public final void g2(boolean z4) {
    }

    @Override // O1.J
    public final synchronized O1.X0 h() {
        h2.y.d("getAdSize must be called on the main UI thread.");
        Ff ff = this.f11469w;
        if (ff != null) {
            return Zf.c(this.f11461o, Collections.singletonList(ff.e()));
        }
        return this.f11466t.f5728b;
    }

    @Override // O1.J
    public final void h0() {
    }

    @Override // O1.J
    public final synchronized boolean h2(O1.U0 u02) {
        K3(this.f11465s);
        return L3(u02);
    }

    @Override // O1.J
    public final Bundle i() {
        h2.y.d("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // O1.J
    public final O1.O j() {
        O1.O o4;
        Bn bn = this.f11464r;
        synchronized (bn) {
            o4 = (O1.O) bn.f4175p.get();
        }
        return o4;
    }

    @Override // O1.J
    public final synchronized InterfaceC0084q0 k() {
        Ff ff;
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.V5)).booleanValue() && (ff = this.f11469w) != null) {
            return ff.f7861f;
        }
        return null;
    }

    @Override // O1.J
    public final synchronized InterfaceC0089t0 l() {
        h2.y.d("getVideoController must be called from the main thread.");
        Ff ff = this.f11469w;
        if (ff == null) {
            return null;
        }
        return ff.d();
    }

    @Override // O1.J
    public final InterfaceC1812a m() {
        if (M3()) {
            h2.y.d("getAdFrame must be called on the main UI thread.");
        }
        return new BinderC1813b(this.f11462p.f8048f);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {all -> 0x0036, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:10:0x003d, B:12:0x0041, B:19:0x0038), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0052 A[DONT_GENERATE] */
    @Override // O1.J
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void n1() {
        /*
            r4 = this;
            monitor-enter(r4)
            com.google.android.gms.internal.ads.J2 r0 = com.google.android.gms.internal.ads.L6.f6127g     // Catch: java.lang.Throwable -> L36
            java.lang.Object r0 = r0.r()     // Catch: java.lang.Throwable -> L36
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L36
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L38
            com.google.android.gms.internal.ads.n6 r0 = com.google.android.gms.internal.ads.AbstractC1066q6.v9     // Catch: java.lang.Throwable -> L36
            O1.r r1 = O1.r.d     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.p6 r2 = r1.c     // Catch: java.lang.Throwable -> L36
            java.lang.Object r0 = r2.a(r0)     // Catch: java.lang.Throwable -> L36
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L36
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L38
            com.google.android.gms.internal.ads.Bc r0 = r4.f11467u     // Catch: java.lang.Throwable -> L36
            int r0 = r0.f4086q     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.n6 r2 = com.google.android.gms.internal.ads.AbstractC1066q6.z9     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.p6 r1 = r1.c     // Catch: java.lang.Throwable -> L36
            java.lang.Object r1 = r1.a(r2)     // Catch: java.lang.Throwable -> L36
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L36
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L36
            if (r0 >= r1) goto L3d
            goto L38
        L36:
            r0 = move-exception
            goto L54
        L38:
            java.lang.String r0 = "pause must be called on the main UI thread."
            h2.y.d(r0)     // Catch: java.lang.Throwable -> L36
        L3d:
            com.google.android.gms.internal.ads.Ff r0 = r4.f11469w     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L52
            com.google.android.gms.internal.ads.Ug r0 = r0.c     // Catch: java.lang.Throwable -> L36
            r0.getClass()     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.m6 r1 = new com.google.android.gms.internal.ads.m6     // Catch: java.lang.Throwable -> L36
            r2 = 2
            r3 = 0
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L36
            r0.n1(r1)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r4)
            return
        L52:
            monitor-exit(r4)
            return
        L54:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L36
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.BinderC1432yn.n1():void");
    }

    @Override // O1.J
    public final void n2(O1.a1 a1Var) {
    }

    @Override // O1.J
    public final boolean p3() {
        return false;
    }

    @Override // O1.J
    public final void q3(InterfaceC0090u interfaceC0090u) {
        if (M3()) {
            h2.y.d("setAdListener must be called on the main UI thread.");
        }
        Dn dn = this.f11462p.f8047e;
        synchronized (dn) {
            dn.f4786o = interfaceC0090u;
        }
    }

    @Override // O1.J
    public final void r1(O1.O o4) {
        if (M3()) {
            h2.y.d("setAppEventListener must be called on the main UI thread.");
        }
        this.f11464r.v(o4);
    }

    @Override // O1.J
    public final void t0(O1.U0 u02, InterfaceC0100z interfaceC0100z) {
    }

    @Override // O1.J
    public final synchronized void t3(O1.R0 r02) {
        try {
            if (M3()) {
                h2.y.d("setVideoOptions must be called on the main UI thread.");
            }
            this.f11466t.d = r02;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {all -> 0x0036, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:10:0x003d, B:12:0x0041, B:19:0x0038), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0052 A[DONT_GENERATE] */
    @Override // O1.J
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void w() {
        /*
            r4 = this;
            monitor-enter(r4)
            com.google.android.gms.internal.ads.J2 r0 = com.google.android.gms.internal.ads.L6.f6125e     // Catch: java.lang.Throwable -> L36
            java.lang.Object r0 = r0.r()     // Catch: java.lang.Throwable -> L36
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L36
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L38
            com.google.android.gms.internal.ads.n6 r0 = com.google.android.gms.internal.ads.AbstractC1066q6.u9     // Catch: java.lang.Throwable -> L36
            O1.r r1 = O1.r.d     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.p6 r2 = r1.c     // Catch: java.lang.Throwable -> L36
            java.lang.Object r0 = r2.a(r0)     // Catch: java.lang.Throwable -> L36
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L36
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L38
            com.google.android.gms.internal.ads.Bc r0 = r4.f11467u     // Catch: java.lang.Throwable -> L36
            int r0 = r0.f4086q     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.n6 r2 = com.google.android.gms.internal.ads.AbstractC1066q6.z9     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.p6 r1 = r1.c     // Catch: java.lang.Throwable -> L36
            java.lang.Object r1 = r1.a(r2)     // Catch: java.lang.Throwable -> L36
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L36
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L36
            if (r0 >= r1) goto L3d
            goto L38
        L36:
            r0 = move-exception
            goto L54
        L38:
            java.lang.String r0 = "destroy must be called on the main UI thread."
            h2.y.d(r0)     // Catch: java.lang.Throwable -> L36
        L3d:
            com.google.android.gms.internal.ads.Ff r0 = r4.f11469w     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L52
            com.google.android.gms.internal.ads.Ug r0 = r0.c     // Catch: java.lang.Throwable -> L36
            r0.getClass()     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.m6 r1 = new com.google.android.gms.internal.ads.m6     // Catch: java.lang.Throwable -> L36
            r2 = 3
            r3 = 0
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L36
            r0.n1(r1)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r4)
            return
        L52:
            monitor-exit(r4)
            return
        L54:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L36
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.BinderC1432yn.w():void");
    }

    @Override // O1.J
    public final void w3(InterfaceC0096x interfaceC0096x) {
        if (M3()) {
            h2.y.d("setAdListener must be called on the main UI thread.");
        }
        this.f11464r.f4174o.set(interfaceC0096x);
    }

    @Override // O1.J
    public final synchronized String x() {
        Fg fg;
        Ff ff = this.f11469w;
        if (ff == null || (fg = ff.f7861f) == null) {
            return null;
        }
        return fg.f5059o;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {all -> 0x0036, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:10:0x003d, B:12:0x0041, B:19:0x0038), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0052 A[DONT_GENERATE] */
    @Override // O1.J
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void z() {
        /*
            r4 = this;
            monitor-enter(r4)
            com.google.android.gms.internal.ads.J2 r0 = com.google.android.gms.internal.ads.L6.f6128h     // Catch: java.lang.Throwable -> L36
            java.lang.Object r0 = r0.r()     // Catch: java.lang.Throwable -> L36
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L36
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L38
            com.google.android.gms.internal.ads.n6 r0 = com.google.android.gms.internal.ads.AbstractC1066q6.t9     // Catch: java.lang.Throwable -> L36
            O1.r r1 = O1.r.d     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.p6 r2 = r1.c     // Catch: java.lang.Throwable -> L36
            java.lang.Object r0 = r2.a(r0)     // Catch: java.lang.Throwable -> L36
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L36
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L38
            com.google.android.gms.internal.ads.Bc r0 = r4.f11467u     // Catch: java.lang.Throwable -> L36
            int r0 = r0.f4086q     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.n6 r2 = com.google.android.gms.internal.ads.AbstractC1066q6.z9     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.p6 r1 = r1.c     // Catch: java.lang.Throwable -> L36
            java.lang.Object r1 = r1.a(r2)     // Catch: java.lang.Throwable -> L36
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L36
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L36
            if (r0 >= r1) goto L3d
            goto L38
        L36:
            r0 = move-exception
            goto L54
        L38:
            java.lang.String r0 = "resume must be called on the main UI thread."
            h2.y.d(r0)     // Catch: java.lang.Throwable -> L36
        L3d:
            com.google.android.gms.internal.ads.Ff r0 = r4.f11469w     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L52
            com.google.android.gms.internal.ads.Ug r0 = r0.c     // Catch: java.lang.Throwable -> L36
            r0.getClass()     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.dr r1 = new com.google.android.gms.internal.ads.dr     // Catch: java.lang.Throwable -> L36
            r2 = 2
            r3 = 0
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L36
            r0.n1(r1)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r4)
            return
        L52:
            monitor-exit(r4)
            return
        L54:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L36
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.BinderC1432yn.z():void");
    }

    @Override // O1.J
    public final synchronized void z2(O1.S s4) {
        h2.y.d("setCorrelationIdProvider must be called on the main UI thread");
        this.f11466t.f5743s = s4;
    }
}
