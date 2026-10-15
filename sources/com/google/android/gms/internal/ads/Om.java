package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Om extends Pm {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6514a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final C1423ye f6515b;
    public final C1468zg c;
    public final Dh d;

    /* renamed from: e, reason: collision with root package name */
    public final Um f6516e;

    /* renamed from: f, reason: collision with root package name */
    public final C0959nm f6517f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f6518g;

    public Om(C1423ye c1423ye, C0783ji c0783ji, C1468zg c1468zg, Dh dh, Um um, C0959nm c0959nm) {
        this.f6515b = c1423ye;
        this.f6518g = c0783ji;
        this.c = c1468zg;
        this.d = dh;
        this.f6516e = um;
        this.f6517f = c0959nm;
    }

    public Om(C1423ye c1423ye, C1468zg c1468zg, Dh dh, Fp fp, Um um, C0959nm c0959nm) {
        this.f6515b = c1423ye;
        this.c = c1468zg;
        this.d = dh;
        this.f6518g = fp;
        this.f6516e = um;
        this.f6517f = c0959nm;
    }

    public Om(C1423ye c1423ye, C1468zg c1468zg, C0874ln c0874ln, Dh dh, Um um, C0959nm c0959nm) {
        this.f6515b = c1423ye;
        this.c = c1468zg;
        this.f6518g = c0874ln;
        this.d = dh;
        this.f6516e = um;
        this.f6517f = c0959nm;
    }

    @Override // com.google.android.gms.internal.ads.Pm
    public final C0834kq c(Jp jp, Bundle bundle, C1434yp c1434yp, Ep ep) {
        Fp fp;
        switch (this.f6514a) {
            case 0:
                C1468zg c1468zg = this.c;
                c1468zg.f11621b = jp;
                c1468zg.c = bundle;
                c1468zg.f11622e = new Op(ep, c1434yp, this.f6516e, 10, (byte) 0);
                if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f10191Y2)).booleanValue()) {
                    c1468zg.f11623f = this.f6517f;
                }
                C1423ye c1423ye = this.f6515b.f11395b;
                C1468zg c1468zg2 = new C1468zg(c1468zg);
                C0783ji c0783ji = (C0783ji) this.f6518g;
                C0874ln c0874ln = new C0874ln(20, null);
                Dh dh = this.d;
                AbstractC0587ez.p(dh, Dh.class);
                AbstractC0587ez.p(c0783ji, C0783ji.class);
                C0781jg c0781jg = (C0781jg) new C1251ue(c1423ye, c0874ln, c0783ji, dh, c1468zg2, new Xj(7, false), null, null).f10819O0.c();
                return c0781jg.a(c0781jg.b());
            case 1:
                C1468zg c1468zg3 = this.c;
                c1468zg3.f11621b = jp;
                c1468zg3.c = bundle;
                c1468zg3.f11622e = new Op(ep, c1434yp, this.f6516e, 10, (byte) 0);
                if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f10191Y2)).booleanValue()) {
                    c1468zg3.f11623f = this.f6517f;
                }
                C1423ye c1423ye2 = this.f6515b.f11395b;
                C1468zg c1468zg4 = new C1468zg(c1468zg3);
                C0874ln c0874ln2 = (C0874ln) this.f6518g;
                Dh dh2 = this.d;
                AbstractC0587ez.p(dh2, Dh.class);
                AbstractC0587ez.p(c0874ln2, C0874ln.class);
                C0781jg c0781jg2 = (C0781jg) new C0279Ge(c1423ye2, dh2, c1468zg4, new Xj(7, false), c0874ln2, null, null).f5208K0.c();
                return c0781jg2.a(c0781jg2.b());
            default:
                C1468zg c1468zg5 = this.c;
                c1468zg5.f11621b = jp;
                c1468zg5.c = bundle;
                c1468zg5.f11622e = new Op(ep, c1434yp, this.f6516e, 10, (byte) 0);
                C0937n6 c0937n6 = AbstractC1066q6.f10186X2;
                O1.r rVar = O1.r.d;
                if (((Boolean) rVar.c.a(c0937n6)).booleanValue() && (fp = (Fp) this.f6518g) != null) {
                    c1468zg5.d = fp;
                }
                if (((Boolean) rVar.c.a(AbstractC1066q6.f10191Y2)).booleanValue()) {
                    c1468zg5.f11623f = this.f6517f;
                }
                C1423ye c1423ye3 = this.f6515b.f11395b;
                C1468zg c1468zg6 = new C1468zg(c1468zg5);
                Dh dh3 = this.d;
                AbstractC0587ez.p(dh3, Dh.class);
                C0781jg c = new C0289Ie(c1423ye3, dh3, c1468zg6, new Xj(7, false), null, null).c();
                return c.a(c.b());
        }
    }
}
