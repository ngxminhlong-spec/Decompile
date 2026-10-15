package p1;

import c1.C0237f;
import c1.C0238g;
import c1.InterfaceC0233b;
import j1.C1729a;
import java.util.ArrayList;
import t2.C1995b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: p1.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1935v extends AbstractC1913K {

    /* renamed from: P, reason: collision with root package name */
    public final ArrayList f14588P;

    /* renamed from: Q, reason: collision with root package name */
    public final C0238g f14589Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f14590R;

    public AbstractC1935v(long j4, float f4, float f5, ArrayList arrayList, C0238g c0238g, C1995b c1995b) {
        super(j4, f4, f5, c1995b);
        this.f14588P = arrayList;
        this.f14589Q = c0238g;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((C0237f) obj).f3554s = new k.o(6, this);
        }
        H();
    }

    @Override // p1.AbstractC1913K
    public final InterfaceC0233b D() {
        return this.f14589Q;
    }

    @Override // p1.AbstractC1913K
    public final ArrayList E() {
        return this.f14588P;
    }

    public abstract boolean N();

    @Override // h1.AbstractC1698a
    public final O0.a m(String str) {
        ArrayList arrayList = this.f14588P;
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
        return this.f14589Q.f3555q;
    }

    @Override // h1.AbstractC1698a
    public final void t(ArrayList arrayList) {
        ArrayList arrayList2 = this.f14588P;
        int size = arrayList2.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList2.get(i4);
            i4++;
            ((C0237f) obj).h(arrayList);
        }
        this.f14589Q.h(arrayList);
        arrayList.add(new E0.b(2, this));
    }

    @Override // h1.AbstractC1698a
    public final void u(ArrayList arrayList) {
        ArrayList arrayList2 = this.f14588P;
        int size = arrayList2.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList2.get(i4);
            i4++;
            ((C0237f) obj).j(arrayList);
        }
        this.f14589Q.k(arrayList);
        arrayList.add(new E0.b(0, new E0.b(2, this)));
    }

    @Override // h1.AbstractC1698a
    public final j1.c x(int i4, int i5) {
        if (!s(i4, i5)) {
            return null;
        }
        InterfaceC0233b J4 = AbstractC1913K.J(this.f14588P, i4, i5);
        long j4 = this.f13117A;
        if (J4 != null) {
            return new j1.b(0, j4, J4.getId());
        }
        C0238g c0238g = this.f14589Q;
        return AbstractC1913K.I(c0238g, i4, i5) ? new j1.b(1, j4, c0238g.f3556r.f3546o) : new C1729a(this);
    }

    @Override // h1.AbstractC1698a
    public final void y(float f4, float f5) {
        this.f13122o = f4;
        this.f13123p = f5;
        M();
    }
}
