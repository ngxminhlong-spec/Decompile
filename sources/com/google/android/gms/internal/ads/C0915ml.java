package com.google.android.gms.internal.ads;

import c3.InterfaceFutureC0239a;
import java.util.Map;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.ml, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0915ml implements InterfaceC0958nl {

    /* renamed from: a, reason: collision with root package name */
    public final Map f9651a;

    /* renamed from: b, reason: collision with root package name */
    public final Su f9652b;
    public final C0911mh c;

    public C0915ml(Map map, Su su, C0911mh c0911mh) {
        this.f9651a = map;
        this.f9652b = su;
        this.c = c0911mh;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0958nl
    public final InterfaceFutureC0239a a(C0370Za c0370Za) {
        this.c.N(c0370Za);
        InterfaceC0924mu f02 = Bs.f0(new Xk(3));
        for (String str : ((String) O1.r.d.c.a(AbstractC1066q6.h7)).split(",")) {
            FB fb = (FB) this.f9651a.get(str.trim());
            if (fb != null) {
                f02 = Bs.c0(f02, Xk.class, new N1.c(8, fb, c0370Za), this.f9652b);
            }
        }
        f02.a(new Nu(0, f02, new Xj(2, this)), AbstractC0266Ec.f4900f);
        return f02;
    }
}
