package com.google.android.material.snackbar;

import B2.a;
import H.A;
import W2.m;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout implements m {

    /* renamed from: o, reason: collision with root package name */
    public TextView f12451o;

    /* renamed from: p, reason: collision with root package name */
    public Button f12452p;

    /* renamed from: q, reason: collision with root package name */
    public final int f12453q;

    /* renamed from: r, reason: collision with root package name */
    public int f12454r;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f157w);
        this.f12453q = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f12454r = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
    }

    public final boolean a(int i4, int i5, int i6) {
        boolean z4;
        if (i4 != getOrientation()) {
            setOrientation(i4);
            z4 = true;
        } else {
            z4 = false;
        }
        if (this.f12451o.getPaddingTop() == i5 && this.f12451o.getPaddingBottom() == i6) {
            return z4;
        }
        TextView textView = this.f12451o;
        WeakHashMap weakHashMap = A.f779a;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i5, textView.getPaddingEnd(), i6);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i5, textView.getPaddingRight(), i6);
        return true;
    }

    public Button getActionView() {
        return this.f12452p;
    }

    public TextView getMessageView() {
        return this.f12451o;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f12451o = (TextView) findViewById(R.id.snackbar_text);
        this.f12452p = (Button) findViewById(R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        int i6 = this.f12453q;
        if (i6 > 0 && getMeasuredWidth() > i6) {
            i4 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
            super.onMeasure(i4, i5);
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        boolean z4 = this.f12451o.getLayout().getLineCount() > 1;
        if (!z4 || this.f12454r <= 0 || this.f12452p.getMeasuredWidth() <= this.f12454r) {
            if (!z4) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!a(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i4, i5);
    }

    public void setMaxInlineActionWidth(int i4) {
        this.f12454r = i4;
    }
}
