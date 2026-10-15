package com.google.android.material.appbar;

import D2.a;
import H.A;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import v.e;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class AppBarLayout$ScrollingViewBehavior extends a {

    /* renamed from: b, reason: collision with root package name */
    public final int f12277b;

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        new Rect();
        new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, B2.a.f155u);
        this.f12277b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }

    public static void s(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
        }
    }

    @Override // v.AbstractC2018b
    public final boolean d(View view, View view2) {
        int i4;
        if (((e) view2.getLayoutParams()).f14996a instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            int i5 = this.f12277b;
            if (i5 == 0 || (i4 = (int) (0.0f * i5)) < 0) {
                i5 = 0;
            } else if (i4 <= i5) {
                i5 = i4;
            }
            int i6 = bottom - i5;
            WeakHashMap weakHashMap = A.f779a;
            view.offsetTopAndBottom(i6);
        }
        return false;
    }

    @Override // v.AbstractC2018b
    public final boolean h(CoordinatorLayout coordinatorLayout, View view) {
        int i4 = view.getLayoutParams().height;
        if (i4 != -1 && i4 != -2) {
            return false;
        }
        s(coordinatorLayout.j(view));
        return false;
    }

    @Override // v.AbstractC2018b
    public final void l(CoordinatorLayout coordinatorLayout, View view) {
        s(coordinatorLayout.j(view));
    }

    @Override // D2.a
    public final void r(CoordinatorLayout coordinatorLayout, View view, int i4) {
        s(coordinatorLayout.j(view));
        coordinatorLayout.q(view, i4);
    }
}
