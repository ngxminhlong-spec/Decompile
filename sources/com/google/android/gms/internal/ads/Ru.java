package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class Ru extends AtomicReference implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public static final RunnableC0286Ib f6864o;

    /* renamed from: p, reason: collision with root package name */
    public static final RunnableC0286Ib f6865p;

    static {
        int i4 = 8;
        f6864o = new RunnableC0286Ib(i4);
        f6865p = new RunnableC0286Ib(i4);
    }

    public abstract Object a();

    public abstract String b();

    public final void c(Thread thread) {
        Runnable runnable = (Runnable) get();
        Qu qu = null;
        boolean z4 = false;
        int i4 = 0;
        while (true) {
            boolean z5 = runnable instanceof Qu;
            RunnableC0286Ib runnableC0286Ib = f6865p;
            if (!z5) {
                if (runnable != runnableC0286Ib) {
                    break;
                }
            } else {
                qu = (Qu) runnable;
            }
            i4++;
            if (i4 <= 1000) {
                Thread.yield();
            } else if (runnable == runnableC0286Ib || compareAndSet(runnable, runnableC0286Ib)) {
                z4 = Thread.interrupted() || z4;
                LockSupport.park(qu);
            }
            runnable = (Runnable) get();
        }
        if (z4) {
            thread.interrupt();
        }
    }

    public abstract void d(Throwable th);

    public abstract void e(Object obj);

    public abstract boolean f();

    public final void h() {
        RunnableC0286Ib runnableC0286Ib = f6865p;
        RunnableC0286Ib runnableC0286Ib2 = f6864o;
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            Qu qu = new Qu(this);
            qu.setExclusiveOwnerThread(Thread.currentThread());
            if (compareAndSet(runnable, qu)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (((Runnable) getAndSet(runnableC0286Ib2)) == runnableC0286Ib) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th) {
                    if (((Runnable) getAndSet(runnableC0286Ib2)) == runnableC0286Ib) {
                        LockSupport.unpark((Thread) runnable);
                    }
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread currentThread = Thread.currentThread();
        Object obj = null;
        if (compareAndSet(null, currentThread)) {
            boolean f4 = f();
            RunnableC0286Ib runnableC0286Ib = f6864o;
            if (!f4) {
                try {
                    obj = a();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(currentThread, runnableC0286Ib)) {
                            c(currentThread);
                        }
                        d(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(currentThread, runnableC0286Ib)) {
                            c(currentThread);
                        }
                        e(null);
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(currentThread, runnableC0286Ib)) {
                c(currentThread);
            }
            if (f4) {
                return;
            }
            e(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        Runnable runnable = (Runnable) get();
        return n0.a.i(runnable == f6864o ? "running=[DONE]" : runnable instanceof Qu ? "running=[INTERRUPTED]" : runnable instanceof Thread ? U.a.k("running=[RUNNING ON ", ((Thread) runnable).getName(), "]") : "running=[NOT STARTED YET]", ", ", b());
    }
}
