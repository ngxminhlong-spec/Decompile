package com.duracodefactory.logiccircuitsimulatorpro.ui;

import D0.f;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class CustomBottomSheetBehaviour<V extends View> extends BottomSheetBehavior<V> {
    public float N;

    public CustomBottomSheetBehaviour(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12305j = true;
        f fVar = new f(1, this);
        ArrayList arrayList = this.f12291G;
        if (arrayList.contains(fVar)) {
            return;
        }
        arrayList.add(fVar);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, v.AbstractC2018b
    public final void p(CoordinatorLayout coordinatorLayout, View view, View view2, int i4) {
        if (this.N > 0.1d) {
            z(3);
        } else {
            super.p(coordinatorLayout, view, view2, i4);
        }
    }
}
