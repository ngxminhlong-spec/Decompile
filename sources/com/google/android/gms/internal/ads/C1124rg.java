package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.measurement.C1510e1;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import l2.C1798a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.rg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1124rg implements InterfaceC1457zB {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10487a = 4;

    /* renamed from: b, reason: collision with root package name */
    public final FB f10488b;
    public final C1414yB c;
    public final FB d;

    /* renamed from: e, reason: collision with root package name */
    public final FB f10489e;

    /* renamed from: f, reason: collision with root package name */
    public final FB f10490f;

    /* renamed from: g, reason: collision with root package name */
    public final FB f10491g;

    /* renamed from: h, reason: collision with root package name */
    public final FB f10492h;

    /* renamed from: i, reason: collision with root package name */
    public final FB f10493i;

    /* renamed from: j, reason: collision with root package name */
    public final FB f10494j;

    public C1124rg(AB ab, AB ab2, AB ab3, C1414yB c1414yB, C1414yB c1414yB2, C1414yB c1414yB3, C1122re c1122re, C1414yB c1414yB4, C1414yB c1414yB5) {
        this.f10490f = ab;
        this.f10491g = ab2;
        this.f10493i = ab3;
        this.c = c1414yB;
        this.f10489e = c1414yB2;
        this.f10492h = c1414yB3;
        this.f10488b = c1122re;
        this.d = c1414yB4;
        this.f10494j = c1414yB5;
    }

    public C1124rg(Eg eg, C1414yB c1414yB, C1414yB c1414yB2, C1414yB c1414yB3, C1414yB c1414yB4, C1414yB c1414yB5, C1414yB c1414yB6, C1414yB c1414yB7, C1414yB c1414yB8) {
        this.f10490f = eg;
        this.f10488b = c1414yB;
        this.c = c1414yB2;
        this.d = c1414yB3;
        this.f10491g = c1414yB4;
        this.f10492h = c1414yB5;
        this.f10493i = c1414yB6;
        this.f10494j = c1414yB7;
        this.f10489e = c1414yB8;
    }

    public C1124rg(C0654gg c0654gg, C0654gg c0654gg2, C1414yB c1414yB, FB fb, Fh fh, C1252uf c1252uf, C1414yB c1414yB2, Hg hg, C1414yB c1414yB3) {
        this.f10490f = c0654gg;
        this.f10491g = c0654gg2;
        this.c = c1414yB;
        this.f10488b = fb;
        this.d = fh;
        this.f10493i = c1252uf;
        this.f10489e = c1414yB2;
        this.f10494j = hg;
        this.f10492h = c1414yB3;
    }

    public C1124rg(C0865le c0865le, C1414yB c1414yB, C1414yB c1414yB2, C1122re c1122re, C1414yB c1414yB3, C1414yB c1414yB4, C1414yB c1414yB5, C1414yB c1414yB6, C1414yB c1414yB7) {
        this.f10490f = c0865le;
        this.c = c1414yB;
        this.f10489e = c1414yB2;
        this.f10491g = c1122re;
        this.f10492h = c1414yB3;
        this.f10488b = c1414yB4;
        this.d = c1414yB5;
        this.f10493i = c1414yB6;
        this.f10494j = c1414yB7;
    }

    public C1124rg(C1414yB c1414yB, C0865le c0865le, C0908me c0908me, C1414yB c1414yB2, C1414yB c1414yB3, C1414yB c1414yB4, C1122re c1122re, Hg hg, C1414yB c1414yB5) {
        this.c = c1414yB;
        this.f10490f = c0865le;
        this.f10491g = c0908me;
        this.f10489e = c1414yB2;
        this.f10492h = c1414yB3;
        this.f10488b = c1414yB4;
        this.d = c1122re;
        this.f10493i = hg;
        this.f10494j = c1414yB5;
    }

    public C1124rg(C1414yB c1414yB, C1122re c1122re, Dg dg, C1414yB c1414yB2, C1414yB c1414yB3, Bg bg, C1414yB c1414yB4, C1414yB c1414yB5, C1414yB c1414yB6) {
        this.f10488b = c1414yB;
        this.d = c1122re;
        this.f10490f = dg;
        this.f10491g = c1414yB2;
        this.f10489e = c1414yB3;
        this.f10492h = bg;
        this.c = c1414yB4;
        this.f10493i = c1414yB5;
        this.f10494j = c1414yB6;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [com.google.android.gms.internal.ads.AA, com.google.android.gms.internal.ads.Zg] */
    public C1151s6 a() {
        Ep ep = (Ep) ((C0654gg) this.f10490f).f8840b.f6525p;
        AbstractC0587ez.n(ep);
        return new C1151s6(ep, ((C0654gg) this.f10491g).a(), (Ug) this.c.c(), (Xg) this.f10488b.c(), ((Fh) this.d).f5068a.f4767o, ((C1252uf) this.f10493i).b(), (C1040ph) ((C1414yB) this.f10489e).c(), (Zg) new AA(((Hg) this.f10494j).f5478b.c()), (Nh) ((C1414yB) this.f10492h).c());
    }

    /* JADX WARN: Type inference failed for: r10v4, types: [com.google.android.gms.internal.ads.AA, com.google.android.gms.internal.ads.Hh] */
    @Override // com.google.android.gms.internal.ads.FB
    public final Object c() {
        switch (this.f10487a) {
            case 0:
                return a();
            case 1:
                return new C0956nj(((Eg) this.f10490f).a(), (Executor) this.f10488b.c(), (Oj) this.c.c(), (Context) this.d.c(), (C0658gk) this.f10491g.c(), (InterfaceC1263uq) this.f10492h.c(), (Oq) this.f10493i.c(), (Xl) this.f10494j.c(), (Ej) ((C1414yB) this.f10489e).c());
            case 2:
                return new CallableC1428yj(((C0865le) this.f10490f).a(), (Executor) this.c.c(), (I3) ((C1414yB) this.f10489e).c(), ((C1122re) this.f10491g).a(), C1510e1.w(), new C0347Uc(2, (byte) 0), (Xl) ((C1414yB) this.f10492h).c(), (Oq) ((C1414yB) this.f10488b).c(), (C0658gk) ((C1414yB) this.d).c(), (InterfaceC1263uq) ((C1414yB) this.f10493i).c(), (BinderC0489cm) ((C1414yB) this.f10494j).c());
            case 3:
                Executor executor = (Executor) this.c.c();
                Context a4 = ((C0865le) this.f10490f).a();
                WeakReference weakReference = ((C0908me) this.f10491g).f9628b.c;
                AbstractC0587ez.n(weakReference);
                C0260Dc c0260Dc = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc);
                return new Ck(executor, a4, weakReference, c0260Dc, (Tj) ((C1414yB) this.f10489e).c(), (ScheduledExecutorService) ((C1414yB) this.f10492h).c(), (C0871lk) ((C1414yB) this.f10488b).c(), ((C1122re) this.d).a(), new AA(((Hg) this.f10493i).f5478b.c()), (Fq) ((C1414yB) this.f10494j).c());
            case 4:
                return new En((Context) ((AB) this.f10490f).f3930a, (O1.X0) ((AB) this.f10491g).f3930a, (String) ((AB) this.f10493i).f3930a, (C1091qp) this.c.c(), (Bn) ((C1414yB) this.f10489e).c(), (C1133rp) ((C1414yB) this.f10492h).c(), ((C1122re) this.f10488b).a(), (I3) this.d.c(), (C0658gk) this.f10494j.c());
            default:
                Um um = (Um) this.f10488b.c();
                C0248Bc a5 = ((C1122re) this.d).a();
                String str = ((C0910mg) ((Dg) this.f10490f).f4754a.c()).f9637p.f9618e;
                AbstractC0587ez.n(str);
                return new Nq(um, a5, str, (String) this.f10491g.c(), (Context) this.f10489e.c(), ((Bg) this.f10492h).f4149b.d, (Gp) this.c.c(), (C1798a) this.f10493i.c(), (I3) this.f10494j.c());
        }
    }
}
