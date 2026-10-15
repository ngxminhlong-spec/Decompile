package com.google.android.gms.internal.ads;

import c3.InterfaceFutureC0239a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.ej, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0571ej implements Du {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8631a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1267uu f8632b;

    public /* synthetic */ C0571ej(C1267uu c1267uu, int i4) {
        this.f8631a = i4;
        this.f8632b = c1267uu;
    }

    @Override // com.google.android.gms.internal.ads.Du
    public final InterfaceFutureC0239a l(Object obj) {
        InterfaceC0308Md interfaceC0308Md = (InterfaceC0308Md) obj;
        switch (this.f8631a) {
            case 0:
                if (interfaceC0308Md == null || interfaceC0308Md.p() == null) {
                    throw new Xk("Retrieve video view in html5 ad response failed.", 1);
                }
                return this.f8632b;
            default:
                if (interfaceC0308Md != null) {
                    return this.f8632b;
                }
                throw new Xk("Retrieve Web View from image ad response failed.", 1);
        }
    }
}
