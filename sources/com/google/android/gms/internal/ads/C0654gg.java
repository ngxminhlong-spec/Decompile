package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.gg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0654gg implements InterfaceC1457zB {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8839a;

    /* renamed from: b, reason: collision with root package name */
    public final Op f8840b;

    public /* synthetic */ C0654gg(Op op, int i4) {
        this.f8839a = i4;
        this.f8840b = op;
    }

    public C1434yp a() {
        C1434yp c1434yp = (C1434yp) this.f8840b.f6526q;
        AbstractC0587ez.n(c1434yp);
        return c1434yp;
    }

    @Override // com.google.android.gms.internal.ads.FB
    public final Object c() {
        switch (this.f8839a) {
            case 0:
                C1434yp c1434yp = (C1434yp) this.f8840b.f6526q;
                AbstractC0587ez.n(c1434yp);
                return c1434yp;
            case 1:
                return (String) this.f8840b.f6527r;
            case 2:
                return this.f8840b.p();
            default:
                Ep ep = (Ep) this.f8840b.f6525p;
                AbstractC0587ez.n(ep);
                return ep;
        }
    }
}
