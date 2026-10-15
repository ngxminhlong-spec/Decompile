package com.google.android.gms.internal.ads;

import c3.InterfaceFutureC0239a;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.kq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0834kq implements InterfaceFutureC0239a {

    /* renamed from: o, reason: collision with root package name */
    public final Object f9323o;

    /* renamed from: p, reason: collision with root package name */
    public final String f9324p;

    /* renamed from: q, reason: collision with root package name */
    public final InterfaceFutureC0239a f9325q;

    public C0834kq(Object obj, String str, InterfaceFutureC0239a interfaceFutureC0239a) {
        this.f9323o = obj;
        this.f9324p = str;
        this.f9325q = interfaceFutureC0239a;
    }

    @Override // c3.InterfaceFutureC0239a
    public final void a(Runnable runnable, Executor executor) {
        this.f9325q.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z4) {
        return this.f9325q.cancel(z4);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f9325q.get();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j4, TimeUnit timeUnit) {
        return this.f9325q.get(j4, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f9325q.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f9325q.isDone();
    }

    public final String toString() {
        return this.f9324p + "@" + System.identityHashCode(this);
    }
}
