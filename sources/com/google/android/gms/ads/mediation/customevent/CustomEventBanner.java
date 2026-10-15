package com.google.android.gms.ads.mediation.customevent;

import H1.f;
import S1.d;
import T1.a;
import T1.b;
import android.content.Context;
import android.os.Bundle;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
@Deprecated
/* loaded from: classes.dex */
public interface CustomEventBanner extends a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestBannerAd(Context context, b bVar, String str, f fVar, d dVar, Bundle bundle);
}
