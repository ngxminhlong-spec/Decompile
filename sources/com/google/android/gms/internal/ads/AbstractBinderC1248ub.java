package com.google.android.gms.internal.ads;

import O1.C0101z0;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.ub, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1248ub extends AbstractBinderC1149s4 implements InterfaceC1291vb {
    public AbstractBinderC1248ub() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1149s4
    public final boolean J3(int i4, Parcel parcel, Parcel parcel2) {
        InterfaceC1034pb c0991ob;
        switch (i4) {
            case 1:
                j();
                break;
            case 2:
                h();
                break;
            case 3:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    c0991ob = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    c0991ob = queryLocalInterface instanceof InterfaceC1034pb ? (InterfaceC1034pb) queryLocalInterface : new C0991ob(readStrongBinder);
                }
                AbstractC1192t4.b(parcel);
                l1(c0991ob);
                break;
            case 4:
                int readInt = parcel.readInt();
                AbstractC1192t4.b(parcel);
                i0(readInt);
                break;
            case 5:
                C0101z0 c0101z0 = (C0101z0) AbstractC1192t4.a(parcel, C0101z0.CREATOR);
                AbstractC1192t4.b(parcel);
                N0(c0101z0);
                break;
            case 6:
                d();
                break;
            case 7:
                a();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
