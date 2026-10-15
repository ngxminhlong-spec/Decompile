package com.google.android.gms.ads.mediation.rtb;

import S1.a;
import S1.c;
import S1.f;
import S1.g;
import S1.i;
import S1.k;
import S1.m;
import U1.b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class RtbAdapter extends a {
    public abstract void collectSignals(U1.a aVar, b bVar);

    public void loadRtbAppOpenAd(f fVar, c cVar) {
        loadAppOpenAd(fVar, cVar);
    }

    public void loadRtbBannerAd(g gVar, c cVar) {
        loadBannerAd(gVar, cVar);
    }

    public void loadRtbInterscrollerAd(g gVar, c cVar) {
        cVar.f(new H1.a(7, getClass().getSimpleName().concat(" does not support interscroller ads."), "com.google.android.gms.ads", (H1.a) null));
    }

    public void loadRtbInterstitialAd(i iVar, c cVar) {
        loadInterstitialAd(iVar, cVar);
    }

    public void loadRtbNativeAd(k kVar, c cVar) {
        loadNativeAd(kVar, cVar);
    }

    public void loadRtbRewardedAd(m mVar, c cVar) {
        loadRewardedAd(mVar, cVar);
    }

    public void loadRtbRewardedInterstitialAd(m mVar, c cVar) {
        loadRewardedInterstitialAd(mVar, cVar);
    }
}
