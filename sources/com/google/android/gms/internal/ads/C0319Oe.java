package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Oe, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0319Oe implements InterfaceC1457zB {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6468a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final C1414yB f6469b;
    public final FB c;
    public final FB d;

    /* renamed from: e, reason: collision with root package name */
    public final FB f6470e;

    /* renamed from: f, reason: collision with root package name */
    public final FB f6471f;

    /* renamed from: g, reason: collision with root package name */
    public final FB f6472g;

    /* renamed from: h, reason: collision with root package name */
    public final FB f6473h;

    /* renamed from: i, reason: collision with root package name */
    public final FB f6474i;

    /* renamed from: j, reason: collision with root package name */
    public final FB f6475j;

    /* renamed from: k, reason: collision with root package name */
    public final FB f6476k;

    /* renamed from: l, reason: collision with root package name */
    public final FB f6477l;

    /* renamed from: m, reason: collision with root package name */
    public final FB f6478m;

    /* renamed from: n, reason: collision with root package name */
    public final FB f6479n;

    public C0319Oe(C0865le c0865le, C1122re c1122re, C1414yB c1414yB, C1414yB c1414yB2, C1414yB c1414yB3, C1414yB c1414yB4, C1414yB c1414yB5, C1414yB c1414yB6, C1414yB c1414yB7, C0908me c0908me, C1414yB c1414yB8, C0329Qe c0329Qe, C1414yB c1414yB9) {
        this.c = c0865le;
        this.d = c1122re;
        this.f6469b = c1414yB;
        this.f6470e = c1414yB2;
        this.f6471f = c1414yB3;
        this.f6472g = c1414yB4;
        this.f6473h = c1414yB5;
        this.f6474i = c1414yB6;
        this.f6475j = c1414yB7;
        this.f6478m = c0908me;
        this.f6476k = c1414yB8;
        this.f6479n = c0329Qe;
        this.f6477l = c1414yB9;
    }

    public C0319Oe(C0865le c0865le, C1414yB c1414yB, C1414yB c1414yB2, C0654gg c0654gg, C0654gg c0654gg2, C1414yB c1414yB3, C1414yB c1414yB4, InterfaceC1457zB interfaceC1457zB, InterfaceC1457zB interfaceC1457zB2, C1414yB c1414yB5, C1414yB c1414yB6, C1414yB c1414yB7, Cg cg) {
        this.c = c0865le;
        this.d = c1414yB;
        this.f6470e = c1414yB2;
        this.f6471f = c0654gg;
        this.f6472g = c0654gg2;
        this.f6473h = c1414yB3;
        this.f6469b = c1414yB4;
        this.f6474i = interfaceC1457zB;
        this.f6475j = interfaceC1457zB2;
        this.f6476k = c1414yB5;
        this.f6477l = c1414yB6;
        this.f6478m = c1414yB7;
        this.f6479n = cg;
    }

    @Override // com.google.android.gms.internal.ads.FB
    public final Object c() {
        switch (this.f6468a) {
            case 0:
                return new BinderC0314Ne(((C0865le) this.c).a(), ((C1122re) this.d).a(), (Tj) this.f6469b.c(), (InterfaceC0830km) ((C1414yB) this.f6470e).c(), (C1131rn) ((C1414yB) this.f6471f).c(), (Ck) ((C1414yB) this.f6472g).c(), (C0356Wb) ((C1414yB) this.f6473h).c(), (Vj) ((C1414yB) this.f6474i).c(), (Ok) ((C1414yB) this.f6475j).c(), new C0894m6(((C0908me) this.f6478m).f9628b.f9164b, 1), (Fq) ((C1414yB) this.f6476k).c(), Op.u(((C0329Qe) this.f6479n).f6668b.a()), (C1108r6) ((C1414yB) this.f6477l).c());
            default:
                Context a4 = ((C0865le) this.c).a();
                C0260Dc c0260Dc = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc);
                Executor executor = (Executor) this.d.c();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f6470e.c();
                Ep ep = (Ep) ((C0654gg) this.f6471f).f8840b.f6525p;
                AbstractC0587ez.n(ep);
                C1434yp a5 = ((C0654gg) this.f6472g).a();
                Nq nq = (Nq) this.f6473h.c();
                Lp lp = (Lp) this.f6469b.c();
                View view = (View) ((InterfaceC1457zB) this.f6474i).c();
                InterfaceC0308Md interfaceC0308Md = (InterfaceC0308Md) ((InterfaceC1457zB) this.f6475j).c();
                I3 i32 = (I3) this.f6476k.c();
                A6 a6 = (A6) this.f6477l.c();
                return new C0952nf(a4, c0260Dc, executor, scheduledExecutorService, ep, a5, nq, lp, view, interfaceC0308Md, i32, a6, ((Cg) this.f6479n).f4488a.f11622e);
        }
    }
}
