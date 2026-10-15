package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.vh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1297vh implements InterfaceC0954nh {

    /* renamed from: o, reason: collision with root package name */
    public int f11046o;

    @Override // com.google.android.gms.internal.ads.InterfaceC0954nh
    public final synchronized void K0(Ep ep) {
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f10180W0)).booleanValue()) {
            try {
                this.f11046o = ((Ap) ep.f4943b.f6526q).c;
            } catch (NullPointerException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0954nh
    public final void N(C0370Za c0370Za) {
    }

    public final synchronized int a() {
        return this.f11046o;
    }
}
