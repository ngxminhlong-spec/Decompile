package O1;

import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC1149s4;
import com.google.android.gms.internal.ads.AbstractC1192t4;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class B extends AbstractBinderC1149s4 implements C {
    public B() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1149s4
    public final boolean J3(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 == 1) {
            U0 u02 = (U0) AbstractC1192t4.a(parcel, U0.CREATOR);
            AbstractC1192t4.b(parcel);
            B0(u02);
            parcel2.writeNoException();
            return true;
        }
        if (i4 == 2) {
            String a4 = a();
            parcel2.writeNoException();
            parcel2.writeString(a4);
            return true;
        }
        if (i4 == 3) {
            boolean g4 = g();
            parcel2.writeNoException();
            ClassLoader classLoader = AbstractC1192t4.f10673a;
            parcel2.writeInt(g4 ? 1 : 0);
            return true;
        }
        if (i4 == 4) {
            String d = d();
            parcel2.writeNoException();
            parcel2.writeString(d);
            return true;
        }
        if (i4 != 5) {
            return false;
        }
        U0 u03 = (U0) AbstractC1192t4.a(parcel, U0.CREATOR);
        int readInt = parcel.readInt();
        AbstractC1192t4.b(parcel);
        i1(u03, readInt);
        parcel2.writeNoException();
        return true;
    }
}
