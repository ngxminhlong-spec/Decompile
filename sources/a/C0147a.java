package a;

import android.os.IBinder;
import android.os.Parcel;
import o.BinderC1821a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: a.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0147a implements InterfaceC0149c {

    /* renamed from: o, reason: collision with root package name */
    public IBinder f2346o;

    public final boolean O(BinderC1821a binderC1821a) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
            obtain.writeStrongBinder(binderC1821a);
            if (!this.f2346o.transact(3, obtain, obtain2, 0)) {
                int i4 = AbstractBinderC0148b.f2347o;
            }
            obtain2.readException();
            boolean z4 = obtain2.readInt() != 0;
            obtain2.recycle();
            obtain.recycle();
            return z4;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    public final boolean Q() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
            obtain.writeLong(0L);
            if (!this.f2346o.transact(2, obtain, obtain2, 0)) {
                int i4 = AbstractBinderC0148b.f2347o;
            }
            obtain2.readException();
            boolean z4 = obtain2.readInt() != 0;
            obtain2.recycle();
            obtain.recycle();
            return z4;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f2346o;
    }
}
