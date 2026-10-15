package com.google.android.gms.internal.ads;

import android.content.Context;
import c3.InterfaceFutureC0239a;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.qm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1088qm implements InterfaceC0745im {

    /* renamed from: a, reason: collision with root package name */
    public final C0250Be f10396a;

    /* renamed from: b, reason: collision with root package name */
    public final Oj f10397b;
    public final Jp c;
    public final Executor d;

    /* renamed from: e, reason: collision with root package name */
    public final C0248Bc f10398e;

    /* renamed from: f, reason: collision with root package name */
    public final C0640g8 f10399f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f10400g = ((Boolean) O1.r.d.c.a(AbstractC1066q6.O7)).booleanValue();

    /* renamed from: h, reason: collision with root package name */
    public final BinderC0489cm f10401h;

    public C1088qm(C0250Be c0250Be, Context context, Executor executor, Oj oj, Jp jp, C0248Bc c0248Bc, C0640g8 c0640g8, BinderC0489cm binderC0489cm) {
        this.f10396a = c0250Be;
        this.d = executor;
        this.f10397b = oj;
        this.c = jp;
        this.f10398e = c0248Bc;
        this.f10399f = c0640g8;
        this.f10401h = binderC0489cm;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0745im
    public final InterfaceFutureC0239a a(Ep ep, C1434yp c1434yp) {
        C0347Uc c0347Uc = new C0347Uc(6, (byte) 0);
        Pu pu = Pu.f6608p;
        C0568eg c0568eg = new C0568eg(this, c1434yp, ep, c0347Uc, 2);
        Executor executor = this.d;
        C1267uu n02 = Bs.n0(pu, c0568eg, executor);
        n02.a(new RunnableC0286Ib(c0347Uc, 3), executor);
        return n02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0745im
    public final boolean b(Ep ep, C1434yp c1434yp) {
        Cp cp = c1434yp.f11534s;
        return (cp == null || cp.f4551a == null) ? false : true;
    }
}
