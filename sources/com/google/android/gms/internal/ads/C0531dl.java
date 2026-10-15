package com.google.android.gms.internal.ads;

import android.content.Context;
import t2.C1995b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.dl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0531dl implements InterfaceC1457zB {

    /* renamed from: a, reason: collision with root package name */
    public final FB f8501a;

    /* renamed from: b, reason: collision with root package name */
    public final FB f8502b;
    public final FB c;
    public final FB d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC1457zB f8503e;

    /* renamed from: f, reason: collision with root package name */
    public final FB f8504f;

    /* renamed from: g, reason: collision with root package name */
    public final FB f8505g;

    public C0531dl(AB ab, C0865le c0865le, C1122re c1122re, Eg eg, InterfaceC1457zB interfaceC1457zB, C1414yB c1414yB, C1414yB c1414yB2) {
        this.f8501a = ab;
        this.f8502b = c0865le;
        this.c = c1122re;
        this.d = eg;
        this.f8503e = interfaceC1457zB;
        this.f8504f = c1414yB;
        this.f8505g = c1414yB2;
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [t2.b, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.FB
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1995b c() {
        C1423ye c1423ye = (C1423ye) this.f8501a.c();
        Context a4 = ((C0865le) this.f8502b).a();
        C0248Bc a5 = ((C1122re) this.c).a();
        Jp a6 = ((Eg) this.d).a();
        C0260Dc c0260Dc = AbstractC0266Ec.f4897a;
        AbstractC0587ez.n(c0260Dc);
        String str = (String) this.f8503e.c();
        Eq eq = (Eq) this.f8504f.c();
        C0572ek c0572ek = (C0572ek) this.f8505g.c();
        ?? obj = new Object();
        obj.f14880o = c1423ye;
        obj.f14881p = a4;
        obj.f14882q = a5;
        obj.f14883r = a6;
        obj.f14884s = c0260Dc;
        obj.f14885t = str;
        obj.f14886u = eq;
        obj.f14887v = c0572ek;
        return obj;
    }
}
