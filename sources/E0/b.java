package E0;

import I0.c;
import c1.C0232a;
import c1.C0234c;
import e1.C1660a;
import e1.d;
import e1.g;
import h1.AbstractC1698a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import p1.C1932s;
import p1.Q;
import p1.a0;
import p1.j0;
import p1.l0;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f712o;

    /* renamed from: p, reason: collision with root package name */
    public final Object f713p;

    public /* synthetic */ b(int i4, Object obj) {
        this.f712o = i4;
        this.f713p = obj;
    }

    public b(ArrayList arrayList) {
        this.f712o = 1;
        if (arrayList.size() < 2) {
            throw new RuntimeException("Too few connectables");
        }
        this.f713p = arrayList;
    }

    @Override // I0.a
    public final boolean a(d dVar) {
        Boolean bool;
        switch (this.f712o) {
            case 0:
                return ((c) this.f713p).b(dVar);
            case 1:
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) this.f713p;
                int size = arrayList2.size();
                int i4 = 0;
                int i5 = 0;
                while (i5 < size) {
                    Object obj = arrayList2.get(i5);
                    i5++;
                    arrayList.add(((O0.a) obj).i());
                }
                int size2 = arrayList2.size();
                int i6 = 0;
                while (i6 < size2) {
                    Object obj2 = arrayList2.get(i6);
                    i6++;
                    O0.a aVar = (O0.a) obj2;
                    int size3 = arrayList2.size();
                    int i7 = 0;
                    while (i7 < size3) {
                        Object obj3 = arrayList2.get(i7);
                        i7++;
                        O0.a aVar2 = (O0.a) obj3;
                        if (aVar != aVar2) {
                            aVar.c(aVar2);
                        }
                    }
                }
                int size4 = arrayList.size();
                int i8 = 0;
                while (true) {
                    if (i8 < size4) {
                        Object obj4 = arrayList.get(i8);
                        i8++;
                        Boolean bool2 = (Boolean) obj4;
                        if (bool2 != null && bool2.booleanValue()) {
                            bool = Boolean.TRUE;
                        }
                    } else {
                        bool = Boolean.FALSE;
                    }
                }
                int size5 = arrayList2.size();
                while (i4 < size5) {
                    Object obj5 = arrayList2.get(i4);
                    i4++;
                    ((O0.a) obj5).e(bool);
                }
                return true;
            case 2:
                AbstractC1698a abstractC1698a = (AbstractC1698a) this.f713p;
                ArrayList arrayList3 = dVar.f12681P;
                int size6 = arrayList3.size();
                int i9 = 0;
                while (i9 < size6) {
                    Object obj6 = arrayList3.get(i9);
                    i9++;
                    if (((AbstractC1698a) obj6).f13117A == abstractC1698a.f13117A) {
                        throw new RuntimeException();
                    }
                }
                arrayList3.add(abstractC1698a);
                dVar.f12682Q.put(abstractC1698a.f13117A, abstractC1698a);
                return true;
            case 3:
                ((d) this.f713p).P(true);
                return true;
            case 4:
                C1932s c1932s = (C1932s) this.f713p;
                c1932s.f13118B.h(c1932s.f13120D, false);
                return true;
            case 5:
                Q q4 = (Q) this.f713p;
                q4.f14445H.f14420G.remove(q4);
                q4.f14446I.f14420G.remove(q4);
                return true;
            case 6:
                int i10 = 0;
                while (true) {
                    a0 a0Var = (a0) this.f713p;
                    boolean[] zArr = a0Var.f14498Q;
                    if (i10 >= zArr.length) {
                        return true;
                    }
                    if (zArr[i10]) {
                        a0Var.f13118B.o(i10, false);
                    }
                    i10++;
                }
            case 7:
                j0 j0Var = (j0) this.f713p;
                ((g) j0Var.f13118B.f14885t).d(j0Var.f13120D, false);
                return true;
            default:
                l0 l0Var = (l0) this.f713p;
                if (!l0Var.f14562Q) {
                    return true;
                }
                l0Var.f13118B.o(4, false);
                return true;
        }
    }

    @Override // I0.a
    public final boolean b(d dVar) {
        switch (this.f712o) {
            case 0:
                return ((c) this.f713p).a(dVar);
            case 1:
                ArrayList arrayList = (ArrayList) this.f713p;
                int size = arrayList.size();
                int i4 = 0;
                int i5 = 0;
                while (i5 < size) {
                    Object obj = arrayList.get(i5);
                    i5++;
                    O0.a aVar = (O0.a) obj;
                    int size2 = arrayList.size();
                    int i6 = 0;
                    while (i6 < size2) {
                        Object obj2 = arrayList.get(i6);
                        i6++;
                        O0.a aVar2 = (O0.a) obj2;
                        if (aVar != aVar2) {
                            aVar.a(aVar2);
                        }
                    }
                }
                Boolean bool = Boolean.FALSE;
                int size3 = arrayList.size();
                while (i4 < size3) {
                    Object obj3 = arrayList.get(i4);
                    i4++;
                    ((O0.a) obj3).e(bool);
                }
                return true;
            case 2:
                long j4 = ((AbstractC1698a) this.f713p).f13117A;
                ArrayList arrayList2 = dVar.f12681P;
                ArrayList arrayList3 = dVar.f12686U;
                ArrayList arrayList4 = dVar.f12687V;
                HashSet hashSet = dVar.f12689X;
                hashSet.clear();
                ArrayList arrayList5 = dVar.f12690Y;
                arrayList5.clear();
                ArrayList arrayList6 = dVar.f12691Z;
                arrayList6.clear();
                HashMap hashMap = dVar.f12688W;
                for (Map.Entry entry : hashMap.entrySet()) {
                    if (((j1.b) entry.getValue()).f13327o == j4) {
                        hashSet.add((String) entry.getKey());
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    hashMap.remove((String) it.next());
                }
                int size4 = arrayList4.size();
                int i7 = 0;
                int i8 = 0;
                while (i8 < size4) {
                    Object obj4 = arrayList4.get(i8);
                    i8++;
                    C0234c c0234c = (C0234c) obj4;
                    if (hashSet.contains(c0234c.f3546o)) {
                        arrayList5.add(c0234c);
                    }
                }
                arrayList4.removeAll(arrayList5);
                int size5 = arrayList3.size();
                int i9 = 0;
                while (i9 < size5) {
                    Object obj5 = arrayList3.get(i9);
                    i9++;
                    C0232a c0232a = (C0232a) obj5;
                    if (hashSet.contains(c0232a.f3545p.f3546o)) {
                        arrayList6.add(c0232a);
                    }
                }
                arrayList3.removeAll(arrayList6);
                dVar.f12682Q.remove(j4);
                int size6 = arrayList2.size();
                int i10 = 0;
                while (i10 < size6) {
                    Object obj6 = arrayList2.get(i10);
                    i10++;
                    if (((AbstractC1698a) obj6).f13117A == j4) {
                        ((C1660a) dVar.f12683R.f14886u).clear();
                        return true;
                    }
                    i7++;
                }
                ((C1660a) dVar.f12683R.f14886u).clear();
                return true;
            case 3:
                ((d) this.f713p).P(false);
                return true;
            case 4:
                return true;
            case 5:
                Q q4 = (Q) this.f713p;
                q4.f14445H.f14420G.add(q4);
                q4.f14446I.f14420G.add(q4);
                q4.f14449L = true;
                return true;
            case 6:
                return true;
            case 7:
                return true;
            default:
                return true;
        }
    }

    @Override // I0.a
    public final boolean c(d dVar) {
        switch (this.f712o) {
            case 0:
                return ((c) this.f713p).b(dVar);
            case 1:
                a(dVar);
                return true;
            case 2:
                a(dVar);
                return true;
            case 3:
                a(dVar);
                return true;
            case 4:
                a(dVar);
                return true;
            case 5:
                a(dVar);
                return true;
            case 6:
                a(dVar);
                return true;
            case 7:
                a(dVar);
                return true;
            default:
                a(dVar);
                return true;
        }
    }
}
