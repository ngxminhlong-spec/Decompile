package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.xq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1392xq implements InterfaceC1263uq {

    /* renamed from: a, reason: collision with root package name */
    public final Iv f11304a;

    /* renamed from: b, reason: collision with root package name */
    public final Op f11305b;
    public final C1177sq c;

    public C1392xq(C1177sq c1177sq, Iv iv, Op op) {
        this.c = c1177sq;
        this.f11304a = iv;
        this.f11305b = op;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1263uq
    public final String a(C1220tq c1220tq) {
        HashMap g4 = c1220tq.g();
        this.f11305b.n(g4);
        return this.f11304a.c(g4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1263uq
    public final void b(C1220tq c1220tq) {
        String a4 = a(c1220tq);
        C1177sq c1177sq = this.c;
        c1177sq.getClass();
        c1177sq.f10639a.execute(new Jn(7, c1177sq, a4));
    }
}
