package O2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import b0.C0196i;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1426a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1427b;
    public final /* synthetic */ Object c;

    public d(k kVar) {
        this.f1426a = 0;
        this.c = kVar;
    }

    public d(C0196i c0196i) {
        this.f1426a = 1;
        this.c = c0196i;
        this.f1427b = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f1426a) {
            case 0:
                this.f1427b = true;
                return;
            default:
                this.f1427b = true;
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f1426a) {
            case 0:
                k kVar = (k) this.c;
                kVar.f1463t = 0;
                kVar.f1457n = null;
                if (this.f1427b) {
                    return;
                }
                kVar.f1464u.a(4, false);
                return;
            default:
                C0196i c0196i = (C0196i) this.c;
                if (this.f1427b) {
                    this.f1427b = false;
                    return;
                } else if (((Float) c0196i.f3323z.getAnimatedValue()).floatValue() == 0.0f) {
                    c0196i.f3299A = 0;
                    c0196i.j(0);
                    return;
                } else {
                    c0196i.f3299A = 2;
                    c0196i.f3317s.invalidate();
                    return;
                }
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f1426a) {
            case 0:
                k kVar = (k) this.c;
                kVar.f1464u.a(0, false);
                kVar.f1463t = 1;
                kVar.f1457n = animator;
                this.f1427b = false;
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
