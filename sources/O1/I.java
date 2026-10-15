package O1;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC1149s4;
import com.google.android.gms.internal.ads.AbstractC1106r4;
import com.google.android.gms.internal.ads.AbstractC1192t4;
import com.google.android.gms.internal.ads.C0735ib;
import com.google.android.gms.internal.ads.C1409y6;
import com.google.android.gms.internal.ads.InterfaceC1376xa;
import com.google.android.gms.internal.ads.InterfaceC1419ya;
import com.google.android.gms.internal.ads.U4;
import n2.BinderC1813b;
import n2.InterfaceC1812a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class I extends AbstractBinderC1149s4 implements J {
    public I() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.android.gms.internal.ads.r4] */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.google.android.gms.internal.ads.r4] */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.google.android.gms.internal.ads.r4] */
    /* JADX WARN: Type inference failed for: r2v8, types: [com.google.android.gms.internal.ads.r4] */
    /* JADX WARN: Type inference failed for: r3v4, types: [com.google.android.gms.internal.ads.r4] */
    @Override // com.google.android.gms.internal.ads.AbstractBinderC1149s4
    public final boolean J3(int i4, Parcel parcel, Parcel parcel2) {
        InterfaceC0096x interfaceC0096x = null;
        U u2 = null;
        InterfaceC0100z interfaceC0100z = null;
        InterfaceC0074l0 interfaceC0074l0 = null;
        U4 u4 = null;
        C0735ib c0735ib = null;
        S s4 = null;
        InterfaceC0090u interfaceC0090u = null;
        C1409y6 c1409y6 = null;
        O o4 = null;
        switch (i4) {
            case 1:
                InterfaceC1812a m4 = m();
                parcel2.writeNoException();
                AbstractC1192t4.e(parcel2, m4);
                return true;
            case 2:
                w();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean p3 = p3();
                parcel2.writeNoException();
                ClassLoader classLoader = AbstractC1192t4.f10673a;
                parcel2.writeInt(p3 ? 1 : 0);
                return true;
            case 4:
                U0 u02 = (U0) AbstractC1192t4.a(parcel, U0.CREATOR);
                AbstractC1192t4.b(parcel);
                boolean h22 = h2(u02);
                parcel2.writeNoException();
                parcel2.writeInt(h22 ? 1 : 0);
                return true;
            case 5:
                n1();
                parcel2.writeNoException();
                return true;
            case 6:
                z();
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    interfaceC0096x = queryLocalInterface instanceof InterfaceC0096x ? (InterfaceC0096x) queryLocalInterface : new C0092v(readStrongBinder);
                }
                AbstractC1192t4.b(parcel);
                w3(interfaceC0096x);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    o4 = queryLocalInterface2 instanceof O ? (O) queryLocalInterface2 : new M(readStrongBinder2);
                }
                AbstractC1192t4.b(parcel);
                r1(o4);
                parcel2.writeNoException();
                return true;
            case 9:
                S();
                parcel2.writeNoException();
                return true;
            case 10:
                parcel2.writeNoException();
                return true;
            case 11:
                G();
                parcel2.writeNoException();
                return true;
            case 12:
                X0 h4 = h();
                parcel2.writeNoException();
                AbstractC1192t4.d(parcel2, h4);
                return true;
            case 13:
                X0 x02 = (X0) AbstractC1192t4.a(parcel, X0.CREATOR);
                AbstractC1192t4.b(parcel);
                O2(x02);
                parcel2.writeNoException();
                return true;
            case 14:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
                    if (queryLocalInterface3 instanceof InterfaceC1376xa) {
                    }
                }
                AbstractC1192t4.b(parcel);
                E();
                parcel2.writeNoException();
                return true;
            case 15:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
                    if (queryLocalInterface4 instanceof InterfaceC1419ya) {
                    }
                }
                parcel.readString();
                AbstractC1192t4.b(parcel);
                b0();
                parcel2.writeNoException();
                return true;
            case 16:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                String D4 = D();
                parcel2.writeNoException();
                parcel2.writeString(D4);
                return true;
            case 19:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
                    c1409y6 = queryLocalInterface5 instanceof C1409y6 ? (C1409y6) queryLocalInterface5 : new AbstractC1106r4(readStrongBinder5, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener", 0);
                }
                AbstractC1192t4.b(parcel);
                Z1(c1409y6);
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    interfaceC0090u = queryLocalInterface6 instanceof InterfaceC0090u ? (InterfaceC0090u) queryLocalInterface6 : new AbstractC1106r4(readStrongBinder6, "com.google.android.gms.ads.internal.client.IAdClickListener", 0);
                }
                AbstractC1192t4.b(parcel);
                q3(interfaceC0090u);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    s4 = queryLocalInterface7 instanceof S ? (S) queryLocalInterface7 : new S(readStrongBinder7);
                }
                AbstractC1192t4.b(parcel);
                z2(s4);
                parcel2.writeNoException();
                return true;
            case 22:
                boolean f4 = AbstractC1192t4.f(parcel);
                AbstractC1192t4.b(parcel);
                B3(f4);
                parcel2.writeNoException();
                return true;
            case 23:
                boolean H22 = H2();
                parcel2.writeNoException();
                ClassLoader classLoader2 = AbstractC1192t4.f10673a;
                parcel2.writeInt(H22 ? 1 : 0);
                return true;
            case 24:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    c0735ib = queryLocalInterface8 instanceof C0735ib ? (C0735ib) queryLocalInterface8 : new C0735ib(readStrongBinder8);
                }
                AbstractC1192t4.b(parcel);
                U0(c0735ib);
                parcel2.writeNoException();
                return true;
            case 25:
                parcel.readString();
                AbstractC1192t4.b(parcel);
                W1();
                parcel2.writeNoException();
                return true;
            case 26:
                InterfaceC0089t0 l4 = l();
                parcel2.writeNoException();
                AbstractC1192t4.e(parcel2, l4);
                return true;
            case 29:
                R0 r02 = (R0) AbstractC1192t4.a(parcel, R0.CREATOR);
                AbstractC1192t4.b(parcel);
                t3(r02);
                parcel2.writeNoException();
                return true;
            case 30:
                AbstractC1192t4.b(parcel);
                R();
                parcel2.writeNoException();
                return true;
            case 31:
                String C4 = C();
                parcel2.writeNoException();
                parcel2.writeString(C4);
                return true;
            case 32:
                O j4 = j();
                parcel2.writeNoException();
                AbstractC1192t4.e(parcel2, j4);
                return true;
            case 33:
                InterfaceC0096x g4 = g();
                parcel2.writeNoException();
                AbstractC1192t4.e(parcel2, g4);
                return true;
            case 34:
                boolean f5 = AbstractC1192t4.f(parcel);
                AbstractC1192t4.b(parcel);
                g2(f5);
                parcel2.writeNoException();
                return true;
            case 35:
                String x4 = x();
                parcel2.writeNoException();
                parcel2.writeString(x4);
                return true;
            case 36:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    if (queryLocalInterface9 instanceof L) {
                    }
                }
                AbstractC1192t4.b(parcel);
                g0();
                parcel2.writeNoException();
                return true;
            case 37:
                Bundle i5 = i();
                parcel2.writeNoException();
                AbstractC1192t4.d(parcel2, i5);
                return true;
            case 38:
                parcel.readString();
                AbstractC1192t4.b(parcel);
                h0();
                parcel2.writeNoException();
                return true;
            case 39:
                a1 a1Var = (a1) AbstractC1192t4.a(parcel, a1.CREATOR);
                AbstractC1192t4.b(parcel);
                n2(a1Var);
                parcel2.writeNoException();
                return true;
            case 40:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
                    u4 = queryLocalInterface10 instanceof U4 ? (U4) queryLocalInterface10 : new AbstractC1106r4(readStrongBinder10, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback", 0);
                }
                AbstractC1192t4.b(parcel);
                E3(u4);
                parcel2.writeNoException();
                return true;
            case 41:
                InterfaceC0084q0 k3 = k();
                parcel2.writeNoException();
                AbstractC1192t4.e(parcel2, k3);
                return true;
            case 42:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    interfaceC0074l0 = queryLocalInterface11 instanceof InterfaceC0074l0 ? (InterfaceC0074l0) queryLocalInterface11 : new C0072k0(readStrongBinder11);
                }
                AbstractC1192t4.b(parcel);
                f3(interfaceC0074l0);
                parcel2.writeNoException();
                return true;
            case 43:
                U0 u03 = (U0) AbstractC1192t4.a(parcel, U0.CREATOR);
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    interfaceC0100z = queryLocalInterface12 instanceof InterfaceC0100z ? (InterfaceC0100z) queryLocalInterface12 : new AbstractC1106r4(readStrongBinder12, "com.google.android.gms.ads.internal.client.IAdLoadCallback", 0);
                }
                AbstractC1192t4.b(parcel);
                t0(u03, interfaceC0100z);
                parcel2.writeNoException();
                return true;
            case 44:
                InterfaceC1812a G12 = BinderC1813b.G1(parcel.readStrongBinder());
                AbstractC1192t4.b(parcel);
                W0(G12);
                parcel2.writeNoException();
                return true;
            case 45:
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    u2 = queryLocalInterface13 instanceof U ? (U) queryLocalInterface13 : new AbstractC1106r4(readStrongBinder13, "com.google.android.gms.ads.internal.client.IFullScreenContentCallback", 0);
                }
                AbstractC1192t4.b(parcel);
                H3(u2);
                parcel2.writeNoException();
                return true;
        }
    }
}
