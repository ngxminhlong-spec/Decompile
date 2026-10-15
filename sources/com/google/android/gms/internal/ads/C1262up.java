package com.google.android.gms.internal.ads;

import O1.C0070j0;
import android.os.RemoteException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.up, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1262up implements Y1.a {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f10946o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ AbstractC1106r4 f10947p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ AbstractBinderC1149s4 f10948q;

    public /* synthetic */ C1262up(AbstractBinderC1149s4 abstractBinderC1149s4, AbstractC1106r4 abstractC1106r4, int i4) {
        this.f10946o = i4;
        this.f10948q = abstractBinderC1149s4;
        this.f10947p = abstractC1106r4;
    }

    @Override // Y1.a
    public final void l() {
        switch (this.f10946o) {
            case 0:
                if (((BinderC1305vp) this.f10948q).f11074x != null) {
                    try {
                        C0070j0 c0070j0 = (C0070j0) this.f10947p;
                        c0070j0.G1(c0070j0.Q(), 1);
                        return;
                    } catch (RemoteException e4) {
                        Y9.u("#007 Could not call remote method.", e4);
                        return;
                    }
                }
                return;
            default:
                if (((BinderC1348wp) this.f10948q).f11211r != null) {
                    try {
                        O1.L l4 = (O1.L) this.f10947p;
                        l4.G1(l4.Q(), 1);
                        return;
                    } catch (RemoteException e5) {
                        Y9.u("#007 Could not call remote method.", e5);
                        return;
                    }
                }
                return;
        }
    }
}
