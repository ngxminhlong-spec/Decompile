package Q1;

import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC1106r4;
import com.google.android.gms.internal.ads.AbstractC1192t4;
import n2.InterfaceC1812a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class w extends AbstractC1106r4 implements x {
    @Override // Q1.x
    public final void zze(InterfaceC1812a interfaceC1812a) {
        Parcel Q3 = Q();
        AbstractC1192t4.e(Q3, interfaceC1812a);
        G1(Q3, 2);
    }

    @Override // Q1.x
    public final boolean zzf(InterfaceC1812a interfaceC1812a, String str, String str2) {
        Parcel Q3 = Q();
        AbstractC1192t4.e(Q3, interfaceC1812a);
        Q3.writeString(str);
        Q3.writeString(str2);
        Parcel q12 = q1(Q3, 1);
        boolean z4 = q12.readInt() != 0;
        q12.recycle();
        return z4;
    }
}
