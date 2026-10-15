package V2;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class n extends s {

    /* renamed from: b, reason: collision with root package name */
    public final p f1924b;

    public n(p pVar) {
        this.f1924b = pVar;
    }

    @Override // V2.s
    public final void a(Matrix matrix, U2.a aVar, int i4, Canvas canvas) {
        float f4;
        p pVar = this.f1924b;
        float f5 = pVar.f1929f;
        float f6 = pVar.f1930g;
        RectF rectF = new RectF(pVar.f1927b, pVar.c, pVar.d, pVar.f1928e);
        Paint paint = aVar.f1815b;
        boolean z4 = f6 < 0.0f;
        Path path = aVar.f1818g;
        int[] iArr = U2.a.f1812k;
        if (z4) {
            iArr[0] = 0;
            iArr[1] = aVar.f1817f;
            iArr[2] = aVar.f1816e;
            iArr[3] = aVar.d;
            f4 = 0.0f;
        } else {
            path.rewind();
            f4 = 0.0f;
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f5, f6);
            path.close();
            float f7 = -i4;
            rectF.inset(f7, f7);
            iArr[0] = 0;
            iArr[1] = aVar.d;
            iArr[2] = aVar.f1816e;
            iArr[3] = aVar.f1817f;
        }
        float width = rectF.width() / 2.0f;
        if (width <= f4) {
            return;
        }
        float f8 = 1.0f - (i4 / width);
        float[] fArr = U2.a.f1813l;
        fArr[1] = f8;
        fArr[2] = ((1.0f - f8) / 2.0f) + f8;
        paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        if (!z4) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, aVar.f1819h);
        }
        canvas.drawArc(rectF, f5, f6, true, paint);
        canvas.restore();
    }
}
