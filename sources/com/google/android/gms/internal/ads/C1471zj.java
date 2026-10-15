package com.google.android.gms.internal.ads;

import c3.InterfaceFutureC0239a;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.zj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1471zj implements InterfaceC0597f8 {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f11642o = 0;

    /* renamed from: p, reason: collision with root package name */
    public final Object f11643p;

    /* renamed from: q, reason: collision with root package name */
    public final Object f11644q;

    /* renamed from: r, reason: collision with root package name */
    public final Object f11645r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f11646s;

    public /* synthetic */ C1471zj(Aj aj, WeakReference weakReference, String str, InterfaceC0597f8 interfaceC0597f8) {
        this.f11646s = aj;
        this.f11643p = weakReference;
        this.f11644q = str;
        this.f11645r = interfaceC0597f8;
    }

    public /* synthetic */ C1471zj(Sh sh, C0567ef c0567ef, Oq oq, Xl xl) {
        this.f11643p = sh;
        this.f11644q = c0567ef;
        this.f11645r = oq;
        this.f11646s = xl;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0597f8
    public final void h(Object obj, Map map) {
        switch (this.f11642o) {
            case 0:
                Object obj2 = ((WeakReference) this.f11643p).get();
                if (obj2 == null) {
                    ((Aj) this.f11646s).d((String) this.f11644q, this);
                    return;
                } else {
                    ((InterfaceC0597f8) this.f11645r).h(obj2, map);
                    return;
                }
            default:
                InterfaceC0308Md interfaceC0308Md = (InterfaceC0308Md) obj;
                AbstractC0554e8.b(map, (Sh) this.f11643p);
                String str = (String) map.get("u");
                if (str == null) {
                    Y9.s("URL missing from click GMSG.");
                    return;
                }
                Xl xl = (Xl) this.f11646s;
                Oq oq = (Oq) this.f11645r;
                C0567ef c0567ef = (C0567ef) this.f11644q;
                InterfaceFutureC0239a a4 = AbstractC0554e8.a(interfaceC0308Md, str);
                C0326Qb c0326Qb = new C0326Qb(interfaceC0308Md, c0567ef, oq, xl, false);
                a4.a(new Nu(0, a4, c0326Qb), AbstractC0266Ec.f4897a);
                return;
        }
    }
}
