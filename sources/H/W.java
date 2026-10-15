package H;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class W {

    /* renamed from: b, reason: collision with root package name */
    public static final a0 f807b;

    /* renamed from: a, reason: collision with root package name */
    public final a0 f808a;

    static {
        int i4 = Build.VERSION.SDK_INT;
        f807b = (i4 >= 34 ? new L() : i4 >= 31 ? new K() : i4 >= 30 ? new J() : i4 >= 29 ? new I() : new H()).b().f811a.a().f811a.b().f811a.c();
    }

    public W(a0 a0Var) {
        this.f808a = a0Var;
    }

    public a0 a() {
        return this.f808a;
    }

    public a0 b() {
        return this.f808a;
    }

    public a0 c() {
        return this.f808a;
    }

    public void d(View view) {
    }

    public C0029d e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W)) {
            return false;
        }
        W w2 = (W) obj;
        return m() == w2.m() && l() == w2.l() && Objects.equals(j(), w2.j()) && Objects.equals(h(), w2.h()) && Objects.equals(e(), w2.e());
    }

    public A.d f(int i4) {
        return A.d.f0e;
    }

    public A.d g() {
        return j();
    }

    public A.d h() {
        return A.d.f0e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(m()), Boolean.valueOf(l()), j(), h(), e());
    }

    public A.d i() {
        return j();
    }

    public A.d j() {
        return A.d.f0e;
    }

    public A.d k() {
        return j();
    }

    public boolean l() {
        return false;
    }

    public boolean m() {
        return false;
    }

    public void n(A.d[] dVarArr) {
    }

    public void o(a0 a0Var) {
    }

    public void p(A.d dVar) {
    }

    public void q(int i4) {
    }
}
