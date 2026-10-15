package o3;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import m.ThreadFactoryC1802b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class i implements Executor {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14358o;

    /* renamed from: p, reason: collision with root package name */
    public final Object f14359p;

    /* renamed from: q, reason: collision with root package name */
    public final Object f14360q;

    /* renamed from: r, reason: collision with root package name */
    public Object f14361r;

    public i() {
        this.f14358o = 1;
        this.f14359p = new AtomicInteger(1);
        this.f14361r = new WeakReference(null);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC1802b(this));
        this.f14360q = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public i(Executor executor, int i4) {
        this.f14358o = 0;
        this.f14361r = new LinkedBlockingQueue();
        if (!(i4 > 0)) {
            throw new IllegalArgumentException("concurrency must be positive.");
        }
        this.f14359p = executor;
        this.f14360q = new Semaphore(i4, true);
    }

    public void a() {
        Semaphore semaphore = (Semaphore) this.f14360q;
        while (semaphore.tryAcquire()) {
            Runnable runnable = (Runnable) ((LinkedBlockingQueue) this.f14361r).poll();
            if (runnable == null) {
                semaphore.release();
                return;
            }
            ((Executor) this.f14359p).execute(new C1.d(6, this, runnable));
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f14358o) {
            case 0:
                ((LinkedBlockingQueue) this.f14361r).offer(runnable);
                a();
                return;
            default:
                if (Thread.currentThread() == ((WeakReference) this.f14361r).get()) {
                    runnable.run();
                    return;
                } else {
                    ((ThreadPoolExecutor) this.f14360q).execute(runnable);
                    return;
                }
        }
    }
}
