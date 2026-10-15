package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.l7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0852l7 extends AbstractBinderC1149s4 implements InterfaceC0895m7 {
    public static InterfaceC0895m7 K3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        return queryLocalInterface instanceof InterfaceC0895m7 ? (InterfaceC0895m7) queryLocalInterface : new C0809k7(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1149s4
    public final boolean J3(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 == 2) {
            parcel2.writeNoException();
            parcel2.writeString(((BinderC0596f7) this).f8681o);
            return true;
        }
        if (i4 != 3) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeList(((BinderC0596f7) this).f8683q);
        return true;
    }
}
