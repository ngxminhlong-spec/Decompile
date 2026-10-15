package O1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC1149s4;
import com.google.android.gms.internal.ads.AbstractC1192t4;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: O1.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0087s0 extends AbstractBinderC1149s4 implements InterfaceC0089t0 {
    public AbstractBinderC0087s0() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    public static InterfaceC0089t0 K3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        return queryLocalInterface instanceof InterfaceC0089t0 ? (InterfaceC0089t0) queryLocalInterface : new C0085r0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1149s4
    public final boolean J3(int i4, Parcel parcel, Parcel parcel2) {
        C0091u0 c0091u0;
        switch (i4) {
            case 1:
                l();
                parcel2.writeNoException();
                return true;
            case 2:
                k();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean f4 = AbstractC1192t4.f(parcel);
                AbstractC1192t4.b(parcel);
                U(f4);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean p3 = p();
                parcel2.writeNoException();
                ClassLoader classLoader = AbstractC1192t4.f10673a;
                parcel2.writeInt(p3 ? 1 : 0);
                return true;
            case 5:
                int f5 = f();
                parcel2.writeNoException();
                parcel2.writeInt(f5);
                return true;
            case 6:
                float h4 = h();
                parcel2.writeNoException();
                parcel2.writeFloat(h4);
                return true;
            case 7:
                float d = d();
                parcel2.writeNoException();
                parcel2.writeFloat(d);
                return true;
            case 8:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    c0091u0 = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
                    c0091u0 = queryLocalInterface instanceof C0091u0 ? (C0091u0) queryLocalInterface : new C0091u0(readStrongBinder);
                }
                AbstractC1192t4.b(parcel);
                D1(c0091u0);
                parcel2.writeNoException();
                return true;
            case 9:
                float a4 = a();
                parcel2.writeNoException();
                parcel2.writeFloat(a4);
                return true;
            case 10:
                boolean o4 = o();
                parcel2.writeNoException();
                ClassLoader classLoader2 = AbstractC1192t4.f10673a;
                parcel2.writeInt(o4 ? 1 : 0);
                return true;
            case 11:
                C0091u0 g4 = g();
                parcel2.writeNoException();
                AbstractC1192t4.e(parcel2, g4);
                return true;
            case 12:
                boolean n4 = n();
                parcel2.writeNoException();
                ClassLoader classLoader3 = AbstractC1192t4.f10673a;
                parcel2.writeInt(n4 ? 1 : 0);
                return true;
            case 13:
                m();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
