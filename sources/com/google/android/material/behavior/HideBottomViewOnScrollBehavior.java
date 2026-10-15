package com.google.android.material.behavior;

import C2.a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import v.AbstractC2018b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends AbstractC2018b {

    /* renamed from: a, reason: collision with root package name */
    public int f12278a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f12279b = 2;
    public ViewPropertyAnimator c;

    public HideBottomViewOnScrollBehavior() {
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }

    @Override // v.AbstractC2018b
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i4) {
        this.f12278a = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        return false;
    }

    @Override // v.AbstractC2018b
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i4, int i5, int i6, int[] iArr) {
        if (i4 > 0) {
            if (this.f12279b == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.c;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f12279b = 1;
            this.c = view.animate().translationY(this.f12278a).setInterpolator(a.c).setDuration(175L).setListener(new E2.a(0, this));
            return;
        }
        if (i4 >= 0 || this.f12279b == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.c;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.f12279b = 2;
        this.c = view.animate().translationY(0).setInterpolator(a.d).setDuration(225L).setListener(new E2.a(0, this));
    }

    @Override // v.AbstractC2018b
    public boolean o(View view, int i4, int i5) {
        return i4 == 2;
    }
}
