package com.google.android.gms.internal.ads;

import O1.C0101z0;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.t9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1197t9 extends AbstractC1106r4 implements InterfaceC1283v9 {
    public C1197t9(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener", 0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1283v9
    public final void F1(int i4) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1283v9
    public final void H1(C0101z0 c0101z0) {
        Parcel Q3 = Q();
        AbstractC1192t4.c(Q3, c0101z0);
        G1(Q3, 23);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1283v9
    public final void K0() {
        G1(Q(), 13);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1283v9
    public final void L0(C7 c7, String str) {
        Parcel Q3 = Q();
        AbstractC1192t4.e(Q3, c7);
        Q3.writeString(str);
        G1(Q3, 10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1283v9
    public final void N(String str) {
        Parcel Q3 = Q();
        Q3.writeString(str);
        G1(Q3, 21);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1283v9
    public final void S1(String str, String str2) {
        Parcel Q3 = Q();
        Q3.writeString(str);
        Q3.writeString(str2);
        G1(Q3, 9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1283v9
    public final void Z() {
        G1(Q(), 15);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1283v9
    public final void Z2(String str, int i4) {
        Parcel Q3 = Q();
        Q3.writeInt(i4);
        Q3.writeString(str);
        G1(Q3, 22);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1283v9
    public final void a() {
        G1(Q(), 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1283v9
    public final void b() {
        G1(Q(), 11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1283v9
    public final void d() {
        G1(Q(), 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1283v9
    public final void j1(InterfaceC1034pb interfaceC1034pb) {
        Parcel Q3 = Q();
        AbstractC1192t4.e(Q3, interfaceC1034pb);
        G1(Q3, 16);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1283v9
    public final void m() {
        G1(Q(), 4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1283v9
    public final void n() {
        G1(Q(), 6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1283v9
    public final void n3(C0101z0 c0101z0) {
        Parcel Q3 = Q();
        AbstractC1192t4.c(Q3, c0101z0);
        G1(Q3, 24);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1283v9
    public final void o() {
        G1(Q(), 5);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1283v9
    public final void q() {
        G1(Q(), 8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1283v9
    public final void s() {
        G1(Q(), 18);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1283v9
    public final void v(int i4) {
        Parcel Q3 = Q();
        Q3.writeInt(i4);
        G1(Q3, 3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1283v9
    public final void v2(C0948nb c0948nb) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1283v9
    public final void w() {
        G1(Q(), 20);
    }
}
