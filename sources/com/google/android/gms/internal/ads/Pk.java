package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Pk implements InterfaceC1457zB {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6596a;

    /* renamed from: b, reason: collision with root package name */
    public final C0865le f6597b;
    public final C1122re c;

    public /* synthetic */ Pk(C0865le c0865le, C1122re c1122re, int i4) {
        this.f6596a = i4;
        this.f6597b = c0865le;
        this.c = c1122re;
    }

    public Op a() {
        return new Op(this.f6597b.a(), this.c.a());
    }

    @Override // com.google.android.gms.internal.ads.FB
    public final /* bridge */ /* synthetic */ Object c() {
        switch (this.f6596a) {
            case 0:
                return new Qk(this.f6597b.a(), this.c.a());
            default:
                return a();
        }
    }
}
