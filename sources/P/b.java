package P;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class b implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f1471a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1472b;

    public b(float[] fArr) {
        this.f1471a = fArr;
        this.f1472b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f4) {
        if (f4 >= 1.0f) {
            return 1.0f;
        }
        if (f4 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f1471a;
        int min = Math.min((int) ((fArr.length - 1) * f4), fArr.length - 2);
        float f5 = this.f1472b;
        float f6 = (f4 - (min * f5)) / f5;
        float f7 = fArr[min];
        return n0.a.g(fArr[min + 1], f7, f6, f7);
    }
}
