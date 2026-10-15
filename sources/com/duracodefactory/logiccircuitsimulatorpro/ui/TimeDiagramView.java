package com.duracodefactory.logiccircuitsimulatorpro.ui;

import G2.a;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.Scroller;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import java.util.ArrayList;
import m1.c;
import o1.C1834J;
import o1.C1835K;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class TimeDiagramView extends View {
    public static final /* synthetic */ int N = 0;

    /* renamed from: A, reason: collision with root package name */
    public float f3738A;

    /* renamed from: B, reason: collision with root package name */
    public ArrayList f3739B;

    /* renamed from: C, reason: collision with root package name */
    public final int f3740C;

    /* renamed from: D, reason: collision with root package name */
    public final Paint f3741D;

    /* renamed from: E, reason: collision with root package name */
    public final Paint f3742E;

    /* renamed from: F, reason: collision with root package name */
    public final Paint f3743F;

    /* renamed from: G, reason: collision with root package name */
    public final Paint f3744G;

    /* renamed from: H, reason: collision with root package name */
    public float f3745H;

    /* renamed from: I, reason: collision with root package name */
    public float f3746I;

    /* renamed from: J, reason: collision with root package name */
    public float f3747J;

    /* renamed from: K, reason: collision with root package name */
    public final int f3748K;

    /* renamed from: L, reason: collision with root package name */
    public String f3749L;

    /* renamed from: M, reason: collision with root package name */
    public final int[] f3750M;

    /* renamed from: o, reason: collision with root package name */
    public final ScaleGestureDetector f3751o;

    /* renamed from: p, reason: collision with root package name */
    public final GestureDetector f3752p;

    /* renamed from: q, reason: collision with root package name */
    public float f3753q;

    /* renamed from: r, reason: collision with root package name */
    public final Scroller f3754r;

    /* renamed from: s, reason: collision with root package name */
    public final ValueAnimator f3755s;

    /* renamed from: t, reason: collision with root package name */
    public float f3756t;

    /* renamed from: u, reason: collision with root package name */
    public float f3757u;

    /* renamed from: v, reason: collision with root package name */
    public float f3758v;

    /* renamed from: w, reason: collision with root package name */
    public float f3759w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f3760x;
    public boolean y;

    /* renamed from: z, reason: collision with root package name */
    public final float f3761z;

    public TimeDiagramView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3753q = 1.0f;
        this.f3761z = 1.0f;
        this.f3738A = 2.0f;
        this.f3739B = new ArrayList();
        this.f3750M = new int[2];
        int i4 = 1;
        this.f3752p = new GestureDetector(context, new C1834J(this, i4));
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, new C1835K(this, i4));
        this.f3751o = scaleGestureDetector;
        scaleGestureDetector.setQuickScaleEnabled(true);
        this.f3754r = new Scroller(getContext());
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f3755s = ofFloat;
        ofFloat.addUpdateListener(new a(6, this));
        setLayerType(2, null);
        this.f3740C = getResources().getDimensionPixelSize(R.dimen.timediagram_view_entry_height);
        Paint paint = new Paint();
        this.f3741D = paint;
        paint.setTextSize(getResources().getDimensionPixelSize(R.dimen.timediagram_view_entry_text_size));
        Paint paint2 = this.f3741D;
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        paint2.setStyle(style);
        this.f3741D.setColor(context.getResources().getColor(R.color.light_on_accent));
        this.f3741D.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
        Paint paint3 = this.f3741D;
        Paint.Align align = Paint.Align.CENTER;
        paint3.setTextAlign(align);
        Paint paint4 = new Paint();
        this.f3742E = paint4;
        paint4.setTextSize(getResources().getDimensionPixelSize(R.dimen.timediagram_view_time_size));
        this.f3742E.setStyle(style);
        this.f3742E.setColor(context.getResources().getColor(R.color.icons_dark));
        this.f3742E.setTextAlign(align);
        Paint paint5 = new Paint();
        this.f3743F = paint5;
        Paint.Style style2 = Paint.Style.STROKE;
        paint5.setStyle(style2);
        this.f3743F.setStrokeWidth(getResources().getDimensionPixelSize(R.dimen.timediagram_view_entry_stroke_width));
        Paint paint6 = this.f3743F;
        Paint.Cap cap = Paint.Cap.ROUND;
        paint6.setStrokeCap(cap);
        Paint paint7 = new Paint();
        this.f3744G = paint7;
        paint7.setStyle(style2);
        this.f3744G.setStrokeWidth(getResources().getDimensionPixelSize(R.dimen.timediagram_view_entry_separator_stroke_width));
        this.f3744G.setStrokeCap(cap);
        this.f3744G.setColor(getResources().getColor(R.color.separator_light));
        this.f3748K = getResources().getDimensionPixelSize(R.dimen.timediagram_view_entry_width_lines_size);
    }

    public final void a(ArrayList arrayList, int i4, float f4, String str) {
        this.f3739B = arrayList;
        this.f3745H = 0.0f;
        this.f3747J = f4;
        float f5 = i4;
        this.f3746I = f5;
        this.f3738A = Math.max(5.0f, f5 / 100.0f);
        this.f3753q = 1.0f;
        int i5 = 0;
        scrollTo(0, 0);
        ArrayList arrayList2 = this.f3739B;
        int size = arrayList2.size();
        while (i5 < size) {
            Object obj = arrayList2.get(i5);
            i5++;
            c cVar = (c) obj;
            String str2 = cVar.f13989b;
            ArrayList arrayList3 = cVar.f13990e;
            float measureText = this.f3741D.measureText(str2) * 1.5f;
            if (measureText > this.f3745H) {
                this.f3745H = measureText;
            }
            if (arrayList3.size() > this.f3746I) {
                this.f3746I = arrayList3.size();
            }
        }
        this.f3749L = str;
        invalidate();
    }

    public final void b(boolean z4) {
        float f4 = this.f3753q;
        float f5 = (z4 ? 1.1f : 0.9f) * f4;
        this.f3753q = f5;
        float f6 = this.f3761z;
        if (f5 < f6) {
            this.f3753q = f6;
        } else {
            float f7 = this.f3738A;
            if (f5 > f7) {
                this.f3753q = f7;
            }
        }
        scrollBy((int) ((((this.f3753q / f4) * (getScrollX() + r4)) - getScrollX()) - (getWidth() / 2)), 0);
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f4;
        float f5;
        String str;
        super.onDraw(canvas);
        float width = ((this.f3753q * getWidth()) - (this.f3745H * 1.1f)) / this.f3746I;
        for (int i4 = 0; i4 <= this.f3739B.size(); i4++) {
            float strokeWidth = (this.f3740C * i4) - (this.f3744G.getStrokeWidth() / 2.0f);
            if (strokeWidth < 0.0f) {
                strokeWidth = this.f3744G.getStrokeWidth() / 2.0f;
            }
            float f6 = strokeWidth;
            float scrollX = getScrollX();
            float f7 = this.f3745H;
            canvas.drawLine((f7 * 1.1f) + scrollX, f6, (this.f3746I * width) + f7, f6, this.f3744G);
        }
        this.f3743F.setStyle(Paint.Style.FILL);
        ArrayList arrayList = this.f3739B;
        int size = arrayList.size();
        int i5 = 0;
        int i6 = 0;
        while (i5 < size) {
            int i7 = i5 + 1;
            this.f3743F.setColor(((c) arrayList.get(i5)).c);
            float scrollX2 = getScrollX();
            float f8 = (i6 * r1) + (this.f3740C / 2.3f);
            float scrollX3 = getScrollX();
            float f9 = this.f3745H;
            int i8 = this.f3740C;
            canvas.drawRoundRect(scrollX2, f8, scrollX3 + f9, (i6 * i8) + i8, f9 / 15.0f, f9 / 15.0f, this.f3743F);
            i6++;
            i5 = i7;
        }
        Canvas canvas2 = canvas;
        ArrayList arrayList2 = this.f3739B;
        int size2 = arrayList2.size();
        int i9 = 0;
        int i10 = 0;
        while (i10 < size2) {
            Object obj = arrayList2.get(i10);
            i10++;
            canvas2.drawText(((c) obj).f13989b, (this.f3745H / 2.0f) + getScrollX(), (this.f3740C * 0.8f) + (i9 * r7), this.f3741D);
            i9++;
        }
        canvas2.translate(this.f3745H * 1.1f, 0.0f);
        int i11 = (int) (this.f3748K / width);
        int i12 = i11 == 0 ? 1 : i11;
        int i13 = 0;
        while (true) {
            float f10 = i13;
            if (f10 >= this.f3746I) {
                break;
            }
            float f11 = f10 * width;
            if (f11 >= getScrollX()) {
                float f12 = ((i12 * width) / 2.0f) + f11;
                float height = getHeight() - (this.f3740C / 2);
                canvas2.drawLine(f12, 0.0f, f12, height, this.f3744G);
                canvas2 = canvas;
                canvas2.drawLine(f11, 0.0f, f11, height + (this.f3740C / 5.0f), this.f3744G);
                float f13 = f10 * this.f3747J;
                if (f13 >= 100.0f) {
                    f13 /= 1000.0f;
                    str = "ms";
                } else {
                    str = "u";
                }
                if (f13 >= 100.0f) {
                    f13 /= 1000.0f;
                    if (f13 >= 60.0f) {
                        f13 /= 60.0f;
                        str = "m";
                    } else {
                        str = "s";
                    }
                }
                canvas2.drawText((Math.round(f13 * 100.0f) / 100.0f) + str, f11, getHeight(), this.f3742E);
            }
            i13 += i12;
        }
        ArrayList arrayList3 = this.f3739B;
        int size3 = arrayList3.size();
        int i14 = 0;
        int i15 = 0;
        while (i14 < size3) {
            int i16 = i14 + 1;
            c cVar = (c) arrayList3.get(i14);
            this.f3743F.setColor(cVar.c);
            ArrayList arrayList4 = cVar.f13990e;
            int size4 = arrayList4.size();
            int i17 = 0;
            int i18 = 0;
            boolean z4 = false;
            boolean z5 = false;
            while (i17 < size4) {
                int i19 = i17 + 1;
                Integer num = (Integer) arrayList4.get(i17);
                float f14 = i18 * width;
                float max = Math.max(f14, (this.f3745H / 10.0f) + getScrollX());
                float intValue = ((num.intValue() + 1) * width) + f14;
                if (intValue > max) {
                    int i20 = this.f3740C;
                    float f15 = (i20 * 0.2f) + (i15 * i20);
                    float f16 = ((i15 + 1) * i20) - (i20 * 0.2f);
                    if (!z4) {
                        f4 = f16;
                        f5 = f15;
                        if (num.intValue() == 0) {
                            z5 = !z5;
                            canvas2 = canvas;
                            z4 = true;
                            i17 = i19;
                        } else {
                            z4 = true;
                        }
                    } else if (i18 > 0) {
                        f4 = f16;
                        f5 = f15;
                        canvas2.drawLine(f14, f5, f14, f4, this.f3743F);
                    } else {
                        f4 = f16;
                        f5 = f15;
                    }
                    if (z5) {
                        canvas.drawLine(max, f5, intValue, f5, this.f3743F);
                    } else {
                        canvas.drawLine(max, f4, intValue, f4, this.f3743F);
                    }
                }
                z5 = !z5;
                i18 += num.intValue() + 1;
                canvas2 = canvas;
                i17 = i19;
            }
            i15++;
            canvas2 = canvas;
            i14 = i16;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i5) {
        setMeasuredDimension(View.MeasureSpec.getSize(i4), (int) ((this.f3740C * 0.5f) + (this.f3739B.size() * this.f3740C)));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        this.f3752p.onTouchEvent(motionEvent);
        this.f3751o.onTouchEvent(motionEvent);
        motionEvent.getX();
        getScrollX();
        motionEvent.getY();
        getScrollY();
        if (motionEvent.getAction() == 0) {
            int[] iArr = this.f3750M;
            iArr[0] = 0;
            iArr[1] = 0;
            getParent().requestDisallowInterceptTouchEvent(true);
            float x4 = motionEvent.getX();
            this.f3758v = x4;
            this.f3756t = x4;
            float y = motionEvent.getY();
            this.f3759w = y;
            this.f3757u = y;
            this.f3754r.abortAnimation();
            this.f3755s.cancel();
            z4 = true;
        } else {
            if (motionEvent.getAction() == 2) {
                if (!this.f3760x) {
                    scrollBy((int) (this.f3758v - motionEvent.getX()), (int) (this.f3759w - motionEvent.getY()));
                }
                this.f3758v = motionEvent.getX();
                this.f3759w = motionEvent.getY();
            } else if (motionEvent.getAction() == 1) {
                getParent().requestDisallowInterceptTouchEvent(false);
                this.f3760x = false;
            }
            z4 = false;
        }
        invalidate();
        return z4 || super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void scrollTo(int i4, int i5) {
        if (i4 < 0) {
            i4 = 0;
        }
        if (i4 > (getWidth() * this.f3753q) - getWidth()) {
            i4 = (int) ((getWidth() * this.f3753q) - getWidth());
        }
        super.scrollTo(i4, 0);
    }

    public void setScale(float f4) {
        this.f3753q = f4;
        invalidate();
    }
}
