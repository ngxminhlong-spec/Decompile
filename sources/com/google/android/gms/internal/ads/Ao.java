package com.google.android.gms.internal.ads;

import c3.InterfaceFutureC0239a;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import o2.AbstractC1895f;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Ao implements Go {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3995a;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f3996b;
    public final Object c;
    public final Object d;

    public Ao(C1035pc c1035pc, ScheduledExecutorService scheduledExecutorService, Su su) {
        this.f3995a = 1;
        this.c = c1035pc;
        this.d = scheduledExecutorService;
        this.f3996b = su;
    }

    public /* synthetic */ Ao(Object obj, ExecutorService executorService, Object obj2, int i4) {
        this.f3995a = i4;
        this.c = obj;
        this.f3996b = executorService;
        this.d = obj2;
    }

    @Override // com.google.android.gms.internal.ads.Go
    public final int b() {
        switch (this.f3995a) {
            case 0:
                return 34;
            case 1:
                return 43;
            default:
                return 44;
        }
    }

    @Override // com.google.android.gms.internal.ads.Go
    public final InterfaceFutureC0239a c() {
        switch (this.f3995a) {
            case 0:
                return ((C0260Dc) ((Su) this.f3996b)).b(new CallableC0336Sb(20, this));
            case 1:
                Su su = (Su) this.f3996b;
                C0937n6 c0937n6 = AbstractC1066q6.f10255m2;
                O1.r rVar = O1.r.d;
                if (((Boolean) rVar.c.a(c0937n6)).booleanValue()) {
                    if (((Boolean) rVar.c.a(AbstractC1066q6.f10278r2)).booleanValue()) {
                        InterfaceFutureC0239a n02 = Bs.n0(Zf.h(AbstractC1895f.l(null)), C0364Xe.f7672r, su);
                        if (((Boolean) D6.f4586a.r()).booleanValue()) {
                            n02 = Bs.o0(n02, ((Long) D6.f4587b.r()).longValue(), TimeUnit.MILLISECONDS, (ScheduledExecutorService) this.d);
                        }
                        return Bs.Z(n02, Exception.class, new C0563eb(6, this), su);
                    }
                }
                return Bs.h0(new C0406ao(-1, 2, null));
            default:
                C0347Uc c0347Uc = new C0347Uc(9, (byte) 0);
                Executor executor = (Executor) this.d;
                return Bs.Z((Ku) Bs.o0(Bs.m0(Ku.q(Bs.k0(c0347Uc, executor)), C0932n1.f9706p, executor), ((Long) O1.r.d.c.a(AbstractC1066q6.f10124K0)).longValue(), TimeUnit.MILLISECONDS, (ScheduledExecutorService) this.f3996b), Exception.class, new C0563eb(7, this), Iu.f5747o);
        }
    }
}
