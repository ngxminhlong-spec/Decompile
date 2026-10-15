package W3;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: W3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0124c extends AbstractC0143w implements L3.d, N3.c {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2089t = AtomicIntegerFieldUpdater.newUpdater(C0124c.class, "_decisionAndIndex$volatile");

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2090u = AtomicReferenceFieldUpdater.newUpdater(C0124c.class, Object.class, "_state$volatile");

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2091v = AtomicReferenceFieldUpdater.newUpdater(C0124c.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: r, reason: collision with root package name */
    public final L3.d f2092r;

    /* renamed from: s, reason: collision with root package name */
    public final L3.i f2093s;

    public C0124c(L3.d dVar) {
        super(1);
        this.f2092r = dVar;
        this.f2093s = dVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C0122a.f2086a;
    }

    @Override // W3.AbstractC0143w
    public final void a(Object obj, CancellationException cancellationException) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2090u;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof C0122a) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof C0130i) {
                return;
            }
            if (!(obj2 instanceof C0129h)) {
                C0129h c0129h = new C0129h(obj2, null, null, cancellationException);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0129h)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            C0129h c0129h2 = (C0129h) obj2;
            R3.k kVar = c0129h2.f2099b;
            if (c0129h2.d != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            C0129h c0129h3 = new C0129h(c0129h2.f2098a, kVar, c0129h2.c, cancellationException);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0129h3)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (kVar != null) {
                try {
                    kVar.b(cancellationException);
                    return;
                } catch (Throwable th) {
                    r.e(this.f2093s, new RuntimeException("Exception in resume onCancellation handler for " + this, th));
                    return;
                }
            }
            return;
        }
    }

    @Override // N3.c
    public final N3.c b() {
        L3.d dVar = this.f2092r;
        if (dVar instanceof N3.c) {
            return (N3.c) dVar;
        }
        return null;
    }

    @Override // L3.d
    public final void c(Object obj) {
        Throwable a4 = J3.e.a(obj);
        if (a4 != null) {
            obj = new C0130i(a4);
        }
        int i4 = this.f2123q;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2090u;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof C0122a)) {
                if (obj2 instanceof C0125d) {
                    if (C0125d.c.compareAndSet((C0125d) obj2, 0, 1)) {
                        return;
                    }
                }
                throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, obj)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!n()) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f2091v;
                InterfaceC0145y interfaceC0145y = (InterfaceC0145y) atomicReferenceFieldUpdater2.get(this);
                if (interfaceC0145y != null) {
                    interfaceC0145y.b();
                    atomicReferenceFieldUpdater2.set(this, Y.f2085a);
                }
            }
            j(i4);
            return;
        }
    }

    @Override // W3.AbstractC0143w
    public final L3.d d() {
        return this.f2092r;
    }

    @Override // W3.AbstractC0143w
    public final Throwable e(Object obj) {
        Throwable e4 = super.e(obj);
        if (e4 != null) {
            return e4;
        }
        return null;
    }

    @Override // W3.AbstractC0143w
    public final Object f(Object obj) {
        return obj instanceof C0129h ? ((C0129h) obj).f2098a : obj;
    }

    @Override // L3.d
    public final L3.i getContext() {
        return this.f2093s;
    }

    @Override // W3.AbstractC0143w
    public final Object h() {
        return f2090u.get(this);
    }

    public final void i(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2090u;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C0122a) {
                C0125d c0125d = new C0125d(this, th);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0125d)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                if (!n()) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f2091v;
                    InterfaceC0145y interfaceC0145y = (InterfaceC0145y) atomicReferenceFieldUpdater2.get(this);
                    if (interfaceC0145y != null) {
                        interfaceC0145y.b();
                        atomicReferenceFieldUpdater2.set(this, Y.f2085a);
                    }
                }
                j(this.f2123q);
                return;
            }
            return;
        }
    }

    public final void j(int i4) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i5;
        do {
            atomicIntegerFieldUpdater = f2089t;
            i5 = atomicIntegerFieldUpdater.get(this);
            int i6 = i5 >> 29;
            if (i6 != 0) {
                if (i6 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z4 = i4 == 4;
                L3.d dVar = this.f2092r;
                if (!z4 && (dVar instanceof Y3.g)) {
                    boolean z5 = i4 == 1 || i4 == 2;
                    int i7 = this.f2123q;
                    if (z5 == (i7 == 1 || i7 == 2)) {
                        Y3.g gVar = (Y3.g) dVar;
                        AbstractC0134m abstractC0134m = gVar.f2229r;
                        L3.i iVar = gVar.f2230s.f1232p;
                        S3.e.b(iVar);
                        if (abstractC0134m.h()) {
                            abstractC0134m.g(iVar, this);
                            return;
                        }
                        C a4 = b0.a();
                        if (a4.f2062q >= 4294967296L) {
                            K3.a aVar = a4.f2064s;
                            if (aVar == null) {
                                aVar = new K3.a();
                                a4.f2064s = aVar;
                            }
                            aVar.addLast(this);
                            return;
                        }
                        a4.k(true);
                        try {
                            r.g(this, dVar, true);
                            do {
                            } while (a4.l());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                }
                r.g(this, dVar, z4);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i5, 1073741824 + (536870911 & i5)));
    }

    public final Object k() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i4;
        M m4;
        boolean n4 = n();
        do {
            atomicIntegerFieldUpdater = f2089t;
            i4 = atomicIntegerFieldUpdater.get(this);
            int i5 = i4 >> 29;
            if (i5 != 0) {
                if (i5 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (n4) {
                    o();
                }
                Object obj = f2090u.get(this);
                if (obj instanceof C0130i) {
                    throw ((C0130i) obj).f2101a;
                }
                int i6 = this.f2123q;
                if ((i6 != 1 && i6 != 2) || (m4 = (M) this.f2093s.b(C0135n.f2110p)) == null || m4.a()) {
                    return f(obj);
                }
                CancellationException m5 = ((W) m4).m();
                a(obj, m5);
                throw m5;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i4, 536870912 + (536870911 & i4)));
        if (((InterfaceC0145y) f2091v.get(this)) == null) {
            m();
        }
        if (n4) {
            o();
        }
        return M3.a.f1150o;
    }

    public final void l() {
        InterfaceC0145y m4 = m();
        if (m4 == null || (f2090u.get(this) instanceof C0122a)) {
            return;
        }
        m4.b();
        f2091v.set(this, Y.f2085a);
    }

    public final InterfaceC0145y m() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        M m4 = (M) this.f2093s.b(C0135n.f2110p);
        if (m4 == null) {
            return null;
        }
        InterfaceC0145y f4 = r.f(m4, true, new C0126e(this), 2);
        do {
            atomicReferenceFieldUpdater = f2091v;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, f4)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return f4;
    }

    public final boolean n() {
        if (this.f2123q != 2) {
            return false;
        }
        L3.d dVar = this.f2092r;
        S3.e.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return Y3.g.f2228v.get((Y3.g) dVar) != null;
    }

    public final void o() {
        L3.d dVar = this.f2092r;
        Throwable th = null;
        Y3.g gVar = dVar instanceof Y3.g ? (Y3.g) dVar : null;
        if (gVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Y3.g.f2228v;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(gVar);
                B0.a aVar = Y3.a.c;
                if (obj != aVar) {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(gVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(gVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(gVar, aVar, this)) {
                    if (atomicReferenceFieldUpdater.get(gVar) != aVar) {
                        break;
                    }
                }
            }
            if (th == null) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f2091v;
            InterfaceC0145y interfaceC0145y = (InterfaceC0145y) atomicReferenceFieldUpdater2.get(this);
            if (interfaceC0145y != null) {
                interfaceC0145y.b();
                atomicReferenceFieldUpdater2.set(this, Y.f2085a);
            }
            i(th);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CancellableContinuation(");
        sb.append(r.h(this.f2092r));
        sb.append("){");
        Object obj = f2090u.get(this);
        sb.append(obj instanceof C0122a ? "Active" : obj instanceof C0125d ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(r.d(this));
        return sb.toString();
    }
}
