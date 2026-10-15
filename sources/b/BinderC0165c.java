package b;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: b.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0165c extends Binder implements InterfaceC0164b {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f3167p = 0;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0166d f3168o;

    public BinderC0165c(C0166d c0166d) {
        this.f3168o = c0166d;
        attachInterface(this, InterfaceC0164b.c);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) {
        String str = InterfaceC0164b.c;
        if (i4 >= 1 && i4 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i4 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i4 != 1) {
            return super.onTransact(i4, parcel, parcel2, i5);
        }
        this.f3168o.a(parcel.readInt(), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
        return true;
    }
}
