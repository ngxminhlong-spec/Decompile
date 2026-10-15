package x2;

import com.google.android.gms.internal.measurement.C1529i0;
import com.google.android.gms.internal.measurement.C1559p0;
import com.google.android.gms.internal.measurement.C1598z0;
import com.google.android.gms.internal.measurement.S2;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import r.C1965b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f15645a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f15646b;
    public final com.google.android.gms.internal.measurement.P0 c;
    public final BitSet d;

    /* renamed from: e, reason: collision with root package name */
    public final BitSet f15647e;

    /* renamed from: f, reason: collision with root package name */
    public final r.e f15648f;

    /* renamed from: g, reason: collision with root package name */
    public final r.e f15649g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C2063b f15650h;

    /* JADX WARN: Type inference failed for: r1v4, types: [r.e, r.i] */
    /* JADX WARN: Type inference failed for: r1v5, types: [r.e, r.i] */
    public e1(C2063b c2063b, String str) {
        this.f15650h = c2063b;
        this.f15645a = str;
        this.f15646b = true;
        this.d = new BitSet();
        this.f15647e = new BitSet();
        this.f15648f = new r.i(0);
        this.f15649g = new r.i(0);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [r.e, r.i] */
    public e1(C2063b c2063b, String str, com.google.android.gms.internal.measurement.P0 p02, BitSet bitSet, BitSet bitSet2, r.e eVar, r.e eVar2) {
        this.f15650h = c2063b;
        this.f15645a = str;
        this.d = bitSet;
        this.f15647e = bitSet2;
        this.f15648f = eVar;
        this.f15649g = new r.i(0);
        Iterator it = ((C1965b) eVar2.keySet()).iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) eVar2.get(num));
            this.f15649g.put(num, arrayList);
        }
        this.f15646b = false;
        this.c = p02;
    }

    public final com.google.android.gms.internal.measurement.A0 a(int i4) {
        ArrayList arrayList;
        List list;
        C1598z0 m4 = com.google.android.gms.internal.measurement.A0.m();
        if (m4.f11740q) {
            m4.f();
            m4.f11740q = false;
        }
        com.google.android.gms.internal.measurement.A0.p((com.google.android.gms.internal.measurement.A0) m4.f11739p, i4);
        if (m4.f11740q) {
            m4.f();
            m4.f11740q = false;
        }
        com.google.android.gms.internal.measurement.A0.s((com.google.android.gms.internal.measurement.A0) m4.f11739p, this.f15646b);
        com.google.android.gms.internal.measurement.P0 p02 = this.c;
        if (p02 != null) {
            if (m4.f11740q) {
                m4.f();
                m4.f11740q = false;
            }
            com.google.android.gms.internal.measurement.A0.r((com.google.android.gms.internal.measurement.A0) m4.f11739p, p02);
        }
        com.google.android.gms.internal.measurement.O0 q4 = com.google.android.gms.internal.measurement.P0.q();
        ArrayList J4 = O.J(this.d);
        if (q4.f11740q) {
            q4.f();
            q4.f11740q = false;
        }
        com.google.android.gms.internal.measurement.P0.z((com.google.android.gms.internal.measurement.P0) q4.f11739p, J4);
        ArrayList J5 = O.J(this.f15647e);
        if (q4.f11740q) {
            q4.f();
            q4.f11740q = false;
        }
        com.google.android.gms.internal.measurement.P0.x((com.google.android.gms.internal.measurement.P0) q4.f11739p, J5);
        r.e eVar = this.f15648f;
        if (eVar == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(eVar.f14741q);
            Iterator it = ((C1965b) eVar.keySet()).iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int intValue = num.intValue();
                Long l4 = (Long) eVar.get(num);
                if (l4 != null) {
                    com.google.android.gms.internal.measurement.B0 n4 = com.google.android.gms.internal.measurement.C0.n();
                    if (n4.f11740q) {
                        n4.f();
                        n4.f11740q = false;
                    }
                    com.google.android.gms.internal.measurement.C0.o((com.google.android.gms.internal.measurement.C0) n4.f11739p, intValue);
                    long longValue = l4.longValue();
                    if (n4.f11740q) {
                        n4.f();
                        n4.f11740q = false;
                    }
                    com.google.android.gms.internal.measurement.C0.p((com.google.android.gms.internal.measurement.C0) n4.f11739p, longValue);
                    arrayList2.add((com.google.android.gms.internal.measurement.C0) n4.d());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            if (q4.f11740q) {
                q4.f();
                q4.f11740q = false;
            }
            com.google.android.gms.internal.measurement.P0.B((com.google.android.gms.internal.measurement.P0) q4.f11739p, arrayList);
        }
        r.e eVar2 = this.f15649g;
        if (eVar2 == null) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList3 = new ArrayList(eVar2.f14741q);
            Iterator it2 = ((C1965b) eVar2.keySet()).iterator();
            while (it2.hasNext()) {
                Integer num2 = (Integer) it2.next();
                com.google.android.gms.internal.measurement.Q0 o4 = com.google.android.gms.internal.measurement.R0.o();
                int intValue2 = num2.intValue();
                if (o4.f11740q) {
                    o4.f();
                    o4.f11740q = false;
                }
                com.google.android.gms.internal.measurement.R0.q((com.google.android.gms.internal.measurement.R0) o4.f11739p, intValue2);
                List list2 = (List) eVar2.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    if (o4.f11740q) {
                        o4.f();
                        o4.f11740q = false;
                    }
                    com.google.android.gms.internal.measurement.R0.r((com.google.android.gms.internal.measurement.R0) o4.f11739p, list2);
                }
                arrayList3.add((com.google.android.gms.internal.measurement.R0) o4.d());
            }
            list = arrayList3;
        }
        List list3 = list;
        if (q4.f11740q) {
            q4.f();
            q4.f11740q = false;
        }
        com.google.android.gms.internal.measurement.P0.E((com.google.android.gms.internal.measurement.P0) q4.f11739p, list3);
        if (m4.f11740q) {
            m4.f();
            m4.f11740q = false;
        }
        com.google.android.gms.internal.measurement.A0.q((com.google.android.gms.internal.measurement.A0) m4.f11739p, (com.google.android.gms.internal.measurement.P0) q4.d());
        return (com.google.android.gms.internal.measurement.A0) m4.d();
    }

    public final void b(f1 f1Var) {
        int m4;
        boolean z4;
        boolean x4;
        C2066c0 c2066c0 = (C2066c0) this.f15650h.f1719a;
        switch (f1Var.f15661g) {
            case 0:
                m4 = ((C1529i0) f1Var.f15663i).m();
                break;
            default:
                m4 = ((C1559p0) f1Var.f15663i).l();
                break;
        }
        Boolean bool = f1Var.c;
        if (bool != null) {
            this.f15647e.set(m4, bool.booleanValue());
        }
        Boolean bool2 = f1Var.d;
        if (bool2 != null) {
            this.d.set(m4, bool2.booleanValue());
        }
        if (f1Var.f15659e != null) {
            Integer valueOf = Integer.valueOf(m4);
            r.e eVar = this.f15648f;
            Long l4 = (Long) eVar.get(valueOf);
            long longValue = f1Var.f15659e.longValue() / 1000;
            if (l4 == null || longValue > l4.longValue()) {
                eVar.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (f1Var.f15660f != null) {
            Integer valueOf2 = Integer.valueOf(m4);
            r.e eVar2 = this.f15649g;
            List list = (List) eVar2.get(valueOf2);
            if (list == null) {
                list = new ArrayList();
                eVar2.put(valueOf2, list);
            }
            switch (f1Var.f15661g) {
                case 0:
                    z4 = false;
                    break;
                default:
                    z4 = true;
                    break;
            }
            if (z4) {
                list.clear();
            }
            S2.a();
            C2073g c2073g = c2066c0.f15566g;
            C2060A c2060a = B.f15285W;
            String str = this.f15645a;
            if (c2073g.p(str, c2060a)) {
                switch (f1Var.f15661g) {
                    case 0:
                        x4 = ((C1529i0) f1Var.f15663i).x();
                        break;
                    default:
                        x4 = false;
                        break;
                }
                if (x4) {
                    list.clear();
                }
            }
            S2.a();
            if (!c2066c0.f15566g.p(str, c2060a)) {
                list.add(Long.valueOf(f1Var.f15660f.longValue() / 1000));
                return;
            }
            Long valueOf3 = Long.valueOf(f1Var.f15660f.longValue() / 1000);
            if (list.contains(valueOf3)) {
                return;
            }
            list.add(valueOf3);
        }
    }
}
