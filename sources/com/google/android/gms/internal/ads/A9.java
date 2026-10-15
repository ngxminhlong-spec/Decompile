package com.google.android.gms.internal.ads;

import O1.AbstractBinderC0087s0;
import O1.InterfaceC0089t0;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import n2.InterfaceC1812a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class A9 extends AbstractC1106r4 implements B9 {
    public A9(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper", 0);
    }

    @Override // com.google.android.gms.internal.ads.B9
    public final String C() {
        Parcel q12 = q1(Q(), 6);
        String readString = q12.readString();
        q12.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.B9
    public final String D() {
        Parcel q12 = q1(Q(), 2);
        String readString = q12.readString();
        q12.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.B9
    public final boolean G() {
        Parcel q12 = q1(Q(), 18);
        ClassLoader classLoader = AbstractC1192t4.f10673a;
        boolean z4 = q12.readInt() != 0;
        q12.recycle();
        return z4;
    }

    @Override // com.google.android.gms.internal.ads.B9
    public final void I2(InterfaceC1812a interfaceC1812a) {
        Parcel Q3 = Q();
        AbstractC1192t4.e(Q3, interfaceC1812a);
        G1(Q3, 20);
    }

    @Override // com.google.android.gms.internal.ads.B9
    public final void I3(InterfaceC1812a interfaceC1812a) {
        Parcel Q3 = Q();
        AbstractC1192t4.e(Q3, interfaceC1812a);
        G1(Q3, 22);
    }

    @Override // com.google.android.gms.internal.ads.B9
    public final double a() {
        Parcel q12 = q1(Q(), 8);
        double readDouble = q12.readDouble();
        q12.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.B9
    public final void b3(InterfaceC1812a interfaceC1812a, InterfaceC1812a interfaceC1812a2, InterfaceC1812a interfaceC1812a3) {
        Parcel Q3 = Q();
        AbstractC1192t4.e(Q3, interfaceC1812a);
        AbstractC1192t4.e(Q3, interfaceC1812a2);
        AbstractC1192t4.e(Q3, interfaceC1812a3);
        G1(Q3, 21);
    }

    @Override // com.google.android.gms.internal.ads.B9
    public final float d() {
        Parcel q12 = q1(Q(), 23);
        float readFloat = q12.readFloat();
        q12.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.B9
    public final float f() {
        Parcel q12 = q1(Q(), 24);
        float readFloat = q12.readFloat();
        q12.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.B9
    public final Bundle g() {
        Parcel q12 = q1(Q(), 16);
        Bundle bundle = (Bundle) AbstractC1192t4.a(q12, Bundle.CREATOR);
        q12.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.B9
    public final float h() {
        Parcel q12 = q1(Q(), 25);
        float readFloat = q12.readFloat();
        q12.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.B9
    public final InterfaceC0089t0 j() {
        Parcel q12 = q1(Q(), 11);
        InterfaceC0089t0 K32 = AbstractBinderC0087s0.K3(q12.readStrongBinder());
        q12.recycle();
        return K32;
    }

    @Override // com.google.android.gms.internal.ads.B9
    public final InterfaceC0895m7 k() {
        Parcel q12 = q1(Q(), 12);
        InterfaceC0895m7 K32 = AbstractBinderC0852l7.K3(q12.readStrongBinder());
        q12.recycle();
        return K32;
    }

    @Override // com.google.android.gms.internal.ads.B9
    public final InterfaceC1109r7 l() {
        Parcel q12 = q1(Q(), 5);
        InterfaceC1109r7 K32 = BinderC0682h7.K3(q12.readStrongBinder());
        q12.recycle();
        return K32;
    }

    @Override // com.google.android.gms.internal.ads.B9
    public final InterfaceC1812a m() {
        return U.a.o(q1(Q(), 14));
    }

    @Override // com.google.android.gms.internal.ads.B9
    public final InterfaceC1812a n() {
        return U.a.o(q1(Q(), 15));
    }

    @Override // com.google.android.gms.internal.ads.B9
    public final String o() {
        Parcel q12 = q1(Q(), 7);
        String readString = q12.readString();
        q12.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.B9
    public final String p() {
        Parcel q12 = q1(Q(), 4);
        String readString = q12.readString();
        q12.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.B9
    public final InterfaceC1812a q() {
        return U.a.o(q1(Q(), 13));
    }

    @Override // com.google.android.gms.internal.ads.B9
    public final String s() {
        Parcel q12 = q1(Q(), 9);
        String readString = q12.readString();
        q12.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.B9
    public final List t() {
        Parcel q12 = q1(Q(), 3);
        ArrayList readArrayList = q12.readArrayList(AbstractC1192t4.f10673a);
        q12.recycle();
        return readArrayList;
    }

    @Override // com.google.android.gms.internal.ads.B9
    public final void w() {
        G1(Q(), 19);
    }

    @Override // com.google.android.gms.internal.ads.B9
    public final String x() {
        Parcel q12 = q1(Q(), 10);
        String readString = q12.readString();
        q12.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.B9
    public final boolean z() {
        Parcel q12 = q1(Q(), 17);
        ClassLoader classLoader = AbstractC1192t4.f10673a;
        boolean z4 = q12.readInt() != 0;
        q12.recycle();
        return z4;
    }
}
