package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class F4 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: o, reason: collision with root package name */
    public Activity f4976o;

    /* renamed from: p, reason: collision with root package name */
    public Application f4977p;

    /* renamed from: v, reason: collision with root package name */
    public D3 f4983v;

    /* renamed from: x, reason: collision with root package name */
    public long f4985x;

    /* renamed from: q, reason: collision with root package name */
    public final Object f4978q = new Object();

    /* renamed from: r, reason: collision with root package name */
    public boolean f4979r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f4980s = false;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f4981t = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f4982u = new ArrayList();

    /* renamed from: w, reason: collision with root package name */
    public boolean f4984w = false;

    public final void a(G4 g4) {
        synchronized (this.f4978q) {
            this.f4981t.add(g4);
        }
    }

    public final void b(G4 g4) {
        synchronized (this.f4978q) {
            this.f4981t.remove(g4);
        }
    }

    public final void c(Activity activity) {
        synchronized (this.f4978q) {
            try {
                if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                    this.f4976o = activity;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.f4978q) {
            try {
                Activity activity2 = this.f4976o;
                if (activity2 == null) {
                    return;
                }
                if (activity2.equals(activity)) {
                    this.f4976o = null;
                }
                ArrayList arrayList = this.f4982u;
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    if (obj != null) {
                        throw new ClassCastException();
                    }
                    try {
                        throw null;
                        break;
                    } catch (Exception e4) {
                        N1.n.f1204A.f1209g.h("AppActivityTracker.ActivityListener.onActivityDestroyed", e4);
                        Y9.q("", e4);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        c(activity);
        synchronized (this.f4978q) {
            ArrayList arrayList = this.f4982u;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                if (obj != null) {
                    throw new ClassCastException();
                }
                try {
                    throw null;
                    break;
                } catch (Exception e4) {
                    N1.n.f1204A.f1209g.h("AppActivityTracker.ActivityListener.onActivityPaused", e4);
                    Y9.q("", e4);
                }
            }
        }
        this.f4980s = true;
        D3 d32 = this.f4983v;
        if (d32 != null) {
            Q1.N.f1668k.removeCallbacks(d32);
        }
        Q1.J j4 = Q1.N.f1668k;
        D3 d33 = new D3(5, this);
        this.f4983v = d33;
        j4.postDelayed(d33, this.f4985x);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        c(activity);
        int i4 = 0;
        this.f4980s = false;
        boolean z4 = this.f4979r;
        this.f4979r = true;
        D3 d32 = this.f4983v;
        if (d32 != null) {
            Q1.N.f1668k.removeCallbacks(d32);
        }
        synchronized (this.f4978q) {
            ArrayList arrayList = this.f4982u;
            int size = arrayList.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayList.get(i5);
                i5++;
                if (obj != null) {
                    throw new ClassCastException();
                }
                try {
                    throw null;
                    break;
                } catch (Exception e4) {
                    N1.n.f1204A.f1209g.h("AppActivityTracker.ActivityListener.onActivityResumed", e4);
                    Y9.q("", e4);
                }
            }
            if (z4) {
                Y9.m("App is still foreground.");
            } else {
                ArrayList arrayList2 = this.f4981t;
                int size2 = arrayList2.size();
                while (i4 < size2) {
                    Object obj2 = arrayList2.get(i4);
                    i4++;
                    try {
                        ((G4) obj2).v(true);
                    } catch (Exception e5) {
                        Y9.q("", e5);
                    }
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        c(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
