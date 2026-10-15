package x2;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.RunnableC0758j;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: x2.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2101u0 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C2103v0 f15798o;

    public /* synthetic */ C2101u0(C2103v0 c2103v0) {
        this.f15798o = c2103v0;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Uri data;
        C2066c0 c2066c0 = (C2066c0) this.f15798o.f1719a;
        try {
            try {
                K k3 = c2066c0.f15568i;
                C2066c0.i(k3);
                k3.f15402n.a("onActivityCreated");
                Intent intent = activity.getIntent();
                if (intent != null && (data = intent.getData()) != null && data.isHierarchical()) {
                    C2066c0.g(c2066c0.f15571l);
                    String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                    String str = ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) ? "gs" : "auto";
                    String queryParameter = data.getQueryParameter("referrer");
                    boolean z4 = bundle == null;
                    C2064b0 c2064b0 = c2066c0.f15569j;
                    C2066c0.i(c2064b0);
                    c2064b0.o(new androidx.fragment.app.y(this, z4, data, str, queryParameter));
                }
            } catch (RuntimeException e4) {
                K k4 = c2066c0.f15568i;
                C2066c0.i(k4);
                k4.f15394f.b(e4, "Throwable caught in onActivityCreated");
            }
        } finally {
            C0 c02 = c2066c0.f15574o;
            C2066c0.h(c02);
            c02.n(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        C0 c02 = ((C2066c0) this.f15798o.f1719a).f15574o;
        C2066c0.h(c02);
        synchronized (c02.f15345l) {
            try {
                if (activity == c02.f15340g) {
                    c02.f15340g = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (((C2066c0) c02.f1719a).f15566g.r()) {
            c02.f15339f.remove(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        C0 c02 = ((C2066c0) this.f15798o.f1719a).f15574o;
        C2066c0.h(c02);
        synchronized (c02.f15345l) {
            c02.f15344k = false;
            c02.f15341h = true;
        }
        ((C2066c0) c02.f1719a).f15573n.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (((C2066c0) c02.f1719a).f15566g.r()) {
            C2111z0 o4 = c02.o(activity);
            c02.d = c02.c;
            c02.c = null;
            C2064b0 c2064b0 = ((C2066c0) c02.f1719a).f15569j;
            C2066c0.i(c2064b0);
            c2064b0.o(new RunnableC0758j(4, elapsedRealtime, c02, o4, false));
        } else {
            c02.c = null;
            C2064b0 c2064b02 = ((C2066c0) c02.f1719a).f15569j;
            C2066c0.i(c2064b02);
            c2064b02.o(new RunnableC2100u(c02, elapsedRealtime, 1));
        }
        Q0 q02 = ((C2066c0) this.f15798o.f1719a).f15570k;
        C2066c0.h(q02);
        ((C2066c0) q02.f1719a).f15573n.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        C2064b0 c2064b03 = ((C2066c0) q02.f1719a).f15569j;
        C2066c0.i(c2064b03);
        c2064b03.o(new N0(q02, elapsedRealtime2, 1));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Q0 q02 = ((C2066c0) this.f15798o.f1719a).f15570k;
        C2066c0.h(q02);
        ((C2066c0) q02.f1719a).f15573n.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C2064b0 c2064b0 = ((C2066c0) q02.f1719a).f15569j;
        C2066c0.i(c2064b0);
        c2064b0.o(new N0(q02, elapsedRealtime, 0));
        C0 c02 = ((C2066c0) this.f15798o.f1719a).f15574o;
        C2066c0.h(c02);
        synchronized (c02.f15345l) {
            c02.f15344k = true;
            if (activity != c02.f15340g) {
                synchronized (c02.f15345l) {
                    c02.f15340g = activity;
                    c02.f15341h = false;
                }
                if (((C2066c0) c02.f1719a).f15566g.r()) {
                    c02.f15342i = null;
                    C2064b0 c2064b02 = ((C2066c0) c02.f1719a).f15569j;
                    C2066c0.i(c2064b02);
                    c2064b02.o(new B0(c02, 1));
                }
            }
        }
        if (!((C2066c0) c02.f1719a).f15566g.r()) {
            c02.c = c02.f15342i;
            C2064b0 c2064b03 = ((C2066c0) c02.f1719a).f15569j;
            C2066c0.i(c2064b03);
            c2064b03.o(new B0(c02, 0));
            return;
        }
        c02.p(activity, c02.o(activity), false);
        C2104w k3 = ((C2066c0) c02.f1719a).k();
        ((C2066c0) k3.f1719a).f15573n.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        C2064b0 c2064b04 = ((C2066c0) k3.f1719a).f15569j;
        C2066c0.i(c2064b04);
        c2064b04.o(new RunnableC2100u(k3, elapsedRealtime2, 0));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C2111z0 c2111z0;
        C0 c02 = ((C2066c0) this.f15798o.f1719a).f15574o;
        C2066c0.h(c02);
        if (!((C2066c0) c02.f1719a).f15566g.r() || bundle == null || (c2111z0 = (C2111z0) c02.f15339f.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", c2111z0.c);
        bundle2.putString("name", c2111z0.f15861a);
        bundle2.putString("referrer_name", c2111z0.f15862b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
