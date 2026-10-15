package com.google.android.gms.internal.ads;

import c3.InterfaceFutureC0239a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.jm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0787jm implements InterfaceC0745im {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0745im f9217a;

    /* renamed from: b, reason: collision with root package name */
    public final As f9218b;

    public C0787jm(InterfaceC0745im interfaceC0745im, As as) {
        this.f9217a = interfaceC0745im;
        this.f9218b = as;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0745im
    public final InterfaceFutureC0239a a(Ep ep, C1434yp c1434yp) {
        return Bs.m0(this.f9217a.a(ep, c1434yp), this.f9218b, AbstractC0266Ec.f4897a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0745im
    public final boolean b(Ep ep, C1434yp c1434yp) {
        return this.f9217a.b(ep, c1434yp);
    }
}
