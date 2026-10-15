package com.google.android.gms.internal.ads;

import android.content.Context;
import c3.InterfaceFutureC0239a;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.wm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1345wm implements InterfaceC0745im {

    /* renamed from: a, reason: collision with root package name */
    public final C0262De f11193a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f11194b;
    public final Oj c;
    public final Jp d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f11195e;

    /* renamed from: f, reason: collision with root package name */
    public final As f11196f;

    public C1345wm(C0262De c0262De, Context context, Executor executor, Oj oj, Jp jp, As as) {
        this.f11194b = context;
        this.f11193a = c0262De;
        this.f11195e = executor;
        this.c = oj;
        this.d = jp;
        this.f11196f = as;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0745im
    public final InterfaceFutureC0239a a(Ep ep, C1434yp c1434yp) {
        return Bs.n0(Pu.f6608p, new C0568eg(this, ep, c1434yp, 3), this.f11195e);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0745im
    public final boolean b(Ep ep, C1434yp c1434yp) {
        Cp cp = c1434yp.f11534s;
        return (cp == null || cp.f4551a == null) ? false : true;
    }
}
