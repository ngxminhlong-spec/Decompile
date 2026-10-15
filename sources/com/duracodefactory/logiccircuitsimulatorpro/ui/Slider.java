package com.duracodefactory.logiccircuitsimulatorpro.ui;

import C0.Q;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import o1.InterfaceC1837M;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class Slider extends FrameLayout {

    /* renamed from: o, reason: collision with root package name */
    public View f3704o;

    /* renamed from: p, reason: collision with root package name */
    public int f3705p;

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC1837M f3706q;

    /* renamed from: r, reason: collision with root package name */
    public final int f3707r;

    public Slider(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, Q.d, 0, 0);
        this.f3707r = obtainStyledAttributes.getInteger(8, 1);
        obtainStyledAttributes.recycle();
    }

    public final void a() {
        float translationX = this.f3704o.getTranslationX() + (this.f3704o.getWidth() / 2);
        if ((this.f3704o.getWidth() / 2) + translationX >= getWidth() - 2) {
            translationX = getWidth();
        }
        if (translationX - (this.f3704o.getWidth() / 2) <= 2.0f) {
            translationX = 0.0f;
        }
        this.f3705p = Math.round(translationX / (getWidth() / (this.f3707r - 1)));
    }

    public final void b() {
        int width = (int) ((this.f3705p * (getWidth() / (this.f3707r - 1))) - (this.f3704o.getWidth() / 2));
        if (width < 0) {
            width = 0;
        }
        if (width > getWidth() - this.f3704o.getWidth()) {
            width = getWidth() - this.f3704o.getWidth();
        }
        this.f3704o.setTranslationX(width);
    }

    public int getSelectedPos() {
        return this.f3705p;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f3704o = findViewById(R.id.handle);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        b();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 2) {
            float x4 = motionEvent.getX() - this.f3704o.getWidth();
            if (x4 < 0.0f) {
                x4 = 0.0f;
            } else if (x4 > getWidth() - this.f3704o.getWidth()) {
                x4 = getWidth() - this.f3704o.getWidth();
            }
            this.f3704o.setTranslationX(x4);
            requestDisallowInterceptTouchEvent(true);
            if (motionEvent.getActionMasked() == 2) {
                a();
                this.f3706q.a();
            }
        } else if (motionEvent.getActionMasked() == 1) {
            a();
            b();
            this.f3706q.a();
            return true;
        }
        return true;
    }

    public void setOnChangedListener(InterfaceC1837M interfaceC1837M) {
        this.f3706q = interfaceC1837M;
    }

    public void setSelectedPos(int i4) {
        this.f3705p = i4;
        invalidate();
    }
}
