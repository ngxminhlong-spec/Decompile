package com.google.android.gms.internal.ads;

import O1.AbstractBinderC0087s0;
import O1.InterfaceC0089t0;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import n2.InterfaceC1812a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.r9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1111r9 extends AbstractC1106r4 implements InterfaceC1154s9 {
    @Override // com.google.android.gms.internal.ads.InterfaceC1154s9
    public final void C1(InterfaceC1812a interfaceC1812a, InterfaceC1411y8 interfaceC1411y8, ArrayList arrayList) {
        Parcel Q3 = Q();
        AbstractC1192t4.e(Q3, interfaceC1812a);
        AbstractC1192t4.e(Q3, interfaceC1411y8);
        Q3.writeTypedList(arrayList);
        G1(Q3, 31);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1154s9
    public final boolean E() {
        Parcel q12 = q1(Q(), 22);
        ClassLoader classLoader = AbstractC1192t4.f10673a;
        boolean z4 = q12.readInt() != 0;
        q12.recycle();
        return z4;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1154s9
    public final void F2(InterfaceC1812a interfaceC1812a, O1.U0 u02, String str, InterfaceC1283v9 interfaceC1283v9) {
        Parcel Q3 = Q();
        AbstractC1192t4.e(Q3, interfaceC1812a);
        AbstractC1192t4.c(Q3, u02);
        Q3.writeString(str);
        AbstractC1192t4.e(Q3, interfaceC1283v9);
        G1(Q3, 32);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1154s9
    public final boolean H() {
        Parcel q12 = q1(Q(), 13);
        ClassLoader classLoader = AbstractC1192t4.f10673a;
        boolean z4 = q12.readInt() != 0;
        q12.recycle();
        return z4;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1154s9
    public final void J2(InterfaceC1812a interfaceC1812a, O1.U0 u02, String str, String str2, InterfaceC1283v9 interfaceC1283v9) {
        Parcel Q3 = Q();
        AbstractC1192t4.e(Q3, interfaceC1812a);
        AbstractC1192t4.c(Q3, u02);
        Q3.writeString(str);
        Q3.writeString(str2);
        AbstractC1192t4.e(Q3, interfaceC1283v9);
        G1(Q3, 7);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1154s9
    public final void L() {
        G1(Q(), 9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1154s9
    public final void M0(InterfaceC1812a interfaceC1812a, O1.U0 u02, String str, InterfaceC1283v9 interfaceC1283v9) {
        Parcel Q3 = Q();
        AbstractC1192t4.e(Q3, interfaceC1812a);
        AbstractC1192t4.c(Q3, u02);
        Q3.writeString(str);
        AbstractC1192t4.e(Q3, interfaceC1283v9);
        G1(Q3, 38);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1154s9
    public final void M2(InterfaceC1812a interfaceC1812a) {
        Parcel Q3 = Q();
        AbstractC1192t4.e(Q3, interfaceC1812a);
        G1(Q3, 39);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1154s9
    public final void N1(InterfaceC1812a interfaceC1812a, O1.U0 u02, InterfaceC0905mb interfaceC0905mb, String str) {
        Parcel Q3 = Q();
        AbstractC1192t4.e(Q3, interfaceC1812a);
        AbstractC1192t4.c(Q3, u02);
        Q3.writeString(null);
        AbstractC1192t4.e(Q3, interfaceC0905mb);
        Q3.writeString(str);
        G1(Q3, 10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.InterfaceC1154s9
    public final C1412y9 P() {
        C1412y9 c1412y9;
        Parcel q12 = q1(Q(), 15);
        IBinder readStrongBinder = q12.readStrongBinder();
        if (readStrongBinder == null) {
            c1412y9 = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            c1412y9 = queryLocalInterface instanceof C1412y9 ? (C1412y9) queryLocalInterface : new AbstractC1106r4(readStrongBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper", 0);
        }
        q12.recycle();
        return c1412y9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1154s9
    public final void V2() {
        G1(Q(), 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.InterfaceC1154s9
    public final C1455z9 W() {
        C1455z9 c1455z9;
        Parcel q12 = q1(Q(), 16);
        IBinder readStrongBinder = q12.readStrongBinder();
        if (readStrongBinder == null) {
            c1455z9 = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            c1455z9 = queryLocalInterface instanceof C1455z9 ? (C1455z9) queryLocalInterface : new AbstractC1106r4(readStrongBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper", 0);
        }
        q12.recycle();
        return c1455z9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1154s9
    public final void X0(InterfaceC1812a interfaceC1812a) {
        Parcel Q3 = Q();
        AbstractC1192t4.e(Q3, interfaceC1812a);
        G1(Q3, 37);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1154s9
    public final void b1(InterfaceC1812a interfaceC1812a, O1.X0 x02, O1.U0 u02, String str, String str2, InterfaceC1283v9 interfaceC1283v9) {
        Parcel Q3 = Q();
        AbstractC1192t4.e(Q3, interfaceC1812a);
        AbstractC1192t4.c(Q3, x02);
        AbstractC1192t4.c(Q3, u02);
        Q3.writeString(str);
        Q3.writeString(str2);
        AbstractC1192t4.e(Q3, interfaceC1283v9);
        G1(Q3, 35);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1154s9
    public final void d0() {
        G1(Q(), 4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1154s9
    public final InterfaceC0089t0 f() {
        Parcel q12 = q1(Q(), 26);
        InterfaceC0089t0 K32 = AbstractBinderC0087s0.K3(q12.readStrongBinder());
        q12.recycle();
        return K32;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1154s9
    public final C1326w9 j() {
        C1326w9 c1326w9;
        Parcel q12 = q1(Q(), 36);
        IBinder readStrongBinder = q12.readStrongBinder();
        if (readStrongBinder == null) {
            c1326w9 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            c1326w9 = queryLocalInterface instanceof C1326w9 ? (C1326w9) queryLocalInterface : new C1326w9(readStrongBinder);
        }
        q12.recycle();
        return c1326w9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1154s9
    public final B9 k() {
        B9 a9;
        Parcel q12 = q1(Q(), 27);
        IBinder readStrongBinder = q12.readStrongBinder();
        if (readStrongBinder == null) {
            a9 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            a9 = queryLocalInterface instanceof B9 ? (B9) queryLocalInterface : new A9(readStrongBinder);
        }
        q12.recycle();
        return a9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1154s9
    public final void k0(O1.U0 u02, String str) {
        Parcel Q3 = Q();
        AbstractC1192t4.c(Q3, u02);
        Q3.writeString(str);
        G1(Q3, 11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1154s9
    public final C0435ba l() {
        Parcel q12 = q1(Q(), 33);
        C0435ba c0435ba = (C0435ba) AbstractC1192t4.a(q12, C0435ba.CREATOR);
        q12.recycle();
        return c0435ba;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1154s9
    public final InterfaceC1812a m() {
        return U.a.o(q1(Q(), 2));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1154s9
    public final void m3(InterfaceC1812a interfaceC1812a, O1.U0 u02, String str, InterfaceC1283v9 interfaceC1283v9) {
        Parcel Q3 = Q();
        AbstractC1192t4.e(Q3, interfaceC1812a);
        AbstractC1192t4.c(Q3, u02);
        Q3.writeString(str);
        AbstractC1192t4.e(Q3, interfaceC1283v9);
        G1(Q3, 28);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1154s9
    public final void n() {
        G1(Q(), 5);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1154s9
    public final void n0(InterfaceC1812a interfaceC1812a) {
        Parcel Q3 = Q();
        AbstractC1192t4.e(Q3, interfaceC1812a);
        G1(Q3, 30);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1154s9
    public final void o0(InterfaceC1812a interfaceC1812a, O1.U0 u02, String str, String str2, InterfaceC1283v9 interfaceC1283v9, C0766j7 c0766j7, ArrayList arrayList) {
        Parcel Q3 = Q();
        AbstractC1192t4.e(Q3, interfaceC1812a);
        AbstractC1192t4.c(Q3, u02);
        Q3.writeString(str);
        Q3.writeString(str2);
        AbstractC1192t4.e(Q3, interfaceC1283v9);
        AbstractC1192t4.c(Q3, c0766j7);
        Q3.writeStringList(arrayList);
        G1(Q3, 14);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1154s9
    public final void p1() {
        G1(Q(), 8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1154s9
    public final C0435ba q() {
        Parcel q12 = q1(Q(), 34);
        C0435ba c0435ba = (C0435ba) AbstractC1192t4.a(q12, C0435ba.CREATOR);
        q12.recycle();
        return c0435ba;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1154s9
    public final void s2(InterfaceC1812a interfaceC1812a, O1.X0 x02, O1.U0 u02, String str, String str2, InterfaceC1283v9 interfaceC1283v9) {
        Parcel Q3 = Q();
        AbstractC1192t4.e(Q3, interfaceC1812a);
        AbstractC1192t4.c(Q3, x02);
        AbstractC1192t4.c(Q3, u02);
        Q3.writeString(str);
        Q3.writeString(str2);
        AbstractC1192t4.e(Q3, interfaceC1283v9);
        G1(Q3, 6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1154s9
    public final void u2(InterfaceC1812a interfaceC1812a) {
        Parcel Q3 = Q();
        AbstractC1192t4.e(Q3, interfaceC1812a);
        G1(Q3, 21);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1154s9
    public final void u3(InterfaceC1812a interfaceC1812a, InterfaceC0905mb interfaceC0905mb, List list) {
        Parcel Q3 = Q();
        AbstractC1192t4.e(Q3, interfaceC1812a);
        AbstractC1192t4.e(Q3, interfaceC0905mb);
        Q3.writeStringList(list);
        G1(Q3, 23);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1154s9
    public final void x1(boolean z4) {
        Parcel Q3 = Q();
        ClassLoader classLoader = AbstractC1192t4.f10673a;
        Q3.writeInt(z4 ? 1 : 0);
        G1(Q3, 25);
    }
}
