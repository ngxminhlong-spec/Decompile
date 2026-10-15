package x;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.ads.Jn;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: x.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2055b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: o, reason: collision with root package name */
    public Object f15166o;

    /* renamed from: p, reason: collision with root package name */
    public Activity f15167p;

    /* renamed from: q, reason: collision with root package name */
    public final int f15168q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f15169r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f15170s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f15171t = false;

    public C2055b(Activity activity) {
        this.f15167p = activity;
        this.f15168q = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f15167p == activity) {
            this.f15167p = null;
            this.f15170s = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f15170s || this.f15171t || this.f15169r) {
            return;
        }
        Object obj = this.f15166o;
        try {
            Object obj2 = AbstractC2056c.c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.f15168q) {
                AbstractC2056c.f15176g.postAtFrontOfQueue(new Jn(29, AbstractC2056c.f15173b.get(activity), obj2));
                this.f15171t = true;
                this.f15166o = null;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f15167p == activity) {
            this.f15169r = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
