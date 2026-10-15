package com.google.android.gms.internal.ads;

import android.content.Context;
import c3.InterfaceFutureC0239a;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.tp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1219tp {

    /* renamed from: a, reason: collision with root package name */
    public final Context f10744a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f10745b;
    public final C1423ye c;
    public final C1133rp d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0876lp f10746e;

    /* renamed from: f, reason: collision with root package name */
    public final Fp f10747f;

    /* renamed from: g, reason: collision with root package name */
    public final Fq f10748g;

    /* renamed from: h, reason: collision with root package name */
    public final Ip f10749h;

    /* renamed from: i, reason: collision with root package name */
    public InterfaceFutureC0239a f10750i;

    public C1219tp(Context context, Executor executor, C1423ye c1423ye, InterfaceC0876lp interfaceC0876lp, C1133rp c1133rp, Ip ip, Fp fp) {
        this.f10744a = context;
        this.f10745b = executor;
        this.c = c1423ye;
        this.f10746e = interfaceC0876lp;
        this.d = c1133rp;
        this.f10749h = ip;
        this.f10747f = fp;
        this.f10748g = c1423ye.d();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.google.android.gms.internal.ads.sp] */
    public final boolean a(O1.U0 u02, String str, Zf zf, Gn gn) {
        Eq eq;
        Executor executor = this.f10745b;
        if (str == null) {
            Y9.p("Ad unit ID should not be null for rewarded video ad.");
            executor.execute(new RunnableC0744il(10, this));
            return false;
        }
        InterfaceFutureC0239a interfaceFutureC0239a = this.f10750i;
        if (interfaceFutureC0239a != null && !interfaceFutureC0239a.isDone()) {
            return false;
        }
        boolean booleanValue = ((Boolean) G6.c.r()).booleanValue();
        InterfaceC0876lp interfaceC0876lp = this.f10746e;
        if (!booleanValue || interfaceC0876lp.i() == null) {
            eq = null;
        } else {
            eq = ((C0289Ie) interfaceC0876lp.i()).f();
            eq.h(5);
            eq.b(u02.f1296D);
        }
        boolean z4 = u02.f1311t;
        Context context = this.f10744a;
        Zf.n(context, z4);
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.P7)).booleanValue() && u02.f1311t) {
            ((Ok) this.c.f11422w.c()).e(true);
        }
        Ip ip = this.f10749h;
        ip.c = str;
        ip.f5728b = new O1.X0("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
        ip.f5727a = u02;
        Jp a4 = ip.a();
        Aq v4 = Zf.v(context, Zf.U(a4), 5, u02);
        ?? obj = new Object();
        obj.f10638a = a4;
        InterfaceFutureC0239a a5 = interfaceC0876lp.a(new Wl(obj, null, 2, false), new C1384xi(20, this));
        this.f10750i = a5;
        a5.a(new Nu(0, a5, new C0275Ga(this, gn, eq, v4, (Object) obj, 8)), executor);
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, com.google.android.gms.internal.ads.zg] */
    public final C0244Ae b(InterfaceC0790jp interfaceC0790jp) {
        C0244Ae c0244Ae = new C0244Ae(this.c.f11395b, 1);
        ?? obj = new Object();
        obj.f11620a = this.f10744a;
        obj.f11621b = ((C1176sp) interfaceC0790jp).f10638a;
        obj.d = this.f10747f;
        c0244Ae.f3966f = new C1468zg(obj);
        c0244Ae.f3965e = new Dh(new Ch());
        return c0244Ae;
    }
}
