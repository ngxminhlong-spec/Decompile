package h2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class u implements IInterface {

    /* renamed from: o, reason: collision with root package name */
    public final IBinder f13245o;

    public u(IBinder iBinder) {
        this.f13245o = iBinder;
    }

    public final void O(BinderC1699A binderC1699A, C1708g c1708g) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(binderC1699A);
            obtain.writeInt(1);
            e2.l.a(c1708g, obtain, 0);
            this.f13245o.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f13245o;
    }
}
