package com.google.android.gms.internal.ads;

import c3.InterfaceFutureC0239a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.ru, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1138ru extends AbstractC0540dv implements InterfaceFutureC0239a {

    /* renamed from: r, reason: collision with root package name */
    public static final boolean f10544r;

    /* renamed from: s, reason: collision with root package name */
    public static final Logger f10545s;

    /* renamed from: t, reason: collision with root package name */
    public static final Bs f10546t;

    /* renamed from: u, reason: collision with root package name */
    public static final Object f10547u;

    /* renamed from: o, reason: collision with root package name */
    public volatile Object f10548o;

    /* renamed from: p, reason: collision with root package name */
    public volatile C0752iu f10549p;

    /* renamed from: q, reason: collision with root package name */
    public volatile C1096qu f10550q;

    static {
        boolean z4;
        Bs bs;
        Throwable th;
        Throwable th2;
        try {
            z4 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z4 = false;
        }
        f10544r = z4;
        f10545s = Logger.getLogger(AbstractC1138ru.class.getName());
        int i4 = 15;
        try {
            bs = new Bs(i4);
            th = null;
            th2 = null;
        } catch (Error | RuntimeException e4) {
            try {
                th2 = e4;
                bs = new C0795ju(AtomicReferenceFieldUpdater.newUpdater(C1096qu.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C1096qu.class, C1096qu.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1138ru.class, C1096qu.class, "q"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1138ru.class, C0752iu.class, "p"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1138ru.class, Object.class, "o"));
                th = null;
            } catch (Error | RuntimeException e5) {
                bs = new Bs(i4);
                th = e5;
                th2 = e4;
            }
        }
        f10546t = bs;
        if (th != null) {
            Logger logger = f10545s;
            Level level = Level.SEVERE;
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        f10547u = new Object();
    }

    public static final Object c(Object obj) {
        if (obj instanceof C0625fu) {
            Throwable th = ((C0625fu) obj).f8763b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof C0711hu) {
            throw new ExecutionException(((C0711hu) obj).f9008a);
        }
        if (obj == f10547u) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object h(InterfaceFutureC0239a interfaceFutureC0239a) {
        Object obj;
        Throwable b4;
        if (interfaceFutureC0239a instanceof InterfaceC0924mu) {
            Object obj2 = ((AbstractC1138ru) interfaceFutureC0239a).f10548o;
            if (obj2 instanceof C0625fu) {
                C0625fu c0625fu = (C0625fu) obj2;
                if (c0625fu.f8762a) {
                    Throwable th = c0625fu.f8763b;
                    obj2 = th != null ? new C0625fu(false, th) : C0625fu.d;
                }
            }
            obj2.getClass();
            return obj2;
        }
        if ((interfaceFutureC0239a instanceof AbstractC0540dv) && (b4 = ((AbstractC0540dv) interfaceFutureC0239a).b()) != null) {
            return new C0711hu(b4);
        }
        boolean isCancelled = interfaceFutureC0239a.isCancelled();
        boolean z4 = true;
        if ((!f10544r) && isCancelled) {
            C0625fu c0625fu2 = C0625fu.d;
            c0625fu2.getClass();
            return c0625fu2;
        }
        boolean z5 = false;
        while (true) {
            try {
                try {
                    try {
                        obj = interfaceFutureC0239a.get();
                        break;
                    } catch (Error e4) {
                        e = e4;
                        return new C0711hu(e);
                    }
                } catch (InterruptedException unused) {
                    z5 = z4;
                } catch (Throwable th2) {
                    if (z5) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            } catch (Error | RuntimeException e5) {
                e = e5;
                return new C0711hu(e);
            } catch (CancellationException e6) {
                return !isCancelled ? new C0711hu(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(interfaceFutureC0239a)), e6)) : new C0625fu(false, e6);
            } catch (ExecutionException e7) {
                return isCancelled ? new C0625fu(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(interfaceFutureC0239a)), e7)) : new C0711hu(e7.getCause());
            }
        }
        if (z5) {
            Thread.currentThread().interrupt();
        }
        return isCancelled ? new C0625fu(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(interfaceFutureC0239a)))) : obj == null ? f10547u : obj;
    }

    public static void n(AbstractC1138ru abstractC1138ru, boolean z4) {
        C0752iu c0752iu = null;
        while (true) {
            for (C1096qu z5 = f10546t.z(abstractC1138ru); z5 != null; z5 = z5.f10425b) {
                Thread thread = z5.f10424a;
                if (thread != null) {
                    z5.f10424a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z4) {
                abstractC1138ru.i();
            }
            abstractC1138ru.e();
            C0752iu c0752iu2 = c0752iu;
            C0752iu f4 = f10546t.f(abstractC1138ru);
            C0752iu c0752iu3 = c0752iu2;
            while (f4 != null) {
                C0752iu c0752iu4 = f4.c;
                f4.c = c0752iu3;
                c0752iu3 = f4;
                f4 = c0752iu4;
            }
            while (c0752iu3 != null) {
                c0752iu = c0752iu3.c;
                Runnable runnable = c0752iu3.f9081a;
                runnable.getClass();
                if (runnable instanceof RunnableC0838ku) {
                    RunnableC0838ku runnableC0838ku = (RunnableC0838ku) runnable;
                    abstractC1138ru = runnableC0838ku.f9331o;
                    if (abstractC1138ru.f10548o == runnableC0838ku) {
                        if (f10546t.e0(abstractC1138ru, runnableC0838ku, h(runnableC0838ku.f9332p))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = c0752iu3.f9082b;
                    executor.getClass();
                    o(runnable, executor);
                }
                c0752iu3 = c0752iu;
            }
            return;
            z4 = false;
        }
    }

    public static void o(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e4) {
            f10545s.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e4);
        }
    }

    public void a(Runnable runnable, Executor executor) {
        C0752iu c0752iu;
        C0752iu c0752iu2 = C0752iu.d;
        Bs.S(runnable, "Runnable was null.");
        Bs.S(executor, "Executor was null.");
        if (!isDone() && (c0752iu = this.f10549p) != c0752iu2) {
            C0752iu c0752iu3 = new C0752iu(runnable, executor);
            do {
                c0752iu3.c = c0752iu;
                if (f10546t.b0(this, c0752iu, c0752iu3)) {
                    return;
                } else {
                    c0752iu = this.f10549p;
                }
            } while (c0752iu != c0752iu2);
        }
        o(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0540dv
    public final Throwable b() {
        if (!(this instanceof InterfaceC0924mu)) {
            return null;
        }
        Object obj = this.f10548o;
        if (obj instanceof C0711hu) {
            return ((C0711hu) obj).f9008a;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0056, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f10548o
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.RunnableC0838ku
            r2 = 0
            r3 = 1
            if (r0 != 0) goto La
            r4 = r3
            goto Lb
        La:
            r4 = r2
        Lb:
            r1 = r1 | r4
            if (r1 == 0) goto L5e
            boolean r1 = com.google.android.gms.internal.ads.AbstractC1138ru.f10544r
            if (r1 == 0) goto L1f
            com.google.android.gms.internal.ads.fu r1 = new com.google.android.gms.internal.ads.fu
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r1.<init>(r8, r4)
            goto L29
        L1f:
            if (r8 == 0) goto L24
            com.google.android.gms.internal.ads.fu r1 = com.google.android.gms.internal.ads.C0625fu.c
            goto L26
        L24:
            com.google.android.gms.internal.ads.fu r1 = com.google.android.gms.internal.ads.C0625fu.d
        L26:
            r1.getClass()
        L29:
            r4 = r7
            r5 = r2
        L2b:
            com.google.android.gms.internal.ads.Bs r6 = com.google.android.gms.internal.ads.AbstractC1138ru.f10546t
            boolean r6 = r6.e0(r4, r0, r1)
            if (r6 == 0) goto L57
            n(r4, r8)
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.RunnableC0838ku
            if (r4 == 0) goto L56
            com.google.android.gms.internal.ads.ku r0 = (com.google.android.gms.internal.ads.RunnableC0838ku) r0
            c3.a r0 = r0.f9332p
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.InterfaceC0924mu
            if (r4 == 0) goto L53
            r4 = r0
            com.google.android.gms.internal.ads.ru r4 = (com.google.android.gms.internal.ads.AbstractC1138ru) r4
            java.lang.Object r0 = r4.f10548o
            if (r0 != 0) goto L4b
            r5 = r3
            goto L4c
        L4b:
            r5 = r2
        L4c:
            boolean r6 = r0 instanceof com.google.android.gms.internal.ads.RunnableC0838ku
            r5 = r5 | r6
            if (r5 == 0) goto L56
            r5 = r3
            goto L2b
        L53:
            r0.cancel(r8)
        L56:
            return r3
        L57:
            java.lang.Object r0 = r4.f10548o
            boolean r6 = r0 instanceof com.google.android.gms.internal.ads.RunnableC0838ku
            if (r6 != 0) goto L2b
            return r5
        L5e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC1138ru.cancel(boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String d() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public void e() {
    }

    public boolean f(Object obj) {
        if (obj == null) {
            obj = f10547u;
        }
        if (!f10546t.e0(this, null, obj)) {
            return false;
        }
        n(this, false);
        return true;
    }

    public boolean g(Throwable th) {
        th.getClass();
        if (!f10546t.e0(this, null, new C0711hu(th))) {
            return false;
        }
        n(this, false);
        return true;
    }

    public Object get() {
        Object obj;
        C1096qu c1096qu = C1096qu.c;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f10548o;
        if ((obj2 != null) && (!(obj2 instanceof RunnableC0838ku))) {
            return c(obj2);
        }
        C1096qu c1096qu2 = this.f10550q;
        if (c1096qu2 != c1096qu) {
            C1096qu c1096qu3 = new C1096qu();
            do {
                Bs bs = f10546t;
                bs.Q(c1096qu3, c1096qu2);
                if (bs.g0(this, c1096qu2, c1096qu3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            p(c1096qu3);
                            throw new InterruptedException();
                        }
                        obj = this.f10548o;
                    } while (!((obj != null) & (!(obj instanceof RunnableC0838ku))));
                    return c(obj);
                }
                c1096qu2 = this.f10550q;
            } while (c1096qu2 != c1096qu);
        }
        Object obj3 = this.f10548o;
        obj3.getClass();
        return c(obj3);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00c6 -> B:34:0x0083). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object get(long r20, java.util.concurrent.TimeUnit r22) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC1138ru.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    public void i() {
    }

    public boolean isCancelled() {
        return this.f10548o instanceof C0625fu;
    }

    public boolean isDone() {
        return (this.f10548o != null) & (!(r0 instanceof RunnableC0838ku));
    }

    public final void j(Future future) {
        if ((future != null) && (this.f10548o instanceof C0625fu)) {
            future.cancel(l());
        }
    }

    public final void k(InterfaceFutureC0239a interfaceFutureC0239a) {
        C0711hu c0711hu;
        interfaceFutureC0239a.getClass();
        Object obj = this.f10548o;
        if (obj == null) {
            if (interfaceFutureC0239a.isDone()) {
                if (f10546t.e0(this, null, h(interfaceFutureC0239a))) {
                    n(this, false);
                    return;
                }
                return;
            }
            RunnableC0838ku runnableC0838ku = new RunnableC0838ku(this, interfaceFutureC0239a);
            if (f10546t.e0(this, null, runnableC0838ku)) {
                try {
                    interfaceFutureC0239a.a(runnableC0838ku, Iu.f5747o);
                    return;
                } catch (Error | RuntimeException e4) {
                    try {
                        c0711hu = new C0711hu(e4);
                    } catch (Error | RuntimeException unused) {
                        c0711hu = C0711hu.f9007b;
                    }
                    f10546t.e0(this, runnableC0838ku, c0711hu);
                    return;
                }
            }
            obj = this.f10548o;
        }
        if (obj instanceof C0625fu) {
            interfaceFutureC0239a.cancel(((C0625fu) obj).f8762a);
        }
    }

    public final boolean l() {
        Object obj = this.f10548o;
        return (obj instanceof C0625fu) && ((C0625fu) obj).f8762a;
    }

    public final void m(StringBuilder sb) {
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
        if (obj == null) {
            sb.append("null");
        } else if (obj == this) {
            sb.append("this future");
        } else {
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
        sb.append("]");
    }

    public final void p(C1096qu c1096qu) {
        c1096qu.f10424a = null;
        while (true) {
            C1096qu c1096qu2 = this.f10550q;
            if (c1096qu2 != C1096qu.c) {
                C1096qu c1096qu3 = null;
                while (c1096qu2 != null) {
                    C1096qu c1096qu4 = c1096qu2.f10425b;
                    if (c1096qu2.f10424a != null) {
                        c1096qu3 = c1096qu2;
                    } else if (c1096qu3 != null) {
                        c1096qu3.f10425b = c1096qu4;
                        if (c1096qu3.f10424a == null) {
                            break;
                        }
                    } else if (!f10546t.g0(this, c1096qu2, c1096qu4)) {
                        break;
                    }
                    c1096qu2 = c1096qu4;
                }
                return;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "com.google.common.util.concurrent."
            boolean r1 = r1.startsWith(r2)
            if (r1 == 0) goto L21
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            goto L2c
        L21:
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
        L2c:
            r1 = 64
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r6)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = "[status="
            r0.append(r1)
            boolean r1 = r6.isCancelled()
            java.lang.String r2 = "]"
            if (r1 == 0) goto L50
            java.lang.String r1 = "CANCELLED"
            r0.append(r1)
            goto Lcb
        L50:
            boolean r1 = r6.isDone()
            if (r1 == 0) goto L5b
            r6.m(r0)
            goto Lcb
        L5b:
            int r1 = r0.length()
            java.lang.String r3 = "PENDING"
            r0.append(r3)
            java.lang.Object r3 = r6.f10548o
            boolean r4 = r3 instanceof com.google.android.gms.internal.ads.RunnableC0838ku
            java.lang.String r5 = "Exception thrown from implementation: "
            if (r4 == 0) goto L93
            java.lang.String r4 = ", setFuture=["
            r0.append(r4)
            com.google.android.gms.internal.ads.ku r3 = (com.google.android.gms.internal.ads.RunnableC0838ku) r3
            c3.a r3 = r3.f9332p
            if (r3 != r6) goto L81
            java.lang.String r3 = "this future"
            r0.append(r3)     // Catch: java.lang.StackOverflowError -> L7d java.lang.RuntimeException -> L7f
            goto L8f
        L7d:
            r3 = move-exception
            goto L85
        L7f:
            r3 = move-exception
            goto L85
        L81:
            r0.append(r3)     // Catch: java.lang.StackOverflowError -> L7d java.lang.RuntimeException -> L7f
            goto L8f
        L85:
            r0.append(r5)
            java.lang.Class r3 = r3.getClass()
            r0.append(r3)
        L8f:
            r0.append(r2)
            goto Lbb
        L93:
            java.lang.String r3 = r6.d()     // Catch: java.lang.StackOverflowError -> L9f java.lang.RuntimeException -> La1
            boolean r4 = com.google.android.gms.internal.ads.Ds.a(r3)     // Catch: java.lang.StackOverflowError -> L9f java.lang.RuntimeException -> La1
            if (r4 == 0) goto Lae
            r3 = 0
            goto Lae
        L9f:
            r3 = move-exception
            goto La2
        La1:
            r3 = move-exception
        La2:
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r3 = r5.concat(r3)
        Lae:
            if (r3 == 0) goto Lbb
            java.lang.String r4 = ", info=["
            r0.append(r4)
            r0.append(r3)
            r0.append(r2)
        Lbb:
            boolean r3 = r6.isDone()
            if (r3 == 0) goto Lcb
            int r3 = r0.length()
            r0.delete(r1, r3)
            r6.m(r0)
        Lcb:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC1138ru.toString():java.lang.String");
    }
}
