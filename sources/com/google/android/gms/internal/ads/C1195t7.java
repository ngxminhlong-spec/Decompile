package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import n2.BinderC1813b;
import n2.InterfaceC1812a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.t7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1195t7 extends AbstractC1106r4 implements InterfaceC1281v7 {
    public C1195t7(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate", 0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1281v7
    public final InterfaceC1812a B(String str) {
        Parcel Q3 = Q();
        Q3.writeString(str);
        return U.a.o(q1(Q3, 2));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1281v7
    public final void D2(InterfaceC1024p7 interfaceC1024p7) {
        Parcel Q3 = Q();
        ClassLoader classLoader = AbstractC1192t4.f10673a;
        Q3.writeStrongBinder(null);
        G1(Q3, 8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1281v7
    public final void F0(BinderC1813b binderC1813b, int i4) {
        Parcel Q3 = Q();
        AbstractC1192t4.e(Q3, binderC1813b);
        Q3.writeInt(i4);
        G1(Q3, 5);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1281v7
    public final void H0(InterfaceC1812a interfaceC1812a) {
        Parcel Q3 = Q();
        AbstractC1192t4.e(Q3, interfaceC1812a);
        G1(Q3, 7);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1281v7
    public final void P2(String str, InterfaceC1812a interfaceC1812a) {
        Parcel Q3 = Q();
        Q3.writeString(str);
        AbstractC1192t4.e(Q3, interfaceC1812a);
        G1(Q3, 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1281v7
    public final void V1(InterfaceC1812a interfaceC1812a) {
        Parcel Q3 = Q();
        AbstractC1192t4.e(Q3, interfaceC1812a);
        G1(Q3, 6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1281v7
    public final void h3(InterfaceC1812a interfaceC1812a) {
        Parcel Q3 = Q();
        AbstractC1192t4.e(Q3, interfaceC1812a);
        G1(Q3, 3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1281v7
    public final void k2(InterfaceC1812a interfaceC1812a) {
        Parcel Q3 = Q();
        AbstractC1192t4.e(Q3, interfaceC1812a);
        G1(Q3, 9);
    }
}
