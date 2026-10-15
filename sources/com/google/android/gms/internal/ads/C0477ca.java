package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.ca, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0477ca implements P1.g {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ zzbsh f8354o;

    public C0477ca(zzbsh zzbshVar) {
        this.f8354o = zzbshVar;
    }

    @Override // P1.g
    public final void L2(int i4) {
        Y9.m("AdMobCustomTabsAdapter overlay is closed.");
        Op op = (Op) this.f8354o.f11701b;
        op.getClass();
        h2.y.d("#008 Must be called on the main UI thread.");
        Y9.m("Adapter called onAdClosed.");
        try {
            ((InterfaceC1283v9) op.f6525p).d();
        } catch (RemoteException e4) {
            Y9.u("#007 Could not call remote method.", e4);
        }
    }

    @Override // P1.g
    public final void O() {
        Y9.m("AdMobCustomTabsAdapter overlay is resumed.");
    }

    @Override // P1.g
    public final void W2() {
    }

    @Override // P1.g
    public final void a0() {
        Y9.m("Opening AdMobCustomTabsAdapter overlay.");
        Op op = (Op) this.f8354o.f11701b;
        op.getClass();
        h2.y.d("#008 Must be called on the main UI thread.");
        Y9.m("Adapter called onAdOpened.");
        try {
            ((InterfaceC1283v9) op.f6525p).o();
        } catch (RemoteException e4) {
            Y9.u("#007 Could not call remote method.", e4);
        }
    }

    @Override // P1.g
    public final void q1() {
        Y9.m("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override // P1.g
    public final void y3() {
        Y9.m("Delay close AdMobCustomTabsAdapter overlay.");
    }
}
