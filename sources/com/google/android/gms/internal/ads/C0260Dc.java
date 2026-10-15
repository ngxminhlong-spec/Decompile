package com.google.android.gms.internal.ads;

import c3.InterfaceFutureC0239a;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Dc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0260Dc extends AbstractExecutorService implements Su, AutoCloseable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f4622o = 0;

    /* renamed from: p, reason: collision with root package name */
    public final Executor f4623p;

    public C0260Dc(Executor executor) {
        this.f4623p = executor;
    }

    public C0260Dc(ExecutorService executorService) {
        executorService.getClass();
        this.f4623p = executorService;
    }

    public final InterfaceFutureC0239a a(Runnable runnable) {
        return (InterfaceFutureC0239a) super.submit(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j4, TimeUnit timeUnit) {
        switch (this.f4622o) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return ((ExecutorService) this.f4623p).awaitTermination(j4, timeUnit);
        }
    }

    public final InterfaceFutureC0239a b(Callable callable) {
        return (InterfaceFutureC0239a) super.submit(callable);
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        D.g.u(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f4622o) {
            case 0:
                this.f4623p.execute(runnable);
                return;
            default:
                ((ExecutorService) this.f4623p).execute(runnable);
                return;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        switch (this.f4622o) {
            case 0:
                return false;
            default:
                return ((ExecutorService) this.f4623p).isShutdown();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        switch (this.f4622o) {
            case 0:
                return false;
            default:
                return ((ExecutorService) this.f4623p).isTerminated();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new RunnableFutureC0498cv(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        return new RunnableFutureC0498cv(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        switch (this.f4622o) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                ((ExecutorService) this.f4623p).shutdown();
                return;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        switch (this.f4622o) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return ((ExecutorService) this.f4623p).shutdownNow();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Runnable runnable) {
        return (InterfaceFutureC0239a) super.submit(runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (InterfaceFutureC0239a) super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Callable callable) {
        return (InterfaceFutureC0239a) super.submit(callable);
    }

    public String toString() {
        switch (this.f4622o) {
            case 1:
                ExecutorService executorService = (ExecutorService) this.f4623p;
                return super.toString() + "[" + String.valueOf(executorService) + "]";
            default:
                return super.toString();
        }
    }
}
