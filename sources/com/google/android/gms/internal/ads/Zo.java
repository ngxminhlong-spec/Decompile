package com.google.android.gms.internal.ads;

import android.content.Context;
import android.widget.FrameLayout;
import com.google.android.gms.internal.measurement.C1510e1;
import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import l2.C1798a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Zo {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8045a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f8046b;
    public final C1423ye c;
    public final Bn d;

    /* renamed from: e, reason: collision with root package name */
    public final Dn f8047e;

    /* renamed from: f, reason: collision with root package name */
    public final FrameLayout f8048f;

    /* renamed from: g, reason: collision with root package name */
    public C1409y6 f8049g;

    /* renamed from: h, reason: collision with root package name */
    public final C0825kh f8050h;

    /* renamed from: i, reason: collision with root package name */
    public final Fq f8051i;

    /* renamed from: j, reason: collision with root package name */
    public final C1297vh f8052j;

    /* renamed from: k, reason: collision with root package name */
    public final Ip f8053k;

    /* renamed from: l, reason: collision with root package name */
    public C0834kq f8054l;

    public Zo(Context context, Executor executor, O1.X0 x02, C1423ye c1423ye, Bn bn, Dn dn, Ip ip, C1297vh c1297vh) {
        this.f8045a = context;
        this.f8046b = executor;
        this.c = c1423ye;
        this.d = bn;
        this.f8047e = dn;
        this.f8053k = ip;
        this.f8050h = new C0825kh((ScheduledExecutorService) c1423ye.f11399e.c(), (C1798a) c1423ye.f11407i.c());
        this.f8051i = c1423ye.d();
        this.f8048f = new FrameLayout(context);
        this.f8052j = c1297vh;
        ip.f5728b = x02;
    }

    public final boolean a() {
        C0834kq c0834kq = this.f8054l;
        return (c0834kq == null || c0834kq.f9325q.isDone()) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, com.google.android.gms.internal.ads.zg] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, com.google.android.gms.internal.ads.zg] */
    public final boolean b(O1.U0 u02, String str, Zf zf, Gn gn) {
        boolean z4;
        C0262De c0262De;
        Executor executor = this.f8046b;
        if (str == null) {
            Y9.p("Ad unit ID should not be null for banner ad.");
            executor.execute(new RunnableC0744il(7, this));
            return false;
        }
        if (!a()) {
            C0937n6 c0937n6 = AbstractC1066q6.P7;
            O1.r rVar = O1.r.d;
            boolean booleanValue = ((Boolean) rVar.c.a(c0937n6)).booleanValue();
            C1423ye c1423ye = this.c;
            if (booleanValue && u02.f1311t) {
                ((Ok) c1423ye.f11422w.c()).e(true);
            }
            Ip ip = this.f8053k;
            ip.c = str;
            ip.f5727a = u02;
            Jp a4 = ip.a();
            int U4 = Zf.U(a4);
            Context context = this.f8045a;
            Aq v4 = Zf.v(context, U4, 3, u02);
            boolean booleanValue2 = ((Boolean) T6.d.r()).booleanValue();
            Eq eq = null;
            Bn bn = this.d;
            if (!booleanValue2 || !ip.f5728b.y) {
                boolean booleanValue3 = ((Boolean) rVar.c.a(AbstractC1066q6.e7)).booleanValue();
                FrameLayout frameLayout = this.f8048f;
                C1297vh c1297vh = this.f8052j;
                C0825kh c0825kh = this.f8050h;
                if (booleanValue3) {
                    C1423ye c1423ye2 = c1423ye.f11395b;
                    ?? obj = new Object();
                    obj.f11620a = context;
                    obj.f11621b = a4;
                    C1468zg c1468zg = new C1468zg(obj);
                    Ch ch = new Ch();
                    ch.b(bn, executor);
                    ch.c(bn, executor);
                    z4 = true;
                    c0262De = new C0262De(c1423ye2, new C0874ln(20, frameLayout), new C0783ji(0, Gi.f5315h, eq), new Dh(ch), c1468zg, new Xj(7, false), new C0874ln(0, this.f8049g), new C1510e1((Object) c0825kh, (Object) c1297vh, 22, false), null, null);
                } else {
                    z4 = true;
                    C1423ye c1423ye3 = c1423ye.f11395b;
                    ?? obj2 = new Object();
                    obj2.f11620a = context;
                    obj2.f11621b = a4;
                    C1468zg c1468zg2 = new C1468zg(obj2);
                    Ch ch2 = new Ch();
                    ch2.b(bn, executor);
                    Ph ph = new Ph(bn, executor);
                    HashSet hashSet = ch2.c;
                    hashSet.add(ph);
                    hashSet.add(new Ph(this.f8047e, executor));
                    ch2.d(bn, executor);
                    ch2.f4492f.add(new Ph(bn, executor));
                    ch2.f4491e.add(new Ph(bn, executor));
                    ch2.f4494h.add(new Ph(bn, executor));
                    ch2.a(bn, executor);
                    ch2.c(bn, executor);
                    ch2.f4499m.add(new Ph(bn, executor));
                    c0262De = new C0262De(c1423ye3, new C0874ln(20, frameLayout), new C0783ji(0, Gi.f5315h, eq), new Dh(ch2), c1468zg2, new Xj(7, false), new C0874ln(0, this.f8049g), new C1510e1((Object) c0825kh, (Object) c1297vh, 22, false), null, null);
                }
                if (((Boolean) G6.c.r()).booleanValue()) {
                    eq = (Eq) c0262De.f4642F0.c();
                    eq.h(3);
                    eq.b(u02.f1296D);
                }
                C0781jg c0781jg = (C0781jg) c0262De.f4659P0.c();
                C0834kq a5 = c0781jg.a(c0781jg.b());
                this.f8054l = a5;
                a5.a(new Nu(0, a5, new C0275Ga(this, gn, eq, v4, c0262De, 6)), executor);
                return z4;
            }
            if (bn != null) {
                bn.J(Zf.L(7, null, null));
            }
        }
        return false;
    }
}
