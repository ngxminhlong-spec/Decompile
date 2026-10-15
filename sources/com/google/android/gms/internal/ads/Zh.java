package com.google.android.gms.internal.ads;

import c3.InterfaceFutureC0239a;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import l2.C1798a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Zh implements InterfaceC1457zB {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8023a;

    /* renamed from: b, reason: collision with root package name */
    public final C1414yB f8024b;

    public /* synthetic */ Zh(C1414yB c1414yB, int i4) {
        this.f8023a = i4;
        this.f8024b = c1414yB;
    }

    @Override // com.google.android.gms.internal.ads.FB
    public final Object c() {
        switch (this.f8023a) {
            case 0:
                return new Ph((C1478zq) this.f8024b.c(), AbstractC0266Ec.f4900f);
            case 1:
                Set singleton = Collections.singleton(new Ph((C1296vg) this.f8024b.c(), AbstractC0266Ec.f4900f));
                AbstractC0587ez.n(singleton);
                return singleton;
            case 2:
                return new Ph((C0613fi) this.f8024b.c(), AbstractC0266Ec.f4899e);
            case 3:
                return new Ph((C0613fi) this.f8024b.c(), AbstractC0266Ec.f4899e);
            case 4:
                return new Ph((C0613fi) this.f8024b.c(), AbstractC0266Ec.f4899e);
            case 5:
                return new Ph((Gj) this.f8024b.c(), AbstractC0266Ec.f4900f);
            case 6:
                Set singleton2 = Collections.singleton(new Ph((C1296vg) this.f8024b.c(), AbstractC0266Ec.f4900f));
                AbstractC0587ez.n(singleton2);
                return singleton2;
            case 7:
                C0699hi c0699hi = (C0699hi) this.f8024b.c();
                C0260Dc c0260Dc = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc);
                return new Ph(c0699hi, c0260Dc);
            case 8:
                Set singleton3 = Collections.singleton(new Ph((C0656gi) this.f8024b.c(), AbstractC0266Ec.f4900f));
                AbstractC0587ez.n(singleton3);
                return singleton3;
            case 9:
                return new Ph((Kh) this.f8024b.c(), AbstractC0266Ec.f4900f);
            case 10:
                return new C0656gi((Ug) this.f8024b.c());
            case 11:
                Di di = (Di) this.f8024b.c();
                AbstractC0587ez.n(di);
                return di;
            case 12:
                C1041pi c1041pi = (C1041pi) this.f8024b.c();
                AbstractC0587ez.n(c1041pi);
                return c1041pi;
            case 13:
                return new Ph((Vi) this.f8024b.c(), AbstractC0266Ec.f4897a);
            case 14:
                Cn cn = (Cn) this.f8024b.c();
                C0260Dc c0260Dc2 = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc2);
                return new Ph(cn, c0260Dc2);
            case 15:
                Wi wi = (Wi) this.f8024b.c();
                AbstractC0587ez.n(wi);
                return wi;
            case 16:
                return new Ph((Kh) this.f8024b.c(), AbstractC0266Ec.f4900f);
            case 17:
                Yj yj = (Yj) this.f8024b.c();
                C0260Dc c0260Dc3 = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc3);
                return new Ph(yj, c0260Dc3);
            case 18:
                C0828kk c0828kk = (C0828kk) this.f8024b.c();
                C0260Dc c0260Dc4 = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc4);
                return new C0658gk(c0828kk, c0260Dc4);
            case 19:
                return new C0957nk((C1798a) this.f8024b.c());
            case 20:
                Hk hk = (Hk) this.f8024b.c();
                C0260Dc c0260Dc5 = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc5);
                return new Ph(hk, c0260Dc5);
            case 21:
                Ql ql = (Ql) this.f8024b.c();
                C0260Dc c0260Dc6 = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc6);
                return new Ph(ql, c0260Dc6);
            case 22:
                InterfaceFutureC0239a interfaceFutureC0239a = (InterfaceFutureC0239a) this.f8024b.c();
                C0260Dc c0260Dc7 = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc7);
                return new Qn(1, interfaceFutureC0239a, c0260Dc7);
            case 23:
                return new C1391xp((C1798a) this.f8024b.c());
            case 24:
                return new Ph((Rp) this.f8024b.c(), AbstractC0266Ec.f4900f);
            default:
                ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, (ThreadFactory) this.f8024b.c()));
                AbstractC0587ez.n(unconfigurableScheduledExecutorService);
                return unconfigurableScheduledExecutorService;
        }
    }
}
