package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.ss, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1179ss extends AbstractRunnableC1008os {

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f10649p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f10650q;

    public /* synthetic */ C1179ss(int i4, Object obj) {
        this.f10649p = i4;
        this.f10650q = obj;
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC1008os
    public final void a() {
        switch (this.f10649p) {
            case 0:
                synchronized (((C1308vs) this.f10650q).f11082f) {
                    try {
                        if (((C1308vs) this.f10650q).f11087k.get() > 0 && ((C1308vs) this.f10650q).f11087k.decrementAndGet() > 0) {
                            ((C1308vs) this.f10650q).f11080b.g("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        C1308vs c1308vs = (C1308vs) this.f10650q;
                        if (c1308vs.f11089m != null) {
                            c1308vs.f11080b.g("Unbind from service.", new Object[0]);
                            C1308vs c1308vs2 = (C1308vs) this.f10650q;
                            c1308vs2.f11079a.unbindService(c1308vs2.f11088l);
                            C1308vs c1308vs3 = (C1308vs) this.f10650q;
                            c1308vs3.f11083g = false;
                            c1308vs3.f11089m = null;
                            c1308vs3.f11088l = null;
                        }
                        ((C1308vs) this.f10650q).c();
                        return;
                    } finally {
                    }
                }
            default:
                C1308vs c1308vs4 = ((ServiceConnectionC1265us) this.f10650q).f10951o;
                c1308vs4.f11080b.g("unlinkToDeath", new Object[0]);
                c1308vs4.f11089m.asBinder().unlinkToDeath(c1308vs4.f11086j, 0);
                c1308vs4.f11089m = null;
                c1308vs4.f11083g = false;
                return;
        }
    }
}
