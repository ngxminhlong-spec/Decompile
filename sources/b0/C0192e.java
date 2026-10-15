package b0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: b0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0192e extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3265a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0193f f3266b;
    public final /* synthetic */ ViewPropertyAnimator c;
    public final /* synthetic */ View d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0195h f3267e;

    public /* synthetic */ C0192e(C0195h c0195h, C0193f c0193f, ViewPropertyAnimator viewPropertyAnimator, View view, int i4) {
        this.f3265a = i4;
        this.f3267e = c0195h;
        this.f3266b = c0193f;
        this.c = viewPropertyAnimator;
        this.d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f3265a) {
            case 0:
                this.c.setListener(null);
                View view = this.d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                C0193f c0193f = this.f3266b;
                c0 c0Var = c0193f.f3269a;
                C0195h c0195h = this.f3267e;
                c0195h.c(c0Var);
                c0195h.f3291r.remove(c0193f.f3269a);
                c0195h.i();
                return;
            default:
                this.c.setListener(null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                C0193f c0193f2 = this.f3266b;
                c0 c0Var2 = c0193f2.f3270b;
                C0195h c0195h2 = this.f3267e;
                c0195h2.c(c0Var2);
                c0195h2.f3291r.remove(c0193f2.f3270b);
                c0195h2.i();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f3265a) {
            case 0:
                c0 c0Var = this.f3266b.f3269a;
                this.f3267e.getClass();
                return;
            default:
                c0 c0Var2 = this.f3266b.f3270b;
                this.f3267e.getClass();
                return;
        }
    }
}
