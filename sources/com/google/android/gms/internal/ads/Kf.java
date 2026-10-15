package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Kf implements InterfaceC1457zB {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6035a;

    /* renamed from: b, reason: collision with root package name */
    public final u0.g f6036b;

    public /* synthetic */ Kf(u0.g gVar, int i4) {
        this.f6035a = i4;
        this.f6036b = gVar;
    }

    @Override // com.google.android.gms.internal.ads.FB
    public final Object c() {
        switch (this.f6035a) {
            case 0:
                View view = (View) this.f6036b.f14984q;
                AbstractC0587ez.n(view);
                return view;
            case 1:
                C1477zp c1477zp = (C1477zp) this.f6036b.f14985r;
                AbstractC0587ez.n(c1477zp);
                return c1477zp;
            case 2:
                return (Xf) this.f6036b.f14983p;
            default:
                return (InterfaceC0308Md) this.f6036b.f14986s;
        }
    }
}
