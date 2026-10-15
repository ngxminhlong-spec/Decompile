package x0;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class k implements Executor {

    /* renamed from: p, reason: collision with root package name */
    public final Executor f15219p;

    /* renamed from: r, reason: collision with root package name */
    public volatile Runnable f15221r;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayDeque f15218o = new ArrayDeque();

    /* renamed from: q, reason: collision with root package name */
    public final Object f15220q = new Object();

    public k(Executor executor) {
        this.f15219p = executor;
    }

    public final boolean a() {
        boolean z4;
        synchronized (this.f15220q) {
            z4 = !this.f15218o.isEmpty();
        }
        return z4;
    }

    public final void b() {
        synchronized (this.f15220q) {
            try {
                Runnable runnable = (Runnable) this.f15218o.poll();
                this.f15221r = runnable;
                if (runnable != null) {
                    this.f15219p.execute(this.f15221r);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f15220q) {
            try {
                this.f15218o.add(new j(0, this, runnable));
                if (this.f15221r == null) {
                    b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
