package com.google.android.gms.internal.ads;

import O1.C0101z0;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.xb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1377xb extends AbstractC1106r4 implements InterfaceC1463zb {
    public C1377xb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback", 0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1463zb
    public final void A(int i4) {
        Parcel Q3 = Q();
        Q3.writeInt(i4);
        G1(Q3, 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1463zb
    public final void h() {
        G1(Q(), 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1463zb
    public final void r(C0101z0 c0101z0) {
        Parcel Q3 = Q();
        AbstractC1192t4.c(Q3, c0101z0);
        G1(Q3, 3);
    }
}
