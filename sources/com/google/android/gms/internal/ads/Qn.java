package com.google.android.gms.internal.ads;

import android.content.Context;
import c3.InterfaceFutureC0239a;
import java.util.Set;
import java.util.concurrent.Executor;
import l2.C1798a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Qn implements Go {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6696a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6697b;
    public final Object c;

    public /* synthetic */ Qn(int i4, Object obj, Object obj2) {
        this.f6696a = i4;
        this.f6697b = obj;
        this.c = obj2;
    }

    public Qn(Su su, Context context, Set set) {
        this.f6696a = 4;
        this.f6697b = su;
        this.c = set;
    }

    @Override // com.google.android.gms.internal.ads.Go
    public final int b() {
        switch (this.f6696a) {
            case 0:
                return 4;
            case 1:
                return 6;
            case 2:
                return 10;
            case 3:
                return 23;
            case 4:
                return 27;
            case 5:
                return 31;
            case 6:
                return 41;
            default:
                return 48;
        }
    }

    @Override // com.google.android.gms.internal.ads.Go
    public final InterfaceFutureC0239a c() {
        switch (this.f6696a) {
            case 0:
                C1798a c1798a = (C1798a) this.f6697b;
                Jp jp = (Jp) this.c;
                c1798a.getClass();
                return Bs.h0(new Rn(jp, System.currentTimeMillis()));
            case 1:
                return Bs.n0((InterfaceFutureC0239a) this.f6697b, C0364Xe.f7668n, (Executor) this.c);
            case 2:
                if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f10250l2)).booleanValue()) {
                    return Pu.f6608p;
                }
                C1035pc c1035pc = (C1035pc) this.c;
                return Bs.m0(c1035pc.d(), C0932n1.f9701k, (Executor) this.f6697b);
            case 3:
                return ((C0260Dc) ((Su) this.f6697b)).b(new CallableC0336Sb(16, this));
            case 4:
                return ((C0260Dc) ((Su) this.f6697b)).b(new CallableC0336Sb(18, this));
            case 5:
                return Bs.h0(new C1304vo(0, (String) this.f6697b, (String) this.c));
            case 6:
                Pu h02 = Bs.h0((String) this.c);
                C0932n1 c0932n1 = C0932n1.f9705o;
                Executor executor = (Executor) this.f6697b;
                return Bs.c0(Bs.m0(h02, c0932n1, executor), Throwable.class, new C0512d8(23, this), executor);
            default:
                return ((C0260Dc) ((Su) this.f6697b)).b(new CallableC0336Sb(26, this));
        }
    }
}
