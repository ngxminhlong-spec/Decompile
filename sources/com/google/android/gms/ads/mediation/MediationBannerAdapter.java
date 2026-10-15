package com.google.android.gms.ads.mediation;

import H1.f;
import S1.d;
import S1.e;
import S1.h;
import android.content.Context;
import android.os.Bundle;
import android.view.View;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
@Deprecated
/* loaded from: classes.dex */
public interface MediationBannerAdapter extends e {
    View getBannerView();

    @Override // S1.e, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    /* synthetic */ void onDestroy();

    @Override // S1.e, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    /* synthetic */ void onPause();

    @Override // S1.e, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    /* synthetic */ void onResume();

    void requestBannerAd(Context context, h hVar, Bundle bundle, f fVar, d dVar, Bundle bundle2);
}
