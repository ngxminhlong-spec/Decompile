package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Pf implements InterfaceC1457zB {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6589a;

    /* renamed from: b, reason: collision with root package name */
    public final C0783ji f6590b;

    public /* synthetic */ Pf(C0783ji c0783ji, int i4) {
        this.f6589a = i4;
        this.f6590b = c0783ji;
    }

    @Override // com.google.android.gms.internal.ads.FB
    public final Object c() {
        switch (this.f6589a) {
            case 0:
                return (RunnableC0801k) this.f6590b.f9212q;
            default:
                P7 p7 = (P7) this.f6590b.f9211p;
                AbstractC0587ez.n(p7);
                return p7;
        }
    }
}
