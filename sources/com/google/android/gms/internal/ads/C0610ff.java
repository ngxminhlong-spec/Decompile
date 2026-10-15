package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.ff, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0610ff implements InterfaceC1457zB {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8710a;

    /* renamed from: b, reason: collision with root package name */
    public final FB f8711b;
    public final FB c;
    public final FB d;

    /* renamed from: e, reason: collision with root package name */
    public final FB f8712e;

    /* renamed from: f, reason: collision with root package name */
    public final FB f8713f;

    /* renamed from: g, reason: collision with root package name */
    public final FB f8714g;

    public C0610ff(AB ab, Bg bg, Eh eh, Bg bg2, C1414yB c1414yB, C1414yB c1414yB2) {
        this.f8710a = 7;
        this.f8711b = ab;
        this.f8712e = bg;
        this.f8713f = eh;
        this.f8714g = bg2;
        this.c = c1414yB;
        this.d = c1414yB2;
    }

    public C0610ff(AB ab, C1414yB c1414yB, AB ab2, C1388xm c1388xm, C1414yB c1414yB2, C1122re c1122re) {
        this.f8710a = 8;
        this.f8712e = ab;
        this.f8711b = c1414yB;
        this.c = ab2;
        this.f8714g = c1388xm;
        this.f8713f = c1414yB2;
        this.d = c1122re;
    }

    public C0610ff(AB ab, C1414yB c1414yB, AB ab2, C1388xm c1388xm, C1414yB c1414yB2, C1414yB c1414yB3) {
        this.f8710a = 9;
        this.d = ab;
        this.f8711b = c1414yB;
        this.c = ab2;
        this.f8712e = c1388xm;
        this.f8713f = c1414yB2;
        this.f8714g = c1414yB3;
    }

    public C0610ff(AB ab, C1414yB c1414yB, C1414yB c1414yB2, C1414yB c1414yB3, Eg eg, C1414yB c1414yB4) {
        this.f8710a = 5;
        this.f8712e = ab;
        this.f8711b = c1414yB;
        this.c = c1414yB2;
        this.f8713f = c1414yB3;
        this.d = eg;
        this.f8714g = c1414yB4;
    }

    public C0610ff(C0865le c0865le, Eg eg, C0371Zb c0371Zb, C1414yB c1414yB, C1414yB c1414yB2, C1414yB c1414yB3) {
        this.f8710a = 4;
        this.f8711b = c0865le;
        this.c = eg;
        this.f8713f = c0371Zb;
        this.d = c1414yB;
        this.f8712e = c1414yB2;
        this.f8714g = c1414yB3;
    }

    public C0610ff(C0865le c0865le, C0822ke c0822ke, C1414yB c1414yB, C1414yB c1414yB2, C1414yB c1414yB3, C1414yB c1414yB4) {
        this.f8710a = 0;
        this.f8711b = c0865le;
        this.c = c0822ke;
        this.f8713f = c1414yB;
        this.f8714g = c1414yB2;
        this.d = c1414yB3;
        this.f8712e = c1414yB4;
    }

    public C0610ff(C0865le c0865le, C1414yB c1414yB, C1414yB c1414yB2, C0654gg c0654gg, C0654gg c0654gg2, C1414yB c1414yB3) {
        this.f8710a = 3;
        this.f8711b = c0865le;
        this.c = c1414yB;
        this.d = c1414yB2;
        this.f8713f = c0654gg;
        this.f8714g = c0654gg2;
        this.f8712e = c1414yB3;
    }

    public C0610ff(C1414yB c1414yB, C1414yB c1414yB2, C0654gg c0654gg, C0654gg c0654gg2, C1414yB c1414yB3, C1414yB c1414yB4) {
        this.f8710a = 10;
        this.f8711b = c1414yB;
        this.c = c1414yB2;
        this.f8712e = c0654gg;
        this.f8714g = c0654gg2;
        this.f8713f = c1414yB3;
        this.d = c1414yB4;
    }

    public C0610ff(C1414yB c1414yB, C1414yB c1414yB2, C1414yB c1414yB3, C1414yB c1414yB4, C1414yB c1414yB5, C1414yB c1414yB6) {
        this.f8710a = 2;
        this.f8713f = c1414yB;
        this.f8714g = c1414yB2;
        this.f8711b = c1414yB3;
        this.d = c1414yB4;
        this.c = c1414yB5;
        this.f8712e = c1414yB6;
    }

    public /* synthetic */ C0610ff(InterfaceC1457zB interfaceC1457zB, InterfaceC1457zB interfaceC1457zB2, InterfaceC1457zB interfaceC1457zB3, InterfaceC1457zB interfaceC1457zB4, C1414yB c1414yB, C1414yB c1414yB2, int i4) {
        this.f8710a = i4;
        this.f8711b = interfaceC1457zB;
        this.c = interfaceC1457zB2;
        this.d = interfaceC1457zB3;
        this.f8712e = interfaceC1457zB4;
        this.f8713f = c1414yB;
        this.f8714g = c1414yB2;
    }

    public C1345wm a() {
        return new C1345wm((C0262De) ((AB) this.f8712e).f3930a, (Context) this.f8711b.c(), (Executor) this.c.c(), (Oj) ((C1414yB) this.f8713f).c(), ((Eg) this.d).a(), (As) ((C1414yB) this.f8714g).c());
    }

    @Override // com.google.android.gms.internal.ads.FB
    public final Object c() {
        switch (this.f8710a) {
            case 0:
                Context a4 = ((C0865le) this.f8711b).a();
                Q1.K c = ((C0822ke) this.c).c();
                C0660gm c0660gm = (C0660gm) ((C1414yB) this.f8713f).c();
                Qj qj = (Qj) ((C1414yB) this.f8714g).c();
                C0260Dc c0260Dc = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc);
                return new C0567ef(a4, c, c0660gm, qj, c0260Dc, (Su) this.d.c(), (ScheduledExecutorService) this.f8712e.c());
            case 1:
                return new C1167sg(((C0865le) this.f8711b).a(), ((Eg) this.c).a(), ((C1122re) this.d).a(), ((C0822ke) this.f8712e).c(), (Ck) this.f8713f.c(), (Fq) this.f8714g.c());
            case 2:
                return new Dj((Gg) ((C1414yB) this.f8713f).c(), (Vg) ((C1414yB) this.f8714g).c(), (C0527dh) this.f8711b.c(), (C0655gh) ((C1414yB) this.d).c(), (C1254uh) this.c.c(), (Rh) ((C1414yB) this.f8712e).c());
            case 3:
                Context a5 = ((C0865le) this.f8711b).a();
                Np np = (Np) this.c.c();
                C0658gk c0658gk = (C0658gk) this.d.c();
                Ep ep = (Ep) ((C0654gg) this.f8713f).f8840b.f6525p;
                AbstractC0587ez.n(ep);
                return new C0487ck(a5, np, c0658gk, ep, ((C0654gg) this.f8714g).a(), (Xl) this.f8712e.c());
            case 4:
                Context a6 = ((C0865le) this.f8711b).a();
                Jp a7 = ((Eg) this.c).a();
                C0371Zb c0371Zb = (C0371Zb) this.f8713f;
                C0260Dc c0260Dc2 = AbstractC0266Ec.f4898b;
                AbstractC0587ez.n(c0260Dc2);
                C0260Dc c0260Dc3 = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc3);
                Context context = (Context) ((C1000ok) c0371Zb.f8001b).f9851b.c();
                C0573el c0573el = new C0573el(0);
                c0573el.f8984t = new C0466c5(context, N1.n.f1204A.f1220r.b(), (AbstractC0702hl) c0573el, (AbstractC0702hl) c0573el);
                u0.g gVar = new u0.g(c0260Dc2, c0260Dc3, c0573el, C1414yB.a((C1252uf) c0371Zb.c), 10);
                AbstractC0587ez.n(c0260Dc3);
                return new C0488cl(a6, a7, gVar, c0260Dc3, (ScheduledExecutorService) this.d.c(), (Rl) this.f8712e.c(), (Eq) this.f8714g.c());
            case 5:
                return a();
            case 6:
                return new Om((C1423ye) this.f8711b.c(), ((Bg) this.c).f4149b.a(), ((C0917mn) this.d).f9655b, ((Eh) this.f8712e).f4912b, (Um) ((C1414yB) this.f8713f).c(), (C0959nm) ((C1414yB) this.f8714g).c());
            case 7:
                return new Om((C1423ye) this.f8711b.c(), ((Bg) this.f8712e).f4149b.a(), ((Eh) this.f8713f).f4912b, ((Bg) this.f8714g).f4149b.d, (Um) this.c.c(), (C0959nm) this.d.c());
            case 8:
                return new Uo((Context) ((AB) this.f8712e).f3930a, (Executor) this.f8711b.c(), (C1423ye) this.c.c(), ((C1388xm) this.f8714g).a(), (To) ((C1414yB) this.f8713f).c(), new Ip(), ((C1122re) this.d).a());
            case 9:
                return new C1219tp((Context) ((AB) this.d).f3930a, (Executor) this.f8711b.c(), (C1423ye) this.c.c(), ((C1388xm) this.f8712e).a(), (C1133rp) ((C1414yB) this.f8713f).c(), new Ip(), (Fp) ((C1414yB) this.f8714g).c());
            default:
                return new Lp((Xl) this.f8711b.c(), (Oq) this.c.c(), ((C0654gg) this.f8712e).a(), ((C0654gg) this.f8714g).f8840b.p(), (C0567ef) ((C1414yB) this.f8713f).c(), (Eq) this.d.c());
        }
    }
}
