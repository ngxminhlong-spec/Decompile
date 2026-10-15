package H;

import android.view.WindowInsets;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class I extends M {

    /* renamed from: a, reason: collision with root package name */
    public final WindowInsets.Builder f791a;

    public I() {
        this.f791a = A.b.j();
    }

    public I(a0 a0Var) {
        super(a0Var);
        WindowInsets c = a0Var.c();
        this.f791a = c != null ? A.b.k(c) : A.b.j();
    }

    @Override // H.M
    public a0 b() {
        WindowInsets build;
        a();
        build = this.f791a.build();
        a0 d = a0.d(build, null);
        d.f811a.n(null);
        return d;
    }

    @Override // H.M
    public void c(A.d dVar) {
        this.f791a.setSystemWindowInsets(A.c.b(dVar.f1a, dVar.f2b, dVar.c, dVar.d));
    }
}
