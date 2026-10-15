package com.google.android.gms.internal.ads;

import android.os.Parcel;
import n2.BinderC1813b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Rr extends AbstractBinderC1149s4 implements Qr {
    public Rr() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.ads.Qr
    public final void G3(BinderC1813b binderC1813b, String str) {
    }

    @Override // com.google.android.gms.internal.ads.Qr
    public final void J0(int i4) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1149s4
    public final boolean J3(int i4, Parcel parcel, Parcel parcel2) {
        switch (i4) {
            case 2:
                BinderC1813b.G1(parcel.readStrongBinder());
                parcel.readString();
                AbstractC1192t4.b(parcel);
                break;
            case 3:
                break;
            case 4:
                parcel.createIntArray();
                AbstractC1192t4.b(parcel);
                break;
            case 5:
                parcel.createByteArray();
                AbstractC1192t4.b(parcel);
                break;
            case 6:
                parcel.readInt();
                AbstractC1192t4.b(parcel);
                break;
            case 7:
                parcel.readInt();
                AbstractC1192t4.b(parcel);
                break;
            case 8:
                BinderC1813b.G1(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                AbstractC1192t4.b(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.Qr
    public final void T2(byte[] bArr) {
    }

    @Override // com.google.android.gms.internal.ads.Qr
    public final void d() {
    }

    @Override // com.google.android.gms.internal.ads.Qr
    public final void i3() {
    }

    @Override // com.google.android.gms.internal.ads.Qr
    public final void v(int i4) {
    }
}
