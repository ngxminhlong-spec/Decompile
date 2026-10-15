package V2;

import android.graphics.Matrix;
import android.graphics.Path;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class q extends r {

    /* renamed from: b, reason: collision with root package name */
    public float f1931b;
    public float c;

    @Override // V2.r
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f1932a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f1931b, this.c);
        path.transform(matrix);
    }
}
