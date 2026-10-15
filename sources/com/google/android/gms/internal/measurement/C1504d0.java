package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.measurement.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1504d0 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C1509e0 f11903o;

    public C1504d0(C1509e0 c1509e0) {
        this.f11903o = c1509e0;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f11903o.b(new V(this, bundle, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f11903o.b(new C1494b0(this, activity, 4));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f11903o.b(new C1494b0(this, activity, 2));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.f11903o.b(new C1494b0(this, activity, 1));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        D d = new D();
        this.f11903o.b(new V(this, activity, d));
        Bundle Q3 = d.Q(50L);
        if (Q3 != null) {
            bundle.putAll(Q3);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.f11903o.b(new C1494b0(this, activity, 0));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.f11903o.b(new C1494b0(this, activity, 3));
    }
}
