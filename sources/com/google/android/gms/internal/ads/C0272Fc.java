package com.google.android.gms.internal.ads;

import c3.InterfaceFutureC0239a;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Fc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0272Fc implements InterfaceFutureC0239a {

    /* renamed from: o, reason: collision with root package name */
    public final Xu f5017o = new Object();

    @Override // c3.InterfaceFutureC0239a
    public final void a(Runnable runnable, Executor executor) {
        this.f5017o.a(runnable, executor);
    }

    public final boolean b(Object obj) {
        boolean f4 = this.f5017o.f(obj);
        if (!f4) {
            N1.n.f1204A.f1209g.g("SettableFuture", new IllegalStateException("Provided SettableFuture with multiple values."));
        }
        return f4;
    }

    public final boolean c(Throwable th) {
        boolean g4 = this.f5017o.g(th);
        if (!g4) {
            N1.n.f1204A.f1209g.g("SettableFuture", new IllegalStateException("Provided SettableFuture with multiple values."));
        }
        return g4;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z4) {
        return this.f5017o.cancel(z4);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f5017o.get();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j4, TimeUnit timeUnit) {
        return this.f5017o.get(j4, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f5017o.f10548o instanceof C0625fu;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f5017o.isDone();
    }
}
