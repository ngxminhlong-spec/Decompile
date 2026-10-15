package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.ai, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0400ai implements InterfaceC1457zB {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8153a;

    /* renamed from: b, reason: collision with root package name */
    public final C0783ji f8154b;

    public /* synthetic */ C0400ai(C0783ji c0783ji, int i4) {
        this.f8153a = i4;
        this.f8154b = c0783ji;
    }

    @Override // com.google.android.gms.internal.ads.FB
    public final Object c() {
        switch (this.f8153a) {
            case 0:
                InterfaceC0308Md interfaceC0308Md = (InterfaceC0308Md) this.f8154b.f9212q;
                if (interfaceC0308Md == null) {
                    return null;
                }
                return interfaceC0308Md.m0();
            case 1:
                InterfaceC0308Md interfaceC0308Md2 = (InterfaceC0308Md) this.f8154b.f9212q;
                if (interfaceC0308Md2 != null) {
                    return interfaceC0308Md2.m0();
                }
                return null;
            default:
                return (InterfaceC0308Md) this.f8154b.f9212q;
        }
    }
}
