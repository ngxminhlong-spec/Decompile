package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class P3 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: p, reason: collision with root package name */
    public final Application f6562p;

    /* renamed from: q, reason: collision with root package name */
    public final WeakReference f6563q;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f6561o = 1;

    /* renamed from: r, reason: collision with root package name */
    public boolean f6564r = false;

    public P3(Application application, A4 a4) {
        this.f6563q = new WeakReference(a4);
        this.f6562p = application;
    }

    public P3(Application application, Y3 y32) {
        this.f6563q = new WeakReference(y32);
        this.f6562p = application;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        switch (this.f6561o) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f6563q.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityCreated(activity, bundle);
                    } else if (!this.f6564r) {
                        this.f6562p.unregisterActivityLifecycleCallbacks(this);
                        this.f6564r = true;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) this.f6563q.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityCreated(activity, bundle);
                    } else if (!this.f6564r) {
                        this.f6562p.unregisterActivityLifecycleCallbacks(this);
                        this.f6564r = true;
                    }
                    return;
                } catch (Exception e4) {
                    Y9.q("Error while dispatching lifecycle callback.", e4);
                    return;
                }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        switch (this.f6561o) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f6563q.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityDestroyed(activity);
                    } else if (!this.f6564r) {
                        this.f6562p.unregisterActivityLifecycleCallbacks(this);
                        this.f6564r = true;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) this.f6563q.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityDestroyed(activity);
                    } else if (!this.f6564r) {
                        this.f6562p.unregisterActivityLifecycleCallbacks(this);
                        this.f6564r = true;
                    }
                    return;
                } catch (Exception e4) {
                    Y9.q("Error while dispatching lifecycle callback.", e4);
                    return;
                }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        switch (this.f6561o) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f6563q.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityPaused(activity);
                    } else if (!this.f6564r) {
                        this.f6562p.unregisterActivityLifecycleCallbacks(this);
                        this.f6564r = true;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) this.f6563q.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityPaused(activity);
                    } else if (!this.f6564r) {
                        this.f6562p.unregisterActivityLifecycleCallbacks(this);
                        this.f6564r = true;
                    }
                    return;
                } catch (Exception e4) {
                    Y9.q("Error while dispatching lifecycle callback.", e4);
                    return;
                }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        switch (this.f6561o) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f6563q.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityResumed(activity);
                    } else if (!this.f6564r) {
                        this.f6562p.unregisterActivityLifecycleCallbacks(this);
                        this.f6564r = true;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) this.f6563q.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityResumed(activity);
                    } else if (!this.f6564r) {
                        this.f6562p.unregisterActivityLifecycleCallbacks(this);
                        this.f6564r = true;
                    }
                    return;
                } catch (Exception e4) {
                    Y9.q("Error while dispatching lifecycle callback.", e4);
                    return;
                }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        switch (this.f6561o) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f6563q.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivitySaveInstanceState(activity, bundle);
                    } else if (!this.f6564r) {
                        this.f6562p.unregisterActivityLifecycleCallbacks(this);
                        this.f6564r = true;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) this.f6563q.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivitySaveInstanceState(activity, bundle);
                    } else if (!this.f6564r) {
                        this.f6562p.unregisterActivityLifecycleCallbacks(this);
                        this.f6564r = true;
                    }
                    return;
                } catch (Exception e4) {
                    Y9.q("Error while dispatching lifecycle callback.", e4);
                    return;
                }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        switch (this.f6561o) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f6563q.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityStarted(activity);
                    } else if (!this.f6564r) {
                        this.f6562p.unregisterActivityLifecycleCallbacks(this);
                        this.f6564r = true;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) this.f6563q.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityStarted(activity);
                    } else if (!this.f6564r) {
                        this.f6562p.unregisterActivityLifecycleCallbacks(this);
                        this.f6564r = true;
                    }
                    return;
                } catch (Exception e4) {
                    Y9.q("Error while dispatching lifecycle callback.", e4);
                    return;
                }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        switch (this.f6561o) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f6563q.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityStopped(activity);
                    } else if (!this.f6564r) {
                        this.f6562p.unregisterActivityLifecycleCallbacks(this);
                        this.f6564r = true;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) this.f6563q.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityStopped(activity);
                    } else if (!this.f6564r) {
                        this.f6562p.unregisterActivityLifecycleCallbacks(this);
                        this.f6564r = true;
                    }
                    return;
                } catch (Exception e4) {
                    Y9.q("Error while dispatching lifecycle callback.", e4);
                    return;
                }
        }
    }
}
