package V2;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class p extends r {

    /* renamed from: h, reason: collision with root package name */
    public static final RectF f1926h = new RectF();

    /* renamed from: b, reason: collision with root package name */
    public final float f1927b;
    public final float c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final float f1928e;

    /* renamed from: f, reason: collision with root package name */
    public float f1929f;

    /* renamed from: g, reason: collision with root package name */
    public float f1930g;

    public p(float f4, float f5, float f6, float f7) {
        this.f1927b = f4;
        this.c = f5;
        this.d = f6;
        this.f1928e = f7;
    }

    @Override // V2.r
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f1932a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        float f4 = this.d;
        float f5 = this.f1928e;
        RectF rectF = f1926h;
        rectF.set(this.f1927b, this.c, f4, f5);
        path.arcTo(rectF, this.f1929f, this.f1930g, false);
        path.transform(matrix);
    }
}
