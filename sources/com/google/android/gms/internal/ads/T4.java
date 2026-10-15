package com.google.android.gms.internal.ads;

import O1.C0101z0;
import android.os.Parcel;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class T4 extends AbstractC1106r4 implements U4 {
    @Override // com.google.android.gms.internal.ads.U4
    public final void R2(C0101z0 c0101z0) {
        Parcel Q3 = Q();
        AbstractC1192t4.c(Q3, c0101z0);
        G1(Q3, 3);
    }

    @Override // com.google.android.gms.internal.ads.U4
    public final void r3(S4 s4) {
        Parcel Q3 = Q();
        AbstractC1192t4.e(Q3, s4);
        G1(Q3, 1);
    }

    @Override // com.google.android.gms.internal.ads.U4
    public final void u(int i4) {
        Parcel Q3 = Q();
        Q3.writeInt(i4);
        G1(Q3, 2);
    }
}
