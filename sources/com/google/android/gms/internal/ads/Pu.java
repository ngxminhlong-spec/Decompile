package com.google.android.gms.internal.ads;

import c3.InterfaceFutureC0239a;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Pu implements InterfaceFutureC0239a {

    /* renamed from: p, reason: collision with root package name */
    public static final Pu f6608p = new Pu(null);

    /* renamed from: q, reason: collision with root package name */
    public static final Logger f6609q = Logger.getLogger(Pu.class.getName());

    /* renamed from: o, reason: collision with root package name */
    public final Object f6610o;

    public Pu(Object obj) {
        this.f6610o = obj;
    }

    @Override // c3.InterfaceFutureC0239a
    public final void a(Runnable runnable, Executor executor) {
        Bs.S(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (RuntimeException e4) {
            f6609q.logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e4);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z4) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f6610o;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j4, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f6610o;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + String.valueOf(this.f6610o) + "]]";
    }
}
