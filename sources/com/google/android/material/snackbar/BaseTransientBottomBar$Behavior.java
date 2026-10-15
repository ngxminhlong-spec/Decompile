package com.google.android.material.snackbar;

import D3.d;
import W2.f;
import W2.k;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.internal.ads.C0326Qb;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* renamed from: h, reason: collision with root package name */
    public final d f12450h;

    public BaseTransientBottomBar$Behavior() {
        d dVar = new d(22, false);
        this.f12282e = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f12283f = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.d = 0;
        this.f12450h = dVar;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, v.AbstractC2018b
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        d dVar = this.f12450h;
        dVar.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                C0326Qb.p().v((f) dVar.f677p);
            }
        } else if (coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            C0326Qb.p().u((f) dVar.f677p);
        }
        return super.f(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean r(View view) {
        this.f12450h.getClass();
        return view instanceof k;
    }
}
