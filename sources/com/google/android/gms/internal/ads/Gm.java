package com.google.android.gms.internal.ads;

import android.content.Context;
import c3.InterfaceFutureC0239a;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Gm implements InterfaceC0745im {

    /* renamed from: b, reason: collision with root package name */
    public final Context f5332b;
    public final Oj c;
    public final Jp d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f5333e;

    /* renamed from: f, reason: collision with root package name */
    public final C0248Bc f5334f;

    /* renamed from: g, reason: collision with root package name */
    public final C0640g8 f5335g;

    /* renamed from: i, reason: collision with root package name */
    public final BinderC0489cm f5337i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f5338j;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5331a = 0;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f5336h = ((Boolean) O1.r.d.c.a(AbstractC1066q6.O7)).booleanValue();

    public Gm(Context context, C0248Bc c0248Bc, Jp jp, Executor executor, C0279Ge c0279Ge, Oj oj, C0640g8 c0640g8, BinderC0489cm binderC0489cm) {
        this.f5332b = context;
        this.d = jp;
        this.f5338j = c0279Ge;
        this.f5333e = executor;
        this.f5334f = c0248Bc;
        this.c = oj;
        this.f5335g = c0640g8;
        this.f5337i = binderC0489cm;
    }

    public Gm(Context context, C0248Bc c0248Bc, Jp jp, Executor executor, C0289Ie c0289Ie, Oj oj, C0640g8 c0640g8, BinderC0489cm binderC0489cm) {
        this.f5332b = context;
        this.d = jp;
        this.f5338j = c0289Ie;
        this.f5333e = executor;
        this.f5334f = c0248Bc;
        this.c = oj;
        this.f5335g = c0640g8;
        this.f5337i = binderC0489cm;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0745im
    public final InterfaceFutureC0239a a(Ep ep, C1434yp c1434yp) {
        switch (this.f5331a) {
            case 0:
                C0347Uc c0347Uc = new C0347Uc(6, (byte) 0);
                Pu pu = Pu.f6608p;
                C0568eg c0568eg = new C0568eg(this, c1434yp, ep, c0347Uc, 6);
                Executor executor = this.f5333e;
                C1267uu n02 = Bs.n0(pu, c0568eg, executor);
                n02.a(new RunnableC0286Ib(c0347Uc, 4), executor);
                return n02;
            default:
                C0347Uc c0347Uc2 = new C0347Uc(6, (byte) 0);
                Pu pu2 = Pu.f6608p;
                C0568eg c0568eg2 = new C0568eg(this, c1434yp, ep, c0347Uc2, 8);
                Executor executor2 = this.f5333e;
                C1267uu n03 = Bs.n0(pu2, c0568eg2, executor2);
                n03.a(new RunnableC0286Ib(c0347Uc2, 5), executor2);
                return n03;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0745im
    public final boolean b(Ep ep, C1434yp c1434yp) {
        switch (this.f5331a) {
            case 0:
                Cp cp = c1434yp.f11534s;
                return (cp == null || cp.f4551a == null) ? false : true;
            default:
                Cp cp2 = c1434yp.f11534s;
                return (cp2 == null || cp2.f4551a == null) ? false : true;
        }
    }
}
