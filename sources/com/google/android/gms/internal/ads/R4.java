package com.google.android.gms.internal.ads;

import O1.InterfaceC0084q0;
import android.os.Parcel;
import n2.InterfaceC1812a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class R4 extends AbstractC1106r4 implements S4 {
    @Override // com.google.android.gms.internal.ads.S4
    public final InterfaceC0084q0 d() {
        Parcel q12 = q1(Q(), 5);
        InterfaceC0084q0 K32 = Fg.K3(q12.readStrongBinder());
        q12.recycle();
        return K32;
    }

    @Override // com.google.android.gms.internal.ads.S4
    public final void o3(InterfaceC1812a interfaceC1812a, X4 x4) {
        Parcel Q3 = Q();
        AbstractC1192t4.e(Q3, interfaceC1812a);
        AbstractC1192t4.e(Q3, x4);
        G1(Q3, 4);
    }
}
