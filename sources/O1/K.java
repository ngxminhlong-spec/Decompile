package O1;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC1106r4;
import com.google.android.gms.internal.ads.AbstractC1192t4;
import com.google.android.gms.internal.ads.InterfaceC1069q9;
import n2.BinderC1813b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class K extends AbstractC1106r4 {
    public K(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator", 0);
    }

    public final IBinder W2(BinderC1813b binderC1813b, X0 x02, String str, InterfaceC1069q9 interfaceC1069q9, int i4) {
        Parcel Q3 = Q();
        AbstractC1192t4.e(Q3, binderC1813b);
        AbstractC1192t4.c(Q3, x02);
        Q3.writeString(str);
        AbstractC1192t4.e(Q3, interfaceC1069q9);
        Q3.writeInt(234310000);
        Q3.writeInt(i4);
        Parcel q12 = q1(Q3, 2);
        IBinder readStrongBinder = q12.readStrongBinder();
        q12.recycle();
        return readStrongBinder;
    }
}
