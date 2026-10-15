package com.google.android.gms.internal.ads;

import Q1.C0117p;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Ua, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0345Ua extends AbstractC1106r4 implements InterfaceC0350Va {
    public C0345Ua(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdsServiceResponseListener", 0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0350Va
    public final void J(ParcelFileDescriptor parcelFileDescriptor) {
        Parcel Q3 = Q();
        AbstractC1192t4.c(Q3, parcelFileDescriptor);
        G1(Q3, 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0350Va
    public final void c0(C0117p c0117p) {
        Parcel Q3 = Q();
        AbstractC1192t4.c(Q3, c0117p);
        G1(Q3, 2);
    }
}
