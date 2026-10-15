package o;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: o.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1821a extends Binder implements IInterface {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) {
        if (i4 == 1598968902) {
            parcel2.writeString("android.support.customtabs.ICustomTabsCallback");
            return true;
        }
        switch (i4) {
            case 2:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                parcel.readInt();
                if (parcel.readInt() != 0) {
                }
                parcel2.writeNoException();
                return true;
            case 3:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                parcel.readString();
                if (parcel.readInt() != 0) {
                }
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                if (parcel.readInt() != 0) {
                }
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                parcel.readString();
                if (parcel.readInt() != 0) {
                }
                parcel2.writeNoException();
                return true;
            case 6:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                parcel.readInt();
                if (parcel.readInt() != 0) {
                }
                parcel.readInt();
                if (parcel.readInt() != 0) {
                }
                parcel2.writeNoException();
                return true;
            case 7:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                parcel.readString();
                if (parcel.readInt() != 0) {
                }
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            default:
                return super.onTransact(i4, parcel, parcel2, i5);
        }
    }
}
