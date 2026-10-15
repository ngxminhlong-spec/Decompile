package com.google.android.gms.internal.ads;

import O1.C0101z0;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Lm extends AbstractBinderC1149s4 implements R9 {

    /* renamed from: o, reason: collision with root package name */
    public final C0873lm f6157o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Am f6158p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Lm(Am am, C0873lm c0873lm) {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
        this.f6158p = am;
        this.f6157o = c0873lm;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1149s4
    public final boolean J3(int i4, Parcel parcel, Parcel parcel2) {
        B9 a9;
        C0873lm c0873lm = this.f6157o;
        if (i4 == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                a9 = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
                a9 = queryLocalInterface instanceof B9 ? (B9) queryLocalInterface : new A9(readStrongBinder);
            }
            AbstractC1192t4.b(parcel);
            this.f6158p.d = a9;
            ((Dm) c0873lm.c).n();
        } else if (i4 == 2) {
            String readString = parcel.readString();
            AbstractC1192t4.b(parcel);
            ((Dm) c0873lm.c).Z2(readString, 0);
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

    @Override // com.google.android.gms.internal.ads.R9
    public final void r(C0101z0 c0101z0) {
        ((Dm) this.f6157o.c).H1(c0101z0);
    }
}
