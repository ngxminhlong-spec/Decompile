package com.google.android.gms.internal.ads;

import c3.InterfaceFutureC0239a;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Vi implements Sg {

    /* renamed from: o, reason: collision with root package name */
    public final Ci f7268o;

    /* renamed from: p, reason: collision with root package name */
    public final Di f7269p;

    /* renamed from: q, reason: collision with root package name */
    public final Executor f7270q;

    /* renamed from: r, reason: collision with root package name */
    public final Executor f7271r;

    public Vi(Ci ci, Di di, Executor executor, C0260Dc c0260Dc) {
        this.f7268o = ci;
        this.f7269p = di;
        this.f7270q = executor;
        this.f7271r = c0260Dc;
    }

    @Override // com.google.android.gms.internal.ads.Sg
    public final void p() {
        InterfaceFutureC0239a interfaceFutureC0239a;
        Ci ci = this.f7268o;
        if (this.f7269p.f4770e) {
            Pq S4 = ci.S();
            if (S4 == null) {
                synchronized (ci) {
                    interfaceFutureC0239a = ci.f4512m;
                }
                if (interfaceFutureC0239a != null && ((Boolean) O1.r.d.c.a(AbstractC1066q6.w4)).booleanValue()) {
                    InterfaceFutureC0239a U4 = ci.U();
                    C0272Fc N = ci.N();
                    if (U4 == null || N == null) {
                        return;
                    }
                    Eu eu = new Eu(AbstractC1137rt.s(new InterfaceFutureC0239a[]{U4, N}), false);
                    eu.a(new Nu(0, eu, new C1384xi(1, this)), this.f7271r);
                    return;
                }
            }
            if (S4 != null) {
                InterfaceC0308Md P4 = ci.P();
                InterfaceC0308Md Q3 = ci.Q();
                if (P4 == null) {
                    P4 = Q3 != null ? Q3 : null;
                }
                if (P4 != null) {
                    this.f7270q.execute(new RunnableC0343Td(P4, 2));
                }
            }
        }
    }
}
