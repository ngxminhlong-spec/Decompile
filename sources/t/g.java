package t;

import c3.InterfaceFutureC0239a;
import com.google.android.gms.internal.play_billing.B;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class g implements InterfaceFutureC0239a {

    /* renamed from: r, reason: collision with root package name */
    public static final boolean f14825r = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: s, reason: collision with root package name */
    public static final Logger f14826s = Logger.getLogger(g.class.getName());

    /* renamed from: t, reason: collision with root package name */
    public static final B f14827t;

    /* renamed from: u, reason: collision with root package name */
    public static final Object f14828u;

    /* renamed from: o, reason: collision with root package name */
    public volatile Object f14829o;

    /* renamed from: p, reason: collision with root package name */
    public volatile c f14830p;

    /* renamed from: q, reason: collision with root package name */
    public volatile f f14831q;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.google.android.gms.internal.play_billing.B] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    static {
        ?? r32;
        try {
            th = null;
            r32 = new d(AtomicReferenceFieldUpdater.newUpdater(f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(f.class, f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, f.class, "q"), AtomicReferenceFieldUpdater.newUpdater(g.class, c.class, "p"), AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "o"));
        } catch (Throwable th) {
            th = th;
            r32 = new Object();
        }
        f14827t = r32;
        if (th != null) {
            f14826s.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f14828u = new Object();
    }

    public static void d(g gVar) {
        f fVar;
        c cVar;
        c cVar2;
        c cVar3;
        do {
            fVar = gVar.f14831q;
        } while (!f14827t.e(gVar, fVar, f.c));
        while (true) {
            cVar = null;
            if (fVar == null) {
                break;
            }
            Thread thread = fVar.f14823a;
            if (thread != null) {
                fVar.f14823a = null;
                LockSupport.unpark(thread);
            }
            fVar = fVar.f14824b;
        }
        gVar.c();
        do {
            cVar2 = gVar.f14830p;
        } while (!f14827t.c(gVar, cVar2, c.d));
        while (true) {
            cVar3 = cVar;
            cVar = cVar2;
            if (cVar == null) {
                break;
            }
            cVar2 = cVar.c;
            cVar.c = cVar3;
        }
        while (cVar3 != null) {
            c cVar4 = cVar3.c;
            e(cVar3.f14816a, cVar3.f14817b);
            cVar3 = cVar4;
        }
    }

    public static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e4) {
            f14826s.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e4);
        }
    }

    public static Object f(Object obj) {
        if (obj instanceof C1986a) {
            Throwable th = ((C1986a) obj).f14814b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof b) {
            throw new ExecutionException(((b) obj).f14815a);
        }
        if (obj == f14828u) {
            return null;
        }
        return obj;
    }

    public static Object g(g gVar) {
        Object obj;
        boolean z4 = false;
        while (true) {
            try {
                obj = gVar.get();
                break;
            } catch (InterruptedException unused) {
                z4 = true;
            } catch (Throwable th) {
                if (z4) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    @Override // c3.InterfaceFutureC0239a
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        c cVar = this.f14830p;
        c cVar2 = c.d;
        if (cVar != cVar2) {
            c cVar3 = new c(runnable, executor);
            do {
                cVar3.c = cVar;
                if (f14827t.c(this, cVar, cVar3)) {
                    return;
                } else {
                    cVar = this.f14830p;
                }
            } while (cVar != cVar2);
        }
        e(runnable, executor);
    }

    public final void b(StringBuilder sb) {
        try {
            Object g4 = g(this);
            sb.append("SUCCESS, result=[");
            sb.append(g4 == this ? "this future" : String.valueOf(g4));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e4) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e4.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e5) {
            sb.append("FAILURE, cause=[");
            sb.append(e5.getCause());
            sb.append("]");
        }
    }

    public void c() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z4) {
        Object obj = this.f14829o;
        if (obj == null) {
            if (f14827t.d(this, obj, f14825r ? new C1986a(z4, new CancellationException("Future.cancel() was called.")) : z4 ? C1986a.c : C1986a.d)) {
                d(this);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        f fVar = f.c;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f14829o;
        if (obj2 != null) {
            return f(obj2);
        }
        f fVar2 = this.f14831q;
        if (fVar2 != fVar) {
            f fVar3 = new f();
            do {
                B b4 = f14827t;
                b4.F(fVar3, fVar2);
                if (b4.e(this, fVar2, fVar3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            i(fVar3);
                            throw new InterruptedException();
                        }
                        obj = this.f14829o;
                    } while (obj == null);
                    return f(obj);
                }
                fVar2 = this.f14831q;
            } while (fVar2 != fVar);
        }
        return f(this.f14829o);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j4, TimeUnit timeUnit) {
        f fVar = f.c;
        long nanos = timeUnit.toNanos(j4);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f14829o;
        if (obj != null) {
            return f(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            f fVar2 = this.f14831q;
            if (fVar2 != fVar) {
                f fVar3 = new f();
                do {
                    B b4 = f14827t;
                    b4.F(fVar3, fVar2);
                    if (b4.e(this, fVar2, fVar3)) {
                        while (true) {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                i(fVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f14829o;
                            if (obj2 != null) {
                                return f(obj2);
                            }
                            long nanoTime2 = nanoTime - System.nanoTime();
                            if (nanoTime2 < 1000) {
                                i(fVar3);
                                nanos = nanoTime2;
                                break;
                            }
                            nanos = nanoTime2;
                        }
                    } else {
                        fVar2 = this.f14831q;
                    }
                } while (fVar2 != fVar);
            }
            return f(this.f14829o);
        }
        while (nanos > 0) {
            Object obj3 = this.f14829o;
            if (obj3 != null) {
                return f(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String gVar = toString();
        String obj4 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj4.toLowerCase(locale);
        String str = "Waited " + j4 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String h4 = n0.a.h(str, " (plus ");
            long j5 = -nanos;
            long convert = timeUnit.convert(j5, TimeUnit.NANOSECONDS);
            long nanos2 = j5 - timeUnit.toNanos(convert);
            boolean z4 = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str2 = h4 + convert + " " + lowerCase;
                if (z4) {
                    str2 = n0.a.h(str2, ",");
                }
                h4 = n0.a.h(str2, " ");
            }
            if (z4) {
                h4 = h4 + nanos2 + " nanoseconds ";
            }
            str = n0.a.h(h4, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(n0.a.h(str, " but future completed as timeout expired"));
        }
        throw new TimeoutException(n0.a.i(str, " for ", gVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String h() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void i(f fVar) {
        fVar.f14823a = null;
        while (true) {
            f fVar2 = this.f14831q;
            if (fVar2 == f.c) {
                return;
            }
            f fVar3 = null;
            while (fVar2 != null) {
                f fVar4 = fVar2.f14824b;
                if (fVar2.f14823a != null) {
                    fVar3 = fVar2;
                } else if (fVar3 != null) {
                    fVar3.f14824b = fVar4;
                    if (fVar3.f14823a == null) {
                        break;
                    }
                } else if (!f14827t.e(this, fVar2, fVar4)) {
                    break;
                }
                fVar2 = fVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f14829o instanceof C1986a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f14829o != null;
    }

    public boolean j(Object obj) {
        if (obj == null) {
            obj = f14828u;
        }
        if (!f14827t.d(this, null, obj)) {
            return false;
        }
        d(this);
        return true;
    }

    public boolean k(Throwable th) {
        th.getClass();
        if (!f14827t.d(this, null, new b(th))) {
            return false;
        }
        d(this);
        return true;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f14829o instanceof C1986a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
        } else {
            try {
                str = h();
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
