package p1;

import c1.C0238g;
import c1.InterfaceC0233b;
import j1.C1729a;
import java.util.ArrayList;
import t2.C1995b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: p1.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1926l extends AbstractC1913K {

    /* renamed from: P, reason: collision with root package name */
    public final /* synthetic */ int f14559P;

    /* renamed from: Q, reason: collision with root package name */
    public C0238g f14560Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1926l(long j4, float f4, float f5, C1995b c1995b, int i4) {
        super(j4, f4, f5, c1995b);
        this.f14559P = i4;
    }

    @Override // p1.AbstractC1913K
    public final InterfaceC0233b D() {
        switch (this.f14559P) {
            case 0:
                return this.f14560Q;
            default:
                return this.f14560Q;
        }
    }

    @Override // p1.AbstractC1913K
    public final ArrayList E() {
        switch (this.f14559P) {
            case 0:
                return null;
            default:
                return null;
        }
    }

    @Override // h1.AbstractC1698a
    public final W0.a d(long j4) {
        switch (this.f14559P) {
            case 0:
                return new Q0.a(j4, this.f13122o, this.f13123p, 0);
            default:
                return new Q0.a(j4, this.f13122o, this.f13123p, 1);
        }
    }

    @Override // h1.AbstractC1698a
    public final O0.a m(String str) {
        switch (this.f14559P) {
            case 0:
                return null;
            default:
                return null;
        }
    }

    @Override // h1.AbstractC1698a
    public final O0.a o(String str) {
        switch (this.f14559P) {
            case 0:
                return this.f14560Q.f3555q;
            default:
                return this.f14560Q.f3555q;
        }
    }

    @Override // h1.AbstractC1698a
    public final int r() {
        switch (this.f14559P) {
            case 0:
                return 23;
            default:
                return 24;
        }
    }

    @Override // h1.AbstractC1698a
    public final void t(ArrayList arrayList) {
        switch (this.f14559P) {
            case 0:
                this.f14560Q.h(arrayList);
                arrayList.add(new E0.b(2, this));
                return;
            default:
                this.f14560Q.h(arrayList);
                arrayList.add(new E0.b(2, this));
                return;
        }
    }

    @Override // h1.AbstractC1698a
    public final void u(ArrayList arrayList) {
        switch (this.f14559P) {
            case 0:
                this.f14560Q.k(arrayList);
                arrayList.add(new E0.b(0, new E0.b(2, this)));
                return;
            default:
                this.f14560Q.k(arrayList);
                arrayList.add(new E0.b(0, new E0.b(2, this)));
                return;
        }
    }

    @Override // h1.AbstractC1698a
    public final j1.c x(int i4, int i5) {
        switch (this.f14559P) {
            case 0:
                C0238g c0238g = this.f14560Q;
                if (!s(i4, i5)) {
                    return null;
                }
                if (!AbstractC1913K.I(c0238g, i4, i5)) {
                    return new C1729a(this);
                }
                return new j1.b(1, this.f13117A, c0238g.f3556r.f3546o);
            default:
                C0238g c0238g2 = this.f14560Q;
                if (!s(i4, i5)) {
                    return null;
                }
                if (!AbstractC1913K.I(c0238g2, i4, i5)) {
                    return new C1729a(this);
                }
                return new j1.b(1, this.f13117A, c0238g2.f3556r.f3546o);
        }
    }

    @Override // h1.AbstractC1698a
    public final void y(float f4, float f5) {
        switch (this.f14559P) {
            case 0:
                this.f13122o = f4;
                this.f13123p = f5;
                M();
                return;
            default:
                this.f13122o = f4;
                this.f13123p = f5;
                M();
                return;
        }
    }
}
