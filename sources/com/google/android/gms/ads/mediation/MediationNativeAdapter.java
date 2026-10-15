package com.google.android.gms.ads.mediation;

import S1.e;
import S1.l;
import S1.n;
import android.content.Context;
import android.os.Bundle;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
@Deprecated
/* loaded from: classes.dex */
public interface MediationNativeAdapter extends e {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestNativeAd(Context context, l lVar, Bundle bundle, n nVar, Bundle bundle2);
}
