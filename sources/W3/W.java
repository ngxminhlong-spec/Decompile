package W3;

import d3.AbstractC1654b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class W implements M, Z {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2083o = AtomicReferenceFieldUpdater.newUpdater(W.class, Object.class, "_state$volatile");

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2084p = AtomicReferenceFieldUpdater.newUpdater(W.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public W(boolean z4) {
        this._state$volatile = z4 ? r.f2118h : r.f2117g;
    }

    public static C0128g t(Y3.j jVar) {
        while (jVar.j()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Y3.j.f2240b;
            Y3.j f4 = jVar.f();
            if (f4 == null) {
                Object obj = atomicReferenceFieldUpdater.get(jVar);
                while (true) {
                    jVar = (Y3.j) obj;
                    if (!jVar.j()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(jVar);
                }
            } else {
                jVar = f4;
            }
        }
        while (true) {
            jVar = jVar.i();
            if (!jVar.j()) {
                if (jVar instanceof C0128g) {
                    return (C0128g) jVar;
                }
                if (jVar instanceof X) {
                    return null;
                }
            }
        }
    }

    public static String y(Object obj) {
        if (!(obj instanceof U)) {
            return obj instanceof G ? ((G) obj).a() ? "Active" : "New" : obj instanceof C0130i ? "Cancelled" : "Completed";
        }
        U u2 = (U) obj;
        return u2.d() ? "Cancelling" : u2.f() ? "Completing" : "Active";
    }

    @Override // W3.M
    public boolean a() {
        Object p3 = p();
        return (p3 instanceof G) && ((G) p3).a();
    }

    @Override // L3.i
    public final L3.g b(L3.h hVar) {
        S3.e.e(hVar, "key");
        if (S3.e.a(C0135n.f2110p, hVar)) {
            return this;
        }
        return null;
    }

    @Override // L3.i
    public final Object d(Object obj, R3.o oVar) {
        return oVar.d(obj, this);
    }

    @Override // L3.i
    public final L3.i e(L3.i iVar) {
        return android.support.v4.media.session.a.p(this, iVar);
    }

    @Override // L3.i
    public final L3.i f(L3.h hVar) {
        return android.support.v4.media.session.a.n(this, hVar);
    }

    public final boolean g(G g4, X x4, S s4) {
        Y3.j f4;
        V v4 = new V(s4, this, g4);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Y3.j.f2240b;
            f4 = x4.f();
            if (f4 == null) {
                Object obj = atomicReferenceFieldUpdater.get(x4);
                while (true) {
                    f4 = (Y3.j) obj;
                    if (!f4.j()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(f4);
                }
            }
            Y3.j.f2240b.set(s4, f4);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = Y3.j.f2239a;
            atomicReferenceFieldUpdater2.set(s4, x4);
            v4.c = x4;
            while (!atomicReferenceFieldUpdater2.compareAndSet(f4, x4, v4)) {
                if (atomicReferenceFieldUpdater2.get(f4) != x4) {
                    break;
                }
            }
        }
        return v4.a(f4) == null;
    }

    @Override // L3.g
    public final L3.h getKey() {
        return C0135n.f2110p;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        r0 = W3.r.f2114b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        if (r0 != W3.r.c) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0100, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001d, code lost:
    
        r0 = z(r0, new W3.C0130i(k(r10)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        if (r0 == W3.r.d) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003a, code lost:
    
        if (r0 != W3.r.f2114b) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003c, code lost:
    
        r0 = null;
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003e, code lost:
    
        r4 = p();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0044, code lost:
    
        if ((r4 instanceof W3.U) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008f, code lost:
    
        if ((r4 instanceof W3.G) == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0091, code lost:
    
        if (r1 != null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0093, code lost:
    
        r1 = k(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0097, code lost:
    
        r5 = (W3.G) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0005, code lost:
    
        if ((r9 instanceof W3.P) != false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009e, code lost:
    
        if (r5.a() == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c2, code lost:
    
        r5 = z(r4, new W3.C0130i(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00cd, code lost:
    
        if (r5 == W3.r.f2114b) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d1, code lost:
    
        if (r5 == W3.r.d) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d3, code lost:
    
        r0 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0007, code lost:
    
        r0 = p();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ec, code lost:
    
        throw new java.lang.IllegalStateException(("Cannot happen in " + r4).toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a0, code lost:
    
        r6 = o(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a4, code lost:
    
        if (r6 != null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a7, code lost:
    
        r7 = new W3.U(r6, r1);
        r8 = W3.W.f2083o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b2, code lost:
    
        if (r8.compareAndSet(r9, r5, r7) == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if ((r0 instanceof W3.G) == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00be, code lost:
    
        if (r8.get(r9) == r5) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b4, code lost:
    
        u(r6, r1);
        r10 = W3.r.f2114b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x005c, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ed, code lost:
    
        r10 = W3.r.f2115e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0046, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0052, code lost:
    
        if (W3.U.d.get((W3.U) r4) != W3.r.f2116f) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0054, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0057, code lost:
    
        if (r5 == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0059, code lost:
    
        r10 = W3.r.f2115e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x005b, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0061, code lost:
    
        r5 = ((W3.U) r4).d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
    
        if ((r0 instanceof W3.U) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0068, code lost:
    
        if (r1 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x006a, code lost:
    
        r1 = k(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x006e, code lost:
    
        ((W3.U) r4).b(r1);
        r10 = ((W3.U) r4).c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x007b, code lost:
    
        if (r5 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x007d, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x007e, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x007f, code lost:
    
        if (r0 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0081, code lost:
    
        u(((W3.U) r4).f2080a, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0088, code lost:
    
        r10 = W3.r.f2114b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0056, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00f3, code lost:
    
        if (r0 != W3.r.f2114b) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00f8, code lost:
    
        if (r0 != W3.r.c) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00fd, code lost:
    
        if (r0 != W3.r.f2115e) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00ff, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (((W3.U) r0).f() == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: W3.W.h(java.lang.Object):boolean");
    }

    public String i() {
        return "Job was cancelled";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.RuntimeException, J3.b] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Throwable, J3.b] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, W3.W] */
    public final void j(G g4, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2084p;
        InterfaceC0127f interfaceC0127f = (InterfaceC0127f) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0127f != null) {
            interfaceC0127f.b();
            atomicReferenceFieldUpdater.set(this, Y.f2085a);
        }
        ?? r1 = 0;
        C0130i c0130i = obj instanceof C0130i ? (C0130i) obj : null;
        Throwable th = c0130i != null ? c0130i.f2101a : null;
        if (g4 instanceof S) {
            try {
                ((S) g4).d(th);
                return;
            } catch (Throwable th2) {
                q(new RuntimeException("Exception in completion handler " + g4 + " for " + ((Object) this), th2));
                return;
            }
        }
        X e4 = g4.e();
        if (e4 != null) {
            Object h4 = e4.h();
            S3.e.c(h4, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            Y3.j jVar = (Y3.j) h4;
            while (!jVar.equals(e4)) {
                if (jVar instanceof S) {
                    S s4 = (S) jVar;
                    try {
                        s4.d(th);
                    } catch (Throwable th3) {
                        if (r1 != 0) {
                            AbstractC1654b.b(r1, th3);
                        } else {
                            r1 = new RuntimeException("Exception in completion handler " + s4 + " for " + ((Object) this), th3);
                        }
                    }
                }
                jVar = jVar.i();
                r1 = r1;
            }
            if (r1 != 0) {
                q(r1);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    public final Throwable k(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        W w2 = (W) ((Z) obj);
        Object p3 = w2.p();
        if (p3 instanceof U) {
            cancellationException = ((U) p3).c();
        } else if (p3 instanceof C0130i) {
            cancellationException = ((C0130i) p3).f2101a;
        } else {
            if (p3 instanceof G) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + p3).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        return cancellationException2 == null ? new N("Parent job is ".concat(y(p3)), cancellationException, w2) : cancellationException2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object l(U u2, Object obj) {
        Throwable th = null;
        C0130i c0130i = obj instanceof C0130i ? (C0130i) obj : null;
        Throwable th2 = c0130i != null ? c0130i.f2101a : null;
        synchronized (u2) {
            u2.d();
            ArrayList g4 = u2.g(th2);
            if (!g4.isEmpty()) {
                int size = g4.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size) {
                        break;
                    }
                    Object obj2 = g4.get(i4);
                    i4++;
                    if (!(((Throwable) obj2) instanceof CancellationException)) {
                        th = obj2;
                        break;
                    }
                }
                th = th;
                if (th == null) {
                    th = (Throwable) g4.get(0);
                }
            } else if (u2.d()) {
                th = new N(i(), null, this);
            }
            if (th != null && g4.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(g4.size()));
                int size2 = g4.size();
                int i5 = 0;
                while (i5 < size2) {
                    Object obj3 = g4.get(i5);
                    i5++;
                    Throwable th3 = (Throwable) obj3;
                    if (th3 != th && th3 != th && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                        AbstractC1654b.b(th, th3);
                    }
                }
            }
        }
        if (th != null && th != th2) {
            obj = new C0130i(th);
        }
        if (th != null) {
            boolean z4 = th instanceof CancellationException;
            InterfaceC0127f interfaceC0127f = (InterfaceC0127f) f2084p.get(this);
            if (interfaceC0127f != null && interfaceC0127f != Y.f2085a) {
                z4 = interfaceC0127f.c(th) || z4;
            }
            if (z4) {
                S3.e.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                C0130i.f2100b.compareAndSet((C0130i) obj, 0, 1);
            }
        }
        v(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2083o;
        Object h4 = obj instanceof G ? new H((G) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, u2, h4) && atomicReferenceFieldUpdater.get(this) == u2) {
        }
        j(u2, obj);
        return obj;
    }

    public final CancellationException m() {
        CancellationException cancellationException;
        Object p3 = p();
        if (!(p3 instanceof U)) {
            if (p3 instanceof G) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(p3 instanceof C0130i)) {
                return new N(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((C0130i) p3).f2101a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new N(i(), th, this) : cancellationException;
        }
        Throwable c = ((U) p3).c();
        if (c == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String concat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = c instanceof CancellationException ? (CancellationException) c : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (concat == null) {
            concat = i();
        }
        return new N(concat, c, this);
    }

    public boolean n() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [W3.X, Y3.j] */
    public final X o(G g4) {
        X e4 = g4.e();
        if (e4 != null) {
            return e4;
        }
        if (g4 instanceof C0146z) {
            return new Y3.j();
        }
        if (g4 instanceof S) {
            x((S) g4);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + g4).toString());
    }

    public final Object p() {
        while (true) {
            Object obj = f2083o.get(this);
            if (!(obj instanceof Y3.o)) {
                return obj;
            }
            ((Y3.o) obj).a(this);
        }
    }

    public void q(J3.b bVar) {
        throw bVar;
    }

    public final void r(M m4) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2084p;
        Y y = Y.f2085a;
        if (m4 == null) {
            atomicReferenceFieldUpdater.set(this, y);
            return;
        }
        W w2 = (W) m4;
        loop0: while (true) {
            Object p3 = w2.p();
            boolean z4 = p3 instanceof C0146z;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f2083o;
            if (!z4) {
                if (!(p3 instanceof F)) {
                    break;
                }
                X x4 = ((F) p3).f2066a;
                while (!atomicReferenceFieldUpdater2.compareAndSet(w2, p3, x4)) {
                    if (atomicReferenceFieldUpdater2.get(w2) != p3) {
                        break;
                    }
                }
                w2.getClass();
                break loop0;
            }
            if (!((C0146z) p3).f2126a) {
                C0146z c0146z = r.f2118h;
                while (!atomicReferenceFieldUpdater2.compareAndSet(w2, p3, c0146z)) {
                    if (atomicReferenceFieldUpdater2.get(w2) != p3) {
                        break;
                    }
                }
                w2.getClass();
                break loop0;
            }
            break;
        }
        InterfaceC0127f interfaceC0127f = (InterfaceC0127f) r.f(w2, true, new C0128g(this), 2);
        atomicReferenceFieldUpdater.set(this, interfaceC0127f);
        if (p() instanceof G) {
            return;
        }
        interfaceC0127f.b();
        atomicReferenceFieldUpdater.set(this, y);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bf, code lost:
    
        return r1;
     */
    /* JADX WARN: Type inference failed for: r2v1, types: [W3.X, Y3.j] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final W3.InterfaceC0145y s(boolean r9, boolean r10, W3.J r11) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: W3.W.s(boolean, boolean, W3.J):W3.y");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName() + '{' + y(p()) + '}');
        sb.append('@');
        sb.append(r.d(this));
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Throwable, J3.b] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, W3.W] */
    public final void u(X x4, Throwable th) {
        Object h4 = x4.h();
        S3.e.c(h4, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        Y3.j jVar = (Y3.j) h4;
        ?? r1 = 0;
        while (!jVar.equals(x4)) {
            if (jVar instanceof O) {
                S s4 = (S) jVar;
                try {
                    s4.d(th);
                } catch (Throwable th2) {
                    if (r1 != 0) {
                        AbstractC1654b.b(r1, th2);
                    } else {
                        r1 = new RuntimeException("Exception in completion handler " + s4 + " for " + ((Object) this), th2);
                    }
                }
            }
            jVar = jVar.i();
            r1 = r1;
        }
        if (r1 != 0) {
            q(r1);
        }
        InterfaceC0127f interfaceC0127f = (InterfaceC0127f) f2084p.get(this);
        if (interfaceC0127f == null || interfaceC0127f == Y.f2085a) {
            return;
        }
        interfaceC0127f.c(th);
    }

    public void v(Object obj) {
    }

    public void w() {
    }

    public final void x(S s4) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Y3.j jVar = new Y3.j();
        s4.getClass();
        Y3.j.f2240b.set(jVar, s4);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = Y3.j.f2239a;
        atomicReferenceFieldUpdater2.set(jVar, s4);
        loop0: while (true) {
            if (s4.h() != s4) {
                break;
            }
            while (!atomicReferenceFieldUpdater2.compareAndSet(s4, s4, jVar)) {
                if (atomicReferenceFieldUpdater2.get(s4) != s4) {
                    break;
                }
            }
            jVar.g(s4);
        }
        Y3.j i4 = s4.i();
        do {
            atomicReferenceFieldUpdater = f2083o;
            if (atomicReferenceFieldUpdater.compareAndSet(this, s4, i4)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == s4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00bf, code lost:
    
        if (r2 != null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00cf, code lost:
    
        if (W3.r.f(r2.f2097e, false, new W3.T(r6, r1, r2, r8), 1) == W3.Y.f2085a) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d4, code lost:
    
        r2 = t(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d8, code lost:
    
        if (r2 != null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d3, code lost:
    
        return W3.r.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00de, code lost:
    
        return l(r1, r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(java.lang.Object r7, java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: W3.W.z(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
