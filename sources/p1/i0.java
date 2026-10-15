package p1;

import c1.C0234c;
import c1.C0237f;
import c1.C0238g;
import j1.C1729a;
import java.util.ArrayList;
import k.C1748e;
import o2.AbstractC1895f;
import t2.C1995b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class i0 extends C1939z {

    /* renamed from: V, reason: collision with root package name */
    public final C0237f f14540V;

    /* renamed from: W, reason: collision with root package name */
    public final C0237f f14541W;

    /* renamed from: X, reason: collision with root package name */
    public final ArrayList f14542X;

    /* renamed from: Y, reason: collision with root package name */
    public final boolean f14543Y;

    /* renamed from: Z, reason: collision with root package name */
    public final h0 f14544Z;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f14545a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f14546b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f14547c0;

    /* renamed from: d0, reason: collision with root package name */
    public final String f14548d0;

    /* renamed from: e0, reason: collision with root package name */
    public int f14549e0;

    public i0(long j4, float f4, float f5, boolean z4, int i4, ArrayList arrayList, C0238g c0238g, C1995b c1995b) {
        super(j4, c0238g, f4, f5, 0.0f, c1995b);
        this.f14545a0 = true;
        this.f14542X = arrayList;
        this.f14543Y = z4;
        this.f14549e0 = i4;
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            C0237f c0237f = (C0237f) obj;
            if ("Trigger".equals(c0237f.f3553r.f3546o)) {
                this.f14540V = c0237f;
            } else {
                this.f14541W = c0237f;
            }
        }
        this.f14541W.f3554s = new C1748e(8, this);
        this.f14540V.f3554s = new k.o(9, this);
        h0 h0Var = new h0(this);
        this.f14544Z = h0Var;
        this.f14601S = h0Var;
        H();
        String str = this.y;
        this.f14548d0 = str;
        this.y = AbstractC1895f.q(this.f14549e0 * 1000) + " " + str;
    }

    @Override // p1.C1939z, p1.AbstractC1913K
    public final ArrayList E() {
        return this.f14542X;
    }

    @Override // p1.C1939z
    public final boolean P() {
        return this.f14547c0;
    }

    public final void Q(boolean z4) {
        if (z4 == this.f14599Q && this.f14545a0) {
            return;
        }
        this.f14547c0 = z4;
        this.f14545a0 = false;
        this.f13118B.n(new C1920f(this, 9));
    }

    public final void R(int i4) {
        this.f14549e0 = i4;
        this.y = AbstractC1895f.q(this.f14549e0 * 1000) + " " + this.f14548d0;
        this.f14546b0 = false;
        this.f14544Z.c = 0.0f;
        Q(false);
    }

    @Override // p1.C1939z, h1.AbstractC1698a
    public final W0.a d(long j4) {
        ArrayList arrayList = new ArrayList(2);
        C0234c c0234c = this.f14540V.f3553r;
        arrayList.add(new C0234c(c0234c.f3547p, c0234c.f3548q, c0234c.f3546o, c0234c.f3549r));
        C0234c c0234c2 = this.f14541W.f3553r;
        arrayList.add(new C0234c(c0234c2.f3547p, c0234c2.f3548q, c0234c2.f3546o, c0234c2.f3549r));
        C0234c c0234c3 = this.f14598P.f3556r;
        return new T0.c(j4, this.f13122o, this.f13123p, this.f14543Y, this.f14549e0, arrayList, new C0234c(c0234c3.f3547p, c0234c3.f3548q, c0234c3.f3546o, c0234c3.f3549r));
    }

    @Override // p1.C1939z, h1.AbstractC1698a
    public final O0.a m(String str) {
        ArrayList arrayList = this.f14542X;
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

    @Override // p1.C1939z, h1.AbstractC1698a
    public int r() {
        return 52;
    }

    @Override // p1.C1939z, h1.AbstractC1698a
    public final void t(ArrayList arrayList) {
        this.f14540V.h(arrayList);
        this.f14541W.h(arrayList);
        super.t(arrayList);
    }

    @Override // p1.C1939z, h1.AbstractC1698a
    public final void u(ArrayList arrayList) {
        this.f14540V.j(arrayList);
        this.f14541W.j(arrayList);
        super.u(arrayList);
    }

    @Override // p1.C1939z, h1.AbstractC1698a
    public final j1.c x(int i4, int i5) {
        if (!s(i4, i5)) {
            return null;
        }
        C0238g c0238g = this.f14598P;
        boolean I4 = AbstractC1913K.I(c0238g, i4, i5);
        long j4 = this.f13117A;
        if (I4) {
            return new j1.b(1, j4, c0238g.f3556r.f3546o);
        }
        C0237f c0237f = this.f14540V;
        if (AbstractC1913K.I(c0237f, i4, i5)) {
            return new j1.b(0, j4, c0237f.f3553r.f3546o);
        }
        C0237f c0237f2 = this.f14541W;
        return AbstractC1913K.I(c0237f2, i4, i5) ? new j1.b(0, j4, c0237f2.f3553r.f3546o) : new C1729a(this);
    }
}
