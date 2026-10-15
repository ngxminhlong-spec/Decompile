package com.google.android.gms.internal.ads;

import O1.C0101z0;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.View;
import n2.BinderC1813b;
import n2.InterfaceC1812a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.zm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1474zm extends AbstractBinderC1149s4 implements N9 {

    /* renamed from: o, reason: collision with root package name */
    public final C0873lm f11651o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Am f11652p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC1474zm(Am am, C0873lm c0873lm) {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
        this.f11652p = am;
        this.f11651o = c0873lm;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1149s4
    public final boolean J3(int i4, Parcel parcel, Parcel parcel2) {
        C1326w9 c1326w9;
        Am am = this.f11652p;
        C0873lm c0873lm = this.f11651o;
        if (i4 == 1) {
            InterfaceC1812a G12 = BinderC1813b.G1(parcel.readStrongBinder());
            AbstractC1192t4.b(parcel);
            am.d = (View) BinderC1813b.C2(G12);
            ((Dm) c0873lm.c).n();
        } else if (i4 == 2) {
            String readString = parcel.readString();
            AbstractC1192t4.b(parcel);
            ((Dm) c0873lm.c).Z2(readString, 0);
        } else if (i4 == 3) {
            C0101z0 c0101z0 = (C0101z0) AbstractC1192t4.a(parcel, C0101z0.CREATOR);
            AbstractC1192t4.b(parcel);
            r(c0101z0);
        } else {
            if (i4 != 4) {
                return false;
            }
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                c1326w9 = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
                c1326w9 = queryLocalInterface instanceof C1326w9 ? (C1326w9) queryLocalInterface : new C1326w9(readStrongBinder);
            }
            AbstractC1192t4.b(parcel);
            am.f3994e = c1326w9;
            ((Dm) c0873lm.c).n();
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.N9
    public final void r(C0101z0 c0101z0) {
        ((Dm) this.f11651o.c).H1(c0101z0);
    }
}
