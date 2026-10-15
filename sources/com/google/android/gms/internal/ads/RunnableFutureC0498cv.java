package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.cv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableFutureC0498cv extends Ju implements RunnableFuture {

    /* renamed from: v, reason: collision with root package name */
    public volatile Ru f8428v;

    public RunnableFutureC0498cv(Callable callable) {
        this.f8428v = new C0413av(this, callable);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1138ru
    public final String d() {
        Ru ru = this.f8428v;
        return ru != null ? U.a.k("task=[", ru.toString(), "]") : super.d();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1138ru
    public final void e() {
        Ru ru;
        if (l() && (ru = this.f8428v) != null) {
            ru.h();
        }
        this.f8428v = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        Ru ru = this.f8428v;
        if (ru != null) {
            ru.run();
        }
        this.f8428v = null;
    }
}
