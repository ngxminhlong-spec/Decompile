package com.google.android.gms.internal.ads;

import O1.C0101z0;
import android.os.Parcel;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.yb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1420yb extends AbstractBinderC1149s4 implements InterfaceC1463zb {
    public AbstractBinderC1420yb() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1149s4
    public final boolean J3(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 == 1) {
            h();
        } else if (i4 == 2) {
            int readInt = parcel.readInt();
            AbstractC1192t4.b(parcel);
            A(readInt);
        } else {
            if (i4 != 3) {
                return false;
            }
            C0101z0 c0101z0 = (C0101z0) AbstractC1192t4.a(parcel, C0101z0.CREATOR);
            AbstractC1192t4.b(parcel);
            r(c0101z0);
        }
        parcel2.writeNoException();
        return true;
    }
}
