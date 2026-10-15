package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import n2.BinderC1813b;
import n2.InterfaceC1812a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.u7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1238u7 extends AbstractBinderC1149s4 implements InterfaceC1281v7 {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f10780o = 0;

    public AbstractBinderC1238u7() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.r4] */
    @Override // com.google.android.gms.internal.ads.AbstractBinderC1149s4
    public final boolean J3(int i4, Parcel parcel, Parcel parcel2) {
        InterfaceC1024p7 abstractC1106r4;
        switch (i4) {
            case 1:
                String readString = parcel.readString();
                InterfaceC1812a G12 = BinderC1813b.G1(parcel.readStrongBinder());
                AbstractC1192t4.b(parcel);
                P2(readString, G12);
                parcel2.writeNoException();
                return true;
            case 2:
                String readString2 = parcel.readString();
                AbstractC1192t4.b(parcel);
                InterfaceC1812a B4 = B(readString2);
                parcel2.writeNoException();
                AbstractC1192t4.e(parcel2, B4);
                return true;
            case 3:
                InterfaceC1812a G13 = BinderC1813b.G1(parcel.readStrongBinder());
                AbstractC1192t4.b(parcel);
                h3(G13);
                parcel2.writeNoException();
                return true;
            case 4:
                e();
                parcel2.writeNoException();
                return true;
            case 5:
                BinderC1813b.G1(parcel.readStrongBinder());
                parcel.readInt();
                AbstractC1192t4.b(parcel);
                parcel2.writeNoException();
                return true;
            case 6:
                InterfaceC1812a G14 = BinderC1813b.G1(parcel.readStrongBinder());
                AbstractC1192t4.b(parcel);
                V1(G14);
                parcel2.writeNoException();
                return true;
            case 7:
                InterfaceC1812a G15 = BinderC1813b.G1(parcel.readStrongBinder());
                AbstractC1192t4.b(parcel);
                H0(G15);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    abstractC1106r4 = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
                    abstractC1106r4 = queryLocalInterface instanceof InterfaceC1024p7 ? (InterfaceC1024p7) queryLocalInterface : new AbstractC1106r4(readStrongBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent", 0);
                }
                AbstractC1192t4.b(parcel);
                D2(abstractC1106r4);
                parcel2.writeNoException();
                return true;
            case 9:
                InterfaceC1812a G16 = BinderC1813b.G1(parcel.readStrongBinder());
                AbstractC1192t4.b(parcel);
                k2(G16);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
