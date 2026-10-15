package com.google.android.gms.internal.ads;

import O1.C0101z0;
import android.os.Parcel;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.tm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1216tm extends AbstractBinderC1149s4 implements L9 {

    /* renamed from: o, reason: collision with root package name */
    public final C0873lm f10736o;

    public BinderC1216tm(C0873lm c0873lm) {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
        this.f10736o = c0873lm;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1149s4
    public final boolean J3(int i4, Parcel parcel, Parcel parcel2) {
        C0873lm c0873lm = this.f10736o;
        if (i4 == 2) {
            ((Dm) c0873lm.c).n();
        } else if (i4 == 3) {
            String readString = parcel.readString();
            AbstractC1192t4.b(parcel);
            ((Dm) c0873lm.c).Z2(readString, 0);
        } else {
            if (i4 != 4) {
                return false;
            }
            C0101z0 c0101z0 = (C0101z0) AbstractC1192t4.a(parcel, C0101z0.CREATOR);
            AbstractC1192t4.b(parcel);
            r(c0101z0);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.L9
    public final void r(C0101z0 c0101z0) {
        ((Dm) this.f10736o.c).H1(c0101z0);
    }
}
