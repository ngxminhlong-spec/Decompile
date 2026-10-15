package D0;

import C0.A0;
import com.duracodefactory.logiccircuitsimulatorpro.MainActivity;
import o1.InterfaceC1827C;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class k implements InterfaceC1827C {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ p f589o;

    public /* synthetic */ k(p pVar) {
        this.f589o = pVar;
    }

    @Override // o1.InterfaceC1827C
    public void a() {
        p.P(this.f589o, new j(this, 1));
    }

    @Override // o1.InterfaceC1827C
    public /* synthetic */ void b() {
    }

    @Override // o1.InterfaceC1827C
    public void c() {
        p.P(this.f589o, new A0.a(23, this));
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
        A0 a02 = this.f589o.f624m0;
        if (a02 != null) {
            ((MainActivity) a02).C(i4);
        }
    }

    @Override // o1.InterfaceC1827C
    public void h() {
        p.P(this.f589o, new j(this, 0));
    }

    @Override // o1.InterfaceC1827C
    public /* synthetic */ void i(boolean z4) {
    }

    @Override // o1.InterfaceC1827C
    public /* synthetic */ void k() {
    }

    @Override // o1.InterfaceC1827C
    public /* synthetic */ void l() {
    }

    @Override // o1.InterfaceC1827C
    public void m(boolean z4) {
        A0 a02 = this.f589o.f624m0;
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
        p.P(this.f589o, new j(this, 3));
    }

    @Override // o1.InterfaceC1827C
    public void t() {
        p.P(this.f589o, new j(this, 2));
    }
}
