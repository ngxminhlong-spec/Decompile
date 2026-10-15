package com.google.android.gms.ads.mediation.customevent;

import S1.n;
import T1.a;
import T1.d;
import android.content.Context;
import android.os.Bundle;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
@Deprecated
/* loaded from: classes.dex */
public interface CustomEventNative extends a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestNativeAd(Context context, d dVar, String str, n nVar, Bundle bundle);
}
