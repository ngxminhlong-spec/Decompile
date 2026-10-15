package O1;

import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC1106r4;
import com.google.android.gms.internal.ads.AbstractC1192t4;
import com.google.android.gms.internal.ads.BinderC0983o9;
import com.google.android.gms.internal.ads.InterfaceC1069q9;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class V extends AbstractC1106r4 implements X {
    @Override // O1.X
    public final InterfaceC1069q9 getAdapterCreator() {
        Parcel q12 = q1(Q(), 2);
        InterfaceC1069q9 K32 = BinderC0983o9.K3(q12.readStrongBinder());
        q12.recycle();
        return K32;
    }

    @Override // O1.X
    public final G0 getLiteSdkVersion() {
        Parcel q12 = q1(Q(), 1);
        G0 g02 = (G0) AbstractC1192t4.a(q12, G0.CREATOR);
        q12.recycle();
        return g02;
    }
}
