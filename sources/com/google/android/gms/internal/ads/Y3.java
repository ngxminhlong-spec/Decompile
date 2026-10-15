package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Y3 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {

    /* renamed from: A, reason: collision with root package name */
    public static final Handler f7730A = new Handler(Looper.getMainLooper());

    /* renamed from: o, reason: collision with root package name */
    public final Context f7731o;

    /* renamed from: p, reason: collision with root package name */
    public final Application f7732p;

    /* renamed from: q, reason: collision with root package name */
    public final PowerManager f7733q;

    /* renamed from: r, reason: collision with root package name */
    public final KeyguardManager f7734r;

    /* renamed from: s, reason: collision with root package name */
    public Q1.E f7735s;

    /* renamed from: t, reason: collision with root package name */
    public final R3 f7736t;

    /* renamed from: u, reason: collision with root package name */
    public WeakReference f7737u;

    /* renamed from: v, reason: collision with root package name */
    public WeakReference f7738v;

    /* renamed from: w, reason: collision with root package name */
    public final P3 f7739w;

    /* renamed from: x, reason: collision with root package name */
    public byte f7740x = -1;
    public int y = -1;

    /* renamed from: z, reason: collision with root package name */
    public long f7741z = -3;

    public Y3(Context context, R3 r32) {
        Context applicationContext = context.getApplicationContext();
        this.f7731o = applicationContext;
        this.f7736t = r32;
        this.f7733q = (PowerManager) applicationContext.getSystemService("power");
        this.f7734r = (KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.f7732p = application;
            this.f7739w = new P3(application, this);
        }
        a(null);
    }

    public final void a(View view) {
        long j4;
        WeakReference weakReference = this.f7738v;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            e(view2);
        }
        this.f7738v = new WeakReference(view);
        if (view != null) {
            if (view.getWindowToken() != null || view.getWindowVisibility() != 8) {
                d(view);
            }
            view.addOnAttachStateChangeListener(this);
            j4 = -2;
        } else {
            j4 = -3;
        }
        this.f7741z = j4;
    }

    public final void b(Activity activity, int i4) {
        Window window;
        if (this.f7738v == null || (window = activity.getWindow()) == null) {
            return;
        }
        View peekDecorView = window.peekDecorView();
        WeakReference weakReference = this.f7738v;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view == null || peekDecorView == null || view.getRootView() != peekDecorView.getRootView()) {
            return;
        }
        this.y = i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0084, code lost:
    
        if ((r1.flags & 524288) != 0) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r9 = this;
            java.lang.ref.WeakReference r0 = r9.f7738v
            if (r0 != 0) goto L6
            goto Lc2
        L6:
            r1 = 0
            if (r0 == 0) goto L10
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            goto L11
        L10:
            r0 = r1
        L11:
            r2 = -1
            r3 = -3
            if (r0 != 0) goto L1b
            r9.f7741z = r3
            r9.f7740x = r2
            return
        L1b:
            int r5 = r0.getVisibility()
            r6 = 0
            if (r5 == 0) goto L24
            r5 = 1
            goto L25
        L24:
            r5 = r6
        L25:
            boolean r7 = r0.isShown()
            if (r7 != 0) goto L2d
            r5 = r5 | 2
        L2d:
            android.os.PowerManager r7 = r9.f7733q
            if (r7 == 0) goto L39
            boolean r7 = r7.isScreenOn()
            if (r7 != 0) goto L39
            r5 = r5 | 4
        L39:
            com.google.android.gms.internal.ads.R3 r7 = r9.f7736t
            boolean r7 = r7.f6784a
            if (r7 != 0) goto L88
            android.app.KeyguardManager r7 = r9.f7734r
            if (r7 == 0) goto L86
            boolean r7 = r7.inKeyguardRestrictedInputMode()
            if (r7 == 0) goto L86
            char[] r7 = com.google.android.gms.internal.ads.W3.f7341a
            android.view.View r7 = r0.getRootView()
            if (r7 != 0) goto L52
            r7 = r0
        L52:
            android.content.Context r7 = r7.getContext()
        L56:
            boolean r8 = r7 instanceof android.content.ContextWrapper
            if (r8 == 0) goto L6e
            r8 = 10
            if (r6 >= r8) goto L6e
            boolean r8 = r7 instanceof android.app.Activity
            if (r8 == 0) goto L65
            android.app.Activity r7 = (android.app.Activity) r7
            goto L6f
        L65:
            android.content.ContextWrapper r7 = (android.content.ContextWrapper) r7
            android.content.Context r7 = r7.getBaseContext()
            int r6 = r6 + 1
            goto L56
        L6e:
            r7 = r1
        L6f:
            if (r7 != 0) goto L72
            goto L86
        L72:
            android.view.Window r6 = r7.getWindow()
            if (r6 != 0) goto L79
            goto L7d
        L79:
            android.view.WindowManager$LayoutParams r1 = r6.getAttributes()
        L7d:
            if (r1 == 0) goto L86
            int r1 = r1.flags
            r6 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 & r6
            if (r1 != 0) goto L88
        L86:
            r5 = r5 | 8
        L88:
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            boolean r1 = r0.getGlobalVisibleRect(r1)
            if (r1 != 0) goto L95
            r5 = r5 | 16
        L95:
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            boolean r1 = r0.getLocalVisibleRect(r1)
            if (r1 != 0) goto La2
            r5 = r5 | 32
        La2:
            int r0 = r0.getWindowVisibility()
            int r1 = r9.y
            if (r1 == r2) goto Lab
            r0 = r1
        Lab:
            if (r0 == 0) goto Laf
            r5 = r5 | 64
        Laf:
            byte r0 = r9.f7740x
            if (r0 == r5) goto Lc2
            byte r0 = (byte) r5
            r9.f7740x = r0
            if (r5 != 0) goto Lbd
            long r0 = android.os.SystemClock.elapsedRealtime()
            goto Lc0
        Lbd:
            long r0 = (long) r5
            long r0 = r3 - r0
        Lc0:
            r9.f7741z = r0
        Lc2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Y3.c():void");
    }

    public final void d(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f7737u = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f7735s == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            Q1.E e4 = new Q1.E(2, this);
            this.f7735s = e4;
            this.f7731o.registerReceiver(e4, intentFilter);
        }
        Application application = this.f7732p;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.f7739w);
            } catch (Exception unused) {
            }
        }
    }

    public final void e(View view) {
        try {
            WeakReference weakReference = this.f7737u;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f7737u = null;
            }
        } catch (Exception unused) {
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception unused2) {
        }
        Q1.E e4 = this.f7735s;
        if (e4 != null) {
            try {
                this.f7731o.unregisterReceiver(e4);
            } catch (Exception unused3) {
            }
            this.f7735s = null;
        }
        Application application = this.f7732p;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.f7739w);
            } catch (Exception unused4) {
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        b(activity, 0);
        c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        b(activity, 4);
        c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        b(activity, 0);
        c();
        f7730A.post(new D3(2, this));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        b(activity, 0);
        c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        c();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        c();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        c();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.y = -1;
        d(view);
        c();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.y = -1;
        c();
        f7730A.post(new D3(2, this));
        e(view);
    }
}
