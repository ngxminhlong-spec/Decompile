package W3;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: W3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0126e extends O {

    /* renamed from: e, reason: collision with root package name */
    public final C0124c f2096e;

    public C0126e(C0124c c0124c) {
        this.f2096e = c0124c;
    }

    @Override // W3.J
    public final void d(Throwable th) {
        CancellationException m4 = k().m();
        C0124c c0124c = this.f2096e;
        if (c0124c.n()) {
            L3.d dVar = c0124c.f2092r;
            S3.e.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            Y3.g gVar = (Y3.g) dVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Y3.g.f2228v;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(gVar);
                B0.a aVar = Y3.a.c;
                if (!S3.e.a(obj, aVar)) {
                    if (obj instanceof Throwable) {
                        return;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(gVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(gVar) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(gVar, aVar, m4)) {
                    if (atomicReferenceFieldUpdater.get(gVar) != aVar) {
                        break;
                    }
                }
                return;
            }
        }
        c0124c.i(m4);
        if (c0124c.n()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0124c.f2091v;
        InterfaceC0145y interfaceC0145y = (InterfaceC0145y) atomicReferenceFieldUpdater2.get(c0124c);
        if (interfaceC0145y == null) {
            return;
        }
        interfaceC0145y.b();
        atomicReferenceFieldUpdater2.set(c0124c, Y.f2085a);
    }
}
