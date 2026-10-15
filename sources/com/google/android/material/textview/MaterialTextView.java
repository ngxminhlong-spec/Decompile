package com.google.android.material.textview;

import Z2.a;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.gms.internal.play_billing.B;
import l.M;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class MaterialTextView extends M {
    public MaterialTextView(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.textViewStyle, 0), attributeSet, R.attr.textViewStyle);
        Context context2 = getContext();
        TypedValue M4 = B.M(context2, com.duracodefactory.logiccircuitsimulatorpro.R.attr.textAppearanceLineHeightEnabled);
        if (M4 != null && M4.type == 18 && M4.data == 0) {
            return;
        }
        Resources.Theme theme = context2.getTheme();
        int[] iArr = B2.a.f152r;
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
        int e4 = e(context2, obtainStyledAttributes, 1, 2);
        obtainStyledAttributes.recycle();
        if (e4 != -1) {
            return;
        }
        TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
        int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
        obtainStyledAttributes2.recycle();
        if (resourceId != -1) {
            TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, B2.a.f151q);
            int e5 = e(getContext(), obtainStyledAttributes3, 0, 1);
            obtainStyledAttributes3.recycle();
            if (e5 >= 0) {
                setLineHeight(e5);
            }
        }
    }

    public static int e(Context context, TypedArray typedArray, int... iArr) {
        int i4 = -1;
        for (int i5 = 0; i5 < iArr.length && i4 < 0; i5++) {
            int i6 = iArr[i5];
            TypedValue typedValue = new TypedValue();
            if (typedArray.getValue(i6, typedValue) && typedValue.type == 2) {
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
                obtainStyledAttributes.recycle();
                i4 = dimensionPixelSize;
            } else {
                i4 = typedArray.getDimensionPixelSize(i6, -1);
            }
        }
        return i4;
    }

    @Override // l.M, android.widget.TextView
    public final void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        TypedValue M4 = B.M(context, com.duracodefactory.logiccircuitsimulatorpro.R.attr.textAppearanceLineHeightEnabled);
        if (M4 != null && M4.type == 18 && M4.data == 0) {
            return;
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(i4, B2.a.f151q);
        int e4 = e(getContext(), obtainStyledAttributes, 0, 1);
        obtainStyledAttributes.recycle();
        if (e4 >= 0) {
            setLineHeight(e4);
        }
    }
}
