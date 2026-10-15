package com.google.android.gms.internal.ads;

import c3.InterfaceFutureC0239a;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Uu extends Bs implements ScheduledFuture, InterfaceFutureC0239a, Future {

    /* renamed from: p, reason: collision with root package name */
    public final AbstractC1138ru f7205p;

    /* renamed from: q, reason: collision with root package name */
    public final ScheduledFuture f7206q;

    public Uu(AbstractC1138ru abstractC1138ru, ScheduledFuture scheduledFuture) {
        super(6);
        this.f7205p = abstractC1138ru;
        this.f7206q = scheduledFuture;
    }

    @Override // c3.InterfaceFutureC0239a
    public final void a(Runnable runnable, Executor executor) {
        this.f7205p.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z4) {
        boolean cancel = this.f7205p.cancel(z4);
        if (cancel) {
            this.f7206q.cancel(z4);
        }
        return cancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.f7206q.compareTo(delayed);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f7205p.get();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j4, TimeUnit timeUnit) {
        return this.f7205p.get(j4, timeUnit);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f7206q.getDelay(timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f7205p.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f7205p.isDone();
    }

    @Override // com.google.android.gms.internal.ads.Bs
    public final /* synthetic */ Object j() {
        return this.f7205p;
    }
}
