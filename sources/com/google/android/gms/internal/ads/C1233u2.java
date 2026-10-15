package com.google.android.gms.internal.ads;

import android.os.Process;
import b0.RunnableC0203p;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.u2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1233u2 extends Thread {

    /* renamed from: u, reason: collision with root package name */
    public static final boolean f10771u = I2.f5528a;

    /* renamed from: o, reason: collision with root package name */
    public final BlockingQueue f10772o;

    /* renamed from: p, reason: collision with root package name */
    public final BlockingQueue f10773p;

    /* renamed from: q, reason: collision with root package name */
    public final N2 f10774q;

    /* renamed from: r, reason: collision with root package name */
    public volatile boolean f10775r = false;

    /* renamed from: s, reason: collision with root package name */
    public final u0.g f10776s;

    /* renamed from: t, reason: collision with root package name */
    public final M3 f10777t;

    public C1233u2(PriorityBlockingQueue priorityBlockingQueue, PriorityBlockingQueue priorityBlockingQueue2, N2 n22, M3 m32) {
        this.f10772o = priorityBlockingQueue;
        this.f10773p = priorityBlockingQueue2;
        this.f10774q = n22;
        this.f10777t = m32;
        this.f10776s = new u0.g(this, priorityBlockingQueue2, m32);
    }

    public final void a() {
        D2 d22 = (D2) this.f10772o.take();
        d22.d("cache-queue-take");
        d22.i();
        try {
            d22.l();
            C1190t2 a4 = this.f10774q.a(d22.b());
            if (a4 == null) {
                d22.d("cache-miss");
                if (!this.f10776s.A(d22)) {
                    this.f10773p.put(d22);
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                if (a4.f10669e < currentTimeMillis) {
                    d22.d("cache-hit-expired");
                    d22.f4580x = a4;
                    if (!this.f10776s.A(d22)) {
                        this.f10773p.put(d22);
                    }
                } else {
                    d22.d("cache-hit");
                    byte[] bArr = a4.f10667a;
                    Map map = a4.f10671g;
                    B0.c a5 = d22.a(new B2(200, bArr, map, B2.a(map), false));
                    d22.d("cache-hit-parsed");
                    if (!(((F2) a5.f70r) == null)) {
                        d22.d("cache-parsing-failed");
                        N2 n22 = this.f10774q;
                        String b4 = d22.b();
                        synchronized (n22) {
                            C1190t2 a6 = n22.a(b4);
                            if (a6 != null) {
                                a6.f10670f = 0L;
                                a6.f10669e = 0L;
                                n22.c(b4, a6);
                            }
                        }
                        d22.f4580x = null;
                        if (!this.f10776s.A(d22)) {
                            this.f10773p.put(d22);
                        }
                    } else if (a4.f10670f < currentTimeMillis) {
                        d22.d("cache-hit-refresh-needed");
                        d22.f4580x = a4;
                        a5.f67o = true;
                        if (this.f10776s.A(d22)) {
                            this.f10777t.g(d22, a5, null);
                        } else {
                            this.f10777t.g(d22, a5, new RunnableC0203p(this, d22, 3, false));
                        }
                    } else {
                        this.f10777t.g(d22, a5, null);
                    }
                }
            }
            d22.i();
        } catch (Throwable th) {
            d22.i();
            throw th;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (f10771u) {
            I2.c("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f10774q.b();
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f10775r) {
                    Thread.currentThread().interrupt();
                    return;
                }
                I2.b("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
