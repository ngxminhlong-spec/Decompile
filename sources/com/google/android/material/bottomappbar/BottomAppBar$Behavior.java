package com.google.android.material.bottomappbar;

import C0.ViewOnLayoutChangeListenerC0013m;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class BottomAppBar$Behavior extends HideBottomViewOnScrollBehavior<Object> {
    public BottomAppBar$Behavior() {
        new ViewOnLayoutChangeListenerC0013m(2, this);
        new Rect();
    }

    public BottomAppBar$Behavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new ViewOnLayoutChangeListenerC0013m(2, this);
        new Rect();
    }

    @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, v.AbstractC2018b
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i4) {
        throw new ClassCastException();
    }

    @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, v.AbstractC2018b
    public final boolean o(View view, int i4, int i5) {
        throw new ClassCastException();
    }
}
