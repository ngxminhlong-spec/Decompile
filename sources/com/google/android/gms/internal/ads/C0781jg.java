package com.google.android.gms.internal.ads;

import c3.InterfaceFutureC0239a;
import java.util.Collections;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import t2.C1995b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.jg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0781jg {

    /* renamed from: a, reason: collision with root package name */
    public final C1995b f9169a;

    /* renamed from: b, reason: collision with root package name */
    public final Jp f9170b;
    public final C1006oq c;
    public final C0339Se d;

    /* renamed from: e, reason: collision with root package name */
    public final Ym f9171e;

    /* renamed from: f, reason: collision with root package name */
    public final C1383xh f9172f;

    /* renamed from: g, reason: collision with root package name */
    public Ep f9173g = null;

    /* renamed from: h, reason: collision with root package name */
    public final C0381a5 f9174h;

    /* renamed from: i, reason: collision with root package name */
    public final V2.j f9175i;

    /* renamed from: j, reason: collision with root package name */
    public final Executor f9176j;

    /* renamed from: k, reason: collision with root package name */
    public final C0915ml f9177k;

    /* renamed from: l, reason: collision with root package name */
    public final C0959nm f9178l;

    /* renamed from: m, reason: collision with root package name */
    public final Op f9179m;

    /* renamed from: n, reason: collision with root package name */
    public final C1151s6 f9180n;

    public C0781jg(C1995b c1995b, Jp jp, C1006oq c1006oq, C0339Se c0339Se, Ym ym, C1383xh c1383xh, C0381a5 c0381a5, V2.j jVar, C0260Dc c0260Dc, C0915ml c0915ml, C0959nm c0959nm, Op op, C1151s6 c1151s6) {
        this.f9169a = c1995b;
        this.f9170b = jp;
        this.c = c1006oq;
        this.d = c0339Se;
        this.f9171e = ym;
        this.f9172f = c1383xh;
        this.f9174h = c0381a5;
        this.f9175i = jVar;
        this.f9176j = c0260Dc;
        this.f9177k = c0915ml;
        this.f9178l = c0959nm;
        this.f9179m = op;
        this.f9180n = c1151s6;
    }

    public final C0834kq a(InterfaceFutureC0239a interfaceFutureC0239a) {
        C0381a5 r4 = this.c.b(interfaceFutureC0239a, EnumC0877lq.f9486s).p(new C0739ig(this)).r(this.f9171e);
        C0937n6 c0937n6 = AbstractC1066q6.I4;
        O1.r rVar = O1.r.d;
        if (!((Boolean) rVar.c.a(c0937n6)).booleanValue()) {
            long intValue = ((Integer) rVar.c.a(AbstractC1066q6.J4)).intValue();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            r4 = r4.w(intValue);
        }
        return r4.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.C0834kq b() {
        /*
            Method dump skipped, instructions count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0781jg.b():com.google.android.gms.internal.ads.kq");
    }

    public final C0834kq c(InterfaceFutureC0239a interfaceFutureC0239a) {
        Ep ep = this.f9173g;
        if (ep != null) {
            return new C0381a5(this.c, EnumC0877lq.f9485r, null, C1006oq.d, Collections.EMPTY_LIST, Bs.h0(ep)).d();
        }
        C0381a5 c0381a5 = N1.n.f1204A.f1211i;
        c0381a5.getClass();
        C0937n6 c0937n6 = AbstractC1066q6.f10101E3;
        O1.r rVar = O1.r.d;
        if (((Boolean) rVar.c.a(c0937n6)).booleanValue()) {
            synchronized (c0381a5.f8079r) {
                try {
                    c0381a5.A();
                    ScheduledFuture scheduledFuture = (ScheduledFuture) c0381a5.f8077p;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    c0381a5.f8077p = AbstractC0266Ec.d.schedule((D3) c0381a5.f8078q, ((Long) rVar.c.a(AbstractC1066q6.f10105F3)).longValue(), TimeUnit.MILLISECONDS);
                } finally {
                }
            }
        }
        if (!((Boolean) rVar.c.a(AbstractC1066q6.K9)).booleanValue() || ((Boolean) T6.c.r()).booleanValue()) {
            return this.c.b(interfaceFutureC0239a, EnumC0877lq.f9485r).r(new C0512d8(9, this.f9177k)).d();
        }
        C1267uu n02 = Bs.n0(interfaceFutureC0239a, new C0512d8(7, this.f9179m), this.f9176j);
        C0834kq d = this.c.b(n02, EnumC0877lq.f9488u).r(new C0512d8(8, this.f9174h)).d();
        return this.c.a(EnumC0877lq.f9485r, interfaceFutureC0239a, n02, d).h(new B0.h(this, interfaceFutureC0239a, n02, d, 1)).r(C0364Xe.c).d();
    }
}
