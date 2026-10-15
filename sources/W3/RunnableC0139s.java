package W3;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: W3.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0139s extends B implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: w, reason: collision with root package name */
    public static final RunnableC0139s f2119w;

    /* renamed from: x, reason: collision with root package name */
    public static final long f2120x;

    /* JADX WARN: Type inference failed for: r0v0, types: [W3.B, W3.s, W3.C] */
    static {
        Long l4;
        ?? b4 = new B();
        f2119w = b4;
        b4.k(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l4 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l4 = 1000L;
        }
        f2120x = timeUnit.toNanos(l4.longValue());
    }

    @Override // W3.C
    public final Thread j() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(RunnableC0139s.class.getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // W3.B
    public final void m(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.m(runnable);
    }

    public final synchronized void q() {
        int i4 = debugStatus;
        if (i4 == 2 || i4 == 3) {
            debugStatus = 3;
            B.f2059t.set(this, null);
            B.f2060u.set(this, null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean o4;
        b0.f2088a.set(this);
        try {
            synchronized (this) {
                int i4 = debugStatus;
                if (i4 == 2 || i4 == 3) {
                    if (o4) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j4 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long p3 = p();
                    if (p3 == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j4 == Long.MAX_VALUE) {
                            j4 = f2120x + nanoTime;
                        }
                        long j5 = j4 - nanoTime;
                        if (j5 <= 0) {
                            _thread = null;
                            q();
                            if (o()) {
                                return;
                            }
                            j();
                            return;
                        }
                        if (p3 > j5) {
                            p3 = j5;
                        }
                    } else {
                        j4 = Long.MAX_VALUE;
                    }
                    if (p3 > 0) {
                        int i5 = debugStatus;
                        if (i5 == 2 || i5 == 3) {
                            _thread = null;
                            q();
                            if (o()) {
                                return;
                            }
                            j();
                            return;
                        }
                        LockSupport.parkNanos(this, p3);
                    }
                }
            }
        } finally {
            _thread = null;
            q();
            if (!o()) {
                j();
            }
        }
    }

    @Override // W3.B, W3.C
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
