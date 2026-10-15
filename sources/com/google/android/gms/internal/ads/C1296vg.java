package com.google.android.gms.internal.ads;

import O1.C0101z0;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.vg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1296vg implements Ig, Jh, InterfaceC1211th, Pg, InterfaceC1450z4 {

    /* renamed from: o, reason: collision with root package name */
    public final Qg f11038o;

    /* renamed from: p, reason: collision with root package name */
    public final C1434yp f11039p;

    /* renamed from: q, reason: collision with root package name */
    public final ScheduledExecutorService f11040q;

    /* renamed from: r, reason: collision with root package name */
    public final Executor f11041r;

    /* renamed from: t, reason: collision with root package name */
    public ScheduledFuture f11043t;

    /* renamed from: v, reason: collision with root package name */
    public final String f11045v;

    /* renamed from: s, reason: collision with root package name */
    public final Xu f11042s = new Object();

    /* renamed from: u, reason: collision with root package name */
    public final AtomicBoolean f11044u = new AtomicBoolean();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.google.android.gms.internal.ads.Xu] */
    public C1296vg(Qg qg, C1434yp c1434yp, ScheduledExecutorService scheduledExecutorService, C0260Dc c0260Dc, String str) {
        this.f11038o = qg;
        this.f11039p = c1434yp;
        this.f11040q = scheduledExecutorService;
        this.f11041r = c0260Dc;
        this.f11045v = str;
    }

    @Override // com.google.android.gms.internal.ads.Ig
    public final void a() {
    }

    @Override // com.google.android.gms.internal.ads.Ig
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.Ig
    public final void c() {
    }

    @Override // com.google.android.gms.internal.ads.Ig
    public final void d() {
    }

    @Override // com.google.android.gms.internal.ads.Ig
    public final void e() {
        C1434yp c1434yp = this.f11039p;
        if (c1434yp.f11506e == 3) {
            return;
        }
        int i4 = c1434yp.f11498Y;
        if (i4 == 0 || i4 == 1) {
            if (((Boolean) O1.r.d.c.a(AbstractC1066q6.G9)).booleanValue() && this.f11045v.equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                return;
            }
            this.f11038o.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1211th
    public final void g() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1211th
    public final synchronized void j() {
        try {
            if (this.f11042s.isDone()) {
                return;
            }
            ScheduledFuture scheduledFuture = this.f11043t;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            this.f11042s.f(Boolean.TRUE);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1450z4
    public final void j0(C1407y4 c1407y4) {
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.G9)).booleanValue() && this.f11045v.equals("com.google.ads.mediation.admob.AdMobAdapter") && c1407y4.f11338j && this.f11044u.compareAndSet(false, true) && this.f11039p.f11506e != 3) {
            Q1.I.w("Full screen 1px impression occurred");
            this.f11038o.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.Jh
    public final void k() {
        C1434yp c1434yp = this.f11039p;
        int i4 = c1434yp.f11506e;
        int i5 = c1434yp.f11530q;
        if (i4 == 3) {
            return;
        }
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f10241j1)).booleanValue() && c1434yp.f11498Y == 2) {
            if (i5 == 0) {
                this.f11038o.b();
                return;
            }
            C0874ln c0874ln = new C0874ln(22, this);
            Xu xu = this.f11042s;
            xu.a(new Nu(0, xu, c0874ln), this.f11041r);
            this.f11043t = this.f11040q.schedule(new D3(22, this), i5, TimeUnit.MILLISECONDS);
        }
    }

    @Override // com.google.android.gms.internal.ads.Jh
    public final void l() {
    }

    @Override // com.google.android.gms.internal.ads.Pg
    public final synchronized void r(C0101z0 c0101z0) {
        try {
            if (this.f11042s.isDone()) {
                return;
            }
            ScheduledFuture scheduledFuture = this.f11043t;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            this.f11042s.g(new Exception());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.Ig
    public final void y(BinderC0606fb binderC0606fb, String str, String str2) {
    }
}
