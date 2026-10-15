package com.google.android.gms.internal.ads;

import android.os.Parcel;
import n2.BinderC1813b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Pr extends AbstractC1106r4 implements Qr {
    @Override // com.google.android.gms.internal.ads.Qr
    public final void G3(BinderC1813b binderC1813b, String str) {
        Parcel Q3 = Q();
        AbstractC1192t4.e(Q3, binderC1813b);
        Q3.writeString(str);
        Q3.writeString(null);
        G1(Q3, 8);
    }

    @Override // com.google.android.gms.internal.ads.Qr
    public final void J0(int i4) {
        Parcel Q3 = Q();
        Q3.writeInt(i4);
        G1(Q3, 6);
    }

    @Override // com.google.android.gms.internal.ads.Qr
    public final void T2(byte[] bArr) {
        Parcel Q3 = Q();
        Q3.writeByteArray(bArr);
        G1(Q3, 5);
    }

    @Override // com.google.android.gms.internal.ads.Qr
    public final void d() {
        G1(Q(), 3);
    }

    @Override // com.google.android.gms.internal.ads.Qr
    public final void i3() {
        Parcel Q3 = Q();
        Q3.writeIntArray(null);
        G1(Q3, 4);
    }

    @Override // com.google.android.gms.internal.ads.Qr
    public final void v(int i4) {
        Parcel Q3 = Q();
        Q3.writeInt(i4);
        G1(Q3, 7);
    }
}
