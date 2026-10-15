package M;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class d implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1119a;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f4) {
        switch (this.f1119a) {
            case 0:
            case 2:
            default:
                float f5 = f4 - 1.0f;
                return (f5 * f5 * f5 * f5 * f5) + 1.0f;
            case 1:
                return f4 * f4 * f4 * f4 * f4;
        }
    }
}
