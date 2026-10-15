package o3;

import com.google.android.material.datepicker.t;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class f implements ScheduledExecutorService, AutoCloseable {

    /* renamed from: o, reason: collision with root package name */
    public final ExecutorService f14355o;

    /* renamed from: p, reason: collision with root package name */
    public final ScheduledExecutorService f14356p;

    public f(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.f14355o = executorService;
        this.f14356p = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j4, TimeUnit timeUnit) {
        return this.f14355o.awaitTermination(j4, timeUnit);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        t.o(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f14355o.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) {
        return this.f14355o.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection, long j4, TimeUnit timeUnit) {
        return this.f14355o.invokeAll(collection, j4, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection) {
        return this.f14355o.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection, long j4, TimeUnit timeUnit) {
        return this.f14355o.invokeAny(collection, j4, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f14355o.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f14355o.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j4, TimeUnit timeUnit) {
        return new h(new C1.j(this, runnable, j4, timeUnit, 1));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j4, TimeUnit timeUnit) {
        return new h(new C1.j(this, callable, j4, timeUnit, 2));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j4, long j5, TimeUnit timeUnit) {
        return new h(new c(this, runnable, j4, j5, timeUnit, 0));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j4, long j5, TimeUnit timeUnit) {
        return new h(new c(this, runnable, j4, j5, timeUnit, 1));
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        return this.f14355o.submit(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        return this.f14355o.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        return this.f14355o.submit(callable);
    }
}
