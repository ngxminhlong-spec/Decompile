package com.google.android.material.floatingactionbutton;

import B2.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import v.AbstractC2018b;
import v.e;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior<T> extends AbstractC2018b {
    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior() {
    }

    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.d);
        obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.getBoolean(1, true);
        obtainStyledAttributes.recycle();
    }

    @Override // v.AbstractC2018b
    public final /* synthetic */ boolean a(Rect rect, View view) {
        throw new ClassCastException();
    }

    @Override // v.AbstractC2018b
    public final void c(e eVar) {
        if (eVar.f15001h == 0) {
            eVar.f15001h = 80;
        }
    }

    @Override // v.AbstractC2018b
    public final boolean d(View view, View view2) {
        throw new ClassCastException();
    }

    @Override // v.AbstractC2018b
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i4) {
        throw new ClassCastException();
    }
}
