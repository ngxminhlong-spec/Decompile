package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.vq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1306vq implements InterfaceC1263uq {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1263uq f11075a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedBlockingQueue f11076b = new LinkedBlockingQueue();
    public final int c;
    public final AtomicBoolean d;

    public C1306vq(InterfaceC1263uq interfaceC1263uq, ScheduledExecutorService scheduledExecutorService) {
        this.f11075a = interfaceC1263uq;
        C0937n6 c0937n6 = AbstractC1066q6.E7;
        O1.r rVar = O1.r.d;
        this.c = ((Integer) rVar.c.a(c0937n6)).intValue();
        this.d = new AtomicBoolean(false);
        C0937n6 c0937n62 = AbstractC1066q6.D7;
        SharedPreferencesOnSharedPreferenceChangeListenerC1023p6 sharedPreferencesOnSharedPreferenceChangeListenerC1023p6 = rVar.c;
        long intValue = ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(c0937n62)).intValue();
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(AbstractC1066q6.Z9)).booleanValue()) {
            scheduledExecutorService.scheduleWithFixedDelay(new RunnableC0744il(12, this), intValue, intValue, TimeUnit.MILLISECONDS);
        } else {
            scheduledExecutorService.scheduleAtFixedRate(new RunnableC0744il(12, this), intValue, intValue, TimeUnit.MILLISECONDS);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1263uq
    public final String a(C1220tq c1220tq) {
        return this.f11075a.a(c1220tq);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1263uq
    public final void b(C1220tq c1220tq) {
        LinkedBlockingQueue linkedBlockingQueue = this.f11076b;
        if (linkedBlockingQueue.size() < this.c) {
            linkedBlockingQueue.offer(c1220tq);
            return;
        }
        if (this.d.getAndSet(true)) {
            return;
        }
        C1220tq b4 = C1220tq.b("dropped_event");
        HashMap g4 = c1220tq.g();
        if (g4.containsKey("action")) {
            b4.a("dropped_action", (String) g4.get("action"));
        }
        linkedBlockingQueue.offer(b4);
    }
}
