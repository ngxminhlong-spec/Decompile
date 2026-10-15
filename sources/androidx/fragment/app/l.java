package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class l extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f2872a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f2873b;
    public final /* synthetic */ AbstractComponentCallbacksC0157f c;

    public l(ViewGroup viewGroup, View view, AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f) {
        this.f2872a = viewGroup;
        this.f2873b = view;
        this.c = abstractComponentCallbacksC0157f;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f2872a.endViewTransition(this.f2873b);
        animator.removeListener(this);
        AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f = this.c;
        View view = abstractComponentCallbacksC0157f.f2835R;
        if (view == null || !abstractComponentCallbacksC0157f.f2830L) {
            return;
        }
        view.setVisibility(8);
    }
}
