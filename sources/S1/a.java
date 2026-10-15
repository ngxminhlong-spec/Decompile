package S1;

import H1.o;
import android.content.Context;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class a {
    public abstract o getSDKVersionInfo();

    public abstract o getVersionInfo();

    public abstract void initialize(Context context, b bVar, List<V2.e> list);

    public void loadAppOpenAd(f fVar, c cVar) {
        cVar.f(new H1.a(7, getClass().getSimpleName().concat(" does not support app open ads."), "com.google.android.gms.ads", (H1.a) null));
    }

    public void loadBannerAd(g gVar, c cVar) {
        cVar.f(new H1.a(7, getClass().getSimpleName().concat(" does not support banner ads."), "com.google.android.gms.ads", (H1.a) null));
    }

    public void loadInterscrollerAd(g gVar, c cVar) {
        cVar.f(new H1.a(7, getClass().getSimpleName().concat(" does not support interscroller ads."), "com.google.android.gms.ads", (H1.a) null));
    }

    public void loadInterstitialAd(i iVar, c cVar) {
        cVar.f(new H1.a(7, getClass().getSimpleName().concat(" does not support interstitial ads."), "com.google.android.gms.ads", (H1.a) null));
    }

    public void loadNativeAd(k kVar, c cVar) {
        cVar.f(new H1.a(7, getClass().getSimpleName().concat(" does not support native ads."), "com.google.android.gms.ads", (H1.a) null));
    }

    public void loadRewardedAd(m mVar, c cVar) {
        cVar.f(new H1.a(7, getClass().getSimpleName().concat(" does not support rewarded ads."), "com.google.android.gms.ads", (H1.a) null));
    }

    public void loadRewardedInterstitialAd(m mVar, c cVar) {
        cVar.f(new H1.a(7, getClass().getSimpleName().concat(" does not support rewarded interstitial ads."), "com.google.android.gms.ads", (H1.a) null));
    }
}
