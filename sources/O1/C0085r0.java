package O1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC1106r4;
import com.google.android.gms.internal.ads.AbstractC1192t4;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: O1.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0085r0 extends AbstractC1106r4 implements InterfaceC0089t0 {
    public C0085r0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController", 0);
    }

    @Override // O1.InterfaceC0089t0
    public final void D1(C0091u0 c0091u0) {
        Parcel Q3 = Q();
        AbstractC1192t4.e(Q3, c0091u0);
        G1(Q3, 8);
    }

    @Override // O1.InterfaceC0089t0
    public final float a() {
        throw null;
    }

    @Override // O1.InterfaceC0089t0
    public final float d() {
        throw null;
    }

    @Override // O1.InterfaceC0089t0
    public final C0091u0 g() {
        C0091u0 c0091u0;
        Parcel q12 = q1(Q(), 11);
        IBinder readStrongBinder = q12.readStrongBinder();
        if (readStrongBinder == null) {
            c0091u0 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            c0091u0 = queryLocalInterface instanceof C0091u0 ? (C0091u0) queryLocalInterface : new C0091u0(readStrongBinder);
        }
        q12.recycle();
        return c0091u0;
    }

    @Override // O1.InterfaceC0089t0
    public final float h() {
        throw null;
    }
}
