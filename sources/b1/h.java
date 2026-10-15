package b1;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import o2.AbstractC1895f;
import p1.i0;
import q1.AbstractC1954i;
import q1.AbstractC1955j;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class h implements e {

    /* renamed from: o, reason: collision with root package name */
    public i0 f3486o;

    /* renamed from: p, reason: collision with root package name */
    public Paint f3487p;

    /* renamed from: q, reason: collision with root package name */
    public Drawable f3488q;

    /* renamed from: r, reason: collision with root package name */
    public float f3489r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f3490s;

    @Override // b1.e
    public final void j(Canvas canvas) {
        float f4;
        Drawable drawable = this.f3488q;
        i0 i0Var = this.f3486o;
        boolean z4 = i0Var.f14547c0;
        Paint paint = this.f3487p;
        paint.setColor(z4 ? AbstractC1955j.f14680h : AbstractC1955j.f14678f);
        float f5 = i0Var.f14544Z.c;
        if (this.f3490s) {
            if (z4) {
                f4 = 1.0f;
                float G3 = i0Var.G();
                float F2 = i0Var.F();
                int i4 = (int) (G3 / 3.0f);
                float f6 = i4;
                AbstractC1954i.d(canvas, AbstractC1895f.q(i0Var.f14549e0 * f4 * 1000.0f), G3 / 2.0f, F2 - (F2 / 5.0f), Paint.Align.LEFT);
                canvas.save();
                float f7 = (int) ((G3 - f6) / 2.0f);
                canvas.translate(f7, 1.5f * f7);
                canvas.drawArc(0.0f, 0.0f, f6, f6, 0.0f, -180.0f, false, paint);
                int i5 = i4 / 2;
                int i6 = (int) (i5 / this.f3489r);
                drawable.setBounds(-i5, (-i6) / 2, 0, i6 / 2);
                float f8 = f6 / 2.0f;
                canvas.translate(f8, f8);
                canvas.rotate(f4 * 180.0f);
                drawable.draw(canvas);
                canvas.restore();
            }
        } else if (z4) {
            f5 = 1.0f - f5;
        }
        f4 = f5;
        float G32 = i0Var.G();
        float F22 = i0Var.F();
        int i42 = (int) (G32 / 3.0f);
        float f62 = i42;
        AbstractC1954i.d(canvas, AbstractC1895f.q(i0Var.f14549e0 * f4 * 1000.0f), G32 / 2.0f, F22 - (F22 / 5.0f), Paint.Align.LEFT);
        canvas.save();
        float f72 = (int) ((G32 - f62) / 2.0f);
        canvas.translate(f72, 1.5f * f72);
        canvas.drawArc(0.0f, 0.0f, f62, f62, 0.0f, -180.0f, false, paint);
        int i52 = i42 / 2;
        int i62 = (int) (i52 / this.f3489r);
        drawable.setBounds(-i52, (-i62) / 2, 0, i62 / 2);
        float f82 = f62 / 2.0f;
        canvas.translate(f82, f82);
        canvas.rotate(f4 * 180.0f);
        drawable.draw(canvas);
        canvas.restore();
    }
}
