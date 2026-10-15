package com.google.android.material.transformation;

import E2.a;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* renamed from: b, reason: collision with root package name */
    public AnimatorSet f12537b;

    public ExpandableTransformationBehavior() {
    }

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior
    public void r(View view, View view2, boolean z4, boolean z5) {
        AnimatorSet animatorSet = this.f12537b;
        boolean z6 = animatorSet != null;
        if (z6) {
            animatorSet.cancel();
        }
        AnimatorSet s4 = s(view, view2, z4, z6);
        this.f12537b = s4;
        s4.addListener(new a(5, this));
        this.f12537b.start();
        if (z5) {
            return;
        }
        this.f12537b.end();
    }

    public abstract AnimatorSet s(View view, View view2, boolean z4, boolean z5);
}
