package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.ti, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1212ti implements InterfaceC1457zB {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10715a;

    /* renamed from: b, reason: collision with root package name */
    public final Lf f10716b;

    public /* synthetic */ C1212ti(Lf lf, int i4) {
        this.f10715a = i4;
        this.f10716b = lf;
    }

    @Override // com.google.android.gms.internal.ads.FB
    public final Object c() {
        switch (this.f10715a) {
            case 0:
                return new BinderC1169si(this.f10716b.a());
            default:
                return new Fj(this.f10716b.a());
        }
    }
}
