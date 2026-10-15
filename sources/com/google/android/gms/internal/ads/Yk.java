package com.google.android.gms.internal.ads;

import c3.InterfaceFutureC0239a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final /* synthetic */ class Yk implements Du {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7870a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0370Za f7871b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ Yk(Object obj, C0370Za c0370Za, int i4, int i5) {
        this.f7870a = i5;
        this.d = obj;
        this.f7871b = c0370Za;
        this.c = i4;
    }

    @Override // com.google.android.gms.internal.ads.Du
    public final InterfaceFutureC0239a l(Object obj) {
        switch (this.f7870a) {
            case 0:
                return ((Bl) ((InterfaceC1328wB) ((u0.g) this.d).f14986s).c()).L3(this.f7871b, this.c);
            default:
                return ((Bl) ((InterfaceC1328wB) ((C0275Ga) this.d).f5187t).c()).M3(this.f7871b, this.c);
        }
    }
}
