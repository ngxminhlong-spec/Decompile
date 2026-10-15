package com.google.android.gms.internal.ads;

import O1.AbstractBinderC0087s0;
import O1.InterfaceC0084q0;
import O1.InterfaceC0089t0;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import n2.InterfaceC1812a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class S7 extends AbstractC1106r4 implements T7 {
    @Override // com.google.android.gms.internal.ads.T7
    public final String D() {
        Parcel q12 = q1(Q(), 10);
        String readString = q12.readString();
        q12.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.T7
    public final double a() {
        Parcel q12 = q1(Q(), 8);
        double readDouble = q12.readDouble();
        q12.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.T7
    public final InterfaceC0089t0 f() {
        Parcel q12 = q1(Q(), 11);
        InterfaceC0089t0 K32 = AbstractBinderC0087s0.K3(q12.readStrongBinder());
        q12.recycle();
        return K32;
    }

    @Override // com.google.android.gms.internal.ads.T7
    public final InterfaceC0895m7 g() {
        InterfaceC0895m7 c0809k7;
        Parcel q12 = q1(Q(), 14);
        IBinder readStrongBinder = q12.readStrongBinder();
        if (readStrongBinder == null) {
            c0809k7 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            c0809k7 = queryLocalInterface instanceof InterfaceC0895m7 ? (InterfaceC0895m7) queryLocalInterface : new C0809k7(readStrongBinder);
        }
        q12.recycle();
        return c0809k7;
    }

    @Override // com.google.android.gms.internal.ads.T7
    public final InterfaceC0084q0 h() {
        Parcel q12 = q1(Q(), 31);
        InterfaceC0084q0 K32 = Fg.K3(q12.readStrongBinder());
        q12.recycle();
        return K32;
    }

    @Override // com.google.android.gms.internal.ads.T7
    public final InterfaceC1109r7 k() {
        InterfaceC1109r7 c1067q7;
        Parcel q12 = q1(Q(), 5);
        IBinder readStrongBinder = q12.readStrongBinder();
        if (readStrongBinder == null) {
            c1067q7 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            c1067q7 = queryLocalInterface instanceof InterfaceC1109r7 ? (InterfaceC1109r7) queryLocalInterface : new C1067q7(readStrongBinder);
        }
        q12.recycle();
        return c1067q7;
    }

    @Override // com.google.android.gms.internal.ads.T7
    public final InterfaceC1812a l() {
        return U.a.o(q1(Q(), 19));
    }

    @Override // com.google.android.gms.internal.ads.T7
    public final String m() {
        Parcel q12 = q1(Q(), 7);
        String readString = q12.readString();
        q12.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.T7
    public final String n() {
        Parcel q12 = q1(Q(), 4);
        String readString = q12.readString();
        q12.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.T7
    public final String o() {
        Parcel q12 = q1(Q(), 6);
        String readString = q12.readString();
        q12.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.T7
    public final String p() {
        Parcel q12 = q1(Q(), 2);
        String readString = q12.readString();
        q12.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.T7
    public final InterfaceC1812a q() {
        return U.a.o(q1(Q(), 18));
    }

    @Override // com.google.android.gms.internal.ads.T7
    public final List s() {
        Parcel q12 = q1(Q(), 3);
        ArrayList readArrayList = q12.readArrayList(AbstractC1192t4.f10673a);
        q12.recycle();
        return readArrayList;
    }

    @Override // com.google.android.gms.internal.ads.T7
    public final List t() {
        Parcel q12 = q1(Q(), 23);
        ArrayList readArrayList = q12.readArrayList(AbstractC1192t4.f10673a);
        q12.recycle();
        return readArrayList;
    }

    @Override // com.google.android.gms.internal.ads.T7
    public final String x() {
        Parcel q12 = q1(Q(), 9);
        String readString = q12.readString();
        q12.recycle();
        return readString;
    }
}
