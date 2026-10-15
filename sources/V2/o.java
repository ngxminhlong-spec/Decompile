package V2;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class o extends s {

    /* renamed from: b, reason: collision with root package name */
    public final q f1925b;
    public final float c;
    public final float d;

    public o(q qVar, float f4, float f5) {
        this.f1925b = qVar;
        this.c = f4;
        this.d = f5;
    }

    @Override // V2.s
    public final void a(Matrix matrix, U2.a aVar, int i4, Canvas canvas) {
        q qVar = this.f1925b;
        float f4 = qVar.c;
        float f5 = this.d;
        float f6 = qVar.f1931b;
        float f7 = this.c;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f4 - f5, f6 - f7), 0.0f);
        Matrix matrix2 = new Matrix(matrix);
        matrix2.preTranslate(f7, f5);
        matrix2.preRotate(b());
        aVar.getClass();
        rectF.bottom += i4;
        rectF.offset(0.0f, -i4);
        int i5 = aVar.f1817f;
        int[] iArr = U2.a.f1810i;
        iArr[0] = i5;
        iArr[1] = aVar.f1816e;
        iArr[2] = aVar.d;
        Paint paint = aVar.c;
        float f8 = rectF.left;
        paint.setShader(new LinearGradient(f8, rectF.top, f8, rectF.bottom, iArr, U2.a.f1811j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        q qVar = this.f1925b;
        return (float) Math.toDegrees(Math.atan((qVar.c - this.d) / (qVar.f1931b - this.c)));
    }
}
