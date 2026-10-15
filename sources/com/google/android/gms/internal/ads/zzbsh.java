package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import b0.RunnableC0203p;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class zzbsh implements MediationInterstitialAdapter {

    /* renamed from: a, reason: collision with root package name */
    public Activity f11700a;

    /* renamed from: b, reason: collision with root package name */
    public S1.j f11701b;
    public Uri c;

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onDestroy() {
        Y9.m("Destroying AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onPause() {
        Y9.m("Pausing AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onResume() {
        Y9.m("Resuming AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(Context context, S1.j jVar, Bundle bundle, S1.d dVar, Bundle bundle2) {
        this.f11701b = jVar;
        if (jVar == null) {
            Y9.s("Listener not set for mediation. Returning.");
            return;
        }
        if (!(context instanceof Activity)) {
            Y9.s("AdMobCustomTabs can only work with Activity context. Bailing out.");
            ((Op) this.f11701b).b();
            return;
        }
        if (!C1452z6.a(context)) {
            Y9.s("Default browser does not support custom tabs. Bailing out.");
            ((Op) this.f11701b).b();
            return;
        }
        String string = bundle.getString("tab_url");
        if (TextUtils.isEmpty(string)) {
            Y9.s("The tab_url retrieved from mediation metadata is empty. Bailing out.");
            ((Op) this.f11701b).b();
            return;
        }
        this.f11700a = (Activity) context;
        this.c = Uri.parse(string);
        Op op = (Op) this.f11701b;
        op.getClass();
        h2.y.d("#008 Must be called on the main UI thread.");
        Y9.m("Adapter called onAdLoaded.");
        try {
            ((InterfaceC1283v9) op.f6525p).n();
        } catch (RemoteException e4) {
            Y9.u("#007 Could not call remote method.", e4);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        Intent intent = new Intent("android.intent.action.VIEW");
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
        intent.putExtras(new Bundle());
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        intent.setData(this.c);
        Q1.N.f1668k.post(new RunnableC0203p(this, new AdOverlayInfoParcel(new P1.b(intent, null), null, new C0477ca(this), null, new C0248Bc(0, 0, false, false), null, null), 9, false));
        N1.n nVar = N1.n.f1204A;
        C0992oc c0992oc = nVar.f1209g.f9977l;
        c0992oc.getClass();
        nVar.f1212j.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (c0992oc.f9832a) {
            try {
                if (c0992oc.c == 3) {
                    if (c0992oc.f9833b + ((Long) O1.r.d.c.a(AbstractC1066q6.f5)).longValue() <= currentTimeMillis) {
                        c0992oc.c = 1;
                    }
                }
            } finally {
            }
        }
        nVar.f1212j.getClass();
        long currentTimeMillis2 = System.currentTimeMillis();
        synchronized (c0992oc.f9832a) {
            try {
                if (c0992oc.c != 2) {
                    return;
                }
                c0992oc.c = 3;
                if (c0992oc.c == 3) {
                    c0992oc.f9833b = currentTimeMillis2;
                }
            } finally {
            }
        }
    }
}
