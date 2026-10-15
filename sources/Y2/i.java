package Y2;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class i extends V2.g {

    /* renamed from: L, reason: collision with root package name */
    public final Paint f2165L;

    /* renamed from: M, reason: collision with root package name */
    public final RectF f2166M;
    public int N;

    public i(V2.k kVar) {
        super(kVar == null ? new V2.k() : kVar);
        Paint paint = new Paint(1);
        this.f2165L = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f2166M = new RectF();
    }

    @Override // V2.g, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        Drawable.Callback callback = getCallback();
        if (callback instanceof View) {
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, null);
            }
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            this.N = canvas2.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null);
        }
        super.draw(canvas2);
        canvas2.drawRect(this.f2166M, this.f2165L);
        if (getCallback() instanceof View) {
            return;
        }
        canvas2.restoreToCount(this.N);
    }

    public final void m(float f4, float f5, float f6, float f7) {
        RectF rectF = this.f2166M;
        if (f4 == rectF.left && f5 == rectF.top && f6 == rectF.right && f7 == rectF.bottom) {
            return;
        }
        rectF.set(f4, f5, f6, f7);
        invalidateSelf();
    }
}
