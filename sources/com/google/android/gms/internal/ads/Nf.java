package com.google.android.gms.internal.ads;

import android.content.Context;
import c3.InterfaceFutureC0239a;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import l2.C1798a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Nf implements InterfaceC1457zB {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6351a;

    /* renamed from: b, reason: collision with root package name */
    public final FB f6352b;
    public final FB c;

    public /* synthetic */ Nf(FB fb, FB fb2, int i4) {
        this.f6351a = i4;
        this.f6352b = fb;
        this.c = fb2;
    }

    public C1258ul a() {
        Context a4 = ((C0865le) this.f6352b).a();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.c.c();
        C1258ul c1258ul = new C1258ul(0);
        c1258ul.f10932s = a4;
        c1258ul.f10933t = N1.n.f1204A.f1220r.b();
        c1258ul.f10934u = scheduledExecutorService;
        return c1258ul;
    }

    public C0533dn b() {
        return new C0533dn((C1046pn) this.f6352b.c(), (Tj) this.c.c());
    }

    @Override // com.google.android.gms.internal.ads.FB
    public final Object c() {
        switch (this.f6351a) {
            case 0:
                return new C0331Rb(((C0865le) this.f6352b).a(), ((Eg) this.c).a().f5911f);
            case 1:
                return new C0953ng((C1082qg) this.f6352b.c(), ((Eg) this.c).a());
            case 2:
                return new C0331Rb(((C0865le) this.f6352b).a(), ((Eg) this.c).a().f5911f);
            case 3:
                Q1.v vVar = (Q1.v) this.f6352b.c();
                C1798a c1798a = (C1798a) this.c.c();
                C0260Dc c0260Dc = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc);
                return new Zi(vVar, c1798a, c0260Dc);
            case 4:
                return new C0530dk((C0572ek) this.f6352b.c(), (C0828kk) this.c.c());
            case 5:
                Object obj = (C0530dk) this.f6352b.c();
                C0260Dc c0260Dc2 = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc2);
                Object obj2 = (Jl) this.c.c();
                if (true == ((Boolean) O1.r.d.c.a(AbstractC1066q6.B7)).booleanValue()) {
                    obj = obj2;
                }
                return new Ph(obj, c0260Dc2);
            case 6:
                Object obj3 = (C0530dk) this.f6352b.c();
                C0260Dc c0260Dc3 = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc3);
                Object obj4 = (Jl) this.c.c();
                if (true == ((Boolean) O1.r.d.c.a(AbstractC1066q6.B7)).booleanValue()) {
                    obj3 = obj4;
                }
                return new Ph(obj3, c0260Dc3);
            case 7:
                return new C1043pk((C0957nk) this.f6352b.c(), (C1423ye) this.c.c());
            case 8:
                I3 i32 = (I3) this.f6352b.c();
                Context a4 = ((C0865le) this.c).a();
                C0260Dc c0260Dc4 = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc4);
                InterfaceFutureC0239a b4 = c0260Dc4.b(new B0.v(11, i32, a4));
                AbstractC0587ez.n(b4);
                return b4;
            case 9:
                C1006oq c1006oq = (C1006oq) this.f6352b.c();
                CallableC0336Sb callableC0336Sb = new CallableC0336Sb(4, N1.n.f1204A.f1207e.a());
                Su su = c1006oq.f9859a;
                Pu pu = C1006oq.d;
                List list = Collections.EMPTY_LIST;
                InterfaceFutureC0239a b5 = ((C0260Dc) su).b(callableC0336Sb);
                TimeUnit timeUnit = TimeUnit.SECONDS;
                C0381a5 c0381a5 = new C0381a5(c1006oq, EnumC0877lq.f9477I, null, pu, list, Bs.o0(b5, 1L, TimeUnit.SECONDS, c1006oq.f9860b));
                return new C0381a5((C1006oq) c0381a5.f8081t, c0381a5.f8079r, (String) c0381a5.f8077p, (InterfaceFutureC0239a) c0381a5.f8078q, (List) c0381a5.f8080s, Bs.c0((InterfaceFutureC0239a) c0381a5.f8076o, Exception.class, new C0364Xe(21), ((C1006oq) c0381a5.f8081t).f9859a)).d();
            case 10:
                return new C0872ll(((C0865le) this.f6352b).a(), (C0356Wb) this.c.c());
            case 11:
                return a();
            case 12:
                return d();
            case 13:
                return new Ml(((DB) this.f6352b).c(), (C1220tq) this.c.c());
            case 14:
                return b();
            case 15:
                return new Qn(0, (C1798a) this.f6352b.c(), ((Eg) this.c).a());
            case 16:
                C0260Dc c0260Dc5 = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc5);
                Jp a5 = ((Eg) this.f6352b).a();
                return new Sn(c0260Dc5, a5, 0);
            case 17:
                C0260Dc c0260Dc6 = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc6);
                return new Qn(c0260Dc6, ((C0865le) this.f6352b).a(), (Set) this.c.c());
            case 18:
                return new Qn(5, (String) this.f6352b.c(), (String) this.c.c());
            case 19:
                C0356Wb c0356Wb = (C0356Wb) this.f6352b.c();
                C0260Dc c0260Dc7 = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc7);
                return new Ao(c0356Wb, c0260Dc7, ((C0865le) this.c).a(), 0);
            case 20:
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f6352b.c();
                ((C0865le) this.c).a();
                return new Kn(5, scheduledExecutorService);
            case 21:
                return new Rp(((C0865le) this.f6352b).a(), ((C1165se) this.c).c());
            default:
                return new C1478zq(((C0865le) this.f6352b).a(), (Eq) this.c.c());
        }
    }

    public C1258ul d() {
        Context a4 = ((C0865le) this.f6352b).a();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.c.c();
        C1258ul c1258ul = new C1258ul(1);
        c1258ul.f10932s = a4;
        c1258ul.f10933t = N1.n.f1204A.f1220r.b();
        c1258ul.f10934u = scheduledExecutorService;
        return c1258ul;
    }
}
