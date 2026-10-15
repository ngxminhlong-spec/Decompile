package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class A4 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {

    /* renamed from: C, reason: collision with root package name */
    public static final long f3911C = ((Long) O1.r.d.c.a(AbstractC1066q6.f10199a1)).longValue();

    /* renamed from: A, reason: collision with root package name */
    public final DisplayMetrics f3912A;

    /* renamed from: B, reason: collision with root package name */
    public final Rect f3913B;

    /* renamed from: o, reason: collision with root package name */
    public final Context f3914o;

    /* renamed from: p, reason: collision with root package name */
    public final Application f3915p;

    /* renamed from: q, reason: collision with root package name */
    public final PowerManager f3916q;

    /* renamed from: r, reason: collision with root package name */
    public final KeyguardManager f3917r;

    /* renamed from: s, reason: collision with root package name */
    public Q1.E f3918s;

    /* renamed from: t, reason: collision with root package name */
    public WeakReference f3919t;

    /* renamed from: u, reason: collision with root package name */
    public final WeakReference f3920u;

    /* renamed from: v, reason: collision with root package name */
    public final P3 f3921v;

    /* renamed from: w, reason: collision with root package name */
    public final Q1.z f3922w = new Q1.z(f3911C);

    /* renamed from: x, reason: collision with root package name */
    public boolean f3923x = false;
    public int y = -1;

    /* renamed from: z, reason: collision with root package name */
    public final HashSet f3924z = new HashSet();

    public A4(Context context, View view) {
        Context applicationContext = context.getApplicationContext();
        this.f3914o = applicationContext;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        this.f3916q = (PowerManager) applicationContext.getSystemService("power");
        this.f3917r = (KeyguardManager) context.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.f3915p = application;
            this.f3921v = new P3(application, this);
        }
        this.f3912A = context.getResources().getDisplayMetrics();
        Rect rect = new Rect();
        this.f3913B = rect;
        rect.right = windowManager.getDefaultDisplay().getWidth();
        rect.bottom = windowManager.getDefaultDisplay().getHeight();
        WeakReference weakReference = this.f3920u;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            f(view2);
        }
        this.f3920u = new WeakReference(view);
        if (view != null) {
            if (view.isAttachedToWindow()) {
                e(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    public final Rect a(Rect rect) {
        float f4 = rect.left;
        float f5 = this.f3912A.density;
        return new Rect((int) (f4 / f5), (int) (rect.top / f5), (int) (rect.right / f5), (int) (rect.bottom / f5));
    }

    public final void b(Activity activity, int i4) {
        Window window;
        WeakReference weakReference = this.f3920u;
        if (weakReference == null || (window = activity.getWindow()) == null) {
            return;
        }
        View peekDecorView = window.peekDecorView();
        View view = (View) weakReference.get();
        if (view == null || peekDecorView == null || view.getRootView() != peekDecorView.getRootView()) {
            return;
        }
        this.y = i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x014c, code lost:
    
        if (r10 == 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x012e, code lost:
    
        if (r10 == 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0130, code lost:
    
        r4 = true;
        r10 = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0214 A[LOOP:1: B:84:0x020e->B:86:0x0214, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01a2  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(int r30) {
        /*
            Method dump skipped, instructions count: 545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.A4.c(int):void");
    }

    public final void d() {
        Q1.N.f1668k.post(new D3(4, this));
    }

    public final void e(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f3919t = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f3918s == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            Q1.E e4 = new Q1.E(3, this);
            this.f3918s = e4;
            Context context = this.f3914o;
            Q1.F f4 = N1.n.f1204A.f1226x;
            synchronized (f4) {
                if (f4.f1627p) {
                    ((WeakHashMap) f4.f1629r).put(e4, intentFilter);
                } else {
                    AbstractC1066q6.a(context);
                    if (!((Boolean) O1.r.d.c.a(AbstractC1066q6.n9)).booleanValue() || Build.VERSION.SDK_INT < 33) {
                        context.registerReceiver(e4, intentFilter);
                    } else {
                        B0.s.C(context, e4, intentFilter);
                    }
                }
            }
        }
        Application application = this.f3915p;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.f3921v);
            } catch (Exception e5) {
                Y9.q("Error registering activity lifecycle callbacks.", e5);
            }
        }
    }

    public final void f(View view) {
        try {
            WeakReference weakReference = this.f3919t;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f3919t = null;
            }
        } catch (Exception e4) {
            Y9.q("Error while unregistering listeners from the last ViewTreeObserver.", e4);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e5) {
            Y9.q("Error while unregistering listeners from the ViewTreeObserver.", e5);
        }
        Q1.E e6 = this.f3918s;
        if (e6 != null) {
            try {
                N1.n.f1204A.f1226x.d(this.f3914o, e6);
            } catch (IllegalStateException e7) {
                Y9.q("Failed trying to unregister the receiver", e7);
            } catch (Exception e8) {
                N1.n.f1204A.f1209g.h("ActiveViewUnit.stopScreenStatusMonitoring", e8);
            }
            this.f3918s = null;
        }
        Application application = this.f3915p;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.f3921v);
            } catch (Exception e9) {
                Y9.q("Error registering activity lifecycle callbacks.", e9);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        b(activity, 0);
        c(3);
        d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        c(3);
        d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        b(activity, 4);
        c(3);
        d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        b(activity, 0);
        c(3);
        d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        c(3);
        d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        b(activity, 0);
        c(3);
        d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        c(3);
        d();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        c(2);
        d();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        c(1);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.y = -1;
        e(view);
        c(3);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.y = -1;
        c(3);
        d();
        f(view);
    }
}
