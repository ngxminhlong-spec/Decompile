package H;

import android.graphics.Insets;
import android.view.WindowInsets;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class Q extends P {

    /* renamed from: o, reason: collision with root package name */
    public A.d f802o;

    /* renamed from: p, reason: collision with root package name */
    public A.d f803p;

    /* renamed from: q, reason: collision with root package name */
    public A.d f804q;

    public Q(a0 a0Var, WindowInsets windowInsets) {
        super(a0Var, windowInsets);
        this.f802o = null;
        this.f803p = null;
        this.f804q = null;
    }

    @Override // H.W
    public A.d g() {
        Insets mandatorySystemGestureInsets;
        if (this.f803p == null) {
            mandatorySystemGestureInsets = this.c.getMandatorySystemGestureInsets();
            this.f803p = A.d.b(mandatorySystemGestureInsets);
        }
        return this.f803p;
    }

    @Override // H.W
    public A.d i() {
        Insets systemGestureInsets;
        if (this.f802o == null) {
            systemGestureInsets = this.c.getSystemGestureInsets();
            this.f802o = A.d.b(systemGestureInsets);
        }
        return this.f802o;
    }

    @Override // H.W
    public A.d k() {
        Insets tappableElementInsets;
        if (this.f804q == null) {
            tappableElementInsets = this.c.getTappableElementInsets();
            this.f804q = A.d.b(tappableElementInsets);
        }
        return this.f804q;
    }

    @Override // H.O, H.W
    public void p(A.d dVar) {
    }
}
