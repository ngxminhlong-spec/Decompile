package H;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class E extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f785a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f786b;
    public final /* synthetic */ Object c;

    public E(G g4, View view) {
        this.f786b = g4;
        this.c = view;
    }

    public E(k0.o oVar, r.e eVar) {
        this.c = oVar;
        this.f786b = eVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f785a) {
            case 0:
                ((G) this.f786b).b();
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f785a) {
            case 0:
                ((G) this.f786b).a();
                return;
            default:
                ((r.e) this.f786b).remove(animator);
                ((k0.o) this.c).y.remove(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f785a) {
            case 0:
                ((G) this.f786b).c();
                return;
            default:
                ((k0.o) this.c).y.add(animator);
                return;
        }
    }
}
