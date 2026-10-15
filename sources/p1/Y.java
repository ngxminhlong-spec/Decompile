package p1;

import c1.C0234c;
import c1.C0238g;
import c1.InterfaceC0233b;
import j1.C1729a;
import java.util.ArrayList;
import t2.C1995b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class Y extends AbstractC1913K {

    /* renamed from: P, reason: collision with root package name */
    public final ArrayList f14486P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f14487Q;

    /* renamed from: R, reason: collision with root package name */
    public final C1915a f14488R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f14489S;

    public Y(long j4, float f4, float f5, ArrayList arrayList, C1995b c1995b) {
        super(j4, f4, f5, c1995b);
        this.f14489S = true;
        this.f14486P = arrayList;
        this.f14488R = P();
        H();
        this.f13118B.n(new C1920f(this, 7));
    }

    @Override // p1.AbstractC1913K
    public final InterfaceC0233b D() {
        return null;
    }

    @Override // p1.AbstractC1913K
    public final ArrayList E() {
        return this.f14486P;
    }

    public abstract void N();

    public abstract int O();

    public abstract C1915a P();

    public final void Q() {
        if (this.f14489S) {
            this.f14489S = false;
            this.f13118B.n(new C1920f(this, 7));
        }
    }

    @Override // h1.AbstractC1698a
    public final W0.a d(long j4) {
        ArrayList arrayList = this.f14486P;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            C0234c c0234c = ((C0238g) obj).f3556r;
            arrayList2.add(new C0234c(c0234c.f3547p, c0234c.f3548q, c0234c.f3546o, c0234c.f3549r));
        }
        return new T0.b(j4, this.f13122o, this.f13123p, arrayList2, O());
    }

    @Override // h1.AbstractC1698a
    public final O0.a m(String str) {
        return null;
    }

    @Override // h1.AbstractC1698a
    public final O0.a o(String str) {
        ArrayList arrayList = this.f14486P;
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
    public final void t(ArrayList arrayList) {
        ArrayList arrayList2 = this.f14486P;
        int size = arrayList2.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList2.get(i4);
            i4++;
            ((C0238g) obj).h(arrayList);
        }
        arrayList.add(new E0.b(2, this));
        arrayList.add(new C1938y(this, this.f14488R, 1));
    }

    @Override // h1.AbstractC1698a
    public final void u(ArrayList arrayList) {
        ArrayList arrayList2 = this.f14486P;
        int size = arrayList2.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList2.get(i4);
            i4++;
            ((C0238g) obj).k(arrayList);
        }
        arrayList.add(new E0.b(0, new E0.b(2, this)));
        arrayList.add(new E0.b(0, new C1938y(this, this.f14488R, 1)));
    }

    @Override // h1.AbstractC1698a
    public final j1.c x(int i4, int i5) {
        if (!s(i4, i5)) {
            return null;
        }
        InterfaceC0233b J4 = AbstractC1913K.J(this.f14486P, i4, i5);
        if (J4 == null) {
            return new C1729a(this);
        }
        return new j1.b(1, this.f13117A, J4.getId());
    }

    @Override // h1.AbstractC1698a
    public final void y(float f4, float f5) {
        this.f13122o = f4;
        this.f13123p = f5;
        M();
    }
}
