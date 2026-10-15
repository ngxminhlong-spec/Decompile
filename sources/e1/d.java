package e1;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.Pair;
import c1.C0232a;
import c1.C0234c;
import c1.InterfaceC0233b;
import com.duracodefactory.logiccircuitsimulatorpro.view.BoardView;
import h1.AbstractC1698a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import p1.AbstractC1913K;
import p1.C1912J;
import p1.C1939z;
import q1.AbstractC1954i;
import q1.AbstractC1955j;
import s1.InterfaceC1974d;
import t2.C1995b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class d extends AbstractC1913K implements I0.b {

    /* renamed from: P, reason: collision with root package name */
    public final ArrayList f12681P;

    /* renamed from: Q, reason: collision with root package name */
    public final LongSparseArray f12682Q;

    /* renamed from: R, reason: collision with root package name */
    public final C1995b f12683R;

    /* renamed from: S, reason: collision with root package name */
    public final E0.a f12684S;

    /* renamed from: T, reason: collision with root package name */
    public final boolean f12685T;

    /* renamed from: U, reason: collision with root package name */
    public final ArrayList f12686U;

    /* renamed from: V, reason: collision with root package name */
    public final ArrayList f12687V;

    /* renamed from: W, reason: collision with root package name */
    public final HashMap f12688W;

    /* renamed from: X, reason: collision with root package name */
    public final HashSet f12689X;

    /* renamed from: Y, reason: collision with root package name */
    public final ArrayList f12690Y;

    /* renamed from: Z, reason: collision with root package name */
    public final ArrayList f12691Z;

    /* renamed from: a0, reason: collision with root package name */
    public long f12692a0;

    /* renamed from: b0, reason: collision with root package name */
    public final Paint f12693b0;

    /* renamed from: c0, reason: collision with root package name */
    public final Paint f12694c0;

    /* renamed from: d0, reason: collision with root package name */
    public final RectF f12695d0;

    /* renamed from: e0, reason: collision with root package name */
    public final String f12696e0;

    /* renamed from: f0, reason: collision with root package name */
    public final ArrayList f12697f0;

    /* renamed from: g0, reason: collision with root package name */
    public final HashSet f12698g0;

    /* JADX WARN: Type inference failed for: r10v12, types: [java.lang.Object, E0.a] */
    public d(long j4, float f4, float f5, String str, ArrayList arrayList, C1995b c1995b, ArrayList arrayList2, HashMap hashMap, boolean z4, int i4, ArrayList arrayList3) {
        super(j4, f4, f5, c1995b);
        this.f12686U = new ArrayList();
        this.f12687V = new ArrayList();
        this.f12688W = new HashMap();
        this.f12689X = new HashSet();
        this.f12690Y = new ArrayList();
        this.f12691Z = new ArrayList();
        this.f12695d0 = new RectF();
        this.f12698g0 = new HashSet();
        this.f12681P = new ArrayList();
        this.f12682Q = new LongSparseArray();
        this.f12697f0 = arrayList3;
        ?? obj = new Object();
        obj.f711s = this;
        obj.f709q = new ArrayList();
        obj.f710r = new ArrayList();
        this.f12684S = obj;
        this.f12683R = c1995b;
        this.f12685T = z4;
        int size = arrayList.size();
        int i5 = 0;
        int i6 = 0;
        while (i6 < size) {
            Object obj2 = arrayList.get(i6);
            i6++;
            this.f12684S.c((I0.d) obj2);
        }
        if (!this.f12681P.isEmpty()) {
            ArrayList arrayList4 = this.f12681P;
            int size2 = arrayList4.size();
            int i7 = 0;
            while (i7 < size2) {
                Object obj3 = arrayList4.get(i7);
                i7++;
                this.f12692a0 = Math.max(this.f12692a0, ((AbstractC1698a) obj3).f13117A);
            }
        }
        for (int i8 = 0; i8 < i4; i8++) {
            R();
        }
        if (!this.f12681P.isEmpty()) {
            ArrayList arrayList5 = this.f12681P;
            int size3 = arrayList5.size();
            int i9 = 0;
            while (i9 < size3) {
                Object obj4 = arrayList5.get(i9);
                i9++;
                this.f12692a0 = Math.max(this.f12692a0, ((AbstractC1698a) obj4).f13117A);
            }
        }
        this.f12692a0++;
        int size4 = arrayList2.size();
        int i10 = 0;
        while (i10 < size4) {
            Object obj5 = arrayList2.get(i10);
            i10++;
            C0232a c0232a = (C0232a) obj5;
            C0234c c0234c = c0232a.f3545p;
            C1912J c1912j = c0232a.f3544o;
            String str2 = c0234c.f3546o;
            j1.b bVar = (j1.b) hashMap.get(str2);
            O0.a c = bVar.c(this);
            if (c != null) {
                this.f12686U.add(c0232a);
                this.f12688W.put(str2, bVar);
                c1912j.c(c);
                c.c(c1912j);
                c1912j.e(c.i());
            }
        }
        ArrayList arrayList6 = this.f12686U;
        int size5 = arrayList6.size();
        while (i5 < size5) {
            Object obj6 = arrayList6.get(i5);
            i5++;
            this.f12687V.add(((C0232a) obj6).f3545p.a());
        }
        Paint paint = new Paint();
        this.f12693b0 = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(AbstractC1955j.f14678f);
        paint.setStrokeWidth(AbstractC1955j.c);
        Paint paint2 = new Paint();
        this.f12694c0 = paint2;
        paint2.setColor(AbstractC1955j.f14692t);
        paint2.setStyle(Paint.Style.FILL_AND_STROKE);
        H();
        this.f12696e0 = str;
        E0.a aVar = this.f12684S;
        aVar.f708p = aVar.f707o;
    }

    @Override // p1.AbstractC1913K
    public final Pair C() {
        int i4 = this.N;
        int max = Math.max(i4 * 6, Math.max(this.f14426H, this.f14427I) * i4);
        int max2 = Math.max(i4 * 6, Math.max(this.f14425G, this.f14424F) * i4);
        int i5 = this.f13121E;
        return (i5 == 90 || i5 == 270) ? new Pair(Integer.valueOf(max2), Integer.valueOf(max)) : new Pair(Integer.valueOf(max), Integer.valueOf(max2));
    }

    @Override // p1.AbstractC1913K
    public final InterfaceC0233b D() {
        return null;
    }

    @Override // p1.AbstractC1913K
    public final ArrayList E() {
        return this.f12686U;
    }

    public final void N(I0.d dVar) {
        this.f12684S.c(dVar);
    }

    public final RectF O() {
        RectF rectF = new RectF();
        ArrayList arrayList = this.f12681P;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            AbstractC1698a abstractC1698a = (AbstractC1698a) obj;
            if (rectF.width() == 0.0f || rectF.height() == 0.0f) {
                rectF.set(abstractC1698a.f13124q, abstractC1698a.f13125r, abstractC1698a.f13126s, abstractC1698a.f13127t);
            }
            rectF.set(Math.min(rectF.left, abstractC1698a.f13124q), Math.max(rectF.top, abstractC1698a.f13125r), Math.max(rectF.right, abstractC1698a.f13126s), Math.min(rectF.bottom, abstractC1698a.f13127t));
        }
        float f4 = rectF.left;
        int i5 = this.N;
        rectF.left = f4 - i5;
        rectF.right += i5;
        rectF.top += i5;
        rectF.bottom -= i5;
        return rectF;
    }

    public final void P(boolean z4) {
        ArrayList arrayList = this.f12681P;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            AbstractC1698a abstractC1698a = (AbstractC1698a) obj;
            if (abstractC1698a instanceof C1939z) {
                ((C1939z) abstractC1698a).N(z4, this);
            } else if (abstractC1698a instanceof d) {
                ((d) abstractC1698a).P(z4);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b5, code lost:
    
        if (r12 < java.lang.Math.hypot(r23 - r5.f13122o, r24 - r5.f13123p)) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [j1.c] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j1.c Q(int r23, int r24) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.d.Q(int, int):j1.c");
    }

    public final boolean R() {
        E0.a aVar = this.f12684S;
        d dVar = (d) aVar.f711s;
        ArrayList arrayList = (ArrayList) aVar.f710r;
        ArrayList arrayList2 = (ArrayList) aVar.f709q;
        if (arrayList2.isEmpty()) {
            return false;
        }
        I0.a aVar2 = (I0.a) arrayList2.remove(arrayList2.size() - 1);
        if (!arrayList.add(aVar2)) {
            arrayList2.add(aVar2);
            return false;
        }
        if (!aVar2.b(dVar)) {
            arrayList2.add(aVar2);
            arrayList.remove(arrayList.size() - 1);
            return false;
        }
        aVar.f707o--;
        BoardView boardView = (BoardView) dVar.f12683R.f14883r;
        InterfaceC1974d interfaceC1974d = boardView.f3798D;
        if (interfaceC1974d != null) {
            interfaceC1974d.m();
        }
        boardView.invalidate();
        return true;
    }

    @Override // h1.AbstractC1698a
    public final W0.a d(long j4) {
        ArrayList arrayList = this.f12687V;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            arrayList2.add(((C0234c) obj).a());
        }
        for (Map.Entry entry : this.f12688W.entrySet()) {
            hashMap.put((String) entry.getKey(), ((j1.b) entry.getValue()).b(((j1.b) entry.getValue()).f13328p, ((j1.b) entry.getValue()).f13327o));
        }
        E0.a aVar = this.f12684S;
        ArrayList arrayList3 = (ArrayList) aVar.f709q;
        ArrayList arrayList4 = (ArrayList) aVar.f710r;
        ArrayList arrayList5 = new ArrayList(arrayList3);
        for (int size2 = arrayList4.size() - 1; size2 >= 0; size2--) {
            arrayList5.add((I0.d) arrayList4.get(size2));
        }
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = this.f12697f0;
        int size3 = arrayList7.size();
        while (i4 < size3) {
            Object obj2 = arrayList7.get(i4);
            i4++;
            arrayList6.add(((m1.b) obj2).a());
        }
        return new P0.a(j4, this.f13122o, this.f13123p, this.f12696e0, arrayList5, arrayList2, hashMap, arrayList4.size(), arrayList6);
    }

    @Override // p1.AbstractC1913K, h1.AbstractC1698a
    public final void f(Canvas canvas, boolean z4, boolean z5) {
        Paint paint = this.f12693b0;
        if (z4) {
            paint.setColor(AbstractC1955j.f14679g);
        } else {
            paint.setColor(AbstractC1955j.f14678f);
        }
        int i4 = 0;
        ArrayList arrayList = this.f12686U;
        if (arrayList != null) {
            int size = arrayList.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayList.get(i5);
                i5++;
                A(canvas, this.f12683R, (InterfaceC0233b) obj, z4);
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
        canvas.drawRoundRect(0.0f, 0.0f, G4, F4, f4, f4, this.f12694c0);
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
        String str = this.f13132z;
        if (str == null) {
            str = this.f12696e0;
            if (TextUtils.isEmpty(str)) {
                str = this.y;
            }
        }
        AbstractC1954i.a(canvas, str, this.f13122o, this.f13123p, Paint.Align.CENTER);
    }

    @Override // I0.b
    public final AbstractC1698a h(long j4) {
        return (AbstractC1698a) this.f12682Q.get(j4);
    }

    @Override // I0.b
    public final C1995b k() {
        return this.f12683R;
    }

    @Override // h1.AbstractC1698a
    public final O0.a m(String str) {
        ArrayList arrayList = this.f12686U;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            C0232a c0232a = (C0232a) obj;
            if (c0232a.f3545p.f3546o.equals(str)) {
                return c0232a.f3544o;
            }
        }
        return null;
    }

    @Override // h1.AbstractC1698a
    public final O0.a o(String str) {
        ArrayList arrayList = this.f12686U;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            C0232a c0232a = (C0232a) obj;
            if (c0232a.f3545p.f3546o.equals(str)) {
                return c0232a.f3544o;
            }
        }
        return null;
    }

    @Override // h1.AbstractC1698a
    public final int r() {
        return 2;
    }

    @Override // h1.AbstractC1698a
    public final void t(ArrayList arrayList) {
        ArrayList arrayList2 = this.f12686U;
        int size = arrayList2.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList2.get(i4);
            i4++;
            ((InterfaceC0233b) obj).b().t(arrayList);
        }
        arrayList.add(new E0.b(2, this));
        arrayList.add(new E0.b(3, this));
    }

    @Override // h1.AbstractC1698a
    public final void u(ArrayList arrayList) {
        ArrayList arrayList2 = this.f12686U;
        int size = arrayList2.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList2.get(i4);
            i4++;
            ((InterfaceC0233b) obj).b().u(arrayList);
        }
        arrayList.add(new E0.b(0, new E0.b(2, this)));
        arrayList.add(new E0.b(0, new E0.b(3, this)));
    }

    @Override // h1.AbstractC1698a
    public final j1.c x(int i4, int i5) {
        return Q(i4, i5);
    }

    @Override // h1.AbstractC1698a
    public final void y(float f4, float f5) {
        this.f13122o = f4;
        this.f13123p = f5;
        M();
    }
}
