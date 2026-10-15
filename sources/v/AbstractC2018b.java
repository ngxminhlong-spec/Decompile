package v;

import android.graphics.Rect;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: v.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2018b {
    public boolean a(Rect rect, View view) {
        return false;
    }

    public boolean b(View view, View view2) {
        return false;
    }

    public void c(e eVar) {
    }

    public boolean d(View view, View view2) {
        return false;
    }

    public void e() {
    }

    public boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public abstract boolean g(CoordinatorLayout coordinatorLayout, View view, int i4);

    public boolean h(CoordinatorLayout coordinatorLayout, View view) {
        return false;
    }

    public boolean i(View view) {
        return false;
    }

    public void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i4, int i5, int[] iArr, int i6) {
    }

    public void k(CoordinatorLayout coordinatorLayout, View view, int i4, int i5, int i6, int[] iArr) {
        iArr[0] = iArr[0] + i5;
        iArr[1] = iArr[1] + i6;
    }

    public void l(CoordinatorLayout coordinatorLayout, View view) {
    }

    public void m(View view, Parcelable parcelable) {
    }

    public Parcelable n(View view) {
        return View.BaseSavedState.EMPTY_STATE;
    }

    public boolean o(View view, int i4, int i5) {
        return false;
    }

    public void p(CoordinatorLayout coordinatorLayout, View view, View view2, int i4) {
    }

    public boolean q(View view, MotionEvent motionEvent) {
        return false;
    }
}
