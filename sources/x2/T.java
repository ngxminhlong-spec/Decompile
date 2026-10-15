package x2;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import com.google.android.gms.internal.ads.C0326Qb;
import com.google.android.gms.internal.ads.Q8;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class T extends AbstractC2076h0 {

    /* renamed from: w, reason: collision with root package name */
    public static final Pair f15439w = new Pair("", 0L);
    public SharedPreferences c;
    public Q8 d;

    /* renamed from: e, reason: collision with root package name */
    public final Q f15440e;

    /* renamed from: f, reason: collision with root package name */
    public final B0.c f15441f;

    /* renamed from: g, reason: collision with root package name */
    public String f15442g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f15443h;

    /* renamed from: i, reason: collision with root package name */
    public long f15444i;

    /* renamed from: j, reason: collision with root package name */
    public final Q f15445j;

    /* renamed from: k, reason: collision with root package name */
    public final P f15446k;

    /* renamed from: l, reason: collision with root package name */
    public final B0.c f15447l;

    /* renamed from: m, reason: collision with root package name */
    public final P f15448m;

    /* renamed from: n, reason: collision with root package name */
    public final Q f15449n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f15450o;

    /* renamed from: p, reason: collision with root package name */
    public final P f15451p;

    /* renamed from: q, reason: collision with root package name */
    public final P f15452q;

    /* renamed from: r, reason: collision with root package name */
    public final Q f15453r;

    /* renamed from: s, reason: collision with root package name */
    public final B0.c f15454s;

    /* renamed from: t, reason: collision with root package name */
    public final B0.c f15455t;

    /* renamed from: u, reason: collision with root package name */
    public final Q f15456u;

    /* renamed from: v, reason: collision with root package name */
    public final C0326Qb f15457v;

    /* JADX WARN: Type inference failed for: r5v15, types: [com.google.android.gms.internal.ads.Qb, java.lang.Object] */
    public T(C2066c0 c2066c0) {
        super(c2066c0);
        this.f15445j = new Q(this, "session_timeout", 1800000L);
        this.f15446k = new P(this, "start_new_session", true);
        this.f15449n = new Q(this, "last_pause_time", 0L);
        this.f15447l = new B0.c(this, "non_personalized_ads");
        this.f15448m = new P(this, "allow_remote_dynamite", false);
        this.f15440e = new Q(this, "first_open_time", 0L);
        h2.y.e("app_install_time");
        this.f15441f = new B0.c(this, "app_instance_id");
        this.f15451p = new P(this, "app_backgrounded", false);
        this.f15452q = new P(this, "deep_link_retrieval_complete", false);
        this.f15453r = new Q(this, "deep_link_retrieval_attempts", 0L);
        this.f15454s = new B0.c(this, "firebase_feature_rollouts");
        this.f15455t = new B0.c(this, "deferred_attribution_cache");
        this.f15456u = new Q(this, "deferred_attribution_cache_timestamp", 0L);
        ?? obj = new Object();
        obj.f6662r = this;
        h2.y.e("default_event_parameters");
        obj.f6659o = "default_event_parameters";
        obj.f6660p = new Bundle();
        this.f15457v = obj;
    }

    @Override // x2.AbstractC2076h0
    public final boolean h() {
        return true;
    }

    public final SharedPreferences k() {
        g();
        i();
        h2.y.i(this.c);
        return this.c;
    }

    public final C2077i l() {
        g();
        return C2077i.b(k().getString("consent_settings", "G1"));
    }

    public final void m(boolean z4) {
        g();
        K k3 = ((C2066c0) this.f1719a).f15568i;
        C2066c0.i(k3);
        k3.f15402n.b(Boolean.valueOf(z4), "App measurement setting deferred collection");
        SharedPreferences.Editor edit = k().edit();
        edit.putBoolean("deferred_analytics_collection", z4);
        edit.apply();
    }

    public final boolean n(long j4) {
        return j4 - this.f15445j.a() > this.f15449n.a();
    }

    public final boolean o(int i4) {
        int i5 = k().getInt("consent_source", 100);
        C2077i c2077i = C2077i.f15674b;
        return i4 <= i5;
    }
}
