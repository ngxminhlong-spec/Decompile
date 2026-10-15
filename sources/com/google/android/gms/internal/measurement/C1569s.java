package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.C0831kn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.measurement.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1569s {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f12012a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12013b;

    public C1569s(int i4) {
        this.f12013b = i4;
    }

    public static C1546m c(u0.g gVar, List list) {
        EnumC1581v enumC1581v = EnumC1581v.f12075p;
        AbstractC1515f1.C("FN", 2, list);
        InterfaceC1550n x4 = ((C0831kn) gVar.f14984q).x(gVar, (InterfaceC1550n) list.get(0));
        InterfaceC1550n x5 = ((C0831kn) gVar.f14984q).x(gVar, (InterfaceC1550n) list.get(1));
        if (!(x5 instanceof C1503d)) {
            throw new IllegalArgumentException(n0.a.k("FN requires an ArrayValue of parameter names found ", x5.getClass().getCanonicalName()));
        }
        ArrayList s4 = ((C1503d) x5).s();
        List arrayList = new ArrayList();
        if (list.size() > 2) {
            arrayList = list.subList(2, list.size());
        }
        return new C1546m(x4.g(), s4, arrayList, gVar);
    }

    public static InterfaceC1550n d(InterfaceC1577u interfaceC1577u, Iterator it, InterfaceC1550n interfaceC1550n) {
        if (it != null) {
            while (it.hasNext()) {
                InterfaceC1550n w2 = interfaceC1577u.q((InterfaceC1550n) it.next()).w((C1503d) interfaceC1550n);
                if (w2 instanceof C1513f) {
                    C1513f c1513f = (C1513f) w2;
                    String str = c1513f.f11930p;
                    if ("break".equals(str)) {
                        return InterfaceC1550n.f11977e;
                    }
                    if ("return".equals(str)) {
                        return c1513f;
                    }
                }
            }
        }
        return InterfaceC1550n.f11977e;
    }

    public static boolean e(InterfaceC1550n interfaceC1550n, InterfaceC1550n interfaceC1550n2) {
        if (interfaceC1550n.getClass().equals(interfaceC1550n2.getClass())) {
            if ((interfaceC1550n instanceof r) || (interfaceC1550n instanceof C1542l)) {
                return true;
            }
            return interfaceC1550n instanceof C1518g ? (Double.isNaN(interfaceC1550n.f().doubleValue()) || Double.isNaN(interfaceC1550n2.f().doubleValue()) || interfaceC1550n.f().doubleValue() != interfaceC1550n2.f().doubleValue()) ? false : true : interfaceC1550n instanceof C1562q ? interfaceC1550n.g().equals(interfaceC1550n2.g()) : interfaceC1550n instanceof C1508e ? interfaceC1550n.h().equals(interfaceC1550n2.h()) : interfaceC1550n == interfaceC1550n2;
        }
        if (((interfaceC1550n instanceof r) || (interfaceC1550n instanceof C1542l)) && ((interfaceC1550n2 instanceof r) || (interfaceC1550n2 instanceof C1542l))) {
            return true;
        }
        boolean z4 = interfaceC1550n instanceof C1518g;
        if (z4 && (interfaceC1550n2 instanceof C1562q)) {
            return e(interfaceC1550n, new C1518g(interfaceC1550n2.f()));
        }
        boolean z5 = interfaceC1550n instanceof C1562q;
        if ((!z5 || !(interfaceC1550n2 instanceof C1518g)) && !(interfaceC1550n instanceof C1508e)) {
            if (interfaceC1550n2 instanceof C1508e) {
                return e(interfaceC1550n, new C1518g(interfaceC1550n2.f()));
            }
            if ((z5 || z4) && (interfaceC1550n2 instanceof InterfaceC1533j)) {
                return e(interfaceC1550n, new C1562q(interfaceC1550n2.g()));
            }
            if ((interfaceC1550n instanceof InterfaceC1533j) && ((interfaceC1550n2 instanceof C1562q) || (interfaceC1550n2 instanceof C1518g))) {
                return e(new C1562q(interfaceC1550n.g()), interfaceC1550n2);
            }
            return false;
        }
        return e(new C1518g(interfaceC1550n.f()), interfaceC1550n2);
    }

    public static boolean f(InterfaceC1550n interfaceC1550n, InterfaceC1550n interfaceC1550n2) {
        if (interfaceC1550n instanceof InterfaceC1533j) {
            interfaceC1550n = new C1562q(interfaceC1550n.g());
        }
        if (interfaceC1550n2 instanceof InterfaceC1533j) {
            interfaceC1550n2 = new C1562q(interfaceC1550n2.g());
        }
        if ((interfaceC1550n instanceof C1562q) && (interfaceC1550n2 instanceof C1562q)) {
            return ((C1562q) interfaceC1550n).f12003o.compareTo(((C1562q) interfaceC1550n2).f12003o) < 0;
        }
        double doubleValue = interfaceC1550n.f().doubleValue();
        double doubleValue2 = interfaceC1550n2.f().doubleValue();
        return (Double.isNaN(doubleValue) || Double.isNaN(doubleValue2) || (doubleValue == 0.0d && doubleValue2 == 0.0d) || ((doubleValue == 0.0d && doubleValue2 == 0.0d) || Double.compare(doubleValue, doubleValue2) >= 0)) ? false : true;
    }

    public static InterfaceC1550n g(InterfaceC1577u interfaceC1577u, InterfaceC1550n interfaceC1550n, InterfaceC1550n interfaceC1550n2) {
        if (interfaceC1550n instanceof Iterable) {
            return d(interfaceC1577u, ((Iterable) interfaceC1550n).iterator(), interfaceC1550n2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    public static boolean h(InterfaceC1550n interfaceC1550n, InterfaceC1550n interfaceC1550n2) {
        if (interfaceC1550n instanceof InterfaceC1533j) {
            interfaceC1550n = new C1562q(interfaceC1550n.g());
        }
        if (interfaceC1550n2 instanceof InterfaceC1533j) {
            interfaceC1550n2 = new C1562q(interfaceC1550n2.g());
        }
        return (((interfaceC1550n instanceof C1562q) && (interfaceC1550n2 instanceof C1562q)) || !(Double.isNaN(interfaceC1550n.f().doubleValue()) || Double.isNaN(interfaceC1550n2.f().doubleValue()))) && !f(interfaceC1550n2, interfaceC1550n);
    }

    /* JADX WARN: Code restructure failed: missing block: B:358:0x091b, code lost:
    
        if ("return".equals(r4) != false) goto L301;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:532:0x0c96. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.measurement.InterfaceC1550n a(java.lang.String r12, u0.g r13, java.util.ArrayList r14) {
        /*
            Method dump skipped, instructions count: 3874
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1569s.a(java.lang.String, u0.g, java.util.ArrayList):com.google.android.gms.internal.measurement.n");
    }

    public final void b(String str) {
        if (!this.f12012a.contains(AbstractC1515f1.u(str))) {
            throw new IllegalArgumentException("Command not supported");
        }
        throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
    }
}
