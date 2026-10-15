package O1;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC1106r4;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class M extends AbstractC1106r4 implements O {
    public M(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAppEventListener", 0);
    }

    @Override // O1.O
    public final void e2(String str, String str2) {
        Parcel Q3 = Q();
        Q3.writeString(str);
        Q3.writeString(str2);
        G1(Q3, 1);
    }
}
