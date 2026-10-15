package H;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: H.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0036k implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: o, reason: collision with root package name */
    public final View f826o;

    /* renamed from: p, reason: collision with root package name */
    public ViewTreeObserver f827p;

    /* renamed from: q, reason: collision with root package name */
    public final Runnable f828q;

    public ViewTreeObserverOnPreDrawListenerC0036k(View view, Runnable runnable) {
        this.f826o = view;
        this.f827p = view.getViewTreeObserver();
        this.f828q = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        ViewTreeObserverOnPreDrawListenerC0036k viewTreeObserverOnPreDrawListenerC0036k = new ViewTreeObserverOnPreDrawListenerC0036k(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0036k);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0036k);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean isAlive = this.f827p.isAlive();
        View view = this.f826o;
        if (isAlive) {
            this.f827p.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f828q.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f827p = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f827p.isAlive();
        View view2 = this.f826o;
        if (isAlive) {
            this.f827p.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
