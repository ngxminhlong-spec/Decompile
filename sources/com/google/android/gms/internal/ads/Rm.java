package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;
import com.google.android.gms.internal.measurement.C1510e1;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Rm extends Pm {

    /* renamed from: a, reason: collision with root package name */
    public final C1423ye f6841a;

    /* renamed from: b, reason: collision with root package name */
    public final C1468zg f6842b;
    public final C0874ln c;
    public final Dh d;

    /* renamed from: e, reason: collision with root package name */
    public final C0783ji f6843e;

    /* renamed from: f, reason: collision with root package name */
    public final C0825kh f6844f;

    /* renamed from: g, reason: collision with root package name */
    public final ViewGroup f6845g;

    /* renamed from: h, reason: collision with root package name */
    public final C1297vh f6846h;

    /* renamed from: i, reason: collision with root package name */
    public final Um f6847i;

    /* renamed from: j, reason: collision with root package name */
    public final C0959nm f6848j;

    public Rm(C1423ye c1423ye, C1468zg c1468zg, C0874ln c0874ln, Dh dh, C0783ji c0783ji, C0825kh c0825kh, ViewGroup viewGroup, C1297vh c1297vh, Um um, C0959nm c0959nm) {
        this.f6841a = c1423ye;
        this.f6842b = c1468zg;
        this.c = c0874ln;
        this.d = dh;
        this.f6843e = c0783ji;
        this.f6844f = c0825kh;
        this.f6845g = viewGroup;
        this.f6846h = c1297vh;
        this.f6847i = um;
        this.f6848j = c0959nm;
    }

    @Override // com.google.android.gms.internal.ads.Pm
    public final C0834kq c(Jp jp, Bundle bundle, C1434yp c1434yp, Ep ep) {
        C1468zg c1468zg = this.f6842b;
        c1468zg.f11621b = jp;
        c1468zg.c = bundle;
        c1468zg.f11622e = new Op(ep, c1434yp, this.f6847i, 10, (byte) 0);
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.f10191Y2)).booleanValue()) {
            c1468zg.f11623f = this.f6848j;
        }
        C1423ye c1423ye = this.f6841a.f11395b;
        C1468zg c1468zg2 = new C1468zg(c1468zg);
        C1510e1 c1510e1 = new C1510e1((Object) this.f6844f, (Object) this.f6846h, 22, false);
        C0874ln c0874ln = new C0874ln(20, this.f6845g);
        Dh dh = this.d;
        AbstractC0587ez.p(dh, Dh.class);
        C0874ln c0874ln2 = this.c;
        AbstractC0587ez.p(c0874ln2, C0874ln.class);
        Xj xj = new Xj(7, false);
        C0783ji c0783ji = this.f6843e;
        AbstractC0587ez.p(c0783ji, C0783ji.class);
        C0781jg c0781jg = (C0781jg) new C0262De(c1423ye, c0874ln, c0783ji, dh, c1468zg2, xj, c0874ln2, c1510e1, null, null).f4659P0.c();
        return c0781jg.a(c0781jg.b());
    }
}
