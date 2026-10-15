package W2;

import android.animation.ValueAnimator;
import android.os.Handler;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2025a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f2026b;

    public b(l lVar, int i4) {
        this.f2025a = 2;
        this.f2026b = lVar;
    }

    public /* synthetic */ b(l lVar, int i4, byte b4) {
        this.f2025a = i4;
        this.f2026b = lVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i4 = this.f2025a;
        l lVar = this.f2026b;
        switch (i4) {
            case 0:
                lVar.c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lVar.c.setScaleX(floatValue);
                lVar.c.setScaleY(floatValue);
                return;
            case 2:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                Handler handler = l.f2040n;
                lVar.c.setTranslationY(intValue);
                return;
            default:
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                Handler handler2 = l.f2040n;
                lVar.c.setTranslationY(intValue2);
                return;
        }
    }
}
