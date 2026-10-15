package k0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: k0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1750A extends AnimatorListenerAdapter implements n {

    /* renamed from: a, reason: collision with root package name */
    public final View f13497a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13498b;
    public final ViewGroup c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f13499e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13500f = false;
    public final boolean d = true;

    public C1750A(View view, int i4) {
        this.f13497a = view;
        this.f13498b = i4;
        this.c = (ViewGroup) view.getParent();
        f(true);
    }

    @Override // k0.n
    public final void a() {
    }

    @Override // k0.n
    public final void b() {
        f(false);
    }

    @Override // k0.n
    public final void c() {
        f(true);
    }

    @Override // k0.n
    public final void d() {
    }

    @Override // k0.n
    public final void e(o oVar) {
        if (!this.f13500f) {
            w.f13563a.R(this.f13497a, this.f13498b);
            ViewGroup viewGroup = this.c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        f(false);
        oVar.v(this);
    }

    public final void f(boolean z4) {
        ViewGroup viewGroup;
        if (!this.d || this.f13499e == z4 || (viewGroup = this.c) == null) {
            return;
        }
        this.f13499e = z4;
        android.support.v4.media.session.a.v(viewGroup, z4);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f13500f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f13500f) {
            w.f13563a.R(this.f13497a, this.f13498b);
            ViewGroup viewGroup = this.c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        f(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        if (this.f13500f) {
            return;
        }
        w.f13563a.R(this.f13497a, this.f13498b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        if (this.f13500f) {
            return;
        }
        w.f13563a.R(this.f13497a, 0);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
