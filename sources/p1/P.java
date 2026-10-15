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
import k.C1748e;
import o2.AbstractC1895f;
import q1.AbstractC1954i;
import q1.AbstractC1955j;
import t2.C1995b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class P extends AbstractC1913K {

    /* renamed from: P, reason: collision with root package name */
    public final ArrayList f14435P;

    /* renamed from: Q, reason: collision with root package name */
    public final ArrayList f14436Q;

    /* renamed from: R, reason: collision with root package name */
    public final ArrayList f14437R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f14438S;

    /* renamed from: T, reason: collision with root package name */
    public boolean[][] f14439T;

    /* renamed from: U, reason: collision with root package name */
    public boolean[][] f14440U;

    /* renamed from: V, reason: collision with root package name */
    public final Paint f14441V;

    /* renamed from: W, reason: collision with root package name */
    public final Paint f14442W;

    public P(long j4, float f4, float f5, ArrayList arrayList, ArrayList arrayList2, boolean[][] zArr, boolean[][] zArr2, C1995b c1995b) {
        super(j4, f4, f5, c1995b);
        ArrayList arrayList3 = new ArrayList();
        this.f14437R = arrayList3;
        this.f14438S = true;
        this.f14435P = arrayList;
        this.f14436Q = arrayList2;
        this.f14439T = zArr;
        this.f14440U = zArr2;
        arrayList3.addAll(arrayList);
        arrayList3.addAll(arrayList2);
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((C0237f) obj).f3554s = new C1748e(7, this);
        }
        H();
        Paint paint = new Paint();
        this.f14441V = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(AbstractC1955j.f14678f);
        paint.setStrokeWidth(AbstractC1955j.c);
        Paint paint2 = new Paint();
        this.f14442W = paint2;
        paint2.setColor(AbstractC1955j.f14692t);
        paint2.setStyle(Paint.Style.FILL_AND_STROKE);
    }

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
        return null;
    }

    @Override // p1.AbstractC1913K
    public final ArrayList E() {
        return this.f14437R;
    }

    @Override // h1.AbstractC1698a
    public final W0.a d(long j4) {
        ArrayList arrayList = this.f14435P;
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
        ArrayList arrayList3 = this.f14436Q;
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        int size2 = arrayList3.size();
        while (i4 < size2) {
            Object obj2 = arrayList3.get(i4);
            i4++;
            C0234c c0234c2 = ((C0238g) obj2).f3556r;
            arrayList4.add(new C0234c(c0234c2.f3547p, c0234c2.f3548q, c0234c2.f3546o, c0234c2.f3549r));
        }
        return new Z0.a(j4, this.f13122o, this.f13123p, arrayList2, arrayList4, AbstractC1895f.i(this.f14439T), AbstractC1895f.i(this.f14440U), !(this instanceof U), !(this instanceof O));
    }

    @Override // p1.AbstractC1913K, h1.AbstractC1698a
    public final void f(Canvas canvas, boolean z4, boolean z5) {
        Paint paint = this.f14441V;
        if (z4) {
            paint.setColor(AbstractC1955j.f14679g);
        } else {
            paint.setColor(AbstractC1955j.f14678f);
        }
        int i4 = 0;
        ArrayList arrayList = this.f14437R;
        if (arrayList != null) {
            int size = arrayList.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayList.get(i5);
                i5++;
                A(canvas, this.f13118B, (InterfaceC0233b) obj, z4);
            }
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
        canvas.drawRoundRect(0.0f, 0.0f, G4, F4, f4, f4, this.f14442W);
        canvas.drawRoundRect(0.0f, 0.0f, G(), F(), f4, f4, paint);
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
                AbstractC1954i.c(canvas, (InterfaceC0233b) obj2, this.f13121E, this.f13122o, this.f13123p, G(), F());
            }
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
        ArrayList arrayList = this.f14435P;
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
        ArrayList arrayList = this.f14436Q;
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
    public int r() {
        return 39;
    }

    @Override // h1.AbstractC1698a
    public final void t(ArrayList arrayList) {
        ArrayList arrayList2 = this.f14435P;
        int size = arrayList2.size();
        int i4 = 0;
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList2.get(i5);
            i5++;
            ((C0237f) obj).h(arrayList);
        }
        ArrayList arrayList3 = this.f14436Q;
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
        ArrayList arrayList2 = this.f14435P;
        int size = arrayList2.size();
        int i4 = 0;
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList2.get(i5);
            i5++;
            ((C0237f) obj).j(arrayList);
        }
        ArrayList arrayList3 = this.f14436Q;
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
            InterfaceC0233b J5 = AbstractC1913K.J(this.f14435P, i4, i5);
            long j4 = this.f13117A;
            r1 = J5 != null ? new j1.b(0, j4, J5.getId()) : null;
            if (r1 == null && (J4 = AbstractC1913K.J(this.f14436Q, i4, i5)) != null) {
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
