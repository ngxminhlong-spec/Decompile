package com.google.android.gms.internal.ads;

import O1.C0101z0;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class O4 extends AbstractBinderC1149s4 implements U4 {

    /* renamed from: o, reason: collision with root package name */
    public final Rk f6434o;

    public O4(Rk rk, String str) {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
        this.f6434o = rk;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.android.gms.internal.ads.r4] */
    @Override // com.google.android.gms.internal.ads.AbstractBinderC1149s4
    public final boolean J3(int i4, Parcel parcel, Parcel parcel2) {
        S4 abstractC1106r4;
        if (i4 == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                abstractC1106r4 = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
                abstractC1106r4 = queryLocalInterface instanceof S4 ? (S4) queryLocalInterface : new AbstractC1106r4(readStrongBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd", 0);
            }
            AbstractC1192t4.b(parcel);
            r3(abstractC1106r4);
        } else if (i4 == 2) {
            parcel.readInt();
            AbstractC1192t4.b(parcel);
        } else {
            if (i4 != 3) {
                return false;
            }
            C0101z0 c0101z0 = (C0101z0) AbstractC1192t4.a(parcel, C0101z0.CREATOR);
            AbstractC1192t4.b(parcel);
            R2(c0101z0);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.U4
    public final void R2(C0101z0 c0101z0) {
        Rk rk = this.f6434o;
        if (rk != null) {
            rk.b(c0101z0.i());
        }
    }

    @Override // com.google.android.gms.internal.ads.U4
    public final void r3(S4 s4) {
        Rk rk = this.f6434o;
        if (rk != null) {
            rk.e(new P4(s4));
        }
    }

    @Override // com.google.android.gms.internal.ads.U4
    public final void u(int i4) {
    }
}
