package O2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class j extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1436a;

    /* renamed from: b, reason: collision with root package name */
    public float f1437b;
    public float c;
    public final /* synthetic */ m d;

    public j(m mVar) {
        this.d = mVar;
    }

    public abstract float a();

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float f4 = (int) this.c;
        V2.g gVar = this.d.f1447b;
        if (gVar != null) {
            gVar.h(f4);
        }
        this.f1436a = false;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z4 = this.f1436a;
        m mVar = this.d;
        if (!z4) {
            V2.g gVar = mVar.f1447b;
            this.f1437b = gVar == null ? 0.0f : gVar.f1880o.f1864m;
            this.c = a();
            this.f1436a = true;
        }
        float f4 = this.f1437b;
        float animatedFraction = (int) ((valueAnimator.getAnimatedFraction() * (this.c - f4)) + f4);
        V2.g gVar2 = mVar.f1447b;
        if (gVar2 != null) {
            gVar2.h(animatedFraction);
        }
    }
}
