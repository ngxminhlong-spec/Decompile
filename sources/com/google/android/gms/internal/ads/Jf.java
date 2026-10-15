package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final /* synthetic */ class Jf implements InterfaceC1125rh {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f5871o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f5872p;

    public /* synthetic */ Jf(int i4, Object obj) {
        this.f5871o = i4;
        this.f5872p = obj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1125rh
    public final void b() {
        P1.a v02;
        switch (this.f5871o) {
            case 0:
                C0825kh c0825kh = (C0825kh) this.f5872p;
                synchronized (c0825kh) {
                    c0825kh.f9303u = false;
                    c0825kh.s1(0L);
                }
                return;
            default:
                InterfaceC0308Md interfaceC0308Md = (InterfaceC0308Md) this.f5872p;
                if (interfaceC0308Md == null || (v02 = interfaceC0308Md.v0()) == null) {
                    return;
                }
                v02.c();
                return;
        }
    }
}
