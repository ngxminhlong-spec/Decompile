package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import n2.InterfaceC1812a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.ma, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0904ma extends AbstractC1106r4 implements InterfaceC0947na {
    public C0904ma(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils", 0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0947na
    public final void K1(InterfaceC1812a interfaceC1812a) {
        Parcel Q3 = Q();
        AbstractC1192t4.e(Q3, interfaceC1812a);
        G1(Q3, 4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0947na
    public final void f() {
        G1(Q(), 3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0947na
    public final void f1(InterfaceC1812a interfaceC1812a, String str, String str2) {
        Parcel Q3 = Q();
        AbstractC1192t4.e(Q3, interfaceC1812a);
        Q3.writeString(str);
        Q3.writeString(str2);
        G1(Q3, 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0947na
    public final void j0(Intent intent) {
        Parcel Q3 = Q();
        AbstractC1192t4.c(Q3, intent);
        G1(Q3, 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0947na
    public final void l0(String[] strArr, int[] iArr, InterfaceC1812a interfaceC1812a) {
        Parcel Q3 = Q();
        Q3.writeStringArray(strArr);
        Q3.writeIntArray(iArr);
        AbstractC1192t4.e(Q3, interfaceC1812a);
        G1(Q3, 5);
    }
}
