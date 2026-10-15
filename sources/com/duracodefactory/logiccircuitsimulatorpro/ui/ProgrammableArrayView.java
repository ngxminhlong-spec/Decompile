package com.duracodefactory.logiccircuitsimulatorpro.ui;

import G2.a;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.Scroller;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import java.lang.reflect.Array;
import o1.C1834J;
import o1.C1835K;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class ProgrammableArrayView extends View {

    /* renamed from: A, reason: collision with root package name */
    public final Paint f3684A;

    /* renamed from: B, reason: collision with root package name */
    public final Paint f3685B;

    /* renamed from: C, reason: collision with root package name */
    public final Paint f3686C;

    /* renamed from: D, reason: collision with root package name */
    public final Paint f3687D;

    /* renamed from: E, reason: collision with root package name */
    public final int f3688E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f3689F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f3690G;

    /* renamed from: H, reason: collision with root package name */
    public boolean[][] f3691H;

    /* renamed from: o, reason: collision with root package name */
    public final ScaleGestureDetector f3692o;

    /* renamed from: p, reason: collision with root package name */
    public final GestureDetector f3693p;

    /* renamed from: q, reason: collision with root package name */
    public float f3694q;

    /* renamed from: r, reason: collision with root package name */
    public final Scroller f3695r;

    /* renamed from: s, reason: collision with root package name */
    public final ValueAnimator f3696s;

    /* renamed from: t, reason: collision with root package name */
    public float f3697t;

    /* renamed from: u, reason: collision with root package name */
    public float f3698u;

    /* renamed from: v, reason: collision with root package name */
    public float f3699v;

    /* renamed from: w, reason: collision with root package name */
    public float f3700w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f3701x;
    public float y;

    /* renamed from: z, reason: collision with root package name */
    public float f3702z;

    public ProgrammableArrayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3694q = 1.0f;
        this.y = 0.3f;
        this.f3702z = 2.0f;
        this.f3693p = new GestureDetector(context, new C1834J(this, 0));
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, new C1835K(this, 0));
        this.f3692o = scaleGestureDetector;
        scaleGestureDetector.setQuickScaleEnabled(false);
        this.f3695r = new Scroller(getContext());
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f3696s = ofFloat;
        ofFloat.addUpdateListener(new a(5, this));
        setLayerType(2, null);
        setNestedScrollingEnabled(true);
        Paint paint = new Paint();
        this.f3684A = paint;
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        paint.setStyle(style);
        this.f3684A.setColor(context.getResources().getColor(R.color.icons_dark));
        this.f3684A.setTextSize(context.getResources().getDimensionPixelSize(R.dimen.pla_program_text_size));
        this.f3684A.setTextAlign(Paint.Align.CENTER);
        Paint paint2 = new Paint();
        this.f3685B = paint2;
        Paint.Style style2 = Paint.Style.STROKE;
        paint2.setStyle(style2);
        this.f3685B.setColor(context.getResources().getColor(R.color.icons_dark));
        this.f3685B.setStrokeWidth(context.getResources().getDimensionPixelSize(R.dimen.pla_program_dots_stroke_width));
        Paint paint3 = new Paint();
        this.f3686C = paint3;
        paint3.setStyle(style2);
        this.f3686C.setColor(context.getResources().getColor(R.color.separator_light));
        this.f3686C.setStrokeWidth(context.getResources().getDimensionPixelSize(R.dimen.pla_program_dots_stroke_width));
        Paint paint4 = new Paint();
        this.f3687D = paint4;
        paint4.setStyle(style);
        this.f3687D.setColor(context.getResources().getColor(R.color.switch_active));
        this.f3688E = context.getResources().getDimensionPixelSize(R.dimen.pla_program_dot_size);
        this.f3691H = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, 1, 1);
    }

    public final void a(boolean[][] zArr, boolean z4) {
        this.f3691H = zArr;
        this.f3689F = z4;
        float width = (getWidth() / (this.f3691H[0].length + 1)) / this.f3688E;
        this.f3694q = width;
        this.y = width;
        this.f3702z = width * 2.0f;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        float f4 = this.f3694q;
        canvas2.scale(f4, f4);
        boolean[][] zArr = this.f3691H;
        int length = zArr[0].length;
        int length2 = zArr.length;
        float descent = ((this.f3684A.descent() - this.f3684A.ascent()) / 2.0f) + (this.f3688E / 2.0f);
        canvas2.translate(this.f3688E / 2.0f, descent);
        int i4 = 0;
        while (i4 < length) {
            int i5 = i4 + 1;
            int i6 = this.f3688E;
            int i7 = i5 * i6;
            int i8 = length;
            if ((i7 - (i6 * 0.3d)) * this.f3694q >= getScrollX()) {
                if (this.f3689F) {
                    int i9 = i4 / 2;
                    char c = i9 == 0 ? 'A' : i9 == 1 ? 'B' : i9 == 2 ? 'C' : i9 == 3 ? 'D' : i9 == 4 ? 'E' : i9 == 5 ? 'F' : i9 == 6 ? 'G' : i9 == 7 ? 'H' : ' ';
                    if (i4 % 2 != 0) {
                        float f5 = i7;
                        float scrollY = getScrollY() / this.f3694q;
                        float f6 = this.f3688E;
                        canvas2.drawLine(f5 - (this.f3688E * 0.18f), scrollY - (f6 * 0.5f), (f6 * 0.18f) + f5, (getScrollY() / this.f3694q) - (this.f3688E * 0.5f), this.f3685B);
                    }
                    canvas2.drawText(String.valueOf(c), i7, getScrollY() / this.f3694q, this.f3684A);
                } else {
                    canvas2.drawText(U.a.i("O", i4), i7, getScrollY() / this.f3694q, this.f3684A);
                }
            }
            i4 = i5;
            length = i8;
        }
        int i10 = 0;
        while (i10 < length2) {
            int i11 = i10 + 1;
            int i12 = this.f3688E;
            int i13 = i11 * i12;
            if ((i13 - (i12 * 0.3d)) * this.f3694q >= getScrollY()) {
                canvas2.drawText(U.a.i("", i10), getScrollX() / this.f3694q, i13, this.f3684A);
            }
            i10 = i11;
        }
        float f7 = this.f3688E;
        canvas2.translate(f7 / 2.0f, f7 - descent);
        int i14 = 0;
        while (i14 < this.f3691H.length) {
            int i15 = 0;
            while (i15 < this.f3691H[i14].length) {
                int i16 = this.f3688E;
                int i17 = i15 * i16;
                int i18 = i14 * i16;
                if (((i16 * 0.3d) + i18) * this.f3694q >= getScrollY()) {
                    if (((this.f3688E * 0.3d) + i17) * this.f3694q >= getScrollX()) {
                        if (this.f3691H[i14][i15]) {
                            int i19 = this.f3688E;
                            canvas2.drawRect(i17, i18, i17 + i19, i19 + i18, this.f3687D);
                        }
                        int i20 = this.f3688E;
                        canvas.drawRect(i17, i18, i17 + i20, i18 + i20, this.f3686C);
                    }
                }
                i15++;
                canvas2 = canvas;
            }
            i14++;
            canvas2 = canvas;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        float length = (i4 / (this.f3691H[0].length + 1)) / this.f3688E;
        this.f3694q = length;
        this.y = length;
        this.f3702z = length * 2.0f;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        this.f3693p.onTouchEvent(motionEvent);
        this.f3692o.onTouchEvent(motionEvent);
        motionEvent.getX();
        getScrollX();
        motionEvent.getY();
        getScrollY();
        if (motionEvent.getAction() == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
            float x4 = motionEvent.getX();
            this.f3699v = x4;
            this.f3697t = x4;
            float y = motionEvent.getY();
            this.f3700w = y;
            this.f3698u = y;
            this.f3695r.abortAnimation();
            this.f3696s.cancel();
            z4 = true;
        } else {
            if (motionEvent.getAction() == 2) {
                if (!this.f3701x) {
                    scrollBy((int) (this.f3699v - motionEvent.getX()), (int) (this.f3700w - motionEvent.getY()));
                }
                this.f3699v = motionEvent.getX();
                this.f3700w = motionEvent.getY();
            } else if (motionEvent.getAction() == 1) {
                getParent().requestDisallowInterceptTouchEvent(false);
                this.f3701x = false;
            }
            z4 = false;
        }
        invalidate();
        return z4 || super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void scrollTo(int i4, int i5) {
        int length = ((int) ((this.f3694q * this.f3688E) * (this.f3691H[0].length + 1))) - getWidth();
        if (i4 > length) {
            i4 = length;
        }
        int length2 = ((int) ((this.f3694q * this.f3688E) * (this.f3691H.length + 1))) - getHeight();
        if (i5 <= length2) {
            length2 = i5;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        int i6 = length2 >= 0 ? length2 : 0;
        int i7 = i5 - i6;
        if (i7 != 0) {
            startNestedScroll(2);
            dispatchNestedScroll(0, 0, 0, i7, null);
            stopNestedScroll();
        }
        super.scrollTo(i4, i6);
    }
}
