package C0;

import com.duracodefactory.logiccircuitsimulatorpro.MainActivity;
import o1.InterfaceC1827C;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class X implements InterfaceC1827C {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v0 f260o;

    public /* synthetic */ X(v0 v0Var) {
        this.f260o = v0Var;
    }

    @Override // o1.InterfaceC1827C
    public void a() {
        v0.P(this.f260o, new W(this, 2));
    }

    @Override // o1.InterfaceC1827C
    public /* synthetic */ void b() {
    }

    @Override // o1.InterfaceC1827C
    public void c() {
        v0.P(this.f260o, new A0.a(12, this));
    }

    @Override // o1.InterfaceC1827C
    public /* synthetic */ void e(boolean z4) {
    }

    @Override // o1.InterfaceC1827C
    public /* synthetic */ boolean f(boolean z4) {
        return false;
    }

    @Override // o1.InterfaceC1827C
    public void g(int i4) {
        A0 a02 = this.f260o.f432n0;
        if (a02 != null) {
            ((MainActivity) a02).C(i4);
        }
    }

    @Override // o1.InterfaceC1827C
    public void h() {
        v0.P(this.f260o, new W(this, 3));
    }

    @Override // o1.InterfaceC1827C
    public /* synthetic */ void i(boolean z4) {
    }

    @Override // o1.InterfaceC1827C
    public void k() {
        ((MainActivity) this.f260o.f432n0).D();
    }

    @Override // o1.InterfaceC1827C
    public /* synthetic */ void l() {
    }

    @Override // o1.InterfaceC1827C
    public void m(boolean z4) {
        A0 a02 = this.f260o.f432n0;
        if (a02 != null) {
            ((MainActivity) a02).B(z4);
        }
    }

    @Override // o1.InterfaceC1827C
    public /* synthetic */ boolean o(boolean z4) {
        return false;
    }

    @Override // o1.InterfaceC1827C
    public /* synthetic */ void p(int i4) {
    }

    @Override // o1.InterfaceC1827C
    public void q() {
        v0.P(this.f260o, new W(this, 1));
    }

    @Override // o1.InterfaceC1827C
    public void t() {
        v0.P(this.f260o, new W(this, 0));
    }
}
