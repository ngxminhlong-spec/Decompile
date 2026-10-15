package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import l2.C1798a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Af, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0245Af implements InterfaceC1457zB {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3967a;

    /* renamed from: b, reason: collision with root package name */
    public final FB f3968b;
    public final FB c;
    public final FB d;

    /* renamed from: e, reason: collision with root package name */
    public final FB f3969e;

    public C0245Af(AB ab, C0371Zb c0371Zb, C1414yB c1414yB, C1414yB c1414yB2) {
        this.f3967a = 14;
        this.f3969e = ab;
        this.c = c0371Zb;
        this.f3968b = c1414yB;
        this.d = c1414yB2;
    }

    public C0245Af(AB ab, C0610ff c0610ff, C1414yB c1414yB, C1414yB c1414yB2) {
        this.f3967a = 13;
        this.f3969e = ab;
        this.c = c0610ff;
        this.d = c1414yB;
        this.f3968b = c1414yB2;
    }

    public /* synthetic */ C0245Af(FB fb, FB fb2, FB fb3, FB fb4, int i4) {
        this.f3967a = i4;
        this.f3968b = fb;
        this.d = fb2;
        this.f3969e = fb3;
        this.c = fb4;
    }

    public C0245Af(Qo qo, C0865le c0865le, C1414yB c1414yB, C1414yB c1414yB2, Qo qo2) {
        this.f3967a = 19;
        this.f3968b = c0865le;
        this.d = c1414yB;
        this.f3969e = c1414yB2;
        this.c = qo2;
    }

    public C0245Af(C1414yB c1414yB, C0654gg c0654gg, C1414yB c1414yB2, C0654gg c0654gg2) {
        this.f3967a = 4;
        this.d = c1414yB;
        this.f3969e = c0654gg;
        this.f3968b = c1414yB2;
        this.c = c0654gg2;
    }

    public C0245Af(C1414yB c1414yB, C1126ri c1126ri, C1414yB c1414yB2, Zh zh) {
        this.f3967a = 7;
        this.f3968b = c1414yB;
        this.f3969e = c1126ri;
        this.d = c1414yB2;
        this.c = zh;
    }

    public /* synthetic */ C0245Af(C1414yB c1414yB, C1414yB c1414yB2, FB fb, FB fb2, int i4) {
        this.f3967a = i4;
        this.d = c1414yB;
        this.f3968b = c1414yB2;
        this.f3969e = fb;
        this.c = fb2;
    }

    public /* synthetic */ C0245Af(InterfaceC1457zB interfaceC1457zB, InterfaceC1457zB interfaceC1457zB2, InterfaceC1457zB interfaceC1457zB3, C1414yB c1414yB, int i4) {
        this.f3967a = i4;
        this.d = interfaceC1457zB;
        this.f3969e = interfaceC1457zB2;
        this.c = interfaceC1457zB3;
        this.f3968b = c1414yB;
    }

    public C1151s6 a() {
        C0260Dc c0260Dc = AbstractC0266Ec.f4897a;
        AbstractC0587ez.n(c0260Dc);
        return new C1151s6(c0260Dc, (ScheduledExecutorService) this.f3968b.c(), (InterfaceC0441bg) ((C1414yB) this.d).c(), (Um) this.f3969e.c(), (Nq) ((C1414yB) this.c).c());
    }

    public Bm b() {
        return new Bm((C1006oq) this.f3968b.c(), (Su) this.d.c(), (InterfaceC0830km) this.f3969e.c(), (InterfaceC1002om) ((InterfaceC1457zB) this.c).c());
    }

    @Override // com.google.android.gms.internal.ads.FB
    public final Object c() {
        switch (this.f3967a) {
            case 0:
                C1006oq c1006oq = (C1006oq) ((C1414yB) this.d).c();
                Su su = (Su) this.f3968b.c();
                C0321Pb c0321Pb = (C0321Pb) this.f3969e;
                return new Bm(c1006oq, su, ((Nf) this.c).b(), new C1259um((Context) c0321Pb.f6583b.c(), (C0250Be) c0321Pb.c.f3930a, 0));
            case 1:
                C1006oq c1006oq2 = (C1006oq) this.f3968b.c();
                Su su2 = (Su) this.d.c();
                Zj zj = (Zj) this.f3969e;
                return new Bm(c1006oq2, su2, ((Nf) this.c).b(), new Am((Context) zj.f8028b.c(), (C0262De) zj.c.f3930a));
            case 2:
                C1151s6 a4 = ((C1124rg) this.d).a();
                P7 p7 = (P7) ((Pf) this.f3969e).f6590b.f9211p;
                AbstractC0587ez.n(p7);
                return new Of(a4, p7, (RunnableC0801k) ((Pf) this.c).f6590b.f9212q, (Executor) this.f3968b.c());
            case 3:
                return new Rf(((C0865le) this.f3968b).a(), (InterfaceC0308Md) ((Kf) this.d).f6036b.f14986s, ((C0654gg) this.f3969e).a(), ((C1122re) this.c).a());
            case 4:
                Qg qg = (Qg) ((C1414yB) this.d).c();
                C1434yp a5 = ((C0654gg) this.f3969e).a();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f3968b.c();
                C0260Dc c0260Dc = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc);
                return new C1296vg(qg, a5, scheduledExecutorService, c0260Dc, (String) ((C0654gg) this.c).f8840b.f6527r);
            case 5:
                C1006oq c1006oq3 = (C1006oq) this.f3968b.c();
                Su su3 = (Su) this.d.c();
                Zj zj2 = (Zj) this.f3969e;
                return new Bm(c1006oq3, su3, ((Nf) this.c).b(), new C1259um((Context) zj2.f8028b.c(), (C0279Ge) zj2.c.f3930a, 1));
            case 6:
                C1364x4 c1364x4 = (C1364x4) ((C1414yB) this.d).c();
                Executor executor = (Executor) this.f3968b.c();
                Context context = (Context) this.f3969e.c();
                return new C1381xf(executor, new C1081qf(context, c1364x4), (C1798a) this.c.c());
            case 7:
                Oj oj = (Oj) this.f3968b.c();
                Aj aj = (Aj) ((C1126ri) this.f3969e).f10496b.f11915q;
                AbstractC0587ez.n(aj);
                C1381xf c1381xf = (C1381xf) ((C1414yB) this.d).c();
                C1041pi c1041pi = (C1041pi) ((Zh) this.c).f8024b.c();
                AbstractC0587ez.n(c1041pi);
                return new Pi(oj, aj, c1381xf, c1041pi);
            case 8:
                return new BinderC1213tj(((C0865le) this.f3968b).a(), ((Lf) this.d).a(), ((W1.c) this.f3969e).b(), (C1427yi) ((Eo) this.c).c());
            case 9:
                return new BinderC1256uj((String) ((C0654gg) this.d).f8840b.f6527r, (C1427yi) ((Eo) this.f3969e).c(), ((Lf) this.c).a(), (C0658gk) this.f3968b.c());
            case 10:
                C1006oq c1006oq4 = (C1006oq) this.f3968b.c();
                Su su4 = (Su) this.d.c();
                Zj zj3 = (Zj) this.f3969e;
                return new Bm(c1006oq4, su4, ((Nf) this.c).b(), new C1259um((Context) zj3.f8028b.c(), (C0289Ie) zj3.c.f3930a, 2));
            case 11:
                Context a6 = ((C0865le) this.f3968b).a();
                Object c = this.d.c();
                Object c2 = this.f3969e.c();
                Xj xj = new Xj(4, ((C1208te) ((C1000ok) this.c).f9851b).c());
                C0260Dc c0260Dc2 = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc2);
                return new Dl(a6, (C1337we) c, (C1294ve) c2, xj, c0260Dc2, new C1016p(22));
            case 12:
                return new Bm((Context) this.f3968b.c(), (Executor) this.d.c(), (C0279Ge) ((AB) this.f3969e).f3930a, (C1391xp) this.c.c());
            case 13:
                return d();
            case 14:
                C1251ue c1251ue = (C1251ue) ((AB) this.f3969e).f3930a;
                C0260Dc c0260Dc3 = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc3);
                C0371Zb c0371Zb = (C0371Zb) this.c;
                AbstractC0587ez.n(c0260Dc3);
                return new Km(c1251ue, c0260Dc3, new Op((Object) c0260Dc3, (Object) ((C0700hj) c0371Zb.f8001b).c(), (Object) new C0783ji(26, c0260Dc3, ((C0700hj) ((Lf) c0371Zb.c).f6149b).c()), 13, (byte) 0), (Qp) this.f3968b.c(), (Ej) ((C1414yB) this.d).c());
            case 15:
                return a();
            case 16:
                return b();
            case 17:
                return new Bm((C1006oq) this.f3968b.c(), (Su) this.d.c(), (C1409y6) ((C0917mn) this.f3969e).f9655b.f9467p, new C1384xi(14, (C0279Ge) ((C1128rk) this.c).f10500b.f3930a));
            case 18:
                Su su5 = (Su) this.f3968b.c();
                C0260Dc c0260Dc4 = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc4);
                return new Nn(su5, c0260Dc4, ((C0865le) this.d).a(), ((Eg) this.f3969e).a(), (ViewGroup) ((C0263Df) this.c).f4753a.f9467p);
            default:
                ((C0865le) this.f3968b).a();
                C1035pc c1035pc = (C1035pc) this.d.c();
                ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) this.f3969e.c();
                C0260Dc c0260Dc5 = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc5);
                AbstractC0587ez.n(((C0370Za) ((Qo) this.c).f6699b.f113p).f7992r);
                return new Ao(c1035pc, scheduledExecutorService2, c0260Dc5, 2);
        }
    }

    public Cm d() {
        C0262De c0262De = (C0262De) ((AB) this.f3969e).f3930a;
        C1345wm a4 = ((C0610ff) this.c).a();
        Kg kg = (Kg) ((C1414yB) this.d).c();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f3968b.c();
        C0260Dc c0260Dc = AbstractC0266Ec.f4897a;
        AbstractC0587ez.n(c0260Dc);
        return new Cm(c0262De, a4, kg, scheduledExecutorService, c0260Dc);
    }
}
