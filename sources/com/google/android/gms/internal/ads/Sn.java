package com.google.android.gms.internal.ads;

import c3.InterfaceFutureC0239a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Sn implements Go {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7007a;

    /* renamed from: b, reason: collision with root package name */
    public final Su f7008b;
    public final Jp c;

    public /* synthetic */ Sn(Su su, Jp jp, int i4) {
        this.f7007a = i4;
        this.f7008b = su;
        this.c = jp;
    }

    @Override // com.google.android.gms.internal.ads.Go
    public final int b() {
        switch (this.f7007a) {
            case 0:
                return 5;
            default:
                return 21;
        }
    }

    @Override // com.google.android.gms.internal.ads.Go
    public final InterfaceFutureC0239a c() {
        switch (this.f7007a) {
            case 0:
                return ((C0260Dc) this.f7008b).b(new CallableC0336Sb(7, this));
            default:
                return ((C0260Dc) this.f7008b).b(new CallableC0336Sb(14, this));
        }
    }
}
