package com.google.android.gms.internal.ads;

import android.os.Parcel;
import n2.BinderC1813b;
import n2.InterfaceC1812a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.lb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0862lb extends AbstractBinderC1149s4 implements InterfaceC0905mb {
    public AbstractBinderC0862lb() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1149s4
    public final boolean J3(int i4, Parcel parcel, Parcel parcel2) {
        switch (i4) {
            case 1:
                InterfaceC1812a G12 = BinderC1813b.G1(parcel.readStrongBinder());
                AbstractC1192t4.b(parcel);
                d1(G12);
                break;
            case 2:
                BinderC1813b.G1(parcel.readStrongBinder());
                parcel.readInt();
                AbstractC1192t4.b(parcel);
                x2();
                break;
            case 3:
                InterfaceC1812a G13 = BinderC1813b.G1(parcel.readStrongBinder());
                AbstractC1192t4.b(parcel);
                C3(G13);
                break;
            case 4:
                InterfaceC1812a G14 = BinderC1813b.G1(parcel.readStrongBinder());
                AbstractC1192t4.b(parcel);
                Y2(G14);
                break;
            case 5:
                InterfaceC1812a G15 = BinderC1813b.G1(parcel.readStrongBinder());
                AbstractC1192t4.b(parcel);
                f2(G15);
                break;
            case 6:
                InterfaceC1812a G16 = BinderC1813b.G1(parcel.readStrongBinder());
                AbstractC1192t4.b(parcel);
                K2(G16);
                break;
            case 7:
                InterfaceC1812a G17 = BinderC1813b.G1(parcel.readStrongBinder());
                C0948nb c0948nb = (C0948nb) AbstractC1192t4.a(parcel, C0948nb.CREATOR);
                AbstractC1192t4.b(parcel);
                S2(G17, c0948nb);
                break;
            case 8:
                InterfaceC1812a G18 = BinderC1813b.G1(parcel.readStrongBinder());
                AbstractC1192t4.b(parcel);
                zze(G18);
                break;
            case 9:
                InterfaceC1812a G19 = BinderC1813b.G1(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                AbstractC1192t4.b(parcel);
                e0(G19, readInt);
                break;
            case 10:
                BinderC1813b.G1(parcel.readStrongBinder());
                AbstractC1192t4.b(parcel);
                l2();
                break;
            case 11:
                InterfaceC1812a G110 = BinderC1813b.G1(parcel.readStrongBinder());
                AbstractC1192t4.b(parcel);
                k3(G110);
                break;
            case 12:
                AbstractC1192t4.b(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
