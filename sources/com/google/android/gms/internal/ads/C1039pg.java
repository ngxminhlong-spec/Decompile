package com.google.android.gms.internal.ads;

import l2.C1798a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.pg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1039pg implements InterfaceC1457zB {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9997a;

    /* renamed from: b, reason: collision with root package name */
    public final FB f9998b;
    public final FB c;
    public final FB d;

    /* renamed from: e, reason: collision with root package name */
    public final FB f9999e;

    public /* synthetic */ C1039pg(C1414yB c1414yB, FB fb, InterfaceC1457zB interfaceC1457zB, C1414yB c1414yB2, int i4) {
        this.f9997a = i4;
        this.f9998b = c1414yB;
        this.c = fb;
        this.d = interfaceC1457zB;
        this.f9999e = c1414yB2;
    }

    @Override // com.google.android.gms.internal.ads.FB
    public final /* bridge */ /* synthetic */ Object c() {
        switch (this.f9997a) {
            case 0:
                return new C0996og((C1798a) this.f9998b.c(), (C1082qg) this.c.c(), ((Eg) this.d).a(), (String) this.f9999e.c());
            default:
                return new Un((C0832ko) this.f9998b.c(), ((Eg) this.c).a(), ((C0865le) this.d).a(), (C1035pc) this.f9999e.c(), 0);
        }
    }
}
