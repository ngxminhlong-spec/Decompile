package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Bundle;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.br, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0452br implements Application.ActivityLifecycleCallbacks {

    /* renamed from: o, reason: collision with root package name */
    public boolean f8292o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f8293p;

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC0409ar f8294q;

    public void a(boolean z4) {
    }

    public boolean b() {
        return false;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
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
        if (!this.f8293p) {
            this.f8293p = true;
            if (this.f8292o) {
                a(true);
                InterfaceC0409ar interfaceC0409ar = this.f8294q;
                if (interfaceC0409ar != null) {
                    interfaceC0409ar.g(true);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        boolean z4 = runningAppProcessInfo.importance == 100 || b();
        if (this.f8293p != z4) {
            this.f8293p = z4;
            if (this.f8292o) {
                a(z4);
                InterfaceC0409ar interfaceC0409ar = this.f8294q;
                if (interfaceC0409ar != null) {
                    interfaceC0409ar.g(z4);
                }
            }
        }
    }
}
