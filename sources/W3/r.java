package W3;

import d3.AbstractC1654b;
import java.util.concurrent.CancellationException;
import m2.AbstractC1806a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final B0.a f2113a = new B0.a("CLOSED_EMPTY", 3);

    /* renamed from: b, reason: collision with root package name */
    public static final B0.a f2114b = new B0.a("COMPLETING_ALREADY", 3);
    public static final B0.a c = new B0.a("COMPLETING_WAITING_CHILDREN", 3);
    public static final B0.a d = new B0.a("COMPLETING_RETRY", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final B0.a f2115e = new B0.a("TOO_LATE_TO_CANCEL", 3);

    /* renamed from: f, reason: collision with root package name */
    public static final B0.a f2116f = new B0.a("SEALED", 3);

    /* renamed from: g, reason: collision with root package name */
    public static final C0146z f2117g = new C0146z(false);

    /* renamed from: h, reason: collision with root package name */
    public static final C0146z f2118h = new C0146z(true);

    public static final Y3.d a(L3.i iVar) {
        if (iVar.b(C0135n.f2110p) == null) {
            iVar = iVar.e(new P());
        }
        return new Y3.d(iVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C0141u b(Y3.d dVar, R3.o oVar) {
        L3.i e4;
        L3.i iVar = dVar.f2225o;
        Boolean bool = Boolean.FALSE;
        boolean booleanValue = ((Boolean) iVar.d(bool, C0132k.f2103r)).booleanValue();
        boolean booleanValue2 = bool.booleanValue();
        int i4 = 2;
        L3.j jVar = L3.j.f1101o;
        if (booleanValue || booleanValue2) {
            L3.i iVar2 = (L3.i) iVar.d(jVar, new C0132k(i4, 3));
            Object obj = jVar;
            if (booleanValue2) {
                obj = jVar.d(jVar, C0132k.f2102q);
            }
            e4 = iVar2.e((L3.i) obj);
        } else {
            e4 = iVar.e(jVar);
        }
        Z3.e eVar = AbstractC0144x.f2124a;
        if (e4 != eVar && e4.b(L3.e.f1100o) == null) {
            e4 = e4.e(eVar);
        }
        C0141u c0141u = new C0141u(e4, true);
        int ordinal = EnumC0137p.f2111o.ordinal();
        if (ordinal == 0) {
            try {
                Y3.a.c(AbstractC1806a.B(((N3.b) oVar).e(c0141u)));
                return c0141u;
            } finally {
                c0141u.c(AbstractC1806a.h(th));
            }
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                AbstractC1806a.B(((N3.b) oVar).e(c0141u)).c(J3.f.f1032a);
            } else {
                if (ordinal != 3) {
                    throw new RuntimeException();
                }
                try {
                    L3.i iVar3 = c0141u.f2122q;
                    Object f4 = Y3.a.f(iVar3, null);
                    try {
                        N3.g gVar = (N3.g) oVar;
                        if (gVar.a() != 2) {
                            ClassCastException classCastException = new ClassCastException(gVar.getClass().getName().concat(" cannot be cast to kotlin.jvm.functions.Function2"));
                            S3.e.f(classCastException, S3.k.class.getName());
                            throw classCastException;
                        }
                        Object d4 = oVar.d(c0141u, c0141u);
                        if (d4 != M3.a.f1150o) {
                            c0141u.c(d4);
                            return c0141u;
                        }
                    } finally {
                        Y3.a.b(iVar3, f4);
                    }
                } catch (Throwable th) {
                    return c0141u;
                }
            }
        }
        return c0141u;
    }

    public static final void c(L3.i iVar, CancellationException cancellationException) {
        M m4 = (M) iVar.b(C0135n.f2110p);
        if (m4 != null) {
            ((W) m4).h(cancellationException);
        }
    }

    public static final String d(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final void e(L3.i iVar, Throwable th) {
        try {
            X3.b bVar = (X3.b) iVar.b(C0135n.f2109o);
            if (bVar != null) {
                bVar.g(th);
            } else {
                Y3.a.a(iVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                AbstractC1654b.b(runtimeException, th);
                th = runtimeException;
            }
            Y3.a.a(iVar, th);
        }
    }

    public static InterfaceC0145y f(M m4, boolean z4, S s4, int i4) {
        if ((i4 & 1) != 0) {
            z4 = false;
        }
        boolean z5 = (i4 & 2) != 0;
        if (m4 instanceof W) {
            return ((W) m4).s(z4, z5, s4);
        }
        Q q4 = new Q(s4);
        W w2 = (W) m4;
        w2.getClass();
        return w2.s(z4, z5, new I(q4));
    }

    public static final void g(C0124c c0124c, L3.d dVar, boolean z4) {
        Object obj = C0124c.f2090u.get(c0124c);
        Throwable e4 = c0124c.e(obj);
        Object h4 = e4 != null ? AbstractC1806a.h(e4) : c0124c.f(obj);
        if (!z4) {
            dVar.c(h4);
            return;
        }
        S3.e.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        Y3.g gVar = (Y3.g) dVar;
        N3.b bVar = gVar.f2230s;
        Object obj2 = gVar.f2232u;
        L3.i iVar = bVar.f1232p;
        S3.e.b(iVar);
        Object f4 = Y3.a.f(iVar, obj2);
        if (f4 != Y3.a.f2222e) {
            i(bVar, iVar);
        }
        try {
            bVar.c(h4);
        } finally {
            Y3.a.b(iVar, f4);
        }
    }

    public static final String h(L3.d dVar) {
        Object h4;
        if (dVar instanceof Y3.g) {
            return dVar.toString();
        }
        try {
            h4 = dVar + '@' + d(dVar);
        } catch (Throwable th) {
            h4 = AbstractC1806a.h(th);
        }
        if (J3.e.a(h4) != null) {
            h4 = dVar.getClass().getName() + '@' + d(dVar);
        }
        return (String) h4;
    }

    public static final void i(L3.d dVar, L3.i iVar) {
        if ((dVar instanceof N3.c) && iVar.b(d0.f2095o) != null) {
            N3.c cVar = (N3.c) dVar;
            do {
                cVar = cVar.b();
            } while (cVar != null);
        }
    }
}
