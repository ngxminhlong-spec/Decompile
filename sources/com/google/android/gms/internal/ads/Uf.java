package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.measurement.C1510e1;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Uf implements InterfaceC1457zB {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7168a;

    /* renamed from: b, reason: collision with root package name */
    public final C1510e1 f7169b;

    public /* synthetic */ Uf(C1510e1 c1510e1, int i4) {
        this.f7168a = i4;
        this.f7169b = c1510e1;
    }

    @Override // com.google.android.gms.internal.ads.FB
    public final Object c() {
        switch (this.f7168a) {
            case 0:
                C1297vh c1297vh = (C1297vh) this.f7169b.f11915q;
                return c1297vh != null ? new Ph(c1297vh, AbstractC0266Ec.f4900f) : new Ph(new Object(), AbstractC0266Ec.f4900f);
            default:
                return (C1297vh) this.f7169b.f11915q;
        }
    }
}
