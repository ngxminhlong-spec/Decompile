package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Hf implements InterfaceC1457zB {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5468a = 2;

    /* renamed from: b, reason: collision with root package name */
    public final C1414yB f5469b;
    public final FB c;
    public final FB d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC1457zB f5470e;

    /* renamed from: f, reason: collision with root package name */
    public final FB f5471f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC1457zB f5472g;

    /* renamed from: h, reason: collision with root package name */
    public final FB f5473h;

    /* renamed from: i, reason: collision with root package name */
    public final FB f5474i;

    /* renamed from: j, reason: collision with root package name */
    public final FB f5475j;

    /* renamed from: k, reason: collision with root package name */
    public final FB f5476k;

    public Hf(AB ab, Bg bg, C0917mn c0917mn, Eh eh, Lf lf, Vf vf, C0263Df c0263Df, C1414yB c1414yB, C1414yB c1414yB2, C1414yB c1414yB3) {
        this.c = ab;
        this.f5470e = bg;
        this.f5471f = c0917mn;
        this.f5472g = eh;
        this.f5473h = lf;
        this.f5474i = vf;
        this.d = c0263Df;
        this.f5469b = c1414yB;
        this.f5475j = c1414yB2;
        this.f5476k = c1414yB3;
    }

    public Hf(Xi xi, Xi xi2, Xi xi3, C1414yB c1414yB, C1414yB c1414yB2, C1414yB c1414yB3, C1414yB c1414yB4, C0654gg c0654gg, C1122re c1122re, Eg eg) {
        this.f5470e = xi;
        this.f5471f = xi2;
        this.f5472g = xi3;
        this.f5469b = c1414yB;
        this.f5473h = c1414yB2;
        this.f5474i = c1414yB3;
        this.c = c1414yB4;
        this.f5475j = c0654gg;
        this.d = c1122re;
        this.f5476k = eg;
    }

    public Hf(C1124rg c1124rg, C1414yB c1414yB, Kf kf, Kf kf2, Kf kf3, Kf kf4, C0869li c0869li, C1414yB c1414yB2, Eo eo, C1414yB c1414yB3) {
        this.f5470e = c1124rg;
        this.c = c1414yB;
        this.f5472g = kf;
        this.f5473h = kf2;
        this.f5474i = kf3;
        this.f5475j = kf4;
        this.d = c0869li;
        this.f5469b = c1414yB2;
        this.f5476k = eo;
        this.f5471f = c1414yB3;
    }

    public Gf a() {
        C1151s6 a4 = ((C1124rg) this.f5470e).a();
        Context context = (Context) this.c.c();
        C1477zp c1477zp = (C1477zp) ((Kf) this.f5472g).f6036b.f14985r;
        AbstractC0587ez.n(c1477zp);
        View view = (View) ((Kf) this.f5473h).f6036b.f14984q;
        AbstractC0587ez.n(view);
        InterfaceC0308Md interfaceC0308Md = (InterfaceC0308Md) ((Kf) this.f5474i).f6036b.f14986s;
        Xf xf = (Xf) ((Kf) this.f5475j).f6036b.f14983p;
        Gi gi = (Gi) ((C0869li) this.d).f9453a.f9211p;
        AbstractC0587ez.n(gi);
        return new Gf(a4, context, c1477zp, view, interfaceC0308Md, xf, gi, (Th) this.f5469b.c(), C1414yB.a((Eo) this.f5476k), (Executor) this.f5471f.c());
    }

    public Rm b() {
        return new Rm((C1423ye) this.c.c(), ((Bg) this.f5470e).f4149b.a(), ((C0917mn) this.f5471f).f9655b, ((Eh) this.f5472g).f4912b, (C0783ji) ((Lf) this.f5473h).f6149b, (C0825kh) ((Vf) this.f5474i).f7267a.f11914p, (ViewGroup) ((C0263Df) this.d).f4753a.f9467p, (C1297vh) this.f5469b.c(), (Um) ((C1414yB) this.f5475j).c(), (C0959nm) ((C1414yB) this.f5476k).c());
    }

    @Override // com.google.android.gms.internal.ads.FB
    public final Object c() {
        switch (this.f5468a) {
            case 0:
                return a();
            case 1:
                return new Wi((C1412y9) ((Xi) this.f5470e).f7685b.f6527r, (C1455z9) ((Xi) this.f5471f).f7685b.f6526q, (B9) ((Xi) this.f5472g).f7685b.f6525p, (Qg) this.f5469b.c(), (Gg) ((C1414yB) this.f5473h).c(), (Rh) ((C1414yB) this.f5474i).c(), (Context) this.c.c(), ((C0654gg) this.f5475j).a(), ((C1122re) this.d).a(), ((Eg) this.f5476k).a());
            default:
                return b();
        }
    }
}
