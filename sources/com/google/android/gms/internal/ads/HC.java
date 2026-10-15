package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class HC {

    /* renamed from: a, reason: collision with root package name */
    public final WD f5417a;

    /* renamed from: b, reason: collision with root package name */
    public final C1029pC f5418b;
    public int c;
    public Object d;

    /* renamed from: e, reason: collision with root package name */
    public final Looper f5419e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5420f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5421g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5422h;

    public HC(C1029pC c1029pC, WD wd, Looper looper) {
        this.f5418b = c1029pC;
        this.f5417a = wd;
        this.f5419e = looper;
    }

    public final void a() {
        Zf.X(!this.f5420f);
        this.f5420f = true;
        C1029pC c1029pC = this.f5418b;
        synchronized (c1029pC) {
            if (!c1029pC.f9929K && c1029pC.f9955x.getThread().isAlive()) {
                c1029pC.f9953v.a(14, this).a();
                return;
            }
            Wj.l("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            b(false);
        }
    }

    public final synchronized void b(boolean z4) {
        this.f5421g = z4 | this.f5421g;
        this.f5422h = true;
        notifyAll();
    }

    public final synchronized void c(long j4) {
        try {
            Zf.X(this.f5420f);
            Zf.X(this.f5419e.getThread() != Thread.currentThread());
            long elapsedRealtime = SystemClock.elapsedRealtime() + j4;
            while (!this.f5422h) {
                if (j4 <= 0) {
                    throw new TimeoutException("Message delivery timed out.");
                }
                wait(j4);
                j4 = elapsedRealtime - SystemClock.elapsedRealtime();
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
