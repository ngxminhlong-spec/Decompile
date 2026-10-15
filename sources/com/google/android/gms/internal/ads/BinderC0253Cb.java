package com.google.android.gms.internal.ads;

import O1.C0101z0;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Cb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0253Cb extends AbstractBinderC1420yb {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f4443o;

    /* renamed from: p, reason: collision with root package name */
    public final H1.r f4444p;

    /* renamed from: q, reason: collision with root package name */
    public final Object f4445q;

    public /* synthetic */ BinderC0253Cb(H1.r rVar, Object obj, int i4) {
        this.f4443o = i4;
        this.f4444p = rVar;
        this.f4445q = obj;
    }

    private final void K3(int i4) {
    }

    private final void L3(int i4) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1463zb
    public final void A(int i4) {
        int i5 = this.f4443o;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1463zb
    public final void h() {
        C0281Hb c0281Hb;
        switch (this.f4443o) {
            case 0:
                Rk rk = (Rk) this.f4444p;
                if (rk != null) {
                    rk.e((C0247Bb) this.f4445q);
                    return;
                }
                return;
            default:
                Rk rk2 = (Rk) this.f4444p;
                if (rk2 == null || (c0281Hb = (C0281Hb) this.f4445q) == null) {
                    return;
                }
                rk2.e(c0281Hb);
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1463zb
    public final void r(C0101z0 c0101z0) {
        switch (this.f4443o) {
            case 0:
                Rk rk = (Rk) this.f4444p;
                if (rk != null) {
                    rk.b(c0101z0.i());
                    return;
                }
                return;
            default:
                Rk rk2 = (Rk) this.f4444p;
                if (rk2 != null) {
                    rk2.b(c0101z0.i());
                    return;
                }
                return;
        }
    }
}
