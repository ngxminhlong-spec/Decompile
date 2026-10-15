package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.r4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1106r4 implements IInterface {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f10452o;

    /* renamed from: p, reason: collision with root package name */
    public final IBinder f10453p;

    /* renamed from: q, reason: collision with root package name */
    public final String f10454q;

    public /* synthetic */ AbstractC1106r4(IBinder iBinder, String str, int i4) {
        this.f10452o = i4;
        this.f10453p = iBinder;
        this.f10454q = str;
    }

    public void C2(Parcel parcel, int i4) {
        try {
            this.f10453p.transact(i4, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public void G1(Parcel parcel, int i4) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f10453p.transact(i4, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public void L2(Parcel parcel, int i4) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f10453p.transact(i4, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public Parcel O(Parcel parcel, int i4) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f10453p.transact(i4, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e4) {
                obtain.recycle();
                throw e4;
            }
        } finally {
            parcel.recycle();
        }
    }

    public Parcel Q() {
        switch (this.f10452o) {
            case 0:
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(this.f10454q);
                return obtain;
            case 1:
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken(this.f10454q);
                return obtain2;
            default:
                Parcel obtain3 = Parcel.obtain();
                obtain3.writeInterfaceToken(this.f10454q);
                return obtain3;
        }
    }

    public Parcel a0(Parcel parcel, int i4) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f10453p.transact(i4, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e4) {
                obtain.recycle();
                throw e4;
            }
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        switch (this.f10452o) {
            case 0:
                return this.f10453p;
            case 1:
                return this.f10453p;
            case 2:
                return this.f10453p;
            default:
                return this.f10453p;
        }
    }

    public Parcel q1(Parcel parcel, int i4) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f10453p.transact(i4, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e4) {
                obtain.recycle();
                throw e4;
            }
        } finally {
            parcel.recycle();
        }
    }
}
