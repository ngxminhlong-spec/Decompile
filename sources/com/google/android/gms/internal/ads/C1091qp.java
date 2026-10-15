package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.qp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1091qp {

    /* renamed from: a, reason: collision with root package name */
    public final Context f10408a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f10409b;
    public final C1423ye c;
    public final Bn d;

    /* renamed from: e, reason: collision with root package name */
    public final C1133rp f10410e;

    /* renamed from: f, reason: collision with root package name */
    public C1409y6 f10411f;

    /* renamed from: g, reason: collision with root package name */
    public final Fq f10412g;

    /* renamed from: h, reason: collision with root package name */
    public final Ip f10413h;

    /* renamed from: i, reason: collision with root package name */
    public C0834kq f10414i;

    public C1091qp(Context context, Executor executor, C1423ye c1423ye, Bn bn, C1133rp c1133rp, Ip ip) {
        this.f10408a = context;
        this.f10409b = executor;
        this.c = c1423ye;
        this.d = bn;
        this.f10413h = ip;
        this.f10410e = c1133rp;
        this.f10412g = c1423ye.d();
    }

    public final boolean a() {
        C0834kq c0834kq = this.f10414i;
        return (c0834kq == null || c0834kq.f9325q.isDone()) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, com.google.android.gms.internal.ads.zg] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, com.google.android.gms.internal.ads.zg] */
    public final boolean b(O1.U0 u02, String str, Zf zf, Gn gn) {
        C0279Ge c0279Ge;
        Eq eq;
        Executor executor = this.f10409b;
        if (str == null) {
            Y9.p("Ad unit ID should not be null for interstitial ad.");
            executor.execute(new RunnableC0744il(9, this));
            return false;
        }
        if (a()) {
            return false;
        }
        C0937n6 c0937n6 = AbstractC1066q6.P7;
        O1.r rVar = O1.r.d;
        boolean booleanValue = ((Boolean) rVar.c.a(c0937n6)).booleanValue();
        C1423ye c1423ye = this.c;
        if (booleanValue && u02.f1311t) {
            ((Ok) c1423ye.f11422w.c()).e(true);
        }
        O1.X0 x02 = ((C0962np) zf).c;
        Ip ip = this.f10413h;
        ip.c = str;
        ip.f5728b = x02;
        ip.f5727a = u02;
        Jp a4 = ip.a();
        int U4 = Zf.U(a4);
        Context context = this.f10408a;
        Aq v4 = Zf.v(context, U4, 4, u02);
        boolean booleanValue2 = ((Boolean) rVar.c.a(AbstractC1066q6.g7)).booleanValue();
        Bn bn = this.d;
        if (booleanValue2) {
            C1423ye c1423ye2 = c1423ye.f11395b;
            ?? obj = new Object();
            obj.f11620a = context;
            obj.f11621b = a4;
            C1468zg c1468zg = new C1468zg(obj);
            Ch ch = new Ch();
            ch.b(bn, executor);
            ch.c(bn, executor);
            c0279Ge = new C0279Ge(c1423ye2, new Dh(ch), c1468zg, new Xj(7, false), new C0874ln(0, this.f10411f), null, null);
        } else {
            Ch ch2 = new Ch();
            C1133rp c1133rp = this.f10410e;
            HashSet hashSet = ch2.f4494h;
            HashSet hashSet2 = ch2.f4491e;
            if (c1133rp != null) {
                hashSet2.add(new Ph(c1133rp, executor));
                hashSet.add(new Ph(c1133rp, executor));
                ch2.a(c1133rp, executor);
            }
            C1423ye c1423ye3 = c1423ye.f11395b;
            ?? obj2 = new Object();
            obj2.f11620a = context;
            obj2.f11621b = a4;
            C1468zg c1468zg2 = new C1468zg(obj2);
            ch2.b(bn, executor);
            hashSet2.add(new Ph(bn, executor));
            hashSet.add(new Ph(bn, executor));
            ch2.a(bn, executor);
            ch2.c.add(new Ph(bn, executor));
            ch2.d(bn, executor);
            ch2.c(bn, executor);
            ch2.f4499m.add(new Ph(bn, executor));
            ch2.f4498l.add(new Ph(bn, executor));
            c0279Ge = new C0279Ge(c1423ye3, new Dh(ch2), c1468zg2, new Xj(7, false), new C0874ln(0, this.f10411f), null, null);
        }
        if (((Boolean) G6.c.r()).booleanValue()) {
            eq = (Eq) c0279Ge.f5189A0.c();
            eq.h(4);
            eq.b(u02.f1296D);
        } else {
            eq = null;
        }
        C0781jg c0781jg = (C0781jg) c0279Ge.f5208K0.c();
        C0834kq a5 = c0781jg.a(c0781jg.b());
        this.f10414i = a5;
        a5.a(new Nu(0, a5, new C0275Ga(this, gn, eq, v4, c0279Ge, 7)), executor);
        return true;
    }
}
