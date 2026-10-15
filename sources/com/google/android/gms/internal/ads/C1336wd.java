package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.wd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1336wd extends AbstractC1250ud {
    @Override // com.google.android.gms.internal.ads.AbstractC1250ud
    public final void l() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1250ud
    public final boolean r(String str) {
        String n4 = C1335wc.n(str, "MD5");
        InterfaceC0308Md interfaceC0308Md = (InterfaceC0308Md) this.f10792q.get();
        if (interfaceC0308Md != null && n4 != null) {
            interfaceC0308Md.c0(n4, this);
        }
        Y9.s("VideoStreamNoopCache is doing nothing.");
        m(str, n4, "noop", "Noop cache is a noop.");
        return false;
    }
}
