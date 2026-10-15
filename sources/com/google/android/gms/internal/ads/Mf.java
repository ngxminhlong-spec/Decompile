package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Mf implements InterfaceC1457zB {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6255a;

    /* renamed from: b, reason: collision with root package name */
    public final FB f6256b;
    public final FB c;
    public final C0654gg d;

    /* renamed from: e, reason: collision with root package name */
    public final FB f6257e;

    public /* synthetic */ Mf(C1414yB c1414yB, C1122re c1122re, C0654gg c0654gg, Eg eg, int i4) {
        this.f6255a = i4;
        this.f6256b = c1414yB;
        this.c = c1122re;
        this.d = c0654gg;
        this.f6257e = eg;
    }

    @Override // com.google.android.gms.internal.ads.FB
    public final Object c() {
        switch (this.f6255a) {
            case 0:
                return new Ph(new If((Context) this.f6256b.c(), ((C1122re) this.c).a(), this.d.a(), ((Eg) this.f6257e).a(), 0), AbstractC0266Ec.f4900f);
            default:
                return new Ph(new If((Context) this.f6256b.c(), ((C1122re) this.c).a(), this.d.a(), ((Eg) this.f6257e).a(), 1), AbstractC0266Ec.f4900f);
        }
    }
}
