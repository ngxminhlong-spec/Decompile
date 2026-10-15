package com.google.android.material.transformation;

import H.A;
import N2.a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.WeakHashMap;
import v.AbstractC2018b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends AbstractC2018b {

    /* renamed from: a, reason: collision with root package name */
    public int f12536a = 0;

    public ExpandableBehavior() {
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }

    @Override // v.AbstractC2018b
    public abstract boolean b(View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v.AbstractC2018b
    public final boolean d(View view, View view2) {
        Object obj = (a) view2;
        boolean z4 = ((FloatingActionButton) obj).f12422C.f1228a;
        if (z4) {
            int i4 = this.f12536a;
            if (i4 != 0 && i4 != 2) {
                return false;
            }
        } else if (this.f12536a != 1) {
            return false;
        }
        this.f12536a = z4 ? 1 : 2;
        r((View) obj, view, z4, true);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v.AbstractC2018b
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i4) {
        a aVar;
        int i5;
        WeakHashMap weakHashMap = A.f779a;
        if (!view.isLaidOut()) {
            ArrayList j4 = coordinatorLayout.j(view);
            int size = j4.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size) {
                    aVar = null;
                    break;
                }
                View view2 = (View) j4.get(i6);
                if (b(view, view2)) {
                    aVar = (a) view2;
                    break;
                }
                i6++;
            }
            if (aVar != null) {
                boolean z4 = ((FloatingActionButton) aVar).f12422C.f1228a;
                if (!z4 ? this.f12536a == 1 : !((i5 = this.f12536a) != 0 && i5 != 2)) {
                    int i7 = z4 ? 1 : 2;
                    this.f12536a = i7;
                    view.getViewTreeObserver().addOnPreDrawListener(new a3.a(this, view, i7, aVar));
                }
            }
        }
        return false;
    }

    public abstract void r(View view, View view2, boolean z4, boolean z5);
}
