package Y2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class e extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2156a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f2157b;

    public /* synthetic */ e(g gVar, int i4) {
        this.f2156a = i4;
        this.f2157b = gVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f2156a) {
            case 1:
                this.f2157b.f2184a.setEndIconVisible(false);
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f2156a) {
            case 0:
                this.f2157b.f2184a.setEndIconVisible(true);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
