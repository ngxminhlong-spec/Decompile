package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Gu extends Ru {

    /* renamed from: q, reason: collision with root package name */
    public final Executor f5347q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Hu f5348r;

    /* renamed from: s, reason: collision with root package name */
    public final Callable f5349s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Hu f5350t;

    public Gu(Hu hu, Callable callable, Executor executor) {
        this.f5350t = hu;
        this.f5348r = hu;
        executor.getClass();
        this.f5347q = executor;
        this.f5349s = callable;
    }

    @Override // com.google.android.gms.internal.ads.Ru
    public final Object a() {
        return this.f5349s.call();
    }

    @Override // com.google.android.gms.internal.ads.Ru
    public final String b() {
        return this.f5349s.toString();
    }

    @Override // com.google.android.gms.internal.ads.Ru
    public final void d(Throwable th) {
        Hu hu = this.f5348r;
        hu.f5517D = null;
        if (th instanceof ExecutionException) {
            hu.g(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            hu.cancel(false);
        } else {
            hu.g(th);
        }
    }

    @Override // com.google.android.gms.internal.ads.Ru
    public final void e(Object obj) {
        this.f5348r.f5517D = null;
        this.f5350t.f(obj);
    }

    @Override // com.google.android.gms.internal.ads.Ru
    public final boolean f() {
        return this.f5348r.isDone();
    }
}
