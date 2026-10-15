package p1;

import c1.C0238g;
import c1.InterfaceC0233b;
import j1.C1729a;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class b0 extends AbstractC1913K {

    /* renamed from: P, reason: collision with root package name */
    public C0238g f14502P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f14503Q;

    @Override // p1.AbstractC1913K
    public final InterfaceC0233b D() {
        return this.f14502P;
    }

    @Override // p1.AbstractC1913K
    public final ArrayList E() {
        return null;
    }

    @Override // h1.AbstractC1698a
    public final W0.a d(long j4) {
        return new Q0.a(j4, this.f13122o, this.f13123p, 11);
    }

    @Override // h1.AbstractC1698a
    public final O0.a m(String str) {
        return null;
    }

    @Override // h1.AbstractC1698a
    public final O0.a o(String str) {
        return this.f14502P.f3555q;
    }

    @Override // h1.AbstractC1698a
    public final int r() {
        return 3;
    }

    @Override // h1.AbstractC1698a
    public final void t(ArrayList arrayList) {
        this.f14502P.h(arrayList);
        arrayList.add(new E0.b(2, this));
    }

    @Override // h1.AbstractC1698a
    public final void u(ArrayList arrayList) {
        this.f14502P.k(arrayList);
        arrayList.add(new E0.b(0, new E0.b(2, this)));
    }

    @Override // h1.AbstractC1698a
    public final boolean v() {
        this.f14503Q = !this.f14503Q;
        this.f13118B.n(new C1920f(this, 8));
        return true;
    }

    @Override // h1.AbstractC1698a
    public final j1.c x(int i4, int i5) {
        C0238g c0238g = this.f14502P;
        if (!s(i4, i5)) {
            return null;
        }
        if (!AbstractC1913K.I(c0238g, i4, i5)) {
            return new C1729a(this);
        }
        return new j1.b(1, this.f13117A, c0238g.f3556r.f3546o);
    }

    @Override // h1.AbstractC1698a
    public final void y(float f4, float f5) {
        this.f13122o = f4;
        this.f13123p = f5;
        M();
    }
}
