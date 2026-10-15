package com.google.android.gms.internal.ads;

import O1.InterfaceC0074l0;
import O1.InterfaceC0084q0;
import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import n2.BinderC1813b;
import n2.InterfaceC1812a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Cf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0257Cf extends AbstractBinderC1149s4 implements S4 {

    /* renamed from: o, reason: collision with root package name */
    public final C0251Bf f4483o;

    /* renamed from: p, reason: collision with root package name */
    public final O1.J f4484p;

    /* renamed from: q, reason: collision with root package name */
    public final To f4485q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f4486r;

    /* renamed from: s, reason: collision with root package name */
    public final C0658gk f4487s;

    public BinderC0257Cf(C0251Bf c0251Bf, O1.J j4, To to, C0658gk c0658gk) {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
        this.f4486r = ((Boolean) O1.r.d.c.a(AbstractC1066q6.f10300w0)).booleanValue();
        this.f4483o = c0251Bf;
        this.f4484p = j4;
        this.f4485q = to;
        this.f4487s = c0658gk;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.android.gms.internal.ads.r4] */
    @Override // com.google.android.gms.internal.ads.AbstractBinderC1149s4
    public final boolean J3(int i4, Parcel parcel, Parcel parcel2) {
        X4 abstractC1106r4;
        switch (i4) {
            case 2:
                parcel2.writeNoException();
                AbstractC1192t4.e(parcel2, this.f4484p);
                return true;
            case 3:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                    if (queryLocalInterface instanceof V4) {
                    }
                }
                AbstractC1192t4.b(parcel);
                parcel2.writeNoException();
                return true;
            case 4:
                InterfaceC1812a G12 = BinderC1813b.G1(parcel.readStrongBinder());
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 == null) {
                    abstractC1106r4 = null;
                } else {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    abstractC1106r4 = queryLocalInterface2 instanceof X4 ? (X4) queryLocalInterface2 : new AbstractC1106r4(readStrongBinder2, "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback", 0);
                }
                AbstractC1192t4.b(parcel);
                o3(G12, abstractC1106r4);
                parcel2.writeNoException();
                return true;
            case 5:
                InterfaceC0084q0 d = d();
                parcel2.writeNoException();
                AbstractC1192t4.e(parcel2, d);
                return true;
            case 6:
                boolean f4 = AbstractC1192t4.f(parcel);
                AbstractC1192t4.b(parcel);
                this.f4486r = f4;
                parcel2.writeNoException();
                return true;
            case 7:
                InterfaceC0074l0 K32 = O1.O0.K3(parcel.readStrongBinder());
                AbstractC1192t4.b(parcel);
                h2.y.d("setOnPaidEventListener must be called on the main UI thread.");
                To to = this.f4485q;
                if (to != null) {
                    try {
                        if (!K32.d()) {
                            this.f4487s.b();
                        }
                    } catch (RemoteException e4) {
                        Y9.o("Error in making CSI ping for reporting paid event callback", e4);
                    }
                    to.f7086u.set(K32);
                }
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.S4
    public final InterfaceC0084q0 d() {
        if (((Boolean) O1.r.d.c.a(AbstractC1066q6.V5)).booleanValue()) {
            return this.f4483o.f7861f;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.S4
    public final void o3(InterfaceC1812a interfaceC1812a, X4 x4) {
        try {
            this.f4485q.f7083r.set(x4);
            this.f4483o.c((Activity) BinderC1813b.C2(interfaceC1812a), this.f4486r);
        } catch (RemoteException e4) {
            Y9.u("#007 Could not call remote method.", e4);
        }
    }
}
