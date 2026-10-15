package Y2;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class f implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2158a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f2159b;

    public /* synthetic */ f(g gVar, int i4) {
        this.f2158a = i4;
        this.f2159b = gVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f2158a) {
            case 0:
                this.f2159b.c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar = this.f2159b;
                gVar.c.setScaleX(floatValue);
                gVar.c.setScaleY(floatValue);
                return;
        }
    }
}
