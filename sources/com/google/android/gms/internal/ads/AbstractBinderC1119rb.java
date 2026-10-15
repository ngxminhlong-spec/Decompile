package com.google.android.gms.internal.ads;

import O1.C0070j0;
import O1.InterfaceC0074l0;
import O1.InterfaceC0084q0;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import n2.BinderC1813b;
import n2.InterfaceC1812a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.rb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1119rb extends AbstractBinderC1149s4 implements InterfaceC1162sb {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f10476o = 0;

    public AbstractBinderC1119rb() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [com.google.android.gms.internal.ads.r4] */
    /* JADX WARN: Type inference failed for: r3v16, types: [com.google.android.gms.internal.ads.r4] */
    /* JADX WARN: Type inference failed for: r3v8, types: [com.google.android.gms.internal.ads.r4] */
    @Override // com.google.android.gms.internal.ads.AbstractBinderC1149s4
    public final boolean J3(int i4, Parcel parcel, Parcel parcel2) {
        InterfaceC1463zb interfaceC1463zb = null;
        InterfaceC1463zb interfaceC1463zb2 = null;
        C0070j0 c0070j0 = null;
        C0241Ab c0241Ab = null;
        InterfaceC1291vb interfaceC1291vb = null;
        switch (i4) {
            case 1:
                O1.U0 u02 = (O1.U0) AbstractC1192t4.a(parcel, O1.U0.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    interfaceC1463zb = queryLocalInterface instanceof InterfaceC1463zb ? (InterfaceC1463zb) queryLocalInterface : new C1377xb(readStrongBinder);
                }
                AbstractC1192t4.b(parcel);
                O0(u02, interfaceC1463zb);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    interfaceC1291vb = queryLocalInterface2 instanceof InterfaceC1291vb ? (InterfaceC1291vb) queryLocalInterface2 : new AbstractC1106r4(readStrongBinder2, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback", 0);
                }
                AbstractC1192t4.b(parcel);
                Y0(interfaceC1291vb);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean n4 = n();
                parcel2.writeNoException();
                ClassLoader classLoader = AbstractC1192t4.f10673a;
                parcel2.writeInt(n4 ? 1 : 0);
                return true;
            case 4:
                String a4 = a();
                parcel2.writeNoException();
                parcel2.writeString(a4);
                return true;
            case 5:
                InterfaceC1812a G12 = BinderC1813b.G1(parcel.readStrongBinder());
                AbstractC1192t4.b(parcel);
                I(G12);
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    c0241Ab = queryLocalInterface3 instanceof C0241Ab ? (C0241Ab) queryLocalInterface3 : new AbstractC1106r4(readStrongBinder3, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener", 0);
                }
                AbstractC1192t4.b(parcel);
                m2(c0241Ab);
                parcel2.writeNoException();
                return true;
            case 7:
                C0259Db c0259Db = (C0259Db) AbstractC1192t4.a(parcel, C0259Db.CREATOR);
                AbstractC1192t4.b(parcel);
                J1(c0259Db);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
                    c0070j0 = queryLocalInterface4 instanceof C0070j0 ? (C0070j0) queryLocalInterface4 : new AbstractC1106r4(readStrongBinder4, "com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener", 0);
                }
                AbstractC1192t4.b(parcel);
                r2(c0070j0);
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle c = c();
                parcel2.writeNoException();
                AbstractC1192t4.d(parcel2, c);
                return true;
            case 10:
                InterfaceC1812a G13 = BinderC1813b.G1(parcel.readStrongBinder());
                ClassLoader classLoader2 = AbstractC1192t4.f10673a;
                boolean z4 = parcel.readInt() != 0;
                AbstractC1192t4.b(parcel);
                q2(G13, z4);
                parcel2.writeNoException();
                return true;
            case 11:
                InterfaceC1034pb i5 = i();
                parcel2.writeNoException();
                AbstractC1192t4.e(parcel2, i5);
                return true;
            case 12:
                InterfaceC0084q0 e4 = e();
                parcel2.writeNoException();
                AbstractC1192t4.e(parcel2, e4);
                return true;
            case 13:
                InterfaceC0074l0 K32 = O1.O0.K3(parcel.readStrongBinder());
                AbstractC1192t4.b(parcel);
                R0(K32);
                parcel2.writeNoException();
                return true;
            case 14:
                O1.U0 u03 = (O1.U0) AbstractC1192t4.a(parcel, O1.U0.CREATOR);
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    interfaceC1463zb2 = queryLocalInterface5 instanceof InterfaceC1463zb ? (InterfaceC1463zb) queryLocalInterface5 : new C1377xb(readStrongBinder5);
                }
                AbstractC1192t4.b(parcel);
                O1(u03, interfaceC1463zb2);
                parcel2.writeNoException();
                return true;
            case 15:
                boolean f4 = AbstractC1192t4.f(parcel);
                AbstractC1192t4.b(parcel);
                A0(f4);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
