package com.google.android.gms.internal.ads;

import O1.C0101z0;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.u9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1240u9 extends AbstractBinderC1149s4 implements InterfaceC1283v9 {
    public AbstractBinderC1240u9() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static InterfaceC1283v9 K3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return queryLocalInterface instanceof InterfaceC1283v9 ? (InterfaceC1283v9) queryLocalInterface : new C1197t9(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1149s4
    public final boolean J3(int i4, Parcel parcel, Parcel parcel2) {
        InterfaceC1034pb interfaceC1034pb = null;
        switch (i4) {
            case 1:
                a();
                break;
            case 2:
                d();
                break;
            case 3:
                int readInt = parcel.readInt();
                AbstractC1192t4.b(parcel);
                v(readInt);
                break;
            case 4:
                m();
                break;
            case 5:
                o();
                break;
            case 6:
                n();
                break;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                    if (queryLocalInterface instanceof AbstractC1369x9) {
                        U.a.t(queryLocalInterface);
                        throw null;
                    }
                }
                AbstractC1192t4.b(parcel);
                break;
            case 8:
                q();
                break;
            case 9:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                AbstractC1192t4.b(parcel);
                S1(readString, readString2);
                break;
            case 10:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
                    if (queryLocalInterface2 instanceof C7) {
                    }
                }
                parcel.readString();
                AbstractC1192t4.b(parcel);
                break;
            case 11:
                b();
                break;
            case 12:
                parcel.readString();
                AbstractC1192t4.b(parcel);
                break;
            case 13:
                K0();
                break;
            case 14:
                C0948nb c0948nb = (C0948nb) AbstractC1192t4.a(parcel, C0948nb.CREATOR);
                AbstractC1192t4.b(parcel);
                v2(c0948nb);
                break;
            case 15:
                Z();
                break;
            case 16:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    interfaceC1034pb = queryLocalInterface3 instanceof InterfaceC1034pb ? (InterfaceC1034pb) queryLocalInterface3 : new C0991ob(readStrongBinder3);
                }
                AbstractC1192t4.b(parcel);
                j1(interfaceC1034pb);
                break;
            case 17:
                int readInt2 = parcel.readInt();
                AbstractC1192t4.b(parcel);
                F1(readInt2);
                break;
            case 18:
                s();
                break;
            case 19:
                AbstractC1192t4.b(parcel);
                break;
            case 20:
                w();
                break;
            case 21:
                String readString3 = parcel.readString();
                AbstractC1192t4.b(parcel);
                N(readString3);
                break;
            case 22:
                int readInt3 = parcel.readInt();
                String readString4 = parcel.readString();
                AbstractC1192t4.b(parcel);
                Z2(readString4, readInt3);
                break;
            case 23:
                C0101z0 c0101z0 = (C0101z0) AbstractC1192t4.a(parcel, C0101z0.CREATOR);
                AbstractC1192t4.b(parcel);
                H1(c0101z0);
                break;
            case 24:
                C0101z0 c0101z02 = (C0101z0) AbstractC1192t4.a(parcel, C0101z0.CREATOR);
                AbstractC1192t4.b(parcel);
                n3(c0101z02);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
