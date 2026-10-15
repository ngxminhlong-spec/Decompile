package com.google.android.gms.internal.measurement;

import android.os.SystemClock;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.measurement.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC1489a0 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final long f11871o;

    /* renamed from: p, reason: collision with root package name */
    public final long f11872p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f11873q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C1509e0 f11874r;

    public AbstractRunnableC1489a0(C1509e0 c1509e0, boolean z4) {
        this.f11874r = c1509e0;
        c1509e0.getClass();
        this.f11871o = System.currentTimeMillis();
        this.f11872p = SystemClock.elapsedRealtime();
        this.f11873q = z4;
    }

    public abstract void a();

    public void b() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1509e0 c1509e0 = this.f11874r;
        if (c1509e0.d) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e4) {
            c1509e0.a(e4, false, this.f11873q);
            b();
        }
    }
}
