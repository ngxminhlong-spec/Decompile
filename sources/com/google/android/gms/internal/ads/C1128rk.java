package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.rk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1128rk implements InterfaceC1457zB {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10499a;

    /* renamed from: b, reason: collision with root package name */
    public final AB f10500b;

    public /* synthetic */ C1128rk(AB ab, int i4) {
        this.f10499a = i4;
        this.f10500b = ab;
    }

    @Override // com.google.android.gms.internal.ads.FB
    public final Object c() {
        switch (this.f10499a) {
            case 0:
                return new C1384xi(6, (C1025p8) this.f10500b.f3930a);
            case 1:
                return new C1384xi(14, (C0279Ge) this.f10500b.f3930a);
            default:
                return new Kn(2, (C0492cp) this.f10500b.f3930a);
        }
    }
}
