package y0;

import c3.InterfaceFutureC0239a;
import d3.AbstractC1654b;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class h implements InterfaceFutureC0239a {

    /* renamed from: r, reason: collision with root package name */
    public static final boolean f15899r = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: s, reason: collision with root package name */
    public static final Logger f15900s = Logger.getLogger(h.class.getName());

    /* renamed from: t, reason: collision with root package name */
    public static final AbstractC1654b f15901t;

    /* renamed from: u, reason: collision with root package name */
    public static final Object f15902u;

    /* renamed from: o, reason: collision with root package name */
    public volatile Object f15903o;

    /* renamed from: p, reason: collision with root package name */
    public volatile c f15904p;

    /* renamed from: q, reason: collision with root package name */
    public volatile g f15905q;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [d3.b] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    static {
        ?? r32;
        try {
            th = null;
            r32 = new d(AtomicReferenceFieldUpdater.newUpdater(g.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(g.class, g.class, "b"), AtomicReferenceFieldUpdater.newUpdater(h.class, g.class, "q"), AtomicReferenceFieldUpdater.newUpdater(h.class, c.class, "p"), AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "o"));
        } catch (Throwable th) {
            th = th;
            r32 = new Object();
        }
        f15901t = r32;
        if (th != null) {
            f15900s.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f15902u = new Object();
    }

    public static void c(h hVar) {
        c cVar;
        c cVar2;
        c cVar3 = null;
        while (true) {
            g gVar = hVar.f15905q;
            if (f15901t.e(hVar, gVar, g.c)) {
                while (gVar != null) {
                    Thread thread = gVar.f15897a;
                    if (thread != null) {
                        gVar.f15897a = null;
                        LockSupport.unpark(thread);
                    }
                    gVar = gVar.f15898b;
                }
                do {
                    cVar = hVar.f15904p;
                } while (!f15901t.c(hVar, cVar, c.d));
                while (true) {
                    cVar2 = cVar3;
                    cVar3 = cVar;
                    if (cVar3 == null) {
                        break;
                    }
                    cVar = cVar3.c;
                    cVar3.c = cVar2;
                }
                while (cVar2 != null) {
                    cVar3 = cVar2.c;
                    Runnable runnable = cVar2.f15888a;
                    if (runnable instanceof e) {
                        e eVar = (e) runnable;
                        hVar = eVar.f15895o;
                        if (hVar.f15903o == eVar) {
                            if (f15901t.d(hVar, eVar, f(eVar.f15896p))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        d(runnable, cVar2.f15889b);
                    }
                    cVar2 = cVar3;
                }
                return;
            }
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e4) {
            f15900s.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e4);
        }
    }

    public static Object e(Object obj) {
        if (obj instanceof C2116a) {
            Throwable th = ((C2116a) obj).f15885b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof b) {
            throw new ExecutionException(((b) obj).f15887a);
        }
        if (obj == f15902u) {
            return null;
        }
        return obj;
    }

    public static Object f(InterfaceFutureC0239a interfaceFutureC0239a) {
        Object obj;
        if (interfaceFutureC0239a instanceof h) {
            Object obj2 = ((h) interfaceFutureC0239a).f15903o;
            if (!(obj2 instanceof C2116a)) {
                return obj2;
            }
            C2116a c2116a = (C2116a) obj2;
            return c2116a.f15884a ? c2116a.f15885b != null ? new C2116a(false, c2116a.f15885b) : C2116a.d : obj2;
        }
        boolean isCancelled = interfaceFutureC0239a.isCancelled();
        boolean z4 = true;
        if ((!f15899r) && isCancelled) {
            return C2116a.d;
        }
        boolean z5 = false;
        while (true) {
            try {
                try {
                    obj = interfaceFutureC0239a.get();
                    break;
                } catch (InterruptedException unused) {
                    z5 = z4;
                } catch (Throwable th) {
                    if (z5) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException e4) {
                if (isCancelled) {
                    return new C2116a(false, e4);
                }
                return new b(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + interfaceFutureC0239a, e4));
            } catch (ExecutionException e5) {
                return new b(e5.getCause());
            } catch (Throwable th2) {
                return new b(th2);
            }
        }
        if (z5) {
            Thread.currentThread().interrupt();
        }
        return obj == null ? f15902u : obj;
    }

    @Override // c3.InterfaceFutureC0239a
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        c cVar = this.f15904p;
        c cVar2 = c.d;
        if (cVar != cVar2) {
            c cVar3 = new c(runnable, executor);
            do {
                cVar3.c = cVar;
                if (f15901t.c(this, cVar, cVar3)) {
                    return;
                } else {
                    cVar = this.f15904p;
                }
            } while (cVar != cVar2);
        }
        d(runnable, executor);
    }

    public final void b(StringBuilder sb) {
        Object obj;
        boolean z4 = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z4 = true;
                } catch (Throwable th) {
                    if (z4) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (RuntimeException e4) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e4.getClass());
                sb.append(" thrown from get()]");
                return;
            } catch (ExecutionException e5) {
                sb.append("FAILURE, cause=[");
                sb.append(e5.getCause());
                sb.append("]");
                return;
            }
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        sb.append(obj == this ? "this future" : String.valueOf(obj));
        sb.append("]");
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z4) {
        Object obj = this.f15903o;
        if (!(obj == null) && !(obj instanceof e)) {
            return false;
        }
        C2116a c2116a = f15899r ? new C2116a(z4, new CancellationException("Future.cancel() was called.")) : z4 ? C2116a.c : C2116a.d;
        h hVar = this;
        boolean z5 = false;
        while (true) {
            if (f15901t.d(hVar, obj, c2116a)) {
                c(hVar);
                if (!(obj instanceof e)) {
                    break;
                }
                InterfaceFutureC0239a interfaceFutureC0239a = ((e) obj).f15896p;
                if (!(interfaceFutureC0239a instanceof h)) {
                    interfaceFutureC0239a.cancel(z4);
                    break;
                }
                hVar = (h) interfaceFutureC0239a;
                obj = hVar.f15903o;
                if (!(obj == null) && !(obj instanceof e)) {
                    break;
                }
                z5 = true;
            } else {
                obj = hVar.f15903o;
                if (!(obj instanceof e)) {
                    return z5;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String g() {
        Object obj = this.f15903o;
        if (obj instanceof e) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            InterfaceFutureC0239a interfaceFutureC0239a = ((e) obj).f15896p;
            return n0.a.j(sb, interfaceFutureC0239a == this ? "this future" : String.valueOf(interfaceFutureC0239a), "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        g gVar = g.c;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f15903o;
        if ((obj2 != null) && (!(obj2 instanceof e))) {
            return e(obj2);
        }
        g gVar2 = this.f15905q;
        if (gVar2 != gVar) {
            g gVar3 = new g();
            do {
                AbstractC1654b abstractC1654b = f15901t;
                abstractC1654b.N(gVar3, gVar2);
                if (abstractC1654b.e(this, gVar2, gVar3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            h(gVar3);
                            throw new InterruptedException();
                        }
                        obj = this.f15903o;
                    } while (!((obj != null) & (!(obj instanceof e))));
                    return e(obj);
                }
                gVar2 = this.f15905q;
            } while (gVar2 != gVar);
        }
        return e(this.f15903o);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bd  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00b0 -> B:33:0x0078). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(long r19, java.util.concurrent.TimeUnit r21) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.h.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    public final void h(g gVar) {
        gVar.f15897a = null;
        while (true) {
            g gVar2 = this.f15905q;
            if (gVar2 == g.c) {
                return;
            }
            g gVar3 = null;
            while (gVar2 != null) {
                g gVar4 = gVar2.f15898b;
                if (gVar2.f15897a != null) {
                    gVar3 = gVar2;
                } else if (gVar3 != null) {
                    gVar3.f15898b = gVar4;
                    if (gVar3.f15897a == null) {
                        break;
                    }
                } else if (!f15901t.e(this, gVar2, gVar4)) {
                    break;
                }
                gVar2 = gVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f15903o instanceof C2116a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof e)) & (this.f15903o != null);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f15903o instanceof C2116a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
        } else {
            try {
                str = g();
            } catch (RuntimeException e4) {
                str = "Exception thrown from implementation: " + e4.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                b(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
