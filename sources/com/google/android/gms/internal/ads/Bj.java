package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.measurement.C1510e1;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Bj implements InterfaceC1457zB {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4153a;

    /* renamed from: b, reason: collision with root package name */
    public final FB f4154b;
    public final FB c;
    public final FB d;

    /* renamed from: e, reason: collision with root package name */
    public final FB f4155e;

    /* renamed from: f, reason: collision with root package name */
    public final FB f4156f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC1457zB f4157g;

    /* renamed from: h, reason: collision with root package name */
    public final FB f4158h;

    public Bj(AB ab, AB ab2, AB ab3, C1414yB c1414yB, C1414yB c1414yB2, C1122re c1122re, C1414yB c1414yB3) {
        this.f4153a = 6;
        this.f4154b = ab;
        this.f4156f = ab2;
        this.f4157g = ab3;
        this.d = c1414yB;
        this.f4155e = c1414yB2;
        this.c = c1122re;
        this.f4158h = c1414yB3;
    }

    public Bj(AB ab, C1414yB c1414yB, AB ab2, AB ab3, C1414yB c1414yB2, C1414yB c1414yB3, C1414yB c1414yB4) {
        this.f4153a = 7;
        this.f4157g = ab;
        this.f4154b = c1414yB;
        this.f4158h = ab2;
        this.c = ab3;
        this.d = c1414yB2;
        this.f4155e = c1414yB3;
        this.f4156f = c1414yB4;
    }

    public Bj(AB ab, C1414yB c1414yB, C1414yB c1414yB2, C1414yB c1414yB3, Eg eg, C1122re c1122re, C1414yB c1414yB4) {
        this.f4153a = 3;
        this.f4156f = ab;
        this.d = c1414yB;
        this.f4154b = c1414yB2;
        this.f4155e = c1414yB3;
        this.f4157g = eg;
        this.c = c1122re;
        this.f4158h = c1414yB4;
    }

    public Bj(C0865le c0865le, C1414yB c1414yB, C0654gg c0654gg, C0654gg c0654gg2, C1414yB c1414yB2, C1414yB c1414yB3, C1414yB c1414yB4) {
        this.f4153a = 2;
        this.f4154b = c0865le;
        this.c = c1414yB;
        this.d = c0654gg;
        this.f4157g = c0654gg2;
        this.f4155e = c1414yB2;
        this.f4156f = c1414yB3;
        this.f4158h = c1414yB4;
    }

    public /* synthetic */ Bj(C1414yB c1414yB, C1122re c1122re, Eg eg, C1414yB c1414yB2, AB ab, C1414yB c1414yB3, C1414yB c1414yB4, int i4) {
        this.f4153a = i4;
        this.f4154b = c1414yB;
        this.c = c1122re;
        this.f4155e = eg;
        this.f4156f = c1414yB2;
        this.f4157g = ab;
        this.d = c1414yB3;
        this.f4158h = c1414yB4;
    }

    public Bj(C1414yB c1414yB, C1414yB c1414yB2, C1414yB c1414yB3, C1122re c1122re, C1414yB c1414yB4, InterfaceC1457zB interfaceC1457zB, C1414yB c1414yB5) {
        this.f4153a = 1;
        this.f4154b = c1414yB;
        this.c = c1414yB2;
        this.d = c1414yB3;
        this.f4155e = c1122re;
        this.f4156f = c1414yB4;
        this.f4157g = interfaceC1457zB;
        this.f4158h = c1414yB5;
    }

    public Bj(C1414yB c1414yB, C1414yB c1414yB2, C1414yB c1414yB3, C1414yB c1414yB4, C1414yB c1414yB5, C0654gg c0654gg, C0654gg c0654gg2) {
        this.f4153a = 0;
        this.d = c1414yB;
        this.f4155e = c1414yB2;
        this.f4154b = c1414yB3;
        this.f4156f = c1414yB4;
        this.c = c1414yB5;
        this.f4157g = c0654gg;
        this.f4158h = c0654gg2;
    }

    @Override // com.google.android.gms.internal.ads.FB
    public final Object c() {
        switch (this.f4153a) {
            case 0:
                return new C1385xj((Gg) ((C1414yB) this.d).c(), (Vg) ((C1414yB) this.f4155e).c(), (C0527dh) this.f4154b.c(), (C0655gh) ((C1414yB) this.f4156f).c(), (C1254uh) this.c.c(), ((C0654gg) this.f4157g).a(), ((C0654gg) this.f4158h).f8840b.p());
            case 1:
                return new Oj((Context) this.f4154b.c(), (I3) this.c.c(), (A6) ((C1414yB) this.d).c(), ((C1122re) this.f4155e).a(), C1510e1.w(), (C0764j5) this.f4156f.c(), (C0825kh) this.f4157g.c(), (BinderC0489cm) this.f4158h.c());
            case 2:
                Context a4 = ((C0865le) this.f4154b).a();
                Np np = (Np) this.c.c();
                Ep ep = (Ep) ((C0654gg) this.d).f8840b.f6525p;
                AbstractC0587ez.n(ep);
                return new Il(a4, np, ep, ((C0654gg) this.f4157g).a(), (Xl) this.f4155e.c(), (InterfaceC1263uq) this.f4156f.c(), (String) this.f4158h.c());
            case 3:
                return new C1088qm((C0250Be) ((AB) this.f4156f).f3930a, (Context) ((C1414yB) this.d).c(), (Executor) this.f4154b.c(), (Oj) ((C1414yB) this.f4155e).c(), ((Eg) this.f4157g).a(), ((C1122re) this.c).a(), new C0640g8(), (BinderC0489cm) this.f4158h.c());
            case 4:
                return new Gm((Context) this.f4154b.c(), ((C1122re) this.c).a(), ((Eg) this.f4155e).a(), (Executor) this.f4156f.c(), (C0279Ge) ((AB) this.f4157g).f3930a, (Oj) ((C1414yB) this.d).c(), new C0640g8(), (BinderC0489cm) this.f4158h.c());
            case 5:
                return new Gm((Context) this.f4154b.c(), ((C1122re) this.c).a(), ((Eg) this.f4155e).a(), (Executor) this.f4156f.c(), (C0289Ie) ((AB) this.f4157g).f3930a, (Oj) ((C1414yB) this.d).c(), new C0640g8(), (BinderC0489cm) this.f4158h.c());
            case 6:
                return new Yo((C1423ye) this.f4154b.c(), (Context) ((AB) this.f4156f).f3930a, (String) ((AB) this.f4157g).f3930a, (Uo) ((C1414yB) this.d).c(), (To) ((C1414yB) this.f4155e).c(), ((C1122re) this.c).a(), (C0658gk) this.f4158h.c());
            default:
                return new Zo((Context) ((AB) this.f4157g).f3930a, (Executor) this.f4154b.c(), (O1.X0) ((AB) this.f4158h).f3930a, (C1423ye) this.c.c(), (Bn) ((C1414yB) this.d).c(), (Dn) ((C1414yB) this.f4155e).c(), new Ip(), (C1297vh) ((C1414yB) this.f4156f).c());
        }
    }
}
