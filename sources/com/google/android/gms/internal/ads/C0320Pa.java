package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Pa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0320Pa extends AbstractC1106r4 implements InterfaceC0325Qa {
    @Override // com.google.android.gms.internal.ads.InterfaceC0325Qa
    public final void B2(C0370Za c0370Za, InterfaceC0360Xa interfaceC0360Xa) {
        Parcel Q3 = Q();
        AbstractC1192t4.c(Q3, c0370Za);
        AbstractC1192t4.e(Q3, interfaceC0360Xa);
        G1(Q3, 6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0325Qa
    public final void I1(C0370Za c0370Za, InterfaceC0360Xa interfaceC0360Xa) {
        Parcel Q3 = Q();
        AbstractC1192t4.c(Q3, c0370Za);
        AbstractC1192t4.e(Q3, interfaceC0360Xa);
        G1(Q3, 5);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0325Qa
    public final void Q0(C0370Za c0370Za, InterfaceC0360Xa interfaceC0360Xa) {
        Parcel Q3 = Q();
        AbstractC1192t4.c(Q3, c0370Za);
        AbstractC1192t4.e(Q3, interfaceC0360Xa);
        G1(Q3, 4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0325Qa
    public final void v1(String str, InterfaceC0360Xa interfaceC0360Xa) {
        Parcel Q3 = Q();
        Q3.writeString(str);
        AbstractC1192t4.e(Q3, interfaceC0360Xa);
        G1(Q3, 7);
    }
}
