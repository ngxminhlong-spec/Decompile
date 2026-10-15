package b0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.fragment.app.AbstractComponentCallbacksC0157f;
import androidx.fragment.app.C0156e;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: b0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0190c extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3240a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3241b;
    public final /* synthetic */ View c;
    public final /* synthetic */ Object d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3242e;

    public C0190c(C0195h c0195h, c0 c0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f3240a = 0;
        this.f3242e = c0195h;
        this.f3241b = c0Var;
        this.d = viewPropertyAnimator;
        this.c = view;
    }

    public /* synthetic */ C0190c(Object obj, Object obj2, View view, Object obj3, int i4) {
        this.f3240a = i4;
        this.f3242e = obj;
        this.f3241b = obj2;
        this.c = view;
        this.d = obj3;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f3240a) {
            case 1:
                this.c.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f3240a) {
            case 0:
                ((ViewPropertyAnimator) this.d).setListener(null);
                this.c.setAlpha(1.0f);
                C0195h c0195h = (C0195h) this.f3242e;
                c0 c0Var = (c0) this.f3241b;
                c0195h.c(c0Var);
                c0195h.f3290q.remove(c0Var);
                c0195h.i();
                return;
            case 1:
                ((ViewPropertyAnimator) this.d).setListener(null);
                C0195h c0195h2 = (C0195h) this.f3242e;
                c0 c0Var2 = (c0) this.f3241b;
                c0195h2.c(c0Var2);
                c0195h2.f3288o.remove(c0Var2);
                c0195h2.i();
                return;
            default:
                ViewGroup viewGroup = (ViewGroup) this.f3241b;
                View view = this.c;
                viewGroup.endViewTransition(view);
                AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f = (AbstractComponentCallbacksC0157f) this.d;
                Animator j4 = abstractComponentCallbacksC0157f.j();
                abstractComponentCallbacksC0157f.b().f2811b = null;
                if (j4 == null || viewGroup.indexOfChild(view) >= 0) {
                    return;
                }
                androidx.fragment.app.s sVar = (androidx.fragment.app.s) this.f3242e;
                C0156e c0156e = abstractComponentCallbacksC0157f.f2839V;
                sVar.Y(abstractComponentCallbacksC0157f, c0156e == null ? 0 : c0156e.c, 0, 0, false);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f3240a) {
            case 0:
                ((C0195h) this.f3242e).getClass();
                return;
            case 1:
                ((C0195h) this.f3242e).getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
