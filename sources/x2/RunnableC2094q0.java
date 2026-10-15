package x2;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: x2.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2094q0 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15770o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f15771p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C2103v0 f15772q;

    public /* synthetic */ RunnableC2094q0(C2103v0 c2103v0, AtomicReference atomicReference, int i4) {
        this.f15770o = i4;
        this.f15772q = c2103v0;
        this.f15771p = atomicReference;
    }

    private final void a() {
        synchronized (this.f15771p) {
            try {
                try {
                    AtomicReference atomicReference = this.f15771p;
                    C2066c0 c2066c0 = (C2066c0) this.f15772q.f1719a;
                    atomicReference.set(Boolean.valueOf(c2066c0.f15566g.p(c2066c0.m().j(), B.f15274K)));
                } finally {
                    this.f15771p.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void b() {
        String str;
        synchronized (this.f15771p) {
            try {
                try {
                    AtomicReference atomicReference = this.f15771p;
                    C2066c0 c2066c0 = (C2066c0) this.f15772q.f1719a;
                    C2073g c2073g = c2066c0.f15566g;
                    String j4 = c2066c0.m().j();
                    C2060A c2060a = B.f15275L;
                    if (j4 == null) {
                        c2073g.getClass();
                        str = (String) c2060a.a(null);
                    } else {
                        str = (String) c2060a.a(c2073g.c.a(j4, c2060a.f15255a));
                    }
                    atomicReference.set(str);
                } finally {
                    this.f15771p.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void c() {
        synchronized (this.f15771p) {
            try {
                try {
                    AtomicReference atomicReference = this.f15771p;
                    C2066c0 c2066c0 = (C2066c0) this.f15772q.f1719a;
                    atomicReference.set(Long.valueOf(c2066c0.f15566g.m(c2066c0.m().j(), B.f15276M)));
                } finally {
                    this.f15771p.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void d() {
        synchronized (this.f15771p) {
            try {
                try {
                    AtomicReference atomicReference = this.f15771p;
                    C2066c0 c2066c0 = (C2066c0) this.f15772q.f1719a;
                    atomicReference.set(Integer.valueOf(c2066c0.f15566g.k(c2066c0.m().j(), B.N)));
                } finally {
                    this.f15771p.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15770o) {
            case 0:
                a();
                return;
            case 1:
                b();
                return;
            case 2:
                c();
                return;
            case 3:
                d();
                return;
            default:
                synchronized (this.f15771p) {
                    try {
                        try {
                            AtomicReference atomicReference = this.f15771p;
                            C2066c0 c2066c0 = (C2066c0) this.f15772q.f1719a;
                            atomicReference.set(Double.valueOf(c2066c0.f15566g.i(c2066c0.m().j(), B.f15277O)));
                        } finally {
                            this.f15771p.notify();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
