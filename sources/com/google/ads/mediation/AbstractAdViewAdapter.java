package com.google.ads.mediation;

import H1.g;
import H1.p;
import H1.q;
import O1.A0;
import O1.C0081p;
import O1.C0095w0;
import O1.E;
import O1.F;
import O1.I0;
import O1.InterfaceC0089t0;
import O1.J;
import O1.R0;
import O1.S0;
import O1.r;
import S1.h;
import S1.j;
import S1.l;
import S1.n;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.internal.ads.AbstractC1066q6;
import com.google.android.gms.internal.ads.AbstractC1249uc;
import com.google.android.gms.internal.ads.C0258Da;
import com.google.android.gms.internal.ads.C0766j7;
import com.google.android.gms.internal.ads.C1335wc;
import com.google.android.gms.internal.ads.H8;
import com.google.android.gms.internal.ads.I9;
import com.google.android.gms.internal.ads.L6;
import com.google.android.gms.internal.ads.Op;
import com.google.android.gms.internal.ads.U7;
import com.google.android.gms.internal.ads.V7;
import com.google.android.gms.internal.ads.W7;
import com.google.android.gms.internal.ads.Y9;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import x0.f;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class AbstractAdViewAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter {
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private H1.d adLoader;
    protected g mAdView;
    protected R1.a mInterstitialAd;

    public H1.e buildAdRequest(Context context, S1.d dVar, Bundle bundle, Bundle bundle2) {
        f fVar = new f(13);
        C0095w0 c0095w0 = (C0095w0) fVar.f15212p;
        Date b4 = dVar.b();
        if (b4 != null) {
            c0095w0.f1387g = b4;
        }
        int f4 = dVar.f();
        if (f4 != 0) {
            c0095w0.f1389i = f4;
        }
        Set d = dVar.d();
        if (d != null) {
            Iterator it = d.iterator();
            while (it.hasNext()) {
                c0095w0.f1383a.add((String) it.next());
            }
        }
        if (dVar.c()) {
            C1335wc c1335wc = C0081p.f1374f.f1375a;
            c0095w0.d.add(C1335wc.m(context));
        }
        if (dVar.e() != -1) {
            c0095w0.f1390j = dVar.e() != 1 ? 0 : 1;
        }
        c0095w0.f1391k = dVar.a();
        fVar.b(buildExtrasBundle(bundle, bundle2));
        return new H1.e(fVar);
    }

    public abstract Bundle buildExtrasBundle(Bundle bundle, Bundle bundle2);

    public String getAdUnitId(Bundle bundle) {
        return bundle.getString(AD_UNIT_ID_PARAMETER);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public View getBannerView() {
        return this.mAdView;
    }

    public R1.a getInterstitialAd() {
        return this.mInterstitialAd;
    }

    public InterfaceC0089t0 getVideoController() {
        InterfaceC0089t0 interfaceC0089t0;
        g gVar = this.mAdView;
        if (gVar == null) {
            return null;
        }
        C0258Da c0258Da = (C0258Da) gVar.f874o.c;
        synchronized (c0258Da.f4618p) {
            interfaceC0089t0 = (InterfaceC0089t0) c0258Da.f4619q;
        }
        return interfaceC0089t0;
    }

    public H1.c newAdLoader(Context context, String str) {
        return new H1.c(context, str);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:3|(2:5|(2:7|8))|9|10|11|(1:13)|8) */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        com.google.android.gms.internal.ads.Y9.u("#007 Could not call remote method.", r0);
     */
    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, S1.e, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDestroy() {
        /*
            r5 = this;
            H1.g r0 = r5.mAdView
            r1 = 0
            if (r0 == 0) goto L4f
            android.content.Context r2 = r0.getContext()
            com.google.android.gms.internal.ads.AbstractC1066q6.a(r2)
            com.google.android.gms.internal.ads.J2 r2 = com.google.android.gms.internal.ads.L6.f6125e
            java.lang.Object r2 = r2.r()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L38
            com.google.android.gms.internal.ads.n6 r2 = com.google.android.gms.internal.ads.AbstractC1066q6.u9
            O1.r r3 = O1.r.d
            com.google.android.gms.internal.ads.p6 r3 = r3.c
            java.lang.Object r2 = r3.a(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L38
            java.util.concurrent.ExecutorService r2 = com.google.android.gms.internal.ads.AbstractC1249uc.f10789b
            H1.q r3 = new H1.q
            r4 = 1
            r3.<init>(r0, r4)
            r2.execute(r3)
            goto L4d
        L38:
            O1.A0 r0 = r0.f874o
            r0.getClass()
            java.lang.Object r0 = r0.f1259i     // Catch: android.os.RemoteException -> L47
            O1.J r0 = (O1.J) r0     // Catch: android.os.RemoteException -> L47
            if (r0 == 0) goto L4d
            r0.w()     // Catch: android.os.RemoteException -> L47
            goto L4d
        L47:
            r0 = move-exception
            java.lang.String r2 = "#007 Could not call remote method."
            com.google.android.gms.internal.ads.Y9.u(r2, r0)
        L4d:
            r5.mAdView = r1
        L4f:
            R1.a r0 = r5.mInterstitialAd
            if (r0 == 0) goto L55
            r5.mInterstitialAd = r1
        L55:
            H1.d r0 = r5.adLoader
            if (r0 == 0) goto L5b
            r5.adLoader = r1
        L5b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.mediation.AbstractAdViewAdapter.onDestroy():void");
    }

    public void onImmersiveModeUpdated(boolean z4) {
        R1.a aVar = this.mInterstitialAd;
        if (aVar != null) {
            try {
                J j4 = ((H8) aVar).c;
                if (j4 != null) {
                    j4.g2(z4);
                }
            } catch (RemoteException e4) {
                Y9.u("#007 Could not call remote method.", e4);
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, S1.e, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onPause() {
        g gVar = this.mAdView;
        if (gVar != null) {
            AbstractC1066q6.a(gVar.getContext());
            if (((Boolean) L6.f6127g.r()).booleanValue()) {
                if (((Boolean) r.d.c.a(AbstractC1066q6.v9)).booleanValue()) {
                    AbstractC1249uc.f10789b.execute(new q(gVar, 2));
                    return;
                }
            }
            A0 a02 = gVar.f874o;
            a02.getClass();
            try {
                J j4 = (J) a02.f1259i;
                if (j4 != null) {
                    j4.n1();
                }
            } catch (RemoteException e4) {
                Y9.u("#007 Could not call remote method.", e4);
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, S1.e, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onResume() {
        g gVar = this.mAdView;
        if (gVar != null) {
            AbstractC1066q6.a(gVar.getContext());
            if (((Boolean) L6.f6128h.r()).booleanValue()) {
                if (((Boolean) r.d.c.a(AbstractC1066q6.t9)).booleanValue()) {
                    AbstractC1249uc.f10789b.execute(new q(gVar, 0));
                    return;
                }
            }
            A0 a02 = gVar.f874o;
            a02.getClass();
            try {
                J j4 = (J) a02.f1259i;
                if (j4 != null) {
                    j4.z();
                }
            } catch (RemoteException e4) {
                Y9.u("#007 Could not call remote method.", e4);
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(Context context, h hVar, Bundle bundle, H1.f fVar, S1.d dVar, Bundle bundle2) {
        g gVar = new g(context);
        this.mAdView = gVar;
        gVar.setAdSize(new H1.f(fVar.f867a, fVar.f868b));
        this.mAdView.setAdUnitId(getAdUnitId(bundle));
        this.mAdView.setAdListener(new b(this, hVar));
        this.mAdView.a(buildAdRequest(context, dVar, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(Context context, j jVar, Bundle bundle, S1.d dVar, Bundle bundle2) {
        R1.a.a(context, getAdUnitId(bundle), buildAdRequest(context, dVar, bundle2, bundle), new c(this, jVar));
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [O1.J0, O1.E] */
    /* JADX WARN: Type inference failed for: r9v3, types: [V1.d, java.lang.Object] */
    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void requestNativeAd(Context context, l lVar, Bundle bundle, n nVar, Bundle bundle2) {
        K1.c cVar;
        V1.d dVar;
        int i4;
        H1.d dVar2;
        int i5;
        R0 r02;
        e eVar = new e(this, lVar);
        H1.c newAdLoader = newAdLoader(context, bundle.getString(AD_UNIT_ID_PARAMETER));
        newAdLoader.getClass();
        F f4 = newAdLoader.f860b;
        try {
            f4.m0(new S0(eVar));
        } catch (RemoteException e4) {
            Y9.t("Failed to set AdListener.", e4);
        }
        I9 i9 = (I9) nVar;
        i9.getClass();
        K1.c cVar2 = new K1.c();
        C0766j7 c0766j7 = i9.f5552f;
        if (c0766j7 == null) {
            cVar = new K1.c(cVar2);
        } else {
            int i6 = c0766j7.f9125o;
            if (i6 != 2) {
                if (i6 != 3) {
                    if (i6 == 4) {
                        cVar2.f1057g = c0766j7.f9131u;
                        cVar2.c = c0766j7.f9132v;
                    }
                    cVar2.f1053a = c0766j7.f9126p;
                    cVar2.f1054b = c0766j7.f9127q;
                    cVar2.d = c0766j7.f9128r;
                    cVar = new K1.c(cVar2);
                }
                R0 r03 = c0766j7.f9130t;
                if (r03 != null) {
                    cVar2.f1056f = new p(r03);
                }
            }
            cVar2.f1055e = c0766j7.f9129s;
            cVar2.f1053a = c0766j7.f9126p;
            cVar2.f1054b = c0766j7.f9127q;
            cVar2.d = c0766j7.f9128r;
            cVar = new K1.c(cVar2);
        }
        try {
            f4.c2(new C0766j7(cVar));
        } catch (RemoteException e5) {
            Y9.t("Failed to specify native ad options", e5);
        }
        HashMap hashMap = i9.f5555i;
        ArrayList arrayList = i9.f5553g;
        C0766j7 c0766j72 = i9.f5552f;
        ?? obj = new Object();
        obj.f1841a = false;
        obj.f1842b = 0;
        obj.c = false;
        obj.d = 1;
        obj.f1844f = false;
        obj.f1845g = false;
        obj.f1846h = 0;
        obj.f1847i = 1;
        if (c0766j72 == null) {
            dVar = new V1.d(obj);
        } else {
            int i7 = c0766j72.f9125o;
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 == 4) {
                        obj.f1844f = c0766j72.f9131u;
                        obj.f1842b = c0766j72.f9132v;
                        int i8 = c0766j72.f9133w;
                        obj.f1845g = c0766j72.f9134x;
                        obj.f1846h = i8;
                        int i10 = c0766j72.y;
                        if (i10 != 0) {
                            if (i10 == 2) {
                                i4 = 3;
                            } else if (i10 == 1) {
                                i4 = 2;
                            }
                            obj.f1847i = i4;
                        }
                        i4 = 1;
                        obj.f1847i = i4;
                    }
                    obj.f1841a = c0766j72.f9126p;
                    obj.c = c0766j72.f9128r;
                    dVar = new V1.d(obj);
                }
                R0 r04 = c0766j72.f9130t;
                if (r04 != null) {
                    obj.f1843e = new p(r04);
                }
            }
            obj.d = c0766j72.f9129s;
            obj.f1841a = c0766j72.f9126p;
            obj.c = c0766j72.f9128r;
            dVar = new V1.d(obj);
        }
        try {
            boolean z4 = dVar.f1841a;
            boolean z5 = dVar.c;
            int i11 = dVar.d;
            p pVar = dVar.f1843e;
            if (pVar != null) {
                i5 = i11;
                r02 = new R0(pVar);
            } else {
                i5 = i11;
                r02 = null;
            }
            f4.c2(new C0766j7(4, z4, -1, z5, i5, r02, dVar.f1844f, dVar.f1842b, dVar.f1846h, dVar.f1845g, dVar.f1847i - 1));
        } catch (RemoteException e6) {
            Y9.t("Failed to specify native ad options", e6);
        }
        if (arrayList.contains("6")) {
            try {
                f4.S0(new W7(0, eVar));
            } catch (RemoteException e7) {
                Y9.t("Failed to add google native ad listener", e7);
            }
        }
        if (arrayList.contains("3")) {
            for (String str : hashMap.keySet()) {
                e eVar2 = true != ((Boolean) hashMap.get(str)).booleanValue() ? null : eVar;
                Op op = new Op(5, eVar, eVar2);
                try {
                    f4.a2(str, new V7(op), eVar2 == null ? null : new U7(op));
                } catch (RemoteException e8) {
                    Y9.t("Failed to add custom template ad listener", e8);
                }
            }
        }
        Context context2 = newAdLoader.f859a;
        try {
            dVar2 = new H1.d(context2, f4.a());
        } catch (RemoteException e9) {
            Y9.q("Failed to build AdLoader.", e9);
            dVar2 = new H1.d(context2, new I0(new E()));
        }
        this.adLoader = dVar2;
        dVar2.a(buildAdRequest(context, nVar, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        R1.a aVar = this.mInterstitialAd;
        if (aVar != null) {
            aVar.b(null);
        }
    }
}
