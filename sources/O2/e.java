package O2;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class e implements TypeEvaluator {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f1428a = new float[9];

    /* renamed from: b, reason: collision with root package name */
    public final float[] f1429b = new float[9];
    public final Matrix c = new Matrix();
    public final /* synthetic */ k d;

    public e(k kVar) {
        this.d = kVar;
    }

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f4, Object obj, Object obj2) {
        this.d.f1461r = f4;
        float[] fArr = this.f1428a;
        ((Matrix) obj).getValues(fArr);
        float[] fArr2 = this.f1429b;
        ((Matrix) obj2).getValues(fArr2);
        for (int i4 = 0; i4 < 9; i4++) {
            float f5 = fArr2[i4];
            float f6 = fArr[i4];
            fArr2[i4] = n0.a.g(f5, f6, f4, f6);
        }
        Matrix matrix = this.c;
        matrix.setValues(fArr2);
        return matrix;
    }
}
