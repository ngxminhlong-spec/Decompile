package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.fg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0611fg {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f8715a;

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f8716b;
    public volatile boolean c = true;

    public C0611fg(C0260Dc c0260Dc, ScheduledExecutorService scheduledExecutorService, C0834kq c0834kq) {
        this.f8715a = c0260Dc;
        this.f8716b = scheduledExecutorService;
    }
}
