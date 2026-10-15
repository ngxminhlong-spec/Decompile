package p2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: p2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1941b implements InterfaceC1943d, IInterface {

    /* renamed from: o, reason: collision with root package name */
    public final IBinder f14605o;

    public C1941b(IBinder iBinder) {
        this.f14605o = iBinder;
    }

    public final Parcel O(Parcel parcel, int i4) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f14605o.transact(i4, parcel, obtain, 0);
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
        return this.f14605o;
    }
}
