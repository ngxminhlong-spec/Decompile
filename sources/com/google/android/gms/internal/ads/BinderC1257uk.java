package com.google.android.gms.internal.ads;

import O1.AbstractBinderC0094w;
import O1.C0101z0;
import android.os.Parcel;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.uk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1257uk extends AbstractBinderC0094w {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C1384xi f10926o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1300vk f10927p;

    public BinderC1257uk(C1300vk c1300vk, C1384xi c1384xi) {
        this.f10927p = c1300vk;
        this.f10926o = c1384xi;
    }

    @Override // O1.InterfaceC0096x
    public final void A(int i4) {
        long j4 = this.f10927p.f11054a;
        C0381a5 c0381a5 = new C0381a5("interstitial");
        c0381a5.f8077p = Long.valueOf(j4);
        c0381a5.f8079r = "onAdFailedToLoad";
        c0381a5.f8080s = Integer.valueOf(i4);
        this.f10926o.R0(c0381a5);
    }

    @Override // O1.InterfaceC0096x
    public final void e() {
        long j4 = this.f10927p.f11054a;
        C0381a5 c0381a5 = new C0381a5("interstitial");
        c0381a5.f8077p = Long.valueOf(j4);
        c0381a5.f8079r = "onAdClicked";
        String g4 = C0381a5.g(c0381a5);
        C1025p8 c1025p8 = (C1025p8) this.f10926o.f11290p;
        Parcel Q3 = c1025p8.Q();
        Q3.writeString(g4);
        c1025p8.G1(Q3, 1);
    }

    @Override // O1.InterfaceC0096x
    public final void f() {
    }

    @Override // O1.InterfaceC0096x
    public final void g() {
        long j4 = this.f10927p.f11054a;
        C0381a5 c0381a5 = new C0381a5("interstitial");
        c0381a5.f8077p = Long.valueOf(j4);
        c0381a5.f8079r = "onAdLoaded";
        this.f10926o.R0(c0381a5);
    }

    @Override // O1.InterfaceC0096x
    public final void h() {
    }

    @Override // O1.InterfaceC0096x
    public final void i() {
        long j4 = this.f10927p.f11054a;
        C0381a5 c0381a5 = new C0381a5("interstitial");
        c0381a5.f8077p = Long.valueOf(j4);
        c0381a5.f8079r = "onAdClosed";
        this.f10926o.R0(c0381a5);
    }

    @Override // O1.InterfaceC0096x
    public final void j() {
        long j4 = this.f10927p.f11054a;
        C0381a5 c0381a5 = new C0381a5("interstitial");
        c0381a5.f8077p = Long.valueOf(j4);
        c0381a5.f8079r = "onAdOpened";
        this.f10926o.R0(c0381a5);
    }

    @Override // O1.InterfaceC0096x
    public final void k() {
    }

    @Override // O1.InterfaceC0096x
    public final void r(C0101z0 c0101z0) {
        long j4 = this.f10927p.f11054a;
        int i4 = c0101z0.f1405o;
        C0381a5 c0381a5 = new C0381a5("interstitial");
        c0381a5.f8077p = Long.valueOf(j4);
        c0381a5.f8079r = "onAdFailedToLoad";
        c0381a5.f8080s = Integer.valueOf(i4);
        this.f10926o.R0(c0381a5);
    }
}
