package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.z2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1448z2 extends Thread {

    /* renamed from: o, reason: collision with root package name */
    public final BlockingQueue f11568o;

    /* renamed from: p, reason: collision with root package name */
    public final InterfaceC1405y2 f11569p;

    /* renamed from: q, reason: collision with root package name */
    public final N2 f11570q;

    /* renamed from: r, reason: collision with root package name */
    public volatile boolean f11571r = false;

    /* renamed from: s, reason: collision with root package name */
    public final M3 f11572s;

    public C1448z2(PriorityBlockingQueue priorityBlockingQueue, C0874ln c0874ln, N2 n22, M3 m32) {
        this.f11568o = priorityBlockingQueue;
        this.f11569p = c0874ln;
        this.f11570q = n22;
        this.f11572s = m32;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [com.google.android.gms.internal.ads.F2, java.lang.Exception] */
    public final void a() {
        M3 m32 = this.f11572s;
        D2 d22 = (D2) this.f11568o.take();
        SystemClock.elapsedRealtime();
        d22.i();
        try {
            try {
                d22.d("network-queue-take");
                d22.l();
                TrafficStats.setThreadStatsTag(d22.f4574r);
                B2 c = this.f11569p.c(d22);
                d22.d("network-http-complete");
                if (c.f4024e && d22.k()) {
                    d22.f("not-modified");
                    d22.g();
                } else {
                    B0.c a4 = d22.a(c);
                    d22.d("network-parse-complete");
                    if (((C1190t2) a4.f69q) != null) {
                        this.f11570q.c(d22.b(), (C1190t2) a4.f69q);
                        d22.d("network-cache-written");
                    }
                    synchronized (d22.f4575s) {
                        d22.f4579w = true;
                    }
                    m32.g(d22, a4, null);
                    d22.h(a4);
                }
            } catch (F2 e4) {
                SystemClock.elapsedRealtime();
                m32.getClass();
                d22.d("post-error");
                ((ExecutorC1319w2) m32.f6208p).f11109p.post(new RunnableC0801k(d22, new B0.c(e4), (Object) null, 1));
                d22.g();
            } catch (Exception e5) {
                Log.e("Volley", I2.d("Unhandled exception %s", e5.toString()), e5);
                ?? exc = new Exception(e5);
                SystemClock.elapsedRealtime();
                m32.getClass();
                d22.d("post-error");
                ((ExecutorC1319w2) m32.f6208p).f11109p.post(new RunnableC0801k(d22, new B0.c(exc), (Object) null, 1));
                d22.g();
            }
            d22.i();
        } catch (Throwable th) {
            d22.i();
            throw th;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f11571r) {
                    Thread.currentThread().interrupt();
                    return;
                }
                I2.b("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
