package p1;

import c1.C0237f;
import c1.InterfaceC0233b;
import j1.C1729a;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class j0 extends AbstractC1913K {

    /* renamed from: P, reason: collision with root package name */
    public C0237f f14555P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f14556Q;

    @Override // p1.AbstractC1913K
    public final InterfaceC0233b D() {
        return this.f14555P;
    }

    @Override // p1.AbstractC1913K
    public final ArrayList E() {
        return null;
    }

    @Override // h1.AbstractC1698a
    public final W0.a d(long j4) {
        return new Q0.a(j4, this.f13122o, this.f13123p, 12);
    }

    @Override // h1.AbstractC1698a
    public final O0.a m(String str) {
        return this.f14555P.f3552q;
    }

    @Override // h1.AbstractC1698a
    public final O0.a o(String str) {
        return null;
    }

    @Override // h1.AbstractC1698a
    public final int r() {
        return 66;
    }

    @Override // h1.AbstractC1698a
    public final void t(ArrayList arrayList) {
        this.f14555P.h(arrayList);
        arrayList.add(new E0.b(2, this));
    }

    @Override // h1.AbstractC1698a
    public final void u(ArrayList arrayList) {
        this.f14555P.j(arrayList);
        arrayList.add(new E0.b(0, new E0.b(2, this)));
        arrayList.add(new E0.b(7, this));
    }

    @Override // h1.AbstractC1698a
    public final j1.c x(int i4, int i5) {
        C0237f c0237f = this.f14555P;
        if (!s(i4, i5)) {
            return null;
        }
        if (!AbstractC1913K.I(c0237f, i4, i5)) {
            return new C1729a(this);
        }
        return new j1.b(0, this.f13117A, c0237f.f3553r.f3546o);
    }

    @Override // h1.AbstractC1698a
    public final void y(float f4, float f5) {
        this.f13122o = f4;
        this.f13123p = f5;
        M();
    }
}
