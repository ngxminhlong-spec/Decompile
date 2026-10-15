package com.duracodefactory.logiccircuitsimulatorpro.ui;

import C0.Q;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import o1.C1836L;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class LoadingAnimation extends View {

    /* renamed from: o, reason: collision with root package name */
    public C1836L f3642o;

    /* renamed from: p, reason: collision with root package name */
    public final Paint f3643p;

    /* renamed from: q, reason: collision with root package name */
    public final float f3644q;

    /* renamed from: r, reason: collision with root package name */
    public long f3645r;

    /* renamed from: s, reason: collision with root package name */
    public long f3646s;

    public LoadingAnimation(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int color = context.getTheme().obtainStyledAttributes(attributeSet, Q.c, 0, 0).getColor(0, 0);
        Paint paint = new Paint();
        this.f3643p = paint;
        paint.setColor(color);
        this.f3643p.setStyle(Paint.Style.STROKE);
        this.f3643p.setStrokeWidth(context.getResources().getDimensionPixelSize(R.dimen.loading_sine_stroke_width));
        this.f3644q = 0.04f;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f3642o == null) {
            int height = (int) ((getHeight() / 2) - this.f3643p.getStrokeWidth());
            int width = getWidth();
            C1836L c1836l = new C1836L();
            this.f3642o = c1836l;
            c1836l.b(width / 100, width, height, (int) (width * 1.1f), this.f3644q);
        }
        float f4 = 0;
        canvas.translate(f4, getHeight() / 2);
        this.f3642o.a(canvas, this.f3643p, false);
        canvas.translate(f4, -r0);
        if (this.f3646s == 0) {
            this.f3646s = System.currentTimeMillis();
        }
        long currentTimeMillis = (System.currentTimeMillis() - this.f3646s) / 16;
        if (currentTimeMillis != this.f3645r) {
            this.f3645r = currentTimeMillis;
            C1836L c1836l2 = this.f3642o;
            c1836l2.f14215a += c1836l2.f14218f;
        }
        postInvalidateOnAnimation();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        if (i4 == i6 && i5 == i7) {
            return;
        }
        int strokeWidth = (int) ((i5 / 2) - this.f3643p.getStrokeWidth());
        C1836L c1836l = new C1836L();
        this.f3642o = c1836l;
        c1836l.b(i4 / 100, i4, strokeWidth, (int) (i4 * 1.1f), this.f3644q);
    }
}
