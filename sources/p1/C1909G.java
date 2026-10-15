package p1;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Pair;
import c1.C0234c;
import c1.C0237f;
import c1.C0238g;
import c1.InterfaceC0233b;
import j1.C1729a;
import java.util.ArrayList;
import q1.AbstractC1954i;
import q1.AbstractC1955j;
import t2.C1995b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: p1.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1909G extends AbstractC1913K {

    /* renamed from: P, reason: collision with root package name */
    public ArrayList f14406P;

    /* renamed from: Q, reason: collision with root package name */
    public ArrayList f14407Q;

    /* renamed from: R, reason: collision with root package name */
    public C0238g f14408R;

    /* renamed from: S, reason: collision with root package name */
    public ArrayList f14409S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f14410T;

    /* renamed from: U, reason: collision with root package name */
    public Paint f14411U;

    /* renamed from: V, reason: collision with root package name */
    public Paint f14412V;

    /* renamed from: W, reason: collision with root package name */
    public int f14413W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f14414X;

    @Override // p1.AbstractC1913K
    public final Pair C() {
        int i4 = this.N;
        int max = Math.max(i4 * 4, Math.max(this.f14426H, this.f14427I) * i4);
        int max2 = Math.max(i4 * 4, Math.max(this.f14425G, this.f14424F) * i4);
        int i5 = this.f13121E;
        return (i5 == 90 || i5 == 270) ? new Pair(Integer.valueOf(max2), Integer.valueOf(max)) : new Pair(Integer.valueOf(max), Integer.valueOf(max2));
    }

    @Override // p1.AbstractC1913K
    public final InterfaceC0233b D() {
        return this.f14408R;
    }

    @Override // p1.AbstractC1913K
    public final ArrayList E() {
        return this.f14409S;
    }

    @Override // h1.AbstractC1698a
    public final W0.a d(long j4) {
        ArrayList arrayList = this.f14406P;
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
        ArrayList arrayList3 = this.f14407Q;
        int size2 = arrayList3.size();
        while (i4 < size2) {
            Object obj2 = arrayList3.get(i4);
            i4++;
            C0234c c0234c2 = ((C0237f) obj2).f3553r;
            arrayList2.add(new C0234c(c0234c2.f3547p, c0234c2.f3548q, c0234c2.f3546o, c0234c2.f3549r));
        }
        C0234c c0234c3 = this.f14408R.f3556r;
        return new X0.a(j4, this.f13122o, this.f13123p, arrayList2, new C0234c(c0234c3.f3547p, c0234c3.f3548q, c0234c3.f3546o, c0234c3.f3549r));
    }

    @Override // p1.AbstractC1913K, h1.AbstractC1698a
    public final void f(Canvas canvas, boolean z4, boolean z5) {
        Paint paint = this.f14411U;
        if (z4) {
            paint.setColor(AbstractC1955j.f14679g);
        } else {
            paint.setColor(AbstractC1955j.f14678f);
        }
        ArrayList arrayList = this.f14409S;
        C1995b c1995b = this.f13118B;
        int i4 = 0;
        if (arrayList != null) {
            int size = arrayList.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayList.get(i5);
                i5++;
                A(canvas, c1995b, (InterfaceC0233b) obj, z4);
            }
        }
        C0238g c0238g = this.f14408R;
        if (c0238g != null) {
            A(canvas, c1995b, c0238g, z4);
        }
        if (this.f13121E != 0) {
            canvas.save();
            canvas.rotate(this.f13121E, this.f13122o, this.f13123p);
        }
        float G3 = this.f13122o - (G() / 2.0f);
        float F2 = this.f13123p - (F() / 2.0f);
        canvas.translate(G3, F2);
        float G4 = G();
        float F4 = F();
        float f4 = this.N / 5;
        canvas.drawRoundRect(0.0f, 0.0f, G4, F4, f4, f4, this.f14412V);
        Canvas canvas2 = canvas;
        canvas2.drawRoundRect(0.0f, 0.0f, G(), F(), f4, f4, paint);
        b1.e eVar = this.f13119C;
        if (eVar != null) {
            eVar.j(canvas);
        }
        canvas.translate(-G3, -F2);
        if (arrayList != null) {
            int size2 = arrayList.size();
            while (i4 < size2) {
                Object obj2 = arrayList.get(i4);
                i4++;
                AbstractC1954i.c(canvas2, (InterfaceC0233b) obj2, this.f13121E, this.f13122o, this.f13123p, G(), F());
                canvas2 = canvas;
            }
        }
        if (c0238g != null) {
            AbstractC1954i.c(canvas, c0238g, this.f13121E, this.f13122o, this.f13123p, G(), F());
        }
        if (this.f13121E != 0) {
            canvas.restore();
        }
        if (z5) {
            B(canvas);
        }
    }

    @Override // h1.AbstractC1698a
    public final O0.a m(String str) {
        ArrayList arrayList = this.f14406P;
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            C0237f c0237f = (C0237f) obj;
            if (c0237f.f3553r.f3546o.equals(str)) {
                return c0237f.f3552q;
            }
        }
        ArrayList arrayList2 = this.f14407Q;
        int size2 = arrayList2.size();
        while (i4 < size2) {
            Object obj2 = arrayList2.get(i4);
            i4++;
            C0237f c0237f2 = (C0237f) obj2;
            if (c0237f2.f3553r.f3546o.equals(str)) {
                return c0237f2.f3552q;
            }
        }
        return null;
    }

    @Override // h1.AbstractC1698a
    public final O0.a o(String str) {
        return this.f14408R.f3555q;
    }

    @Override // h1.AbstractC1698a
    public final int r() {
        return 42;
    }

    @Override // h1.AbstractC1698a
    public final void t(ArrayList arrayList) {
        ArrayList arrayList2 = this.f14406P;
        int size = arrayList2.size();
        int i4 = 0;
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList2.get(i5);
            i5++;
            ((C0237f) obj).h(arrayList);
        }
        ArrayList arrayList3 = this.f14407Q;
        int size2 = arrayList3.size();
        while (i4 < size2) {
            Object obj2 = arrayList3.get(i4);
            i4++;
            ((C0237f) obj2).h(arrayList);
        }
        this.f14408R.h(arrayList);
        arrayList.add(new E0.b(2, this));
    }

    @Override // h1.AbstractC1698a
    public final void u(ArrayList arrayList) {
        ArrayList arrayList2 = this.f14406P;
        int size = arrayList2.size();
        int i4 = 0;
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList2.get(i5);
            i5++;
            ((C0237f) obj).j(arrayList);
        }
        ArrayList arrayList3 = this.f14407Q;
        int size2 = arrayList3.size();
        while (i4 < size2) {
            Object obj2 = arrayList3.get(i4);
            i4++;
            ((C0237f) obj2).j(arrayList);
        }
        this.f14408R.k(arrayList);
        arrayList.add(new E0.b(0, new E0.b(2, this)));
    }

    @Override // h1.AbstractC1698a
    public final j1.c x(int i4, int i5) {
        C0238g c0238g = this.f14408R;
        if (s(i4, i5)) {
            InterfaceC0233b J4 = AbstractC1913K.J(this.f14409S, i4, i5);
            long j4 = this.f13117A;
            r2 = J4 != null ? new j1.b(0, j4, J4.getId()) : null;
            if (r2 == null && AbstractC1913K.I(c0238g, i4, i5)) {
                r2 = new j1.b(1, j4, c0238g.f3556r.f3546o);
            }
            if (r2 == null) {
                return new C1729a(this);
            }
        }
        return r2;
    }

    @Override // h1.AbstractC1698a
    public final void y(float f4, float f5) {
        this.f13122o = f4;
        this.f13123p = f5;
        M();
    }
}
