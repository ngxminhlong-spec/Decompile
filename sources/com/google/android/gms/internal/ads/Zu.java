package com.google.android.gms.internal.ads;

import c3.InterfaceFutureC0239a;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Zu extends Ju {

    /* renamed from: v, reason: collision with root package name */
    public InterfaceFutureC0239a f8061v;

    /* renamed from: w, reason: collision with root package name */
    public ScheduledFuture f8062w;

    @Override // com.google.android.gms.internal.ads.AbstractC1138ru
    public final String d() {
        InterfaceFutureC0239a interfaceFutureC0239a = this.f8061v;
        ScheduledFuture scheduledFuture = this.f8062w;
        if (interfaceFutureC0239a == null) {
            return null;
        }
        String k3 = U.a.k("inputFuture=[", interfaceFutureC0239a.toString(), "]");
        if (scheduledFuture == null) {
            return k3;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return k3;
        }
        return k3 + ", remaining delay=[" + delay + " ms]";
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1138ru
    public final void e() {
        j(this.f8061v);
        ScheduledFuture scheduledFuture = this.f8062w;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f8061v = null;
        this.f8062w = null;
    }
}
