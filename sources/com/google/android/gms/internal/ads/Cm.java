package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import c3.InterfaceFutureC0239a;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Cm implements InterfaceC0745im {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4540a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final C0262De f4541b;
    public final Su c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f4542e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f4543f;

    public Cm(Context context, C0262De c0262De, C1006oq c1006oq, Su su, C1409y6 c1409y6) {
        this.d = context;
        this.f4541b = c0262De;
        this.f4543f = c1006oq;
        this.c = su;
        this.f4542e = c1409y6;
    }

    public Cm(C0262De c0262De, C1345wm c1345wm, Kg kg, ScheduledExecutorService scheduledExecutorService, Su su) {
        this.f4541b = c0262De;
        this.d = c1345wm;
        this.f4542e = kg;
        this.f4543f = scheduledExecutorService;
        this.c = su;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [com.google.android.gms.internal.ads.a5, java.lang.Object, N1.e] */
    @Override // com.google.android.gms.internal.ads.InterfaceC0745im
    public final InterfaceFutureC0239a a(Ep ep, C1434yp c1434yp) {
        switch (this.f4540a) {
            case 0:
                return ((C0260Dc) this.c).b(new CallableC0401aj(this, ep, c1434yp));
            default:
                u0.g gVar = new u0.g(new View((Context) this.d), (C0348Ud) null, C0782jh.f9197R, (C1477zp) c1434yp.f11538u.get(0));
                Op op = new Op(ep, c1434yp, (String) null);
                C0262De c0262De = this.f4541b;
                C0256Ce c0256Ce = new C0256Ce(c0262De.d, c0262De.f4690e, op, gVar);
                Gg gg = (Gg) c0256Ce.f4469l.c();
                Qg qg = (Qg) c0256Ce.f4471n.c();
                Th th = (Th) c0256Ce.f4473p.c();
                Qh qh = (Qh) c0256Ce.y.c();
                C1209tf c1209tf = (C1209tf) c0256Ce.f4464g.c();
                ?? obj = new Object();
                obj.f8081t = new AtomicBoolean(false);
                obj.f8077p = gg;
                obj.f8078q = qg;
                obj.f8079r = th;
                obj.f8080s = qh;
                obj.f8076o = c1209tf;
                Cp cp = c1434yp.f11534s;
                Wl wl = new Wl(1, this, new BinderC1366x6(obj, cp.f4552b, cp.f4551a));
                C1006oq c1006oq = (C1006oq) this.f4543f;
                CallableC0336Sb callableC0336Sb = new CallableC0336Sb(27, wl);
                C0381a5 c0381a5 = new C0381a5(c1006oq, EnumC0877lq.f9475G, null, C1006oq.d, Collections.EMPTY_LIST, ((C0260Dc) this.c).b(callableC0336Sb));
                C0381a5 b4 = c1006oq.b(c0381a5.d(), EnumC0877lq.f9476H);
                C0811k9 c0811k9 = new C0811k9(Bs.h0(c0256Ce.f0()), 1);
                C0260Dc c0260Dc = AbstractC0266Ec.f4900f;
                return new C0381a5((C1006oq) b4.f8081t, b4.f8079r, null, (InterfaceFutureC0239a) b4.f8078q, (List) b4.f8080s, Bs.n0((InterfaceFutureC0239a) b4.f8076o, c0811k9, c0260Dc)).d();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0745im
    public final boolean b(Ep ep, C1434yp c1434yp) {
        Cp cp;
        switch (this.f4540a) {
            case 0:
                return ((Jp) ep.f4942a.f11290p).a() != null && ((C1345wm) this.d).b(ep, c1434yp);
            default:
                return (((C1409y6) this.f4542e) == null || (cp = c1434yp.f11534s) == null || cp.f4551a == null) ? false : true;
        }
    }
}
