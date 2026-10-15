package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class EC {

    /* renamed from: a, reason: collision with root package name */
    public final C0474cD f4856a;

    /* renamed from: e, reason: collision with root package name */
    public final C1029pC f4858e;

    /* renamed from: h, reason: collision with root package name */
    public final VC f4861h;

    /* renamed from: i, reason: collision with root package name */
    public final C1135rr f4862i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4863j;

    /* renamed from: k, reason: collision with root package name */
    public NB f4864k;

    /* renamed from: l, reason: collision with root package name */
    public NE f4865l = new NE();
    public final IdentityHashMap c = new IdentityHashMap();
    public final HashMap d = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f4857b = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f4859f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final HashSet f4860g = new HashSet();

    public EC(C1029pC c1029pC, VC vc, C1135rr c1135rr, C0474cD c0474cD) {
        this.f4856a = c0474cD;
        this.f4858e = c1029pC;
        this.f4861h = vc;
        this.f4862i = c1135rr;
    }

    public final AbstractC0484ch a() {
        ArrayList arrayList = this.f4857b;
        if (arrayList.isEmpty()) {
            return AbstractC0484ch.f8374a;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            DC dc = (DC) arrayList.get(i5);
            dc.d = i4;
            i4 += dc.f4595a.f9961o.f9283b.c();
        }
        return new JC(arrayList, this.f4865l);
    }

    public final AbstractC0484ch b(int i4, int i5, List list) {
        ArrayList arrayList = this.f4857b;
        Zf.O(i4 >= 0 && i4 <= i5 && i5 <= arrayList.size());
        Zf.O(list.size() == i5 - i4);
        for (int i6 = i4; i6 < i5; i6++) {
            ((DC) arrayList.get(i6)).f4595a.p((Z9) list.get(i6 - i4));
        }
        return a();
    }

    public final void c(NB nb) {
        Zf.X(!this.f4863j);
        this.f4864k = nb;
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f4857b;
            if (i4 >= arrayList.size()) {
                this.f4863j = true;
                return;
            }
            DC dc = (DC) arrayList.get(i4);
            l(dc);
            this.f4860g.add(dc);
            i4++;
        }
    }

    public final void d(InterfaceC1159sE interfaceC1159sE) {
        IdentityHashMap identityHashMap = this.c;
        DC dc = (DC) identityHashMap.remove(interfaceC1159sE);
        dc.getClass();
        dc.f4595a.a(interfaceC1159sE);
        dc.c.remove(((C0902mE) interfaceC1159sE).f9605o);
        if (!identityHashMap.isEmpty()) {
            j();
        }
        k(dc);
    }

    public final boolean e() {
        return this.f4863j;
    }

    public final AbstractC0484ch f(int i4, List list, NE ne) {
        if (!list.isEmpty()) {
            this.f4865l = ne;
            for (int i5 = i4; i5 < list.size() + i4; i5++) {
                DC dc = (DC) list.get(i5 - i4);
                ArrayList arrayList = this.f4857b;
                if (i5 > 0) {
                    DC dc2 = (DC) arrayList.get(i5 - 1);
                    dc.d = dc2.f4595a.f9961o.f9283b.c() + dc2.d;
                    dc.f4597e = false;
                    dc.c.clear();
                } else {
                    dc.d = 0;
                    dc.f4597e = false;
                    dc.c.clear();
                }
                int c = dc.f4595a.f9961o.f9283b.c();
                for (int i6 = i5; i6 < arrayList.size(); i6++) {
                    ((DC) arrayList.get(i6)).d += c;
                }
                arrayList.add(i5, dc);
                this.d.put(dc.f4596b, dc);
                if (this.f4863j) {
                    l(dc);
                    if (this.c.isEmpty()) {
                        this.f4860g.add(dc);
                    } else {
                        CC cc = (CC) this.f4859f.get(dc);
                        if (cc != null) {
                            cc.f4409a.e(cc.f4410b);
                        }
                    }
                }
            }
        }
        return a();
    }

    public final AbstractC0484ch g(int i4, int i5, NE ne) {
        boolean z4 = false;
        if (i4 >= 0 && i4 <= i5 && i5 <= this.f4857b.size()) {
            z4 = true;
        }
        Zf.O(z4);
        this.f4865l = ne;
        m(i4, i5);
        return a();
    }

    public final AbstractC0484ch h(List list, NE ne) {
        ArrayList arrayList = this.f4857b;
        m(0, arrayList.size());
        return f(arrayList.size(), list, ne);
    }

    public final AbstractC0484ch i(NE ne) {
        int size = this.f4857b.size();
        if (ne.f6315b.length != size) {
            ne = new NE(new Random(ne.f6314a.nextLong())).a(size);
        }
        this.f4865l = ne;
        return a();
    }

    public final void j() {
        Iterator it = this.f4860g.iterator();
        while (it.hasNext()) {
            DC dc = (DC) it.next();
            if (dc.c.isEmpty()) {
                CC cc = (CC) this.f4859f.get(dc);
                if (cc != null) {
                    cc.f4409a.e(cc.f4410b);
                }
                it.remove();
            }
        }
    }

    public final void k(DC dc) {
        if (dc.f4597e && dc.c.isEmpty()) {
            CC cc = (CC) this.f4859f.remove(dc);
            cc.getClass();
            Qw qw = cc.c;
            AbstractC0560eE abstractC0560eE = cc.f4409a;
            abstractC0560eE.l(cc.f4410b);
            abstractC0560eE.o(qw);
            abstractC0560eE.n(qw);
            this.f4860g.remove(dc);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.uE, com.google.android.gms.internal.ads.zC] */
    public final void l(DC dc) {
        C1031pE c1031pE = dc.f4595a;
        ?? r1 = new InterfaceC1245uE() { // from class: com.google.android.gms.internal.ads.zC
            @Override // com.google.android.gms.internal.ads.InterfaceC1245uE
            public final void a(AbstractC0560eE abstractC0560eE, AbstractC0484ch abstractC0484ch) {
                EC.this.f4858e.f9953v.c(22);
            }
        };
        Qw qw = new Qw(2, this, dc);
        this.f4859f.put(dc, new CC(c1031pE, r1, qw));
        int i4 = AbstractC0751is.f9071a;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(myLooper, null);
        C0831kn c0831kn = c1031pE.c;
        c0831kn.getClass();
        ((CopyOnWriteArrayList) c0831kn.f9320q).add(new C1331wE(handler, qw));
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        new Handler(myLooper2, null);
        Qw qw2 = c1031pE.d;
        qw2.getClass();
        ((CopyOnWriteArrayList) qw2.f6711q).add(new DD(qw));
        c1031pE.i(r1, this.f4864k, this.f4856a);
    }

    public final void m(int i4, int i5) {
        while (true) {
            i5--;
            if (i5 < i4) {
                return;
            }
            ArrayList arrayList = this.f4857b;
            DC dc = (DC) arrayList.remove(i5);
            this.d.remove(dc.f4596b);
            int i6 = -dc.f4595a.f9961o.f9283b.c();
            for (int i7 = i5; i7 < arrayList.size(); i7++) {
                ((DC) arrayList.get(i7)).d += i6;
            }
            dc.f4597e = true;
            if (this.f4863j) {
                k(dc);
            }
        }
    }
}
