package com.google.android.gms.internal.ads;

import c3.InterfaceFutureC0239a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.fj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0614fj implements Du {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8723a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ O1.X0 f8724b;
    public final /* synthetic */ C1434yp c;
    public final /* synthetic */ Ap d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f8725e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f8726f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f8727g;

    public /* synthetic */ C0614fj(Object obj, O1.X0 x02, C1434yp c1434yp, Ap ap, String str, String str2, int i4) {
        this.f8723a = i4;
        this.f8727g = obj;
        this.f8724b = x02;
        this.c = c1434yp;
        this.d = ap;
        this.f8725e = str;
        this.f8726f = str2;
    }

    @Override // com.google.android.gms.internal.ads.Du
    public final InterfaceFutureC0239a l(Object obj) {
        switch (this.f8723a) {
            case 0:
                C0657gj c0657gj = (C0657gj) this.f8727g;
                C0348Ud a4 = c0657gj.f8849j.a(this.f8724b, this.c, this.d);
                C0594f5 c0594f5 = new C0594f5(a4);
                Cj cj = c0657gj.f8851l.f4914a;
                ViewTreeObserverOnGlobalLayoutListenerC0358Wd viewTreeObserverOnGlobalLayoutListenerC0358Wd = a4.f7165o;
                viewTreeObserverOnGlobalLayoutListenerC0358Wd.f7464A.l(cj, cj, cj, cj, cj, false, null, new N1.a(c0657gj.f8842a, null), null, null, c0657gj.f8855p, c0657gj.f8854o, c0657gj.f8852m, c0657gj.f8853n, null, cj, null, null, null);
                if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f10243j3)).booleanValue()) {
                    a4.A0("/getNativeAdViewSignals", AbstractC0554e8.f8572n);
                }
                a4.A0("/getNativeClickMeta", AbstractC0554e8.f8573o);
                viewTreeObserverOnGlobalLayoutListenerC0358Wd.f7464A.f8147u = new C0328Qd(c0594f5, 1);
                a4.J(this.f8725e, this.f8726f);
                return c0594f5;
            default:
                C0956nj c0956nj = (C0956nj) this.f8727g;
                C0348Ud a5 = c0956nj.c.a(this.f8724b, this.c, this.d);
                ViewTreeObserverOnGlobalLayoutListenerC0358Wd viewTreeObserverOnGlobalLayoutListenerC0358Wd2 = a5.f7165o;
                C0594f5 c0594f52 = new C0594f5(a5);
                if (c0956nj.f9765a.f5909b != null) {
                    c0956nj.a(a5);
                    a5.p0(new C0887m(5, 0, 0));
                } else {
                    Cj cj2 = c0956nj.d.f4914a;
                    viewTreeObserverOnGlobalLayoutListenerC0358Wd2.f7464A.l(cj2, cj2, cj2, cj2, cj2, false, null, new N1.a(c0956nj.f9767e, null), null, null, c0956nj.f9771i, c0956nj.f9770h, c0956nj.f9768f, c0956nj.f9769g, null, cj2, null, null, null);
                    C0956nj.b(a5);
                }
                viewTreeObserverOnGlobalLayoutListenerC0358Wd2.f7464A.f8147u = new Op((Object) c0956nj, (Object) a5, (Object) c0594f52, 15, (byte) 0);
                a5.J(this.f8725e, this.f8726f);
                return c0594f52;
        }
    }
}
