package com.google.android.gms.internal.ads;

import c3.InterfaceFutureC0239a;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.oq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1006oq {
    public static final Pu d = Pu.f6608p;

    /* renamed from: a, reason: collision with root package name */
    public final Su f9859a;

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f9860b;
    public final C0963nq c;

    public C1006oq(Su su, ScheduledExecutorService scheduledExecutorService, C0963nq c0963nq) {
        this.f9859a = su;
        this.f9860b = scheduledExecutorService;
        this.c = c0963nq;
    }

    public final Op a(EnumC0877lq enumC0877lq, InterfaceFutureC0239a... interfaceFutureC0239aArr) {
        return new Op(this, enumC0877lq, Arrays.asList(interfaceFutureC0239aArr), 25);
    }

    public final C0381a5 b(InterfaceFutureC0239a interfaceFutureC0239a, Object obj) {
        return new C0381a5(this, obj, null, interfaceFutureC0239a, Collections.singletonList(interfaceFutureC0239a), interfaceFutureC0239a);
    }
}
