package com.google.android.gms.ads.mediation;

import S1.d;
import S1.e;
import S1.j;
import android.content.Context;
import android.os.Bundle;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
@Deprecated
/* loaded from: classes.dex */
public interface MediationInterstitialAdapter extends e {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestInterstitialAd(Context context, j jVar, Bundle bundle, d dVar, Bundle bundle2);

    void showInterstitial();
}
