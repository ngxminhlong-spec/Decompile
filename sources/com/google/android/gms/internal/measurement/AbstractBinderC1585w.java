package com.google.android.gms.internal.measurement;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.measurement.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1585w extends Binder implements IInterface {
    public AbstractBinderC1585w(String str) {
        attachInterface(this, str);
    }

    public abstract boolean O(int i4, Parcel parcel, Parcel parcel2);

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) {
        if (i4 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i4, parcel, parcel2, i5)) {
            return true;
        }
        return O(i4, parcel, parcel2);
    }
}
