package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Wu extends C0260Dc implements ScheduledExecutorService {

    /* renamed from: q, reason: collision with root package name */
    public final ScheduledExecutorService f7578q;

    public Wu(ScheduledExecutorService scheduledExecutorService) {
        super((ExecutorService) scheduledExecutorService);
        this.f7578q = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.C0260Dc, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        D.g.v(this);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j4, TimeUnit timeUnit) {
        RunnableFutureC0498cv runnableFutureC0498cv = new RunnableFutureC0498cv(Executors.callable(runnable, null));
        return new Uu(runnableFutureC0498cv, this.f7578q.schedule(runnableFutureC0498cv, j4, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j4, TimeUnit timeUnit) {
        RunnableFutureC0498cv runnableFutureC0498cv = new RunnableFutureC0498cv(callable);
        return new Uu(runnableFutureC0498cv, this.f7578q.schedule(runnableFutureC0498cv, j4, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j4, long j5, TimeUnit timeUnit) {
        Vu vu = new Vu(runnable);
        return new Uu(vu, this.f7578q.scheduleAtFixedRate(vu, j4, j5, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j4, long j5, TimeUnit timeUnit) {
        Vu vu = new Vu(runnable);
        return new Uu(vu, this.f7578q.scheduleWithFixedDelay(vu, j4, j5, timeUnit));
    }
}
