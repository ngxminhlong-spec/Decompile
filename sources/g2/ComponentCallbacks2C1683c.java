package g2;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: g2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C1683c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: s, reason: collision with root package name */
    public static final ComponentCallbacks2C1683c f12980s = new ComponentCallbacks2C1683c();

    /* renamed from: o, reason: collision with root package name */
    public final AtomicBoolean f12981o = new AtomicBoolean();

    /* renamed from: p, reason: collision with root package name */
    public final AtomicBoolean f12982p = new AtomicBoolean();

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f12983q = new ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public boolean f12984r = false;

    public static void b(Application application) {
        ComponentCallbacks2C1683c componentCallbacks2C1683c = f12980s;
        synchronized (componentCallbacks2C1683c) {
            try {
                if (!componentCallbacks2C1683c.f12984r) {
                    application.registerActivityLifecycleCallbacks(componentCallbacks2C1683c);
                    application.registerComponentCallbacks(componentCallbacks2C1683c);
                    componentCallbacks2C1683c.f12984r = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(InterfaceC1682b interfaceC1682b) {
        synchronized (f12980s) {
            this.f12983q.add(interfaceC1682b);
        }
    }

    public final void c(boolean z4) {
        synchronized (f12980s) {
            try {
                ArrayList arrayList = this.f12983q;
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    ((InterfaceC1682b) obj).a(z4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f12981o.compareAndSet(true, false);
        this.f12982p.set(true);
        if (compareAndSet) {
            c(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f12981o.compareAndSet(true, false);
        this.f12982p.set(true);
        if (compareAndSet) {
            c(false);
        }
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

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i4) {
        if (i4 == 20 && this.f12981o.compareAndSet(false, true)) {
            this.f12982p.set(true);
            c(true);
        }
    }
}
