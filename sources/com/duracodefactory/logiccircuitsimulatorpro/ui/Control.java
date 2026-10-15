package com.duracodefactory.logiccircuitsimulatorpro.ui;

import C0.Q;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.duracodefactory.logiccircuitsimulatorpro.R;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class Control extends FrameLayout {

    /* renamed from: A, reason: collision with root package name */
    public boolean f3596A;

    /* renamed from: o, reason: collision with root package name */
    public final int f3597o;

    /* renamed from: p, reason: collision with root package name */
    public final int f3598p;

    /* renamed from: q, reason: collision with root package name */
    public final int f3599q;

    /* renamed from: r, reason: collision with root package name */
    public final int f3600r;

    /* renamed from: s, reason: collision with root package name */
    public final int f3601s;

    /* renamed from: t, reason: collision with root package name */
    public final int f3602t;

    /* renamed from: u, reason: collision with root package name */
    public final int f3603u;

    /* renamed from: v, reason: collision with root package name */
    public final String f3604v;

    /* renamed from: w, reason: collision with root package name */
    public final float f3605w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f3606x;
    public boolean y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f3607z;

    public Control(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3606x = true;
        this.y = false;
        this.f3607z = false;
        this.f3596A = false;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, Q.f247b, 0, 0);
        this.f3597o = obtainStyledAttributes.getColor(4, 0);
        this.f3598p = obtainStyledAttributes.getColor(1, 0);
        this.f3599q = obtainStyledAttributes.getColor(3, 0);
        this.f3601s = obtainStyledAttributes.getColor(6, 0);
        this.f3600r = obtainStyledAttributes.getColor(0, 0);
        this.f3602t = obtainStyledAttributes.getResourceId(2, 0);
        this.f3603u = obtainStyledAttributes.getResourceId(5, 0);
        this.f3604v = obtainStyledAttributes.getString(7);
        this.f3605w = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        obtainStyledAttributes.recycle();
    }

    public final void a() {
        try {
            findViewById(R.id.icon).getBackground().mutate().setTint(this.y ? this.f3601s : this.f3606x ? this.f3599q : this.f3600r);
            ((TextView) findViewById(R.id.text)).setTextColor(this.y ? this.f3601s : this.f3606x ? this.f3597o : this.f3598p);
            findViewById(R.id.background_select).setVisibility(this.y ? 0 : 8);
            View findViewById = findViewById(R.id.pro_label);
            if (findViewById != null) {
                findViewById.setVisibility(this.f3596A ? 0 : 8);
            }
        } catch (Throwable unused) {
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        findViewById(R.id.icon).setBackgroundResource(this.f3602t);
        findViewById(R.id.background_select).setBackgroundResource(this.f3603u);
        ((TextView) findViewById(R.id.text)).setText(this.f3604v);
        ((TextView) findViewById(R.id.text)).setTextSize(0, this.f3605w);
        if (this.f3607z) {
            setForeground(null);
        }
        a();
    }

    public void setPro(boolean z4) {
        if (this.f3596A != z4) {
            this.f3596A = z4;
            a();
        }
    }

    public void setSelectedControl(boolean z4) {
        if (this.y != z4) {
            this.y = z4;
            a();
        }
    }
}
