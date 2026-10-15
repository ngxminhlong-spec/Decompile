package H;

import android.view.WindowInsets;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class O extends N {

    /* renamed from: n, reason: collision with root package name */
    public A.d f801n;

    public O(a0 a0Var, WindowInsets windowInsets) {
        super(a0Var, windowInsets);
        this.f801n = null;
    }

    @Override // H.W
    public a0 b() {
        return a0.d(this.c.consumeStableInsets(), null);
    }

    @Override // H.W
    public a0 c() {
        return a0.d(this.c.consumeSystemWindowInsets(), null);
    }

    @Override // H.W
    public final A.d h() {
        if (this.f801n == null) {
            WindowInsets windowInsets = this.c;
            this.f801n = A.d.a(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f801n;
    }

    @Override // H.W
    public boolean l() {
        return this.c.isConsumed();
    }

    @Override // H.W
    public void p(A.d dVar) {
        this.f801n = dVar;
    }
}
