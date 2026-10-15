package W3;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class E extends D implements InterfaceC0142v {

    /* renamed from: q, reason: collision with root package name */
    public final Executor f2065q;

    public E(Executor executor) {
        Method method;
        this.f2065q = executor;
        Method method2 = Y3.c.f2224a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = Y3.c.f2224a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f2065q;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof E) && ((E) obj).f2065q == this.f2065q;
    }

    @Override // W3.AbstractC0134m
    public final void g(L3.i iVar, Runnable runnable) {
        try {
            this.f2065q.execute(runnable);
        } catch (RejectedExecutionException e4) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e4);
            r.c(iVar, cancellationException);
            AbstractC0144x.f2125b.g(iVar, runnable);
        }
    }

    public final int hashCode() {
        return System.identityHashCode(this.f2065q);
    }

    @Override // W3.AbstractC0134m
    public final String toString() {
        return this.f2065q.toString();
    }
}
