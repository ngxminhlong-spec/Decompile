package com.google.android.gms.internal.ads;

import O1.InterfaceC0084q0;
import android.os.IBinder;
import android.os.Parcel;
import n2.InterfaceC1812a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.qb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1077qb extends AbstractC1106r4 implements InterfaceC1162sb {
    public C1077qb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd", 0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1162sb
    public final void I(InterfaceC1812a interfaceC1812a) {
        Parcel Q3 = Q();
        AbstractC1192t4.e(Q3, interfaceC1812a);
        G1(Q3, 5);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1162sb
    public final void O0(O1.U0 u02, InterfaceC1463zb interfaceC1463zb) {
        Parcel Q3 = Q();
        AbstractC1192t4.c(Q3, u02);
        AbstractC1192t4.e(Q3, interfaceC1463zb);
        G1(Q3, 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1162sb
    public final void O1(O1.U0 u02, InterfaceC1463zb interfaceC1463zb) {
        Parcel Q3 = Q();
        AbstractC1192t4.c(Q3, u02);
        AbstractC1192t4.e(Q3, interfaceC1463zb);
        G1(Q3, 14);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1162sb
    public final void Y0(InterfaceC1291vb interfaceC1291vb) {
        Parcel Q3 = Q();
        AbstractC1192t4.e(Q3, interfaceC1291vb);
        G1(Q3, 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1162sb
    public final InterfaceC0084q0 e() {
        Parcel q12 = q1(Q(), 12);
        InterfaceC0084q0 K32 = Fg.K3(q12.readStrongBinder());
        q12.recycle();
        return K32;
    }
}
