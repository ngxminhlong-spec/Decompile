package Q1;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.CompoundButton;
import com.google.android.gms.internal.ads.C1016p;
import com.google.android.gms.internal.ads.ViewTreeObserverOnGlobalLayoutListenerC0292Jc;
import com.google.android.gms.internal.ads.ViewTreeObserverOnGlobalLayoutListenerC0358Wd;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1633a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1634b;
    public boolean c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1635e;

    /* renamed from: f, reason: collision with root package name */
    public Object f1636f;

    public H() {
        this.d = new n.f();
        this.c = true;
    }

    public H(Activity activity, ViewTreeObserverOnGlobalLayoutListenerC0358Wd viewTreeObserverOnGlobalLayoutListenerC0358Wd, ViewTreeObserverOnGlobalLayoutListenerC0358Wd viewTreeObserverOnGlobalLayoutListenerC0358Wd2) {
        this.f1636f = activity;
        this.d = viewTreeObserverOnGlobalLayoutListenerC0358Wd;
        this.f1635e = viewTreeObserverOnGlobalLayoutListenerC0358Wd2;
    }

    public H(CompoundButton compoundButton) {
        this.f1635e = null;
        this.f1636f = null;
        this.f1633a = false;
        this.f1634b = false;
        this.d = compoundButton;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.d;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.f1633a || this.f1634b) {
                Drawable mutate = buttonDrawable.mutate();
                if (this.f1633a) {
                    mutate.setTintList((ColorStateList) this.f1635e);
                }
                if (this.f1634b) {
                    mutate.setTintMode((PorterDuff.Mode) this.f1636f);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0048 A[Catch: all -> 0x0028, TryCatch #1 {all -> 0x0028, blocks: (B:3:0x0010, B:5:0x0016, B:8:0x001c, B:9:0x0041, B:11:0x0048, B:12:0x004f, B:14:0x0056, B:21:0x002a, B:23:0x0030, B:25:0x0036), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0056 A[Catch: all -> 0x0028, TRY_LEAVE, TryCatch #1 {all -> 0x0028, blocks: (B:3:0x0010, B:5:0x0016, B:8:0x001c, B:9:0x0041, B:11:0x0048, B:12:0x004f, B:14:0x0056, B:21:0x002a, B:23:0x0030, B:25:0x0036), top: B:2:0x0010 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(android.util.AttributeSet r5, int r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.d
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            android.content.Context r1 = r0.getContext()
            int[] r2 = e.AbstractC1657a.f12644l
            r3 = 0
            android.content.res.TypedArray r5 = r1.obtainStyledAttributes(r5, r2, r6, r3)
            r6 = 1
            boolean r1 = r5.hasValue(r6)     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto L2a
            int r6 = r5.getResourceId(r6, r3)     // Catch: java.lang.Throwable -> L28
            if (r6 == 0) goto L2a
            android.content.Context r1 = r0.getContext()     // Catch: java.lang.Throwable -> L28 android.content.res.Resources.NotFoundException -> L2a
            android.graphics.drawable.Drawable r6 = g.AbstractC1678a.a(r1, r6)     // Catch: java.lang.Throwable -> L28 android.content.res.Resources.NotFoundException -> L2a
            r0.setButtonDrawable(r6)     // Catch: java.lang.Throwable -> L28 android.content.res.Resources.NotFoundException -> L2a
            goto L41
        L28:
            r6 = move-exception
            goto L67
        L2a:
            boolean r6 = r5.hasValue(r3)     // Catch: java.lang.Throwable -> L28
            if (r6 == 0) goto L41
            int r6 = r5.getResourceId(r3, r3)     // Catch: java.lang.Throwable -> L28
            if (r6 == 0) goto L41
            android.content.Context r1 = r0.getContext()     // Catch: java.lang.Throwable -> L28
            android.graphics.drawable.Drawable r6 = g.AbstractC1678a.a(r1, r6)     // Catch: java.lang.Throwable -> L28
            r0.setButtonDrawable(r6)     // Catch: java.lang.Throwable -> L28
        L41:
            r6 = 2
            boolean r1 = r5.hasValue(r6)     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto L4f
            android.content.res.ColorStateList r6 = r5.getColorStateList(r6)     // Catch: java.lang.Throwable -> L28
            r0.setButtonTintList(r6)     // Catch: java.lang.Throwable -> L28
        L4f:
            r6 = 3
            boolean r1 = r5.hasValue(r6)     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto L63
            r1 = -1
            int r6 = r5.getInt(r6, r1)     // Catch: java.lang.Throwable -> L28
            r1 = 0
            android.graphics.PorterDuff$Mode r6 = l.T.b(r6, r1)     // Catch: java.lang.Throwable -> L28
            r0.setButtonTintMode(r6)     // Catch: java.lang.Throwable -> L28
        L63:
            r5.recycle()
            return
        L67:
            r5.recycle()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Q1.H.b(android.util.AttributeSet, int):void");
    }

    public void c() {
        ViewTreeObserver viewTreeObserver;
        View decorView;
        ViewTreeObserverOnGlobalLayoutListenerC0358Wd viewTreeObserverOnGlobalLayoutListenerC0358Wd = (ViewTreeObserverOnGlobalLayoutListenerC0358Wd) this.f1635e;
        if (this.f1633a) {
            return;
        }
        Activity activity = (Activity) this.f1636f;
        ViewTreeObserver viewTreeObserver2 = null;
        if (activity != null) {
            Window window = activity.getWindow();
            ViewTreeObserver viewTreeObserver3 = (window == null || (decorView = window.getDecorView()) == null) ? null : decorView.getViewTreeObserver();
            if (viewTreeObserver3 != null) {
                viewTreeObserver3.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0358Wd);
            }
        }
        ViewTreeObserverOnGlobalLayoutListenerC0358Wd viewTreeObserverOnGlobalLayoutListenerC0358Wd2 = (ViewTreeObserverOnGlobalLayoutListenerC0358Wd) this.d;
        C1016p c1016p = N1.n.f1204A.f1227z;
        ViewTreeObserverOnGlobalLayoutListenerC0292Jc viewTreeObserverOnGlobalLayoutListenerC0292Jc = new ViewTreeObserverOnGlobalLayoutListenerC0292Jc(viewTreeObserverOnGlobalLayoutListenerC0358Wd2, viewTreeObserverOnGlobalLayoutListenerC0358Wd);
        View view = (View) ((WeakReference) viewTreeObserverOnGlobalLayoutListenerC0292Jc.f3928o).get();
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            viewTreeObserver2 = viewTreeObserver;
        }
        if (viewTreeObserver2 != null) {
            viewTreeObserverOnGlobalLayoutListenerC0292Jc.r1(viewTreeObserver2);
        }
        this.f1633a = true;
    }
}
