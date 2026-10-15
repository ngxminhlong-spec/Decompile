package com.google.android.gms.internal.ads;

import O1.AbstractBinderC0087s0;
import O1.InterfaceC0089t0;
import android.os.Bundle;
import android.os.Parcel;
import n2.BinderC1813b;
import n2.InterfaceC1812a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class U9 extends AbstractC1106r4 implements V9 {
    @Override // com.google.android.gms.internal.ads.V9
    public final void I0(String str, String str2, O1.U0 u02, InterfaceC1812a interfaceC1812a, L9 l9, InterfaceC1283v9 interfaceC1283v9) {
        Parcel Q3 = Q();
        Q3.writeString(str);
        Q3.writeString(str2);
        AbstractC1192t4.c(Q3, u02);
        AbstractC1192t4.e(Q3, interfaceC1812a);
        AbstractC1192t4.e(Q3, l9);
        AbstractC1192t4.e(Q3, interfaceC1283v9);
        G1(Q3, 23);
    }

    @Override // com.google.android.gms.internal.ads.V9
    public final void R1(String str, String str2, O1.U0 u02, InterfaceC1812a interfaceC1812a, N9 n9, InterfaceC1283v9 interfaceC1283v9, O1.X0 x02) {
        Parcel Q3 = Q();
        Q3.writeString(str);
        Q3.writeString(str2);
        AbstractC1192t4.c(Q3, u02);
        AbstractC1192t4.e(Q3, interfaceC1812a);
        AbstractC1192t4.e(Q3, n9);
        AbstractC1192t4.e(Q3, interfaceC1283v9);
        AbstractC1192t4.c(Q3, x02);
        G1(Q3, 13);
    }

    @Override // com.google.android.gms.internal.ads.V9
    public final void T1(String str, String str2, O1.U0 u02, InterfaceC1812a interfaceC1812a, R9 r9, InterfaceC1283v9 interfaceC1283v9, C0766j7 c0766j7) {
        Parcel Q3 = Q();
        Q3.writeString(str);
        Q3.writeString(str2);
        AbstractC1192t4.c(Q3, u02);
        AbstractC1192t4.e(Q3, interfaceC1812a);
        AbstractC1192t4.e(Q3, r9);
        AbstractC1192t4.e(Q3, interfaceC1283v9);
        AbstractC1192t4.c(Q3, c0766j7);
        G1(Q3, 22);
    }

    @Override // com.google.android.gms.internal.ads.V9
    public final void U2(String str, String str2, O1.U0 u02, InterfaceC1812a interfaceC1812a, N9 n9, InterfaceC1283v9 interfaceC1283v9, O1.X0 x02) {
        Parcel Q3 = Q();
        Q3.writeString(str);
        Q3.writeString(str2);
        AbstractC1192t4.c(Q3, u02);
        AbstractC1192t4.e(Q3, interfaceC1812a);
        AbstractC1192t4.e(Q3, n9);
        AbstractC1192t4.e(Q3, interfaceC1283v9);
        AbstractC1192t4.c(Q3, x02);
        G1(Q3, 21);
    }

    @Override // com.google.android.gms.internal.ads.V9
    public final boolean X(InterfaceC1812a interfaceC1812a) {
        Parcel Q3 = Q();
        AbstractC1192t4.e(Q3, interfaceC1812a);
        Parcel q12 = q1(Q3, 15);
        boolean z4 = q12.readInt() != 0;
        q12.recycle();
        return z4;
    }

    @Override // com.google.android.gms.internal.ads.V9
    public final InterfaceC0089t0 a() {
        Parcel q12 = q1(Q(), 5);
        InterfaceC0089t0 K32 = AbstractBinderC0087s0.K3(q12.readStrongBinder());
        q12.recycle();
        return K32;
    }

    @Override // com.google.android.gms.internal.ads.V9
    public final C0435ba d() {
        Parcel q12 = q1(Q(), 2);
        C0435ba c0435ba = (C0435ba) AbstractC1192t4.a(q12, C0435ba.CREATOR);
        q12.recycle();
        return c0435ba;
    }

    @Override // com.google.android.gms.internal.ads.V9
    public final boolean f0(InterfaceC1812a interfaceC1812a) {
        Parcel Q3 = Q();
        AbstractC1192t4.e(Q3, interfaceC1812a);
        Parcel q12 = q1(Q3, 24);
        boolean z4 = q12.readInt() != 0;
        q12.recycle();
        return z4;
    }

    @Override // com.google.android.gms.internal.ads.V9
    public final C0435ba h() {
        Parcel q12 = q1(Q(), 3);
        C0435ba c0435ba = (C0435ba) AbstractC1192t4.a(q12, C0435ba.CREATOR);
        q12.recycle();
        return c0435ba;
    }

    @Override // com.google.android.gms.internal.ads.V9
    public final void i2(String str, String str2, O1.U0 u02, InterfaceC1812a interfaceC1812a, P9 p9, InterfaceC1283v9 interfaceC1283v9) {
        Parcel Q3 = Q();
        Q3.writeString(str);
        Q3.writeString(str2);
        AbstractC1192t4.c(Q3, u02);
        AbstractC1192t4.e(Q3, interfaceC1812a);
        AbstractC1192t4.e(Q3, p9);
        AbstractC1192t4.e(Q3, interfaceC1283v9);
        G1(Q3, 14);
    }

    @Override // com.google.android.gms.internal.ads.V9
    public final void j3(String str) {
        Parcel Q3 = Q();
        Q3.writeString(str);
        G1(Q3, 19);
    }

    @Override // com.google.android.gms.internal.ads.V9
    public final void s1(InterfaceC1812a interfaceC1812a, String str, Bundle bundle, Bundle bundle2, O1.X0 x02, X9 x9) {
        Parcel Q3 = Q();
        AbstractC1192t4.e(Q3, interfaceC1812a);
        Q3.writeString(str);
        AbstractC1192t4.c(Q3, bundle);
        AbstractC1192t4.c(Q3, bundle2);
        AbstractC1192t4.c(Q3, x02);
        AbstractC1192t4.e(Q3, x9);
        G1(Q3, 1);
    }

    @Override // com.google.android.gms.internal.ads.V9
    public final void t1(String str, String str2, O1.U0 u02, InterfaceC1812a interfaceC1812a, T9 t9, InterfaceC1283v9 interfaceC1283v9) {
        Parcel Q3 = Q();
        Q3.writeString(str);
        Q3.writeString(str2);
        AbstractC1192t4.c(Q3, u02);
        AbstractC1192t4.e(Q3, interfaceC1812a);
        AbstractC1192t4.e(Q3, t9);
        AbstractC1192t4.e(Q3, interfaceC1283v9);
        G1(Q3, 20);
    }

    @Override // com.google.android.gms.internal.ads.V9
    public final boolean w2(BinderC1813b binderC1813b) {
        Parcel Q3 = Q();
        AbstractC1192t4.e(Q3, binderC1813b);
        Parcel q12 = q1(Q3, 17);
        boolean z4 = q12.readInt() != 0;
        q12.recycle();
        return z4;
    }

    @Override // com.google.android.gms.internal.ads.V9
    public final void x0(String str, String str2, O1.U0 u02, BinderC1813b binderC1813b, Lm lm, InterfaceC1283v9 interfaceC1283v9) {
        Parcel Q3 = Q();
        Q3.writeString(str);
        Q3.writeString(str2);
        AbstractC1192t4.c(Q3, u02);
        AbstractC1192t4.e(Q3, binderC1813b);
        AbstractC1192t4.e(Q3, lm);
        AbstractC1192t4.e(Q3, interfaceC1283v9);
        G1(Q3, 18);
    }

    @Override // com.google.android.gms.internal.ads.V9
    public final void z0(String str, String str2, O1.U0 u02, InterfaceC1812a interfaceC1812a, T9 t9, InterfaceC1283v9 interfaceC1283v9) {
        Parcel Q3 = Q();
        Q3.writeString(str);
        Q3.writeString(str2);
        AbstractC1192t4.c(Q3, u02);
        AbstractC1192t4.e(Q3, interfaceC1812a);
        AbstractC1192t4.e(Q3, t9);
        AbstractC1192t4.e(Q3, interfaceC1283v9);
        G1(Q3, 16);
    }
}
