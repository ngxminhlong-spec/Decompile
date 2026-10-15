package O1;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC1106r4;
import com.google.android.gms.internal.ads.AbstractC1192t4;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: O1.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0072k0 extends AbstractC1106r4 implements InterfaceC0074l0 {
    public C0072k0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener", 0);
    }

    @Override // O1.InterfaceC0074l0
    public final void D3(Y0 y02) {
        Parcel Q3 = Q();
        AbstractC1192t4.c(Q3, y02);
        G1(Q3, 1);
    }

    @Override // O1.InterfaceC0074l0
    public final boolean d() {
        Parcel q12 = q1(Q(), 2);
        ClassLoader classLoader = AbstractC1192t4.f10673a;
        boolean z4 = q12.readInt() != 0;
        q12.recycle();
        return z4;
    }
}
