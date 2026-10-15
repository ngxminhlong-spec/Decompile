package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import n2.InterfaceC1812a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Em extends AbstractBinderC0862lb implements Wg {

    /* renamed from: o, reason: collision with root package name */
    public BinderC0575en f4927o;

    /* renamed from: p, reason: collision with root package name */
    public A2.o f4928p;

    /* renamed from: q, reason: collision with root package name */
    public C0326Qb f4929q;

    @Override // com.google.android.gms.internal.ads.InterfaceC0905mb
    public final synchronized void C3(InterfaceC1812a interfaceC1812a) {
        A2.o oVar = this.f4928p;
        if (oVar != null) {
            oVar.l();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0905mb
    public final synchronized void K2(InterfaceC1812a interfaceC1812a) {
        BinderC0575en binderC0575en = this.f4927o;
        if (binderC0575en != null) {
            binderC0575en.K2(interfaceC1812a);
        }
    }

    @Override // com.google.android.gms.internal.ads.Wg
    public final synchronized void Q(A2.o oVar) {
        this.f4928p = oVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0905mb
    public final synchronized void S2(InterfaceC1812a interfaceC1812a, C0948nb c0948nb) {
        BinderC0575en binderC0575en = this.f4927o;
        if (binderC0575en != null) {
            binderC0575en.f8644r.L0(c0948nb);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0905mb
    public final synchronized void Y2(InterfaceC1812a interfaceC1812a) {
        BinderC0575en binderC0575en = this.f4927o;
        if (binderC0575en != null) {
            binderC0575en.f8641o.a0();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0905mb
    public final synchronized void d1(InterfaceC1812a interfaceC1812a) {
        C0326Qb c0326Qb = this.f4929q;
        if (c0326Qb != null) {
            Executor executor = ((C0405an) c0326Qb.f6662r).c;
            C0873lm c0873lm = (C0873lm) c0326Qb.f6661q;
            executor.execute(new J1.a(c0326Qb, (Ep) c0326Qb.f6659o, (C1434yp) c0326Qb.f6660p, c0873lm, 9));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0905mb
    public final synchronized void e0(InterfaceC1812a interfaceC1812a, int i4) {
        A2.o oVar = this.f4928p;
        if (oVar != null) {
            oVar.d(i4);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0905mb
    public final synchronized void f2(InterfaceC1812a interfaceC1812a) {
        BinderC0575en binderC0575en = this.f4927o;
        if (binderC0575en != null) {
            binderC0575en.f8644r.e();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0905mb
    public final synchronized void k3(InterfaceC1812a interfaceC1812a) {
        BinderC0575en binderC0575en = this.f4927o;
        if (binderC0575en != null) {
            binderC0575en.f8643q.n1(BF.f4063L);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0905mb
    public final synchronized void l2() {
        BinderC0575en binderC0575en = this.f4927o;
        if (binderC0575en != null) {
            binderC0575en.f8643q.c();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0905mb
    public final synchronized void x2() {
        C0326Qb c0326Qb = this.f4929q;
        if (c0326Qb != null) {
            Y9.s("Fail to initialize adapter ".concat(String.valueOf(((C0873lm) c0326Qb.f6661q).f9462a)));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0905mb
    public final synchronized void zze(InterfaceC1812a interfaceC1812a) {
        BinderC0575en binderC0575en = this.f4927o;
        if (binderC0575en != null) {
            binderC0575en.f8642p.D();
        }
    }
}
