package a3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class b extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f2356a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f2357b;
    public final /* synthetic */ View c;

    public b(boolean z4, View view, View view2) {
        this.f2356a = z4;
        this.f2357b = view;
        this.c = view2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f2356a) {
            return;
        }
        this.f2357b.setVisibility(4);
        View view = this.c;
        view.setAlpha(1.0f);
        view.setVisibility(0);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.f2356a) {
            this.f2357b.setVisibility(0);
            View view = this.c;
            view.setAlpha(0.0f);
            view.setVisibility(4);
        }
    }
}
