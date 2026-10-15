package com.google.android.gms.internal.ads;

import c3.InterfaceFutureC0239a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.k9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0811k9 implements Du {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9277a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceFutureC0239a f9278b;

    public /* synthetic */ C0811k9(InterfaceFutureC0239a interfaceFutureC0239a, int i4) {
        this.f9277a = i4;
        this.f9278b = interfaceFutureC0239a;
    }

    @Override // com.google.android.gms.internal.ads.Du
    public final InterfaceFutureC0239a l(Object obj) {
        switch (this.f9277a) {
            case 0:
                return Bs.n0(this.f9278b, new C0512d8(this, obj), AbstractC0266Ec.f4900f);
            default:
                return this.f9278b;
        }
    }
}
