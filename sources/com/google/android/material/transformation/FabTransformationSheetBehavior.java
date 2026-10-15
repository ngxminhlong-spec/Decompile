package com.google.android.material.transformation;

import C2.d;
import H.A;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.google.android.gms.internal.ads.C0258Da;
import java.util.HashMap;
import java.util.WeakHashMap;
import v.e;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
@Deprecated
/* loaded from: classes.dex */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: i, reason: collision with root package name */
    public HashMap f12542i;

    public FabTransformationSheetBehavior() {
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    public final void r(View view, View view2, boolean z4, boolean z5) {
        ViewParent parent = view2.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z4) {
                this.f12542i = new HashMap(childCount);
            }
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = coordinatorLayout.getChildAt(i4);
                boolean z6 = (childAt.getLayoutParams() instanceof e) && (((e) childAt.getLayoutParams()).f14996a instanceof FabTransformationScrimBehavior);
                if (childAt != view2 && !z6) {
                    if (z4) {
                        this.f12542i.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        WeakHashMap weakHashMap = A.f779a;
                        childAt.setImportantForAccessibility(4);
                    } else {
                        HashMap hashMap = this.f12542i;
                        if (hashMap != null && hashMap.containsKey(childAt)) {
                            int intValue = ((Integer) this.f12542i.get(childAt)).intValue();
                            WeakHashMap weakHashMap2 = A.f779a;
                            childAt.setImportantForAccessibility(intValue);
                        }
                    }
                }
            }
            if (!z4) {
                this.f12542i = null;
            }
        }
        super.r(view, view2, z4, z5);
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    public final C0258Da y(Context context, boolean z4) {
        int i4 = z4 ? R.animator.mtrl_fab_transformation_sheet_expand_spec : R.animator.mtrl_fab_transformation_sheet_collapse_spec;
        C0258Da c0258Da = new C0258Da(8, false);
        c0258Da.f4618p = d.b(context, i4);
        c0258Da.f4619q = new V2.e(4);
        return c0258Da;
    }
}
