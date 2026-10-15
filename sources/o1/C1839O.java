package o1;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.duracodefactory.logiccircuitsimulatorpro.ui.StartupScreen;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: o1.O, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1839O implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14222a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f14223b;
    public final /* synthetic */ int c;
    public final /* synthetic */ View d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ StartupScreen f14224e;

    public /* synthetic */ C1839O(StartupScreen startupScreen, ViewGroup viewGroup, int i4, View view, int i5) {
        this.f14222a = i5;
        this.f14224e = startupScreen;
        this.f14223b = viewGroup;
        this.c = i4;
        this.d = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f14222a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f4 = this.c;
                ViewGroup viewGroup = this.f14223b;
                viewGroup.setTranslationX(f4 - (f4 * floatValue));
                viewGroup.setAlpha(floatValue);
                View view = this.d;
                view.setTranslationX((-r0) * floatValue);
                view.setAlpha(1.0f - floatValue);
                if (floatValue == 1.0f) {
                    view.setVisibility(8);
                    StartupScreen.c(this.f14224e);
                    return;
                }
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i4 = this.c;
                float f5 = 1.0f - floatValue2;
                ViewGroup viewGroup2 = this.f14223b;
                viewGroup2.setTranslationX((-i4) * f5);
                viewGroup2.setAlpha(floatValue2);
                View view2 = this.d;
                view2.setTranslationX(i4 * floatValue2);
                view2.setAlpha(f5);
                if (floatValue2 == 1.0f) {
                    view2.setVisibility(8);
                    StartupScreen.c(this.f14224e);
                    return;
                }
                return;
        }
    }
}
