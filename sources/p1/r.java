package p1;

import c1.C0237f;
import c1.C0238g;
import c1.InterfaceC0233b;
import j1.C1729a;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class r extends AbstractC1913K {

    /* renamed from: P, reason: collision with root package name */
    public ArrayList f14577P;

    /* renamed from: Q, reason: collision with root package name */
    public ArrayList f14578Q;

    /* renamed from: R, reason: collision with root package name */
    public ArrayList f14579R;

    /* renamed from: S, reason: collision with root package name */
    public HashMap f14580S;

    /* renamed from: T, reason: collision with root package name */
    public int f14581T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f14582U;

    @Override // p1.AbstractC1913K
    public final InterfaceC0233b D() {
        return null;
    }

    @Override // p1.AbstractC1913K
    public final ArrayList E() {
        return this.f14579R;
    }

    @Override // h1.AbstractC1698a
    public final W0.a d(long j4) {
        return new Q0.a(j4, this.f13122o, this.f13123p, 2);
    }

    @Override // h1.AbstractC1698a
    public final O0.a m(String str) {
        ArrayList arrayList = this.f14577P;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            C0237f c0237f = (C0237f) obj;
            if (c0237f.f3553r.f3546o.equals(str)) {
                return c0237f.f3552q;
            }
        }
        return null;
    }

    @Override // h1.AbstractC1698a
    public final O0.a o(String str) {
        ArrayList arrayList = this.f14578Q;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            C0238g c0238g = (C0238g) obj;
            if (c0238g.f3556r.f3546o.equals(str)) {
                return c0238g.f3555q;
            }
        }
        return null;
    }

    @Override // h1.AbstractC1698a
    public final int r() {
        return 37;
    }

    @Override // h1.AbstractC1698a
    public final void t(ArrayList arrayList) {
        ArrayList arrayList2 = this.f14577P;
        int size = arrayList2.size();
        int i4 = 0;
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList2.get(i5);
            i5++;
            ((C0237f) obj).h(arrayList);
        }
        ArrayList arrayList3 = this.f14578Q;
        int size2 = arrayList3.size();
        while (i4 < size2) {
            Object obj2 = arrayList3.get(i4);
            i4++;
            ((C0238g) obj2).h(arrayList);
        }
        arrayList.add(new E0.b(2, this));
    }

    @Override // h1.AbstractC1698a
    public final void u(ArrayList arrayList) {
        ArrayList arrayList2 = this.f14577P;
        int size = arrayList2.size();
        int i4 = 0;
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList2.get(i5);
            i5++;
            ((C0237f) obj).j(arrayList);
        }
        ArrayList arrayList3 = this.f14578Q;
        int size2 = arrayList3.size();
        while (i4 < size2) {
            Object obj2 = arrayList3.get(i4);
            i4++;
            ((C0238g) obj2).k(arrayList);
        }
        arrayList.add(new E0.b(0, new E0.b(2, this)));
    }

    @Override // h1.AbstractC1698a
    public final j1.c x(int i4, int i5) {
        InterfaceC0233b J4;
        if (s(i4, i5)) {
            InterfaceC0233b J5 = AbstractC1913K.J(this.f14577P, i4, i5);
            long j4 = this.f13117A;
            r1 = J5 != null ? new j1.b(0, j4, J5.getId()) : null;
            if (r1 == null && (J4 = AbstractC1913K.J(this.f14578Q, i4, i5)) != null) {
                r1 = new j1.b(1, j4, J4.getId());
            }
            if (r1 == null) {
                return new C1729a(this);
            }
        }
        return r1;
    }

    @Override // h1.AbstractC1698a
    public final void y(float f4, float f5) {
        this.f13122o = f4;
        this.f13123p = f5;
        M();
    }
}
