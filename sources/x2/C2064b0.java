package x2;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: x2.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2064b0 extends AbstractC2076h0 {

    /* renamed from: k, reason: collision with root package name */
    public static final AtomicLong f15533k = new AtomicLong(Long.MIN_VALUE);
    public C2062a0 c;
    public C2062a0 d;

    /* renamed from: e, reason: collision with root package name */
    public final PriorityBlockingQueue f15534e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedBlockingQueue f15535f;

    /* renamed from: g, reason: collision with root package name */
    public final Y f15536g;

    /* renamed from: h, reason: collision with root package name */
    public final Y f15537h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f15538i;

    /* renamed from: j, reason: collision with root package name */
    public final Semaphore f15539j;

    public C2064b0(C2066c0 c2066c0) {
        super(c2066c0);
        this.f15538i = new Object();
        this.f15539j = new Semaphore(2);
        this.f15534e = new PriorityBlockingQueue();
        this.f15535f = new LinkedBlockingQueue();
        this.f15536g = new Y(this, "Thread death: Uncaught exception on worker thread");
        this.f15537h = new Y(this, "Thread death: Uncaught exception on network thread");
    }

    @Override // Q1.AbstractC0115n
    public final void g() {
        if (Thread.currentThread() != this.c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // x2.AbstractC2076h0
    public final boolean h() {
        return false;
    }

    public final void k() {
        if (Thread.currentThread() != this.d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    public final Object l(AtomicReference atomicReference, long j4, String str, Runnable runnable) {
        synchronized (atomicReference) {
            C2064b0 c2064b0 = ((C2066c0) this.f1719a).f15569j;
            C2066c0.i(c2064b0);
            c2064b0.o(runnable);
            try {
                atomicReference.wait(j4);
            } catch (InterruptedException unused) {
                K k3 = ((C2066c0) this.f1719a).f15568i;
                C2066c0.i(k3);
                k3.f15397i.a("Interrupted waiting for ".concat(str));
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            K k4 = ((C2066c0) this.f1719a).f15568i;
            C2066c0.i(k4);
            k4.f15397i.a("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    public final Z m(Callable callable) {
        i();
        Z z4 = new Z(this, callable, false);
        if (Thread.currentThread() != this.c) {
            r(z4);
            return z4;
        }
        if (!this.f15534e.isEmpty()) {
            K k3 = ((C2066c0) this.f1719a).f15568i;
            C2066c0.i(k3);
            k3.f15397i.a("Callable skipped the worker queue.");
        }
        z4.run();
        return z4;
    }

    public final void n(Runnable runnable) {
        i();
        Z z4 = new Z(this, runnable, false, "Task exception on network thread");
        synchronized (this.f15538i) {
            try {
                this.f15535f.add(z4);
                C2062a0 c2062a0 = this.d;
                if (c2062a0 == null) {
                    C2062a0 c2062a02 = new C2062a0(this, "Measurement Network", this.f15535f);
                    this.d = c2062a02;
                    c2062a02.setUncaughtExceptionHandler(this.f15537h);
                    this.d.start();
                } else {
                    c2062a0.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o(Runnable runnable) {
        i();
        r(new Z(this, runnable, false, "Task exception on worker thread"));
    }

    public final void p(Runnable runnable) {
        i();
        r(new Z(this, runnable, true, "Task exception on worker thread"));
    }

    public final boolean q() {
        return Thread.currentThread() == this.c;
    }

    public final void r(Z z4) {
        synchronized (this.f15538i) {
            try {
                this.f15534e.add(z4);
                C2062a0 c2062a0 = this.c;
                if (c2062a0 == null) {
                    C2062a0 c2062a02 = new C2062a0(this, "Measurement Worker", this.f15534e);
                    this.c = c2062a02;
                    c2062a02.setUncaughtExceptionHandler(this.f15536g);
                    this.c.start();
                } else {
                    c2062a0.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
