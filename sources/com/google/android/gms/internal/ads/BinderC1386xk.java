package com.google.android.gms.internal.ads;

import O1.C0101z0;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.xk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1386xk extends AbstractBinderC1248ub {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C1429yk f11296o;

    public BinderC1386xk(C1429yk c1429yk) {
        this.f11296o = c1429yk;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1291vb
    public final void N0(C0101z0 c0101z0) {
        C1429yk c1429yk = this.f11296o;
        C1384xi c1384xi = c1429yk.f11459b;
        long j4 = c1429yk.f11458a;
        int i4 = c0101z0.f1405o;
        C0381a5 c0381a5 = new C0381a5("rewarded");
        c0381a5.f8077p = Long.valueOf(j4);
        c0381a5.f8079r = "onRewardedAdFailedToShow";
        c0381a5.f8080s = Integer.valueOf(i4);
        c1384xi.R0(c0381a5);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1291vb
    public final void a() {
        C1429yk c1429yk = this.f11296o;
        C1384xi c1384xi = c1429yk.f11459b;
        long j4 = c1429yk.f11458a;
        C0381a5 c0381a5 = new C0381a5("rewarded");
        c0381a5.f8077p = Long.valueOf(j4);
        c0381a5.f8079r = "onAdClicked";
        c1384xi.R0(c0381a5);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1291vb
    public final void d() {
        C1429yk c1429yk = this.f11296o;
        C1384xi c1384xi = c1429yk.f11459b;
        long j4 = c1429yk.f11458a;
        C0381a5 c0381a5 = new C0381a5("rewarded");
        c0381a5.f8077p = Long.valueOf(j4);
        c0381a5.f8079r = "onAdImpression";
        c1384xi.R0(c0381a5);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1291vb
    public final void h() {
        C1429yk c1429yk = this.f11296o;
        C1384xi c1384xi = c1429yk.f11459b;
        long j4 = c1429yk.f11458a;
        C0381a5 c0381a5 = new C0381a5("rewarded");
        c0381a5.f8077p = Long.valueOf(j4);
        c0381a5.f8079r = "onRewardedAdClosed";
        c1384xi.R0(c0381a5);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1291vb
    public final void i0(int i4) {
        C1429yk c1429yk = this.f11296o;
        C1384xi c1384xi = c1429yk.f11459b;
        long j4 = c1429yk.f11458a;
        C0381a5 c0381a5 = new C0381a5("rewarded");
        c0381a5.f8077p = Long.valueOf(j4);
        c0381a5.f8079r = "onRewardedAdFailedToShow";
        c0381a5.f8080s = Integer.valueOf(i4);
        c1384xi.R0(c0381a5);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1291vb
    public final void j() {
        C1429yk c1429yk = this.f11296o;
        C1384xi c1384xi = c1429yk.f11459b;
        long j4 = c1429yk.f11458a;
        C0381a5 c0381a5 = new C0381a5("rewarded");
        c0381a5.f8077p = Long.valueOf(j4);
        c0381a5.f8079r = "onRewardedAdOpened";
        c1384xi.R0(c0381a5);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1291vb
    public final void l1(InterfaceC1034pb interfaceC1034pb) {
        C1429yk c1429yk = this.f11296o;
        C1384xi c1384xi = c1429yk.f11459b;
        long j4 = c1429yk.f11458a;
        C0381a5 c0381a5 = new C0381a5("rewarded");
        c0381a5.f8077p = Long.valueOf(j4);
        c0381a5.f8079r = "onUserEarnedReward";
        c0381a5.f8076o = interfaceC1034pb.d();
        c0381a5.f8081t = Integer.valueOf(interfaceC1034pb.a());
        c1384xi.R0(c0381a5);
    }
}
