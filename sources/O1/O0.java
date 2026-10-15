package O1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC1149s4;
import com.google.android.gms.internal.ads.AbstractC1192t4;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class O0 extends AbstractBinderC1149s4 implements InterfaceC0074l0 {
    public O0() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    public static InterfaceC0074l0 K3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        return queryLocalInterface instanceof InterfaceC0074l0 ? (InterfaceC0074l0) queryLocalInterface : new C0072k0(iBinder);
    }

    @Override // O1.InterfaceC0074l0
    public final void D3(Y0 y02) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1149s4
    public final boolean J3(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 == 1) {
            AbstractC1192t4.b(parcel);
            parcel2.writeNoException();
            return true;
        }
        if (i4 != 2) {
            return false;
        }
        parcel2.writeNoException();
        ClassLoader classLoader = AbstractC1192t4.f10673a;
        parcel2.writeInt(1);
        return true;
    }

    @Override // O1.InterfaceC0074l0
    public final boolean d() {
        return true;
    }
}
