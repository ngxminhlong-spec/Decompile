package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Qe, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0329Qe implements InterfaceC1457zB {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6667a;

    /* renamed from: b, reason: collision with root package name */
    public final C0865le f6668b;

    public /* synthetic */ C0329Qe(C0865le c0865le, int i4) {
        this.f6667a = i4;
        this.f6668b = c0865le;
    }

    @Override // com.google.android.gms.internal.ads.FB
    public final Object c() {
        switch (this.f6667a) {
            case 0:
                return new C1221tr(this.f6668b.a(), N1.n.f1204A.f1220r.b());
            case 1:
                return Op.u(this.f6668b.a());
            case 2:
                return new Ek(this.f6668b.a());
            case 3:
                return new Wk(this.f6668b.a());
            case 4:
                Context a4 = this.f6668b.a();
                C0260Dc c0260Dc = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc);
                return new Xl(a4, c0260Dc);
            case 5:
                C0260Dc c0260Dc2 = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc2);
                return new C0662go(c0260Dc2, this.f6668b.a(), 1);
            case 6:
                C0260Dc c0260Dc3 = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc3);
                return new C0662go(c0260Dc3, this.f6668b.a(), 4);
            default:
                return new Po(this.f6668b.a());
        }
    }
}
