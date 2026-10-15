package com.google.android.gms.internal.ads;

import O1.C0081p;
import O1.InterfaceC0089t0;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.internal.measurement.C1510e1;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import n2.BinderC1813b;
import n2.InterfaceC1812a;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class G9 extends AbstractBinderC1149s4 implements InterfaceC1154s9 {

    /* renamed from: o, reason: collision with root package name */
    public final Object f5136o;

    /* renamed from: p, reason: collision with root package name */
    public Op f5137p;

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC0905mb f5138q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC1812a f5139r;

    public G9() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    public G9(S1.a aVar) {
        this();
        this.f5136o = aVar;
    }

    public G9(S1.e eVar) {
        this();
        this.f5136o = eVar;
    }

    public static final boolean N3(O1.U0 u02) {
        if (u02.f1311t) {
            return true;
        }
        C1335wc c1335wc = C0081p.f1374f.f1375a;
        return C1335wc.j();
    }

    public static final String O3(O1.U0 u02, String str) {
        String str2 = u02.f1301I;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1154s9
    public final void C1(InterfaceC1812a interfaceC1812a, InterfaceC1411y8 interfaceC1411y8, ArrayList arrayList) {
        Object obj = this.f5136o;
        if (!(obj instanceof S1.a)) {
            throw new RemoteException();
        }
        C1016p c1016p = new C1016p(18);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj2 = arrayList.get(i4);
            i4++;
            String str = ((B8) obj2).f4029o;
            switch (str.hashCode()) {
                case -1396342996:
                    if (!str.equals("banner")) {
                        break;
                    } else {
                        break;
                    }
                case -1052618729:
                    if (!str.equals("native")) {
                        break;
                    } else {
                        break;
                    }
                case -239580146:
                    if (!str.equals("rewarded")) {
                        break;
                    } else {
                        break;
                    }
                case 604727084:
                    if (!str.equals("interstitial")) {
                        break;
                    } else {
                        break;
                    }
                case 1167692200:
                    if (!str.equals("app_open")) {
                        break;
                    } else {
                        break;
                    }
                case 1778294298:
                    if (!str.equals("app_open_ad")) {
                        break;
                    } else {
                        if (!((Boolean) O1.r.d.c.a(AbstractC1066q6.X9)).booleanValue()) {
                            break;
                        } else {
                            break;
                        }
                    }
                case 1911491517:
                    if (!str.equals("rewarded_interstitial")) {
                        break;
                    } else {
                        break;
                    }
            }
            arrayList2.add(new V2.e(13));
        }
        ((S1.a) obj).initialize((Context) BinderC1813b.C2(interfaceC1812a), c1016p, arrayList2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1154s9
    public final boolean E() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, S1.m] */
    @Override // com.google.android.gms.internal.ads.InterfaceC1154s9
    public final void F2(InterfaceC1812a interfaceC1812a, O1.U0 u02, String str, InterfaceC1283v9 interfaceC1283v9) {
        Object obj = this.f5136o;
        if (!(obj instanceof S1.a)) {
            Y9.s(S1.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        Y9.m("Requesting rewarded interstitial ad from adapter.");
        try {
            E9 e9 = new E9(this, interfaceC1283v9, 1);
            M3(str, u02, null);
            L3(u02);
            N3(u02);
            O3(u02, str);
            ((S1.a) obj).loadRewardedInterstitialAd(new Object(), e9);
        } catch (Exception e4) {
            Y9.q("", e4);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1154s9
    public final boolean H() {
        String canonicalName;
        Object obj = this.f5136o;
        if ((obj instanceof S1.a) || (canonicalName = obj.getClass().getCanonicalName()) == "com.google.ads.mediation.admob.AdMobAdapter" || (canonicalName != null && canonicalName.equals("com.google.ads.mediation.admob.AdMobAdapter"))) {
            return this.f5138q != null;
        }
        Y9.s(S1.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, S1.i] */
    @Override // com.google.android.gms.internal.ads.InterfaceC1154s9
    public final void J2(InterfaceC1812a interfaceC1812a, O1.U0 u02, String str, String str2, InterfaceC1283v9 interfaceC1283v9) {
        Object obj = this.f5136o;
        boolean z4 = obj instanceof MediationInterstitialAdapter;
        if (!z4 && !(obj instanceof S1.a)) {
            Y9.s(MediationInterstitialAdapter.class.getCanonicalName() + " or " + S1.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        Y9.m("Requesting interstitial ad from adapter.");
        if (!z4) {
            if (obj instanceof S1.a) {
                try {
                    F9 f9 = new F9(this, interfaceC1283v9, 0);
                    M3(str, u02, str2);
                    L3(u02);
                    N3(u02);
                    O3(u02, str);
                    ((S1.a) obj).loadInterstitialAd(new Object(), f9);
                    return;
                } finally {
                    RemoteException e4 = U.a.e("", th);
                }
            }
            return;
        }
        try {
            MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) obj;
            List list = u02.f1310s;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j4 = u02.f1307p;
            Date date = j4 == -1 ? null : new Date(j4);
            int i4 = u02.f1309r;
            boolean N32 = N3(u02);
            int i5 = u02.f1312u;
            boolean z5 = u02.f1298F;
            O3(u02, str);
            D9 d9 = new D9(date, i4, hashSet, N32, i5, z5);
            Bundle bundle = u02.f1293A;
            mediationInterstitialAdapter.requestInterstitialAd((Context) BinderC1813b.C2(interfaceC1812a), new Op(interfaceC1283v9), M3(str, u02, str2), d9, bundle != null ? bundle.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
        } catch (Throwable th) {
            throw U.a.e(r7, th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11, types: [com.google.android.gms.internal.ads.r4] */
    /* JADX WARN: Type inference failed for: r6v17, types: [com.google.android.gms.internal.ads.r4] */
    /* JADX WARN: Type inference failed for: r6v21, types: [com.google.android.gms.internal.ads.r4] */
    @Override // com.google.android.gms.internal.ads.AbstractBinderC1149s4
    public final boolean J3(int i4, Parcel parcel, Parcel parcel2) {
        InterfaceC1283v9 c1197t9;
        InterfaceC1283v9 c1197t92;
        InterfaceC1283v9 c1197t93;
        InterfaceC1283v9 c1197t94;
        InterfaceC0905mb interfaceC0905mb;
        InterfaceC1283v9 c1197t95;
        InterfaceC0905mb interfaceC0905mb2;
        C0874ln c0874ln;
        InterfaceC1283v9 c1197t96;
        InterfaceC1411y8 interfaceC1411y8;
        InterfaceC1283v9 c1197t97;
        InterfaceC1283v9 c1197t98;
        InterfaceC1283v9 interfaceC1283v9 = null;
        switch (i4) {
            case 1:
                InterfaceC1812a G12 = BinderC1813b.G1(parcel.readStrongBinder());
                O1.X0 x02 = (O1.X0) AbstractC1192t4.a(parcel, O1.X0.CREATOR);
                O1.U0 u02 = (O1.U0) AbstractC1192t4.a(parcel, O1.U0.CREATOR);
                String readString = parcel.readString();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    c1197t9 = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c1197t9 = queryLocalInterface instanceof InterfaceC1283v9 ? (InterfaceC1283v9) queryLocalInterface : new C1197t9(readStrongBinder);
                }
                AbstractC1192t4.b(parcel);
                s2(G12, x02, u02, readString, null, c1197t9);
                parcel2.writeNoException();
                return true;
            case 2:
                InterfaceC1812a m4 = m();
                parcel2.writeNoException();
                AbstractC1192t4.e(parcel2, m4);
                return true;
            case 3:
                InterfaceC1812a G13 = BinderC1813b.G1(parcel.readStrongBinder());
                O1.U0 u03 = (O1.U0) AbstractC1192t4.a(parcel, O1.U0.CREATOR);
                String readString2 = parcel.readString();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 == null) {
                    c1197t92 = null;
                } else {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c1197t92 = queryLocalInterface2 instanceof InterfaceC1283v9 ? (InterfaceC1283v9) queryLocalInterface2 : new C1197t9(readStrongBinder2);
                }
                AbstractC1192t4.b(parcel);
                J2(G13, u03, readString2, null, c1197t92);
                parcel2.writeNoException();
                return true;
            case 4:
                d0();
                parcel2.writeNoException();
                return true;
            case 5:
                n();
                parcel2.writeNoException();
                return true;
            case 6:
                InterfaceC1812a G14 = BinderC1813b.G1(parcel.readStrongBinder());
                O1.X0 x03 = (O1.X0) AbstractC1192t4.a(parcel, O1.X0.CREATOR);
                O1.U0 u04 = (O1.U0) AbstractC1192t4.a(parcel, O1.U0.CREATOR);
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 == null) {
                    c1197t93 = null;
                } else {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c1197t93 = queryLocalInterface3 instanceof InterfaceC1283v9 ? (InterfaceC1283v9) queryLocalInterface3 : new C1197t9(readStrongBinder3);
                }
                AbstractC1192t4.b(parcel);
                s2(G14, x03, u04, readString3, readString4, c1197t93);
                parcel2.writeNoException();
                return true;
            case 7:
                InterfaceC1812a G15 = BinderC1813b.G1(parcel.readStrongBinder());
                O1.U0 u05 = (O1.U0) AbstractC1192t4.a(parcel, O1.U0.CREATOR);
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 == null) {
                    c1197t94 = null;
                } else {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c1197t94 = queryLocalInterface4 instanceof InterfaceC1283v9 ? (InterfaceC1283v9) queryLocalInterface4 : new C1197t9(readStrongBinder4);
                }
                AbstractC1192t4.b(parcel);
                J2(G15, u05, readString5, readString6, c1197t94);
                parcel2.writeNoException();
                return true;
            case 8:
                p1();
                parcel2.writeNoException();
                return true;
            case 9:
                L();
                parcel2.writeNoException();
                return true;
            case 10:
                InterfaceC1812a G16 = BinderC1813b.G1(parcel.readStrongBinder());
                O1.U0 u06 = (O1.U0) AbstractC1192t4.a(parcel, O1.U0.CREATOR);
                parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 == null) {
                    interfaceC0905mb = null;
                } else {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                    interfaceC0905mb = queryLocalInterface5 instanceof InterfaceC0905mb ? (InterfaceC0905mb) queryLocalInterface5 : new AbstractC1106r4(readStrongBinder5, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener", 0);
                }
                String readString7 = parcel.readString();
                AbstractC1192t4.b(parcel);
                N1(G16, u06, interfaceC0905mb, readString7);
                parcel2.writeNoException();
                return true;
            case 11:
                O1.U0 u07 = (O1.U0) AbstractC1192t4.a(parcel, O1.U0.CREATOR);
                String readString8 = parcel.readString();
                AbstractC1192t4.b(parcel);
                K3(u07, readString8);
                parcel2.writeNoException();
                return true;
            case 12:
                V2();
                throw null;
            case 13:
                boolean H3 = H();
                parcel2.writeNoException();
                ClassLoader classLoader = AbstractC1192t4.f10673a;
                parcel2.writeInt(H3 ? 1 : 0);
                return true;
            case 14:
                InterfaceC1812a G17 = BinderC1813b.G1(parcel.readStrongBinder());
                O1.U0 u08 = (O1.U0) AbstractC1192t4.a(parcel, O1.U0.CREATOR);
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 == null) {
                    c1197t95 = null;
                } else {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c1197t95 = queryLocalInterface6 instanceof InterfaceC1283v9 ? (InterfaceC1283v9) queryLocalInterface6 : new C1197t9(readStrongBinder6);
                }
                C0766j7 c0766j7 = (C0766j7) AbstractC1192t4.a(parcel, C0766j7.CREATOR);
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                AbstractC1192t4.b(parcel);
                o0(G17, u08, readString9, readString10, c1197t95, c0766j7, createStringArrayList);
                parcel2.writeNoException();
                return true;
            case 15:
                parcel2.writeNoException();
                ClassLoader classLoader2 = AbstractC1192t4.f10673a;
                parcel2.writeStrongBinder(null);
                return true;
            case 16:
                parcel2.writeNoException();
                ClassLoader classLoader3 = AbstractC1192t4.f10673a;
                parcel2.writeStrongBinder(null);
                return true;
            case 17:
                Bundle bundle = new Bundle();
                parcel2.writeNoException();
                AbstractC1192t4.d(parcel2, bundle);
                return true;
            case 18:
                Bundle bundle2 = new Bundle();
                parcel2.writeNoException();
                AbstractC1192t4.d(parcel2, bundle2);
                return true;
            case 19:
                Bundle bundle3 = new Bundle();
                parcel2.writeNoException();
                AbstractC1192t4.d(parcel2, bundle3);
                return true;
            case 20:
                O1.U0 u09 = (O1.U0) AbstractC1192t4.a(parcel, O1.U0.CREATOR);
                String readString11 = parcel.readString();
                parcel.readString();
                AbstractC1192t4.b(parcel);
                K3(u09, readString11);
                parcel2.writeNoException();
                return true;
            case 21:
                InterfaceC1812a G18 = BinderC1813b.G1(parcel.readStrongBinder());
                AbstractC1192t4.b(parcel);
                u2(G18);
                parcel2.writeNoException();
                return true;
            case 22:
                parcel2.writeNoException();
                ClassLoader classLoader4 = AbstractC1192t4.f10673a;
                parcel2.writeInt(0);
                return true;
            case 23:
                InterfaceC1812a G19 = BinderC1813b.G1(parcel.readStrongBinder());
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                    interfaceC0905mb2 = queryLocalInterface7 instanceof InterfaceC0905mb ? (InterfaceC0905mb) queryLocalInterface7 : new AbstractC1106r4(readStrongBinder7, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener", 0);
                } else {
                    interfaceC0905mb2 = null;
                }
                ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
                AbstractC1192t4.b(parcel);
                u3(G19, interfaceC0905mb2, createStringArrayList2);
                throw null;
            case 24:
                Op op = this.f5137p;
                C7 c7 = (op == null || (c0874ln = (C0874ln) op.f6527r) == null) ? null : (C7) c0874ln.f9467p;
                parcel2.writeNoException();
                AbstractC1192t4.e(parcel2, c7);
                return true;
            case 25:
                boolean f4 = AbstractC1192t4.f(parcel);
                AbstractC1192t4.b(parcel);
                x1(f4);
                parcel2.writeNoException();
                return true;
            case 26:
                InterfaceC0089t0 f5 = f();
                parcel2.writeNoException();
                AbstractC1192t4.e(parcel2, f5);
                return true;
            case 27:
                B9 k3 = k();
                parcel2.writeNoException();
                AbstractC1192t4.e(parcel2, k3);
                return true;
            case 28:
                InterfaceC1812a G110 = BinderC1813b.G1(parcel.readStrongBinder());
                O1.U0 u010 = (O1.U0) AbstractC1192t4.a(parcel, O1.U0.CREATOR);
                String readString12 = parcel.readString();
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 == null) {
                    c1197t96 = null;
                } else {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c1197t96 = queryLocalInterface8 instanceof InterfaceC1283v9 ? (InterfaceC1283v9) queryLocalInterface8 : new C1197t9(readStrongBinder8);
                }
                AbstractC1192t4.b(parcel);
                m3(G110, u010, readString12, c1197t96);
                parcel2.writeNoException();
                return true;
            case 29:
            default:
                return false;
            case 30:
                InterfaceC1812a G111 = BinderC1813b.G1(parcel.readStrongBinder());
                AbstractC1192t4.b(parcel);
                n0(G111);
                throw null;
            case 31:
                InterfaceC1812a G112 = BinderC1813b.G1(parcel.readStrongBinder());
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 == null) {
                    interfaceC1411y8 = null;
                } else {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
                    interfaceC1411y8 = queryLocalInterface9 instanceof InterfaceC1411y8 ? (InterfaceC1411y8) queryLocalInterface9 : new AbstractC1106r4(readStrongBinder9, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback", 0);
                }
                ArrayList createTypedArrayList = parcel.createTypedArrayList(B8.CREATOR);
                AbstractC1192t4.b(parcel);
                C1(G112, interfaceC1411y8, createTypedArrayList);
                parcel2.writeNoException();
                return true;
            case 32:
                InterfaceC1812a G113 = BinderC1813b.G1(parcel.readStrongBinder());
                O1.U0 u011 = (O1.U0) AbstractC1192t4.a(parcel, O1.U0.CREATOR);
                String readString13 = parcel.readString();
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 == null) {
                    c1197t97 = null;
                } else {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c1197t97 = queryLocalInterface10 instanceof InterfaceC1283v9 ? (InterfaceC1283v9) queryLocalInterface10 : new C1197t9(readStrongBinder10);
                }
                AbstractC1192t4.b(parcel);
                F2(G113, u011, readString13, c1197t97);
                parcel2.writeNoException();
                return true;
            case 33:
                l();
                parcel2.writeNoException();
                ClassLoader classLoader5 = AbstractC1192t4.f10673a;
                parcel2.writeInt(0);
                return true;
            case 34:
                q();
                parcel2.writeNoException();
                ClassLoader classLoader6 = AbstractC1192t4.f10673a;
                parcel2.writeInt(0);
                return true;
            case 35:
                InterfaceC1812a G114 = BinderC1813b.G1(parcel.readStrongBinder());
                O1.X0 x04 = (O1.X0) AbstractC1192t4.a(parcel, O1.X0.CREATOR);
                O1.U0 u012 = (O1.U0) AbstractC1192t4.a(parcel, O1.U0.CREATOR);
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 == null) {
                    c1197t98 = null;
                } else {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c1197t98 = queryLocalInterface11 instanceof InterfaceC1283v9 ? (InterfaceC1283v9) queryLocalInterface11 : new C1197t9(readStrongBinder11);
                }
                AbstractC1192t4.b(parcel);
                b1(G114, x04, u012, readString14, readString15, c1197t98);
                parcel2.writeNoException();
                return true;
            case 36:
                parcel2.writeNoException();
                ClassLoader classLoader7 = AbstractC1192t4.f10673a;
                parcel2.writeStrongBinder(null);
                return true;
            case 37:
                InterfaceC1812a G115 = BinderC1813b.G1(parcel.readStrongBinder());
                AbstractC1192t4.b(parcel);
                X0(G115);
                parcel2.writeNoException();
                return true;
            case 38:
                InterfaceC1812a G116 = BinderC1813b.G1(parcel.readStrongBinder());
                O1.U0 u013 = (O1.U0) AbstractC1192t4.a(parcel, O1.U0.CREATOR);
                String readString16 = parcel.readString();
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    interfaceC1283v9 = queryLocalInterface12 instanceof InterfaceC1283v9 ? (InterfaceC1283v9) queryLocalInterface12 : new C1197t9(readStrongBinder12);
                }
                AbstractC1192t4.b(parcel);
                M0(G116, u013, readString16, interfaceC1283v9);
                parcel2.writeNoException();
                return true;
            case 39:
                InterfaceC1812a G117 = BinderC1813b.G1(parcel.readStrongBinder());
                AbstractC1192t4.b(parcel);
                M2(G117);
                throw null;
        }
    }

    public final void K3(O1.U0 u02, String str) {
        Object obj = this.f5136o;
        if (obj instanceof S1.a) {
            m3(this.f5139r, u02, str, new H9((S1.a) obj, this.f5138q));
            return;
        }
        Y9.s(S1.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1154s9
    public final void L() {
        Object obj = this.f5136o;
        if (obj instanceof S1.e) {
            try {
                ((S1.e) obj).onResume();
            } catch (Throwable th) {
                throw U.a.e("", th);
            }
        }
    }

    public final void L3(O1.U0 u02) {
        Bundle bundle = u02.f1293A;
        if (bundle == null || bundle.getBundle(this.f5136o.getClass().getName()) == null) {
            new Bundle();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [S1.f, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.InterfaceC1154s9
    public final void M0(InterfaceC1812a interfaceC1812a, O1.U0 u02, String str, InterfaceC1283v9 interfaceC1283v9) {
        Object obj = this.f5136o;
        if (!(obj instanceof S1.a)) {
            Y9.s(S1.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        Y9.m("Requesting app open ad from adapter.");
        try {
            F9 f9 = new F9(this, interfaceC1283v9, 1);
            M3(str, u02, null);
            L3(u02);
            N3(u02);
            O3(u02, str);
            ((S1.a) obj).loadAppOpenAd(new Object(), f9);
        } catch (Exception e4) {
            Y9.q("", e4);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1154s9
    public final void M2(InterfaceC1812a interfaceC1812a) {
        Object obj = this.f5136o;
        if (obj instanceof S1.a) {
            Y9.m("Show app open ad from adapter.");
            Y9.p("Can not show null mediation app open ad.");
            throw new RemoteException();
        }
        Y9.s(S1.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    public final Bundle M3(String str, O1.U0 u02, String str2) {
        Y9.m("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.f5136o instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (u02 != null) {
                    bundle.putInt("tagForChildDirectedTreatment", u02.f1312u);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            throw U.a.e("", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1154s9
    public final void N1(InterfaceC1812a interfaceC1812a, O1.U0 u02, InterfaceC0905mb interfaceC0905mb, String str) {
        String canonicalName;
        Object obj = this.f5136o;
        if ((obj instanceof S1.a) || (canonicalName = obj.getClass().getCanonicalName()) == "com.google.ads.mediation.admob.AdMobAdapter" || (canonicalName != null && canonicalName.equals("com.google.ads.mediation.admob.AdMobAdapter"))) {
            this.f5139r = interfaceC1812a;
            this.f5138q = interfaceC0905mb;
            interfaceC0905mb.d1(new BinderC1813b(obj));
            return;
        }
        Y9.s(S1.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1154s9
    public final C1412y9 P() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1154s9
    public final void V2() {
        Object obj = this.f5136o;
        if (obj instanceof S1.a) {
            Y9.p("Can not show null mediated rewarded ad.");
            throw new RemoteException();
        }
        Y9.s(S1.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1154s9
    public final C1455z9 W() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1154s9
    public final void X0(InterfaceC1812a interfaceC1812a) {
        Object obj = this.f5136o;
        if ((obj instanceof S1.a) || (obj instanceof MediationInterstitialAdapter)) {
            if (obj instanceof MediationInterstitialAdapter) {
                d0();
                return;
            } else {
                Y9.m("Show interstitial ad from adapter.");
                Y9.p("Can not show null mediation interstitial ad.");
                throw new RemoteException();
            }
        }
        Y9.s(MediationInterstitialAdapter.class.getCanonicalName() + " or " + S1.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [S1.g, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.InterfaceC1154s9
    public final void b1(InterfaceC1812a interfaceC1812a, O1.X0 x02, O1.U0 u02, String str, String str2, InterfaceC1283v9 interfaceC1283v9) {
        Object obj = this.f5136o;
        if (!(obj instanceof S1.a)) {
            Y9.s(S1.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        Y9.m("Requesting interscroller ad from adapter.");
        try {
            S1.a aVar = (S1.a) obj;
            C1510e1 c1510e1 = new C1510e1((Object) interfaceC1283v9, (Object) aVar, 17, false);
            M3(str, u02, str2);
            L3(u02);
            N3(u02);
            O3(u02, str);
            int i4 = x02.f1326s;
            int i5 = x02.f1323p;
            H1.f fVar = new H1.f(i4, i5);
            fVar.f870f = true;
            fVar.f871g = i5;
            aVar.loadInterscrollerAd(new Object(), c1510e1);
        } catch (Exception e4) {
            Y9.q("", e4);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1154s9
    public final void d0() {
        Object obj = this.f5136o;
        if (obj instanceof MediationInterstitialAdapter) {
            Y9.m("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) obj).showInterstitial();
                return;
            } catch (Throwable th) {
                throw U.a.e("", th);
            }
        }
        Y9.s(MediationInterstitialAdapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1154s9
    public final InterfaceC0089t0 f() {
        Object obj = this.f5136o;
        if (obj instanceof AbstractAdViewAdapter) {
            try {
                return ((AbstractAdViewAdapter) obj).getVideoController();
            } catch (Throwable th) {
                Y9.q("", th);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1154s9
    public final C1326w9 j() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1154s9
    public final B9 k() {
        Op op;
        com.google.ads.mediation.a aVar;
        if (!(this.f5136o instanceof MediationNativeAdapter) || (op = this.f5137p) == null || (aVar = (com.google.ads.mediation.a) op.f6526q) == null) {
            return null;
        }
        return new J9(aVar);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1154s9
    public final void k0(O1.U0 u02, String str) {
        K3(u02, str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1154s9
    public final C0435ba l() {
        Object obj = this.f5136o;
        if (!(obj instanceof S1.a)) {
            return null;
        }
        ((S1.a) obj).getVersionInfo();
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1154s9
    public final InterfaceC1812a m() {
        Object obj = this.f5136o;
        if (obj instanceof MediationBannerAdapter) {
            try {
                return new BinderC1813b(((MediationBannerAdapter) obj).getBannerView());
            } catch (Throwable th) {
                throw U.a.e("", th);
            }
        }
        if (obj instanceof S1.a) {
            return new BinderC1813b(null);
        }
        Y9.s(MediationBannerAdapter.class.getCanonicalName() + " or " + S1.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, S1.m] */
    @Override // com.google.android.gms.internal.ads.InterfaceC1154s9
    public final void m3(InterfaceC1812a interfaceC1812a, O1.U0 u02, String str, InterfaceC1283v9 interfaceC1283v9) {
        Object obj = this.f5136o;
        if (!(obj instanceof S1.a)) {
            Y9.s(S1.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        Y9.m("Requesting rewarded ad from adapter.");
        try {
            E9 e9 = new E9(this, interfaceC1283v9, 1);
            M3(str, u02, null);
            L3(u02);
            N3(u02);
            O3(u02, str);
            ((S1.a) obj).loadRewardedAd(new Object(), e9);
        } catch (Exception e4) {
            Y9.q("", e4);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1154s9
    public final void n() {
        Object obj = this.f5136o;
        if (obj instanceof S1.e) {
            try {
                ((S1.e) obj).onDestroy();
            } catch (Throwable th) {
                throw U.a.e("", th);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1154s9
    public final void n0(InterfaceC1812a interfaceC1812a) {
        Object obj = this.f5136o;
        if (obj instanceof S1.a) {
            Y9.m("Show rewarded ad from adapter.");
            Y9.p("Can not show null mediation rewarded ad.");
            throw new RemoteException();
        }
        Y9.s(S1.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, S1.k] */
    @Override // com.google.android.gms.internal.ads.InterfaceC1154s9
    public final void o0(InterfaceC1812a interfaceC1812a, O1.U0 u02, String str, String str2, InterfaceC1283v9 interfaceC1283v9, C0766j7 c0766j7, ArrayList arrayList) {
        Object obj = this.f5136o;
        boolean z4 = obj instanceof MediationNativeAdapter;
        if (!z4 && !(obj instanceof S1.a)) {
            Y9.s(MediationNativeAdapter.class.getCanonicalName() + " or " + S1.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        Y9.m("Requesting native ad from adapter.");
        if (!z4) {
            if (obj instanceof S1.a) {
                try {
                    C1510e1 c1510e1 = new C1510e1(18, this, interfaceC1283v9);
                    M3(str, u02, str2);
                    L3(u02);
                    N3(u02);
                    O3(u02, str);
                    ((S1.a) obj).loadNativeAd(new Object(), c1510e1);
                    return;
                } finally {
                    RemoteException e4 = U.a.e("", th);
                }
            }
            return;
        }
        try {
            MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj;
            List list = u02.f1310s;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j4 = u02.f1307p;
            Date date = j4 == -1 ? null : new Date(j4);
            int i4 = u02.f1309r;
            boolean N32 = N3(u02);
            int i5 = u02.f1312u;
            boolean z5 = u02.f1298F;
            O3(u02, str);
            I9 i9 = new I9(date, i4, hashSet, N32, i5, c0766j7, arrayList, z5);
            Bundle bundle = u02.f1293A;
            Bundle bundle2 = bundle != null ? bundle.getBundle(mediationNativeAdapter.getClass().getName()) : null;
            this.f5137p = new Op(interfaceC1283v9);
            mediationNativeAdapter.requestNativeAd((Context) BinderC1813b.C2(interfaceC1812a), this.f5137p, M3(str, u02, str2), i9, bundle2);
        } catch (Throwable th) {
            throw U.a.e(r7, th);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1154s9
    public final void p1() {
        Object obj = this.f5136o;
        if (obj instanceof S1.e) {
            try {
                ((S1.e) obj).onPause();
            } catch (Throwable th) {
                throw U.a.e("", th);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1154s9
    public final C0435ba q() {
        Object obj = this.f5136o;
        if (!(obj instanceof S1.a)) {
            return null;
        }
        ((S1.a) obj).getSDKVersionInfo();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [S1.g, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.InterfaceC1154s9
    public final void s2(InterfaceC1812a interfaceC1812a, O1.X0 x02, O1.U0 u02, String str, String str2, InterfaceC1283v9 interfaceC1283v9) {
        H1.f fVar;
        Object obj = this.f5136o;
        boolean z4 = obj instanceof MediationBannerAdapter;
        if (!z4 && !(obj instanceof S1.a)) {
            Y9.s(MediationBannerAdapter.class.getCanonicalName() + " or " + S1.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        Y9.m("Requesting banner ad from adapter.");
        boolean z5 = x02.f1320B;
        int i4 = x02.f1323p;
        int i5 = x02.f1326s;
        if (z5) {
            H1.f fVar2 = new H1.f(i5, i4);
            fVar2.d = true;
            fVar2.f869e = i4;
            fVar = fVar2;
        } else {
            fVar = new H1.f(i5, i4, x02.f1322o);
        }
        if (!z4) {
            if (obj instanceof S1.a) {
                try {
                    E9 e9 = new E9(this, interfaceC1283v9, 0);
                    M3(str, u02, str2);
                    L3(u02);
                    N3(u02);
                    O3(u02, str);
                    ((S1.a) obj).loadBannerAd(new Object(), e9);
                    return;
                } finally {
                    RemoteException e4 = U.a.e("", th);
                }
            }
            return;
        }
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) obj;
            List list = u02.f1310s;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j4 = u02.f1307p;
            Date date = j4 == -1 ? null : new Date(j4);
            int i6 = u02.f1309r;
            boolean N32 = N3(u02);
            int i7 = u02.f1312u;
            boolean z6 = u02.f1298F;
            O3(u02, str);
            D9 d9 = new D9(date, i6, hashSet, N32, i7, z6);
            Bundle bundle = u02.f1293A;
            mediationBannerAdapter.requestBannerAd((Context) BinderC1813b.C2(interfaceC1812a), new Op(interfaceC1283v9), M3(str, u02, str2), fVar, d9, bundle != null ? bundle.getBundle(mediationBannerAdapter.getClass().getName()) : null);
        } catch (Throwable th) {
            throw U.a.e(r8, th);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1154s9
    public final void u2(InterfaceC1812a interfaceC1812a) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1154s9
    public final void u3(InterfaceC1812a interfaceC1812a, InterfaceC0905mb interfaceC0905mb, List list) {
        Y9.s("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1154s9
    public final void x1(boolean z4) {
        Object obj = this.f5136o;
        if (obj instanceof AbstractAdViewAdapter) {
            try {
                ((AbstractAdViewAdapter) obj).onImmersiveModeUpdated(z4);
                return;
            } catch (Throwable th) {
                Y9.q("", th);
                return;
            }
        }
        Y9.m(AbstractAdViewAdapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
    }
}
