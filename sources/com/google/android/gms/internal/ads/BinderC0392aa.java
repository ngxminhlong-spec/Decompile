package com.google.android.gms.internal.ads;

import O1.C0081p;
import O1.InterfaceC0089t0;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import java.util.Iterator;
import n2.BinderC1813b;
import n2.InterfaceC1812a;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.aa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0392aa extends AbstractBinderC1149s4 implements V9 {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f8113p = 0;

    /* renamed from: o, reason: collision with root package name */
    public final RtbAdapter f8114o;

    public BinderC0392aa(RtbAdapter rtbAdapter) {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        this.f8114o = rtbAdapter;
    }

    public static final void L3(String str) {
        Y9.s("Server parameters: ".concat(String.valueOf(str)));
        try {
            new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle.putString(next, jSONObject.getString(next));
                }
            }
        } catch (JSONException e4) {
            Y9.q("", e4);
            throw new RemoteException();
        }
    }

    public static final void M3(O1.U0 u02) {
        if (u02.f1311t) {
            return;
        }
        C1335wc c1335wc = C0081p.f1374f.f1375a;
        C1335wc.j();
    }

    public static final void N3(O1.U0 u02, String str) {
        String str2 = u02.f1301I;
        try {
            new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [S1.f, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.V9
    public final void I0(String str, String str2, O1.U0 u02, InterfaceC1812a interfaceC1812a, L9 l9, InterfaceC1283v9 interfaceC1283v9) {
        try {
            M3 m32 = new M3(16, l9);
            RtbAdapter rtbAdapter = this.f8114o;
            L3(str2);
            K3(u02);
            M3(u02);
            N3(u02, str2);
            rtbAdapter.loadRtbAppOpenAd(new Object(), m32);
        } catch (Throwable th) {
            throw U.a.e("Adapter failed to render app open ad.", th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11, types: [com.google.android.gms.internal.ads.r4] */
    /* JADX WARN: Type inference failed for: r5v18, types: [com.google.android.gms.internal.ads.r4] */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.google.android.gms.internal.ads.r4] */
    @Override // com.google.android.gms.internal.ads.AbstractBinderC1149s4
    public final boolean J3(int i4, Parcel parcel, Parcel parcel2) {
        X9 abstractC1106r4;
        P9 abstractC1106r42;
        L9 abstractC1106r43;
        X9 x9 = null;
        L9 l9 = null;
        R9 q9 = null;
        N9 m9 = null;
        T9 s9 = null;
        R9 q92 = null;
        T9 s92 = null;
        P9 p9 = null;
        N9 m92 = null;
        if (i4 == 1) {
            InterfaceC1812a G12 = BinderC1813b.G1(parcel.readStrongBinder());
            String readString = parcel.readString();
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) AbstractC1192t4.a(parcel, creator);
            Bundle bundle2 = (Bundle) AbstractC1192t4.a(parcel, creator);
            O1.X0 x02 = (O1.X0) AbstractC1192t4.a(parcel, O1.X0.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                if (!(queryLocalInterface instanceof X9)) {
                    abstractC1106r4 = new AbstractC1106r4(readStrongBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback", 0);
                    AbstractC1192t4.b(parcel);
                    s1(G12, readString, bundle, bundle2, x02, abstractC1106r4);
                    parcel2.writeNoException();
                    return true;
                }
                x9 = (X9) queryLocalInterface;
            }
            abstractC1106r4 = x9;
            AbstractC1192t4.b(parcel);
            s1(G12, readString, bundle, bundle2, x02, abstractC1106r4);
            parcel2.writeNoException();
            return true;
        }
        if (i4 == 2) {
            d();
            throw null;
        }
        if (i4 == 3) {
            h();
            throw null;
        }
        if (i4 == 5) {
            InterfaceC0089t0 a4 = a();
            parcel2.writeNoException();
            AbstractC1192t4.e(parcel2, a4);
            return true;
        }
        if (i4 == 10) {
            BinderC1813b.G1(parcel.readStrongBinder());
            AbstractC1192t4.b(parcel);
            parcel2.writeNoException();
            return true;
        }
        if (i4 == 11) {
            parcel.createStringArray();
            AbstractC1192t4.b(parcel);
            parcel2.writeNoException();
            return true;
        }
        switch (i4) {
            case 13:
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                O1.U0 u02 = (O1.U0) AbstractC1192t4.a(parcel, O1.U0.CREATOR);
                InterfaceC1812a G13 = BinderC1813b.G1(parcel.readStrongBinder());
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                    m92 = queryLocalInterface2 instanceof N9 ? (N9) queryLocalInterface2 : new M9(readStrongBinder2);
                }
                N9 n9 = m92;
                InterfaceC1283v9 K32 = AbstractBinderC1240u9.K3(parcel.readStrongBinder());
                O1.X0 x03 = (O1.X0) AbstractC1192t4.a(parcel, O1.X0.CREATOR);
                AbstractC1192t4.b(parcel);
                R1(readString2, readString3, u02, G13, n9, K32, x03);
                parcel2.writeNoException();
                return true;
            case 14:
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                O1.U0 u03 = (O1.U0) AbstractC1192t4.a(parcel, O1.U0.CREATOR);
                InterfaceC1812a G14 = BinderC1813b.G1(parcel.readStrongBinder());
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                    if (!(queryLocalInterface3 instanceof P9)) {
                        abstractC1106r42 = new AbstractC1106r4(readStrongBinder3, "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback", 0);
                        InterfaceC1283v9 K33 = AbstractBinderC1240u9.K3(parcel.readStrongBinder());
                        AbstractC1192t4.b(parcel);
                        i2(readString4, readString5, u03, G14, abstractC1106r42, K33);
                        parcel2.writeNoException();
                        return true;
                    }
                    p9 = (P9) queryLocalInterface3;
                }
                abstractC1106r42 = p9;
                InterfaceC1283v9 K332 = AbstractBinderC1240u9.K3(parcel.readStrongBinder());
                AbstractC1192t4.b(parcel);
                i2(readString4, readString5, u03, G14, abstractC1106r42, K332);
                parcel2.writeNoException();
                return true;
            case 15:
                BinderC1813b.G1(parcel.readStrongBinder());
                AbstractC1192t4.b(parcel);
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 16:
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                O1.U0 u04 = (O1.U0) AbstractC1192t4.a(parcel, O1.U0.CREATOR);
                InterfaceC1812a G15 = BinderC1813b.G1(parcel.readStrongBinder());
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                    s92 = queryLocalInterface4 instanceof T9 ? (T9) queryLocalInterface4 : new S9(readStrongBinder4);
                }
                T9 t9 = s92;
                InterfaceC1283v9 K34 = AbstractBinderC1240u9.K3(parcel.readStrongBinder());
                AbstractC1192t4.b(parcel);
                z0(readString6, readString7, u04, G15, t9, K34);
                parcel2.writeNoException();
                return true;
            case 17:
                BinderC1813b.G1(parcel.readStrongBinder());
                AbstractC1192t4.b(parcel);
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 18:
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                O1.U0 u05 = (O1.U0) AbstractC1192t4.a(parcel, O1.U0.CREATOR);
                InterfaceC1812a G16 = BinderC1813b.G1(parcel.readStrongBinder());
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                    q92 = queryLocalInterface5 instanceof R9 ? (R9) queryLocalInterface5 : new Q9(readStrongBinder5);
                }
                R9 r9 = q92;
                InterfaceC1283v9 K35 = AbstractBinderC1240u9.K3(parcel.readStrongBinder());
                AbstractC1192t4.b(parcel);
                T1(readString8, readString9, u05, G16, r9, K35, null);
                parcel2.writeNoException();
                return true;
            case 19:
                parcel.readString();
                AbstractC1192t4.b(parcel);
                parcel2.writeNoException();
                return true;
            case 20:
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                O1.U0 u06 = (O1.U0) AbstractC1192t4.a(parcel, O1.U0.CREATOR);
                InterfaceC1812a G17 = BinderC1813b.G1(parcel.readStrongBinder());
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                    s9 = queryLocalInterface6 instanceof T9 ? (T9) queryLocalInterface6 : new S9(readStrongBinder6);
                }
                T9 t92 = s9;
                InterfaceC1283v9 K36 = AbstractBinderC1240u9.K3(parcel.readStrongBinder());
                AbstractC1192t4.b(parcel);
                t1(readString10, readString11, u06, G17, t92, K36);
                parcel2.writeNoException();
                return true;
            case 21:
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                O1.U0 u07 = (O1.U0) AbstractC1192t4.a(parcel, O1.U0.CREATOR);
                InterfaceC1812a G18 = BinderC1813b.G1(parcel.readStrongBinder());
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                    m9 = queryLocalInterface7 instanceof N9 ? (N9) queryLocalInterface7 : new M9(readStrongBinder7);
                }
                N9 n92 = m9;
                InterfaceC1283v9 K37 = AbstractBinderC1240u9.K3(parcel.readStrongBinder());
                O1.X0 x04 = (O1.X0) AbstractC1192t4.a(parcel, O1.X0.CREATOR);
                AbstractC1192t4.b(parcel);
                U2(readString12, readString13, u07, G18, n92, K37, x04);
                parcel2.writeNoException();
                return true;
            case 22:
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                O1.U0 u08 = (O1.U0) AbstractC1192t4.a(parcel, O1.U0.CREATOR);
                InterfaceC1812a G19 = BinderC1813b.G1(parcel.readStrongBinder());
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                    q9 = queryLocalInterface8 instanceof R9 ? (R9) queryLocalInterface8 : new Q9(readStrongBinder8);
                }
                R9 r92 = q9;
                InterfaceC1283v9 K38 = AbstractBinderC1240u9.K3(parcel.readStrongBinder());
                C0766j7 c0766j7 = (C0766j7) AbstractC1192t4.a(parcel, C0766j7.CREATOR);
                AbstractC1192t4.b(parcel);
                T1(readString14, readString15, u08, G19, r92, K38, c0766j7);
                parcel2.writeNoException();
                return true;
            case 23:
                String readString16 = parcel.readString();
                String readString17 = parcel.readString();
                O1.U0 u09 = (O1.U0) AbstractC1192t4.a(parcel, O1.U0.CREATOR);
                InterfaceC1812a G110 = BinderC1813b.G1(parcel.readStrongBinder());
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                    if (!(queryLocalInterface9 instanceof L9)) {
                        abstractC1106r43 = new AbstractC1106r4(readStrongBinder9, "com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback", 0);
                        InterfaceC1283v9 K39 = AbstractBinderC1240u9.K3(parcel.readStrongBinder());
                        AbstractC1192t4.b(parcel);
                        I0(readString16, readString17, u09, G110, abstractC1106r43, K39);
                        parcel2.writeNoException();
                        return true;
                    }
                    l9 = (L9) queryLocalInterface9;
                }
                abstractC1106r43 = l9;
                InterfaceC1283v9 K392 = AbstractBinderC1240u9.K3(parcel.readStrongBinder());
                AbstractC1192t4.b(parcel);
                I0(readString16, readString17, u09, G110, abstractC1106r43, K392);
                parcel2.writeNoException();
                return true;
            case 24:
                BinderC1813b.G1(parcel.readStrongBinder());
                AbstractC1192t4.b(parcel);
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            default:
                return false;
        }
    }

    public final void K3(O1.U0 u02) {
        Bundle bundle = u02.f1293A;
        if (bundle == null || bundle.getBundle(this.f8114o.getClass().getName()) == null) {
            new Bundle();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [S1.g, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.V9
    public final void R1(String str, String str2, O1.U0 u02, InterfaceC1812a interfaceC1812a, N9 n9, InterfaceC1283v9 interfaceC1283v9, O1.X0 x02) {
        try {
            M3 m32 = new M3(14, n9);
            RtbAdapter rtbAdapter = this.f8114o;
            L3(str2);
            K3(u02);
            M3(u02);
            N3(u02, str2);
            new H1.f(x02.f1326s, x02.f1323p, x02.f1322o);
            rtbAdapter.loadRtbBannerAd(new Object(), m32);
        } catch (Throwable th) {
            throw U.a.e("Adapter failed to render banner ad.", th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, S1.k] */
    @Override // com.google.android.gms.internal.ads.V9
    public final void T1(String str, String str2, O1.U0 u02, InterfaceC1812a interfaceC1812a, R9 r9, InterfaceC1283v9 interfaceC1283v9, C0766j7 c0766j7) {
        try {
            C0874ln c0874ln = new C0874ln(14, r9);
            RtbAdapter rtbAdapter = this.f8114o;
            L3(str2);
            K3(u02);
            M3(u02);
            N3(u02, str2);
            rtbAdapter.loadRtbNativeAd(new Object(), c0874ln);
        } catch (Throwable th) {
            throw U.a.e("Adapter failed to render native ad.", th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [S1.g, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.V9
    public final void U2(String str, String str2, O1.U0 u02, InterfaceC1812a interfaceC1812a, N9 n9, InterfaceC1283v9 interfaceC1283v9, O1.X0 x02) {
        try {
            C0874ln c0874ln = new C0874ln(13, n9);
            RtbAdapter rtbAdapter = this.f8114o;
            L3(str2);
            K3(u02);
            M3(u02);
            N3(u02, str2);
            new H1.f(x02.f1326s, x02.f1323p, x02.f1322o);
            rtbAdapter.loadRtbInterscrollerAd(new Object(), c0874ln);
        } catch (Throwable th) {
            throw U.a.e("Adapter failed to render interscroller ad.", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.V9
    public final boolean X(InterfaceC1812a interfaceC1812a) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.V9
    public final InterfaceC0089t0 a() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.V9
    public final C0435ba d() {
        this.f8114o.getVersionInfo();
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.V9
    public final boolean f0(InterfaceC1812a interfaceC1812a) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.V9
    public final C0435ba h() {
        this.f8114o.getSDKVersionInfo();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, S1.i] */
    @Override // com.google.android.gms.internal.ads.V9
    public final void i2(String str, String str2, O1.U0 u02, InterfaceC1812a interfaceC1812a, P9 p9, InterfaceC1283v9 interfaceC1283v9) {
        try {
            M3 m32 = new M3(15, p9);
            RtbAdapter rtbAdapter = this.f8114o;
            L3(str2);
            K3(u02);
            M3(u02);
            N3(u02, str2);
            rtbAdapter.loadRtbInterstitialAd(new Object(), m32);
        } catch (Throwable th) {
            throw U.a.e("Adapter failed to render interstitial ad.", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.V9
    public final void j3(String str) {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        if (((java.lang.Boolean) O1.r.d.c.a(com.google.android.gms.internal.ads.AbstractC1066q6.X9)).booleanValue() != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
    
        if (r3.equals("app_open") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        if (r3.equals("interstitial") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        if (r3.equals("rewarded") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        if (r3.equals("native") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        if (r3.equals("banner") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (r3.equals("rewarded_interstitial") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0068, code lost:
    
        new java.util.ArrayList().add(new V2.e(13));
        r2 = (android.content.Context) n2.BinderC1813b.C2(r2);
        new H1.f(r6.f1326s, r6.f1323p, r6.f1322o);
        r5.collectSignals(new java.lang.Object(), r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x008c, code lost:
    
        return;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000f. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v15, types: [U1.a, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.V9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s1(n2.InterfaceC1812a r2, java.lang.String r3, android.os.Bundle r4, android.os.Bundle r5, O1.X0 r6, com.google.android.gms.internal.ads.X9 r7) {
        /*
            r1 = this;
            com.google.android.gms.internal.ads.p r4 = new com.google.android.gms.internal.ads.p     // Catch: java.lang.Throwable -> L38
            r5 = 19
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.ads.mediation.rtb.RtbAdapter r5 = r1.f8114o     // Catch: java.lang.Throwable -> L38
            V2.e r7 = new V2.e     // Catch: java.lang.Throwable -> L38
            int r0 = r3.hashCode()     // Catch: java.lang.Throwable -> L38
            switch(r0) {
                case -1396342996: goto L5e;
                case -1052618729: goto L55;
                case -239580146: goto L4c;
                case 604727084: goto L43;
                case 1167692200: goto L3a;
                case 1778294298: goto L1d;
                case 1911491517: goto L14;
                default: goto L12;
            }
        L12:
            goto L8d
        L14:
            java.lang.String r0 = "rewarded_interstitial"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L8d
            goto L66
        L1d:
            java.lang.String r0 = "app_open_ad"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L8d
            com.google.android.gms.internal.ads.n6 r3 = com.google.android.gms.internal.ads.AbstractC1066q6.X9     // Catch: java.lang.Throwable -> L38
            O1.r r0 = O1.r.d     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.p6 r0 = r0.c     // Catch: java.lang.Throwable -> L38
            java.lang.Object r3 = r0.a(r3)     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L38
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r3 == 0) goto L8d
            goto L66
        L38:
            r2 = move-exception
            goto L95
        L3a:
            java.lang.String r0 = "app_open"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L8d
            goto L66
        L43:
            java.lang.String r0 = "interstitial"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L8d
            goto L66
        L4c:
            java.lang.String r0 = "rewarded"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L8d
            goto L66
        L55:
            java.lang.String r0 = "native"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L8d
            goto L66
        L5e:
            java.lang.String r0 = "banner"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L8d
        L66:
            r3 = 13
            r7.<init>(r3)     // Catch: java.lang.Throwable -> L38
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L38
            r3.<init>()     // Catch: java.lang.Throwable -> L38
            r3.add(r7)     // Catch: java.lang.Throwable -> L38
            U1.a r3 = new U1.a     // Catch: java.lang.Throwable -> L38
            java.lang.Object r2 = n2.BinderC1813b.C2(r2)     // Catch: java.lang.Throwable -> L38
            android.content.Context r2 = (android.content.Context) r2     // Catch: java.lang.Throwable -> L38
            int r2 = r6.f1326s     // Catch: java.lang.Throwable -> L38
            int r7 = r6.f1323p     // Catch: java.lang.Throwable -> L38
            java.lang.String r6 = r6.f1322o     // Catch: java.lang.Throwable -> L38
            H1.f r0 = new H1.f     // Catch: java.lang.Throwable -> L38
            r0.<init>(r2, r7, r6)     // Catch: java.lang.Throwable -> L38
            r3.<init>()     // Catch: java.lang.Throwable -> L38
            r5.collectSignals(r3, r4)     // Catch: java.lang.Throwable -> L38
            return
        L8d:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L38
            java.lang.String r3 = "Internal Error"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L38
            throw r2     // Catch: java.lang.Throwable -> L38
        L95:
            java.lang.String r3 = "Error generating signals for RTB"
            android.os.RemoteException r2 = U.a.e(r3, r2)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.BinderC0392aa.s1(n2.a, java.lang.String, android.os.Bundle, android.os.Bundle, O1.X0, com.google.android.gms.internal.ads.X9):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, S1.m] */
    @Override // com.google.android.gms.internal.ads.V9
    public final void t1(String str, String str2, O1.U0 u02, InterfaceC1812a interfaceC1812a, T9 t9, InterfaceC1283v9 interfaceC1283v9) {
        try {
            C0874ln c0874ln = new C0874ln(15, t9);
            RtbAdapter rtbAdapter = this.f8114o;
            L3(str2);
            K3(u02);
            M3(u02);
            N3(u02, str2);
            rtbAdapter.loadRtbRewardedInterstitialAd(new Object(), c0874ln);
        } catch (Throwable th) {
            throw U.a.e("Adapter failed to render rewarded interstitial ad.", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.V9
    public final boolean w2(BinderC1813b binderC1813b) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.V9
    public final void x0(String str, String str2, O1.U0 u02, BinderC1813b binderC1813b, Lm lm, InterfaceC1283v9 interfaceC1283v9) {
        T1(str, str2, u02, binderC1813b, lm, interfaceC1283v9, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, S1.m] */
    @Override // com.google.android.gms.internal.ads.V9
    public final void z0(String str, String str2, O1.U0 u02, InterfaceC1812a interfaceC1812a, T9 t9, InterfaceC1283v9 interfaceC1283v9) {
        try {
            C0874ln c0874ln = new C0874ln(15, t9);
            RtbAdapter rtbAdapter = this.f8114o;
            L3(str2);
            K3(u02);
            M3(u02);
            N3(u02, str2);
            rtbAdapter.loadRtbRewardedAd(new Object(), c0874ln);
        } catch (Throwable th) {
            throw U.a.e("Adapter failed to render rewarded ad.", th);
        }
    }
}
