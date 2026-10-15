package O1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC1149s4;
import com.google.android.gms.internal.ads.AbstractC1106r4;
import com.google.android.gms.internal.ads.AbstractC1192t4;
import com.google.android.gms.internal.ads.InterfaceC1069q9;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class W extends AbstractBinderC1149s4 implements X {
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.r4, O1.X] */
    public static X asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
        return queryLocalInterface instanceof X ? (X) queryLocalInterface : new AbstractC1106r4(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo", 0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1149s4
    public final boolean J3(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 == 1) {
            G0 liteSdkVersion = getLiteSdkVersion();
            parcel2.writeNoException();
            AbstractC1192t4.d(parcel2, liteSdkVersion);
            return true;
        }
        if (i4 != 2) {
            return false;
        }
        InterfaceC1069q9 adapterCreator = getAdapterCreator();
        parcel2.writeNoException();
        AbstractC1192t4.e(parcel2, adapterCreator);
        return true;
    }
}
