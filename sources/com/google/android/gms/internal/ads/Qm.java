package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Qm extends Pm {

    /* renamed from: a, reason: collision with root package name */
    public final C1423ye f6693a;

    /* renamed from: b, reason: collision with root package name */
    public final C1468zg f6694b;
    public final Dh c;
    public final Um d;

    /* renamed from: e, reason: collision with root package name */
    public final C0959nm f6695e;

    public Qm(C1423ye c1423ye, C1468zg c1468zg, Dh dh, Um um, C0959nm c0959nm) {
        this.f6693a = c1423ye;
        this.f6694b = c1468zg;
        this.c = dh;
        this.d = um;
        this.f6695e = c0959nm;
    }

    @Override // com.google.android.gms.internal.ads.Pm
    public final C0834kq c(Jp jp, Bundle bundle, C1434yp c1434yp, Ep ep) {
        C1468zg c1468zg = this.f6694b;
        c1468zg.f11621b = jp;
        c1468zg.c = bundle;
        c1468zg.f11622e = new Op(ep, c1434yp, this.d, 10, (byte) 0);
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f10191Y2)).booleanValue()) {
            c1468zg.f11623f = this.f6695e;
        }
        C1423ye c1423ye = this.f6693a.f11395b;
        C1468zg c1468zg2 = new C1468zg(c1468zg);
        Dh dh = this.c;
        AbstractC0587ez.p(dh, Dh.class);
        C0781jg c = new C0250Be(c1423ye, dh, c1468zg2, new Xj(7, false), null, null).c();
        return c.a(c.b());
    }
}
