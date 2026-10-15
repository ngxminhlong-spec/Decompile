package O1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC1106r4;
import com.google.android.gms.internal.ads.AbstractC1192t4;
import com.google.android.gms.internal.ads.U4;
import n2.InterfaceC1812a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class H extends AbstractC1106r4 implements J {
    public H(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager", 0);
    }

    @Override // O1.J
    public final void B3(boolean z4) {
        Parcel Q3 = Q();
        ClassLoader classLoader = AbstractC1192t4.f10673a;
        Q3.writeInt(0);
        G1(Q3, 22);
    }

    @Override // O1.J
    public final String C() {
        Parcel q12 = q1(Q(), 31);
        String readString = q12.readString();
        q12.recycle();
        return readString;
    }

    @Override // O1.J
    public final void E3(U4 u4) {
        Parcel Q3 = Q();
        AbstractC1192t4.e(Q3, u4);
        G1(Q3, 40);
    }

    @Override // O1.J
    public final void H3(U u2) {
        Parcel Q3 = Q();
        AbstractC1192t4.e(Q3, u2);
        G1(Q3, 45);
    }

    @Override // O1.J
    public final void O2(X0 x02) {
        Parcel Q3 = Q();
        AbstractC1192t4.c(Q3, x02);
        G1(Q3, 13);
    }

    @Override // O1.J
    public final void W0(InterfaceC1812a interfaceC1812a) {
        Parcel Q3 = Q();
        AbstractC1192t4.e(Q3, interfaceC1812a);
        G1(Q3, 44);
    }

    @Override // O1.J
    public final void f3(InterfaceC0074l0 interfaceC0074l0) {
        Parcel Q3 = Q();
        AbstractC1192t4.e(Q3, interfaceC0074l0);
        G1(Q3, 42);
    }

    @Override // O1.J
    public final void g2(boolean z4) {
        Parcel Q3 = Q();
        ClassLoader classLoader = AbstractC1192t4.f10673a;
        Q3.writeInt(z4 ? 1 : 0);
        G1(Q3, 34);
    }

    @Override // O1.J
    public final X0 h() {
        Parcel q12 = q1(Q(), 12);
        X0 x02 = (X0) AbstractC1192t4.a(q12, X0.CREATOR);
        q12.recycle();
        return x02;
    }

    @Override // O1.J
    public final boolean h2(U0 u02) {
        Parcel Q3 = Q();
        AbstractC1192t4.c(Q3, u02);
        Parcel q12 = q1(Q3, 4);
        boolean z4 = q12.readInt() != 0;
        q12.recycle();
        return z4;
    }

    @Override // O1.J
    public final InterfaceC0084q0 k() {
        InterfaceC0084q0 c0082p0;
        Parcel q12 = q1(Q(), 41);
        IBinder readStrongBinder = q12.readStrongBinder();
        if (readStrongBinder == null) {
            c0082p0 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            c0082p0 = queryLocalInterface instanceof InterfaceC0084q0 ? (InterfaceC0084q0) queryLocalInterface : new C0082p0(readStrongBinder);
        }
        q12.recycle();
        return c0082p0;
    }

    @Override // O1.J
    public final InterfaceC0089t0 l() {
        InterfaceC0089t0 c0085r0;
        Parcel q12 = q1(Q(), 26);
        IBinder readStrongBinder = q12.readStrongBinder();
        if (readStrongBinder == null) {
            c0085r0 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            c0085r0 = queryLocalInterface instanceof InterfaceC0089t0 ? (InterfaceC0089t0) queryLocalInterface : new C0085r0(readStrongBinder);
        }
        q12.recycle();
        return c0085r0;
    }

    @Override // O1.J
    public final InterfaceC1812a m() {
        return U.a.o(q1(Q(), 1));
    }

    @Override // O1.J
    public final void n1() {
        G1(Q(), 5);
    }

    @Override // O1.J
    public final void n2(a1 a1Var) {
        Parcel Q3 = Q();
        AbstractC1192t4.c(Q3, a1Var);
        G1(Q3, 39);
    }

    @Override // O1.J
    public final void q3(InterfaceC0090u interfaceC0090u) {
        Parcel Q3 = Q();
        AbstractC1192t4.e(Q3, interfaceC0090u);
        G1(Q3, 20);
    }

    @Override // O1.J
    public final void r1(O o4) {
        Parcel Q3 = Q();
        AbstractC1192t4.e(Q3, o4);
        G1(Q3, 8);
    }

    @Override // O1.J
    public final void t0(U0 u02, InterfaceC0100z interfaceC0100z) {
        Parcel Q3 = Q();
        AbstractC1192t4.c(Q3, u02);
        AbstractC1192t4.e(Q3, interfaceC0100z);
        G1(Q3, 43);
    }

    @Override // O1.J
    public final void t3(R0 r02) {
        throw null;
    }

    @Override // O1.J
    public final void w() {
        G1(Q(), 2);
    }

    @Override // O1.J
    public final void w3(InterfaceC0096x interfaceC0096x) {
        Parcel Q3 = Q();
        AbstractC1192t4.e(Q3, interfaceC0096x);
        G1(Q3, 7);
    }

    @Override // O1.J
    public final void z() {
        G1(Q(), 6);
    }
}
