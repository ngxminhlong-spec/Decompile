package O1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.A8;
import com.google.android.gms.internal.ads.AbstractBinderC1149s4;
import com.google.android.gms.internal.ads.AbstractC1106r4;
import com.google.android.gms.internal.ads.AbstractC1192t4;
import com.google.android.gms.internal.ads.BinderC0983o9;
import com.google.android.gms.internal.ads.InterfaceC1069q9;
import java.util.List;
import n2.BinderC1813b;
import n2.InterfaceC1812a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class Z extends AbstractBinderC1149s4 implements InterfaceC0052a0 {
    public Z() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.android.gms.internal.ads.r4] */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.google.android.gms.internal.ads.r4] */
    @Override // com.google.android.gms.internal.ads.AbstractBinderC1149s4
    public final boolean J3(int i4, Parcel parcel, Parcel parcel2) {
        A8 a8 = null;
        InterfaceC0068i0 interfaceC0068i0 = null;
        switch (i4) {
            case 1:
                k();
                parcel2.writeNoException();
                return true;
            case 2:
                float readFloat = parcel.readFloat();
                AbstractC1192t4.b(parcel);
                s0(readFloat);
                parcel2.writeNoException();
                return true;
            case 3:
                String readString = parcel.readString();
                AbstractC1192t4.b(parcel);
                V(readString);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean f4 = AbstractC1192t4.f(parcel);
                AbstractC1192t4.b(parcel);
                F3(f4);
                parcel2.writeNoException();
                return true;
            case 5:
                InterfaceC1812a G12 = BinderC1813b.G1(parcel.readStrongBinder());
                String readString2 = parcel.readString();
                AbstractC1192t4.b(parcel);
                T0(readString2, G12);
                parcel2.writeNoException();
                return true;
            case 6:
                String readString3 = parcel.readString();
                InterfaceC1812a G13 = BinderC1813b.G1(parcel.readStrongBinder());
                AbstractC1192t4.b(parcel);
                X2(readString3, G13);
                parcel2.writeNoException();
                return true;
            case 7:
                float a4 = a();
                parcel2.writeNoException();
                parcel2.writeFloat(a4);
                return true;
            case 8:
                boolean t4 = t();
                parcel2.writeNoException();
                ClassLoader classLoader = AbstractC1192t4.f10673a;
                parcel2.writeInt(t4 ? 1 : 0);
                return true;
            case 9:
                String d = d();
                parcel2.writeNoException();
                parcel2.writeString(d);
                return true;
            case 10:
                String readString4 = parcel.readString();
                AbstractC1192t4.b(parcel);
                D0(readString4);
                parcel2.writeNoException();
                return true;
            case 11:
                InterfaceC1069q9 K32 = BinderC0983o9.K3(parcel.readStrongBinder());
                AbstractC1192t4.b(parcel);
                p0(K32);
                parcel2.writeNoException();
                return true;
            case 12:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
                    a8 = queryLocalInterface instanceof A8 ? (A8) queryLocalInterface : new AbstractC1106r4(readStrongBinder, "com.google.android.gms.ads.internal.initialization.IInitializationCallback", 0);
                }
                AbstractC1192t4.b(parcel);
                g1(a8);
                parcel2.writeNoException();
                return true;
            case 13:
                List h4 = h();
                parcel2.writeNoException();
                parcel2.writeTypedList(h4);
                return true;
            case 14:
                P0 p02 = (P0) AbstractC1192t4.a(parcel, P0.CREATOR);
                AbstractC1192t4.b(parcel);
                g3(p02);
                parcel2.writeNoException();
                return true;
            case 15:
                g();
                parcel2.writeNoException();
                return true;
            case 16:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                    interfaceC0068i0 = queryLocalInterface2 instanceof InterfaceC0068i0 ? (InterfaceC0068i0) queryLocalInterface2 : new AbstractC1106r4(readStrongBinder2, "com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener", 0);
                }
                AbstractC1192t4.b(parcel);
                B1(interfaceC0068i0);
                parcel2.writeNoException();
                return true;
            case 17:
                boolean f5 = AbstractC1192t4.f(parcel);
                AbstractC1192t4.b(parcel);
                U(f5);
                parcel2.writeNoException();
                return true;
            case 18:
                String readString5 = parcel.readString();
                AbstractC1192t4.b(parcel);
                K(readString5);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
