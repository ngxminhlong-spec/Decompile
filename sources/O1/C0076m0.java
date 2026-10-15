package O1;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC1106r4;
import com.google.android.gms.internal.ads.AbstractC1192t4;
import n2.InterfaceC1812a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: O1.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0076m0 extends AbstractC1106r4 implements InterfaceC0078n0 {
    public C0076m0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTester", 0);
    }

    @Override // O1.InterfaceC0078n0
    public final void p2(String str, InterfaceC1812a interfaceC1812a, InterfaceC1812a interfaceC1812a2) {
        Parcel Q3 = Q();
        Q3.writeString(str);
        AbstractC1192t4.e(Q3, interfaceC1812a);
        AbstractC1192t4.e(Q3, interfaceC1812a2);
        G1(Q3, 1);
    }
}
