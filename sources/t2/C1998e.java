package t2;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import q1.C1947b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: t2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1998e implements Application.ActivityLifecycleCallbacks {

    /* renamed from: o, reason: collision with root package name */
    public final Activity f14892o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C2000g f14893p;

    public C1998e(C2000g c2000g, Activity activity) {
        this.f14893p = c2000g;
        this.f14892o = activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (activity != this.f14892o) {
            return;
        }
        K k3 = new K("Activity is destroyed.", 3);
        C2000g c2000g = this.f14893p;
        c2000g.c();
        C1947b c1947b = (C1947b) c2000g.f14903j.getAndSet(null);
        if (c1947b == null) {
            return;
        }
        k3.a();
        c1947b.a();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
