package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import n2.BinderC1813b;
import n2.InterfaceC1812a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.sa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1161sa extends AbstractBinderC1149s4 implements InterfaceC1204ta {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f10602o = 0;

    public AbstractBinderC1161sa() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1149s4
    public final boolean J3(int i4, Parcel parcel, Parcel parcel2) {
        switch (i4) {
            case 1:
                Bundle bundle = (Bundle) AbstractC1192t4.a(parcel, Bundle.CREATOR);
                AbstractC1192t4.b(parcel);
                C0(bundle);
                parcel2.writeNoException();
                return true;
            case 2:
                parcel2.writeNoException();
                return true;
            case 3:
                x();
                parcel2.writeNoException();
                return true;
            case 4:
                M();
                parcel2.writeNoException();
                return true;
            case 5:
                n();
                parcel2.writeNoException();
                return true;
            case 6:
                Bundle bundle2 = (Bundle) AbstractC1192t4.a(parcel, Bundle.CREATOR);
                AbstractC1192t4.b(parcel);
                c1(bundle2);
                parcel2.writeNoException();
                AbstractC1192t4.d(parcel2, bundle2);
                return true;
            case 7:
                s();
                parcel2.writeNoException();
                return true;
            case 8:
                q();
                parcel2.writeNoException();
                return true;
            case 9:
                w();
                parcel2.writeNoException();
                return true;
            case 10:
                g();
                parcel2.writeNoException();
                return true;
            case 11:
                boolean G22 = G2();
                parcel2.writeNoException();
                ClassLoader classLoader = AbstractC1192t4.f10673a;
                parcel2.writeInt(G22 ? 1 : 0);
                return true;
            case 12:
                parcel.readInt();
                parcel.readInt();
                AbstractC1192t4.b(parcel);
                parcel2.writeNoException();
                return true;
            case 13:
                InterfaceC1812a G12 = BinderC1813b.G1(parcel.readStrongBinder());
                AbstractC1192t4.b(parcel);
                X1(G12);
                parcel2.writeNoException();
                return true;
            case 14:
                b();
                parcel2.writeNoException();
                return true;
            case 15:
                int readInt = parcel.readInt();
                String[] createStringArray = parcel.createStringArray();
                int[] createIntArray = parcel.createIntArray();
                AbstractC1192t4.b(parcel);
                e3(readInt, createStringArray, createIntArray);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
