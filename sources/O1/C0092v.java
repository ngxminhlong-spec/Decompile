package O1;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC1106r4;
import com.google.android.gms.internal.ads.AbstractC1192t4;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: O1.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0092v extends AbstractC1106r4 implements InterfaceC0096x {
    public C0092v(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener", 0);
    }

    @Override // O1.InterfaceC0096x
    public final void A(int i4) {
        Parcel Q3 = Q();
        Q3.writeInt(i4);
        G1(Q3, 2);
    }

    @Override // O1.InterfaceC0096x
    public final void e() {
        G1(Q(), 6);
    }

    @Override // O1.InterfaceC0096x
    public final void f() {
        G1(Q(), 3);
    }

    @Override // O1.InterfaceC0096x
    public final void g() {
        G1(Q(), 4);
    }

    @Override // O1.InterfaceC0096x
    public final void h() {
        G1(Q(), 7);
    }

    @Override // O1.InterfaceC0096x
    public final void i() {
        G1(Q(), 1);
    }

    @Override // O1.InterfaceC0096x
    public final void j() {
        G1(Q(), 5);
    }

    @Override // O1.InterfaceC0096x
    public final void k() {
        G1(Q(), 9);
    }

    @Override // O1.InterfaceC0096x
    public final void r(C0101z0 c0101z0) {
        Parcel Q3 = Q();
        AbstractC1192t4.c(Q3, c0101z0);
        G1(Q3, 8);
    }
}
