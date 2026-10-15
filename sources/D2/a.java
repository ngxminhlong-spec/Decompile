package D2;

import H.A;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;
import v.AbstractC2018b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class a extends AbstractC2018b {

    /* renamed from: a, reason: collision with root package name */
    public b f667a;

    @Override // v.AbstractC2018b
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i4) {
        r(coordinatorLayout, view, i4);
        if (this.f667a == null) {
            this.f667a = new b(view);
        }
        b bVar = this.f667a;
        View view2 = (View) bVar.c;
        bVar.f668a = view2.getTop();
        bVar.f669b = view2.getLeft();
        b bVar2 = this.f667a;
        View view3 = (View) bVar2.c;
        int top = 0 - (view3.getTop() - bVar2.f668a);
        WeakHashMap weakHashMap = A.f779a;
        view3.offsetTopAndBottom(top);
        view3.offsetLeftAndRight(0 - (view3.getLeft() - bVar2.f669b));
        return true;
    }

    public void r(CoordinatorLayout coordinatorLayout, View view, int i4) {
        coordinatorLayout.q(view, i4);
    }
}
