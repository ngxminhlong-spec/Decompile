package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import l2.C1798a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.kh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0825kh extends AA {

    /* renamed from: q, reason: collision with root package name */
    public final ScheduledExecutorService f9299q;

    /* renamed from: r, reason: collision with root package name */
    public final C1798a f9300r;

    /* renamed from: s, reason: collision with root package name */
    public long f9301s;

    /* renamed from: t, reason: collision with root package name */
    public long f9302t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f9303u;

    /* renamed from: v, reason: collision with root package name */
    public ScheduledFuture f9304v;

    public C0825kh(ScheduledExecutorService scheduledExecutorService, C1798a c1798a) {
        super(Collections.EMPTY_SET);
        this.f9301s = -1L;
        this.f9302t = -1L;
        this.f9303u = false;
        this.f9299q = scheduledExecutorService;
        this.f9300r = c1798a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003e, code lost:
    
        if ((r4 - android.os.SystemClock.elapsedRealtime()) > r0) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void r1(int r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            if (r7 > 0) goto L4
            goto L41
        L4:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L21
            long r1 = (long) r7     // Catch: java.lang.Throwable -> L21
            long r0 = r0.toMillis(r1)     // Catch: java.lang.Throwable -> L21
            boolean r7 = r6.f9303u     // Catch: java.lang.Throwable -> L21
            if (r7 == 0) goto L23
            long r2 = r6.f9302t     // Catch: java.lang.Throwable -> L21
            r4 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 <= 0) goto L1c
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 >= 0) goto L1c
            goto L1d
        L1c:
            r0 = r2
        L1d:
            r6.f9302t = r0     // Catch: java.lang.Throwable -> L21
            monitor-exit(r6)
            return
        L21:
            r7 = move-exception
            goto L48
        L23:
            l2.a r7 = r6.f9300r     // Catch: java.lang.Throwable -> L21
            r7.getClass()     // Catch: java.lang.Throwable -> L21
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L21
            long r4 = r6.f9301s     // Catch: java.lang.Throwable -> L21
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 > 0) goto L43
            l2.a r7 = r6.f9300r     // Catch: java.lang.Throwable -> L21
            r7.getClass()     // Catch: java.lang.Throwable -> L21
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L21
            long r4 = r4 - r2
            int r7 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r7 <= 0) goto L41
            goto L43
        L41:
            monitor-exit(r6)
            return
        L43:
            r6.s1(r0)     // Catch: java.lang.Throwable -> L21
            monitor-exit(r6)
            return
        L48:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L21
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0825kh.r1(int):void");
    }

    public final synchronized void s1(long j4) {
        try {
            ScheduledFuture scheduledFuture = this.f9304v;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.f9304v.cancel(true);
            }
            this.f9300r.getClass();
            this.f9301s = SystemClock.elapsedRealtime() + j4;
            this.f9304v = this.f9299q.schedule(new D3(this), j4, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }
}
