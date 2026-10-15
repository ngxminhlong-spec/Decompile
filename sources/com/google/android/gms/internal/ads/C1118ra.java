package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import n2.InterfaceC1812a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.ra, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1118ra extends AbstractC1106r4 implements InterfaceC1204ta {
    public C1118ra(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay", 0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1204ta
    public final void C0(Bundle bundle) {
        Parcel Q3 = Q();
        AbstractC1192t4.c(Q3, bundle);
        G1(Q3, 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1204ta
    public final boolean G2() {
        Parcel q12 = q1(Q(), 11);
        ClassLoader classLoader = AbstractC1192t4.f10673a;
        boolean z4 = q12.readInt() != 0;
        q12.recycle();
        return z4;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1204ta
    public final void M() {
        G1(Q(), 4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1204ta
    public final void X1(InterfaceC1812a interfaceC1812a) {
        Parcel Q3 = Q();
        AbstractC1192t4.e(Q3, interfaceC1812a);
        G1(Q3, 13);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1204ta
    public final void b() {
        G1(Q(), 14);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1204ta
    public final void c1(Bundle bundle) {
        Parcel Q3 = Q();
        AbstractC1192t4.c(Q3, bundle);
        Parcel q12 = q1(Q3, 6);
        if (q12.readInt() != 0) {
            bundle.readFromParcel(q12);
        }
        q12.recycle();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1204ta
    public final void e3(int i4, String[] strArr, int[] iArr) {
        Parcel Q3 = Q();
        Q3.writeInt(i4);
        Q3.writeStringArray(strArr);
        Q3.writeIntArray(iArr);
        G1(Q3, 15);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1204ta
    public final void g() {
        G1(Q(), 10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1204ta
    public final void j2(int i4, int i5, Intent intent) {
        Parcel Q3 = Q();
        Q3.writeInt(i4);
        Q3.writeInt(i5);
        AbstractC1192t4.c(Q3, intent);
        G1(Q3, 12);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1204ta
    public final void n() {
        G1(Q(), 5);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1204ta
    public final void p() {
        G1(Q(), 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1204ta
    public final void q() {
        G1(Q(), 8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1204ta
    public final void s() {
        G1(Q(), 7);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1204ta
    public final void w() {
        G1(Q(), 9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1204ta
    public final void x() {
        G1(Q(), 3);
    }
}
