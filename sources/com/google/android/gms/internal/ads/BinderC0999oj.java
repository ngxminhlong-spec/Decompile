package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.oj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0999oj extends AbstractBinderC1149s4 implements F8 {
    @Override // com.google.android.gms.internal.ads.F8
    public final void A(int i4) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1149s4
    public final boolean J3(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 != 1) {
            if (i4 != 2) {
                return false;
            }
            parcel.readInt();
            AbstractC1192t4.b(parcel);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.F8
    public final void d() {
    }
}
