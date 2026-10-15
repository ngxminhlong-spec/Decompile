package x2;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: x2.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2062a0 extends Thread {

    /* renamed from: o, reason: collision with root package name */
    public final Object f15525o;

    /* renamed from: p, reason: collision with root package name */
    public final BlockingQueue f15526p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f15527q = false;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C2064b0 f15528r;

    public C2062a0(C2064b0 c2064b0, String str, BlockingQueue blockingQueue) {
        this.f15528r = c2064b0;
        h2.y.i(blockingQueue);
        this.f15525o = new Object();
        this.f15526p = blockingQueue;
        setName(str);
    }

    public final void a() {
        synchronized (this.f15525o) {
            this.f15525o.notifyAll();
        }
    }

    public final void b() {
        synchronized (this.f15528r.f15538i) {
            try {
                if (!this.f15527q) {
                    this.f15528r.f15539j.release();
                    this.f15528r.f15538i.notifyAll();
                    C2064b0 c2064b0 = this.f15528r;
                    if (this == c2064b0.c) {
                        c2064b0.c = null;
                    } else if (this == c2064b0.d) {
                        c2064b0.d = null;
                    } else {
                        K k3 = ((C2066c0) c2064b0.f1719a).f15568i;
                        C2066c0.i(k3);
                        k3.f15394f.a("Current scheduler thread is neither worker nor network");
                    }
                    this.f15527q = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z4 = false;
        while (!z4) {
            try {
                this.f15528r.f15539j.acquire();
                z4 = true;
            } catch (InterruptedException e4) {
                K k3 = ((C2066c0) this.f15528r.f1719a).f15568i;
                C2066c0.i(k3);
                k3.f15397i.b(e4, String.valueOf(getName()).concat(" was interrupted"));
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                Z z5 = (Z) this.f15526p.poll();
                if (z5 != null) {
                    Process.setThreadPriority(true != z5.f15515p ? 10 : threadPriority);
                    z5.run();
                } else {
                    synchronized (this.f15525o) {
                        if (this.f15526p.peek() == null) {
                            try {
                                this.f15525o.wait(30000L);
                            } catch (InterruptedException e5) {
                                K k4 = ((C2066c0) this.f15528r.f1719a).f15568i;
                                C2066c0.i(k4);
                                k4.f15397i.b(e5, String.valueOf(getName()).concat(" was interrupted"));
                            }
                        }
                    }
                    synchronized (this.f15528r.f15538i) {
                        if (this.f15526p.peek() == null) {
                            b();
                            b();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            b();
            throw th;
        }
    }
}
