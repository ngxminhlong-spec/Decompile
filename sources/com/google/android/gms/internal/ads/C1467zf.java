package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import l2.C1798a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.zf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1467zf implements G4 {

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f11615a;

    /* renamed from: b, reason: collision with root package name */
    public final C1798a f11616b;
    public ScheduledFuture c;
    public long d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f11617e = -1;

    /* renamed from: f, reason: collision with root package name */
    public Vo f11618f = null;

    /* renamed from: g, reason: collision with root package name */
    public boolean f11619g = false;

    public C1467zf(ScheduledExecutorService scheduledExecutorService, C1798a c1798a) {
        this.f11615a = scheduledExecutorService;
        this.f11616b = c1798a;
        N1.n.f1204A.f1208f.i(this);
    }

    public final synchronized void a() {
        try {
            if (this.f11619g) {
                return;
            }
            ScheduledFuture scheduledFuture = this.c;
            if (scheduledFuture == null || scheduledFuture.isDone()) {
                this.f11617e = -1L;
            } else {
                this.c.cancel(true);
                long j4 = this.d;
                this.f11616b.getClass();
                this.f11617e = j4 - SystemClock.elapsedRealtime();
            }
            this.f11619g = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(int i4, Vo vo) {
        this.f11618f = vo;
        this.f11616b.getClass();
        long j4 = i4;
        this.d = SystemClock.elapsedRealtime() + j4;
        this.c = this.f11615a.schedule(vo, j4, TimeUnit.MILLISECONDS);
    }

    @Override // com.google.android.gms.internal.ads.G4
    public final void v(boolean z4) {
        ScheduledFuture scheduledFuture;
        if (!z4) {
            a();
            return;
        }
        synchronized (this) {
            try {
                if (this.f11619g) {
                    if (this.f11617e > 0 && (scheduledFuture = this.c) != null && scheduledFuture.isCancelled()) {
                        this.c = this.f11615a.schedule(this.f11618f, this.f11617e, TimeUnit.MILLISECONDS);
                    }
                    this.f11619g = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
