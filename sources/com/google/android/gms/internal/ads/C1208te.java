package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.te, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1208te implements InterfaceC1457zB {

    /* renamed from: a, reason: collision with root package name */
    public final C0865le f10699a;

    /* renamed from: b, reason: collision with root package name */
    public final C1414yB f10700b;

    public C1208te(C0865le c0865le, C1414yB c1414yB) {
        this.f10699a = c0865le;
        this.f10700b = c1414yB;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [com.google.android.gms.internal.ads.Qb, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.FB
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0326Qb c() {
        Context a4 = this.f10699a.a();
        Fq fq = (Fq) this.f10700b.c();
        N1.n nVar = N1.n.f1204A;
        C0641g9 F2 = nVar.f1218p.F(a4, C0248Bc.h(), fq);
        C1016p c1016p = AbstractC0598f9.f8690b;
        F2.getClass();
        C0727i9 a5 = nVar.f1218p.F(a4, C0248Bc.h(), fq).a("google.afma.sdkConstants.getSdkConstants", c1016p, c1016p);
        ?? obj = new Object();
        obj.f6659o = new Object();
        obj.f6660p = a4.getApplicationContext();
        obj.f6662r = a5;
        return obj;
    }
}
