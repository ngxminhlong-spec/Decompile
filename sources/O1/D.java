package O1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC1106r4;
import com.google.android.gms.internal.ads.AbstractC1192t4;
import com.google.android.gms.internal.ads.C0766j7;
import com.google.android.gms.internal.ads.G7;
import com.google.android.gms.internal.ads.I7;
import com.google.android.gms.internal.ads.M7;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class D extends AbstractC1106r4 implements F {
    public D(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder", 0);
    }

    @Override // O1.F
    public final void S0(M7 m7) {
        Parcel Q3 = Q();
        AbstractC1192t4.e(Q3, m7);
        G1(Q3, 10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v5, types: [O1.C] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // O1.F
    public final C a() {
        ?? r1;
        Parcel q12 = q1(Q(), 1);
        IBinder readStrongBinder = q12.readStrongBinder();
        if (readStrongBinder == null) {
            r1 = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            r1 = queryLocalInterface instanceof C ? (C) queryLocalInterface : new AbstractC1106r4(readStrongBinder, "com.google.android.gms.ads.internal.client.IAdLoader", 0);
        }
        q12.recycle();
        return r1;
    }

    @Override // O1.F
    public final void a2(String str, I7 i7, G7 g7) {
        Parcel Q3 = Q();
        Q3.writeString(str);
        AbstractC1192t4.e(Q3, i7);
        AbstractC1192t4.e(Q3, g7);
        G1(Q3, 5);
    }

    @Override // O1.F
    public final void c2(C0766j7 c0766j7) {
        Parcel Q3 = Q();
        AbstractC1192t4.c(Q3, c0766j7);
        G1(Q3, 6);
    }

    @Override // O1.F
    public final void m0(InterfaceC0096x interfaceC0096x) {
        Parcel Q3 = Q();
        AbstractC1192t4.e(Q3, interfaceC0096x);
        G1(Q3, 2);
    }
}
