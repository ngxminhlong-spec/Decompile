package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import l2.AbstractC1799b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.w2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC1319w2 implements Executor {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f11108o;

    /* renamed from: p, reason: collision with root package name */
    public final Handler f11109p;

    public ExecutorC1319w2() {
        this.f11108o = 3;
        this.f11109p = new Ur(Looper.getMainLooper(), 0);
    }

    public /* synthetic */ ExecutorC1319w2(Handler handler, int i4) {
        this.f11108o = i4;
        this.f11109p = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f11108o) {
            case 0:
                this.f11109p.post(runnable);
                return;
            case 1:
                this.f11109p.post(runnable);
                return;
            case 2:
                this.f11109p.post(runnable);
                return;
            default:
                if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                    ((Q1.J) this.f11109p).post(runnable);
                    return;
                }
                try {
                    runnable.run();
                    return;
                } catch (Throwable th) {
                    Q1.N n4 = N1.n.f1204A.c;
                    Context context = N1.n.f1204A.f1209g.f9970e;
                    if (context != null) {
                        try {
                            if (((Boolean) W6.f7343b.r()).booleanValue()) {
                                AbstractC1799b.a(context, th);
                            }
                        } catch (IllegalStateException unused) {
                        }
                    }
                    throw th;
                }
        }
    }
}
