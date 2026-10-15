package com.google.android.gms.internal.ads;

import c3.InterfaceFutureC0239a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final /* synthetic */ class Ro implements Go {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ Ro f6851b = new Ro(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6852a;

    public /* synthetic */ Ro(int i4) {
        this.f6852a = i4;
    }

    @Override // com.google.android.gms.internal.ads.Go
    public final int b() {
        switch (this.f6852a) {
            case 0:
                return 0;
            case 1:
                return 52;
            default:
                return 47;
        }
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.android.gms.internal.ads.Hu, com.google.android.gms.internal.ads.yu, c3.a] */
    @Override // com.google.android.gms.internal.ads.Go
    public final InterfaceFutureC0239a c() {
        switch (this.f6852a) {
            case 0:
                return Bs.h0(C1090qo.f10406f);
            case 1:
                return Bs.h0(new C1090qo(5));
            default:
                Pu pu = Pu.f6608p;
                ((Boolean) O1.r.d.c.a(AbstractC1066q6.Z4)).getClass();
                Gt s4 = AbstractC1137rt.s(new InterfaceFutureC0239a[]{pu, pu});
                CallableC0336Sb callableC0336Sb = new CallableC0336Sb(pu);
                C0260Dc c0260Dc = AbstractC0266Ec.f4897a;
                ?? abstractC1439yu = new AbstractC1439yu(s4, true, false);
                abstractC1439yu.f5517D = new Gu(abstractC1439yu, callableC0336Sb, c0260Dc);
                abstractC1439yu.v();
                return abstractC1439yu;
        }
    }
}
