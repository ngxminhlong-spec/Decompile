package com.google.android.material.transformation;

import C2.e;
import a3.c;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.play_billing.B;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
@Deprecated
/* loaded from: classes.dex */
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {
    public final e c;
    public final e d;

    public FabTransformationScrimBehavior() {
        this.c = new e(75L);
        this.d = new e(0L);
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new e(75L);
        this.d = new e(0L);
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, v.AbstractC2018b
    public final boolean b(View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    @Override // v.AbstractC2018b
    public final boolean q(View view, MotionEvent motionEvent) {
        return false;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    public final AnimatorSet s(View view, View view2, boolean z4, boolean z5) {
        ObjectAnimator ofFloat;
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        e eVar = z4 ? this.c : this.d;
        if (z4) {
            if (!z5) {
                view2.setAlpha(0.0f);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, 1.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, 0.0f);
        }
        eVar.a(ofFloat);
        arrayList.add(ofFloat);
        AnimatorSet animatorSet = new AnimatorSet();
        B.E(animatorSet, arrayList);
        animatorSet.addListener(new c(view2, z4));
        return animatorSet;
    }
}
