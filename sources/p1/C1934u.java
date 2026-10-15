package p1;

import c1.C0237f;
import c1.InterfaceC0233b;
import j1.C1729a;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: p1.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1934u extends AbstractC1913K implements InterfaceC1925k {

    /* renamed from: P, reason: collision with root package name */
    public ArrayList f14585P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean[] f14586Q;

    /* renamed from: R, reason: collision with root package name */
    public int f14587R;

    @Override // p1.AbstractC1913K
    public final InterfaceC0233b D() {
        return null;
    }

    @Override // p1.AbstractC1913K
    public final ArrayList E() {
        return this.f14585P;
    }

    @Override // p1.InterfaceC1925k
    public final void b(int i4) {
        this.f14587R = i4;
    }

    @Override // h1.AbstractC1698a
    public final W0.a d(long j4) {
        return new Q0.a(j4, this.f13122o, this.f13123p, 7);
    }

    @Override // h1.AbstractC1698a
    public final O0.a m(String str) {
        ArrayList arrayList = this.f14585P;
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
        return null;
    }

    @Override // h1.AbstractC1698a
    public final int r() {
        return 38;
    }

    @Override // h1.AbstractC1698a
    public final void t(ArrayList arrayList) {
        ArrayList arrayList2 = this.f14585P;
        int size = arrayList2.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList2.get(i4);
            i4++;
            ((C0237f) obj).h(arrayList);
        }
        arrayList.add(new E0.b(2, this));
    }

    @Override // h1.AbstractC1698a
    public final void u(ArrayList arrayList) {
        ArrayList arrayList2 = this.f14585P;
        int size = arrayList2.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList2.get(i4);
            i4++;
            ((C0237f) obj).j(arrayList);
        }
        arrayList.add(new E0.b(0, new E0.b(2, this)));
    }

    @Override // h1.AbstractC1698a
    public final j1.c x(int i4, int i5) {
        if (!s(i4, i5)) {
            return null;
        }
        InterfaceC0233b J4 = AbstractC1913K.J(this.f14585P, i4, i5);
        if (J4 == null) {
            return new C1729a(this);
        }
        return new j1.b(0, this.f13117A, J4.getId());
    }

    @Override // h1.AbstractC1698a
    public final void y(float f4, float f5) {
        this.f13122o = f4;
        this.f13123p = f5;
        M();
    }
}
