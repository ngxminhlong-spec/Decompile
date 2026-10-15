package O1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC1106r4;
import com.google.android.gms.internal.ads.AbstractC1192t4;
import com.google.android.gms.internal.ads.BinderC0983o9;
import n2.BinderC1813b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: O1.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0080o0 extends AbstractC1106r4 {
    public final InterfaceC0078n0 W2(BinderC1813b binderC1813b, BinderC0983o9 binderC0983o9) {
        InterfaceC0078n0 c0076m0;
        Parcel Q3 = Q();
        AbstractC1192t4.e(Q3, binderC1813b);
        AbstractC1192t4.e(Q3, binderC0983o9);
        Q3.writeInt(234310000);
        Parcel q12 = q1(Q3, 1);
        IBinder readStrongBinder = q12.readStrongBinder();
        if (readStrongBinder == null) {
            c0076m0 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            c0076m0 = queryLocalInterface instanceof InterfaceC0078n0 ? (InterfaceC0078n0) queryLocalInterface : new C0076m0(readStrongBinder);
        }
        q12.recycle();
        return c0076m0;
    }
}
