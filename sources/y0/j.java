package y0;

import c3.InterfaceFutureC0239a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class j extends h {
    public final boolean i(Object obj) {
        if (obj == null) {
            obj = h.f15902u;
        }
        if (!h.f15901t.d(this, null, obj)) {
            return false;
        }
        h.c(this);
        return true;
    }

    public final boolean j(Throwable th) {
        if (!h.f15901t.d(this, null, new b(th))) {
            return false;
        }
        h.c(this);
        return true;
    }

    public final boolean k(InterfaceFutureC0239a interfaceFutureC0239a) {
        b bVar;
        interfaceFutureC0239a.getClass();
        Object obj = this.f15903o;
        if (obj == null) {
            if (interfaceFutureC0239a.isDone()) {
                if (h.f15901t.d(this, null, h.f(interfaceFutureC0239a))) {
                    h.c(this);
                    return true;
                }
                return false;
            }
            e eVar = new e(this, interfaceFutureC0239a);
            if (h.f15901t.d(this, null, eVar)) {
                try {
                    interfaceFutureC0239a.a(eVar, i.f15906o);
                    return true;
                } catch (Throwable th) {
                    try {
                        bVar = new b(th);
                    } catch (Throwable unused) {
                        bVar = b.f15886b;
                    }
                    h.f15901t.d(this, eVar, bVar);
                    return true;
                }
            }
            obj = this.f15903o;
        }
        if (obj instanceof C2116a) {
            interfaceFutureC0239a.cancel(((C2116a) obj).f15884a);
        }
        return false;
    }
}
