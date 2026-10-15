package C0;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class d0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f295a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f296b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f297e;

    public /* synthetic */ d0(int i4, int i5, int i6, View view, boolean z4) {
        this.f295a = i6;
        this.f296b = view;
        this.c = i4;
        this.d = i5;
        this.f297e = z4;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f4;
        float f5;
        switch (this.f295a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i4 = this.c;
                if (i4 > 0) {
                    f4 = (1.0f - floatValue) * i4;
                } else {
                    f4 = floatValue * this.d;
                }
                int i5 = (int) f4;
                View view = this.f296b;
                view.setPadding(0, i5, 0, 0);
                if (this.f297e || floatValue != 1.0f) {
                    return;
                }
                view.setVisibility(4);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i6 = this.c;
                if (i6 > 0) {
                    f5 = (1.0f - floatValue2) * i6;
                } else {
                    f5 = floatValue2 * this.d;
                }
                int i7 = (int) f5;
                View view2 = this.f296b;
                view2.setPadding(0, i7, 0, 0);
                if (this.f297e || floatValue2 != 1.0f) {
                    return;
                }
                view2.setVisibility(4);
                return;
        }
    }
}
