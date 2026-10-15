package b0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: b0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0191d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c0 f3260a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3261b;
    public final /* synthetic */ View c;
    public final /* synthetic */ int d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f3262e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0195h f3263f;

    public C0191d(C0195h c0195h, c0 c0Var, int i4, View view, int i5, ViewPropertyAnimator viewPropertyAnimator) {
        this.f3263f = c0195h;
        this.f3260a = c0Var;
        this.f3261b = i4;
        this.c = view;
        this.d = i5;
        this.f3262e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i4 = this.f3261b;
        View view = this.c;
        if (i4 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f3262e.setListener(null);
        C0195h c0195h = this.f3263f;
        c0 c0Var = this.f3260a;
        c0195h.c(c0Var);
        c0195h.f3289p.remove(c0Var);
        c0195h.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f3263f.getClass();
    }
}
