package com.google.android.gms.internal.ads;

import O1.InterfaceC0096x;
import android.content.Context;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import l2.C1798a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.uf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1252uf implements InterfaceC1457zB {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10913a;

    /* renamed from: b, reason: collision with root package name */
    public final FB f10914b;
    public final FB c;
    public final FB d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f10915e;

    /* renamed from: f, reason: collision with root package name */
    public final FB f10916f;

    public /* synthetic */ C1252uf(int i4, C1414yB c1414yB, InterfaceC1457zB interfaceC1457zB, InterfaceC1457zB interfaceC1457zB2, FB fb, FB fb2) {
        this.f10913a = i4;
        this.f10914b = fb;
        this.d = interfaceC1457zB;
        this.c = c1414yB;
        this.f10915e = fb2;
        this.f10916f = interfaceC1457zB2;
    }

    public C1252uf(AB ab, Bg bg, Eh eh, C1414yB c1414yB, C1414yB c1414yB2) {
        this.f10913a = 11;
        this.f10914b = ab;
        this.f10916f = bg;
        this.c = eh;
        this.d = c1414yB;
        this.f10915e = c1414yB2;
    }

    public C1252uf(AB ab, C1414yB c1414yB, AB ab2, C1414yB c1414yB2, C1414yB c1414yB3) {
        this.f10913a = 17;
        this.f10916f = ab;
        this.f10914b = c1414yB;
        this.c = ab2;
        this.d = c1414yB2;
        this.f10915e = c1414yB3;
    }

    public C1252uf(BB bb, BB bb2, BB bb3, C1414yB c1414yB, C0869li c0869li) {
        this.f10913a = 4;
        this.f10915e = bb;
        this.f10916f = bb2;
        this.c = bb3;
        this.d = c1414yB;
        this.f10914b = c0869li;
    }

    public /* synthetic */ C1252uf(FB fb, FB fb2, C1414yB c1414yB, FB fb3, C1414yB c1414yB2, int i4) {
        this.f10913a = i4;
        this.d = fb;
        this.f10915e = fb2;
        this.f10914b = c1414yB;
        this.f10916f = fb3;
        this.c = c1414yB2;
    }

    public /* synthetic */ C1252uf(FB fb, FB fb2, InterfaceC1457zB interfaceC1457zB, FB fb3, FB fb4, int i4) {
        this.f10913a = i4;
        this.f10914b = fb;
        this.c = fb2;
        this.d = interfaceC1457zB;
        this.f10915e = fb3;
        this.f10916f = fb4;
    }

    public C1252uf(Nf nf, C0865le c0865le, C1414yB c1414yB, C0400ai c0400ai, InterfaceC1457zB interfaceC1457zB) {
        this.f10913a = 3;
        this.d = nf;
        this.f10914b = c0865le;
        this.c = c1414yB;
        this.f10915e = c0400ai;
        this.f10916f = interfaceC1457zB;
    }

    public C1252uf(Xj xj, C1414yB c1414yB, Wm wm, C1414yB c1414yB2, C1414yB c1414yB3) {
        this.f10913a = 12;
        this.f10915e = xj;
        this.f10914b = c1414yB;
        this.c = wm;
        this.d = c1414yB2;
        this.f10916f = c1414yB3;
    }

    public C1252uf(C0865le c0865le, C0400ai c0400ai, C0654gg c0654gg, C1122re c1122re, InterfaceC1457zB interfaceC1457zB) {
        this.f10913a = 2;
        this.f10914b = c0865le;
        this.d = c0400ai;
        this.f10915e = c0654gg;
        this.c = c1122re;
        this.f10916f = interfaceC1457zB;
    }

    public C1252uf(C0865le c0865le, C0446bl c0446bl, C1122re c1122re, FB fb, C1414yB c1414yB) {
        this.f10913a = 5;
        this.f10914b = c0865le;
        this.c = c0446bl;
        this.f10915e = c1122re;
        this.f10916f = fb;
        this.d = c1414yB;
    }

    public C1252uf(C0865le c0865le, C1414yB c1414yB, FB fb, C1414yB c1414yB2, C1414yB c1414yB3) {
        this.f10913a = 10;
        this.c = c0865le;
        this.d = c1414yB;
        this.f10914b = fb;
        this.f10915e = c1414yB2;
        this.f10916f = c1414yB3;
    }

    public C1252uf(C1000ok c1000ok, C1252uf c1252uf, C1414yB c1414yB, C0865le c0865le, C1122re c1122re) {
        this.f10913a = 7;
        this.d = c1000ok;
        this.f10915e = c1252uf;
        this.f10914b = c1414yB;
        this.c = c0865le;
        this.f10916f = c1122re;
    }

    public C1252uf(C1414yB c1414yB, Qo qo, Qo qo2, Qo qo3, C1414yB c1414yB2) {
        this.f10913a = 16;
        this.f10914b = c1414yB;
        this.d = qo;
        this.f10915e = qo2;
        this.f10916f = qo3;
        this.c = c1414yB2;
    }

    public C1252uf(C1414yB c1414yB, C1165se c1165se, Eg eg, C1414yB c1414yB2, FB fb) {
        this.f10913a = 6;
        this.f10914b = c1414yB;
        this.c = c1165se;
        this.f10915e = eg;
        this.d = c1414yB2;
        this.f10916f = fb;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [com.google.android.gms.internal.ads.a5, java.lang.Object] */
    public C0381a5 a() {
        C0260Dc c0260Dc = AbstractC0266Ec.f4897a;
        AbstractC0587ez.n(c0260Dc);
        C0829kl a4 = ((C1000ok) this.d).a();
        InterfaceC1328wB a5 = C1414yB.a((C1252uf) this.f10915e);
        Fq fq = (Fq) this.f10914b.c();
        Context a6 = ((C0865le) this.c).a();
        C0248Bc a7 = ((C1122re) this.f10916f).a();
        ?? obj = new Object();
        obj.f8077p = c0260Dc;
        obj.f8078q = a4;
        obj.f8079r = a5;
        obj.f8080s = fq;
        obj.f8076o = a6;
        obj.f8081t = a7;
        return obj;
    }

    public Fg b() {
        return new Fg(((C0654gg) this.d).a(), (String) ((C0654gg) this.f10915e).f8840b.f6527r, (C0959nm) this.f10914b.c(), ((C0654gg) this.f10916f).f8840b.p(), (String) this.c.c());
    }

    @Override // com.google.android.gms.internal.ads.FB
    public final Object c() {
        switch (this.f10913a) {
            case 0:
                return new C1209tf((C0768j9) ((C1414yB) this.d).c(), (C1081qf) ((C1414yB) this.f10915e).c(), (Executor) this.f10914b.c(), (C1038pf) ((C1414yB) this.f10916f).c(), (C1798a) this.c.c());
            case 1:
                return b();
            case 2:
                return new C0613fi(((C0865le) this.f10914b).a(), (InterfaceC0308Md) ((C0400ai) this.d).f8154b.f9212q, ((C0654gg) this.f10915e).a(), ((C1122re) this.c).a(), (EnumC0807k5) this.f10916f.c());
            case 3:
                Nf nf = (Nf) this.d;
                C0331Rb c0331Rb = new C0331Rb(((C0865le) nf.f6352b).a(), ((Eg) nf.c).a().f5911f);
                Context a4 = ((C0865le) this.f10914b).a();
                C0356Wb c0356Wb = (C0356Wb) this.c.c();
                InterfaceC0308Md interfaceC0308Md = (InterfaceC0308Md) ((C0400ai) this.f10915e).f8154b.f9212q;
                return new C0699hi(c0331Rb, a4, c0356Wb, interfaceC0308Md == null ? null : interfaceC0308Md.m0(), (EnumC0807k5) this.f10916f.c());
            case 4:
                Map c = ((BB) this.f10915e).c();
                Map c2 = ((BB) this.f10916f).c();
                Map c4 = ((BB) this.c).c();
                Gi gi = (Gi) ((C0869li) this.f10914b).f9453a.f9211p;
                AbstractC0587ez.n(gi);
                return new C0741ii(c, c2, c4, (C1414yB) this.d, gi);
            case 5:
                Context a5 = ((C0865le) this.f10914b).a();
                String packageName = ((C0865le) ((C0446bl) this.c).f8279a).a().getPackageName();
                AbstractC0587ez.n(packageName);
                C0248Bc a6 = ((C1122re) ((FB) this.f10915e)).a();
                EnumC0807k5 enumC0807k5 = (EnumC0807k5) this.f10916f.c();
                String str = (String) ((C1414yB) this.d).c();
                C0764j5 c0764j5 = new C0764j5(new A2.o(a5, 5));
                X5 v4 = Y5.v();
                int i4 = a6.f4085p;
                v4.d();
                Y5.w((Y5) v4.f4561p, i4);
                int i5 = a6.f4086q;
                v4.d();
                Y5.x((Y5) v4.f4561p, i5);
                int i6 = true != a6.f4087r ? 2 : 0;
                v4.d();
                Y5.y((Y5) v4.f4561p, i6);
                c0764j5.a(new C0326Qb(enumC0807k5, packageName, (Y5) v4.b(), str, false));
                return c0764j5;
            case 6:
                return new C0572ek((C0828kk) this.f10914b.c(), ((C1165se) this.c).c(), ((Eg) this.f10915e).a(), (String) ((C1414yB) this.d).c(), (String) this.f10916f.c());
            case 7:
                return a();
            case 8:
                Context a7 = ((C0865le) this.f10914b).a();
                C0260Dc c0260Dc = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc);
                C1016p c1016p = new C1016p(22);
                C1423ye c1423ye = (C1423ye) ((C1080qe) this.c).f10371a.f3930a;
                AbstractC0587ez.n(c1423ye);
                return new Bl(a7, c0260Dc, c1016p, c1423ye, new Xj(4, ((C1208te) ((C1000ok) this.d).f9851b).c()), (ArrayDeque) ((FB) this.f10915e).c(), (Fq) this.f10916f.c());
            case 9:
                return d();
            case 10:
                return new BinderC0489cm(((C0865le) this.c).a(), (Xl) ((C1414yB) this.d).c(), (C0242Ac) this.f10914b.c(), (C0658gk) ((C1414yB) this.f10915e).c(), (InterfaceC1263uq) ((C1414yB) this.f10916f).c());
            case 11:
                return new Qm((C1423ye) this.f10914b.c(), ((Bg) this.f10916f).f4149b.a(), ((Eh) this.c).f4912b, (Um) ((C1414yB) this.d).c(), (C0959nm) ((C1414yB) this.f10915e).c());
            case 12:
                C1798a c1798a = (C1798a) this.f10914b.c();
                u0.g c5 = ((Wm) this.c).c();
                C0959nm c0959nm = (C0959nm) ((C1414yB) this.d).c();
                Oq oq = (Oq) this.f10916f.c();
                Um um = (Um) ((Xj) this.f10915e).f7687p;
                return um != null ? um : new Um(c1798a, c5, c0959nm, oq);
            case 13:
                return new Cm((Context) this.f10914b.c(), (C0262De) ((AB) this.d).f3930a, (C1006oq) this.c.c(), (Su) ((FB) this.f10915e).c(), (C1409y6) ((C0917mn) this.f10916f).f9655b.f9467p);
            case 14:
                return new BinderC1303vn((Context) this.f10914b.c(), (InterfaceC0096x) ((C0826ki) this.c).f9305a.f9212q, ((Eg) this.d).a(), ((Hf) ((Lf) this.f10915e).f6149b).a(), (C0658gk) this.f10916f.c());
            case 15:
                C1016p c1016p2 = new C1016p(24);
                Context a8 = ((C0865le) this.f10914b).a();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.c.c();
                C0260Dc c0260Dc2 = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc2);
                return new No(c1016p2, a8, scheduledExecutorService, c0260Dc2, ((Qo) this.d).f6699b.f112o, ((C0370Za) ((Qo) this.f10915e).f6699b.f113p).f7999z, ((C0370Za) ((Qo) this.f10916f).f6699b.f113p).y);
            case 16:
                C1035pc c1035pc = (C1035pc) this.f10914b.c();
                boolean z4 = ((C0370Za) ((Qo) this.d).f6699b.f113p).f7989o.getBoolean("is_gbid");
                boolean z5 = ((C0370Za) ((Qo) this.f10915e).f6699b.f113p).y;
                C0260Dc c0260Dc3 = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc3);
                AbstractC0587ez.n(((C0370Za) ((Qo) this.f10916f).f6699b.f113p).f7992r);
                return new No(c1035pc, z4, z5, c0260Dc3, (ScheduledExecutorService) this.c.c());
            default:
                return new C1091qp((Context) ((AB) this.f10916f).f3930a, (Executor) this.f10914b.c(), (C1423ye) this.c.c(), (Bn) ((C1414yB) this.d).c(), (C1133rp) ((C1414yB) this.f10915e).c(), new Ip());
        }
    }

    public Tl d() {
        return new Tl(((C0865le) this.f10914b).a(), ((C1382xg) this.d).c(), (Rl) this.c.c(), ((Pl) ((FB) this.f10915e)).c(), ((C0822ke) this.f10916f).c());
    }
}
