package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class T0 implements V0, IInterface {

    /* renamed from: o, reason: collision with root package name */
    public final IBinder f12167o;

    public T0(IBinder iBinder) {
        this.f12167o = iBinder;
    }

    public final int O(int i4, String str, String str2, Bundle bundle) {
        Parcel Q3 = Q();
        Q3.writeInt(i4);
        Q3.writeString(str);
        Q3.writeString(str2);
        int i5 = W0.f12172a;
        Q3.writeInt(1);
        bundle.writeToParcel(Q3, 0);
        Parcel a02 = a0(Q3, 10);
        int readInt = a02.readInt();
        a02.recycle();
        return readInt;
    }

    public final Parcel Q() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
        return obtain;
    }

    public final Parcel a0(Parcel parcel, int i4) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f12167o.transact(i4, parcel, obtain, 0);
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
        return this.f12167o;
    }
}
