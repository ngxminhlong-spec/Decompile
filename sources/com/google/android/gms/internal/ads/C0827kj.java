package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import java.util.HashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.kj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0827kj implements InterfaceC1450z4 {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f9306o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0308Md f9307p;

    public /* synthetic */ C0827kj(InterfaceC0308Md interfaceC0308Md, int i4) {
        this.f9306o = i4;
        this.f9307p = interfaceC0308Md;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1450z4
    public final void j0(C1407y4 c1407y4) {
        switch (this.f9306o) {
            case 0:
                C0396ae H3 = this.f9307p.H();
                Rect rect = c1407y4.d;
                H3.a0(rect.left, rect.top);
                return;
            case 1:
                HashMap hashMap = new HashMap();
                hashMap.put("isVisible", true != c1407y4.f11338j ? "0" : "1");
                this.f9307p.b("onAdVisibilityChanged", hashMap);
                return;
            default:
                C0396ae c0396ae = ((C0348Ud) this.f9307p).f7165o.f7464A;
                Rect rect2 = c1407y4.d;
                c0396ae.a0(rect2.left, rect2.top);
                return;
        }
    }
}
