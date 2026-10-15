package com.google.android.gms.internal.ads;

import O1.C0101z0;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.wk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1343wk extends AbstractBinderC1420yb {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C1429yk f11189o;

    public BinderC1343wk(C1429yk c1429yk) {
        this.f11189o = c1429yk;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1463zb
    public final void A(int i4) {
        C1429yk c1429yk = this.f11189o;
        C1384xi c1384xi = c1429yk.f11459b;
        long j4 = c1429yk.f11458a;
        C0381a5 c0381a5 = new C0381a5("rewarded");
        c0381a5.f8077p = Long.valueOf(j4);
        c0381a5.f8079r = "onRewardedAdFailedToLoad";
        c0381a5.f8080s = Integer.valueOf(i4);
        c1384xi.R0(c0381a5);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1463zb
    public final void h() {
        C1429yk c1429yk = this.f11189o;
        C1384xi c1384xi = c1429yk.f11459b;
        long j4 = c1429yk.f11458a;
        C0381a5 c0381a5 = new C0381a5("rewarded");
        c0381a5.f8077p = Long.valueOf(j4);
        c0381a5.f8079r = "onRewardedAdLoaded";
        c1384xi.R0(c0381a5);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1463zb
    public final void r(C0101z0 c0101z0) {
        C1429yk c1429yk = this.f11189o;
        C1384xi c1384xi = c1429yk.f11459b;
        long j4 = c1429yk.f11458a;
        int i4 = c0101z0.f1405o;
        C0381a5 c0381a5 = new C0381a5("rewarded");
        c0381a5.f8077p = Long.valueOf(j4);
        c0381a5.f8079r = "onRewardedAdFailedToLoad";
        c0381a5.f8080s = Integer.valueOf(i4);
        c1384xi.R0(c0381a5);
    }
}
