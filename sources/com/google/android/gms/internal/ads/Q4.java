package com.google.android.gms.internal.ads;

import O1.C0101z0;
import android.os.Parcel;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Q4 extends AbstractBinderC1149s4 implements X4 {
    @Override // com.google.android.gms.internal.ads.AbstractBinderC1149s4
    public final boolean J3(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 != 1 && i4 != 2) {
            if (i4 == 3) {
                AbstractC1192t4.b(parcel);
            } else if (i4 != 4 && i4 != 5) {
                return false;
            }
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.X4
    public final void T(C0101z0 c0101z0) {
    }

    @Override // com.google.android.gms.internal.ads.X4
    public final void a() {
    }

    @Override // com.google.android.gms.internal.ads.X4
    public final void c() {
    }

    @Override // com.google.android.gms.internal.ads.X4
    public final void d() {
    }

    @Override // com.google.android.gms.internal.ads.X4
    public final void e() {
    }
}
