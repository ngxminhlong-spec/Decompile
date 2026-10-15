package com.google.android.gms.internal.ads;

import c3.InterfaceFutureC0239a;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.so, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1175so implements Go {

    /* renamed from: a, reason: collision with root package name */
    public final Go f10636a;

    /* renamed from: b, reason: collision with root package name */
    public final long f10637b;
    public final ScheduledExecutorService c;

    public C1175so(Go go, long j4, ScheduledExecutorService scheduledExecutorService) {
        this.f10636a = go;
        this.f10637b = j4;
        this.c = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.Go
    public final int b() {
        return this.f10636a.b();
    }

    @Override // com.google.android.gms.internal.ads.Go
    public final InterfaceFutureC0239a c() {
        InterfaceFutureC0239a c = this.f10636a.c();
        long j4 = this.f10637b;
        if (j4 > 0) {
            c = Bs.o0(c, j4, TimeUnit.MILLISECONDS, this.c);
        }
        return Bs.c0(c, Throwable.class, C0364Xe.f7670p, AbstractC0266Ec.f4900f);
    }
}
