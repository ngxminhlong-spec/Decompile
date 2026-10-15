package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Kc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnScrollChangedListenerC0297Kc extends AA implements ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: q, reason: collision with root package name */
    public final WeakReference f6032q;

    public ViewTreeObserverOnScrollChangedListenerC0297Kc(View view, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        super(view);
        this.f6032q = new WeakReference(onScrollChangedListener);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = (ViewTreeObserver.OnScrollChangedListener) this.f6032q.get();
        if (onScrollChangedListener != null) {
            onScrollChangedListener.onScrollChanged();
            return;
        }
        View view = (View) ((WeakReference) this.f3928o).get();
        ViewTreeObserver viewTreeObserver2 = null;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            viewTreeObserver2 = viewTreeObserver;
        }
        if (viewTreeObserver2 != null) {
            viewTreeObserver2.removeOnScrollChangedListener(this);
        }
    }

    public final void r1(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnScrollChangedListener(this);
    }
}
