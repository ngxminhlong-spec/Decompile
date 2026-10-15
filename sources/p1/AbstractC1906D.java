package p1;

import c1.C0234c;
import c1.C0237f;
import c1.C0238g;
import c1.InterfaceC0233b;
import com.google.android.gms.internal.ads.Wl;
import j1.C1729a;
import java.util.ArrayList;
import t2.C1995b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: p1.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1906D extends AbstractC1913K {

    /* renamed from: P, reason: collision with root package name */
    public final ArrayList f14391P;

    /* renamed from: Q, reason: collision with root package name */
    public final ArrayList f14392Q;

    /* renamed from: R, reason: collision with root package name */
    public final C0238g f14393R;

    /* renamed from: S, reason: collision with root package name */
    public final C0238g f14394S;

    /* renamed from: T, reason: collision with root package name */
    public final ArrayList f14395T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f14396U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f14397V;

    /* renamed from: W, reason: collision with root package name */
    public final C0237f f14398W;

    /* renamed from: X, reason: collision with root package name */
    public final C0237f f14399X;

    public AbstractC1906D(long j4, float f4, float f5, ArrayList arrayList, ArrayList arrayList2, C1995b c1995b) {
        super(j4, f4, f5, c1995b);
        this.f14395T = new ArrayList();
        this.f14391P = arrayList;
        this.f14392Q = arrayList2;
        int size = arrayList2.size();
        int i4 = 0;
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList2.get(i5);
            i5++;
            C0238g c0238g = (C0238g) obj;
            if ("Q".equals(c0238g.f3556r.f3546o)) {
                this.f14393R = c0238g;
            } else if ("Q'".equals(c0238g.f3556r.f3546o)) {
                this.f14394S = c0238g;
            }
        }
        Q(arrayList, arrayList2);
        int size2 = arrayList.size();
        while (i4 < size2) {
            Object obj2 = arrayList.get(i4);
            i4++;
            C0237f c0237f = (C0237f) obj2;
            if ("Preset".equals(c0237f.f3553r.f3546o)) {
                this.f14398W = c0237f;
            } else if ("Clear".equals(c0237f.f3553r.f3546o)) {
                this.f14399X = c0237f;
            }
            c0237f.f3554s = new Wl(this, c0237f, 19, false);
        }
        this.f14395T.addAll(this.f14391P);
        this.f14395T.addAll(this.f14392Q);
        H();
    }

    @Override // p1.AbstractC1913K
    public final InterfaceC0233b D() {
        return null;
    }

    @Override // p1.AbstractC1913K
    public final ArrayList E() {
        return this.f14395T;
    }

    public abstract W0.a N(long j4, float f4, float f5, ArrayList arrayList, ArrayList arrayList2);

    public abstract void O(C0237f c0237f);

    public final void P(boolean z4, boolean z5) {
        C0237f c0237f;
        C0237f c0237f2 = this.f14398W;
        if (c0237f2 != null && (c0237f = this.f14399X) != null) {
            Object obj = c0237f2.f1252p;
            boolean z6 = obj != null && ((Boolean) obj).booleanValue();
            Object obj2 = c0237f.f1252p;
            boolean z7 = obj2 != null && ((Boolean) obj2).booleanValue();
            if (z6 ^ z7) {
                z4 = z6;
                z5 = z7;
            } else if (z6) {
                z4 = false;
                z5 = false;
            }
        }
        boolean z8 = this.f14396U;
        this.f14396U = z4;
        boolean z9 = this.f14397V;
        this.f14397V = z5;
        if (!(z8 == z4 && z9 == z5) && z8 == this.f14393R.f3557s && z9 == this.f14394S.f3557s) {
            this.f13118B.n(new C1920f(this, 4));
        }
    }

    public abstract void Q(ArrayList arrayList, ArrayList arrayList2);

    @Override // h1.AbstractC1698a
    public final W0.a d(long j4) {
        ArrayList arrayList = this.f14391P;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            C0234c c0234c = ((C0237f) obj).f3553r;
            arrayList2.add(new C0234c(c0234c.f3547p, c0234c.f3548q, c0234c.f3546o, c0234c.f3549r));
        }
        ArrayList arrayList3 = this.f14392Q;
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        int size2 = arrayList3.size();
        while (i4 < size2) {
            Object obj2 = arrayList3.get(i4);
            i4++;
            C0234c c0234c2 = ((C0238g) obj2).f3556r;
            arrayList4.add(new C0234c(c0234c2.f3547p, c0234c2.f3548q, c0234c2.f3546o, c0234c2.f3549r));
        }
        return N(j4, this.f13122o, this.f13123p, arrayList2, arrayList4);
    }

    @Override // h1.AbstractC1698a
    public final O0.a m(String str) {
        ArrayList arrayList = this.f14391P;
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
        ArrayList arrayList = this.f14392Q;
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
        ArrayList arrayList2 = this.f14391P;
        int size = arrayList2.size();
        int i4 = 0;
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList2.get(i5);
            i5++;
            ((C0237f) obj).h(arrayList);
        }
        ArrayList arrayList3 = this.f14392Q;
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
        ArrayList arrayList2 = this.f14391P;
        int size = arrayList2.size();
        int i4 = 0;
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList2.get(i5);
            i5++;
            ((C0237f) obj).j(arrayList);
        }
        ArrayList arrayList3 = this.f14392Q;
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
            InterfaceC0233b J5 = AbstractC1913K.J(this.f14391P, i4, i5);
            long j4 = this.f13117A;
            r1 = J5 != null ? new j1.b(0, j4, J5.getId()) : null;
            if (r1 == null && (J4 = AbstractC1913K.J(this.f14392Q, i4, i5)) != null) {
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
