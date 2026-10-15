package W3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class S extends Y3.j implements J, InterfaceC0145y, G {
    public W d;

    @Override // W3.G
    public final boolean a() {
        return true;
    }

    @Override // W3.InterfaceC0145y
    public final void b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        W k3 = k();
        while (true) {
            Object p3 = k3.p();
            if (p3 instanceof S) {
                if (p3 != this) {
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = W.f2083o;
                C0146z c0146z = r.f2118h;
                while (!atomicReferenceFieldUpdater2.compareAndSet(k3, p3, c0146z)) {
                    if (atomicReferenceFieldUpdater2.get(k3) != p3) {
                        break;
                    }
                }
                return;
            }
            if (!(p3 instanceof G) || ((G) p3).e() == null) {
                return;
            }
            while (true) {
                Object h4 = h();
                if (h4 instanceof Y3.p) {
                    return;
                }
                if (h4 == this) {
                    return;
                }
                S3.e.c(h4, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                Y3.j jVar = (Y3.j) h4;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = Y3.j.c;
                Y3.p pVar = (Y3.p) atomicReferenceFieldUpdater3.get(jVar);
                if (pVar == null) {
                    pVar = new Y3.p(jVar);
                    atomicReferenceFieldUpdater3.set(jVar, pVar);
                }
                do {
                    atomicReferenceFieldUpdater = Y3.j.f2239a;
                    if (atomicReferenceFieldUpdater.compareAndSet(this, h4, pVar)) {
                        jVar.f();
                        return;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == h4);
            }
        }
    }

    @Override // W3.G
    public final X e() {
        return null;
    }

    public final W k() {
        W w2 = this.d;
        if (w2 != null) {
            return w2;
        }
        RuntimeException runtimeException = new RuntimeException("lateinit property job has not been initialized");
        S3.e.f(runtimeException, S3.e.class.getName());
        throw runtimeException;
    }

    @Override // Y3.j
    public final String toString() {
        return getClass().getSimpleName() + '@' + r.d(this) + "[job@" + r.d(k()) + ']';
    }
}
