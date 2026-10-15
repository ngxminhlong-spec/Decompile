package com.google.android.material.behavior;

import E2.b;
import H.A;
import I.d;
import M.e;
import W2.g;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;
import v.AbstractC2018b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends AbstractC2018b {

    /* renamed from: a, reason: collision with root package name */
    public e f12280a;

    /* renamed from: b, reason: collision with root package name */
    public g f12281b;
    public boolean c;
    public int d = 2;

    /* renamed from: e, reason: collision with root package name */
    public float f12282e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public float f12283f = 0.5f;

    /* renamed from: g, reason: collision with root package name */
    public final b f12284g = new b(this);

    @Override // v.AbstractC2018b
    public boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z4 = this.c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z4 = coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.c = z4;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.c = false;
        }
        if (!z4) {
            return false;
        }
        if (this.f12280a == null) {
            this.f12280a = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f12284g);
        }
        return this.f12280a.r(motionEvent);
    }

    @Override // v.AbstractC2018b
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i4) {
        WeakHashMap weakHashMap = A.f779a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            A.f(view, 1048576);
            A.e(view, 0);
            if (r(view)) {
                A.g(view, d.f913l, new D3.d(12, this));
            }
        }
        return false;
    }

    @Override // v.AbstractC2018b
    public final boolean q(View view, MotionEvent motionEvent) {
        e eVar = this.f12280a;
        if (eVar == null) {
            return false;
        }
        eVar.k(motionEvent);
        return true;
    }

    public boolean r(View view) {
        return true;
    }
}
