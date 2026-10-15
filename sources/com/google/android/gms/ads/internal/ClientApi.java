package com.google.android.gms.ads.internal;

import N1.m;
import O1.F;
import O1.I;
import O1.InterfaceC0052a0;
import O1.InterfaceC0078n0;
import O1.J;
import O1.Q;
import O1.X0;
import O1.r;
import P1.a;
import P1.k;
import W1.b;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.AB;
import com.google.android.gms.internal.ads.AbstractBinderC1149s4;
import com.google.android.gms.internal.ads.AbstractC0587ez;
import com.google.android.gms.internal.ads.AbstractC1066q6;
import com.google.android.gms.internal.ads.AbstractC1106r4;
import com.google.android.gms.internal.ads.AbstractC1192t4;
import com.google.android.gms.internal.ads.BinderC0314Ne;
import com.google.android.gms.internal.ads.BinderC0489cm;
import com.google.android.gms.internal.ads.BinderC0983o9;
import com.google.android.gms.internal.ads.BinderC1171sk;
import com.google.android.gms.internal.ads.BinderC1305vp;
import com.google.android.gms.internal.ads.BinderC1346wn;
import com.google.android.gms.internal.ads.BinderC1348wp;
import com.google.android.gms.internal.ads.BinderC1432yn;
import com.google.android.gms.internal.ads.Bj;
import com.google.android.gms.internal.ads.Bn;
import com.google.android.gms.internal.ads.C0248Bc;
import com.google.android.gms.internal.ads.C0268Ee;
import com.google.android.gms.internal.ads.C0610ff;
import com.google.android.gms.internal.ads.C0658gk;
import com.google.android.gms.internal.ads.C0783ji;
import com.google.android.gms.internal.ads.C0874ln;
import com.google.android.gms.internal.ads.C1000ok;
import com.google.android.gms.internal.ads.C1025p8;
import com.google.android.gms.internal.ads.C1122re;
import com.google.android.gms.internal.ads.C1388xm;
import com.google.android.gms.internal.ads.C1414yB;
import com.google.android.gms.internal.ads.C1423ye;
import com.google.android.gms.internal.ads.En;
import com.google.android.gms.internal.ads.Eo;
import com.google.android.gms.internal.ads.Ii;
import com.google.android.gms.internal.ads.InterfaceC0650gc;
import com.google.android.gms.internal.ads.InterfaceC0947na;
import com.google.android.gms.internal.ads.InterfaceC1069q9;
import com.google.android.gms.internal.ads.InterfaceC1162sb;
import com.google.android.gms.internal.ads.InterfaceC1204ta;
import com.google.android.gms.internal.ads.InterfaceC1281v7;
import com.google.android.gms.internal.ads.Ji;
import com.google.android.gms.internal.ads.Vk;
import com.google.android.gms.internal.ads.Wj;
import com.google.android.gms.internal.ads.Y9;
import com.google.android.gms.internal.ads.Yo;
import com.google.android.gms.internal.ads.Zo;
import java.util.HashMap;
import n2.BinderC1813b;
import n2.InterfaceC1812a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class ClientApi extends AbstractBinderC1149s4 implements Q {
    public ClientApi() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // O1.Q
    public final F A1(InterfaceC1812a interfaceC1812a, String str, InterfaceC1069q9 interfaceC1069q9, int i4) {
        Context context = (Context) BinderC1813b.C2(interfaceC1812a);
        return new BinderC1346wn(C1423ye.c(context, interfaceC1069q9, i4), context, str);
    }

    @Override // O1.Q
    public final InterfaceC1162sb E1(InterfaceC1812a interfaceC1812a, String str, InterfaceC1069q9 interfaceC1069q9, int i4) {
        Context context = (Context) BinderC1813b.C2(interfaceC1812a);
        C1423ye c1423ye = C1423ye.c(context, interfaceC1069q9, i4).f11395b;
        context.getClass();
        return (BinderC1305vp) ((C1414yB) new C0783ji(c1423ye, context, str).f9212q).c();
    }

    @Override // O1.Q
    public final InterfaceC1204ta I(InterfaceC1812a interfaceC1812a) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        Activity activity = (Activity) BinderC1813b.C2(interfaceC1812a);
        try {
            Bundle bundleExtra = activity.getIntent().getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            adOverlayInfoParcel = (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception unused) {
            adOverlayInfoParcel = null;
        }
        if (adOverlayInfoParcel == null) {
            return new a(activity, 4);
        }
        int i4 = adOverlayInfoParcel.y;
        return i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? i4 != 5 ? new a(activity, 4) : new a(activity, 0) : new k(activity, adOverlayInfoParcel) : new a(activity, 2) : new a(activity, 1) : new a(activity, 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [com.google.android.gms.internal.ads.r4] */
    @Override // com.google.android.gms.internal.ads.AbstractBinderC1149s4
    public final boolean J3(int i4, Parcel parcel, Parcel parcel2) {
        C1025p8 c1025p8 = null;
        switch (i4) {
            case 1:
                InterfaceC1812a G12 = BinderC1813b.G1(parcel.readStrongBinder());
                X0 x02 = (X0) AbstractC1192t4.a(parcel, X0.CREATOR);
                String readString = parcel.readString();
                InterfaceC1069q9 K32 = BinderC0983o9.K3(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                AbstractC1192t4.b(parcel);
                J x32 = x3(G12, x02, readString, K32, readInt);
                parcel2.writeNoException();
                AbstractC1192t4.e(parcel2, x32);
                return true;
            case 2:
                InterfaceC1812a G13 = BinderC1813b.G1(parcel.readStrongBinder());
                X0 x03 = (X0) AbstractC1192t4.a(parcel, X0.CREATOR);
                String readString2 = parcel.readString();
                InterfaceC1069q9 K33 = BinderC0983o9.K3(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                AbstractC1192t4.b(parcel);
                J P02 = P0(G13, x03, readString2, K33, readInt2);
                parcel2.writeNoException();
                AbstractC1192t4.e(parcel2, P02);
                return true;
            case 3:
                InterfaceC1812a G14 = BinderC1813b.G1(parcel.readStrongBinder());
                String readString3 = parcel.readString();
                InterfaceC1069q9 K34 = BinderC0983o9.K3(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                AbstractC1192t4.b(parcel);
                F A1 = A1(G14, readString3, K34, readInt3);
                parcel2.writeNoException();
                AbstractC1192t4.e(parcel2, A1);
                return true;
            case 4:
                BinderC1813b.G1(parcel.readStrongBinder());
                AbstractC1192t4.b(parcel);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(null);
                return true;
            case 5:
                InterfaceC1812a G15 = BinderC1813b.G1(parcel.readStrongBinder());
                InterfaceC1812a G16 = BinderC1813b.G1(parcel.readStrongBinder());
                AbstractC1192t4.b(parcel);
                InterfaceC1281v7 w12 = w1(G15, G16);
                parcel2.writeNoException();
                AbstractC1192t4.e(parcel2, w12);
                return true;
            case 6:
                InterfaceC1812a G17 = BinderC1813b.G1(parcel.readStrongBinder());
                InterfaceC1069q9 K35 = BinderC0983o9.K3(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                AbstractC1192t4.b(parcel);
                Context context = (Context) BinderC1813b.C2(G17);
                C1423ye c1423ye = C1423ye.c(context, K35, readInt4).f11395b;
                context.getClass();
                BinderC1348wp binderC1348wp = (BinderC1348wp) ((C1414yB) new C0783ji(c1423ye, context, (String) null).f9211p).c();
                parcel2.writeNoException();
                AbstractC1192t4.e(parcel2, binderC1348wp);
                return true;
            case 7:
                BinderC1813b.G1(parcel.readStrongBinder());
                AbstractC1192t4.b(parcel);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(null);
                return true;
            case 8:
                InterfaceC1812a G18 = BinderC1813b.G1(parcel.readStrongBinder());
                AbstractC1192t4.b(parcel);
                InterfaceC1204ta I4 = I(G18);
                parcel2.writeNoException();
                AbstractC1192t4.e(parcel2, I4);
                return true;
            case 9:
                InterfaceC1812a G19 = BinderC1813b.G1(parcel.readStrongBinder());
                int readInt5 = parcel.readInt();
                AbstractC1192t4.b(parcel);
                InterfaceC0052a0 e02 = e0(G19, readInt5);
                parcel2.writeNoException();
                AbstractC1192t4.e(parcel2, e02);
                return true;
            case 10:
                InterfaceC1812a G110 = BinderC1813b.G1(parcel.readStrongBinder());
                X0 x04 = (X0) AbstractC1192t4.a(parcel, X0.CREATOR);
                String readString4 = parcel.readString();
                int readInt6 = parcel.readInt();
                AbstractC1192t4.b(parcel);
                J k1 = k1(G110, x04, readString4, readInt6);
                parcel2.writeNoException();
                AbstractC1192t4.e(parcel2, k1);
                return true;
            case 11:
                InterfaceC1812a G111 = BinderC1813b.G1(parcel.readStrongBinder());
                InterfaceC1812a G112 = BinderC1813b.G1(parcel.readStrongBinder());
                InterfaceC1812a G113 = BinderC1813b.G1(parcel.readStrongBinder());
                AbstractC1192t4.b(parcel);
                Ii ii = new Ii((View) BinderC1813b.C2(G111), (HashMap) BinderC1813b.C2(G112), (HashMap) BinderC1813b.C2(G113));
                parcel2.writeNoException();
                AbstractC1192t4.e(parcel2, ii);
                return true;
            case 12:
                InterfaceC1812a G114 = BinderC1813b.G1(parcel.readStrongBinder());
                String readString5 = parcel.readString();
                InterfaceC1069q9 K36 = BinderC0983o9.K3(parcel.readStrongBinder());
                int readInt7 = parcel.readInt();
                AbstractC1192t4.b(parcel);
                InterfaceC1162sb E12 = E1(G114, readString5, K36, readInt7);
                parcel2.writeNoException();
                AbstractC1192t4.e(parcel2, E12);
                return true;
            case 13:
                InterfaceC1812a G115 = BinderC1813b.G1(parcel.readStrongBinder());
                X0 x05 = (X0) AbstractC1192t4.a(parcel, X0.CREATOR);
                String readString6 = parcel.readString();
                InterfaceC1069q9 K37 = BinderC0983o9.K3(parcel.readStrongBinder());
                int readInt8 = parcel.readInt();
                AbstractC1192t4.b(parcel);
                J o22 = o2(G115, x05, readString6, K37, readInt8);
                parcel2.writeNoException();
                AbstractC1192t4.e(parcel2, o22);
                return true;
            case 14:
                InterfaceC1812a G116 = BinderC1813b.G1(parcel.readStrongBinder());
                InterfaceC1069q9 K38 = BinderC0983o9.K3(parcel.readStrongBinder());
                int readInt9 = parcel.readInt();
                AbstractC1192t4.b(parcel);
                InterfaceC0650gc t22 = t2(G116, K38, readInt9);
                parcel2.writeNoException();
                AbstractC1192t4.e(parcel2, t22);
                return true;
            case 15:
                InterfaceC1812a G117 = BinderC1813b.G1(parcel.readStrongBinder());
                InterfaceC1069q9 K39 = BinderC0983o9.K3(parcel.readStrongBinder());
                int readInt10 = parcel.readInt();
                AbstractC1192t4.b(parcel);
                InterfaceC0947na N22 = N2(G117, K39, readInt10);
                parcel2.writeNoException();
                AbstractC1192t4.e(parcel2, N22);
                return true;
            case 16:
                InterfaceC1812a G118 = BinderC1813b.G1(parcel.readStrongBinder());
                InterfaceC1069q9 K310 = BinderC0983o9.K3(parcel.readStrongBinder());
                int readInt11 = parcel.readInt();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
                    c1025p8 = queryLocalInterface instanceof C1025p8 ? (C1025p8) queryLocalInterface : new AbstractC1106r4(readStrongBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener", 0);
                }
                AbstractC1192t4.b(parcel);
                Context context2 = (Context) BinderC1813b.C2(G118);
                C1423ye c1423ye2 = C1423ye.c(context2, K310, readInt11).f11395b;
                context2.getClass();
                c1025p8.getClass();
                BinderC1171sk binderC1171sk = (BinderC1171sk) new C0268Ee(c1423ye2, context2, c1025p8).f4907e.c();
                parcel2.writeNoException();
                AbstractC1192t4.e(parcel2, binderC1171sk);
                return true;
            case 17:
                InterfaceC1812a G119 = BinderC1813b.G1(parcel.readStrongBinder());
                InterfaceC1069q9 K311 = BinderC0983o9.K3(parcel.readStrongBinder());
                int readInt12 = parcel.readInt();
                AbstractC1192t4.b(parcel);
                InterfaceC0078n0 a12 = a1(G119, K311, readInt12);
                parcel2.writeNoException();
                AbstractC1192t4.e(parcel2, a12);
                return true;
            default:
                return false;
        }
    }

    @Override // O1.Q
    public final InterfaceC0947na N2(InterfaceC1812a interfaceC1812a, InterfaceC1069q9 interfaceC1069q9, int i4) {
        return (BinderC0489cm) C1423ye.c((Context) BinderC1813b.C2(interfaceC1812a), interfaceC1069q9, i4).f11371D.c();
    }

    @Override // O1.Q
    public final J P0(InterfaceC1812a interfaceC1812a, X0 x02, String str, InterfaceC1069q9 interfaceC1069q9, int i4) {
        Context context = (Context) BinderC1813b.C2(interfaceC1812a);
        C1423ye c1423ye = C1423ye.c(context, interfaceC1069q9, i4).f11395b;
        context.getClass();
        x02.getClass();
        str.getClass();
        return (En) ((C1414yB) new C0874ln(c1423ye, context, str, x02).f9467p).c();
    }

    @Override // O1.Q
    public final InterfaceC0078n0 a1(InterfaceC1812a interfaceC1812a, InterfaceC1069q9 interfaceC1069q9, int i4) {
        return (Vk) C1423ye.c((Context) BinderC1813b.C2(interfaceC1812a), interfaceC1069q9, i4).f11420u.c();
    }

    @Override // O1.Q
    public final InterfaceC0052a0 e0(InterfaceC1812a interfaceC1812a, int i4) {
        return (BinderC0314Ne) C1423ye.c((Context) BinderC1813b.C2(interfaceC1812a), null, i4).f11423x.c();
    }

    @Override // O1.Q
    public final J k1(InterfaceC1812a interfaceC1812a, X0 x02, String str, int i4) {
        return new m((Context) BinderC1813b.C2(interfaceC1812a), x02, str, new C0248Bc(i4, false));
    }

    @Override // O1.Q
    public final J o2(InterfaceC1812a interfaceC1812a, X0 x02, String str, InterfaceC1069q9 interfaceC1069q9, int i4) {
        Context context = (Context) BinderC1813b.C2(interfaceC1812a);
        C1423ye c1423ye = C1423ye.c(context, interfaceC1069q9, i4).f11395b;
        str.getClass();
        context.getClass();
        AB a4 = AB.a(context);
        AB a5 = AB.a(str);
        C1414yB c1414yB = c1423ye.f11400e0;
        C1388xm c1388xm = new C1388xm(a4, c1414yB, c1423ye.f11402f0, 6);
        C1414yB b4 = C1414yB.b(new Eo(c1414yB, 3));
        C1414yB c1414yB2 = c1423ye.f11403g;
        AB ab = c1423ye.y;
        C1122re c1122re = c1423ye.d;
        return i4 >= ((Integer) r.d.c.a(AbstractC1066q6.z4)).intValue() ? (Yo) C1414yB.b(new Bj(ab, a4, a5, C1414yB.b(new C0610ff(a4, c1414yB2, ab, c1388xm, b4, c1122re)), b4, c1122re, c1423ye.f11370C)).c() : new I();
    }

    @Override // O1.Q
    public final InterfaceC0650gc t2(InterfaceC1812a interfaceC1812a, InterfaceC1069q9 interfaceC1069q9, int i4) {
        return (b) C1423ye.c((Context) BinderC1813b.C2(interfaceC1812a), interfaceC1069q9, i4).f11373F.c();
    }

    @Override // O1.Q
    public final InterfaceC1281v7 w1(InterfaceC1812a interfaceC1812a, InterfaceC1812a interfaceC1812a2) {
        return new Ji((FrameLayout) BinderC1813b.C2(interfaceC1812a), (FrameLayout) BinderC1813b.C2(interfaceC1812a2));
    }

    @Override // O1.Q
    public final J x3(InterfaceC1812a interfaceC1812a, X0 x02, String str, InterfaceC1069q9 interfaceC1069q9, int i4) {
        Context context = (Context) BinderC1813b.C2(interfaceC1812a);
        C1423ye c1423ye = C1423ye.c(context, interfaceC1069q9, i4).f11395b;
        context.getClass();
        x02.getClass();
        str.getClass();
        AB a4 = AB.a(context);
        AB a5 = AB.a(x02);
        C1414yB b4 = C1414yB.b(new C1000ok(c1423ye.f11401f, 18));
        Zo zo = (Zo) C1414yB.b(new Bj(a4, c1423ye.f11403g, a5, c1423ye.y, b4, C1414yB.b(Wj.f7546o), C1414yB.b(Y9.f7759J))).c();
        Bn bn = (Bn) b4.c();
        C0248Bc c0248Bc = c1423ye.f11393a.f9163a;
        AbstractC0587ez.n(c0248Bc);
        return new BinderC1432yn(context, x02, str, zo, bn, c0248Bc, (C0658gk) c1423ye.f11370C.c());
    }
}
