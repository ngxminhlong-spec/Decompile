package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Ia, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0285Ia extends AbstractBinderC1149s4 {
    @Override // com.google.android.gms.internal.ads.AbstractBinderC1149s4
    public final boolean J3(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 != 1) {
            return false;
        }
        N1.n.f1204A.f1209g.h("FlagsAccessedBeforeInitialized", new Exception("Flags were accessed before initialized."));
        parcel2.writeNoException();
        return true;
    }
}
