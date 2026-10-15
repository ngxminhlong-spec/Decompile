package com.google.android.gms.internal.ads;

import c3.InterfaceFutureC0239a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.fp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0620fp implements InterfaceC0876lp {

    /* renamed from: o, reason: collision with root package name */
    public InterfaceC1425yg f8744o;

    @Override // com.google.android.gms.internal.ads.InterfaceC0876lp
    public final /* bridge */ /* synthetic */ InterfaceFutureC0239a a(Wl wl, InterfaceC0833kp interfaceC0833kp) {
        return b(wl, interfaceC0833kp, null);
    }

    public final synchronized InterfaceFutureC0239a b(Wl wl, InterfaceC0833kp interfaceC0833kp, InterfaceC1425yg interfaceC1425yg) {
        C0781jg c;
        try {
            if (interfaceC1425yg != null) {
                this.f8744o = interfaceC1425yg;
            } else {
                this.f8744o = (InterfaceC1425yg) interfaceC0833kp.u((InterfaceC0790jp) wl.f7564q).c();
            }
            c = this.f8744o.c();
        } catch (Throwable th) {
            throw th;
        }
        return c.a(c.b());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0876lp
    public final Object i() {
        InterfaceC1425yg interfaceC1425yg;
        synchronized (this) {
            interfaceC1425yg = this.f8744o;
        }
        return interfaceC1425yg;
    }
}
