package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Ik implements InterfaceC1457zB {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5708a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Eg f5709b;
    public final FB c;
    public final FB d;

    public Ik(Eg eg, C1414yB c1414yB, C0822ke c0822ke) {
        this.f5709b = eg;
        this.c = c1414yB;
        this.d = c0822ke;
    }

    public Ik(C1414yB c1414yB, Eg eg, C1414yB c1414yB2) {
        this.c = c1414yB;
        this.f5709b = eg;
        this.d = c1414yB2;
    }

    @Override // com.google.android.gms.internal.ads.FB
    public final /* bridge */ /* synthetic */ Object c() {
        switch (this.f5708a) {
            case 0:
                return new Hk((Ok) this.c.c(), this.f5709b.a(), (String) this.d.c());
            default:
                C0260Dc c0260Dc = AbstractC0266Ec.f4897a;
                AbstractC0587ez.n(c0260Dc);
                return new Un(c0260Dc, this.f5709b.a(), (PackageInfo) this.c.c(), ((C0822ke) this.d).c(), 5);
        }
    }
}
