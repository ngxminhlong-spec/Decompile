package com.google.android.gms.internal.ads;

import c3.InterfaceFutureC0239a;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Lu extends Ku {

    /* renamed from: v, reason: collision with root package name */
    public final InterfaceFutureC0239a f6182v;

    public Lu(InterfaceFutureC0239a interfaceFutureC0239a) {
        interfaceFutureC0239a.getClass();
        this.f6182v = interfaceFutureC0239a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1138ru, c3.InterfaceFutureC0239a
    public final void a(Runnable runnable, Executor executor) {
        this.f6182v.a(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1138ru, java.util.concurrent.Future
    public final boolean cancel(boolean z4) {
        return this.f6182v.cancel(z4);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1138ru, java.util.concurrent.Future
    public final Object get() {
        return this.f6182v.get();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1138ru, java.util.concurrent.Future
    public final Object get(long j4, TimeUnit timeUnit) {
        return this.f6182v.get(j4, timeUnit);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1138ru, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f6182v.isCancelled();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1138ru, java.util.concurrent.Future
    public final boolean isDone() {
        return this.f6182v.isDone();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1138ru
    public final String toString() {
        return this.f6182v.toString();
    }
}
