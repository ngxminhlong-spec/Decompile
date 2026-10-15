package com.google.android.gms.internal.ads;

import O1.C0101z0;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Og extends AA implements Mg {

    /* renamed from: q, reason: collision with root package name */
    public final ScheduledExecutorService f6483q;

    /* renamed from: r, reason: collision with root package name */
    public ScheduledFuture f6484r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f6485s;

    public Og(Ng ng, Set set, C0260Dc c0260Dc, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.f6485s = false;
        this.f6483q = scheduledExecutorService;
        m1(ng, c0260Dc);
    }

    @Override // com.google.android.gms.internal.ads.Mg
    public final void M0(C0528di c0528di) {
        if (this.f6485s) {
            return;
        }
        ScheduledFuture scheduledFuture = this.f6484r;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        n1(new M3(24, c0528di));
    }

    @Override // com.google.android.gms.internal.ads.Mg
    public final void c() {
        n1(BF.f4056E);
    }

    public final void d() {
        this.f6484r = this.f6483q.schedule(new D3(23, this), ((Integer) O1.r.d.c.a(AbstractC1066q6.c9)).intValue(), TimeUnit.MILLISECONDS);
    }

    @Override // com.google.android.gms.internal.ads.Mg
    public final void r(C0101z0 c0101z0) {
        n1(new C0874ln(23, c0101z0));
    }
}
